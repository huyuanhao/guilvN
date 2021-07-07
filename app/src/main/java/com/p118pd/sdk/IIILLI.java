package com.p118pd.sdk;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.I丨IILLI  reason: invalid class name */
public class IIILLI implements LLLIl {
    public SecureRandom OooO00o;

    @Override // com.p118pd.sdk.LLLIl
    public int OooO00o(byte[] bArr) throws InvalidCipherTextException {
        int i = bArr[bArr.length - 1] & 255;
        if (i <= bArr.length) {
            return i;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }

    @Override // com.p118pd.sdk.LLLIl
    public int OooO00o(byte[] bArr, int i) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length - 1) {
            bArr[i] = (byte) this.OooO00o.nextInt();
            i++;
        }
        bArr[i] = length;
        return length;
    }

    @Override // com.p118pd.sdk.LLLIl
    public String OooO00o() {
        return "ISO10126-2";
    }

    @Override // com.p118pd.sdk.LLLIl
    public void OooO00o(SecureRandom secureRandom) throws IllegalArgumentException {
        if (secureRandom == null) {
            secureRandom = IIllii.OooO00o();
        }
        this.OooO00o = secureRandom;
    }
}
