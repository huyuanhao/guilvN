package com.p118pd.sdk;

import com.umeng.analytics.pro.C3416b;
import kotlin.SinceKotlin;
import kotlin.coroutines.experimental.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
/* renamed from: com.pd.sdk.oooooOoo  reason: case insensitive filesystem */
public final class C9289oooooOoo implements CoroutineContext {
    public static final C9289oooooOoo OooO00o = new C9289oooooOoo();

    @Override // kotlin.coroutines.experimental.CoroutineContext, kotlin.coroutines.experimental.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E OooO00o(@NotNull CoroutineContext.OooO0O0<E> oooO0O0) {
        o0O0OO00.OooO0o(oooO0O0, "key");
        return null;
    }

    @Override // kotlin.coroutines.experimental.CoroutineContext, kotlin.coroutines.experimental.CoroutineContext
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CoroutineContext m21220OooO00o(@NotNull CoroutineContext.OooO0O0<?> oooO0O0) {
        o0O0OO00.OooO0o(oooO0O0, "key");
        return this;
    }

    @Override // kotlin.coroutines.experimental.CoroutineContext
    @NotNull
    public CoroutineContext OooO00o(@NotNull CoroutineContext coroutineContext) {
        o0O0OO00.OooO0o(coroutineContext, C3416b.f8433Q);
        return coroutineContext;
    }

    @Override // kotlin.coroutines.experimental.CoroutineContext
    public <R> R fold(R r, @NotNull O00Oo000<? super R, ? super CoroutineContext.Element, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(o00Oo000, "operation");
        return r;
    }

    public int hashCode() {
        return 0;
    }

    @NotNull
    public String toString() {
        return "EmptyCoroutineContext";
    }
}
