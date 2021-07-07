package okhttp3.internal.p288ws;

import com.p118pd.sdk.OOOO000;
import okio.ByteString;

/* renamed from: okhttp3.internal.ws.WebSocketProtocol */
public final class WebSocketProtocol {
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    public WebSocketProtocol() {
        throw new AssertionError("No instances.");
    }

    public static String acceptHeader(String str) {
        return ByteString.encodeUtf8(str + ACCEPT_MAGIC).sha1().base64();
    }

    public static String closeCodeExceptionMessage(int i) {
        if (i < 1000 || i >= 5000) {
            return "Code must be in range [1000,5000): " + i;
        } else if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        } else {
            return "Code " + i + " is reserved and may not be used.";
        }
    }

    public static void toggleMask(OOOO000.OooO0OO oooO0OO, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = oooO0OO.f16985OooO00o;
            int i2 = oooO0OO.o00oO0O;
            int i3 = oooO0OO.o0ooOO0;
            while (i2 < i3) {
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
        } while (oooO0OO.OooO0O0() != -1);
    }

    public static void validateCloseCode(int i) {
        String closeCodeExceptionMessage = closeCodeExceptionMessage(i);
        if (closeCodeExceptionMessage != null) {
            throw new IllegalArgumentException(closeCodeExceptionMessage);
        }
    }
}
