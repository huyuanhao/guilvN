package org.bouncycastle.jce.provider;

import com.p118pd.sdk.AbstractC6786llil;
import com.p118pd.sdk.AbstractC6854lLi1LL;
import com.p118pd.sdk.AbstractC9733l;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C5838L1lI;
import com.p118pd.sdk.C6020i1Il;
import com.p118pd.sdk.C6336illiIil;
import com.p118pd.sdk.C6412iliILI;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6513lIiI;
import com.p118pd.sdk.C6791lllI;
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
import org.bouncycastle.jce.interfaces.ElGamalPrivateKey;

public class JCEElGamalPrivateKey implements ElGamalPrivateKey, DHPrivateKey, AbstractC6786llil {
    public static final long serialVersionUID = 4819350091141529678L;
    public LLi1i attrCarrier = new LLi1i();
    public C6791lllI elSpec;

    /* renamed from: x */
    public BigInteger f13499x;

    public JCEElGamalPrivateKey() {
    }

    public JCEElGamalPrivateKey(C5464IlilIi r3) throws IOException {
        C5838L1lI OooO00o = C5838L1lI.OooO00o(r3.m15707OooO0O0().m17587OooO0O0());
        this.f13499x = C6513lIiI.OooO00o(r3.m15708OooO0O0()).m17647OooO0O0();
        this.elSpec = new C6791lllI(OooO00o.m16425OooO0O0(), OooO00o.OooO00o());
    }

    public JCEElGamalPrivateKey(C6020i1Il r3) {
        this.f13499x = r3.OooO00o();
        this.elSpec = new C6791lllI(r3.OooO00o().OooO0O0(), r3.OooO00o().OooO00o());
    }

    public JCEElGamalPrivateKey(C6336illiIil r3) {
        this.f13499x = r3.OooO00o();
        this.elSpec = new C6791lllI(r3.OooO00o().OooO0O0(), r3.OooO00o().m15512OooO00o());
    }

    public JCEElGamalPrivateKey(DHPrivateKey dHPrivateKey) {
        this.f13499x = dHPrivateKey.getX();
        this.elSpec = new C6791lllI(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
    }

    public JCEElGamalPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.f13499x = dHPrivateKeySpec.getX();
        this.elSpec = new C6791lllI(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public JCEElGamalPrivateKey(ElGamalPrivateKey elGamalPrivateKey) {
        this.f13499x = elGamalPrivateKey.getX();
        this.elSpec = elGamalPrivateKey.getParameters();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f13499x = (BigInteger) objectInputStream.readObject();
        this.elSpec = new C6791lllI((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getX());
        objectOutputStream.writeObject(this.elSpec.OooO0O0());
        objectOutputStream.writeObject(this.elSpec.OooO00o());
    }

    public String getAlgorithm() {
        return "ElGamal";
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
        return C6412iliILI.OooO00o(new C6456l1ilL(AbstractC9733l.OooOO0o, new C5838L1lI(this.elSpec.OooO0O0(), this.elSpec.OooO00o())), new C6513lIiI(getX()));
    }

    public String getFormat() {
        return "PKCS#8";
    }

    @Override // com.p118pd.sdk.IIL1l1L
    public C6791lllI getParameters() {
        return this.elSpec;
    }

    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.elSpec.OooO0O0(), this.elSpec.OooO00o());
    }

    @Override // org.bouncycastle.jce.interfaces.ElGamalPrivateKey
    public BigInteger getX() {
        return this.f13499x;
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public void setBagAttribute(LlLI1 llLI1, AbstractC6854lLi1LL r3) {
        this.attrCarrier.setBagAttribute(llLI1, r3);
    }
}
