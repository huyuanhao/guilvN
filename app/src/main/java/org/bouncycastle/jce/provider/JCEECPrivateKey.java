package org.bouncycastle.jce.provider;

import com.p118pd.sdk.AbstractC5331ILi;
import com.p118pd.sdk.AbstractC5335ILl;
import com.p118pd.sdk.AbstractC5420Il1iIL;
import com.p118pd.sdk.AbstractC5533IiL;
import com.p118pd.sdk.AbstractC6122iIlLiL;
import com.p118pd.sdk.AbstractC6786llil;
import com.p118pd.sdk.AbstractC6854lLi1LL;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C5600L1iLL;
import com.p118pd.sdk.C6106iIiIl;
import com.p118pd.sdk.C6452l1Lll;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6512lIilLl;
import com.p118pd.sdk.C6620lLlliL;
import com.p118pd.sdk.C6631lLlI;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.C9387Iill;
import com.p118pd.sdk.I1iLiiI;
import com.p118pd.sdk.IIiLIli;
import com.p118pd.sdk.IL1IIl;
import com.p118pd.sdk.IlllII1;
import com.p118pd.sdk.L1L1l;
import com.p118pd.sdk.LLi1i;
import com.p118pd.sdk.LlLI1;
import com.p118pd.sdk.iIilII1;
import com.p118pd.sdk.lI1Ll;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.util.Strings;

public class JCEECPrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, AbstractC6786llil, I1iLiiI {
    public String algorithm = "EC";
    public LLi1i attrCarrier = new LLi1i();

    /* renamed from: d */
    public BigInteger f13497d;
    public ECParameterSpec ecSpec;
    public iIilII1 publicKey;
    public boolean withCompression;

    public JCEECPrivateKey() {
    }

    public JCEECPrivateKey(C5464IlilIi r2) throws IOException {
        OooO00o(r2);
    }

    public JCEECPrivateKey(String str, IL1IIl r3) {
        this.algorithm = str;
        this.f13497d = r3.OooO00o();
        this.ecSpec = r3.OooO00o() != null ? C6631lLlI.OooO00o(C6631lLlI.OooO00o(r3.OooO00o().OooO00o(), r3.OooO00o().m16971OooO00o()), r3.OooO00o()) : null;
    }

    public JCEECPrivateKey(String str, C6512lIilLl r3) {
        this.algorithm = str;
        this.f13497d = r3.OooO00o();
        this.ecSpec = null;
    }

    public JCEECPrivateKey(String str, C6512lIilLl r4, JCEECPublicKey jCEECPublicKey, C6106iIiIl iiiil) {
        this.algorithm = str;
        this.f13497d = r4.OooO00o();
        if (iiiil == null) {
            C5600L1iLL OooO00o = r4.OooO00o();
            this.ecSpec = new ECParameterSpec(C6631lLlI.OooO00o(OooO00o.OooO00o(), OooO00o.m16005OooO00o()), C6631lLlI.OooO00o(OooO00o.m16003OooO00o()), OooO00o.OooO0OO(), OooO00o.m16004OooO00o().intValue());
        } else {
            this.ecSpec = new ECParameterSpec(C6631lLlI.OooO00o(iiiil.OooO00o(), iiiil.m16971OooO00o()), C6631lLlI.OooO00o(iiiil.m16969OooO00o()), iiiil.OooO0O0(), iiiil.m16970OooO00o().intValue());
        }
        this.publicKey = OooO00o(jCEECPublicKey);
    }

    public JCEECPrivateKey(String str, C6512lIilLl r4, JCEECPublicKey jCEECPublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = str;
        this.f13497d = r4.OooO00o();
        if (eCParameterSpec == null) {
            C5600L1iLL OooO00o = r4.OooO00o();
            eCParameterSpec = new ECParameterSpec(C6631lLlI.OooO00o(OooO00o.OooO00o(), OooO00o.m16005OooO00o()), C6631lLlI.OooO00o(OooO00o.m16003OooO00o()), OooO00o.OooO0OO(), OooO00o.m16004OooO00o().intValue());
        }
        this.ecSpec = eCParameterSpec;
        this.publicKey = OooO00o(jCEECPublicKey);
    }

