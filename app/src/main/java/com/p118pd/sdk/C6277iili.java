package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.iili丨  reason: invalid class name and case insensitive filesystem */
public class C6277iili implements I1LLllll {
    public static final int OooO0OO = 5;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17948OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17949OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f17950OooO00o;
    public int OooO0O0 = 2;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f17951OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int[] f17952OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f17953OooO0OO;

    @Override // com.p118pd.sdk.I1LLllll
    private byte OooO00o() {
        if (this.OooO0O0 > 1) {
            m17305OooO0O0();
            this.OooO0O0 = 0;
        }
        byte[] bArr = this.f17953OooO0OO;
        int i = this.OooO0O0;
        this.OooO0O0 = i + 1;
        return bArr[i];
    }

    @Override // com.p118pd.sdk.I1LLllll
    /* renamed from: OooO00o  reason: collision with other method in class */
    private int m17303OooO00o() {
        int[] iArr = this.f17952OooO0O0;
        int i = (iArr[0] >>> 1) | (iArr[1] << 15);
        int i2 = (iArr[0] >>> 2) | (iArr[1] << 14);
        int i3 = (iArr[0] >>> 4) | (iArr[1] << 12);
        int i4 = (iArr[0] >>> 10) | (iArr[1] << 6);
        int i5 = (iArr[1] >>> 15) | (iArr[2] << 1);
        int i6 = (iArr[2] >>> 11) | (iArr[3] << 5);
        int i7 = (iArr[3] >>> 8) | (iArr[4] << 8);
        int i8 = (iArr[4] << 1) | (iArr[3] >>> 15);
        int[] iArr2 = this.f17950OooO00o;
        int i9 = (iArr2[0] >>> 3) | (iArr2[1] << 13);
        int i10 = (iArr2[1] >>> 9) | (iArr2[2] << 7);
        int i11 = (iArr2[3] << 2) | (iArr2[2] >>> 14);
        int i12 = iArr2[4];
        int i13 = (i10 ^ i8) ^ (i9 & i12);
        int i14 = i11 & i12;
        int i15 = i9 & i11;
        int i16 = i12 & i15;
        int i17 = i15 & i8;
        return (((((((((i8 & i14) ^ ((i17 ^ (i16 ^ (((i13 ^ i14) ^ (i12 & i8)) ^ ((i9 & i10) & i11)))) ^ ((i10 & i11) & i8))) ^ i) ^ i2) ^ i3) ^ i4) ^ i5) ^ i6) ^ i7) & 65535;
    }

    @Override // com.p118pd.sdk.I1LLllll
    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m17304OooO00o() {
        for (int i = 0; i < 10; i++) {
            this.OooO00o = m17303OooO00o();
            this.f17952OooO0O0 = OooO00o(this.f17952OooO0O0, (OooO0OO() ^ this.f17950OooO00o[0]) ^ this.OooO00o);
            this.f17950OooO00o = OooO00o(this.f17950OooO00o, OooO0O0() ^ this.OooO00o);
        }
        this.f17948OooO00o = true;
    }

