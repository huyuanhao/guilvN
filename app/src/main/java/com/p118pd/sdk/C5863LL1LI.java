package com.p118pd.sdk;

import java.io.IOException;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.bouncycastle.cert.crmf.CRMFException;

/* renamed from: com.pd.sdk.L丨L丨丨1LI  reason: invalid class name and case insensitive filesystem */
public class C5863LL1LI {
    public static final Map OooO00o = new HashMap();
    public static final Map OooO0O0 = new HashMap();
    public static final Map OooO0OO = new HashMap();
    public static final Map OooO0Oo = new HashMap();
    public static final Map OooO0o0 = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public ii1I11l f16823OooO00o;

    /* renamed from: com.pd.sdk.L丨L丨丨1LI$OooO00o */
    public class OooO00o implements OooO0O0 {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6456l1ilL f16824OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Key f16825OooO00o;

        public OooO00o(C6456l1ilL r2, Key key) {
            this.f16824OooO00o = r2;
            this.f16825OooO00o = key;
        }

        @Override // com.p118pd.sdk.C5863LL1LI.OooO0O0
        public Object OooO00o() throws CRMFException, InvalidAlgorithmParameterException, InvalidKeyException, InvalidParameterSpecException, NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException {
            Cipher OooO00o2 = C5863LL1LI.this.m16442OooO00o(this.f16824OooO00o.OooO00o());
            AbstractC6122iIlLiL iillil = (AbstractC6122iIlLiL) this.f16824OooO00o.m17587OooO0O0();
            LlLI1 OooO00o3 = this.f16824OooO00o.OooO00o();
            if (iillil != null && !(iillil instanceof AbstractC5335ILl)) {
                try {
                    AlgorithmParameters OooO00o4 = C5863LL1LI.this.m16439OooO00o(this.f16824OooO00o.OooO00o());
                    try {
                        C6037i1iLi.OooO00o(OooO00o4, iillil);
                        OooO00o2.init(2, this.f16825OooO00o, OooO00o4);
                    } catch (IOException e) {
                        throw new CRMFException("error decoding algorithm parameters.", e);
                    }
                } catch (NoSuchAlgorithmException e2) {
                    if (OooO00o3.equals(L1lI1i.OooO0O0) || OooO00o3.equals(L1lI1i.OooO0Oo) || OooO00o3.equals(L1lI1i.OooO0o) || OooO00o3.equals(L1lI1i.OooO0oO) || OooO00o3.equals(L1lI1i.OooO0oo)) {
                        OooO00o2.init(2, this.f16825OooO00o, new IvParameterSpec(AbstractC6804llL1ii.OooO00o((Object) iillil).m17938OooO00o()));
                    } else {
                        throw e2;
                    }
                }
            } else if (OooO00o3.equals(L1lI1i.OooO0O0) || OooO00o3.equals(L1lI1i.OooO0Oo) || OooO00o3.equals(L1lI1i.OooO0o0)) {
                OooO00o2.init(2, this.f16825OooO00o, new IvParameterSpec(new byte[8]));
            } else {
                OooO00o2.init(2, this.f16825OooO00o);
            }
            return OooO00o2;
        }
    }

    /* renamed from: com.pd.sdk.L丨L丨丨1LI$OooO0O0 */
    public interface OooO0O0 {
        Object OooO00o() throws CRMFException, InvalidAlgorithmParameterException, InvalidKeyException, InvalidParameterSpecException, NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException;
    }

    static {
        OooO00o.put(AbstractC5711LiLli.OoooOoo, "DESEDE");
        OooO00o.put(AbstractC5905LllI.OooOo0, "AES");
        OooO00o.put(AbstractC5905LllI.OooOoo, "AES");
        OooO00o.put(AbstractC5905LllI.Oooo0OO, "AES");
        OooO0O0.put(L1lI1i.OooO0O0, "DESEDE/CBC/PKCS5Padding");
        OooO0O0.put(L1lI1i.OooO0o, "AES/CBC/PKCS5Padding");
        OooO0O0.put(L1lI1i.OooO0oO, "AES/CBC/PKCS5Padding");
        OooO0O0.put(L1lI1i.OooO0oo, "AES/CBC/PKCS5Padding");
        OooO0O0.put(new LlLI1(AbstractC5711LiLli.OooOoO0.m16387OooO0O0()), "RSA/ECB/PKCS1Padding");
        OooO0OO.put(AbstractC9733l.OooO, "SHA1");
        OooO0OO.put(AbstractC5905LllI.OooO0o, "SHA224");
        OooO0OO.put(AbstractC5905LllI.OooO0OO, "SHA256");
        OooO0OO.put(AbstractC5905LllI.OooO0Oo, "SHA384");
        OooO0OO.put(AbstractC5905LllI.OooO0o0, "SHA512");
        OooO0o0.put(AbstractC5604L1ll.OooOOOO, "HMACSHA1");
        OooO0o0.put(AbstractC5711LiLli.Oooooo, "HMACSHA1");
        OooO0o0.put(AbstractC5711LiLli.OoooooO, "HMACSHA224");
        OooO0o0.put(AbstractC5711LiLli.Ooooooo, "HMACSHA256");
        OooO0o0.put(AbstractC5711LiLli.o0OoOo0, "HMACSHA384");
        OooO0o0.put(AbstractC5711LiLli.ooOO, "HMACSHA512");
        OooO0Oo.put(AbstractC5711LiLli.OooOoO0, C7491o0OoOOO.OooO00o);
        OooO0Oo.put(AbstractC5420Il1iIL.o00OOooo, "DSA");
    }

    public C5863LL1LI(ii1I11l ii1i11l) {
        this.f16823OooO00o = ii1i11l;
    }

