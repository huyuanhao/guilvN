package kotlin.coroutines.experimental;

import com.p118pd.sdk.O00Oo000;
import com.p118pd.sdk.o0O0OO00;
import kotlin.Metadata;
import kotlin.coroutines.experimental.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo43195d2 = {"<anonymous>", "", "acc", "element", "Lkotlin/coroutines/experimental/CoroutineContext$Element;", "invoke"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class CombinedContext$toString$1 extends Lambda implements O00Oo000<String, CoroutineContext.Element, String> {
    public static final CombinedContext$toString$1 INSTANCE = new CombinedContext$toString$1();

    public CombinedContext$toString$1() {
        super(2);
    }

    @NotNull
    public final String invoke(@NotNull String str, @NotNull CoroutineContext.Element oooO00o) {
        o0O0OO00.OooO0o(str, "acc");
        o0O0OO00.OooO0o(oooO00o, "element");
        if (str.length() == 0) {
            return oooO00o.toString();
        }
        return str + ", " + oooO00o;
    }
}
