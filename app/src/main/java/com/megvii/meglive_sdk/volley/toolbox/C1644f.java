package com.megvii.meglive_sdk.volley.toolbox;

import com.megvii.meglive_sdk.volley.AbstractC1628m;
import com.megvii.meglive_sdk.volley.p107a.AbstractC1596b;
import com.megvii.meglive_sdk.volley.p107a.AbstractC1601d;
import com.megvii.meglive_sdk.volley.p107a.C1610f;
import com.megvii.meglive_sdk.volley.p107a.p111c.C1600b;
import com.megvii.meglive_sdk.volley.p107a.p112d.C1603b;
import com.megvii.meglive_sdk.volley.p107a.p112d.C1604c;
import com.megvii.meglive_sdk.volley.p107a.p112d.C1606e;
import com.umeng.message.util.HttpRequest;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.megvii.meglive_sdk.volley.toolbox.f */
public final class C1644f implements AbstractC1643e {

    /* renamed from: a */
    public final AbstractC1645a f2934a;

    /* renamed from: b */
    public final SSLSocketFactory f2935b;

    /* renamed from: com.megvii.meglive_sdk.volley.toolbox.f$a */
    public interface AbstractC1645a {
        /* renamed from: a */
        String mo17375a();
    }

    public C1644f() {
        this((byte) 0);
    }

    /* renamed from: a */
    public static AbstractC1596b m2852a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        C1600b bVar = new C1600b();
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (IOException unused) {
            inputStream = httpURLConnection.getErrorStream();
        }
        bVar.f2827d = inputStream;
        bVar.f2828e = (long) httpURLConnection.getContentLength();
        bVar.mo17304b(httpURLConnection.getContentEncoding());
        bVar.mo17303a(httpURLConnection.getContentType());
        return bVar;
    }

    public C1644f(byte b) {
        this((char) 0);
    }

    public C1644f(char c) {
        this.f2934a = null;
        this.f2935b = null;
    }

    /* renamed from: a */
    public static void m2853a(HttpURLConnection httpURLConnection, AbstractC1628m<?> mVar) {
        byte[] e = mVar.mo17352e();
        if (e != null) {
            m2854a(httpURLConnection, e);
        }
    }

    /* renamed from: a */
    public static void m2854a(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        httpURLConnection.addRequestProperty("Content-Type", AbstractC1628m.m2795d());
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    @Override // com.megvii.meglive_sdk.volley.toolbox.AbstractC1643e
    /* renamed from: a */
    public final AbstractC1601d mo17374a(AbstractC1628m<?> mVar, Map<String, String> map) {
        SSLSocketFactory sSLSocketFactory;
        String str = mVar.f2884e;
        HashMap hashMap = new HashMap();
        hashMap.putAll(mVar.mo16995b());
        hashMap.putAll(map);
        AbstractC1645a aVar = this.f2934a;
        if (aVar != null) {
            String a = aVar.mo17375a();
            if (a != null) {
                str = a;
            } else {
                throw new IOException("URL blocked by rewriter: ".concat(String.valueOf(str)));
            }
        }
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int g = mVar.mo17354g();
        httpURLConnection.setConnectTimeout(g);
        httpURLConnection.setReadTimeout(g);
        httpURLConnection.setUseCaches(false);
        boolean z = true;
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f2935b) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        for (String str2 : hashMap.keySet()) {
            httpURLConnection.addRequestProperty(str2, (String) hashMap.get(str2));
        }
        switch (mVar.f2883d) {
            case -1:
                byte[] c = mVar.mo17350c();
                if (c != null) {
                    httpURLConnection.setRequestMethod("POST");
                    m2854a(httpURLConnection, c);
                    break;
                }
                break;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                break;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                m2853a(httpURLConnection, mVar);
                break;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                m2853a(httpURLConnection, mVar);
                break;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                break;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                break;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                break;
            case 6:
                httpURLConnection.setRequestMethod(HttpRequest.METHOD_TRACE);
                break;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                m2853a(httpURLConnection, mVar);
                break;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
        C1610f fVar = new C1610f("HTTP", 1, 1);
        if (httpURLConnection.getResponseCode() != -1) {
            C1606e eVar = new C1606e(fVar, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage());
            C1604c cVar = new C1604c(eVar);
            int i = mVar.f2883d;
            int b = eVar.mo17313b();
            if (i == 4 || ((100 <= b && b < 200) || b == 204 || b == 304)) {
                z = false;
            }
            if (z) {
                cVar.f2833c = m2852a(httpURLConnection);
            }
            for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
                if (entry.getKey() != null) {
                    cVar.mo17308a(new C1603b(entry.getKey(), entry.getValue().get(0)));
                }
            }
            return cVar;
        }
        throw new IOException("Could not retrieve response code from HttpUrlConnection.");
    }
}
