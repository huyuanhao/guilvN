package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import com.p118pd.sdk.AbstractC5738Lil;
import com.p118pd.sdk.AbstractC5755LiL;
import com.p118pd.sdk.AbstractC6122iIlLiL;
import com.p118pd.sdk.AbstractC6781lli;
import com.p118pd.sdk.AbstractC6804llL1ii;
import com.p118pd.sdk.AbstractC9477LILlL;
import com.p118pd.sdk.AbstractC9738llL1L;
import com.p118pd.sdk.C5600L1iLL;
import com.p118pd.sdk.C5636LIl;
import com.p118pd.sdk.C5769Ll1;
import com.p118pd.sdk.C6011i1I;
import com.p118pd.sdk.C6106iIiIl;
import com.p118pd.sdk.C6412iliILI;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6487lIIiIlL;
import com.p118pd.sdk.C6598lLili;
import com.p118pd.sdk.C6620lLlliL;
import com.p118pd.sdk.C6631lLlI;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.C9387Iill;
import com.p118pd.sdk.C9543L1;
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
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class BCDSTU4145PublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey, I1iLiiI {
    public static final long serialVersionUID = 7026240464295649314L;
    public transient C5636LIl OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient LL1ii1l f23904OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient ECParameterSpec f23905OooO00o;
    public String algorithm = "DSTU4145";
    public boolean withCompression;

    public BCDSTU4145PublicKey(C5769Ll1 r5, AbstractC9477LILlL r6) {
        if (r5.OooO00o() != null) {
            EllipticCurve OooO00o2 = C6631lLlI.OooO00o(r5.OooO00o().OooO00o(), r5.OooO00o().m16971OooO00o());
            this.f23904OooO00o = new LL1ii1l(r5.OooO00o(), IlllII1.OooO00o(r6, r5.OooO00o()));
            this.f23905OooO00o = C6631lLlI.OooO00o(OooO00o2, r5.OooO00o());
            return;
        }
        this.f23904OooO00o = new LL1ii1l(r6.OooO00o().OooO00o().OooO00o(r5.OooO00o().m21802OooO00o().m21859OooO00o(), r5.OooO00o().m21810OooO0O0().m21859OooO00o()), C6631lLlI.OooO00o(r6, (ECParameterSpec) null));
        this.f23905OooO00o = null;
    }

    public BCDSTU4145PublicKey(C6888ll r2) {
        OooO00o(r2);
    }

    public BCDSTU4145PublicKey(String str, LL1ii1l r3) {
        this.algorithm = str;
        this.f23904OooO00o = r3;
        this.f23905OooO00o = null;
    }

    public BCDSTU4145PublicKey(String str, LL1ii1l r3, C6106iIiIl iiiil) {
        C5600L1iLL OooO00o2 = r3.OooO00o();
        this.algorithm = str;
        this.f23905OooO00o = iiiil == null ? OooO00o(C6631lLlI.OooO00o(OooO00o2.OooO00o(), OooO00o2.m16005OooO00o()), OooO00o2) : C6631lLlI.OooO00o(C6631lLlI.OooO00o(iiiil.OooO00o(), iiiil.m16971OooO00o()), iiiil);
        this.f23904OooO00o = r3;
    }

    public BCDSTU4145PublicKey(String str, LL1ii1l r3, ECParameterSpec eCParameterSpec) {
        C5600L1iLL OooO00o2 = r3.OooO00o();
        this.algorithm = str;
        this.f23904OooO00o = r3;
        if (eCParameterSpec == null) {
            this.f23905OooO00o = OooO00o(C6631lLlI.OooO00o(OooO00o2.OooO00o(), OooO00o2.m16005OooO00o()), OooO00o2);
        } else {
            this.f23905OooO00o = eCParameterSpec;
        }
    }

    public BCDSTU4145PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.f23905OooO00o = params;
        this.f23904OooO00o = new LL1ii1l(C6631lLlI.OooO00o(params, eCPublicKeySpec.getW(), false), C6631lLlI.OooO00o((AbstractC9477LILlL) null, this.f23905OooO00o));
    }

    public BCDSTU4145PublicKey(BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        this.f23904OooO00o = bCDSTU4145PublicKey.f23904OooO00o;
        this.f23905OooO00o = bCDSTU4145PublicKey.f23905OooO00o;
        this.withCompression = bCDSTU4145PublicKey.withCompression;
        this.OooO00o = bCDSTU4145PublicKey.OooO00o;
    }

    private ECParameterSpec OooO00o(EllipticCurve ellipticCurve, C5600L1iLL r5) {
        return new ECParameterSpec(ellipticCurve, C6631lLlI.OooO00o(r5.m16003OooO00o()), r5.OooO0OO(), r5.m16004OooO00o().intValue());
    }

    private void OooO00o(C6888ll r13) {
        C6106iIiIl iiiil;
        iIilII1 OooO00o2 = r13.OooO00o();
        this.algorithm = "DSTU4145";
        try {
            byte[] OooO00o3 = ((AbstractC6804llL1ii) AbstractC6122iIlLiL.OooO00o(OooO00o2.m15475OooO00o())).m17938OooO00o();
            if (r13.m18041OooO00o().OooO00o().equals(AbstractC6781lli.OooO0O0)) {
                OooO00o(OooO00o3);
            }
            C5636LIl OooO00o4 = C5636LIl.OooO00o((I11li1) r13.m18041OooO00o().m17587OooO0O0());
            this.OooO00o = OooO00o4;
            if (OooO00o4.m16114OooO00o()) {
                LlLI1 OooO00o5 = this.OooO00o.OooO00o();
                C5600L1iLL OooO00o6 = C6598lLili.OooO00o(OooO00o5);
                iiiil = new IL1i1(OooO00o5.m16387OooO0O0(), OooO00o6.OooO00o(), OooO00o6.m16003OooO00o(), OooO00o6.OooO0OO(), OooO00o6.m16004OooO00o(), OooO00o6.m16005OooO00o());
            } else {
                C6011i1I OooO00o7 = this.OooO00o.m16113OooO00o();
                byte[] OooO00o8 = OooO00o7.m16854OooO00o();
                if (r13.m18041OooO00o().OooO00o().equals(AbstractC6781lli.OooO0O0)) {
                    OooO00o(OooO00o8);
                }
                C9543L1 OooO00o9 = OooO00o7.OooO00o();
                IIiLIli.C5231OooO0o0 oooO0o0 = new IIiLIli.C5231OooO0o0(OooO00o9.OooO0o0(), OooO00o9.OooO0O0(), OooO00o9.OooO0OO(), OooO00o9.OooO0Oo(), OooO00o7.m16853OooO00o(), new BigInteger(1, OooO00o8));
                byte[] OooO0O0 = OooO00o7.m16856OooO0O0();
                if (r13.m18041OooO00o().OooO00o().equals(AbstractC6781lli.OooO0O0)) {
                    OooO00o(OooO0O0);
                }
                iiiil = new C6106iIiIl(oooO0o0, AbstractC5755LiL.OooO00o(oooO0o0, OooO0O0), OooO00o7.m16855OooO0O0());
            }
            IIiLIli OooO00o10 = iiiil.OooO00o();
            EllipticCurve OooO00o11 = C6631lLlI.OooO00o(OooO00o10, iiiil.m16971OooO00o());
            this.f23905OooO00o = this.OooO00o.m16114OooO00o() ? new L1L1l(this.OooO00o.OooO00o().m16387OooO0O0(), OooO00o11, C6631lLlI.OooO00o(iiiil.m16969OooO00o()), iiiil.OooO0O0(), iiiil.m16970OooO00o()) : new ECParameterSpec(OooO00o11, C6631lLlI.OooO00o(iiiil.m16969OooO00o()), iiiil.OooO0O0(), iiiil.m16970OooO00o().intValue());
            this.f23904OooO00o = new LL1ii1l(AbstractC5755LiL.OooO00o(OooO00o10, OooO00o3), C6631lLlI.OooO00o((AbstractC9477LILlL) null, this.f23905OooO00o));
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    private void OooO00o(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
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
        return this.f23904OooO00o;
    }

    public C6106iIiIl engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.f23905OooO00o;
        return eCParameterSpec != null ? C6631lLlI.OooO00o(eCParameterSpec, this.withCompression) : BouncyCastleProvider.CONFIGURATION.OooO00o();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCDSTU4145PublicKey)) {
            return false;
        }
        BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) obj;
        return this.f23904OooO00o.OooO00o().m21806OooO00o(bCDSTU4145PublicKey.f23904OooO00o.OooO00o()) && engineGetSpec().equals(bCDSTU4145PublicKey.engineGetSpec());
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public byte[] getEncoded() {
        AbstractC5738Lil lil = this.OooO00o;
        if (lil == null) {
            ECParameterSpec eCParameterSpec = this.f23905OooO00o;
            if (eCParameterSpec instanceof L1L1l) {
                lil = new C5636LIl(new LlLI1(((L1L1l) this.f23905OooO00o).OooO00o()));
            } else {
                IIiLIli OooO00o2 = C6631lLlI.OooO00o(eCParameterSpec.getCurve());
                lil = new C6620lLlliL(new C9387Iill(OooO00o2, C6631lLlI.OooO00o(OooO00o2, this.f23905OooO00o.getGenerator(), this.withCompression), this.f23905OooO00o.getOrder(), BigInteger.valueOf((long) this.f23905OooO00o.getCofactor()), this.f23905OooO00o.getCurve().getSeed()));
            }
        }
        try {
            return C6412iliILI.OooO00o(new C6888ll(new C6456l1ilL(AbstractC6781lli.OooO0OO, lil), new C6487lIIiIlL(AbstractC5755LiL.OooO00o(this.f23904OooO00o.OooO00o()))));
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    @Override // com.p118pd.sdk.AbstractC6484lII
    public C6106iIiIl getParameters() {
        ECParameterSpec eCParameterSpec = this.f23905OooO00o;
        if (eCParameterSpec == null) {
            return null;
        }
        return C6631lLlI.OooO00o(eCParameterSpec, this.withCompression);
    }

    public ECParameterSpec getParams() {
        return this.f23905OooO00o;
    }

    @Override // org.bouncycastle.jce.interfaces.ECPublicKey
    public AbstractC9738llL1L getQ() {
        AbstractC9738llL1L OooO00o2 = this.f23904OooO00o.OooO00o();
        return this.f23905OooO00o == null ? OooO00o2.OooO0O0() : OooO00o2;
    }

    public byte[] getSbox() {
        C5636LIl lIl = this.OooO00o;
        return lIl != null ? lIl.m16115OooO00o() : C5636LIl.OooO0O0();
    }

    public ECPoint getW() {
        return C6631lLlI.OooO00o(this.f23904OooO00o.OooO00o());
    }

    public int hashCode() {
        return this.f23904OooO00o.OooO00o().hashCode() ^ engineGetSpec().hashCode();
    }

    @Override // com.p118pd.sdk.I1iLiiI
    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return IlllII1.OooO00o(this.algorithm, this.f23904OooO00o.OooO00o(), engineGetSpec());
    }
}
