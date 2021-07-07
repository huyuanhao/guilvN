package com.p118pd.sdk;

import java.math.BigInteger;
import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.I1ilL丨  reason: invalid class name and case insensitive filesystem */
public class C5182I1ilL implements lL1I1i {
    public static final BigInteger OooO00o = BigInteger.valueOf(2147483647L);
    public static final BigInteger OooO0O0 = BigInteger.valueOf(2);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f15389OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6769llL1L f15390OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f15391OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15392OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f15393OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f15394OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f15395OooO0OO;
    public byte[] OooO0Oo;

    public C5182I1ilL(AbstractC6769llL1L lll1l) {
        this.f15390OooO00o = lll1l;
        int OooO00o2 = lll1l.OooO00o();
        this.f15389OooO00o = OooO00o2;
        this.OooO0Oo = new byte[OooO00o2];
    }

    @Override // com.p118pd.sdk.lL1I1i
    private void OooO00o() {
        if (this.OooO0OO == 0) {
            AbstractC6769llL1L lll1l = this.f15390OooO00o;
            byte[] bArr = this.f15395OooO0OO;
            lll1l.update(bArr, 0, bArr.length);
        } else {
            AbstractC6769llL1L lll1l2 = this.f15390OooO00o;
            byte[] bArr2 = this.OooO0Oo;
            lll1l2.update(bArr2, 0, bArr2.length);
        }
        if (this.f15391OooO00o) {
            int i = (this.OooO0OO / this.f15389OooO00o) + 1;
            byte[] bArr3 = this.f15394OooO0O0;
            int length = bArr3.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length == 4) {
                            bArr3[0] = (byte) (i >>> 24);
                        } else {
                            throw new IllegalStateException("Unsupported size of counter i");
                        }
                    }
                    byte[] bArr4 = this.f15394OooO0O0;
                    bArr4[bArr4.length - 3] = (byte) (i >>> 16);
                }
                byte[] bArr5 = this.f15394OooO0O0;
                bArr5[bArr5.length - 2] = (byte) (i >>> 8);
            }
            byte[] bArr6 = this.f15394OooO0O0;
            bArr6[bArr6.length - 1] = (byte) i;
            this.f15390OooO00o.update(bArr6, 0, bArr6.length);
        }
        AbstractC6769llL1L lll1l3 = this.f15390OooO00o;
        byte[] bArr7 = this.f15392OooO00o;
        lll1l3.update(bArr7, 0, bArr7.length);
        this.f15390OooO00o.OooO00o(this.OooO0Oo, 0);
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public int OooO00o(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = this.OooO0OO;
        int i4 = i3 + i2;
        if (i4 < 0 || i4 >= this.f15393OooO0O0) {
            throw new DataLengthException("Current KDFCTR may only be used for " + this.f15393OooO0O0 + " bytes");
        }
        if (i3 % this.f15389OooO00o == 0) {
            OooO00o();
        }
        int i5 = this.OooO0OO;
        int i6 = this.f15389OooO00o;
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
            min = Math.min(this.f15389OooO00o, i8);
            System.arraycopy(this.OooO0Oo, 0, bArr, i, min);
            this.OooO0OO += min;
            i8 -= min;
        }
    }

    @Override // com.p118pd.sdk.lL1I1i
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6769llL1L m15301OooO00o() {
        return this.f15390OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public void OooO00o(AbstractC93201li r6) {
        if (r6 instanceof C6460l1lLii) {
            C6460l1lLii l1llii = (C6460l1lLii) r6;
            this.f15390OooO00o.OooO00o(new C6642li1LI(l1llii.OooO0OO()));
            this.f15392OooO00o = l1llii.m17595OooO00o();
            int OooO00o2 = l1llii.OooO00o();
            this.f15394OooO0O0 = new byte[(OooO00o2 / 8)];
            int i = Integer.MAX_VALUE;
            if (l1llii.m17594OooO00o()) {
                BigInteger multiply = OooO0O0.pow(OooO00o2).multiply(BigInteger.valueOf((long) this.f15389OooO00o));
                if (multiply.compareTo(OooO00o) != 1) {
                    i = multiply.intValue();
                }
            }
            this.f15393OooO0O0 = i;
            this.f15395OooO0OO = l1llii.OooO0O0();
            this.f15391OooO00o = l1llii.m17594OooO00o();
            this.OooO0OO = 0;
            return;
        }
        throw new IllegalArgumentException("Wrong type of arguments given");
    }
}
