package com.p118pd.sdk;

/* renamed from: com.pd.sdk.liIL  reason: case insensitive filesystem */
public final class C6650liIL {
    public final byte[][] OooO00o;

    public C6650liIL(C6578lLILi r5, byte[][] bArr) {
        if (r5 == null) {
            throw new NullPointerException("params == null");
        } else if (bArr == null) {
            throw new NullPointerException("privateKey == null");
        } else if (C5532IiIllL.m15805OooO00o(bArr)) {
            throw new NullPointerException("privateKey byte array == null");
        } else if (bArr.length == r5.OooO0O0()) {
            for (byte[] bArr2 : bArr) {
                if (bArr2.length != r5.OooO00o()) {
                    throw new IllegalArgumentException("wrong privateKey format");
                }
            }
            this.OooO00o = C5532IiIllL.m15808OooO00o(bArr);
        } else {
            throw new IllegalArgumentException("wrong privateKey format");
        }
    }

    public byte[][] OooO00o() {
        return C5532IiIllL.m15808OooO00o(this.OooO00o);
    }
}
