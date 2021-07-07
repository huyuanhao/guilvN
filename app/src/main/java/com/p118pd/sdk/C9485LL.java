package com.p118pd.sdk;

import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CRL;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertStore;
import java.security.cert.CertificateException;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Set;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.丨LL  reason: invalid class name and case insensitive filesystem */
public class C9485LL {

    /* renamed from: com.pd.sdk.丨LL$OooO00o */
    public static class OooO00o implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* renamed from: com.pd.sdk.丨LL$OooO0O0 */
    public static class OooO0O0 implements X509TrustManager {
        public final /* synthetic */ Set OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ CRL[] f23056OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ X509Certificate[] f23057OooO00o;

        public OooO0O0(Set set, CRL[] crlArr, X509Certificate[] x509CertificateArr) {
            this.OooO00o = set;
            this.f23056OooO00o = crlArr;
            this.f23057OooO00o = x509CertificateArr;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            try {
                CertStore instance = CertStore.getInstance("Collection", new CollectionCertStoreParameters(Arrays.asList(x509CertificateArr)), BouncyCastleProvider.PROVIDER_NAME);
                CertPathBuilder instance2 = CertPathBuilder.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME);
                X509CertSelector x509CertSelector = new X509CertSelector();
                x509CertSelector.setCertificate(x509CertificateArr[0]);
                PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(this.OooO00o, x509CertSelector);
                pKIXBuilderParameters.addCertStore(instance);
                if (this.f23056OooO00o != null) {
                    pKIXBuilderParameters.setRevocationEnabled(true);
                    pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(Arrays.asList(this.f23056OooO00o))));
                } else {
                    pKIXBuilderParameters.setRevocationEnabled(false);
                }
                PKIXCertPathValidatorResult pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult) instance2.build(pKIXBuilderParameters);
                C9485LL.OooO00o(x509CertificateArr[0]);
            } catch (CertificateException e) {
                throw e;
            } catch (GeneralSecurityException e2) {
                throw new CertificateException("unable to process certificates: " + e2.getMessage(), e2);
            }
        }

        public X509Certificate[] getAcceptedIssuers() {
            X509Certificate[] x509CertificateArr = this.f23057OooO00o;
            int length = x509CertificateArr.length;
            X509Certificate[] x509CertificateArr2 = new X509Certificate[length];
            System.arraycopy(x509CertificateArr, 0, x509CertificateArr2, 0, length);
            return x509CertificateArr2;
        }
    }

    public static KeyManagerFactory OooO00o(String str, String str2, KeyStore keyStore, char[] cArr) throws UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        KeyManagerFactory keyManagerFactory;
        if (str == null && str2 == null) {
            str = KeyManagerFactory.getDefaultAlgorithm();
        } else if (str2 != null) {
            keyManagerFactory = KeyManagerFactory.getInstance(str, str2);
            keyManagerFactory.init(keyStore, cArr);
            return keyManagerFactory;
        }
        keyManagerFactory = KeyManagerFactory.getInstance(str);
        keyManagerFactory.init(keyStore, cArr);
        return keyManagerFactory;
    }

    public static X509TrustManager OooO00o() {
        return new OooO00o();
    }

    public static void OooO00o(X509Certificate x509Certificate) throws CertificateException {
        try {
            X509CertificateHolder x509CertificateHolder = new X509CertificateHolder(x509Certificate.getEncoded());
            C5387Ii OooO00o2 = C5387Ii.OooO00o(x509CertificateHolder.getExtensions());
            if (OooO00o2 != null) {
                if (OooO00o2.OooO00o(4)) {
                    throw new CertificateException("Key usage must not contain keyCertSign");
                } else if (!OooO00o2.OooO00o(128)) {
                    if (!OooO00o2.OooO00o(32)) {
                        throw new CertificateException("Key usage must be none, digitalSignature or keyEncipherment");
                    }
                }
            }
            C5651LILli OooO00o3 = C5651LILli.OooO00o(x509CertificateHolder.getExtensions());
            if (OooO00o3 != null && !OooO00o3.OooO00o(C5869LiLL.OooO0O0) && !OooO00o3.OooO00o(C5869LiLL.OooOo0o)) {
                if (!OooO00o3.OooO00o(C5869LiLL.OooOo)) {
                    throw new CertificateException("Certificate extended key usage must include serverAuth, msSGC or nsSGC");
                }
            }
        } catch (CertificateException e) {
            throw e;
        } catch (Exception e2) {
            throw new CertificateException(e2.getMessage(), e2);
        }
    }

    public static X509TrustManager[] OooO00o(Set<TrustAnchor> set, CRL[] crlArr) {
        X509Certificate[] x509CertificateArr = new X509Certificate[set.size()];
        int i = 0;
        for (TrustAnchor trustAnchor : set) {
            x509CertificateArr[i] = trustAnchor.getTrustedCert();
            i++;
        }
        return new X509TrustManager[]{new OooO0O0(set, crlArr, x509CertificateArr)};
    }
}
