package com.p118pd.sdk;

import java.io.IOException;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.lIi丨I  reason: invalid class name and case insensitive filesystem */
public class C6513lIiI extends AbstractC6122iIlLiL {
    public final byte[] OooO00o;

    public C6513lIiI(long j) {
        this.OooO00o = BigInteger.valueOf(j).toByteArray();
    }

    public C6513lIiI(BigInteger bigInteger) {
        this.OooO00o = bigInteger.toByteArray();
    }

    public C6513lIiI(byte[] bArr) {
        this(bArr, true);
    }

    public C6513lIiI(byte[] bArr, boolean z) {
        if (C9358II1.m21422OooO00o("org.bouncycastle.asn1.allow_unsafe_integer") || !OooO00o(bArr)) {
            this.OooO00o = z ? C9586iIILl.m21630OooO00o(bArr) : bArr;
            return;
        }
        throw new IllegalArgumentException("malformed integer");
    }

    public static C6513lIiI OooO00o(AbstractC5903LlLLL r0, boolean z) {
        AbstractC6122iIlLiL OooO0o = r0.OooO0o();
        return (z || (OooO0o instanceof C6513lIiI)) ? OooO00o((Object) OooO0o) : new C6513lIiI(AbstractC6804llL1ii.OooO00o((Object) OooO0o).m17938OooO00o());
    }

    public static C6513lIiI OooO00o(Object obj) {
        if (obj == null || (obj instanceof C6513lIiI)) {
            return (C6513lIiI) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C6513lIiI) AbstractC6122iIlLiL.OooO00o((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
    }

    public static boolean OooO00o(byte[] bArr) {
        if (bArr.length > 1) {
            if (bArr[0] == 0 && (bArr[1] & O0O00O.OooO00o) == 0) {
                return true;
            }
            return bArr[0] == -1 && (bArr[1] & O0O00O.OooO00o) != 0;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public BigInteger OooO00o() {
        return new BigInteger(1, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        iii1.OooO00o(2, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17646OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public boolean OooO00o(AbstractC6122iIlLiL iillil) {
        if (!(iillil instanceof C6513lIiI)) {
            return false;
        }
        return C9586iIILl.m21627OooO00o(this.OooO00o, ((C6513lIiI) iillil).OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return L1li1.OooO00o(this.OooO00o.length) + 1 + this.OooO00o.length;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m17647OooO0O0() {
        return new BigInteger(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL
    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.OooO00o;
            if (i == bArr.length) {
                return i2;
            }
            i2 ^= (bArr[i] & 255) << (i % 4);
            i++;
        }
    }

    public String toString() {
        return m17647OooO0O0().toString();
    }
}
