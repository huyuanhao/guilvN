package kotlin.p285io;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.p118pd.sdk.O000OO0;
import com.p118pd.sdk.O0o0o;
import com.p118pd.sdk.o0O0OO00;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, mo43195d2 = {"Lkotlin/io/FileSystemException;", "Ljava/io/IOException;", "file", "Ljava/io/File;", DispatchConstants.OTHER, MiPushCommandMessage.KEY_REASON, "", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V", "getFile", "()Ljava/io/File;", "getOther", "getReason", "()Ljava/lang/String;", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: kotlin.io.FileSystemException */
public class FileSystemException extends IOException {
    @NotNull
    public final File file;
    @Nullable
    public final File other;
    @Nullable
    public final String reason;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileSystemException(File file2, File file3, String str, int i, O0o0o o0o0o) {
        this(file2, (i & 2) != 0 ? null : file3, (i & 4) != 0 ? null : str);
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }

    @Nullable
    public final File getOther() {
        return this.other;
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileSystemException(@NotNull File file2, @Nullable File file3, @Nullable String str) {
        super(O000OO0.OooO0O0(file2, file3, str));
        o0O0OO00.OooO0o(file2, "file");
        this.file = file2;
        this.other = file3;
        this.reason = str;
    }
}
