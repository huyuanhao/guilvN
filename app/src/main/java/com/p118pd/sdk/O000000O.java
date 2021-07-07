package com.p118pd.sdk;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.O000000O */
public final class O000000O<T1, R> implements O00Oo000<T1, AbstractC9285oooooOO<? super R>, Object> {
    @NotNull
    public final O00Oo000<T1, AbstractC9282oooooO0<? super R>, Object> OooO00o;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.O00Oo000<? super T1, ? super com.pd.sdk.oooooO0<? super R>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public O000000O(@NotNull O00Oo000<? super T1, ? super AbstractC9282oooooO0<? super R>, ? extends Object> o00Oo000) {
        o0O0OO00.OooO0o(o00Oo000, "function");
        this.OooO00o = o00Oo000;
    }

    @NotNull
    public final O00Oo000<T1, AbstractC9282oooooO0<? super R>, Object> OooO00o() {
        return this.OooO00o;
    }

    @Nullable
    /* renamed from: OooO00o */
    public Object invoke(T1 t1, @NotNull AbstractC9285oooooOO<? super R> ooooooo) {
        o0O0OO00.OooO0o(ooooooo, "continuation");
        return this.OooO00o.invoke(t1, O000.OooO00o(ooooooo));
    }
}
