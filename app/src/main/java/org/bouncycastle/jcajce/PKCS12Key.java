package org.bouncycastle.jcajce;

import com.p118pd.sdk.lLLL1iL;

public class PKCS12Key implements PBKDFKey {
    public final char[] password;
    public final boolean useWrongZeroLengthConversion;

    public PKCS12Key(char[] cArr) {
        this(cArr, false);
    }

    public PKCS12Key(char[] cArr, boolean z) {
        cArr = cArr == null ? new char[0] : cArr;
        char[] cArr2 = new char[cArr.length];
        this.password = cArr2;
        this.useWrongZeroLengthConversion = z;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    public String getAlgorithm() {
        return "PKCS12";
    }

    public byte[] getEncoded() {
        return (!this.useWrongZeroLengthConversion || this.password.length != 0) ? lLLL1iL.OooO00o(this.password) : new byte[2];
    }

    public String getFormat() {
        return "PKCS12";
    }

    public char[] getPassword() {
        return this.password;
    }
}
