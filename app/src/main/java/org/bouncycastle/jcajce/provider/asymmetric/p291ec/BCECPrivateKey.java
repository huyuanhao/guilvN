package org.bouncycastle.jcajce.provider.asymmetric.p291ec;

import com.p118pd.sdk.AbstractC5420Il1iIL;
import com.p118pd.sdk.AbstractC5533IiL;
import com.p118pd.sdk.AbstractC6122iIlLiL;
import com.p118pd.sdk.AbstractC6786llil;
import com.p118pd.sdk.AbstractC6854lLi1LL;
import com.p118pd.sdk.AbstractC9477LILlL;
import com.p118pd.sdk.AbstractC9738llL1L;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C5600L1iLL;
import com.p118pd.sdk.C6106iIiIl;
import com.p118pd.sdk.C6392ii1LI1;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6512lIilLl;
import com.p118pd.sdk.C6513lIiI;
import com.p118pd.sdk.C6620lLlliL;
import com.p118pd.sdk.C6631lLlI;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.I1iLiiI;
import com.p118pd.sdk.IL1IIl;
import com.p118pd.sdk.ILIIIlI;
import com.p118pd.sdk.IlllII1;
import com.p118pd.sdk.LLi1i;
import com.p118pd.sdk.LlLI1;
import com.p118pd.sdk.iIilII1;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey */
public class BCECPrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, AbstractC6786llil, I1iLiiI {
    public static final long serialVersionUID = 994553197664784084L;
    public transient LLi1i OooO00o = new LLi1i();

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient iIilII1 f23906OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient AbstractC9477LILlL f23907OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient BigInteger f23908OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient ECParameterSpec f23909OooO00o;
    public String algorithm = "EC";
    public boolean withCompression;

    public BCECPrivateKey() {
    }

    public BCECPrivateKey(String str, IL1IIl r3, AbstractC9477LILlL r4) {
        this.algorithm = str;
        this.f23908OooO00o = r3.OooO00o();
        this.f23909OooO00o = r3.OooO00o() != null ? C6631lLlI.OooO00o(C6631lLlI.OooO00o(r3.OooO00o().OooO00o(), r3.OooO00o().m16971OooO00o()), r3.OooO00o()) : null;
        this.f23907OooO00o = r4;
    }

    public BCECPrivateKey(String str, C5464IlilIi r3, AbstractC9477LILlL r4) throws IOException {
        this.algorithm = str;
        this.f23907OooO00o = r4;
        OooO00o(r3);
    }

    public BCECPrivateKey(String str, C6512lIilLl r3, AbstractC9477LILlL r4) {
        this.algorithm = str;
        this.f23908OooO00o = r3.OooO00o();
        this.f23909OooO00o = null;
        this.f23907OooO00o = r4;
    }

    public BCECPrivateKey(String str, C6512lIilLl r3, BCECPublicKey bCECPublicKey, C6106iIiIl iiiil, AbstractC9477LILlL r6) {
        this.algorithm = str;
        this.f23908OooO00o = r3.OooO00o();
        this.f23907OooO00o = r6;
        if (iiiil == null) {
            C5600L1iLL OooO00o2 = r3.OooO00o();
            this.f23909OooO00o = new ECParameterSpec(C6631lLlI.OooO00o(OooO00o2.OooO00o(), OooO00o2.m16005OooO00o()), C6631lLlI.OooO00o(OooO00o2.m16003OooO00o()), OooO00o2.OooO0OO(), OooO00o2.m16004OooO00o().intValue());
        } else {
            this.f23909OooO00o = C6631lLlI.OooO00o(C6631lLlI.OooO00o(iiiil.OooO00o(), iiiil.m16971OooO00o()), iiiil);
        }
        try {
            this.f23906OooO00o = OooO00o(bCECPublicKey);
        } catch (Exception unused) {
            this.f23906OooO00o = null;
        }
    }

    public BCECPrivateKey(String str, C6512lIilLl r3, BCECPublicKey bCECPublicKey, ECParameterSpec eCParameterSpec, AbstractC9477LILlL r6) {
        this.algorithm = str;
        this.f23908OooO00o = r3.OooO00o();
        this.f23907OooO00o = r6;
        if (eCParameterSpec == null) {
            C5600L1iLL OooO00o2 = r3.OooO00o();
            eCParameterSpec = new ECParameterSpec(C6631lLlI.OooO00o(OooO00o2.OooO00o(), OooO00o2.m16005OooO00o()), C6631lLlI.OooO00o(OooO00o2.m16003OooO00o()), OooO00o2.OooO0OO(), OooO00o2.m16004OooO00o().intValue());
        }
        this.f23909OooO00o = eCParameterSpec;
        this.f23906OooO00o = OooO00o(bCECPublicKey);
    }

