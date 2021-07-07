package org.bouncycastle.jce.provider;

import com.p118pd.sdk.AbstractC5416IilI;
import com.p118pd.sdk.AbstractC9477LILlL;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C6441l1II1;
import com.p118pd.sdk.C6443l1Il;
import com.p118pd.sdk.C6811l1;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.C7491o0OoOOO;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.p118pd.sdk.C9544L1l;
import com.p118pd.sdk.II11II;
import com.p118pd.sdk.II1ii1;
import com.p118pd.sdk.L1iiiiI;
import com.p118pd.sdk.LiIill;
import com.p118pd.sdk.LlLI1;
import com.p118pd.sdk.i1L1LL;
import com.p118pd.sdk.i1LILL1;
import com.p118pd.sdk.iIlIlLl;
import com.p118pd.sdk.l1I1L;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public final class BouncyCastleProvider extends Provider implements l1I1L {
    public static final AbstractC9477LILlL CONFIGURATION = new II11II();
    public static final Map OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String[] f23980OooO00o = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
    public static final String[] OooO0O0 = {"SipHash", "Poly1305"};
    public static final String[] OooO0OO = {"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015"};
    public static final String[] OooO0Oo = {"X509", "IES"};
    public static final String[] OooO0o = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564"};
    public static final String[] OooO0o0 = {"DSA", "DH", "EC", C7491o0OoOOO.OooO00o, "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM"};
    public static final String[] OooO0oO = {PROVIDER_NAME, "BCFKS", "PKCS12"};
    public static final String[] OooO0oo = {"DRBG"};
    public static final String PROVIDER_NAME = "BC";
    public static final String o0OO00O = "org.bouncycastle.jcajce.provider.keystore.";
    public static final String o0OOO0o = "org.bouncycastle.jcajce.provider.asymmetric.";
    public static final String o0Oo0oo = "org.bouncycastle.jcajce.provider.digest.";
    public static String o0ooOOo = "BouncyCastle Security Provider v1.60";
    public static final String o0ooOoO = "org.bouncycastle.jcajce.provider.symmetric.";
    public static final String oo0o0Oo = "org.bouncycastle.jcajce.provider.drbg.";

    public class OooO00o implements PrivilegedAction {
        public OooO00o() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            BouncyCastleProvider.this.OooO0OO();
            return null;
        }
    }

    public BouncyCastleProvider() {
        super(PROVIDER_NAME, 1.6d, o0ooOOo);
        AccessController.doPrivileged(new OooO00o());
    }

    public static AbstractC5416IilI OooO00o(LlLI1 llLI1) {
        AbstractC5416IilI r2;
        synchronized (OooO00o) {
            r2 = (AbstractC5416IilI) OooO00o.get(llLI1);
        }
        return r2;
    }

    private void OooO00o(String str, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            Class OooO00o2 = C6443l1Il.OooO00o(BouncyCastleProvider.class, str + strArr[i] + "$Mappings");
            if (OooO00o2 != null) {
                try {
                    ((II1ii1) OooO00o2.newInstance()).OooO00o(this);
                } catch (Exception e) {
                    throw new InternalError("cannot create instance of " + str + strArr[i] + "$Mappings : " + e);
                }
            }
        }
    }

    private void OooO0O0() {
        addKeyInfoConverter(L1iiiiI.OooOOo, new iIlIlLl());
        addKeyInfoConverter(L1iiiiI.OooOo0O, new i1LILL1());
        addKeyInfoConverter(L1iiiiI.OooOo0o, new i1L1LL());
        addKeyInfoConverter(L1iiiiI.OooOoo0, new C6441l1II1());
        addKeyInfoConverter(L1iiiiI.OooOOO0, new C9544L1l());
        addKeyInfoConverter(L1iiiiI.OooOOO, new LiIill());
        addKeyInfoConverter(L1iiiiI.OooO00o, new C6811l1());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO0OO() {
        OooO00o(o0Oo0oo, OooO0o);
        OooO00o(o0ooOoO, f23980OooO00o);
        OooO00o(o0ooOoO, OooO0O0);
        OooO00o(o0ooOoO, OooO0OO);
        OooO00o(o0OOO0o, OooO0Oo);
        OooO00o(o0OOO0o, OooO0o0);
        OooO00o(o0OO00O, OooO0oO);
        OooO00o(oo0o0Oo, OooO0oo);
        OooO0O0();
        put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
        put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
        put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }

    public static PrivateKey getPrivateKey(C5464IlilIi r1) throws IOException {
        AbstractC5416IilI OooO00o2 = OooO00o(r1.m15707OooO0O0().OooO00o());
        if (OooO00o2 == null) {
            return null;
        }
        return OooO00o2.OooO00o(r1);
    }

    public static PublicKey getPublicKey(C6888ll r1) throws IOException {
        AbstractC5416IilI OooO00o2 = OooO00o(r1.m18041OooO00o().OooO00o());
        if (OooO00o2 == null) {
            return null;
        }
        return OooO00o2.OooO00o(r1);
    }

    @Override // com.p118pd.sdk.l1I1L
    public void addAlgorithm(String str, LlLI1 llLI1, String str2) {
        addAlgorithm(str + C9058ooOoOoOO.OooOO0 + llLI1, str2);
        addAlgorithm(str + ".OID." + llLI1, str2);
    }

    @Override // com.p118pd.sdk.l1I1L
    public void addAlgorithm(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        throw new IllegalStateException("duplicate provider key (" + str + ") found");
    }

    @Override // com.p118pd.sdk.l1I1L
    public void addAttributes(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            String str3 = str + " " + str2;
            if (!containsKey(str3)) {
                put(str3, map.get(str2));
            } else {
                throw new IllegalStateException("duplicate provider attribute key (" + str3 + ") found");
            }
        }
    }

    @Override // com.p118pd.sdk.l1I1L
    public void addKeyInfoConverter(LlLI1 llLI1, AbstractC5416IilI r4) {
        synchronized (OooO00o) {
            OooO00o.put(llLI1, r4);
        }
    }

    @Override // com.p118pd.sdk.l1I1L
    public boolean hasAlgorithm(String str, String str2) {
        if (!containsKey(str + C9058ooOoOoOO.OooOO0 + str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Alg.Alias.");
            sb.append(str);
            sb.append(C9058ooOoOoOO.OooOO0);
            sb.append(str2);
            return containsKey(sb.toString());
        }
    }

    @Override // com.p118pd.sdk.l1I1L
    public void setParameter(String str, Object obj) {
        synchronized (CONFIGURATION) {
            ((II11II) CONFIGURATION).OooO00o(str, obj);
        }
    }
}
