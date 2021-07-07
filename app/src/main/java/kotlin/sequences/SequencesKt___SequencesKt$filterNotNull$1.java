package kotlin.sequences;

import com.p118pd.sdk.O00O0OOO;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo43195d2 = {"<anonymous>", "", "T", "", "it", "invoke", "(Ljava/lang/Object;)Z"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class SequencesKt___SequencesKt$filterNotNull$1 extends Lambda implements O00O0OOO<T, Boolean> {
    public static final SequencesKt___SequencesKt$filterNotNull$1 INSTANCE = new SequencesKt___SequencesKt$filterNotNull$1();

    public SequencesKt___SequencesKt$filterNotNull$1() {
        super(1);
    }

    /* Return type fixed from 'boolean' to match base method */
    @Override // com.p118pd.sdk.O00O0OOO
    public final Boolean invoke(@Nullable T t) {
        return t == null;
    }
}
