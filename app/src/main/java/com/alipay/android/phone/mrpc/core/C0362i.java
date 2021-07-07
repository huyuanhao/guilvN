package com.alipay.android.phone.mrpc.core;

/* renamed from: com.alipay.android.phone.mrpc.core.i */
public final class C0362i implements AbstractC0360g {

    /* renamed from: a */
    public final /* synthetic */ C0349aa f800a;

    /* renamed from: b */
    public final /* synthetic */ C0361h f801b;

    public C0362i(C0361h hVar, C0349aa aaVar) {
        this.f801b = hVar;
        this.f800a = aaVar;
    }

    @Override // com.alipay.android.phone.mrpc.core.AbstractC0360g
    /* renamed from: a */
    public final String mo4143a() {
        return this.f800a.mo4118a();
    }

    @Override // com.alipay.android.phone.mrpc.core.AbstractC0360g
    /* renamed from: b */
    public final AbstractC0350ab mo4144b() {
        return C0366l.m682a(C0361h.m670a(this.f801b).getApplicationContext());
    }

    @Override // com.alipay.android.phone.mrpc.core.AbstractC0360g
    /* renamed from: c */
    public final C0349aa mo4145c() {
        return this.f800a;
    }

    @Override // com.alipay.android.phone.mrpc.core.AbstractC0360g
    /* renamed from: d */
    public final boolean mo4146d() {
        return this.f800a.mo4121c();
    }
}
