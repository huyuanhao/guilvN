package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.iIi11II */
public class iIi11II extends AbstractC9563i1I {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17539OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17540OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public li1l11I1 f17541OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f17542OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f17543OooO0OO;

    public iIi11II(li1l11I1 li1l11i1) {
        super(li1l11i1);
        int OooO00o2 = li1l11i1.OooO00o();
        this.OooO0O0 = OooO00o2;
        this.f17541OooO0O0 = li1l11i1;
        this.f17543OooO0OO = new byte[OooO00o2];
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    private void OooO00o() {
        byte[] OooO00o2 = C6517lIl1l.OooO00o(this.f17540OooO00o, this.OooO00o - this.OooO0O0);
        System.arraycopy(OooO00o2, 0, this.f17540OooO00o, 0, OooO00o2.length);
        System.arraycopy(this.f17543OooO0OO, 0, this.f17540OooO00o, OooO00o2.length, this.OooO00o - OooO00o2.length);
    }

    private void OooO0O0() {
        this.f17541OooO0O0.OooO00o(C6517lIl1l.OooO0O0(this.f17540OooO00o, this.OooO0O0), 0, this.f17543OooO0OO, 0);
    }

    private void OooO0OO() {
        int i = this.OooO00o;
        this.f17540OooO00o = new byte[i];
        this.f17542OooO0O0 = new byte[i];
    }

    private void OooO0Oo() {
        this.OooO00o = this.OooO0O0 * 2;
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m16967OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        OooO00o(bArr, i, this.OooO0O0, bArr2, i2);
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16968OooO00o() {
        return this.f17541OooO0O0.m17732OooO00o() + "/OFB";
    }

    @Override // com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r6) throws IllegalArgumentException {
        li1l11I1 li1l11i1;
        if (r6 instanceof C6274iilL1L) {
            C6274iilL1L r62 = (C6274iilL1L) r6;
            byte[] OooO00o2 = r62.m17301OooO00o();
            if (OooO00o2.length >= this.OooO0O0) {
                this.OooO00o = OooO00o2.length;
                OooO0OO();
                byte[] OooO00o3 = C9586iIILl.m21630OooO00o(OooO00o2);
                this.f17542OooO0O0 = OooO00o3;
                System.arraycopy(OooO00o3, 0, this.f17540OooO00o, 0, OooO00o3.length);
                if (r62.OooO00o() != null) {
                    li1l11i1 = this.f17541OooO0O0;
                    r6 = r62.OooO00o();
                }
                this.f17539OooO00o = true;
            }
            throw new IllegalArgumentException("Parameter m must blockSize <= m");
        }
        OooO0Oo();
        OooO0OO();
        byte[] bArr = this.f17542OooO0O0;
        System.arraycopy(bArr, 0, this.f17540OooO00o, 0, bArr.length);
        if (r6 != null) {
            li1l11i1 = this.f17541OooO0O0;
        }
        this.f17539OooO00o = true;
        li1l11i1.OooO00o(true, r6);
        this.f17539OooO00o = true;
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I
    public byte OooO0O0(byte b) {
        if (this.OooO0OO == 0) {
            OooO0O0();
        }
        byte[] bArr = this.f17543OooO0OO;
        int i = this.OooO0OO;
        byte b2 = (byte) (b ^ bArr[i]);
        int i2 = i + 1;
        this.OooO0OO = i2;
        if (i2 == m16967OooO00o()) {
            this.OooO0OO = 0;
            OooO00o();
        }
        return b2;
    }

    @Override // com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1
    public void reset() {
        if (this.f17539OooO00o) {
            byte[] bArr = this.f17542OooO0O0;
            System.arraycopy(bArr, 0, this.f17540OooO00o, 0, bArr.length);
            C9586iIILl.m21625OooO00o(this.f17543OooO0OO);
            this.OooO0OO = 0;
            this.f17541OooO0O0.reset();
        }
    }
}
