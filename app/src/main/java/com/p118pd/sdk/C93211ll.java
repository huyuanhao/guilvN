package com.p118pd.sdk;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.丨1丨ll丨  reason: invalid class name and case insensitive filesystem */
public class C93211ll {
    public static Hashtable OooO00o = new Hashtable();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Set f22828OooO00o = new HashSet();
    public static Hashtable OooO0O0 = new Hashtable();

    /* renamed from: com.pd.sdk.丨1丨ll丨$OooO00o */
    public static class OooO00o {
        public Object OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Provider f22829OooO00o;

        public OooO00o(Object obj, Provider provider) {
            this.OooO00o = obj;
            this.f22829OooO00o = provider;
        }

        public Object OooO00o() {
            return this.OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Provider m21357OooO00o() {
            return this.f22829OooO00o;
        }
    }

    static {
        OooO00o.put("MD2WITHRSAENCRYPTION", AbstractC5711LiLli.OooOoO);
        OooO00o.put("MD2WITHRSA", AbstractC5711LiLli.OooOoO);
        OooO00o.put("MD5WITHRSAENCRYPTION", AbstractC5711LiLli.OooOoo0);
        OooO00o.put("MD5WITHRSA", AbstractC5711LiLli.OooOoo0);
        OooO00o.put("SHA1WITHRSAENCRYPTION", AbstractC5711LiLli.OooOoo);
        OooO00o.put("SHA1WITHRSA", AbstractC5711LiLli.OooOoo);
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
        OooO00o.put("RIPEMD160WITHRSAENCRYPTION", AbstractC9468L1lL.OooO0o);
        OooO00o.put("RIPEMD160WITHRSA", AbstractC9468L1lL.OooO0o);
        OooO00o.put("RIPEMD128WITHRSAENCRYPTION", AbstractC9468L1lL.OooO0oO);
        OooO00o.put("RIPEMD128WITHRSA", AbstractC9468L1lL.OooO0oO);
        OooO00o.put("RIPEMD256WITHRSAENCRYPTION", AbstractC9468L1lL.OooO0oo);
        OooO00o.put("RIPEMD256WITHRSA", AbstractC9468L1lL.OooO0oo);
        OooO00o.put("SHA1WITHDSA", AbstractC5420Il1iIL.o00OoOoO);
        OooO00o.put("DSAWITHSHA1", AbstractC5420Il1iIL.o00OoOoO);
        OooO00o.put("SHA224WITHDSA", AbstractC5905LllI.OoooO);
        OooO00o.put("SHA256WITHDSA", AbstractC5905LllI.OoooOO0);
        OooO00o.put("SHA384WITHDSA", AbstractC5905LllI.o000oOoO);
        OooO00o.put("SHA512WITHDSA", AbstractC5905LllI.OoooOOO);
        OooO00o.put("SHA1WITHECDSA", AbstractC5420Il1iIL.o00O0o0);
        OooO00o.put("ECDSAWITHSHA1", AbstractC5420Il1iIL.o00O0o0);
        OooO00o.put("SHA224WITHECDSA", AbstractC5420Il1iIL.o00O0oO);
        OooO00o.put("SHA256WITHECDSA", AbstractC5420Il1iIL.o00O0oOO);
        OooO00o.put("SHA384WITHECDSA", AbstractC5420Il1iIL.o00O0oOo);
        OooO00o.put("SHA512WITHECDSA", AbstractC5420Il1iIL.o00O0oo0);
        OooO00o.put("GOST3411WITHGOST3410", AbstractC5331ILi.OooOOO);
        OooO00o.put("GOST3411WITHGOST3410-94", AbstractC5331ILi.OooOOO);
        OooO00o.put("GOST3411WITHECGOST3410", AbstractC5331ILi.OooOOOO);
        OooO00o.put("GOST3411WITHECGOST3410-2001", AbstractC5331ILi.OooOOOO);
        OooO00o.put("GOST3411WITHGOST3410-2001", AbstractC5331ILi.OooOOOO);
        f22828OooO00o.add(AbstractC5420Il1iIL.o00O0o0);
        f22828OooO00o.add(AbstractC5420Il1iIL.o00O0oO);
        f22828OooO00o.add(AbstractC5420Il1iIL.o00O0oOO);
        f22828OooO00o.add(AbstractC5420Il1iIL.o00O0oOo);
        f22828OooO00o.add(AbstractC5420Il1iIL.o00O0oo0);
        f22828OooO00o.add(AbstractC5420Il1iIL.o00OoOoO);
        f22828OooO00o.add(AbstractC5905LllI.OoooO);
        f22828OooO00o.add(AbstractC5905LllI.OoooOO0);
        f22828OooO00o.add(AbstractC5905LllI.o000oOoO);
        f22828OooO00o.add(AbstractC5905LllI.OoooOOO);
        f22828OooO00o.add(AbstractC5331ILi.OooOOO);
        f22828OooO00o.add(AbstractC5331ILi.OooOOOO);
        OooO0O0.put("SHA1WITHRSAANDMGF1", OooO00o(new C6456l1ilL(AbstractC9733l.OooO, C6452l1Lll.OooO00o), 20));
        OooO0O0.put("SHA224WITHRSAANDMGF1", OooO00o(new C6456l1ilL(AbstractC5905LllI.OooO0o, C6452l1Lll.OooO00o), 28));
        OooO0O0.put("SHA256WITHRSAANDMGF1", OooO00o(new C6456l1ilL(AbstractC5905LllI.OooO0OO, C6452l1Lll.OooO00o), 32));
        OooO0O0.put("SHA384WITHRSAANDMGF1", OooO00o(new C6456l1ilL(AbstractC5905LllI.OooO0Oo, C6452l1Lll.OooO00o), 48));
        OooO0O0.put("SHA512WITHRSAANDMGF1", OooO00o(new C6456l1ilL(AbstractC5905LllI.OooO0o0, C6452l1Lll.OooO00o), 64));
    }

