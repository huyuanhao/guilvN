package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.i1iI1LlI */
public class i1iI1LlI extends KeyStoreSpi implements AbstractC5711LiLli, AbstractC5855LLl, iI1Il1 {
    public static final C6034OooO0oO OooO00o = new C6034OooO0oO();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Provider f17397OooO00o = null;
    public static final int o000000 = 1;
    public static final int o000000O = 2;
    public static final int o000OOo = 0;
    public static final int o0O0O00 = 4;
    public static final int o0OO00O = 2;
    public static final int o0OOO0o = 0;
    public static final int o0Oo0oo = 1;
    public static final int o0ooOOo = 20;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public static final String f17398o0ooOOo = "org.bouncycastle.pkcs12.max_it_count";
    public static final int o0ooOoO = 51200;
    public static final int oo0o0Oo = 3;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6035OooO0oo f17399OooO00o = new C6035OooO0oo();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ii1I11l f17400OooO00o = new C6640li1lI();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f17401OooO00o = new C6456l1ilL(AbstractC9733l.OooO, C6452l1Lll.OooO00o);

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f17402OooO00o = IIllii.OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public CertificateFactory f17403OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Hashtable f17404OooO00o = new Hashtable();
    public C6035OooO0oo OooO0O0 = new C6035OooO0oo();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Hashtable f17405OooO0O0 = new Hashtable();
    public Hashtable OooO0OO = new Hashtable();
    public LlLI1 o00OoOOo;
    public LlLI1 o00OoOo0;
    public int o00oO0O = 102400;
    public int o0ooOO0 = 20;

    /* renamed from: com.pd.sdk.i1iI1LlI$OooO0O0 */
    public static class OooO0O0 extends i1iI1LlI {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public OooO0O0() {
            /*
                r2 = this;
                java.security.Provider r0 = com.p118pd.sdk.i1iI1LlI.OooO00o()
                com.pd.sdk.LlLI1 r1 = com.p118pd.sdk.AbstractC5711LiLli.o000o0o0
                r2.<init>(r0, r1, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.i1iI1LlI.OooO0O0.<init>():void");
        }
    }

    /* renamed from: com.pd.sdk.i1iI1LlI$OooO0OO */
    public static class OooO0OO extends i1iI1LlI {
        public OooO0OO() {
            super(i1iI1LlI.OooO0O0(), AbstractC5711LiLli.o000o0o0, AbstractC5711LiLli.o000o0oo);
        }
    }

    /* renamed from: com.pd.sdk.i1iI1LlI$OooO0Oo  reason: case insensitive filesystem */
    public class C6032OooO0Oo {

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f17406OooO00o;

        public C6032OooO0Oo(PublicKey publicKey) {
            this.f17406OooO00o = i1iI1LlI.this.OooO00o((i1iI1LlI) publicKey).OooO00o();
        }

        public C6032OooO0Oo(byte[] bArr) {
            this.f17406OooO00o = bArr;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6032OooO0Oo)) {
                return false;
            }
            return C9586iIILl.m21627OooO00o(this.f17406OooO00o, ((C6032OooO0Oo) obj).f17406OooO00o);
        }

