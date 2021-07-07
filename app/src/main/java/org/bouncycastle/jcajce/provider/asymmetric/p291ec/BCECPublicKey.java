package org.bouncycastle.jcajce.provider.asymmetric.p291ec;

import com.p118pd.sdk.AbstractC5420Il1iIL;
import com.p118pd.sdk.AbstractC6122iIlLiL;
import com.p118pd.sdk.AbstractC6804llL1ii;
import com.p118pd.sdk.AbstractC9477LILlL;
import com.p118pd.sdk.AbstractC9738llL1L;
import com.p118pd.sdk.C5600L1iLL;
import com.p118pd.sdk.C5769Ll1;
import com.p118pd.sdk.C6106iIiIl;
import com.p118pd.sdk.C6147iL1;
import com.p118pd.sdk.C6412iliILI;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6487lIIiIlL;
import com.p118pd.sdk.C6620lLlliL;
import com.p118pd.sdk.C6631lLlI;
import com.p118pd.sdk.C6849lLLIllI;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.I1iLiiI;
import com.p118pd.sdk.IIiLIli;
import com.p118pd.sdk.ILIIIlI;
import com.p118pd.sdk.IlllII1;
import com.p118pd.sdk.LL1ii1l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey */
public class BCECPublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey, I1iLiiI {
    public static final long serialVersionUID = 2422789860422731812L;
    public transient LL1ii1l OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient AbstractC9477LILlL f23910OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient ECParameterSpec f23911OooO00o;
    public String algorithm = "EC";
    public boolean withCompression;

    public BCECPublicKey(String str, LL1ii1l r3, C6106iIiIl iiiil, AbstractC9477LILlL r5) {
        C5600L1iLL OooO00o2 = r3.OooO00o();
        this.algorithm = str;
        this.f23911OooO00o = iiiil == null ? OooO00o(C6631lLlI.OooO00o(OooO00o2.OooO00o(), OooO00o2.m16005OooO00o()), OooO00o2) : C6631lLlI.OooO00o(C6631lLlI.OooO00o(iiiil.OooO00o(), iiiil.m16971OooO00o()), iiiil);
        this.OooO00o = r3;
        this.f23910OooO00o = r5;
    }

    public BCECPublicKey(String str, LL1ii1l r3, AbstractC9477LILlL r4) {
        this.algorithm = str;
        this.OooO00o = r3;
        this.f23911OooO00o = null;
        this.f23910OooO00o = r4;
    }

    public BCECPublicKey(String str, LL1ii1l r3, ECParameterSpec eCParameterSpec, AbstractC9477LILlL r5) {
        C5600L1iLL OooO00o2 = r3.OooO00o();
        this.algorithm = str;
        this.OooO00o = r3;
        if (eCParameterSpec == null) {
            this.f23911OooO00o = OooO00o(C6631lLlI.OooO00o(OooO00o2.OooO00o(), OooO00o2.m16005OooO00o()), OooO00o2);
        } else {
            this.f23911OooO00o = eCParameterSpec;
        }
        this.f23910OooO00o = r5;
    }

    public BCECPublicKey(String str, C5769Ll1 r5, AbstractC9477LILlL r6) {
        this.algorithm = str;
        if (r5.OooO00o() != null) {
            EllipticCurve OooO00o2 = C6631lLlI.OooO00o(r5.OooO00o().OooO00o(), r5.OooO00o().m16971OooO00o());
            this.OooO00o = new LL1ii1l(r5.OooO00o(), IlllII1.OooO00o(r6, r5.OooO00o()));
            this.f23911OooO00o = C6631lLlI.OooO00o(OooO00o2, r5.OooO00o());
        } else {
            this.OooO00o = new LL1ii1l(r6.OooO00o().OooO00o().OooO00o(r5.OooO00o().m21802OooO00o().m21859OooO00o(), r5.OooO00o().m21810OooO0O0().m21859OooO00o()), C6631lLlI.OooO00o(r6, (ECParameterSpec) null));
            this.f23911OooO00o = null;
        }
        this.f23910OooO00o = r6;
    }

    public BCECPublicKey(String str, C6888ll r3, AbstractC9477LILlL r4) {
        this.algorithm = str;
        this.f23910OooO00o = r4;
        OooO00o(r3);
    }

