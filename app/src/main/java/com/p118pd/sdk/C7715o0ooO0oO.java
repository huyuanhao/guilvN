package com.p118pd.sdk;

/* renamed from: com.pd.sdk.o0ooO0oO  reason: case insensitive filesystem */
public final class C7715o0ooO0oO implements AbstractC7705o0ooO00<int[]> {
    public static final String OooO00o = "IntegerArrayPool";

    @Override // com.p118pd.sdk.AbstractC7705o0ooO00
    public int OooO00o() {
        return 4;
    }

    @Override // com.p118pd.sdk.AbstractC7705o0ooO00
    public String getTag() {
        return OooO00o;
    }

    public int OooO00o(int[] iArr) {
        return iArr.length;
    }

    @Override // com.p118pd.sdk.AbstractC7705o0ooO00
    public int[] OooO00o(int i) {
        return new int[i];
    }
}
