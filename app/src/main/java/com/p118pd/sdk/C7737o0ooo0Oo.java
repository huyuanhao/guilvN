package com.p118pd.sdk;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.o0ooo0Oo  reason: case insensitive filesystem */
public final class C7737o0ooo0Oo<T> implements AbstractC7719o0ooOO00<Object, T> {
    public T OooO00o;

    @Override // com.p118pd.sdk.AbstractC7719o0ooOO00
    @NotNull
    public T OooO00o(@Nullable Object obj, @NotNull KProperty<?> oo0o00o0) {
        o0O0OO00.OooO0o(oo0o00o0, C8404oOoo0O00.OooOO0);
        T t = this.OooO00o;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Property " + oo0o00o0.getName() + " should be initialized before get.");
    }

    @Override // com.p118pd.sdk.AbstractC7719o0ooOO00
    public void OooO00o(@Nullable Object obj, @NotNull KProperty<?> oo0o00o0, @NotNull T t) {
        o0O0OO00.OooO0o(oo0o00o0, C8404oOoo0O00.OooOO0);
        o0O0OO00.OooO0o(t, "value");
        this.OooO00o = t;
    }
}
