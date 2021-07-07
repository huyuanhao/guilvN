package org.bouncycastle.jcajce;

import com.p118pd.sdk.C9586iIILl;
import javax.crypto.interfaces.PBEKey;

public class PKCS12KeyWithParameters extends PKCS12Key implements PBEKey {
    public final int iterationCount;
    public final byte[] salt;

    public PKCS12KeyWithParameters(char[] cArr, boolean z, byte[] bArr, int i) {
        super(cArr, z);
        this.salt = C9586iIILl.m21630OooO00o(bArr);
        this.iterationCount = i;
    }

    public PKCS12KeyWithParameters(char[] cArr, byte[] bArr, int i) {
        super(cArr);
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
