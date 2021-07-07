package org.bouncycastle.jcajce;

import com.p118pd.sdk.AbstractC6385iL;
import com.p118pd.sdk.C9586iIILl;

public class PBKDF2Key implements PBKDFKey {
    public final AbstractC6385iL converter;
    public final char[] password;

    public PBKDF2Key(char[] cArr, AbstractC6385iL r2) {
        this.password = C9586iIILl.m21634OooO00o(cArr);
        this.converter = r2;
    }

    public String getAlgorithm() {
        return "PBKDF2";
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
