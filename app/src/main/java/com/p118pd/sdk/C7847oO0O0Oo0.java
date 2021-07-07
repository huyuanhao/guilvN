package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.oO0O0Oo0  reason: case insensitive filesystem */
public class C7847oO0O0Oo0 {
    @NotNull
    public static C7925oO0o0OO0 OooO00o(@NotNull File file) throws IOException {
        C7925oO0o0OO0 oo0o0oo0 = new C7925oO0o0OO0();
        new C7941oO0o0ooo().OooO00o(new FileInputStream(file), oo0o0oo0);
        new oOO00O0O().OooO00o(file, oo0o0oo0);
        return oo0o0oo0;
    }

    @NotNull
    public static C7925oO0o0OO0 OooO00o(@NotNull InputStream inputStream) throws IOException {
        C7925oO0o0OO0 oo0o0oo0 = new C7925oO0o0OO0();
        new C7941oO0o0ooo().OooO00o(inputStream, oo0o0oo0);
        return oo0o0oo0;
    }
}
