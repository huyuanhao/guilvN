package com.p118pd.sdk;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.coroutines.experimental.CoroutineContext;
import kotlin.coroutines.experimental.jvm.internal.CoroutineImpl;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u00002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a:\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u00072\u0010\b\u0004\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\b¢\u0006\u0002\b\r\u001aD\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\"\u0004\b\u0000\u0010\t*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u0007H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a]\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\t*#\b\u0001\u0012\u0004\u0012\u0002H\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012¢\u0006\u0002\b\u00132\u0006\u0010\u0014\u001a\u0002H\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u0007H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001aA\u0010\u0016\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\t*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u0007H\bø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001aZ\u0010\u0016\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\t*#\b\u0001\u0012\u0004\u0012\u0002H\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012¢\u0006\u0002\b\u00132\u0006\u0010\u0014\u001a\u0002H\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u0007H\bø\u0001\u0000¢\u0006\u0002\u0010\u0018\"\u001a\u0010\u0000\u001a\u00020\u00018FX\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\t¨\u0006\u0019"}, mo43195d2 = {"COROUTINE_SUSPENDED", "", "COROUTINE_SUSPENDED$annotations", "()V", "getCOROUTINE_SUSPENDED", "()Ljava/lang/Object;", "buildContinuationByInvokeCall", "Lkotlin/coroutines/experimental/Continuation;", "", "T", "completion", "block", "Lkotlin/Function0;", "buildContinuationByInvokeCall$IntrinsicsKt__IntrinsicsJvmKt", "createCoroutineUnchecked", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/experimental/Continuation;)Lkotlin/coroutines/experimental/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/experimental/Continuation;)Lkotlin/coroutines/experimental/Continuation;", "startCoroutineUninterceptedOrReturn", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "kotlin-stdlib_coroutines"}, mo43196k = 5, mo43197mv = {1, 1, 13}, mo43199xi = 1, mo43200xs = "kotlin/coroutines/experimental/intrinsics/IntrinsicsKt")
/* renamed from: com.pd.sdk.ooooooOo  reason: case insensitive filesystem */
public class C9295ooooooOo {

    /* renamed from: com.pd.sdk.ooooooOo$OooO00o */
    public static final class OooO00o implements AbstractC9285oooooOO<C9174oooOOooO> {
        public final /* synthetic */ O00O0000 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9285oooooOO f22713OooO00o;

        public OooO00o(AbstractC9285oooooOO ooooooo, O00O0000 o00o0000) {
            this.f22713OooO00o = ooooooo;
            this.OooO00o = o00o0000;
        }

