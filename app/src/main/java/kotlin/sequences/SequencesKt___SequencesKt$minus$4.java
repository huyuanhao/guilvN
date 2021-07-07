package kotlin.sequences;

import com.p118pd.sdk.AbstractC7873oO0OOo00;
import com.p118pd.sdk.O00O0OOO;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¨\u0006\u0004"}, mo43195d2 = {"kotlin/sequences/SequencesKt___SequencesKt$minus$4", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public final class SequencesKt___SequencesKt$minus$4 implements AbstractC7873oO0OOo00<T> {
    public final /* synthetic */ AbstractC7873oO0OOo00 OooO00o;
    public final /* synthetic */ AbstractC7873oO0OOo00 OooO0O0;

    public SequencesKt___SequencesKt$minus$4(AbstractC7873oO0OOo00<? extends T> oo0ooo00, AbstractC7873oO0OOo00 oo0ooo002) {
        this.OooO00o = oo0ooo00;
        this.OooO0O0 = oo0ooo002;
    }

    @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
    @NotNull
    public Iterator<T> iterator() {
        HashSet OooO00o2 = SequencesKt___SequencesKt.m22840OooO00o(this.OooO0O0);
        if (OooO00o2.isEmpty()) {
            return this.OooO00o.iterator();
        }
        return SequencesKt___SequencesKt.OooO0o0(this.OooO00o, (O00O0OOO) new SequencesKt___SequencesKt$minus$4$iterator$1(OooO00o2)).iterator();
    }
}
