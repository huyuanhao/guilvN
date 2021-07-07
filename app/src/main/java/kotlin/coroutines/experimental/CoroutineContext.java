package kotlin.coroutines.experimental;

import androidx.exifinterface.media.ExifInterface;
import com.p118pd.sdk.C9289oooooOoo;
import com.p118pd.sdk.O00Oo000;
import com.p118pd.sdk.o0O0OO00;
import com.umeng.analytics.pro.C3416b;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J5\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00030\u0006H&¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH¦\u0002¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH&J\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0002¨\u0006\u0013"}, mo43195d2 = {"Lkotlin/coroutines/experimental/CoroutineContext;", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/experimental/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", ExifInterface.o000oo00, "key", "Lkotlin/coroutines/experimental/CoroutineContext$Key;", "(Lkotlin/coroutines/experimental/CoroutineContext$Key;)Lkotlin/coroutines/experimental/CoroutineContext$Element;", "minusKey", "plus", C3416b.f8433Q, "Element", "Key", "kotlin-stdlib_coroutines"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public interface CoroutineContext {

    @Metadata(mo43193bv = {1, 0, 3}, mo43196k = 3, mo43197mv = {1, 1, 13})
    public static final class DefaultImpls {
        @NotNull
        public static CoroutineContext OooO00o(CoroutineContext coroutineContext, @NotNull CoroutineContext coroutineContext2) {
            o0O0OO00.OooO0o(coroutineContext2, C3416b.f8433Q);
            return coroutineContext2 == C9289oooooOoo.OooO00o ? coroutineContext : (CoroutineContext) coroutineContext2.fold(coroutineContext, CoroutineContext$plus$1.INSTANCE);
        }
    }

    @Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J5\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u0004\u0018\u0001H\r\"\b\b\u0000\u0010\r*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\r0\u0003H\u0002¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016R\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, mo43195d2 = {"Lkotlin/coroutines/experimental/CoroutineContext$Element;", "Lkotlin/coroutines/experimental/CoroutineContext;", "key", "Lkotlin/coroutines/experimental/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/experimental/CoroutineContext$Key;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", ExifInterface.o000oo00, "(Lkotlin/coroutines/experimental/CoroutineContext$Key;)Lkotlin/coroutines/experimental/CoroutineContext$Element;", "minusKey", "kotlin-stdlib_coroutines"}, mo43196k = 1, mo43197mv = {1, 1, 13})
    /* renamed from: kotlin.coroutines.experimental.CoroutineContext$OooO00o */
    public interface Element extends CoroutineContext {

        /* renamed from: kotlin.coroutines.experimental.CoroutineContext$OooO00o$OooO00o */
        public static final class OooO00o {
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.experimental.CoroutineContext$OooO00o */
            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public static <E extends Element> E OooO00o(Element oooO00o, @NotNull OooO0O0<E> oooO0O0) {
                o0O0OO00.OooO0o(oooO0O0, "key");
                if (oooO00o.OooO00o() != oooO0O0) {
                    return null;
                }
                if (oooO00o != 0) {
                    return oooO00o;
                }
                throw new TypeCastException("null cannot be cast to non-null type E");
            }

            @NotNull
            public static CoroutineContext OooO00o(Element oooO00o, @NotNull CoroutineContext coroutineContext) {
                o0O0OO00.OooO0o(coroutineContext, C3416b.f8433Q);
                return DefaultImpls.OooO00o(oooO00o, coroutineContext);
            }

            public static <R> R OooO00o(Element oooO00o, R r, @NotNull O00Oo000<? super R, ? super Element, ? extends R> o00Oo000) {
                o0O0OO00.OooO0o(o00Oo000, "operation");
                return (R) o00Oo000.invoke(r, oooO00o);
            }

            @NotNull
            /* renamed from: OooO00o  reason: collision with other method in class */
            public static CoroutineContext m22797OooO00o(Element oooO00o, @NotNull OooO0O0<?> oooO0O0) {
                o0O0OO00.OooO0o(oooO0O0, "key");
                return oooO00o.OooO00o() == oooO0O0 ? C9289oooooOoo.OooO00o : oooO00o;
            }
        }

        @Override // kotlin.coroutines.experimental.CoroutineContext, kotlin.coroutines.experimental.CoroutineContext
        @Nullable
        <E extends Element> E OooO00o(@NotNull OooO0O0<E> oooO0O0);

        @NotNull
        OooO0O0<?> OooO00o();

        @Override // kotlin.coroutines.experimental.CoroutineContext, kotlin.coroutines.experimental.CoroutineContext
        @NotNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        CoroutineContext m22796OooO00o(@NotNull OooO0O0<?> oooO0O0);

        @Override // kotlin.coroutines.experimental.CoroutineContext
        <R> R fold(R r, @NotNull O00Oo000<? super R, ? super Element, ? extends R> o00Oo000);
    }

    public interface OooO0O0<E extends Element> {
    }

    @Nullable
    <E extends Element> E OooO00o(@NotNull OooO0O0<E> oooO0O0);

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    CoroutineContext m22795OooO00o(@NotNull OooO0O0<?> oooO0O0);

    @NotNull
    CoroutineContext OooO00o(@NotNull CoroutineContext coroutineContext);

    <R> R fold(R r, @NotNull O00Oo000<? super R, ? super Element, ? extends R> o00Oo000);
}
