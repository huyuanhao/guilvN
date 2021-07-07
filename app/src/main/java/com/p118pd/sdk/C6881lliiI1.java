package com.p118pd.sdk;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Exception;

/* renamed from: com.pd.sdk.l丨liiI1  reason: invalid class name and case insensitive filesystem */
public class C6881lliiI1 extends AbstractC5903LlLLL {
    public C6881lliiI1(int i) {
        super(false, i, new C6351ill());
    }

    public C6881lliiI1(int i, AbstractC6854lLi1LL r3) {
        super(true, i, r3);
    }

    public C6881lliiI1(boolean z, int i, AbstractC6854lLi1LL r3) {
        super(z, i, r3);
    }

    @Override // com.p118pd.sdk.AbstractC5903LlLLL, com.p118pd.sdk.AbstractC6122iIlLiL
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        Enumeration enumeration;
        iii1.OooO00o(160, this.o00oO0O);
        iii1.OooO00o(128);
        if (!this.OooO0O0) {
            if (!this.OooO0OO) {
                AbstractC6854lLi1LL r0 = this.OooO00o;
                if (r0 instanceof AbstractC6804llL1ii) {
                    enumeration = r0 instanceof C5837L1l ? ((C5837L1l) r0).m16422OooO00o() : new C5837L1l(((AbstractC6804llL1ii) r0).m17938OooO00o()).m16422OooO00o();
                } else if (r0 instanceof I11li1) {
                    enumeration = ((I11li1) r0).m15236OooO00o();
                } else if (r0 instanceof I11L) {
                    enumeration = ((I11L) r0).m15215OooO00o();
                } else {
                    throw new ASN1Exception("not implemented: " + this.OooO00o.getClass().getName());
                }
                while (enumeration.hasMoreElements()) {
                    iii1.OooO00o((AbstractC6854lLi1LL) enumeration.nextElement());
                }
            } else {
                iii1.OooO00o(this.OooO00o);
            }
        }
        iii1.OooO00o(0);
        iii1.OooO00o(0);
    }

    @Override // com.p118pd.sdk.AbstractC6532lIII, com.p118pd.sdk.AbstractC5903LlLLL, com.p118pd.sdk.AbstractC5903LlLLL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6181iLiLI
    public boolean OooO00o() {
        if (this.OooO0O0 || this.OooO0OO) {
            return true;
        }
        return this.OooO00o.OooO0O0().OooO0Oo().OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC5903LlLLL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() throws IOException {
        int OooO0O0;
        if (this.OooO0O0) {
            return L1li1.OooO0O0(this.o00oO0O) + 1;
        }
        int OooO0O02 = this.OooO00o.OooO0O0().OooO0O0();
        if (this.OooO0OO) {
            OooO0O0 = L1li1.OooO0O0(this.o00oO0O) + L1li1.OooO00o(OooO0O02);
        } else {
            OooO0O02--;
            OooO0O0 = L1li1.OooO0O0(this.o00oO0O);
        }
        return OooO0O0 + OooO0O02;
    }
}
