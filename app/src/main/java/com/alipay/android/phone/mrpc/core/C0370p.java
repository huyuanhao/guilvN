package com.alipay.android.phone.mrpc.core;

/* renamed from: com.alipay.android.phone.mrpc.core.p */
public final class C0370p extends C0375u {

    /* renamed from: c */
    public int f826c;

    /* renamed from: d */
    public String f827d;

    /* renamed from: e */
    public long f828e;

    /* renamed from: f */
    public long f829f;

    /* renamed from: g */
    public String f830g;

    /* renamed from: h */
    public HttpUrlHeader f831h;

    public C0370p(HttpUrlHeader httpUrlHeader, int i, String str, byte[] bArr) {
        this.f831h = httpUrlHeader;
        this.f826c = i;
        this.f827d = str;
        this.f852a = bArr;
    }

    /* renamed from: a */
    public final HttpUrlHeader mo4169a() {
        return this.f831h;
    }

    /* renamed from: a */
    public final void mo4170a(long j) {
        this.f828e = j;
    }

    /* renamed from: a */
    public final void mo4171a(String str) {
        this.f830g = str;
    }

    /* renamed from: b */
    public final void mo4172b(long j) {
        this.f829f = j;
    }
}
