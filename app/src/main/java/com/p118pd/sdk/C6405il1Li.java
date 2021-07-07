package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.i丨l1Li  reason: invalid class name and case insensitive filesystem */
public class C6405il1Li extends AbstractC5738Lil implements AbstractC5462Ilil {
    public static final int o00oO0O = -1;
    public static final int o0ooOO0 = 0;
    public static final int o0ooOOo = 1;
    public LilIiIl OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18221OooO00o;
    public byte[] OooO0O0;

    public C6405il1Li(int i, byte[] bArr) {
        this(new ILI1Ll(i, new C6487lIIiIlL(bArr)));
    }

    public C6405il1Li(LilIiIl lilIiIl) {
        this.OooO00o = lilIiIl;
    }

    public C6405il1Li(AbstractC5903LlLLL r4) {
        if (r4.OooO00o() == 0) {
            this.f18221OooO00o = AbstractC6804llL1ii.OooO00o(r4, true).m17938OooO00o();
        } else if (r4.OooO00o() == 1) {
            this.OooO0O0 = AbstractC6804llL1ii.OooO00o(r4, true).m17938OooO00o();
        } else {
            throw new IllegalArgumentException("unknown tag number: " + r4.OooO00o());
        }
    }

    public static C6405il1Li OooO00o(AbstractC5903LlLLL r0, boolean z) {
        if (z) {
            return OooO00o(r0.OooO0o());
        }
        throw new IllegalArgumentException("choice item must be explicitly tagged");
    }

    public static C6405il1Li OooO00o(Object obj) {
        if (obj == null || (obj instanceof C6405il1Li)) {
            return (C6405il1Li) obj;
        }
        if (obj instanceof I11li1) {
            return new C6405il1Li(LilIiIl.OooO00o(obj));
        }
        if (obj instanceof AbstractC5903LlLLL) {
            return new C6405il1Li((AbstractC5903LlLLL) obj);
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public byte[] OooO00o() {
        LilIiIl lilIiIl = this.OooO00o;
        if (lilIiIl != null) {
            try {
                return lilIiIl.getEncoded();
            } catch (IOException e) {
                throw new IllegalStateException("can't decode certificate: " + e);
            }
        } else {
            byte[] bArr = this.f18221OooO00o;
            return bArr != null ? bArr : this.OooO0O0;
        }
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        if (this.OooO00o != null) {
            return -1;
        }
        return this.f18221OooO00o != null ? 0 : 1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m17522OooO0O0() {
        return this.f18221OooO00o != null ? new ILI1Ll(0, new C6487lIIiIlL(this.f18221OooO00o)) : this.OooO0O0 != null ? new ILI1Ll(1, new C6487lIIiIlL(this.OooO0O0)) : this.OooO00o.m16323OooO0O0();
    }
}
