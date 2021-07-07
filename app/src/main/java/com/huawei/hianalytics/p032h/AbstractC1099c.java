package com.huawei.hianalytics.p032h;

import android.os.Build;
import android.text.TextUtils;
import com.p118pd.sdk.AbstractC8453oOooOoOO;
import com.p118pd.sdk.AbstractC8536oo00OO0O;
import com.p118pd.sdk.C8543oo00OOoO;
import com.p118pd.sdk.C8544oo00OOoo;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.SocketFactory;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.huawei.hianalytics.h.c */
public abstract class AbstractC1099c {

    /* renamed from: com.huawei.hianalytics.h.c$a */
    public static class C1100a extends Exception {
        public C1100a(String str) {
            super(str);
        }
    }

    public static C8544oo00OOoo OooO00o(String str, String str2) {
        return OooO00o(str, str2, "POST", (Map<String, String>) null);
    }

    public static C8544oo00OOoo OooO00o(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("App-Id", AbstractC8453oOooOoOO.OooO0o0());
        hashMap.put("App-Ver", AbstractC8453oOooOoOO.OooO0o());
        hashMap.put("Sdk-Name", "hianalytics");
        hashMap.put("Sdk-Ver", "2.1.4.301");
        hashMap.put("Device-Type", Build.MODEL);
        hashMap.put("Package-Name", AbstractC8453oOooOoOO.OooO0Oo());
        hashMap.put("Authorization", str3);
        hashMap.put("Charset", "UTF-8");
        hashMap.put("Content-Encoding", "gzip");
        hashMap.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        return OooO00o(str, str2, "POST", hashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b8 A[SYNTHETIC, Splitter:B:55:0x00b8] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d3 A[SYNTHETIC, Splitter:B:64:0x00d3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p118pd.sdk.C8544oo00OOoo OooO00o(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hianalytics.p032h.AbstractC1099c.OooO00o(java.lang.String, java.lang.String, java.lang.String, java.util.Map):com.pd.sdk.oo00OOoo");
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00bc A[SYNTHETIC, Splitter:B:62:0x00bc] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x010b A[SYNTHETIC, Splitter:B:90:0x010b] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0126 A[SYNTHETIC, Splitter:B:99:0x0126] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p118pd.sdk.C8544oo00OOoo OooO00o(java.lang.String r10, byte[] r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
        // Method dump skipped, instructions count: 314
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hianalytics.p032h.AbstractC1099c.OooO00o(java.lang.String, byte[], java.lang.String, java.util.Map):com.pd.sdk.oo00OOoo");
    }

    public static C8544oo00OOoo OooO00o(String str, byte[] bArr, Map<String, String> map) {
        return OooO00o(str, bArr, "POST", map);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:1:0x0002 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.String] */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        com.huawei.hianalytics.util.C1105e.OooO00o(7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        com.p118pd.sdk.AbstractC8536oo00OO0O.OooO0OO("HttpClient", "When Response Content From Connection inputStream operation exception!", java.lang.Integer.valueOf(r6.getResponseCode()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        return "";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO00o(java.net.HttpURLConnection r6) {
        /*
            r0 = 7
            r1 = 0
            java.io.InputStream r1 = r6.getInputStream()     // Catch:{ IOException -> 0x0012 }
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.String r6 = com.huawei.hianalytics.util.C1105e.OooO00o(r1, r2)     // Catch:{ IOException -> 0x0012 }
            com.huawei.hianalytics.util.C1105e.OooO00o(r0, r1)
            return r6
        L_0x0010:
            r6 = move-exception
            goto L_0x002d
        L_0x0012:
            int r6 = r6.getResponseCode()     // Catch:{ all -> 0x0010 }
            java.lang.String r2 = "HttpClient"
            java.lang.String r3 = "When Response Content From Connection inputStream operation exception!"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0010 }
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0010 }
            r4[r5] = r6     // Catch:{ all -> 0x0010 }
            com.p118pd.sdk.AbstractC8536oo00OO0O.OooO0OO(r2, r3, r4)     // Catch:{ all -> 0x0010 }
            java.lang.String r6 = ""
            com.huawei.hianalytics.util.C1105e.OooO00o(r0, r1)
            return r6
        L_0x002d:
            com.huawei.hianalytics.util.C1105e.OooO00o(r0, r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hianalytics.p032h.AbstractC1099c.OooO00o(java.net.HttpURLConnection):java.lang.String");
    }

    public static HttpURLConnection OooO00o(String str, int i, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            AbstractC8536oo00OO0O.OooO0Oo("HttpClient", "CreateConnection: invalid urlPath.");
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        m15110OooO00o(httpURLConnection);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(16000);
        httpURLConnection.setReadTimeout(16000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(i));
        httpURLConnection.setRequestProperty("App-Ver", "2.1.4.301");
        httpURLConnection.setRequestProperty("Connection", "close");
        if (map != null && map.size() >= 1) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null && !TextUtils.isEmpty(key)) {
                    httpURLConnection.setRequestProperty(key, entry.getValue());
                }
            }
        }
        return httpURLConnection;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m15110OooO00o(HttpURLConnection httpURLConnection) {
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            SocketFactory OooO00o = C8543oo00OOoO.OooO00o();
            if (OooO00o == null || !(OooO00o instanceof SSLSocketFactory)) {
                throw new C1100a("No ssl socket factory set");
            }
            httpsURLConnection.setSSLSocketFactory((SSLSocketFactory) OooO00o);
            httpsURLConnection.setHostnameVerifier(C8543oo00OOoO.f21663OooO00o);
        }
    }
}
