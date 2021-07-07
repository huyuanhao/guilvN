package com.p118pd.sdk;

import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.O00 */
public final class O00<T> implements AbstractC9282oooooO0<T> {
    @NotNull
    public final AbstractC9285oooooOO<T> OooO00o;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CoroutineContext f16934OooO00o;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.oooooOO<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public O00(@NotNull AbstractC9285oooooOO<? super T> ooooooo) {
        o0O0OO00.OooO0o(ooooooo, "continuation");
        this.OooO00o = ooooooo;
        this.f16934OooO00o = O000.OooO00o(ooooooo.getContext());
    }

    @NotNull
    public final AbstractC9285oooooOO<T> OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC9282oooooO0
    @NotNull
    public CoroutineContext getContext() {
        return this.f16934OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC9282oooooO0
    public void resumeWith(@NotNull Object obj) {
        if (Result.m22107isSuccessimpl(obj)) {
            this.OooO00o.resume(obj);
        }
        Throwable r2 = Result.m22104exceptionOrNullimpl(obj);
        if (r2 != null) {
            this.OooO00o.resumeWithException(r2);
        }
    }
}
