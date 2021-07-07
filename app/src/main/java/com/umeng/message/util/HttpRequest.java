package com.umeng.message.util;

import anet.channel.util.HttpConstant;
import com.p118pd.sdk.C7490o0OoOO0o;
import com.p118pd.sdk.C8027oOO00oo;
import com.p118pd.sdk.C8318oOo0oooo;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;

public class HttpRequest {
    public static final String BOUNDARY = "00content0boundary00";
    public static final String CHARSET_UTF8 = "UTF-8";
    public static ConnectionFactory CONNECTION_FACTORY = ConnectionFactory.DEFAULT;
    public static final String CONTENT_TYPE_FORM = "application/x-www-form-urlencoded";
    public static final String CONTENT_TYPE_JSON = "application/json";
    public static final String CONTENT_TYPE_MULTIPART = "multipart/form-data; boundary=00content0boundary00";
    public static final String CONTENT_TYPE_THRIFT = "application/thrift";
    public static final String CRLF = "\r\n";
    public static final String[] EMPTY_STRINGS = new String[0];
    public static final String ENCODING_GZIP = "gzip";
    public static final String HEADER_ACCEPT = "Accept";
    public static final String HEADER_ACCEPT_CHARSET = "Accept-Charset";
    public static final String HEADER_ACCEPT_ENCODING = "Accept-Encoding";
    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String HEADER_CACHE_CONTROL = "Cache-Control";
    public static final String HEADER_CONTENT_ENCODING = "Content-Encoding";
    public static final String HEADER_CONTENT_LENGTH = "Content-Length";
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_DATE = "Date";
    public static final String HEADER_ETAG = "ETag";
    public static final String HEADER_EXPIRES = "Expires";
    public static final String HEADER_IF_NONE_MATCH = "If-None-Match";
    public static final String HEADER_LAST_MODIFIED = "Last-Modified";
    public static final String HEADER_LOCATION = "Location";
    public static final String HEADER_PROXY_AUTHORIZATION = "Proxy-Authorization";
    public static final String HEADER_REFERER = "Referer";
    public static final String HEADER_SERVER = "Server";
    public static final String HEADER_USER_AGENT = "User-Agent";
    public static final String METHOD_DELETE = "DELETE";
    public static final String METHOD_GET = "GET";
    public static final String METHOD_HEAD = "HEAD";
    public static final String METHOD_OPTIONS = "OPTIONS";
    public static final String METHOD_POST = "POST";
    public static final String METHOD_PUT = "PUT";
    public static final String METHOD_TRACE = "TRACE";
    public static final String PARAM_CHARSET = "charset";
    public static SSLSocketFactory TRUSTED_FACTORY = null;
    public static HostnameVerifier TRUSTED_VERIFIER = null;
    public static int connectTimeout = 60000;
    public static int readTimeOut = 60000;
    public int bufferSize = 8192;
    public HttpURLConnection connection = null;
    public boolean form;
    public String httpProxyHost;
    public int httpProxyPort;
    public boolean ignoreCloseExceptions = true;
    public boolean multipart;
    public C3890e output;
    public final String requestMethod;
    public boolean uncompress = false;
    public final URL url;

    public interface ConnectionFactory {
        public static final ConnectionFactory DEFAULT = new ConnectionFactory() {
            /* class com.umeng.message.util.HttpRequest.ConnectionFactory.C38851 */

            @Override // com.umeng.message.util.HttpRequest.ConnectionFactory
            public HttpURLConnection create(URL url) throws IOException {
                return (HttpURLConnection) url.openConnection();
            }

            @Override // com.umeng.message.util.HttpRequest.ConnectionFactory
            public HttpURLConnection create(URL url, Proxy proxy) throws IOException {
                return (HttpURLConnection) url.openConnection(proxy);
            }
        };

        HttpURLConnection create(URL url) throws IOException;

        HttpURLConnection create(URL url, Proxy proxy) throws IOException;
    }

    public static class HttpRequestException extends RuntimeException {
        public static final long serialVersionUID = -1170466989781746231L;

        public HttpRequestException(IOException iOException) {
            super(iOException);
        }

        /* renamed from: a */
        public IOException getCause() {
            return (IOException) super.getCause();
        }
    }

    /* renamed from: com.umeng.message.util.HttpRequest$b */
    public static abstract class AbstractC3887b<V> extends AbstractCallableC3889d<V> {

        /* renamed from: a */
        public final Closeable f10591a;

        /* renamed from: b */
        public final boolean f10592b;

        public AbstractC3887b(Closeable closeable, boolean z) {
            this.f10591a = closeable;
            this.f10592b = z;
        }

        @Override // com.umeng.message.util.HttpRequest.AbstractCallableC3889d
        /* renamed from: c */
        public void mo40140c() throws IOException {
            Closeable closeable = this.f10591a;
            if (closeable instanceof Flushable) {
                ((Flushable) closeable).flush();
            }
            if (this.f10592b) {
                try {
                    this.f10591a.close();
                } catch (IOException unused) {
                }
            } else {
                this.f10591a.close();
            }
        }
    }

    /* renamed from: com.umeng.message.util.HttpRequest$c */
    public static abstract class AbstractC3888c<V> extends AbstractCallableC3889d<V> {

        /* renamed from: a */
        public final Flushable f10593a;

