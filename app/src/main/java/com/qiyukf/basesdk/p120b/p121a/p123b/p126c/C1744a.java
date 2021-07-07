package com.qiyukf.basesdk.p120b.p121a.p123b.p126c;

import android.util.Base64;

/* renamed from: com.qiyukf.basesdk.b.a.b.c.a */
public final class C1744a {

    /* renamed from: a */
    public Object f3190a;

    /* renamed from: b */
    public String f3191b;

    /* renamed from: c */
    public int f3192c;

    /* renamed from: d */
    public String f3193d;

    /* renamed from: e */
    public Exception f3194e;

    /* renamed from: f */
    public String f3195f;

    /* renamed from: g */
    public String f3196g;

    public C1744a(Object obj, String str, int i, String str2, String str3, String str4, Exception exc) {
        this.f3190a = obj;
        this.f3191b = str;
        this.f3192c = i;
        this.f3195f = str2;
        this.f3196g = new String(Base64.decode(str3, 0));
        this.f3193d = str4;
        this.f3194e = exc;
    }

    /* renamed from: a */
    public final int mo33929a() {
        return this.f3192c;
    }

    /* renamed from: b */
    public final Exception mo33930b() {
        return this.f3194e;
    }
}
