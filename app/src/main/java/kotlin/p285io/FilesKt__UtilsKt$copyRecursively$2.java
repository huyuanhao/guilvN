package kotlin.p285io;

import com.p118pd.sdk.C9174oooOOooO;
import com.p118pd.sdk.O00Oo000;
import com.p118pd.sdk.o0O0OO00;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo43195d2 = {"<anonymous>", "", "f", "Ljava/io/File;", "e", "Ljava/io/IOException;", "invoke"}, mo43196k = 3, mo43197mv = {1, 1, 13})
/* renamed from: kotlin.io.FilesKt__UtilsKt$copyRecursively$2 */
public final class FilesKt__UtilsKt$copyRecursively$2 extends Lambda implements O00Oo000<File, IOException, C9174oooOOooO> {
    public final /* synthetic */ O00Oo000 $onError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilesKt__UtilsKt$copyRecursively$2(O00Oo000 o00Oo000) {
        super(2);
        this.$onError = o00Oo000;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.p118pd.sdk.O00Oo000
    public /* bridge */ /* synthetic */ C9174oooOOooO invoke(File file, IOException iOException) {
        invoke(file, iOException);
        return C9174oooOOooO.OooO00o;
    }

    public final void invoke(@NotNull File file, @NotNull IOException iOException) {
        o0O0OO00.OooO0o(file, "f");
        o0O0OO00.OooO0o(iOException, "e");
        if (((OnErrorAction) this.$onError.invoke(file, iOException)) == OnErrorAction.TERMINATE) {
            throw new TerminateException(file);
        }
    }
}
