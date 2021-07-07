package com.p118pd.sdk;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

/* renamed from: com.pd.sdk.ooOo0Oo  reason: case insensitive filesystem */
public class C9012ooOo0Oo {
    public static HostnameVerifier OooO00o;

    /* renamed from: com.pd.sdk.ooOo0Oo$OooO00o */
    public static class OooO00o implements HostnameVerifier {
        public final /* synthetic */ String[] OooO00o;

        public OooO00o(String[] strArr) {
            this.OooO00o = strArr;
        }

        public boolean verify(String str, SSLSession sSLSession) {
            boolean z = false;
            for (String str2 : this.OooO00o) {
                if (str2.equalsIgnoreCase(str)) {
                    z = true;
                }
            }
            return z;
        }
    }

    public static SSLSocketFactory OooO00o(Context context, int[] iArr) {
        if (context != null) {
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                KeyStore instance2 = KeyStore.getInstance(KeyStore.getDefaultType());
                instance2.load(null, null);
                for (int i = 0; i < iArr.length; i++) {
                    InputStream openRawResource = context.getResources().openRawResource(iArr[i]);
                    instance2.setCertificateEntry(String.valueOf(i), instance.generateCertificate(openRawResource));
                    if (openRawResource != null) {
                        openRawResource.close();
                    }
                }
                SSLContext instance3 = SSLContext.getInstance("TLS");
                TrustManagerFactory instance4 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance4.init(instance2);
                instance3.init(null, instance4.getTrustManagers(), new SecureRandom());
                return instance3.getSocketFactory();
            } catch (CertificateException e) {
                e.printStackTrace();
                return null;
            } catch (NoSuchAlgorithmException e2) {
                e2.printStackTrace();
                return null;
            } catch (KeyStoreException e3) {
                e3.printStackTrace();
                return null;
            } catch (IOException e4) {
                e4.printStackTrace();
                return null;
            } catch (KeyManagementException e5) {
                e5.printStackTrace();
                return null;
            }
        } else {
            throw new NullPointerException("context == null");
        }
    }

    public static HostnameVerifier OooO00o(String[] strArr) {
        return new OooO00o(strArr);
    }
}
