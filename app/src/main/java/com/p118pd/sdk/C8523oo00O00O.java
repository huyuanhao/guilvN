package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.Deflater;

/* renamed from: com.pd.sdk.oo00O00O  reason: case insensitive filesystem */
public final class C8523oo00O00O {
    public static int OooO00o(String str) {
        if ("preins".equals(str)) {
            return 2;
        }
        return "maint".equals(str) ? 1 : 0;
    }

    public static void OooO00o(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
                AbstractC8536oo00OO0O.OooO0OO("StreamUtil", "closeStream(): Exception: close OutputStream error!");
            }
        }
    }

    public static byte[] OooO00o(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[1024];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        deflater.end();
        OooO00o(byteArrayOutputStream);
        return byteArray;
    }
}
