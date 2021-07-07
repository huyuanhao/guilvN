package com.p118pd.sdk;

import java.lang.reflect.Array;

/* renamed from: com.pd.sdk.丨i1Ii丨i  reason: invalid class name and case insensitive filesystem */
public class C9565i1Iii implements AbstractC5568IL1 {
    public byte[] OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long[][][] f23141OooO00o;

    @Override // com.p118pd.sdk.AbstractC5568IL1
    public void OooO00o(byte[] bArr) {
        if (this.f23141OooO00o == null) {
            this.f23141OooO00o = (long[][][]) Array.newInstance(long.class, 16, 256, 2);
        } else if (C9586iIILl.m21627OooO00o(this.OooO00o, bArr)) {
            return;
        }
        this.OooO00o = C9586iIILl.m21630OooO00o(bArr);
        for (int i = 0; i < 16; i++) {
            long[][][] jArr = this.f23141OooO00o;
            long[][] jArr2 = jArr[i];
            if (i == 0) {
                liL1I.OooO00o(this.OooO00o, jArr2[1]);
                liL1I.OooO0oO(jArr2[1], jArr2[1]);
            } else {
                liL1I.OooO0oo(jArr[i - 1][1], jArr2[1]);
            }
            for (int i2 = 2; i2 < 256; i2 += 2) {
                liL1I.OooO0O0(jArr2[i2 >> 1], jArr2[i2]);
                liL1I.OooO00o(jArr2[i2], jArr2[1], jArr2[i2 + 1]);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC5568IL1
    public void OooO0O0(byte[] bArr) {
        long[] jArr = this.f23141OooO00o[15][bArr[15] & 255];
        long j = jArr[0];
        long j2 = jArr[1];
        for (int i = 14; i >= 0; i--) {
            long[] jArr2 = this.f23141OooO00o[i][bArr[i] & 255];
            j ^= jArr2[0];
            j2 ^= jArr2[1];
        }
        AbstractC6464l1l.OooO00o(j, bArr, 0);
        AbstractC6464l1l.OooO00o(j2, bArr, 8);
    }
}
