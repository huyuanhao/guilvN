package com.p118pd.sdk;

import java.lang.reflect.Array;

/* renamed from: com.pd.sdk.丨il丨I1I  reason: invalid class name and case insensitive filesystem */
public class C9639ilI1I implements Lli1LL {
    public long[][] OooO00o;

    @Override // com.p118pd.sdk.Lli1LL
    public void OooO00o(long[] jArr) {
        long[] jArr2 = new long[8];
        C6376iL1I.OooO00o(this.OooO00o[((int) (jArr[7] >>> 56)) & 255], jArr2);
        for (int i = 62; i >= 0; i--) {
            C6376iL1I.OooO0OO(jArr2, jArr2);
            C6376iL1I.OooO00o(this.OooO00o[((int) (jArr[i >>> 3] >>> ((i & 7) << 3))) & 255], jArr2, jArr2);
        }
        C6376iL1I.OooO00o(jArr2, jArr);
    }

    @Override // com.p118pd.sdk.Lli1LL
    public void OooO0O0(long[] jArr) {
        long[][] jArr2 = this.OooO00o;
        if (jArr2 == null) {
            this.OooO00o = (long[][]) Array.newInstance(long.class, 256, 8);
        } else if (C6376iL1I.m17489OooO00o(jArr, jArr2[1])) {
            return;
        }
        C6376iL1I.OooO00o(jArr, this.OooO00o[1]);
        for (int i = 2; i < 256; i += 2) {
            long[][] jArr3 = this.OooO00o;
            C6376iL1I.OooO0O0(jArr3[i >> 1], jArr3[i]);
            long[][] jArr4 = this.OooO00o;
            C6376iL1I.OooO00o(jArr4[i], jArr4[1], jArr4[i + 1]);
        }
    }
}
