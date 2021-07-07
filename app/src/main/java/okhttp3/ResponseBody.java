package okhttp3;

import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.oOOO000O;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okio.ByteString;

public abstract class ResponseBody implements Closeable {
    @Nullable
    public Reader reader;

    public static final class BomAwareReader extends Reader {
        public final Charset charset;
        public boolean closed;
        @Nullable
        public Reader delegate;
        public final oOOO000O source;

        public BomAwareReader(oOOO000O oooo000o, Charset charset2) {
            this.source = oooo000o;
            this.charset = charset2;
        }

        @Override // java.io.Closeable, java.io.Reader, java.lang.AutoCloseable
        public void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.source.m19755OooO00o(), Util.bomAwareCharset(this.source, this.charset));
                    this.delegate = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    private Charset charset() {
        MediaType contentType = contentType();
        return contentType != null ? contentType.charset(Util.UTF_8) : Util.UTF_8;
    }

    public static ResponseBody create(@Nullable MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        OOOO000 OooO00o = new OOOO000().OooO00o(str, charset);
        return create(mediaType, OooO00o.OooO0o0(), OooO00o);
    }

    public final InputStream byteStream() {
        return source().m19755OooO00o();
    }

    /* JADX INFO: finally extract failed */
    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            oOOO000O source = source();
            try {
                byte[] OooO00o = source.m19761OooO00o();
                Util.closeQuietly(source);
                if (contentLength == -1 || contentLength == ((long) OooO00o.length)) {
                    return OooO00o;
                }
                throw new IOException("Content-Length (" + contentLength + ") and stream length (" + OooO00o.length + ") disagree");
            } catch (Throwable th) {
                Util.closeQuietly(source);
                throw th;
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
    }

    public final Reader charStream() {
        Reader reader2 = this.reader;
        if (reader2 != null) {
            return reader2;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    @Nullable
    public abstract MediaType contentType();

    public abstract oOOO000O source();

    public final String string() throws IOException {
        oOOO000O source = source();
        try {
            return source.OooO00o(Util.bomAwareCharset(source, charset()));
        } finally {
            Util.closeQuietly(source);
        }
    }

    public static ResponseBody create(@Nullable MediaType mediaType, byte[] bArr) {
        return create(mediaType, (long) bArr.length, new OOOO000().OooO00o(bArr));
    }

    public static ResponseBody create(@Nullable MediaType mediaType, ByteString byteString) {
        return create(mediaType, (long) byteString.size(), new OOOO000().OooO00o(byteString));
    }

    public static ResponseBody create(@Nullable final MediaType mediaType, final long j, final oOOO000O oooo000o) {
        if (oooo000o != null) {
            return new ResponseBody() {
                /* class okhttp3.ResponseBody.C47621 */

                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                @Nullable
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                public oOOO000O source() {
                    return oooo000o;
                }
            };
        }
        throw new NullPointerException("source == null");
    }
}
