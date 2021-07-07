package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.lLIi  reason: case insensitive filesystem */
public class C6574lLIi extends AbstractC5738Lil {
    public final byte[] OooO00o;
    public final byte[] OooO0O0;
    public final byte[] OooO0OO;
    public final byte[] OooO0Oo;
    public final byte[] OooO0o0;
    public final int o00oO0O;

    public C6574lLIi(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.o00oO0O = i;
        this.OooO00o = C9586iIILl.m21630OooO00o(bArr);
        this.OooO0O0 = C9586iIILl.m21630OooO00o(bArr2);
        this.OooO0OO = C9586iIILl.m21630OooO00o(bArr3);
        this.OooO0Oo = C9586iIILl.m21630OooO00o(bArr4);
        this.OooO0o0 = C9586iIILl.m21630OooO00o(bArr5);
    }

    public C6574lLIi(I11li1 i11li1) {
        if (!C6513lIiI.OooO00o(i11li1.OooO00o(0)).m17647OooO0O0().equals(BigInteger.valueOf(0))) {
            throw new IllegalArgumentException("unknown version of sequence");
        } else if (i11li1.size() == 2 || i11li1.size() == 3) {
            I11li1 OooO00o2 = I11li1.OooO00o(i11li1.OooO00o(1));
            this.o00oO0O = C6513lIiI.OooO00o(OooO00o2.OooO00o(0)).m17647OooO0O0().intValue();
            this.OooO00o = C9586iIILl.m21630OooO00o(AbstractC6804llL1ii.OooO00o(OooO00o2.OooO00o(1)).m17938OooO00o());
            this.OooO0O0 = C9586iIILl.m21630OooO00o(AbstractC6804llL1ii.OooO00o(OooO00o2.OooO00o(2)).m17938OooO00o());
            this.OooO0OO = C9586iIILl.m21630OooO00o(AbstractC6804llL1ii.OooO00o(OooO00o2.OooO00o(3)).m17938OooO00o());
            this.OooO0Oo = C9586iIILl.m21630OooO00o(AbstractC6804llL1ii.OooO00o(OooO00o2.OooO00o(4)).m17938OooO00o());
            if (i11li1.size() == 3) {
                this.OooO0o0 = C9586iIILl.m21630OooO00o(AbstractC6804llL1ii.OooO00o(AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(2)), true).m17938OooO00o());
            } else {
                this.OooO0o0 = null;
            }
        } else {
            throw new IllegalArgumentException("key sequence wrong size");
        }
    }

    public static C6574lLIi OooO00o(Object obj) {
        if (obj instanceof C6574lLIi) {
            return (C6574lLIi) obj;
        }
        if (obj != null) {
            return new C6574lLIi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public byte[] OooO00o() {
        return C9586iIILl.m21630OooO00o(this.OooO0o0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m17671OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI(0));
        iILLL1 r1 = new iILLL1();
        r1.OooO00o(new C6513lIiI((long) this.o00oO0O));
        r1.OooO00o(new C6487lIIiIlL(this.OooO00o));
        r1.OooO00o(new C6487lIIiIlL(this.OooO0O0));
        r1.OooO00o(new C6487lIIiIlL(this.OooO0OO));
        r1.OooO00o(new C6487lIIiIlL(this.OooO0Oo));
        r0.OooO00o(new C5707LiL1(r1));
        r0.OooO00o(new ILI1Ll(true, 0, new C6487lIIiIlL(this.OooO0o0)));
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[] m17672OooO0O0() {
        return C9586iIILl.m21630OooO00o(this.OooO0OO);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public byte[] OooO0OO() {
        return C9586iIILl.m21630OooO00o(this.OooO0Oo);
    }

    public byte[] OooO0Oo() {
        return C9586iIILl.m21630OooO00o(this.OooO0O0);
    }

    public byte[] OooO0o0() {
        return C9586iIILl.m21630OooO00o(this.OooO00o);
    }
}
