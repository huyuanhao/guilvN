package com.alipay.sdk.app;

import okhttp3.internal.platform.AndroidPlatform;

/* renamed from: com.alipay.sdk.app.k */
public enum EnumC0405k {
    SUCCEEDED(9000, "处理成功"),
    FAILED(AndroidPlatform.MAX_LOG_LENGTH, "系统繁忙，请稍后再试"),
    CANCELED(6001, "用户取消"),
    NETWORK_ERROR(6002, "网络连接异常"),
    PARAMS_ERROR(4001, "参数错误"),
    DOUBLE_REQUEST(5000, "重复请求"),
    PAY_WAITTING(8000, "支付结果确认中");
    

    /* renamed from: h */
    public int f915h;

    /* renamed from: i */
    public String f916i;

    /* access modifiers changed from: public */
    EnumC0405k(int i, String str) {
        this.f915h = i;
        this.f916i = str;
    }

    /* renamed from: a */
    public void mo4241a(int i) {
        this.f915h = i;
    }

    /* renamed from: b */
    public String mo4243b() {
        return this.f916i;
    }

    /* renamed from: b */
    public static EnumC0405k m832b(int i) {
        if (i == 4001) {
            return PARAMS_ERROR;
        }
        if (i == 5000) {
            return DOUBLE_REQUEST;
        }
        if (i == 8000) {
            return PAY_WAITTING;
        }
        if (i == 9000) {
            return SUCCEEDED;
        }
        if (i == 6001) {
            return CANCELED;
        }
        if (i != 6002) {
            return FAILED;
        }
        return NETWORK_ERROR;
    }

    /* renamed from: a */
    public int mo4240a() {
        return this.f915h;
    }

    /* renamed from: a */
    public void mo4242a(String str) {
        this.f916i = str;
    }
}
