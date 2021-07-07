package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.iI丨1L丨  reason: invalid class name and case insensitive filesystem */
public class C6134iI1L implements I1LLllll {
    public static final int OooO0OO = 4;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17615OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17616OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f17617OooO00o;
    public int OooO0O0 = 4;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f17618OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int[] f17619OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f17620OooO0OO;

    @Override // com.p118pd.sdk.I1LLllll
    private byte OooO00o() {
        if (this.OooO0O0 > 3) {
            m17039OooO0O0();
            this.OooO0O0 = 0;
        }
        byte[] bArr = this.f17620OooO0OO;
        int i = this.OooO0O0;
        this.OooO0O0 = i + 1;
        return bArr[i];
    }

    @Override // com.p118pd.sdk.I1LLllll
    /* renamed from: OooO00o  reason: collision with other method in class */
    private int m17037OooO00o() {
        int[] iArr = this.f17619OooO0O0;
        int i = (iArr[0] >>> 2) | (iArr[1] << 30);
        int i2 = (iArr[0] >>> 12) | (iArr[1] << 20);
        int i3 = (iArr[0] >>> 15) | (iArr[1] << 17);
        int i4 = (iArr[1] >>> 4) | (iArr[2] << 28);
        int i5 = (iArr[1] >>> 13) | (iArr[2] << 19);
        int i6 = iArr[2];
        int i7 = (iArr[2] >>> 9) | (iArr[3] << 23);
        int i8 = (iArr[2] >>> 25) | (iArr[3] << 7);
        int i9 = (iArr[3] << 1) | (iArr[2] >>> 31);
        int[] iArr2 = this.f17617OooO00o;
        int i10 = (iArr2[0] >>> 8) | (iArr2[1] << 24);
        int i11 = (iArr2[0] >>> 13) | (iArr2[1] << 19);
        int i12 = (iArr2[0] >>> 20) | (iArr2[1] << 12);
        int i13 = (iArr2[1] >>> 10) | (iArr2[2] << 22);
        int i14 = (iArr2[1] >>> 28) | (iArr2[2] << 4);
        int i15 = (iArr2[2] >>> 15) | (iArr2[3] << 17);
        int i16 = i9 & i2 & ((iArr2[2] >>> 31) | (iArr2[3] << 1));
        return ((((((((i16 ^ ((((i11 & i12) ^ (i2 & i10)) ^ (i9 & i13)) ^ (i14 & i15))) ^ ((iArr2[2] >>> 29) | (iArr2[3] << 3))) ^ i) ^ i3) ^ i4) ^ i5) ^ i6) ^ i7) ^ i8;
    }

    @Override // com.p118pd.sdk.I1LLllll
    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m17038OooO00o() {
        for (int i = 0; i < 8; i++) {
            this.OooO00o = m17037OooO00o();
            this.f17619OooO0O0 = OooO00o(this.f17619OooO0O0, (OooO0OO() ^ this.f17617OooO00o[0]) ^ this.OooO00o);
            this.f17617OooO00o = OooO00o(this.f17617OooO00o, OooO0O0() ^ this.OooO00o);
        }
        this.f17615OooO00o = true;
    }

