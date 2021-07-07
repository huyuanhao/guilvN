package retrofit2;

import com.p118pd.sdk.C7522o0Ooo0o;
import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.oOOO0000;
import java.io.IOException;
import javax.annotation.Nullable;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

public final class RequestBuilder {
    public static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    public final HttpUrl baseUrl;
    @Nullable
    public RequestBody body;
    @Nullable
    public MediaType contentType;
    @Nullable
    public FormBody.Builder formBuilder;
    public final boolean hasBody;
    public final String method;
    @Nullable
    public MultipartBody.Builder multipartBuilder;
    @Nullable
    public String relativeUrl;
    public final Request.Builder requestBuilder;
    @Nullable
    public HttpUrl.Builder urlBuilder;

    public static class ContentTypeOverridingRequestBody extends RequestBody {
        public final MediaType contentType;
        public final RequestBody delegate;

        public ContentTypeOverridingRequestBody(RequestBody requestBody, MediaType mediaType) {
            this.delegate = requestBody;
            this.contentType = mediaType;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() throws IOException {
            return this.delegate.contentLength();
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.contentType;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(oOOO0000 oooo0000) throws IOException {
            this.delegate.writeTo(oooo0000);
        }
    }

    public RequestBuilder(String str, HttpUrl httpUrl, @Nullable String str2, @Nullable Headers headers, @Nullable MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.method = str;
        this.baseUrl = httpUrl;
        this.relativeUrl = str2;
        Request.Builder builder = new Request.Builder();
        this.requestBuilder = builder;
        this.contentType = mediaType;
        this.hasBody = z;
        if (headers != null) {
            builder.headers(headers);
        }
        if (z2) {
            this.formBuilder = new FormBody.Builder();
        } else if (z3) {
            MultipartBody.Builder builder2 = new MultipartBody.Builder();
            this.multipartBuilder = builder2;
            builder2.setType(MultipartBody.FORM);
        }
    }

    public static String canonicalizeForPath(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                OOOO000 oooo000 = new OOOO000();
                oooo000.OooO00o(str, 0, i);
                canonicalizeForPath(oooo000, str, i, length, z);
                return oooo000.m16606OooO0O0();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    public void addFormField(String str, String str2, boolean z) {
        if (z) {
            this.formBuilder.addEncoded(str, str2);
        } else {
            this.formBuilder.add(str, str2);
        }
    }

    public void addHeader(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            MediaType parse = MediaType.parse(str2);
            if (parse != null) {
                this.contentType = parse;
                return;
            }
            throw new IllegalArgumentException("Malformed content type: " + str2);
        }
        this.requestBuilder.addHeader(str, str2);
    }

    public void addPart(Headers headers, RequestBody requestBody) {
        this.multipartBuilder.addPart(headers, requestBody);
    }

    public void addPathParam(String str, String str2, boolean z) {
        String str3 = this.relativeUrl;
        if (str3 != null) {
            this.relativeUrl = str3.replace("{" + str + C7522o0Ooo0o.OooO0Oo, canonicalizeForPath(str2, z));
            return;
        }
        throw new AssertionError();
    }

    public void addQueryParam(String str, @Nullable String str2, boolean z) {
        String str3 = this.relativeUrl;
        if (str3 != null) {
            HttpUrl.Builder newBuilder = this.baseUrl.newBuilder(str3);
            this.urlBuilder = newBuilder;
            if (newBuilder != null) {
                this.relativeUrl = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
        }
        if (z) {
            this.urlBuilder.addEncodedQueryParameter(str, str2);
        } else {
            this.urlBuilder.addQueryParameter(str, str2);
        }
    }

    public Request build() {
        HttpUrl httpUrl;
        HttpUrl.Builder builder = this.urlBuilder;
        if (builder != null) {
            httpUrl = builder.build();
        } else {
            httpUrl = this.baseUrl.resolve(this.relativeUrl);
            if (httpUrl == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
        }
        ContentTypeOverridingRequestBody contentTypeOverridingRequestBody = this.body;
        if (contentTypeOverridingRequestBody == null) {
            FormBody.Builder builder2 = this.formBuilder;
            if (builder2 != null) {
                contentTypeOverridingRequestBody = builder2.build();
            } else {
                MultipartBody.Builder builder3 = this.multipartBuilder;
                if (builder3 != null) {
                    contentTypeOverridingRequestBody = builder3.build();
                } else if (this.hasBody) {
                    contentTypeOverridingRequestBody = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.contentType;
        if (mediaType != null) {
            if (contentTypeOverridingRequestBody != null) {
                contentTypeOverridingRequestBody = new ContentTypeOverridingRequestBody(contentTypeOverridingRequestBody, mediaType);
            } else {
                this.requestBuilder.addHeader("Content-Type", mediaType.toString());
            }
        }
        return this.requestBuilder.url(httpUrl).method(this.method, contentTypeOverridingRequestBody).build();
    }

    public void setBody(RequestBody requestBody) {
        this.body = requestBody;
    }

    public void setRelativeUrl(Object obj) {
        this.relativeUrl = obj.toString();
    }

    public void addPart(MultipartBody.Part part) {
        this.multipartBuilder.addPart(part);
    }

    public static void canonicalizeForPath(OOOO000 oooo000, String str, int i, int i2, boolean z) {
        OOOO000 oooo0002 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (oooo0002 == null) {
                        oooo0002 = new OOOO000();
                    }
                    oooo0002.OooO0O0(codePointAt);
                    while (!oooo0002.m16616OooO0OO()) {
                        int readByte = oooo0002.readByte() & 255;
                        oooo000.OooO0o0(37);
                        oooo000.OooO0o0((int) HEX_DIGITS[(readByte >> 4) & 15]);
                        oooo000.OooO0o0((int) HEX_DIGITS[readByte & 15]);
                    }
                } else {
                    oooo000.OooO0O0(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }
}