        public AbstractC3888c(Flushable flushable) {
            this.f10593a = flushable;
        }

        @Override // com.umeng.message.util.HttpRequest.AbstractCallableC3889d
        /* renamed from: c */
        public void mo40140c() throws IOException {
            this.f10593a.flush();
        }
    }

    /* renamed from: com.umeng.message.util.HttpRequest$d */
    public static abstract class AbstractCallableC3889d<V> implements Callable<V> {
        /* renamed from: b */
        public abstract V mo40125b() throws HttpRequestException, IOException;

        /* renamed from: c */
        public abstract void mo40140c() throws IOException;

        @Override // java.util.concurrent.Callable
        public V call() throws HttpRequestException {
            boolean z;
            Throwable th;
            try {
                V b = mo40125b();
                try {
                    mo40140c();
                    return b;
                } catch (IOException e) {
                    throw new HttpRequestException(e);
                }
            } catch (HttpRequestException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new HttpRequestException(e3);
            } catch (Throwable th2) {
                th = th2;
                z = true;
                mo40140c();
                throw th;
            }
        }
    }

    /* renamed from: com.umeng.message.util.HttpRequest$e */
    public static class C3890e extends BufferedOutputStream {

        /* renamed from: a */
        public final CharsetEncoder f10594a;

        public C3890e(OutputStream outputStream, String str, int i) {
            super(outputStream, i);
            this.f10594a = Charset.forName(HttpRequest.getValidCharset(str)).newEncoder();
        }

        /* renamed from: a */
        public C3890e mo40142a(String str) throws IOException {
            ByteBuffer encode = this.f10594a.encode(CharBuffer.wrap(str));
            super.write(encode.array(), 0, encode.limit());
            return this;
        }
    }

    public HttpRequest(CharSequence charSequence, String str) throws HttpRequestException {
        try {
            this.url = new URL(charSequence.toString());
            this.requestMethod = str;
        } catch (MalformedURLException e) {
            throw new HttpRequestException(e);
        }
    }

    public static StringBuilder addParamPrefix(String str, StringBuilder sb) {
        int indexOf = str.indexOf(63);
        int length = sb.length() - 1;
        if (indexOf == -1) {
            sb.append('?');
        } else if (indexOf < length && str.charAt(length) != '&') {
            sb.append(C8318oOo0oooo.OooO0OO);
        }
        return sb;
    }

    public static StringBuilder addPathSeparator(String str, StringBuilder sb) {
        if (str.indexOf(58) + 2 == str.lastIndexOf(47)) {
            sb.append('/');
        }
        return sb;
    }

    public static String append(CharSequence charSequence, Map<?, ?> map) {
        String charSequence2 = charSequence.toString();
        if (map == null || map.isEmpty()) {
            return charSequence2;
        }
        StringBuilder sb = new StringBuilder(charSequence2);
        addPathSeparator(charSequence2, sb);
        addParamPrefix(charSequence2, sb);
        Iterator<Map.Entry<?, ?>> it = map.entrySet().iterator();
        Map.Entry<?, ?> next = it.next();
        sb.append(next.getKey().toString());
        sb.append(C7490o0OoOO0o.OooO00o);
        Object value = next.getValue();
        if (value != null) {
            sb.append(value);
        }
        while (it.hasNext()) {
            sb.append(C8318oOo0oooo.OooO0OO);
            Map.Entry<?, ?> next2 = it.next();
            sb.append(next2.getKey().toString());
            sb.append(C7490o0OoOO0o.OooO00o);
            Object value2 = next2.getValue();
            if (value2 != null) {
                sb.append(value2);
            }
        }
        return sb.toString();
    }

    private HttpURLConnection createConnection() {
        HttpURLConnection httpURLConnection;
        try {
            if (this.httpProxyHost != null) {
                httpURLConnection = CONNECTION_FACTORY.create(this.url, createProxy());
            } else {
                httpURLConnection = CONNECTION_FACTORY.create(this.url);
            }
            httpURLConnection.setRequestMethod(this.requestMethod);
            return httpURLConnection;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    private Proxy createProxy() {
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.httpProxyHost, this.httpProxyPort));
    }

