package com.xiaomi.clientreport.processor;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.clientreport.data.C4164a;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.push.C4693y;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.HashMap;

/* renamed from: com.xiaomi.clientreport.processor.e */
public class C4175e {
    /* renamed from: a */
    public static PerfClientReport m11344a(PerfClientReport perfClientReport, String str) {
        long[] a;
        if (perfClientReport == null || (a = m11352a(str)) == null) {
            return null;
        }
        perfClientReport.perfCounts = a[0];
        perfClientReport.perfLatencies = a[1];
        return perfClientReport;
    }

    /* renamed from: a */
    public static PerfClientReport m11345a(String str) {
        try {
            String[] a = m11353a(str);
            if (a == null || a.length < 4 || TextUtils.isEmpty(a[0]) || TextUtils.isEmpty(a[1]) || TextUtils.isEmpty(a[2]) || TextUtils.isEmpty(a[3])) {
                return null;
            }
            PerfClientReport blankInstance = PerfClientReport.getBlankInstance();
            blankInstance.production = Integer.parseInt(a[0]);
            blankInstance.clientInterfaceId = a[1];
            blankInstance.reportType = Integer.parseInt(a[2]);
            blankInstance.code = Integer.parseInt(a[3]);
            return blankInstance;
        } catch (Exception unused) {
            AbstractC4163b.m11305c("parse per key error");
            return null;
        }
    }

    /* renamed from: a */
    public static String m11346a(PerfClientReport perfClientReport) {
        return perfClientReport.production + "#" + perfClientReport.clientInterfaceId + "#" + perfClientReport.reportType + "#" + perfClientReport.code;
    }

    /* renamed from: a */
    public static HashMap<String, String> m11347a(String str) {
        Throwable th;
        Exception e;
        HashMap<String, String> hashMap = new HashMap<>();
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return hashMap;
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split("%%%");
                    if (split.length >= 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                        hashMap.put(split[0], split[1]);
                    }
                } catch (Exception e2) {
                    e = e2;
                    bufferedReader = bufferedReader2;
                    try {
                        AbstractC4163b.m11303a(e);
                        C4693y.m14236a(bufferedReader);
                        return hashMap;
                    } catch (Throwable th2) {
                        th = th2;
                        C4693y.m14236a(bufferedReader);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = bufferedReader2;
                    C4693y.m14236a(bufferedReader);
                    throw th;
                }
            }
            C4693y.m14236a(bufferedReader2);
        } catch (Exception e3) {
            e = e3;
            AbstractC4163b.m11303a(e);
            C4693y.m14236a(bufferedReader);
            return hashMap;
        }
        return hashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v10, resolved type: java.io.BufferedReader */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00d5, code lost:
        if (r1 == null) goto L_0x00da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> m11348a(android.content.Context r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 249
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.clientreport.processor.C4175e.m11348a(android.content.Context, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public static void m11349a(String str, HashMap<String, String> hashMap) {
        Throwable th;
        BufferedWriter bufferedWriter;
        Exception e;
        if (!(TextUtils.isEmpty(str) || hashMap == null || hashMap.size() == 0)) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file));
                try {
                    for (String str2 : hashMap.keySet()) {
                        bufferedWriter.write(str2 + "%%%" + hashMap.get(str2));
                        bufferedWriter.newLine();
                    }
                } catch (Exception e2) {
                    e = e2;
                    try {
                        AbstractC4163b.m11303a(e);
                        C4693y.m14236a(bufferedWriter);
                    } catch (Throwable th2) {
                        th = th2;
                        C4693y.m14236a(bufferedWriter);
                        throw th;
                    }
                }
            } catch (Exception e3) {
                bufferedWriter = null;
                e = e3;
                AbstractC4163b.m11303a(e);
                C4693y.m14236a(bufferedWriter);
            } catch (Throwable th3) {
                bufferedWriter = null;
                th = th3;
                C4693y.m14236a(bufferedWriter);
                throw th;
            }
            C4693y.m14236a(bufferedWriter);
        }
    }

    /* renamed from: a */
    public static void m11350a(String str, C4164a[] aVarArr) {
        RandomAccessFile randomAccessFile;
        if (!(aVarArr == null || aVarArr.length <= 0 || TextUtils.isEmpty(str))) {
            FileLock fileLock = null;
            try {
                File file = new File(str + ".lock");
                C4693y.m14241a(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    FileLock lock = randomAccessFile.getChannel().lock();
                    HashMap<String, String> a = m11347a(str);
                    for (C4164a aVar : aVarArr) {
                        if (aVar != null) {
                            String a2 = m11346a((PerfClientReport) aVar);
                            long j = ((PerfClientReport) aVar).perfCounts;
                            long j2 = ((PerfClientReport) aVar).perfLatencies;
                            if (!TextUtils.isEmpty(a2) && j > 0) {
                                if (j2 >= 0) {
                                    m11351a(a, a2, j, j2);
                                }
                            }
                        }
                    }
                    m11349a(str, a);
                    if (lock != null && lock.isValid()) {
                        try {
                            lock.release();
                        } catch (IOException e) {
                            IOException e2 = e;
                        }
                    }
                } catch (Throwable unused) {
                    try {
                        AbstractC4163b.m11305c("failed to write perf to file ");
                    } finally {
                        if (0 != 0 && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e3) {
                                AbstractC4163b.m11303a(e3);
                            }
                        }
                        C4693y.m14236a(randomAccessFile);
                    }
                }
            } catch (Throwable unused2) {
                randomAccessFile = null;
                AbstractC4163b.m11305c("failed to write perf to file ");
            }
        }
    }

    /* renamed from: a */
    public static void m11351a(HashMap<String, String> hashMap, String str, long j, long j2) {
        StringBuilder sb;
        String str2 = hashMap.get(str);
        if (TextUtils.isEmpty(str2)) {
            sb = new StringBuilder();
        } else {
            long[] a = m11352a(str2);
            if (a == null || a[0] <= 0 || a[1] < 0) {
                sb = new StringBuilder();
            } else {
                j += a[0];
                j2 += a[1];
                sb = new StringBuilder();
            }
        }
        sb.append(j);
        sb.append("#");
        sb.append(j2);
        hashMap.put(str, sb.toString());
    }

    /* renamed from: a */
    public static long[] m11352a(String str) {
        long[] jArr = new long[2];
        try {
            String[] split = str.split("#");
            if (split.length >= 2) {
                jArr[0] = Long.parseLong(split[0].trim());
                jArr[1] = Long.parseLong(split[1].trim());
            }
            return jArr;
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
            return null;
        }
    }

    /* renamed from: a */
    public static String[] m11353a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split("#");
    }
}
