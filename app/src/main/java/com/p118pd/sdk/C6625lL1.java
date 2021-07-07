package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.lL丨1  reason: invalid class name and case insensitive filesystem */
public class C6625lL1 extends AbstractC9563i1I {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18560OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18561OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public li1l11I1 f18562OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f18563OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f18564OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f18565OooO0OO;
    public int OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public byte[] f18566OooO0Oo;

    public C6625lL1(li1l11I1 li1l11i1) {
        this(li1l11i1, li1l11i1.OooO00o() * 8);
    }

    public C6625lL1(li1l11I1 li1l11i1, int i) {
        super(li1l11i1);
        this.f18563OooO0O0 = false;
        if (i < 0 || i > li1l11i1.OooO00o() * 8) {
            throw new IllegalArgumentException("Parameter bitBlockSize must be in range 0 < bitBlockSize <= " + (li1l11i1.OooO00o() * 8));
        }
        this.OooO0OO = li1l11i1.OooO00o();
        this.f18562OooO0O0 = li1l11i1;
        this.OooO00o = i / 8;
        this.f18566OooO0Oo = new byte[m17711OooO00o()];
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    private void OooO00o() {
        int i = this.OooO0O0;
        this.f18561OooO00o = new byte[i];
        this.f18564OooO0O0 = new byte[i];
    }

    private void OooO0O0() {
        this.OooO0O0 = this.OooO0OO * 2;
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m17711OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        OooO00o(bArr, i, m17711OooO00o(), bArr2, i2);
        return m17711OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17712OooO00o() {
        return this.f18562OooO0O0.m17732OooO00o() + "/CFB" + (this.OooO0OO * 8);
    }

    @Override // com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r6) throws IllegalArgumentException {
        li1l11I1 li1l11i1;
        this.f18560OooO00o = z;
        if (r6 instanceof C6274iilL1L) {
            C6274iilL1L r62 = (C6274iilL1L) r6;
            byte[] OooO00o2 = r62.m17301OooO00o();
            if (OooO00o2.length >= this.OooO0OO) {
                this.OooO0O0 = OooO00o2.length;
                OooO00o();
                byte[] OooO00o3 = C9586iIILl.m21630OooO00o(OooO00o2);
                this.f18564OooO0O0 = OooO00o3;
                System.arraycopy(OooO00o3, 0, this.f18561OooO00o, 0, OooO00o3.length);
                if (r62.OooO00o() != null) {
                    li1l11i1 = this.f18562OooO0O0;
                    r6 = r62.OooO00o();
                }
                this.f18563OooO0O0 = true;
            }
            throw new IllegalArgumentException("Parameter m must blockSize <= m");
        }
        OooO0O0();
        OooO00o();
        byte[] bArr = this.f18564OooO0O0;
        System.arraycopy(bArr, 0, this.f18561OooO00o, 0, bArr.length);
        if (r6 != null) {
            li1l11i1 = this.f18562OooO0O0;
        }
        this.f18563OooO0O0 = true;
        li1l11i1.OooO00o(true, r6);
        this.f18563OooO0O0 = true;
    }

    public void OooO00o(byte[] bArr) {
        byte[] OooO00o2 = C6517lIl1l.OooO00o(this.f18561OooO00o, this.OooO0O0 - this.OooO00o);
        System.arraycopy(OooO00o2, 0, this.f18561OooO00o, 0, OooO00o2.length);
        System.arraycopy(bArr, 0, this.f18561OooO00o, OooO00o2.length, this.OooO0O0 - OooO00o2.length);
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17713OooO00o() {
        byte[] OooO0O02 = C6517lIl1l.OooO0O0(this.f18561OooO00o, this.OooO0OO);
        byte[] bArr = new byte[OooO0O02.length];
        this.f18562OooO0O0.OooO00o(OooO0O02, 0, bArr, 0);
        return C6517lIl1l.OooO0O0(bArr, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I
    public byte OooO0O0(byte b) {
        if (this.OooO0Oo == 0) {
            this.f18565OooO0OO = m17713OooO00o();
        }
        byte[] bArr = this.f18565OooO0OO;
        int i = this.OooO0Oo;
        byte b2 = (byte) (bArr[i] ^ b);
        byte[] bArr2 = this.f18566OooO0Oo;
        this.OooO0Oo = i + 1;
        if (this.f18560OooO00o) {
            b = b2;
        }
        bArr2[i] = b;
        if (this.OooO0Oo == m17711OooO00o()) {
            this.OooO0Oo = 0;
            OooO00o(this.f18566OooO0Oo);
        }
        return b2;
    }

    @Override // com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1
    public void reset() {
        this.OooO0Oo = 0;
        C9586iIILl.m21625OooO00o(this.f18566OooO0Oo);
        C9586iIILl.m21625OooO00o(this.f18565OooO0OO);
        if (this.f18563OooO0O0) {
            byte[] bArr = this.f18564OooO0O0;
            System.arraycopy(bArr, 0, this.f18561OooO00o, 0, bArr.length);
            this.f18562OooO0O0.reset();
        }
    }
}
