package com.p118pd.sdk;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.openssl.PEMException;

/* renamed from: com.pd.sdk.L丨L丨l丨  reason: invalid class name and case insensitive filesystem */
public class C5859LLl {
    public static final Map OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ii1I11l f16822OooO00o = new ILLli();

    static {
        HashMap hashMap = new HashMap();
        OooO00o = hashMap;
        hashMap.put(AbstractC5420Il1iIL.o00O0o0o, "ECDSA");
        OooO00o.put(AbstractC5711LiLli.OooOoO0, C7491o0OoOOO.OooO00o);
        OooO00o.put(AbstractC5420Il1iIL.o00OOooo, "DSA");
    }

    private KeyFactory OooO00o(C6456l1ilL r3) throws NoSuchAlgorithmException, NoSuchProviderException {
        LlLI1 OooO00o2 = r3.OooO00o();
        String str = (String) OooO00o.get(OooO00o2);
        if (str == null) {
            str = OooO00o2.m16387OooO0O0();
        }
        try {
            return this.f16822OooO00o.m17218OooO00o(str);
        } catch (NoSuchAlgorithmException e) {
            if (str.equals("ECDSA")) {
                return this.f16822OooO00o.m17218OooO00o("EC");
            }
            throw e;
        }
    }

    public C5859LLl OooO00o(String str) {
        this.f16822OooO00o = new C9588iIi(str);
        return this;
    }

    public C5859LLl OooO00o(Provider provider) {
        this.f16822OooO00o = new LLIlii(provider);
        return this;
    }

    public KeyPair OooO00o(C6626lL11 r5) throws PEMException {
        try {
            KeyFactory OooO00o2 = OooO00o(r5.OooO00o().m15707OooO0O0());
            return new KeyPair(OooO00o2.generatePublic(new X509EncodedKeySpec(r5.m17714OooO00o().getEncoded())), OooO00o2.generatePrivate(new PKCS8EncodedKeySpec(r5.OooO00o().getEncoded())));
        } catch (Exception e) {
            throw new PEMException("unable to convert key pair: " + e.getMessage(), e);
        }
    }

    public PrivateKey OooO00o(C5464IlilIi r4) throws PEMException {
        try {
            return OooO00o(r4.m15707OooO0O0()).generatePrivate(new PKCS8EncodedKeySpec(r4.getEncoded()));
        } catch (Exception e) {
            throw new PEMException("unable to convert key pair: " + e.getMessage(), e);
        }
    }

    public PublicKey OooO00o(C6888ll r4) throws PEMException {
        try {
            return OooO00o(r4.m18041OooO00o()).generatePublic(new X509EncodedKeySpec(r4.getEncoded()));
        } catch (Exception e) {
            throw new PEMException("unable to convert key pair: " + e.getMessage(), e);
        }
    }
}
