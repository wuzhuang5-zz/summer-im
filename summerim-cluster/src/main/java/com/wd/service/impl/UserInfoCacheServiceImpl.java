package com.wd.service.impl;

import static com.wd.constant.Constant.ACCOUNT_PREFIX;
import static com.wd.constant.Constant.LOGIN_STATUS_PREFIX;

import com.wd.pojo.UserInfo;
import com.wd.service.UserInfoCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wz
 */
@Service
public class UserInfoCacheServiceImpl implements UserInfoCacheService {

    private static final Map<Long, UserInfo> localCache = new ConcurrentHashMap<>();

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public UserInfo getUserInfoByUserId(Long userId) {
        UserInfo userInfo = localCache.get(userId);
        if(userInfo != null) {
            return userInfo;
        }
        String userName = redisTemplate.opsForValue().get(ACCOUNT_PREFIX + userId);
        if(userName != null) {
            userInfo = new UserInfo(userName, userId);
            localCache.put(userId, userInfo);
        }
        return userInfo;
    }

    @Override
    public boolean saveAndCheckLoginStatus(Long userId) {
        Long add = redisTemplate.opsForSet().add(LOGIN_STATUS_PREFIX, userId.toString());
        if(add == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void removeLoginStatus(Long userId) {

    }
}
