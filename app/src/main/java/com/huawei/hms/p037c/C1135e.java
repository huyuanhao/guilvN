package com.huawei.hms.p037c;

import com.huawei.hms.support.log.C1202a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.huawei.hms.c.e */
public final class C1135e {
    /* renamed from: a */
    public static void m1070a(InputStream inputStream) {
        m1069a((Closeable) inputStream);
    }

    /* renamed from: a */
    public static void m1071a(OutputStream outputStream) {
        m1069a((Closeable) outputStream);
    }

    /* renamed from: a */
    public static void m1069a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                C1202a.m1320d("IOUtils", "An exception occurred while closing the 'Closeable' object.");
            }
        }
    }
}
