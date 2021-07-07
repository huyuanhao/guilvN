package okhttp3;

import com.p118pd.sdk.AbstractC8930ooOOO0OO;
import com.p118pd.sdk.C9143oooO0oOo;
import com.p118pd.sdk.oOOO0000;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okio.ByteString;

public abstract class RequestBody {
    public static RequestBody create(@Nullable MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        return create(mediaType, str.getBytes(charset));
    }

    public long contentLength() throws IOException {
        return -1;
    }

    @Nullable
    public abstract MediaType contentType();

    public abstract void writeTo(oOOO0000 oooo0000) throws IOException;

    public static RequestBody create(@Nullable final MediaType mediaType, final ByteString byteString) {
        return new RequestBody() {
            /* class okhttp3.RequestBody.C47591 */

            @Override // okhttp3.RequestBody
            public long contentLength() throws IOException {
                return (long) byteString.size();
            }

            @Override // okhttp3.RequestBody
            @Nullable
            public MediaType contentType() {
                return MediaType.this;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(oOOO0000 oooo0000) throws IOException {
                oooo0000.OooO00o(byteString);
            }
        };
    }

    public static RequestBody create(@Nullable MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(@Nullable final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
        if (bArr != null) {
            Util.checkOffsetAndCount((long) bArr.length, (long) i, (long) i2);
            return new RequestBody() {
                /* class okhttp3.RequestBody.C47602 */

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return (long) i2;
                }

                @Override // okhttp3.RequestBody
                @Nullable
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(oOOO0000 oooo0000) throws IOException {
                    oooo0000.OooO00o(bArr, i, i2);
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public static RequestBody create(@Nullable final MediaType mediaType, final File file) {
        if (file != null) {
            return new RequestBody() {
                /* class okhttp3.RequestBody.C47613 */

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                @Nullable
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(oOOO0000 oooo0000) throws IOException {
                    AbstractC8930ooOOO0OO ooooo0oo = null;
                    try {
                        ooooo0oo = C9143oooO0oOo.m20888OooO00o(file);
                        oooo0000.OooO00o(ooooo0oo);
                    } finally {
                        Util.closeQuietly(ooooo0oo);
                    }
                }
            };
        }
        throw new NullPointerException("file == null");
    }
}
