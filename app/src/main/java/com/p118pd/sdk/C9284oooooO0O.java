package com.p118pd.sdk;

import com.umeng.analytics.pro.C3416b;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a<\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00012\u001a\b\u0004\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\f\u0012\u0004\u0012\u00020\r0\u000bH\bø\u0001\u0000\u001a3\u0010\u000e\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u001a\b\u0004\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0007\u0012\u0004\u0012\u00020\r0\u000bHHø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001aD\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\"\u0004\b\u0000\u0010\b*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a]\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\b*#\b\u0001\u0012\u0004\u0012\u0002H\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0016¢\u0006\u0002\b\u00172\u0006\u0010\u0018\u001a\u0002H\u00152\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a&\u0010\u001a\u001a\u00020\r\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00072\u0006\u0010\u001b\u001a\u0002H\bH\b¢\u0006\u0002\u0010\u001c\u001a!\u0010\u001d\u001a\u00020\r\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\b\u001a>\u0010 \u001a\u00020\r\"\u0004\b\u0000\u0010\b*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007H\u0007ø\u0001\u0000¢\u0006\u0002\u0010!\u001aW\u0010 \u001a\u00020\r\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\b*#\b\u0001\u0012\u0004\u0012\u0002H\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0016¢\u0006\u0002\b\u00172\u0006\u0010\u0018\u001a\u0002H\u00152\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\"\"\u001b\u0010\u0000\u001a\u00020\u00018Æ\u0002X\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, mo43195d2 = {"coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext$annotations", "()V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Continuation", "Lkotlin/coroutines/Continuation;", "T", C3416b.f8433Q, "resumeWith", "Lkotlin/Function1;", "Lkotlin/Result;", "", "suspendCoroutine", "block", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCoroutine", "", "completion", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "resume", "value", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "resumeWithException", "exception", "", "startCoroutine", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "kotlin-stdlib"}, mo43196k = 2, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.oooooO0O  reason: case insensitive filesystem */
public final class C9284oooooO0O {

    /* renamed from: com.pd.sdk.oooooO0O$OooO00o */
    public static final class OooO00o implements AbstractC9282oooooO0<T> {
        public final /* synthetic */ O00O0OOO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ CoroutineContext f22703OooO00o;

        public OooO00o(CoroutineContext coroutineContext, O00O0OOO o00o0ooo) {
            this.f22703OooO00o = coroutineContext;
            this.OooO00o = o00o0ooo;
        }

        @Override // com.p118pd.sdk.AbstractC9282oooooO0
        @NotNull
        public CoroutineContext getContext() {
            return this.f22703OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC9282oooooO0
        public void resumeWith(@NotNull Object obj) {
            this.OooO00o.invoke(Result.m22100boximpl(obj));
        }
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <T> void OooO00o(@NotNull AbstractC9282oooooO0<? super T> oooooo0, T t) {
        Result.OooO00o oooO00o = Result.Companion;
        oooooo0.resumeWith(Result.m22101constructorimpl(t));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <T> void OooO00o(@NotNull AbstractC9282oooooO0<? super T> oooooo0, Throwable th) {
        Result.OooO00o oooO00o = Result.Companion;
        oooooo0.resumeWith(Result.m22101constructorimpl(C9157oooOO0Oo.OooO00o(th)));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <T> AbstractC9282oooooO0<T> OooO00o(CoroutineContext coroutineContext, O00O0OOO<? super Result<? extends T>, C9174oooOOooO> o00o0ooo) {
        return new OooO00o(coroutineContext, o00o0ooo);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> AbstractC9282oooooO0<C9174oooOOooO> OooO00o(@NotNull O00O0OOO<? super AbstractC9282oooooO0<? super T>, ? extends Object> o00o0ooo, @NotNull AbstractC9282oooooO0<? super T> oooooo0) {
        o0O0OO00.OooO0o(o00o0ooo, "receiver$0");
        o0O0OO00.OooO0o(oooooo0, "completion");
        return new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.OooO00o(IntrinsicsKt__IntrinsicsJvmKt.OooO00o((O00O0OOO) o00o0ooo, (AbstractC9282oooooO0) oooooo0)), O00000OO.OooO00o());
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <R, T> AbstractC9282oooooO0<C9174oooOOooO> OooO00o(@NotNull O00Oo000<? super R, ? super AbstractC9282oooooO0<? super T>, ? extends Object> o00Oo000, R r, @NotNull AbstractC9282oooooO0<? super T> oooooo0) {
        o0O0OO00.OooO0o(o00Oo000, "receiver$0");
        o0O0OO00.OooO0o(oooooo0, "completion");
        return new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.OooO00o(IntrinsicsKt__IntrinsicsJvmKt.OooO00o((O00Oo000) o00Oo000, (Object) r, (AbstractC9282oooooO0) oooooo0)), O00000OO.OooO00o());
    }

    @SinceKotlin(version = "1.3")
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> void m21211OooO00o(@NotNull O00O0OOO<? super AbstractC9282oooooO0<? super T>, ? extends Object> o00o0ooo, @NotNull AbstractC9282oooooO0<? super T> oooooo0) {
        o0O0OO00.OooO0o(o00o0ooo, "receiver$0");
        o0O0OO00.OooO0o(oooooo0, "completion");
        AbstractC9282oooooO0 OooO00o2 = IntrinsicsKt__IntrinsicsJvmKt.OooO00o(IntrinsicsKt__IntrinsicsJvmKt.OooO00o((O00O0OOO) o00o0ooo, (AbstractC9282oooooO0) oooooo0));
        C9174oooOOooO oooooooo = C9174oooOOooO.OooO00o;
        Result.OooO00o oooO00o = Result.Companion;
        OooO00o2.resumeWith(Result.m22101constructorimpl(oooooooo));
    }

    @SinceKotlin(version = "1.3")
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <R, T> void m21212OooO00o(@NotNull O00Oo000<? super R, ? super AbstractC9282oooooO0<? super T>, ? extends Object> o00Oo000, R r, @NotNull AbstractC9282oooooO0<? super T> oooooo0) {
        o0O0OO00.OooO0o(o00Oo000, "receiver$0");
        o0O0OO00.OooO0o(oooooo0, "completion");
        AbstractC9282oooooO0 OooO00o2 = IntrinsicsKt__IntrinsicsJvmKt.OooO00o(IntrinsicsKt__IntrinsicsJvmKt.OooO00o((O00Oo000) o00Oo000, (Object) r, (AbstractC9282oooooO0) oooooo0));
        C9174oooOOooO oooooooo = C9174oooOOooO.OooO00o;
        Result.OooO00o oooO00o = Result.Companion;
        OooO00o2.resumeWith(Result.m22101constructorimpl(oooooooo));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> Object m21210OooO00o(O00O0OOO<? super AbstractC9282oooooO0<? super T>, C9174oooOOooO> o00o0ooo, AbstractC9282oooooO0<? super T> oooooo0) {
        o0O0O0OO.OooO0OO(0);
        SafeContinuation oooooo0o = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.OooO00o(oooooo0));
        o00o0ooo.invoke(oooooo0o);
        Object OooO00o2 = oooooo0o.OooO00o();
        if (OooO00o2 == O00000OO.OooO00o()) {
            O0000OO.OooO0O0(oooooo0);
        }
        o0O0O0OO.OooO0OO(1);
        return OooO00o2;
    }

    public static final CoroutineContext OooO00o() {
        throw new NotImplementedError("Implemented as intrinsic");
    }
}
