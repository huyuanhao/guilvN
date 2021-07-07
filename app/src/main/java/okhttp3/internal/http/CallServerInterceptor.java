package okhttp3.internal.http;

import com.p118pd.sdk.AbstractC8210oOOoO0o0;
import com.p118pd.sdk.C9143oooO0oOo;
import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.oOOO0000;
import com.p118pd.sdk.oOOO00O0;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;

public final class CallServerInterceptor implements Interceptor {
    public final boolean forWebSocket;

    public static final class CountingSink extends oOOO00O0 {
        public long successfulCount;

        public CountingSink(AbstractC8210oOOoO0o0 ooooo0o0) {
            super(ooooo0o0);
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0, com.p118pd.sdk.oOOO00O0
        public void write(OOOO000 oooo000, long j) throws IOException {
            super.write(oooo000, j);
            this.successfulCount += j;
        }
    }

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response response;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        HttpCodec httpStream = realInterceptorChain.httpStream();
        StreamAllocation streamAllocation = realInterceptorChain.streamAllocation();
        RealConnection realConnection = (RealConnection) realInterceptorChain.connection();
        Request request = realInterceptorChain.request();
        long currentTimeMillis = System.currentTimeMillis();
        realInterceptorChain.eventListener().requestHeadersStart(realInterceptorChain.call());
        httpStream.writeRequestHeaders(request);
        realInterceptorChain.eventListener().requestHeadersEnd(realInterceptorChain.call(), request);
        Response.Builder builder = null;
        if (HttpMethod.permitsRequestBody(request.method()) && request.body() != null) {
            if ("100-continue".equalsIgnoreCase(request.header("Expect"))) {
                httpStream.flushRequest();
                realInterceptorChain.eventListener().responseHeadersStart(realInterceptorChain.call());
                builder = httpStream.readResponseHeaders(true);
            }
            if (builder == null) {
                realInterceptorChain.eventListener().requestBodyStart(realInterceptorChain.call());
                CountingSink countingSink = new CountingSink(httpStream.createRequestBody(request, request.body().contentLength()));
                oOOO0000 OooO00o = C9143oooO0oOo.OooO00o(countingSink);
                request.body().writeTo(OooO00o);
                OooO00o.close();
                realInterceptorChain.eventListener().requestBodyEnd(realInterceptorChain.call(), countingSink.successfulCount);
            } else if (!realConnection.isMultiplexed()) {
                streamAllocation.noNewStreams();
            }
        }
        httpStream.finishRequest();
        if (builder == null) {
            realInterceptorChain.eventListener().responseHeadersStart(realInterceptorChain.call());
            builder = httpStream.readResponseHeaders(false);
        }
        Response build = builder.request(request).handshake(streamAllocation.connection().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int code = build.code();
        if (code == 100) {
            build = httpStream.readResponseHeaders(false).request(request).handshake(streamAllocation.connection().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            code = build.code();
        }
        realInterceptorChain.eventListener().responseHeadersEnd(realInterceptorChain.call(), build);
        if (!this.forWebSocket || code != 101) {
            response = build.newBuilder().body(httpStream.openResponseBody(build)).build();
        } else {
            response = build.newBuilder().body(Util.EMPTY_RESPONSE).build();
        }
        if ("close".equalsIgnoreCase(response.request().header("Connection")) || "close".equalsIgnoreCase(response.header("Connection"))) {
            streamAllocation.noNewStreams();
        }
        if ((code != 204 && code != 205) || response.body().contentLength() <= 0) {
            return response;
        }
        throw new ProtocolException("HTTP " + code + " had non-zero Content-Length: " + response.body().contentLength());
    }
}
