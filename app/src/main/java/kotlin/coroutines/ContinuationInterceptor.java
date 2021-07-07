package kotlin.coroutines;

import androidx.exifinterface.media.ExifInterface;
import com.umeng.analytics.pro.C3416b;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ(\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0002¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\bH&J\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¨\u0006\u0010"}, mo43195d2 = {"Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlin/coroutines/CoroutineContext$Element;", "get", ExifInterface.o000oo00, "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "interceptContinuation", "Lkotlin/coroutines/Continuation;", "T", "continuation", "minusKey", "Lkotlin/coroutines/CoroutineContext;", "releaseInterceptedContinuation", "", "Key", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.oooooOo0  reason: invalid package */
public interface ContinuationInterceptor extends CoroutineContext.Element {
    public static final OooO0O0 OooO00o = OooO0O0.OooO00o;

    /* renamed from: com.pd.sdk.oooooOo0$OooO00o */
    public static final class OooO00o {
        public static <R> R OooO00o(ContinuationInterceptor ooooooo0, R r, @NotNull O00Oo000<? super R, ? super CoroutineContext.Element, ? extends R> o00Oo000) {
            o0O0OO00.OooO0o(o00Oo000, "operation");
            return (R) CoroutineContext.Element.OooO00o.OooO00o(ooooooo0, r, o00Oo000);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E OooO00o(ContinuationInterceptor ooooooo0, @NotNull CoroutineContext.OooO0O0<E> oooO0O0) {
            o0O0OO00.OooO0o(oooO0O0, "key");
            if (oooO0O0 != ContinuationInterceptor.OooO00o) {
                return null;
            }
            if (ooooooo0 != null) {
                return ooooooo0;
            }
            throw new TypeCastException("null cannot be cast to non-null type E");
        }

        @NotNull
        public static CoroutineContext OooO00o(ContinuationInterceptor ooooooo0, @NotNull CoroutineContext coroutineContext) {
            o0O0OO00.OooO0o(coroutineContext, C3416b.f8433Q);
            return CoroutineContext.Element.OooO00o.OooO00o(ooooooo0, coroutineContext);
        }

        public static void OooO00o(ContinuationInterceptor ooooooo0, @NotNull AbstractC9282oooooO0<?> oooooo0) {
            o0O0OO00.OooO0o(oooooo0, "continuation");
        }

        @NotNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public static CoroutineContext m21219OooO00o(ContinuationInterceptor ooooooo0, @NotNull CoroutineContext.OooO0O0<?> oooO0O0) {
            o0O0OO00.OooO0o(oooO0O0, "key");
            return oooO0O0 == ContinuationInterceptor.OooO00o ? EmptyCoroutineContext.INSTANCE : ooooooo0;
        }
    }

    /* renamed from: com.pd.sdk.oooooOo0$OooO0O0 */
    public static final class OooO0O0 implements CoroutineContext.OooO0O0<ContinuationInterceptor> {
        public static final /* synthetic */ OooO0O0 OooO00o = new OooO0O0();
    }

    @NotNull
    <T> AbstractC9282oooooO0<T> OooO00o(@NotNull AbstractC9282oooooO0<? super T> oooooo0);

    /* renamed from: OooO00o  reason: collision with other method in class */
    void m21218OooO00o(@NotNull AbstractC9282oooooO0<?> oooooo0);

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.OooO0O0<E> oooO0O0);

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    CoroutineContext minusKey(@NotNull CoroutineContext.OooO0O0<?> oooO0O0);
}