    public static LlLI1 OooO00o(String str) {
        String OooO0O02 = Strings.OooO0O0(str);
        return OooO00o.containsKey(OooO0O02) ? (LlLI1) OooO00o.get(OooO0O02) : new LlLI1(OooO0O02);
    }

    public static C6456l1ilL OooO00o(LlLI1 llLI1, String str) {
        if (f22828OooO00o.contains(llLI1)) {
            return new C6456l1ilL(llLI1);
        }
        String OooO0O02 = Strings.OooO0O0(str);
        return OooO0O0.containsKey(OooO0O02) ? new C6456l1ilL(llLI1, (AbstractC6854lLi1LL) OooO0O0.get(OooO0O02)) : new C6456l1ilL(llLI1, C6452l1Lll.OooO00o);
    }

    public static C6692lii OooO00o(C6456l1ilL r5, int i) {
        return new C6692lii(r5, new C6456l1ilL(AbstractC5711LiLli.Oooo000, r5), new C6513lIiI((long) i), new C6513lIiI(1));
    }

    public static C6790lll1I11 OooO00o(X500Principal x500Principal) {
        try {
            return new C6790lll1I11(x500Principal.getEncoded());
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot convert principal");
        }
    }

    public static OooO00o OooO00o(String str, String str2) throws NoSuchAlgorithmException {
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            OooO00o OooO00o2 = OooO00o(str, Strings.OooO0O0(str2), providers[i]);
            if (OooO00o2 != null) {
                return OooO00o2;
            }
            try {
                OooO00o(str, str2, providers[i]);
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        throw new NoSuchAlgorithmException("cannot find implementation " + str2);
    }

    public static OooO00o OooO00o(String str, String str2, Provider provider) throws NoSuchAlgorithmException {
        String OooO0O02 = Strings.OooO0O0(str2);
        while (true) {
            String property = provider.getProperty("Alg.Alias." + str + C9058ooOoOoOO.OooOO0 + OooO0O02);
            if (property == null) {
                break;
            }
            OooO0O02 = property;
        }
        String property2 = provider.getProperty(str + C9058ooOoOoOO.OooOO0 + OooO0O02);
        if (property2 != null) {
            try {
                ClassLoader classLoader = provider.getClass().getClassLoader();
                return new OooO00o((classLoader != null ? classLoader.loadClass(property2) : Class.forName(property2)).newInstance(), provider);
            } catch (ClassNotFoundException unused) {
                throw new IllegalStateException("algorithm " + OooO0O02 + " in provider " + provider.getName() + " but no class \"" + property2 + "\" found!");
            } catch (Exception unused2) {
                throw new IllegalStateException("algorithm " + OooO0O02 + " in provider " + provider.getName() + " but class \"" + property2 + "\" inaccessible!");
            }
        } else {
            throw new NoSuchAlgorithmException("cannot find implementation " + OooO0O02 + " for provider " + provider.getName());
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Provider m21354OooO00o(String str) throws NoSuchProviderException {
        Provider provider = Security.getProvider(str);
        if (provider != null) {
            return provider;
        }
        throw new NoSuchProviderException("Provider " + str + " not found");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Signature m21355OooO00o(String str) throws NoSuchAlgorithmException {
        return Signature.getInstance(str);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Signature m21356OooO00o(String str, String str2) throws NoSuchProviderException, NoSuchAlgorithmException {
        return str2 != null ? Signature.getInstance(str, str2) : Signature.getInstance(str);
    }

    public static Iterator OooO00o() {
        Enumeration keys = OooO00o.keys();
        ArrayList arrayList = new ArrayList();
        while (keys.hasMoreElements()) {
            arrayList.add(keys.nextElement());
        }
        return arrayList.iterator();
    }

    public static byte[] OooO00o(LlLI1 llLI1, String str, String str2, PrivateKey privateKey, SecureRandom secureRandom, AbstractC6854lLi1LL r5) throws IOException, NoSuchProviderException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        if (llLI1 != null) {
            Signature OooO00o2 = m21356OooO00o(str, str2);
            if (secureRandom != null) {
                OooO00o2.initSign(privateKey, secureRandom);
            } else {
                OooO00o2.initSign(privateKey);
            }
            OooO00o2.update(r5.OooO0O0().OooO00o(AbstractC5533IiL.OooO00o));
            return OooO00o2.sign();
        }
        throw new IllegalStateException("no signature algorithm specified");
    }

    public static byte[] OooO00o(LlLI1 llLI1, String str, PrivateKey privateKey, SecureRandom secureRandom, AbstractC6854lLi1LL r4) throws IOException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        if (llLI1 != null) {
            Signature OooO00o2 = m21355OooO00o(str);
            if (secureRandom != null) {
                OooO00o2.initSign(privateKey, secureRandom);
            } else {
                OooO00o2.initSign(privateKey);
            }
            OooO00o2.update(r4.OooO0O0().OooO00o(AbstractC5533IiL.OooO00o));
            return OooO00o2.sign();
        }
        throw new IllegalStateException("no signature algorithm specified");
    }
}
