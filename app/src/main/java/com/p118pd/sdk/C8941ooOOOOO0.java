package com.p118pd.sdk;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.pd.sdk.ooOOOOO0  reason: case insensitive filesystem */
public final class C8941ooOOOOO0 implements Closeable {
    public static final OutputStream OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Pattern f22181OooO00o = Pattern.compile(oo0o0Oo);
    public static final long OooO0Oo = -1;
    public static final String o000000 = "REMOVE";
    public static final String o000000O = "READ";
    public static final String o000OOo = "DIRTY";
    public static final String o0O0O00 = "CLEAN";
    public static final String o0OO00O = "1";
    public static final String o0OOO0o = "journal.bkp";
    public static final String o0Oo0oo = "libcore.io.DiskLruCache";
    public static final String o0ooOOo = "journal";
    public static final String o0ooOoO = "journal.tmp";
    public static final String oo0o0Oo = "[a-zA-Z0-9_-]{1,120}";

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f22182OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final File f22183OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Writer f22184OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LinkedHashMap<String, C8942OooO0Oo> f22185OooO00o = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Callable<Void> f22186OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ThreadPoolExecutor f22187OooO00o = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public long OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final File f22188OooO0O0;
    public long OooO0OO = 0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public final File f22189OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public final File f22190OooO0Oo;
    public final int o00oO0O;
    public final int o0ooOO0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public int f22191o0ooOOo;

    /* renamed from: com.pd.sdk.ooOOOOO0$OooO00o */
    public class OooO00o implements Callable<Void> {
        public OooO00o() {
        }

        /* renamed from: OooO00o */
        public Void call() throws Exception {
            synchronized (C8941ooOOOOO0.this) {
                if (C8941ooOOOOO0.this.f22184OooO00o == null) {
                    return null;
                }
                C8941ooOOOOO0.this.OooO0o();
                if (C8941ooOOOOO0.this.OooO00o()) {
                    C8941ooOOOOO0.this.OooO0o0();
                    C8941ooOOOOO0.this.f22191o0ooOOo = 0;
                }
                return null;
            }
        }
    }

