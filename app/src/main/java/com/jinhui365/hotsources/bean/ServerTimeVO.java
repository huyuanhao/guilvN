package com.jinhui365.hotsources.bean;

import com.rxhui.httpclient.response.HttpStatus;

public class ServerTimeVO extends HttpStatus {
    public long currentTime;

    public long getCurrentTime() {
        return this.currentTime;
    }

    public void setCurrentTime(long j) {
        this.currentTime = j;
    }
}
