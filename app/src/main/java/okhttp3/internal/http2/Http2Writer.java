package okhttp3.internal.http2;

import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.oOOO0000;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;

public final class Http2Writer implements Closeable {
    public static final Logger logger = Logger.getLogger(Http2.class.getName());
    public final boolean client;
    public boolean closed;
    public final OOOO000 hpackBuffer;
    public final Hpack.Writer hpackWriter;
    public int maxFrameSize = 16384;
    public final oOOO0000 sink;

    public Http2Writer(oOOO0000 oooo0000, boolean z) {
        this.sink = oooo0000;
        this.client = z;
        OOOO000 oooo000 = new OOOO000();
        this.hpackBuffer = oooo000;
        this.hpackWriter = new Hpack.Writer(oooo000);
    }

    private void writeContinuationFrames(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min((long) this.maxFrameSize, j);
            long j2 = (long) min;
            j -= j2;
            frameHeader(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
            this.sink.write(this.hpackBuffer, j2);
        }
    }

    public static void writeMedium(oOOO0000 oooo0000, int i) throws IOException {
        oooo0000.OooO0o0((i >>> 16) & 255);
        oooo0000.OooO0o0((i >>> 8) & 255);
        oooo0000.OooO0o0(i & 255);
    }

    public synchronized void applyAndAckSettings(Settings settings) throws IOException {
        if (!this.closed) {
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            if (settings.getHeaderTableSize() != -1) {
                this.hpackWriter.setHeaderTableSizeSetting(settings.getHeaderTableSize());
            }
            frameHeader(0, 0, (byte) 4, (byte) 1);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public synchronized void connectionPreface() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        } else if (this.client) {
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Util.format(">> CONNECTION %s", Http2.CONNECTION_PREFACE.hex()));
            }
            this.sink.OooO00o(Http2.CONNECTION_PREFACE.toByteArray());
            this.sink.flush();
        }
    }

    public synchronized void data(boolean z, int i, OOOO000 oooo000, int i2) throws IOException {
        if (!this.closed) {
            byte b = 0;
            if (z) {
                b = (byte) 1;
            }
            dataFrame(i, b, oooo000, i2);
        } else {
            throw new IOException("closed");
        }
    }

    public void dataFrame(int i, byte b, OOOO000 oooo000, int i2) throws IOException {
        frameHeader(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.sink.write(oooo000, (long) i2);
        }
    }

    public synchronized void flush() throws IOException {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public void frameHeader(int i, int i2, byte b, byte b2) throws IOException {
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Http2.frameLog(false, i, i2, b, b2));
        }
        int i3 = this.maxFrameSize;
        if (i2 > i3) {
            throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            writeMedium(this.sink, i2);
            this.sink.OooO0o0(b & 255);
            this.sink.OooO0o0(b2 & 255);
            this.sink.OooO0o(i & Integer.MAX_VALUE);
        } else {
            throw Http2.illegalArgument("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    public synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            frameHeader(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.sink.OooO0o(i);
            this.sink.OooO0o(errorCode.httpCode);
            if (bArr.length > 0) {
                this.sink.OooO00o(bArr);
            }
            this.sink.flush();
        } else {
            throw Http2.illegalArgument("errorCode.httpCode == -1", new Object[0]);
        }
    }

    public synchronized void headers(int i, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(false, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    public int maxDataLength() {
        return this.maxFrameSize;
    }

    public synchronized void ping(boolean z, int i, int i2) throws IOException {
        if (!this.closed) {
            frameHeader(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.sink.OooO0o(i);
            this.sink.OooO0o(i2);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void pushPromise(int i, int i2, List<Header> list) throws IOException {
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long OooO0o0 = this.hpackBuffer.OooO0o0();
            int min = (int) Math.min((long) (this.maxFrameSize - 4), OooO0o0);
            long j = (long) min;
            frameHeader(i, min + 4, (byte) 5, OooO0o0 == j ? (byte) 4 : 0);
            this.sink.OooO0o(i2 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j);
            if (OooO0o0 > j) {
                writeContinuationFrames(i, OooO0o0 - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void rstStream(int i, ErrorCode errorCode) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            frameHeader(i, 4, (byte) 3, (byte) 0);
            this.sink.OooO0o(errorCode.httpCode);
            this.sink.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void settings(Settings settings) throws IOException {
        if (!this.closed) {
            int i = 0;
            frameHeader(0, settings.size() * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (settings.isSet(i)) {
                    this.sink.OooO0Oo(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.sink.OooO0o(settings.get(i));
                }
                i++;
            }
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void synReply(boolean z, int i, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(z, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void synStream(boolean z, int i, int i2, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(z, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void windowUpdate(int i, long j) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            frameHeader(i, 4, (byte) 8, (byte) 0);
            this.sink.OooO0o((int) j);
            this.sink.flush();
        }
    }

    public void headers(boolean z, int i, List<Header> list) throws IOException {
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long OooO0o0 = this.hpackBuffer.OooO0o0();
            int min = (int) Math.min((long) this.maxFrameSize, OooO0o0);
            long j = (long) min;
            byte b = OooO0o0 == j ? (byte) 4 : 0;
            if (z) {
                b = (byte) (b | 1);
            }
            frameHeader(i, min, (byte) 1, b);
            this.sink.write(this.hpackBuffer, j);
            if (OooO0o0 > j) {
                writeContinuationFrames(i, OooO0o0 - j);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }
}
