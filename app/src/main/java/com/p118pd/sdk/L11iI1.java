package com.p118pd.sdk;

import java.math.BigInteger;
import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.L11iI1 */
public class L11iI1 implements lL1I1i {
    public static final BigInteger OooO00o = BigInteger.valueOf(2147483647L);
    public static final BigInteger OooO0O0 = BigInteger.valueOf(2);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f16146OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6769llL1L f16147OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16148OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f16149OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f16150OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f16151OooO0OO;
    public byte[] OooO0Oo;

    public L11iI1(AbstractC6769llL1L lll1l) {
        this.f16147OooO00o = lll1l;
        int OooO00o2 = lll1l.OooO00o();
        this.f16146OooO00o = OooO00o2;
        this.OooO0Oo = new byte[OooO00o2];
    }

    @Override // com.p118pd.sdk.lL1I1i
    private void OooO00o() {
        int i = (this.OooO0OO / this.f16146OooO00o) + 1;
        byte[] bArr = this.f16151OooO0OO;
        int length = bArr.length;
        if (length != 1) {
            if (length != 2) {
                if (length != 3) {
                    if (length == 4) {
                        bArr[0] = (byte) (i >>> 24);
                    } else {
                        throw new IllegalStateException("Unsupported size of counter i");
                    }
                }
                byte[] bArr2 = this.f16151OooO0OO;
                bArr2[bArr2.length - 3] = (byte) (i >>> 16);
            }
            byte[] bArr3 = this.f16151OooO0OO;
            bArr3[bArr3.length - 2] = (byte) (i >>> 8);
        }
        byte[] bArr4 = this.f16151OooO0OO;
        bArr4[bArr4.length - 1] = (byte) i;
        AbstractC6769llL1L lll1l = this.f16147OooO00o;
        byte[] bArr5 = this.f16148OooO00o;
        lll1l.update(bArr5, 0, bArr5.length);
        AbstractC6769llL1L lll1l2 = this.f16147OooO00o;
        byte[] bArr6 = this.f16151OooO0OO;
        lll1l2.update(bArr6, 0, bArr6.length);
        AbstractC6769llL1L lll1l3 = this.f16147OooO00o;
        byte[] bArr7 = this.f16150OooO0O0;
        lll1l3.update(bArr7, 0, bArr7.length);
        this.f16147OooO00o.OooO00o(this.OooO0Oo, 0);
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public int OooO00o(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = this.OooO0OO;
        int i4 = i3 + i2;
        if (i4 < 0 || i4 >= this.f16149OooO0O0) {
            throw new DataLengthException("Current KDFCTR may only be used for " + this.f16149OooO0O0 + " bytes");
        }
        if (i3 % this.f16146OooO00o == 0) {
            OooO00o();
        }
        int i5 = this.OooO0OO;
        int i6 = this.f16146OooO00o;
        int i7 = i5 % i6;
        int min = Math.min(i6 - (i5 % i6), i2);
        System.arraycopy(this.OooO0Oo, i7, bArr, i, min);
        this.OooO0OO += min;
        int i8 = i2 - min;
        while (true) {
            i += min;
            if (i8 <= 0) {
                return i2;
            }
            OooO00o();
            min = Math.min(this.f16146OooO00o, i8);
            System.arraycopy(this.OooO0Oo, 0, bArr, i, min);
            this.OooO0OO += min;
            i8 -= min;
        }
    }

    @Override // com.p118pd.sdk.lL1I1i
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6769llL1L m15886OooO00o() {
        return this.f16147OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public void OooO00o(AbstractC93201li r4) {
        if (r4 instanceof C5694LLi) {
            C5694LLi r42 = (C5694LLi) r4;
            this.f16147OooO00o.OooO00o(new C6642li1LI(r42.OooO0Oo()));
            this.f16148OooO00o = r42.OooO0O0();
            this.f16150OooO0O0 = r42.OooO0OO();
            int OooO00o2 = r42.OooO00o();
            this.f16151OooO0OO = new byte[(OooO00o2 / 8)];
            BigInteger multiply = OooO0O0.pow(OooO00o2).multiply(BigInteger.valueOf((long) this.f16146OooO00o));
            this.f16149OooO0O0 = multiply.compareTo(OooO00o) == 1 ? Integer.MAX_VALUE : multiply.intValue();
            this.OooO0OO = 0;
            return;
        }
        throw new IllegalArgumentException("Wrong type of arguments given");
    }
}
