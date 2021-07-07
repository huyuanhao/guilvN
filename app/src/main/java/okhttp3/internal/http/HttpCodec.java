package okhttp3.internal.http;

import com.p118pd.sdk.AbstractC8210oOOoO0o0;
import java.io.IOException;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public interface HttpCodec {
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    void cancel();

    AbstractC8210oOOoO0o0 createRequestBody(Request request, long j);

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    ResponseBody openResponseBody(Response response) throws IOException;

    Response.Builder readResponseHeaders(boolean z) throws IOException;

    void writeRequestHeaders(Request request) throws IOException;
}
