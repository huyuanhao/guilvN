package com.p118pd.sdk;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

/* renamed from: com.pd.sdk.oooOOOO  reason: case insensitive filesystem */
public final class C9165oooOOOO {
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    public static final byte[] OooO00o(int i, O00O0OOO<? super Integer, UByte> o00o0ooo) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = o00o0ooo.invoke(Integer.valueOf(i2)).OooO00o();
        }
        return UByteArray.m20918OooO00o(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    public static final byte[] OooO00o(byte... bArr) {
        return bArr;
    }
}
