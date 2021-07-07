package com.p118pd.sdk;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.o0oOOooO  reason: case insensitive filesystem */
public final class C7626o0oOOooO implements Closeable {
    public static final long OooO0Oo = -1;
    public static final String o000000 = "READ";
    public static final String o000OOo = "REMOVE";
    public static final String o0O0O00 = "DIRTY";
    public static final String o0OO00O = "1";
    public static final String o0OOO0o = "journal.bkp";
    public static final String o0Oo0oo = "libcore.io.DiskLruCache";
    public static final String o0ooOOo = "journal";
    public static final String o0ooOoO = "journal.tmp";
    public static final String oo0o0Oo = "CLEAN";
    public long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final File f20469OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Writer f20470OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LinkedHashMap<String, C7627OooO0Oo> f20471OooO00o = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Callable<Void> f20472OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ThreadPoolExecutor f20473OooO00o = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new OooO0O0(null));
    public long OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final File f20474OooO0O0;
    public long OooO0OO = 0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public final File f20475OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public final File f20476OooO0Oo;
    public final int o00oO0O;
    public final int o0ooOO0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public int f20477o0ooOOo;

    /* renamed from: com.pd.sdk.o0oOOooO$OooO00o */
    public class OooO00o implements Callable<Void> {
        public OooO00o() {
        }

        /* renamed from: OooO00o */
        public Void call() throws Exception {
            synchronized (C7626o0oOOooO.this) {
                if (C7626o0oOOooO.this.f20470OooO00o == null) {
                    return null;
                }
                C7626o0oOOooO.this.OooO0o();
                if (C7626o0oOOooO.this.OooO00o()) {
                    C7626o0oOOooO.this.OooO0o0();
                    C7626o0oOOooO.this.f20477o0ooOOo = 0;
                }
                return null;
            }
        }
    }

    /* renamed from: com.pd.sdk.o0oOOooO$OooO0O0 */
    public static final class OooO0O0 implements ThreadFactory {
        public OooO0O0() {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ OooO0O0(OooO00o oooO00o) {
            this();
        }
    }

    /* renamed from: com.pd.sdk.o0oOOooO$OooO0OO */
    public final class OooO0OO {
        public final C7627OooO0Oo OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f20479OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final boolean[] f20480OooO00o;

        public /* synthetic */ OooO0OO(C7626o0oOOooO o0oooooo, C7627OooO0Oo oooO0Oo, OooO00o oooO00o) {
            this(oooO0Oo);
        }

        public void OooO0O0() {
            if (!this.f20479OooO00o) {
                try {
                    OooO00o();
                } catch (IOException unused) {
                }
            }
        }

        public void OooO0OO() throws IOException {
            C7626o0oOOooO.this.OooO00o((C7626o0oOOooO) this, (OooO0OO) true);
            this.f20479OooO00o = true;
        }

        public OooO0OO(C7627OooO0Oo oooO0Oo) {
            this.OooO00o = oooO0Oo;
            this.f20480OooO00o = oooO0Oo.f20484OooO00o ? null : new boolean[C7626o0oOOooO.this.o0ooOO0];
        }

        private InputStream OooO00o(int i) throws IOException {
            synchronized (C7626o0oOOooO.this) {
                if (this.OooO00o.f20481OooO00o != this) {
                    throw new IllegalStateException();
                } else if (!this.OooO00o.f20484OooO00o) {
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
        public String m19267OooO00o(int i) throws IOException {
            InputStream OooO00o2 = OooO00o(i);
            if (OooO00o2 != null) {
                return C7626o0oOOooO.OooO0O0(OooO00o2);
            }
            return null;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public File m19266OooO00o(int i) throws IOException {
            File OooO0O0;
            synchronized (C7626o0oOOooO.this) {
                if (this.OooO00o.f20481OooO00o == this) {
                    if (!this.OooO00o.f20484OooO00o) {
                        this.f20480OooO00o[i] = true;
                    }
                    OooO0O0 = this.OooO00o.OooO0O0(i);
                    if (!C7626o0oOOooO.this.f20469OooO00o.exists()) {
                        C7626o0oOOooO.this.f20469OooO00o.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return OooO0O0;
        }

        public void OooO00o(int i, String str) throws IOException {
            Throwable th;
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(m19266OooO00o(i)), C7632o0oOo00.OooO0O0);
                try {
                    outputStreamWriter2.write(str);
                    C7632o0oOo00.OooO00o(outputStreamWriter2);
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = outputStreamWriter2;
                    C7632o0oOo00.OooO00o(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                C7632o0oOo00.OooO00o(outputStreamWriter);
                throw th;
            }
        }

        public void OooO00o() throws IOException {
            C7626o0oOOooO.this.OooO00o((C7626o0oOOooO) this, (OooO0OO) false);
        }
    }

    /* renamed from: com.pd.sdk.o0oOOooO$OooO0Oo  reason: case insensitive filesystem */
    public final class C7627OooO0Oo {
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooO0OO f20481OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f20483OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f20484OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final long[] f20485OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public File[] f20486OooO00o;
        public File[] OooO0O0;

        public /* synthetic */ C7627OooO0Oo(C7626o0oOOooO o0oooooo, String str, OooO00o oooO00o) {
            this(str);
        }

        public File OooO0O0(int i) {
            return this.OooO0O0[i];
        }

        public C7627OooO0Oo(String str) {
            this.f20483OooO00o = str;
            this.f20485OooO00o = new long[C7626o0oOOooO.this.o0ooOO0];
            this.f20486OooO00o = new File[C7626o0oOOooO.this.o0ooOO0];
            this.OooO0O0 = new File[C7626o0oOOooO.this.o0ooOO0];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C7626o0oOOooO.this.o0ooOO0; i++) {
                sb.append(i);
                this.f20486OooO00o[i] = new File(C7626o0oOOooO.this.f20469OooO00o, sb.toString());
                sb.append(".tmp");
                this.OooO0O0[i] = new File(C7626o0oOOooO.this.f20469OooO00o, sb.toString());
                sb.setLength(length);
            }
        }

        public String OooO00o() throws IOException {
            StringBuilder sb = new StringBuilder();
            long[] jArr = this.f20485OooO00o;
            for (long j : jArr) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: OooO00o  reason: collision with other method in class */
        private void m19268OooO00o(String[] strArr) throws IOException {
            if (strArr.length == C7626o0oOOooO.this.o0ooOO0) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f20485OooO00o[i] = Long.parseLong(strArr[i]);
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
            return this.f20486OooO00o[i];
        }
    }

    /* renamed from: com.pd.sdk.o0oOOooO$OooO0o0  reason: case insensitive filesystem */
    public final class C7628OooO0o0 {
        public final long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f20488OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final long[] f20489OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final File[] f20490OooO00o;

        public /* synthetic */ C7628OooO0o0(C7626o0oOOooO o0oooooo, String str, long j, File[] fileArr, long[] jArr, OooO00o oooO00o) {
            this(str, j, fileArr, jArr);
        }

        public OooO0OO OooO00o() throws IOException {
            return C7626o0oOOooO.this.OooO00o((C7626o0oOOooO) this.f20488OooO00o, (String) this.OooO00o);
        }

        public C7628OooO0o0(String str, long j, File[] fileArr, long[] jArr) {
            this.f20488OooO00o = str;
            this.OooO00o = j;
            this.f20490OooO00o = fileArr;
            this.f20489OooO00o = jArr;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public File m19269OooO00o(int i) {
            return this.f20490OooO00o[i];
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m19270OooO00o(int i) throws IOException {
            return C7626o0oOOooO.OooO0O0(new FileInputStream(this.f20490OooO00o[i]));
        }

        public long OooO00o(int i) {
            return this.f20489OooO00o[i];
        }
    }

    public C7626o0oOOooO(File file, int i, int i2, long j) {
        this.f20469OooO00o = file;
        this.o00oO0O = i;
        this.f20474OooO0O0 = new File(file, "journal");
        this.f20475OooO0OO = new File(file, "journal.tmp");
        this.f20476OooO0Oo = new File(file, "journal.bkp");
        this.o0ooOO0 = i2;
        this.OooO00o = j;
    }

    private void OooO0OO() throws IOException {
        OooO00o(this.f20475OooO0OO);
        Iterator<C7627OooO0Oo> it = this.f20471OooO00o.values().iterator();
        while (it.hasNext()) {
            C7627OooO0Oo next = it.next();
            int i = 0;
            if (next.f20481OooO00o == null) {
                while (i < this.o0ooOO0) {
                    this.OooO0O0 += next.f20485OooO00o[i];
                    i++;
                }
            } else {
                next.f20481OooO00o = null;
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
        C7629o0oOOooo o0oooooo = new C7629o0oOOooo(new FileInputStream(this.f20474OooO0O0), C7632o0oOo00.OooO00o);
        try {
            String OooO00o2 = o0oooooo.m19271OooO00o();
            String OooO00o3 = o0oooooo.m19271OooO00o();
            String OooO00o4 = o0oooooo.m19271OooO00o();
            String OooO00o5 = o0oooooo.m19271OooO00o();
            String OooO00o6 = o0oooooo.m19271OooO00o();
            if (!"libcore.io.DiskLruCache".equals(OooO00o2) || !"1".equals(OooO00o3) || !Integer.toString(this.o00oO0O).equals(OooO00o4) || !Integer.toString(this.o0ooOO0).equals(OooO00o5) || !"".equals(OooO00o6)) {
                throw new IOException("unexpected journal header: [" + OooO00o2 + ", " + OooO00o3 + ", " + OooO00o5 + ", " + OooO00o6 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    OooO00o(o0oooooo.m19271OooO00o());
                    i++;
                } catch (EOFException unused) {
                    this.f20477o0ooOOo = i - this.f20471OooO00o.size();
                    if (o0oooooo.m19272OooO00o()) {
                        OooO0o0();
                    } else {
                        this.f20470OooO00o = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f20474OooO0O0, true), C7632o0oOo00.OooO00o));
                    }
                    return;
                }
            }
        } finally {
            C7632o0oOo00.OooO00o(o0oooooo);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO0o() throws IOException {
        while (this.OooO0O0 > this.OooO00o) {
            m19263OooO00o(this.f20471OooO00o.entrySet().iterator().next().getKey());
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void OooO0o0() throws IOException {
        if (this.f20470OooO00o != null) {
            this.f20470OooO00o.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f20475OooO0OO), C7632o0oOo00.OooO00o));
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
            for (C7627OooO0Oo oooO0Oo : this.f20471OooO00o.values()) {
                if (oooO0Oo.f20481OooO00o != null) {
                    bufferedWriter.write("DIRTY " + oooO0Oo.f20483OooO00o + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + oooO0Oo.f20483OooO00o + oooO0Oo.OooO00o() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.f20474OooO0O0.exists()) {
                OooO00o(this.f20474OooO0O0, this.f20476OooO0Oo, true);
            }
            OooO00o(this.f20475OooO0OO, this.f20474OooO0O0, false);
            this.f20476OooO0Oo.delete();
            this.f20470OooO00o = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f20474OooO0O0, true), C7632o0oOo00.OooO00o));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f20470OooO00o != null) {
            Iterator it = new ArrayList(this.f20471OooO00o.values()).iterator();
            while (it.hasNext()) {
                C7627OooO0Oo oooO0Oo = (C7627OooO0Oo) it.next();
                if (oooO0Oo.f20481OooO00o != null) {
                    oooO0Oo.f20481OooO00o.OooO00o();
                }
            }
            OooO0o();
            this.f20470OooO00o.close();
            this.f20470OooO00o = null;
        }
    }

    public synchronized void flush() throws IOException {
        OooO0O0();
        OooO0o();
        this.f20470OooO00o.flush();
    }

    public synchronized boolean isClosed() {
        return this.f20470OooO00o == null;
    }

    private void OooO0O0() {
        if (this.f20470OooO00o == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static String OooO0O0(InputStream inputStream) throws IOException {
        return C7632o0oOo00.OooO00o((Reader) new InputStreamReader(inputStream, C7632o0oOo00.OooO0O0));
    }

    public static C7626o0oOOooO OooO00o(File file, int i, int i2, long j) throws IOException {
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
            C7626o0oOOooO o0oooooo = new C7626o0oOOooO(file, i, i2, j);
            if (o0oooooo.f20474OooO0O0.exists()) {
                try {
                    o0oooooo.OooO0Oo();
                    o0oooooo.OooO0OO();
                    return o0oooooo;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    o0oooooo.m19262OooO00o();
                }
            }
            file.mkdirs();
            C7626o0oOOooO o0oooooo2 = new C7626o0oOOooO(file, i, i2, j);
            o0oooooo2.OooO0o0();
            return o0oooooo2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    public synchronized void OooO0OO(long j) {
        this.OooO00o = j;
        this.f20473OooO00o.submit(this.f20472OooO00o);
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public synchronized long m19264OooO0Oo() {
        return this.OooO00o;
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public synchronized long m19265OooO0o0() {
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
                    this.f20471OooO00o.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C7627OooO0Oo oooO0Oo = this.f20471OooO00o.get(str2);
            if (oooO0Oo == null) {
                oooO0Oo = new C7627OooO0Oo(this, str2, null);
                this.f20471OooO00o.put(str2, oooO0Oo);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                oooO0Oo.f20484OooO00o = true;
                oooO0Oo.f20481OooO00o = null;
                oooO0Oo.m19268OooO00o((C7627OooO0Oo) split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                oooO0Oo.f20481OooO00o = new OooO0OO(this, oooO0Oo, null);
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
    public synchronized C7628OooO0o0 m19260OooO00o(String str) throws IOException {
        OooO0O0();
        C7627OooO0Oo oooO0Oo = this.f20471OooO00o.get(str);
        if (oooO0Oo == null) {
            return null;
        }
        if (!oooO0Oo.f20484OooO00o) {
            return null;
        }
        for (File file : oooO0Oo.f20486OooO00o) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f20477o0ooOOo++;
        this.f20470OooO00o.append((CharSequence) "READ");
        this.f20470OooO00o.append(' ');
        this.f20470OooO00o.append((CharSequence) str);
        this.f20470OooO00o.append('\n');
        if (OooO00o()) {
            this.f20473OooO00o.submit(this.f20472OooO00o);
        }
        return new C7628OooO0o0(this, str, oooO0Oo.OooO00o, oooO0Oo.f20486OooO00o, oooO0Oo.f20485OooO00o, null);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public OooO0OO m19259OooO00o(String str) throws IOException {
        return OooO00o(str, -1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized OooO0OO OooO00o(String str, long j) throws IOException {
        OooO0O0();
        C7627OooO0Oo oooO0Oo = this.f20471OooO00o.get(str);
        if (j != -1 && (oooO0Oo == null || oooO0Oo.OooO00o != j)) {
            return null;
        }
        if (oooO0Oo == null) {
            oooO0Oo = new C7627OooO0Oo(this, str, null);
            this.f20471OooO00o.put(str, oooO0Oo);
        } else if (oooO0Oo.f20481OooO00o != null) {
            return null;
        }
        OooO0OO oooO0OO = new OooO0OO(this, oooO0Oo, null);
        oooO0Oo.f20481OooO00o = oooO0OO;
        this.f20470OooO00o.append((CharSequence) "DIRTY");
        this.f20470OooO00o.append(' ');
        this.f20470OooO00o.append((CharSequence) str);
        this.f20470OooO00o.append('\n');
        this.f20470OooO00o.flush();
        return oooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public File m19261OooO00o() {
        return this.f20469OooO00o;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void OooO00o(OooO0OO oooO0OO, boolean z) throws IOException {
        C7627OooO0Oo oooO0Oo = oooO0OO.OooO00o;
        if (oooO0Oo.f20481OooO00o == oooO0OO) {
            if (z && !oooO0Oo.f20484OooO00o) {
                for (int i = 0; i < this.o0ooOO0; i++) {
                    if (!oooO0OO.f20480OooO00o[i]) {
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
                    long j = oooO0Oo.f20485OooO00o[i2];
                    long length = OooO00o2.length();
                    oooO0Oo.f20485OooO00o[i2] = length;
                    this.OooO0O0 = (this.OooO0O0 - j) + length;
                }
            }
            this.f20477o0ooOOo++;
            oooO0Oo.f20481OooO00o = null;
            if (oooO0Oo.f20484OooO00o || z) {
                oooO0Oo.f20484OooO00o = true;
                this.f20470OooO00o.append((CharSequence) "CLEAN");
                this.f20470OooO00o.append(' ');
                this.f20470OooO00o.append((CharSequence) oooO0Oo.f20483OooO00o);
                this.f20470OooO00o.append((CharSequence) oooO0Oo.OooO00o());
                this.f20470OooO00o.append('\n');
                if (z) {
                    long j2 = this.OooO0OO;
                    this.OooO0OO = 1 + j2;
                    oooO0Oo.OooO00o = j2;
                }
            } else {
                this.f20471OooO00o.remove(oooO0Oo.f20483OooO00o);
                this.f20470OooO00o.append((CharSequence) "REMOVE");
                this.f20470OooO00o.append(' ');
                this.f20470OooO00o.append((CharSequence) oooO0Oo.f20483OooO00o);
                this.f20470OooO00o.append('\n');
            }
            this.f20470OooO00o.flush();
            if (this.OooO0O0 > this.OooO00o || OooO00o()) {
                this.f20473OooO00o.submit(this.f20472OooO00o);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean OooO00o() {
        int i = this.f20477o0ooOOo;
        return i >= 2000 && i >= this.f20471OooO00o.size();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized boolean m19263OooO00o(String str) throws IOException {
        OooO0O0();
        C7627OooO0Oo oooO0Oo = this.f20471OooO00o.get(str);
        if (oooO0Oo != null) {
            if (oooO0Oo.f20481OooO00o == null) {
                for (int i = 0; i < this.o0ooOO0; i++) {
                    File OooO00o2 = oooO0Oo.OooO00o(i);
                    if (OooO00o2.exists()) {
                        if (!OooO00o2.delete()) {
                            throw new IOException("failed to delete " + OooO00o2);
                        }
                    }
                    this.OooO0O0 -= oooO0Oo.f20485OooO00o[i];
                    oooO0Oo.f20485OooO00o[i] = 0;
                }
                this.f20477o0ooOOo++;
                this.f20470OooO00o.append((CharSequence) "REMOVE");
                this.f20470OooO00o.append(' ');
                this.f20470OooO00o.append((CharSequence) str);
                this.f20470OooO00o.append('\n');
                this.f20471OooO00o.remove(str);
                if (OooO00o()) {
                    this.f20473OooO00o.submit(this.f20472OooO00o);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19262OooO00o() throws IOException {
        close();
        C7632o0oOo00.OooO00o(this.f20469OooO00o);
    }
}
