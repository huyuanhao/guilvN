package com.p118pd.sdk;

import com.drew.imaging.tiff.TiffProcessingException;
import com.drew.lang.annotations.NotNull;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: com.pd.sdk.oO0OOo0  reason: case insensitive filesystem */
public class C7872oO0OOo0 {
    /* JADX INFO: finally extract failed */
    @NotNull
    public static C7925oO0o0OO0 OooO00o(@NotNull File file) throws IOException, TiffProcessingException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            C7925oO0o0OO0 OooO00o = OooO00o(new C7907oO0OooO(randomAccessFile));
            randomAccessFile.close();
            new oOO00O0O().OooO00o(file, OooO00o);
            return OooO00o;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    @NotNull
    public static C7925oO0o0OO0 OooO00o(@NotNull InputStream inputStream) throws IOException, TiffProcessingException {
        return OooO00o(new oO0o0000(inputStream));
    }

    @NotNull
    public static C7925oO0o0OO0 OooO00o(@NotNull AbstractC7911oO0Oooo oo0oooo) throws IOException, TiffProcessingException {
        C7925oO0o0OO0 oo0o0oo0 = new C7925oO0o0OO0();
        new C7871oO0OOo().OooO00o(oo0oooo, new C7950oO0oO0o0(oo0o0oo0, null), 0);
        return oo0o0oo0;
    }
}