    private void OooO00o(byte[] bArr, byte[] bArr2) {
        bArr2[8] = -1;
        bArr2[9] = -1;
        this.f17949OooO00o = bArr;
        this.f17951OooO0O0 = bArr2;
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f17952OooO0O0;
            if (i < iArr.length) {
                byte[] bArr3 = this.f17949OooO00o;
                int i3 = i2 + 1;
                iArr[i] = ((bArr3[i2] & 255) | (bArr3[i3] << 8)) & 65535;
                int[] iArr2 = this.f17950OooO00o;
                byte[] bArr4 = this.f17951OooO0O0;
                iArr2[i] = ((bArr4[i2] & 255) | (bArr4[i3] << 8)) & 65535;
                i2 += 2;
                i++;
            } else {
                return;
            }
        }
    }

    private int[] OooO00o(int[] iArr, int i) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = i;
        return iArr;
    }

    private int OooO0O0() {
        int[] iArr = this.f17950OooO00o;
        int i = iArr[0];
        int i2 = (iArr[1] >>> 7) | (iArr[2] << 9);
        int i3 = (iArr[2] >>> 6) | (iArr[3] << 10);
        return (((iArr[4] << 2) | (iArr[3] >>> 14)) ^ ((((((iArr[0] >>> 13) | (iArr[1] << 3)) ^ i) ^ i2) ^ i3) ^ ((iArr[3] >>> 3) | (iArr[4] << 13)))) & 65535;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    private void m17305OooO0O0() {
        int OooO00o2 = m17303OooO00o();
        this.OooO00o = OooO00o2;
        byte[] bArr = this.f17953OooO0OO;
        bArr[0] = (byte) OooO00o2;
        bArr[1] = (byte) (OooO00o2 >> 8);
        this.f17952OooO0O0 = OooO00o(this.f17952OooO0O0, OooO0OO() ^ this.f17950OooO00o[0]);
        this.f17950OooO00o = OooO00o(this.f17950OooO00o, OooO0O0());
    }

    private int OooO0OO() {
        int[] iArr = this.f17952OooO0O0;
        int i = iArr[0];
        int i2 = (iArr[0] >>> 9) | (iArr[1] << 7);
        int i3 = (iArr[0] >>> 14) | (iArr[1] << 2);
        int i4 = (iArr[0] >>> 15) | (iArr[1] << 1);
        int i5 = (iArr[1] >>> 5) | (iArr[2] << 11);
        int i6 = (iArr[1] >>> 12) | (iArr[2] << 4);
        int i7 = (iArr[2] >>> 1) | (iArr[3] << 15);
        int i8 = (iArr[2] >>> 5) | (iArr[3] << 11);
        int i9 = (iArr[2] >>> 13) | (iArr[3] << 3);
        int i10 = (iArr[3] >>> 4) | (iArr[4] << 12);
        int i11 = (iArr[3] >>> 12) | (iArr[4] << 4);
        int i12 = (iArr[4] << 1) | (iArr[3] >>> 15);
        int i13 = i12 & i11;
        int i14 = i11 & i10;
        int i15 = ((((i ^ (((((((((((iArr[3] >>> 14) | (iArr[4] << 2)) ^ i11) ^ i10) ^ i9) ^ i8) ^ i7) ^ i6) ^ i5) ^ i3) ^ i2)) ^ i13) ^ (i8 & i7)) ^ (i4 & i2)) ^ (i14 & i9);
        int i16 = i7 & i6 & i5;
        return (((((((((i12 & i9) & i6) & i2) ^ (i15 ^ i16)) ^ ((i14 & i8) & i7)) ^ ((i13 & i5) & i4)) ^ (((i13 & i10) & i9) & i8)) ^ ((i4 & i16) & i2)) ^ (((((i10 & i9) & i8) & i7) & i6) & i5)) & 65535;
    }

    @Override // com.p118pd.sdk.I1LLllll
    public byte OooO00o(byte b) {
        if (this.f17948OooO00o) {
            return (byte) (b ^ OooO00o());
        }
        throw new IllegalStateException(m17306OooO00o() + " not initialised");
    }

    @Override // com.p118pd.sdk.I1LLllll
    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (!this.f17948OooO00o) {
            throw new IllegalStateException(m17306OooO00o() + " not initialised");
        } else if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i3 + i2 <= bArr2.length) {
            for (int i4 = 0; i4 < i2; i4++) {
                bArr2[i3 + i4] = (byte) (bArr[i + i4] ^ OooO00o());
            }
            return i2;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    @Override // com.p118pd.sdk.I1LLllll
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17306OooO00o() {
        return "Grain v1";
    }

    @Override // com.p118pd.sdk.I1LLllll
    public void OooO00o(boolean z, AbstractC6370iIIIl r5) throws IllegalArgumentException {
        if (r5 instanceof C6274iilL1L) {
            C6274iilL1L r52 = (C6274iilL1L) r5;
            byte[] OooO00o2 = r52.m17301OooO00o();
            if (OooO00o2 == null || OooO00o2.length != 8) {
                throw new IllegalArgumentException("Grain v1 requires exactly 8 bytes of IV");
            } else if (r52.OooO00o() instanceof C6642li1LI) {
                C6642li1LI r53 = (C6642li1LI) r52.OooO00o();
                this.f17951OooO0O0 = new byte[r53.OooO00o().length];
                this.f17949OooO00o = new byte[r53.OooO00o().length];
                this.f17950OooO00o = new int[5];
                this.f17952OooO0O0 = new int[5];
                this.f17953OooO0OO = new byte[2];
                System.arraycopy(OooO00o2, 0, this.f17951OooO0O0, 0, OooO00o2.length);
                System.arraycopy(r53.OooO00o(), 0, this.f17949OooO00o, 0, r53.OooO00o().length);
                reset();
            } else {
                throw new IllegalArgumentException("Grain v1 Init parameters must include a key");
            }
        } else {
            throw new IllegalArgumentException("Grain v1 Init parameters must include an IV");
        }
    }

    @Override // com.p118pd.sdk.I1LLllll
    public void reset() {
        this.OooO0O0 = 2;
        OooO00o(this.f17949OooO00o, this.f17951OooO0O0);
        m17304OooO00o();
    }
}
