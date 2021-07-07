package com.xiaomi.mipush.sdk;

/* renamed from: com.xiaomi.mipush.sdk.ac */
public final class RunnableC4184ac implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f11216a;

    /* renamed from: b */
    public final /* synthetic */ String f11217b;

    /* renamed from: c */
    public final /* synthetic */ String f11218c;

    public RunnableC4184ac(String str, String str2, String str3) {
        this.f11216a = str;
        this.f11217b = str2;
        this.f11218c = str3;
    }

    public void run() {
        MiPushClient.initialize(MiPushClient.sContext, this.f11216a, this.f11217b, null, this.f11218c);
    }
}
