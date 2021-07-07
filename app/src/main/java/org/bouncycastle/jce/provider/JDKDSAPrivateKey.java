package org.bouncycastle.jce.provider;

import com.p118pd.sdk.AbstractC5420Il1iIL;
import com.p118pd.sdk.AbstractC5533IiL;
import com.p118pd.sdk.AbstractC6786llil;
import com.p118pd.sdk.AbstractC6854lLi1LL;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C5907Ll1LI;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6513lIiI;
import com.p118pd.sdk.C6847lLI;
import com.p118pd.sdk.LLi1i;
import com.p118pd.sdk.LlLI1;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.util.Enumeration;

public class JDKDSAPrivateKey implements DSAPrivateKey, AbstractC6786llil {
    public static final long serialVersionUID = -4677259546958385734L;
    public LLi1i attrCarrier = new LLi1i();
    public DSAParams dsaSpec;

    /* renamed from: x */
    public BigInteger f13501x;

    public JDKDSAPrivateKey() {
    }

    public JDKDSAPrivateKey(C5464IlilIi r4) throws IOException {
        C6847lLI OooO00o = C6847lLI.OooO00o(r4.m15707OooO0O0().m17587OooO0O0());
        this.f13501x = C6513lIiI.OooO00o(r4.m15708OooO0O0()).m17647OooO0O0();
        this.dsaSpec = new DSAParameterSpec(OooO00o.m17999OooO0O0(), OooO00o.OooO0OO(), OooO00o.OooO00o());
    }

    public JDKDSAPrivateKey(C5907Ll1LI r4) {
        this.f13501x = r4.OooO00o();
        this.dsaSpec = new DSAParameterSpec(r4.OooO00o().OooO0O0(), r4.OooO00o().OooO0OO(), r4.OooO00o().m15991OooO00o());
    }

    public JDKDSAPrivateKey(DSAPrivateKey dSAPrivateKey) {
        this.f13501x = dSAPrivateKey.getX();
        this.dsaSpec = dSAPrivateKey.getParams();
    }

    public JDKDSAPrivateKey(DSAPrivateKeySpec dSAPrivateKeySpec) {
        this.f13501x = dSAPrivateKeySpec.getX();
        this.dsaSpec = new DSAParameterSpec(dSAPrivateKeySpec.getP(), dSAPrivateKeySpec.getQ(), dSAPrivateKeySpec.getG());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f13501x = (BigInteger) objectInputStream.readObject();
        this.dsaSpec = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        LLi1i r0 = new LLi1i();
        this.attrCarrier = r0;
        r0.OooO00o(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.f13501x);
        objectOutputStream.writeObject(this.dsaSpec.getP());
        objectOutputStream.writeObject(this.dsaSpec.getQ());
        objectOutputStream.writeObject(this.dsaSpec.getG());
        this.attrCarrier.OooO00o(objectOutputStream);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPrivateKey)) {
            return false;
        }
        DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) obj;
        return getX().equals(dSAPrivateKey.getX()) && getParams().getG().equals(dSAPrivateKey.getParams().getG()) && getParams().getP().equals(dSAPrivateKey.getParams().getP()) && getParams().getQ().equals(dSAPrivateKey.getParams().getQ());
    }

    public String getAlgorithm() {
        return "DSA";
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public AbstractC6854lLi1LL getBagAttribute(LlLI1 llLI1) {
        return this.attrCarrier.getBagAttribute(llLI1);
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    public byte[] getEncoded() {
        try {
            return new C5464IlilIi(new C6456l1ilL(AbstractC5420Il1iIL.o00OOooo, new C6847lLI(this.dsaSpec.getP(), this.dsaSpec.getQ(), this.dsaSpec.getG())), new C6513lIiI(getX())).OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public DSAParams getParams() {
        return this.dsaSpec;
    }

    public BigInteger getX() {
        return this.f13501x;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public void setBagAttribute(LlLI1 llLI1, AbstractC6854lLi1LL r3) {
        this.attrCarrier.setBagAttribute(llLI1, r3);
    }
}
