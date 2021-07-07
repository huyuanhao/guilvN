package com.megvii.meglive_sdk.volley;

/* renamed from: com.megvii.meglive_sdk.volley.e */
public final class C1620e implements AbstractC1635q {

    /* renamed from: a */
    public int f2867a;

    /* renamed from: b */
    public int f2868b;

    /* renamed from: c */
    public final int f2869c;

    /* renamed from: d */
    public final float f2870d;

    public C1620e() {
        this(2500, 1, 1.0f);
    }

    @Override // com.megvii.meglive_sdk.volley.AbstractC1635q
    /* renamed from: a */
    public final int mo17336a() {
        return this.f2867a;
    }

    @Override // com.megvii.meglive_sdk.volley.AbstractC1635q
    /* renamed from: b */
    public final int mo17338b() {
        return this.f2868b;
    }

    public C1620e(int i, int i2, float f) {
        this.f2867a = i;
        this.f2869c = i2;
        this.f2870d = f;
    }

    @Override // com.megvii.meglive_sdk.volley.AbstractC1635q
    /* renamed from: a */
    public final void mo17337a(C1638t tVar) {
        boolean z = true;
        int i = this.f2868b + 1;
        this.f2868b = i;
        int i2 = this.f2867a;
        this.f2867a = (int) (((float) i2) + (((float) i2) * this.f2870d));
        if (i > this.f2869c) {
            z = false;
        }
        if (!z) {
            throw tVar;
        }
    }
}
