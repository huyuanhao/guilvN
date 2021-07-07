package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.p118pd.sdk.AbstractC5711LiLli;
import com.p118pd.sdk.AbstractC6786llil;
import com.p118pd.sdk.AbstractC6854lLi1LL;
import com.p118pd.sdk.C6412iliILI;
import com.p118pd.sdk.C6452l1Lll;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6563lL1Ll;
import com.p118pd.sdk.C7491o0OoOOO;
import com.p118pd.sdk.LLi1i;
import com.p118pd.sdk.LlLI1;
import com.p118pd.sdk.liLI1l1i;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;

public class BCRSAPrivateKey implements RSAPrivateKey, AbstractC6786llil {
    public static BigInteger OooO00o = BigInteger.valueOf(0);
    public static final long serialVersionUID = 5110188922551353628L;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient LLi1i f23937OooO00o = new LLi1i();
    public BigInteger modulus;
    public BigInteger privateExponent;

    public BCRSAPrivateKey() {
    }

    public BCRSAPrivateKey(C6563lL1Ll r2) {
        this.modulus = r2.OooO0Oo();
        this.privateExponent = r2.OooO0oO();
    }

    public BCRSAPrivateKey(liLI1l1i lili1l1i) {
        this.modulus = lili1l1i.OooO0O0();
        this.privateExponent = lili1l1i.OooO00o();
    }

    public BCRSAPrivateKey(RSAPrivateKey rSAPrivateKey) {
        this.modulus = rSAPrivateKey.getModulus();
        this.privateExponent = rSAPrivateKey.getPrivateExponent();
    }

    public BCRSAPrivateKey(RSAPrivateKeySpec rSAPrivateKeySpec) {
        this.modulus = rSAPrivateKeySpec.getModulus();
        this.privateExponent = rSAPrivateKeySpec.getPrivateExponent();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f23937OooO00o = new LLi1i();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RSAPrivateKey)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) obj;
        return getModulus().equals(rSAPrivateKey.getModulus()) && getPrivateExponent().equals(rSAPrivateKey.getPrivateExponent());
    }

    public String getAlgorithm() {
        return C7491o0OoOOO.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public AbstractC6854lLi1LL getBagAttribute(LlLI1 llLI1) {
        return this.f23937OooO00o.getBagAttribute(llLI1);
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public Enumeration getBagAttributeKeys() {
        return this.f23937OooO00o.getBagAttributeKeys();
    }

    public byte[] getEncoded() {
        C6456l1ilL r0 = new C6456l1ilL(AbstractC5711LiLli.OooOoO0, C6452l1Lll.OooO00o);
        BigInteger modulus2 = getModulus();
        BigInteger bigInteger = OooO00o;
        BigInteger privateExponent2 = getPrivateExponent();
        BigInteger bigInteger2 = OooO00o;
        return C6412iliILI.OooO00o(r0, new C6563lL1Ll(modulus2, bigInteger, privateExponent2, bigInteger2, bigInteger2, bigInteger2, bigInteger2, bigInteger2));
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public BigInteger getModulus() {
        return this.modulus;
    }

    public BigInteger getPrivateExponent() {
        return this.privateExponent;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPrivateExponent().hashCode();
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public void setBagAttribute(LlLI1 llLI1, AbstractC6854lLi1LL r3) {
        this.f23937OooO00o.setBagAttribute(llLI1, r3);
    }
}