    /* renamed from: com.pd.sdk.ooOOOOO0$OooO0O0 */
    public static class OooO0O0 extends OutputStream {
        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }
    }

    /* renamed from: com.pd.sdk.ooOOOOO0$OooO0OO */
    public final class OooO0OO {
        public final C8942OooO0Oo OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f22193OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final boolean[] f22194OooO00o;
        public boolean OooO0O0;

        /* renamed from: com.pd.sdk.ooOOOOO0$OooO0OO$OooO00o */
        public class OooO00o extends FilterOutputStream {
            public /* synthetic */ OooO00o(OooO0OO oooO0OO, OutputStream outputStream, OooO00o oooO00o) {
                this(outputStream);
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    OooO0OO.this.f22193OooO00o = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    OooO0OO.this.f22193OooO00o = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    OooO0OO.this.f22193OooO00o = true;
                }
            }

            public OooO00o(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    OooO0OO.this.f22193OooO00o = true;
                }
            }
        }

        public /* synthetic */ OooO0OO(C8941ooOOOOO0 ooooooo0, C8942OooO0Oo oooO0Oo, OooO00o oooO00o) {
            this(oooO0Oo);
        }

        public void OooO0O0() {
            if (!this.OooO0O0) {
                try {
                    OooO00o();
                } catch (IOException unused) {
                }
            }
        }

        public void OooO0OO() throws IOException {
            if (this.f22193OooO00o) {
                C8941ooOOOOO0.this.OooO00o((C8941ooOOOOO0) this, (OooO0OO) false);
                C8941ooOOOOO0.this.m20603OooO00o(this.OooO00o.f22197OooO00o);
            } else {
                C8941ooOOOOO0.this.OooO00o((C8941ooOOOOO0) this, (OooO0OO) true);
            }
            this.OooO0O0 = true;
        }

        public OooO0OO(C8942OooO0Oo oooO0Oo) {
            this.OooO00o = oooO0Oo;
            this.f22194OooO00o = oooO0Oo.f22198OooO00o ? null : new boolean[C8941ooOOOOO0.this.o0ooOO0];
        }

        public InputStream OooO00o(int i) throws IOException {
            synchronized (C8941ooOOOOO0.this) {
                if (this.OooO00o.f22195OooO00o != this) {
                    throw new IllegalStateException();
                } else if (!this.OooO00o.f22198OooO00o) {
                    return null;
                } else {
                    try {
                        return new FileInputStream(this.OooO00o.OooO00o(i));
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m20607OooO00o(int i) throws IOException {
            InputStream OooO00o2 = OooO00o(i);
            if (OooO00o2 != null) {
                return C8941ooOOOOO0.OooO0O0(OooO00o2);
            }
            return null;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public OutputStream m20606OooO00o(int i) throws IOException {
            FileOutputStream fileOutputStream;
            OooO00o oooO00o;
            if (i < 0 || i >= C8941ooOOOOO0.this.o0ooOO0) {
                throw new IllegalArgumentException("Expected index " + i + " to " + "be greater than 0 and less than the maximum value count " + "of " + C8941ooOOOOO0.this.o0ooOO0);
            }
            synchronized (C8941ooOOOOO0.this) {
                if (this.OooO00o.f22195OooO00o == this) {
                    if (!this.OooO00o.f22198OooO00o) {
                        this.f22194OooO00o[i] = true;
                    }
                    File OooO0O02 = this.OooO00o.OooO0O0(i);
                    try {
                        fileOutputStream = new FileOutputStream(OooO0O02);
                    } catch (FileNotFoundException unused) {
                        C8941ooOOOOO0.this.f22183OooO00o.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(OooO0O02);
                        } catch (FileNotFoundException unused2) {
                            return C8941ooOOOOO0.OooO00o;
                        }
                    }
                    oooO00o = new OooO00o(this, fileOutputStream, null);
                } else {
                    throw new IllegalStateException();
                }
            }
            return oooO00o;
        }

        public void OooO00o(int i, String str) throws IOException {
            Throwable th;
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(m20606OooO00o(i), C8951ooOOOo0.OooO0O0);
                try {
                    outputStreamWriter2.write(str);
                    C8951ooOOOo0.OooO00o(outputStreamWriter2);
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = outputStreamWriter2;
                    C8951ooOOOo0.OooO00o(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                C8951ooOOOo0.OooO00o(outputStreamWriter);
                throw th;
            }
        }

        public void OooO00o() throws IOException {
            C8941ooOOOOO0.this.OooO00o((C8941ooOOOOO0) this, (OooO0OO) false);
        }
    }

    /* renamed from: com.pd.sdk.ooOOOOO0$OooO0Oo  reason: case insensitive filesystem */
    public final class C8942OooO0Oo {
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooO0OO f22195OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f22197OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f22198OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final long[] f22199OooO00o;

        public /* synthetic */ C8942OooO0Oo(C8941ooOOOOO0 ooooooo0, String str, OooO00o oooO00o) {
            this(str);
        }

        public File OooO0O0(int i) {
            File file = C8941ooOOOOO0.this.f22183OooO00o;
            return new File(file, this.f22197OooO00o + C9058ooOoOoOO.OooOO0 + i + ".tmp");
        }

        public C8942OooO0Oo(String str) {
            this.f22197OooO00o = str;
            this.f22199OooO00o = new long[C8941ooOOOOO0.this.o0ooOO0];
        }

        public String OooO00o() throws IOException {
            StringBuilder sb = new StringBuilder();
            long[] jArr = this.f22199OooO00o;
            for (long j : jArr) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: OooO00o  reason: collision with other method in class */
        private void m20608OooO00o(String[] strArr) throws IOException {
            if (strArr.length == C8941ooOOOOO0.this.o0ooOO0) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f22199OooO00o[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw OooO00o(strArr);
                    }
                }
                return;
            }
            throw OooO00o(strArr);
        }

        private IOException OooO00o(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File OooO00o(int i) {
            File file = C8941ooOOOOO0.this.f22183OooO00o;
            return new File(file, this.f22197OooO00o + C9058ooOoOoOO.OooOO0 + i);
        }
    }

    /* renamed from: com.pd.sdk.ooOOOOO0$OooO0o0  reason: case insensitive filesystem */
    public final class C8943OooO0o0 implements Closeable {
        public final long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final long[] f22201OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final InputStream[] f22202OooO00o;
        public final String o0ooOOo;

        public /* synthetic */ C8943OooO0o0(C8941ooOOOOO0 ooooooo0, String str, long j, InputStream[] inputStreamArr, long[] jArr, OooO00o oooO00o) {
            this(str, j, inputStreamArr, jArr);
        }

        public OooO0OO OooO00o() throws IOException {
            return C8941ooOOOOO0.this.OooO00o((C8941ooOOOOO0) this.o0ooOOo, (String) this.OooO00o);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f22202OooO00o) {
                C8951ooOOOo0.OooO00o(inputStream);
            }
        }

        public String getString(int i) throws IOException {
            return C8941ooOOOOO0.OooO0O0(m20609OooO00o(i));
        }

        public C8943OooO0o0(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.o0ooOOo = str;
            this.OooO00o = j;
            this.f22202OooO00o = inputStreamArr;
            this.f22201OooO00o = jArr;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public InputStream m20609OooO00o(int i) {
            return this.f22202OooO00o[i];
        }

        public long OooO00o(int i) {
            return this.f22201OooO00o[i];
        }
    }

    public C8941ooOOOOO0(File file, int i, int i2, long j) {
        this.f22183OooO00o = file;
        this.o00oO0O = i;
        this.f22188OooO0O0 = new File(file, "journal");
        this.f22189OooO0OO = new File(file, "journal.tmp");
        this.f22190OooO0Oo = new File(file, "journal.bkp");
        this.o0ooOO0 = i2;
        this.f22182OooO00o = j;
    }

    private void OooO0OO() throws IOException {
        OooO00o(this.f22189OooO0OO);
        Iterator<C8942OooO0Oo> it = this.f22185OooO00o.values().iterator();
        while (it.hasNext()) {
            C8942OooO0Oo next = it.next();
            int i = 0;
            if (next.f22195OooO00o == null) {
                while (i < this.o0ooOO0) {
                    this.OooO0O0 += next.f22199OooO00o[i];
                    i++;
                }
            } else {
                next.f22195OooO00o = null;
                while (i < this.o0ooOO0) {
                    OooO00o(next.OooO00o(i));
                    OooO00o(next.OooO0O0(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    private void OooO0Oo() throws IOException {
        C8946ooOOOOo ooooooo = new C8946ooOOOOo(new FileInputStream(this.f22188OooO0O0), C8951ooOOOo0.OooO00o);
        try {
            String OooO00o2 = ooooooo.m20619OooO00o();
            String OooO00o3 = ooooooo.m20619OooO00o();
            String OooO00o4 = ooooooo.m20619OooO00o();
            String OooO00o5 = ooooooo.m20619OooO00o();
            String OooO00o6 = ooooooo.m20619OooO00o();
            if (!"libcore.io.DiskLruCache".equals(OooO00o2) || !"1".equals(OooO00o3) || !Integer.toString(this.o00oO0O).equals(OooO00o4) || !Integer.toString(this.o0ooOO0).equals(OooO00o5) || !"".equals(OooO00o6)) {
                throw new IOException("unexpected journal header: [" + OooO00o2 + ", " + OooO00o3 + ", " + OooO00o5 + ", " + OooO00o6 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    OooO00o(ooooooo.m20619OooO00o());
                    i++;
                } catch (EOFException unused) {
                    this.f22191o0ooOOo = i - this.f22185OooO00o.size();
                    if (ooooooo.m20620OooO00o()) {
                        OooO0o0();
                    } else {
                        this.f22184OooO00o = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f22188OooO0O0, true), C8951ooOOOo0.OooO00o));
                    }
                    return;
                }
            }
        } finally {
            C8951ooOOOo0.OooO00o(ooooooo);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO0o() throws IOException {
        while (this.OooO0O0 > this.f22182OooO00o) {
            m20603OooO00o(this.f22185OooO00o.entrySet().iterator().next().getKey());
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void OooO0o0() throws IOException {
        if (this.f22184OooO00o != null) {
            this.f22184OooO00o.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f22189OooO0OO), C8951ooOOOo0.OooO00o));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.o00oO0O));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.o0ooOO0));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C8942OooO0Oo oooO0Oo : this.f22185OooO00o.values()) {
                if (oooO0Oo.f22195OooO00o != null) {
                    bufferedWriter.write("DIRTY " + oooO0Oo.f22197OooO00o + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + oooO0Oo.f22197OooO00o + oooO0Oo.OooO00o() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.f22188OooO0O0.exists()) {
                OooO00o(this.f22188OooO0O0, this.f22190OooO0Oo, true);
            }
            OooO00o(this.f22189OooO0OO, this.f22188OooO0O0, false);
            this.f22190OooO0Oo.delete();
            this.f22184OooO00o = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f22188OooO0O0, true), C8951ooOOOo0.OooO00o));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f22184OooO00o != null) {
            Iterator it = new ArrayList(this.f22185OooO00o.values()).iterator();
            while (it.hasNext()) {
                C8942OooO0Oo oooO0Oo = (C8942OooO0Oo) it.next();
                if (oooO0Oo.f22195OooO00o != null) {
                    oooO0Oo.f22195OooO00o.OooO00o();
                }
            }
            OooO0o();
            this.f22184OooO00o.close();
            this.f22184OooO00o = null;
        }
    }

    public synchronized void flush() throws IOException {
        OooO0O0();
        OooO0o();
        this.f22184OooO00o.flush();
    }

    public synchronized boolean isClosed() {
        return this.f22184OooO00o == null;
    }

    private void OooO0O0() {
        if (this.f22184OooO00o == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private void OooO0O0(String str) {
        if (!f22181OooO00o.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-zA-Z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    public static String OooO0O0(InputStream inputStream) throws IOException {
        return C8951ooOOOo0.OooO00o((Reader) new InputStreamReader(inputStream, C8951ooOOOo0.OooO0O0));
    }

    public static C8941ooOOOOO0 OooO00o(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    OooO00o(file2, file3, false);
                }
            }
            C8941ooOOOOO0 ooooooo0 = new C8941ooOOOOO0(file, i, i2, j);
            if (ooooooo0.f22188OooO0O0.exists()) {
                try {
                    ooooooo0.OooO0Oo();
                    ooooooo0.OooO0OO();
                    return ooooooo0;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    ooooooo0.m20602OooO00o();
                }
            }
            file.mkdirs();
            C8941ooOOOOO0 ooooooo02 = new C8941ooOOOOO0(file, i, i2, j);
            ooooooo02.OooO0o0();
            return ooooooo02;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    public synchronized void OooO0OO(long j) {
        this.f22182OooO00o = j;
        this.f22187OooO00o.submit(this.f22186OooO00o);
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public synchronized long m20604OooO0Oo() {
        return this.f22182OooO00o;
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public synchronized long m20605OooO0o0() {
        return this.OooO0O0;
    }

    private void OooO00o(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f22185OooO00o.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C8942OooO0Oo oooO0Oo = this.f22185OooO00o.get(str2);
            if (oooO0Oo == null) {
                oooO0Oo = new C8942OooO0Oo(this, str2, null);
                this.f22185OooO00o.put(str2, oooO0Oo);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                oooO0Oo.f22198OooO00o = true;
                oooO0Oo.f22195OooO00o = null;
                oooO0Oo.m20608OooO00o((C8942OooO0Oo) split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                oooO0Oo.f22195OooO00o = new OooO0OO(this, oooO0Oo, null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    public static void OooO00o(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void OooO00o(File file, File file2, boolean z) throws IOException {
        if (z) {
            OooO00o(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized C8943OooO0o0 m20600OooO00o(String str) throws IOException {
        OooO0O0();
        OooO0O0(str);
        C8942OooO0Oo oooO0Oo = this.f22185OooO00o.get(str);
        if (oooO0Oo == null) {
            return null;
        }
        if (!oooO0Oo.f22198OooO00o) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.o0ooOO0];
        int i = 0;
        for (int i2 = 0; i2 < this.o0ooOO0; i2++) {
            try {
                inputStreamArr[i2] = new FileInputStream(oooO0Oo.OooO00o(i2));
            } catch (FileNotFoundException unused) {
                while (i < this.o0ooOO0 && inputStreamArr[i] != null) {
                    C8951ooOOOo0.OooO00o(inputStreamArr[i]);
                    i++;
                }
                return null;
            }
        }
        this.f22191o0ooOOo++;
        this.f22184OooO00o.append((CharSequence) ("READ " + str + '\n'));
        if (OooO00o()) {
            this.f22187OooO00o.submit(this.f22186OooO00o);
        }
        return new C8943OooO0o0(this, str, oooO0Oo.OooO00o, inputStreamArr, oooO0Oo.f22199OooO00o, null);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public OooO0OO m20599OooO00o(String str) throws IOException {
        return OooO00o(str, -1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized OooO0OO OooO00o(String str, long j) throws IOException {
        OooO0O0();
        OooO0O0(str);
        C8942OooO0Oo oooO0Oo = this.f22185OooO00o.get(str);
        if (j != -1 && (oooO0Oo == null || oooO0Oo.OooO00o != j)) {
            return null;
        }
        if (oooO0Oo == null) {
            oooO0Oo = new C8942OooO0Oo(this, str, null);
            this.f22185OooO00o.put(str, oooO0Oo);
        } else if (oooO0Oo.f22195OooO00o != null) {
            return null;
        }
        OooO0OO oooO0OO = new OooO0OO(this, oooO0Oo, null);
        oooO0Oo.f22195OooO00o = oooO0OO;
        Writer writer = this.f22184OooO00o;
        writer.write("DIRTY " + str + '\n');
        this.f22184OooO00o.flush();
        return oooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public File m20601OooO00o() {
        return this.f22183OooO00o;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void OooO00o(OooO0OO oooO0OO, boolean z) throws IOException {
        C8942OooO0Oo oooO0Oo = oooO0OO.OooO00o;
        if (oooO0Oo.f22195OooO00o == oooO0OO) {
            if (z && !oooO0Oo.f22198OooO00o) {
                for (int i = 0; i < this.o0ooOO0; i++) {
                    if (!oooO0OO.f22194OooO00o[i]) {
                        oooO0OO.OooO00o();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    } else if (!oooO0Oo.OooO0O0(i).exists()) {
                        oooO0OO.OooO00o();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.o0ooOO0; i2++) {
                File OooO0O02 = oooO0Oo.OooO0O0(i2);
                if (!z) {
                    OooO00o(OooO0O02);
                } else if (OooO0O02.exists()) {
                    File OooO00o2 = oooO0Oo.OooO00o(i2);
                    OooO0O02.renameTo(OooO00o2);
                    long j = oooO0Oo.f22199OooO00o[i2];
                    long length = OooO00o2.length();
                    oooO0Oo.f22199OooO00o[i2] = length;
                    this.OooO0O0 = (this.OooO0O0 - j) + length;
                }
            }
            this.f22191o0ooOOo++;
            oooO0Oo.f22195OooO00o = null;
            if (oooO0Oo.f22198OooO00o || z) {
                oooO0Oo.f22198OooO00o = true;
                this.f22184OooO00o.write("CLEAN " + oooO0Oo.f22197OooO00o + oooO0Oo.OooO00o() + '\n');
                if (z) {
                    long j2 = this.OooO0OO;
                    this.OooO0OO = 1 + j2;
                    oooO0Oo.OooO00o = j2;
                }
            } else {
                this.f22185OooO00o.remove(oooO0Oo.f22197OooO00o);
                this.f22184OooO00o.write("REMOVE " + oooO0Oo.f22197OooO00o + '\n');
            }
            this.f22184OooO00o.flush();
            if (this.OooO0O0 > this.f22182OooO00o || OooO00o()) {
                this.f22187OooO00o.submit(this.f22186OooO00o);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean OooO00o() {
        int i = this.f22191o0ooOOo;
        return i >= 2000 && i >= this.f22185OooO00o.size();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized boolean m20603OooO00o(String str) throws IOException {
        OooO0O0();
        OooO0O0(str);
        C8942OooO0Oo oooO0Oo = this.f22185OooO00o.get(str);
        if (oooO0Oo != null) {
            if (oooO0Oo.f22195OooO00o == null) {
                for (int i = 0; i < this.o0ooOO0; i++) {
                    File OooO00o2 = oooO0Oo.OooO00o(i);
                    if (OooO00o2.exists()) {
                        if (!OooO00o2.delete()) {
                            throw new IOException("failed to delete " + OooO00o2);
                        }
                    }
                    this.OooO0O0 -= oooO0Oo.f22199OooO00o[i];
                    oooO0Oo.f22199OooO00o[i] = 0;
                }
                this.f22191o0ooOOo++;
                this.f22184OooO00o.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f22185OooO00o.remove(str);
                if (OooO00o()) {
                    this.f22187OooO00o.submit(this.f22186OooO00o);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20602OooO00o() throws IOException {
        close();
        C8951ooOOOo0.OooO00o(this.f22183OooO00o);
    }
}
