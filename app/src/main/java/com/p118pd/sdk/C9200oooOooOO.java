package com.p118pd.sdk;

import kotlin.InitializedLazyImpl;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooOooOO  reason: case insensitive filesystem */
public class C9200oooOooOO extends C9107oooO {
    @NotNull
    public static final <T> AbstractC9141oooO0oO<T> OooO00o(T t) {
        return new InitializedLazyImpl(t);
    }

    @InlineOnly
    public static final <T> T OooO00o(@NotNull AbstractC9141oooO0oO<? extends T> oooo0oo, Object obj, KProperty<?> oo0o00o0) {
        o0O0OO00.OooO0o(oooo0oo, "receiver$0");
        return (T) oooo0oo.getValue();
    }
}
