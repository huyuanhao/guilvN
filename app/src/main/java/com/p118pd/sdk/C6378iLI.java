package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Date;

/* renamed from: com.pd.sdk.i丨LI  reason: invalid class name and case insensitive filesystem */
public class C6378iLI extends AbstractC5738Lil {
    public final C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9623il f18164OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final li1Ii1i f18165OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final BigInteger f18166OooO00o;
    public final C9623il OooO0O0;
    public final String o0ooOOo;

    public C6378iLI(I11li1 i11li1) {
        this.f18166OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(0)).m17647OooO0O0();
        this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(1));
        this.f18164OooO00o = C9623il.OooO00o(i11li1.OooO00o(2));
        this.OooO0O0 = C9623il.OooO00o(i11li1.OooO00o(3));
        this.f18165OooO00o = li1Ii1i.OooO00o(i11li1.OooO00o(4));
        this.o0ooOOo = i11li1.size() == 6 ? LII.OooO00o(i11li1.OooO00o(5)).OooO00o() : null;
    }

    public C6378iLI(C6456l1ilL r3, Date date, Date date2, li1Ii1i r6, String str) {
        this.f18166OooO00o = BigInteger.valueOf(1);
        this.OooO00o = r3;
        this.f18164OooO00o = new C6139iILilI(date);
        this.OooO0O0 = new C6139iILilI(date2);
        this.f18165OooO00o = r6;
        this.o0ooOOo = str;
    }

    public static C6378iLI OooO00o(Object obj) {
        if (obj instanceof C6378iLI) {
            return (C6378iLI) obj;
        }
        if (obj != null) {
            return new C6378iLI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9623il m17491OooO00o() {
        return this.f18164OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public li1Ii1i m17492OooO00o() {
        return this.f18165OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17493OooO00o() {
        return this.f18166OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI(this.f18166OooO00o));
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f18164OooO00o);
        r0.OooO00o(this.OooO0O0);
        r0.OooO00o(this.f18165OooO00o);
        String str = this.o0ooOOo;
        if (str != null) {
            r0.OooO00o(new LII(str));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C9623il m17494OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m17495OooO0O0() {
        return this.o0ooOOo;
    }
}
