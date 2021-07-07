package com.tencent.bugly.proguard;

import android.content.Context;
import com.p118pd.sdk.C9040ooOoOO;
import com.umeng.socialize.common.SocializeConstants;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.ai */
public class C3312ai {

    /* renamed from: c */
    public static C3312ai f7992c;

    /* renamed from: a */
    public Context f7993a;

    /* renamed from: b */
    public Map<String, String> f7994b = null;

    public C3312ai(Context context) {
        this.f7993a = context;
    }

    /* renamed from: a */
    public static C3312ai m8288a(Context context) {
        if (f7992c == null) {
            f7992c = new C3312ai(context);
        }
        return f7992c;
    }

    /* renamed from: b */
    private Map<String, String> m8289b(HttpURLConnection httpURLConnection) {
        HashMap hashMap = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields == null || headerFields.size() == 0) {
            return null;
        }
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list.size() >= 1) {
                hashMap.put(str, list.get(0));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public boolean mo38369a(int i) {
        return i == 301 || i == 302 || i == 303 || i == 307;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0160, code lost:
        if (com.tencent.bugly.proguard.C3321an.m8350a(r4) != false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0162, code lost:
        r4.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0181, code lost:
        if (com.tencent.bugly.proguard.C3321an.m8350a(r4) != false) goto L_0x0184;
     */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0174 A[Catch:{ all -> 0x0168, all -> 0x018c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo38370a(java.lang.String r21, byte[] r22, com.tencent.bugly.proguard.RunnableC3318al r23, java.util.Map<java.lang.String, java.lang.String> r24) {
        /*
        // Method dump skipped, instructions count: 430
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3312ai.mo38370a(java.lang.String, byte[], com.tencent.bugly.proguard.al, java.util.Map):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003b A[Catch:{ all -> 0x0049, all -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0040 A[SYNTHETIC, Splitter:B:24:0x0040] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo38371a(java.net.HttpURLConnection r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0033 }
            java.io.InputStream r6 = r6.getInputStream()     // Catch:{ all -> 0x0033 }
            r1.<init>(r6)     // Catch:{ all -> 0x0033 }
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0031 }
            r6.<init>()     // Catch:{ all -> 0x0031 }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x0031 }
        L_0x0016:
            int r3 = r1.read(r2)     // Catch:{ all -> 0x0031 }
            if (r3 <= 0) goto L_0x0021
            r4 = 0
            r6.write(r2, r4, r3)     // Catch:{ all -> 0x0031 }
            goto L_0x0016
        L_0x0021:
            r6.flush()     // Catch:{ all -> 0x0031 }
            byte[] r6 = r6.toByteArray()     // Catch:{ all -> 0x0031 }
            r1.close()     // Catch:{ all -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0030:
            return r6
        L_0x0031:
            r6 = move-exception
            goto L_0x0035
        L_0x0033:
            r6 = move-exception
            r1 = r0
        L_0x0035:
            boolean r2 = com.tencent.bugly.proguard.C3321an.m8350a(r6)     // Catch:{ all -> 0x0049 }
            if (r2 != 0) goto L_0x003e
            r6.printStackTrace()     // Catch:{ all -> 0x0049 }
        L_0x003e:
            if (r1 == 0) goto L_0x0048
            r1.close()     // Catch:{ all -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0048:
            return r0
        L_0x0049:
            r6 = move-exception
            if (r1 == 0) goto L_0x0054
            r1.close()     // Catch:{ all -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0054:
            goto L_0x0056
        L_0x0055:
            throw r6
        L_0x0056:
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3312ai.mo38371a(java.net.HttpURLConnection):byte[]");
    }

    /* renamed from: a */
    public HttpURLConnection mo38368a(String str, byte[] bArr, String str2, Map<String, String> map) {
        if (str == null) {
            C3321an.m8357e("destUrl is null.", new Object[0]);
            return null;
        }
        HttpURLConnection a = mo38367a(str2, str);
        if (a == null) {
            C3321an.m8357e("Failed to get HttpURLConnection object.", new Object[0]);
            return null;
        }
        try {
            a.setRequestProperty("wup_version", SocializeConstants.PROTOCOL_VERSON);
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    a.setRequestProperty(entry.getKey(), URLEncoder.encode(entry.getValue(), "utf-8"));
                }
            }
            a.setRequestProperty("A37", URLEncoder.encode(str2, "utf-8"));
            a.setRequestProperty("A38", URLEncoder.encode(str2, "utf-8"));
            OutputStream outputStream = a.getOutputStream();
            if (bArr == null) {
                outputStream.write(0);
            } else {
                outputStream.write(bArr);
            }
            return a;
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            C3321an.m8357e("Failed to upload, please check your network.", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public HttpURLConnection mo38367a(String str, String str2) {
        HttpURLConnection httpURLConnection;
        try {
            URL url = new URL(str2);
            if (str == null || !str.toLowerCase(Locale.US).contains(C9040ooOoOO.OooO0Oo)) {
                httpURLConnection = (HttpURLConnection) url.openConnection();
            } else {
                httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("http.proxyHost"), Integer.parseInt(System.getProperty("http.proxyPort")))));
            }
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(false);
            return httpURLConnection;
        } catch (Throwable th) {
            if (C3321an.m8350a(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
