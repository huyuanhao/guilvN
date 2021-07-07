package com.p118pd.sdk;

import java.lang.reflect.Array;

/* renamed from: com.pd.sdk.Il */
public class C1677Il implements AbstractC5568IL1 {
    public byte[] OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long[][] f15777OooO00o;

    @Override // com.p118pd.sdk.AbstractC5568IL1
    public void OooO00o(byte[] bArr) {
        if (this.f15777OooO00o == null) {
            this.f15777OooO00o = (long[][]) Array.newInstance(long.class, 256, 2);
        } else if (C9586iIILl.m21627OooO00o(this.OooO00o, bArr)) {
            return;
        }
        byte[] OooO00o2 = C9586iIILl.m21630OooO00o(bArr);
        this.OooO00o = OooO00o2;
        liL1I.OooO00o(OooO00o2, this.f15777OooO00o[1]);
        long[][] jArr = this.f15777OooO00o;
        liL1I.OooO0oO(jArr[1], jArr[1]);
        for (int i = 2; i < 256; i += 2) {
            long[][] jArr2 = this.f15777OooO00o;
            liL1I.OooO0O0(jArr2[i >> 1], jArr2[i]);
            long[][] jArr3 = this.f15777OooO00o;
            liL1I.OooO00o(jArr3[i], jArr3[1], jArr3[i + 1]);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5568IL1
    public void OooO0O0(byte[] bArr) {
        long[] jArr = this.f15777OooO00o[bArr[15] & 255];
        long j = jArr[0];
        long j2 = jArr[1];
        for (int i = 14; i >= 0; i--) {
            long[] jArr2 = this.f15777OooO00o[bArr[i] & 255];
            long j3 = j2 << 56;
            j2 = ((j2 >>> 8) | (j << 56)) ^ jArr2[1];
            j = (((((j >>> 8) ^ jArr2[0]) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2)) ^ (j3 >>> 7);
        }
        AbstractC6464l1l.OooO00o(j, bArr, 0);
        AbstractC6464l1l.OooO00o(j2, bArr, 8);
    }
}
