package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.I丨ilL丨丨  reason: invalid class name and case insensitive filesystem */
public class C5548IilL extends AbstractC5738Lil {
    public BigInteger OooO00o;
    public int o00oO0O;

    public C5548IilL(int i, BigInteger bigInteger) {
        this.o00oO0O = i;
        this.OooO00o = bigInteger;
    }

    public C5548IilL(AbstractC5903LlLLL r3) {
        this.o00oO0O = r3.OooO00o();
        this.OooO00o = new BigInteger(1, AbstractC6804llL1ii.OooO00o(r3, false).m17938OooO00o());
    }

    public static C5548IilL OooO00o(Object obj) {
        if (obj instanceof C5548IilL) {
            return (C5548IilL) obj;
        }
        if (obj != null) {
            return new C5548IilL(AbstractC5903LlLLL.OooO00o(obj));
        }
        return null;
    }

    private byte[] OooO00o() {
        byte[] byteArray = this.OooO00o.toByteArray();
        if (byteArray[0] != 0) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m15825OooO00o() {
        return this.o00oO0O;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m15826OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new ILI1Ll(false, this.o00oO0O, new C6487lIIiIlL(OooO00o()));
    }
}
