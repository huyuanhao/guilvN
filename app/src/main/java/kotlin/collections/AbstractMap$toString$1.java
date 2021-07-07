package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.o0O0OO00;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010&\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003 \u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, mo43195d2 = {"<anonymous>", "", "K", ExifInterface.o000oo0o, "it", "", "invoke"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class AbstractMap$toString$1 extends Lambda implements O00O0OOO<Map.Entry<? extends K, ? extends V>, String> {
    public final /* synthetic */ AbstractMap this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractMap$toString$1(AbstractMap abstractMap) {
        super(1);
        this.this$0 = abstractMap;
    }

    @NotNull
    public final String invoke(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        o0O0OO00.OooO0o(entry, "it");
        return AbstractMap.OooO00o(this.this$0, entry);
    }
}
