package com.p118pd.sdk;

import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SafePublicationLazyImpl;
import kotlin.SynchronizedLazyImpl;
import kotlin.UnsafeLazyImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.oooO  reason: case insensitive filesystem */
public class C9107oooO {
    @NotNull
    public static final <T> AbstractC9141oooO0oO<T> OooO00o(@NotNull O00O0000<? extends T> o00o0000) {
        o0O0OO00.OooO0o(o00o0000, "initializer");
        return new SynchronizedLazyImpl(o00o0000, null, 2, null);
    }

    @NotNull
    public static final <T> AbstractC9141oooO0oO<T> OooO00o(@NotNull LazyThreadSafetyMode lazyThreadSafetyMode, @NotNull O00O0000<? extends T> o00o0000) {
        o0O0OO00.OooO0o(lazyThreadSafetyMode, "mode");
        o0O0OO00.OooO0o(o00o0000, "initializer");
        int i = C9145oooO0oo.OooO00o[lazyThreadSafetyMode.ordinal()];
        if (i == 1) {
            return new SynchronizedLazyImpl(o00o0000, null, 2, null);
        }
        if (i == 2) {
            return new SafePublicationLazyImpl(o00o0000);
        }
        if (i == 3) {
            return new UnsafeLazyImpl(o00o0000);
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final <T> AbstractC9141oooO0oO<T> OooO00o(@Nullable Object obj, @NotNull O00O0000<? extends T> o00o0000) {
        o0O0OO00.OooO0o(o00o0000, "initializer");
        return new SynchronizedLazyImpl(o00o0000, obj);
    }
}
