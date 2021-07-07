package com.p118pd.sdk;

import com.drew.imaging.jpeg.JpegProcessingException;
import com.drew.lang.annotations.NotNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.oO0OOO */
public class oO0OOO {
    public oO0OOO() throws Exception {
        throw new Exception("Not intended for instantiation");
    }

    /* JADX INFO: finally extract failed */
    @NotNull
    public static C7925oO0o0OO0 OooO00o(@NotNull File file) throws JpegProcessingException, IOException {
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
    public static C7925oO0o0OO0 OooO00o(@NotNull InputStream inputStream) throws JpegProcessingException, IOException {
        if (inputStream.markSupported()) {
            inputStream.mark(512);
            byte[] bArr = new byte[512];
            int read = inputStream.read(bArr);
            if (read != -1) {
                inputStream.reset();
                int i = 0;
                while (true) {
                    if (i >= read - 2) {
                        break;
                    } else if (bArr[i] == -1 && bArr[i + 1] == -40 && bArr[i + 2] == -1) {
                        long j = (long) i;
                        if (inputStream.skip(j) != j) {
                            throw new IOException("Skipping stream bytes failed");
                        }
                    } else {
                        i++;
                    }
                }
                return C7853oO0O0oO0.OooO00o(inputStream);
            }
            throw new IOException("Stream is empty");
        }
        throw new IOException("Stream must support mark/reset");
    }
}
