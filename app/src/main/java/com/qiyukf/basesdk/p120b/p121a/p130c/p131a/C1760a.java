package com.qiyukf.basesdk.p120b.p121a.p130c.p131a;

import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.qiyukf.basesdk.b.a.c.a.a */
public final class C1760a implements X509TrustManager {

    /* renamed from: b */
    public static SSLSocketFactory f3245b;

    /* renamed from: a */
    public X509TrustManager f3246a = null;

    public C1760a() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        int length = trustManagers.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            TrustManager trustManager = trustManagers[i];
            if (trustManager instanceof X509TrustManager) {
                this.f3246a = (X509TrustManager) trustManager;
                break;
            }
            i++;
        }
        if (this.f3246a == null) {
            throw new NoSuchAlgorithmException("no trust manager found");
        }
    }

    /* renamed from: a */
    public static SSLSocketFactory m3242a() {
        if (f3245b == null) {
            SSLSocketFactory b = m3243b();
            f3245b = b;
            if (b == null) {
                f3245b = (SSLSocketFactory) SSLSocketFactory.getDefault();
            }
        }
        return f3245b;
    }

    /* renamed from: b */
    public static SSLSocketFactory m3243b() {
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, new TrustManager[]{new C1760a()}, null);
            return instance.getSocketFactory();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.f3246a.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (x509CertificateArr == null || x509CertificateArr.length != 1) {
            this.f3246a.checkServerTrusted(x509CertificateArr, str);
        } else {
            x509CertificateArr[0].checkValidity();
        }
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return this.f3246a.getAcceptedIssuers();
    }
}
