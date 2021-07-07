package kotlin.coroutines.experimental;

import com.umeng.analytics.pro.C3416b;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.experimental.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003H&¨\u0006\u0007"}, mo43195d2 = {"Lkotlin/coroutines/experimental/ContinuationInterceptor;", "Lkotlin/coroutines/experimental/CoroutineContext$Element;", "interceptContinuation", "Lkotlin/coroutines/experimental/Continuation;", "T", "continuation", "Key", "kotlin-stdlib_coroutines"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.oooooOOO  reason: invalid package */
public interface ContinuationInterceptor extends CoroutineContext.Element {
    public static final OooO0O0 OooO00o = OooO0O0.OooO00o;

    /* renamed from: com.pd.sdk.oooooOOO$OooO00o */
    public static final class OooO00o {
        public static <R> R OooO00o(ContinuationInterceptor oooooooo, R r, @NotNull O00Oo000<? super R, ? super CoroutineContext.Element, ? extends R> o00Oo000) {
            o0O0OO00.OooO0o(o00Oo000, "operation");
            return (R) CoroutineContext.Element.OooO00o.OooO00o(oooooooo, r, o00Oo000);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E OooO00o(ContinuationInterceptor oooooooo, @NotNull CoroutineContext.OooO0O0<E> oooO0O0) {
            o0O0OO00.OooO0o(oooO0O0, "key");
            return (E) CoroutineContext.Element.OooO00o.OooO00o(oooooooo, oooO0O0);
        }

        @NotNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public static CoroutineContext m21214OooO00o(ContinuationInterceptor oooooooo, @NotNull CoroutineContext.OooO0O0<?> oooO0O0) {
            o0O0OO00.OooO0o(oooO0O0, "key");
            return CoroutineContext.Element.OooO00o.m22797OooO00o((CoroutineContext.Element) oooooooo, oooO0O0);
        }

        @NotNull
        public static CoroutineContext OooO00o(ContinuationInterceptor oooooooo, @NotNull CoroutineContext coroutineContext) {
            o0O0OO00.OooO0o(coroutineContext, C3416b.f8433Q);
            return CoroutineContext.Element.OooO00o.OooO00o(oooooooo, coroutineContext);
        }
    }

    /* renamed from: com.pd.sdk.oooooOOO$OooO0O0 */
    public static final class OooO0O0 implements CoroutineContext.OooO0O0<ContinuationInterceptor> {
        public static final /* synthetic */ OooO0O0 OooO00o = new OooO0O0();
    }

    @NotNull
    <T> AbstractC9285oooooOO<T> OooO00o(@NotNull AbstractC9285oooooOO<? super T> ooooooo);
}
