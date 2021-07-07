package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.lIl1Li  reason: case insensitive filesystem */
public class C6516lIl1Li implements AbstractC5430IlIl {
    @Override // com.p118pd.sdk.AbstractC5430IlIl
    public byte[] OooO00o(C6456l1ilL r2, int i, byte[] bArr) {
        try {
            return new LiiLIiIL(r2, bArr, AbstractC6464l1l.OooO00o(i)).OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException e) {
            throw new IllegalStateException("Unable to create KDF material: " + e);
        }
    }
}
