package kotlin.sequences;

import com.p118pd.sdk.AbstractC7873oO0OOo00;
import com.p118pd.sdk.O00O0OOO;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¨\u0006\u0004"}, mo43195d2 = {"kotlin/sequences/SequencesKt___SequencesKt$minus$2", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public final class SequencesKt___SequencesKt$minus$2 implements AbstractC7873oO0OOo00<T> {
    public final /* synthetic */ AbstractC7873oO0OOo00 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ Object[] f23872OooO00o;

    public SequencesKt___SequencesKt$minus$2(AbstractC7873oO0OOo00<? extends T> oo0ooo00, Object[] objArr) {
        this.OooO00o = oo0ooo00;
        this.f23872OooO00o = objArr;
    }

    @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
    @NotNull
    public Iterator<T> iterator() {
        return SequencesKt___SequencesKt.OooO0o0(this.OooO00o, (O00O0OOO) new SequencesKt___SequencesKt$minus$2$iterator$1(ArraysKt___ArraysKt.m22195OooO00o(this.f23872OooO00o))).iterator();
    }
}