    public JCEECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = str;
        this.f13497d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public JCEECPrivateKey(String str, JCEECPrivateKey jCEECPrivateKey) {
        this.algorithm = str;
        this.f13497d = jCEECPrivateKey.f13497d;
        this.ecSpec = jCEECPrivateKey.ecSpec;
        this.withCompression = jCEECPrivateKey.withCompression;
        this.attrCarrier = jCEECPrivateKey.attrCarrier;
        this.publicKey = jCEECPrivateKey.publicKey;
    }

    public JCEECPrivateKey(ECPrivateKey eCPrivateKey) {
        this.f13497d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    private iIilII1 OooO00o(JCEECPublicKey jCEECPublicKey) {
        try {
            return C6888ll.OooO00o(AbstractC6122iIlLiL.OooO00o(jCEECPublicKey.getEncoded())).OooO00o();
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO00o(com.p118pd.sdk.C5464IlilIi r11) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 213
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCEECPrivateKey.OooO00o(com.pd.sdk.Ili丨lIi):void");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        OooO00o(C5464IlilIi.OooO00o(AbstractC6122iIlLiL.OooO00o((byte[]) objectInputStream.readObject())));
        this.algorithm = (String) objectInputStream.readObject();
        this.withCompression = objectInputStream.readBoolean();
        LLi1i r0 = new LLi1i();
        this.attrCarrier = r0;
        r0.OooO00o(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.algorithm);
        objectOutputStream.writeBoolean(this.withCompression);
        this.attrCarrier.OooO00o(objectOutputStream);
    }

    public C6106iIiIl engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? C6631lLlI.OooO00o(eCParameterSpec, this.withCompression) : BouncyCastleProvider.CONFIGURATION.OooO00o();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof JCEECPrivateKey)) {
            return false;
        }
        JCEECPrivateKey jCEECPrivateKey = (JCEECPrivateKey) obj;
        return getD().equals(jCEECPrivateKey.getD()) && engineGetSpec().equals(jCEECPrivateKey.engineGetSpec());
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public AbstractC6854lLi1LL getBagAttribute(LlLI1 llLI1) {
        return this.attrCarrier.getBagAttribute(llLI1);
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.ECPrivateKey
    public BigInteger getD() {
        return this.f13497d;
    }

    public byte[] getEncoded() {
        C6620lLlliL llllil;
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec instanceof L1L1l) {
            LlLI1 OooO00o = IlllII1.OooO00o(((L1L1l) eCParameterSpec).OooO00o());
            if (OooO00o == null) {
                OooO00o = new LlLI1(((L1L1l) this.ecSpec).OooO00o());
            }
            llllil = new C6620lLlliL(OooO00o);
        } else if (eCParameterSpec == null) {
            llllil = new C6620lLlliL((AbstractC5335ILl) C6452l1Lll.OooO00o);
        } else {
            IIiLIli OooO00o2 = C6631lLlI.OooO00o(eCParameterSpec.getCurve());
            llllil = new C6620lLlliL(new C9387Iill(OooO00o2, C6631lLlI.OooO00o(OooO00o2, this.ecSpec.getGenerator(), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf((long) this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
        }
        lI1Ll r0 = this.publicKey != null ? new lI1Ll(getS(), this.publicKey, llllil) : new lI1Ll(getS(), llllil);
        try {
            return (this.algorithm.equals("ECGOST3410") ? new C5464IlilIi(new C6456l1ilL(AbstractC5331ILi.OooOOO0, llllil.OooO0O0()), r0.OooO0O0()) : new C5464IlilIi(new C6456l1ilL(AbstractC5420Il1iIL.o00O0o0o, llllil.OooO0O0()), r0.OooO0O0())).OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    @Override // com.p118pd.sdk.AbstractC6484lII
    public C6106iIiIl getParameters() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            return null;
        }
        return C6631lLlI.OooO00o(eCParameterSpec, this.withCompression);
    }

    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    public BigInteger getS() {
        return this.f13497d;
    }

    public int hashCode() {
        return getD().hashCode() ^ engineGetSpec().hashCode();
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public void setBagAttribute(LlLI1 llLI1, AbstractC6854lLi1LL r3) {
        this.attrCarrier.setBagAttribute(llLI1, r3);
    }

    @Override // com.p118pd.sdk.I1iLiiI
    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String OooO00o = Strings.m22984OooO00o();
        stringBuffer.append("EC Private Key");
        stringBuffer.append(OooO00o);
        stringBuffer.append("             S: ");
        stringBuffer.append(this.f13497d.toString(16));
        stringBuffer.append(OooO00o);
        return stringBuffer.toString();
    }
}
