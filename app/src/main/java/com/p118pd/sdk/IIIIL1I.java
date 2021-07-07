package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.IIIIL1I丨  reason: invalid class name */
public class IIIIL1I extends AbstractC9563i1I {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f15461OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15462OooO00o;
    public final int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final li1l11I1 f15463OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f15464OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f15465OooO0OO;

    public IIIIL1I(li1l11I1 li1l11i1) {
        this(li1l11i1, li1l11i1.OooO00o() * 8);
    }

    public IIIIL1I(li1l11I1 li1l11i1, int i) {
        super(li1l11i1);
        this.OooO0OO = 0;
        if (i < 0 || i > li1l11i1.OooO00o() * 8) {
            throw new IllegalArgumentException("Parameter bitBlockSize must be in range 0 < bitBlockSize <= " + (li1l11i1.OooO00o() * 8));
        }
        this.f15463OooO0O0 = li1l11i1;
        int OooO00o2 = li1l11i1.OooO00o();
        this.OooO0O0 = OooO00o2;
        this.OooO00o = i / 8;
        this.f15462OooO00o = new byte[OooO00o2];
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    private void OooO00o() {
        byte[] bArr = this.f15462OooO00o;
        int length = bArr.length - 1;
        bArr[length] = (byte) (bArr[length] + 1);
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    private byte[] m15369OooO00o() {
        byte[] bArr = this.f15462OooO00o;
        byte[] bArr2 = new byte[bArr.length];
        this.f15463OooO0O0.OooO00o(bArr, 0, bArr2, 0);
        return C6517lIl1l.OooO0O0(bArr2, this.OooO00o);
    }

    private void OooO0O0() {
        int i = this.OooO0O0;
        this.f15464OooO0O0 = new byte[(i / 2)];
        this.f15462OooO00o = new byte[i];
        this.f15465OooO0OO = new byte[this.OooO00o];
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m15370OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        OooO00o(bArr, i, this.OooO00o, bArr2, i2);
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15371OooO00o() {
        return this.f15463OooO0O0.m17732OooO00o() + "/GCTR";
    }

    @Override // com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r6) throws IllegalArgumentException {
        li1l11I1 li1l11i1;
        if (r6 instanceof C6274iilL1L) {
            C6274iilL1L r62 = (C6274iilL1L) r6;
            OooO0O0();
            byte[] OooO00o2 = C9586iIILl.m21630OooO00o(r62.m17301OooO00o());
            this.f15464OooO0O0 = OooO00o2;
            if (OooO00o2.length == this.OooO0O0 / 2) {
                System.arraycopy(OooO00o2, 0, this.f15462OooO00o, 0, OooO00o2.length);
                for (int length = this.f15464OooO0O0.length; length < this.OooO0O0; length++) {
                    this.f15462OooO00o[length] = 0;
                }
                if (r62.OooO00o() != null) {
                    li1l11i1 = this.f15463OooO0O0;
                    r6 = r62.OooO00o();
                }
                this.f15461OooO00o = true;
            }
            throw new IllegalArgumentException("Parameter IV length must be == blockSize/2");
        }
        OooO0O0();
        if (r6 != null) {
            li1l11i1 = this.f15463OooO0O0;
        }
        this.f15461OooO00o = true;
        li1l11i1.OooO00o(true, r6);
        this.f15461OooO00o = true;
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I
    public byte OooO0O0(byte b) {
        if (this.OooO0OO == 0) {
            this.f15465OooO0OO = m15369OooO00o();
        }
        byte[] bArr = this.f15465OooO0OO;
        int i = this.OooO0OO;
        byte b2 = (byte) (b ^ bArr[i]);
        int i2 = i + 1;
        this.OooO0OO = i2;
        if (i2 == this.OooO00o) {
            this.OooO0OO = 0;
            OooO00o();
        }
        return b2;
    }

    @Override // com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1
    public void reset() {
        if (this.f15461OooO00o) {
            byte[] bArr = this.f15464OooO0O0;
            System.arraycopy(bArr, 0, this.f15462OooO00o, 0, bArr.length);
            for (int length = this.f15464OooO0O0.length; length < this.OooO0O0; length++) {
                this.f15462OooO00o[length] = 0;
            }
            this.OooO0OO = 0;
            this.f15463OooO0O0.reset();
        }
    }
}
