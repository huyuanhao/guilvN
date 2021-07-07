package kotlin.text;

import com.p118pd.sdk.C9163oooOOO0O;
import com.p118pd.sdk.O00Oo000;
import com.p118pd.sdk.o0O0OO00;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, mo43195d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "currentIndex", "invoke"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class StringsKt__StringsKt$rangesDelimitedBy$2 extends Lambda implements O00Oo000<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {
    public final /* synthetic */ char[] $delimiters;
    public final /* synthetic */ boolean $ignoreCase;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringsKt__StringsKt$rangesDelimitedBy$2(char[] cArr, boolean z) {
        super(2);
        this.$delimiters = cArr;
        this.$ignoreCase = z;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.p118pd.sdk.O00Oo000
    public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
        return invoke(charSequence, num.intValue());
    }

    @Nullable
    public final Pair<Integer, Integer> invoke(@NotNull CharSequence charSequence, int i) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        int OooO00o = StringsKt__StringsKt.OooO00o(charSequence, this.$delimiters, i, this.$ignoreCase);
        if (OooO00o < 0) {
            return null;
        }
        return C9163oooOOO0O.OooO00o(Integer.valueOf(OooO00o), 1);
    }
}
