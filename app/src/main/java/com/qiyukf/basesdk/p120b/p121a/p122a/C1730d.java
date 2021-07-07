package com.qiyukf.basesdk.p120b.p121a.p122a;

import com.qiyukf.basesdk.p138c.p142c.C1852c;

/* renamed from: com.qiyukf.basesdk.b.a.a.d */
public final class C1730d {

    /* renamed from: a */
    public String f3139a;

    /* renamed from: b */
    public String f3140b;

    /* renamed from: c */
    public String f3141c;

    /* renamed from: d */
    public long f3142d;

    /* renamed from: e */
    public boolean f3143e;

    /* renamed from: f */
    public AbstractC1731e f3144f;

    public C1730d(String str, String str2, AbstractC1731e eVar) {
        this(str, str2, eVar, (byte) 0);
    }

    public C1730d(String str, String str2, AbstractC1731e eVar, byte b) {
        this.f3143e = false;
        this.f3139a = str;
        this.f3140b = str2;
        this.f3144f = eVar;
        this.f3142d = 0;
        this.f3141c = str2 + "@url#" + C1852c.m3511a(str);
    }

    /* renamed from: a */
    public final String mo33892a() {
        return this.f3139a;
    }

    /* renamed from: b */
    public final String mo33893b() {
        return this.f3140b;
    }

    /* renamed from: c */
    public final String mo33894c() {
        return this.f3141c;
    }

    /* renamed from: d */
    public final long mo33895d() {
        return this.f3142d;
    }

    /* renamed from: e */
    public final void mo33896e() {
        this.f3143e = true;
        AbstractC1731e eVar = this.f3144f;
        if (eVar != null) {
            eVar.mo33903c();
        }
    }

    /* renamed from: f */
    public final boolean mo33897f() {
        return this.f3143e;
    }

    /* renamed from: g */
    public final AbstractC1731e mo33898g() {
        return this.f3144f;
    }
}
