package com.wd.vo.req;

public class LoginReqVo extends BaseRequest {

    private String userName;
    private long userId;

    public LoginReqVo(String userName, long userId) {
        this.userName = userName;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "LoginReqVo{" +
                "userName='" + userName + '\'' +
                ", userId=" + userId +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
