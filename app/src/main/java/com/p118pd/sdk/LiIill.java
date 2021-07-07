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
import org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey;
import org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey;

/* renamed from: com.pd.sdk.LiIill */
public class LiIill extends KeyFactorySpi implements AbstractC5416IilI {
    public static final String OooO00o = "1.3.6.1.4.1.8301.3.1.3.4.2";

    public Key OooO00o(Key key) throws InvalidKeyException {
        if ((key instanceof BCMcElieceCCA2PrivateKey) || (key instanceof BCMcElieceCCA2PublicKey)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type.");
    }

    @Override // com.p118pd.sdk.AbstractC5416IilI
    public PrivateKey OooO00o(C5464IlilIi r10) throws IOException {
        C6297il1l OooO00o2 = C6297il1l.OooO00o(r10.m15708OooO0O0().OooO0O0());
        return new BCMcElieceCCA2PrivateKey(new C9844iLi(OooO00o2.OooO0OO(), OooO00o2.OooO0O0(), OooO00o2.m17324OooO00o(), OooO00o2.OooO00o(), OooO00o2.m17325OooO00o(), null));
    }

    @Override // com.p118pd.sdk.AbstractC5416IilI
    public PublicKey OooO00o(C6888ll r6) throws IOException {
        C6303ilIil OooO00o2 = C6303ilIil.OooO00o(r6.OooO0o0());
        return new BCMcElieceCCA2PublicKey(new C93221(OooO00o2.OooO0O0(), OooO00o2.OooO0OO(), OooO00o2.m17337OooO00o(), C6254iiL.OooO00o(OooO00o2.OooO00o()).OooO00o()));
    }

    public KeySpec OooO00o(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof BCMcElieceCCA2PrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else if (!(key instanceof BCMcElieceCCA2PublicKey)) {
            throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + C9058ooOoOoOO.OooOO0);
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + C9058ooOoOoOO.OooOO0);
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                C5464IlilIi OooO00o2 = C5464IlilIi.OooO00o(AbstractC6122iIlLiL.OooO00o(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (L1iiiiI.OooOOO.equals(OooO00o2.m15707OooO0O0().OooO00o())) {
                        C6297il1l OooO00o3 = C6297il1l.OooO00o(OooO00o2.m15708OooO0O0());
                        return new BCMcElieceCCA2PrivateKey(new C9844iLi(OooO00o3.OooO0OO(), OooO00o3.OooO0O0(), OooO00o3.m17324OooO00o(), OooO00o3.OooO00o(), OooO00o3.m17325OooO00o(), C6254iiL.OooO00o(OooO00o3.m17326OooO00o()).OooO00o()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                } catch (IOException unused) {
                    throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
                }
            } catch (IOException e) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: " + e);
            }
        } else {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + C9058ooOoOoOO.OooOO0);
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                C6888ll OooO00o2 = C6888ll.OooO00o(AbstractC6122iIlLiL.OooO00o(((X509EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (L1iiiiI.OooOOO.equals(OooO00o2.m18041OooO00o().OooO00o())) {
                        C6303ilIil OooO00o3 = C6303ilIil.OooO00o(OooO00o2.OooO0o0());
                        return new BCMcElieceCCA2PublicKey(new C93221(OooO00o3.OooO0O0(), OooO00o3.OooO0OO(), OooO00o3.m17337OooO00o(), C6254iiL.OooO00o(OooO00o3.OooO00o()).OooO00o()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                } catch (IOException e) {
                    throw new InvalidKeySpecException("Unable to decode X509EncodedKeySpec: " + e.getMessage());
                }
            } catch (IOException e2) {
                throw new InvalidKeySpecException(e2.toString());
            }
        } else {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + C9058ooOoOoOO.OooOO0);
        }
    }

    @Override // java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        return null;
    }
}
