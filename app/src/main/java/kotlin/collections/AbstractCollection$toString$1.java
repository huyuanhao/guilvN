package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import com.p118pd.sdk.O00O0OOO;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo43195d2 = {"<anonymous>", "", ExifInterface.o000oo00, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class AbstractCollection$toString$1 extends Lambda implements O00O0OOO<E, CharSequence> {
    public final /* synthetic */ AbstractCollection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractCollection$toString$1(AbstractCollection abstractCollection) {
        super(1);
        this.this$0 = abstractCollection;
    }

    @Override // com.p118pd.sdk.O00O0OOO
    @NotNull
    public final CharSequence invoke(E e) {
        return e == this.this$0 ? "(this Collection)" : String.valueOf(e);
    }
}
