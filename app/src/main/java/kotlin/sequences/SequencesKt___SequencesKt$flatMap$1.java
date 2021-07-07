package kotlin.sequences;

import com.p118pd.sdk.AbstractC7873oO0OOo00;
import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.o0O0OO00;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo43195d2 = {"<anonymous>", "", "R", "T", "it", "Lkotlin/sequences/Sequence;", "invoke"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class SequencesKt___SequencesKt$flatMap$1 extends Lambda implements O00O0OOO<AbstractC7873oO0OOo00<? extends R>, Iterator<? extends R>> {
    public static final SequencesKt___SequencesKt$flatMap$1 INSTANCE = new SequencesKt___SequencesKt$flatMap$1();

    public SequencesKt___SequencesKt$flatMap$1() {
        super(1);
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: java.util.Iterator<? extends R>, java.util.Iterator<R> */
    @NotNull
    public final Iterator<R> invoke(@NotNull AbstractC7873oO0OOo00<? extends R> oo0ooo00) {
        o0O0OO00.OooO0o(oo0ooo00, "it");
        return (Iterator<? extends R>) oo0ooo00.iterator();
    }
}
