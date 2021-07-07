package com.p118pd.sdk;

import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.丨1丨I1  reason: invalid class name and case insensitive filesystem */
public interface AbstractC93171I1 {
    void OooO00o(boolean z, AbstractC6370iIIIl v);

    boolean OooO00o(byte[] bArr);

    byte[] OooO0O0() throws CryptoException, DataLengthException;

    void reset();

    void update(byte b);

    void update(byte[] bArr, int i, int i2);
}
