package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Date;

/* renamed from: com.pd.sdk.丨IL1i丨LI  reason: invalid class name */
public class IL1iLI extends AbstractC5738Lil {
    public final AbstractC6804llL1ii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9623il f22905OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final BigInteger f22906OooO00o;
    public final C9623il OooO0O0;
    public final String o0ooOOo;
    public final String o0ooOoO;

    public IL1iLI(I11li1 i11li1) {
        this.f22906OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(0)).m17647OooO0O0();
        this.o0ooOOo = LII.OooO00o(i11li1.OooO00o(1)).OooO00o();
        this.f22905OooO00o = C9623il.OooO00o(i11li1.OooO00o(2));
        this.OooO0O0 = C9623il.OooO00o(i11li1.OooO00o(3));
        this.OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(4));
        this.o0ooOoO = i11li1.size() == 6 ? LII.OooO00o(i11li1.OooO00o(5)).OooO00o() : null;
    }

    public IL1iLI(BigInteger bigInteger, String str, Date date, Date date2, byte[] bArr, String str2) {
        this.f22906OooO00o = bigInteger;
        this.o0ooOOo = str;
        this.f22905OooO00o = new C6139iILilI(date);
        this.OooO0O0 = new C6139iILilI(date2);
        this.OooO00o = new C6487lIIiIlL(C9586iIILl.m21630OooO00o(bArr));
        this.o0ooOoO = str2;
    }

    public static IL1iLI OooO00o(Object obj) {
        if (obj instanceof IL1iLI) {
            return (IL1iLI) obj;
        }
        if (obj != null) {
            return new IL1iLI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C9623il OooO00o() {
        return this.f22905OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m21426OooO00o() {
        return this.f22906OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21427OooO00o() {
        return C9586iIILl.m21630OooO00o(this.OooO00o.m17938OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI(this.f22906OooO00o));
        r0.OooO00o(new LII(this.o0ooOOo));
        r0.OooO00o(this.f22905OooO00o);
        r0.OooO00o(this.OooO0O0);
        r0.OooO00o(this.OooO00o);
        String str = this.o0ooOoO;
        if (str != null) {
            r0.OooO00o(new LII(str));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C9623il m21428OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m21429OooO0O0() {
        return this.o0ooOoO;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public String OooO0OO() {
        return this.o0ooOOo;
    }
}
