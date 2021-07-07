package org.bouncycastle.jce.provider;

import com.p118pd.sdk.AbstractC5711LiLli;
import com.p118pd.sdk.C11lI;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C6412iliILI;
import com.p118pd.sdk.C6452l1Lll;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6563lL1Ll;
import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import org.bouncycastle.util.Strings;

public class JCERSAPrivateCrtKey extends JCERSAPrivateKey implements RSAPrivateCrtKey {
    public static final long serialVersionUID = 7834723820638524718L;
    public BigInteger crtCoefficient;
    public BigInteger primeExponentP;
    public BigInteger primeExponentQ;
    public BigInteger primeP;
    public BigInteger primeQ;
    public BigInteger publicExponent;

    public JCERSAPrivateCrtKey(C5464IlilIi r1) throws IOException {
        this(C6563lL1Ll.OooO00o(r1.m15708OooO0O0()));
    }

    public JCERSAPrivateCrtKey(C6563lL1Ll r2) {
        this.modulus = r2.OooO0Oo();
        this.publicExponent = r2.OooO0oo();
        this.privateExponent = r2.OooO0oO();
        this.primeP = r2.OooO0o0();
        this.primeQ = r2.OooO0o();
        this.primeExponentP = r2.m17663OooO0O0();
        this.primeExponentQ = r2.OooO0OO();
        this.crtCoefficient = r2.OooO00o();
    }

    public JCERSAPrivateCrtKey(C11lI r2) {
        super(r2);
        this.publicExponent = r2.OooO0o();
        this.primeP = r2.OooO0o0();
        this.primeQ = r2.OooO0oO();
        this.primeExponentP = r2.OooO0OO();
        this.primeExponentQ = r2.OooO0Oo();
        this.crtCoefficient = r2.OooO0oo();
    }

    public JCERSAPrivateCrtKey(RSAPrivateCrtKey rSAPrivateCrtKey) {
        this.modulus = rSAPrivateCrtKey.getModulus();
        this.publicExponent = rSAPrivateCrtKey.getPublicExponent();
        this.privateExponent = rSAPrivateCrtKey.getPrivateExponent();
        this.primeP = rSAPrivateCrtKey.getPrimeP();
        this.primeQ = rSAPrivateCrtKey.getPrimeQ();
        this.primeExponentP = rSAPrivateCrtKey.getPrimeExponentP();
        this.primeExponentQ = rSAPrivateCrtKey.getPrimeExponentQ();
        this.crtCoefficient = rSAPrivateCrtKey.getCrtCoefficient();
    }

    public JCERSAPrivateCrtKey(RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
        this.modulus = rSAPrivateCrtKeySpec.getModulus();
        this.publicExponent = rSAPrivateCrtKeySpec.getPublicExponent();
        this.privateExponent = rSAPrivateCrtKeySpec.getPrivateExponent();
        this.primeP = rSAPrivateCrtKeySpec.getPrimeP();
        this.primeQ = rSAPrivateCrtKeySpec.getPrimeQ();
        this.primeExponentP = rSAPrivateCrtKeySpec.getPrimeExponentP();
        this.primeExponentQ = rSAPrivateCrtKeySpec.getPrimeExponentQ();
        this.crtCoefficient = rSAPrivateCrtKeySpec.getCrtCoefficient();
    }

    @Override // org.bouncycastle.jce.provider.JCERSAPrivateKey
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RSAPrivateCrtKey)) {
            return false;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) obj;
        return getModulus().equals(rSAPrivateCrtKey.getModulus()) && getPublicExponent().equals(rSAPrivateCrtKey.getPublicExponent()) && getPrivateExponent().equals(rSAPrivateCrtKey.getPrivateExponent()) && getPrimeP().equals(rSAPrivateCrtKey.getPrimeP()) && getPrimeQ().equals(rSAPrivateCrtKey.getPrimeQ()) && getPrimeExponentP().equals(rSAPrivateCrtKey.getPrimeExponentP()) && getPrimeExponentQ().equals(rSAPrivateCrtKey.getPrimeExponentQ()) && getCrtCoefficient().equals(rSAPrivateCrtKey.getCrtCoefficient());
    }

    public BigInteger getCrtCoefficient() {
        return this.crtCoefficient;
    }

    @Override // org.bouncycastle.jce.provider.JCERSAPrivateKey
    public byte[] getEncoded() {
        return C6412iliILI.OooO00o(new C6456l1ilL(AbstractC5711LiLli.OooOoO0, C6452l1Lll.OooO00o), new C6563lL1Ll(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient()));
    }

    @Override // org.bouncycastle.jce.provider.JCERSAPrivateKey
    public String getFormat() {
        return "PKCS#8";
    }

    public BigInteger getPrimeExponentP() {
        return this.primeExponentP;
    }

    public BigInteger getPrimeExponentQ() {
        return this.primeExponentQ;
    }

    public BigInteger getPrimeP() {
        return this.primeP;
    }

    public BigInteger getPrimeQ() {
        return this.primeQ;
    }

    public BigInteger getPublicExponent() {
        return this.publicExponent;
    }

    @Override // org.bouncycastle.jce.provider.JCERSAPrivateKey
    public int hashCode() {
        return (getModulus().hashCode() ^ getPublicExponent().hashCode()) ^ getPrivateExponent().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String OooO00o = Strings.m22984OooO00o();
        stringBuffer.append("RSA Private CRT Key");
        stringBuffer.append(OooO00o);
        stringBuffer.append("            modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(OooO00o);
        stringBuffer.append("    public exponent: ");
        stringBuffer.append(getPublicExponent().toString(16));
        stringBuffer.append(OooO00o);
        stringBuffer.append("   private exponent: ");
        stringBuffer.append(getPrivateExponent().toString(16));
        stringBuffer.append(OooO00o);
        stringBuffer.append("             primeP: ");
        stringBuffer.append(getPrimeP().toString(16));
        stringBuffer.append(OooO00o);
        stringBuffer.append("             primeQ: ");
        stringBuffer.append(getPrimeQ().toString(16));
        stringBuffer.append(OooO00o);
        stringBuffer.append("     primeExponentP: ");
        stringBuffer.append(getPrimeExponentP().toString(16));
        stringBuffer.append(OooO00o);
        stringBuffer.append("     primeExponentQ: ");
        stringBuffer.append(getPrimeExponentQ().toString(16));
        stringBuffer.append(OooO00o);
        stringBuffer.append("     crtCoefficient: ");
        stringBuffer.append(getCrtCoefficient().toString(16));
        stringBuffer.append(OooO00o);
        return stringBuffer.toString();
    }
}
