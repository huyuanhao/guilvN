package kotlin.sequences;

import com.p118pd.sdk.O00O0000;
import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.o0O0OO00;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo43195d2 = {"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class SequencesKt__SequencesKt$generateSequence$1 extends Lambda implements O00O0OOO<T, T> {
    public final /* synthetic */ O00O0000 $nextFunction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$generateSequence$1(O00O0000 o00o0000) {
        super(1);
        this.$nextFunction = o00o0000;
    }

    @Override // com.p118pd.sdk.O00O0OOO
    @Nullable
    public final T invoke(@NotNull T t) {
        o0O0OO00.OooO0o(t, "it");
        return (T) this.$nextFunction.invoke();
    }
}
