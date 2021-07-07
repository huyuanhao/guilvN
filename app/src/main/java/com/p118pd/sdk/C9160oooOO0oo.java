package com.p118pd.sdk;

import kotlin.NotImplementedError;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

/* renamed from: com.pd.sdk.oooOO0oo  reason: case insensitive filesystem */
public class C9160oooOO0oo {
    @InlineOnly
    public static final Void OooO00o() {
        throw new NotImplementedError(null, 1, null);
    }

    @InlineOnly
    public static final <T> T OooO0O0(T t, O00O0OOO<? super T, C9174oooOOooO> o00o0ooo) {
        o00o0ooo.invoke(t);
        return t;
    }

    @InlineOnly
    public static final <T, R> R OooO0OO(T t, O00O0OOO<? super T, ? extends R> o00o0ooo) {
        return (R) o00o0ooo.invoke(t);
    }

    @InlineOnly
    public static final <T, R> R OooO0Oo(T t, O00O0OOO<? super T, ? extends R> o00o0ooo) {
        return (R) o00o0ooo.invoke(t);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final <T> T OooO0o(T t, O00O0OOO<? super T, Boolean> o00o0ooo) {
        if (!o00o0ooo.invoke(t).booleanValue()) {
            return t;
        }
        return null;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final <T> T OooO0o0(T t, O00O0OOO<? super T, Boolean> o00o0ooo) {
        if (o00o0ooo.invoke(t).booleanValue()) {
            return t;
        }
        return null;
    }

    @InlineOnly
    public static final <T, R> R OooO0oO(T t, O00O0OOO<? super T, ? extends R> o00o0ooo) {
        return (R) o00o0ooo.invoke(t);
    }

    @InlineOnly
    public static final Void OooO00o(String str) {
        throw new NotImplementedError("An operation is not implemented: " + str);
    }

    @InlineOnly
    public static final <R> R OooO00o(O00O0000<? extends R> o00o0000) {
        return (R) o00o0000.invoke();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final <T> T OooO00o(T t, O00O0OOO<? super T, C9174oooOOooO> o00o0ooo) {
        o00o0ooo.invoke(t);
        return t;
    }

    @InlineOnly
    public static final void OooO00o(int i, O00O0OOO<? super Integer, C9174oooOOooO> o00o0ooo) {
        for (int i2 = 0; i2 < i; i2++) {
            o00o0ooo.invoke(Integer.valueOf(i2));
        }
    }
}
