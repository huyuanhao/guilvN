package com.p118pd.sdk;

import com.umeng.analytics.pro.C3416b;
import kotlin.coroutines.experimental.CoroutineContext;
import kotlin.coroutines.experimental.jvm.internal.CoroutineImpl;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@JvmName(name = "CoroutineIntrinsics")
/* renamed from: com.pd.sdk.oooooooo  reason: case insensitive filesystem */
public final class C9297oooooooo {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.pd.sdk.oooooOO<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> AbstractC9285oooooOO<T> OooO00o(@NotNull AbstractC9285oooooOO<? super T> ooooooo) {
        AbstractC9285oooooOO<T> ooooooo2;
        o0O0OO00.OooO0o(ooooooo, "continuation");
        CoroutineImpl coroutineImpl = !(ooooooo instanceof CoroutineImpl) ? null : ooooooo;
        return (coroutineImpl == null || (ooooooo2 = (AbstractC9285oooooOO<T>) coroutineImpl.getFacade()) == null) ? ooooooo : ooooooo2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.oooooOO<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> AbstractC9285oooooOO<T> OooO00o(@NotNull CoroutineContext coroutineContext, @NotNull AbstractC9285oooooOO<? super T> ooooooo) {
        AbstractC9285oooooOO<T> OooO00o;
        o0O0OO00.OooO0o(coroutineContext, C3416b.f8433Q);
        o0O0OO00.OooO0o(ooooooo, "continuation");
        ContinuationInterceptor oooooooo = (ContinuationInterceptor) coroutineContext.OooO00o((CoroutineContext.OooO0O0) ContinuationInterceptor.OooO00o);
        return (oooooooo == null || (OooO00o = oooooooo.OooO00o(ooooooo)) == null) ? ooooooo : OooO00o;
    }
}
