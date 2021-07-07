package kotlin.sequences;

import com.p118pd.sdk.O00O0000;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo43195d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class SequencesKt__SequencesKt$generateSequence$2 extends Lambda implements O00O0000<T> {
    public final /* synthetic */ Object $seed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$generateSequence$2(Object obj) {
        super(0);
        this.$seed = obj;
    }

    @Override // com.p118pd.sdk.O00O0000
    @Nullable
    public final T invoke() {
        return (T) this.$seed;
    }
}
