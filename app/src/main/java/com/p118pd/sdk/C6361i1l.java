package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.i丨1l  reason: invalid class name and case insensitive filesystem */
public class C6361i1l implements li1l11I1 {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public li1l11I1 f18133OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18134OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18135OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f18136OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f18137OooO0O0;

    public C6361i1l(li1l11I1 li1l11i1) {
        this.OooO0O0 = li1l11i1.OooO00o();
        this.f18133OooO00o = li1l11i1;
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    private void OooO00o() {
        int i = this.OooO00o;
        this.f18135OooO00o = new byte[i];
        this.f18137OooO0O0 = new byte[i];
    }

    private void OooO00o(byte[] bArr) {
        byte[] OooO00o2 = C6517lIl1l.OooO00o(this.f18135OooO00o, this.OooO00o - this.OooO0O0);
        System.arraycopy(OooO00o2, 0, this.f18135OooO00o, 0, OooO00o2.length);
        System.arraycopy(bArr, 0, this.f18135OooO00o, OooO00o2.length, this.OooO00o - OooO00o2.length);
    }

    private int OooO0O0(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte[] OooO0O02 = C6517lIl1l.OooO0O0(this.f18135OooO00o, this.OooO0O0);
        byte[] OooO00o2 = C6517lIl1l.OooO00o(bArr, this.OooO0O0, i);
        byte[] bArr3 = new byte[OooO00o2.length];
        this.f18133OooO00o.OooO00o(OooO00o2, 0, bArr3, 0);
        byte[] OooO00o3 = C6517lIl1l.OooO00o(bArr3, OooO0O02);
        System.arraycopy(OooO00o3, 0, bArr2, i2, OooO00o3.length);
        if (bArr2.length > i2 + OooO00o3.length) {
            OooO00o(OooO00o2);
        }
        return OooO00o3.length;
    }

    private void OooO0O0() {
        this.OooO00o = this.OooO0O0;
    }

    private int OooO0OO(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte[] OooO00o2 = C6517lIl1l.OooO00o(C6517lIl1l.OooO00o(bArr, this.OooO0O0, i), C6517lIl1l.OooO0O0(this.f18135OooO00o, this.OooO0O0));
        int length = OooO00o2.length;
        byte[] bArr3 = new byte[length];
        this.f18133OooO00o.OooO00o(OooO00o2, 0, bArr3, 0);
        System.arraycopy(bArr3, 0, bArr2, i2, length);
        if (bArr2.length > i2 + OooO00o2.length) {
            OooO00o(bArr3);
        }
        return length;
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m17461OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        return this.f18136OooO0O0 ? OooO0OO(bArr, i, bArr2, i2) : OooO0O0(bArr, i, bArr2, i2);
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17462OooO00o() {
        return this.f18133OooO00o.m17732OooO00o() + "/CBC";
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r6) throws IllegalArgumentException {
        li1l11I1 li1l11i1;
        this.f18136OooO0O0 = z;
        if (r6 instanceof C6274iilL1L) {
            C6274iilL1L r62 = (C6274iilL1L) r6;
            byte[] OooO00o2 = r62.m17301OooO00o();
            if (OooO00o2.length >= this.OooO0O0) {
                this.OooO00o = OooO00o2.length;
                OooO00o();
                byte[] OooO00o3 = C9586iIILl.m21630OooO00o(OooO00o2);
                this.f18137OooO0O0 = OooO00o3;
                System.arraycopy(OooO00o3, 0, this.f18135OooO00o, 0, OooO00o3.length);
                if (r62.OooO00o() != null) {
                    li1l11i1 = this.f18133OooO00o;
                    r6 = r62.OooO00o();
                }
                this.f18134OooO00o = true;
            }
            throw new IllegalArgumentException("Parameter m must blockSize <= m");
        }
        OooO0O0();
        OooO00o();
        byte[] bArr = this.f18137OooO0O0;
        System.arraycopy(bArr, 0, this.f18135OooO00o, 0, bArr.length);
        if (r6 != null) {
            li1l11i1 = this.f18133OooO00o;
        }
        this.f18134OooO00o = true;
        li1l11i1.OooO00o(z, r6);
        this.f18134OooO00o = true;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void reset() {
        if (this.f18134OooO00o) {
            byte[] bArr = this.f18137OooO0O0;
            System.arraycopy(bArr, 0, this.f18135OooO00o, 0, bArr.length);
            this.f18133OooO00o.reset();
        }
    }
}
