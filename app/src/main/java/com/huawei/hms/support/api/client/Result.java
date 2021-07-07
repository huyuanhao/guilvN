package com.huawei.hms.support.api.client;

public abstract class Result {

    /* renamed from: a */
    public Status f1197a = Status.FAILURE;

    public Status getStatus() {
        return this.f1197a;
    }

    public void setStatus(Status status) {
        if (status != null) {
            this.f1197a = status;
        }
    }
}
