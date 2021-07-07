package kotlin.coroutines.experimental;

import com.p118pd.sdk.C9289oooooOoo;
import com.p118pd.sdk.O00Oo000;
import com.p118pd.sdk.o0O0OO00;
import kotlin.Metadata;
import kotlin.coroutines.experimental.ContinuationInterceptor;
import kotlin.coroutines.experimental.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo43195d2 = {"<anonymous>", "Lkotlin/coroutines/experimental/CoroutineContext;", "acc", "element", "Lkotlin/coroutines/experimental/CoroutineContext$Element;", "invoke"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class CoroutineContext$plus$1 extends Lambda implements O00Oo000<CoroutineContext, CoroutineContext.Element, CoroutineContext> {
    public static final CoroutineContext$plus$1 INSTANCE = new CoroutineContext$plus$1();

    public CoroutineContext$plus$1() {
        super(2);
    }

    @NotNull
    public final CoroutineContext invoke(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext.Element oooO00o) {
        o0O0OO00.OooO0o(coroutineContext, "acc");
        o0O0OO00.OooO0o(oooO00o, "element");
        CoroutineContext OooO00o = coroutineContext.m22795OooO00o(oooO00o.OooO00o());
        if (OooO00o == C9289oooooOoo.OooO00o) {
            return oooO00o;
        }
        ContinuationInterceptor oooooooo = (ContinuationInterceptor) OooO00o.OooO00o((CoroutineContext.OooO0O0) ContinuationInterceptor.OooO00o);
        if (oooooooo == null) {
            return new CombinedContext(OooO00o, oooO00o);
        }
        CoroutineContext OooO00o2 = OooO00o.m22795OooO00o((CoroutineContext.OooO0O0<?>) ContinuationInterceptor.OooO00o);
        if (OooO00o2 == C9289oooooOoo.OooO00o) {
            return new CombinedContext(oooO00o, oooooooo);
        }
        return new CombinedContext(new CombinedContext(OooO00o2, oooO00o), oooooooo);
    }
}
