package kotlin.p285io;

import com.p118pd.sdk.AbstractC9141oooO0oO;
import com.p118pd.sdk.C9107oooO;
import com.p118pd.sdk.O0OO00;
import com.p118pd.sdk.o0O0OO00;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000d\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0005\n\u0002\u0010\f\n\u0002\u0010\u0019\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\b\u001a\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\rH\b\u001a\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000eH\b\u001a\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000fH\b\u001a\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0010H\b\u001a\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0011H\b\u001a\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0012H\b\u001a\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001H\b\u001a\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0013H\b\u001a\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0014H\b\u001a\t\u0010\u0015\u001a\u00020\nH\b\u001a\u0013\u0010\u0015\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\b\u001a\u0011\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\rH\b\u001a\u0011\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000eH\b\u001a\u0011\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000fH\b\u001a\u0011\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0010H\b\u001a\u0011\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0011H\b\u001a\u0011\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0012H\b\u001a\u0011\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001H\b\u001a\u0011\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0013H\b\u001a\u0011\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0014H\b\u001a\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u001a\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u001a\u001a\u00020\r*\u00020\u001bH\u0002\u001a\f\u0010\u001c\u001a\u00020\u000f*\u00020\u001bH\u0002\u001a\f\u0010\u001d\u001a\u00020\n*\u00020\u001eH\u0002\u001a$\u0010\u001f\u001a\u00020\r*\u00020\u00042\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\rH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006$"}, mo43195d2 = {"BUFFER_SIZE", "", "LINE_SEPARATOR_MAX_LENGTH", "decoder", "Ljava/nio/charset/CharsetDecoder;", "getDecoder", "()Ljava/nio/charset/CharsetDecoder;", "decoder$delegate", "Lkotlin/Lazy;", "print", "", "message", "", "", "", "", "", "", "", "", "", "println", "readLine", "", "inputStream", "Ljava/io/InputStream;", "containsLineSeparator", "Ljava/nio/CharBuffer;", "dequeue", "flipBack", "Ljava/nio/Buffer;", "tryDecode", "byteBuffer", "Ljava/nio/ByteBuffer;", "charBuffer", "isEndOfStream", "kotlin-stdlib"}, mo43196k = 2, mo43197mv = {1, 1, 13})
@JvmName(name = "ConsoleKt")
/* renamed from: kotlin.io.ConsoleKt */
public final class ConsoleKt {
    public static final int OooO00o = 32;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final AbstractC9141oooO0oO f23867OooO00o = C9107oooO.OooO00o(ConsoleKt$decoder$2.INSTANCE);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final /* synthetic */ KProperty[] f23868OooO00o = {O0OO00.OooO00o(new PropertyReference0Impl(O0OO00.OooO00o(ConsoleKt.class, "kotlin-stdlib"), "decoder", "getDecoder()Ljava/nio/charset/CharsetDecoder;"))};
    public static final int OooO0O0 = 2;

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final CharsetDecoder m22800OooO00o() {
        AbstractC9141oooO0oO oooo0oo = f23867OooO00o;
        KProperty oo0o00o0 = f23868OooO00o[0];
        return (CharsetDecoder) oooo0oo.getValue();
    }

    @InlineOnly
    public static final void OooO00o(Object obj) {
        System.out.print(obj);
    }

    @InlineOnly
    public static final void OooO0O0(Object obj) {
        System.out.println(obj);
    }

    @InlineOnly
    public static final void OooO00o(int i) {
        System.out.print(i);
    }

    @InlineOnly
    public static final void OooO0O0(int i) {
        System.out.println(i);
    }

    @InlineOnly
    public static final void OooO00o(long j) {
        System.out.print(j);
    }

    @InlineOnly
    public static final void OooO0O0(long j) {
        System.out.println(j);
    }

    @InlineOnly
    public static final void OooO00o(byte b) {
        System.out.print(Byte.valueOf(b));
    }

    @InlineOnly
    public static final void OooO0O0(byte b) {
        System.out.println(Byte.valueOf(b));
    }

    @InlineOnly
    public static final void OooO00o(short s) {
        System.out.print(Short.valueOf(s));
    }

