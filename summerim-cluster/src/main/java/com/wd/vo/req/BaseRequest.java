package com.wd.vo.req;

public class BaseRequest {
    /**
     * 请求唯一Id
     */
    private String requestId;
    /**
     * 当前请求时间戳
     */
    private int timeStamp;

    public BaseRequest() {
        this.setTimeStamp((int) System.currentTimeMillis()/1000);
    }

    public String getRequestId() {
        return requestId;
    }
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
    public int getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }
}
