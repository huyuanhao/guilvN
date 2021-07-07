package com.huawei.updatesdk.sdk.service.download.bean;

import java.security.SecureRandom;

/* renamed from: com.huawei.updatesdk.sdk.service.download.bean.a */
public class C1312a {

    /* renamed from: a */
    public static int f1529a = m1773e();

    /* renamed from: g */
    public static final Object f1530g = new Object();

    /* renamed from: b */
    public int f1531b = -1;

    /* renamed from: c */
    public int f1532c = -1;

    /* renamed from: d */
    public long f1533d = 0;

    /* renamed from: e */
    public long f1534e = 0;

    /* renamed from: f */
    public long f1535f = 0;

    public C1312a() {
    }

    public C1312a(int i, int i2, long j, long j2) {
        this.f1531b = i;
        this.f1532c = i2;
        this.f1533d = j;
        this.f1534e = j2;
    }

    /* renamed from: a */
    public static int m1772a() {
        int i;
        synchronized (f1530g) {
            int i2 = f1529a + 1;
            f1529a = i2;
            if (i2 == Integer.MIN_VALUE) {
                f1529a = m1773e();
            }
            i = f1529a;
        }
        return i;
    }

    /* renamed from: e */
    public static int m1773e() {
        return new SecureRandom().nextInt();
    }

    /* renamed from: a */
    public void mo16017a(long j) {
        this.f1535f = j;
    }

    /* renamed from: b */
    public long mo16018b() {
        return this.f1533d;
    }

    /* renamed from: c */
    public long mo16019c() {
        return this.f1534e;
    }

    /* renamed from: d */
    public long mo16020d() {
        return this.f1535f;
    }
}
