package kotlin.sequences;

import com.p118pd.sdk.AbstractC7873oO0OOo00;
import com.p118pd.sdk.O00O0OOO;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo43195d2 = {"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class SequencesKt___SequencesKt$requireNoNulls$1 extends Lambda implements O00O0OOO<T, T> {
    public final /* synthetic */ AbstractC7873oO0OOo00 $this_requireNoNulls;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$requireNoNulls$1(AbstractC7873oO0OOo00 oo0ooo00) {
        super(1);
        this.$this_requireNoNulls = oo0ooo00;
    }

    @Override // com.p118pd.sdk.O00O0OOO
    @NotNull
    public final T invoke(@Nullable T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("null element found in " + this.$this_requireNoNulls + '.');
    }
}
