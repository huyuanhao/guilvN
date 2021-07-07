package com.p118pd.sdk;

import com.umeng.analytics.pro.C3416b;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
/* renamed from: com.pd.sdk.oooooO00  reason: case insensitive filesystem */
public abstract class AbstractC9283oooooO00 implements CoroutineContext.Element {
    @NotNull
    public final CoroutineContext.OooO0O0<?> OooO00o;

    public AbstractC9283oooooO00(@NotNull CoroutineContext.OooO0O0<?> oooO0O0) {
        o0O0OO00.OooO0o(oooO0O0, "key");
        this.OooO00o = oooO0O0;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.OooO0O0<?> OooO00o() {
        return this.OooO00o;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull O00Oo000<? super R, ? super CoroutineContext.Element, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(o00Oo000, "operation");
        return (R) CoroutineContext.Element.OooO00o.OooO00o(this, r, o00Oo000);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.OooO0O0<E> oooO0O0) {
        o0O0OO00.OooO0o(oooO0O0, "key");
        return (E) CoroutineContext.Element.OooO00o.OooO00o(this, oooO0O0);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.OooO0O0<?> oooO0O0) {
        o0O0OO00.OooO0o(oooO0O0, "key");
        return CoroutineContext.Element.OooO00o.m22791OooO00o((CoroutineContext.Element) this, oooO0O0);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        o0O0OO00.OooO0o(coroutineContext, C3416b.f8433Q);
        return CoroutineContext.Element.OooO00o.OooO00o(this, coroutineContext);
    }
}
