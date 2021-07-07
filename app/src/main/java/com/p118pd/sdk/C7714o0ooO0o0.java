package com.p118pd.sdk;

/* renamed from: com.pd.sdk.o0ooO0o0  reason: case insensitive filesystem */
public final class C7714o0ooO0o0 implements AbstractC7705o0ooO00<byte[]> {
    public static final String OooO00o = "ByteArrayPool";

    @Override // com.p118pd.sdk.AbstractC7705o0ooO00
    public int OooO00o() {
        return 1;
    }

    @Override // com.p118pd.sdk.AbstractC7705o0ooO00
    public String getTag() {
        return OooO00o;
    }

    public int OooO00o(byte[] bArr) {
        return bArr.length;
    }

    @Override // com.p118pd.sdk.AbstractC7705o0ooO00
    public byte[] OooO00o(int i) {
        return new byte[i];
    }
}
