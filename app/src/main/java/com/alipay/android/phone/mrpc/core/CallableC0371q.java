package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.message.util.HttpRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.alipay.android.phone.mrpc.core.q */
public final class CallableC0371q implements Callable<C0375u> {

    /* renamed from: e */
    public static final HttpRequestRetryHandler f832e = new C0352ad();

    /* renamed from: a */
    public C0366l f833a;

    /* renamed from: b */
    public Context f834b;

    /* renamed from: c */
    public C0369o f835c;

    /* renamed from: d */
    public String f836d;

    /* renamed from: f */
    public HttpUriRequest f837f;

    /* renamed from: g */
    public HttpContext f838g = new BasicHttpContext();

    /* renamed from: h */
    public CookieStore f839h = new BasicCookieStore();

    /* renamed from: i */
    public CookieManager f840i;

    /* renamed from: j */
    public AbstractHttpEntity f841j;

    /* renamed from: k */
    public HttpHost f842k;

    /* renamed from: l */
    public URL f843l;

    /* renamed from: m */
    public int f844m = 0;

    /* renamed from: n */
    public boolean f845n = false;

    /* renamed from: o */
    public boolean f846o = false;

    /* renamed from: p */
    public String f847p = null;

    /* renamed from: q */
    public String f848q;

    public CallableC0371q(C0366l lVar, C0369o oVar) {
        this.f833a = lVar;
        this.f834b = lVar.f810a;
        this.f835c = oVar;
    }

