package com.p118pd.sdk;

import com.umeng.commonsdk.proguard.C3571am;
import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.I丨1I  reason: invalid class name and case insensitive filesystem */
public class C5494I1I implements AbstractC6769llL1L {
    public byte OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15938OooO00o = null;
    public byte OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f15939OooO0O0;
    public byte OooO0OO = 0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f15940OooO0OO;
    public byte OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public byte[] f15941OooO0Oo;
    public byte OooO0o;
    public byte OooO0o0;
    public byte OooO0oO;

    private void OooO00o(byte[] bArr, byte[] bArr2) {
        this.OooO0OO = 0;
        this.f15938OooO00o = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.f15938OooO00o[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.f15938OooO00o;
            int i3 = i2 & 255;
            byte b = bArr3[(this.OooO0OO + bArr3[i3] + bArr[i2 % bArr.length]) & 255];
            this.OooO0OO = b;
            byte b2 = bArr3[i3];
            bArr3[i3] = bArr3[b & 255];
            bArr3[b & 255] = b2;
        }
        for (int i4 = 0; i4 < 768; i4++) {
            byte[] bArr4 = this.f15938OooO00o;
            int i5 = i4 & 255;
            byte b3 = bArr4[(this.OooO0OO + bArr4[i5] + bArr2[i4 % bArr2.length]) & 255];
            this.OooO0OO = b3;
            byte b4 = bArr4[i5];
            bArr4[i5] = bArr4[b3 & 255];
            bArr4[b3 & 255] = b4;
        }
        this.OooO0O0 = 0;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o() {
        return 20;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        for (int i2 = 1; i2 < 25; i2++) {
            byte[] bArr2 = this.f15938OooO00o;
            byte b = this.OooO0OO;
            byte b2 = this.OooO0O0;
            byte b3 = bArr2[(b + bArr2[b2 & 255]) & 255];
            this.OooO0OO = b3;
            byte b4 = this.OooO0oO;
            byte b5 = this.OooO0o;
            byte b6 = bArr2[(b4 + b5 + i2) & 255];
            this.OooO0oO = b6;
            byte b7 = this.OooO0o0;
            byte b8 = bArr2[(b5 + b7 + i2) & 255];
            this.OooO0o = b8;
            byte b9 = this.OooO0Oo;
            byte b10 = bArr2[(b7 + b9 + i2) & 255];
            this.OooO0o0 = b10;
            byte b11 = bArr2[(b9 + b3 + i2) & 255];
            this.OooO0Oo = b11;
            byte[] bArr3 = this.f15939OooO0O0;
            byte b12 = this.OooO00o;
            bArr3[b12 & C3571am.f9204j] = (byte) (b11 ^ bArr3[b12 & C3571am.f9204j]);
            bArr3[(b12 + 1) & 31] = (byte) (b10 ^ bArr3[(b12 + 1) & 31]);
            bArr3[(b12 + 2) & 31] = (byte) (b8 ^ bArr3[(b12 + 2) & 31]);
            bArr3[(b12 + 3) & 31] = (byte) (b6 ^ bArr3[(b12 + 3) & 31]);
            this.OooO00o = (byte) ((b12 + 4) & 31);
            byte b13 = bArr2[b2 & 255];
            bArr2[b2 & 255] = bArr2[b3 & 255];
            bArr2[b3 & 255] = b13;
            this.OooO0O0 = (byte) ((b2 + 1) & 255);
        }
        for (int i3 = 0; i3 < 768; i3++) {
            byte[] bArr4 = this.f15938OooO00o;
            int i4 = i3 & 255;
            byte b14 = bArr4[(this.OooO0OO + bArr4[i4] + this.f15939OooO0O0[i3 & 31]) & 255];
            this.OooO0OO = b14;
            byte b15 = bArr4[i4];
            bArr4[i4] = bArr4[b14 & 255];
            bArr4[b14 & 255] = b15;
        }
        byte[] bArr5 = new byte[20];
        for (int i5 = 0; i5 < 20; i5++) {
            byte[] bArr6 = this.f15938OooO00o;
            int i6 = i5 & 255;
            byte b16 = bArr6[(this.OooO0OO + bArr6[i6]) & 255];
            this.OooO0OO = b16;
            bArr5[i5] = bArr6[(bArr6[bArr6[b16 & 255] & 255] + 1) & 255];
            byte b17 = bArr6[i6];
            bArr6[i6] = bArr6[b16 & 255];
            bArr6[b16 & 255] = b17;
        }
        System.arraycopy(bArr5, 0, bArr, i, 20);
        reset();
        return 20;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15725OooO00o() {
        return "VMPC-MAC";
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void OooO00o(AbstractC6370iIIIl r4) throws IllegalArgumentException {
        if (r4 instanceof C6274iilL1L) {
            C6274iilL1L r42 = (C6274iilL1L) r4;
            C6642li1LI r0 = (C6642li1LI) r42.OooO00o();
            if (r42.OooO00o() instanceof C6642li1LI) {
                byte[] OooO00o2 = r42.m17301OooO00o();
                this.f15940OooO0OO = OooO00o2;
                if (OooO00o2 == null || OooO00o2.length < 1 || OooO00o2.length > 768) {
                    throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
                }
                this.f15941OooO0Oo = r0.OooO00o();
                reset();
                return;
            }
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void reset() {
        OooO00o(this.f15941OooO0Oo, this.f15940OooO0OO);
        this.OooO0O0 = 0;
        this.OooO0oO = 0;
        this.OooO0o = 0;
        this.OooO0o0 = 0;
        this.OooO0Oo = 0;
        this.OooO00o = 0;
        this.f15939OooO0O0 = new byte[32];
        for (int i = 0; i < 32; i++) {
            this.f15939OooO0O0[i] = 0;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte b) throws IllegalStateException {
        byte[] bArr = this.f15938OooO00o;
        byte b2 = this.OooO0OO;
        byte b3 = this.OooO0O0;
        byte b4 = bArr[(b2 + bArr[b3 & 255]) & 255];
        this.OooO0OO = b4;
        byte b5 = this.OooO0oO;
        byte b6 = this.OooO0o;
        byte b7 = bArr[(b5 + b6) & 255];
        this.OooO0oO = b7;
        byte b8 = this.OooO0o0;
        byte b9 = bArr[(b6 + b8) & 255];
        this.OooO0o = b9;
        byte b10 = this.OooO0Oo;
        byte b11 = bArr[(b8 + b10) & 255];
        this.OooO0o0 = b11;
        byte b12 = bArr[(b10 + b4 + ((byte) (b ^ bArr[(bArr[bArr[b4 & 255] & 255] + 1) & 255]))) & 255];
        this.OooO0Oo = b12;
        byte[] bArr2 = this.f15939OooO0O0;
        byte b13 = this.OooO00o;
        bArr2[b13 & C3571am.f9204j] = (byte) (b12 ^ bArr2[b13 & C3571am.f9204j]);
        bArr2[(b13 + 1) & 31] = (byte) (b11 ^ bArr2[(b13 + 1) & 31]);
        bArr2[(b13 + 2) & 31] = (byte) (b9 ^ bArr2[(b13 + 2) & 31]);
        bArr2[(b13 + 3) & 31] = (byte) (b7 ^ bArr2[(b13 + 3) & 31]);
        this.OooO00o = (byte) ((b13 + 4) & 31);
        byte b14 = bArr[b3 & 255];
        bArr[b3 & 255] = bArr[b4 & 255];
        bArr[b4 & 255] = b14;
        this.OooO0O0 = (byte) ((b3 + 1) & 255);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        if (i + i2 <= bArr.length) {
            for (int i3 = 0; i3 < i2; i3++) {
                update(bArr[i + i3]);
            }
            return;
        }
        throw new DataLengthException("input buffer too short");
    }
}
