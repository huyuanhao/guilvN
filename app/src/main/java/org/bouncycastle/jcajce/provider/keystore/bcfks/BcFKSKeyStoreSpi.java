package org.bouncycastle.jcajce.provider.keystore.bcfks;

import com.p118pd.sdk.AbstractC1680LI;
import com.p118pd.sdk.AbstractC5420Il1iIL;
import com.p118pd.sdk.AbstractC5702Li111;
import com.p118pd.sdk.AbstractC5711LiLli;
import com.p118pd.sdk.AbstractC5855LLl;
import com.p118pd.sdk.AbstractC5873LiliL1;
import com.p118pd.sdk.AbstractC5905LllI;
import com.p118pd.sdk.AbstractC6854lLi1LL;
import com.p118pd.sdk.AbstractC9733l;
import com.p118pd.sdk.C1675IL;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C5622LILlL;
import com.p118pd.sdk.C5764Ll1;
import com.p118pd.sdk.C5772LlIII;
import com.p118pd.sdk.C5789LlLL;
import com.p118pd.sdk.C5801LllI11;
import com.p118pd.sdk.C5805Ll1;
import com.p118pd.sdk.C6030i1i11;
import com.p118pd.sdk.C6140iIil;
import com.p118pd.sdk.C6249iiLi;
import com.p118pd.sdk.C6378iLI;
import com.p118pd.sdk.C6452l1Lll;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6579lLL;
import com.p118pd.sdk.C6642li1LI;
import com.p118pd.sdk.C6845lLIL;
import com.p118pd.sdk.C6928llIL;
import com.p118pd.sdk.C7491o0OoOOO;
import com.p118pd.sdk.C8775oo0ooo0;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.p118pd.sdk.C9545LI;
import com.p118pd.sdk.C9586iIILl;
import com.p118pd.sdk.C9661l1l;
import com.p118pd.sdk.C9725llI11I;
import com.p118pd.sdk.I11IIi;
import com.p118pd.sdk.IIllii;
import com.p118pd.sdk.IL1;
import com.p118pd.sdk.IL1iLI;
import com.p118pd.sdk.IilIllIl;
import com.p118pd.sdk.Il1iLLi;
import com.p118pd.sdk.LL;
import com.p118pd.sdk.LilIiIl;
import com.p118pd.sdk.LlLI1;
import com.p118pd.sdk.i1iI1LlI;
import com.p118pd.sdk.lI11lLL;
import com.p118pd.sdk.lILIiLL;
import com.p118pd.sdk.lLLL1iL;
import com.p118pd.sdk.li1Ii1i;
import com.p118pd.sdk.ll1IL1;
import com.umeng.message.proguard.C3848l;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.ParseException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Strings;

public class BcFKSKeyStoreSpi extends KeyStoreSpi {
    public static final BigInteger OooO00o = BigInteger.valueOf(0);
    public static final BigInteger OooO0O0 = BigInteger.valueOf(1);
    public static final BigInteger OooO0OO = BigInteger.valueOf(2);

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final Map<String, LlLI1> f23963OooO0OO = new HashMap();
    public static final BigInteger OooO0Oo = BigInteger.valueOf(3);

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final Map<LlLI1, String> f23964OooO0Oo = new HashMap();
    public static final BigInteger OooO0o0 = BigInteger.valueOf(4);

    /* renamed from: OooO00o  reason: collision with other field name */
    public Il1iLLi f23965OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f23966OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Date f23967OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map<String, IL1iLI> f23968OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final BouncyCastleProvider f23969OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Date f23970OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final Map<String, PrivateKey> f23971OooO0O0 = new HashMap();

    public static class ExtKeyStoreException extends KeyStoreException {
        public final Throwable cause;

        public ExtKeyStoreException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        public Throwable getCause() {
            return this.cause;
        }
    }

    public class OooO00o implements Enumeration {
        public final /* synthetic */ Iterator OooO00o;

        public OooO00o(Iterator it) {
            this.OooO00o = it;
        }

        public boolean hasMoreElements() {
            return this.OooO00o.hasNext();
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            return this.OooO00o.next();
        }
    }

    public static class OooO0O0 extends BcFKSKeyStoreSpi {
        public OooO0O0() {
            super(null);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return BcFKSKeyStoreSpi.super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return BcFKSKeyStoreSpi.super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return BcFKSKeyStoreSpi.super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return BcFKSKeyStoreSpi.super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return BcFKSKeyStoreSpi.super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return BcFKSKeyStoreSpi.super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            BcFKSKeyStoreSpi.super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return BcFKSKeyStoreSpi.super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            BcFKSKeyStoreSpi.super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            BcFKSKeyStoreSpi.super.engineStore(loadStoreParameter);
        }
    }

