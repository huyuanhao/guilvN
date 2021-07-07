package org.bouncycastle.operator.jcajce;

import com.facebook.react.modules.netinfo.NetInfoModule;
import com.p118pd.sdk.AbstractC5331ILi;
import com.p118pd.sdk.AbstractC5420Il1iIL;
import com.p118pd.sdk.AbstractC5711LiLli;
import com.p118pd.sdk.AbstractC5905LllI;
import com.p118pd.sdk.AbstractC6854lLi1LL;
import com.p118pd.sdk.AbstractC9468L1lL;
import com.p118pd.sdk.AbstractC9525LlI1;
import com.p118pd.sdk.AbstractC9733l;
import com.p118pd.sdk.C6037i1iLi;
import com.p118pd.sdk.C6452l1Lll;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6692lii;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.I11I;
import com.p118pd.sdk.I11li1;
import com.p118pd.sdk.LIiiILi;
import com.p118pd.sdk.LLiII;
import com.p118pd.sdk.LlLI1;
import com.p118pd.sdk.ii1I11l;
import com.p118pd.sdk.lILIiLL;
import com.p118pd.sdk.lil1Il1;
import com.p118pd.sdk.ll1IL1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.OperatorCreationException;

public class OperatorHelper {
    public static final Map OooO00o = new HashMap();
    public static final Map OooO0O0 = new HashMap();
    public static final Map OooO0OO = new HashMap();
    public static final Map OooO0Oo = new HashMap();
    public static final Map OooO0o0 = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public ii1I11l f23982OooO00o;

    public static class OpCertificateException extends CertificateException {
        public Throwable cause;

        public OpCertificateException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        public Throwable getCause() {
            return this.cause;
        }
    }