    public BCECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec, AbstractC9477LILlL r4) {
        this.algorithm = str;
        this.f23908OooO00o = eCPrivateKeySpec.getS();
        this.f23909OooO00o = eCPrivateKeySpec.getParams();
        this.f23907OooO00o = r4;
    }

    public BCECPrivateKey(String str, BCECPrivateKey bCECPrivateKey) {
        this.algorithm = str;
        this.f23908OooO00o = bCECPrivateKey.f23908OooO00o;
        this.f23909OooO00o = bCECPrivateKey.f23909OooO00o;
        this.withCompression = bCECPrivateKey.withCompression;
        this.OooO00o = bCECPrivateKey.OooO00o;
        this.f23906OooO00o = bCECPrivateKey.f23906OooO00o;
        this.f23907OooO00o = bCECPrivateKey.f23907OooO00o;
    }

    public BCECPrivateKey(ECPrivateKey eCPrivateKey, AbstractC9477LILlL r3) {
        this.f23908OooO00o = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.f23909OooO00o = eCPrivateKey.getParams();
        this.f23907OooO00o = r3;
    }

    private iIilII1 OooO00o(BCECPublicKey bCECPublicKey) {
        try {
            return C6888ll.OooO00o(AbstractC6122iIlLiL.OooO00o(bCECPublicKey.getEncoded())).OooO00o();
        } catch (IOException unused) {
            return null;
        }
    }

    private AbstractC9738llL1L OooO00o(C6106iIiIl iiiil) {
        return iiiil.m16969OooO00o().OooO00o(this.f23908OooO00o).OooO0Oo();
    }

    private void OooO00o(C5464IlilIi r3) throws IOException {
        C6620lLlliL OooO00o2 = C6620lLlliL.OooO00o(r3.m15707OooO0O0().m17587OooO0O0());
        this.f23909OooO00o = C6631lLlI.OooO00o(OooO00o2, C6631lLlI.OooO00o(this.f23907OooO00o, OooO00o2));
        AbstractC6854lLi1LL OooO0O0 = r3.m15708OooO0O0();
        if (OooO0O0 instanceof C6513lIiI) {
            this.f23908OooO00o = C6513lIiI.OooO00o(OooO0O0).m17647OooO0O0();
            return;
        }
        C6392ii1LI1 OooO00o3 = C6392ii1LI1.OooO00o(OooO0O0);
        this.f23908OooO00o = OooO00o3.m17511OooO00o();
        this.f23906OooO00o = OooO00o3.OooO00o();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f23907OooO00o = BouncyCastleProvider.CONFIGURATION;
        OooO00o(C5464IlilIi.OooO00o(AbstractC6122iIlLiL.OooO00o((byte[]) objectInputStream.readObject())));
        this.OooO00o = new LLi1i();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public C6106iIiIl engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.f23909OooO00o;
        return eCParameterSpec != null ? C6631lLlI.OooO00o(eCParameterSpec, this.withCompression) : this.f23907OooO00o.OooO00o();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPrivateKey)) {
            return false;
        }
        BCECPrivateKey bCECPrivateKey = (BCECPrivateKey) obj;
        return getD().equals(bCECPrivateKey.getD()) && engineGetSpec().equals(bCECPrivateKey.engineGetSpec());
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public AbstractC6854lLi1LL getBagAttribute(LlLI1 llLI1) {
        return this.OooO00o.getBagAttribute(llLI1);
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public Enumeration getBagAttributeKeys() {
        return this.OooO00o.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.ECPrivateKey
    public BigInteger getD() {
        return this.f23908OooO00o;
    }

    public byte[] getEncoded() {
        C6620lLlliL OooO00o2 = ILIIIlI.OooO00o(this.f23909OooO00o, this.withCompression);
        ECParameterSpec eCParameterSpec = this.f23909OooO00o;
        int OooO00o3 = eCParameterSpec == null ? IlllII1.OooO00o(this.f23907OooO00o, (BigInteger) null, getS()) : IlllII1.OooO00o(this.f23907OooO00o, eCParameterSpec.getOrder(), getS());
        try {
            return new C5464IlilIi(new C6456l1ilL(AbstractC5420Il1iIL.o00O0o0o, OooO00o2), this.f23906OooO00o != null ? new C6392ii1LI1(OooO00o3, getS(), this.f23906OooO00o, OooO00o2) : new C6392ii1LI1(OooO00o3, getS(), OooO00o2)).OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    @Override // com.p118pd.sdk.AbstractC6484lII
    public C6106iIiIl getParameters() {
        ECParameterSpec eCParameterSpec = this.f23909OooO00o;
        if (eCParameterSpec == null) {
            return null;
        }
        return C6631lLlI.OooO00o(eCParameterSpec, this.withCompression);
    }

    public ECParameterSpec getParams() {
        return this.f23909OooO00o;
    }

    public BigInteger getS() {
        return this.f23908OooO00o;
    }

    public int hashCode() {
        return getD().hashCode() ^ engineGetSpec().hashCode();
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public void setBagAttribute(LlLI1 llLI1, AbstractC6854lLi1LL r3) {
        this.OooO00o.setBagAttribute(llLI1, r3);
    }

    @Override // com.p118pd.sdk.I1iLiiI
    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return IlllII1.OooO00o("EC", this.f23908OooO00o, engineGetSpec());
    }
}
