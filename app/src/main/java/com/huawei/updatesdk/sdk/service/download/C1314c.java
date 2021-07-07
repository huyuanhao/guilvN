package com.huawei.updatesdk.sdk.service.download;

/* renamed from: com.huawei.updatesdk.sdk.service.download.c */
public class C1314c extends Exception {

    /* renamed from: a */
    public String f1536a;

    /* renamed from: b */
    public int f1537b;

    public C1314c() {
    }

    public C1314c(int i, String str) {
        this(str);
        this.f1537b = i;
    }

    public C1314c(String str) {
        super(str);
        this.f1536a = str;
    }

    /* renamed from: a */
    public String mo16021a() {
        return this.f1536a;
    }

    /* renamed from: b */
    public int mo16022b() {
        return this.f1537b;
    }
}
