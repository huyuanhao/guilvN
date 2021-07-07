package okhttp3;

import com.p118pd.sdk.AbstractC8210oOOoO0o0;
import com.p118pd.sdk.AbstractC8930ooOOO0OO;
import com.p118pd.sdk.C9143oooO0oOo;
import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.oOOO0000;
import com.p118pd.sdk.oOOO000O;
import com.p118pd.sdk.oOOO00O0;
import com.p118pd.sdk.oOOO00OO;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.p287io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.ByteString;

public final class Cache implements Closeable, Flushable {
    public static final int ENTRY_BODY = 1;
    public static final int ENTRY_COUNT = 2;
    public static final int ENTRY_METADATA = 0;
    public static final int VERSION = 201105;
    public final DiskLruCache cache;
    public int hitCount;
    public final InternalCache internalCache;
    public int networkCount;
    public int requestCount;
    public int writeAbortCount;
    public int writeSuccessCount;

    public final class CacheRequestImpl implements CacheRequest {
        public AbstractC8210oOOoO0o0 body;
        public AbstractC8210oOOoO0o0 cacheOut;
        public boolean done;
        public final DiskLruCache.Editor editor;

        public CacheRequestImpl(final DiskLruCache.Editor editor2) {
            this.editor = editor2;
            AbstractC8210oOOoO0o0 newSink = editor2.newSink(1);
            this.cacheOut = newSink;
            this.body = new oOOO00O0(newSink, Cache.this) {
                /* class okhttp3.Cache.CacheRequestImpl.C47481 */

                @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8210oOOoO0o0, com.p118pd.sdk.oOOO00O0, java.lang.AutoCloseable
                public void close() throws IOException {
                    synchronized (Cache.this) {
                        if (!CacheRequestImpl.this.done) {
                            CacheRequestImpl.this.done = true;
                            Cache.this.writeSuccessCount++;
                            super.close();
                            editor2.commit();
                        }
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            synchronized (Cache.this) {
                if (!this.done) {
                    this.done = true;
                    Cache.this.writeAbortCount++;
                    Util.closeQuietly(this.cacheOut);
                    try {
                        this.editor.abort();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public AbstractC8210oOOoO0o0 body() {
            return this.body;
        }
    }

    public static class CacheResponseBody extends ResponseBody {
        public final oOOO000O bodySource;
        @Nullable
        public final String contentLength;
        @Nullable
        public final String contentType;
        public final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(final DiskLruCache.Snapshot snapshot2, String str, String str2) {
            this.snapshot = snapshot2;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = C9143oooO0oOo.OooO00o(new oOOO00OO(snapshot2.getSource(1)) {
                /* class okhttp3.Cache.CacheResponseBody.C47491 */

                @Override // java.io.Closeable, com.p118pd.sdk.oOOO00OO, com.p118pd.sdk.AbstractC8930ooOOO0OO, java.lang.AutoCloseable
                public void close() throws IOException {
                    snapshot2.close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            try {
                if (this.contentLength != null) {
                    return Long.parseLong(this.contentLength);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.parse(str);
            }
            return null;
        }

        @Override // okhttp3.ResponseBody
        public oOOO000O source() {
            return this.bodySource;
        }
    }

    public Cache(File file, long j) {
        this(file, j, FileSystem.SYSTEM);
    }

    private void abortQuietly(@Nullable DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static String key(HttpUrl httpUrl) {
        return ByteString.encodeUtf8(httpUrl.toString()).md5().hex();
    }

    public static int readInt(oOOO000O oooo000o) throws IOException {
        try {
            long OooO0OO = oooo000o.m19765OooO0OO();
            String OooO0Oo = oooo000o.OooO0Oo();
            if (OooO0OO >= 0 && OooO0OO <= 2147483647L && OooO0Oo.isEmpty()) {
                return (int) OooO0OO;
            }
            throw new IOException("expected an int but was \"" + OooO0OO + OooO0Oo + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    public void delete() throws IOException {
        this.cache.delete();
    }

    public File directory() {
        return this.cache.getDirectory();
    }

    public void evictAll() throws IOException {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    @Nullable
    public Response get(Request request) {
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (entry.matches(request, response)) {
                    return response;
                }
                Util.closeQuietly(response.body());
                return null;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public synchronized int hitCount() {
        return this.hitCount;
    }

    public void initialize() throws IOException {
        this.cache.initialize();
    }

    public boolean isClosed() {
        return this.cache.isClosed();
    }

    public long maxSize() {
        return this.cache.getMaxSize();
    }

    public synchronized int networkCount() {
        return this.networkCount;
    }

    @Nullable
    public CacheRequest put(Response response) {
        DiskLruCache.Editor editor;
        String method = response.request().method();
        if (HttpMethod.invalidatesCache(response.request().method())) {
            try {
                remove(response.request());
            } catch (IOException unused) {
            }
            return null;
        } else if (!method.equals("GET") || HttpHeaders.hasVaryAll(response)) {
            return null;
        } else {
            Entry entry = new Entry(response);
            try {
                editor = this.cache.edit(key(response.request().url()));
                if (editor == null) {
                    return null;
                }
                try {
                    entry.writeTo(editor);
                    return new CacheRequestImpl(editor);
                } catch (IOException unused2) {
                    abortQuietly(editor);
                    return null;
                }
            } catch (IOException unused3) {
                editor = null;
                abortQuietly(editor);
                return null;
            }
        }
    }

    public void remove(Request request) throws IOException {
        this.cache.remove(key(request.url()));
    }

    public synchronized int requestCount() {
        return this.requestCount;
    }

    public long size() throws IOException {
        return this.cache.size();
    }

    public synchronized void trackConditionalCacheHit() {
        this.hitCount++;
    }

    public synchronized void trackResponse(CacheStrategy cacheStrategy) {
        this.requestCount++;
        if (cacheStrategy.networkRequest != null) {
            this.networkCount++;
        } else if (cacheStrategy.cacheResponse != null) {
            this.hitCount++;
        }
    }

    public void update(Response response, Response response2) {
        DiskLruCache.Editor editor;
        Entry entry = new Entry(response2);
        try {
            editor = ((CacheResponseBody) response.body()).snapshot.edit();
            if (editor != null) {
                try {
                    entry.writeTo(editor);
                    editor.commit();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            editor = null;
            abortQuietly(editor);
        }
    }

    public Iterator<String> urls() throws IOException {
        return new Iterator<String>() {
            /* class okhttp3.Cache.C47472 */
            public boolean canRemove;
            public final Iterator<DiskLruCache.Snapshot> delegate = Cache.this.cache.snapshots();
            @Nullable
            public String nextUrl;

            public boolean hasNext() {
                if (this.nextUrl != null) {
                    return true;
                }
                this.canRemove = false;
                while (this.delegate.hasNext()) {
                    DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        this.nextUrl = C9143oooO0oOo.OooO00o(next.getSource(0)).OooO0Oo();
                        return true;
                    } catch (IOException unused) {
                    } finally {
                        next.close();
                    }
                }
                return false;
            }

            public void remove() {
                if (this.canRemove) {
                    this.delegate.remove();
                    return;
                }
                throw new IllegalStateException("remove() before next()");
            }

            @Override // java.util.Iterator
            public String next() {
                if (hasNext()) {
                    String str = this.nextUrl;
                    this.nextUrl = null;
                    this.canRemove = true;
                    return str;
                }
                throw new NoSuchElementException();
            }
        };
    }

    public synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    public Cache(File file, long j, FileSystem fileSystem) {
        this.internalCache = new InternalCache() {
            /* class okhttp3.Cache.C47461 */

            @Override // okhttp3.internal.cache.InternalCache
            public Response get(Request request) throws IOException {
                return Cache.this.get(request);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public CacheRequest put(Response response) throws IOException {
                return Cache.this.put(response);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void remove(Request request) throws IOException {
                Cache.this.remove(request);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void trackConditionalCacheHit() {
                Cache.this.trackConditionalCacheHit();
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void trackResponse(CacheStrategy cacheStrategy) {
                Cache.this.trackResponse(cacheStrategy);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void update(Response response, Response response2) {
                Cache.this.update(response, response2);
            }
        };
        this.cache = DiskLruCache.create(fileSystem, file, VERSION, 2, j);
    }

    public static final class Entry {
        public static final String RECEIVED_MILLIS = (Platform.get().getPrefix() + "-Received-Millis");
        public static final String SENT_MILLIS = (Platform.get().getPrefix() + "-Sent-Millis");
        public final int code;
        @Nullable
        public final Handshake handshake;
        public final String message;
        public final Protocol protocol;
        public final long receivedResponseMillis;
        public final String requestMethod;
        public final Headers responseHeaders;
        public final long sentRequestMillis;
        public final String url;
        public final Headers varyHeaders;

        public Entry(AbstractC8930ooOOO0OO ooooo0oo) throws IOException {
            TlsVersion tlsVersion;
            try {
                oOOO000O OooO00o = C9143oooO0oOo.OooO00o(ooooo0oo);
                this.url = OooO00o.OooO0Oo();
                this.requestMethod = OooO00o.OooO0Oo();
                Headers.Builder builder = new Headers.Builder();
                int readInt = Cache.readInt(OooO00o);
                for (int i = 0; i < readInt; i++) {
                    builder.addLenient(OooO00o.OooO0Oo());
                }
                this.varyHeaders = builder.build();
                StatusLine parse = StatusLine.parse(OooO00o.OooO0Oo());
                this.protocol = parse.protocol;
                this.code = parse.code;
                this.message = parse.message;
                Headers.Builder builder2 = new Headers.Builder();
                int readInt2 = Cache.readInt(OooO00o);
                for (int i2 = 0; i2 < readInt2; i2++) {
                    builder2.addLenient(OooO00o.OooO0Oo());
                }
                String str = builder2.get(SENT_MILLIS);
                String str2 = builder2.get(RECEIVED_MILLIS);
                builder2.removeAll(SENT_MILLIS);
                builder2.removeAll(RECEIVED_MILLIS);
                long j = 0;
                this.sentRequestMillis = str != null ? Long.parseLong(str) : 0;
                this.receivedResponseMillis = str2 != null ? Long.parseLong(str2) : j;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String OooO0Oo = OooO00o.OooO0Oo();
                    if (OooO0Oo.length() <= 0) {
                        CipherSuite forJavaName = CipherSuite.forJavaName(OooO00o.OooO0Oo());
                        List<Certificate> readCertificateList = readCertificateList(OooO00o);
                        List<Certificate> readCertificateList2 = readCertificateList(OooO00o);
                        if (!OooO00o.m19766OooO0OO()) {
                            tlsVersion = TlsVersion.forJavaName(OooO00o.OooO0Oo());
                        } else {
                            tlsVersion = TlsVersion.SSL_3_0;
                        }
                        this.handshake = Handshake.get(tlsVersion, forJavaName, readCertificateList, readCertificateList2);
                    } else {
                        throw new IOException("expected \"\" but was \"" + OooO0Oo + "\"");
                    }
                } else {
                    this.handshake = null;
                }
            } finally {
                ooooo0oo.close();
            }
        }

        private boolean isHttps() {
            return this.url.startsWith("https://");
        }

        private List<Certificate> readCertificateList(oOOO000O oooo000o) throws IOException {
            int readInt = Cache.readInt(oooo000o);
            if (readInt == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i < readInt; i++) {
                    String OooO0Oo = oooo000o.OooO0Oo();
                    OOOO000 oooo000 = new OOOO000();
                    oooo000.OooO00o(ByteString.decodeBase64(OooO0Oo));
                    arrayList.add(instance.generateCertificate(oooo000.m16591OooO00o()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private void writeCertList(oOOO0000 oooo0000, List<Certificate> list) throws IOException {
            try {
                oooo0000.OooO0O0((long) list.size()).OooO0o0(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    oooo0000.OooO00o(ByteString.m14263of(list.get(i).getEncoded()).base64()).OooO0o0(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public boolean matches(Request request, Response response) {
            return this.url.equals(request.url().toString()) && this.requestMethod.equals(request.method()) && HttpHeaders.varyMatches(response, this.varyHeaders, request);
        }

        public Response response(DiskLruCache.Snapshot snapshot) {
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public void writeTo(DiskLruCache.Editor editor) throws IOException {
            oOOO0000 OooO00o = C9143oooO0oOo.OooO00o(editor.newSink(0));
            OooO00o.OooO00o(this.url).OooO0o0(10);
            OooO00o.OooO00o(this.requestMethod).OooO0o0(10);
            OooO00o.OooO0O0((long) this.varyHeaders.size()).OooO0o0(10);
            int size = this.varyHeaders.size();
            for (int i = 0; i < size; i++) {
                OooO00o.OooO00o(this.varyHeaders.name(i)).OooO00o(": ").OooO00o(this.varyHeaders.value(i)).OooO0o0(10);
            }
            OooO00o.OooO00o(new StatusLine(this.protocol, this.code, this.message).toString()).OooO0o0(10);
            OooO00o.OooO0O0((long) (this.responseHeaders.size() + 2)).OooO0o0(10);
            int size2 = this.responseHeaders.size();
            for (int i2 = 0; i2 < size2; i2++) {
                OooO00o.OooO00o(this.responseHeaders.name(i2)).OooO00o(": ").OooO00o(this.responseHeaders.value(i2)).OooO0o0(10);
            }
            OooO00o.OooO00o(SENT_MILLIS).OooO00o(": ").OooO0O0(this.sentRequestMillis).OooO0o0(10);
            OooO00o.OooO00o(RECEIVED_MILLIS).OooO00o(": ").OooO0O0(this.receivedResponseMillis).OooO0o0(10);
            if (isHttps()) {
                OooO00o.OooO0o0(10);
                OooO00o.OooO00o(this.handshake.cipherSuite().javaName()).OooO0o0(10);
                writeCertList(OooO00o, this.handshake.peerCertificates());
                writeCertList(OooO00o, this.handshake.localCertificates());
                OooO00o.OooO00o(this.handshake.tlsVersion().javaName()).OooO0o0(10);
            }
            OooO00o.close();
        }

        public Entry(Response response) {
            this.url = response.request().url().toString();
            this.varyHeaders = HttpHeaders.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}
