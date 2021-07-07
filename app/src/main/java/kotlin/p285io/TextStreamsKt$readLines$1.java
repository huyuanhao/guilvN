package kotlin.p285io;

import com.p118pd.sdk.C9174oooOOooO;
import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.o0O0OO00;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo43195d2 = {"<anonymous>", "", "it", "", "invoke"}, mo43196k = 3, mo43197mv = {1, 1, 13})
/* renamed from: kotlin.io.TextStreamsKt$readLines$1 */
public final class TextStreamsKt$readLines$1 extends Lambda implements O00O0OOO<String, C9174oooOOooO> {
    public final /* synthetic */ ArrayList $result;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextStreamsKt$readLines$1(ArrayList arrayList) {
        super(1);
        this.$result = arrayList;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p118pd.sdk.O00O0OOO
    public /* bridge */ /* synthetic */ C9174oooOOooO invoke(String str) {
        invoke(str);
        return C9174oooOOooO.OooO00o;
    }

    public final void invoke(@NotNull String str) {
        o0O0OO00.OooO0o(str, "it");
        this.$result.add(str);
    }
}
