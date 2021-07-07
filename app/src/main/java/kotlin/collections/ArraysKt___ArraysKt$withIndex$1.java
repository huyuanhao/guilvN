package kotlin.collections;

import com.p118pd.sdk.O00O0000;
import com.p118pd.sdk.O0O0000;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, mo43195d2 = {"<anonymous>", "", "T", "invoke"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class ArraysKt___ArraysKt$withIndex$1 extends Lambda implements O00O0000<Iterator<? extends T>> {
    public final /* synthetic */ Object[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArraysKt___ArraysKt$withIndex$1(Object[] objArr) {
        super(0);
        this.$this_withIndex = objArr;
    }

    @Override // com.p118pd.sdk.O00O0000
    @NotNull
    public final Iterator<T> invoke() {
        return O0O0000.OooO00o(this.$this_withIndex);
    }
}
