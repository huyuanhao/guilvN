package org.bouncycastle.jce.provider;

import com.p118pd.sdk.AbstractC5420Il1iIL;
import com.p118pd.sdk.AbstractC5711LiLli;
import com.p118pd.sdk.C5866Li1;
import com.p118pd.sdk.C6412iliILI;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6513lIiI;
import com.p118pd.sdk.C6771llLL;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.I11li1;
import com.p118pd.sdk.LiIiLii;
import com.p118pd.sdk.LlLI1;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

public class JCEDHPublicKey implements DHPublicKey {
    public static final long serialVersionUID = -216691575254424324L;
    public DHParameterSpec dhSpec;
    public C6888ll info;

    /* renamed from: y */
    public BigInteger f13496y;

    public JCEDHPublicKey(LiIiLii liIiLii) {
        this.f13496y = liIiLii.OooO00o();
        this.dhSpec = new DHParameterSpec(liIiLii.OooO00o().OooO0OO(), liIiLii.OooO00o().m16863OooO00o(), liIiLii.OooO00o().OooO00o());
    }

    public JCEDHPublicKey(C6888ll r4) {
        DHParameterSpec dHParameterSpec;
        this.info = r4;
        try {
            this.f13496y = ((C6513lIiI) r4.OooO0o0()).m17647OooO0O0();
            I11li1 OooO00o = I11li1.OooO00o(r4.m18042OooO0O0().m17587OooO0O0());
            LlLI1 OooO00o2 = r4.m18042OooO0O0().OooO00o();
            if (OooO00o2.equals(AbstractC5711LiLli.Oooo) || OooO00o(OooO00o)) {
                C5866Li1 OooO00o3 = C5866Li1.OooO00o(OooO00o);
                dHParameterSpec = OooO00o3.m16445OooO0O0() != null ? new DHParameterSpec(OooO00o3.OooO0OO(), OooO00o3.OooO00o(), OooO00o3.m16445OooO0O0().intValue()) : new DHParameterSpec(OooO00o3.OooO0OO(), OooO00o3.OooO00o());
            } else if (OooO00o2.equals(AbstractC5420Il1iIL.o00Oo0Oo)) {
                C6771llLL OooO00o4 = C6771llLL.OooO00o(OooO00o);
                dHParameterSpec = new DHParameterSpec(OooO00o4.OooO0OO().m17647OooO0O0(), OooO00o4.m17877OooO00o().m17647OooO0O0());
            } else {
                throw new IllegalArgumentException("unknown algorithm type: " + OooO00o2);
            }
            this.dhSpec = dHParameterSpec;
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DH public key");
        }
    }

    public JCEDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.f13496y = bigInteger;
        this.dhSpec = dHParameterSpec;
    }

    public JCEDHPublicKey(DHPublicKey dHPublicKey) {
        this.f13496y = dHPublicKey.getY();
        this.dhSpec = dHPublicKey.getParams();
    }

    public JCEDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.f13496y = dHPublicKeySpec.getY();
        this.dhSpec = new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    private boolean OooO00o(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            return true;
        }
        if (i11li1.size() > 3) {
            return false;
        }
        return C6513lIiI.OooO00o(i11li1.OooO00o(2)).m17647OooO0O0().compareTo(BigInteger.valueOf((long) C6513lIiI.OooO00o(i11li1.OooO00o(0)).m17647OooO0O0().bitLength())) <= 0;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f13496y = (BigInteger) objectInputStream.readObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getY());
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    public String getAlgorithm() {
        return "DH";
    }

    public byte[] getEncoded() {
        C6888ll r0 = this.info;
        return r0 != null ? C6412iliILI.OooO00o(r0) : C6412iliILI.OooO0O0(new C6456l1ilL(AbstractC5711LiLli.Oooo, new C5866Li1(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL())), new C6513lIiI(this.f13496y));
    }

    public String getFormat() {
        return "X.509";
    }

    public DHParameterSpec getParams() {
        return this.dhSpec;
    }

    public BigInteger getY() {
        return this.f13496y;
    }
}
