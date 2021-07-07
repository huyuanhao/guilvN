package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨llii丨  reason: invalid class name and case insensitive filesystem */
public class C9713llii extends AbstractC5738Lil {
    public static final BigInteger OooO0O0 = BigInteger.valueOf(1);
    public C6052i1l OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f23349OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23350OooO00o;

    public C9713llii(I11li1 i11li1) {
        this.OooO00o = C6052i1l.OooO00o(i11li1.OooO00o(0));
        this.f23350OooO00o = C9586iIILl.m21630OooO00o(((AbstractC6804llL1ii) i11li1.OooO00o(1)).m17938OooO00o());
        this.f23349OooO00o = i11li1.size() == 3 ? ((C6513lIiI) i11li1.OooO00o(2)).m17647OooO0O0() : OooO0O0;
    }

    public C9713llii(C6052i1l r1, byte[] bArr, int i) {
        this.OooO00o = r1;
        this.f23350OooO00o = C9586iIILl.m21630OooO00o(bArr);
        this.f23349OooO00o = BigInteger.valueOf((long) i);
    }

    public static C9713llii OooO00o(Object obj) {
        if (obj instanceof C9713llii) {
            return (C9713llii) obj;
        }
        if (obj != null) {
            return new C9713llii(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6052i1l OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m21750OooO00o() {
        return this.f23349OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21751OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f23350OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(new C6487lIIiIlL(this.f23350OooO00o));
        if (!this.f23349OooO00o.equals(OooO0O0)) {
            r0.OooO00o(new C6513lIiI(this.f23349OooO00o));
        }
        return new C5707LiL1(r0);
    }
}
