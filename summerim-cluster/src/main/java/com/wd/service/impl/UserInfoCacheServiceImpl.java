package com.wd.service.impl;

import com.wd.pojo.UserInfo;
import com.wd.service.UserInfoCacheService;
import org.springframework.stereotype.Service;

@Service
public class UserInfoCacheServiceImpl implements UserInfoCacheService {

    @Override
    public UserInfo getUserInfoByUserId(long userId) {

        return null;
    }

    @Override
    public boolean saveAndCheckLoginStatus(long userId) {
        return false;
    }

    @Override
    public void removeLoginStatus(long userId) {

    }
}
