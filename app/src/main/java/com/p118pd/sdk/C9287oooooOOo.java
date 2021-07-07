package com.p118pd.sdk;

import kotlin.NotImplementedError;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.coroutines.experimental.CoroutineContext;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@JvmName(name = "CoroutinesKt")
/* renamed from: com.pd.sdk.oooooOOo  reason: case insensitive filesystem */
public final class C9287oooooOOo {
    @SinceKotlin(version = "1.1")
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <R, T> void m21217OooO00o(@NotNull O00Oo000<? super R, ? super AbstractC9285oooooOO<? super T>, ? extends Object> o00Oo000, R r, @NotNull AbstractC9285oooooOO<? super T> ooooooo) {
        o0O0OO00.OooO0o(o00Oo000, "receiver$0");
        o0O0OO00.OooO0o(ooooooo, "completion");
        C9295ooooooOo.OooO00o((O00Oo000) o00Oo000, (Object) r, (AbstractC9285oooooOO) ooooooo).resume(C9174oooOOooO.OooO00o);
    }

    @SinceKotlin(version = "1.1")
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> void m21216OooO00o(@NotNull O00O0OOO<? super AbstractC9285oooooOO<? super T>, ? extends Object> o00o0ooo, @NotNull AbstractC9285oooooOO<? super T> ooooooo) {
        o0O0OO00.OooO0o(o00o0ooo, "receiver$0");
        o0O0OO00.OooO0o(ooooooo, "completion");
        C9295ooooooOo.OooO00o((O00O0OOO) o00o0ooo, (AbstractC9285oooooOO) ooooooo).resume(C9174oooOOooO.OooO00o);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <R, T> AbstractC9285oooooOO<C9174oooOOooO> OooO00o(@NotNull O00Oo000<? super R, ? super AbstractC9285oooooOO<? super T>, ? extends Object> o00Oo000, R r, @NotNull AbstractC9285oooooOO<? super T> ooooooo) {
        o0O0OO00.OooO0o(o00Oo000, "receiver$0");
        o0O0OO00.OooO0o(ooooooo, "completion");
        return new SafeContinuation(C9295ooooooOo.OooO00o((O00Oo000) o00Oo000, (Object) r, (AbstractC9285oooooOO) ooooooo), C9295ooooooOo.OooO00o());
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T> AbstractC9285oooooOO<C9174oooOOooO> OooO00o(@NotNull O00O0OOO<? super AbstractC9285oooooOO<? super T>, ? extends Object> o00o0ooo, @NotNull AbstractC9285oooooOO<? super T> ooooooo) {
        o0O0OO00.OooO0o(o00o0ooo, "receiver$0");
        o0O0OO00.OooO0o(ooooooo, "completion");
        return new SafeContinuation(C9295ooooooOo.OooO00o((O00O0OOO) o00o0ooo, (AbstractC9285oooooOO) ooooooo), C9295ooooooOo.OooO00o());
    }

    @SinceKotlin(version = "1.1")
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> Object m21215OooO00o(O00O0OOO<? super AbstractC9285oooooOO<? super T>, C9174oooOOooO> o00o0ooo, AbstractC9285oooooOO<? super T> ooooooo) {
        o0O0O0OO.OooO0OO(0);
        SafeContinuation oooooo00 = new SafeContinuation(C9297oooooooo.OooO00o(ooooooo));
        o00o0ooo.invoke(oooooo00);
        Object OooO00o = oooooo00.OooO00o();
        o0O0O0OO.OooO0OO(1);
        return OooO00o;
    }

    public static final CoroutineContext OooO00o() {
        throw new NotImplementedError("Implemented as intrinsic");
    }

    @InlineOnly
    public static final void OooO00o(AbstractC9285oooooOO<?> ooooooo, O00O0000<? extends Object> o00o0000) {
        try {
            Object invoke = o00o0000.invoke();
            if (invoke == C9295ooooooOo.OooO00o()) {
                return;
            }
            if (ooooooo != null) {
                ooooooo.resume(invoke);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.Continuation<kotlin.Any?>");
        } catch (Throwable th) {
            ooooooo.resumeWithException(th);
        }
    }
}
