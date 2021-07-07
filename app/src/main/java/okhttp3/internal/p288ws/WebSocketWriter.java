package okhttp3.internal.p288ws;

import com.p118pd.sdk.AbstractC8210oOOoO0o0;
import com.p118pd.sdk.C9193oooOoo;
import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.oOOO0000;
import java.io.IOException;
import java.util.Random;
import okio.ByteString;

/* renamed from: okhttp3.internal.ws.WebSocketWriter */
public final class WebSocketWriter {
    public boolean activeWriter;
    public final OOOO000 buffer = new OOOO000();
    public final FrameSink frameSink = new FrameSink();
    public final boolean isClient;
    public final OOOO000.OooO0OO maskCursor;
    public final byte[] maskKey;
    public final Random random;
    public final oOOO0000 sink;
    public final OOOO000 sinkBuffer;
    public boolean writerClosed;

    /* renamed from: okhttp3.internal.ws.WebSocketWriter$FrameSink */
    public final class FrameSink implements AbstractC8210oOOoO0o0 {
        public boolean closed;
        public long contentLength;
        public int formatOpcode;
        public boolean isFirstFrame;

        public FrameSink() {
        }

        @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8210oOOoO0o0, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.OooO0o0(), this.isFirstFrame, true);
                this.closed = true;
                WebSocketWriter.this.activeWriter = false;
                return;
            }
            throw new IOException("closed");
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0, java.io.Flushable
        public void flush() throws IOException {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.OooO0o0(), this.isFirstFrame, false);
                this.isFirstFrame = false;
                return;
            }
            throw new IOException("closed");
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
        public C9193oooOoo timeout() {
            return WebSocketWriter.this.sink.timeout();
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
        public void write(OOOO000 oooo000, long j) throws IOException {
            if (!this.closed) {
                WebSocketWriter.this.buffer.write(oooo000, j);
                boolean z = this.isFirstFrame && this.contentLength != -1 && WebSocketWriter.this.buffer.OooO0o0() > this.contentLength - 8192;
                long OooO0Oo = WebSocketWriter.this.buffer.OooO0Oo();
                if (OooO0Oo > 0 && !z) {
                    WebSocketWriter.this.writeMessageFrame(this.formatOpcode, OooO0Oo, this.isFirstFrame, false);
                    this.isFirstFrame = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }
    }

    public WebSocketWriter(boolean z, oOOO0000 oooo0000, Random random2) {
        if (oooo0000 == null) {
            throw new NullPointerException("sink == null");
        } else if (random2 != null) {
            this.isClient = z;
            this.sink = oooo0000;
            this.sinkBuffer = oooo0000.OooO00o();
            this.random = random2;
            OOOO000.OooO0OO oooO0OO = null;
            this.maskKey = z ? new byte[4] : null;
            this.maskCursor = z ? new OOOO000.OooO0OO() : oooO0OO;
        } else {
            throw new NullPointerException("random == null");
        }
    }

    private void writeControlFrame(int i, ByteString byteString) throws IOException {
        if (!this.writerClosed) {
            int size = byteString.size();
            if (((long) size) <= 125) {
                this.sinkBuffer.OooO0o0(i | 128);
                if (this.isClient) {
                    this.sinkBuffer.OooO0o0(size | 128);
                    this.random.nextBytes(this.maskKey);
                    this.sinkBuffer.OooO00o(this.maskKey);
                    if (size > 0) {
                        long OooO0o0 = this.sinkBuffer.OooO0o0();
                        this.sinkBuffer.OooO00o(byteString);
                        this.sinkBuffer.OooO00o(this.maskCursor);
                        this.maskCursor.OooO00o(OooO0o0);
                        WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.OooO0o0(size);
                    this.sinkBuffer.OooO00o(byteString);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    public AbstractC8210oOOoO0o0 newMessageSink(int i, long j) {
        if (!this.activeWriter) {
            this.activeWriter = true;
            FrameSink frameSink2 = this.frameSink;
            frameSink2.formatOpcode = i;
            frameSink2.contentLength = j;
            frameSink2.isFirstFrame = true;
            frameSink2.closed = false;
            return frameSink2;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }

    public void writeClose(int i, ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.EMPTY;
        if (!(i == 0 && byteString == null)) {
            if (i != 0) {
                WebSocketProtocol.validateCloseCode(i);
            }
            OOOO000 oooo000 = new OOOO000();
            oooo000.OooO0Oo(i);
            if (byteString != null) {
                oooo000.OooO00o(byteString);
            }
            byteString2 = oooo000.m16595OooO00o();
        }
        try {
            writeControlFrame(8, byteString2);
        } finally {
            this.writerClosed = true;
        }
    }

    public void writeMessageFrame(int i, long j, boolean z, boolean z2) throws IOException {
        if (!this.writerClosed) {
            int i2 = 0;
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= 128;
            }
            this.sinkBuffer.OooO0o0(i);
            if (this.isClient) {
                i2 = 128;
            }
            if (j <= 125) {
                this.sinkBuffer.OooO0o0(((int) j) | i2);
            } else if (j <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                this.sinkBuffer.OooO0o0(i2 | 126);
                this.sinkBuffer.OooO0Oo((int) j);
            } else {
                this.sinkBuffer.OooO0o0(i2 | 127);
                this.sinkBuffer.OooO0OO(j);
            }
            if (this.isClient) {
                this.random.nextBytes(this.maskKey);
                this.sinkBuffer.OooO00o(this.maskKey);
                if (j > 0) {
                    long OooO0o0 = this.sinkBuffer.OooO0o0();
                    this.sinkBuffer.write(this.buffer, j);
                    this.sinkBuffer.OooO00o(this.maskCursor);
                    this.maskCursor.OooO00o(OooO0o0);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            } else {
                this.sinkBuffer.write(this.buffer, j);
            }
            this.sink.m19751OooO00o();
            return;
        }
        throw new IOException("closed");
    }

    public void writePing(ByteString byteString) throws IOException {
        writeControlFrame(9, byteString);
    }

    public void writePong(ByteString byteString) throws IOException {
        writeControlFrame(10, byteString);
    }
}
