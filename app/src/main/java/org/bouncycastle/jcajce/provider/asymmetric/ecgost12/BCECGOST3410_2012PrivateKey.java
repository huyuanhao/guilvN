package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import com.p118pd.sdk.AbstractC6122iIlLiL;
import com.p118pd.sdk.AbstractC6786llil;
import com.p118pd.sdk.AbstractC6854lLi1LL;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C5600L1iLL;
import com.p118pd.sdk.C6106iIiIl;
import com.p118pd.sdk.C6512lIilLl;
import com.p118pd.sdk.C6631lLlI;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.C9574i1iIiI;
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

public class BCECGOST3410_2012PrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, AbstractC6786llil, I1iLiiI {
    public static final long serialVersionUID = 7245981689601667138L;
    public transient LLi1i OooO00o = new LLi1i();

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient iIilII1 f23926OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient C9574i1iIiI f23927OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient BigInteger f23928OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient ECParameterSpec f23929OooO00o;
    public String algorithm = "ECGOST3410-2012";
    public boolean withCompression;

    public BCECGOST3410_2012PrivateKey() {
    }

    public BCECGOST3410_2012PrivateKey(IL1IIl r3) {
        this.f23928OooO00o = r3.OooO00o();
        this.f23929OooO00o = r3.OooO00o() != null ? C6631lLlI.OooO00o(C6631lLlI.OooO00o(r3.OooO00o().OooO00o(), r3.OooO00o().m16971OooO00o()), r3.OooO00o()) : null;
    }

    public BCECGOST3410_2012PrivateKey(C5464IlilIi r2) throws IOException {
        OooO00o(r2);
    }

    public BCECGOST3410_2012PrivateKey(String str, C6512lIilLl r3) {
        this.algorithm = str;
        this.f23928OooO00o = r3.OooO00o();
        this.f23929OooO00o = null;
    }

    public BCECGOST3410_2012PrivateKey(String str, C6512lIilLl r4, BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey, C6106iIiIl iiiil) {
        C5600L1iLL OooO00o2 = r4.OooO00o();
        this.algorithm = str;
        this.f23928OooO00o = r4.OooO00o();
        this.f23929OooO00o = iiiil == null ? new ECParameterSpec(C6631lLlI.OooO00o(OooO00o2.OooO00o(), OooO00o2.m16005OooO00o()), C6631lLlI.OooO00o(OooO00o2.m16003OooO00o()), OooO00o2.OooO0OO(), OooO00o2.m16004OooO00o().intValue()) : new ECParameterSpec(C6631lLlI.OooO00o(iiiil.OooO00o(), iiiil.m16971OooO00o()), C6631lLlI.OooO00o(iiiil.m16969OooO00o()), iiiil.OooO0O0(), iiiil.m16970OooO00o().intValue());
        this.f23927OooO00o = bCECGOST3410_2012PublicKey.getGostParams();
        this.f23926OooO00o = OooO00o(bCECGOST3410_2012PublicKey);
    }

    public BCECGOST3410_2012PrivateKey(String str, C6512lIilLl r4, BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey, ECParameterSpec eCParameterSpec) {
        C5600L1iLL OooO00o2 = r4.OooO00o();
        this.algorithm = str;
        this.f23928OooO00o = r4.OooO00o();
        if (eCParameterSpec == null) {
            this.f23929OooO00o = new ECParameterSpec(C6631lLlI.OooO00o(OooO00o2.OooO00o(), OooO00o2.m16005OooO00o()), C6631lLlI.OooO00o(OooO00o2.m16003OooO00o()), OooO00o2.OooO0OO(), OooO00o2.m16004OooO00o().intValue());
        } else {
            this.f23929OooO00o = eCParameterSpec;
        }
        this.f23927OooO00o = bCECGOST3410_2012PublicKey.getGostParams();
        this.f23926OooO00o = OooO00o(bCECGOST3410_2012PublicKey);
    }

    public BCECGOST3410_2012PrivateKey(ECPrivateKey eCPrivateKey) {
        this.f23928OooO00o = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.f23929OooO00o = eCPrivateKey.getParams();
    }

    public BCECGOST3410_2012PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.f23928OooO00o = eCPrivateKeySpec.getS();
        this.f23929OooO00o = eCPrivateKeySpec.getParams();
    }

    public BCECGOST3410_2012PrivateKey(BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey) {
        this.f23928OooO00o = bCECGOST3410_2012PrivateKey.f23928OooO00o;
        this.f23929OooO00o = bCECGOST3410_2012PrivateKey.f23929OooO00o;
        this.withCompression = bCECGOST3410_2012PrivateKey.withCompression;
        this.OooO00o = bCECGOST3410_2012PrivateKey.OooO00o;
        this.f23926OooO00o = bCECGOST3410_2012PrivateKey.f23926OooO00o;
        this.f23927OooO00o = bCECGOST3410_2012PrivateKey.f23927OooO00o;
    }

    private iIilII1 OooO00o(BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey) {
        return C6888ll.OooO00o(bCECGOST3410_2012PublicKey.getEncoded()).OooO00o();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO00o(com.p118pd.sdk.C5464IlilIi r11) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 368
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PrivateKey.OooO00o(com.pd.sdk.Ili丨lIi):void");
    }

    private void OooO00o(byte[] bArr, int i, int i2, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i3 = 0; i3 != i; i3++) {
            bArr[i2 + i3] = byteArray[(byteArray.length - 1) - i3];
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
        ECParameterSpec eCParameterSpec = this.f23929OooO00o;
        return eCParameterSpec != null ? C6631lLlI.OooO00o(eCParameterSpec, this.withCompression) : BouncyCastleProvider.CONFIGURATION.OooO00o();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410_2012PrivateKey)) {
            return false;
        }
        BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey = (BCECGOST3410_2012PrivateKey) obj;
        return getD().equals(bCECGOST3410_2012PrivateKey.getD()) && engineGetSpec().equals(bCECGOST3410_2012PrivateKey.engineGetSpec());
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
        return this.f23928OooO00o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
        // Method dump skipped, instructions count: 247
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PrivateKey.getEncoded():byte[]");
    }

    public String getFormat() {
        return "PKCS#8";
    }

    @Override // com.p118pd.sdk.AbstractC6484lII
    public C6106iIiIl getParameters() {
        ECParameterSpec eCParameterSpec = this.f23929OooO00o;
        if (eCParameterSpec == null) {
            return null;
        }
        return C6631lLlI.OooO00o(eCParameterSpec, this.withCompression);
    }

    public ECParameterSpec getParams() {
        return this.f23929OooO00o;
    }

    public BigInteger getS() {
        return this.f23928OooO00o;
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
        return IlllII1.OooO00o(this.algorithm, this.f23928OooO00o, engineGetSpec());
    }
}
