package org.bouncycastle.jcajce;

import com.p118pd.sdk.AbstractC6385iL;

public class PBKDF1Key implements PBKDFKey {
    public final AbstractC6385iL converter;
    public final char[] password;

    public PBKDF1Key(char[] cArr, AbstractC6385iL r4) {
        char[] cArr2 = new char[cArr.length];
        this.password = cArr2;
        this.converter = r4;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    public String getAlgorithm() {
        return "PBKDF1";
    }

    public byte[] getEncoded() {
        return this.converter.convert(this.password);
    }

    public String getFormat() {
        return this.converter.getType();
    }

    public char[] getPassword() {
        return this.password;
    }
}
