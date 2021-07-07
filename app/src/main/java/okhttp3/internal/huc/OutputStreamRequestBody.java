package okhttp3.internal.huc;

import com.p118pd.sdk.C9193oooOoo;
import com.p118pd.sdk.oOOO0000;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

public abstract class OutputStreamRequestBody extends RequestBody {
    public boolean closed;
    public long expectedContentLength;
    public OutputStream outputStream;
    public C9193oooOoo timeout;

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        return this.expectedContentLength;
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return null;
    }

    public void initOutputStream(final oOOO0000 oooo0000, final long j) {
        this.timeout = oooo0000.timeout();
        this.expectedContentLength = j;
        this.outputStream = new OutputStream() {
            /* class okhttp3.internal.huc.OutputStreamRequestBody.C47861 */
            public long bytesReceived;

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                OutputStreamRequestBody.this.closed = true;
                long j = j;
                if (j == -1 || this.bytesReceived >= j) {
                    oooo0000.close();
                    return;
                }
                throw new ProtocolException("expected " + j + " bytes but received " + this.bytesReceived);
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                if (!OutputStreamRequestBody.this.closed) {
                    oooo0000.flush();
                }
            }

            @Override // java.io.OutputStream
            public void write(int i) throws IOException {
                write(new byte[]{(byte) i}, 0, 1);
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
                if (!OutputStreamRequestBody.this.closed) {
                    long j = j;
                    if (j == -1 || this.bytesReceived + ((long) i2) <= j) {
                        this.bytesReceived += (long) i2;
                        try {
                            oooo0000.OooO00o(bArr, i, i2);
                        } catch (InterruptedIOException e) {
                            throw new SocketTimeoutException(e.getMessage());
                        }
                    } else {
                        throw new ProtocolException("expected " + j + " bytes but received " + this.bytesReceived + i2);
                    }
                } else {
                    throw new IOException("closed");
                }
            }
        };
    }

    public final boolean isClosed() {
        return this.closed;
    }

    public final OutputStream outputStream() {
        return this.outputStream;
    }

    public Request prepareToSendRequest(Request request) throws IOException {
        return request;
    }

    public final C9193oooOoo timeout() {
        return this.timeout;
    }
}
