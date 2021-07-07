package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.il丨iL  reason: invalid class name and case insensitive filesystem */
public class C6347iliL extends KeyPairGenerator {
    public int OooO00o = 239;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iL1ilL1 f18105OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LI111l f18106OooO00o = new LI111l();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f18107OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f18108OooO00o = "ECGOST3410";

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18109OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18110OooO00o = false;

    public C6347iliL() {
        super("ECGOST3410");
    }

    public KeyPair generateKeyPair() {
        if (this.f18110OooO00o) {
            i1LLl1L OooO00o2 = this.f18106OooO00o.OooO00o();
            LL1ii1l r1 = (LL1ii1l) OooO00o2.OooO0O0();
            C6512lIilLl r0 = (C6512lIilLl) OooO00o2.OooO00o();
            Object obj = this.f18107OooO00o;
            if (obj instanceof C6106iIiIl) {
                C6106iIiIl iiiil = (C6106iIiIl) obj;
                BCECGOST3410PublicKey bCECGOST3410PublicKey = new BCECGOST3410PublicKey(this.f18108OooO00o, r1, iiiil);
                return new KeyPair(bCECGOST3410PublicKey, new BCECGOST3410PrivateKey(this.f18108OooO00o, r0, bCECGOST3410PublicKey, iiiil));
            } else if (obj == null) {
                return new KeyPair(new BCECGOST3410PublicKey(this.f18108OooO00o, r1), new BCECGOST3410PrivateKey(this.f18108OooO00o, r0));
            } else {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                BCECGOST3410PublicKey bCECGOST3410PublicKey2 = new BCECGOST3410PublicKey(this.f18108OooO00o, r1, eCParameterSpec);
                return new KeyPair(bCECGOST3410PublicKey2, new BCECGOST3410PrivateKey(this.f18108OooO00o, r0, bCECGOST3410PublicKey2, eCParameterSpec));
            }
        } else {
            throw new IllegalStateException("EC Key Pair Generator not initialised");
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.OooO00o = i;
        this.f18109OooO00o = secureRandom;
        Object obj = this.f18107OooO00o;
        if (obj != null) {
            try {
                initialize((ECGenParameterSpec) obj, secureRandom);
            } catch (InvalidAlgorithmParameterException unused) {
                throw new InvalidParameterException("key size not configurable.");
            }
        } else {
            throw new InvalidParameterException("unknown key size.");
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        iL1ilL1 r3;
        iL1ilL1 r11;
        if (algorithmParameterSpec instanceof C6106iIiIl) {
            C6106iIiIl iiiil = (C6106iIiIl) algorithmParameterSpec;
            this.f18107OooO00o = algorithmParameterSpec;
            r11 = new iL1ilL1(new C5600L1iLL(iiiil.OooO00o(), iiiil.m16969OooO00o(), iiiil.OooO0O0(), iiiil.m16970OooO00o()), secureRandom);
        } else {
            if (algorithmParameterSpec instanceof ECParameterSpec) {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
                this.f18107OooO00o = algorithmParameterSpec;
                IIiLIli OooO00o2 = C6631lLlI.OooO00o(eCParameterSpec.getCurve());
                r3 = new iL1ilL1(new C5600L1iLL(OooO00o2, C6631lLlI.OooO00o(OooO00o2, eCParameterSpec.getGenerator(), false), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor())), secureRandom);
            } else {
                boolean z = algorithmParameterSpec instanceof ECGenParameterSpec;
                if (z || (algorithmParameterSpec instanceof C5381Iil1)) {
                    String name = z ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : ((C5381Iil1) algorithmParameterSpec).OooO00o();
                    C5600L1iLL OooO00o3 = C6723lilIL.OooO00o(name);
                    if (OooO00o3 != null) {
                        L1L1l l1L1l = new L1L1l(name, OooO00o3.OooO00o(), OooO00o3.m16003OooO00o(), OooO00o3.OooO0OO(), OooO00o3.m16004OooO00o(), OooO00o3.m16005OooO00o());
                        this.f18107OooO00o = l1L1l;
                        L1L1l l1L1l2 = l1L1l;
                        IIiLIli OooO00o4 = C6631lLlI.OooO00o(l1L1l2.getCurve());
                        r3 = new iL1ilL1(new C5600L1iLL(OooO00o4, C6631lLlI.OooO00o(OooO00o4, l1L1l2.getGenerator(), false), l1L1l2.getOrder(), BigInteger.valueOf((long) l1L1l2.getCofactor())), secureRandom);
                    } else {
                        throw new InvalidAlgorithmParameterException("unknown curve name: " + name);
                    }
                } else if (algorithmParameterSpec == null && BouncyCastleProvider.CONFIGURATION.OooO00o() != null) {
                    C6106iIiIl OooO00o5 = BouncyCastleProvider.CONFIGURATION.OooO00o();
                    this.f18107OooO00o = algorithmParameterSpec;
                    r11 = new iL1ilL1(new C5600L1iLL(OooO00o5.OooO00o(), OooO00o5.m16969OooO00o(), OooO00o5.OooO0O0(), OooO00o5.m16970OooO00o()), secureRandom);
                } else if (algorithmParameterSpec == null && BouncyCastleProvider.CONFIGURATION.OooO00o() == null) {
                    throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
                } else {
                    throw new InvalidAlgorithmParameterException("parameter object not a ECParameterSpec: " + algorithmParameterSpec.getClass().getName());
                }
            }
            this.f18105OooO00o = r3;
            this.f18106OooO00o.OooO00o(r3);
            this.f18110OooO00o = true;
        }
        this.f18105OooO00o = r11;
        this.f18106OooO00o.OooO00o(r11);
        this.f18110OooO00o = true;
    }
}
