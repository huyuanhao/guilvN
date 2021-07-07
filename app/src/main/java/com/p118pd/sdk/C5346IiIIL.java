package com.p118pd.sdk;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.IiIIL  reason: case insensitive filesystem */
public class C5346IiIIL implements LLLIl {
    @Override // com.p118pd.sdk.LLLIl
    public int OooO00o(byte[] bArr) throws InvalidCipherTextException {
        int i = bArr[bArr.length - 1] & 255;
        byte b = (byte) i;
        boolean z = (i > bArr.length) | (i == 0);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            z |= (bArr.length - i2 <= i) & (bArr[i2] != b);
        }
        if (!z) {
            return i;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }

    @Override // com.p118pd.sdk.LLLIl
    public int OooO00o(byte[] bArr, int i) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length) {
            bArr[i] = length;
            i++;
        }
        return length;
    }

    @Override // com.p118pd.sdk.LLLIl
    public String OooO00o() {
        return "PKCS7";
    }

    @Override // com.p118pd.sdk.LLLIl
    public void OooO00o(SecureRandom secureRandom) throws IllegalArgumentException {
    }
}
