package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import com.p118pd.sdk.AbstractC6122iIlLiL;
import com.p118pd.sdk.AbstractC6786llil;
import com.p118pd.sdk.AbstractC6854lLi1LL;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C5600L1iLL;
import com.p118pd.sdk.C6106iIiIl;
import com.p118pd.sdk.C6512lIilLl;
import com.p118pd.sdk.C6631lLlI;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.I1iLiiI;
import com.p118pd.sdk.IL1IIl;
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

public class BCECGOST3410PrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, AbstractC6786llil, I1iLiiI {
    public static final long serialVersionUID = 7245981689601667138L;
    public transient LLi1i OooO00o = new LLi1i();

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient iIilII1 f23917OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient AbstractC6854lLi1LL f23918OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient BigInteger f23919OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient ECParameterSpec f23920OooO00o;
    public String algorithm = "ECGOST3410";
    public boolean withCompression;

    public BCECGOST3410PrivateKey() {
    }

    public BCECGOST3410PrivateKey(IL1IIl r3) {
        this.f23919OooO00o = r3.OooO00o();
        this.f23920OooO00o = r3.OooO00o() != null ? C6631lLlI.OooO00o(C6631lLlI.OooO00o(r3.OooO00o().OooO00o(), r3.OooO00o().m16971OooO00o()), r3.OooO00o()) : null;
    }

    public BCECGOST3410PrivateKey(C5464IlilIi r2) throws IOException {
        OooO00o(r2);
    }

    public BCECGOST3410PrivateKey(String str, C6512lIilLl r3) {
        this.algorithm = str;
        this.f23919OooO00o = r3.OooO00o();
        this.f23920OooO00o = null;
    }

    public BCECGOST3410PrivateKey(String str, C6512lIilLl r4, BCECGOST3410PublicKey bCECGOST3410PublicKey, C6106iIiIl iiiil) {
        this.algorithm = str;
        this.f23919OooO00o = r4.OooO00o();
        if (iiiil == null) {
            C5600L1iLL OooO00o2 = r4.OooO00o();
            this.f23920OooO00o = new ECParameterSpec(C6631lLlI.OooO00o(OooO00o2.OooO00o(), OooO00o2.m16005OooO00o()), C6631lLlI.OooO00o(OooO00o2.m16003OooO00o()), OooO00o2.OooO0OO(), OooO00o2.m16004OooO00o().intValue());
        } else {
            this.f23920OooO00o = new ECParameterSpec(C6631lLlI.OooO00o(iiiil.OooO00o(), iiiil.m16971OooO00o()), C6631lLlI.OooO00o(iiiil.m16969OooO00o()), iiiil.OooO0O0(), iiiil.m16970OooO00o().intValue());
        }
        this.f23918OooO00o = bCECGOST3410PublicKey.getGostParams();
        this.f23917OooO00o = OooO00o(bCECGOST3410PublicKey);
    }

    public BCECGOST3410PrivateKey(String str, C6512lIilLl r4, BCECGOST3410PublicKey bCECGOST3410PublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = str;
        this.f23919OooO00o = r4.OooO00o();
        if (eCParameterSpec == null) {
            C5600L1iLL OooO00o2 = r4.OooO00o();
            eCParameterSpec = new ECParameterSpec(C6631lLlI.OooO00o(OooO00o2.OooO00o(), OooO00o2.m16005OooO00o()), C6631lLlI.OooO00o(OooO00o2.m16003OooO00o()), OooO00o2.OooO0OO(), OooO00o2.m16004OooO00o().intValue());
        }
        this.f23920OooO00o = eCParameterSpec;
        this.f23918OooO00o = bCECGOST3410PublicKey.getGostParams();
        this.f23917OooO00o = OooO00o(bCECGOST3410PublicKey);
    }

    public BCECGOST3410PrivateKey(ECPrivateKey eCPrivateKey) {
        this.f23919OooO00o = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.f23920OooO00o = eCPrivateKey.getParams();
    }

    public BCECGOST3410PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.f23919OooO00o = eCPrivateKeySpec.getS();
        this.f23920OooO00o = eCPrivateKeySpec.getParams();
    }

    public BCECGOST3410PrivateKey(BCECGOST3410PrivateKey bCECGOST3410PrivateKey) {
        this.f23919OooO00o = bCECGOST3410PrivateKey.f23919OooO00o;
        this.f23920OooO00o = bCECGOST3410PrivateKey.f23920OooO00o;
        this.withCompression = bCECGOST3410PrivateKey.withCompression;
        this.OooO00o = bCECGOST3410PrivateKey.OooO00o;
        this.f23917OooO00o = bCECGOST3410PrivateKey.f23917OooO00o;
        this.f23918OooO00o = bCECGOST3410PrivateKey.f23918OooO00o;
    }

    private iIilII1 OooO00o(BCECGOST3410PublicKey bCECGOST3410PublicKey) {
        try {
            return C6888ll.OooO00o(AbstractC6122iIlLiL.OooO00o(bCECGOST3410PublicKey.getEncoded())).OooO00o();
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO00o(com.p118pd.sdk.C5464IlilIi r11) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 345
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey.OooO00o(com.pd.sdk.Ili丨lIi):void");
    }

    private void OooO00o(byte[] bArr, int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i2 = 0; i2 != 32; i2++) {
            bArr[i + i2] = byteArray[(byteArray.length - 1) - i2];
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        OooO00o(C5464IlilIi.OooO00o(AbstractC6122iIlLiL.OooO00o((byte[]) objectInputStream.readObject())));
        this.OooO00o = new LLi1i();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public C6106iIiIl engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.f23920OooO00o;
        return eCParameterSpec != null ? C6631lLlI.OooO00o(eCParameterSpec, this.withCompression) : BouncyCastleProvider.CONFIGURATION.OooO00o();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410PrivateKey)) {
            return false;
        }
        BCECGOST3410PrivateKey bCECGOST3410PrivateKey = (BCECGOST3410PrivateKey) obj;
        return getD().equals(bCECGOST3410PrivateKey.getD()) && engineGetSpec().equals(bCECGOST3410PrivateKey.engineGetSpec());
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
        return this.f23919OooO00o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey.getEncoded():byte[]");
    }

    public String getFormat() {
        return "PKCS#8";
    }

    @Override // com.p118pd.sdk.AbstractC6484lII
    public C6106iIiIl getParameters() {
        ECParameterSpec eCParameterSpec = this.f23920OooO00o;
        if (eCParameterSpec == null) {
            return null;
        }
        return C6631lLlI.OooO00o(eCParameterSpec, this.withCompression);
    }

    public ECParameterSpec getParams() {
        return this.f23920OooO00o;
    }

    public BigInteger getS() {
        return this.f23919OooO00o;
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
        return IlllII1.OooO00o(this.algorithm, this.f23919OooO00o, engineGetSpec());
    }
}
