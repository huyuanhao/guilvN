package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.l丨丨ll丨1  reason: invalid class name and case insensitive filesystem */
public class C6927lll1 implements li1l11I1 {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public li1l11I1 f19048OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f19049OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f19050OooO00o;
    public byte[] OooO0O0;
    public byte[] OooO0OO;

    public C6927lll1(li1l11I1 li1l11i1) {
        this.f19048OooO00o = li1l11i1;
        int OooO00o2 = li1l11i1.OooO00o();
        this.OooO00o = OooO00o2;
        this.f19050OooO00o = new byte[OooO00o2];
        this.OooO0O0 = new byte[OooO00o2];
        this.OooO0OO = new byte[OooO00o2];
    }

    private int OooO0O0(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        int i3 = this.OooO00o;
        if (i + i3 <= bArr.length) {
            System.arraycopy(bArr, i, this.OooO0OO, 0, i3);
            int OooO00o2 = this.f19048OooO00o.OooO00o(bArr, i, bArr2, i2);
            for (int i4 = 0; i4 < this.OooO00o; i4++) {
                int i5 = i2 + i4;
                bArr2[i5] = (byte) (bArr2[i5] ^ this.OooO0O0[i4]);
            }
            byte[] bArr3 = this.OooO0O0;
            this.OooO0O0 = this.OooO0OO;
            this.OooO0OO = bArr3;
            return OooO00o2;
        }
        throw new DataLengthException("input buffer too short");
    }

    private int OooO0OO(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        if (this.OooO00o + i <= bArr.length) {
            for (int i3 = 0; i3 < this.OooO00o; i3++) {
                byte[] bArr3 = this.OooO0O0;
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr[i + i3]);
            }
            int OooO00o2 = this.f19048OooO00o.OooO00o(this.OooO0O0, 0, bArr2, i2);
            byte[] bArr4 = this.OooO0O0;
            System.arraycopy(bArr2, i2, bArr4, 0, bArr4.length);
            return OooO00o2;
        }
        throw new DataLengthException("input buffer too short");
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return this.f19048OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        return this.f19049OooO00o ? OooO0OO(bArr, i, bArr2, i2) : OooO0O0(bArr, i, bArr2, i2);
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public li1l11I1 m18073OooO00o() {
        return this.f19048OooO00o;
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m18074OooO00o() {
        return this.f19048OooO00o.m17732OooO00o() + "/CBC";
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r8) throws IllegalArgumentException {
        li1l11I1 li1l11i1;
        boolean z2 = this.f19049OooO00o;
        this.f19049OooO00o = z;
        if (r8 instanceof C6274iilL1L) {
            C6274iilL1L r82 = (C6274iilL1L) r8;
            byte[] OooO00o2 = r82.m17301OooO00o();
            if (OooO00o2.length == this.OooO00o) {
                System.arraycopy(OooO00o2, 0, this.f19050OooO00o, 0, OooO00o2.length);
                reset();
                if (r82.OooO00o() != null) {
                    li1l11i1 = this.f19048OooO00o;
                    r8 = r82.OooO00o();
                } else if (z2 != z) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                } else {
                    return;
                }
            } else {
                throw new IllegalArgumentException("initialisation vector must be the same length as block size");
            }
        } else {
            reset();
            if (r8 != null) {
                li1l11i1 = this.f19048OooO00o;
            } else if (z2 != z) {
                throw new IllegalArgumentException("cannot change encrypting state without providing key.");
            } else {
                return;
            }
        }
        li1l11i1.OooO00o(z, r8);
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void reset() {
        byte[] bArr = this.f19050OooO00o;
        System.arraycopy(bArr, 0, this.OooO0O0, 0, bArr.length);
        C9586iIILl.OooO00o(this.OooO0OO, (byte) 0);
        this.f19048OooO00o.reset();
    }
}
