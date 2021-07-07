package p284io.realm.react.util;

import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: io.realm.react.util.SSLHelper */
public class SSLHelper {
    public static CertificateFactory CERTIFICATE_FACTORY = null;
    public static HashMap<String, List<String>> ROS_CERTIFICATES_CHAIN = null;
    public static final String TAG = "REALM SSLHelper";
    public static X509TrustManager TRUST_MANAGER;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.security.cert.X509Certificate buildCertificateFromPEM(java.lang.String r3) throws java.io.IOException, java.security.cert.CertificateException {
        /*
            r0 = 0
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x001b }
            java.lang.String r2 = "UTF-8"
            byte[] r3 = r3.getBytes(r2)     // Catch:{ all -> 0x001b }
            r1.<init>(r3)     // Catch:{ all -> 0x001b }
            java.security.cert.CertificateFactory r3 = p284io.realm.react.util.SSLHelper.CERTIFICATE_FACTORY     // Catch:{ all -> 0x0018 }
            java.security.cert.Certificate r3 = r3.generateCertificate(r1)     // Catch:{ all -> 0x0018 }
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch:{ all -> 0x0018 }
            r1.close()
            return r3
        L_0x0018:
            r3 = move-exception
            r0 = r1
            goto L_0x001c
        L_0x001b:
            r3 = move-exception
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p284io.realm.react.util.SSLHelper.buildCertificateFromPEM(java.lang.String):java.security.cert.X509Certificate");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:26|27|28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r0 = "Can not validate SSL chain certificate for the host: " + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ac, code lost:
        p284io.realm.react.util.SSLHelper.ROS_CERTIFICATES_CHAIN.remove(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b1, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r0 = "Error during certificate validation for host: " + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c7, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0095 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00b6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean certificateVerifier(java.lang.String r5, java.lang.String r6, int r7) {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: p284io.realm.react.util.SSLHelper.certificateVerifier(java.lang.String, java.lang.String, int):boolean");
    }

    public static X509TrustManager systemDefaultTrustManager() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }
}
