package com.umeng.socialize.net.dplus.cache;

import android.text.TextUtils;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class CacheExector {

    /* renamed from: a */
    public static final String f10828a = "CacheExector";

    /* renamed from: b */
    public final int f10829b = 32;

    /* renamed from: c */
    public final int f10830c = 5120;

    /* renamed from: d */
    public final int f10831d = 8;

    /* renamed from: e */
    public String f10832e = null;

    public CacheExector(String str) {
        this.f10832e = str;
    }

    /* renamed from: a */
    private File m10831a() {
        if (TextUtils.isEmpty(this.f10832e)) {
            return null;
        }
        File file = new File(this.f10832e);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        String str = "Couldn't create directory" + this.f10832e;
        return null;
    }

    /* renamed from: b */
    private File m10836b(File file, String str) {
        if (file == null || !file.isDirectory()) {
            return null;
        }
        String[] list = file.list();
        if (list == null || list.length <= 0) {
            return m10832a(file, str);
        }
        File c = m10838c(file, str);
        if (c == null) {
            return m10832a(file, str);
        }
        return c;
    }

    /* renamed from: c */
    private File m10838c(File file, String str) {
        File[] a = m10835a(file);
        if (a == null || a.length <= 0 || a.length <= 0) {
            return null;
        }
        File file2 = a[0];
        if (m10829a(file2.length()) > 32.0d) {
            return null;
        }
        return file2;
    }

    /* renamed from: d */
    private File m10839d(File file, String str) {
        String[] list;
        if (file == null || !file.isDirectory() || (list = file.list()) == null || list.length <= 0) {
            return null;
        }
        return m10840e(file, str);
    }

    /* renamed from: e */
    private File m10840e(File file, String str) {
        File[] a = m10835a(file);
        if (a != null && a.length > 0) {
            for (File file2 : a) {
                if (m10829a(file2.length()) <= ((double) 40) && file2.getName().endsWith(str)) {
                    return file2;
                }
                String str2 = "getReadableFileFromFiles:file length don't legal" + file2.length();
                deleteFile(file2.getName());
            }
        }
        return null;
    }

    public double checkSize(String str) {
        File a = m10831a();
        double d = AbstractC8352oOoOOoO0.OooO0O0;
        if (a != null && a.isDirectory()) {
            File[] listFiles = a.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i] != null && listFiles[i].getName().contains(str)) {
                    d += m10829a(listFiles[i].length());
                }
            }
        }
        return d;
    }

    public boolean deleteFile(String str) {
        File[] listFiles = m10831a().listFiles();
        boolean z = false;
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i] != null && listFiles[i].getName().contains(str)) {
                z = listFiles[i].delete();
            }
        }
        return z;
    }

    public <T extends IReader> T readFile(String str, Class<T> cls) {
        FileInputStream fileInputStream;
        Throwable th;
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        IOException e;
        int i;
        File d = m10839d(m10831a(), str);
        Closeable closeable = null;
        if (d == null) {
            return null;
        }
        try {
            fileInputStream = new AtomicFile(d).openRead();
        } catch (IOException e2) {
            SLog.error(UmengText.CACHE.CACHEFILE, e2);
            deleteFile(d.getName());
            fileInputStream = null;
        }
        if (fileInputStream == null) {
            return null;
        }
        try {
            T t = (T) m10830a(d.getName(), cls);
            inputStreamReader = new InputStreamReader(fileInputStream);
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
                i = 0;
            } catch (IOException e3) {
                e = e3;
                bufferedReader = null;
                try {
                    SLog.error(UmengText.CACHE.CACHEFILE, e);
                    m10834a(fileInputStream);
                    m10834a(inputStreamReader);
                    m10834a(bufferedReader);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    closeable = inputStreamReader;
                    m10834a(fileInputStream);
                    m10834a(closeable);
                    m10834a(bufferedReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                closeable = inputStreamReader;
                m10834a(fileInputStream);
                m10834a(closeable);
                m10834a(bufferedReader);
                throw th;
            }
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    i++;
                    String str2 = "read file:" + i + readLine;
                    if (!TextUtils.isEmpty(readLine)) {
                        try {
                            sb.append(readLine);
                        } catch (Exception e4) {
                            SLog.error(UmengText.CACHE.CACHEFILE, e4);
                        }
                    }
                }
                if (t != null) {
                    t.create(sb.toString());
                }
                m10834a(fileInputStream);
                m10834a(inputStreamReader);
                m10834a(bufferedReader);
                return t;
            } catch (IOException e5) {
                e = e5;
                SLog.error(UmengText.CACHE.CACHEFILE, e);
                m10834a(fileInputStream);
                m10834a(inputStreamReader);
                m10834a(bufferedReader);
                return null;
            }
        } catch (IOException e6) {
            e = e6;
            inputStreamReader = null;
            bufferedReader = null;
            SLog.error(UmengText.CACHE.CACHEFILE, e);
            m10834a(fileInputStream);
            m10834a(inputStreamReader);
            m10834a(bufferedReader);
            return null;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            m10834a(fileInputStream);
            m10834a(closeable);
            m10834a(bufferedReader);
            throw th;
        }
    }

    public boolean save(String str, String str2) {
        FileOutputStream fileOutputStream;
        Throwable th;
        OutputStreamWriter outputStreamWriter;
        IOException e;
        BufferedWriter bufferedWriter;
        File b = m10836b(m10831a(), str2);
        boolean z = false;
        if (b == null) {
            return false;
        }
        AtomicFile atomicFile = new AtomicFile(b);
        Closeable closeable = null;
        try {
            fileOutputStream = atomicFile.startWrite(true);
        } catch (IOException e2) {
            SLog.error(UmengText.CACHE.CACHEFILE, e2);
            deleteFile(b.getName());
            fileOutputStream = null;
        }
        if (fileOutputStream == null) {
            return false;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                try {
                    bufferedWriter = new BufferedWriter(outputStreamWriter);
                } catch (IOException e3) {
                    e = e3;
                    try {
                        atomicFile.failWrite(fileOutputStream);
                        SLog.error(UmengText.CACHE.CACHEFILE, e);
                        m10834a(closeable);
                        m10834a(outputStreamWriter);
                        m10834a(fileOutputStream);
                        return z;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                try {
                    bufferedWriter.write(str);
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                    atomicFile.finishWrite(fileOutputStream);
                    closeable = bufferedWriter;
                    z = true;
                } catch (IOException e4) {
                    e = e4;
                    closeable = bufferedWriter;
                    atomicFile.failWrite(fileOutputStream);
                    SLog.error(UmengText.CACHE.CACHEFILE, e);
                    m10834a(closeable);
                    m10834a(outputStreamWriter);
                    m10834a(fileOutputStream);
                    return z;
                } catch (Throwable th3) {
                    th = th3;
                    closeable = bufferedWriter;
                    m10834a(closeable);
                    m10834a(outputStreamWriter);
                    m10834a(fileOutputStream);
                    throw th;
                }
            } else {
                outputStreamWriter = null;
            }
        } catch (IOException e5) {
            e = e5;
            outputStreamWriter = null;
            atomicFile.failWrite(fileOutputStream);
            SLog.error(UmengText.CACHE.CACHEFILE, e);
            m10834a(closeable);
            m10834a(outputStreamWriter);
            m10834a(fileOutputStream);
            return z;
        } catch (Throwable th4) {
            th = th4;
            outputStreamWriter = null;
            m10834a(closeable);
            m10834a(outputStreamWriter);
            m10834a(fileOutputStream);
            throw th;
        }
        m10834a(closeable);
        m10834a(outputStreamWriter);
        m10834a(fileOutputStream);
        return z;
    }

    /* renamed from: a */
    private File m10832a(File file, String str) {
        if (file == null || !file.isDirectory()) {
            return null;
        }
        return new File(file, m10833a(str));
    }

    /* renamed from: b */
    private Comparator<File> m10837b() {
        return new Comparator<File>() {
            /* class com.umeng.socialize.net.dplus.cache.CacheExector.C39791 */

            public int compare(File file, File file2) {
                return Long.valueOf(file.length()).compareTo(Long.valueOf(file2.length()));
            }
        };
    }

    /* renamed from: a */
    private String m10833a(String str) {
        return String.valueOf(System.currentTimeMillis()) + str;
    }

    /* renamed from: a */
    private File[] m10835a(File file) {
        if (file == null || !file.isDirectory()) {
            return null;
        }
        File[] listFiles = file.listFiles();
        Arrays.sort(listFiles, m10837b());
        return listFiles;
    }

    /* renamed from: a */
    private double m10829a(long j) {
        if (j <= 0) {
            return AbstractC8352oOoOOoO0.OooO0O0;
        }
        double d = (double) j;
        Double.isNaN(d);
        return d / 1024.0d;
    }

    /* renamed from: a */
    private void m10834a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                SLog.error(UmengText.CACHE.CACHEFILE, e);
            }
        }
    }

    /* renamed from: a */
    private <T extends IReader> T m10830a(String str, Class<T> cls) {
        try {
            return cls.getConstructor(String.class).newInstance(str);
        } catch (Throwable th) {
            SLog.error(UmengText.CACHE.CACHEFILE, th);
            return null;
        }
    }
}
