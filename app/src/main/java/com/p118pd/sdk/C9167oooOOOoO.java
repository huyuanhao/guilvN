package com.p118pd.sdk;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

/* renamed from: com.pd.sdk.oooOOOoO  reason: case insensitive filesystem */
public final class C9167oooOOOoO {
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    public static final int[] OooO00o(int i, O00O0OOO<? super Integer, UInt> o00o0ooo) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = o00o0ooo.invoke(Integer.valueOf(i2)).OooO00o();
        }
        return UIntArray.m20924OooO00o(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    public static final int[] OooO00o(int... iArr) {
        return iArr;
    }
}
