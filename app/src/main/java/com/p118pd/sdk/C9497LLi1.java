package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.丨LLi1丨丨  reason: invalid class name and case insensitive filesystem */
public class C9497LLi1 extends AbstractC9710lilli {
    public static final int o0OO00O = 32;
    public static final int o0OOO0o = 8;
    public static final int o0Oo0oo = 16;
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 2;
    public static final int o0ooOoO = 4;
    public static final int oo0o0Oo = 64;
    public BigInteger OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23061OooO00o;
    public BigInteger OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f23062OooO0O0;
    public BigInteger OooO0OO;
    public BigInteger OooO0Oo;
    public BigInteger OooO0o0;
    public LlLI1 o00OoOOo;
    public int o00oO0O;

    public C9497LLi1(I11li1 i11li1) throws IllegalArgumentException {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.o00OoOOo = LlLI1.OooO00o(OooO00o2.nextElement());
        this.o00oO0O = 0;
        while (OooO00o2.hasMoreElements()) {
            Object nextElement = OooO00o2.nextElement();
            if (nextElement instanceof AbstractC5903LlLLL) {
                AbstractC5903LlLLL r1 = (AbstractC5903LlLLL) nextElement;
                switch (r1.OooO00o()) {
                    case 1:
                        OooO0Oo(C5548IilL.OooO00o(r1).m15826OooO00o());
                        break;
                    case 2:
                        OooO0O0(C5548IilL.OooO00o(r1).m15826OooO00o());
                        break;
                    case 3:
                        OooO0o0(C5548IilL.OooO00o(r1).m15826OooO00o());
                        break;
                    case 4:
                        OooO00o(AbstractC6804llL1ii.OooO00o(r1, false));
                        break;
                    case 5:
                        OooO0OO(C5548IilL.OooO00o(r1).m15826OooO00o());
                        break;
                    case 6:
                        OooO0O0(AbstractC6804llL1ii.OooO00o(r1, false));
                        break;
                    case 7:
                        OooO00o(C5548IilL.OooO00o(r1).m15826OooO00o());
                        break;
                    default:
                        this.o00oO0O = 0;
                        throw new IllegalArgumentException("Unknown Object Identifier!");
                }
            } else {
                throw new IllegalArgumentException("Unknown Object Identifier!");
            }
        }
        int i = this.o00oO0O;
        if (i != 32 && i != 127) {
            throw new IllegalArgumentException("All options must be either present or absent!");
        }
    }

    public C9497LLi1(LlLI1 llLI1, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte[] bArr, BigInteger bigInteger4, byte[] bArr2, int i) {
        this.o00OoOOo = llLI1;
        OooO0Oo(bigInteger);
        OooO0O0(bigInteger2);
        OooO0o0(bigInteger3);
        OooO00o((AbstractC6804llL1ii) new C6487lIIiIlL(bArr));
        OooO0OO(bigInteger4);
        OooO0O0(new C6487lIIiIlL(bArr2));
        OooO00o(BigInteger.valueOf((long) i));
    }

    public C9497LLi1(LlLI1 llLI1, byte[] bArr) throws IllegalArgumentException {
        this.o00OoOOo = llLI1;
        OooO0O0(new C6487lIIiIlL(bArr));
    }

    private void OooO00o(AbstractC6804llL1ii r3) throws IllegalArgumentException {
        int i = this.o00oO0O;
        if ((i & 8) == 0) {
            this.o00oO0O = i | 8;
            this.f23061OooO00o = r3.m17938OooO00o();
            return;
        }
        throw new IllegalArgumentException("Base Point G already set");
    }

    private void OooO00o(BigInteger bigInteger) throws IllegalArgumentException {
        int i = this.o00oO0O;
        if ((i & 64) == 0) {
            this.o00oO0O = i | 64;
            this.OooO0o0 = bigInteger;
            return;
        }
        throw new IllegalArgumentException("Cofactor F already set");
    }

    private void OooO0O0(AbstractC6804llL1ii r3) throws IllegalArgumentException {
        int i = this.o00oO0O;
        if ((i & 32) == 0) {
            this.o00oO0O = i | 32;
            this.f23062OooO0O0 = r3.m17938OooO00o();
            return;
        }
        throw new IllegalArgumentException("Public Point Y already set");
    }

    private void OooO0O0(BigInteger bigInteger) throws IllegalArgumentException {
        int i = this.o00oO0O;
        if ((i & 2) == 0) {
            this.o00oO0O = i | 2;
            this.OooO0O0 = bigInteger;
            return;
        }
        throw new IllegalArgumentException("First Coef A already set");
    }

    private void OooO0OO(BigInteger bigInteger) throws IllegalArgumentException {
        int i = this.o00oO0O;
        if ((i & 16) == 0) {
            this.o00oO0O = i | 16;
            this.OooO0Oo = bigInteger;
            return;
        }
        throw new IllegalArgumentException("Order of base point R already set");
    }

    private void OooO0Oo(BigInteger bigInteger) {
        int i = this.o00oO0O;
        if ((i & 1) == 0) {
            this.o00oO0O = i | 1;
            this.OooO00o = bigInteger;
            return;
        }
        throw new IllegalArgumentException("Prime Modulus P already set");
    }

    private void OooO0o0(BigInteger bigInteger) throws IllegalArgumentException {
        int i = this.o00oO0O;
        if ((i & 4) == 0) {
            this.o00oO0O = i | 4;
            this.OooO0OO = bigInteger;
            return;
        }
        throw new IllegalArgumentException("Second Coef B already set");
    }

    @Override // com.p118pd.sdk.AbstractC9710lilli
    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    public iILLL1 OooO00o(LlLI1 llLI1, boolean z) {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(llLI1);
        if (!z) {
            r0.OooO00o(new C5548IilL(1, OooO0Oo()));
            r0.OooO00o(new C5548IilL(2, m21552OooO0O0()));
            r0.OooO00o(new C5548IilL(3, OooO0o0()));
            r0.OooO00o(new ILI1Ll(false, 4, new C6487lIIiIlL(m21551OooO00o())));
            r0.OooO00o(new C5548IilL(5, OooO0OO()));
        }
        r0.OooO00o(new ILI1Ll(false, 6, new C6487lIIiIlL(m21553OooO0O0())));
        if (!z) {
            r0.OooO00o(new C5548IilL(7, m21549OooO00o()));
        }
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC9710lilli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m21549OooO00o() {
        if ((this.o00oO0O & 64) != 0) {
            return this.OooO0o0;
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC9710lilli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21550OooO00o() {
        return this.OooO00o != null;
    }

    @Override // com.p118pd.sdk.AbstractC9710lilli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21551OooO00o() {
        if ((this.o00oO0O & 8) != 0) {
            return C9586iIILl.m21630OooO00o(this.f23061OooO00o);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new C5707LiL1(OooO00o(this.o00OoOOo, !m21550OooO00o()));
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m21552OooO0O0() {
        if ((this.o00oO0O & 2) != 0) {
            return this.OooO0O0;
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[] m21553OooO0O0() {
        if ((this.o00oO0O & 32) != 0) {
            return C9586iIILl.m21630OooO00o(this.f23062OooO0O0);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public BigInteger OooO0OO() {
        if ((this.o00oO0O & 16) != 0) {
            return this.OooO0Oo;
        }
        return null;
    }

    public BigInteger OooO0Oo() {
        if ((this.o00oO0O & 1) != 0) {
            return this.OooO00o;
        }
        return null;
    }

    public BigInteger OooO0o0() {
        if ((this.o00oO0O & 4) != 0) {
            return this.OooO0OO;
        }
        return null;
    }
}
