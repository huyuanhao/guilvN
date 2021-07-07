package kotlin.sequences;

import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.o0O0OO00;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo43195d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Z"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class SequencesKt___SequencesKt$minus$1$iterator$1 extends Lambda implements O00O0OOO<T, Boolean> {
    public final /* synthetic */ Ref.BooleanRef $removed;
    public final /* synthetic */ SequencesKt___SequencesKt$minus$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$minus$1$iterator$1(SequencesKt___SequencesKt$minus$1 sequencesKt___SequencesKt$minus$1, Ref.BooleanRef booleanRef) {
        super(1);
        this.this$0 = sequencesKt___SequencesKt$minus$1;
        this.$removed = booleanRef;
    }

    /* Return type fixed from 'boolean' to match base method */
    @Override // com.p118pd.sdk.O00O0OOO
    public final Boolean invoke(T t) {
        if (this.$removed.element || !o0O0OO00.OooO00o((Object) t, this.this$0.f23871OooO00o)) {
            return true;
        }
        this.$removed.element = true;
        return false;
    }
}
