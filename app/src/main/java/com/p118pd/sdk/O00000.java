package com.p118pd.sdk;

import com.umeng.analytics.pro.C3416b;
import kotlin.coroutines.experimental.ContinuationInterceptor;
import kotlin.coroutines.experimental.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.O00000 */
public final class O00000 implements ContinuationInterceptor {
    @NotNull
    public final ContinuationInterceptor OooO00o;

    public O00000(@NotNull ContinuationInterceptor ooooooo0) {
        o0O0OO00.OooO0o(ooooooo0, "interceptor");
        this.OooO00o = ooooooo0;
    }

    @Override // kotlin.coroutines.experimental.CoroutineContext.Element, kotlin.coroutines.experimental.CoroutineContext.Element, kotlin.coroutines.experimental.CoroutineContext, kotlin.coroutines.experimental.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E OooO00o(@NotNull CoroutineContext.OooO0O0<E> oooO0O0) {
        o0O0OO00.OooO0o(oooO0O0, "key");
        return (E) ContinuationInterceptor.OooO00o.OooO00o(this, oooO0O0);
    }

    @Override // kotlin.coroutines.experimental.CoroutineContext.Element, kotlin.coroutines.experimental.CoroutineContext
    public <R> R fold(R r, @NotNull O00Oo000<? super R, ? super CoroutineContext.Element, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(o00Oo000, "operation");
        return (R) ContinuationInterceptor.OooO00o.OooO00o(this, r, o00Oo000);
    }

    @Override // kotlin.coroutines.experimental.CoroutineContext.Element
    @NotNull
    public final ContinuationInterceptor OooO00o() {
        return this.OooO00o;
    }

    @Override // kotlin.coroutines.experimental.CoroutineContext.Element, kotlin.coroutines.experimental.CoroutineContext.Element, kotlin.coroutines.experimental.CoroutineContext, kotlin.coroutines.experimental.CoroutineContext
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CoroutineContext m16498OooO00o(@NotNull CoroutineContext.OooO0O0<?> oooO0O0) {
        o0O0OO00.OooO0o(oooO0O0, "key");
        return ContinuationInterceptor.OooO00o.m21214OooO00o((ContinuationInterceptor) this, oooO0O0);
    }

    @Override // kotlin.coroutines.experimental.CoroutineContext
    @NotNull
    public CoroutineContext OooO00o(@NotNull CoroutineContext coroutineContext) {
        o0O0OO00.OooO0o(coroutineContext, C3416b.f8433Q);
        return ContinuationInterceptor.OooO00o.OooO00o(this, coroutineContext);
    }

    @Override // kotlin.coroutines.experimental.CoroutineContext.Element
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CoroutineContext.OooO0O0<?> m16497OooO00o() {
        return ContinuationInterceptor.OooO00o;
    }

    @Override // kotlin.coroutines.experimental.ContinuationInterceptor
    @NotNull
    public <T> AbstractC9285oooooOO<T> OooO00o(@NotNull AbstractC9285oooooOO<? super T> ooooooo) {
        o0O0OO00.OooO0o(ooooooo, "continuation");
        return O000.OooO00o(this.OooO00o.OooO00o((AbstractC9282oooooO0) O000.OooO00o(ooooooo)));
    }
}
