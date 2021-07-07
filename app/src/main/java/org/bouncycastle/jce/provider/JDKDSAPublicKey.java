package org.bouncycastle.jce.provider;

import com.p118pd.sdk.AbstractC5420Il1iIL;
import com.p118pd.sdk.AbstractC5533IiL;
import com.p118pd.sdk.AbstractC6854lLi1LL;
import com.p118pd.sdk.C5242IIl;
import com.p118pd.sdk.C6452l1Lll;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6513lIiI;
import com.p118pd.sdk.C6847lLI;
import com.p118pd.sdk.C6888ll;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;
import org.bouncycastle.util.Strings;

public class JDKDSAPublicKey implements DSAPublicKey {
    public static final long serialVersionUID = 1752452449903495175L;
    public DSAParams dsaSpec;

    /* renamed from: y */
    public BigInteger f13502y;

    public JDKDSAPublicKey(C5242IIl r4) {
        this.f13502y = r4.OooO00o();
        this.dsaSpec = new DSAParameterSpec(r4.OooO00o().OooO0O0(), r4.OooO00o().OooO0OO(), r4.OooO00o().m15991OooO00o());
    }

    public JDKDSAPublicKey(C6888ll r4) {
        try {
            this.f13502y = ((C6513lIiI) r4.OooO0o0()).m17647OooO0O0();
            if (OooO00o(r4.m18041OooO00o().m17587OooO0O0())) {
                C6847lLI OooO00o = C6847lLI.OooO00o(r4.m18041OooO00o().m17587OooO0O0());
                this.dsaSpec = new DSAParameterSpec(OooO00o.m17999OooO0O0(), OooO00o.OooO0OO(), OooO00o.OooO00o());
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    public JDKDSAPublicKey(BigInteger bigInteger, DSAParameterSpec dSAParameterSpec) {
        this.f13502y = bigInteger;
        this.dsaSpec = dSAParameterSpec;
    }

    public JDKDSAPublicKey(DSAPublicKey dSAPublicKey) {
        this.f13502y = dSAPublicKey.getY();
        this.dsaSpec = dSAPublicKey.getParams();
    }

    public JDKDSAPublicKey(DSAPublicKeySpec dSAPublicKeySpec) {
        this.f13502y = dSAPublicKeySpec.getY();
        this.dsaSpec = new DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
    }

    private boolean OooO00o(AbstractC6854lLi1LL r2) {
        return r2 != null && !C6452l1Lll.OooO00o.equals(r2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f13502y = (BigInteger) objectInputStream.readObject();
        this.dsaSpec = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.f13502y);
        objectOutputStream.writeObject(this.dsaSpec.getP());
        objectOutputStream.writeObject(this.dsaSpec.getQ());
        objectOutputStream.writeObject(this.dsaSpec.getG());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        return getY().equals(dSAPublicKey.getY()) && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ());
    }

    public String getAlgorithm() {
        return "DSA";
    }

    public byte[] getEncoded() {
        try {
            return this.dsaSpec == null ? new C6888ll(new C6456l1ilL(AbstractC5420Il1iIL.o00OOooo), new C6513lIiI(this.f13502y)).OooO00o(AbstractC5533IiL.OooO00o) : new C6888ll(new C6456l1ilL(AbstractC5420Il1iIL.o00OOooo, new C6847lLI(this.dsaSpec.getP(), this.dsaSpec.getQ(), this.dsaSpec.getG())), new C6513lIiI(this.f13502y)).OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public DSAParams getParams() {
        return this.dsaSpec;
    }

    public BigInteger getY() {
        return this.f13502y;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String OooO00o = Strings.m22984OooO00o();
        stringBuffer.append("DSA Public Key");
        stringBuffer.append(OooO00o);
        stringBuffer.append("            y: ");
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(OooO00o);
        return stringBuffer.toString();
    }
}
