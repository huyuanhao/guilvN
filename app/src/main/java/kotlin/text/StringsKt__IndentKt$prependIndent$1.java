package kotlin.text;

import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.o0O0OO00;
import com.p118pd.sdk.oOO0OO00;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo43195d2 = {"<anonymous>", "", "it", "invoke"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class StringsKt__IndentKt$prependIndent$1 extends Lambda implements O00O0OOO<String, String> {
    public final /* synthetic */ String $indent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringsKt__IndentKt$prependIndent$1(String str) {
        super(1);
        this.$indent = str;
    }

    @NotNull
    public final String invoke(@NotNull String str) {
        o0O0OO00.OooO0o(str, "it");
        if (!oOO0OO00.OooO00o((CharSequence) str)) {
            return this.$indent + str;
        } else if (str.length() < this.$indent.length()) {
            return this.$indent;
        } else {
            return str;
        }
    }
}
