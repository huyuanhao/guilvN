package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.L1IIlli */
public class L1IIlli extends AbstractC5738Lil {
    public I11L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public l1LILI1 f16158OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f16159OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6888ll f16160OooO00o;

    public L1IIlli(I11li1 i11li1) {
        this.f16159OooO00o = new C6513lIiI(0);
        this.OooO00o = null;
        this.f16159OooO00o = (C6513lIiI) i11li1.OooO00o(0);
        this.f16158OooO00o = l1LILI1.OooO00o(i11li1.OooO00o(1));
        this.f16160OooO00o = C6888ll.OooO00o(i11li1.OooO00o(2));
        if (i11li1.size() > 3) {
            this.OooO00o = I11L.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(3), false);
        }
        OooO00o(this.OooO00o);
        if (this.f16158OooO00o == null || this.f16159OooO00o == null || this.f16160OooO00o == null) {
            throw new IllegalArgumentException("Not all mandatory fields set in CertificationRequestInfo generator.");
        }
    }

    public L1IIlli(l1LILI1 r4, C6888ll r5, I11L i11l) {
        this.f16159OooO00o = new C6513lIiI(0);
        this.OooO00o = null;
        if (r4 == null || r5 == null) {
            throw new IllegalArgumentException("Not all mandatory fields set in CertificationRequestInfo generator.");
        }
        OooO00o(i11l);
        this.f16158OooO00o = r4;
        this.f16160OooO00o = r5;
        this.OooO00o = i11l;
    }

    public L1IIlli(C929811Li1 r1, C6888ll r2, I11L i11l) {
        this(l1LILI1.OooO00o(r1.OooO0O0()), r2, i11l);
    }

    public static L1IIlli OooO00o(Object obj) {
        if (obj instanceof L1IIlli) {
            return (L1IIlli) obj;
        }
        if (obj != null) {
            return new L1IIlli(I11li1.OooO00o(obj));
        }
        return null;
    }

    public static void OooO00o(I11L i11l) {
        if (i11l != null) {
            Enumeration OooO00o2 = i11l.m15215OooO00o();
            while (OooO00o2.hasMoreElements()) {
                LIIi OooO00o3 = LIIi.OooO00o(OooO00o2.nextElement());
                if (OooO00o3.m16037OooO00o().equals(AbstractC5711LiLli.oo0o0Oo) && OooO00o3.OooO00o().size() != 1) {
                    throw new IllegalArgumentException("challengePassword attribute must have one value");
                }
            }
        }
    }

    public I11L OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public l1LILI1 m15896OooO00o() {
        return this.f16158OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m15897OooO00o() {
        return this.f16159OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6888ll m15898OooO00o() {
        return this.f16160OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f16159OooO00o);
        r0.OooO00o(this.f16158OooO00o);
        r0.OooO00o(this.f16160OooO00o);
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.OooO00o));
        }
        return new C5707LiL1(r0);
    }
}