    private void OooO00o(byte[] bArr, byte[] bArr2) {
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = -1;
        this.f17616OooO00o = bArr;
        this.f17618OooO0O0 = bArr2;
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f17619OooO0O0;
            if (i < iArr.length) {
                byte[] bArr3 = this.f17616OooO00o;
                int i3 = i2 + 3;
                int i4 = i2 + 2;
                int i5 = (bArr3[i3] << 24) | ((bArr3[i4] << 16) & C7265o0O000oo.OooOo0O);
                int i6 = i2 + 1;
                iArr[i] = (bArr3[i2] & 255) | i5 | ((bArr3[i6] << 8) & 65280);
                int[] iArr2 = this.f17617OooO00o;
                byte[] bArr4 = this.f17618OooO0O0;
                iArr2[i] = (bArr4[i2] & 255) | (bArr4[i3] << 24) | ((bArr4[i4] << 16) & C7265o0O000oo.OooOo0O) | ((bArr4[i6] << 8) & 65280);
                i2 += 4;
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
        iArr[3] = i;
        return iArr;
    }

    private int OooO0O0() {
        int[] iArr = this.f17617OooO00o;
        int i = iArr[0];
        int i2 = (iArr[0] >>> 7) | (iArr[1] << 25);
        int i3 = (iArr[1] >>> 6) | (iArr[2] << 26);
        return iArr[3] ^ ((((i2 ^ i) ^ i3) ^ ((iArr[2] >>> 6) | (iArr[3] << 26))) ^ ((iArr[2] >>> 17) | (iArr[3] << 15)));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    private void m17039OooO0O0() {
        int OooO00o2 = m17037OooO00o();
        this.OooO00o = OooO00o2;
        byte[] bArr = this.f17620OooO0OO;
        bArr[0] = (byte) OooO00o2;
        bArr[1] = (byte) (OooO00o2 >> 8);
        bArr[2] = (byte) (OooO00o2 >> 16);
        bArr[3] = (byte) (OooO00o2 >> 24);
        this.f17619OooO0O0 = OooO00o(this.f17619OooO0O0, OooO0OO() ^ this.f17617OooO00o[0]);
        this.f17617OooO00o = OooO00o(this.f17617OooO00o, OooO0O0());
    }

    private int OooO0OO() {
        int[] iArr = this.f17619OooO0O0;
        int i = iArr[0];
        int i2 = (iArr[0] >>> 3) | (iArr[1] << 29);
        int i3 = (iArr[0] >>> 11) | (iArr[1] << 21);
        int i4 = (iArr[0] >>> 13) | (iArr[1] << 19);
        int i5 = (iArr[0] >>> 17) | (iArr[1] << 15);
        int i6 = (iArr[0] >>> 18) | (iArr[1] << 14);
        int i7 = (iArr[0] >>> 26) | (iArr[1] << 6);
        int i8 = (iArr[0] >>> 27) | (iArr[1] << 5);
        int i9 = (iArr[1] >>> 8) | (iArr[2] << 24);
        int i10 = (iArr[1] >>> 16) | (iArr[2] << 16);
        int i11 = (iArr[1] >>> 24) | (iArr[2] << 8);
        int i12 = (iArr[1] >>> 27) | (iArr[2] << 5);
        int i13 = (iArr[1] >>> 29) | (iArr[2] << 3);
        int i14 = (iArr[2] >>> 1) | (iArr[3] << 31);
        return (((((((iArr[3] ^ (((i ^ i7) ^ i11) ^ ((iArr[2] >>> 27) | (iArr[3] << 5)))) ^ (i2 & ((iArr[2] >>> 3) | (iArr[3] << 29)))) ^ (i3 & i4)) ^ (i5 & i6)) ^ (i8 & i12)) ^ (i9 & i10)) ^ (i13 & i14)) ^ (((iArr[2] >>> 4) | (iArr[3] << 28)) & ((iArr[2] >>> 20) | (iArr[3] << 12)));
    }

    @Override // com.p118pd.sdk.I1LLllll
    public byte OooO00o(byte b) {
        if (this.f17615OooO00o) {
            return (byte) (b ^ OooO00o());
        }
        throw new IllegalStateException(m17040OooO00o() + " not initialised");
    }

    @Override // com.p118pd.sdk.I1LLllll
    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (!this.f17615OooO00o) {
            throw new IllegalStateException(m17040OooO00o() + " not initialised");
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
    public String m17040OooO00o() {
        return "Grain-128";
    }

    @Override // com.p118pd.sdk.I1LLllll
    public void OooO00o(boolean z, AbstractC6370iIIIl r5) throws IllegalArgumentException {
        if (r5 instanceof C6274iilL1L) {
            C6274iilL1L r52 = (C6274iilL1L) r5;
            byte[] OooO00o2 = r52.m17301OooO00o();
            if (OooO00o2 == null || OooO00o2.length != 12) {
                throw new IllegalArgumentException("Grain-128  requires exactly 12 bytes of IV");
            } else if (r52.OooO00o() instanceof C6642li1LI) {
                C6642li1LI r53 = (C6642li1LI) r52.OooO00o();
                this.f17618OooO0O0 = new byte[r53.OooO00o().length];
                this.f17616OooO00o = new byte[r53.OooO00o().length];
                this.f17617OooO00o = new int[4];
                this.f17619OooO0O0 = new int[4];
                this.f17620OooO0OO = new byte[4];
                System.arraycopy(OooO00o2, 0, this.f17618OooO0O0, 0, OooO00o2.length);
                System.arraycopy(r53.OooO00o(), 0, this.f17616OooO00o, 0, r53.OooO00o().length);
                reset();
            } else {
                throw new IllegalArgumentException("Grain-128 Init parameters must include a key");
            }
        } else {
            throw new IllegalArgumentException("Grain-128 Init parameters must include an IV");
        }
    }

    @Override // com.p118pd.sdk.I1LLllll
    public void reset() {
        this.OooO0O0 = 4;
        OooO00o(this.f17616OooO00o, this.f17618OooO0O0);
        m17038OooO00o();
    }
}
