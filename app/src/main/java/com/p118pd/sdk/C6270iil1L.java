package com.p118pd.sdk;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.iil1丨L  reason: invalid class name and case insensitive filesystem */
public class C6270iil1L extends C9764Il1 {
    public static Hashtable OooO00o = new Hashtable();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Set f17924OooO00o = new HashSet();
    public static Hashtable OooO0O0 = new Hashtable();
    public static Hashtable OooO0OO = new Hashtable();
    public static Hashtable OooO0Oo = new Hashtable();

    static {
        OooO00o.put("MD2WITHRSAENCRYPTION", new LlLI1("1.2.840.113549.1.1.2"));
        OooO00o.put("MD2WITHRSA", new LlLI1("1.2.840.113549.1.1.2"));
        OooO00o.put("MD5WITHRSAENCRYPTION", new LlLI1("1.2.840.113549.1.1.4"));
        OooO00o.put("MD5WITHRSA", new LlLI1("1.2.840.113549.1.1.4"));
        OooO00o.put("RSAWITHMD5", new LlLI1("1.2.840.113549.1.1.4"));
        OooO00o.put("SHA1WITHRSAENCRYPTION", new LlLI1("1.2.840.113549.1.1.5"));
        OooO00o.put("SHA1WITHRSA", new LlLI1("1.2.840.113549.1.1.5"));
        OooO00o.put("SHA224WITHRSAENCRYPTION", AbstractC5711LiLli.Oooo0o0);
        OooO00o.put("SHA224WITHRSA", AbstractC5711LiLli.Oooo0o0);
        OooO00o.put("SHA256WITHRSAENCRYPTION", AbstractC5711LiLli.Oooo0);
        OooO00o.put("SHA256WITHRSA", AbstractC5711LiLli.Oooo0);
        OooO00o.put("SHA384WITHRSAENCRYPTION", AbstractC5711LiLli.Oooo0O0);
        OooO00o.put("SHA384WITHRSA", AbstractC5711LiLli.Oooo0O0);
        OooO00o.put("SHA512WITHRSAENCRYPTION", AbstractC5711LiLli.Oooo0OO);
        OooO00o.put("SHA512WITHRSA", AbstractC5711LiLli.Oooo0OO);
        OooO00o.put("SHA1WITHRSAANDMGF1", AbstractC5711LiLli.Oooo00o);
        OooO00o.put("SHA224WITHRSAANDMGF1", AbstractC5711LiLli.Oooo00o);
        OooO00o.put("SHA256WITHRSAANDMGF1", AbstractC5711LiLli.Oooo00o);
        OooO00o.put("SHA384WITHRSAANDMGF1", AbstractC5711LiLli.Oooo00o);
        OooO00o.put("SHA512WITHRSAANDMGF1", AbstractC5711LiLli.Oooo00o);
        OooO00o.put("RSAWITHSHA1", new LlLI1("1.2.840.113549.1.1.5"));
        OooO00o.put("RIPEMD128WITHRSAENCRYPTION", AbstractC9468L1lL.OooO0oO);
        OooO00o.put("RIPEMD128WITHRSA", AbstractC9468L1lL.OooO0oO);
        OooO00o.put("RIPEMD160WITHRSAENCRYPTION", AbstractC9468L1lL.OooO0o);
        OooO00o.put("RIPEMD160WITHRSA", AbstractC9468L1lL.OooO0o);
        OooO00o.put("RIPEMD256WITHRSAENCRYPTION", AbstractC9468L1lL.OooO0oo);
        OooO00o.put("RIPEMD256WITHRSA", AbstractC9468L1lL.OooO0oo);
        OooO00o.put("SHA1WITHDSA", new LlLI1("1.2.840.10040.4.3"));
        OooO00o.put("DSAWITHSHA1", new LlLI1("1.2.840.10040.4.3"));
        OooO00o.put("SHA224WITHDSA", AbstractC5905LllI.OoooO);
        OooO00o.put("SHA256WITHDSA", AbstractC5905LllI.OoooOO0);
        OooO00o.put("SHA384WITHDSA", AbstractC5905LllI.o000oOoO);
        OooO00o.put("SHA512WITHDSA", AbstractC5905LllI.OoooOOO);
        OooO00o.put("SHA1WITHECDSA", AbstractC5420Il1iIL.o00O0o0);
        OooO00o.put("SHA224WITHECDSA", AbstractC5420Il1iIL.o00O0oO);
        OooO00o.put("SHA256WITHECDSA", AbstractC5420Il1iIL.o00O0oOO);
        OooO00o.put("SHA384WITHECDSA", AbstractC5420Il1iIL.o00O0oOo);
        OooO00o.put("SHA512WITHECDSA", AbstractC5420Il1iIL.o00O0oo0);
        OooO00o.put("ECDSAWITHSHA1", AbstractC5420Il1iIL.o00O0o0);
        OooO00o.put("GOST3411WITHGOST3410", AbstractC5331ILi.OooOOO);
        OooO00o.put("GOST3410WITHGOST3411", AbstractC5331ILi.OooOOO);
        OooO00o.put("GOST3411WITHECGOST3410", AbstractC5331ILi.OooOOOO);
        OooO00o.put("GOST3411WITHECGOST3410-2001", AbstractC5331ILi.OooOOOO);
        OooO00o.put("GOST3411WITHGOST3410-2001", AbstractC5331ILi.OooOOOO);
        OooO0Oo.put(new LlLI1("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        OooO0Oo.put(AbstractC5711LiLli.Oooo0o0, "SHA224WITHRSA");
        OooO0Oo.put(AbstractC5711LiLli.Oooo0, "SHA256WITHRSA");
        OooO0Oo.put(AbstractC5711LiLli.Oooo0O0, "SHA384WITHRSA");
        OooO0Oo.put(AbstractC5711LiLli.Oooo0OO, "SHA512WITHRSA");
        OooO0Oo.put(AbstractC5331ILi.OooOOO, "GOST3411WITHGOST3410");
        OooO0Oo.put(AbstractC5331ILi.OooOOOO, "GOST3411WITHECGOST3410");
        OooO0Oo.put(new LlLI1("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        OooO0Oo.put(new LlLI1("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        OooO0Oo.put(new LlLI1("1.2.840.10040.4.3"), "SHA1WITHDSA");
        OooO0Oo.put(AbstractC5420Il1iIL.o00O0o0, "SHA1WITHECDSA");
        OooO0Oo.put(AbstractC5420Il1iIL.o00O0oO, "SHA224WITHECDSA");
        OooO0Oo.put(AbstractC5420Il1iIL.o00O0oOO, "SHA256WITHECDSA");
        OooO0Oo.put(AbstractC5420Il1iIL.o00O0oOo, "SHA384WITHECDSA");
        OooO0Oo.put(AbstractC5420Il1iIL.o00O0oo0, "SHA512WITHECDSA");
        OooO0Oo.put(AbstractC9733l.OooOO0O, "SHA1WITHRSA");
        OooO0Oo.put(AbstractC9733l.OooOO0, "SHA1WITHDSA");
        OooO0Oo.put(AbstractC5905LllI.OoooO, "SHA224WITHDSA");
        OooO0Oo.put(AbstractC5905LllI.OoooOO0, "SHA256WITHDSA");
        OooO0OO.put(AbstractC5711LiLli.OooOoO0, C7491o0OoOOO.OooO00o);
        OooO0OO.put(AbstractC5420Il1iIL.o00OOooo, "DSA");
        f17924OooO00o.add(AbstractC5420Il1iIL.o00O0o0);
        f17924OooO00o.add(AbstractC5420Il1iIL.o00O0oO);
        f17924OooO00o.add(AbstractC5420Il1iIL.o00O0oOO);
        f17924OooO00o.add(AbstractC5420Il1iIL.o00O0oOo);
        f17924OooO00o.add(AbstractC5420Il1iIL.o00O0oo0);
        f17924OooO00o.add(AbstractC5420Il1iIL.o00OoOoO);
        f17924OooO00o.add(AbstractC5905LllI.OoooO);
        f17924OooO00o.add(AbstractC5905LllI.OoooOO0);
        f17924OooO00o.add(AbstractC5331ILi.OooOOO);
        f17924OooO00o.add(AbstractC5331ILi.OooOOOO);
        OooO0O0.put("SHA1WITHRSAANDMGF1", OooO00o(new C6456l1ilL(AbstractC9733l.OooO, C6452l1Lll.OooO00o), 20));
        OooO0O0.put("SHA224WITHRSAANDMGF1", OooO00o(new C6456l1ilL(AbstractC5905LllI.OooO0o, C6452l1Lll.OooO00o), 28));
        OooO0O0.put("SHA256WITHRSAANDMGF1", OooO00o(new C6456l1ilL(AbstractC5905LllI.OooO0OO, C6452l1Lll.OooO00o), 32));
        OooO0O0.put("SHA384WITHRSAANDMGF1", OooO00o(new C6456l1ilL(AbstractC5905LllI.OooO0Oo, C6452l1Lll.OooO00o), 48));
        OooO0O0.put("SHA512WITHRSAANDMGF1", OooO00o(new C6456l1ilL(AbstractC5905LllI.OooO0o0, C6452l1Lll.OooO00o), 64));
    }

    public C6270iil1L(I11li1 i11li1) {
        super(i11li1);
    }

    public C6270iil1L(String str, C929811Li1 r9, PublicKey publicKey, I11L i11l, PrivateKey privateKey) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        this(str, r9, publicKey, i11l, privateKey, BouncyCastleProvider.PROVIDER_NAME);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6270iil1L(java.lang.String r5, com.p118pd.sdk.C929811Li1 r6, java.security.PublicKey r7, com.p118pd.sdk.I11L r8, java.security.PrivateKey r9, java.lang.String r10) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6270iil1L.<init>(java.lang.String, com.pd.sdk.丨11丨Li1, java.security.PublicKey, com.pd.sdk.I11L, java.security.PrivateKey, java.lang.String):void");
    }

    public C6270iil1L(String str, X500Principal x500Principal, PublicKey publicKey, I11L i11l, PrivateKey privateKey) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        this(str, OooO00o(x500Principal), publicKey, i11l, privateKey, BouncyCastleProvider.PROVIDER_NAME);
    }

    public C6270iil1L(String str, X500Principal x500Principal, PublicKey publicKey, I11L i11l, PrivateKey privateKey, String str2) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        this(str, OooO00o(x500Principal), publicKey, i11l, privateKey, str2);
    }

    public C6270iil1L(byte[] bArr) {
        super(OooO00o(bArr));
    }

    public static I11li1 OooO00o(byte[] bArr) {
        try {
            return (I11li1) new C5805Ll1(bArr).OooO00o();
        } catch (Exception unused) {
            throw new IllegalArgumentException("badly encoded request");
        }
    }

    public static C6692lii OooO00o(C6456l1ilL r5, int i) {
        return new C6692lii(r5, new C6456l1ilL(AbstractC5711LiLli.Oooo000, r5), new C6513lIiI((long) i), new C6513lIiI(1));
    }

    public static C929811Li1 OooO00o(X500Principal x500Principal) {
        try {
            return new C6790lll1I11(x500Principal.getEncoded());
        } catch (IOException unused) {
            throw new IllegalArgumentException("can't convert name");
        }
    }

    public static String OooO00o(LlLI1 llLI1) {
        return AbstractC5711LiLli.Oooooo0.equals(llLI1) ? "MD5" : AbstractC9733l.OooO.equals(llLI1) ? "SHA1" : AbstractC5905LllI.OooO0o.equals(llLI1) ? "SHA224" : AbstractC5905LllI.OooO0OO.equals(llLI1) ? "SHA256" : AbstractC5905LllI.OooO0Oo.equals(llLI1) ? "SHA384" : AbstractC5905LllI.OooO0o0.equals(llLI1) ? "SHA512" : AbstractC9468L1lL.OooO0OO.equals(llLI1) ? "RIPEMD128" : AbstractC9468L1lL.OooO0O0.equals(llLI1) ? "RIPEMD160" : AbstractC9468L1lL.OooO0Oo.equals(llLI1) ? "RIPEMD256" : AbstractC5331ILi.OooO0O0.equals(llLI1) ? "GOST3411" : llLI1.m16387OooO0O0();
    }

    public static String OooO00o(C6456l1ilL r3) {
        AbstractC6854lLi1LL OooO0O02 = r3.m17587OooO0O0();
        if (OooO0O02 == null || C6452l1Lll.OooO00o.equals(OooO0O02) || !r3.OooO00o().equals(AbstractC5711LiLli.Oooo00o)) {
            return r3.OooO00o().m16387OooO0O0();
        }
        C6692lii OooO00o2 = C6692lii.OooO00o(OooO0O02);
        return OooO00o(OooO00o2.OooO00o().OooO00o()) + "withRSAandMGF1";
    }

    private void OooO00o(Signature signature, AbstractC6854lLi1LL r4) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (r4 != null && !C6452l1Lll.OooO00o.equals(r4)) {
            AlgorithmParameters instance = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
            try {
                instance.init(r4.OooO0O0().OooO00o(AbstractC5533IiL.OooO00o));
                if (signature.getAlgorithm().endsWith("MGF1")) {
                    try {
                        signature.setParameter(instance.getParameterSpec(PSSParameterSpec.class));
                    } catch (GeneralSecurityException e) {
                        throw new SignatureException("Exception extracting parameters: " + e.getMessage());
                    }
                }
            } catch (IOException e2) {
                throw new SignatureException("IOException decoding parameters: " + e2.getMessage());
            }
        }
    }

