package com.p118pd.sdk;

import java.util.Comparator;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.ooooOO0o  reason: case insensitive filesystem */
public class C9260ooooOO0o extends C9258ooooOO0 {
    @SinceKotlin(version = "1.1")
    public static final <T> T OooO00o(T t, T t2, T t3, @NotNull Comparator<? super T> comparator) {
        o0O0OO00.OooO0o(comparator, "comparator");
        return (T) OooO00o(t, OooO00o(t2, t3, comparator), comparator);
    }

    @SinceKotlin(version = "1.1")
    public static final <T> T OooO0O0(T t, T t2, T t3, @NotNull Comparator<? super T> comparator) {
        o0O0OO00.OooO0o(comparator, "comparator");
        return (T) OooO0O0(t, OooO0O0(t2, t3, comparator), comparator);
    }

    @SinceKotlin(version = "1.1")
    public static final <T> T OooO00o(T t, T t2, @NotNull Comparator<? super T> comparator) {
        o0O0OO00.OooO0o(comparator, "comparator");
        return comparator.compare(t, t2) >= 0 ? t : t2;
    }

    @SinceKotlin(version = "1.1")
    public static final <T> T OooO0O0(T t, T t2, @NotNull Comparator<? super T> comparator) {
        o0O0OO00.OooO0o(comparator, "comparator");
        return comparator.compare(t, t2) <= 0 ? t : t2;
    }
}
