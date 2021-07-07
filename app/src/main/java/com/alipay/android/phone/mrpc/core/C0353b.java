package com.alipay.android.phone.mrpc.core;

import android.net.SSLCertificateSocketFactory;
import android.util.Base64;
import android.util.Log;
import com.p118pd.sdk.C7486o0OoO0oO;
import com.taobao.accs.common.Constants;
import com.umeng.message.util.HttpRequest;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.security.Security;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.alipay.android.phone.mrpc.core.b */
public final class C0353b implements HttpClient {

    /* renamed from: a */
    public static long f786a = 160;

    /* renamed from: b */
    public static String[] f787b = {"text/", "application/xml", HttpRequest.CONTENT_TYPE_JSON};

    /* renamed from: c */
    public static final HttpRequestInterceptor f788c = new C0356c();

    /* renamed from: d */
    public final HttpClient f789d;

    /* renamed from: e */
    public RuntimeException f790e = new IllegalStateException("AndroidHttpClient created and never closed");

    /* renamed from: f */
    public volatile C0355b f791f;

    /* renamed from: com.alipay.android.phone.mrpc.core.b$a */
    public class C0354a implements HttpRequestInterceptor {
        public C0354a() {
        }

        public /* synthetic */ C0354a(C0353b bVar, byte b) {
            this();
        }

        public final void process(org.apache.http.HttpRequest httpRequest, HttpContext httpContext) {
            C0355b bVar = C0353b.this.f791f;
            if (bVar != null && C0355b.m665a(bVar) && (httpRequest instanceof HttpUriRequest)) {
                C0355b.m664a(bVar, C0353b.m656a((HttpUriRequest) httpRequest));
            }
        }
    }

    /* renamed from: com.alipay.android.phone.mrpc.core.b$b */
    public static class C0355b {

        /* renamed from: a */
        public final String f793a;

        /* renamed from: b */
        public final int f794b;

        /* renamed from: a */
        public static /* synthetic */ void m664a(C0355b bVar, String str) {
            Log.println(bVar.f794b, bVar.f793a, str);
        }

        /* renamed from: a */
        public static /* synthetic */ boolean m665a(C0355b bVar) {
            return Log.isLoggable(bVar.f793a, bVar.f794b);
        }
    }

    public C0353b(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.f789d = new C0357d(this, clientConnectionManager, httpParams);
    }

    /* renamed from: a */
    public static C0353b m654a(String str) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, false);
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, C7486o0OoO0oO.OooO0o);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, true);
        HttpClientParams.setAuthenticating(basicHttpParams, false);
        HttpProtocolParams.setUserAgent(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme("https", SSLCertificateSocketFactory.getHttpSocketFactory(30000, null), (int) Constants.PORT));
        ThreadSafeClientConnManager threadSafeClientConnManager = new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry);
        ConnManagerParams.setTimeout(basicHttpParams, 60000);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(10));
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 50);
        Security.setProperty("networkaddress.cache.ttl", "-1");
        HttpsURLConnection.setDefaultHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        return new C0353b(threadSafeClientConnManager, basicHttpParams);
    }

    /* renamed from: a */
    public static InputStream m655a(HttpEntity httpEntity) {
        Header contentEncoding;
        String value;
        InputStream content = httpEntity.getContent();
        return (content == null || (contentEncoding = httpEntity.getContentEncoding()) == null || (value = contentEncoding.getValue()) == null || !value.contains("gzip")) ? content : new GZIPInputStream(content);
    }

    /* renamed from: a */
    public static /* synthetic */ String m656a(HttpUriRequest httpUriRequest) {
        HttpEntity entity;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("curl ");
        Header[] allHeaders = httpUriRequest.getAllHeaders();
        for (Header header : allHeaders) {
            if (!header.getName().equals("Authorization") && !header.getName().equals("Cookie")) {
                sb.append("--header \"");
                sb.append(header.toString().trim());
                sb.append("\" ");
            }
        }
        URI uri = httpUriRequest.getURI();
        if (httpUriRequest instanceof RequestWrapper) {
            HttpUriRequest original = ((RequestWrapper) httpUriRequest).getOriginal();
            if (original instanceof HttpUriRequest) {
                uri = original.getURI();
            }
        }
        sb.append("\"");
        sb.append(uri);
        sb.append("\"");
        if ((httpUriRequest instanceof HttpEntityEnclosingRequest) && (entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity()) != null && entity.isRepeatable()) {
            if (entity.getContentLength() < 1024) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                entity.writeTo(byteArrayOutputStream);
                if (m662b(httpUriRequest)) {
                    sb.insert(0, "echo '" + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2) + "' | base64 -d > /tmp/$$.bin; ");
                    str = " --data-binary @/tmp/$$.bin";
                } else {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                    sb.append(" --data-ascii \"");
                    sb.append(byteArrayOutputStream2);
                    sb.append("\"");
                }
            } else {
                str = " [TOO MUCH DATA TO INCLUDE]";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static AbstractHttpEntity m658a(byte[] bArr) {
        if (((long) bArr.length) < f786a) {
            return new ByteArrayEntity(bArr);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(byteArrayOutputStream.toByteArray());
        byteArrayEntity.setContentEncoding("gzip");
        StringBuilder sb = new StringBuilder("gzip size:");
        sb.append(bArr.length);
        sb.append("->");
        sb.append(byteArrayEntity.getContentLength());
        return byteArrayEntity;
    }

    /* renamed from: a */
    public static void m659a(org.apache.http.HttpRequest httpRequest) {
        httpRequest.addHeader("Accept-Encoding", "gzip");
    }

    /* renamed from: b */
    public static long m660b(String str) {
        return C0364k.m677a(str);
    }

    /* renamed from: b */
    public static void m661b(org.apache.http.HttpRequest httpRequest) {
        httpRequest.addHeader("Connection", "Keep-Alive");
    }

    /* renamed from: b */
    public static boolean m662b(HttpUriRequest httpUriRequest) {
        Header[] headers = httpUriRequest.getHeaders("content-encoding");
        if (headers != null) {
            for (Header header : headers) {
                if ("gzip".equalsIgnoreCase(header.getValue())) {
                    return true;
                }
            }
        }
        Header[] headers2 = httpUriRequest.getHeaders("content-type");
        if (headers2 != null) {
            for (Header header2 : headers2) {
                for (String str : f787b) {
                    if (header2.getValue().startsWith(str)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo4124a(HttpRequestRetryHandler httpRequestRetryHandler) {
        this.f789d.setHttpRequestRetryHandler(httpRequestRetryHandler);
    }

    public final <T> T execute(HttpHost httpHost, org.apache.http.HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) this.f789d.execute(httpHost, httpRequest, responseHandler);
    }

    public final <T> T execute(HttpHost httpHost, org.apache.http.HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) this.f789d.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) this.f789d.execute(httpUriRequest, responseHandler);
    }

    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) this.f789d.execute(httpUriRequest, responseHandler, httpContext);
    }

    public final HttpResponse execute(HttpHost httpHost, org.apache.http.HttpRequest httpRequest) {
        return this.f789d.execute(httpHost, httpRequest);
    }

    public final HttpResponse execute(HttpHost httpHost, org.apache.http.HttpRequest httpRequest, HttpContext httpContext) {
        return this.f789d.execute(httpHost, httpRequest, httpContext);
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest) {
        return this.f789d.execute(httpUriRequest);
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return this.f789d.execute(httpUriRequest, httpContext);
    }

    public final ClientConnectionManager getConnectionManager() {
        return this.f789d.getConnectionManager();
    }

    public final HttpParams getParams() {
        return this.f789d.getParams();
    }
}
