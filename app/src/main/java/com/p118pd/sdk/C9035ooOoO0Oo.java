package com.p118pd.sdk;

import java.io.Closeable;

/* renamed from: com.pd.sdk.ooOoO0Oo  reason: case insensitive filesystem */
public class C9035ooOoO0Oo {
    public static void OooO00o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