    public static Object OooO00o(OooO0O0 oooO0O0) throws CRMFException {
        try {
            return oooO0O0.OooO00o();
        } catch (NoSuchAlgorithmException e) {
            throw new CRMFException("can't find algorithm.", e);
        } catch (InvalidKeyException e2) {
            throw new CRMFException("key invalid in message.", e2);
        } catch (NoSuchProviderException e3) {
            throw new CRMFException("can't find provider.", e3);
        } catch (NoSuchPaddingException e4) {
            throw new CRMFException("required padding not supported.", e4);
        } catch (InvalidAlgorithmParameterException e5) {
            throw new CRMFException("algorithm parameters invalid.", e5);
        } catch (InvalidParameterSpecException e6) {
            throw new CRMFException("MAC algorithm parameter spec invalid.", e6);
        }
    }

    public C6456l1ilL OooO00o(LlLI1 llLI1, AlgorithmParameters algorithmParameters) throws CRMFException {
        AbstractC6854lLi1LL r4;
        if (algorithmParameters != null) {
            try {
                r4 = C6037i1iLi.OooO00o(algorithmParameters);
            } catch (IOException e) {
                throw new CRMFException("cannot encode parameters: " + e.getMessage(), e);
            }
        } else {
            r4 = C6452l1Lll.OooO00o;
        }
        return new C6456l1ilL(llLI1, r4);
    }

    public AlgorithmParameterGenerator OooO00o(LlLI1 llLI1) throws GeneralSecurityException {
        String str = (String) OooO00o.get(llLI1);
        if (str != null) {
            try {
                return this.f16823OooO00o.OooO00o(str);
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return this.f16823OooO00o.OooO00o(llLI1.m16387OooO0O0());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AlgorithmParameters m16439OooO00o(LlLI1 llLI1) throws NoSuchAlgorithmException, NoSuchProviderException {
        String str = (String) OooO00o.get(llLI1);
        if (str != null) {
            try {
                return this.f16823OooO00o.m17217OooO00o(str);
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return this.f16823OooO00o.m17217OooO00o(llLI1.m16387OooO0O0());
    }

    public AlgorithmParameters OooO00o(LlLI1 llLI1, SecretKey secretKey, SecureRandom secureRandom) throws CRMFException {
        try {
            AlgorithmParameterGenerator OooO00o2 = OooO00o(llLI1);
            if (llLI1.equals(L1lI1i.OooO0OO)) {
                byte[] bArr = new byte[8];
                secureRandom.nextBytes(bArr);
                try {
                    OooO00o2.init(new RC2ParameterSpec(secretKey.getEncoded().length * 8, bArr), secureRandom);
                } catch (InvalidAlgorithmParameterException e) {
                    throw new CRMFException("parameters generation error: " + e, e);
                }
            }
            return OooO00o2.generateParameters();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        } catch (GeneralSecurityException e2) {
            throw new CRMFException("exception creating algorithm parameter generator: " + e2, e2);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public KeyFactory m16440OooO00o(LlLI1 llLI1) throws CRMFException {
        try {
            String str = (String) OooO0Oo.get(llLI1);
            if (str != null) {
                try {
                    return this.f16823OooO00o.m17218OooO00o(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.f16823OooO00o.m17218OooO00o(llLI1.m16387OooO0O0());
        } catch (GeneralSecurityException e) {
            throw new CRMFException("cannot create cipher: " + e.getMessage(), e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public MessageDigest m16441OooO00o(LlLI1 llLI1) throws CRMFException {
        try {
            String str = (String) OooO0OO.get(llLI1);
            if (str != null) {
                try {
                    return this.f16823OooO00o.m17220OooO00o(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.f16823OooO00o.m17220OooO00o(llLI1.m16387OooO0O0());
        } catch (GeneralSecurityException e) {
            throw new CRMFException("cannot create cipher: " + e.getMessage(), e);
        }
    }

    public PublicKey OooO00o(C6888ll r4) throws CRMFException {
        try {
            return m16440OooO00o(r4.m18041OooO00o().OooO00o()).generatePublic(new X509EncodedKeySpec(r4.getEncoded()));
        } catch (Exception e) {
            throw new CRMFException("invalid key: " + e.getMessage(), e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Cipher m16442OooO00o(LlLI1 llLI1) throws CRMFException {
        try {
            String str = (String) OooO0O0.get(llLI1);
            if (str != null) {
                try {
                    return this.f16823OooO00o.m17224OooO00o(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.f16823OooO00o.m17224OooO00o(llLI1.m16387OooO0O0());
        } catch (GeneralSecurityException e) {
            throw new CRMFException("cannot create cipher: " + e.getMessage(), e);
        }
    }

    public Cipher OooO00o(Key key, C6456l1ilL r3) throws CRMFException {
        return (Cipher) OooO00o(new OooO00o(r3, key));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public KeyGenerator m16443OooO00o(LlLI1 llLI1) throws CRMFException {
        try {
            String str = (String) OooO00o.get(llLI1);
            if (str != null) {
                try {
                    return this.f16823OooO00o.m17226OooO00o(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.f16823OooO00o.m17226OooO00o(llLI1.m16387OooO0O0());
        } catch (GeneralSecurityException e) {
            throw new CRMFException("cannot create key generator: " + e.getMessage(), e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Mac m16444OooO00o(LlLI1 llLI1) throws CRMFException {
        try {
            String str = (String) OooO0o0.get(llLI1);
            if (str != null) {
                try {
                    return this.f16823OooO00o.m17227OooO00o(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.f16823OooO00o.m17227OooO00o(llLI1.m16387OooO0O0());
        } catch (GeneralSecurityException e) {
            throw new CRMFException("cannot create mac: " + e.getMessage(), e);
        }
    }
}
