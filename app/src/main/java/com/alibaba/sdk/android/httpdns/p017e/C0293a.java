package com.alibaba.sdk.android.httpdns.p017e;

import com.alibaba.sdk.android.httpdns.p015c.C0268a;
import java.util.Random;

/* renamed from: com.alibaba.sdk.android.httpdns.e.a */
public class C0293a {

    /* renamed from: q */
    public String f639q;

    /* renamed from: com.alibaba.sdk.android.httpdns.e.a$a */
    public static final class C0295a {

        /* renamed from: a */
        public static final C0293a f640a = new C0293a();
    }

    public C0293a() {
        try {
            Random random = new Random();
            char[] cArr = new char[12];
            for (int i = 0; i < 12; i++) {
                cArr[i] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(62));
            }
            this.f639q = new String(cArr);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* renamed from: a */
    public static C0293a m524a() {
        return C0295a.f640a;
    }

    public String getSessionId() {
        return this.f639q;
    }

    /* renamed from: h */
    public String mo4018h() {
        return C0268a.m469a().mo3972h();
    }

    /* renamed from: k */
    public String mo4019k() {
        int networkType = C0268a.m469a().getNetworkType();
        return networkType != 1 ? networkType != 2 ? networkType != 3 ? networkType != 4 ? "unknown" : "4g" : "3g" : "2g" : "wifi";
    }
}
