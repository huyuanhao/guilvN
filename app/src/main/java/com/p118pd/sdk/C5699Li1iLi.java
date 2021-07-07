package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.Li1iLi  reason: case insensitive filesystem */
public class C5699Li1iLi extends AbstractC5738Lil {
    public II1LL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f16574OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9752I11 f16575OooO00o;

    public C5699Li1iLi(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.OooO00o = II1LL.OooO00o(OooO00o2.nextElement());
        while (OooO00o2.hasMoreElements()) {
            Object nextElement = OooO00o2.nextElement();
            if (nextElement instanceof C6513lIiI) {
                this.f16574OooO00o = C6513lIiI.OooO00o(nextElement);
            } else {
                this.f16575OooO00o = C9752I11.OooO00o(nextElement);
            }
        }
    }

    public C5699Li1iLi(II1LL r2) {
        this(r2, null, null);
    }

    public C5699Li1iLi(II1LL r1, C6513lIiI r2, C9752I11 r3) {
        if (r1 != null) {
            this.OooO00o = r1;
            this.f16574OooO00o = r2;
            this.f16575OooO00o = r3;
            return;
        }
        throw new IllegalArgumentException("'pkiStatusInfo' cannot be null");
    }

    public static C5699Li1iLi OooO00o(Object obj) {
        if (obj instanceof C5699Li1iLi) {
            return (C5699Li1iLi) obj;
        }
        if (obj != null) {
            return new C5699Li1iLi(I11li1.OooO00o(obj));
        }
        return null;
    }

    private void OooO00o(iILLL1 r1, AbstractC6854lLi1LL r2) {
        if (r2 != null) {
            r1.OooO00o(r2);
        }
    }

    public II1LL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m16295OooO00o() {
        return this.f16574OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9752I11 m16296OooO00o() {
        return this.f16575OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        OooO00o(r0, this.f16574OooO00o);
        OooO00o(r0, this.f16575OooO00o);
        return new C5707LiL1(r0);
    }
}
