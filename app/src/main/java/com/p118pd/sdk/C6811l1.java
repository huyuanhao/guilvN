package com.p118pd.sdk;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey;
import org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPublicKey;

/* renamed from: com.pd.sdk.l丨1  reason: invalid class name and case insensitive filesystem */
public class C6811l1 extends KeyFactorySpi implements AbstractC5416IilI {
    @Override // com.p118pd.sdk.AbstractC5416IilI
    public PrivateKey OooO00o(C5464IlilIi r9) throws IOException {
        C6509lIiLIIi OooO00o = C6509lIiLIIi.OooO00o(r9.m15708OooO0O0());
        return new BCRainbowPrivateKey(OooO00o.m17642OooO00o(), OooO00o.m17641OooO00o(), OooO00o.m17644OooO0O0(), OooO00o.m17643OooO0O0(), OooO00o.m17639OooO00o(), OooO00o.m17640OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC5416IilI
    public PublicKey OooO00o(C6888ll r5) throws IOException {
        LlIlI1L OooO00o = LlIlI1L.OooO00o(r5.OooO0o0());
        return new BCRainbowPublicKey(OooO00o.OooO0O0(), OooO00o.m16376OooO00o(), OooO00o.m16378OooO0O0(), OooO00o.m16375OooO00o());
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof C6217iLLLL) {
            return new BCRainbowPrivateKey((C6217iLLLL) keySpec);
        }
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return OooO00o(C5464IlilIi.OooO00o(AbstractC6122iIlLiL.OooO00o(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + C9058ooOoOoOO.OooOO0);
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof L1l1ILI) {
            return new BCRainbowPublicKey((L1l1ILI) keySpec);
        }
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return OooO00o(C6888ll.OooO00o(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException("Unknown key specification: " + keySpec + C9058ooOoOoOO.OooOO0);
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof BCRainbowPrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (C6217iLLLL.class.isAssignableFrom(cls)) {
                BCRainbowPrivateKey bCRainbowPrivateKey = (BCRainbowPrivateKey) key;
                return new C6217iLLLL(bCRainbowPrivateKey.getInvA1(), bCRainbowPrivateKey.getB1(), bCRainbowPrivateKey.getInvA2(), bCRainbowPrivateKey.getB2(), bCRainbowPrivateKey.getVi(), bCRainbowPrivateKey.getLayers());
            }
        } else if (!(key instanceof BCRainbowPublicKey)) {
            throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + C9058ooOoOoOO.OooOO0);
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        } else {
            if (L1l1ILI.class.isAssignableFrom(cls)) {
                BCRainbowPublicKey bCRainbowPublicKey = (BCRainbowPublicKey) key;
                return new L1l1ILI(bCRainbowPublicKey.getDocLength(), bCRainbowPublicKey.getCoeffQuadratic(), bCRainbowPublicKey.getCoeffSingular(), bCRainbowPublicKey.getCoeffScalar());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + C9058ooOoOoOO.OooOO0);
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof BCRainbowPrivateKey) || (key instanceof BCRainbowPublicKey)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
