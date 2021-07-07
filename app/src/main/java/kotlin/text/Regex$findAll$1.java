package kotlin.text;

import com.p118pd.sdk.O00O0000;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo43195d2 = {"<anonymous>", "Lkotlin/text/MatchResult;", "invoke"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class Regex$findAll$1 extends Lambda implements O00O0000<MatchResult> {
    public final /* synthetic */ CharSequence $input;
    public final /* synthetic */ int $startIndex;
    public final /* synthetic */ Regex this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Regex$findAll$1(Regex regex, CharSequence charSequence, int i) {
        super(0);
        this.this$0 = regex;
        this.$input = charSequence;
        this.$startIndex = i;
    }

    @Override // com.p118pd.sdk.O00O0000
    @Nullable
    public final MatchResult invoke() {
        return this.this$0.find(this.$input, this.$startIndex);
    }
}
