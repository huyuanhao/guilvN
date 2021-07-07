package okhttp3.logging;

import com.facebook.react.animated.InterpolationAnimatedNode;
import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.oOOO000O;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;

public final class HttpLoggingInterceptor implements Interceptor {
    public static final Charset UTF8 = Charset.forName("UTF-8");
    public volatile Level level;
    public final Logger logger;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface Logger {
        public static final Logger DEFAULT = new Logger() {
            /* class okhttp3.logging.HttpLoggingInterceptor.Logger.C47901 */

            @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
            public void log(String str) {
                Platform.get().log(4, str, null);
            }
        };

        void log(String str);
    }

    public HttpLoggingInterceptor() {
        this(Logger.DEFAULT);
    }

    private boolean bodyEncoded(Headers headers) {
        String str = headers.get("Content-Encoding");
        return str != null && !str.equalsIgnoreCase(InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
    }

    public static boolean isPlaintext(OOOO000 oooo000) {
        try {
            OOOO000 oooo0002 = new OOOO000();
            oooo000.OooO00o(oooo0002, 0, oooo000.OooO0o0() < 64 ? oooo000.OooO0o0() : 64);
            for (int i = 0; i < 16; i++) {
                if (oooo0002.m16616OooO0OO()) {
                    return true;
                }
                int OooO0OO = oooo0002.OooO0OO();
                if (Character.isISOControl(OooO0OO) && !Character.isWhitespace(OooO0OO)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public Level getLevel() {
        return this.level;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        boolean z;
        boolean z2;
        Level level2 = this.level;
        Request request = chain.request();
        if (level2 == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z3 = true;
        boolean z4 = level2 == Level.BODY;
        boolean z5 = z4 || level2 == Level.HEADERS;
        RequestBody body = request.body();
        if (body == null) {
            z3 = false;
        }
        Connection connection = chain.connection();
        String str = "--> " + request.method() + ' ' + request.url() + ' ' + (connection != null ? connection.protocol() : Protocol.HTTP_1_1);
        if (!z5 && z3) {
            str = str + " (" + body.contentLength() + "-byte body)";
        }
        this.logger.log(str);
        if (z5) {
            if (z3) {
                if (body.contentType() != null) {
                    this.logger.log("Content-Type: " + body.contentType());
                }
                if (body.contentLength() != -1) {
                    this.logger.log("Content-Length: " + body.contentLength());
                }
            }
            Headers headers = request.headers();
            int size = headers.size();
            int i = 0;
            while (i < size) {
                String name = headers.name(i);
                if ("Content-Type".equalsIgnoreCase(name) || "Content-Length".equalsIgnoreCase(name)) {
                    z2 = z5;
                } else {
                    z2 = z5;
                    this.logger.log(name + ": " + headers.value(i));
                }
                i++;
                size = size;
                z5 = z2;
            }
            z = z5;
            if (!z4 || !z3) {
                this.logger.log("--> END " + request.method());
            } else if (bodyEncoded(request.headers())) {
                this.logger.log("--> END " + request.method() + " (encoded body omitted)");
            } else {
                OOOO000 oooo000 = new OOOO000();
                body.writeTo(oooo000);
                Charset charset = UTF8;
                MediaType contentType = body.contentType();
                if (contentType != null) {
                    charset = contentType.charset(UTF8);
                }
                this.logger.log("");
                if (isPlaintext(oooo000)) {
                    this.logger.log(oooo000.OooO00o(charset));
                    this.logger.log("--> END " + request.method() + " (" + body.contentLength() + "-byte body)");
                } else {
                    this.logger.log("--> END " + request.method() + " (binary " + body.contentLength() + "-byte body omitted)");
                }
            }
        } else {
            z = z5;
        }
        long nanoTime = System.nanoTime();
        try {
            Response proceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody body2 = proceed.body();
            long contentLength = body2.contentLength();
            String str2 = contentLength != -1 ? contentLength + "-byte" : "unknown-length";
            Logger logger2 = this.logger;
            StringBuilder sb = new StringBuilder();
            sb.append("<-- ");
            sb.append(proceed.code());
            sb.append(' ');
            sb.append(proceed.message());
            sb.append(' ');
            sb.append(proceed.request().url());
            sb.append(" (");
            sb.append(millis);
            sb.append("ms");
            sb.append(!z ? ", " + str2 + " body" : "");
            sb.append(')');
            logger2.log(sb.toString());
            if (z) {
                Headers headers2 = proceed.headers();
                int size2 = headers2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    this.logger.log(headers2.name(i2) + ": " + headers2.value(i2));
                }
                if (!z4 || !HttpHeaders.hasBody(proceed)) {
                    this.logger.log("<-- END HTTP");
                } else if (bodyEncoded(proceed.headers())) {
                    this.logger.log("<-- END HTTP (encoded body omitted)");
                } else {
                    oOOO000O source = body2.source();
                    source.m19760OooO00o(Long.MAX_VALUE);
                    OOOO000 OooO00o = source.m19754OooO00o();
                    Charset charset2 = UTF8;
                    MediaType contentType2 = body2.contentType();
                    if (contentType2 != null) {
                        charset2 = contentType2.charset(UTF8);
                    }
                    if (!isPlaintext(OooO00o)) {
                        this.logger.log("");
                        this.logger.log("<-- END HTTP (binary " + OooO00o.OooO0o0() + "-byte body omitted)");
                        return proceed;
                    }
                    if (contentLength != 0) {
                        this.logger.log("");
                        this.logger.log(OooO00o.clone().OooO00o(charset2));
                    }
                    this.logger.log("<-- END HTTP (" + OooO00o.OooO0o0() + "-byte body)");
                }
            }
            return proceed;
        } catch (Exception e) {
            this.logger.log("<-- HTTP FAILED: " + e);
            throw e;
        }
    }

    public HttpLoggingInterceptor setLevel(Level level2) {
        if (level2 != null) {
            this.level = level2;
            return this;
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }

    public HttpLoggingInterceptor(Logger logger2) {
        this.level = Level.NONE;
        this.logger = logger2;
    }
}
