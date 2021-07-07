package com.p118pd.sdk;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.iIl  reason: case insensitive filesystem */
public class C6116iIl implements LLLIl {
    @Override // com.p118pd.sdk.LLLIl
    public int OooO00o(byte[] bArr) throws InvalidCipherTextException {
        byte b = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        while (length > 0 && bArr[length - 1] == b) {
            length--;
        }
        return bArr.length - length;
    }

    @Override // com.p118pd.sdk.LLLIl
    public int OooO00o(byte[] bArr, int i) {
        int length = bArr.length - i;
        int i2 = 255;
        if (i <= 0 ? (bArr[bArr.length - 1] & 1) != 0 : (bArr[i - 1] & 1) != 0) {
            i2 = 0;
        }
        byte b = (byte) i2;
        while (i < bArr.length) {
            bArr[i] = b;
            i++;
        }
        return length;
    }

    @Override // com.p118pd.sdk.LLLIl
    public String OooO00o() {
        return "TBC";
    }

    @Override // com.p118pd.sdk.LLLIl
    public void OooO00o(SecureRandom secureRandom) throws IllegalArgumentException {
    }
}
