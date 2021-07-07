package kotlin.sequences;

import com.p118pd.sdk.O00O0OOO;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo43195d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class SequencesKt___SequencesKt$elementAt$1 extends Lambda implements O00O0OOO {
    public final /* synthetic */ int $index;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$elementAt$1(int i) {
        super(1);
        this.$index = i;
    }

    @Override // com.p118pd.sdk.O00O0OOO
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    @NotNull
    public final Void invoke(int i) {
        throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.$index + '.');
    }
}
