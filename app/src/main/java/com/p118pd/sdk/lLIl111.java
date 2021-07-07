package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.lLIl111 */
public class lLIl111 extends AbstractC5738Lil {
    public LlI11i OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6310ilIL f18490OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9623il f18491OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f18492OooO00o;
    public C6310ilIL OooO0O0;
    public String o0ooOOo;

    public lLIl111(I11li1 i11li1) {
        if (i11li1.size() >= 1) {
            Enumeration OooO00o2 = i11li1.m15236OooO00o();
            this.OooO00o = LlI11i.OooO00o(OooO00o2.nextElement());
            while (OooO00o2.hasMoreElements()) {
                AbstractC5903LlLLL OooO00o3 = AbstractC5903LlLLL.OooO00o(OooO00o2.nextElement());
                int OooO00o4 = OooO00o3.OooO00o();
                if (OooO00o4 == 0) {
                    this.f18492OooO00o = C6513lIiI.OooO00o(OooO00o3, false).m17647OooO0O0();
                } else if (OooO00o4 == 1) {
                    this.f18491OooO00o = C9623il.OooO00o(OooO00o3, false);
                } else if (OooO00o4 == 2) {
                    this.f18490OooO00o = C6310ilIL.OooO00o(OooO00o3, true);
                } else if (OooO00o4 == 3) {
                    this.o0ooOOo = LI11.OooO00o(OooO00o3, false).OooO00o();
                } else if (OooO00o4 == 4) {
                    this.OooO0O0 = C6310ilIL.OooO00o(OooO00o3, true);
                } else {
                    throw new IllegalArgumentException("Bad tag number: " + OooO00o3.OooO00o());
                }
            }
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public lLIl111(LlI11i r1, BigInteger bigInteger, C9623il r3, C6310ilIL r4, String str, C6310ilIL r6) {
        this.OooO00o = r1;
        this.f18491OooO00o = r3;
        this.o0ooOOo = str;
        this.f18492OooO00o = bigInteger;
        this.OooO0O0 = r6;
        this.f18490OooO00o = r4;
    }

    public static lLIl111 OooO00o(Object obj) {
        if (obj == null || (obj instanceof lLIl111)) {
            return (lLIl111) obj;
        }
        if (obj instanceof I11li1) {
            return new lLIl111((I11li1) obj);
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public LlI11i OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6310ilIL m17674OooO00o() {
        return this.f18490OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9623il m17675OooO00o() {
        return this.f18491OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17676OooO00o() {
        return this.f18492OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        if (this.f18492OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, new C6513lIiI(this.f18492OooO00o)));
        }
        if (this.f18491OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 1, this.f18491OooO00o));
        }
        if (this.f18490OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 2, this.f18490OooO00o));
        }
        if (this.o0ooOOo != null) {
            r0.OooO00o(new ILI1Ll(false, 3, new LI11(this.o0ooOOo, true)));
        }
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(true, 4, this.OooO0O0));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6310ilIL m17677OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m17678OooO0O0() {
        return this.o0ooOOo;
    }
}
