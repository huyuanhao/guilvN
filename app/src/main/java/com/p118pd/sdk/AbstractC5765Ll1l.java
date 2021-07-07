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
import java.util.Hashtable;
import org.bouncycastle.jcajce.provider.asymmetric.p291ec.BCECPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.p291ec.BCECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.Ll1l  reason: case insensitive filesystem */
public abstract class AbstractC5765Ll1l extends KeyPairGenerator {

    /* renamed from: com.pd.sdk.Ll1l$OooO00o */
    public static class OooO00o extends AbstractC5765Ll1l {
        public static Hashtable OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f16672OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public iL1ilL1 f16673OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public LI111l f16674OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC9477LILlL f16675OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Object f16676OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f16677OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public SecureRandom f16678OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f16679OooO00o;

        static {
            Hashtable hashtable = new Hashtable();
            OooO00o = hashtable;
            hashtable.put(I11I.OooO00o(192), new ECGenParameterSpec("prime192v1"));
            OooO00o.put(I11I.OooO00o(239), new ECGenParameterSpec("prime239v1"));
            OooO00o.put(I11I.OooO00o(256), new ECGenParameterSpec("prime256v1"));
            OooO00o.put(I11I.OooO00o(C7967oO0oOo00.Ooooo0o), new ECGenParameterSpec("P-224"));
            OooO00o.put(I11I.OooO00o(384), new ECGenParameterSpec("P-384"));
            OooO00o.put(I11I.OooO00o(521), new ECGenParameterSpec("P-521"));
        }

        public OooO00o() {
            super("EC");
            this.f16674OooO00o = new LI111l();
            this.f16676OooO00o = null;
            this.f16672OooO00o = 239;
            this.f16678OooO00o = IIllii.OooO00o();
            this.f16679OooO00o = false;
            this.f16677OooO00o = "EC";
            this.f16675OooO00o = BouncyCastleProvider.CONFIGURATION;
        }

        public OooO00o(String str, AbstractC9477LILlL r3) {
            super(str);
            this.f16674OooO00o = new LI111l();
            this.f16676OooO00o = null;
            this.f16672OooO00o = 239;
            this.f16678OooO00o = IIllii.OooO00o();
            this.f16679OooO00o = false;
            this.f16677OooO00o = str;
            this.f16675OooO00o = r3;
        }

        public L1L1l OooO00o(String str) throws InvalidAlgorithmParameterException {
            C9387Iill OooO00o2 = ILIIIlI.OooO00o(str);
            if (OooO00o2 == null) {
                try {
                    OooO00o2 = C9857liL1l.OooO00o(new LlLI1(str));
                    if (OooO00o2 == null) {
                        OooO00o2 = (C9387Iill) this.f16675OooO00o.m21532OooO00o().get(new LlLI1(str));
                        if (OooO00o2 == null) {
                            throw new InvalidAlgorithmParameterException("unknown curve OID: " + str);
                        }
                    }
                } catch (IllegalArgumentException unused) {
                    throw new InvalidAlgorithmParameterException("unknown curve name: " + str);
                }
            }
            return new L1L1l(str, OooO00o2.OooO00o(), OooO00o2.m21457OooO00o(), OooO00o2.m21460OooO0O0(), OooO00o2.m21458OooO00o(), null);
        }

        public iL1ilL1 OooO00o(C6106iIiIl iiiil, SecureRandom secureRandom) {
            return new iL1ilL1(new C5600L1iLL(iiiil.OooO00o(), iiiil.m16969OooO00o(), iiiil.OooO0O0(), iiiil.m16970OooO00o()), secureRandom);
        }

        public iL1ilL1 OooO00o(ECParameterSpec eCParameterSpec, SecureRandom secureRandom) {
            IIiLIli OooO00o2 = C6631lLlI.OooO00o(eCParameterSpec.getCurve());
            return new iL1ilL1(new C5600L1iLL(OooO00o2, C6631lLlI.OooO00o(OooO00o2, eCParameterSpec.getGenerator(), false), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor())), secureRandom);
        }

        public void OooO00o(String str, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            L1L1l OooO00o2 = OooO00o(str);
            this.f16676OooO00o = OooO00o2;
            this.f16673OooO00o = OooO00o(OooO00o2, secureRandom);
        }

