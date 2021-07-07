package kotlin.sequences;

import com.p118pd.sdk.O00O0OOO;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, mo43195d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class SequencesKt___SequencesJvmKt$filterIsInstance$1 extends Lambda implements O00O0OOO<Object, Boolean> {
    public final /* synthetic */ Class $klass;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesJvmKt$filterIsInstance$1(Class cls) {
        super(1);
        this.$klass = cls;
    }

    /* Return type fixed from 'boolean' to match base method */
    @Override // com.p118pd.sdk.O00O0OOO
    public final Boolean invoke(@Nullable Object obj) {
        return this.$klass.isInstance(obj);
    }
}
