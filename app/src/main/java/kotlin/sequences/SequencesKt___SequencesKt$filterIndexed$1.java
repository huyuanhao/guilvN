package kotlin.sequences;

import com.p118pd.sdk.C9219oooo0O0;
import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.O00Oo000;
import com.p118pd.sdk.o0O0OO00;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo43195d2 = {"<anonymous>", "", "T", "it", "Lkotlin/collections/IndexedValue;", "invoke"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class SequencesKt___SequencesKt$filterIndexed$1 extends Lambda implements O00O0OOO<C9219oooo0O0<? extends T>, Boolean> {
    public final /* synthetic */ O00Oo000 $predicate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$filterIndexed$1(O00Oo000 o00Oo000) {
        super(1);
        this.$predicate = o00Oo000;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.p118pd.sdk.O00O0OOO
    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
        return Boolean.valueOf(invoke((C9219oooo0O0) obj));
    }

    public final boolean invoke(@NotNull C9219oooo0O0<? extends T> oooo0o0) {
        o0O0OO00.OooO0o(oooo0o0, "it");
        return ((Boolean) this.$predicate.invoke(Integer.valueOf(oooo0o0.OooO0O0()), oooo0o0.m21084OooO0O0())).booleanValue();
    }
}
