package com.alibaba.sdk.android.httpdns;

/* renamed from: com.alibaba.sdk.android.httpdns.h */
public class C0298h extends Exception {

    /* renamed from: b */
    public int f650b;

    public C0298h(int i, String str) {
        super(str);
        this.f650b = i;
    }

    public int getErrorCode() {
        return this.f650b;
    }
}
