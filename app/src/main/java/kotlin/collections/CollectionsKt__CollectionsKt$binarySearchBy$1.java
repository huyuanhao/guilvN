package kotlin.collections;

import com.p118pd.sdk.C9250ooooO0oO;
import com.p118pd.sdk.O00O0OOO;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo43195d2 = {"<anonymous>", "", "T", "K", "", "it", "invoke", "(Ljava/lang/Object;)I"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class CollectionsKt__CollectionsKt$binarySearchBy$1 extends Lambda implements O00O0OOO<T, Integer> {
    public final /* synthetic */ Comparable $key;
    public final /* synthetic */ O00O0OOO $selector;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionsKt__CollectionsKt$binarySearchBy$1(O00O0OOO o00o0ooo, Comparable comparable) {
        super(1);
        this.$selector = o00o0ooo;
        this.$key = comparable;
    }

    /* Return type fixed from 'int' to match base method */
    @Override // com.p118pd.sdk.O00O0OOO
    public final Integer invoke(T t) {
        return C9250ooooO0oO.OooO00o((Comparable) this.$selector.invoke(t), this.$key);
    }
}
