package anet.channel.util;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: anet.channel.util.b */
public class C0218b {
    public static final HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER = new C0220a();
    public static final SSLSocketFactory TRUST_ALL_SSL_SOCKET_FACTORY = C0221b.m310a();

    /* renamed from: a */
    public static SSLSocketFactory f472a;

    /* renamed from: b */
    public static HostnameVerifier f473b;

    /* renamed from: anet.channel.util.b$a */
    public static class C0220a implements HostnameVerifier {
        public C0220a() {
        }

        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    /* renamed from: anet.channel.util.b$b */
    public static class C0221b {

        /* renamed from: anet.channel.util.b$b$a */
        public static class C0222a implements X509TrustManager {
            public C0222a() {
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            }

            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        }

        /* renamed from: a */
        public static SSLSocketFactory m310a() {
            try {
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init(null, new TrustManager[]{new C0222a()}, null);
                return instance.getSocketFactory();
            } catch (Throwable th) {
                ALog.m292w("awcn.SSLTrustAllSocketFactory", "getSocketFactory error :" + th.getMessage(), null, new Object[0]);
                return null;
            }
        }
    }

    /* renamed from: a */
    public static SSLSocketFactory m306a() {
        return f472a;
    }

    /* renamed from: b */
    public static HostnameVerifier m309b() {
        return f473b;
    }

    /* renamed from: a */
    public static void m308a(SSLSocketFactory sSLSocketFactory) {
        f472a = sSLSocketFactory;
    }

    /* renamed from: a */
    public static void m307a(HostnameVerifier hostnameVerifier) {
        f473b = hostnameVerifier;
    }
}
