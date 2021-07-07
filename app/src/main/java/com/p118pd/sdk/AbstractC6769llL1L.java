package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.llL1L  reason: case insensitive filesystem */
public interface AbstractC6769llL1L {
    int OooO00o();

    int OooO00o(byte[] bArr, int i) throws DataLengthException, IllegalStateException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    String m17871OooO00o();

    void OooO00o(AbstractC6370iIIIl v) throws IllegalArgumentException;

    void reset();

    void update(byte b) throws IllegalStateException;

    void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException;
}