    public static class OooO0OO extends C9949OooO0Oo {
        public OooO0OO() {
            super(null);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return BcFKSKeyStoreSpi.super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return BcFKSKeyStoreSpi.super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.C9949OooO0Oo, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return BcFKSKeyStoreSpi.super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.C9949OooO0Oo, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return BcFKSKeyStoreSpi.super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return BcFKSKeyStoreSpi.super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            BcFKSKeyStoreSpi.super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return BcFKSKeyStoreSpi.super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            BcFKSKeyStoreSpi.super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            BcFKSKeyStoreSpi.super.engineStore(loadStoreParameter);
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$OooO0Oo  reason: case insensitive filesystem */
    public static class C9949OooO0Oo extends BcFKSKeyStoreSpi implements AbstractC5711LiLli, AbstractC5855LLl {
        public final byte[] OooO00o;
        public final Map<String, byte[]> OooO0o0;

        public C9949OooO0Oo(BouncyCastleProvider bouncyCastleProvider) {
            super(bouncyCastleProvider);
            try {
                this.OooO00o = new byte[32];
                if (bouncyCastleProvider != null) {
                    SecureRandom.getInstance(C8775oo0ooo0.f21953OooO00o, bouncyCastleProvider).nextBytes(this.OooO00o);
                } else {
                    SecureRandom.getInstance(C8775oo0ooo0.f21953OooO00o).nextBytes(this.OooO00o);
                }
                this.OooO0o0 = new HashMap();
            } catch (NoSuchAlgorithmException e) {
                throw new IllegalArgumentException("can't create cert factory - " + e.toString());
            }
        }

        private byte[] OooO00o(String str, char[] cArr) throws NoSuchAlgorithmException, InvalidKeyException {
            return C9661l1l.OooO0O0(cArr != null ? C9586iIILl.m21645OooO0O0(Strings.OooO0O0(cArr), Strings.m22987OooO0O0(str)) : C9586iIILl.m21645OooO0O0(this.OooO00o, Strings.m22987OooO0O0(str)), this.OooO00o, 16384, 8, 1, 32);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineDeleteEntry(String str) throws KeyStoreException {
            this.OooO0o0.remove(str);
            BcFKSKeyStoreSpi.super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            try {
                byte[] OooO00o2 = OooO00o(str, cArr);
                if (!this.OooO0o0.containsKey(str) || C9586iIILl.OooO0O0(this.OooO0o0.get(str), OooO00o2)) {
                    Key engineGetKey = BcFKSKeyStoreSpi.super.engineGetKey(str, cArr);
                    if (engineGetKey != null && !this.OooO0o0.containsKey(str)) {
                        this.OooO0o0.put(str, OooO00o2);
                    }
                    return engineGetKey;
                }
                throw new UnrecoverableKeyException("unable to recover key (" + str + C3848l.f10402t);
            } catch (InvalidKeyException e) {
                throw new UnrecoverableKeyException("unable to recover key (" + str + "): " + e.getMessage());
            }
        }
    }

    public static class OooO0o extends C9949OooO0Oo {
        public OooO0o() {
            super(new BouncyCastleProvider());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return BcFKSKeyStoreSpi.super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return BcFKSKeyStoreSpi.super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.C9949OooO0Oo, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return BcFKSKeyStoreSpi.super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.C9949OooO0Oo, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return BcFKSKeyStoreSpi.super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return BcFKSKeyStoreSpi.super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            BcFKSKeyStoreSpi.super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return BcFKSKeyStoreSpi.super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            BcFKSKeyStoreSpi.super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            BcFKSKeyStoreSpi.super.engineStore(loadStoreParameter);
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$OooO0o0  reason: case insensitive filesystem */
    public static class C9950OooO0o0 extends BcFKSKeyStoreSpi {
        public C9950OooO0o0() {
            super(new BouncyCastleProvider());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return BcFKSKeyStoreSpi.super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return BcFKSKeyStoreSpi.super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return BcFKSKeyStoreSpi.super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return BcFKSKeyStoreSpi.super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return BcFKSKeyStoreSpi.super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return BcFKSKeyStoreSpi.super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return BcFKSKeyStoreSpi.super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            BcFKSKeyStoreSpi.super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            BcFKSKeyStoreSpi.super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return BcFKSKeyStoreSpi.super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            BcFKSKeyStoreSpi.super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            BcFKSKeyStoreSpi.super.engineStore(loadStoreParameter);
        }
    }

    static {
        f23963OooO0OO.put("DESEDE", AbstractC9733l.OooO0oo);
        f23963OooO0OO.put("TRIPLEDES", AbstractC9733l.OooO0oo);
        f23963OooO0OO.put("TDEA", AbstractC9733l.OooO0oo);
        f23963OooO0OO.put("HMACSHA1", AbstractC5711LiLli.Oooooo);
        f23963OooO0OO.put("HMACSHA224", AbstractC5711LiLli.OoooooO);
        f23963OooO0OO.put("HMACSHA256", AbstractC5711LiLli.Ooooooo);
        f23963OooO0OO.put("HMACSHA384", AbstractC5711LiLli.o0OoOo0);
        f23963OooO0OO.put("HMACSHA512", AbstractC5711LiLli.ooOO);
        f23963OooO0OO.put("SEED", ll1IL1.OooO00o);
        f23963OooO0OO.put("CAMELLIA.128", lILIiLL.OooO00o);
        f23963OooO0OO.put("CAMELLIA.192", lILIiLL.OooO0O0);
        f23963OooO0OO.put("CAMELLIA.256", lILIiLL.OooO0OO);
        f23963OooO0OO.put("ARIA.128", AbstractC1680LI.OooO0oo);
        f23963OooO0OO.put("ARIA.192", AbstractC1680LI.OooOOO0);
        f23963OooO0OO.put("ARIA.256", AbstractC1680LI.OooOOo);
        f23964OooO0Oo.put(AbstractC5711LiLli.OooOoO0, C7491o0OoOOO.OooO00o);
        f23964OooO0Oo.put(AbstractC5420Il1iIL.o00O0o0o, "EC");
        f23964OooO0Oo.put(AbstractC9733l.OooOO0o, "DH");
        f23964OooO0Oo.put(AbstractC5711LiLli.Oooo, "DH");
        f23964OooO0Oo.put(AbstractC5420Il1iIL.o00OOooo, "DSA");
    }

    public BcFKSKeyStoreSpi(BouncyCastleProvider bouncyCastleProvider) {
        this.f23969OooO00o = bouncyCastleProvider;
    }

    private I11IIi OooO00o(C6845lLIL r4, Certificate[] certificateArr) throws CertificateEncodingException {
        LilIiIl[] lilIiIlArr = new LilIiIl[certificateArr.length];
        for (int i = 0; i != certificateArr.length; i++) {
            lilIiIlArr[i] = LilIiIl.OooO00o(certificateArr[i].getEncoded());
        }
        return new I11IIi(r4, lilIiIlArr);
    }

    private Il1iLLi OooO00o(Il1iLLi il1iLLi, int i) {
        boolean equals = AbstractC5702Li111.Oooo0o0.equals(il1iLLi.OooO00o());
        AbstractC6854lLi1LL OooO0O02 = il1iLLi.m15646OooO0O0();
        if (equals) {
            C5789LlLL OooO00o2 = C5789LlLL.OooO00o(OooO0O02);
            byte[] bArr = new byte[OooO00o2.m16388OooO00o().length];
            OooO00o().nextBytes(bArr);
            return new Il1iLLi(AbstractC5702Li111.Oooo0o0, new C5789LlLL(bArr, OooO00o2.m16389OooO0O0(), OooO00o2.OooO00o(), OooO00o2.OooO0Oo(), BigInteger.valueOf((long) i)));
        }
        C5772LlIII OooO00o3 = C5772LlIII.OooO00o(OooO0O02);
        byte[] bArr2 = new byte[OooO00o3.m16367OooO00o().length];
        OooO00o().nextBytes(bArr2);
        return new Il1iLLi(AbstractC5711LiLli.OoooOo0, new C5772LlIII(bArr2, OooO00o3.m16365OooO00o().intValue(), i, OooO00o3.OooO00o()));
    }

    private Il1iLLi OooO00o(LlLI1 llLI1, int i) {
        byte[] bArr = new byte[64];
        OooO00o().nextBytes(bArr);
        if (AbstractC5711LiLli.OoooOo0.equals(llLI1)) {
            return new Il1iLLi(AbstractC5711LiLli.OoooOo0, new C5772LlIII(bArr, i1iI1LlI.o0ooOoO, i, new C6456l1ilL(AbstractC5711LiLli.ooOO, C6452l1Lll.OooO00o)));
        }
        throw new IllegalStateException("unknown derivation algorithm: " + llLI1);
    }

    private Il1iLLi OooO00o(AbstractC5873LiliL1 r8, int i) {
        if (AbstractC5702Li111.Oooo0o0.equals(r8.OooO00o())) {
            C6030i1i11 i1i11 = (C6030i1i11) r8;
            byte[] bArr = new byte[i1i11.OooO0Oo()];
            OooO00o().nextBytes(bArr);
            return new Il1iLLi(AbstractC5702Li111.Oooo0o0, new C5789LlLL(bArr, i1i11.OooO0O0(), i1i11.OooO00o(), i1i11.OooO0OO(), i));
        }
        C6140iIil r82 = (C6140iIil) r8;
        byte[] bArr2 = new byte[r82.OooO0O0()];
        OooO00o().nextBytes(bArr2);
        return new Il1iLLi(AbstractC5711LiLli.OoooOo0, new C5772LlIII(bArr2, r82.OooO00o(), i, r82.m17042OooO00o()));
    }

    public static String OooO00o(LlLI1 llLI1) {
        String str = f23964OooO0Oo.get(llLI1);
        return str != null ? str : llLI1.m16387OooO0O0();
    }

    private SecureRandom OooO00o() {
        return IIllii.OooO00o();
    }

    private Certificate OooO00o(Object obj) {
        BouncyCastleProvider bouncyCastleProvider = this.f23969OooO00o;
        if (bouncyCastleProvider != null) {
            try {
                return CertificateFactory.getInstance("X.509", bouncyCastleProvider).generateCertificate(new ByteArrayInputStream(LilIiIl.OooO00o(obj).getEncoded()));
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(LilIiIl.OooO00o(obj).getEncoded()));
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    private Date OooO00o(IL1iLI r1, Date date) {
        try {
            return r1.OooO00o().OooO00o();
        } catch (ParseException unused) {
            return date;
        }
    }

    private Cipher OooO00o(String str, byte[] bArr) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
        BouncyCastleProvider bouncyCastleProvider = this.f23969OooO00o;
        Cipher instance = bouncyCastleProvider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, bouncyCastleProvider);
        instance.init(1, new SecretKeySpec(bArr, "AES"));
        return instance;
    }

    private void OooO00o(byte[] bArr, IL1 il1, char[] cArr) throws NoSuchAlgorithmException, IOException {
        if (!C9586iIILl.OooO0O0(OooO00o(bArr, il1.m15465OooO00o(), il1.OooO00o(), cArr), il1.m15466OooO00o())) {
            throw new IOException("BCFKS KeyStore corrupted: MAC calculation failed.");
        }
    }

    private byte[] OooO00o(Il1iLLi il1iLLi, String str, char[] cArr, int i) throws IOException {
        byte[] OooO00o2 = lLLL1iL.OooO00o(cArr);
        byte[] OooO00o3 = lLLL1iL.OooO00o(str.toCharArray());
        if (AbstractC5702Li111.Oooo0o0.equals(il1iLLi.OooO00o())) {
            C5789LlLL OooO00o4 = C5789LlLL.OooO00o(il1iLLi.m15646OooO0O0());
            if (OooO00o4.OooO0OO() != null) {
                i = OooO00o4.OooO0OO().intValue();
            } else if (i == -1) {
                throw new IOException("no keyLength found in ScryptParams");
            }
            return C9661l1l.OooO0O0(C9586iIILl.m21645OooO0O0(OooO00o2, OooO00o3), OooO00o4.m16388OooO00o(), OooO00o4.m16389OooO0O0().intValue(), OooO00o4.OooO00o().intValue(), OooO00o4.OooO00o().intValue(), i);
        } else if (il1iLLi.OooO00o().equals(AbstractC5711LiLli.OoooOo0)) {
            C5772LlIII OooO00o5 = C5772LlIII.OooO00o(il1iLLi.m15646OooO0O0());
            if (OooO00o5.m16368OooO0O0() != null) {
                i = OooO00o5.m16368OooO0O0().intValue();
            } else if (i == -1) {
                throw new IOException("no keyLength found in PBKDF2Params");
            }
            if (OooO00o5.OooO00o().OooO00o().equals(AbstractC5711LiLli.ooOO)) {
                C6928llIL r0 = new C6928llIL(new C5622LILlL());
                r0.OooO00o(C9586iIILl.m21645OooO0O0(OooO00o2, OooO00o3), OooO00o5.m16367OooO00o(), OooO00o5.m16365OooO00o().intValue());
                return ((C6642li1LI) r0.OooO0O0(i * 8)).OooO00o();
            } else if (OooO00o5.OooO00o().OooO00o().equals(AbstractC5905LllI.OooOOo)) {
                C6928llIL r02 = new C6928llIL(new C6249iiLi(512));
                r02.OooO00o(C9586iIILl.m21645OooO0O0(OooO00o2, OooO00o3), OooO00o5.m16367OooO00o(), OooO00o5.m16365OooO00o().intValue());
                return ((C6642li1LI) r02.OooO0O0(i * 8)).OooO00o();
            } else {
                throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD PRF: " + OooO00o5.OooO00o().OooO00o());
            }
        } else {
            throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD.");
        }
    }

    private byte[] OooO00o(String str, C6456l1ilL r6, char[] cArr, byte[] bArr) throws IOException {
        Cipher cipher;
        if (r6.OooO00o().equals(AbstractC5711LiLli.OoooOOo)) {
            C9545LI OooO00o2 = C9545LI.OooO00o(r6.m17587OooO0O0());
            C6579lLL OooO00o3 = OooO00o2.m21604OooO00o();
            try {
                AlgorithmParameters algorithmParameters = null;
                if (OooO00o3.OooO00o().equals(AbstractC5905LllI.Oooo)) {
                    if (this.f23969OooO00o == null) {
                        cipher = Cipher.getInstance("AES/CCM/NoPadding");
                        algorithmParameters = AlgorithmParameters.getInstance("CCM");
                    } else {
                        cipher = Cipher.getInstance("AES/CCM/NoPadding", this.f23969OooO00o);
                        algorithmParameters = AlgorithmParameters.getInstance("CCM", this.f23969OooO00o);
                    }
                    algorithmParameters.init(C1675IL.OooO00o(OooO00o3.m17683OooO0O0()).getEncoded());
                } else if (OooO00o3.OooO00o().equals(AbstractC5905LllI.OoooO00)) {
                    cipher = this.f23969OooO00o == null ? Cipher.getInstance("AESKWP") : Cipher.getInstance("AESKWP", this.f23969OooO00o);
                } else {
                    throw new IOException("BCFKS KeyStore cannot recognize protection encryption algorithm.");
                }
                Il1iLLi OooO00o4 = OooO00o2.OooO00o();
                if (cArr == null) {
                    cArr = new char[0];
                }
                cipher.init(2, new SecretKeySpec(OooO00o(OooO00o4, str, cArr, 32), "AES"), algorithmParameters);
                return cipher.doFinal(bArr);
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException(e2.toString());
            }
        } else {
            throw new IOException("BCFKS KeyStore cannot recognize protection algorithm.");
        }
    }

    private byte[] OooO00o(byte[] bArr, C6456l1ilL r6, Il1iLLi il1iLLi, char[] cArr) throws NoSuchAlgorithmException, IOException {
        String OooO0O02 = r6.OooO00o().m16387OooO0O0();
        BouncyCastleProvider bouncyCastleProvider = this.f23969OooO00o;
        Mac instance = bouncyCastleProvider != null ? Mac.getInstance(OooO0O02, bouncyCastleProvider) : Mac.getInstance(OooO0O02);
        try {
            if (cArr == null) {
                cArr = new char[0];
            }
            instance.init(new SecretKeySpec(OooO00o(il1iLLi, "INTEGRITY_CHECK", cArr, -1), OooO0O02));
            return instance.doFinal(bArr);
        } catch (InvalidKeyException e) {
            throw new IOException("Cannot set up MAC calculation: " + e.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration<String> engineAliases() {
        return new OooO00o(new HashSet(this.f23968OooO00o.keySet()).iterator());
    }

    public boolean engineContainsAlias(String str) {
        if (str != null) {
            return this.f23968OooO00o.containsKey(str);
        }
        throw new NullPointerException("alias value is null");
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws KeyStoreException {
        if (this.f23968OooO00o.get(str) != null) {
            this.f23971OooO0O0.remove(str);
            this.f23968OooO00o.remove(str);
            this.f23970OooO0O0 = new Date();
        }
    }

    public Certificate engineGetCertificate(String str) {
        IL1iLI r3 = this.f23968OooO00o.get(str);
        if (r3 == null) {
            return null;
        }
        if (r3.m21426OooO00o().equals(OooO0O0) || r3.m21426OooO00o().equals(OooO0Oo)) {
            return OooO00o(I11IIi.OooO00o(r3.m21427OooO00o()).m15214OooO00o()[0]);
        }
        if (r3.m21426OooO00o().equals(OooO00o)) {
            return OooO00o(r3.m21427OooO00o());
        }
        return null;
    }

    public String engineGetCertificateAlias(Certificate certificate) {
        if (certificate == null) {
            return null;
        }
        try {
            byte[] encoded = certificate.getEncoded();
            for (String str : this.f23968OooO00o.keySet()) {
                IL1iLI r3 = this.f23968OooO00o.get(str);
                if (r3.m21426OooO00o().equals(OooO00o)) {
                    if (C9586iIILl.m21627OooO00o(r3.m21427OooO00o(), encoded)) {
                        return str;
                    }
                } else if (r3.m21426OooO00o().equals(OooO0O0) || r3.m21426OooO00o().equals(OooO0Oo)) {
                    try {
                        if (C9586iIILl.m21627OooO00o(I11IIi.OooO00o(r3.m21427OooO00o()).m15214OooO00o()[0].m16323OooO0O0().getEncoded(), encoded)) {
                            return str;
                        }
                    } catch (IOException unused) {
                        continue;
                    }
                }
            }
        } catch (CertificateEncodingException unused2) {
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.security.cert.X509Certificate[] */
    /* JADX WARN: Multi-variable type inference failed */
    public Certificate[] engineGetCertificateChain(String str) {
        IL1iLI r5 = this.f23968OooO00o.get(str);
        if (r5 == null) {
            return null;
        }
        if (!(r5.m21426OooO00o().equals(OooO0O0) || r5.m21426OooO00o().equals(OooO0Oo))) {
            return null;
        }
        LilIiIl[] OooO00o2 = I11IIi.OooO00o(r5.m21427OooO00o()).m15214OooO00o();
        int length = OooO00o2.length;
        X509Certificate[] x509CertificateArr = new X509Certificate[length];
        for (int i = 0; i != length; i++) {
            x509CertificateArr[i] = OooO00o(OooO00o2[i]);
        }
        return x509CertificateArr;
    }

    public Date engineGetCreationDate(String str) {
        IL1iLI r2 = this.f23968OooO00o.get(str);
        if (r2 == null) {
            return null;
        }
        try {
            return r2.m21428OooO0O0().OooO00o();
        } catch (ParseException unused) {
            return new Date();
        }
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        IL1iLI r0 = this.f23968OooO00o.get(str);
        if (r0 == null) {
            return null;
        }
        if (r0.m21426OooO00o().equals(OooO0O0) || r0.m21426OooO00o().equals(OooO0Oo)) {
            PrivateKey privateKey = this.f23971OooO0O0.get(str);
            if (privateKey != null) {
                return privateKey;
            }
            C6845lLIL OooO00o2 = C6845lLIL.OooO00o(I11IIi.OooO00o(r0.m21427OooO00o()).OooO00o());
            try {
                C5464IlilIi OooO00o3 = C5464IlilIi.OooO00o(OooO00o("PRIVATE_KEY_ENCRYPTION", OooO00o2.OooO00o(), cArr, OooO00o2.m17992OooO00o()));
                PrivateKey generatePrivate = (this.f23969OooO00o != null ? KeyFactory.getInstance(OooO00o3.m15707OooO0O0().OooO00o().m16387OooO0O0(), this.f23969OooO00o) : KeyFactory.getInstance(OooO00o(OooO00o3.m15707OooO0O0().OooO00o()))).generatePrivate(new PKCS8EncodedKeySpec(OooO00o3.getEncoded()));
                this.f23971OooO0O0.put(str, generatePrivate);
                return generatePrivate;
            } catch (Exception e) {
                throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover private key (" + str + "): " + e.getMessage());
            }
        } else if (r0.m21426OooO00o().equals(OooO0OO) || r0.m21426OooO00o().equals(OooO0o0)) {
            LL OooO00o4 = LL.OooO00o(r0.m21427OooO00o());
            try {
                C5764Ll1 OooO00o5 = C5764Ll1.OooO00o(OooO00o("SECRET_KEY_ENCRYPTION", OooO00o4.OooO00o(), cArr, OooO00o4.m16253OooO00o()));
                return (this.f23969OooO00o != null ? SecretKeyFactory.getInstance(OooO00o5.OooO00o().m16387OooO0O0(), this.f23969OooO00o) : SecretKeyFactory.getInstance(OooO00o5.OooO00o().m16387OooO0O0())).generateSecret(new SecretKeySpec(OooO00o5.m16354OooO00o(), OooO00o5.OooO00o().m16387OooO0O0()));
            } catch (Exception e2) {
                throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover secret key (" + str + "): " + e2.getMessage());
            }
        } else {
            throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover secret key (" + str + "): type not recognized");
        }
    }

    public boolean engineIsCertificateEntry(String str) {
        IL1iLI r2 = this.f23968OooO00o.get(str);
        if (r2 != null) {
            return r2.m21426OooO00o().equals(OooO00o);
        }
        return false;
    }

    public boolean engineIsKeyEntry(String str) {
        IL1iLI r3 = this.f23968OooO00o.get(str);
        if (r3 == null) {
            return false;
        }
        BigInteger OooO00o2 = r3.m21426OooO00o();
        return OooO00o2.equals(OooO0O0) || OooO00o2.equals(OooO0OO) || OooO00o2.equals(OooO0Oo) || OooO00o2.equals(OooO0o0);
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
        C6378iLI r3;
        this.f23968OooO00o.clear();
        this.f23971OooO0O0.clear();
        this.f23967OooO00o = null;
        this.f23970OooO0O0 = null;
        this.f23966OooO00o = null;
        if (inputStream == null) {
            Date date = new Date();
            this.f23967OooO00o = date;
            this.f23970OooO0O0 = date;
            this.f23966OooO00o = new C6456l1ilL(AbstractC5711LiLli.ooOO, C6452l1Lll.OooO00o);
            this.f23965OooO00o = OooO00o(AbstractC5711LiLli.OoooOo0, 64);
            return;
        }
        try {
            lI11lLL OooO00o2 = lI11lLL.OooO00o(new C5805Ll1(inputStream).OooO00o());
            C5801LllI11 OooO00o3 = OooO00o2.OooO00o();
            if (OooO00o3.OooO0O0() == 0) {
                IL1 OooO00o4 = IL1.OooO00o(OooO00o3.OooO00o());
                this.f23966OooO00o = OooO00o4.m15465OooO00o();
                this.f23965OooO00o = OooO00o4.OooO00o();
                OooO00o(OooO00o2.m17612OooO0O0().OooO0O0().getEncoded(), OooO00o4, cArr);
                AbstractC6854lLi1LL OooO0O02 = OooO00o2.m17612OooO0O0();
                if (OooO0O02 instanceof C9725llI11I) {
                    C9725llI11I r32 = (C9725llI11I) OooO0O02;
                    r3 = C6378iLI.OooO00o(OooO00o("STORE_ENCRYPTION", r32.OooO00o(), cArr, r32.m21770OooO00o().m17938OooO00o()));
                } else {
                    r3 = C6378iLI.OooO00o(OooO0O02);
                }
                try {
                    this.f23967OooO00o = r3.m17491OooO00o().OooO00o();
                    this.f23970OooO0O0 = r3.m17494OooO0O0().OooO00o();
                    if (r3.OooO00o().equals(this.f23966OooO00o)) {
                        Iterator<AbstractC6854lLi1LL> it = r3.m17492OooO00o().iterator();
                        while (it.hasNext()) {
                            IL1iLI OooO00o5 = IL1iLI.OooO00o(it.next());
                            this.f23968OooO00o.put(OooO00o5.OooO0OO(), OooO00o5);
                        }
                        return;
                    }
                    throw new IOException("BCFKS KeyStore storeData integrity algorithm does not match store integrity algorithm.");
                } catch (ParseException unused) {
                    throw new IOException("BCFKS KeyStore unable to parse store data information.");
                }
            } else {
                throw new IOException("BCFKS KeyStore unable to recognize integrity check.");
            }
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        Date date;
        IL1iLI r0 = this.f23968OooO00o.get(str);
        Date date2 = new Date();
        if (r0 == null) {
            date = date2;
        } else if (r0.m21426OooO00o().equals(OooO00o)) {
            date = OooO00o(r0, date2);
        } else {
            throw new KeyStoreException("BCFKS KeyStore already has a key entry with alias " + str);
        }
        try {
            this.f23968OooO00o.put(str, new IL1iLI(OooO00o, str, date, date2, certificate.getEncoded(), null));
            this.f23970OooO0O0 = date2;
        } catch (CertificateEncodingException e) {
            throw new ExtKeyStoreException("BCFKS KeyStore unable to handle certificate: " + e.getMessage(), e);
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        C5764Ll1 ll1;
        Date date = new Date();
        IL1iLI r0 = this.f23968OooO00o.get(str);
        Date OooO00o2 = r0 != null ? OooO00o(r0, date) : date;
        this.f23971OooO0O0.remove(str);
        if (key instanceof PrivateKey) {
            if (certificateArr != null) {
                try {
                    byte[] encoded = key.getEncoded();
                    Il1iLLi OooO00o3 = OooO00o(AbstractC5711LiLli.OoooOo0, 32);
                    if (cArr == null) {
                        cArr = new char[0];
                    }
                    Cipher OooO00o4 = OooO00o("AES/CCM/NoPadding", OooO00o(OooO00o3, "PRIVATE_KEY_ENCRYPTION", cArr, 32));
                    byte[] doFinal = OooO00o4.doFinal(encoded);
                    AlgorithmParameters parameters = OooO00o4.getParameters();
                    this.f23968OooO00o.put(str, new IL1iLI(OooO0O0, str, OooO00o2, date, OooO00o(new C6845lLIL(new C6456l1ilL(AbstractC5711LiLli.OoooOOo, parameters != null ? new C9545LI(OooO00o3, new C6579lLL(AbstractC5905LllI.Oooo, C1675IL.OooO00o(parameters.getEncoded()))) : new C9545LI(OooO00o3, new C6579lLL(AbstractC5905LllI.OoooO00, null))), doFinal), certificateArr).getEncoded(), null));
                } catch (Exception e) {
                    throw new ExtKeyStoreException("BCFKS KeyStore exception storing private key: " + e.toString(), e);
                }
            } else {
                throw new KeyStoreException("BCFKS KeyStore requires a certificate chain for private key storage.");
            }
        } else if (!(key instanceof SecretKey)) {
            throw new KeyStoreException("BCFKS KeyStore unable to recognize key.");
        } else if (certificateArr == null) {
            try {
                byte[] encoded2 = key.getEncoded();
                Il1iLLi OooO00o5 = OooO00o(AbstractC5711LiLli.OoooOo0, 32);
                if (cArr == null) {
                    cArr = new char[0];
                }
                Cipher OooO00o6 = OooO00o("AES/CCM/NoPadding", OooO00o(OooO00o5, "SECRET_KEY_ENCRYPTION", cArr, 32));
                String OooO0O02 = Strings.OooO0O0(key.getAlgorithm());
                if (OooO0O02.indexOf("AES") > -1) {
                    ll1 = new C5764Ll1(AbstractC5905LllI.OooOOoo, encoded2);
                } else {
                    LlLI1 llLI1 = f23963OooO0OO.get(OooO0O02);
                    if (llLI1 != null) {
                        ll1 = new C5764Ll1(llLI1, encoded2);
                    } else {
                        Map<String, LlLI1> map = f23963OooO0OO;
                        LlLI1 llLI12 = map.get(OooO0O02 + C9058ooOoOoOO.OooOO0 + (encoded2.length * 8));
                        if (llLI12 != null) {
                            ll1 = new C5764Ll1(llLI12, encoded2);
                        } else {
                            throw new KeyStoreException("BCFKS KeyStore cannot recognize secret key (" + OooO0O02 + ") for storage.");
                        }
                    }
                }
                byte[] doFinal2 = OooO00o6.doFinal(ll1.getEncoded());
                AlgorithmParameters parameters2 = OooO00o6.getParameters();
                this.f23968OooO00o.put(str, new IL1iLI(OooO0OO, str, OooO00o2, date, new LL(new C6456l1ilL(AbstractC5711LiLli.OoooOOo, parameters2 != null ? new C9545LI(OooO00o5, new C6579lLL(AbstractC5905LllI.Oooo, C1675IL.OooO00o(parameters2.getEncoded()))) : new C9545LI(OooO00o5, new C6579lLL(AbstractC5905LllI.OoooO00, null))), doFinal2).getEncoded(), null));
            } catch (Exception e2) {
                throw new ExtKeyStoreException("BCFKS KeyStore exception storing private key: " + e2.toString(), e2);
            }
        } else {
            throw new KeyStoreException("BCFKS KeyStore cannot store certificate chain with secret key.");
        }
        this.f23970OooO0O0 = date;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        Date date = new Date();
        IL1iLI r0 = this.f23968OooO00o.get(str);
        Date OooO00o2 = r0 != null ? OooO00o(r0, date) : date;
        if (certificateArr != null) {
            try {
                C6845lLIL OooO00o3 = C6845lLIL.OooO00o(bArr);
                try {
                    this.f23971OooO0O0.remove(str);
                    this.f23968OooO00o.put(str, new IL1iLI(OooO0Oo, str, OooO00o2, date, OooO00o(OooO00o3, certificateArr).getEncoded(), null));
                } catch (Exception e) {
                    throw new ExtKeyStoreException("BCFKS KeyStore exception storing protected private key: " + e.toString(), e);
                }
            } catch (Exception e2) {
                throw new ExtKeyStoreException("BCFKS KeyStore private key encoding must be an EncryptedPrivateKeyInfo.", e2);
            }
        } else {
            try {
                this.f23968OooO00o.put(str, new IL1iLI(OooO0o0, str, OooO00o2, date, bArr, null));
            } catch (Exception e3) {
                throw new ExtKeyStoreException("BCFKS KeyStore exception storing protected private key: " + e3.toString(), e3);
            }
        }
        this.f23970OooO0O0 = date;
    }

    public int engineSize() {
        return this.f23968OooO00o.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
        Il1iLLi il1iLLi;
        BigInteger bigInteger;
        IL1iLI[] r0 = (IL1iLI[]) this.f23968OooO00o.values().toArray(new IL1iLI[this.f23968OooO00o.size()]);
        Il1iLLi OooO00o2 = OooO00o(this.f23965OooO00o, 32);
        byte[] OooO00o3 = OooO00o(OooO00o2, "STORE_ENCRYPTION", cArr != null ? cArr : new char[0], 32);
        C6378iLI r9 = new C6378iLI(this.f23966OooO00o, this.f23967OooO00o, this.f23970OooO0O0, new li1Ii1i(r0), null);
        try {
            Cipher instance = this.f23969OooO00o == null ? Cipher.getInstance("AES/CCM/NoPadding") : Cipher.getInstance("AES/CCM/NoPadding", this.f23969OooO00o);
            instance.init(1, new SecretKeySpec(OooO00o3, "AES"));
            C9725llI11I r02 = new C9725llI11I(new C6456l1ilL(AbstractC5711LiLli.OoooOOo, new C9545LI(OooO00o2, new C6579lLL(AbstractC5905LllI.Oooo, C1675IL.OooO00o(instance.getParameters().getEncoded())))), instance.doFinal(r9.getEncoded()));
            if (AbstractC5702Li111.Oooo0o0.equals(this.f23965OooO00o.OooO00o())) {
                C5789LlLL OooO00o4 = C5789LlLL.OooO00o(this.f23965OooO00o.m15646OooO0O0());
                il1iLLi = this.f23965OooO00o;
                bigInteger = OooO00o4.OooO0OO();
            } else {
                C5772LlIII OooO00o5 = C5772LlIII.OooO00o(this.f23965OooO00o.m15646OooO0O0());
                il1iLLi = this.f23965OooO00o;
                bigInteger = OooO00o5.m16368OooO0O0();
            }
            this.f23965OooO00o = OooO00o(il1iLLi, bigInteger.intValue());
            outputStream.write(new lI11lLL(r02, new C5801LllI11(new IL1(this.f23966OooO00o, this.f23965OooO00o, OooO00o(r02.getEncoded(), this.f23966OooO00o, this.f23965OooO00o, cArr)))).getEncoded());
            outputStream.flush();
        } catch (NoSuchPaddingException e) {
            throw new NoSuchAlgorithmException(e.toString());
        } catch (BadPaddingException e2) {
            throw new IOException(e2.toString());
        } catch (IllegalBlockSizeException e3) {
            throw new IOException(e3.toString());
        } catch (InvalidKeyException e4) {
            throw new IOException(e4.toString());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
        char[] cArr;
        if (loadStoreParameter == null) {
            throw new IllegalArgumentException("'parameter' arg cannot be null");
        } else if (loadStoreParameter instanceof IilIllIl) {
            IilIllIl iilIllIl = (IilIllIl) loadStoreParameter;
            KeyStore.ProtectionParameter protectionParameter = iilIllIl.getProtectionParameter();
            if (protectionParameter == null) {
                cArr = null;
            } else if (protectionParameter instanceof KeyStore.PasswordProtection) {
                cArr = ((KeyStore.PasswordProtection) protectionParameter).getPassword();
            } else if (protectionParameter instanceof KeyStore.CallbackHandlerProtection) {
                CallbackHandler callbackHandler = ((KeyStore.CallbackHandlerProtection) protectionParameter).getCallbackHandler();
                PasswordCallback passwordCallback = new PasswordCallback("password: ", false);
                try {
                    callbackHandler.handle(new Callback[]{passwordCallback});
                    cArr = passwordCallback.getPassword();
                } catch (UnsupportedCallbackException e) {
                    throw new IllegalArgumentException("PasswordCallback not recognised: " + e.getMessage(), e);
                }
            } else {
                throw new IllegalArgumentException("no support for protection parameter of type " + protectionParameter.getClass().getName());
            }
            iilIllIl.OooO00o().OooO00o().equals(AbstractC5702Li111.Oooo0o0);
            this.f23965OooO00o = OooO00o(iilIllIl.OooO00o(), 64);
            engineStore(iilIllIl.m15627OooO00o(), cArr);
        } else {
            throw new IllegalArgumentException("no support for 'parameter' of type " + loadStoreParameter.getClass().getName());
        }
    }
}
