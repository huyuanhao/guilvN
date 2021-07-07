package org.bouncycastle.jce;

import com.p118pd.sdk.AbstractC5331ILi;
import com.p118pd.sdk.AbstractC5420Il1iIL;
import com.p118pd.sdk.AbstractC6122iIlLiL;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6620lLlliL;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.C9387Iill;
import com.p118pd.sdk.IlllII1;
import com.p118pd.sdk.LlLI1;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class ECKeyUtil {

    public static class UnexpectedException extends RuntimeException {
        public Throwable cause;

        public UnexpectedException(Throwable th) {
            super(th.toString());
            this.cause = th;
        }

        public Throwable getCause() {
            return this.cause;
        }
    }

    public static PrivateKey OooO00o(PrivateKey privateKey, String str) throws IllegalArgumentException, NoSuchAlgorithmException, NoSuchProviderException {
        Provider provider = Security.getProvider(str);
        if (provider != null) {
            return OooO00o(privateKey, provider);
        }
        throw new NoSuchProviderException("cannot find provider: " + str);
    }

    public static PrivateKey OooO00o(PrivateKey privateKey, Provider provider) throws IllegalArgumentException, NoSuchAlgorithmException {
        C9387Iill r2;
        try {
            C5464IlilIi OooO00o = C5464IlilIi.OooO00o(AbstractC6122iIlLiL.OooO00o(privateKey.getEncoded()));
            if (!OooO00o.m15706OooO00o().OooO00o().equals(AbstractC5331ILi.OooOOO0)) {
                C6620lLlliL OooO00o2 = C6620lLlliL.OooO00o(OooO00o.m15706OooO00o().m17587OooO0O0());
                if (OooO00o2.m17705OooO0O0()) {
                    C9387Iill OooO00o3 = IlllII1.OooO00o(LlLI1.OooO00o((Object) OooO00o2.OooO0Oo()));
                    r2 = new C9387Iill(OooO00o3.OooO00o(), OooO00o3.m21457OooO00o(), OooO00o3.m21460OooO0O0(), OooO00o3.m21458OooO00o());
                } else if (!OooO00o2.OooO00o()) {
                    return privateKey;
                } else {
                    r2 = new C9387Iill(BouncyCastleProvider.CONFIGURATION.OooO00o().OooO00o(), BouncyCastleProvider.CONFIGURATION.OooO00o().m16969OooO00o(), BouncyCastleProvider.CONFIGURATION.OooO00o().OooO0O0(), BouncyCastleProvider.CONFIGURATION.OooO00o().m16970OooO00o());
                }
                return KeyFactory.getInstance(privateKey.getAlgorithm(), provider).generatePrivate(new PKCS8EncodedKeySpec(new C5464IlilIi(new C6456l1ilL(AbstractC5420Il1iIL.o00O0o0o, new C6620lLlliL(r2)), OooO00o.m15708OooO0O0()).getEncoded()));
            }
            throw new UnsupportedEncodingException("cannot convert GOST key to explicit parameters.");
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (NoSuchAlgorithmException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new UnexpectedException(e3);
        }
    }

    public static PublicKey OooO00o(PublicKey publicKey, String str) throws IllegalArgumentException, NoSuchAlgorithmException, NoSuchProviderException {
        Provider provider = Security.getProvider(str);
        if (provider != null) {
            return OooO00o(publicKey, provider);
        }
        throw new NoSuchProviderException("cannot find provider: " + str);
    }

    public static PublicKey OooO00o(PublicKey publicKey, Provider provider) throws IllegalArgumentException, NoSuchAlgorithmException {
        C9387Iill r2;
        try {
            C6888ll OooO00o = C6888ll.OooO00o(AbstractC6122iIlLiL.OooO00o(publicKey.getEncoded()));
            if (!OooO00o.m18042OooO0O0().OooO00o().equals(AbstractC5331ILi.OooOOO0)) {
                C6620lLlliL OooO00o2 = C6620lLlliL.OooO00o(OooO00o.m18042OooO0O0().m17587OooO0O0());
                if (OooO00o2.m17705OooO0O0()) {
                    C9387Iill OooO00o3 = IlllII1.OooO00o(LlLI1.OooO00o((Object) OooO00o2.OooO0Oo()));
                    r2 = new C9387Iill(OooO00o3.OooO00o(), OooO00o3.m21457OooO00o(), OooO00o3.m21460OooO0O0(), OooO00o3.m21458OooO00o());
                } else if (!OooO00o2.OooO00o()) {
                    return publicKey;
                } else {
                    r2 = new C9387Iill(BouncyCastleProvider.CONFIGURATION.OooO00o().OooO00o(), BouncyCastleProvider.CONFIGURATION.OooO00o().m16969OooO00o(), BouncyCastleProvider.CONFIGURATION.OooO00o().OooO0O0(), BouncyCastleProvider.CONFIGURATION.OooO00o().m16970OooO00o());
                }
                return KeyFactory.getInstance(publicKey.getAlgorithm(), provider).generatePublic(new X509EncodedKeySpec(new C6888ll(new C6456l1ilL(AbstractC5420Il1iIL.o00O0o0o, new C6620lLlliL(r2)), OooO00o.OooO00o().m15475OooO00o()).getEncoded()));
            }
            throw new IllegalArgumentException("cannot convert GOST key to explicit parameters.");
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (NoSuchAlgorithmException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new UnexpectedException(e3);
        }
    }
}
