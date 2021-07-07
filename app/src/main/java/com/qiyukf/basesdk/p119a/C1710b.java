package com.qiyukf.basesdk.p119a;

import android.text.TextUtils;
import android.util.Log;
import com.p118pd.sdk.C8788oo0ooooO;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.qiyukf.basesdk.a.b */
public final class C1710b {

    /* renamed from: a */
    public static final SimpleDateFormat f3083a = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());

    /* renamed from: b */
    public static final SimpleDateFormat f3084b = new SimpleDateFormat(C8788oo0ooooO.f21994OooO00o, Locale.getDefault());

    /* renamed from: c */
    public static final Set<String> f3085c;

    static {
        HashSet hashSet = new HashSet();
        f3085c = hashSet;
        hashSet.add("tmp_u_");
        f3085c.add("tmp_c_");
    }

    /* renamed from: a */
    public static long m3021a(File file) {
        Throwable th;
        IOException e;
        long length = file.length();
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            long j = length - 1;
            long j2 = 0;
            while (j2 <= j) {
                try {
                    long j3 = (j2 + j) / 2;
                    randomAccessFile2.seek(j3);
                    short readShort = randomAccessFile2.readShort();
                    if ((readShort >> 8) == 0) {
                        j = j3 - 1;
                    } else if ((readShort & 255) == 0) {
                        long j4 = j3 + 1;
                        m3026a(randomAccessFile2);
                        return j4;
                    } else {
                        j2 = j3 + 1;
                    }
                } catch (IOException e2) {
                    e = e2;
                    randomAccessFile = randomAccessFile2;
                    try {
                        Log.i("log", "init log file error: " + e);
                        m3026a(randomAccessFile);
                        return length;
                    } catch (Throwable th2) {
                        th = th2;
                        m3026a(randomAccessFile);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    randomAccessFile = randomAccessFile2;
                    m3026a(randomAccessFile);
                    throw th;
                }
            }
            if (j2 == 0) {
                length = 0;
            }
            m3026a(randomAccessFile2);
            return length;
        } catch (IOException e3) {
            e = e3;
            Log.i("log", "init log file error: " + e);
            m3026a(randomAccessFile);
            return length;
        }
    }

    /* renamed from: a */
    public static String m3022a(String str, long j, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(f3084b.format(new Date(j)));
        sb.append(": ");
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        sb.append("\n");
        if (th != null) {
            sb.append(Log.getStackTraceString(th));
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static MappedByteBuffer m3023a(File file, long j, long j2) {
        Throwable th;
        RandomAccessFile randomAccessFile;
        IOException e;
        boolean z = !file.exists() || file.length() < j + j2;
        MappedByteBuffer mappedByteBuffer = null;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            long j3 = j + j2;
            try {
                randomAccessFile.setLength(j3);
                if (randomAccessFile.length() < j3) {
                    m3026a(randomAccessFile);
                    return null;
                }
                if (z) {
                    m3028a(randomAccessFile, j, j2);
                }
                mappedByteBuffer = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_WRITE, j, j2);
                m3026a(randomAccessFile);
                return mappedByteBuffer;
            } catch (IOException e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    m3026a(randomAccessFile);
                    return mappedByteBuffer;
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile2 = randomAccessFile;
                    m3026a(randomAccessFile2);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            randomAccessFile = null;
            e.printStackTrace();
            m3026a(randomAccessFile);
            return mappedByteBuffer;
        } catch (Throwable th3) {
            th = th3;
            m3026a(randomAccessFile2);
            throw th;
        }
    }

    /* renamed from: a */
    public static Calendar m3024a() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance;
    }

    /* renamed from: a */
    public static void m3025a(BufferedWriter bufferedWriter, String str) {
        bufferedWriter.write(str);
        bufferedWriter.newLine();
        bufferedWriter.flush();
    }

    /* renamed from: a */
    public static void m3026a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x003d */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m3027a(java.io.File r12, java.io.File r13, java.io.File r14) {
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p119a.C1710b.m3027a(java.io.File, java.io.File, java.io.File):void");
    }

    /* renamed from: a */
    public static void m3028a(RandomAccessFile randomAccessFile, long j, long j2) {
        randomAccessFile.seek(j);
        byte[] bArr = new byte[65536];
        int i = 0;
        while (true) {
            long j3 = (long) i;
            if (j3 < j2) {
                randomAccessFile.write(bArr, 0, (int) Math.min(65536L, j2 - j3));
                i += 65536;
            } else {
                randomAccessFile.seek(0);
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m3029a(java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p119a.C1710b.m3029a(java.lang.String):void");
    }

    /* renamed from: a */
    public static void m3030a(String str, final boolean z) {
        final Calendar a = m3024a();
        File file = new File(str);
        if (file.exists()) {
            File[] listFiles = file.getParentFile().listFiles(new FileFilter() {
                /* class com.qiyukf.basesdk.p119a.C1710b.C17111 */

                public final boolean accept(File file) {
                    long c = C1710b.m3033c(file);
                    return z ? c > 0 : c > 0 && c < a.getTimeInMillis();
                }
            });
            if (listFiles.length != 0) {
                List asList = Arrays.asList(listFiles);
                Collections.sort(asList, new Comparator<File>() {
                    /* class com.qiyukf.basesdk.p119a.C1710b.C17122 */

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(File file, File file2) {
                        long c = C1710b.m3033c(file) - C1710b.m3033c(file2);
                        if (c > 0) {
                            return 1;
                        }
                        return c < 0 ? -1 : 0;
                    }
                });
                int i = 0;
                while (i < asList.size()) {
                    if (i == asList.size() - 1) {
                        m3027a(file, (File) asList.get(i), (File) null);
                        return;
                    }
                    File file2 = (File) asList.get(i);
                    int i2 = i + 1;
                    File file3 = (File) asList.get(i2);
                    if (m3033c(file2) == m3033c(file3)) {
                        m3027a(file, file2, file3);
                        i += 2;
                    } else {
                        m3027a(file, file2, (File) null);
                        i = i2;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m3032b(String str) {
        m3030a(str, false);
    }

    /* renamed from: c */
    public static long m3033c(File file) {
        if (file.isDirectory()) {
            return -1;
        }
        String name = file.getName();
        if (name.length() < 8) {
            return -1;
        }
        String substring = name.substring(0, name.length() - 8);
        if (!f3085c.contains(substring)) {
            return -1;
        }
        try {
            return f3083a.parse(name.substring(substring.length())).getTime();
        } catch (ParseException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static void m3034c(String str) {
        m3030a(str, true);
    }

    /* renamed from: d */
    public static long m3035d(String str) {
        if (str == null) {
            return -1;
        }
        if (!TextUtils.isEmpty(str) && str.charAt(0) == 0) {
            return -1;
        }
        int indexOf = str.indexOf(": ");
        if (indexOf != 18) {
            return 0;
        }
        try {
            return f3084b.parse(str.substring(0, indexOf)).getTime();
        } catch (ParseException unused) {
            return 0;
        }
    }

    /* renamed from: d */
    public static boolean m3036d(File file) {
        return file != null && file.exists() && file.delete();
    }
}
