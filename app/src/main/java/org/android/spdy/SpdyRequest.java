package org.android.spdy;

import anet.channel.util.HttpConstant;
import com.p118pd.sdk.C8932ooOOO0o;
import com.xiaomi.mipush.sdk.Constants;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Header;

public final class SpdyRequest {
    public static final String GET_METHOD = "GET";
    public static final String POST_METHOD = "POST";
    public int connectionTimeoutMs = 0;
    public String domain;
    public Map<String, String> extHead;
    public String host;
    public String method;
    public int port;
    public RequestPriority priority;
    public String proxyIp = "0.0.0.0";
    public int proxyPort = 0;
    public int requestRdTimeoutMs = 0;
    public int requestTimeoutMs = 0;
    public int retryTimes = 0;
    public URL url;

    public SpdyRequest(URL url2, String str, int i, String str2, int i2, String str3, RequestPriority requestPriority, int i3, int i4, int i5) {
        this.url = url2;
        this.domain = "";
        this.host = str;
        this.port = i;
        if (!(str2 == null || i2 == 0)) {
            this.proxyIp = str2;
            this.proxyPort = i2;
        }
        this.method = str3;
        this.extHead = new HashMap(5);
        this.priority = requestPriority;
        if (requestPriority == null) {
            this.priority = RequestPriority.DEFAULT_PRIORITY;
        }
        this.requestTimeoutMs = i3;
        this.connectionTimeoutMs = i4;
        this.retryTimes = i5;
    }

