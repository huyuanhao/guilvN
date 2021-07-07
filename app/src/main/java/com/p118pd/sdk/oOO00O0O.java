package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/* renamed from: com.pd.sdk.oOO00O0O */
public class oOO00O0O {
    public void OooO00o(@NotNull File file, @NotNull C7925oO0o0OO0 oo0o0oo0) throws IOException {
        if (!file.isFile()) {
            throw new IOException("File object must reference a file");
        } else if (!file.exists()) {
            throw new IOException("File does not exist");
        } else if (file.canRead()) {
            oOO00O0 ooo00o0 = (oOO00O0) oo0o0oo0.OooO00o(oOO00O0.class);
            if (ooo00o0 == null) {
                ooo00o0 = new oOO00O0();
                oo0o0oo0.OooO00o(ooo00o0);
            }
            ooo00o0.m19648OooO00o(1, file.getName());
            ooo00o0.OooO00o(2, file.length());
            ooo00o0.OooO00o(3, new Date(file.lastModified()));
        } else {
            throw new IOException("File is not readable");
        }
    }
}
