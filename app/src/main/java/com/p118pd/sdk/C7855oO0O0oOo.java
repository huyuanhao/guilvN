package com.p118pd.sdk;

import com.drew.imaging.ImageProcessingException;
import com.drew.lang.annotations.NotNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.oO0O0oOo  reason: case insensitive filesystem */
public class C7855oO0O0oOo {
    /* JADX INFO: finally extract failed */
    @NotNull
    public static C7925oO0o0OO0 OooO00o(@NotNull File file) throws ImageProcessingException, IOException {
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
    public static C7925oO0o0OO0 OooO00o(@NotNull InputStream inputStream) throws IOException {
        C7925oO0o0OO0 oo0o0oo0 = new C7925oO0o0OO0();
        C8291oOo00OOo.OooO00o(inputStream, new C8088oOOO000(oo0o0oo0));
        return oo0o0oo0;
    }
}
