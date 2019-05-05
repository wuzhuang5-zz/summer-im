package com.wd.service;

import com.wd.enums.StatusEnum;
import com.wd.vo.req.LoginReqVo;
import com.wd.vo.res.RegisterInfoResVo;

/**
 * 账号服务
 */
public interface AccountService {
    /**
     * 注册用户
     * @param info
     * @return
     * @throws Exception
     */
    RegisterInfoResVo register(RegisterInfoResVo info) throws Exception;

    /**
     * 登录
     * @param loginReqVo
     * @return
     * @throws Exception
     */
    StatusEnum login(LoginReqVo loginReqVo) throws Exception;
}
