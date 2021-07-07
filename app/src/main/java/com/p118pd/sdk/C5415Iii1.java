package com.p118pd.sdk;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.Ii丨丨i1  reason: invalid class name and case insensitive filesystem */
public class C5415Iii1 implements LLLIl {
    @Override // com.p118pd.sdk.LLLIl
    public int OooO00o(byte[] bArr) throws InvalidCipherTextException {
        int length = bArr.length - 1;
        while (length > 0 && bArr[length] == 0) {
            length--;
        }
        if (bArr[length] == Byte.MIN_VALUE) {
            return bArr.length - length;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }

    @Override // com.p118pd.sdk.LLLIl
    public int OooO00o(byte[] bArr, int i) {
        int length = bArr.length - i;
        bArr[i] = O0O00O.OooO00o;
        while (true) {
            i++;
            if (i >= bArr.length) {
                return length;
            }
            bArr[i] = 0;
        }
    }

    @Override // com.p118pd.sdk.LLLIl
    public String OooO00o() {
        return "ISO7816-4";
    }

    @Override // com.p118pd.sdk.LLLIl
    public void OooO00o(SecureRandom secureRandom) throws IllegalArgumentException {
    }
}
