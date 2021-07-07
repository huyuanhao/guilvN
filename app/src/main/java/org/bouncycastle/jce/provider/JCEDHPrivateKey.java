package org.bouncycastle.jce.provider;

import com.p118pd.sdk.AbstractC5420Il1iIL;
import com.p118pd.sdk.AbstractC5533IiL;
import com.p118pd.sdk.AbstractC5711LiLli;
import com.p118pd.sdk.AbstractC6786llil;
import com.p118pd.sdk.AbstractC6854lLi1LL;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C5866Li1;
import com.p118pd.sdk.C6389ii;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6513lIiI;
import com.p118pd.sdk.C6771llLL;
import com.p118pd.sdk.I11li1;
import com.p118pd.sdk.LLi1i;
import com.p118pd.sdk.LlLI1;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;

public class JCEDHPrivateKey implements DHPrivateKey, AbstractC6786llil {
    public static final long serialVersionUID = 311058815616901812L;
    public AbstractC6786llil attrCarrier = new LLi1i();
    public DHParameterSpec dhSpec;
    public C5464IlilIi info;

    /* renamed from: x */
    public BigInteger f13495x;

    public JCEDHPrivateKey() {
    }

    public JCEDHPrivateKey(C5464IlilIi r4) throws IOException {
        DHParameterSpec dHParameterSpec;
        I11li1 OooO00o = I11li1.OooO00o(r4.m15706OooO00o().m17587OooO0O0());
        C6513lIiI OooO00o2 = C6513lIiI.OooO00o(r4.m15708OooO0O0());
        LlLI1 OooO00o3 = r4.m15706OooO00o().OooO00o();
        this.info = r4;
        this.f13495x = OooO00o2.m17647OooO0O0();
        if (OooO00o3.equals(AbstractC5711LiLli.Oooo)) {
            C5866Li1 OooO00o4 = C5866Li1.OooO00o(OooO00o);
            dHParameterSpec = OooO00o4.m16445OooO0O0() != null ? new DHParameterSpec(OooO00o4.OooO0OO(), OooO00o4.OooO00o(), OooO00o4.m16445OooO0O0().intValue()) : new DHParameterSpec(OooO00o4.OooO0OO(), OooO00o4.OooO00o());
        } else if (OooO00o3.equals(AbstractC5420Il1iIL.o00Oo0Oo)) {
            C6771llLL OooO00o5 = C6771llLL.OooO00o(OooO00o);
            dHParameterSpec = new DHParameterSpec(OooO00o5.OooO0OO().m17647OooO0O0(), OooO00o5.m17877OooO00o().m17647OooO0O0());
        } else {
            throw new IllegalArgumentException("unknown algorithm type: " + OooO00o3);
        }
        this.dhSpec = dHParameterSpec;
    }

    public JCEDHPrivateKey(C6389ii r4) {
        this.f13495x = r4.OooO00o();
        this.dhSpec = new DHParameterSpec(r4.OooO00o().OooO0OO(), r4.OooO00o().m16863OooO00o(), r4.OooO00o().OooO00o());
    }

    public JCEDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.f13495x = dHPrivateKey.getX();
        this.dhSpec = dHPrivateKey.getParams();
    }

    public JCEDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.f13495x = dHPrivateKeySpec.getX();
        this.dhSpec = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f13495x = (BigInteger) objectInputStream.readObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getX());
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    public String getAlgorithm() {
        return "DH";
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
            return this.info != null ? this.info.OooO00o(AbstractC5533IiL.OooO00o) : new C5464IlilIi(new C6456l1ilL(AbstractC5711LiLli.Oooo, new C5866Li1(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL())), new C6513lIiI(getX())).OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public DHParameterSpec getParams() {
        return this.dhSpec;
    }

    public BigInteger getX() {
        return this.f13495x;
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public void setBagAttribute(LlLI1 llLI1, AbstractC6854lLi1LL r3) {
        this.attrCarrier.setBagAttribute(llLI1, r3);
    }
}
