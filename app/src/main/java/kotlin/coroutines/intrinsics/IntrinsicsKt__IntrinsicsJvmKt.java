package kotlin.coroutines.intrinsics;

import com.p118pd.sdk.AbstractC9282oooooO0;
import com.p118pd.sdk.C7367o0OO00oO;
import com.p118pd.sdk.C9174oooOOooO;
import com.p118pd.sdk.O0000OO;
import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.O00Oo000;
import com.p118pd.sdk.o0O0OO00;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aF\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00012\u001c\b\u0004\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\b¢\u0006\u0002\b\b\u001aD\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a]\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u0002H\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007\u001aA\u0010\u0011\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\bø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001aZ\u0010\u0011\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u0002H\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, mo43195d2 = {"createCoroutineFromSuspendFunction", "Lkotlin/coroutines/Continuation;", "", "T", "completion", "block", "Lkotlin/Function1;", "", "createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt", "createCoroutineUnintercepted", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "intercepted", "startCoroutineUninterceptedOrReturn", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, mo43196k = 5, mo43197mv = {1, 1, 13}, mo43199xi = 1, mo43200xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
public class IntrinsicsKt__IntrinsicsJvmKt {
    @SinceKotlin(version = "1.3")
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> Object m22798OooO00o(@NotNull O00O0OOO<? super AbstractC9282oooooO0<? super T>, ? extends Object> o00o0ooo, AbstractC9282oooooO0<? super T> oooooo0) {
        if (o00o0ooo != null) {
            return ((O00O0OOO) C7367o0OO00oO.OooO00o((Object) o00o0ooo, 1)).invoke(oooooo0);
        }
        throw new TypeCastException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <R, T> Object m22799OooO00o(@NotNull O00Oo000<? super R, ? super AbstractC9282oooooO0<? super T>, ? extends Object> o00Oo000, R r, AbstractC9282oooooO0<? super T> oooooo0) {
        if (o00Oo000 != null) {
            return ((O00Oo000) C7367o0OO00oO.OooO00o((Object) o00Oo000, 2)).invoke(r, oooooo0);
        }
        throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> AbstractC9282oooooO0<C9174oooOOooO> OooO00o(@NotNull O00O0OOO<? super AbstractC9282oooooO0<? super T>, ? extends Object> o00o0ooo, @NotNull AbstractC9282oooooO0<? super T> oooooo0) {
        AbstractC9282oooooO0<C9174oooOOooO> oooooo02;
        o0O0OO00.OooO0o(o00o0ooo, "receiver$0");
        o0O0OO00.OooO0o(oooooo0, "completion");
        AbstractC9282oooooO0<?> OooO00o = O0000OO.OooO00o((AbstractC9282oooooO0) oooooo0);
        if (o00o0ooo instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) o00o0ooo).create(OooO00o);
        }
        CoroutineContext context = OooO00o.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            if (OooO00o != null) {
                oooooo02 = new C4739xa50de660(OooO00o, OooO00o, o00o0ooo);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }
        } else if (OooO00o != null) {
            oooooo02 = new C4740xa50de661(OooO00o, context, OooO00o, context, o00o0ooo);
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }
        return oooooo02;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <R, T> AbstractC9282oooooO0<C9174oooOOooO> OooO00o(@NotNull O00Oo000<? super R, ? super AbstractC9282oooooO0<? super T>, ? extends Object> o00Oo000, R r, @NotNull AbstractC9282oooooO0<? super T> oooooo0) {
        AbstractC9282oooooO0<C9174oooOOooO> oooooo02;
        o0O0OO00.OooO0o(o00Oo000, "receiver$0");
        o0O0OO00.OooO0o(oooooo0, "completion");
        AbstractC9282oooooO0<?> OooO00o = O0000OO.OooO00o((AbstractC9282oooooO0) oooooo0);
        if (o00Oo000 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) o00Oo000).create(r, OooO00o);
        }
        CoroutineContext context = OooO00o.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            if (OooO00o != null) {
                oooooo02 = new C4741xa50de662(OooO00o, OooO00o, o00Oo000, r);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }
        } else if (OooO00o != null) {
            oooooo02 = new C4742xa50de663(OooO00o, context, OooO00o, context, o00Oo000, r);
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }
        return oooooo02;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.pd.sdk.oooooO0<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> AbstractC9282oooooO0<T> OooO00o(@NotNull AbstractC9282oooooO0<? super T> oooooo0) {
        AbstractC9282oooooO0<T> oooooo02;
        o0O0OO00.OooO0o(oooooo0, "receiver$0");
        ContinuationImpl continuationImpl = !(oooooo0 instanceof ContinuationImpl) ? null : oooooo0;
        return (continuationImpl == null || (oooooo02 = (AbstractC9282oooooO0<T>) continuationImpl.intercepted()) == null) ? oooooo0 : oooooo02;
    }

    @SinceKotlin(version = "1.3")
    public static final <T> AbstractC9282oooooO0<C9174oooOOooO> OooO00o(AbstractC9282oooooO0<? super T> oooooo0, O00O0OOO<? super AbstractC9282oooooO0<? super T>, ? extends Object> o00o0ooo) {
        CoroutineContext context = oooooo0.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            if (oooooo0 != null) {
                return new C4743x96e8297a(o00o0ooo, oooooo0, oooooo0);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        } else if (oooooo0 != null) {
            return new C4744x96e8297b(o00o0ooo, oooooo0, context, oooooo0, context);
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }
    }
}
