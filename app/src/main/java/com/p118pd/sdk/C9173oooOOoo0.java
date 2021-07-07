package com.p118pd.sdk;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

/* renamed from: com.pd.sdk.oooOOoo0  reason: case insensitive filesystem */
public final class C9173oooOOoo0 {
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    public static final short[] OooO00o(int i, O00O0OOO<? super Integer, UShort> o00o0ooo) {
        short[] sArr = new short[i];
        for (int i2 = 0; i2 < i; i2++) {
            sArr[i2] = o00o0ooo.invoke(Integer.valueOf(i2)).OooO00o();
        }
        return UShortArray.m20975OooO00o(sArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    public static final short[] OooO00o(short... sArr) {
        return sArr;
    }
}
