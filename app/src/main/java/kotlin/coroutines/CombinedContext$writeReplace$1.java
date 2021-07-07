package kotlin.coroutines;

import com.p118pd.sdk.C9174oooOOooO;
import com.p118pd.sdk.O00Oo000;
import com.p118pd.sdk.o0O0OO00;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo43195d2 = {"<anonymous>", "", "<anonymous parameter 0>", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(Lkotlin/Unit;Lkotlin/coroutines/CoroutineContext$Element;)V"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class CombinedContext$writeReplace$1 extends Lambda implements O00Oo000<C9174oooOOooO, CoroutineContext.Element, C9174oooOOooO> {
    public final /* synthetic */ CoroutineContext[] $elements;
    public final /* synthetic */ Ref.IntRef $index;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombinedContext$writeReplace$1(CoroutineContext[] coroutineContextArr, Ref.IntRef intRef) {
        super(2);
        this.$elements = coroutineContextArr;
        this.$index = intRef;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.p118pd.sdk.O00Oo000
    public /* bridge */ /* synthetic */ C9174oooOOooO invoke(C9174oooOOooO oooooooo, CoroutineContext.Element oooO00o) {
        invoke(oooooooo, oooO00o);
        return C9174oooOOooO.OooO00o;
    }

    public final void invoke(@NotNull C9174oooOOooO oooooooo, @NotNull CoroutineContext.Element oooO00o) {
        o0O0OO00.OooO0o(oooooooo, "<anonymous parameter 0>");
        o0O0OO00.OooO0o(oooO00o, "element");
        CoroutineContext[] coroutineContextArr = this.$elements;
        Ref.IntRef intRef = this.$index;
        int i = intRef.element;
        intRef.element = i + 1;
        coroutineContextArr[i] = oooO00o;
    }
}
