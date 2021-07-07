package okhttp3.internal.http1;

import android.support.p000v4.media.session.PlaybackStateCompat;
import com.p118pd.sdk.AbstractC8210oOOoO0o0;
import com.p118pd.sdk.AbstractC8930ooOOO0OO;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.p118pd.sdk.C9143oooO0oOo;
import com.p118pd.sdk.C9193oooOoo;
import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.OOOO0o;
import com.p118pd.sdk.oOOO0000;
import com.p118pd.sdk.oOOO000O;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

public final class Http1Codec implements HttpCodec {
    public static final int HEADER_LIMIT = 262144;
    public static final int STATE_CLOSED = 6;
    public static final int STATE_IDLE = 0;
    public static final int STATE_OPEN_REQUEST_BODY = 1;
    public static final int STATE_OPEN_RESPONSE_BODY = 4;
    public static final int STATE_READING_RESPONSE_BODY = 5;
    public static final int STATE_READ_RESPONSE_HEADERS = 3;
    public static final int STATE_WRITING_REQUEST_BODY = 2;
    public final OkHttpClient client;
    public long headerLimit = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    public final oOOO0000 sink;
    public final oOOO000O source;
    public int state = 0;
    public final StreamAllocation streamAllocation;

    public abstract class AbstractSource implements AbstractC8930ooOOO0OO {
        public long bytesRead;
        public boolean closed;
        public final OOOO0o timeout;

        public AbstractSource() {
            this.timeout = new OOOO0o(Http1Codec.this.source.timeout());
            this.bytesRead = 0;
        }