    public static HttpRequest delete(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, "DELETE");
    }

    public static String encode(CharSequence charSequence) throws HttpRequestException {
        int i;
        try {
            URL url2 = new URL(charSequence.toString());
            String host = url2.getHost();
            int port = url2.getPort();
            if (port != -1) {
                host = host + ':' + Integer.toString(port);
            }
            try {
                String aSCIIString = new URI(url2.getProtocol(), host, url2.getPath(), url2.getQuery(), null).toASCIIString();
                int indexOf = aSCIIString.indexOf(63);
                if (indexOf <= 0 || (i = indexOf + 1) >= aSCIIString.length()) {
                    return aSCIIString;
                }
                return aSCIIString.substring(0, i) + aSCIIString.substring(i).replace("+", "%2B");
            } catch (URISyntaxException e) {
                IOException iOException = new IOException("Parsing URI failed");
                iOException.initCause(e);
                throw new HttpRequestException(iOException);
            }
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    public static HttpRequest get(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, "GET");
    }

    public static HostnameVerifier getTrustedVerifier() {
        if (TRUSTED_VERIFIER == null) {
            TRUSTED_VERIFIER = new HostnameVerifier() {
                /* class com.umeng.message.util.HttpRequest.C38751 */

                public boolean verify(String str, SSLSession sSLSession) {
                    return true;
                }
            };
        }
        return TRUSTED_VERIFIER;
    }

    public static String getValidCharset(String str) {
        return (str == null || str.length() <= 0) ? "UTF-8" : str;
    }

    public static HttpRequest head(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, "HEAD");
    }

    public static void keepAlive(boolean z) {
        setProperty("http.keepAlive", Boolean.toString(z));
    }

    public static void nonProxyHosts(String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            setProperty("http.nonProxyHosts", null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        int length = strArr.length - 1;
        for (int i = 0; i < length; i++) {
            sb.append(strArr[i]);
            sb.append('|');
        }
        sb.append(strArr[length]);
        setProperty("http.nonProxyHosts", sb.toString());
    }

    public static HttpRequest options(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, "OPTIONS");
    }

    public static HttpRequest post(CharSequence charSequence) throws HttpRequestException {
        HttpRequest httpRequest = new HttpRequest(charSequence, "POST");
        httpRequest.getConnection().setConnectTimeout(connectTimeout);
        httpRequest.getConnection().setReadTimeout(readTimeOut);
        return httpRequest;
    }

    public static void proxyHost(String str) {
        setProperty("http.proxyHost", str);
        setProperty("https.proxyHost", str);
    }

    public static void proxyPort(int i) {
        String num = Integer.toString(i);
        setProperty("http.proxyPort", num);
        setProperty("https.proxyPort", num);
    }

    public static HttpRequest put(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, "PUT");
    }

    public static void setConnectionFactory(ConnectionFactory connectionFactory) {
        if (connectionFactory == null) {
            CONNECTION_FACTORY = ConnectionFactory.DEFAULT;
        } else {
            CONNECTION_FACTORY = connectionFactory;
        }
    }

    public static String setProperty(final String str, final String str2) {
        PrivilegedAction privilegedAction;
        if (str2 != null) {
            privilegedAction = new PrivilegedAction<String>() {
                /* class com.umeng.message.util.HttpRequest.C38794 */

                /* renamed from: a */
                public String run() {
                    return System.setProperty(str, str2);
                }
            };
        } else {
            privilegedAction = new PrivilegedAction<String>() {
                /* class com.umeng.message.util.HttpRequest.C38805 */

                /* renamed from: a */
                public String run() {
                    return System.clearProperty(str);
                }
            };
        }
        return (String) AccessController.doPrivileged(privilegedAction);
    }

    public static HttpRequest trace(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, METHOD_TRACE);
    }

    public HttpRequest accept(String str) {
        return header(HEADER_ACCEPT, str);
    }

    public HttpRequest acceptCharset(String str) {
        return header(HEADER_ACCEPT_CHARSET, str);
    }

    public HttpRequest acceptEncoding(String str) {
        return header("Accept-Encoding", str);
    }

    public HttpRequest acceptGzipEncoding() {
        return acceptEncoding("gzip");
    }

    public HttpRequest acceptJson() {
        return accept(CONTENT_TYPE_JSON);
    }

    public HttpRequest authorization(String str) {
        return header("Authorization", str);
    }

    public boolean badRequest() throws HttpRequestException {
        return 400 == code();
    }

    public HttpRequest basic(String str, String str2) {
        return authorization("Basic " + C3886a.m10676a(str + ':' + str2));
    }

    public String body(String str) throws HttpRequestException {
        ByteArrayOutputStream byteStream = byteStream();
        try {
            copy(buffer(), byteStream);
            return byteStream.toString(getValidCharset(str));
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public BufferedInputStream buffer() throws HttpRequestException {
        return new BufferedInputStream(stream(), this.bufferSize);
    }

    public HttpRequest bufferSize(int i) {
        if (i >= 1) {
            this.bufferSize = i;
            return this;
        }
        throw new IllegalArgumentException("Size must be greater than zero");
    }

    public BufferedReader bufferedReader(String str) throws HttpRequestException {
        return new BufferedReader(reader(str), this.bufferSize);
    }

    public ByteArrayOutputStream byteStream() {
        int contentLength = contentLength();
        if (contentLength > 0) {
            return new ByteArrayOutputStream(contentLength);
        }
        return new ByteArrayOutputStream();
    }

    public byte[] bytes() throws HttpRequestException {
        ByteArrayOutputStream byteStream = byteStream();
        try {
            copy(buffer(), byteStream);
            return byteStream.toByteArray();
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public String cacheControl() {
        return header("Cache-Control");
    }

    public String charset() {
        return parameter("Content-Type", PARAM_CHARSET);
    }

    public HttpRequest chunk(int i) {
        getConnection().setChunkedStreamingMode(i);
        return this;
    }

    public HttpRequest closeOutput() throws IOException {
        C3890e eVar = this.output;
        if (eVar == null) {
            return this;
        }
        if (this.multipart) {
            eVar.mo40142a("\r\n--00content0boundary00--\r\n");
        }
        if (this.ignoreCloseExceptions) {
            try {
                this.output.close();
            } catch (IOException unused) {
            }
        } else {
            this.output.close();
        }
        this.output = null;
        return this;
    }

    public HttpRequest closeOutputQuietly() throws HttpRequestException {
        try {
            return closeOutput();
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public int code() throws HttpRequestException {
        try {
            closeOutput();
            return getConnection().getResponseCode();
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public HttpRequest connectTimeout(int i) {
        getConnection().setConnectTimeout(i);
        return this;
    }

    public String contentEncoding() {
        return header("Content-Encoding");
    }

    public int contentLength() {
        return intHeader("Content-Length");
    }

    public HttpRequest contentType(String str) {
        return contentType(str, null);
    }

    public HttpRequest copy(final InputStream inputStream, final OutputStream outputStream) throws IOException {
        return (HttpRequest) new AbstractC3887b<HttpRequest>(this.ignoreCloseExceptions, inputStream) {
            /* class com.umeng.message.util.HttpRequest.C38849 */

            /* renamed from: a */
            public HttpRequest mo40125b() throws IOException {
                byte[] bArr = new byte[HttpRequest.this.bufferSize];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        return HttpRequest.this;
                    }
                    outputStream.write(bArr, 0, read);
                }
            }
        }.call();
    }

    public boolean created() throws HttpRequestException {
        return 201 == code();
    }

    public long date() {
        return dateHeader(HEADER_DATE);
    }

    public long dateHeader(String str) throws HttpRequestException {
        return dateHeader(str, -1);
    }

    public HttpRequest disconnect() {
        getConnection().disconnect();
        return this;
    }

    public String eTag() {
        return header(HEADER_ETAG);
    }

    public long expires() {
        return dateHeader(HEADER_EXPIRES);
    }

    public HttpRequest followRedirects(boolean z) {
        getConnection();
        HttpURLConnection.setFollowRedirects(z);
        return this;
    }

    public HttpRequest form(Map<?, ?> map) throws HttpRequestException {
        return form(map, "UTF-8");
    }

    public HttpURLConnection getConnection() {
        if (this.connection == null) {
            this.connection = createConnection();
        }
        return this.connection;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f A[EDGE_INSN: B:30:0x006f->B:29:0x006f ?: BREAK  , SYNTHETIC] */
    public java.lang.String getParam(java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.util.HttpRequest.getParam(java.lang.String, java.lang.String):java.lang.String");
    }

    public Map<String, String> getParams(String str) {
        String trim;
        int length;
        if (str == null || str.length() == 0) {
            return Collections.emptyMap();
        }
        int length2 = str.length();
        int indexOf = str.indexOf(59) + 1;
        if (indexOf == 0 || indexOf == length2) {
            return Collections.emptyMap();
        }
        int indexOf2 = str.indexOf(59, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = length2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (indexOf < indexOf2) {
            int indexOf3 = str.indexOf(61, indexOf);
            if (indexOf3 != -1 && indexOf3 < indexOf2) {
                String trim2 = str.substring(indexOf, indexOf3).trim();
                if (trim2.length() > 0 && (length = (trim = str.substring(indexOf3 + 1, indexOf2).trim()).length()) != 0) {
                    if (length > 2 && '\"' == trim.charAt(0)) {
                        int i = length - 1;
                        if ('\"' == trim.charAt(i)) {
                            linkedHashMap.put(trim2, trim.substring(1, i));
                        }
                    }
                    linkedHashMap.put(trim2, trim);
                }
            }
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(59, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = length2;
            }
        }
        return linkedHashMap;
    }

    public HttpRequest header(String str, String str2) {
        getConnection().setRequestProperty(str, str2);
        return this;
    }

    public HttpRequest headers(Map<String, String> map) {
        if (!map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                header(entry);
            }
        }
        return this;
    }

    public HttpRequest ifModifiedSince(long j) {
        getConnection().setIfModifiedSince(j);
        return this;
    }

    public HttpRequest ifNoneMatch(String str) {
        return header(HEADER_IF_NONE_MATCH, str);
    }

    public HttpRequest ignoreCloseExceptions(boolean z) {
        this.ignoreCloseExceptions = z;
        return this;
    }

    public int intHeader(String str) throws HttpRequestException {
        return intHeader(str, -1);
    }

    public boolean isBodyEmpty() throws HttpRequestException {
        return contentLength() == 0;
    }

    public long lastModified() {
        return dateHeader(HEADER_LAST_MODIFIED);
    }

    public String location() {
        return header("Location");
    }

    public String message() throws HttpRequestException {
        try {
            closeOutput();
            return getConnection().getResponseMessage();
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public String method() {
        return getConnection().getRequestMethod();
    }

    public boolean notFound() throws HttpRequestException {
        return 404 == code();
    }

    public boolean notModified() throws HttpRequestException {
        return 304 == code();
    }

    /* renamed from: ok */
    public boolean mo40077ok() throws HttpRequestException {
        return 200 == code();
    }

    public HttpRequest openOutput() throws IOException {
        if (this.output != null) {
            return this;
        }
        getConnection().setDoOutput(true);
        this.output = new C3890e(getConnection().getOutputStream(), getParam(getConnection().getRequestProperty("Content-Type"), PARAM_CHARSET), this.bufferSize);
        return this;
    }

    public String parameter(String str, String str2) {
        return getParam(header(str), str2);
    }

    public Map<String, String> parameters(String str) {
        return getParams(header(str));
    }

    public HttpRequest part(String str, String str2) {
        return part(str, (String) null, str2);
    }

    public HttpRequest partHeader(String str, String str2) throws HttpRequestException {
        return send(str).send(": ").send(str2).send("\r\n");
    }

    public HttpRequest proxyAuthorization(String str) {
        return header(HEADER_PROXY_AUTHORIZATION, str);
    }

    public HttpRequest proxyBasic(String str, String str2) {
        return proxyAuthorization("Basic " + C3886a.m10676a(str + ':' + str2));
    }

    public HttpRequest readTimeout(int i) {
        getConnection().setReadTimeout(i);
        return this;
    }

    public InputStreamReader reader(String str) throws HttpRequestException {
        try {
            return new InputStreamReader(stream(), getValidCharset(str));
        } catch (UnsupportedEncodingException e) {
            throw new HttpRequestException(e);
        }
    }

    public HttpRequest receive(File file) throws HttpRequestException {
        try {
            final BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), this.bufferSize);
            return (HttpRequest) new AbstractC3887b<HttpRequest>(this.ignoreCloseExceptions, bufferedOutputStream) {
                /* class com.umeng.message.util.HttpRequest.C38816 */

                /* renamed from: a */
                public HttpRequest mo40125b() throws HttpRequestException, IOException {
                    return HttpRequest.this.receive(bufferedOutputStream);
                }
            }.call();
        } catch (FileNotFoundException e) {
            throw new HttpRequestException(e);
        }
    }

    public HttpRequest referer(String str) {
        return header(HEADER_REFERER, str);
    }

    public HttpRequest send(File file) throws HttpRequestException {
        try {
            return send(new BufferedInputStream(new FileInputStream(file)));
        } catch (FileNotFoundException e) {
            throw new HttpRequestException(e);
        }
    }

    public String server() {
        return header(HEADER_SERVER);
    }

    public boolean serverError() throws HttpRequestException {
        return 500 == code();
    }

    public HttpRequest startPart() throws IOException {
        if (!this.multipart) {
            this.multipart = true;
            contentType(CONTENT_TYPE_MULTIPART).openOutput();
            this.output.mo40142a("--00content0boundary00\r\n");
        } else {
            this.output.mo40142a("\r\n--00content0boundary00\r\n");
        }
        return this;
    }

    public InputStream stream() throws HttpRequestException {
        InputStream inputStream;
        if (code() < 400) {
            try {
                inputStream = getConnection().getInputStream();
            } catch (IOException e) {
                throw new HttpRequestException(e);
            }
        } else {
            inputStream = getConnection().getErrorStream();
            if (inputStream == null) {
                try {
                    inputStream = getConnection().getInputStream();
                } catch (IOException e2) {
                    throw new HttpRequestException(e2);
                }
            }
        }
        if (!this.uncompress || !"gzip".equals(contentEncoding())) {
            return inputStream;
        }
        try {
            return new GZIPInputStream(inputStream);
        } catch (IOException e3) {
            throw new HttpRequestException(e3);
        }
    }

    public String toString() {
        return method() + ' ' + url();
    }

    public HttpRequest trustAllHosts() {
        HttpURLConnection connection2 = getConnection();
        if (connection2 instanceof HttpsURLConnection) {
            ((HttpsURLConnection) connection2).setHostnameVerifier(getTrustedVerifier());
        }
        return this;
    }

    public HttpRequest trustHosts() {
        HttpURLConnection connection2 = getConnection();
        if (connection2 instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) connection2;
            httpsURLConnection.setHostnameVerifier(getTrustedVerifier(httpsURLConnection));
        }
        return this;
    }

    public HttpRequest uncompress(boolean z) {
        this.uncompress = z;
        return this;
    }

    public URL url() {
        return getConnection().getURL();
    }

    public HttpRequest useCaches(boolean z) {
        getConnection().setUseCaches(z);
        return this;
    }

    public HttpRequest useProxy(String str, int i) {
        if (this.connection == null) {
            this.httpProxyHost = str;
            this.httpProxyPort = i;
            return this;
        }
        throw new IllegalStateException("The connection has already been created. This method must be called before reading or writing to the request.");
    }

    public HttpRequest userAgent(String str) {
        return header("User-Agent", str);
    }

    public HttpRequest writePartHeader(String str, String str2) throws IOException {
        return writePartHeader(str, str2, null);
    }

    public OutputStreamWriter writer() throws HttpRequestException {
        try {
            openOutput();
            return new OutputStreamWriter(this.output, this.output.f10594a.charset());
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public static HttpRequest delete(URL url2) throws HttpRequestException {
        return new HttpRequest(url2, "DELETE");
    }

    public static HttpRequest get(URL url2) throws HttpRequestException {
        return new HttpRequest(url2, "GET");
    }

    public static HttpRequest head(URL url2) throws HttpRequestException {
        return new HttpRequest(url2, "HEAD");
    }

    public static HttpRequest options(URL url2) throws HttpRequestException {
        return new HttpRequest(url2, "OPTIONS");
    }

    public static HttpRequest put(URL url2) throws HttpRequestException {
        return new HttpRequest(url2, "PUT");
    }

    public static HttpRequest trace(URL url2) throws HttpRequestException {
        return new HttpRequest(url2, METHOD_TRACE);
    }

    public BufferedReader bufferedReader() throws HttpRequestException {
        return bufferedReader(charset());
    }

    public HttpRequest contentLength(String str) {
        return contentLength(Integer.parseInt(str));
    }

    public HttpRequest contentType(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return header("Content-Type", str);
        }
        return header("Content-Type", str + "; charset=" + str2);
    }

    public long dateHeader(String str, long j) throws HttpRequestException {
        closeOutputQuietly();
        return getConnection().getHeaderFieldDate(str, j);
    }

    public HttpRequest form(Map.Entry<?, ?> entry) throws HttpRequestException {
        return form(entry, "UTF-8");
    }

    public HttpRequest header(String str, Number number) {
        return header(str, number != null ? number.toString() : null);
    }

    public boolean ignoreCloseExceptions() {
        return this.ignoreCloseExceptions;
    }

    public int intHeader(String str, int i) throws HttpRequestException {
        closeOutputQuietly();
        return getConnection().getHeaderFieldInt(str, i);
    }

    public HttpRequest part(String str, String str2, String str3) throws HttpRequestException {
        return part(str, str2, (String) null, str3);
    }

    public HttpRequest writePartHeader(String str, String str2, String str3) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=\"");
        sb.append(str);
        if (str2 != null) {
            sb.append("\"; filename=\"");
            sb.append(str2);
        }
        sb.append(C8318oOo0oooo.OooO00o);
        partHeader("Content-Disposition", sb.toString());
        if (str3 != null) {
            partHeader("Content-Type", str3);
        }
        return send("\r\n");
    }

    public static HttpRequest delete(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String append = append(charSequence, map);
        if (z) {
            append = encode(append);
        }
        return delete(append);
    }

    public static HttpRequest get(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String append = append(charSequence, map);
        if (z) {
            append = encode(append);
        }
        return get(append);
    }

    public static HttpRequest head(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String append = append(charSequence, map);
        if (z) {
            append = encode(append);
        }
        return head(append);
    }

    public static HttpRequest put(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String append = append(charSequence, map);
        if (z) {
            append = encode(append);
        }
        return put(append);
    }

    public int bufferSize() {
        return this.bufferSize;
    }

    public HttpRequest contentLength(int i) {
        getConnection().setFixedLengthStreamingMode(i);
        return this;
    }

    public HttpRequest copy(final Reader reader, final Writer writer) throws IOException {
        return (HttpRequest) new AbstractC3887b<HttpRequest>(this.ignoreCloseExceptions, reader) {
            /* class com.umeng.message.util.HttpRequest.C387610 */

            /* renamed from: a */
            public HttpRequest mo40125b() throws IOException {
                char[] cArr = new char[HttpRequest.this.bufferSize];
                while (true) {
                    int read = reader.read(cArr);
                    if (read == -1) {
                        return HttpRequest.this;
                    }
                    writer.write(cArr, 0, read);
                }
            }
        }.call();
    }

    public HttpRequest form(Map.Entry<?, ?> entry, String str) throws HttpRequestException {
        return form(entry.getKey(), entry.getValue(), str);
    }

    public HttpRequest header(Map.Entry<String, String> entry) {
        return header(entry.getKey(), entry.getValue());
    }

    public HttpRequest part(String str, String str2, String str3, String str4) throws HttpRequestException {
        try {
            startPart();
            writePartHeader(str, str2, str3);
            this.output.mo40142a(str4);
            return this;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public InputStreamReader reader() throws HttpRequestException {
        return reader(charset());
    }

    public static HostnameVerifier getTrustedVerifier(final HttpsURLConnection httpsURLConnection) {
        if (TRUSTED_VERIFIER == null) {
            TRUSTED_VERIFIER = new HostnameVerifier() {
                /* class com.umeng.message.util.HttpRequest.C38783 */

                public boolean verify(String str, SSLSession sSLSession) {
                    String requestProperty = httpsURLConnection.getRequestProperty(HttpConstant.HOST);
                    if (requestProperty == null) {
                        requestProperty = httpsURLConnection.getURL().getHost();
                    }
                    return HttpsURLConnection.getDefaultHostnameVerifier().verify(requestProperty, sSLSession);
                }
            };
        }
        return TRUSTED_VERIFIER;
    }

    public static HttpRequest post(URL url2) throws HttpRequestException {
        HttpRequest httpRequest = new HttpRequest(url2, "POST");
        httpRequest.getConnection().setConnectTimeout(connectTimeout);
        httpRequest.getConnection().setReadTimeout(readTimeOut);
        return httpRequest;
    }

    public HttpRequest code(AtomicInteger atomicInteger) throws HttpRequestException {
        atomicInteger.set(code());
        return this;
    }

    public HttpRequest form(Object obj, Object obj2) throws HttpRequestException {
        return form(obj, obj2, "UTF-8");
    }

    public String header(String str) throws HttpRequestException {
        closeOutputQuietly();
        return getConnection().getHeaderField(str);
    }

    public Map<String, List<String>> headers() throws HttpRequestException {
        closeOutputQuietly();
        return getConnection().getHeaderFields();
    }

    public HttpRequest send(byte[] bArr) throws HttpRequestException {
        return send(new ByteArrayInputStream(bArr));
    }

    public static HttpRequest delete(CharSequence charSequence, boolean z, Object... objArr) {
        String append = append(charSequence, objArr);
        if (z) {
            append = encode(append);
        }
        return delete(append);
    }

    public static HttpRequest get(CharSequence charSequence, boolean z, Object... objArr) {
        String append = append(charSequence, objArr);
        if (z) {
            append = encode(append);
        }
        return get(append);
    }

    public static HttpRequest head(CharSequence charSequence, boolean z, Object... objArr) {
        String append = append(charSequence, objArr);
        if (z) {
            append = encode(append);
        }
        return head(append);
    }

    public static HttpRequest put(CharSequence charSequence, boolean z, Object... objArr) {
        String append = append(charSequence, objArr);
        if (z) {
            append = encode(append);
        }
        return put(append);
    }

    public String body() throws HttpRequestException {
        return body(charset());
    }

    public String contentType() {
        return header("Content-Type");
    }

    public HttpRequest form(Object obj, Object obj2, String str) throws HttpRequestException {
        boolean z = !this.form;
        if (z) {
            contentType(CONTENT_TYPE_FORM, str);
            this.form = true;
        }
        String validCharset = getValidCharset(str);
        try {
            openOutput();
            if (!z) {
                this.output.write(38);
            }
            this.output.mo40142a(URLEncoder.encode(obj.toString(), validCharset));
            this.output.write(61);
            if (obj2 != null) {
                this.output.mo40142a(URLEncoder.encode(obj2.toString(), validCharset));
            }
            return this;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public HttpRequest receive(OutputStream outputStream) throws HttpRequestException {
        try {
            return copy(buffer(), outputStream);
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public HttpRequest send(InputStream inputStream) throws HttpRequestException {
        try {
            openOutput();
            copy(inputStream, this.output);
            return this;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public HttpRequest body(AtomicReference<String> atomicReference) throws HttpRequestException {
        atomicReference.set(body());
        return this;
    }

    public String[] headers(String str) {
        Map<String, List<String>> headers = headers();
        if (headers == null || headers.isEmpty()) {
            return EMPTY_STRINGS;
        }
        List<String> list = headers.get(str);
        if (list == null || list.isEmpty()) {
            return EMPTY_STRINGS;
        }
        return (String[]) list.toArray(new String[list.size()]);
    }

    public static HttpRequest post(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String append = append(charSequence, map);
        if (z) {
            append = encode(append);
        }
        return post(append);
    }

    public HttpRequest body(AtomicReference<String> atomicReference, String str) throws HttpRequestException {
        atomicReference.set(body(str));
        return this;
    }

    public HttpRequest part(String str, Number number) throws HttpRequestException {
        return part(str, (String) null, number);
    }

    public HttpRequest receive(PrintStream printStream) throws HttpRequestException {
        return receive((OutputStream) printStream);
    }

    public HttpRequest part(String str, String str2, Number number) throws HttpRequestException {
        return part(str, str2, number != null ? number.toString() : null);
    }

    public HttpRequest receive(final Appendable appendable) throws HttpRequestException {
        final BufferedReader bufferedReader = bufferedReader();
        return (HttpRequest) new AbstractC3887b<HttpRequest>(this.ignoreCloseExceptions, bufferedReader) {
            /* class com.umeng.message.util.HttpRequest.C38827 */

            /* renamed from: a */
            public HttpRequest mo40125b() throws IOException {
                CharBuffer allocate = CharBuffer.allocate(HttpRequest.this.bufferSize);
                while (true) {
                    int read = bufferedReader.read(allocate);
                    if (read == -1) {
                        return HttpRequest.this;
                    }
                    allocate.rewind();
                    appendable.append(allocate, 0, read);
                    allocate.rewind();
                }
            }
        }.call();
    }

    public HttpRequest send(final Reader reader) throws HttpRequestException {
        try {
            openOutput();
            C3890e eVar = this.output;
            final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(eVar, eVar.f10594a.charset());
            return (HttpRequest) new AbstractC3888c<HttpRequest>(outputStreamWriter) {
                /* class com.umeng.message.util.HttpRequest.C38772 */

                /* renamed from: a */
                public HttpRequest mo40125b() throws IOException {
                    return HttpRequest.this.copy(reader, outputStreamWriter);
                }
            }.call();
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public HttpRequest(URL url2, String str) throws HttpRequestException {
        this.url = url2;
        this.requestMethod = str;
    }

    public static HttpRequest post(CharSequence charSequence, boolean z, Object... objArr) {
        String append = append(charSequence, objArr);
        if (z) {
            append = encode(append);
        }
        return post(append);
    }

    public HttpRequest part(String str, File file) throws HttpRequestException {
        return part(str, (String) null, file);
    }

    public HttpRequest part(String str, String str2, File file) throws HttpRequestException {
        return part(str, str2, (String) null, file);
    }

    public HttpRequest part(String str, String str2, String str3, File file) throws HttpRequestException {
        try {
            return part(str, str2, str3, new BufferedInputStream(new FileInputStream(file)));
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public HttpRequest receive(final Writer writer) throws HttpRequestException {
        final BufferedReader bufferedReader = bufferedReader();
        return (HttpRequest) new AbstractC3887b<HttpRequest>(this.ignoreCloseExceptions, bufferedReader) {
            /* class com.umeng.message.util.HttpRequest.C38838 */

            /* renamed from: a */
            public HttpRequest mo40125b() throws IOException {
                return HttpRequest.this.copy(bufferedReader, writer);
            }
        }.call();
    }

    /* renamed from: com.umeng.message.util.HttpRequest$a */
    public static class C3886a {

        /* renamed from: a */
        public static final byte f10588a = 61;

        /* renamed from: b */
        public static final String f10589b = "US-ASCII";

        /* renamed from: c */
        public static final byte[] f10590c = {C8027oOO00oo.OooO00o, 66, 67, 68, 69, 70, C8027oOO00oo.OooO0O0, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: a */
        public static byte[] m10679a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            byte[] bArr3 = f10590c;
            int i4 = 0;
            int i5 = (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0);
            if (i2 > 2) {
                i4 = (bArr[i + 2] << 24) >>> 24;
            }
            int i6 = i5 | i4;
            if (i2 == 1) {
                bArr2[i3] = bArr3[i6 >>> 18];
                bArr2[i3 + 1] = bArr3[(i6 >>> 12) & 63];
                bArr2[i3 + 2] = 61;
                bArr2[i3 + 3] = 61;
                return bArr2;
            } else if (i2 == 2) {
                bArr2[i3] = bArr3[i6 >>> 18];
                bArr2[i3 + 1] = bArr3[(i6 >>> 12) & 63];
                bArr2[i3 + 2] = bArr3[(i6 >>> 6) & 63];
                bArr2[i3 + 3] = 61;
                return bArr2;
            } else if (i2 != 3) {
                return bArr2;
            } else {
                bArr2[i3] = bArr3[i6 >>> 18];
                bArr2[i3 + 1] = bArr3[(i6 >>> 12) & 63];
                bArr2[i3 + 2] = bArr3[(i6 >>> 6) & 63];
                bArr2[i3 + 3] = bArr3[i6 & 63];
                return bArr2;
            }
        }

        /* renamed from: b */
        public static byte[] m10680b(byte[] bArr, int i, int i2) {
            if (bArr == null) {
                throw new NullPointerException("Cannot serialize a null array.");
            } else if (i < 0) {
                throw new IllegalArgumentException("Cannot have negative offset: " + i);
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Cannot have length offset: " + i2);
            } else if (i + i2 <= bArr.length) {
                int i3 = 4;
                int i4 = (i2 / 3) * 4;
                if (i2 % 3 <= 0) {
                    i3 = 0;
                }
                int i5 = i4 + i3;
                byte[] bArr2 = new byte[i5];
                int i6 = i2 - 2;
                int i7 = 0;
                int i8 = 0;
                while (i7 < i6) {
                    m10679a(bArr, i7 + i, 3, bArr2, i8);
                    i7 += 3;
                    i8 += 4;
                }
                if (i7 < i2) {
                    m10679a(bArr, i + i7, i2 - i7, bArr2, i8);
                    i8 += 4;
                }
                if (i8 > i5 - 1) {
                    return bArr2;
                }
                byte[] bArr3 = new byte[i8];
                System.arraycopy(bArr2, 0, bArr3, 0, i8);
                return bArr3;
            } else {
                throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)));
            }
        }

        /* renamed from: a */
        public static String m10676a(String str) {
            byte[] bArr;
            try {
                bArr = str.getBytes("US-ASCII");
            } catch (UnsupportedEncodingException unused) {
                bArr = str.getBytes();
            }
            return m10677a(bArr);
        }

        /* renamed from: a */
        public static String m10677a(byte[] bArr) {
            return m10678a(bArr, 0, bArr.length);
        }

        /* renamed from: a */
        public static String m10678a(byte[] bArr, int i, int i2) {
            byte[] b = m10680b(bArr, i, i2);
            try {
                return new String(b, "US-ASCII");
            } catch (UnsupportedEncodingException unused) {
                return new String(b);
            }
        }
    }

    public HttpRequest part(String str, InputStream inputStream) throws HttpRequestException {
        return part(str, (String) null, (String) null, inputStream);
    }

    public HttpRequest send(CharSequence charSequence) throws HttpRequestException {
        try {
            openOutput();
            this.output.mo40142a(charSequence.toString());
            return this;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public HttpRequest form(Map<?, ?> map, String str) throws HttpRequestException {
        if (!map.isEmpty()) {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                form(entry, str);
            }
        }
        return this;
    }

    public HttpRequest part(String str, String str2, String str3, InputStream inputStream) throws HttpRequestException {
        try {
            startPart();
            writePartHeader(str, str2, str3);
            copy(inputStream, this.output);
            return this;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public static String append(CharSequence charSequence, Object... objArr) {
        String charSequence2 = charSequence.toString();
        if (objArr == null || objArr.length == 0) {
            return charSequence2;
        }
        if (objArr.length % 2 == 0) {
            StringBuilder sb = new StringBuilder(charSequence2);
            addPathSeparator(charSequence2, sb);
            addParamPrefix(charSequence2, sb);
            sb.append(objArr[0]);
            sb.append(C7490o0OoOO0o.OooO00o);
            Object obj = objArr[1];
            if (obj != null) {
                sb.append(obj);
            }
            for (int i = 2; i < objArr.length; i += 2) {
                sb.append(C8318oOo0oooo.OooO0OO);
                sb.append(objArr[i]);
                sb.append(C7490o0OoOO0o.OooO00o);
                Object obj2 = objArr[i + 1];
                if (obj2 != null) {
                    sb.append(obj2);
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Must specify an even number of parameter names/values");
    }
}
