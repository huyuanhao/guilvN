package com.megvii.meglive_sdk.volley.p107a;

import com.megvii.meglive_sdk.volley.p107a.p114f.C1611a;
import java.io.Serializable;

/* renamed from: com.megvii.meglive_sdk.volley.a.f */
public class C1610f implements Serializable, Cloneable {

    /* renamed from: d */
    public final String f2849d;

    /* renamed from: e */
    public final int f2850e;

    /* renamed from: f */
    public final int f2851f;

    public C1610f(String str, int i, int i2) {
        this.f2849d = (String) C1611a.m2771a(str, "Protocol name");
        this.f2850e = C1611a.m2770a(i, "Protocol minor version");
        this.f2851f = C1611a.m2770a(i2, "Protocol minor version");
    }

    /* renamed from: a */
    public final String mo17319a() {
        return this.f2849d;
    }

    /* renamed from: b */
    public final int mo17320b() {
        return this.f2850e;
    }

    /* renamed from: c */
    public final int mo17321c() {
        return this.f2851f;
    }

    @Override // java.lang.Object
    public Object clone() {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1610f)) {
            return false;
        }
        C1610f fVar = (C1610f) obj;
        return this.f2849d.equals(fVar.f2849d) && this.f2850e == fVar.f2850e && this.f2851f == fVar.f2851f;
    }

    public final int hashCode() {
        return (this.f2849d.hashCode() ^ (this.f2850e * 100000)) ^ this.f2851f;
    }

    public String toString() {
        return this.f2849d + '/' + Integer.toString(this.f2850e) + '.' + Integer.toString(this.f2851f);
    }
}
