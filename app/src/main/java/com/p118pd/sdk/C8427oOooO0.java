package com.p118pd.sdk;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOooO0  reason: case insensitive filesystem */
public final class C8427oOooO0 {
    public static void OooO00o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                C8425oOoo0ooo.OooO00o("close fail");
            }
        }
    }
}
