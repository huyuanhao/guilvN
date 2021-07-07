package org.bouncycastle.jce.provider;

import com.p118pd.sdk.AbstractC5711LiLli;
import com.p118pd.sdk.C5724Liil;
import com.p118pd.sdk.C6412iliILI;
import com.p118pd.sdk.C6452l1Lll;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.C7491o0OoOOO;
import com.p118pd.sdk.liLI1l1i;
import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.util.Strings;

public class JCERSAPublicKey implements RSAPublicKey {
    public static final long serialVersionUID = 2675817738516720772L;
    public BigInteger modulus;
    public BigInteger publicExponent;

    public JCERSAPublicKey(liLI1l1i lili1l1i) {
        this.modulus = lili1l1i.OooO0O0();
        this.publicExponent = lili1l1i.OooO00o();
    }

    public JCERSAPublicKey(C6888ll r2) {
        try {
            C5724Liil OooO00o = C5724Liil.OooO00o(r2.OooO0o0());
            this.modulus = OooO00o.OooO00o();
            this.publicExponent = OooO00o.m16313OooO0O0();
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in RSA public key");
        }
    }

    public JCERSAPublicKey(RSAPublicKey rSAPublicKey) {
        this.modulus = rSAPublicKey.getModulus();
        this.publicExponent = rSAPublicKey.getPublicExponent();
    }

    public JCERSAPublicKey(RSAPublicKeySpec rSAPublicKeySpec) {
        this.modulus = rSAPublicKeySpec.getModulus();
        this.publicExponent = rSAPublicKeySpec.getPublicExponent();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RSAPublicKey)) {
            return false;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) obj;
        return getModulus().equals(rSAPublicKey.getModulus()) && getPublicExponent().equals(rSAPublicKey.getPublicExponent());
    }

    public String getAlgorithm() {
        return C7491o0OoOOO.OooO00o;
    }

    public byte[] getEncoded() {
        return C6412iliILI.OooO0O0(new C6456l1ilL(AbstractC5711LiLli.OooOoO0, C6452l1Lll.OooO00o), new C5724Liil(getModulus(), getPublicExponent()));
    }

    public String getFormat() {
        return "X.509";
    }

    public BigInteger getModulus() {
        return this.modulus;
    }

    public BigInteger getPublicExponent() {
        return this.publicExponent;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPublicExponent().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String OooO00o = Strings.m22984OooO00o();
        stringBuffer.append("RSA Public Key");
        stringBuffer.append(OooO00o);
        stringBuffer.append("            modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(OooO00o);
        stringBuffer.append("    public exponent: ");
        stringBuffer.append(getPublicExponent().toString(16));
        stringBuffer.append(OooO00o);
        return stringBuffer.toString();
    }
}
