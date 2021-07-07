package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.LIii1II */
public class LIii1II extends AbstractC9710lilli {
    public static int o0ooOO0 = 1;
    public static int o0ooOOo = 2;
    public BigInteger OooO00o;
    public BigInteger OooO0O0;
    public LlLI1 o00OoOOo;
    public int o00oO0O = 0;

    public LIii1II(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.o00OoOOo = LlLI1.OooO00o(OooO00o2.nextElement());
        while (OooO00o2.hasMoreElements()) {
            C5548IilL OooO00o3 = C5548IilL.OooO00o(OooO00o2.nextElement());
            int OooO00o4 = OooO00o3.m15825OooO00o();
            if (OooO00o4 == 1) {
                OooO0O0(OooO00o3);
            } else if (OooO00o4 == 2) {
                OooO00o(OooO00o3);
            } else {
                throw new IllegalArgumentException("Unknown DERTaggedObject :" + OooO00o3.m15825OooO00o() + "-> not an Iso7816RSAPublicKeyStructure");
            }
        }
        if (this.o00oO0O != 3) {
            throw new IllegalArgumentException("missing argument -> not an Iso7816RSAPublicKeyStructure");
        }
    }

    public LIii1II(LlLI1 llLI1, BigInteger bigInteger, BigInteger bigInteger2) {
        this.o00OoOOo = llLI1;
        this.OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
    }

    private void OooO00o(C5548IilL r4) {
        int i = this.o00oO0O;
        int i2 = o0ooOOo;
        if ((i & i2) == 0) {
            this.o00oO0O = i | i2;
            this.OooO0O0 = r4.m15826OooO00o();
            return;
        }
        throw new IllegalArgumentException("Exponent already set");
    }

    private void OooO0O0(C5548IilL r4) {
        int i = this.o00oO0O;
        int i2 = o0ooOO0;
        if ((i & i2) == 0) {
            this.o00oO0O = i | i2;
            this.OooO00o = r4.m15826OooO00o();
            return;
        }
        throw new IllegalArgumentException("Modulus already set");
    }

    @Override // com.p118pd.sdk.AbstractC9710lilli
    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    @Override // com.p118pd.sdk.AbstractC9710lilli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m16089OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        r0.OooO00o(new C5548IilL(1, m16089OooO00o()));
        r0.OooO00o(new C5548IilL(2, m16090OooO0O0()));
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m16090OooO0O0() {
        return this.OooO0O0;
    }
}
