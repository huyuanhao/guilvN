package kotlin.p285io;

import com.p118pd.sdk.C9097ooo00O0;
import com.p118pd.sdk.C9174oooOOooO;
import com.p118pd.sdk.O000OOOO;
import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.O00Oo000;
import com.p118pd.sdk.o0O0OO00;
import com.umeng.message.util.HttpRequest;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a!\u0010\n\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\b\u001a!\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\b\u001aB\u0010\u0010\u001a\u00020\u0001*\u00020\u000226\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u001aJ\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\r26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u001a7\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00010\u0019\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0002H\b\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u0002H\b\u001a\u0017\u0010\u001f\u001a\u00020 *\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\b\u001a\n\u0010!\u001a\u00020\u0004*\u00020\u0002\u001a\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0014\u0010$\u001a\u00020\u0007*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0017\u0010%\u001a\u00020&*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\b\u001a?\u0010'\u001a\u0002H(\"\u0004\b\u0000\u0010(*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070*\u0012\u0004\u0012\u0002H(0\u0019H\bø\u0001\u0000¢\u0006\u0002\u0010,\u001a\u0012\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010.\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0017\u0010/\u001a\u000200*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\b\u0002\b\n\u0006\b\u0011(+0\u0001¨\u00061"}, mo43195d2 = {"appendBytes", "", "Ljava/io/File;", "array", "", "appendText", "text", "", HttpRequest.PARAM_CHARSET, "Ljava/nio/charset/Charset;", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "bufferedWriter", "Ljava/io/BufferedWriter;", "forEachBlock", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "buffer", "bytesRead", "blockSize", "forEachLine", "Lkotlin/Function1;", "line", "inputStream", "Ljava/io/FileInputStream;", "outputStream", "Ljava/io/FileOutputStream;", "printWriter", "Ljava/io/PrintWriter;", "readBytes", "readLines", "", "readText", "reader", "Ljava/io/InputStreamReader;", "useLines", "T", "block", "Lkotlin/sequences/Sequence;", "Requires newer compiler version to be inlined correctly.", "(Ljava/io/File;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeBytes", "writeText", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib"}, mo43196k = 5, mo43197mv = {1, 1, 13}, mo43199xi = 1, mo43200xs = "kotlin/io/FilesKt")
/* renamed from: kotlin.io.FilesKt__FileReadWriteKt */
public class FilesKt__FileReadWriteKt extends O000OOOO {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        com.p118pd.sdk.O000o0oO.OooO00o(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void OooO0O0(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull byte[] r2) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r1, r0)
            java.lang.String r0 = "array"
            com.p118pd.sdk.o0O0OO00.OooO0o(r2, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r0.write(r2)     // Catch:{ all -> 0x0019 }
            com.pd.sdk.oooOOooO r1 = com.p118pd.sdk.C9174oooOOooO.OooO00o     // Catch:{ all -> 0x0019 }
            r1 = 0
            com.p118pd.sdk.O000o0oO.OooO00o(r0, r1)
            return
        L_0x0019:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001b }
        L_0x001b:
            r2 = move-exception
            com.p118pd.sdk.O000o0oO.OooO00o(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p285io.FilesKt__FileReadWriteKt.OooO0O0(java.io.File, byte[]):void");
    }

