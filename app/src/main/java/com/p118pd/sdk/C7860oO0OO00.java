package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.oO0OO00  reason: case insensitive filesystem */
public class C7860oO0OO00 {
    /* JADX INFO: finally extract failed */
    @NotNull
    public static C7925oO0o0OO0 OooO00o(@NotNull File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            C7925oO0o0OO0 OooO00o = OooO00o(fileInputStream);
            fileInputStream.close();
            new oOO00O0O().OooO00o(file, OooO00o);
            return OooO00o;
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    @NotNull
    public static C7925oO0o0OO0 OooO00o(@NotNull InputStream inputStream) {
        C7925oO0o0OO0 oo0o0oo0 = new C7925oO0o0OO0();
        new C8125oOOOOo0().OooO00o(new C8986ooOOoOoo(inputStream), oo0o0oo0);
        return oo0o0oo0;
    }
}
