package com.p118pd.sdk;

import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.operator.jcajce.OperatorHelper;

/* renamed from: com.pd.sdk.lI丨1丨  reason: invalid class name and case insensitive filesystem */
public class C6530lI1 extends AbstractC9728l1 {
    public static final Set OooO00o;
    public static final Map OooO0O0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PublicKey f18412OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18413OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map f18414OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OperatorHelper f18415OooO00o;

    static {
        HashSet hashSet = new HashSet();
        OooO00o = hashSet;
        hashSet.add(AbstractC5331ILi.OooOooo);
        OooO00o.add(AbstractC5331ILi.OooOOO0);
        OooO00o.add(LLiII.OooOO0o);
        OooO00o.add(LLiII.OooOOO0);
        OooO00o.add(LLiII.OooO0oO);
        OooO00o.add(LLiII.OooO0oo);
        HashMap hashMap = new HashMap();
        OooO0O0 = hashMap;
        hashMap.put(LL1i.OooO0O0, new C6456l1ilL(AbstractC9733l.OooO, C6452l1Lll.OooO00o));
        OooO0O0.put(LL1i.OooO0O0, new C6456l1ilL(AbstractC9733l.OooO, C6452l1Lll.OooO00o));
        OooO0O0.put("SHA224", new C6456l1ilL(AbstractC5905LllI.OooO0o, C6452l1Lll.OooO00o));
        OooO0O0.put(LL1i.OooO0OO, new C6456l1ilL(AbstractC5905LllI.OooO0o, C6452l1Lll.OooO00o));
        OooO0O0.put("SHA256", new C6456l1ilL(AbstractC5905LllI.OooO0OO, C6452l1Lll.OooO00o));
        OooO0O0.put(LL1i.OooO0Oo, new C6456l1ilL(AbstractC5905LllI.OooO0OO, C6452l1Lll.OooO00o));
        OooO0O0.put("SHA384", new C6456l1ilL(AbstractC5905LllI.OooO0Oo, C6452l1Lll.OooO00o));
        OooO0O0.put(LL1i.f16409OooO0o0, new C6456l1ilL(AbstractC5905LllI.OooO0Oo, C6452l1Lll.OooO00o));
        OooO0O0.put("SHA512", new C6456l1ilL(AbstractC5905LllI.OooO0o0, C6452l1Lll.OooO00o));
        OooO0O0.put(LL1i.f16408OooO0o, new C6456l1ilL(AbstractC5905LllI.OooO0o0, C6452l1Lll.OooO00o));
        OooO0O0.put("SHA512/224", new C6456l1ilL(AbstractC5905LllI.OooO0oO, C6452l1Lll.OooO00o));
        OooO0O0.put("SHA-512/224", new C6456l1ilL(AbstractC5905LllI.OooO0oO, C6452l1Lll.OooO00o));
        OooO0O0.put("SHA-512(224)", new C6456l1ilL(AbstractC5905LllI.OooO0oO, C6452l1Lll.OooO00o));
        OooO0O0.put("SHA512/256", new C6456l1ilL(AbstractC5905LllI.OooO0oo, C6452l1Lll.OooO00o));
        OooO0O0.put("SHA-512/256", new C6456l1ilL(AbstractC5905LllI.OooO0oo, C6452l1Lll.OooO00o));
        OooO0O0.put("SHA-512(256)", new C6456l1ilL(AbstractC5905LllI.OooO0oo, C6452l1Lll.OooO00o));
    }

    public C6530lI1(C6456l1ilL r2, PublicKey publicKey) {
        super(r2);
        this.f18415OooO00o = new OperatorHelper(new ILLli());
        this.f18414OooO00o = new HashMap();
        this.f18412OooO00o = publicKey;
    }

    public C6530lI1(PublicKey publicKey) {
        super(C6888ll.OooO00o(publicKey.getEncoded()).m18041OooO00o());
        this.f18415OooO00o = new OperatorHelper(new ILLli());
        this.f18414OooO00o = new HashMap();
        this.f18412OooO00o = publicKey;
    }

    public C6530lI1(X509Certificate x509Certificate) {
        this(x509Certificate.getPublicKey());
    }

    public C6530lI1(AlgorithmParameterSpec algorithmParameterSpec, PublicKey publicKey) {
        super(OooO00o(algorithmParameterSpec));
        this.f18415OooO00o = new OperatorHelper(new ILLli());
        this.f18414OooO00o = new HashMap();
        this.f18412OooO00o = publicKey;
    }

    public static C6456l1ilL OooO00o(String str) {
        C6456l1ilL r0 = (C6456l1ilL) OooO0O0.get(str);
        if (r0 != null) {
            return r0;
        }
        throw new IllegalArgumentException("unknown digest name: " + str);
    }