    public static final void OooO0O0(@NotNull File file, @NotNull String str, @NotNull Charset charset) {
        o0O0OO00.OooO0o(file, "receiver$0");
        o0O0OO00.OooO0o(str, "text");
        o0O0OO00.OooO0o(charset, HttpRequest.PARAM_CHARSET);
        byte[] bytes = str.getBytes(charset);
        o0O0OO00.OooO00o((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        OooO0O0(file, bytes);
    }

    @InlineOnly
    public static final InputStreamReader OooO00o(@NotNull File file, Charset charset) {
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static /* synthetic */ void OooO0O0(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = C9097ooo00O0.f22450OooO00o;
        }
        OooO0O0(file, str, charset);
    }

    @InlineOnly
    public static final BufferedReader OooO00o(@NotNull File file, Charset charset, int i) {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final OutputStreamWriter m22805OooO00o(@NotNull File file, Charset charset) {
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final BufferedWriter m22803OooO00o(@NotNull File file, Charset charset, int i) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final PrintWriter m22806OooO00o(@NotNull File file, Charset charset) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        com.p118pd.sdk.O000o0oO.OooO00o(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        throw r1;
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] m22810OooO00o(@org.jetbrains.annotations.NotNull java.io.File r7) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r7, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r7)
            r1 = 0
            long r2 = r7.length()     // Catch:{ all -> 0x005b }
            r4 = 2147483647(0x7fffffff, float:NaN)
            long r4 = (long) r4     // Catch:{ all -> 0x005b }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0037
            int r7 = (int) r2     // Catch:{ all -> 0x005b }
            byte[] r2 = new byte[r7]     // Catch:{ all -> 0x005b }
        L_0x001a:
            if (r7 <= 0) goto L_0x0026
            int r3 = r0.read(r2, r1, r7)     // Catch:{ all -> 0x005b }
            if (r3 >= 0) goto L_0x0023
            goto L_0x0026
        L_0x0023:
            int r7 = r7 - r3
            int r1 = r1 + r3
            goto L_0x001a
        L_0x0026:
            if (r7 != 0) goto L_0x0029
            goto L_0x0032
        L_0x0029:
            byte[] r2 = java.util.Arrays.copyOf(r2, r1)     // Catch:{ all -> 0x005b }
            java.lang.String r7 = "java.util.Arrays.copyOf(this, newSize)"
            com.p118pd.sdk.o0O0OO00.OooO00o(r2, r7)     // Catch:{ all -> 0x005b }
        L_0x0032:
            r7 = 0
            com.p118pd.sdk.O000o0oO.OooO00o(r0, r7)
            return r2
        L_0x0037:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "File "
            r4.append(r5)
            r4.append(r7)
            java.lang.String r7 = " is too big ("
            r4.append(r7)
            r4.append(r2)
            java.lang.String r7 = " bytes) to fit in memory."
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            r1.<init>(r7)
            throw r1
        L_0x005b:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x005d }
        L_0x005d:
            r1 = move-exception
            com.p118pd.sdk.O000o0oO.OooO00o(r0, r7)
            goto L_0x0063
        L_0x0062:
            throw r1
        L_0x0063:
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p285io.FilesKt__FileReadWriteKt.m22810OooO00o(java.io.File):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        com.p118pd.sdk.O000o0oO.OooO00o(r0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void OooO00o(@org.jetbrains.annotations.NotNull java.io.File r2, @org.jetbrains.annotations.NotNull byte[] r3) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r2, r0)
            java.lang.String r0 = "array"
            com.p118pd.sdk.o0O0OO00.OooO0o(r3, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 1
            r0.<init>(r2, r1)
            r0.write(r3)     // Catch:{ all -> 0x001a }
            com.pd.sdk.oooOOooO r2 = com.p118pd.sdk.C9174oooOOooO.OooO00o     // Catch:{ all -> 0x001a }
            r2 = 0
            com.p118pd.sdk.O000o0oO.OooO00o(r0, r2)
            return
        L_0x001a:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001c }
        L_0x001c:
            r3 = move-exception
            com.p118pd.sdk.O000o0oO.OooO00o(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p285io.FilesKt__FileReadWriteKt.OooO00o(java.io.File, byte[]):void");
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final String m22807OooO00o(@NotNull File file, @NotNull Charset charset) {
        o0O0OO00.OooO0o(file, "receiver$0");
        o0O0OO00.OooO0o(charset, HttpRequest.PARAM_CHARSET);
        return new String(m22810OooO00o(file), charset);
    }

    public static final void OooO00o(@NotNull File file, @NotNull String str, @NotNull Charset charset) {
        o0O0OO00.OooO0o(file, "receiver$0");
        o0O0OO00.OooO0o(str, "text");
        o0O0OO00.OooO0o(charset, HttpRequest.PARAM_CHARSET);
        byte[] bytes = str.getBytes(charset);
        o0O0OO00.OooO00o((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        OooO00o(file, bytes);
    }

    public static /* synthetic */ void OooO00o(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = C9097ooo00O0.f22450OooO00o;
        }
        OooO00o(file, str, charset);
    }

    public static final void OooO00o(@NotNull File file, @NotNull O00Oo000<? super byte[], ? super Integer, C9174oooOOooO> o00Oo000) {
        o0O0OO00.OooO0o(file, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, "action");
        OooO00o(file, 4096, o00Oo000);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.io.FileInputStream */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        com.p118pd.sdk.O000o0oO.OooO00o(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        throw r2;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void OooO00o(@org.jetbrains.annotations.NotNull java.io.File r1, int r2, @org.jetbrains.annotations.NotNull com.p118pd.sdk.O00Oo000<? super byte[], ? super java.lang.Integer, com.p118pd.sdk.C9174oooOOooO> r3) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r1, r0)
            java.lang.String r0 = "action"
            com.p118pd.sdk.o0O0OO00.OooO0o(r3, r0)
            r0 = 512(0x200, float:7.175E-43)
            int r2 = com.p118pd.sdk.oO00O000.OooO00o(r2, r0)
            byte[] r2 = new byte[r2]
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
        L_0x0017:
            int r1 = r0.read(r2)     // Catch:{ all -> 0x002c }
            if (r1 > 0) goto L_0x0024
            com.pd.sdk.oooOOooO r1 = com.p118pd.sdk.C9174oooOOooO.OooO00o     // Catch:{ all -> 0x002c }
            r1 = 0
            com.p118pd.sdk.O000o0oO.OooO00o(r0, r1)
            return
        L_0x0024:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.invoke(r2, r1)
            goto L_0x0017
        L_0x002c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002e }
        L_0x002e:
            r2 = move-exception
            com.p118pd.sdk.O000o0oO.OooO00o(r0, r1)
            goto L_0x0034
        L_0x0033:
            throw r2
        L_0x0034:
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p285io.FilesKt__FileReadWriteKt.OooO00o(java.io.File, int, com.pd.sdk.O00Oo000):void");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final void m22809OooO00o(@NotNull File file, @NotNull Charset charset, @NotNull O00O0OOO<? super String, C9174oooOOooO> o00o0ooo) {
        o0O0OO00.OooO0o(file, "receiver$0");
        o0O0OO00.OooO0o(charset, HttpRequest.PARAM_CHARSET);
        o0O0OO00.OooO0o(o00o0ooo, "action");
        TextStreamsKt.m22820OooO00o((Reader) new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), o00o0ooo);
    }

    @InlineOnly
    public static final FileInputStream OooO00o(@NotNull File file) {
        return new FileInputStream(file);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final FileOutputStream m22804OooO00o(@NotNull File file) {
        return new FileOutputStream(file);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final List<String> m22808OooO00o(@NotNull File file, @NotNull Charset charset) {
        o0O0OO00.OooO0o(file, "receiver$0");
        o0O0OO00.OooO0o(charset, HttpRequest.PARAM_CHARSET);
        ArrayList arrayList = new ArrayList();
        m22809OooO00o(file, charset, (O00O0OOO<? super String, C9174oooOOooO>) new FilesKt__FileReadWriteKt$readLines$1(arrayList));
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        com.p118pd.sdk.o0O0O0OO.OooO0O0(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        if (com.p118pd.sdk.O000O000.OooO00o(1, 1, 0) == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        com.p118pd.sdk.O000o0oO.OooO00o(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        com.p118pd.sdk.o0O0O0OO.OooO00o(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T OooO00o(@org.jetbrains.annotations.NotNull java.io.File r3, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r4, @org.jetbrains.annotations.NotNull com.p118pd.sdk.O00O0OOO<? super com.p118pd.sdk.AbstractC7873oO0OOo00<java.lang.String>, ? extends T> r5) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r3, r0)
            java.lang.String r0 = "charset"
            com.p118pd.sdk.o0O0OO00.OooO0o(r4, r0)
            java.lang.String r0 = "block"
            com.p118pd.sdk.o0O0OO00.OooO0o(r5, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            r3.<init>(r0, r4)
            boolean r4 = r3 instanceof java.io.BufferedReader
            if (r4 == 0) goto L_0x0020
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3
            goto L_0x0028
        L_0x0020:
            java.io.BufferedReader r4 = new java.io.BufferedReader
            r0 = 8192(0x2000, float:1.14794E-41)
            r4.<init>(r3, r0)
            r3 = r4
        L_0x0028:
            r4 = 0
            r0 = 0
            r1 = 1
            com.pd.sdk.oO0OOo00 r2 = kotlin.p285io.TextStreamsKt.OooO00o(r3)     // Catch:{ all -> 0x0047 }
            java.lang.Object r5 = r5.invoke(r2)     // Catch:{ all -> 0x0047 }
            com.p118pd.sdk.o0O0O0OO.OooO0O0(r1)
            boolean r0 = com.p118pd.sdk.O000O000.OooO00o(r1, r1, r0)
            if (r0 == 0) goto L_0x0040
            com.p118pd.sdk.O000o0oO.OooO00o(r3, r4)
            goto L_0x0043
        L_0x0040:
            r3.close()
        L_0x0043:
            com.p118pd.sdk.o0O0O0OO.OooO00o(r1)
            return r5
        L_0x0047:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r5 = move-exception
            com.p118pd.sdk.o0O0O0OO.OooO0O0(r1)
            boolean r0 = com.p118pd.sdk.O000O000.OooO00o(r1, r1, r0)
            if (r0 != 0) goto L_0x0057
            r3.close()     // Catch:{ all -> 0x005a }
            goto L_0x005a
        L_0x0057:
            com.p118pd.sdk.O000o0oO.OooO00o(r3, r4)
        L_0x005a:
            com.p118pd.sdk.o0O0O0OO.OooO00o(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p285io.FilesKt__FileReadWriteKt.OooO00o(java.io.File, java.nio.charset.Charset, com.pd.sdk.O00O0OOO):java.lang.Object");
    }
}
