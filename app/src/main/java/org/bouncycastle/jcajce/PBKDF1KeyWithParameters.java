package org.bouncycastle.jcajce;

import com.p118pd.sdk.AbstractC6385iL;
import com.p118pd.sdk.C9586iIILl;
import javax.crypto.interfaces.PBEKey;

public class PBKDF1KeyWithParameters extends PBKDF1Key implements PBEKey {
    public final int iterationCount;
    public final byte[] salt;

    public PBKDF1KeyWithParameters(char[] cArr, AbstractC6385iL r2, byte[] bArr, int i) {
        super(cArr, r2);
        this.salt = C9586iIILl.m21630OooO00o(bArr);
        this.iterationCount = i;
    }

    public int getIterationCount() {
        return this.iterationCount;
    }

    public byte[] getSalt() {
        return this.salt;
    }
}
