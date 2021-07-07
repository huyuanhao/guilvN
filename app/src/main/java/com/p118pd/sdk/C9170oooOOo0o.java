package com.p118pd.sdk;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

/* renamed from: com.pd.sdk.oooOOo0o  reason: case insensitive filesystem */
public final class C9170oooOOo0o {
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    public static final long[] OooO00o(int i, O00O0OOO<? super Integer, ULong> o00o0ooo) {
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = o00o0ooo.invoke(Integer.valueOf(i2)).OooO00o();
        }
        return ULongArray.m20940OooO00o(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    public static final long[] OooO00o(long... jArr) {
        return jArr;
    }
}
