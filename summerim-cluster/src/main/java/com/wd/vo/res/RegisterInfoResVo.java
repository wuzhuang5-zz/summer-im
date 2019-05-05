package com.wd.vo.res;

import java.io.Serializable;

public class RegisterInfoResVo implements Serializable {


    private long userId;
    private String userName;

    public RegisterInfoResVo(String userName, long userId) {
        this.userName = userName;
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
