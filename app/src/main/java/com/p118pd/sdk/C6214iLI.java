package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iL丨丨I  reason: invalid class name and case insensitive filesystem */
public class C6214iLI extends L1LL111 {
    public Ll111 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f17827OooO00o;

    public C6214iLI(Ll111 ll111, byte[] bArr) {
        this.OooO00o = new Ll111(ll111);
        int i = 8;
        int i2 = 1;
        while (ll111.OooO00o() > i) {
            i2++;
            i += 8;
        }
        if (bArr.length % i2 == 0) {
            int length = bArr.length / i2;
            ((L1LL111) this).OooO00o = length;
            this.f17827OooO00o = new int[length];
            int i3 = 0;
            for (int i4 = 0; i4 < this.f17827OooO00o.length; i4++) {
                int i5 = 0;
                while (i5 < i) {
                    int[] iArr = this.f17827OooO00o;
                    iArr[i4] = ((bArr[i3] & 255) << i5) | iArr[i4];
                    i5 += 8;
                    i3++;
                }
                if (!ll111.m16357OooO00o(this.f17827OooO00o[i4])) {
                    throw new IllegalArgumentException("Byte array is not an encoded vector over the given finite field.");
                }
            }
            return;
        }
        throw new IllegalArgumentException("Byte array is not an encoded vector over the given finite field.");
    }

    public C6214iLI(Ll111 ll111, int[] iArr) {
        this.OooO00o = ll111;
        ((L1LL111) this).OooO00o = iArr.length;
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (!ll111.m16357OooO00o(iArr[length])) {
                throw new ArithmeticException("Element array is not specified over the given finite field.");
            }
        }
        this.f17827OooO00o = lllILI.m17914OooO00o(iArr);
    }

    public C6214iLI(C6214iLI r3) {
        this.OooO00o = new Ll111(r3.OooO00o);
        ((L1LL111) this).OooO00o = ((L1LL111) r3).OooO00o;
        this.f17827OooO00o = lllILI.m17914OooO00o(r3.f17827OooO00o);
    }

    @Override // com.p118pd.sdk.L1LL111
    public L1LL111 OooO00o(L1LL111 l1ll111) {
        throw new RuntimeException("not implemented");
    }

    @Override // com.p118pd.sdk.L1LL111
    public L1LL111 OooO00o(C6051i1lli i1lli) {
        int[] OooO00o2 = i1lli.m16915OooO00o();
        int i = ((L1LL111) this).OooO00o;
        if (i == OooO00o2.length) {
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < OooO00o2.length; i2++) {
                iArr[i2] = this.f17827OooO00o[OooO00o2[i2]];
            }
            return new C6214iLI(this.OooO00o, iArr);
        }
        throw new ArithmeticException("permutation size and vector size mismatch");
    }

    @Override // com.p118pd.sdk.L1LL111, com.p118pd.sdk.L1LL111, com.p118pd.sdk.L1LL111
    public Ll111 OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.L1LL111, com.p118pd.sdk.L1LL111, com.p118pd.sdk.L1LL111
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17196OooO00o() {
        for (int length = this.f17827OooO00o.length - 1; length >= 0; length--) {
            if (this.f17827OooO00o[length] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p118pd.sdk.L1LL111, com.p118pd.sdk.L1LL111, com.p118pd.sdk.L1LL111
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17197OooO00o() {
        int i = 8;
        int i2 = 1;
        while (this.OooO00o.OooO00o() > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[(this.f17827OooO00o.length * i2)];
        int i3 = 0;
        for (int i4 = 0; i4 < this.f17827OooO00o.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                bArr[i3] = (byte) (this.f17827OooO00o[i4] >>> i5);
                i5 += 8;
                i3++;
            }
        }
        return bArr;
    }

    @Override // com.p118pd.sdk.L1LL111, com.p118pd.sdk.L1LL111, com.p118pd.sdk.L1LL111
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m17198OooO00o() {
        return lllILI.m17914OooO00o(this.f17827OooO00o);
    }

    @Override // com.p118pd.sdk.L1LL111
    public boolean equals(Object obj) {
        if (!(obj instanceof C6214iLI)) {
            return false;
        }
        C6214iLI r4 = (C6214iLI) obj;
        if (!this.OooO00o.equals(r4.OooO00o)) {
            return false;
        }
        return lllILI.OooO00o(this.f17827OooO00o, r4.f17827OooO00o);
    }

    @Override // com.p118pd.sdk.L1LL111
    public int hashCode() {
        return (this.OooO00o.hashCode() * 31) + this.f17827OooO00o.hashCode();
    }

    @Override // com.p118pd.sdk.L1LL111
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.f17827OooO00o.length; i++) {
            for (int i2 = 0; i2 < this.OooO00o.OooO00o(); i2++) {
                stringBuffer.append(((1 << (i2 & 31)) & this.f17827OooO00o[i]) != 0 ? '1' : '0');
            }
            stringBuffer.append(' ');
        }
        return stringBuffer.toString();
    }
}
