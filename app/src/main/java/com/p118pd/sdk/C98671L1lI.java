package com.p118pd.sdk;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.丨丨丨1L1lI  reason: invalid class name and case insensitive filesystem */
public class C98671L1lI implements LLLIl {
    @Override // com.p118pd.sdk.LLLIl
    public int OooO00o(byte[] bArr) throws InvalidCipherTextException {
        int length = bArr.length;
        while (length > 0 && bArr[length - 1] == 0) {
            length--;
        }
        return bArr.length - length;
    }

    @Override // com.p118pd.sdk.LLLIl
    public int OooO00o(byte[] bArr, int i) {
        int length = bArr.length - i;
        while (i < bArr.length) {
            bArr[i] = 0;
            i++;
        }
        return length;
    }

    @Override // com.p118pd.sdk.LLLIl
    public String OooO00o() {
        return "ZeroByte";
    }

    @Override // com.p118pd.sdk.LLLIl
    public void OooO00o(SecureRandom secureRandom) throws IllegalArgumentException {
    }
}
