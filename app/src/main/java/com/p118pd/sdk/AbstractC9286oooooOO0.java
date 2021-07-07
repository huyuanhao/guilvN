package com.p118pd.sdk;

import com.umeng.analytics.pro.C3416b;
import kotlin.SinceKotlin;
import kotlin.coroutines.experimental.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
/* renamed from: com.pd.sdk.oooooOO0  reason: case insensitive filesystem */
public abstract class AbstractC9286oooooOO0 implements CoroutineContext.Element {
    @NotNull
    public final CoroutineContext.OooO0O0<?> OooO00o;

    public AbstractC9286oooooOO0(@NotNull CoroutineContext.OooO0O0<?> oooO0O0) {
        o0O0OO00.OooO0o(oooO0O0, "key");
        this.OooO00o = oooO0O0;
    }

    @Override // kotlin.coroutines.experimental.CoroutineContext.Element, kotlin.coroutines.experimental.CoroutineContext.Element, kotlin.coroutines.experimental.CoroutineContext, kotlin.coroutines.experimental.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E OooO00o(@NotNull CoroutineContext.OooO0O0<E> oooO0O0) {
        o0O0OO00.OooO0o(oooO0O0, "key");
        return (E) CoroutineContext.Element.OooO00o.OooO00o(this, oooO0O0);
    }

    @Override // kotlin.coroutines.experimental.CoroutineContext.Element, kotlin.coroutines.experimental.CoroutineContext
    public <R> R fold(R r, @NotNull O00Oo000<? super R, ? super CoroutineContext.Element, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(o00Oo000, "operation");
        return (R) CoroutineContext.Element.OooO00o.OooO00o(this, r, o00Oo000);
    }

    @Override // kotlin.coroutines.experimental.CoroutineContext.Element
    @NotNull
    public CoroutineContext.OooO0O0<?> OooO00o() {
        return this.OooO00o;
    }

    @Override // kotlin.coroutines.experimental.CoroutineContext.Element, kotlin.coroutines.experimental.CoroutineContext.Element, kotlin.coroutines.experimental.CoroutineContext, kotlin.coroutines.experimental.CoroutineContext
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CoroutineContext m21213OooO00o(@NotNull CoroutineContext.OooO0O0<?> oooO0O0) {
        o0O0OO00.OooO0o(oooO0O0, "key");
        return CoroutineContext.Element.OooO00o.m22797OooO00o((CoroutineContext.Element) this, oooO0O0);
    }

    @Override // kotlin.coroutines.experimental.CoroutineContext
    @NotNull
    public CoroutineContext OooO00o(@NotNull CoroutineContext coroutineContext) {
        o0O0OO00.OooO0o(coroutineContext, C3416b.f8433Q);
        return CoroutineContext.Element.OooO00o.OooO00o(this, coroutineContext);
    }
}
