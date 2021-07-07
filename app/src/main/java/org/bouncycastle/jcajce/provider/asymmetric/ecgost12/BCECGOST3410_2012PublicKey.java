package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import com.p118pd.sdk.AbstractC5738Lil;
import com.p118pd.sdk.AbstractC6122iIlLiL;
import com.p118pd.sdk.AbstractC6804llL1ii;
import com.p118pd.sdk.AbstractC9477LILlL;
import com.p118pd.sdk.AbstractC9738llL1L;
import com.p118pd.sdk.C5313ILl1;
import com.p118pd.sdk.C5600L1iLL;
import com.p118pd.sdk.C5769Ll1;
import com.p118pd.sdk.C6106iIiIl;
import com.p118pd.sdk.C6412iliILI;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6487lIIiIlL;
import com.p118pd.sdk.C6620lLlliL;
import com.p118pd.sdk.C6631lLlI;
import com.p118pd.sdk.C6723lilIL;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.C9387Iill;
import com.p118pd.sdk.C9574i1iIiI;
import com.p118pd.sdk.I1iLiiI;
import com.p118pd.sdk.IIiLIli;
import com.p118pd.sdk.IL1i1;
import com.p118pd.sdk.IlllII1;
import com.p118pd.sdk.L1L1l;
import com.p118pd.sdk.LL1ii1l;
import com.p118pd.sdk.LLiII;
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
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class BCECGOST3410_2012PublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey, I1iLiiI {
    public static final long serialVersionUID = 7026240464295649314L;
    public transient LL1ii1l OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient C9574i1iIiI f23930OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient ECParameterSpec f23931OooO00o;
    public String algorithm = "ECGOST3410-2012";
    public boolean withCompression;

    public BCECGOST3410_2012PublicKey(C5769Ll1 r5, AbstractC9477LILlL r6) {
        if (r5.OooO00o() != null) {
            EllipticCurve OooO00o2 = C6631lLlI.OooO00o(r5.OooO00o().OooO00o(), r5.OooO00o().m16971OooO00o());
            this.OooO00o = new LL1ii1l(r5.OooO00o(), IlllII1.OooO00o(r6, r5.OooO00o()));
            this.f23931OooO00o = C6631lLlI.OooO00o(OooO00o2, r5.OooO00o());
            return;
        }
        this.OooO00o = new LL1ii1l(r6.OooO00o().OooO00o().OooO00o(r5.OooO00o().m21802OooO00o().m21859OooO00o(), r5.OooO00o().m21810OooO0O0().m21859OooO00o()), C6631lLlI.OooO00o(r6, (ECParameterSpec) null));
        this.f23931OooO00o = null;
    }

    public BCECGOST3410_2012PublicKey(C6888ll r2) {
        OooO00o(r2);
    }

    public BCECGOST3410_2012PublicKey(String str, LL1ii1l r3) {
        this.algorithm = str;
        this.OooO00o = r3;
        this.f23931OooO00o = null;
    }

    public BCECGOST3410_2012PublicKey(String str, LL1ii1l r3, C6106iIiIl iiiil) {
        C5600L1iLL OooO00o2 = r3.OooO00o();
        this.algorithm = str;
        this.OooO00o = r3;
        this.f23931OooO00o = iiiil == null ? OooO00o(C6631lLlI.OooO00o(OooO00o2.OooO00o(), OooO00o2.m16005OooO00o()), OooO00o2) : C6631lLlI.OooO00o(C6631lLlI.OooO00o(iiiil.OooO00o(), iiiil.m16971OooO00o()), iiiil);
    }

    public BCECGOST3410_2012PublicKey(String str, LL1ii1l r3, ECParameterSpec eCParameterSpec) {
        C5600L1iLL OooO00o2 = r3.OooO00o();
        this.algorithm = str;
        this.OooO00o = r3;
        if (eCParameterSpec == null) {
            this.f23931OooO00o = OooO00o(C6631lLlI.OooO00o(OooO00o2.OooO00o(), OooO00o2.m16005OooO00o()), OooO00o2);
        } else {
            this.f23931OooO00o = eCParameterSpec;
        }
    }

    public BCECGOST3410_2012PublicKey(ECPublicKey eCPublicKey) {
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.f23931OooO00o = params;
        this.OooO00o = new LL1ii1l(C6631lLlI.OooO00o(params, eCPublicKey.getW(), false), C6631lLlI.OooO00o((AbstractC9477LILlL) null, eCPublicKey.getParams()));
    }

    public BCECGOST3410_2012PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.f23931OooO00o = params;
        this.OooO00o = new LL1ii1l(C6631lLlI.OooO00o(params, eCPublicKeySpec.getW(), false), C6631lLlI.OooO00o((AbstractC9477LILlL) null, eCPublicKeySpec.getParams()));
    }

    public BCECGOST3410_2012PublicKey(BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey) {
        this.OooO00o = bCECGOST3410_2012PublicKey.OooO00o;
        this.f23931OooO00o = bCECGOST3410_2012PublicKey.f23931OooO00o;
        this.withCompression = bCECGOST3410_2012PublicKey.withCompression;
        this.f23930OooO00o = bCECGOST3410_2012PublicKey.f23930OooO00o;
    }

    private ECParameterSpec OooO00o(EllipticCurve ellipticCurve, C5600L1iLL r5) {
        return new ECParameterSpec(ellipticCurve, C6631lLlI.OooO00o(r5.m16003OooO00o()), r5.OooO0OO(), r5.m16004OooO00o().intValue());
    }

    private void OooO00o(C6888ll r11) {
        LlLI1 OooO00o2 = r11.m18041OooO00o().OooO00o();
        iIilII1 OooO00o3 = r11.OooO00o();
        this.algorithm = "ECGOST3410-2012";
        try {
            byte[] OooO00o4 = ((AbstractC6804llL1ii) AbstractC6122iIlLiL.OooO00o(OooO00o3.m15475OooO00o())).m17938OooO00o();
            int i = 32;
            if (OooO00o2.equals(LLiII.OooO0oo)) {
                i = 64;
            }
            int i2 = i * 2;
            byte[] bArr = new byte[(i2 + 1)];
            bArr[0] = 4;
            for (int i3 = 1; i3 <= i; i3++) {
                bArr[i3] = OooO00o4[i - i3];
                bArr[i3 + i] = OooO00o4[i2 - i3];
            }
            C9574i1iIiI OooO00o5 = C9574i1iIiI.OooO00o(r11.m18041OooO00o().m17587OooO0O0());
            this.f23930OooO00o = OooO00o5;
            IL1i1 OooO00o6 = C5313ILl1.OooO00o(C6723lilIL.m17820OooO00o(OooO00o5.OooO0OO()));
            IIiLIli OooO00o7 = OooO00o6.OooO00o();
            EllipticCurve OooO00o8 = C6631lLlI.OooO00o(OooO00o7, OooO00o6.m16971OooO00o());
            this.OooO00o = new LL1ii1l(OooO00o7.OooO00o(bArr), IlllII1.OooO00o((AbstractC9477LILlL) null, OooO00o6));
            this.f23931OooO00o = new L1L1l(C6723lilIL.m17820OooO00o(this.f23930OooO00o.OooO0OO()), OooO00o8, C6631lLlI.OooO00o(OooO00o6.m16969OooO00o()), OooO00o6.OooO0O0(), OooO00o6.m16970OooO00o());
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
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
        OooO00o(C6888ll.OooO00o(AbstractC6122iIlLiL.OooO00o((byte[]) objectInputStream.readObject())));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public LL1ii1l engineGetKeyParameters() {
        return this.OooO00o;
    }

    public C6106iIiIl engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.f23931OooO00o;
        return eCParameterSpec != null ? C6631lLlI.OooO00o(eCParameterSpec, this.withCompression) : BouncyCastleProvider.CONFIGURATION.OooO00o();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410_2012PublicKey)) {
            return false;
        }
        BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey = (BCECGOST3410_2012PublicKey) obj;
        return this.OooO00o.OooO00o().m21806OooO00o(bCECGOST3410_2012PublicKey.OooO00o.OooO00o()) && engineGetSpec().equals(bCECGOST3410_2012PublicKey.engineGetSpec());
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public byte[] getEncoded() {
        LlLI1 llLI1;
        int i;
        AbstractC5738Lil lil;
        BigInteger OooO00o2 = this.OooO00o.OooO00o().m21802OooO00o().m21859OooO00o();
        BigInteger OooO00o3 = this.OooO00o.OooO00o().m21810OooO0O0().m21859OooO00o();
        boolean z = OooO00o2.bitLength() > 256;
        AbstractC5738Lil gostParams = getGostParams();
        if (gostParams == null) {
            ECParameterSpec eCParameterSpec = this.f23931OooO00o;
            if (eCParameterSpec instanceof L1L1l) {
                LlLI1 OooO00o4 = C6723lilIL.m17819OooO00o(((L1L1l) eCParameterSpec).OooO00o());
                if (z) {
                    LlLI1 llLI12 = LLiII.OooO0Oo;
                } else {
                    lil = new C9574i1iIiI(OooO00o4, LLiII.OooO0OO);
                }
            } else {
                IIiLIli OooO00o5 = C6631lLlI.OooO00o(eCParameterSpec.getCurve());
                lil = new C6620lLlliL(new C9387Iill(OooO00o5, C6631lLlI.OooO00o(OooO00o5, this.f23931OooO00o.getGenerator(), this.withCompression), this.f23931OooO00o.getOrder(), BigInteger.valueOf((long) this.f23931OooO00o.getCofactor()), this.f23931OooO00o.getCurve().getSeed()));
            }
            gostParams = lil;
        }
        int i2 = 64;
        if (z) {
            llLI1 = LLiII.OooO0oo;
            i = 64;
            i2 = 128;
        } else {
            i = 32;
            llLI1 = LLiII.OooO0oO;
        }
        byte[] bArr = new byte[i2];
        int i3 = i2 / 2;
        OooO00o(bArr, i3, 0, OooO00o2);
        OooO00o(bArr, i3, i, OooO00o3);
        try {
            return C6412iliILI.OooO00o(new C6888ll(new C6456l1ilL(llLI1, gostParams), new C6487lIIiIlL(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public C9574i1iIiI getGostParams() {
        if (this.f23930OooO00o == null && (this.f23931OooO00o instanceof L1L1l)) {
            this.f23930OooO00o = this.OooO00o.OooO00o().m21802OooO00o().m21859OooO00o().bitLength() > 256 ? new C9574i1iIiI(C6723lilIL.m17819OooO00o(((L1L1l) this.f23931OooO00o).OooO00o()), LLiII.OooO0Oo) : new C9574i1iIiI(C6723lilIL.m17819OooO00o(((L1L1l) this.f23931OooO00o).OooO00o()), LLiII.OooO0OO);
        }
        return this.f23930OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6484lII
    public C6106iIiIl getParameters() {
        ECParameterSpec eCParameterSpec = this.f23931OooO00o;
        if (eCParameterSpec == null) {
            return null;
        }
        return C6631lLlI.OooO00o(eCParameterSpec, this.withCompression);
    }

    public ECParameterSpec getParams() {
        return this.f23931OooO00o;
    }

    @Override // org.bouncycastle.jce.interfaces.ECPublicKey
    public AbstractC9738llL1L getQ() {
        return this.f23931OooO00o == null ? this.OooO00o.OooO00o().OooO0O0() : this.OooO00o.OooO00o();
    }

    public ECPoint getW() {
        return C6631lLlI.OooO00o(this.OooO00o.OooO00o());
    }

    public int hashCode() {
        return this.OooO00o.OooO00o().hashCode() ^ engineGetSpec().hashCode();
    }

    @Override // com.p118pd.sdk.I1iLiiI
    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return IlllII1.OooO00o(this.algorithm, this.OooO00o.OooO00o(), engineGetSpec());
    }
}
