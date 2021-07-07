package com.p118pd.sdk;

import com.umeng.analytics.pro.C3416b;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.O0 */
public final class C1685O0 implements ContinuationInterceptor {
    @NotNull
    public final ContinuationInterceptor OooO00o;

    public C1685O0(@NotNull ContinuationInterceptor oooooooo) {
        o0O0OO00.OooO0o(oooooooo, "interceptor");
        this.OooO00o = oooooooo;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final ContinuationInterceptor OooO00o() {
        return this.OooO00o;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull O00Oo000<? super R, ? super CoroutineContext.Element, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(o00Oo000, "operation");
        return (R) ContinuationInterceptor.OooO00o.OooO00o(this, r, o00Oo000);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.ContinuationInterceptor, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.OooO0O0<E> oooO0O0) {
        o0O0OO00.OooO0o(oooO0O0, "key");
        return (E) ContinuationInterceptor.OooO00o.OooO00o(this, oooO0O0);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.ContinuationInterceptor, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.OooO0O0<?> oooO0O0) {
        o0O0OO00.OooO0o(oooO0O0, "key");
        return ContinuationInterceptor.OooO00o.m21219OooO00o((ContinuationInterceptor) this, oooO0O0);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        o0O0OO00.OooO0o(coroutineContext, C3416b.f8433Q);
        return ContinuationInterceptor.OooO00o.OooO00o(this, coroutineContext);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor, kotlin.coroutines.ContinuationInterceptor
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16496OooO00o(@NotNull AbstractC9282oooooO0<?> oooooo0) {
        o0O0OO00.OooO0o(oooooo0, "continuation");
        ContinuationInterceptor.OooO00o.OooO00o(this, oooooo0);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CoroutineContext.OooO0O0<?> m16495OooO00o() {
        return ContinuationInterceptor.OooO00o;
    }

    @Override // kotlin.coroutines.ContinuationInterceptor, kotlin.coroutines.ContinuationInterceptor
    @NotNull
    public <T> AbstractC9282oooooO0<T> OooO00o(@NotNull AbstractC9282oooooO0<? super T> oooooo0) {
        o0O0OO00.OooO0o(oooooo0, "continuation");
        return O000.OooO00o(this.OooO00o.OooO00o(O000.OooO00o(oooooo0)));
    }
}
