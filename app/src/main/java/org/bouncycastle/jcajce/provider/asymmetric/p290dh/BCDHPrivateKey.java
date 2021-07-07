package org.bouncycastle.jcajce.provider.asymmetric.p290dh;

import com.p118pd.sdk.AbstractC5420Il1iIL;
import com.p118pd.sdk.AbstractC5533IiL;
import com.p118pd.sdk.AbstractC5711LiLli;
import com.p118pd.sdk.AbstractC6786llil;
import com.p118pd.sdk.AbstractC6854lLi1LL;
import com.p118pd.sdk.C5194I1;
import com.p118pd.sdk.C5388Ii1;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C5866Li1;
import com.p118pd.sdk.C6017i1Il;
import com.p118pd.sdk.C6022i1LLiI;
import com.p118pd.sdk.C6283iiI1I1;
import com.p118pd.sdk.C6389ii;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6513lIiI;
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

/* renamed from: org.bouncycastle.jcajce.provider.asymmetric.dh.BCDHPrivateKey */
public class BCDHPrivateKey implements DHPrivateKey, AbstractC6786llil {
    public static final long serialVersionUID = 311058815616901812L;
    public transient C5464IlilIi OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient LLi1i f23893OooO00o = new LLi1i();

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient C6389ii f23894OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient DHParameterSpec f23895OooO00o;

    /* renamed from: x */
    public BigInteger f13486x;

    public BCDHPrivateKey() {
    }

    public BCDHPrivateKey(C5464IlilIi r10) throws IOException {
        C6389ii r0;
        I11li1 OooO00o2 = I11li1.OooO00o(r10.m15707OooO0O0().m17587OooO0O0());
        LlLI1 OooO00o3 = r10.m15707OooO0O0().OooO00o();
        this.OooO00o = r10;
        this.f13486x = ((C6513lIiI) r10.m15708OooO0O0()).m17647OooO0O0();
        if (OooO00o3.equals(AbstractC5711LiLli.Oooo)) {
            C5866Li1 OooO00o4 = C5866Li1.OooO00o(OooO00o2);
            if (OooO00o4.m16445OooO0O0() != null) {
                this.f23895OooO00o = new DHParameterSpec(OooO00o4.OooO0OO(), OooO00o4.OooO00o(), OooO00o4.m16445OooO0O0().intValue());
                r0 = new C6389ii(this.f13486x, new C6017i1Il(OooO00o4.OooO0OO(), OooO00o4.OooO00o(), null, OooO00o4.m16445OooO0O0().intValue()));
            } else {
                this.f23895OooO00o = new DHParameterSpec(OooO00o4.OooO0OO(), OooO00o4.OooO00o());
                r0 = new C6389ii(this.f13486x, new C6017i1Il(OooO00o4.OooO0OO(), OooO00o4.OooO00o()));
            }
        } else if (OooO00o3.equals(AbstractC5420Il1iIL.o00Oo0Oo)) {
            C6022i1LLiI OooO00o5 = C6022i1LLiI.OooO00o(OooO00o2);
            this.f23895OooO00o = new C5194I1(OooO00o5.OooO0OO(), OooO00o5.OooO0Oo(), OooO00o5.m16871OooO00o(), OooO00o5.m16872OooO0O0(), 0);
            r0 = new C6389ii(this.f13486x, new C6017i1Il(OooO00o5.OooO0OO(), OooO00o5.m16871OooO00o(), OooO00o5.OooO0Oo(), OooO00o5.m16872OooO0O0(), (C5388Ii1) null));
        } else {
            throw new IllegalArgumentException("unknown algorithm type: " + OooO00o3);
        }
        this.f23894OooO00o = r0;
    }

    public BCDHPrivateKey(C6389ii r2) {
        this.f13486x = r2.OooO00o();
        this.f23895OooO00o = new C5194I1(r2.OooO00o());
    }

    public BCDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.f13486x = dHPrivateKey.getX();
        this.f23895OooO00o = dHPrivateKey.getParams();
    }

    public BCDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.f13486x = dHPrivateKeySpec.getX();
        this.f23895OooO00o = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f23895OooO00o = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.OooO00o = null;
        this.f23893OooO00o = new LLi1i();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f23895OooO00o.getP());
        objectOutputStream.writeObject(this.f23895OooO00o.getG());
        objectOutputStream.writeInt(this.f23895OooO00o.getL());
    }

    public C6389ii engineGetKeyParameters() {
        C6389ii r0 = this.f23894OooO00o;
        if (r0 != null) {
            return r0;
        }
        DHParameterSpec dHParameterSpec = this.f23895OooO00o;
        return dHParameterSpec instanceof C5194I1 ? new C6389ii(this.f13486x, ((C5194I1) dHParameterSpec).m15342OooO00o()) : new C6389ii(this.f13486x, new C6017i1Il(dHParameterSpec.getP(), this.f23895OooO00o.getG(), null, this.f23895OooO00o.getL()));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPrivateKey)) {
            return false;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) obj;
        return getX().equals(dHPrivateKey.getX()) && getParams().getG().equals(dHPrivateKey.getParams().getG()) && getParams().getP().equals(dHPrivateKey.getParams().getP()) && getParams().getL() == dHPrivateKey.getParams().getL();
    }

    public String getAlgorithm() {
        return "DH";
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public AbstractC6854lLi1LL getBagAttribute(LlLI1 llLI1) {
        return this.f23893OooO00o.getBagAttribute(llLI1);
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public Enumeration getBagAttributeKeys() {
        return this.f23893OooO00o.getBagAttributeKeys();
    }

    public byte[] getEncoded() {
        C5464IlilIi r3;
        try {
            if (this.OooO00o != null) {
                return this.OooO00o.OooO00o(AbstractC5533IiL.OooO00o);
            }
            if (!(this.f23895OooO00o instanceof C5194I1) || ((C5194I1) this.f23895OooO00o).OooO0O0() == null) {
                r3 = new C5464IlilIi(new C6456l1ilL(AbstractC5711LiLli.Oooo, new C5866Li1(this.f23895OooO00o.getP(), this.f23895OooO00o.getG(), this.f23895OooO00o.getL()).OooO0O0()), new C6513lIiI(getX()));
            } else {
                C6017i1Il OooO00o2 = ((C5194I1) this.f23895OooO00o).m15342OooO00o();
                C5388Ii1 OooO00o3 = OooO00o2.m16862OooO00o();
                r3 = new C5464IlilIi(new C6456l1ilL(AbstractC5420Il1iIL.o00Oo0Oo, new C6022i1LLiI(OooO00o2.OooO0OO(), OooO00o2.m16863OooO00o(), OooO00o2.OooO0Oo(), OooO00o2.m16864OooO0O0(), OooO00o3 == null ? new C6283iiI1I1(OooO00o3.m15635OooO00o(), OooO00o3.OooO00o()) : null).OooO0O0()), new C6513lIiI(getX()));
            }
            return r3.OooO00o(AbstractC5533IiL.OooO00o);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public DHParameterSpec getParams() {
        return this.f23895OooO00o;
    }

    public BigInteger getX() {
        return this.f13486x;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public void setBagAttribute(LlLI1 llLI1, AbstractC6854lLi1LL r3) {
        this.f23893OooO00o.setBagAttribute(llLI1, r3);
    }
}
