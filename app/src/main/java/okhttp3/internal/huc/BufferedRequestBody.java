package okhttp3.internal.huc;

import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.oOOO0000;
import java.io.IOException;
import okhttp3.Request;

public final class BufferedRequestBody extends OutputStreamRequestBody {
    public final OOOO000 buffer;
    public long contentLength = -1;

    public BufferedRequestBody(long j) {
        OOOO000 oooo000 = new OOOO000();
        this.buffer = oooo000;
        initOutputStream(oooo000, j);
    }

    @Override // okhttp3.internal.huc.OutputStreamRequestBody, okhttp3.RequestBody
    public long contentLength() throws IOException {
        return this.contentLength;
    }

    @Override // okhttp3.internal.huc.OutputStreamRequestBody
    public Request prepareToSendRequest(Request request) throws IOException {
        if (request.header("Content-Length") != null) {
            return request;
        }
        outputStream().close();
        this.contentLength = this.buffer.OooO0o0();
        return request.newBuilder().removeHeader("Transfer-Encoding").header("Content-Length", Long.toString(this.buffer.OooO0o0())).build();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(oOOO0000 oooo0000) throws IOException {
        this.buffer.OooO00o(oooo0000.OooO00o(), 0, this.buffer.OooO0o0());
    }
}
