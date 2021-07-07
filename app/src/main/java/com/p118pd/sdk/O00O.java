package com.p118pd.sdk;

import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import java.io.File;
import kotlin.p285io.FileWalkDirection;
import kotlin.p285io.FilesKt__FileReadWriteKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.O00O */
public class O00O extends FilesKt__FileReadWriteKt {
    @NotNull
    public static /* synthetic */ FileTreeWalk OooO00o(File file, FileWalkDirection fileWalkDirection, int i, Object obj) {
        if ((i & 1) != 0) {
            fileWalkDirection = FileWalkDirection.TOP_DOWN;
        }
        return OooO00o(file, fileWalkDirection);
    }

    @NotNull
    public static final FileTreeWalk OooO0O0(@NotNull File file) {
        o0O0OO00.OooO0o(file, "receiver$0");
        return OooO00o(file, FileWalkDirection.TOP_DOWN);
    }

    @NotNull
    public static final FileTreeWalk OooO00o(@NotNull File file, @NotNull FileWalkDirection fileWalkDirection) {
        o0O0OO00.OooO0o(file, "receiver$0");
        o0O0OO00.OooO0o(fileWalkDirection, RNGestureHandlerModule.KEY_DIRECTION);
        return new FileTreeWalk(file, fileWalkDirection);
    }

    @NotNull
    public static final FileTreeWalk OooO00o(@NotNull File file) {
        o0O0OO00.OooO0o(file, "receiver$0");
        return OooO00o(file, FileWalkDirection.BOTTOM_UP);
    }
}
