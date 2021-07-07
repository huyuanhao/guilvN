package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LIllL11丨  reason: invalid class name */
public class LIllL11 implements AbstractC9827L {
    public long[] OooO00o;

    @Override // com.p118pd.sdk.AbstractC9827L
    public void OooO00o(long j, byte[] bArr) {
        long[] OooO00o2 = liL1I.m17814OooO00o();
        if (j > 0) {
            long[] OooO00o3 = C9586iIILl.m21639OooO00o(this.OooO00o);
            do {
                if ((1 & j) != 0) {
                    liL1I.OooO0OO(OooO00o2, OooO00o3);
                }
                liL1I.OooO(OooO00o3, OooO00o3);
                j >>>= 1;
            } while (j > 0);
        }
        liL1I.OooO00o(OooO00o2, bArr);
    }

    @Override // com.p118pd.sdk.AbstractC9827L
    public void OooO00o(byte[] bArr) {
        this.OooO00o = liL1I.m17815OooO00o(bArr);
    }
}
