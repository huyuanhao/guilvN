package kotlin.text;

import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.oO00O000;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo43195d2 = {"<anonymous>", "R", "index", "", "invoke", "(I)Ljava/lang/Object;"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class StringsKt___StringsKt$windowedSequence$2 extends Lambda implements O00O0OOO<Integer, R> {
    public final /* synthetic */ int $size;
    public final /* synthetic */ CharSequence $this_windowedSequence;
    public final /* synthetic */ O00O0OOO $transform;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringsKt___StringsKt$windowedSequence$2(CharSequence charSequence, O00O0OOO o00o0ooo, int i) {
        super(1);
        this.$this_windowedSequence = charSequence;
        this.$transform = o00o0ooo;
        this.$size = i;
    }

    public final R invoke(int i) {
        O00O0OOO o00o0ooo = this.$transform;
        CharSequence charSequence = this.$this_windowedSequence;
        return (R) o00o0ooo.invoke(charSequence.subSequence(i, oO00O000.OooO0O0(this.$size + i, charSequence.length())));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p118pd.sdk.O00O0OOO
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}
