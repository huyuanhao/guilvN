package com.p118pd.sdk;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.pd.sdk.o0oo0o00  reason: case insensitive filesystem */
public class C7693o0oo0o00 implements AbstractC7644o0oOoOO {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7644o0oOoOO f20629OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7648o0oOoOo f20630OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Class<?> f20631OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object f20632OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map<Class<?>, AbstractC7655o0oOoo0O<?>> f20633OooO00o;
    public final int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final Class<?> f20634OooO0O0;
    public int OooO0OO;

    public C7693o0oo0o00(Object obj, AbstractC7644o0oOoOO o0ooooo, int i, int i2, Map<Class<?>, AbstractC7655o0oOoo0O<?>> map, Class<?> cls, Class<?> cls2, C7648o0oOoOo o0ooooo2) {
        this.f20632OooO00o = C7842oO0O0.OooO00o(obj);
        this.f20629OooO00o = (AbstractC7644o0oOoOO) C7842oO0O0.OooO00o(o0ooooo, "Signature must not be null");
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.f20633OooO00o = (Map) C7842oO0O0.OooO00o(map);
        this.f20631OooO00o = (Class) C7842oO0O0.OooO00o(cls, "Resource class must not be null");
        this.f20634OooO0O0 = (Class) C7842oO0O0.OooO00o(cls2, "Transcode class must not be null");
        this.f20630OooO00o = (C7648o0oOoOo) C7842oO0O0.OooO00o(o0ooooo2);
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public void OooO00o(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public boolean equals(Object obj) {
        if (!(obj instanceof C7693o0oo0o00)) {
            return false;
        }
        C7693o0oo0o00 o0oo0o00 = (C7693o0oo0o00) obj;
        if (!this.f20632OooO00o.equals(o0oo0o00.f20632OooO00o) || !this.f20629OooO00o.equals(o0oo0o00.f20629OooO00o) || this.OooO0O0 != o0oo0o00.OooO0O0 || this.OooO00o != o0oo0o00.OooO00o || !this.f20633OooO00o.equals(o0oo0o00.f20633OooO00o) || !this.f20631OooO00o.equals(o0oo0o00.f20631OooO00o) || !this.f20634OooO0O0.equals(o0oo0o00.f20634OooO0O0) || !this.f20630OooO00o.equals(o0oo0o00.f20630OooO00o)) {
            return false;
        }
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public int hashCode() {
        if (this.OooO0OO == 0) {
            int hashCode = this.f20632OooO00o.hashCode();
            this.OooO0OO = hashCode;
            int hashCode2 = (hashCode * 31) + this.f20629OooO00o.hashCode();
            this.OooO0OO = hashCode2;
            int i = (hashCode2 * 31) + this.OooO00o;
            this.OooO0OO = i;
            int i2 = (i * 31) + this.OooO0O0;
            this.OooO0OO = i2;
            int hashCode3 = (i2 * 31) + this.f20633OooO00o.hashCode();
            this.OooO0OO = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f20631OooO00o.hashCode();
            this.OooO0OO = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f20634OooO0O0.hashCode();
            this.OooO0OO = hashCode5;
            this.OooO0OO = (hashCode5 * 31) + this.f20630OooO00o.hashCode();
        }
        return this.OooO0OO;
    }

    public String toString() {
        return "EngineKey{model=" + this.f20632OooO00o + ", width=" + this.OooO00o + ", height=" + this.OooO0O0 + ", resourceClass=" + this.f20631OooO00o + ", transcodeClass=" + this.f20634OooO0O0 + ", signature=" + this.f20629OooO00o + ", hashCode=" + this.OooO0OO + ", transformations=" + this.f20633OooO00o + ", options=" + this.f20630OooO00o + '}';
    }
}
