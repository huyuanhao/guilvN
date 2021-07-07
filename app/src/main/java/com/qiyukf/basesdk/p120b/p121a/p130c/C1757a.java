package com.qiyukf.basesdk.p120b.p121a.p130c;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.qiyukf.basesdk.C1708a;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p120b.p121a.p123b.C1735a;
import com.qiyukf.basesdk.p120b.p121a.p130c.p131a.C1760a;
import com.umeng.message.util.HttpRequest;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* renamed from: com.qiyukf.basesdk.b.a.c.a */
public final class C1757a {

    /* renamed from: a */
    public static HostnameVerifier f3243a = new HostnameVerifier() {
        /* class com.qiyukf.basesdk.p120b.p121a.p130c.C1757a.C17581 */

        public final boolean verify(String str, SSLSession sSLSession) {
            return HttpsURLConnection.getDefaultHostnameVerifier().verify(C1708a.m3007f(), sSLSession);
        }
    };

    /* renamed from: b */
    public static HostnameVerifier f3244b = new HostnameVerifier() {
        /* class com.qiyukf.basesdk.p120b.p121a.p130c.C1757a.C17592 */

        public final boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    };

    /* renamed from: a */
    public static String m3230a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            m3234a((Closeable) inputStream);
            m3234a(byteArrayOutputStream);
        }
    }

    /* renamed from: a */
    public static String m3231a(String str, String str2, String str3) {
        HttpURLConnection b = m3240b(str, str2, str3);
        m3236a(b, HttpRequest.PARAM_CHARSET, "UTF-8");
        int responseCode = b.getResponseCode();
        if (responseCode == 200) {
            return m3230a(b.getInputStream());
        }
        C1709a.m3011a("HttpUtil", "query url: " + str + "failed: " + responseCode);
        throw new IOException("invalid response code");
    }

    /* renamed from: a */
    public static HttpURLConnection m3232a(String str, String str2) {
        HttpURLConnection a = m3233a(str, "POST", str2, C1735a.m3114c().mo33964a(), C1735a.m3114c().mo33965b());
        a.setRequestProperty(HttpConstant.HOST, C1708a.m3007f());
        if (a instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) a;
            httpsURLConnection.setSSLSocketFactory(C1760a.m3242a());
            httpsURLConnection.setHostnameVerifier(f3243a);
        }
        return a;
    }

    /* renamed from: a */
    public static HttpURLConnection m3233a(String str, String str2, String str3, int i, int i2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setRequestProperty("User-Agent", "Qiyu-Android-" + str3 + "-V1.0");
        httpURLConnection.setReadTimeout(i2);
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setUseCaches(false);
        if ("POST".equals(httpURLConnection.getRequestMethod())) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
        }
        return httpURLConnection;
    }

    /* renamed from: a */
    public static void m3234a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m3235a(HttpURLConnection httpURLConnection, int i) {
        if (!"POST".equals(httpURLConnection.getRequestMethod())) {
            return;
        }
        if (i <= 0) {
            httpURLConnection.setChunkedStreamingMode(0);
        } else {
            httpURLConnection.setFixedLengthStreamingMode(i);
        }
    }

    /* renamed from: a */
    public static void m3236a(HttpURLConnection httpURLConnection, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            httpURLConnection.addRequestProperty(str, str2);
        }
    }

    /* renamed from: a */
    public static void m3237a(HttpURLConnection httpURLConnection, Map<String, String> map) {
        if (!(map == null || map.isEmpty())) {
            for (String str : map.keySet()) {
                m3236a(httpURLConnection, str, map.get(str));
            }
        }
    }

    /* renamed from: a */
    public static void m3238a(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        try {
            dataOutputStream.write(bArr);
            outputStream.flush();
        } finally {
            m3234a(dataOutputStream);
        }
    }

    /* renamed from: b */
    public static HttpURLConnection m3239b(String str, String str2) {
        HttpURLConnection a = m3233a(str, "GET", str2, C1735a.m3114c().mo33964a(), C1735a.m3114c().mo33965b());
        if (a instanceof HttpsURLConnection) {
            ((HttpsURLConnection) a).setSSLSocketFactory(C1760a.m3242a());
        }
        return a;
    }

    /* renamed from: b */
    public static HttpURLConnection m3240b(String str, String str2, String str3) {
        return m3233a(str, str2, str3, 30000, 30000);
    }

    /* renamed from: c */
    public static HttpURLConnection m3241c(String str, String str2) {
        HttpURLConnection b = m3240b(str, "GET", str2);
        if (b instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) b;
            httpsURLConnection.setSSLSocketFactory(C1760a.m3242a());
            httpsURLConnection.setHostnameVerifier(f3244b);
        }
        return b;
    }
}
