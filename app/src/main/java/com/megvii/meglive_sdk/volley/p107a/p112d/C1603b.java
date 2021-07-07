package com.megvii.meglive_sdk.volley.p107a.p112d;

import com.megvii.meglive_sdk.volley.p107a.AbstractC1594a;
import com.megvii.meglive_sdk.volley.p107a.p114f.C1611a;
import java.io.Serializable;

/* renamed from: com.megvii.meglive_sdk.volley.a.d.b */
public final class C1603b implements AbstractC1594a, Serializable, Cloneable {

    /* renamed from: a */
    public final String f2831a;

    /* renamed from: b */
    public final String f2832b;

    public C1603b(String str, String str2) {
        this.f2831a = (String) C1611a.m2771a(str, "Name");
        this.f2832b = str2;
    }

    @Override // com.megvii.meglive_sdk.volley.p107a.AbstractC1594a
    /* renamed from: a */
    public final String mo17297a() {
        return this.f2831a;
    }

    @Override // com.megvii.meglive_sdk.volley.p107a.AbstractC1594a
    /* renamed from: b */
    public final String mo17298b() {
        return this.f2832b;
    }

    @Override // java.lang.Object
    public final Object clone() {
        return super.clone();
    }

    public final String toString() {
        C1605d dVar = C1605d.f2841b;
        return C1605d.m2763a(this).toString();
    }
}
