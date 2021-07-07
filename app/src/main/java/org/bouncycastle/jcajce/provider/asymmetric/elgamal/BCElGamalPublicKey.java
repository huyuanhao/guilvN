package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import com.p118pd.sdk.AbstractC5533IiL;
import com.p118pd.sdk.AbstractC9733l;
import com.p118pd.sdk.C5838L1lI;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6513lIiI;
import com.p118pd.sdk.C6791lllI;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.C9534Llil;
import com.p118pd.sdk.i1I1L;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.jce.interfaces.ElGamalPublicKey;

public class BCElGamalPublicKey implements ElGamalPublicKey, DHPublicKey {
    public static final long serialVersionUID = 8712728417091216948L;
    public transient C6791lllI OooO00o;

    /* renamed from: y */
    public BigInteger f13491y;

    public BCElGamalPublicKey(i1I1L r3) {
        this.f13491y = r3.OooO00o();
        this.OooO00o = new C6791lllI(r3.OooO00o().OooO0O0(), r3.OooO00o().m15512OooO00o());
    }

    public BCElGamalPublicKey(C6888ll r3) {
        C5838L1lI OooO00o2 = C5838L1lI.OooO00o(r3.m18041OooO00o().m17587OooO0O0());
        try {
            this.f13491y = ((C6513lIiI) r3.OooO0o0()).m17647OooO0O0();
            this.OooO00o = new C6791lllI(OooO00o2.m16425OooO0O0(), OooO00o2.OooO00o());
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    public BCElGamalPublicKey(C9534Llil r3) {
        this.f13491y = r3.OooO00o();
        this.OooO00o = new C6791lllI(r3.OooO00o().OooO0O0(), r3.OooO00o().OooO00o());
    }

    public BCElGamalPublicKey(BigInteger bigInteger, C6791lllI llli) {
        this.f13491y = bigInteger;
        this.OooO00o = llli;
    }

    public BCElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.f13491y = dHPublicKey.getY();
        this.OooO00o = new C6791lllI(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    public BCElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.f13491y = dHPublicKeySpec.getY();
        this.OooO00o = new C6791lllI(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    public BCElGamalPublicKey(ElGamalPublicKey elGamalPublicKey) {
        this.f13491y = elGamalPublicKey.getY();
        this.OooO00o = elGamalPublicKey.getParameters();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.OooO00o = new C6791lllI((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.OooO00o.OooO0O0());
        objectOutputStream.writeObject(this.OooO00o.OooO00o());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) obj;
        return getY().equals(dHPublicKey.getY()) && getParams().getG().equals(dHPublicKey.getParams().getG()) && getParams().getP().equals(dHPublicKey.getParams().getP()) && getParams().getL() == dHPublicKey.getParams().getL();
    }

    public String getAlgorithm() {
        return "ElGamal";
    }

    public byte[] getEncoded() {
        try {
            return new C6888ll(new C6456l1ilL(AbstractC9733l.OooOO0o, new C5838L1lI(this.OooO00o.OooO0O0(), this.OooO00o.OooO00o())), new C6513lIiI(this.f13491y)).OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    @Override // com.p118pd.sdk.IIL1l1L
    public C6791lllI getParameters() {
        return this.OooO00o;
    }

    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.OooO00o.OooO0O0(), this.OooO00o.OooO00o());
    }

    @Override // org.bouncycastle.jce.interfaces.ElGamalPublicKey
    public BigInteger getY() {
        return this.f13491y;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }
}
