package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.丨i丨i1  reason: invalid class name and case insensitive filesystem */
public class C9648ii1 extends AbstractC5738Lil {
    public I11IIL1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6684lii1 f23243OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9624il1 f23244OooO00o;

    public C9648ii1(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC5903LlLLL r0 = (AbstractC5903LlLLL) OooO00o2.nextElement();
            int OooO00o3 = r0.OooO00o();
            if (OooO00o3 == 0) {
                this.f23243OooO00o = C6684lii1.OooO00o(r0.OooO0o());
            } else if (OooO00o3 == 1) {
                this.f23244OooO00o = C9624il1.OooO00o(r0.OooO0o());
            } else if (OooO00o3 == 2) {
                this.OooO00o = I11IIL1.OooO00o(r0.OooO0o());
            } else {
                throw new IllegalArgumentException("illegal tag");
            }
        }
    }

    public C9648ii1(C6684lii1 lii1, C9624il1 r2, I11IIL1 i11iil1) {
        this.f23243OooO00o = lii1;
        this.f23244OooO00o = r2;
        this.OooO00o = i11iil1;
    }

    public static C9648ii1 OooO00o(Object obj) {
        if (obj instanceof C9648ii1) {
            return (C9648ii1) obj;
        }
        if (obj != null) {
            return new C9648ii1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I11IIL1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6684lii1 m21703OooO00o() {
        return this.f23243OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9624il1 m21704OooO00o() {
        return this.f23244OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.f23243OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 0, this.f23243OooO00o.OooO0O0()));
        }
        if (this.f23244OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 1, this.f23244OooO00o.OooO0O0()));
        }
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 2, this.OooO00o.OooO0O0()));
        }
        return new C5707LiL1(r0);
    }
}
