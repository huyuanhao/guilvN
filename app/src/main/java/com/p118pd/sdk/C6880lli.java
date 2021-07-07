package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l丨li  reason: invalid class name and case insensitive filesystem */
public final class C6880lli {
    public final byte[][] OooO00o;

    public C6880lli(C6578lLILi r4, byte[][] bArr) {
        if (r4 == null) {
            throw new NullPointerException("params == null");
        } else if (bArr == null) {
            throw new NullPointerException("publicKey == null");
        } else if (C5532IiIllL.m15805OooO00o(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        } else if (bArr.length == r4.OooO0O0()) {
            for (byte[] bArr2 : bArr) {
                if (bArr2.length != r4.OooO00o()) {
                    throw new IllegalArgumentException("wrong publicKey format");
                }
            }
            this.OooO00o = C5532IiIllL.m15808OooO00o(bArr);
        } else {
            throw new IllegalArgumentException("wrong publicKey size");
        }
    }

    public byte[][] OooO00o() {
        return C5532IiIllL.m15808OooO00o(this.OooO00o);
    }
}
