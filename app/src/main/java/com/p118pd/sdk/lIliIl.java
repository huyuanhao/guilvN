package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.l丨丨IliIl  reason: invalid class name */
public class lIliIl implements li1l11I1 {
    public static final int OooO00o = 32;
    public static final int OooO0O0 = 64;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int[] f19039OooO0O0 = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f19040OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f19041OooO00o = null;

    @Override // com.p118pd.sdk.li1l11I1
    private void OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = new int[8];
        OooO00o(bArr, iArr, i, 0);
        for (int i3 = 63; i3 > -1; i3--) {
            int i4 = (iArr[0] - ((((iArr[1] >>> 2) | (iArr[1] << -2)) ^ ((iArr[1] >>> 13) | (iArr[1] << -13))) ^ ((iArr[1] >>> 22) | (iArr[1] << -22)))) - (((iArr[1] & iArr[2]) ^ (iArr[1] & iArr[3])) ^ (iArr[2] & iArr[3]));
            iArr[0] = iArr[1];
            iArr[1] = iArr[2];
            iArr[2] = iArr[3];
            iArr[3] = iArr[4] - i4;
            iArr[4] = iArr[5];
            iArr[5] = iArr[6];
            iArr[6] = iArr[7];
            iArr[7] = (((i4 - f19039OooO0O0[i3]) - this.f19041OooO00o[i3]) - ((((iArr[4] >>> 6) | (iArr[4] << -6)) ^ ((iArr[4] >>> 11) | (iArr[4] << -11))) ^ ((iArr[4] >>> 25) | (iArr[4] << -25)))) - (((-1 ^ iArr[4]) & iArr[6]) ^ (iArr[5] & iArr[4]));
        }
        OooO00o(iArr, bArr2, i2);
    }

    private void OooO00o(byte[] bArr, int[] iArr, int i, int i2) {
        while (i2 < 8) {
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            iArr[i2] = i5 | ((bArr[i4] & 255) << 8) | (bArr[i6] & 255);
            i2++;
            i = i6 + 1;
        }
    }

    private void OooO00o(int[] iArr, byte[] bArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = i + 1;
            bArr[i] = (byte) (iArr[i2] >>> 24);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (iArr[i2] >>> 16);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (iArr[i2] >>> 8);
            i = i5 + 1;
            bArr[i5] = (byte) iArr[i2];
        }
    }

    private void OooO0O0(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = new int[8];
        OooO00o(bArr, iArr, i, 0);
        for (int i3 = 0; i3 < 64; i3++) {
            int i4 = ((((iArr[4] >>> 6) | (iArr[4] << -6)) ^ ((iArr[4] >>> 11) | (iArr[4] << -11))) ^ ((iArr[4] >>> 25) | (iArr[4] << -25))) + ((iArr[4] & iArr[5]) ^ ((iArr[4] ^ -1) & iArr[6])) + iArr[7] + f19039OooO0O0[i3] + this.f19041OooO00o[i3];
            iArr[7] = iArr[6];
            iArr[6] = iArr[5];
            iArr[5] = iArr[4];
            iArr[4] = iArr[3] + i4;
            iArr[3] = iArr[2];
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = i4 + ((((iArr[0] >>> 2) | (iArr[0] << -2)) ^ ((iArr[0] >>> 13) | (iArr[0] << -13))) ^ ((iArr[0] >>> 22) | (iArr[0] << -22))) + ((iArr[2] & iArr[3]) ^ ((iArr[0] & iArr[2]) ^ (iArr[0] & iArr[3])));
        }
        OooO00o(iArr, bArr2, i2);
    }

    private void OooO0O0(byte[] bArr, int[] iArr, int i, int i2) {
        while (i2 < bArr.length / 4) {
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            iArr[i2] = i7 | (bArr[i6] & 255);
            i2++;
            i = i6 + 1;
        }
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return 32;
    }

    @Override // com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m18064OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        if (this.f19041OooO00o == null) {
            throw new IllegalStateException("Shacal2 not initialised");
        } else if (i + 32 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 32 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        } else if (this.f19040OooO00o) {
            OooO0O0(bArr, i, bArr2, i2);
            return 32;
        } else {
            OooO00o(bArr, i, bArr2, i2);
            return 32;
        }
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m18065OooO00o() {
        return "Shacal2";
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r3) throws IllegalArgumentException {
        if (r3 instanceof C6642li1LI) {
            this.f19040OooO00o = z;
            this.f19041OooO00o = new int[64];
            OooO00o(((C6642li1LI) r3).OooO00o());
            return;
        }
        throw new IllegalArgumentException("only simple KeyParameter expected.");
    }

    public void OooO00o(byte[] bArr) {
        if (bArr.length != 0 && bArr.length <= 64) {
            if (bArr.length >= 16 && bArr.length % 8 == 0) {
                OooO0O0(bArr, this.f19041OooO00o, 0, 0);
                for (int i = 16; i < 64; i++) {
                    int[] iArr = this.f19041OooO00o;
                    int i2 = i - 2;
                    int i3 = i - 15;
                    iArr[i] = ((iArr[i2] >>> 10) ^ (((iArr[i2] >>> 17) | (iArr[i2] << -17)) ^ ((iArr[i2] >>> 19) | (iArr[i2] << -19)))) + iArr[i - 7] + ((iArr[i3] >>> 3) ^ (((iArr[i3] >>> 7) | (iArr[i3] << -7)) ^ ((iArr[i3] >>> 18) | (iArr[i3] << -18)))) + iArr[i - 16];
                }
                return;
            }
        }
        throw new IllegalArgumentException("Shacal2-key must be 16 - 64 bytes and multiple of 8");
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void reset() {
    }
}
