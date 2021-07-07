package com.p118pd.sdk;

import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.iiLi丨lL  reason: invalid class name and case insensitive filesystem */
public class C6251iiLilL extends AbstractC5738Lil {
    public I11li1 OooO00o = null;

    public C6251iiLilL(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public C6251iiLilL(C9621ii1iL[] r4) {
        iILLL1 r0 = new iILLL1();
        for (int i = 0; i != r4.length; i++) {
            r0.OooO00o(r4[i]);
        }
        this.OooO00o = new C5707LiL1(r0);
    }

    public static C6251iiLilL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6251iiLilL OooO00o(Object obj) {
        if (obj instanceof C6251iiLilL) {
            return (C6251iiLilL) obj;
        }
        if (obj != null) {
            return new C6251iiLilL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C9621ii1iL[] OooO00o() {
        C9621ii1iL[] r0 = new C9621ii1iL[this.OooO00o.size()];
        for (int i = 0; i != this.OooO00o.size(); i++) {
            r0[i] = C9621ii1iL.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String OooO00o2 = Strings.m22984OooO00o();
        stringBuffer.append("CRLDistPoint:");
        stringBuffer.append(OooO00o2);
        C9621ii1iL[] OooO00o3 = OooO00o();
        for (int i = 0; i != OooO00o3.length; i++) {
            stringBuffer.append(C9878I1.f23489OooO00o);
            stringBuffer.append(OooO00o3[i]);
            stringBuffer.append(OooO00o2);
        }
        return stringBuffer.toString();
    }
}
