package com.megvii.meglive_sdk.p106f;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.megvii.meglive_sdk.f.q */
public final class C1576q {
    /* renamed from: a */
    public static byte[] m2667a(Context context, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        InputStream inputStream = null;
        try {
            InputStream openRawResource = context.getResources().openRawResource(i);
            while (true) {
                int read = openRawResource.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.close();
            if (openRawResource != null) {
                try {
                    openRawResource.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            if (0 != 0) {
                inputStream.close();
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            throw th;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
