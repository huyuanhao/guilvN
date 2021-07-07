package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.丨Ii1丨IL  reason: invalid class name and case insensitive filesystem */
public class C9373Ii1IL implements AbstractC6477lI1I {
    public static final BigInteger OooO0O0 = BigInteger.valueOf(0);
    public final C6383iLl1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f22918OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f22919OooO00o = new byte[this.OooO00o.OooO00o()];

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final byte[] f22920OooO0O0;

    public C9373Ii1IL(AbstractC6436l11LI r2) {
        C6383iLl1 r0 = new C6383iLl1(r2);
        this.OooO00o = r0;
        this.f22920OooO0O0 = new byte[r0.OooO00o()];
    }

    private BigInteger OooO00o(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        return bArr.length * 8 > this.f22918OooO00o.bitLength() ? bigInteger.shiftRight((bArr.length * 8) - this.f22918OooO00o.bitLength()) : bigInteger;
    }

    @Override // com.p118pd.sdk.AbstractC6477lI1I, com.p118pd.sdk.AbstractC6477lI1I
    public BigInteger OooO00o() {
        int bitLength = (this.f22918OooO00o.bitLength() + 7) / 8;
        byte[] bArr = new byte[bitLength];
        while (true) {
            int i = 0;
            while (i < bitLength) {
                C6383iLl1 r4 = this.OooO00o;
                byte[] bArr2 = this.f22920OooO0O0;
                r4.update(bArr2, 0, bArr2.length);
                this.OooO00o.OooO00o(this.f22920OooO0O0, 0);
                int min = Math.min(bitLength - i, this.f22920OooO0O0.length);
                System.arraycopy(this.f22920OooO0O0, 0, bArr, i, min);
                i += min;
            }
            BigInteger OooO00o2 = OooO00o(bArr);
            if (OooO00o2.compareTo(OooO0O0) > 0 && OooO00o2.compareTo(this.f22918OooO00o) < 0) {
                return OooO00o2;
            }
            C6383iLl1 r3 = this.OooO00o;
            byte[] bArr3 = this.f22920OooO0O0;
            r3.update(bArr3, 0, bArr3.length);
            this.OooO00o.update((byte) 0);
            this.OooO00o.OooO00o(this.f22919OooO00o, 0);
            this.OooO00o.OooO00o(new C6642li1LI(this.f22919OooO00o));
            C6383iLl1 r32 = this.OooO00o;
            byte[] bArr4 = this.f22920OooO0O0;
            r32.update(bArr4, 0, bArr4.length);
            this.OooO00o.OooO00o(this.f22920OooO0O0, 0);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6477lI1I
    public void OooO00o(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f22918OooO00o = bigInteger;
        C9586iIILl.OooO00o(this.f22920OooO0O0, (byte) 1);
        C9586iIILl.OooO00o(this.f22919OooO00o, (byte) 0);
        int bitLength = (bigInteger.bitLength() + 7) / 8;
        byte[] bArr2 = new byte[bitLength];
        byte[] OooO00o2 = IIiL.OooO00o(bigInteger2);
        System.arraycopy(OooO00o2, 0, bArr2, bitLength - OooO00o2.length, OooO00o2.length);
        int bitLength2 = (bigInteger.bitLength() + 7) / 8;
        byte[] bArr3 = new byte[bitLength2];
        BigInteger OooO00o3 = OooO00o(bArr);
        if (OooO00o3.compareTo(bigInteger) >= 0) {
            OooO00o3 = OooO00o3.subtract(bigInteger);
        }
        byte[] OooO00o4 = IIiL.OooO00o(OooO00o3);
        System.arraycopy(OooO00o4, 0, bArr3, bitLength2 - OooO00o4.length, OooO00o4.length);
        this.OooO00o.OooO00o(new C6642li1LI(this.f22919OooO00o));
        C6383iLl1 r7 = this.OooO00o;
        byte[] bArr4 = this.f22920OooO0O0;
        r7.update(bArr4, 0, bArr4.length);
        this.OooO00o.update((byte) 0);
        this.OooO00o.update(bArr2, 0, bitLength);
        this.OooO00o.update(bArr3, 0, bitLength2);
        this.OooO00o.OooO00o(this.f22919OooO00o, 0);
        this.OooO00o.OooO00o(new C6642li1LI(this.f22919OooO00o));
        C6383iLl1 r72 = this.OooO00o;
        byte[] bArr5 = this.f22920OooO0O0;
        r72.update(bArr5, 0, bArr5.length);
        this.OooO00o.OooO00o(this.f22920OooO0O0, 0);
        C6383iLl1 r73 = this.OooO00o;
        byte[] bArr6 = this.f22920OooO0O0;
        r73.update(bArr6, 0, bArr6.length);
        this.OooO00o.update((byte) 1);
        this.OooO00o.update(bArr2, 0, bitLength);
        this.OooO00o.update(bArr3, 0, bitLength2);
        this.OooO00o.OooO00o(this.f22919OooO00o, 0);
        this.OooO00o.OooO00o(new C6642li1LI(this.f22919OooO00o));
        C6383iLl1 r74 = this.OooO00o;
        byte[] bArr7 = this.f22920OooO0O0;
        r74.update(bArr7, 0, bArr7.length);
        this.OooO00o.OooO00o(this.f22920OooO0O0, 0);
    }

    @Override // com.p118pd.sdk.AbstractC6477lI1I
    public void OooO00o(BigInteger bigInteger, SecureRandom secureRandom) {
        throw new IllegalStateException("Operation not supported");
    }

    @Override // com.p118pd.sdk.AbstractC6477lI1I, com.p118pd.sdk.AbstractC6477lI1I
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21445OooO00o() {
        return true;
    }
}
