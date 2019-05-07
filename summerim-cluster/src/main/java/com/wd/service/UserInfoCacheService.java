package com.wd.service;

import com.wd.pojo.UserInfo;

public interface UserInfoCacheService {
    /**
     * 通过用户id获取用户信息
     * @param userId
     * @return
     */
    UserInfo getUserInfoByUserId(Long userId);

    /**
     * 保存和检查用户登录情况
     * @param userId
     * @return
     */
    boolean saveAndCheckLoginStatus(Long userId);

    /**
     * 清除用户登录状态
     * @param userId
     */
    void removeLoginStatus(Long userId);
}