        public KeyPair generateKeyPair() {
            if (!this.f16679OooO00o) {
                initialize(this.f16672OooO00o, new SecureRandom());
            }
            i1LLl1L OooO00o2 = this.f16674OooO00o.OooO00o();
            LL1ii1l r1 = (LL1ii1l) OooO00o2.OooO0O0();
            C6512lIilLl r4 = (C6512lIilLl) OooO00o2.OooO00o();
            Object obj = this.f16676OooO00o;
            if (obj instanceof C6106iIiIl) {
                C6106iIiIl iiiil = (C6106iIiIl) obj;
                BCECPublicKey bCECPublicKey = new BCECPublicKey(this.f16677OooO00o, r1, iiiil, this.f16675OooO00o);
                return new KeyPair(bCECPublicKey, new BCECPrivateKey(this.f16677OooO00o, r4, bCECPublicKey, iiiil, this.f16675OooO00o));
            } else if (obj == null) {
                return new KeyPair(new BCECPublicKey(this.f16677OooO00o, r1, this.f16675OooO00o), new BCECPrivateKey(this.f16677OooO00o, r4, this.f16675OooO00o));
            } else {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                BCECPublicKey bCECPublicKey2 = new BCECPublicKey(this.f16677OooO00o, r1, eCParameterSpec, this.f16675OooO00o);
                return new KeyPair(bCECPublicKey2, new BCECPrivateKey(this.f16677OooO00o, r4, bCECPublicKey2, eCParameterSpec, this.f16675OooO00o));
            }
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(int i, SecureRandom secureRandom) {
            this.f16672OooO00o = i;
            this.f16678OooO00o = secureRandom;
            ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) OooO00o.get(I11I.OooO00o(i));
            if (eCGenParameterSpec != null) {
                try {
                    initialize(eCGenParameterSpec, secureRandom);
                } catch (InvalidAlgorithmParameterException unused) {
                    throw new InvalidParameterException("key size not configurable.");
                }
            } else {
                throw new InvalidParameterException("unknown key size.");
            }
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            iL1ilL1 r2;
            C6106iIiIl iiiil;
            String OooO00o2;
            if (algorithmParameterSpec == null) {
                iiiil = this.f16675OooO00o.OooO00o();
                if (iiiil != null) {
                    this.f16676OooO00o = null;
                } else {
                    throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
                }
            } else if (algorithmParameterSpec instanceof C6106iIiIl) {
                this.f16676OooO00o = algorithmParameterSpec;
                iiiil = (C6106iIiIl) algorithmParameterSpec;
            } else if (algorithmParameterSpec instanceof ECParameterSpec) {
                this.f16676OooO00o = algorithmParameterSpec;
                r2 = OooO00o((ECParameterSpec) algorithmParameterSpec, secureRandom);
                this.f16673OooO00o = r2;
                this.f16674OooO00o.OooO00o(this.f16673OooO00o);
                this.f16679OooO00o = true;
            } else {
                if (algorithmParameterSpec instanceof ECGenParameterSpec) {
                    OooO00o2 = ((ECGenParameterSpec) algorithmParameterSpec).getName();
                } else if (algorithmParameterSpec instanceof C5381Iil1) {
                    OooO00o2 = ((C5381Iil1) algorithmParameterSpec).OooO00o();
                } else {
                    throw new InvalidAlgorithmParameterException("parameter object not a ECParameterSpec");
                }
                OooO00o(OooO00o2, secureRandom);
                this.f16674OooO00o.OooO00o(this.f16673OooO00o);
                this.f16679OooO00o = true;
            }
            r2 = OooO00o(iiiil, secureRandom);
            this.f16673OooO00o = r2;
            this.f16674OooO00o.OooO00o(this.f16673OooO00o);
            this.f16679OooO00o = true;
        }
    }

    /* renamed from: com.pd.sdk.Ll1l$OooO0O0 */
    public static class OooO0O0 extends OooO00o {
        public OooO0O0() {
            super("ECDH", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* renamed from: com.pd.sdk.Ll1l$OooO0OO */
    public static class OooO0OO extends OooO00o {
        public OooO0OO() {
            super("ECDHC", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* renamed from: com.pd.sdk.Ll1l$OooO0Oo  reason: case insensitive filesystem */
    public static class C5766OooO0Oo extends OooO00o {
        public C5766OooO0Oo() {
            super("ECDSA", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* renamed from: com.pd.sdk.Ll1l$OooO0o0  reason: case insensitive filesystem */
    public static class C5767OooO0o0 extends OooO00o {
        public C5767OooO0o0() {
            super("ECMQV", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public AbstractC5765Ll1l(String str) {
        super(str);
    }
}
