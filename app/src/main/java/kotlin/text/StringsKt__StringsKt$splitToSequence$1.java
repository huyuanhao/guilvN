package kotlin.text;

import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.o0O0OO00;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo43195d2 = {"<anonymous>", "", "it", "Lkotlin/ranges/IntRange;", "invoke"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class StringsKt__StringsKt$splitToSequence$1 extends Lambda implements O00O0OOO<IntRange, String> {
    public final /* synthetic */ CharSequence $this_splitToSequence;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringsKt__StringsKt$splitToSequence$1(CharSequence charSequence) {
        super(1);
        this.$this_splitToSequence = charSequence;
    }

    @NotNull
    public final String invoke(@NotNull IntRange oo000o0o) {
        o0O0OO00.OooO0o(oo000o0o, "it");
        return StringsKt__StringsKt.m22897OooO00o(this.$this_splitToSequence, oo000o0o);
    }
}
