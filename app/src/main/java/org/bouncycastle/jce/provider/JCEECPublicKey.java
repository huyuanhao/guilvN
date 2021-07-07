package org.bouncycastle.jce.provider;

import com.p118pd.sdk.AbstractC5331ILi;
import com.p118pd.sdk.AbstractC5335ILl;
import com.p118pd.sdk.AbstractC5420Il1iIL;
import com.p118pd.sdk.AbstractC5738Lil;
import com.p118pd.sdk.AbstractC6122iIlLiL;
import com.p118pd.sdk.AbstractC6804llL1ii;
import com.p118pd.sdk.AbstractC9738llL1L;
import com.p118pd.sdk.C5313ILl1;
import com.p118pd.sdk.C5600L1iLL;
import com.p118pd.sdk.C5769Ll1;
import com.p118pd.sdk.C6106iIiIl;
import com.p118pd.sdk.C6147iL1;
import com.p118pd.sdk.C6412iliILI;
import com.p118pd.sdk.C6452l1Lll;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6487lIIiIlL;
import com.p118pd.sdk.C6620lLlliL;
import com.p118pd.sdk.C6631lLlI;
import com.p118pd.sdk.C6723lilIL;
import com.p118pd.sdk.C6849lLLIllI;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.C9387Iill;
import com.p118pd.sdk.C9574i1iIiI;
import com.p118pd.sdk.I11li1;
import com.p118pd.sdk.I1iLiiI;
import com.p118pd.sdk.IIiLIli;
import com.p118pd.sdk.IL1i1;
import com.p118pd.sdk.IlllII1;
import com.p118pd.sdk.L1L1l;
import com.p118pd.sdk.LL1ii1l;
import com.p118pd.sdk.LlLI1;
import com.p118pd.sdk.iIilII1;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.util.Strings;

public class JCEECPublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey, I1iLiiI {
    public String algorithm = "EC";
    public ECParameterSpec ecSpec;
    public C9574i1iIiI gostParams;

    /* renamed from: q */
    public AbstractC9738llL1L f13498q;
    public boolean withCompression;

    public JCEECPublicKey(C6888ll r2) {
        OooO00o(r2);
    }

    public JCEECPublicKey(String str, LL1ii1l r3) {
        this.algorithm = str;
        this.f13498q = r3.OooO00o();
        this.ecSpec = null;
    }

    public JCEECPublicKey(String str, LL1ii1l r3, C6106iIiIl iiiil) {
        C5600L1iLL OooO00o = r3.OooO00o();
        this.algorithm = str;
        this.f13498q = r3.OooO00o();
        this.ecSpec = iiiil == null ? OooO00o(C6631lLlI.OooO00o(OooO00o.OooO00o(), OooO00o.m16005OooO00o()), OooO00o) : C6631lLlI.OooO00o(C6631lLlI.OooO00o(iiiil.OooO00o(), iiiil.m16971OooO00o()), iiiil);
    }

