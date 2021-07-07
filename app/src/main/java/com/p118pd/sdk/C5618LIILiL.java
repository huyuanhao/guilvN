package com.p118pd.sdk;

import java.math.BigInteger;
import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.LIILi丨L  reason: invalid class name and case insensitive filesystem */
public class C5618LIILiL implements lL1I1i {
    public static final BigInteger OooO00o = BigInteger.valueOf(2147483647L);
    public static final BigInteger OooO0O0 = BigInteger.valueOf(2);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f16282OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6769llL1L f16283OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16284OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16285OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f16286OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f16287OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f16288OooO0OO;
    public byte[] OooO0Oo;

    public C5618LIILiL(AbstractC6769llL1L lll1l) {
        this.f16283OooO00o = lll1l;
        int OooO00o2 = lll1l.OooO00o();
        this.f16282OooO00o = OooO00o2;
        this.f16288OooO0OO = new byte[OooO00o2];
        this.OooO0Oo = new byte[OooO00o2];
    }

    @Override // com.p118pd.sdk.lL1I1i
    private void OooO00o() {
        if (this.OooO0OO == 0) {
            AbstractC6769llL1L lll1l = this.f16283OooO00o;
            byte[] bArr = this.f16285OooO00o;
            lll1l.update(bArr, 0, bArr.length);
            this.f16283OooO00o.OooO00o(this.f16288OooO0OO, 0);
        } else {
            AbstractC6769llL1L lll1l2 = this.f16283OooO00o;
            byte[] bArr2 = this.f16288OooO0OO;
            lll1l2.update(bArr2, 0, bArr2.length);
            this.f16283OooO00o.OooO00o(this.f16288OooO0OO, 0);
        }
        AbstractC6769llL1L lll1l3 = this.f16283OooO00o;
        byte[] bArr3 = this.f16288OooO0OO;
        lll1l3.update(bArr3, 0, bArr3.length);
        if (this.f16284OooO00o) {
            int i = (this.OooO0OO / this.f16282OooO00o) + 1;
            byte[] bArr4 = this.f16287OooO0O0;
            int length = bArr4.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length == 4) {
                            bArr4[0] = (byte) (i >>> 24);
                        } else {
                            throw new IllegalStateException("Unsupported size of counter i");
                        }
                    }
                    byte[] bArr5 = this.f16287OooO0O0;
                    bArr5[bArr5.length - 3] = (byte) (i >>> 16);
                }
                byte[] bArr6 = this.f16287OooO0O0;
                bArr6[bArr6.length - 2] = (byte) (i >>> 8);
            }
            byte[] bArr7 = this.f16287OooO0O0;
            bArr7[bArr7.length - 1] = (byte) i;
            this.f16283OooO00o.update(bArr7, 0, bArr7.length);
        }
        AbstractC6769llL1L lll1l4 = this.f16283OooO00o;
        byte[] bArr8 = this.f16285OooO00o;
        lll1l4.update(bArr8, 0, bArr8.length);
        this.f16283OooO00o.OooO00o(this.OooO0Oo, 0);
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public int OooO00o(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = this.OooO0OO;
        int i4 = i3 + i2;
        if (i4 < 0 || i4 >= this.f16286OooO0O0) {
            throw new DataLengthException("Current KDFCTR may only be used for " + this.f16286OooO0O0 + " bytes");
        }
        if (i3 % this.f16282OooO00o == 0) {
            OooO00o();
        }
        int i5 = this.OooO0OO;
        int i6 = this.f16282OooO00o;
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
            min = Math.min(this.f16282OooO00o, i8);
            System.arraycopy(this.OooO0Oo, 0, bArr, i, min);
            this.OooO0OO += min;
            i8 -= min;
        }
    }

    @Override // com.p118pd.sdk.lL1I1i
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6769llL1L m16030OooO00o() {
        return this.f16283OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public void OooO00o(AbstractC93201li r6) {
        if (r6 instanceof C9526LlL) {
            C9526LlL r62 = (C9526LlL) r6;
            this.f16283OooO00o.OooO00o(new C6642li1LI(r62.OooO0O0()));
            this.f16285OooO00o = r62.m21586OooO00o();
            int OooO00o2 = r62.OooO00o();
            this.f16287OooO0O0 = new byte[(OooO00o2 / 8)];
            int i = Integer.MAX_VALUE;
            if (r62.m21585OooO00o()) {
                BigInteger multiply = OooO0O0.pow(OooO00o2).multiply(BigInteger.valueOf((long) this.f16282OooO00o));
                if (multiply.compareTo(OooO00o) != 1) {
                    i = multiply.intValue();
                }
            }
            this.f16286OooO0O0 = i;
            this.f16284OooO00o = r62.m21585OooO00o();
            this.OooO0OO = 0;
            return;
        }
        throw new IllegalArgumentException("Wrong type of arguments given");
    }
}
