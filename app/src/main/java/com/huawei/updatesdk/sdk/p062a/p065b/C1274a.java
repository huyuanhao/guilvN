package com.huawei.updatesdk.sdk.p062a.p065b;

import com.huawei.updatesdk.sdk.p062a.p069d.p073c.C1291b;
import com.huawei.updatesdk.sdk.service.p074a.C1294a;
import com.huawei.updatesdk.support.p085e.C1378b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* renamed from: com.huawei.updatesdk.sdk.a.b.a */
public class C1274a {

    /* renamed from: a */
    public HttpURLConnection f1419a = null;

    /* renamed from: com.huawei.updatesdk.sdk.a.b.a$a */
    public static class C1275a {

        /* renamed from: a */
        public String f1420a;

        /* renamed from: b */
        public int f1421b;

        /* renamed from: a */
        public String mo15881a() {
            return (String) C1378b.m2070a(this.f1420a);
        }
    }

    /* renamed from: a */
    private HttpURLConnection m1570a(String str) throws IOException, CertificateException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, IllegalAccessException {
        HttpsURLConnection httpsURLConnection;
        URL url = new URL(str);
        Proxy e = C1291b.m1641e(C1294a.m1650a().mo15900b());
        if ("https".equals(url.getProtocol())) {
            httpsURLConnection = (HttpsURLConnection) (e == null ? url.openConnection() : url.openConnection(e));
            httpsURLConnection.setSSLSocketFactory(C1276b.m1576a(C1294a.m1650a().mo15900b()));
            httpsURLConnection.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        } else {
            httpsURLConnection = null;
        }
        return "http".equals(url.getProtocol()) ? (HttpURLConnection) url.openConnection() : httpsURLConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0041 A[SYNTHETIC, Splitter:B:27:0x0041] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] m1571a(byte[] r8) {
        /*
            r7 = this;
            java.lang.String r0 = "gzip error!"
            java.lang.String r1 = "HttpsUtil"
            r2 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0030 }
            r3.<init>()     // Catch:{ IOException -> 0x0030 }
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x002c }
            java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x002c }
            int r6 = r8.length     // Catch:{ IOException -> 0x002c }
            r5.<init>(r3, r6)     // Catch:{ IOException -> 0x002c }
            r4.<init>(r5)     // Catch:{ IOException -> 0x002c }
            r2 = 0
            int r5 = r8.length     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            r4.write(r8, r2, r5)     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            r4.flush()     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            r4.close()     // Catch:{ IOException -> 0x0021 }
            goto L_0x003a
        L_0x0021:
            r8 = move-exception
            com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a.m1581a(r1, r0, r8)
            goto L_0x003a
        L_0x0026:
            r8 = move-exception
            r2 = r4
            goto L_0x003f
        L_0x0029:
            r8 = move-exception
            r2 = r4
            goto L_0x0032
        L_0x002c:
            r8 = move-exception
            goto L_0x0032
        L_0x002e:
            r8 = move-exception
            goto L_0x003f
        L_0x0030:
            r8 = move-exception
            r3 = r2
        L_0x0032:
            com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a.m1581a(r1, r0, r8)     // Catch:{ all -> 0x002e }
            if (r2 == 0) goto L_0x003a
            r2.close()
        L_0x003a:
            byte[] r8 = r3.toByteArray()
            return r8
        L_0x003f:
            if (r2 == 0) goto L_0x0049
            r2.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x0049
        L_0x0045:
            r2 = move-exception
            com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a.m1581a(r1, r0, r2)
        L_0x0049:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.sdk.p062a.p065b.C1274a.m1571a(byte[]):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.huawei.updatesdk.sdk.p062a.p065b.C1274a.C1275a mo15880a(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) throws java.io.IOException, java.security.cert.CertificateException, java.lang.IllegalAccessException, java.security.NoSuchAlgorithmException, java.security.KeyStoreException, java.security.KeyManagementException {
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.sdk.p062a.p065b.C1274a.mo15880a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.huawei.updatesdk.sdk.a.b.a$a");
    }
}
