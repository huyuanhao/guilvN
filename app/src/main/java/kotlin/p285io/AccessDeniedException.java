package kotlin.p285io;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.p118pd.sdk.O0o0o;
import com.p118pd.sdk.o0O0OO00;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo43195d2 = {"Lkotlin/io/AccessDeniedException;", "Lkotlin/io/FileSystemException;", "file", "Ljava/io/File;", DispatchConstants.OTHER, MiPushCommandMessage.KEY_REASON, "", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: kotlin.io.AccessDeniedException */
public final class AccessDeniedException extends FileSystemException {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccessDeniedException(File file, File file2, String str, int i, O0o0o o0o0o) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccessDeniedException(@NotNull File file, @Nullable File file2, @Nullable String str) {
        super(file, file2, str);
        o0O0OO00.OooO0o(file, "file");
    }
}