    @Override // com.p118pd.sdk.C9764Il1, com.p118pd.sdk.C9764Il1, com.p118pd.sdk.C9764Il1
    public PublicKey OooO00o() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
        return OooO00o(BouncyCastleProvider.PROVIDER_NAME);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public PublicKey OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
        C6888ll OooO00o2 = ((C9764Il1) this).OooO00o.m15898OooO00o();
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(new iIilII1(OooO00o2).OooO0O0());
            C6456l1ilL OooO00o3 = OooO00o2.m18041OooO00o();
            if (str != null) {
                return KeyFactory.getInstance(OooO00o3.OooO00o().m16387OooO0O0(), str).generatePublic(x509EncodedKeySpec);
            }
            try {
                return KeyFactory.getInstance(OooO00o3.OooO00o().m16387OooO0O0()).generatePublic(x509EncodedKeySpec);
            } catch (NoSuchAlgorithmException e) {
                if (OooO0OO.get(OooO00o3.OooO00o()) != null) {
                    String str2 = (String) OooO0OO.get(OooO00o3.OooO00o());
                    return str == null ? KeyFactory.getInstance(str2).generatePublic(x509EncodedKeySpec) : KeyFactory.getInstance(str2, str).generatePublic(x509EncodedKeySpec);
                }
                throw e;
            }
        } catch (InvalidKeySpecException unused) {
            throw new InvalidKeyException("error decoding public key");
        } catch (IOException unused2) {
            throw new InvalidKeyException("error decoding public key");
        }
    }

    @Override // com.p118pd.sdk.C9764Il1, com.p118pd.sdk.C9764Il1, com.p118pd.sdk.C9764Il1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17298OooO00o() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        return m17299OooO00o(BouncyCastleProvider.PROVIDER_NAME);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17299OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        return OooO00o(OooO00o(str), str);
    }

    public boolean OooO00o(PublicKey publicKey, String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        Signature signature;
        if (str == null) {
            try {
                signature = Signature.getInstance(OooO00o(((C9764Il1) this).f23401OooO00o));
            } catch (NoSuchAlgorithmException e) {
                if (OooO0Oo.get(((C9764Il1) this).f23401OooO00o.OooO00o()) != null) {
                    String str2 = (String) OooO0Oo.get(((C9764Il1) this).f23401OooO00o.OooO00o());
                    signature = str == null ? Signature.getInstance(str2) : Signature.getInstance(str2, str);
                } else {
                    throw e;
                }
            }
        } else {
            signature = Signature.getInstance(OooO00o(((C9764Il1) this).f23401OooO00o), str);
        }
        OooO00o(signature, ((C9764Il1) this).f23401OooO00o.m17587OooO0O0());
        signature.initVerify(publicKey);
        try {
            signature.update(((C9764Il1) this).OooO00o.OooO00o(AbstractC5533IiL.OooO00o));
            return signature.verify(((C9764Il1) this).f23400OooO00o.OooO0O0());
        } catch (Exception e2) {
            throw new SignatureException("exception encoding TBS cert request - " + e2);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.i11ILLIi
    public byte[] getEncoded() {
        try {
            return OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }
}
