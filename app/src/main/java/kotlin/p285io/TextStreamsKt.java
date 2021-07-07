package kotlin.p285io;

import com.p118pd.sdk.AbstractC7873oO0OOo00;
import com.p118pd.sdk.C9097ooo00O0;
import com.p118pd.sdk.C9174oooOOooO;
import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.o0O0OO00;
import com.umeng.message.util.HttpRequest;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.p285io.LinesSequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\b\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r\u001a\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010*\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u000e*\u00020\u0002\u001a\u0017\u0010\u0016\u001a\u00020\u000e*\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\b\u001a\r\u0010\u0019\u001a\u00020\u001a*\u00020\u000eH\b\u001a5\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c*\u00020\u00022\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u0002H\u001c0\rH\bø\u0001\u0000¢\u0006\u0002\u0010\u001f\u0002\b\n\u0006\b\u0011(\u001e0\u0001¨\u0006 "}, mo43195d2 = {"buffered", "Ljava/io/BufferedReader;", "Ljava/io/Reader;", "bufferSize", "", "Ljava/io/BufferedWriter;", "Ljava/io/Writer;", "copyTo", "", "out", "forEachLine", "", "action", "Lkotlin/Function1;", "", "lineSequence", "Lkotlin/sequences/Sequence;", "readBytes", "", "Ljava/net/URL;", "readLines", "", "readText", HttpRequest.PARAM_CHARSET, "Ljava/nio/charset/Charset;", "reader", "Ljava/io/StringReader;", "useLines", "T", "block", "Requires newer compiler version to be inlined correctly.", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, mo43196k = 2, mo43197mv = {1, 1, 13})
@JvmName(name = "TextStreamsKt")
/* renamed from: kotlin.io.TextStreamsKt */
public final class TextStreamsKt {
    @InlineOnly
    public static final BufferedReader OooO00o(@NotNull Reader reader, int i) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    @InlineOnly
    public static final BufferedWriter OooO00o(@NotNull Writer writer, int i) {
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final List<String> m22819OooO00o(@NotNull Reader reader) {
        o0O0OO00.OooO0o(reader, "receiver$0");
        ArrayList arrayList = new ArrayList();
        m22820OooO00o(reader, (O00O0OOO<? super String, C9174oooOOooO>) new TextStreamsKt$readLines$1(arrayList));
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        com.p118pd.sdk.o0O0O0OO.OooO0O0(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (com.p118pd.sdk.O000O000.OooO00o(1, 1, 0) == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        com.p118pd.sdk.O000o0oO.OooO00o(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        com.p118pd.sdk.o0O0O0OO.OooO00o(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T OooO00o(@org.jetbrains.annotations.NotNull java.io.Reader r4, @org.jetbrains.annotations.NotNull com.p118pd.sdk.O00O0OOO<? super com.p118pd.sdk.AbstractC7873oO0OOo00<java.lang.String>, ? extends T> r5) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r4, r0)
            java.lang.String r0 = "block"
            com.p118pd.sdk.o0O0OO00.OooO0o(r5, r0)
            boolean r0 = r4 instanceof java.io.BufferedReader
            if (r0 == 0) goto L_0x0011
            java.io.BufferedReader r4 = (java.io.BufferedReader) r4
            goto L_0x0019
        L_0x0011:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r4, r1)
            r4 = r0
        L_0x0019:
            r0 = 0
            r1 = 0
            r2 = 1
            com.pd.sdk.oO0OOo00 r3 = OooO00o(r4)     // Catch:{ all -> 0x0038 }
            java.lang.Object r5 = r5.invoke(r3)     // Catch:{ all -> 0x0038 }
            com.p118pd.sdk.o0O0O0OO.OooO0O0(r2)
            boolean r1 = com.p118pd.sdk.O000O000.OooO00o(r2, r2, r1)
            if (r1 == 0) goto L_0x0031
            com.p118pd.sdk.O000o0oO.OooO00o(r4, r0)
            goto L_0x0034
        L_0x0031:
            r4.close()
        L_0x0034:
            com.p118pd.sdk.o0O0O0OO.OooO00o(r2)
            return r5
        L_0x0038:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            com.p118pd.sdk.o0O0O0OO.OooO0O0(r2)
            boolean r1 = com.p118pd.sdk.O000O000.OooO00o(r2, r2, r1)
            if (r1 != 0) goto L_0x0048
            r4.close()     // Catch:{ all -> 0x004b }
            goto L_0x004b
        L_0x0048:
            com.p118pd.sdk.O000o0oO.OooO00o(r4, r5)
        L_0x004b:
            com.p118pd.sdk.o0O0O0OO.OooO00o(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p285io.TextStreamsKt.OooO00o(java.io.Reader, com.pd.sdk.O00O0OOO):java.lang.Object");
    }

    @InlineOnly
    public static final StringReader OooO00o(@NotNull String str) {
        return new StringReader(str);
    }

    @NotNull
    public static final AbstractC7873oO0OOo00<String> OooO00o(@NotNull BufferedReader bufferedReader) {
        o0O0OO00.OooO0o(bufferedReader, "receiver$0");
        return SequencesKt__SequencesKt.OooO00o((AbstractC7873oO0OOo00) new LinesSequence(bufferedReader));
    }

    @NotNull
    public static final String OooO00o(@NotNull Reader reader) {
        o0O0OO00.OooO0o(reader, "receiver$0");
        StringWriter stringWriter = new StringWriter();
        OooO00o(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        o0O0OO00.OooO00o((Object) stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    public static /* synthetic */ long OooO00o(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return OooO00o(reader, writer, i);
    }

    public static final long OooO00o(@NotNull Reader reader, @NotNull Writer writer, int i) {
        o0O0OO00.OooO0o(reader, "receiver$0");
        o0O0OO00.OooO0o(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += (long) read;
            read = reader.read(cArr);
        }
        return j;
    }

    @InlineOnly
    public static final String OooO00o(@NotNull URL url, Charset charset) {
        return new String(OooO00o(url), charset);
    }

    @InlineOnly
    public static /* synthetic */ String OooO00o(URL url, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C9097ooo00O0.f22450OooO00o;
        }
        return new String(OooO00o(url), charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        com.p118pd.sdk.O000o0oO.OooO00o(r2, r0);
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] OooO00o(@org.jetbrains.annotations.NotNull java.net.URL r2) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r2, r0)
            java.io.InputStream r2 = r2.openStream()
            java.lang.String r0 = "it"
            com.p118pd.sdk.o0O0OO00.OooO00o(r2, r0)     // Catch:{ all -> 0x0017 }
            byte[] r0 = com.p118pd.sdk.O000O0O0.OooO00o(r2)     // Catch:{ all -> 0x0017 }
            r1 = 0
            com.p118pd.sdk.O000o0oO.OooO00o(r2, r1)
            return r0
        L_0x0017:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r1 = move-exception
            com.p118pd.sdk.O000o0oO.OooO00o(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p285io.TextStreamsKt.OooO00o(java.net.URL):byte[]");
    }

    @InlineOnly
    public static /* synthetic */ BufferedReader OooO00o(Reader reader, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    @InlineOnly
    public static /* synthetic */ BufferedWriter OooO00o(Writer writer, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        com.p118pd.sdk.O000o0oO.OooO00o(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        throw r0;
     */
    /* renamed from: OooO00o  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m22820OooO00o(@org.jetbrains.annotations.NotNull java.io.Reader r3, @org.jetbrains.annotations.NotNull com.p118pd.sdk.O00O0OOO<? super java.lang.String, com.p118pd.sdk.C9174oooOOooO> r4) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r3, r0)
            java.lang.String r0 = "action"
            com.p118pd.sdk.o0O0OO00.OooO0o(r4, r0)
            boolean r0 = r3 instanceof java.io.BufferedReader
            if (r0 == 0) goto L_0x0011
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3
            goto L_0x0019
        L_0x0011:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3, r1)
            r3 = r0
        L_0x0019:
            r0 = 0
            com.pd.sdk.oO0OOo00 r1 = OooO00o(r3)     // Catch:{ all -> 0x0036 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0036 }
        L_0x0022:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0036 }
            r4.invoke(r2)     // Catch:{ all -> 0x0036 }
            goto L_0x0022
        L_0x0030:
            com.pd.sdk.oooOOooO r4 = com.p118pd.sdk.C9174oooOOooO.OooO00o     // Catch:{ all -> 0x0036 }
            com.p118pd.sdk.O000o0oO.OooO00o(r3, r0)
            return
        L_0x0036:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            com.p118pd.sdk.O000o0oO.OooO00o(r3, r4)
            goto L_0x003e
        L_0x003d:
            throw r0
        L_0x003e:
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p285io.TextStreamsKt.m22820OooO00o(java.io.Reader, com.pd.sdk.O00O0OOO):void");
    }
}
