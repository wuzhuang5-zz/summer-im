package com.wd.service.impl;

import com.wd.enums.StatusEnum;
import com.wd.service.AccountService;
import com.wd.vo.req.LoginReqVo;
import com.wd.vo.res.RegisterInfoResVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    private final static Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public RegisterInfoResVo register(RegisterInfoResVo info) throws Exception {
        return null;
    }

    @Override
    public StatusEnum login(LoginReqVo loginReqVo) throws Exception {
        return null;
    }
}
