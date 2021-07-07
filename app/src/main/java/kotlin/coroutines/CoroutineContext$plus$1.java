package kotlin.coroutines;

import com.p118pd.sdk.O00Oo000;
import com.p118pd.sdk.o0O0OO00;
import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo43195d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "acc", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class CoroutineContext$plus$1 extends Lambda implements O00Oo000<CoroutineContext, CoroutineContext.Element, CoroutineContext> {
    public static final CoroutineContext$plus$1 INSTANCE = new CoroutineContext$plus$1();

    public CoroutineContext$plus$1() {
        super(2);
    }

    @NotNull
    public final CoroutineContext invoke(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext.Element oooO00o) {
        o0O0OO00.OooO0o(coroutineContext, "acc");
        o0O0OO00.OooO0o(oooO00o, "element");
        CoroutineContext minusKey = coroutineContext.minusKey(oooO00o.OooO00o());
        if (minusKey == EmptyCoroutineContext.INSTANCE) {
            return oooO00o;
        }
        ContinuationInterceptor ooooooo0 = (ContinuationInterceptor) minusKey.get(ContinuationInterceptor.OooO00o);
        if (ooooooo0 == null) {
            return new CombinedContext(minusKey, oooO00o);
        }
        CoroutineContext minusKey2 = minusKey.minusKey(ContinuationInterceptor.OooO00o);
        if (minusKey2 == EmptyCoroutineContext.INSTANCE) {
            return new CombinedContext(oooO00o, ooooooo0);
        }
        return new CombinedContext(new CombinedContext(minusKey2, oooO00o), ooooooo0);
    }
}