    public BCECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec, AbstractC9477LILlL r6) {
        this.algorithm = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.f23911OooO00o = params;
        this.OooO00o = new LL1ii1l(C6631lLlI.OooO00o(params, eCPublicKeySpec.getW(), false), C6631lLlI.OooO00o(r6, eCPublicKeySpec.getParams()));
        this.f23910OooO00o = r6;
    }

    public BCECPublicKey(String str, BCECPublicKey bCECPublicKey) {
        this.algorithm = str;
        this.OooO00o = bCECPublicKey.OooO00o;
        this.f23911OooO00o = bCECPublicKey.f23911OooO00o;
        this.withCompression = bCECPublicKey.withCompression;
        this.f23910OooO00o = bCECPublicKey.f23910OooO00o;
    }

    public BCECPublicKey(ECPublicKey eCPublicKey, AbstractC9477LILlL r6) {
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.f23911OooO00o = params;
        this.OooO00o = new LL1ii1l(C6631lLlI.OooO00o(params, eCPublicKey.getW(), false), C6631lLlI.OooO00o(r6, eCPublicKey.getParams()));
    }

    private ECParameterSpec OooO00o(EllipticCurve ellipticCurve, C5600L1iLL r5) {
        return new ECParameterSpec(ellipticCurve, C6631lLlI.OooO00o(r5.m16003OooO00o()), r5.OooO0OO(), r5.m16004OooO00o().intValue());
    }

    private void OooO00o(C6888ll r7) {
        C6620lLlliL OooO00o2 = C6620lLlliL.OooO00o(r7.m18041OooO00o().m17587OooO0O0());
        IIiLIli OooO00o3 = C6631lLlI.OooO00o(this.f23910OooO00o, OooO00o2);
        this.f23911OooO00o = C6631lLlI.OooO00o(OooO00o2, OooO00o3);
        byte[] OooO00o4 = r7.OooO00o().m15475OooO00o();
        AbstractC6804llL1ii r2 = new C6487lIIiIlL(OooO00o4);
        if (OooO00o4[0] == 4 && OooO00o4[1] == OooO00o4.length - 2 && ((OooO00o4[2] == 2 || OooO00o4[2] == 3) && new C6849lLLIllI().OooO00o(OooO00o3) >= OooO00o4.length - 3)) {
            try {
                r2 = (AbstractC6804llL1ii) AbstractC6122iIlLiL.OooO00o(OooO00o4);
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        }
        this.OooO00o = new LL1ii1l(new C6147iL1(OooO00o3, r2).OooO00o(), IlllII1.OooO00o(this.f23910OooO00o, OooO00o2));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f23910OooO00o = BouncyCastleProvider.CONFIGURATION;
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
        ECParameterSpec eCParameterSpec = this.f23911OooO00o;
        return eCParameterSpec != null ? C6631lLlI.OooO00o(eCParameterSpec, this.withCompression) : this.f23910OooO00o.OooO00o();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPublicKey)) {
            return false;
        }
        BCECPublicKey bCECPublicKey = (BCECPublicKey) obj;
        return this.OooO00o.OooO00o().m21806OooO00o(bCECPublicKey.OooO00o.OooO00o()) && engineGetSpec().equals(bCECPublicKey.engineGetSpec());
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public byte[] getEncoded() {
        return C6412iliILI.OooO00o(new C6888ll(new C6456l1ilL(AbstractC5420Il1iIL.o00O0o0o, ILIIIlI.OooO00o(this.f23911OooO00o, this.withCompression)), AbstractC6804llL1ii.OooO00o((Object) new C6147iL1(this.OooO00o.OooO00o(), this.withCompression).OooO0O0()).m17938OooO00o()));
    }

    public String getFormat() {
        return "X.509";
    }

    @Override // com.p118pd.sdk.AbstractC6484lII
    public C6106iIiIl getParameters() {
        ECParameterSpec eCParameterSpec = this.f23911OooO00o;
        if (eCParameterSpec == null) {
            return null;
        }
        return C6631lLlI.OooO00o(eCParameterSpec, this.withCompression);
    }

    public ECParameterSpec getParams() {
        return this.f23911OooO00o;
    }

    @Override // org.bouncycastle.jce.interfaces.ECPublicKey
    public AbstractC9738llL1L getQ() {
        AbstractC9738llL1L OooO00o2 = this.OooO00o.OooO00o();
        return this.f23911OooO00o == null ? OooO00o2.OooO0O0() : OooO00o2;
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
        return IlllII1.OooO00o("EC", this.OooO00o.OooO00o(), engineGetSpec());
    }
}
