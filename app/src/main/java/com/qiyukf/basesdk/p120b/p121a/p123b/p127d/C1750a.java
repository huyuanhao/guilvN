package com.qiyukf.basesdk.p120b.p121a.p123b.p127d;

import com.qiyukf.basesdk.C1708a;
import com.qiyukf.basesdk.p138c.p143d.C1861b;

/* renamed from: com.qiyukf.basesdk.b.a.b.d.a */
public final class C1750a {

    /* renamed from: a */
    public String f3226a = "utf-8";

    /* renamed from: b */
    public int f3227b = 131072;

    /* renamed from: c */
    public int f3228c = 30000;

    /* renamed from: d */
    public int f3229d = 30000;

    /* renamed from: e */
    public int f3230e = 2;

    /* renamed from: f */
    public int f3231f = 2;

    /* renamed from: g */
    public long f3232g = 7200000;

    /* renamed from: c */
    public static int m3204c() {
        try {
            int i = C1861b.m3536i(C1708a.m3001a());
            if (i == 0) {
                return 131072;
            }
            if (i == 1) {
                return 16384;
            }
            if (i != 2) {
                return i != 3 ? 131072 : 131072;
            }
            return 65536;
        } catch (Exception e) {
            e.printStackTrace();
            return 131072;
        }
    }

    /* renamed from: a */
    public final int mo33964a() {
        return this.f3228c;
    }

    /* renamed from: b */
    public final int mo33965b() {
        return this.f3229d;
    }

    /* renamed from: d */
    public final int mo33966d() {
        return this.f3230e;
    }

    /* renamed from: e */
    public final int mo33967e() {
        return this.f3231f;
    }
}