    static {
        OooO00o.put(new LlLI1("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        OooO00o.put(AbstractC5711LiLli.Oooo0o0, "SHA224WITHRSA");
        OooO00o.put(AbstractC5711LiLli.Oooo0, "SHA256WITHRSA");
        OooO00o.put(AbstractC5711LiLli.Oooo0O0, "SHA384WITHRSA");
        OooO00o.put(AbstractC5711LiLli.Oooo0OO, "SHA512WITHRSA");
        OooO00o.put(AbstractC5331ILi.OooOOO, "GOST3411WITHGOST3410");
        OooO00o.put(AbstractC5331ILi.OooOOOO, "GOST3411WITHECGOST3410");
        OooO00o.put(LLiII.OooO, "GOST3411-2012-256WITHECGOST3410-2012-256");
        OooO00o.put(LLiII.OooOO0, "GOST3411-2012-512WITHECGOST3410-2012-512");
        OooO00o.put(LIiiILi.OooO0Oo, "SHA1WITHPLAIN-ECDSA");
        OooO00o.put(LIiiILi.OooO0o0, "SHA224WITHPLAIN-ECDSA");
        OooO00o.put(LIiiILi.OooO0o, "SHA256WITHPLAIN-ECDSA");
        OooO00o.put(LIiiILi.OooO0oO, "SHA384WITHPLAIN-ECDSA");
        OooO00o.put(LIiiILi.OooO0oo, "SHA512WITHPLAIN-ECDSA");
        OooO00o.put(LIiiILi.OooO, "RIPEMD160WITHPLAIN-ECDSA");
        OooO00o.put(AbstractC9525LlI1.OooOOoo, "SHA1WITHCVC-ECDSA");
        OooO00o.put(AbstractC9525LlI1.OooOo00, "SHA224WITHCVC-ECDSA");
        OooO00o.put(AbstractC9525LlI1.OooOo0, "SHA256WITHCVC-ECDSA");
        OooO00o.put(AbstractC9525LlI1.OooOo0O, "SHA384WITHCVC-ECDSA");
        OooO00o.put(AbstractC9525LlI1.OooOo0o, "SHA512WITHCVC-ECDSA");
        OooO00o.put(new LlLI1("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        OooO00o.put(new LlLI1("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        OooO00o.put(new LlLI1("1.2.840.10040.4.3"), "SHA1WITHDSA");
        OooO00o.put(AbstractC5420Il1iIL.o00O0o0, "SHA1WITHECDSA");
        OooO00o.put(AbstractC5420Il1iIL.o00O0oO, "SHA224WITHECDSA");
        OooO00o.put(AbstractC5420Il1iIL.o00O0oOO, "SHA256WITHECDSA");
        OooO00o.put(AbstractC5420Il1iIL.o00O0oOo, "SHA384WITHECDSA");
        OooO00o.put(AbstractC5420Il1iIL.o00O0oo0, "SHA512WITHECDSA");
        OooO00o.put(AbstractC9733l.OooOO0O, "SHA1WITHRSA");
        OooO00o.put(AbstractC9733l.OooOO0, "SHA1WITHDSA");
        OooO00o.put(AbstractC5905LllI.OoooO, "SHA224WITHDSA");
        OooO00o.put(AbstractC5905LllI.OoooOO0, "SHA256WITHDSA");
        OooO00o.put(AbstractC9733l.OooO, "SHA1");
        OooO00o.put(AbstractC5905LllI.OooO0o, "SHA224");
        OooO00o.put(AbstractC5905LllI.OooO0OO, "SHA256");
        OooO00o.put(AbstractC5905LllI.OooO0Oo, "SHA384");
        OooO00o.put(AbstractC5905LllI.OooO0o0, "SHA512");
        OooO00o.put(AbstractC9468L1lL.OooO0OO, "RIPEMD128");
        OooO00o.put(AbstractC9468L1lL.OooO0O0, "RIPEMD160");
        OooO00o.put(AbstractC9468L1lL.OooO0Oo, "RIPEMD256");
        OooO0O0.put(AbstractC5711LiLli.OooOoO0, "RSA/ECB/PKCS1Padding");
        OooO0O0.put(AbstractC5331ILi.OooOOO0, "ECGOST3410");
        OooO0OO.put(AbstractC5711LiLli.o000oo00, "DESEDEWrap");
        OooO0OO.put(AbstractC5711LiLli.o000oo0, "RC2Wrap");
        OooO0OO.put(AbstractC5905LllI.OooOo, "AESWrap");
        OooO0OO.put(AbstractC5905LllI.Oooo000, "AESWrap");
        OooO0OO.put(AbstractC5905LllI.Oooo0oO, "AESWrap");
        OooO0OO.put(lILIiLL.OooO0Oo, "CamelliaWrap");
        OooO0OO.put(lILIiLL.OooO0o0, "CamelliaWrap");
        OooO0OO.put(lILIiLL.OooO0o, "CamelliaWrap");
        OooO0OO.put(ll1IL1.OooO0Oo, "SEEDWrap");
        OooO0OO.put(AbstractC5711LiLli.OoooOoo, "DESede");
        OooO0o0.put(AbstractC5711LiLli.o000oo00, I11I.OooO00o(192));
        OooO0o0.put(AbstractC5905LllI.OooOo, I11I.OooO00o(128));
        OooO0o0.put(AbstractC5905LllI.Oooo000, I11I.OooO00o(192));
        OooO0o0.put(AbstractC5905LllI.Oooo0oO, I11I.OooO00o(256));
        OooO0o0.put(lILIiLL.OooO0Oo, I11I.OooO00o(128));
        OooO0o0.put(lILIiLL.OooO0o0, I11I.OooO00o(192));
        OooO0o0.put(lILIiLL.OooO0o, I11I.OooO00o(256));
        OooO0o0.put(ll1IL1.OooO0Oo, I11I.OooO00o(128));
        OooO0o0.put(AbstractC5711LiLli.OoooOoo, I11I.OooO00o(192));
        OooO0Oo.put(AbstractC5905LllI.OooOOoo, "AES");
        OooO0Oo.put(AbstractC5905LllI.OooOo0, "AES");
        OooO0Oo.put(AbstractC5905LllI.OooOoo, "AES");
        OooO0Oo.put(AbstractC5905LllI.Oooo0OO, "AES");
        OooO0Oo.put(AbstractC5711LiLli.OoooOoo, "DESede");
        OooO0Oo.put(AbstractC5711LiLli.Ooooo00, "RC2");
    }

    public OperatorHelper(ii1I11l ii1i11l) {
        this.f23982OooO00o = ii1i11l;
    }

    public static String OooO00o(C6456l1ilL r3) {
        AbstractC6854lLi1LL OooO0O02 = r3.m17587OooO0O0();
        if (OooO0O02 == null || C6452l1Lll.OooO00o.equals(OooO0O02) || !r3.OooO00o().equals(AbstractC5711LiLli.Oooo00o)) {
            return OooO00o.containsKey(r3.OooO00o()) ? (String) OooO00o.get(r3.OooO00o()) : r3.OooO00o().m16387OooO0O0();
        }
        C6692lii OooO00o2 = C6692lii.OooO00o(OooO0O02);
        return OooO0OO(OooO00o2.OooO00o().OooO00o()) + "WITHRSAANDMGF1";
    }

    private boolean OooO00o(I11li1 i11li1) throws GeneralSecurityException {
        if (i11li1 == null || i11li1.size() == 0) {
            return false;
        }
        C6692lii OooO00o2 = C6692lii.OooO00o(i11li1);
        if (!OooO00o2.m17777OooO0O0().OooO00o().equals(AbstractC5711LiLli.Oooo000) || !OooO00o2.OooO00o().equals(C6456l1ilL.OooO00o(OooO00o2.m17777OooO0O0().m17587OooO0O0()))) {
            return true;
        }
        return OooO00o2.m17776OooO00o().intValue() != m22979OooO00o(OooO00o2.OooO00o()).getDigestLength();
    }

    public static String OooO0OO(LlLI1 llLI1) {
        String OooO00o2 = lil1Il1.OooO00o(llLI1);
        int indexOf = OooO00o2.indexOf(45);
        if (indexOf <= 0 || OooO00o2.startsWith("SHA3")) {
            return lil1Il1.OooO00o(llLI1);
        }
        return OooO00o2.substring(0, indexOf) + OooO00o2.substring(indexOf + 1);
    }

    public int OooO00o(LlLI1 llLI1) {
        return ((Integer) OooO0o0.get(llLI1)).intValue();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m22976OooO00o(LlLI1 llLI1) {
        String str = (String) OooO0Oo.get(llLI1);
        return str != null ? str : llLI1.m16387OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AlgorithmParameters m22977OooO00o(C6456l1ilL r4) throws OperatorCreationException {
        if (r4.OooO00o().equals(AbstractC5711LiLli.OooOoO0)) {
            return null;
        }
        try {
            AlgorithmParameters OooO00o2 = this.f23982OooO00o.m17217OooO00o(r4.OooO00o().m16387OooO0O0());
            try {
                OooO00o2.init(r4.m17587OooO0O0().OooO0O0().getEncoded());
                return OooO00o2;
            } catch (IOException e) {
                throw new OperatorCreationException("cannot initialise algorithm parameters: " + e.getMessage(), e);
            }
        } catch (NoSuchAlgorithmException unused) {
            return null;
        } catch (NoSuchProviderException e2) {
            throw new OperatorCreationException("cannot create algorithm parameters: " + e2.getMessage(), e2);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public KeyPairGenerator m22978OooO00o(LlLI1 llLI1) throws CMSException {
        try {
            return this.f23982OooO00o.m17219OooO00o(llLI1.m16387OooO0O0());
        } catch (GeneralSecurityException e) {
            throw new CMSException("cannot create key agreement: " + e.getMessage(), e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public MessageDigest m22979OooO00o(C6456l1ilL r4) throws GeneralSecurityException {
        try {
            return this.f23982OooO00o.m17220OooO00o(lil1Il1.OooO00o(r4.OooO00o()));
        } catch (NoSuchAlgorithmException e) {
            if (OooO00o.get(r4.OooO00o()) != null) {
                return this.f23982OooO00o.m17220OooO00o((String) OooO00o.get(r4.OooO00o()));
            }
            throw e;
        }
    }

    public PublicKey OooO00o(C6888ll r4) throws OperatorCreationException {
        try {
            return this.f23982OooO00o.m17218OooO00o(r4.m18041OooO00o().OooO00o().m16387OooO0O0()).generatePublic(new X509EncodedKeySpec(r4.getEncoded()));
        } catch (IOException e) {
            throw new OperatorCreationException("cannot get encoded form of key: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new OperatorCreationException("cannot create key factory: " + e2.getMessage(), e2);
        } catch (NoSuchProviderException e3) {
            throw new OperatorCreationException("cannot find factory provider: " + e3.getMessage(), e3);
        } catch (InvalidKeySpecException e4) {
            throw new OperatorCreationException("cannot create key factory: " + e4.getMessage(), e4);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Signature m22980OooO00o(C6456l1ilL r5) {
        try {
            String OooO00o2 = OooO00o(r5);
            String str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED + OooO00o2.substring(OooO00o2.indexOf("WITH"));
            Signature OooO00o3 = this.f23982OooO00o.m17222OooO00o(str);
            if (r5.OooO00o().equals(AbstractC5711LiLli.Oooo00o)) {
                AlgorithmParameters OooO00o4 = this.f23982OooO00o.m17217OooO00o(str);
                C6037i1iLi.OooO00o(OooO00o4, r5.m17587OooO0O0());
                OooO00o3.setParameter((PSSParameterSpec) OooO00o4.getParameterSpec(PSSParameterSpec.class));
            }
            return OooO00o3;
        } catch (Exception unused) {
            return null;
        }
    }

    public X509Certificate OooO00o(X509CertificateHolder x509CertificateHolder) throws CertificateException {
        try {
            return (X509Certificate) this.f23982OooO00o.m17223OooO00o("X.509").generateCertificate(new ByteArrayInputStream(x509CertificateHolder.getEncoded()));
        } catch (IOException e) {
            throw new OpCertificateException("cannot get encoded form of certificate: " + e.getMessage(), e);
        } catch (NoSuchProviderException e2) {
            throw new OpCertificateException("cannot find factory provider: " + e2.getMessage(), e2);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Cipher m22981OooO00o(LlLI1 llLI1) throws OperatorCreationException {
        try {
            return this.f23982OooO00o.m17224OooO00o(llLI1.m16387OooO0O0());
        } catch (GeneralSecurityException e) {
            throw new OperatorCreationException("cannot create cipher: " + e.getMessage(), e);
        }
    }

    public Cipher OooO00o(LlLI1 llLI1, Map map) throws OperatorCreationException {
        String str = null;
        try {
            if (!map.isEmpty()) {
                str = (String) map.get(llLI1);
            }
            if (str == null) {
                str = (String) OooO0O0.get(llLI1);
            }
            if (str != null) {
                try {
                    return this.f23982OooO00o.m17224OooO00o(str);
                } catch (NoSuchAlgorithmException unused) {
                    if (str.equals("RSA/ECB/PKCS1Padding")) {
                        try {
                            return this.f23982OooO00o.m17224OooO00o("RSA/NONE/PKCS1Padding");
                        } catch (NoSuchAlgorithmException unused2) {
                        }
                    }
                }
            }
            return this.f23982OooO00o.m17224OooO00o(llLI1.m16387OooO0O0());
        } catch (GeneralSecurityException e) {
            throw new OperatorCreationException("cannot create cipher: " + e.getMessage(), e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public KeyAgreement m22982OooO00o(LlLI1 llLI1) throws OperatorCreationException {
        try {
            return this.f23982OooO00o.m17225OooO00o(llLI1.m16387OooO0O0());
        } catch (GeneralSecurityException e) {
            throw new OperatorCreationException("cannot create key agreement: " + e.getMessage(), e);
        }
    }

    public String OooO0O0(LlLI1 llLI1) {
        return (String) OooO0OO.get(llLI1);
    }

    public Signature OooO0O0(C6456l1ilL r4) throws GeneralSecurityException {
        Signature signature;
        try {
            signature = this.f23982OooO00o.m17222OooO00o(OooO00o(r4));
        } catch (NoSuchAlgorithmException e) {
            if (OooO00o.get(r4.OooO00o()) != null) {
                signature = this.f23982OooO00o.m17222OooO00o((String) OooO00o.get(r4.OooO00o()));
            } else {
                throw e;
            }
        }
        if (r4.OooO00o().equals(AbstractC5711LiLli.Oooo00o)) {
            I11li1 OooO00o2 = I11li1.OooO00o(r4.m17587OooO0O0());
            if (OooO00o(OooO00o2)) {
                try {
                    AlgorithmParameters OooO00o3 = this.f23982OooO00o.m17217OooO00o("PSS");
                    OooO00o3.init(OooO00o2.getEncoded());
                    signature.setParameter(OooO00o3.getParameterSpec(PSSParameterSpec.class));
                } catch (IOException e2) {
                    throw new GeneralSecurityException("unable to process PSS parameters: " + e2.getMessage());
                }
            }
        }
        return signature;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Cipher m22983OooO0O0(LlLI1 llLI1) throws OperatorCreationException {
        try {
            String str = (String) OooO0OO.get(llLI1);
            if (str != null) {
                try {
                    return this.f23982OooO00o.m17224OooO00o(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.f23982OooO00o.m17224OooO00o(llLI1.m16387OooO0O0());
        } catch (GeneralSecurityException e) {
            throw new OperatorCreationException("cannot create cipher: " + e.getMessage(), e);
        }
    }
}
