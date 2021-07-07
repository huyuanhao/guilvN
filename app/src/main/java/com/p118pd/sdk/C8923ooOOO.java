package com.p118pd.sdk;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.pd.sdk.ooOOO  reason: case insensitive filesystem */
public class C8923ooOOO {
    public C8923ooOOO() {
        throw new AssertionError();
    }

    public static void OooO00o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                throw new RuntimeException("IOException occurred. ", e);
            }
        }
    }

    public static void OooO0O0(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