    public JCEECPublicKey(String str, LL1ii1l r3, ECParameterSpec eCParameterSpec) {
        C5600L1iLL OooO00o = r3.OooO00o();
        this.algorithm = str;
        this.f13498q = r3.OooO00o();
        if (eCParameterSpec == null) {
            this.ecSpec = OooO00o(C6631lLlI.OooO00o(OooO00o.OooO00o(), OooO00o.m16005OooO00o()), OooO00o);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public JCEECPublicKey(String str, C5769Ll1 r4) {
        ECParameterSpec eCParameterSpec;
        this.algorithm = str;
        this.f13498q = r4.OooO00o();
        if (r4.OooO00o() != null) {
            eCParameterSpec = C6631lLlI.OooO00o(C6631lLlI.OooO00o(r4.OooO00o().OooO00o(), r4.OooO00o().m16971OooO00o()), r4.OooO00o());
        } else {
            if (this.f13498q.m21800OooO00o() == null) {
                this.f13498q = BouncyCastleProvider.CONFIGURATION.OooO00o().OooO00o().OooO00o(this.f13498q.m21802OooO00o().m21859OooO00o(), this.f13498q.m21810OooO0O0().m21859OooO00o(), false);
            }
            eCParameterSpec = null;
        }
        this.ecSpec = eCParameterSpec;
    }

    public JCEECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.f13498q = C6631lLlI.OooO00o(params, eCPublicKeySpec.getW(), false);
    }

    public JCEECPublicKey(String str, JCEECPublicKey jCEECPublicKey) {
        this.algorithm = str;
        this.f13498q = jCEECPublicKey.f13498q;
        this.ecSpec = jCEECPublicKey.ecSpec;
        this.withCompression = jCEECPublicKey.withCompression;
        this.gostParams = jCEECPublicKey.gostParams;
    }

    public JCEECPublicKey(ECPublicKey eCPublicKey) {
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.f13498q = C6631lLlI.OooO00o(params, eCPublicKey.getW(), false);
    }

    private ECParameterSpec OooO00o(EllipticCurve ellipticCurve, C5600L1iLL r5) {
        return new ECParameterSpec(ellipticCurve, C6631lLlI.OooO00o(r5.m16003OooO00o()), r5.OooO0OO(), r5.m16004OooO00o().intValue());
    }

    private void OooO00o(C6888ll r15) {
        IIiLIli r6;
        byte[] OooO00o;
        AbstractC6804llL1ii r0;
        ECParameterSpec eCParameterSpec;
        if (r15.m18042OooO0O0().OooO00o().equals(AbstractC5331ILi.OooOOO0)) {
            iIilII1 OooO00o2 = r15.OooO00o();
            this.algorithm = "ECGOST3410";
            try {
                byte[] OooO00o3 = ((AbstractC6804llL1ii) AbstractC6122iIlLiL.OooO00o(OooO00o2.m15475OooO00o())).m17938OooO00o();
                byte[] bArr = new byte[65];
                bArr[0] = 4;
                for (int i = 1; i <= 32; i++) {
                    bArr[i] = OooO00o3[32 - i];
                    bArr[i + 32] = OooO00o3[64 - i];
                }
                C9574i1iIiI r02 = new C9574i1iIiI((I11li1) r15.m18042OooO0O0().m17587OooO0O0());
                this.gostParams = r02;
                IL1i1 OooO00o4 = C5313ILl1.OooO00o(C6723lilIL.m17820OooO00o(r02.OooO0OO()));
                IIiLIli OooO00o5 = OooO00o4.OooO00o();
                EllipticCurve OooO00o6 = C6631lLlI.OooO00o(OooO00o5, OooO00o4.m16971OooO00o());
                this.f13498q = OooO00o5.OooO00o(bArr);
                this.ecSpec = new L1L1l(C6723lilIL.m17820OooO00o(this.gostParams.OooO0OO()), OooO00o6, C6631lLlI.OooO00o(OooO00o4.m16969OooO00o()), OooO00o4.OooO0O0(), OooO00o4.m16970OooO00o());
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        } else {
            C6620lLlliL llllil = new C6620lLlliL((AbstractC6122iIlLiL) r15.m18042OooO0O0().m17587OooO0O0());
            if (llllil.m17705OooO0O0()) {
                LlLI1 llLI1 = (LlLI1) llllil.OooO0Oo();
                C9387Iill OooO00o7 = IlllII1.OooO00o(llLI1);
                r6 = OooO00o7.OooO00o();
                eCParameterSpec = new L1L1l(IlllII1.m15716OooO00o(llLI1), C6631lLlI.OooO00o(r6, OooO00o7.m21459OooO00o()), C6631lLlI.OooO00o(OooO00o7.m21457OooO00o()), OooO00o7.m21460OooO0O0(), OooO00o7.m21458OooO00o());
            } else if (llllil.OooO00o()) {
                this.ecSpec = null;
                r6 = BouncyCastleProvider.CONFIGURATION.OooO00o().OooO00o();
                OooO00o = r15.OooO00o().m15475OooO00o();
                r0 = new C6487lIIiIlL(OooO00o);
                if (OooO00o[0] == 4 && OooO00o[1] == OooO00o.length - 2 && ((OooO00o[2] == 2 || OooO00o[2] == 3) && new C6849lLLIllI().OooO00o(r6) >= OooO00o.length - 3)) {
                    r0 = (AbstractC6804llL1ii) AbstractC6122iIlLiL.OooO00o(OooO00o);
                }
                this.f13498q = new C6147iL1(r6, r0).OooO00o();
            } else {
                C9387Iill OooO00o8 = C9387Iill.OooO00o(llllil.OooO0Oo());
                r6 = OooO00o8.OooO00o();
                eCParameterSpec = new ECParameterSpec(C6631lLlI.OooO00o(r6, OooO00o8.m21459OooO00o()), C6631lLlI.OooO00o(OooO00o8.m21457OooO00o()), OooO00o8.m21460OooO0O0(), OooO00o8.m21458OooO00o().intValue());
            }
            this.ecSpec = eCParameterSpec;
            OooO00o = r15.OooO00o().m15475OooO00o();
            r0 = new C6487lIIiIlL(OooO00o);
            try {
                r0 = (AbstractC6804llL1ii) AbstractC6122iIlLiL.OooO00o(OooO00o);
                this.f13498q = new C6147iL1(r6, r0).OooO00o();
            } catch (IOException unused2) {
                throw new IllegalArgumentException("error recovering public key");
            }
        }
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
        OooO00o(C6888ll.OooO00o(AbstractC6122iIlLiL.OooO00o((byte[]) objectInputStream.readObject())));
        this.algorithm = (String) objectInputStream.readObject();
        this.withCompression = objectInputStream.readBoolean();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.algorithm);
        objectOutputStream.writeBoolean(this.withCompression);
    }

    public AbstractC9738llL1L engineGetQ() {
        return this.f13498q;
    }

    public C6106iIiIl engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? C6631lLlI.OooO00o(eCParameterSpec, this.withCompression) : BouncyCastleProvider.CONFIGURATION.OooO00o();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof JCEECPublicKey)) {
            return false;
        }
        JCEECPublicKey jCEECPublicKey = (JCEECPublicKey) obj;
        return engineGetQ().m21806OooO00o(jCEECPublicKey.engineGetQ()) && engineGetSpec().equals(jCEECPublicKey.engineGetSpec());
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public byte[] getEncoded() {
        C6888ll r1;
        C6620lLlliL llllil;
        AbstractC5738Lil lil;
        if (this.algorithm.equals("ECGOST3410")) {
            AbstractC5738Lil lil2 = this.gostParams;
            if (lil2 == null) {
                ECParameterSpec eCParameterSpec = this.ecSpec;
                if (eCParameterSpec instanceof L1L1l) {
                    lil = new C9574i1iIiI(C6723lilIL.m17819OooO00o(((L1L1l) eCParameterSpec).OooO00o()), AbstractC5331ILi.OooOOOo);
                } else {
                    IIiLIli OooO00o = C6631lLlI.OooO00o(eCParameterSpec.getCurve());
                    lil = new C6620lLlliL(new C9387Iill(OooO00o, C6631lLlI.OooO00o(OooO00o, this.ecSpec.getGenerator(), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf((long) this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
                }
                lil2 = lil;
            }
            BigInteger OooO00o2 = this.f13498q.m21802OooO00o().m21859OooO00o();
            BigInteger OooO00o3 = this.f13498q.m21810OooO0O0().m21859OooO00o();
            byte[] bArr = new byte[64];
            OooO00o(bArr, 0, OooO00o2);
            OooO00o(bArr, 32, OooO00o3);
            try {
                r1 = new C6888ll(new C6456l1ilL(AbstractC5331ILi.OooOOO0, lil2), new C6487lIIiIlL(bArr));
            } catch (IOException unused) {
                return null;
            }
        } else {
            ECParameterSpec eCParameterSpec2 = this.ecSpec;
            if (eCParameterSpec2 instanceof L1L1l) {
                LlLI1 OooO00o4 = IlllII1.OooO00o(((L1L1l) eCParameterSpec2).OooO00o());
                if (OooO00o4 == null) {
                    OooO00o4 = new LlLI1(((L1L1l) this.ecSpec).OooO00o());
                }
                llllil = new C6620lLlliL(OooO00o4);
            } else if (eCParameterSpec2 == null) {
                llllil = new C6620lLlliL((AbstractC5335ILl) C6452l1Lll.OooO00o);
            } else {
                IIiLIli OooO00o5 = C6631lLlI.OooO00o(eCParameterSpec2.getCurve());
                llllil = new C6620lLlliL(new C9387Iill(OooO00o5, C6631lLlI.OooO00o(OooO00o5, this.ecSpec.getGenerator(), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf((long) this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
            r1 = new C6888ll(new C6456l1ilL(AbstractC5420Il1iIL.o00O0o0o, llllil), ((AbstractC6804llL1ii) new C6147iL1(engineGetQ().m21800OooO00o().OooO00o(getQ().m21802OooO00o().m21859OooO00o(), getQ().m21810OooO0O0().m21859OooO00o(), this.withCompression)).OooO0O0()).m17938OooO00o());
        }
        return C6412iliILI.OooO00o(r1);
    }

    public String getFormat() {
        return "X.509";
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

    @Override // org.bouncycastle.jce.interfaces.ECPublicKey
    public AbstractC9738llL1L getQ() {
        return this.ecSpec == null ? this.f13498q.OooO0O0() : this.f13498q;
    }

    public ECPoint getW() {
        return C6631lLlI.OooO00o(this.f13498q);
    }

    public int hashCode() {
        return engineGetQ().hashCode() ^ engineGetSpec().hashCode();
    }

    @Override // com.p118pd.sdk.I1iLiiI
    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String OooO00o = Strings.m22984OooO00o();
        stringBuffer.append("EC Public Key");
        stringBuffer.append(OooO00o);
        stringBuffer.append("            X: ");
        stringBuffer.append(this.f13498q.m21802OooO00o().m21859OooO00o().toString(16));
        stringBuffer.append(OooO00o);
        stringBuffer.append("            Y: ");
        stringBuffer.append(this.f13498q.m21810OooO0O0().m21859OooO00o().toString(16));
        stringBuffer.append(OooO00o);
        return stringBuffer.toString();
    }
}
