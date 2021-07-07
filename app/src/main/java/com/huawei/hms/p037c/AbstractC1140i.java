package com.huawei.hms.p037c;

import com.huawei.hms.support.log.C1202a;
import com.p118pd.sdk.LL1i;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.huawei.hms.c.i */
public abstract class AbstractC1140i {
    /* renamed from: a */
    public static byte[] m1088a(byte[] bArr) {
        try {
            return MessageDigest.getInstance(LL1i.OooO0Oo).digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            C1202a.m1320d("SHA256", "NoSuchAlgorithmException" + e.getMessage());
            return new byte[0];
        }
    }

    /* renamed from: a */
    public static byte[] m1087a(File file) {
        Throwable th;
        BufferedInputStream bufferedInputStream = null;
        try {
            MessageDigest instance = MessageDigest.getInstance(LL1i.OooO0Oo);
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                byte[] bArr = new byte[4096];
                int i = 0;
                while (true) {
                    int read = bufferedInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    i += read;
                    instance.update(bArr, 0, read);
                }
                if (i > 0) {
                    byte[] digest = instance.digest();
                    C1135e.m1070a((InputStream) bufferedInputStream2);
                    return digest;
                }
                C1135e.m1070a((InputStream) bufferedInputStream2);
                return new byte[0];
            } catch (IOException | NoSuchAlgorithmException unused) {
                bufferedInputStream = bufferedInputStream2;
                try {
                    C1202a.m1320d("SHA256", "An exception occurred while computing file 'SHA-256'.");
                    C1135e.m1070a((InputStream) bufferedInputStream);
                    return new byte[0];
                } catch (Throwable th2) {
                    th = th2;
                    C1135e.m1070a((InputStream) bufferedInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = bufferedInputStream2;
                C1135e.m1070a((InputStream) bufferedInputStream);
                throw th;
            }
        } catch (IOException | NoSuchAlgorithmException unused2) {
            C1202a.m1320d("SHA256", "An exception occurred while computing file 'SHA-256'.");
            C1135e.m1070a((InputStream) bufferedInputStream);
            return new byte[0];
        }
    }
}
