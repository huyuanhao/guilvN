package com.p118pd.sdk;

import kotlin.Result;
import kotlin.coroutines.experimental.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.O000000 */
public final class O000000<T> implements AbstractC9285oooooOO<T> {
    @NotNull
    public final AbstractC9282oooooO0<T> OooO00o;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CoroutineContext f16936OooO00o;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.oooooO0<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public O000000(@NotNull AbstractC9282oooooO0<? super T> oooooo0) {
        o0O0OO00.OooO0o(oooooo0, "continuation");
        this.OooO00o = oooooo0;
        this.f16936OooO00o = O000.OooO00o(oooooo0.getContext());
    }

    @NotNull
    public final AbstractC9282oooooO0<T> OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC9285oooooOO
    @NotNull
    public CoroutineContext getContext() {
        return this.f16936OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC9285oooooOO
    public void resume(T t) {
        AbstractC9282oooooO0<T> oooooo0 = this.OooO00o;
        Result.OooO00o oooO00o = Result.Companion;
        oooooo0.resumeWith(Result.m22101constructorimpl(t));
    }

    @Override // com.p118pd.sdk.AbstractC9285oooooOO
    public void resumeWithException(@NotNull Throwable th) {
        o0O0OO00.OooO0o(th, "exception");
        AbstractC9282oooooO0<T> oooooo0 = this.OooO00o;
        Result.OooO00o oooO00o = Result.Companion;
        oooooo0.resumeWith(Result.m22101constructorimpl(C9157oooOO0Oo.OooO00o(th)));
    }
}