    @InlineOnly
    public static final void OooO0O0(short s) {
        System.out.println(Short.valueOf(s));
    }

    @InlineOnly
    public static final void OooO00o(char c) {
        System.out.print(c);
    }

    @InlineOnly
    public static final void OooO0O0(char c) {
        System.out.println(c);
    }

    @InlineOnly
    public static final void OooO00o(boolean z) {
        System.out.print(z);
    }

    @InlineOnly
    public static final void OooO0O0(boolean z) {
        System.out.println(z);
    }

    @InlineOnly
    public static final void OooO00o(float f) {
        System.out.print(f);
    }

    @InlineOnly
    public static final void OooO0O0(float f) {
        System.out.println(f);
    }

    @InlineOnly
    public static final void OooO00o(double d) {
        System.out.print(d);
    }

    @InlineOnly
    public static final void OooO0O0(double d) {
        System.out.println(d);
    }

    @InlineOnly
    public static final void OooO00o(char[] cArr) {
        System.out.print(cArr);
    }

    @InlineOnly
    public static final void OooO0O0(char[] cArr) {
        System.out.println(cArr);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final void m22801OooO00o() {
        System.out.println();
    }

    @Nullable
    public static final String OooO00o() {
        InputStream inputStream = System.in;
        o0O0OO00.OooO00o((Object) inputStream, "System.`in`");
        return OooO00o(inputStream, m22800OooO00o());
    }

    @Nullable
    public static final String OooO00o(@NotNull InputStream inputStream, @NotNull CharsetDecoder charsetDecoder) {
        o0O0OO00.OooO0o(inputStream, "inputStream");
        o0O0OO00.OooO0o(charsetDecoder, "decoder");
        if (charsetDecoder.maxCharsPerByte() <= ((float) 1)) {
            ByteBuffer allocate = ByteBuffer.allocate(32);
            CharBuffer allocate2 = CharBuffer.allocate(2);
            StringBuilder sb = new StringBuilder();
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            do {
                allocate.put((byte) read);
                o0O0OO00.OooO00o((Object) allocate, "byteBuffer");
                o0O0OO00.OooO00o((Object) allocate2, "charBuffer");
                if (OooO00o(charsetDecoder, allocate, allocate2, false)) {
                    if (m22802OooO00o(allocate2)) {
                        break;
                    } else if (!allocate2.hasRemaining()) {
                        sb.append(OooO00o(allocate2));
                    }
                }
                read = inputStream.read();
            } while (read != -1);
            OooO00o(charsetDecoder, allocate, allocate2, true);
            charsetDecoder.reset();
            int position = allocate2.position();
            char c = allocate2.get(0);
            char c2 = allocate2.get(1);
            if (position != 1) {
                if (position == 2) {
                    if (!(c == '\r' && c2 == '\n')) {
                        sb.append(c);
                    }
                    if (c2 != '\n') {
                        sb.append(c2);
                    }
                }
            } else if (c != '\n') {
                sb.append(c);
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Encodings with multiple chars per byte are not supported".toString());
    }

    public static final boolean OooO00o(@NotNull CharsetDecoder charsetDecoder, ByteBuffer byteBuffer, CharBuffer charBuffer, boolean z) {
        int position = charBuffer.position();
        byteBuffer.flip();
        CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, z);
        if (decode.isError()) {
            decode.throwException();
        }
        boolean z2 = charBuffer.position() > position;
        if (z2) {
            byteBuffer.clear();
        } else {
            OooO00o((Buffer) byteBuffer);
        }
        return z2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final boolean m22802OooO00o(@NotNull CharBuffer charBuffer) {
        return charBuffer.get(1) == '\n' || charBuffer.get(0) == '\n';
    }

    public static final void OooO00o(@NotNull Buffer buffer) {
        buffer.position(buffer.limit());
        buffer.limit(buffer.capacity());
    }

    public static final char OooO00o(@NotNull CharBuffer charBuffer) {
        charBuffer.flip();
        char c = charBuffer.get();
        charBuffer.compact();
        return c;
    }
}
