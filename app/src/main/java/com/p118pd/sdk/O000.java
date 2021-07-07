package com.p118pd.sdk;

import kotlin.SinceKotlin;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.experimental.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.O000 */
public final class O000 {
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> AbstractC9285oooooOO<T> OooO00o(@NotNull AbstractC9282oooooO0<? super T> oooooo0) {
        AbstractC9285oooooOO<T> OooO00o;
        o0O0OO00.OooO0o(oooooo0, "receiver$0");
        O00 o00 = (O00) (!(oooooo0 instanceof O00) ? null : oooooo0);
        return (o00 == null || (OooO00o = o00.OooO00o()) == null) ? new O000000(oooooo0) : OooO00o;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> AbstractC9282oooooO0<T> OooO00o(@NotNull AbstractC9285oooooOO<? super T> ooooooo) {
        AbstractC9282oooooO0<T> OooO00o;
        o0O0OO00.OooO0o(ooooooo, "receiver$0");
        O000000 o000000 = (O000000) (!(ooooooo instanceof O000000) ? null : ooooooo);
        return (o000000 == null || (OooO00o = o000000.OooO00o()) == null) ? new O00(ooooooo) : OooO00o;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final CoroutineContext OooO00o(@NotNull kotlin.coroutines.CoroutineContext coroutineContext) {
        CoroutineContext coroutineContext2;
        o0O0OO00.OooO0o(coroutineContext, "receiver$0");
        ContinuationInterceptor ooooooo0 = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.OooO00o);
        ContextMigration o = (ContextMigration) coroutineContext.get(ContextMigration.OooO00o);
        kotlin.coroutines.CoroutineContext minusKey = coroutineContext.minusKey(ContinuationInterceptor.OooO00o).minusKey(ContextMigration.OooO00o);
        if (o == null || (coroutineContext2 = o.OooO00o()) == null) {
            coroutineContext2 = C9289oooooOoo.OooO00o;
        }
        if (minusKey != EmptyCoroutineContext.INSTANCE) {
            coroutineContext2 = coroutineContext2.OooO00o(new ExperimentalContextMigration(minusKey));
        }
        return ooooooo0 == null ? coroutineContext2 : coroutineContext2.OooO00o(OooO00o(ooooooo0));
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final kotlin.coroutines.CoroutineContext OooO00o(@NotNull CoroutineContext coroutineContext) {
        kotlin.coroutines.CoroutineContext coroutineContext2;
        o0O0OO00.OooO0o(coroutineContext, "receiver$0");
        ContinuationInterceptor oooooooo = (ContinuationInterceptor) coroutineContext.OooO00o((CoroutineContext.OooO0O0) ContinuationInterceptor.OooO00o);
        ExperimentalContextMigration o0000 = (ExperimentalContextMigration) coroutineContext.OooO00o((CoroutineContext.OooO0O0) ExperimentalContextMigration.OooO00o);
        CoroutineContext OooO00o = coroutineContext.m22795OooO00o((CoroutineContext.OooO0O0<?>) ContinuationInterceptor.OooO00o).m22795OooO00o((CoroutineContext.OooO0O0<?>) ExperimentalContextMigration.OooO00o);
        if (o0000 == null || (coroutineContext2 = o0000.OooO00o()) == null) {
            coroutineContext2 = EmptyCoroutineContext.INSTANCE;
        }
        if (OooO00o != C9289oooooOoo.OooO00o) {
            coroutineContext2 = coroutineContext2.plus(new ContextMigration(OooO00o));
        }
        return oooooooo == null ? coroutineContext2 : coroutineContext2.plus(OooO00o(oooooooo));
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final ContinuationInterceptor OooO00o(@NotNull ContinuationInterceptor ooooooo0) {
        ContinuationInterceptor OooO00o;
        o0O0OO00.OooO0o(ooooooo0, "receiver$0");
        C1685O0 o0 = (C1685O0) (!(ooooooo0 instanceof C1685O0) ? null : ooooooo0);
        return (o0 == null || (OooO00o = o0.OooO00o()) == null) ? new O00000(ooooooo0) : OooO00o;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final ContinuationInterceptor OooO00o(@NotNull ContinuationInterceptor oooooooo) {
        ContinuationInterceptor OooO00o;
        o0O0OO00.OooO0o(oooooooo, "receiver$0");
        O00000 o00000 = (O00000) (!(oooooooo instanceof O00000) ? null : oooooooo);
        return (o00000 == null || (OooO00o = o00000.OooO00o()) == null) ? new C1685O0(oooooooo) : OooO00o;
    }

    @NotNull
    public static final <R> O00O0OOO<AbstractC9285oooooOO<? super R>, Object> OooO00o(@NotNull O00O0OOO<? super AbstractC9282oooooO0<? super R>, ? extends Object> o00o0ooo) {
        o0O0OO00.OooO0o(o00o0ooo, "receiver$0");
        return new O0000000(o00o0ooo);
    }

    @NotNull
    public static final <T1, R> O00Oo000<T1, AbstractC9285oooooOO<? super R>, Object> OooO00o(@NotNull O00Oo000<? super T1, ? super AbstractC9282oooooO0<? super R>, ? extends Object> o00Oo000) {
        o0O0OO00.OooO0o(o00Oo000, "receiver$0");
        return new O000000O(o00Oo000);
    }

    @NotNull
    public static final <T1, T2, R> O00Oo00O<T1, T2, AbstractC9285oooooOO<? super R>, Object> OooO00o(@NotNull O00Oo00O<? super T1, ? super T2, ? super AbstractC9282oooooO0<? super R>, ? extends Object> o00Oo00O) {
        o0O0OO00.OooO0o(o00Oo00O, "receiver$0");
        return new O00000O(o00Oo00O);
    }
}