    private String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.url.getPath());
        if (this.url.getQuery() != null) {
            sb.append(C8932ooOOO0o.f22176OooO00o);
            sb.append(this.url.getQuery());
        }
        if (this.url.getRef() != null) {
            sb.append("#");
            sb.append(this.url.getRef());
        }
        if (sb.length() == 0) {
            sb.append('/');
        }
        return sb.toString();
    }

    public void addHeader(String str, String str2) {
        this.extHead.put(str, str2);
    }

    public void addHeaders(Map<String, String> map) {
        this.extHead.putAll(map);
    }

    public String getAuthority() {
        return this.host + Constants.COLON_SEPARATOR + Integer.toString(this.port) + C8932ooOOO0o.OooO0OO + this.proxyIp + Constants.COLON_SEPARATOR + this.proxyPort;
    }

    public int getConnectionTimeoutMs() {
        return this.connectionTimeoutMs;
    }

    public String getDomain() {
        return this.domain;
    }

    public Map<String, String> getHeaders() {
        HashMap hashMap = new HashMap(5);
        hashMap.put(Header.TARGET_PATH_UTF8, getPath());
        hashMap.put(Header.TARGET_METHOD_UTF8, this.method);
        hashMap.put(":version", "HTTP/1.1");
        hashMap.put(":host", this.url.getAuthority());
        hashMap.put(Header.TARGET_SCHEME_UTF8, this.url.getProtocol());
        Map<String, String> map = this.extHead;
        if (map != null && map.size() > 0) {
            hashMap.putAll(this.extHead);
        }
        return hashMap;
    }

    public String getHost() {
        return this.host;
    }

    public String getMethod() {
        return this.method;
    }

    public int getPort() {
        int i = this.port;
        if (i < 0) {
            return 80;
        }
        return i;
    }

    public int getPriority() {
        return this.priority.getPriorityInt();
    }

    public String getProxyIp() {
        return this.proxyIp;
    }

    public int getProxyPort() {
        return this.proxyPort;
    }

    public int getRequestRdTimeoutMs() {
        return this.requestRdTimeoutMs;
    }

    public int getRequestTimeoutMs() {
        return this.requestTimeoutMs;
    }

    public int getRetryTimes() {
        return this.retryTimes;
    }

    public URL getUrl() {
        return this.url;
    }

    public String getUrlPath() {
        return this.url.getProtocol() + HttpConstant.SCHEME_SPLIT + this.url.getAuthority() + getPath();
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setRequestRdTimeoutMs(int i) {
        if (i >= 0) {
            this.requestRdTimeoutMs = i;
        }
    }

    public SpdyRequest(URL url2, String str, int i, String str2, RequestPriority requestPriority) {
        this.url = url2;
        this.domain = "";
        this.host = str;
        this.port = i;
        this.method = str2;
        this.extHead = new HashMap(5);
        this.priority = requestPriority;
        if (requestPriority == null) {
            this.priority = RequestPriority.DEFAULT_PRIORITY;
        }
    }

    public SpdyRequest(URL url2, String str, RequestPriority requestPriority) {
        this.url = url2;
        this.domain = "";
        this.host = url2.getHost();
        int port2 = url2.getPort();
        this.port = port2;
        if (port2 < 0) {
            this.port = url2.getDefaultPort();
        }
        this.method = str;
        this.extHead = new HashMap(5);
        this.priority = requestPriority;
        if (requestPriority == null) {
            this.priority = RequestPriority.DEFAULT_PRIORITY;
        }
    }

    public SpdyRequest(URL url2, String str, RequestPriority requestPriority, int i, int i2) {
        this.url = url2;
        this.domain = "";
        this.host = url2.getHost();
        int port2 = url2.getPort();
        this.port = port2;
        if (port2 < 0) {
            this.port = url2.getDefaultPort();
        }
        this.method = str;
        this.extHead = new HashMap(5);
        this.priority = requestPriority;
        if (requestPriority == null) {
            this.priority = RequestPriority.DEFAULT_PRIORITY;
        }
        this.requestTimeoutMs = i;
        this.connectionTimeoutMs = i2;
    }

    public SpdyRequest(URL url2, String str) {
        this.url = url2;
        this.domain = "";
        this.host = url2.getHost();
        int port2 = url2.getPort();
        this.port = port2;
        if (port2 < 0) {
            this.port = url2.getDefaultPort();
        }
        this.method = str;
        this.extHead = new HashMap(5);
        this.priority = RequestPriority.DEFAULT_PRIORITY;
    }

    public SpdyRequest(URL url2, String str, String str2, int i, String str3, int i2, String str4, RequestPriority requestPriority, int i3, int i4, int i5) {
        this.url = url2;
        this.domain = str;
        this.host = str2;
        this.port = i;
        if (!(str3 == null || i2 == 0)) {
            this.proxyIp = str3;
            this.proxyPort = i2;
        }
        this.method = str4;
        this.extHead = new HashMap(5);
        this.priority = requestPriority;
        if (requestPriority == null) {
            this.priority = RequestPriority.DEFAULT_PRIORITY;
        }
        this.requestTimeoutMs = i3;
        this.connectionTimeoutMs = i4;
        this.retryTimes = i5;
    }

    public SpdyRequest(URL url2, String str, String str2, int i, String str3, RequestPriority requestPriority) {
        this.url = url2;
        this.domain = str;
        this.host = str2;
        this.port = i;
        this.method = str3;
        this.extHead = new HashMap(5);
        this.priority = requestPriority;
        if (requestPriority == null) {
            this.priority = RequestPriority.DEFAULT_PRIORITY;
        }
    }

    public SpdyRequest(URL url2, String str, String str2, RequestPriority requestPriority) {
        this.url = url2;
        this.domain = str;
        this.host = url2.getHost();
        int port2 = url2.getPort();
        this.port = port2;
        if (port2 < 0) {
            this.port = url2.getDefaultPort();
        }
        this.method = str2;
        this.extHead = new HashMap(5);
        this.priority = requestPriority;
        if (requestPriority == null) {
            this.priority = RequestPriority.DEFAULT_PRIORITY;
        }
    }

    public SpdyRequest(URL url2, String str, String str2, RequestPriority requestPriority, int i, int i2) {
        this.url = url2;
        this.domain = str;
        this.host = url2.getHost();
        int port2 = url2.getPort();
        this.port = port2;
        if (port2 < 0) {
            this.port = url2.getDefaultPort();
        }
        this.method = str2;
        this.extHead = new HashMap(5);
        this.priority = requestPriority;
        if (requestPriority == null) {
            this.priority = RequestPriority.DEFAULT_PRIORITY;
        }
        this.requestTimeoutMs = i;
        this.connectionTimeoutMs = i2;
    }

    public SpdyRequest(URL url2, String str, String str2) {
        this.url = url2;
        this.domain = str;
        this.host = url2.getHost();
        int port2 = url2.getPort();
        this.port = port2;
        if (port2 < 0) {
            this.port = url2.getDefaultPort();
        }
        this.method = str2;
        this.extHead = new HashMap(5);
        this.priority = RequestPriority.DEFAULT_PRIORITY;
    }
}
