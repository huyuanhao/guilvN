package com.p118pd.sdk;

import com.umeng.message.util.HttpRequest;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\b\u001a\u0017\u0010\u0007\u001a\u00020\b*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\b\u001a\u0017\u0010\u000b\u001a\u00020\f*\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\b\u001a\u0017\u0010\r\u001a\u00020\u000e*\u00020\u000f2\b\b\u0002\u0010\t\u001a\u00020\nH\b\u001a\u001c\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\r\u0010\u0013\u001a\u00020\u000e*\u00020\u0014H\b\u001a\u001d\u0010\u0013\u001a\u00020\u000e*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\b\u001a\r\u0010\u0017\u001a\u00020\u0018*\u00020\u0001H\u0002\u001a\f\u0010\u0019\u001a\u00020\u0014*\u00020\u0002H\u0007\u001a\u0016\u0010\u0019\u001a\u00020\u0014*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0007\u001a\u0017\u0010\u001b\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\b\u001a\u0017\u0010\u001d\u001a\u00020\u001e*\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\b¨\u0006\u001f"}, mo43195d2 = {"buffered", "Ljava/io/BufferedInputStream;", "Ljava/io/InputStream;", "bufferSize", "", "Ljava/io/BufferedOutputStream;", "Ljava/io/OutputStream;", "bufferedReader", "Ljava/io/BufferedReader;", HttpRequest.PARAM_CHARSET, "Ljava/nio/charset/Charset;", "bufferedWriter", "Ljava/io/BufferedWriter;", "byteInputStream", "Ljava/io/ByteArrayInputStream;", "", "copyTo", "", "out", "inputStream", "", "offset", "length", "iterator", "Lkotlin/collections/ByteIterator;", "readBytes", "estimatedSize", "reader", "Ljava/io/InputStreamReader;", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib"}, mo43196k = 2, mo43197mv = {1, 1, 13})
@JvmName(name = "ByteStreamsKt")
/* renamed from: com.pd.sdk.O000O0O0 */
public final class O000O0O0 {

    /* renamed from: com.pd.sdk.O000O0O0$OooO00o */
    public static final class OooO00o extends AbstractC9196oooOoo0O {
        public final /* synthetic */ BufferedInputStream OooO00o;
        public boolean OooO0O0;
        public boolean OooO0OO;
        public int o00oO0O = -1;

        public OooO00o(BufferedInputStream bufferedInputStream) {
            this.OooO00o = bufferedInputStream;
        }

        private final void OooO0OO() {
            if (!this.OooO0O0 && !this.OooO0OO) {
                int read = this.OooO00o.read();
                this.o00oO0O = read;
                boolean z = true;
                this.OooO0O0 = true;
                if (read != -1) {
                    z = false;
                }
                this.OooO0OO = z;
            }
        }

        @Override // com.p118pd.sdk.AbstractC9196oooOoo0O
        public final int OooO00o() {
            return this.o00oO0O;
        }

        public final boolean OooO0O0() {
            return this.OooO0O0;
        }

        public boolean hasNext() {
            OooO0OO();
            return !this.OooO0OO;
        }

        @Override // com.p118pd.sdk.AbstractC9196oooOoo0O
        public byte nextByte() {
            OooO0OO();
            if (!this.OooO0OO) {
                byte b = (byte) this.o00oO0O;
                this.OooO0O0 = false;
                return b;
            }
            throw new NoSuchElementException("Input stream is over.");
        }

        public final void OooO00o(int i) {
            this.o00oO0O = i;
        }

        public final void OooO0O0(boolean z) {
            this.OooO0O0 = z;
        }

        @Override // com.p118pd.sdk.AbstractC9196oooOoo0O
        /* renamed from: OooO00o  reason: collision with other method in class */
        public final boolean m16507OooO00o() {
            return this.OooO0OO;
        }

        public final void OooO00o(boolean z) {
            this.OooO0OO = z;
        }
    }

    @NotNull
    public static final AbstractC9196oooOoo0O OooO00o(@NotNull BufferedInputStream bufferedInputStream) {
        o0O0OO00.OooO0o(bufferedInputStream, "receiver$0");
        return new OooO00o(bufferedInputStream);
    }

    @InlineOnly
    public static final ByteArrayInputStream OooO00o(@NotNull String str, Charset charset) {
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            o0O0OO00.OooO00o((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteArrayInputStream(bytes);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @InlineOnly
    public static /* synthetic */ ByteArrayInputStream OooO00o(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C9097ooo00O0.f22450OooO00o;
        }
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            o0O0OO00.OooO00o((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteArrayInputStream(bytes);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @InlineOnly
    public static final ByteArrayInputStream OooO00o(@NotNull byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    @InlineOnly
    public static final ByteArrayInputStream OooO00o(@NotNull byte[] bArr, int i, int i2) {
        return new ByteArrayInputStream(bArr, i, i2);
    }

    @InlineOnly
    public static final BufferedInputStream OooO00o(@NotNull InputStream inputStream, int i) {
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final InputStreamReader m16504OooO00o(@NotNull InputStream inputStream, Charset charset) {
        return new InputStreamReader(inputStream, charset);
    }

    @InlineOnly
    public static final BufferedReader OooO00o(@NotNull InputStream inputStream, Charset charset) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    @InlineOnly
    public static final BufferedOutputStream OooO00o(@NotNull OutputStream outputStream, int i) {
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final OutputStreamWriter m16505OooO00o(@NotNull OutputStream outputStream, Charset charset) {
        return new OutputStreamWriter(outputStream, charset);
    }

    @InlineOnly
    public static final BufferedWriter OooO00o(@NotNull OutputStream outputStream, Charset charset) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    public static /* synthetic */ long OooO00o(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return OooO00o(inputStream, outputStream, i);
    }

    public static final long OooO00o(@NotNull InputStream inputStream, @NotNull OutputStream outputStream, int i) {
        o0O0OO00.OooO0o(inputStream, "receiver$0");
        o0O0OO00.OooO0o(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    @Deprecated(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @ReplaceWith(expression = "readBytes()", imports = {}))
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final byte[] m16506OooO00o(@NotNull InputStream inputStream, int i) {
        o0O0OO00.OooO0o(inputStream, "receiver$0");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i, inputStream.available()));
        OooO00o(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        o0O0OO00.OooO00o((Object) byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final byte[] OooO00o(@NotNull InputStream inputStream) {
        o0O0OO00.OooO0o(inputStream, "receiver$0");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        OooO00o(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        o0O0OO00.OooO00o((Object) byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    @InlineOnly
    public static /* synthetic */ BufferedOutputStream OooO00o(OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i);
    }
}
