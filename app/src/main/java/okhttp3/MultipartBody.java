package okhttp3;

import com.p118pd.sdk.C8318oOo0oooo;
import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.oOOO0000;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okio.ByteString;

public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE = MediaType.get("multipart/alternative");
    public static final byte[] COLONSPACE = {58, 32};
    public static final byte[] CRLF = {13, 10};
    public static final byte[] DASHDASH = {45, 45};
    public static final MediaType DIGEST = MediaType.get("multipart/digest");
    public static final MediaType FORM = MediaType.get("multipart/form-data");
    public static final MediaType MIXED = MediaType.get("multipart/mixed");
    public static final MediaType PARALLEL = MediaType.get("multipart/parallel");
    public final ByteString boundary;
    public long contentLength = -1;
    public final MediaType contentType;
    public final MediaType originalType;
    public final List<Part> parts;

    public static final class Builder {
        public final ByteString boundary;
        public final List<Part> parts;
        public MediaType type;

        public Builder() {
            this(UUID.randomUUID().toString());
        }

        public Builder addFormDataPart(String str, String str2) {
            return addPart(Part.createFormData(str, str2));
        }

        public Builder addPart(RequestBody requestBody) {
            return addPart(Part.create(requestBody));
        }

        public MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, this.parts);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        public Builder setType(MediaType mediaType) {
            if (mediaType == null) {
                throw new NullPointerException("type == null");
            } else if (mediaType.type().equals("multipart")) {
                this.type = mediaType;
                return this;
            } else {
                throw new IllegalArgumentException("multipart != " + mediaType);
            }
        }

        public Builder(String str) {
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
            this.boundary = ByteString.encodeUtf8(str);
        }

        public Builder addFormDataPart(String str, @Nullable String str2, RequestBody requestBody) {
            return addPart(Part.createFormData(str, str2, requestBody));
        }

        public Builder addPart(@Nullable Headers headers, RequestBody requestBody) {
            return addPart(Part.create(headers, requestBody));
        }

        public Builder addPart(Part part) {
            if (part != null) {
                this.parts.add(part);
                return this;
            }
            throw new NullPointerException("part == null");
        }
    }

    public static final class Part {
        public final RequestBody body;
        @Nullable
        public final Headers headers;

        public Part(@Nullable Headers headers2, RequestBody requestBody) {
            this.headers = headers2;
            this.body = requestBody;
        }

        public static Part create(RequestBody requestBody) {
            return create(null, requestBody);
        }

        public static Part createFormData(String str, String str2) {
            return createFormData(str, null, RequestBody.create((MediaType) null, str2));
        }

        public RequestBody body() {
            return this.body;
        }

        @Nullable
        public Headers headers() {
            return this.headers;
        }

        public static Part create(@Nullable Headers headers2, RequestBody requestBody) {
            if (requestBody == null) {
                throw new NullPointerException("body == null");
            } else if (headers2 != null && headers2.get("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (headers2 == null || headers2.get("Content-Length") == null) {
                return new Part(headers2, requestBody);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }

        public static Part createFormData(String str, @Nullable String str2, RequestBody requestBody) {
            if (str != null) {
                StringBuilder sb = new StringBuilder("form-data; name=");
                MultipartBody.appendQuotedString(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    MultipartBody.appendQuotedString(sb, str2);
                }
                return create(Headers.m14261of("Content-Disposition", sb.toString()), requestBody);
            }
            throw new NullPointerException("name == null");
        }
    }

    public MultipartBody(ByteString byteString, MediaType mediaType, List<Part> list) {
        this.boundary = byteString;
        this.originalType = mediaType;
        this.contentType = MediaType.get(mediaType + "; boundary=" + byteString.utf8());
        this.parts = Util.immutableList(list);
    }

    public static StringBuilder appendQuotedString(StringBuilder sb, String str) {
        sb.append(C8318oOo0oooo.OooO00o);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append(C8318oOo0oooo.OooO00o);
        return sb;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.pd.sdk.OOOO000 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.pd.sdk.OOOO000 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.pd.sdk.OOOO000 */
    /* JADX WARN: Multi-variable type inference failed */
    private long writeOrCountBytes(@Nullable oOOO0000 oooo0000, boolean z) throws IOException {
        OOOO000 oooo000;
        if (z) {
            oooo0000 = new OOOO000();
            oooo000 = oooo0000;
        } else {
            oooo000 = 0;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.parts.get(i);
            Headers headers = part.headers;
            RequestBody requestBody = part.body;
            oooo0000.OooO00o(DASHDASH);
            oooo0000.OooO00o(this.boundary);
            oooo0000.OooO00o(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    oooo0000.OooO00o(headers.name(i2)).OooO00o(COLONSPACE).OooO00o(headers.value(i2)).OooO00o(CRLF);
                }
            }
            MediaType contentType2 = requestBody.contentType();
            if (contentType2 != null) {
                oooo0000.OooO00o("Content-Type: ").OooO00o(contentType2.toString()).OooO00o(CRLF);
            }
            long contentLength2 = requestBody.contentLength();
            if (contentLength2 != -1) {
                oooo0000.OooO00o("Content-Length: ").OooO0O0(contentLength2).OooO00o(CRLF);
            } else if (z) {
                oooo000.m16610OooO0O0();
                return -1;
            }
            oooo0000.OooO00o(CRLF);
            if (z) {
                j += contentLength2;
            } else {
                requestBody.writeTo(oooo0000);
            }
            oooo0000.OooO00o(CRLF);
        }
        oooo0000.OooO00o(DASHDASH);
        oooo0000.OooO00o(this.boundary);
        oooo0000.OooO00o(DASHDASH);
        oooo0000.OooO00o(CRLF);
        if (!z) {
            return j;
        }
        long OooO0o0 = j + oooo000.OooO0o0();
        oooo000.m16610OooO0O0();
        return OooO0o0;
    }

    public String boundary() {
        return this.boundary.utf8();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long writeOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = writeOrCountBytes;
        return writeOrCountBytes;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.contentType;
    }

    public Part part(int i) {
        return this.parts.get(i);
    }

    public List<Part> parts() {
        return this.parts;
    }

    public int size() {
        return this.parts.size();
    }

    public MediaType type() {
        return this.originalType;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(oOOO0000 oooo0000) throws IOException {
        writeOrCountBytes(oooo0000, false);
    }
}
