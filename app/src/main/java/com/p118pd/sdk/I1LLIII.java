package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I1LL丨III  reason: invalid class name */
public final class I1LLIII {
    public byte[][] OooO00o;

    public I1LLIII(C6578lLILi r4, byte[][] bArr) {
        if (r4 == null) {
            throw new NullPointerException("params == null");
        } else if (bArr == null) {
            throw new NullPointerException("signature == null");
        } else if (C5532IiIllL.m15805OooO00o(bArr)) {
            throw new NullPointerException("signature byte array == null");
        } else if (bArr.length == r4.OooO0O0()) {
            for (byte[] bArr2 : bArr) {
                if (bArr2.length != r4.OooO00o()) {
                    throw new IllegalArgumentException("wrong signature format");
                }
            }
            this.OooO00o = C5532IiIllL.m15808OooO00o(bArr);
        } else {
            throw new IllegalArgumentException("wrong signature size");
        }
    }

    public byte[][] OooO00o() {
        return C5532IiIllL.m15808OooO00o(this.OooO00o);
    }
}
