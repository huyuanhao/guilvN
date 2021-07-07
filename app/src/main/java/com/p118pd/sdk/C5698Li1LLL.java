package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.Li1LL丨L  reason: invalid class name and case insensitive filesystem */
public class C5698Li1LLL extends AbstractC9563i1I {
    public static final int OooO0o = 16843009;
    public static final int OooO0o0 = 16843012;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16569OooO00o = true;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16570OooO00o;
    public final int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final li1l11I1 f16571OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f16572OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f16573OooO0OO;
    public int OooO0Oo;

    public C5698Li1LLL(li1l11I1 li1l11i1) {
        super(li1l11i1);
        this.f16571OooO0O0 = li1l11i1;
        int OooO00o2 = li1l11i1.OooO00o();
        this.OooO0O0 = OooO00o2;
        if (OooO00o2 == 8) {
            this.f16570OooO00o = new byte[li1l11i1.OooO00o()];
            this.f16572OooO0O0 = new byte[li1l11i1.OooO00o()];
            this.f16573OooO0OO = new byte[li1l11i1.OooO00o()];
            return;
        }
        throw new IllegalArgumentException("GCTR only for 64 bit block ciphers");
    }

    private int OooO00o(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & -16777216) + ((bArr[i + 2] << 16) & C7265o0O000oo.OooOo0O) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    private void OooO00o(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >>> 24);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2] = (byte) i;
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        OooO00o(bArr, i, this.OooO0O0, bArr2, i2);
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16293OooO00o() {
        return this.f16571OooO0O0.m17732OooO00o() + "/GCTR";
    }

    @Override // com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r8) throws IllegalArgumentException {
        li1l11I1 li1l11i1;
        this.f16569OooO00o = true;
        this.OooO0OO = 0;
        this.OooO0Oo = 0;
        if (r8 instanceof C6274iilL1L) {
            C6274iilL1L r82 = (C6274iilL1L) r8;
            byte[] OooO00o2 = r82.m17301OooO00o();
            int length = OooO00o2.length;
            byte[] bArr = this.f16570OooO00o;
            if (length < bArr.length) {
                System.arraycopy(OooO00o2, 0, bArr, bArr.length - OooO00o2.length, OooO00o2.length);
                int i = 0;
                while (true) {
                    byte[] bArr2 = this.f16570OooO00o;
                    if (i >= bArr2.length - OooO00o2.length) {
                        break;
                    }
                    bArr2[i] = 0;
                    i++;
                }
            } else {
                System.arraycopy(OooO00o2, 0, bArr, 0, bArr.length);
            }
            reset();
            if (r82.OooO00o() != null) {
                li1l11i1 = this.f16571OooO0O0;
                r8 = r82.OooO00o();
            } else {
                return;
            }
        } else {
            reset();
            if (r8 != null) {
                li1l11i1 = this.f16571OooO0O0;
            } else {
                return;
            }
        }
        li1l11i1.OooO00o(true, r8);
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I
    public byte OooO0O0(byte b) {
        if (this.OooO00o == 0) {
            if (this.f16569OooO00o) {
                this.f16569OooO00o = false;
                this.f16571OooO0O0.OooO00o(this.f16572OooO0O0, 0, this.f16573OooO0OO, 0);
                this.OooO0OO = OooO00o(this.f16573OooO0OO, 0);
                this.OooO0Oo = OooO00o(this.f16573OooO0OO, 4);
            }
            this.OooO0OO += 16843009;
            int i = this.OooO0Oo + OooO0o0;
            this.OooO0Oo = i;
            if (i < 16843012 && i > 0) {
                this.OooO0Oo = i + 1;
            }
            OooO00o(this.OooO0OO, this.f16572OooO0O0, 0);
            OooO00o(this.OooO0Oo, this.f16572OooO0O0, 4);
            this.f16571OooO0O0.OooO00o(this.f16572OooO0O0, 0, this.f16573OooO0OO, 0);
        }
        byte[] bArr = this.f16573OooO0OO;
        int i2 = this.OooO00o;
        int i3 = i2 + 1;
        this.OooO00o = i3;
        byte b2 = (byte) (b ^ bArr[i2]);
        int i4 = this.OooO0O0;
        if (i3 == i4) {
            this.OooO00o = 0;
            byte[] bArr2 = this.f16572OooO0O0;
            System.arraycopy(bArr2, i4, bArr2, 0, bArr2.length - i4);
            byte[] bArr3 = this.f16573OooO0OO;
            byte[] bArr4 = this.f16572OooO0O0;
            int length = bArr4.length;
            int i5 = this.OooO0O0;
            System.arraycopy(bArr3, 0, bArr4, length - i5, i5);
        }
        return b2;
    }

    @Override // com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1
    public void reset() {
        this.f16569OooO00o = true;
        this.OooO0OO = 0;
        this.OooO0Oo = 0;
        byte[] bArr = this.f16570OooO00o;
        System.arraycopy(bArr, 0, this.f16572OooO0O0, 0, bArr.length);
        this.OooO00o = 0;
        this.f16571OooO0O0.reset();
    }
}
