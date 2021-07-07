package com.huawei.hms.update.p055b;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.huawei.hms.update.b.e */
public class C1225e implements X509TrustManager {

    /* renamed from: a */
    public List<X509TrustManager> f1358a = new ArrayList();

    public C1225e(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalArgumentException {
        if (context != null) {
            InputStream inputStream = null;
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
                KeyStore instance2 = KeyStore.getInstance("bks");
                inputStream = context.getAssets().open("updatesdkcas.bks");
                inputStream.reset();
                instance2.load(inputStream, "".toCharArray());
                instance.init(instance2);
                TrustManager[] trustManagers = instance.getTrustManagers();
                for (int i = 0; i < trustManagers.length; i++) {
                    if (trustManagers[i] instanceof X509TrustManager) {
                        this.f1358a.add((X509TrustManager) trustManagers[i]);
                    }
                }
                if (this.f1358a.isEmpty()) {
                    throw new CertificateException("X509TrustManager is empty");
                }
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("context is null");
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (!this.f1358a.isEmpty()) {
            this.f1358a.get(0).checkClientTrusted(x509CertificateArr, str);
            return;
        }
        throw new CertificateException("checkClientTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (!this.f1358a.isEmpty()) {
            this.f1358a.get(0).checkServerTrusted(x509CertificateArr, str);
            return;
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    public X509Certificate[] getAcceptedIssuers() {
        ArrayList arrayList = new ArrayList();
        for (X509TrustManager x509TrustManager : this.f1358a) {
            arrayList.addAll(Arrays.asList(x509TrustManager.getAcceptedIssuers()));
        }
        return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
    }
}
