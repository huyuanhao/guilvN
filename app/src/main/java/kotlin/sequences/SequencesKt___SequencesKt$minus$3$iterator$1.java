package kotlin.sequences;

import com.p118pd.sdk.O00O0OOO;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo43195d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Z"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class SequencesKt___SequencesKt$minus$3$iterator$1 extends Lambda implements O00O0OOO<T, Boolean> {
    public final /* synthetic */ Collection $other;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$minus$3$iterator$1(Collection collection) {
        super(1);
        this.$other = collection;
    }

    /* Return type fixed from 'boolean' to match base method */
    @Override // com.p118pd.sdk.O00O0OOO
    public final Boolean invoke(T t) {
        return this.$other.contains(t);
    }
}