        public int hashCode() {
            return C9586iIILl.OooO00o(this.f17406OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.i1iI1LlI$OooO0o */
    public static class OooO0o extends i1iI1LlI {
        public OooO0o() {
            super(null, AbstractC5711LiLli.o000o0o0, AbstractC5711LiLli.o000o0oo);
        }
    }

    /* renamed from: com.pd.sdk.i1iI1LlI$OooO0o0  reason: case insensitive filesystem */
    public static class C6033OooO0o0 extends i1iI1LlI {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C6033OooO0o0() {
            /*
                r2 = this;
                com.pd.sdk.LlLI1 r0 = com.p118pd.sdk.AbstractC5711LiLli.o000o0o0
                r1 = 0
                r2.<init>(r1, r0, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.i1iI1LlI.C6033OooO0o0.<init>():void");
        }
    }

    /* renamed from: com.pd.sdk.i1iI1LlI$OooO0oO  reason: case insensitive filesystem */
    public static class C6034OooO0oO {
        public final Map OooO00o;

        public C6034OooO0oO() {
            HashMap hashMap = new HashMap();
            hashMap.put(new LlLI1(C1L1l.OooO0Oo), I11I.OooO00o(128));
            hashMap.put(AbstractC5711LiLli.OoooOoo, I11I.OooO00o(192));
            hashMap.put(AbstractC5905LllI.OooOo0, I11I.OooO00o(128));
            hashMap.put(AbstractC5905LllI.OooOoo, I11I.OooO00o(192));
            hashMap.put(AbstractC5905LllI.Oooo0OO, I11I.OooO00o(256));
            hashMap.put(lILIiLL.OooO00o, I11I.OooO00o(128));
            hashMap.put(lILIiLL.OooO0O0, I11I.OooO00o(192));
            hashMap.put(lILIiLL.OooO0OO, I11I.OooO00o(256));
            hashMap.put(AbstractC5331ILi.OooO0o, I11I.OooO00o(256));
            this.OooO00o = Collections.unmodifiableMap(hashMap);
        }

        public int OooO00o(C6456l1ilL r2) {
            Integer num = (Integer) this.OooO00o.get(r2.OooO00o());
            if (num != null) {
                return num.intValue();
            }
            return -1;
        }
    }

    /* renamed from: com.pd.sdk.i1iI1LlI$OooO0oo  reason: case insensitive filesystem */
    public static class C6035OooO0oo {
        public Hashtable OooO00o;
        public Hashtable OooO0O0;

        public C6035OooO0oo() {
            this.OooO00o = new Hashtable();
            this.OooO0O0 = new Hashtable();
        }

        public Object OooO00o(String str) {
            String str2 = (String) this.OooO0O0.get(str == null ? null : Strings.OooO00o(str));
            if (str2 == null) {
                return null;
            }
            return this.OooO00o.get(str2);
        }

        public Enumeration OooO00o() {
            return this.OooO00o.elements();
        }

        public void OooO00o(String str, Object obj) {
            String OooO00o2 = str == null ? null : Strings.OooO00o(str);
            String str2 = (String) this.OooO0O0.get(OooO00o2);
            if (str2 != null) {
                this.OooO00o.remove(str2);
            }
            this.OooO0O0.put(OooO00o2, str);
            this.OooO00o.put(str, obj);
        }

        public Object OooO0O0(String str) {
            String str2 = (String) this.OooO0O0.remove(str == null ? null : Strings.OooO00o(str));
            if (str2 == null) {
                return null;
            }
            return this.OooO00o.remove(str2);
        }

        public Enumeration OooO0O0() {
            return this.OooO00o.keys();
        }
    }

    public i1iI1LlI(Provider provider, LlLI1 llLI1, LlLI1 llLI12) {
        CertificateFactory instance;
        this.o00OoOOo = llLI1;
        this.o00OoOo0 = llLI12;
        if (provider != null) {
            try {
                instance = CertificateFactory.getInstance("X.509", provider);
            } catch (Exception e) {
                throw new IllegalArgumentException("can't create cert factory - " + e.toString());
            }
        } else {
            instance = CertificateFactory.getInstance("X.509");
        }
        this.f17403OooO00o = instance;
    }

    private int OooO00o(BigInteger bigInteger) {
        int intValue = bigInteger.intValue();
        if (intValue >= 0) {
            BigInteger OooO00o2 = C9358II1.m21420OooO00o(f17398o0ooOOo);
            if (OooO00o2 == null || OooO00o2.intValue() >= intValue) {
                return intValue;
            }
            throw new IllegalStateException("iteration count " + intValue + " greater than " + OooO00o2.intValue());
        }
        throw new IllegalStateException("negative iteration count found");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private C6584lLLL OooO00o(PublicKey publicKey) {
        try {
            return new C6584lLLL(OooO00o(C6888ll.OooO00o(publicKey.getEncoded())));
        } catch (Exception unused) {
            throw new RuntimeException("error creating key");
        }
    }

    private Set OooO00o() {
        HashSet hashSet = new HashSet();
        Enumeration OooO0O02 = this.f17399OooO00o.OooO0O0();
        while (OooO0O02.hasMoreElements()) {
            Certificate[] engineGetCertificateChain = engineGetCertificateChain((String) OooO0O02.nextElement());
            for (int i = 0; i != engineGetCertificateChain.length; i++) {
                hashSet.add(engineGetCertificateChain[i]);
            }
        }
        Enumeration OooO0O03 = this.OooO0O0.OooO0O0();
        while (OooO0O03.hasMoreElements()) {
            hashSet.add(engineGetCertificate((String) OooO0O03.nextElement()));
        }
        return hashSet;
    }

    private Cipher OooO00o(int i, char[] cArr, C6456l1ilL r13) throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, NoSuchProviderException {
        AlgorithmParameterSpec algorithmParameterSpec;
        C9545LI OooO00o2 = C9545LI.OooO00o(r13.m17587OooO0O0());
        C5772LlIII OooO00o3 = C5772LlIII.OooO00o(OooO00o2.OooO00o().m15646OooO0O0());
        C6456l1ilL OooO00o4 = C6456l1ilL.OooO00o(OooO00o2.m21604OooO00o());
        SecretKeyFactory OooO00o5 = this.f17400OooO00o.m17228OooO00o(OooO00o2.OooO00o().OooO00o().m16387OooO0O0());
        SecretKey generateSecret = OooO00o3.m16366OooO00o() ? OooO00o5.generateSecret(new PBEKeySpec(cArr, OooO00o3.m16367OooO00o(), OooO00o(OooO00o3.m16365OooO00o()), OooO00o.OooO00o(OooO00o4))) : OooO00o5.generateSecret(new C6143iIlIii(cArr, OooO00o3.m16367OooO00o(), OooO00o(OooO00o3.m16365OooO00o()), OooO00o.OooO00o(OooO00o4), OooO00o3.OooO00o()));
        Cipher instance = Cipher.getInstance(OooO00o2.m21604OooO00o().OooO00o().m16387OooO0O0());
        AbstractC6854lLi1LL OooO0O02 = OooO00o2.m21604OooO00o().m17683OooO0O0();
        if (OooO0O02 instanceof AbstractC6804llL1ii) {
            algorithmParameterSpec = new IvParameterSpec(AbstractC6804llL1ii.OooO00o(OooO0O02).m17938OooO00o());
        } else {
            C9437II OooO00o6 = C9437II.OooO00o(OooO0O02);
            algorithmParameterSpec = new C9873i1(OooO00o6.OooO00o(), OooO00o6.m21474OooO00o());
        }
        instance.init(i, generateSecret, algorithmParameterSpec);
        return instance;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x01b1 A[Catch:{ CertificateEncodingException -> 0x0255 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01c9 A[Catch:{ CertificateEncodingException -> 0x0255 }, LOOP:3: B:40:0x01c3->B:42:0x01c9, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO00o(java.io.OutputStream r19, char[] r20, boolean r21) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1269
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.i1iI1LlI.OooO00o(java.io.OutputStream, char[], boolean):void");
    }

    private byte[] OooO00o(LlLI1 llLI1, byte[] bArr, int i, char[] cArr, boolean z, byte[] bArr2) throws Exception {
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i);
        Mac OooO00o2 = this.f17400OooO00o.m17227OooO00o(llLI1.m16387OooO0O0());
        OooO00o2.init(new PKCS12Key(cArr, z), pBEParameterSpec);
        OooO00o2.update(bArr2);
        return OooO00o2.doFinal();
    }

    public static byte[] OooO00o(C6888ll r4) {
        AbstractC6436l11LI OooO0O02 = C5427IlI1.OooO0O0();
        byte[] bArr = new byte[OooO0O02.OooO0O0()];
        byte[] OooO00o2 = r4.OooO00o().m15475OooO00o();
        OooO0O02.update(OooO00o2, 0, OooO00o2.length);
        OooO0O02.OooO00o(bArr, 0);
        return bArr;
    }

    public static synchronized Provider OooO0O0() {
        synchronized (i1iI1LlI.class) {
            if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) != null) {
                return Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
            }
            if (f17397OooO00o == null) {
                f17397OooO00o = new BouncyCastleProvider();
            }
            return f17397OooO00o;
        }
    }

    public PrivateKey OooO00o(C6456l1ilL r7, byte[] bArr, char[] cArr, boolean z) throws IOException {
        LlLI1 OooO00o2 = r7.OooO00o();
        try {
            if (OooO00o2.OooO00o(AbstractC5711LiLli.o000o0O)) {
                C6263iiiL OooO00o3 = C6263iiiL.OooO00o(r7.m17587OooO0O0());
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(OooO00o3.m17277OooO00o(), OooO00o(OooO00o3.OooO00o()));
                Cipher OooO00o4 = this.f17400OooO00o.m17224OooO00o(OooO00o2.m16387OooO0O0());
                OooO00o4.init(4, new PKCS12Key(cArr, z), pBEParameterSpec);
                return (PrivateKey) OooO00o4.unwrap(bArr, "", 2);
            } else if (OooO00o2.equals(AbstractC5711LiLli.OoooOOo)) {
                return (PrivateKey) OooO00o(4, cArr, r7).unwrap(bArr, "", 2);
            } else {
                throw new IOException("exception unwrapping private key - cannot recognise: " + OooO00o2);
            }
        } catch (Exception e) {
            throw new IOException("exception unwrapping private key - " + e.toString());
        }
    }

    @Override // com.p118pd.sdk.iI1Il1
    public void OooO00o(SecureRandom secureRandom) {
        this.f17402OooO00o = secureRandom;
    }

    public byte[] OooO00o(String str, Key key, C6263iiiL iiil, char[] cArr) throws IOException {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
        try {
            SecretKeyFactory OooO00o2 = this.f17400OooO00o.m17228OooO00o(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(iiil.m17277OooO00o(), iiil.OooO00o().intValue());
            Cipher OooO00o3 = this.f17400OooO00o.m17224OooO00o(str);
            OooO00o3.init(3, OooO00o2.generateSecret(pBEKeySpec), pBEParameterSpec);
            return OooO00o3.wrap(key);
        } catch (Exception e) {
            throw new IOException("exception encrypting data - " + e.toString());
        }
    }

    public byte[] OooO00o(boolean z, C6456l1ilL r6, char[] cArr, boolean z2, byte[] bArr) throws IOException {
        LlLI1 OooO00o2 = r6.OooO00o();
        int i = z ? 1 : 2;
        if (OooO00o2.OooO00o(AbstractC5711LiLli.o000o0O)) {
            C6263iiiL OooO00o3 = C6263iiiL.OooO00o(r6.m17587OooO0O0());
            try {
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(OooO00o3.m17277OooO00o(), OooO00o3.OooO00o().intValue());
                PKCS12Key pKCS12Key = new PKCS12Key(cArr, z2);
                Cipher OooO00o4 = this.f17400OooO00o.m17224OooO00o(OooO00o2.m16387OooO0O0());
                OooO00o4.init(i, pKCS12Key, pBEParameterSpec);
                return OooO00o4.doFinal(bArr);
            } catch (Exception e) {
                throw new IOException("exception decrypting data - " + e.toString());
            }
        } else if (OooO00o2.equals(AbstractC5711LiLli.OoooOOo)) {
            try {
                return OooO00o(i, cArr, r6).doFinal(bArr);
            } catch (Exception e2) {
                throw new IOException("exception decrypting data - " + e2.toString());
            }
        } else {
            throw new IOException("unknown PBE algorithm: " + OooO00o2);
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        Hashtable hashtable = new Hashtable();
        Enumeration OooO0O02 = this.OooO0O0.OooO0O0();
        while (OooO0O02.hasMoreElements()) {
            hashtable.put(OooO0O02.nextElement(), "cert");
        }
        Enumeration OooO0O03 = this.f17399OooO00o.OooO0O0();
        while (OooO0O03.hasMoreElements()) {
            String str = (String) OooO0O03.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.keys();
    }

    public boolean engineContainsAlias(String str) {
        return (this.OooO0O0.OooO00o(str) == null && this.f17399OooO00o.OooO00o(str) == null) ? false : true;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws KeyStoreException {
        Key key = (Key) this.f17399OooO00o.OooO0O0(str);
        Certificate certificate = (Certificate) this.OooO0O0.OooO0O0(str);
        if (certificate != null) {
            this.f17405OooO0O0.remove(new C6032OooO0Oo(certificate.getPublicKey()));
        }
        if (key != null) {
            String str2 = (String) this.f17404OooO00o.remove(str);
            if (str2 != null) {
                certificate = (Certificate) this.OooO0OO.remove(str2);
            }
            if (certificate != null) {
                this.f17405OooO0O0.remove(new C6032OooO0Oo(certificate.getPublicKey()));
            }
        }
    }

    public Certificate engineGetCertificate(String str) {
        if (str != null) {
            Certificate certificate = (Certificate) this.OooO0O0.OooO00o(str);
            if (certificate != null) {
                return certificate;
            }
            String str2 = (String) this.f17404OooO00o.get(str);
            return (Certificate) (str2 != null ? this.OooO0OO.get(str2) : this.OooO0OO.get(str));
        }
        throw new IllegalArgumentException("null alias passed to getCertificate.");
    }

    public String engineGetCertificateAlias(Certificate certificate) {
        Enumeration OooO00o2 = this.OooO0O0.OooO00o();
        Enumeration OooO0O02 = this.OooO0O0.OooO0O0();
        while (OooO00o2.hasMoreElements()) {
            String str = (String) OooO0O02.nextElement();
            if (((Certificate) OooO00o2.nextElement()).equals(certificate)) {
                return str;
            }
        }
        Enumeration elements = this.OooO0OO.elements();
        Enumeration keys = this.OooO0OO.keys();
        while (elements.hasMoreElements()) {
            String str2 = (String) keys.nextElement();
            if (((Certificate) elements.nextElement()).equals(certificate)) {
                return str2;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.i1iI1LlI.engineGetCertificateChain(java.lang.String):java.security.cert.Certificate[]");
    }

    public Date engineGetCreationDate(String str) {
        if (str == null) {
            throw new NullPointerException("alias == null");
        } else if (this.f17399OooO00o.OooO00o(str) == null && this.OooO0O0.OooO00o(str) == null) {
            return null;
        } else {
            return new Date();
        }
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        if (str != null) {
            return (Key) this.f17399OooO00o.OooO00o(str);
        }
        throw new IllegalArgumentException("null alias passed to getKey.");
    }

    public boolean engineIsCertificateEntry(String str) {
        return this.OooO0O0.OooO00o(str) != null && this.f17399OooO00o.OooO00o(str) == null;
    }

    public boolean engineIsKeyEntry(String str) {
        return this.f17399OooO00o.OooO00o(str) != null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f0  */
    @Override // java.security.KeyStoreSpi
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineLoad(java.io.InputStream r23, char[] r24) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1521
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.i1iI1LlI.engineLoad(java.io.InputStream, char[]):void");
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        if (this.f17399OooO00o.OooO00o(str) == null) {
            this.OooO0O0.OooO00o(str, certificate);
            this.f17405OooO0O0.put(new C6032OooO0Oo(certificate.getPublicKey()), certificate);
            return;
        }
        throw new KeyStoreException("There is a key entry with the name " + str + C9058ooOoOoOO.OooOO0);
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        boolean z = key instanceof PrivateKey;
        if (!z) {
            throw new KeyStoreException("PKCS12 does not support non-PrivateKeys");
        } else if (!z || certificateArr != null) {
            if (this.f17399OooO00o.OooO00o(str) != null) {
                engineDeleteEntry(str);
            }
            this.f17399OooO00o.OooO00o(str, key);
            if (certificateArr != null) {
                this.OooO0O0.OooO00o(str, certificateArr[0]);
                for (int i = 0; i != certificateArr.length; i++) {
                    this.f17405OooO0O0.put(new C6032OooO0Oo(certificateArr[i].getPublicKey()), certificateArr[i]);
                }
            }
        } else {
            throw new KeyStoreException("no certificate chain for private key");
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        throw new RuntimeException("operation not supported");
    }

    public int engineSize() {
        Hashtable hashtable = new Hashtable();
        Enumeration OooO0O02 = this.OooO0O0.OooO0O0();
        while (OooO0O02.hasMoreElements()) {
            hashtable.put(OooO0O02.nextElement(), "cert");
        }
        Enumeration OooO0O03 = this.f17399OooO00o.OooO0O0();
        while (OooO0O03.hasMoreElements()) {
            String str = (String) OooO0O03.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
        OooO00o(outputStream, cArr, false);
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException, NoSuchAlgorithmException, CertificateException {
        IIlIi r0;
        char[] cArr;
        if (loadStoreParameter != null) {
            boolean z = loadStoreParameter instanceof IIlIi;
            if (z || (loadStoreParameter instanceof C5355IiL)) {
                if (z) {
                    r0 = (IIlIi) loadStoreParameter;
                } else {
                    C5355IiL iiL = (C5355IiL) loadStoreParameter;
                    r0 = new IIlIi(iiL.OooO00o(), loadStoreParameter.getProtectionParameter(), iiL.m15576OooO00o());
                }
                KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
                if (protectionParameter == null) {
                    cArr = null;
                } else if (protectionParameter instanceof KeyStore.PasswordProtection) {
                    cArr = ((KeyStore.PasswordProtection) protectionParameter).getPassword();
                } else {
                    throw new IllegalArgumentException("No support for protection parameter of type " + protectionParameter.getClass().getName());
                }
                OooO00o(r0.OooO00o(), cArr, r0.m15790OooO00o());
                return;
            }
            throw new IllegalArgumentException("No support for 'param' of type " + loadStoreParameter.getClass().getName());
        }
        throw new IllegalArgumentException("'param' arg cannot be null");
    }
}