        /* renamed from: OooO00o */
        public void resume(@NotNull C9174oooOOooO oooooooo) {
            o0O0OO00.OooO0o(oooooooo, "value");
            AbstractC9285oooooOO ooooooo = this.f22713OooO00o;
            try {
                Object invoke = this.OooO00o.invoke();
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

        @Override // com.p118pd.sdk.AbstractC9285oooooOO
        @NotNull
        public CoroutineContext getContext() {
            return this.f22713OooO00o.getContext();
        }

        @Override // com.p118pd.sdk.AbstractC9285oooooOO
        public void resumeWithException(@NotNull Throwable th) {
            o0O0OO00.OooO0o(th, "exception");
            this.f22713OooO00o.resumeWithException(th);
        }
    }

    /* renamed from: com.pd.sdk.ooooooOo$OooO0O0 */
    public static final class OooO0O0 implements AbstractC9285oooooOO<C9174oooOOooO> {
        public final /* synthetic */ O00O0OOO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9285oooooOO f22714OooO00o;
        public final /* synthetic */ AbstractC9285oooooOO OooO0O0;

        public OooO0O0(AbstractC9285oooooOO ooooooo, O00O0OOO o00o0ooo, AbstractC9285oooooOO ooooooo2) {
            this.f22714OooO00o = ooooooo;
            this.OooO00o = o00o0ooo;
            this.OooO0O0 = ooooooo2;
        }

        /* renamed from: OooO00o */
        public void resume(@NotNull C9174oooOOooO oooooooo) {
            o0O0OO00.OooO0o(oooooooo, "value");
            AbstractC9285oooooOO ooooooo = this.f22714OooO00o;
            try {
                O00O0OOO o00o0ooo = this.OooO00o;
                if (o00o0ooo != null) {
                    Object invoke = ((O00O0OOO) C7367o0OO00oO.OooO00o((Object) o00o0ooo, 1)).invoke(this.OooO0O0);
                    if (invoke == C9295ooooooOo.OooO00o()) {
                        return;
                    }
                    if (ooooooo != null) {
                        ooooooo.resume(invoke);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.Continuation<kotlin.Any?>");
                }
                throw new TypeCastException("null cannot be cast to non-null type (kotlin.coroutines.experimental.Continuation<T>) -> kotlin.Any?");
            } catch (Throwable th) {
                ooooooo.resumeWithException(th);
            }
        }

        @Override // com.p118pd.sdk.AbstractC9285oooooOO
        @NotNull
        public CoroutineContext getContext() {
            return this.f22714OooO00o.getContext();
        }

        @Override // com.p118pd.sdk.AbstractC9285oooooOO
        public void resumeWithException(@NotNull Throwable th) {
            o0O0OO00.OooO0o(th, "exception");
            this.f22714OooO00o.resumeWithException(th);
        }
    }

    /* renamed from: com.pd.sdk.ooooooOo$OooO0OO */
    public static final class OooO0OO implements AbstractC9285oooooOO<C9174oooOOooO> {
        public final /* synthetic */ O00Oo000 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9285oooooOO f22715OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f22716OooO00o;
        public final /* synthetic */ AbstractC9285oooooOO OooO0O0;

        public OooO0OO(AbstractC9285oooooOO ooooooo, O00Oo000 o00Oo000, Object obj, AbstractC9285oooooOO ooooooo2) {
            this.f22715OooO00o = ooooooo;
            this.OooO00o = o00Oo000;
            this.f22716OooO00o = obj;
            this.OooO0O0 = ooooooo2;
        }

        /* renamed from: OooO00o */
        public void resume(@NotNull C9174oooOOooO oooooooo) {
            o0O0OO00.OooO0o(oooooooo, "value");
            AbstractC9285oooooOO ooooooo = this.f22715OooO00o;
            try {
                O00Oo000 o00Oo000 = this.OooO00o;
                if (o00Oo000 != null) {
                    Object invoke = ((O00Oo000) C7367o0OO00oO.OooO00o((Object) o00Oo000, 2)).invoke(this.f22716OooO00o, this.OooO0O0);
                    if (invoke == C9295ooooooOo.OooO00o()) {
                        return;
                    }
                    if (ooooooo != null) {
                        ooooooo.resume(invoke);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.Continuation<kotlin.Any?>");
                }
                throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.experimental.Continuation<T>) -> kotlin.Any?");
            } catch (Throwable th) {
                ooooooo.resumeWithException(th);
            }
        }

        @Override // com.p118pd.sdk.AbstractC9285oooooOO
        @NotNull
        public CoroutineContext getContext() {
            return this.f22715OooO00o.getContext();
        }

        @Override // com.p118pd.sdk.AbstractC9285oooooOO
        public void resumeWithException(@NotNull Throwable th) {
            o0O0OO00.OooO0o(th, "exception");
            this.f22715OooO00o.resumeWithException(th);
        }
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> Object m21224OooO00o(@NotNull O00O0OOO<? super AbstractC9285oooooOO<? super T>, ? extends Object> o00o0ooo, AbstractC9285oooooOO<? super T> ooooooo) {
        if (o00o0ooo != null) {
            return ((O00O0OOO) C7367o0OO00oO.OooO00o((Object) o00o0ooo, 1)).invoke(ooooooo);
        }
        throw new TypeCastException("null cannot be cast to non-null type (kotlin.coroutines.experimental.Continuation<T>) -> kotlin.Any?");
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <R, T> Object m21225OooO00o(@NotNull O00Oo000<? super R, ? super AbstractC9285oooooOO<? super T>, ? extends Object> o00Oo000, R r, AbstractC9285oooooOO<? super T> ooooooo) {
        if (o00Oo000 != null) {
            return ((O00Oo000) C7367o0OO00oO.OooO00o((Object) o00Oo000, 2)).invoke(r, ooooooo);
        }
        throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.experimental.Continuation<T>) -> kotlin.Any?");
    }

    /* JADX DEBUG: Type inference failed for r1v5. Raw type applied. Possible types: com.pd.sdk.oooooOO<java.lang.Object>, com.pd.sdk.oooooOO<com.pd.sdk.oooOOooO> */
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T> AbstractC9285oooooOO<C9174oooOOooO> OooO00o(@NotNull O00O0OOO<? super AbstractC9285oooooOO<? super T>, ? extends Object> o00o0ooo, @NotNull AbstractC9285oooooOO<? super T> ooooooo) {
        o0O0OO00.OooO0o(o00o0ooo, "receiver$0");
        o0O0OO00.OooO0o(ooooooo, "completion");
        if (!(o00o0ooo instanceof CoroutineImpl)) {
            return C9297oooooooo.OooO00o(ooooooo.getContext(), new OooO0O0(ooooooo, o00o0ooo, ooooooo));
        }
        AbstractC9285oooooOO<C9174oooOOooO> create = ((CoroutineImpl) o00o0ooo).create(ooooooo);
        if (create != null) {
            return ((CoroutineImpl) create).getFacade();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.jvm.internal.CoroutineImpl");
    }

    /* JADX DEBUG: Type inference failed for r1v5. Raw type applied. Possible types: com.pd.sdk.oooooOO<java.lang.Object>, com.pd.sdk.oooooOO<com.pd.sdk.oooOOooO> */
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <R, T> AbstractC9285oooooOO<C9174oooOOooO> OooO00o(@NotNull O00Oo000<? super R, ? super AbstractC9285oooooOO<? super T>, ? extends Object> o00Oo000, R r, @NotNull AbstractC9285oooooOO<? super T> ooooooo) {
        o0O0OO00.OooO0o(o00Oo000, "receiver$0");
        o0O0OO00.OooO0o(ooooooo, "completion");
        if (!(o00Oo000 instanceof CoroutineImpl)) {
            return C9297oooooooo.OooO00o(ooooooo.getContext(), new OooO0OO(ooooooo, o00Oo000, r, ooooooo));
        }
        AbstractC9285oooooOO<C9174oooOOooO> create = ((CoroutineImpl) o00Oo000).create(r, ooooooo);
        if (create != null) {
            return ((CoroutineImpl) create).getFacade();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.jvm.internal.CoroutineImpl");
    }

    public static final <T> AbstractC9285oooooOO<C9174oooOOooO> OooO00o(AbstractC9285oooooOO<? super T> ooooooo, O00O0000<? extends Object> o00o0000) {
        return C9297oooooooo.OooO00o(ooooooo.getContext(), new OooO00o(ooooooo, o00o0000));
    }

    @NotNull
    public static final Object OooO00o() {
        return O00000OO.OooO00o();
    }
}
