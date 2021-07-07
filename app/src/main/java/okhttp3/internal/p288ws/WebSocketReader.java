package okhttp3.internal.p288ws;

import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.oOOO000O;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.ByteString;

/* renamed from: okhttp3.internal.ws.WebSocketReader */
public final class WebSocketReader {
    public boolean closed;
    public final OOOO000 controlFrameBuffer = new OOOO000();
    public final FrameCallback frameCallback;
    public long frameLength;
    public final boolean isClient;
    public boolean isControlFrame;
    public boolean isFinalFrame;
    public final OOOO000.OooO0OO maskCursor;
    public final byte[] maskKey;
    public final OOOO000 messageFrameBuffer = new OOOO000();
    public int opcode;
    public final oOOO000O source;

    /* renamed from: okhttp3.internal.ws.WebSocketReader$FrameCallback */
    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(String str) throws IOException;

        void onReadMessage(ByteString byteString) throws IOException;

        void onReadPing(ByteString byteString);

        void onReadPong(ByteString byteString);
    }

    public WebSocketReader(boolean z, oOOO000O oooo000o, FrameCallback frameCallback2) {
        if (oooo000o == null) {
            throw new NullPointerException("source == null");
        } else if (frameCallback2 != null) {
            this.isClient = z;
            this.source = oooo000o;
            this.frameCallback = frameCallback2;
            OOOO000.OooO0OO oooO0OO = null;
            this.maskKey = z ? null : new byte[4];
            this.maskCursor = !z ? new OOOO000.OooO0OO() : oooO0OO;
        } else {
            throw new NullPointerException("frameCallback == null");
        }
    }

    private void readControlFrame() throws IOException {
        String str;
        long j = this.frameLength;
        if (j > 0) {
            this.source.OooO00o(this.controlFrameBuffer, j);
            if (!this.isClient) {
                this.controlFrameBuffer.OooO00o(this.maskCursor);
                this.maskCursor.OooO00o(0L);
                WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                short s = 1005;
                long OooO0o0 = this.controlFrameBuffer.OooO0o0();
                if (OooO0o0 != 1) {
                    if (OooO0o0 != 0) {
                        s = this.controlFrameBuffer.readShort();
                        str = this.controlFrameBuffer.m16606OooO0O0();
                        String closeCodeExceptionMessage = WebSocketProtocol.closeCodeExceptionMessage(s);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        str = "";
                    }
                    this.frameCallback.onReadClose(s, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.m16595OooO00o());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.m16595OooO00o());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.opcode));
        }
    }

    /* JADX INFO: finally extract failed */
    private void readHeader() throws IOException {
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                int readByte = this.source.readByte() & 255;
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                this.opcode = readByte & 15;
                boolean z = true;
                this.isFinalFrame = (readByte & 128) != 0;
                boolean z2 = (readByte & 8) != 0;
                this.isControlFrame = z2;
                if (!z2 || this.isFinalFrame) {
                    boolean z3 = (readByte & 64) != 0;
                    boolean z4 = (readByte & 32) != 0;
                    boolean z5 = (readByte & 16) != 0;
                    if (z3 || z4 || z5) {
                        throw new ProtocolException("Reserved flags are unsupported.");
                    }
                    int readByte2 = this.source.readByte() & 255;
                    if ((readByte2 & 128) == 0) {
                        z = false;
                    }
                    if (z == this.isClient) {
                        throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                    }
                    long j = (long) (readByte2 & 127);
                    this.frameLength = j;
                    if (j == 126) {
                        this.frameLength = ((long) this.source.readShort()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                    } else if (j == 127) {
                        long readLong = this.source.readLong();
                        this.frameLength = readLong;
                        if (readLong < 0) {
                            throw new ProtocolException("Frame length 0x" + Long.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                        }
                    }
                    if (this.isControlFrame && this.frameLength > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (z) {
                        this.source.readFully(this.maskKey);
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    private void readMessage() throws IOException {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.OooO00o(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    this.messageFrameBuffer.OooO00o(this.maskCursor);
                    this.maskCursor.OooO00o(this.messageFrameBuffer.OooO0o0() - this.frameLength);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            if (!this.isFinalFrame) {
                readUntilNonControlFrame();
                if (this.opcode != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.opcode));
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    private void readMessageFrame() throws IOException {
        int i = this.opcode;
        if (i == 1 || i == 2) {
            readMessage();
            if (i == 1) {
                this.frameCallback.onReadMessage(this.messageFrameBuffer.m16606OooO0O0());
            } else {
                this.frameCallback.onReadMessage(this.messageFrameBuffer.m16595OooO00o());
            }
        } else {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
    }

    private void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (this.isControlFrame) {
                readControlFrame();
            } else {
                return;
            }
        }
    }

    public void processNextFrame() throws IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
