package com.p118pd.sdk;

import java.io.OutputStream;
import java.security.KeyStore;

/* renamed from: com.pd.sdk.l丨I1iI  reason: invalid class name and case insensitive filesystem */
public class C6819lI1iI extends IIlIi {
    public C6819lI1iI(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter) {
        super(outputStream, protectionParameter, false);
    }

    public C6819lI1iI(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter, boolean z) {
        super(outputStream, protectionParameter, z);
    }

    public C6819lI1iI(OutputStream outputStream, char[] cArr) {
        super(outputStream, cArr, false);
    }

    public C6819lI1iI(OutputStream outputStream, char[] cArr, boolean z) {
        super(outputStream, new KeyStore.PasswordProtection(cArr), z);
    }
}
