package anet.channel.request;

import android.text.TextUtils;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.utils.C0209c;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import com.p118pd.sdk.C8318oOo0oooo;
import com.p118pd.sdk.C8932ooOOO0o;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public class Request {
    public static final String DEFAULT_CHARSET = "UTF-8";

    /* renamed from: a */
    public final RequestStatistic f219a;

    /* renamed from: b */
    public HttpUrl f220b;

    /* renamed from: c */
    public HttpUrl f221c;

    /* renamed from: d */
    public HttpUrl f222d;

    /* renamed from: e */
    public URL f223e;

    /* renamed from: f */
    public String f224f;

    /* renamed from: g */
    public Map<String, String> f225g;

    /* renamed from: h */
    public Map<String, String> f226h;

    /* renamed from: i */
    public String f227i;

    /* renamed from: j */
    public BodyEntry f228j;

    /* renamed from: k */
    public boolean f229k;

    /* renamed from: l */
    public String f230l;

    /* renamed from: m */
    public String f231m;

    /* renamed from: n */
    public int f232n;

    /* renamed from: o */
    public int f233o;

    /* renamed from: p */
    public int f234p;

    /* renamed from: q */
    public HostnameVerifier f235q;

    /* renamed from: r */
    public SSLSocketFactory f236r;

    public static final class Method {
        public static final String DELETE = "DELETE";
        public static final String GET = "GET";
        public static final String HEAD = "HEAD";
        public static final String OPTION = "OPTIONS";
        public static final String POST = "POST";
        public static final String PUT = "PUT";

        /* renamed from: a */
        public static boolean m149a(String str) {
            return str.equals("POST") || str.equals("PUT");
        }

        /* renamed from: b */
        public static boolean m150b(String str) {
            return m149a(str) || str.equals("DELETE") || str.equals("OPTIONS");
        }
    }

    /* renamed from: a */
    private void m116a() {
        String a = C0209c.m280a(this.f226h, getContentEncoding());
        if (!TextUtils.isEmpty(a)) {
            if (!Method.m149a(this.f224f) || this.f228j != null) {
                String urlString = this.f220b.urlString();
                StringBuilder sb = new StringBuilder(urlString);
                if (sb.indexOf(C8932ooOOO0o.f22176OooO00o) == -1) {
                    sb.append('?');
                } else if (urlString.charAt(urlString.length() - 1) != '&') {
                    sb.append(C8318oOo0oooo.OooO0OO);
                }
                sb.append(a);
                HttpUrl parse = HttpUrl.parse(sb.toString());
                if (parse != null) {
                    this.f221c = parse;
                }
            } else {
                try {
                    this.f228j = new ByteArrayEntry(a.getBytes(getContentEncoding()));
                    Map<String, String> map = this.f225g;
                    map.put("Content-Type", "application/x-www-form-urlencoded; charset=" + getContentEncoding());
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
        if (this.f221c == null) {
            this.f221c = this.f220b;
        }
    }

    public boolean containsBody() {
        return this.f228j != null;
    }

    public String getBizId() {
        return this.f230l;
    }

    public byte[] getBodyBytes() {
        if (this.f228j == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(128);
        try {
            postBody(byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public int getConnectTimeout() {
        return this.f233o;
    }

    public String getContentEncoding() {
        String str = this.f227i;
        return str != null ? str : "UTF-8";
    }

    public Map<String, String> getHeaders() {
        return Collections.unmodifiableMap(this.f225g);
    }

    public String getHost() {
        return this.f221c.host();
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.f235q;
    }

    public HttpUrl getHttpUrl() {
        return this.f221c;
    }

    public String getMethod() {
        return this.f224f;
    }

    public int getReadTimeout() {
        return this.f234p;
    }

    public int getRedirectTimes() {
        return this.f232n;
    }

    public String getSeq() {
        return this.f231m;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f236r;
    }

    public URL getUrl() {
        if (this.f223e == null) {
            HttpUrl httpUrl = this.f222d;
            if (httpUrl == null) {
                httpUrl = this.f221c;
            }
            this.f223e = httpUrl.toURL();
        }
        return this.f223e;
    }

    public String getUrlString() {
        return this.f221c.urlString();
    }

    public boolean isRedirectEnable() {
        return this.f229k;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.f239c = this.f224f;
        builder.f240d = this.f225g;
        builder.f241e = this.f226h;
        builder.f243g = this.f228j;
        builder.f242f = this.f227i;
        builder.f244h = this.f229k;
        builder.f245i = this.f232n;
        builder.f246j = this.f235q;
        builder.f247k = this.f236r;
        builder.f237a = this.f220b;
        builder.f238b = this.f221c;
        builder.f248l = this.f230l;
        builder.f249m = this.f231m;
        builder.f250n = this.f233o;
        builder.f251o = this.f234p;
        builder.f252p = this.f219a;
        return builder;
    }

    public int postBody(OutputStream outputStream) throws IOException {
        BodyEntry bodyEntry = this.f228j;
        if (bodyEntry != null) {
            return bodyEntry.writeTo(outputStream);
        }
        return 0;
    }

    public void setDnsOptimize(String str, int i) {
        if (str != null) {
            if (this.f222d == null) {
                this.f222d = new HttpUrl(this.f221c);
            }
            this.f222d.replaceIpAndPort(str, i);
        } else {
            this.f222d = null;
        }
        this.f223e = null;
        this.f219a.setIPAndPort(str, i);
    }

    public void setUrlScheme(boolean z) {
        if (this.f222d == null) {
            this.f222d = new HttpUrl(this.f221c);
        }
        this.f222d.setScheme(z ? "https" : "http");
        this.f223e = null;
    }

    public static class Builder {

        /* renamed from: a */
        public HttpUrl f237a;

        /* renamed from: b */
        public HttpUrl f238b;

        /* renamed from: c */
        public String f239c = "GET";

        /* renamed from: d */
        public Map<String, String> f240d = new HashMap();

        /* renamed from: e */
        public Map<String, String> f241e;

        /* renamed from: f */
        public String f242f;

        /* renamed from: g */
        public BodyEntry f243g;

        /* renamed from: h */
        public boolean f244h = true;

        /* renamed from: i */
        public int f245i = 0;

        /* renamed from: j */
        public HostnameVerifier f246j;

        /* renamed from: k */
        public SSLSocketFactory f247k;

        /* renamed from: l */
        public String f248l;

        /* renamed from: m */
        public String f249m;

        /* renamed from: n */
        public int f250n = 10000;

        /* renamed from: o */
        public int f251o = 10000;

        /* renamed from: p */
        public RequestStatistic f252p = null;

        public Builder addHeader(String str, String str2) {
            this.f240d.put(str, str2);
            return this;
        }

        public Builder addParam(String str, String str2) {
            if (this.f241e == null) {
                this.f241e = new HashMap();
            }
            this.f241e.put(str, str2);
            this.f238b = null;
            return this;
        }

        public Request build() {
            if (this.f243g == null && this.f241e == null && Method.m149a(this.f239c)) {
                ALog.m289e("awcn.Request", "method " + this.f239c + " must have a request body", null, new Object[0]);
            }
            if (this.f243g != null && !Method.m150b(this.f239c)) {
                ALog.m289e("awcn.Request", "method " + this.f239c + " should not have a request body", null, new Object[0]);
                this.f243g = null;
            }
            BodyEntry bodyEntry = this.f243g;
            if (!(bodyEntry == null || bodyEntry.getContentType() == null)) {
                addHeader("Content-Type", this.f243g.getContentType());
            }
            return new Request(this);
        }

        public Builder setBizId(String str) {
            this.f248l = str;
            return this;
        }

        public Builder setBody(BodyEntry bodyEntry) {
            this.f243g = bodyEntry;
            return this;
        }

        public Builder setCharset(String str) {
            this.f242f = str;
            this.f238b = null;
            return this;
        }

        public Builder setConnectTimeout(int i) {
            if (i > 0) {
                this.f250n = i;
            }
            return this;
        }

        public Builder setHeaders(Map<String, String> map) {
            this.f240d.clear();
            if (map != null) {
                this.f240d.putAll(map);
            }
            return this;
        }

        public Builder setHostnameVerifier(HostnameVerifier hostnameVerifier) {
            this.f246j = hostnameVerifier;
            return this;
        }

        public Builder setMethod(String str) {
            if (!TextUtils.isEmpty(str)) {
                if ("GET".equalsIgnoreCase(str)) {
                    this.f239c = "GET";
                } else if ("POST".equalsIgnoreCase(str)) {
                    this.f239c = "POST";
                } else if ("OPTIONS".equalsIgnoreCase(str)) {
                    this.f239c = "OPTIONS";
                } else if ("HEAD".equalsIgnoreCase(str)) {
                    this.f239c = "HEAD";
                } else if ("PUT".equalsIgnoreCase(str)) {
                    this.f239c = "PUT";
                } else if ("DELETE".equalsIgnoreCase(str)) {
                    this.f239c = "DELETE";
                } else {
                    this.f239c = "GET";
                }
                return this;
            }
            throw new IllegalArgumentException("method is null or empty");
        }

        public Builder setParams(Map<String, String> map) {
            this.f241e = map;
            this.f238b = null;
            return this;
        }

        public Builder setReadTimeout(int i) {
            if (i > 0) {
                this.f251o = i;
            }
            return this;
        }

        public Builder setRedirectEnable(boolean z) {
            this.f244h = z;
            return this;
        }

        public Builder setRedirectTimes(int i) {
            this.f245i = i;
            return this;
        }

        public Builder setRequestStatistic(RequestStatistic requestStatistic) {
            this.f252p = requestStatistic;
            return this;
        }

        public Builder setSeq(String str) {
            this.f249m = str;
            return this;
        }

        public Builder setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f247k = sSLSocketFactory;
            return this;
        }

        public Builder setUrl(HttpUrl httpUrl) {
            this.f237a = httpUrl;
            this.f238b = null;
            return this;
        }

        public Builder setUrl(String str) {
            HttpUrl parse = HttpUrl.parse(str);
            this.f237a = parse;
            this.f238b = null;
            if (parse != null) {
                return this;
            }
            throw new IllegalArgumentException("toURL is invalid! toURL = " + str);
        }
    }

    public Request(Builder builder) {
        this.f224f = "GET";
        this.f229k = true;
        this.f232n = 0;
        this.f233o = 10000;
        this.f234p = 10000;
        this.f224f = builder.f239c;
        this.f225g = builder.f240d;
        this.f226h = builder.f241e;
        this.f228j = builder.f243g;
        this.f227i = builder.f242f;
        this.f229k = builder.f244h;
        this.f232n = builder.f245i;
        this.f235q = builder.f246j;
        this.f236r = builder.f247k;
        this.f230l = builder.f248l;
        this.f231m = builder.f249m;
        this.f233o = builder.f250n;
        this.f234p = builder.f251o;
        this.f220b = builder.f237a;
        HttpUrl httpUrl = builder.f238b;
        this.f221c = httpUrl;
        if (httpUrl == null) {
            m116a();
        }
        this.f219a = builder.f252p != null ? builder.f252p : new RequestStatistic(getHost(), this.f230l);
    }
}
