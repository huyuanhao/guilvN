package org.bouncycastle.jcajce.provider.asymmetric.p290dh;

import com.p118pd.sdk.AbstractC5420Il1iIL;
import com.p118pd.sdk.AbstractC5711LiLli;
import com.p118pd.sdk.C5194I1;
import com.p118pd.sdk.C5388Ii1;
import com.p118pd.sdk.C5866Li1;
import com.p118pd.sdk.C6017i1Il;
import com.p118pd.sdk.C6022i1LLiI;
import com.p118pd.sdk.C6283iiI1I1;
import com.p118pd.sdk.C6412iliILI;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6513lIiI;
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

/* renamed from: org.bouncycastle.jcajce.provider.asymmetric.dh.BCDHPublicKey */
public class BCDHPublicKey implements DHPublicKey {
    public static final long serialVersionUID = -216691575254424324L;
    public transient LiIiLii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient C6888ll f23896OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient DHParameterSpec f23897OooO00o;

    /* renamed from: y */
    public BigInteger f13487y;

    public BCDHPublicKey(LiIiLii liIiLii) {
        this.f13487y = liIiLii.OooO00o();
        this.f23897OooO00o = new C5194I1(liIiLii.OooO00o());
        this.OooO00o = liIiLii;
    }

    public BCDHPublicKey(C6888ll r11) {
        this.f23896OooO00o = r11;
        try {
            this.f13487y = ((C6513lIiI) r11.OooO0o0()).m17647OooO0O0();
            I11li1 OooO00o2 = I11li1.OooO00o(r11.m18041OooO00o().m17587OooO0O0());
            LlLI1 OooO00o3 = r11.m18041OooO00o().OooO00o();
            if (OooO00o3.equals(AbstractC5711LiLli.Oooo) || OooO00o(OooO00o2)) {
                C5866Li1 OooO00o4 = C5866Li1.OooO00o(OooO00o2);
                this.f23897OooO00o = OooO00o4.m16445OooO0O0() != null ? new DHParameterSpec(OooO00o4.OooO0OO(), OooO00o4.OooO00o(), OooO00o4.m16445OooO0O0().intValue()) : new DHParameterSpec(OooO00o4.OooO0OO(), OooO00o4.OooO00o());
                this.OooO00o = new LiIiLii(this.f13487y, new C6017i1Il(this.f23897OooO00o.getP(), this.f23897OooO00o.getG()));
            } else if (OooO00o3.equals(AbstractC5420Il1iIL.o00Oo0Oo)) {
                C6022i1LLiI OooO00o5 = C6022i1LLiI.OooO00o(OooO00o2);
                C6283iiI1I1 OooO00o6 = OooO00o5.OooO00o();
                if (OooO00o6 != null) {
                    this.OooO00o = new LiIiLii(this.f13487y, new C6017i1Il(OooO00o5.OooO0OO(), OooO00o5.m16871OooO00o(), OooO00o5.OooO0Oo(), OooO00o5.m16872OooO0O0(), new C5388Ii1(OooO00o6.m17307OooO00o(), OooO00o6.OooO00o().intValue())));
                } else {
                    this.OooO00o = new LiIiLii(this.f13487y, new C6017i1Il(OooO00o5.OooO0OO(), OooO00o5.m16871OooO00o(), OooO00o5.OooO0Oo(), OooO00o5.m16872OooO0O0(), (C5388Ii1) null));
                }
                this.f23897OooO00o = new C5194I1(this.OooO00o.OooO00o());
            } else {
                throw new IllegalArgumentException("unknown algorithm type: " + OooO00o3);
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DH public key");
        }
    }

    public BCDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.f13487y = bigInteger;
        this.f23897OooO00o = dHParameterSpec;
        this.OooO00o = dHParameterSpec instanceof C5194I1 ? new LiIiLii(bigInteger, ((C5194I1) dHParameterSpec).m15342OooO00o()) : new LiIiLii(bigInteger, new C6017i1Il(dHParameterSpec.getP(), dHParameterSpec.getG()));
    }

    public BCDHPublicKey(DHPublicKey dHPublicKey) {
        this.f13487y = dHPublicKey.getY();
        this.f23897OooO00o = dHPublicKey.getParams();
        this.OooO00o = new LiIiLii(this.f13487y, new C6017i1Il(this.f23897OooO00o.getP(), this.f23897OooO00o.getG()));
    }

    public BCDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.f13487y = dHPublicKeySpec.getY();
        this.f23897OooO00o = new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
        this.OooO00o = new LiIiLii(this.f13487y, new C6017i1Il(dHPublicKeySpec.getP(), dHPublicKeySpec.getG()));
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
        objectInputStream.defaultReadObject();
        this.f23897OooO00o = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.f23896OooO00o = null;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f23897OooO00o.getP());
        objectOutputStream.writeObject(this.f23897OooO00o.getG());
        objectOutputStream.writeInt(this.f23897OooO00o.getL());
    }

    public LiIiLii engineGetKeyParameters() {
        return this.OooO00o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) obj;
        return getY().equals(dHPublicKey.getY()) && getParams().getG().equals(dHPublicKey.getParams().getG()) && getParams().getP().equals(dHPublicKey.getParams().getP()) && getParams().getL() == dHPublicKey.getParams().getL();
    }

    public String getAlgorithm() {
        return "DH";
    }

    public byte[] getEncoded() {
        C6888ll r0 = this.f23896OooO00o;
        if (r0 != null) {
            return C6412iliILI.OooO00o(r0);
        }
        DHParameterSpec dHParameterSpec = this.f23897OooO00o;
        if (!(dHParameterSpec instanceof C5194I1) || ((C5194I1) dHParameterSpec).OooO0O0() == null) {
            return C6412iliILI.OooO0O0(new C6456l1ilL(AbstractC5711LiLli.Oooo, new C5866Li1(this.f23897OooO00o.getP(), this.f23897OooO00o.getG(), this.f23897OooO00o.getL()).OooO0O0()), new C6513lIiI(this.f13487y));
        }
        C6017i1Il OooO00o2 = ((C5194I1) this.f23897OooO00o).m15342OooO00o();
        C5388Ii1 OooO00o3 = OooO00o2.m16862OooO00o();
        C6283iiI1I1 r2 = null;
        if (OooO00o3 == null) {
            r2 = new C6283iiI1I1(OooO00o3.m15635OooO00o(), OooO00o3.OooO00o());
        }
        return C6412iliILI.OooO0O0(new C6456l1ilL(AbstractC5420Il1iIL.o00Oo0Oo, new C6022i1LLiI(OooO00o2.OooO0OO(), OooO00o2.m16863OooO00o(), OooO00o2.OooO0Oo(), OooO00o2.m16864OooO0O0(), r2).OooO0O0()), new C6513lIiI(this.f13487y));
    }

    public String getFormat() {
        return "X.509";
    }

    public DHParameterSpec getParams() {
        return this.f23897OooO00o;
    }

    public BigInteger getY() {
        return this.f13487y;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }
}
