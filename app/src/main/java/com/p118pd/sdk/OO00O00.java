package com.p118pd.sdk;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.OO00O00 */
public class OO00O00 extends OO00o0 {
    @NotNull
    public static final <T extends Comparable<? super T>> ClosedRange<T> OooO00o(@NotNull T t, @NotNull T t2) {
        o0O0OO00.OooO0o(t, "receiver$0");
        o0O0OO00.OooO0o(t2, "that");
        return new OO000O(t, t2);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final ClosedFloatingPointRange<Double> OooO00o(double d, double d2) {
        return new oO00000O(d, d2);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <T, R extends Iterable<? extends T> & ClosedRange<T>> boolean OooO00o(@NotNull R r, T t) {
        o0O0OO00.OooO0o(r, "receiver$0");
        return t != null && ((ClosedRange) r).OooO00o(t);
    }

    public static final void OooO00o(boolean z, @NotNull Number number) {
        o0O0OO00.OooO0o(number, "step");
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }
}
