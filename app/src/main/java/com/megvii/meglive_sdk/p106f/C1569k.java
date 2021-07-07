package com.megvii.meglive_sdk.p106f;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.megvii.meglive_sdk.f.k */
public final class C1569k {
    /* renamed from: a */
    public static byte[] m2646a(File file) {
        if (file == null) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
