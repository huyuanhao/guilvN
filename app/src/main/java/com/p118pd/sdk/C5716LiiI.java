package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LiiI  reason: case insensitive filesystem */
public class C5716LiiI implements AbstractC5568IL1 {
    public long[] OooO00o;

    @Override // com.p118pd.sdk.AbstractC5568IL1
    public void OooO00o(byte[] bArr) {
        this.OooO00o = liL1I.m17815OooO00o(bArr);
    }

    @Override // com.p118pd.sdk.AbstractC5568IL1
    public void OooO0O0(byte[] bArr) {
        long[] OooO00o2 = liL1I.m17815OooO00o(bArr);
        liL1I.OooO0OO(OooO00o2, this.OooO00o);
        liL1I.OooO00o(OooO00o2, bArr);
    }
}
