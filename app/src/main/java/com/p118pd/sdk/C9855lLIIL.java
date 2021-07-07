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
import org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.丨丨lLIIL  reason: invalid class name and case insensitive filesystem */
public class C9855lLIIL extends KeyPairGenerator {
    public iL1ilL1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LI111l f23472OooO00o = new C9649iiIII();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f23473OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f23474OooO00o = "DSTU4145";

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23475OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23476OooO00o = false;

    public C9855lLIIL() {
        super("DSTU4145");
    }

    public KeyPair generateKeyPair() {
        if (this.f23476OooO00o) {
            i1LLl1L OooO00o2 = this.f23472OooO00o.OooO00o();
            LL1ii1l r1 = (LL1ii1l) OooO00o2.OooO0O0();
            C6512lIilLl r0 = (C6512lIilLl) OooO00o2.OooO00o();
            Object obj = this.f23473OooO00o;
            if (obj instanceof C6106iIiIl) {
                C6106iIiIl iiiil = (C6106iIiIl) obj;
                BCDSTU4145PublicKey bCDSTU4145PublicKey = new BCDSTU4145PublicKey(this.f23474OooO00o, r1, iiiil);
                return new KeyPair(bCDSTU4145PublicKey, new BCDSTU4145PrivateKey(this.f23474OooO00o, r0, bCDSTU4145PublicKey, iiiil));
            } else if (obj == null) {
                return new KeyPair(new BCDSTU4145PublicKey(this.f23474OooO00o, r1), new BCDSTU4145PrivateKey(this.f23474OooO00o, r0));
            } else {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                BCDSTU4145PublicKey bCDSTU4145PublicKey2 = new BCDSTU4145PublicKey(this.f23474OooO00o, r1, eCParameterSpec);
                return new KeyPair(bCDSTU4145PublicKey2, new BCDSTU4145PrivateKey(this.f23474OooO00o, r0, bCDSTU4145PublicKey2, eCParameterSpec));
            }
        } else {
            throw new IllegalStateException("DSTU Key Pair Generator not initialised");
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.f23475OooO00o = secureRandom;
        Object obj = this.f23473OooO00o;
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
            this.f23473OooO00o = algorithmParameterSpec;
            r11 = new iL1ilL1(new C5600L1iLL(iiiil.OooO00o(), iiiil.m16969OooO00o(), iiiil.OooO0O0(), iiiil.m16970OooO00o()), secureRandom);
        } else {
            if (algorithmParameterSpec instanceof ECParameterSpec) {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
                this.f23473OooO00o = algorithmParameterSpec;
                IIiLIli OooO00o2 = C6631lLlI.OooO00o(eCParameterSpec.getCurve());
                r3 = new iL1ilL1(new C5600L1iLL(OooO00o2, C6631lLlI.OooO00o(OooO00o2, eCParameterSpec.getGenerator(), false), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor())), secureRandom);
            } else {
                boolean z = algorithmParameterSpec instanceof ECGenParameterSpec;
                if (z || (algorithmParameterSpec instanceof C5381Iil1)) {
                    String name = z ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : ((C5381Iil1) algorithmParameterSpec).OooO00o();
                    C5600L1iLL OooO00o3 = C6598lLili.OooO00o(new LlLI1(name));
                    if (OooO00o3 != null) {
                        L1L1l l1L1l = new L1L1l(name, OooO00o3.OooO00o(), OooO00o3.m16003OooO00o(), OooO00o3.OooO0OO(), OooO00o3.m16004OooO00o(), OooO00o3.m16005OooO00o());
                        this.f23473OooO00o = l1L1l;
                        L1L1l l1L1l2 = l1L1l;
                        IIiLIli OooO00o4 = C6631lLlI.OooO00o(l1L1l2.getCurve());
                        r3 = new iL1ilL1(new C5600L1iLL(OooO00o4, C6631lLlI.OooO00o(OooO00o4, l1L1l2.getGenerator(), false), l1L1l2.getOrder(), BigInteger.valueOf((long) l1L1l2.getCofactor())), secureRandom);
                    } else {
                        throw new InvalidAlgorithmParameterException("unknown curve name: " + name);
                    }
                } else if (algorithmParameterSpec == null && BouncyCastleProvider.CONFIGURATION.OooO00o() != null) {
                    C6106iIiIl OooO00o5 = BouncyCastleProvider.CONFIGURATION.OooO00o();
                    this.f23473OooO00o = algorithmParameterSpec;
                    r11 = new iL1ilL1(new C5600L1iLL(OooO00o5.OooO00o(), OooO00o5.m16969OooO00o(), OooO00o5.OooO0O0(), OooO00o5.m16970OooO00o()), secureRandom);
                } else if (algorithmParameterSpec == null && BouncyCastleProvider.CONFIGURATION.OooO00o() == null) {
                    throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
                } else {
                    throw new InvalidAlgorithmParameterException("parameter object not a ECParameterSpec: " + algorithmParameterSpec.getClass().getName());
                }
            }
            this.OooO00o = r3;
            this.f23472OooO00o.OooO00o(r3);
            this.f23476OooO00o = true;
        }
        this.OooO00o = r11;
        this.f23472OooO00o.OooO00o(r11);
        this.f23476OooO00o = true;
    }
}