    /* renamed from: a */
    public static long m704a(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if ("max-age".equalsIgnoreCase(strArr[i])) {
                int i2 = i + 1;
                if (strArr[i2] != null) {
                    try {
                        return Long.parseLong(strArr[i2]);
                    } catch (Exception unused) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static HttpUrlHeader m705a(HttpResponse httpResponse) {
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        Header[] allHeaders = httpResponse.getAllHeaders();
        for (Header header : allHeaders) {
            httpUrlHeader.setHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c3 A[SYNTHETIC, Splitter:B:23:0x00c3] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.alipay.android.phone.mrpc.core.C0375u m706a(org.apache.http.HttpResponse r11, int r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 221
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.mrpc.core.CallableC0371q.m706a(org.apache.http.HttpResponse, int, java.lang.String):com.alipay.android.phone.mrpc.core.u");
    }

    /* renamed from: a */
    public static HashMap<String, String> m707a(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        String[] split = str.split(C7522o0Ooo0o.OooO0O0);
        for (String str2 : split) {
            String[] split2 = str2.indexOf(61) == -1 ? new String[]{"Content-Type", str2} : str2.split(C8932ooOOO0o.OooO0Oo);
            hashMap.put(split2[0], split2[1]);
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m708a(HttpEntity httpEntity, OutputStream outputStream) {
        InputStream a = C0353b.m655a(httpEntity);
        long contentLength = httpEntity.getContentLength();
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int read = a.read(bArr);
                if (read == -1 || this.f835c.mo4177h()) {
                    outputStream.flush();
                } else {
                    outputStream.write(bArr, 0, read);
                    if (this.f835c.mo4175f() != null) {
                        int i = (contentLength > 0 ? 1 : (contentLength == 0 ? 0 : -1));
                    }
                }
            }
            outputStream.flush();
            C0372r.m719a(a);
        } catch (Exception e) {
            e.getCause();
            throw new IOException("HttpWorker Request Error!" + e.getLocalizedMessage());
        } catch (Throwable th) {
            C0372r.m719a(a);
            throw th;
        }
    }

    /* renamed from: b */
    public static long m709b(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("Cache-Control");
        if (firstHeader != null) {
            String[] split = firstHeader.getValue().split(C8932ooOOO0o.OooO0Oo);
            if (split.length >= 2) {
                try {
                    return m704a(split);
                } catch (NumberFormatException unused) {
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader(HttpRequest.HEADER_EXPIRES);
        if (firstHeader2 != null) {
            return C0353b.m660b(firstHeader2.getValue()) - System.currentTimeMillis();
        }
        return 0;
    }

    /* renamed from: b */
    private URI m710b() {
        String a = this.f835c.mo4155a();
        String str = this.f836d;
        if (str != null) {
            a = str;
        }
        if (a != null) {
            return new URI(a);
        }
        throw new RuntimeException("url should not be null");
    }

    /* renamed from: c */
    private HttpUriRequest m711c() {
        HttpUriRequest httpUriRequest = this.f837f;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        if (this.f841j == null) {
            byte[] b = this.f835c.mo4162b();
            String b2 = this.f835c.mo4161b("gzip");
            if (b != null) {
                if (TextUtils.equals(b2, "true")) {
                    this.f841j = C0353b.m658a(b);
                } else {
                    this.f841j = new ByteArrayEntity(b);
                }
                this.f841j.setContentType(this.f835c.mo4163c());
            }
        }
        AbstractHttpEntity abstractHttpEntity = this.f841j;
        if (abstractHttpEntity != null) {
            HttpPost httpPost = new HttpPost(m710b());
            httpPost.setEntity(abstractHttpEntity);
            this.f837f = httpPost;
        } else {
            this.f837f = new HttpGet(m710b());
        }
        return this.f837f;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032 A[Catch:{ HttpException -> 0x0457, URISyntaxException -> 0x044a, SSLHandshakeException -> 0x0420, SSLPeerUnverifiedException -> 0x03f6, SSLException -> 0x03cc, ConnectionPoolTimeoutException -> 0x03a2, ConnectTimeoutException -> 0x0378, SocketTimeoutException -> 0x034d, NoHttpResponseException -> 0x0322, HttpHostConnectException -> 0x02fe, UnknownHostException -> 0x02d2, IOException -> 0x02a8, NullPointerException -> 0x0284, Exception -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0106 A[Catch:{ HttpException -> 0x0457, URISyntaxException -> 0x044a, SSLHandshakeException -> 0x0420, SSLPeerUnverifiedException -> 0x03f6, SSLException -> 0x03cc, ConnectionPoolTimeoutException -> 0x03a2, ConnectTimeoutException -> 0x0378, SocketTimeoutException -> 0x034d, NoHttpResponseException -> 0x0322, HttpHostConnectException -> 0x02fe, UnknownHostException -> 0x02d2, IOException -> 0x02a8, NullPointerException -> 0x0284, Exception -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0109 A[Catch:{ HttpException -> 0x0457, URISyntaxException -> 0x044a, SSLHandshakeException -> 0x0420, SSLPeerUnverifiedException -> 0x03f6, SSLException -> 0x03cc, ConnectionPoolTimeoutException -> 0x03a2, ConnectTimeoutException -> 0x0378, SocketTimeoutException -> 0x034d, NoHttpResponseException -> 0x0322, HttpHostConnectException -> 0x02fe, UnknownHostException -> 0x02d2, IOException -> 0x02a8, NullPointerException -> 0x0284, Exception -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0129 A[Catch:{ HttpException -> 0x0457, URISyntaxException -> 0x044a, SSLHandshakeException -> 0x0420, SSLPeerUnverifiedException -> 0x03f6, SSLException -> 0x03cc, ConnectionPoolTimeoutException -> 0x03a2, ConnectTimeoutException -> 0x0378, SocketTimeoutException -> 0x034d, NoHttpResponseException -> 0x0322, HttpHostConnectException -> 0x02fe, UnknownHostException -> 0x02d2, IOException -> 0x02a8, NullPointerException -> 0x0284, Exception -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015c A[Catch:{ HttpException -> 0x0457, URISyntaxException -> 0x044a, SSLHandshakeException -> 0x0420, SSLPeerUnverifiedException -> 0x03f6, SSLException -> 0x03cc, ConnectionPoolTimeoutException -> 0x03a2, ConnectTimeoutException -> 0x0378, SocketTimeoutException -> 0x034d, NoHttpResponseException -> 0x0322, HttpHostConnectException -> 0x02fe, UnknownHostException -> 0x02d2, IOException -> 0x02a8, NullPointerException -> 0x0284, Exception -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0169 A[Catch:{ HttpException -> 0x0457, URISyntaxException -> 0x044a, SSLHandshakeException -> 0x0420, SSLPeerUnverifiedException -> 0x03f6, SSLException -> 0x03cc, ConnectionPoolTimeoutException -> 0x03a2, ConnectTimeoutException -> 0x0378, SocketTimeoutException -> 0x034d, NoHttpResponseException -> 0x0322, HttpHostConnectException -> 0x02fe, UnknownHostException -> 0x02d2, IOException -> 0x02a8, NullPointerException -> 0x0284, Exception -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01de A[Catch:{ HttpException -> 0x0457, URISyntaxException -> 0x044a, SSLHandshakeException -> 0x0420, SSLPeerUnverifiedException -> 0x03f6, SSLException -> 0x03cc, ConnectionPoolTimeoutException -> 0x03a2, ConnectTimeoutException -> 0x0378, SocketTimeoutException -> 0x034d, NoHttpResponseException -> 0x0322, HttpHostConnectException -> 0x02fe, UnknownHostException -> 0x02d2, IOException -> 0x02a8, NullPointerException -> 0x0284, Exception -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0256  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alipay.android.phone.mrpc.core.C0375u call() {
        /*
        // Method dump skipped, instructions count: 1140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.mrpc.core.CallableC0371q.call():com.alipay.android.phone.mrpc.core.u");
    }

    /* renamed from: e */
    private void m713e() {
        HttpUriRequest httpUriRequest = this.f837f;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    /* renamed from: f */
    private String m714f() {
        if (!TextUtils.isEmpty(this.f848q)) {
            return this.f848q;
        }
        String b = this.f835c.mo4161b("operationType");
        this.f848q = b;
        return b;
    }

    /* renamed from: g */
    private int m715g() {
        URL h = m716h();
        return h.getPort() == -1 ? h.getDefaultPort() : h.getPort();
    }

    /* renamed from: h */
    private URL m716h() {
        URL url = this.f843l;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.f835c.mo4155a());
        this.f843l = url2;
        return url2;
    }

    /* renamed from: i */
    private CookieManager m717i() {
        CookieManager cookieManager = this.f840i;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager instance = CookieManager.getInstance();
        this.f840i = instance;
        return instance;
    }

    /* renamed from: a */
    public final C0369o mo4173a() {
        return this.f835c;
    }
}
