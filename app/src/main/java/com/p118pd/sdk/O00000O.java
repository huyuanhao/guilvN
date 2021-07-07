package com.p118pd.sdk;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.O00000O */
public final class O00000O<T1, T2, R> implements O00Oo00O<T1, T2, AbstractC9285oooooOO<? super R>, Object> {
    @NotNull
    public final O00Oo00O<T1, T2, AbstractC9282oooooO0<? super R>, Object> OooO00o;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.O00Oo00O<? super T1, ? super T2, ? super com.pd.sdk.oooooO0<? super R>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public O00000O(@NotNull O00Oo00O<? super T1, ? super T2, ? super AbstractC9282oooooO0<? super R>, ? extends Object> o00Oo00O) {
        o0O0OO00.OooO0o(o00Oo00O, "function");
        this.OooO00o = o00Oo00O;
    }

    @NotNull
    public final O00Oo00O<T1, T2, AbstractC9282oooooO0<? super R>, Object> OooO00o() {
        return this.OooO00o;
    }

    @Nullable
    /* renamed from: OooO00o */
    public Object invoke(T1 t1, T2 t2, @NotNull AbstractC9285oooooOO<? super R> ooooooo) {
        o0O0OO00.OooO0o(ooooooo, "continuation");
        return this.OooO00o.invoke(t1, t2, O000.OooO00o(ooooooo));
    }
}
