package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class zzhb {
    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        zzks.checkNotNull(inputStream);
        zzks.checkNotNull(outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }
}
