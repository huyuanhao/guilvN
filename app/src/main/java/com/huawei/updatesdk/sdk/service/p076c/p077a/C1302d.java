package com.huawei.updatesdk.sdk.service.p076c.p077a;

/* renamed from: com.huawei.updatesdk.sdk.service.c.a.d */
public class C1302d extends AbstractC1299b {
    public static final int ERROR = 1;
    public static final int NETWORK_ERROR = 3;

    /* renamed from: OK */
    public static final int f1464OK = 0;
    public static final int PARSE_ERROR = 4;
    public static final int PROGUARD_ERROR = 6;
    public static final int REQ_PARAM_ERROR = 5;
    public static final int RTN_CODE_OK = 0;
    public static final int TIMEOUT = 2;
    public EnumC1303a errCause = EnumC1303a.NORMAL;
    public String reason;
    public int responseCode = 1;
    public int rtnCode_ = 0;

    /* renamed from: com.huawei.updatesdk.sdk.service.c.a.d$a */
    public enum EnumC1303a {
        NORMAL,
        NO_NETWORK,
        JSON_ERROR,
        PARAM_ERROR,
        IO_EXCEPTION,
        CONNECT_EXCEPTION,
        UNKNOWN_EXCEPTION,
        NO_PROGUARD
    }

    /* renamed from: a */
    public void mo15925a(int i) {
        this.responseCode = i;
    }

    /* renamed from: a */
    public void mo15926a(EnumC1303a aVar) {
        this.errCause = aVar;
    }

    /* renamed from: a */
    public void mo15927a(String str) {
        this.reason = str;
    }

    /* renamed from: b */
    public void mo15928b(int i) {
        this.rtnCode_ = i;
    }

    /* renamed from: c */
    public int mo15929c() {
        return this.responseCode;
    }

    /* renamed from: d */
    public int mo15930d() {
        return this.rtnCode_;
    }

    /* renamed from: e */
    public EnumC1303a mo15931e() {
        return this.errCause;
    }

    /* renamed from: f */
    public String mo15932f() {
        return this.reason;
    }

    public String toString() {
        return getClass().getName() + " { \n\tresponseCode: " + mo15929c() + "\n\trtnCode_: " + mo15930d() + "\n\terrCause: " + mo15931e() + "\n}";
    }
}