        public final void endOfInput(boolean z, IOException iOException) throws IOException {
            Http1Codec http1Codec = Http1Codec.this;
            int i = http1Codec.state;
            if (i != 6) {
                if (i == 5) {
                    http1Codec.detachTimeout(this.timeout);
                    Http1Codec http1Codec2 = Http1Codec.this;
                    http1Codec2.state = 6;
                    StreamAllocation streamAllocation = http1Codec2.streamAllocation;
                    if (streamAllocation != null) {
                        streamAllocation.streamFinished(!z, http1Codec2, this.bytesRead, iOException);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("state: " + Http1Codec.this.state);
            }
        }

        @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
        public long read(OOOO000 oooo000, long j) throws IOException {
            try {
                long read = Http1Codec.this.source.read(oooo000, j);
                if (read > 0) {
                    this.bytesRead += read;
                }
                return read;
            } catch (IOException e) {
                endOfInput(false, e);
                throw e;
            }
        }

        @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
        public C9193oooOoo timeout() {
            return this.timeout;
        }
    }

    public final class ChunkedSink implements AbstractC8210oOOoO0o0 {
        public boolean closed;
        public final OOOO0o timeout = new OOOO0o(Http1Codec.this.sink.timeout());

        public ChunkedSink() {
        }

        @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8210oOOoO0o0, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (!this.closed) {
                this.closed = true;
                Http1Codec.this.sink.OooO00o("0\r\n\r\n");
                Http1Codec.this.detachTimeout(this.timeout);
                Http1Codec.this.state = 3;
            }
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (!this.closed) {
                Http1Codec.this.sink.flush();
            }
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
        public C9193oooOoo timeout() {
            return this.timeout;
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
        public void write(OOOO000 oooo000, long j) throws IOException {
            if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                Http1Codec.this.sink.OooO00o(j);
                Http1Codec.this.sink.OooO00o("\r\n");
                Http1Codec.this.sink.write(oooo000, j);
                Http1Codec.this.sink.OooO00o("\r\n");
            }
        }
    }

    public class ChunkedSource extends AbstractSource {
        public static final long NO_CHUNK_YET = -1;
        public long bytesRemainingInChunk = -1;
        public boolean hasMoreChunks = true;
        public final HttpUrl url;

        public ChunkedSource(HttpUrl httpUrl) {
            super();
            this.url = httpUrl;
        }

        private void readChunkSize() throws IOException {
            if (this.bytesRemainingInChunk != -1) {
                Http1Codec.this.source.OooO0Oo();
            }
            try {
                this.bytesRemainingInChunk = Http1Codec.this.source.m19753OooO00o();
                String trim = Http1Codec.this.source.OooO0Oo().trim();
                if (this.bytesRemainingInChunk < 0 || (!trim.isEmpty() && !trim.startsWith(C7522o0Ooo0o.OooO0O0))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + trim + "\"");
                } else if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    HttpHeaders.receiveHeaders(Http1Codec.this.client.cookieJar(), this.url, Http1Codec.this.readHeaders());
                    endOfInput(true, null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8930ooOOO0OO, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.closed) {
                if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    endOfInput(false, null);
                }
                this.closed = true;
            }
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource, com.p118pd.sdk.AbstractC8930ooOOO0OO
        public long read(OOOO000 oooo000, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (!this.hasMoreChunks) {
                return -1;
            } else {
                long j2 = this.bytesRemainingInChunk;
                if (j2 == 0 || j2 == -1) {
                    readChunkSize();
                    if (!this.hasMoreChunks) {
                        return -1;
                    }
                }
                long read = super.read(oooo000, Math.min(j, this.bytesRemainingInChunk));
                if (read != -1) {
                    this.bytesRemainingInChunk -= read;
                    return read;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                endOfInput(false, protocolException);
                throw protocolException;
            }
        }
    }

    public final class FixedLengthSink implements AbstractC8210oOOoO0o0 {
        public long bytesRemaining;
        public boolean closed;
        public final OOOO0o timeout = new OOOO0o(Http1Codec.this.sink.timeout());

        public FixedLengthSink(long j) {
            this.bytesRemaining = j;
        }

        @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8210oOOoO0o0, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.closed) {
                this.closed = true;
                if (this.bytesRemaining <= 0) {
                    Http1Codec.this.detachTimeout(this.timeout);
                    Http1Codec.this.state = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0, java.io.Flushable
        public void flush() throws IOException {
            if (!this.closed) {
                Http1Codec.this.sink.flush();
            }
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
        public C9193oooOoo timeout() {
            return this.timeout;
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
        public void write(OOOO000 oooo000, long j) throws IOException {
            if (!this.closed) {
                Util.checkOffsetAndCount(oooo000.OooO0o0(), 0, j);
                if (j <= this.bytesRemaining) {
                    Http1Codec.this.sink.write(oooo000, j);
                    this.bytesRemaining -= j;
                    return;
                }
                throw new ProtocolException("expected " + this.bytesRemaining + " bytes but received " + j);
            }
            throw new IllegalStateException("closed");
        }
    }

    public class FixedLengthSource extends AbstractSource {
        public long bytesRemaining;

        public FixedLengthSource(long j) throws IOException {
            super();
            this.bytesRemaining = j;
            if (j == 0) {
                endOfInput(true, null);
            }
        }

        @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8930ooOOO0OO, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.closed) {
                if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    endOfInput(false, null);
                }
                this.closed = true;
            }
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource, com.p118pd.sdk.AbstractC8930ooOOO0OO
        public long read(OOOO000 oooo000, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (!this.closed) {
                long j2 = this.bytesRemaining;
                if (j2 == 0) {
                    return -1;
                }
                long read = super.read(oooo000, Math.min(j2, j));
                if (read != -1) {
                    long j3 = this.bytesRemaining - read;
                    this.bytesRemaining = j3;
                    if (j3 == 0) {
                        endOfInput(true, null);
                    }
                    return read;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                endOfInput(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    public class UnknownLengthSource extends AbstractSource {
        public boolean inputExhausted;

        public UnknownLengthSource() {
            super();
        }

        @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8930ooOOO0OO, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.closed) {
                if (!this.inputExhausted) {
                    endOfInput(false, null);
                }
                this.closed = true;
            }
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource, com.p118pd.sdk.AbstractC8930ooOOO0OO
        public long read(OOOO000 oooo000, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (this.inputExhausted) {
                return -1;
            } else {
                long read = super.read(oooo000, j);
                if (read != -1) {
                    return read;
                }
                this.inputExhausted = true;
                endOfInput(true, null);
                return -1;
            }
        }
    }

    public Http1Codec(OkHttpClient okHttpClient, StreamAllocation streamAllocation2, oOOO000O oooo000o, oOOO0000 oooo0000) {
        this.client = okHttpClient;
        this.streamAllocation = streamAllocation2;
        this.source = oooo000o;
        this.sink = oooo0000;
    }

    private String readHeaderLine() throws IOException {
        String OooO00o = this.source.OooO00o(this.headerLimit);
        this.headerLimit -= (long) OooO00o.length();
        return OooO00o;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void cancel() {
        RealConnection connection = this.streamAllocation.connection();
        if (connection != null) {
            connection.cancel();
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public AbstractC8210oOOoO0o0 createRequestBody(Request request, long j) {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            return newChunkedSink();
        }
        if (j != -1) {
            return newFixedLengthSink(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public void detachTimeout(OOOO0o oOOO0o) {
        C9193oooOoo OooO00o = oOOO0o.OooO00o();
        oOOO0o.OooO00o(C9193oooOoo.NONE);
        OooO00o.clearDeadline();
        OooO00o.clearTimeout();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void finishRequest() throws IOException {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void flushRequest() throws IOException {
        this.sink.flush();
    }

    public boolean isClosed() {
        return this.state == 6;
    }

    public AbstractC8210oOOoO0o0 newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public AbstractC8930ooOOO0OO newChunkedSource(HttpUrl httpUrl) throws IOException {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(httpUrl);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public AbstractC8210oOOoO0o0 newFixedLengthSink(long j) {
        if (this.state == 1) {
            this.state = 2;
            return new FixedLengthSink(j);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public AbstractC8930ooOOO0OO newFixedLengthSource(long j) throws IOException {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public AbstractC8930ooOOO0OO newUnknownLengthSource() throws IOException {
        if (this.state == 4) {
            StreamAllocation streamAllocation2 = this.streamAllocation;
            if (streamAllocation2 != null) {
                this.state = 5;
                streamAllocation2.noNewStreams();
                return new UnknownLengthSource();
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.state);
    }

    @Override // okhttp3.internal.http.HttpCodec
    public ResponseBody openResponseBody(Response response) throws IOException {
        StreamAllocation streamAllocation2 = this.streamAllocation;
        streamAllocation2.eventListener.responseBodyStart(streamAllocation2.call);
        String header = response.header("Content-Type");
        if (!HttpHeaders.hasBody(response)) {
            return new RealResponseBody(header, 0, C9143oooO0oOo.OooO00o(newFixedLengthSource(0)));
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return new RealResponseBody(header, -1, C9143oooO0oOo.OooO00o(newChunkedSource(response.request().url())));
        }
        long contentLength = HttpHeaders.contentLength(response);
        if (contentLength != -1) {
            return new RealResponseBody(header, contentLength, C9143oooO0oOo.OooO00o(newFixedLengthSource(contentLength)));
        }
        return new RealResponseBody(header, -1, C9143oooO0oOo.OooO00o(newUnknownLengthSource()));
    }

    public Headers readHeaders() throws IOException {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readHeaderLine = readHeaderLine();
            if (readHeaderLine.length() == 0) {
                return builder.build();
            }
            Internal.instance.addLenient(builder, readHeaderLine);
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public Response.Builder readResponseHeaders(boolean z) throws IOException {
        int i = this.state;
        if (i == 1 || i == 3) {
            try {
                StatusLine parse = StatusLine.parse(readHeaderLine());
                Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(readHeaders());
                if (z && parse.code == 100) {
                    return null;
                }
                if (parse.code == 100) {
                    this.state = 3;
                    return headers;
                }
                this.state = 4;
                return headers;
            } catch (EOFException e) {
                IOException iOException = new IOException("unexpected end of stream on " + this.streamAllocation);
                iOException.initCause(e);
                throw iOException;
            }
        } else {
            throw new IllegalStateException("state: " + this.state);
        }
    }

    public void writeRequest(Headers headers, String str) throws IOException {
        if (this.state == 0) {
            this.sink.OooO00o(str).OooO00o("\r\n");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                this.sink.OooO00o(headers.name(i)).OooO00o(": ").OooO00o(headers.value(i)).OooO00o("\r\n");
            }
            this.sink.OooO00o("\r\n");
            this.state = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.state);
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void writeRequestHeaders(Request request) throws IOException {
        writeRequest(request.headers(), RequestLine.get(request, this.streamAllocation.connection().route().proxy().type()));
    }
}