    public static C6456l1ilL OooO00o(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof OAEPParameterSpec) {
            OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
            if (!oAEPParameterSpec.getMGFAlgorithm().equals(OAEPParameterSpec.DEFAULT.getMGFAlgorithm())) {
                throw new IllegalArgumentException("unknown MGF: " + oAEPParameterSpec.getMGFAlgorithm());
            } else if (oAEPParameterSpec.getPSource() instanceof PSource.PSpecified) {
                return new C6456l1ilL(AbstractC5711LiLli.OooOooo, new C6496lIIlil(OooO00o(oAEPParameterSpec.getDigestAlgorithm()), new C6456l1ilL(AbstractC5711LiLli.Oooo000, OooO00o(((MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters()).getDigestAlgorithm())), new C6456l1ilL(AbstractC5711LiLli.Oooo00O, new C6487lIIiIlL(((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue()))));
            } else {
                throw new IllegalArgumentException("unknown PSource: " + oAEPParameterSpec.getPSource().getAlgorithm());
            }
        } else {
            throw new IllegalArgumentException("unknown spec: " + algorithmParameterSpec.getClass().getName());
        }
    }

    public static boolean OooO00o(LlLI1 llLI1) {
        return OooO00o.contains(llLI1);
    }

    public C6530lI1 OooO00o(LlLI1 llLI1, String str) {
        this.f18414OooO00o.put(llLI1, str);
        return this;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6530lI1 m17653OooO00o(String str) {
        this.f18415OooO00o = new OperatorHelper(new C9588iIi(str));
        return this;
    }

    public C6530lI1 OooO00o(Provider provider) {
        this.f18415OooO00o = new OperatorHelper(new LLIlii(provider));
        return this;
    }

    public C6530lI1 OooO00o(SecureRandom secureRandom) {
        this.f18413OooO00o = secureRandom;
        return this;
    }

    @Override // com.p118pd.sdk.lI111ll
    public byte[] OooO00o(LIiI11 r8) throws OperatorException {
        byte[] bArr;
        if (OooO00o(OooO00o().OooO00o())) {
            try {
                if (this.f18413OooO00o == null) {
                    this.f18413OooO00o = new SecureRandom();
                }
                KeyPairGenerator OooO00o2 = this.f18415OooO00o.m22978OooO00o(OooO00o().OooO00o());
                OooO00o2.initialize(((ECPublicKey) this.f18412OooO00o).getParams(), this.f18413OooO00o);
                KeyPair generateKeyPair = OooO00o2.generateKeyPair();
                byte[] bArr2 = new byte[8];
                this.f18413OooO00o.nextBytes(bArr2);
                C6888ll OooO00o3 = C6888ll.OooO00o(generateKeyPair.getPublic().getEncoded());
                C6311ilILI r5 = OooO00o3.m18041OooO00o().OooO00o().OooO00o(LLiII.OooO0O0) ? new C6311ilILI(LLiII.OooOo00, OooO00o3, bArr2) : new C6311ilILI(AbstractC5331ILi.OooO0oo, OooO00o3, bArr2);
                KeyAgreement OooO00o4 = this.f18415OooO00o.m22982OooO00o(OooO00o().OooO00o());
                OooO00o4.init(generateKeyPair.getPrivate(), new C6350illI1i(r5.m17352OooO00o()));
                OooO00o4.doPhase(this.f18412OooO00o, true);
                SecretKey generateSecret = OooO00o4.generateSecret(AbstractC5331ILi.OooO0o0.m16387OooO0O0());
                byte[] encoded = C9799L1Il.OooO00o(r8).getEncoded();
                Cipher OooO00o5 = this.f18415OooO00o.m22981OooO00o(AbstractC5331ILi.OooO0o0);
                OooO00o5.init(3, generateSecret, new C5621LILiI(r5.OooO00o(), r5.m17352OooO00o()));
                byte[] wrap = OooO00o5.wrap(new SecretKeySpec(encoded, "GOST"));
                return new C6187iLl(new C6702lili(C9586iIILl.m21632OooO00o(wrap, 0, 32), C9586iIILl.m21632OooO00o(wrap, 32, 36)), r5).getEncoded();
            } catch (Exception e) {
                throw new OperatorException("exception wrapping key: " + e.getMessage(), e);
            }
        } else {
            Cipher OooO00o6 = this.f18415OooO00o.OooO00o(OooO00o().OooO00o(), this.f18414OooO00o);
            AlgorithmParameters OooO00o7 = this.f18415OooO00o.m22977OooO00o(OooO00o());
            if (OooO00o7 != null) {
                try {
                    OooO00o6.init(3, this.f18412OooO00o, OooO00o7, this.f18413OooO00o);
                } catch (IllegalStateException | UnsupportedOperationException | GeneralSecurityException | InvalidKeyException | ProviderException unused) {
                    bArr = null;
                }
            } else {
                OooO00o6.init(3, this.f18412OooO00o, this.f18413OooO00o);
            }
            bArr = OooO00o6.wrap(C9799L1Il.OooO00o(r8));
            if (bArr != null) {
                return bArr;
            }
            try {
                OooO00o6.init(1, this.f18412OooO00o, this.f18413OooO00o);
                return OooO00o6.doFinal(C9799L1Il.OooO00o(r8).getEncoded());
            } catch (InvalidKeyException e2) {
                throw new OperatorException("unable to encrypt contents key", e2);
            } catch (GeneralSecurityException e3) {
                throw new OperatorException("unable to encrypt contents key", e3);
            }
        }
    }
}
