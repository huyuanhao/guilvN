package com.alipay.android.phone.mrpc.core;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.alipay.android.phone.mrpc.core.r */
public final class C0372r {
    /* renamed from: a */
    public static void m719a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
