package com.p118pd.sdk;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.O0oOOO */
public abstract class O0oOOO<T> implements AbstractC7719o0ooOO00<Object, T> {
    public T OooO00o;

    public O0oOOO(T t) {
        this.OooO00o = t;
    }

    @Override // com.p118pd.sdk.AbstractC7719o0ooOO00
    public T OooO00o(@Nullable Object obj, @NotNull KProperty<?> oo0o00o0) {
        o0O0OO00.OooO0o(oo0o00o0, C8404oOoo0O00.OooOO0);
        return this.OooO00o;
    }

    public void OooO00o(@NotNull KProperty<?> oo0o00o0, T t, T t2) {
        o0O0OO00.OooO0o(oo0o00o0, C8404oOoo0O00.OooOO0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16525OooO00o(@NotNull KProperty<?> oo0o00o0, T t, T t2) {
        o0O0OO00.OooO0o(oo0o00o0, C8404oOoo0O00.OooOO0);
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC7719o0ooOO00
    public void OooO00o(@Nullable Object obj, @NotNull KProperty<?> oo0o00o0, T t) {
        o0O0OO00.OooO0o(oo0o00o0, C8404oOoo0O00.OooOO0);
        T t2 = this.OooO00o;
        if (m16525OooO00o(oo0o00o0, (Object) t2, (Object) t)) {
            this.OooO00o = t;
            OooO00o(oo0o00o0, (Object) t2, (Object) t);
        }
    }
}
