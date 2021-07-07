package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.pd.sdk.oo00Oo00  reason: case insensitive filesystem */
public class C8547oo00Oo00 implements X509TrustManager {
    public List<X509TrustManager> OooO00o = new ArrayList();

    public C8547oo00Oo00() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
        KeyStore instance2 = KeyStore.getInstance("bks");
        instance2.load(null, null);
        String[] strArr = AbstractC8542oo00OOo.OooO00o;
        for (int i = 0; i < strArr.length; i++) {
            instance2.setCertificateEntry("Certificate" + i, OooO00o(strArr[i]));
        }
        instance.init(instance2);
        TrustManager[] trustManagers = instance.getTrustManagers();
        for (int i2 = 0; i2 < trustManagers.length; i2++) {
            if (trustManagers[i2] instanceof X509TrustManager) {
                this.OooO00o.add((X509TrustManager) trustManagers[i2]);
            }
        }
        if (this.OooO00o.isEmpty()) {
            throw new CertificateException("X509TrustManager is empty");
        }
    }

    public static X509Certificate OooO00o(String str) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(str.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException unused) {
            AbstractC8536oo00OO0O.OooO0OO("SecureX509TrustManager", "generateCertificate: Exception has happened!Encoding is utf-8!");
            throw new CertificateException("generateCertificate(): UnsupportedEncodingException");
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (!this.OooO00o.isEmpty()) {
            this.OooO00o.get(0).checkClientTrusted(x509CertificateArr, str);
            return;
        }
        throw new CertificateException("checkClientTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (!this.OooO00o.isEmpty()) {
            this.OooO00o.get(0).checkServerTrusted(x509CertificateArr, str);
            return;
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            for (X509TrustManager x509TrustManager : this.OooO00o) {
                arrayList.addAll(Arrays.asList(x509TrustManager.getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e) {
            AbstractC8536oo00OO0O.OooO0Oo("SecureX509TrustManager", "getAcceptedIssuers exception : " + e.getMessage());
            return new X509Certificate[0];
        }
    }
}
