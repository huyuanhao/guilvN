package com.tencent.p269mm.opensdk.diffdev;

/* renamed from: com.tencent.mm.opensdk.diffdev.OAuthErrCode */
public enum OAuthErrCode {
    WechatAuth_Err_OK(0),
    WechatAuth_Err_NormalErr(-1),
    WechatAuth_Err_NetworkErr(-2),
    WechatAuth_Err_JsonDecodeErr(-3),
    WechatAuth_Err_Cancel(-4),
    WechatAuth_Err_Timeout(-5),
    WechatAuth_Err_Auth_Stopped(-6);
    
    public int code;

    /* access modifiers changed from: public */
    OAuthErrCode(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    public final String toString() {
        return "OAuthErrCode:" + this.code;
    }
}
