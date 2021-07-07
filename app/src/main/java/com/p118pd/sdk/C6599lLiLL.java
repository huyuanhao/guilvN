package com.p118pd.sdk;

import java.lang.reflect.Array;

/* renamed from: com.pd.sdk.lLi丨LL  reason: invalid class name and case insensitive filesystem */
public class C6599lLiLL implements AbstractC5568IL1 {
    public byte[] OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long[][][] f18543OooO00o;

    @Override // com.p118pd.sdk.AbstractC5568IL1
    public void OooO00o(byte[] bArr) {
        if (this.f18543OooO00o == null) {
            this.f18543OooO00o = (long[][][]) Array.newInstance(long.class, 32, 16, 2);
        } else if (C9586iIILl.m21627OooO00o(this.OooO00o, bArr)) {
            return;
        }
        this.OooO00o = C9586iIILl.m21630OooO00o(bArr);
        for (int i = 0; i < 32; i++) {
            long[][][] jArr = this.f18543OooO00o;
            long[][] jArr2 = jArr[i];
            if (i == 0) {
                liL1I.OooO00o(this.OooO00o, jArr2[1]);
                liL1I.OooO0o0(jArr2[1], jArr2[1]);
            } else {
                liL1I.OooO0o(jArr[i - 1][1], jArr2[1]);
            }
            for (int i2 = 2; i2 < 16; i2 += 2) {
                liL1I.OooO0O0(jArr2[i2 >> 1], jArr2[i2]);
                liL1I.OooO00o(jArr2[i2], jArr2[1], jArr2[i2 + 1]);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC5568IL1
    public void OooO0O0(byte[] bArr) {
        long j = 0;
        long j2 = 0;
        for (int i = 15; i >= 0; i--) {
            long[][][] jArr = this.f18543OooO00o;
            int i2 = i + i;
            long[] jArr2 = jArr[i2 + 1][bArr[i] & 15];
            long[] jArr3 = jArr[i2][(bArr[i] & 240) >>> 4];
            j ^= jArr2[0] ^ jArr3[0];
            j2 ^= jArr3[1] ^ jArr2[1];
        }
        AbstractC6464l1l.OooO00o(j, bArr, 0);
        AbstractC6464l1l.OooO00o(j2, bArr, 8);
    }
}
