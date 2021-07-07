package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.I丨丨iILI  reason: invalid class name and case insensitive filesystem */
public class C5570IiILI extends AbstractC5738Lil {
    public final I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6456l1ilL f16109OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6513lIiI f16110OooO00o;

    public C5570IiILI(I11li1 i11li1) {
        if (i11li1.size() == 3) {
            this.f16110OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(0));
            this.f16109OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(1));
            this.OooO00o = I11li1.OooO00o(i11li1.OooO00o(2));
            return;
        }
        throw new IllegalArgumentException("incorrect sequence size");
    }

    public C5570IiILI(BigInteger bigInteger, C6456l1ilL r4, byte[][] bArr) {
        this.f16110OooO00o = new C6513lIiI(bigInteger);
        this.f16109OooO00o = r4;
        iILLL1 r3 = new iILLL1();
        for (int i = 0; i != bArr.length; i++) {
            r3.OooO00o(new C6487lIIiIlL(C9586iIILl.m21630OooO00o(bArr[i])));
        }
        this.OooO00o = new C5707LiL1(r3);
    }

    public static C5570IiILI OooO00o(Object obj) {
        if (obj instanceof C5570IiILI) {
            return (C5570IiILI) obj;
        }
        if (obj != null) {
            return new C5570IiILI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.f16109OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m15872OooO00o() {
        return this.f16110OooO00o.m17647OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[][] m15873OooO00o() {
        int size = this.OooO00o.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i != size; i++) {
            bArr[i] = C9586iIILl.m21630OooO00o(AbstractC6804llL1ii.OooO00o(this.OooO00o.OooO00o(i)).m17938OooO00o());
        }
        return bArr;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f16110OooO00o);
        r0.OooO00o(this.f16109OooO00o);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
