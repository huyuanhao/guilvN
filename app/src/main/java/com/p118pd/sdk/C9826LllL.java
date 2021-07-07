package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.丨丨LllL  reason: invalid class name and case insensitive filesystem */
public class C9826LllL extends AbstractC5738Lil implements AbstractC5462Ilil {
    public AbstractC5738Lil OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LilIiIl f23425OooO00o;
    public int o00oO0O;

    public C9826LllL(int i, AbstractC5738Lil lil) {
        this.o00oO0O = i;
        this.OooO00o = lil;
    }

    public C9826LllL(LilIiIl lilIiIl) {
        if (lilIiIl.OooO0O0() == 3) {
            this.f23425OooO00o = lilIiIl;
            return;
        }
        throw new IllegalArgumentException("only version 3 certificates allowed");
    }

    public C9826LllL(C9370Ii r2) {
        this(1, r2);
    }

    public static C9826LllL OooO00o(Object obj) {
        if (obj == null || (obj instanceof C9826LllL)) {
            return (C9826LllL) obj;
        }
        if (obj instanceof byte[]) {
            try {
                obj = AbstractC6122iIlLiL.OooO00o((byte[]) obj);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Invalid encoding in CMPCertificate");
            }
        }
        if (obj instanceof I11li1) {
            return new C9826LllL(LilIiIl.OooO00o(obj));
        }
        if (obj instanceof AbstractC5903LlLLL) {
            AbstractC5903LlLLL r3 = (AbstractC5903LlLLL) obj;
            return new C9826LllL(r3.OooO00o(), r3.OooO0o());
        }
        throw new IllegalArgumentException("Invalid object: " + obj.getClass().getName());
    }

    public AbstractC5738Lil OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LilIiIl m21915OooO00o() {
        return this.f23425OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9370Ii m21916OooO00o() {
        return C9370Ii.OooO00o(this.OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21917OooO00o() {
        return this.f23425OooO00o != null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m21918OooO0O0() {
        return this.OooO00o != null ? new ILI1Ll(true, this.o00oO0O, this.OooO00o) : this.f23425OooO00o.m16323OooO0O0();
    }
}
