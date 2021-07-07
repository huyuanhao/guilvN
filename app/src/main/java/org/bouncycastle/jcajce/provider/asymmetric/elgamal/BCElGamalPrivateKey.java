package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import com.p118pd.sdk.AbstractC5533IiL;
import com.p118pd.sdk.AbstractC6786llil;
import com.p118pd.sdk.AbstractC6854lLi1LL;
import com.p118pd.sdk.AbstractC9733l;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C5838L1lI;
import com.p118pd.sdk.C6020i1Il;
import com.p118pd.sdk.C6336illiIil;
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

public class BCElGamalPrivateKey implements ElGamalPrivateKey, DHPrivateKey, AbstractC6786llil {
    public static final long serialVersionUID = 4819350091141529678L;
    public transient LLi1i OooO00o = new LLi1i();

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient C6791lllI f23935OooO00o;

    /* renamed from: x */
    public BigInteger f13490x;

    public BCElGamalPrivateKey() {
    }

    public BCElGamalPrivateKey(C5464IlilIi r3) throws IOException {
        C5838L1lI OooO00o2 = C5838L1lI.OooO00o(r3.m15707OooO0O0().m17587OooO0O0());
        this.f13490x = C6513lIiI.OooO00o(r3.m15708OooO0O0()).m17647OooO0O0();
        this.f23935OooO00o = new C6791lllI(OooO00o2.m16425OooO0O0(), OooO00o2.OooO00o());
    }

    public BCElGamalPrivateKey(C6020i1Il r3) {
        this.f13490x = r3.OooO00o();
        this.f23935OooO00o = new C6791lllI(r3.OooO00o().OooO0O0(), r3.OooO00o().OooO00o());
    }

    public BCElGamalPrivateKey(C6336illiIil r3) {
        this.f13490x = r3.OooO00o();
        this.f23935OooO00o = new C6791lllI(r3.OooO00o().OooO0O0(), r3.OooO00o().m15512OooO00o());
    }

    public BCElGamalPrivateKey(DHPrivateKey dHPrivateKey) {
        this.f13490x = dHPrivateKey.getX();
        this.f23935OooO00o = new C6791lllI(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
    }

    public BCElGamalPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.f13490x = dHPrivateKeySpec.getX();
        this.f23935OooO00o = new C6791lllI(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public BCElGamalPrivateKey(ElGamalPrivateKey elGamalPrivateKey) {
        this.f13490x = elGamalPrivateKey.getX();
        this.f23935OooO00o = elGamalPrivateKey.getParameters();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f23935OooO00o = new C6791lllI((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        this.OooO00o = new LLi1i();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f23935OooO00o.OooO0O0());
        objectOutputStream.writeObject(this.f23935OooO00o.OooO00o());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPrivateKey)) {
            return false;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) obj;
        return getX().equals(dHPrivateKey.getX()) && getParams().getG().equals(dHPrivateKey.getParams().getG()) && getParams().getP().equals(dHPrivateKey.getParams().getP()) && getParams().getL() == dHPrivateKey.getParams().getL();
    }

    public String getAlgorithm() {
        return "ElGamal";
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public AbstractC6854lLi1LL getBagAttribute(LlLI1 llLI1) {
        return this.OooO00o.getBagAttribute(llLI1);
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public Enumeration getBagAttributeKeys() {
        return this.OooO00o.getBagAttributeKeys();
    }

    public byte[] getEncoded() {
        try {
            return new C5464IlilIi(new C6456l1ilL(AbstractC9733l.OooOO0o, new C5838L1lI(this.f23935OooO00o.OooO0O0(), this.f23935OooO00o.OooO00o())), new C6513lIiI(getX())).OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    @Override // com.p118pd.sdk.IIL1l1L
    public C6791lllI getParameters() {
        return this.f23935OooO00o;
    }

    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.f23935OooO00o.OooO0O0(), this.f23935OooO00o.OooO00o());
    }

    @Override // org.bouncycastle.jce.interfaces.ElGamalPrivateKey
    public BigInteger getX() {
        return this.f13490x;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public void setBagAttribute(LlLI1 llLI1, AbstractC6854lLi1LL r3) {
        this.OooO00o.setBagAttribute(llLI1, r3);
    }
}
