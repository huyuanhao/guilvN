package org.bouncycastle.jce.provider;

import com.p118pd.sdk.AbstractC9733l;
import com.p118pd.sdk.C5838L1lI;
import com.p118pd.sdk.C6412iliILI;
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

public class JCEElGamalPublicKey implements ElGamalPublicKey, DHPublicKey {
    public static final long serialVersionUID = 8712728417091216948L;
    public C6791lllI elSpec;

    /* renamed from: y */
    public BigInteger f13500y;

    public JCEElGamalPublicKey(i1I1L r3) {
        this.f13500y = r3.OooO00o();
        this.elSpec = new C6791lllI(r3.OooO00o().OooO0O0(), r3.OooO00o().m15512OooO00o());
    }

    public JCEElGamalPublicKey(C6888ll r3) {
        C5838L1lI OooO00o = C5838L1lI.OooO00o(r3.m18041OooO00o().m17587OooO0O0());
        try {
            this.f13500y = ((C6513lIiI) r3.OooO0o0()).m17647OooO0O0();
            this.elSpec = new C6791lllI(OooO00o.m16425OooO0O0(), OooO00o.OooO00o());
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    public JCEElGamalPublicKey(C9534Llil r3) {
        this.f13500y = r3.OooO00o();
        this.elSpec = new C6791lllI(r3.OooO00o().OooO0O0(), r3.OooO00o().OooO00o());
    }

    public JCEElGamalPublicKey(BigInteger bigInteger, C6791lllI llli) {
        this.f13500y = bigInteger;
        this.elSpec = llli;
    }

    public JCEElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.f13500y = dHPublicKey.getY();
        this.elSpec = new C6791lllI(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    public JCEElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.f13500y = dHPublicKeySpec.getY();
        this.elSpec = new C6791lllI(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    public JCEElGamalPublicKey(ElGamalPublicKey elGamalPublicKey) {
        this.f13500y = elGamalPublicKey.getY();
        this.elSpec = elGamalPublicKey.getParameters();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f13500y = (BigInteger) objectInputStream.readObject();
        this.elSpec = new C6791lllI((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getY());
        objectOutputStream.writeObject(this.elSpec.OooO0O0());
        objectOutputStream.writeObject(this.elSpec.OooO00o());
    }

    public String getAlgorithm() {
        return "ElGamal";
    }

    public byte[] getEncoded() {
        return C6412iliILI.OooO0O0(new C6456l1ilL(AbstractC9733l.OooOO0o, new C5838L1lI(this.elSpec.OooO0O0(), this.elSpec.OooO00o())), new C6513lIiI(this.f13500y));
    }

    public String getFormat() {
        return "X.509";
    }

    @Override // com.p118pd.sdk.IIL1l1L
    public C6791lllI getParameters() {
        return this.elSpec;
    }

    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.elSpec.OooO0O0(), this.elSpec.OooO00o());
    }

    @Override // org.bouncycastle.jce.interfaces.ElGamalPublicKey
    public BigInteger getY() {
        return this.f13500y;
    }
}
