package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.p118pd.sdk.AbstractC5711LiLli;
import com.p118pd.sdk.C5724Liil;
import com.p118pd.sdk.C6412iliILI;
import com.p118pd.sdk.C6452l1Lll;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6703lill;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.C7491o0OoOOO;
import com.p118pd.sdk.liLI1l1i;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.util.Strings;

public class BCRSAPublicKey implements RSAPublicKey {
    public static final C6456l1ilL OooO0O0 = new C6456l1ilL(AbstractC5711LiLli.OooOoO0, C6452l1Lll.OooO00o);
    public static final long serialVersionUID = 2675817738516720772L;
    public transient C6456l1ilL OooO00o;
    public BigInteger modulus;
    public BigInteger publicExponent;

    public BCRSAPublicKey(liLI1l1i lili1l1i) {
        this.OooO00o = OooO0O0;
        this.modulus = lili1l1i.OooO0O0();
        this.publicExponent = lili1l1i.OooO00o();
    }

    public BCRSAPublicKey(C6888ll r1) {
        OooO00o(r1);
    }

    public BCRSAPublicKey(RSAPublicKey rSAPublicKey) {
        this.OooO00o = OooO0O0;
        this.modulus = rSAPublicKey.getModulus();
        this.publicExponent = rSAPublicKey.getPublicExponent();
    }

    public BCRSAPublicKey(RSAPublicKeySpec rSAPublicKeySpec) {
        this.OooO00o = OooO0O0;
        this.modulus = rSAPublicKeySpec.getModulus();
        this.publicExponent = rSAPublicKeySpec.getPublicExponent();
    }

    private void OooO00o(C6888ll r2) {
        try {
            C5724Liil OooO00o2 = C5724Liil.OooO00o(r2.OooO0o0());
            this.OooO00o = r2.m18041OooO00o();
            this.modulus = OooO00o2.OooO00o();
            this.publicExponent = OooO00o2.m16313OooO0O0();
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in RSA public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        try {
            this.OooO00o = C6456l1ilL.OooO00o(objectInputStream.readObject());
        } catch (Exception unused) {
            this.OooO00o = OooO0O0;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        if (!this.OooO00o.equals(OooO0O0)) {
            objectOutputStream.writeObject(this.OooO00o.getEncoded());
        }
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
        return C6412iliILI.OooO0O0(this.OooO00o, new C5724Liil(getModulus(), getPublicExponent()));
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
        String OooO00o2 = Strings.m22984OooO00o();
        stringBuffer.append("RSA Public Key [");
        stringBuffer.append(C6703lill.OooO00o(getModulus(), getPublicExponent()));
        stringBuffer.append("]");
        stringBuffer.append(OooO00o2);
        stringBuffer.append("            modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(OooO00o2);
        stringBuffer.append("    public exponent: ");
        stringBuffer.append(getPublicExponent().toString(16));
        stringBuffer.append(OooO00o2);
        return stringBuffer.toString();
    }
}
