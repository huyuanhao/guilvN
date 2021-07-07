package kotlin.sequences;

import com.p118pd.sdk.O00O0OOO;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo43195d2 = {"<anonymous>", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class SequencesKt___SequencesKt$onEach$1 extends Lambda implements O00O0OOO<T, T> {
    public final /* synthetic */ O00O0OOO $action;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$onEach$1(O00O0OOO o00o0ooo) {
        super(1);
        this.$action = o00o0ooo;
    }

    @Override // com.p118pd.sdk.O00O0OOO
    public final T invoke(T t) {
        this.$action.invoke(t);
        return t;
    }
}
