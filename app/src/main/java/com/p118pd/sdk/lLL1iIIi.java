package com.p118pd.sdk;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.p291ec.BCECPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.p291ec.BCECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.lLL1iIIi */
public class lLL1iIIi extends AbstractC6446l1IlIlI implements AbstractC5416IilI {
    public AbstractC9477LILlL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f18499OooO00o;

    /* renamed from: com.pd.sdk.lLL1iIIi$OooO00o */
    public static class OooO00o extends lLL1iIIi {
        public OooO00o() {
            super("EC", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* renamed from: com.pd.sdk.lLL1iIIi$OooO0O0 */
    public static class OooO0O0 extends lLL1iIIi {
        public OooO0O0() {
            super("ECDH", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* renamed from: com.pd.sdk.lLL1iIIi$OooO0OO */
    public static class OooO0OO extends lLL1iIIi {
        public OooO0OO() {
            super("ECDHC", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* renamed from: com.pd.sdk.lLL1iIIi$OooO0Oo  reason: case insensitive filesystem */
    public static class C6580OooO0Oo extends lLL1iIIi {
        public C6580OooO0Oo() {
            super("ECDSA", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* renamed from: com.pd.sdk.lLL1iIIi$OooO0o */
    public static class OooO0o extends lLL1iIIi {
        public OooO0o() {
            super("ECGOST3410-2012", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* renamed from: com.pd.sdk.lLL1iIIi$OooO0o0  reason: case insensitive filesystem */
    public static class C6581OooO0o0 extends lLL1iIIi {
        public C6581OooO0o0() {
            super("ECGOST3410", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* renamed from: com.pd.sdk.lLL1iIIi$OooO0oO  reason: case insensitive filesystem */
    public static class C6582OooO0oO extends lLL1iIIi {
        public C6582OooO0oO() {
            super("ECMQV", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public lLL1iIIi(String str, AbstractC9477LILlL r2) {
        this.f18499OooO00o = str;
        this.OooO00o = r2;
    }

    @Override // com.p118pd.sdk.AbstractC5416IilI
    public PrivateKey OooO00o(C5464IlilIi r4) throws IOException {
        LlLI1 OooO00o2 = r4.m15707OooO0O0().OooO00o();
        if (OooO00o2.equals(AbstractC5420Il1iIL.o00O0o0o)) {
            return new BCECPrivateKey(this.f18499OooO00o, r4, this.OooO00o);
        }
        throw new IOException("algorithm identifier " + OooO00o2 + " in key not recognised");
    }

    @Override // com.p118pd.sdk.AbstractC5416IilI
    public PublicKey OooO00o(C6888ll r4) throws IOException {
        LlLI1 OooO00o2 = r4.m18041OooO00o().OooO00o();
        if (OooO00o2.equals(AbstractC5420Il1iIL.o00O0o0o)) {
            return new BCECPublicKey(this.f18499OooO00o, r4, this.OooO00o);
        }
        throw new IOException("algorithm identifier " + OooO00o2 + " in key not recognised");
    }

    @Override // java.security.KeyFactorySpi, com.p118pd.sdk.AbstractC6446l1IlIlI
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof IL1IIl ? new BCECPrivateKey(this.f18499OooO00o, (IL1IIl) keySpec, this.OooO00o) : keySpec instanceof ECPrivateKeySpec ? new BCECPrivateKey(this.f18499OooO00o, (ECPrivateKeySpec) keySpec, this.OooO00o) : super.engineGeneratePrivate(keySpec);
    }

    @Override // java.security.KeyFactorySpi, com.p118pd.sdk.AbstractC6446l1IlIlI
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        try {
            return keySpec instanceof C5769Ll1 ? new BCECPublicKey(this.f18499OooO00o, (C5769Ll1) keySpec, this.OooO00o) : keySpec instanceof ECPublicKeySpec ? new BCECPublicKey(this.f18499OooO00o, (ECPublicKeySpec) keySpec, this.OooO00o) : super.engineGeneratePublic(keySpec);
        } catch (Exception e) {
            throw new InvalidKeySpecException("invalid KeySpec: " + e.getMessage(), e);
        }
    }

    @Override // java.security.KeyFactorySpi, com.p118pd.sdk.AbstractC6446l1IlIlI
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(ECPublicKeySpec.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey = (ECPublicKey) key;
            if (eCPublicKey.getParams() != null) {
                return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            C6106iIiIl OooO00o2 = BouncyCastleProvider.CONFIGURATION.OooO00o();
            return new ECPublicKeySpec(eCPublicKey.getW(), C6631lLlI.OooO00o(C6631lLlI.OooO00o(OooO00o2.OooO00o(), OooO00o2.m16971OooO00o()), OooO00o2));
        } else if (cls.isAssignableFrom(ECPrivateKeySpec.class) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) key;
            if (eCPrivateKey.getParams() != null) {
                return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            C6106iIiIl OooO00o3 = BouncyCastleProvider.CONFIGURATION.OooO00o();
            return new ECPrivateKeySpec(eCPrivateKey.getS(), C6631lLlI.OooO00o(C6631lLlI.OooO00o(OooO00o3.OooO00o(), OooO00o3.m16971OooO00o()), OooO00o3));
        } else if (cls.isAssignableFrom(C5769Ll1.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey2 = (ECPublicKey) key;
            if (eCPublicKey2.getParams() != null) {
                return new C5769Ll1(C6631lLlI.OooO00o(eCPublicKey2.getParams(), eCPublicKey2.getW(), false), C6631lLlI.OooO00o(eCPublicKey2.getParams(), false));
            }
            return new C5769Ll1(C6631lLlI.OooO00o(eCPublicKey2.getParams(), eCPublicKey2.getW(), false), BouncyCastleProvider.CONFIGURATION.OooO00o());
        } else if (!cls.isAssignableFrom(IL1IIl.class) || !(key instanceof ECPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            ECPrivateKey eCPrivateKey2 = (ECPrivateKey) key;
            if (eCPrivateKey2.getParams() != null) {
                return new IL1IIl(eCPrivateKey2.getS(), C6631lLlI.OooO00o(eCPrivateKey2.getParams(), false));
            }
            return new IL1IIl(eCPrivateKey2.getS(), BouncyCastleProvider.CONFIGURATION.OooO00o());
        }
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof ECPublicKey) {
            return new BCECPublicKey((ECPublicKey) key, this.OooO00o);
        }
        if (key instanceof ECPrivateKey) {
            return new BCECPrivateKey((ECPrivateKey) key, this.OooO00o);
        }
        throw new InvalidKeyException("key type unknown");
    }
}
