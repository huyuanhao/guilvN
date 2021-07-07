package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.oO0O0oo0  reason: case insensitive filesystem */
public class C7856oO0O0oo0 {
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
        new C8117oOOOO0O().OooO00o(new C8986ooOOoOoo(inputStream), oo0o0oo0);
        return oo0o0oo0;
    }
}
