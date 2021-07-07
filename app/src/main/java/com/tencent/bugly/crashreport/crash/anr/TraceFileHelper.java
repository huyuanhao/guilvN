package com.tencent.bugly.crashreport.crash.anr;

import com.tencent.bugly.proguard.C3321an;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TraceFileHelper {

    /* renamed from: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$a */
    public static class C3279a {

        /* renamed from: a */
        public long f7810a;

        /* renamed from: b */
        public String f7811b;

        /* renamed from: c */
        public long f7812c;

        /* renamed from: d */
        public Map<String, String[]> f7813d;
    }

    /* renamed from: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$b */
    public interface AbstractC3280b {
        /* renamed from: a */
        boolean mo38213a(long j);

        /* renamed from: a */
        boolean mo38214a(long j, long j2, String str);

        /* renamed from: a */
        boolean mo38215a(String str, int i, String str2, String str3, boolean z);

        /* renamed from: a */
        boolean mo38216a(String str, long j, long j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        return new java.lang.Object[]{r5, r1};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        if (r8 != null) goto L_0x0006;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r1 = r7.readLine();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r1 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        r2 = r8.length;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r4 >= r2) goto L_0x0006;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r5 = r8[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r5.matcher(r1).matches() == false) goto L_0x0026;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object[] m8089a(java.io.BufferedReader r7, java.util.regex.Pattern... r8) throws java.io.IOException {
        /*
            r0 = 0
            if (r7 == 0) goto L_0x0029
            if (r8 != 0) goto L_0x0006
            goto L_0x0029
        L_0x0006:
            java.lang.String r1 = r7.readLine()
            if (r1 == 0) goto L_0x0029
            int r2 = r8.length
            r3 = 0
            r4 = 0
        L_0x000f:
            if (r4 >= r2) goto L_0x0006
            r5 = r8[r4]
            java.util.regex.Matcher r6 = r5.matcher(r1)
            boolean r6 = r6.matches()
            if (r6 == 0) goto L_0x0026
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r3] = r5
            r8 = 1
            r7[r8] = r1
            return r7
        L_0x0026:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.m8089a(java.io.BufferedReader, java.util.regex.Pattern[]):java.lang.Object[]");
    }

    /* renamed from: b */
    public static String m8090b(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null && readLine.trim().length() > 0) {
                stringBuffer.append(readLine + "\n");
            }
        }
        return stringBuffer.toString();
    }

    public static C3279a readFirstDumpInfo(String str, final boolean z) {
        if (str == null) {
            C3321an.m8357e("path:%s", str);
            return null;
        }
        final C3279a aVar = new C3279a();
        readTraceFile(str, new AbstractC3280b() {
            /* class com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.C32782 */

            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.AbstractC3280b
            /* renamed from: a */
            public boolean mo38215a(String str, int i, String str2, String str3, boolean z) {
                C3321an.m8355c("new thread %s", str);
                C3279a aVar = aVar;
                if (aVar.f7813d == null) {
                    aVar.f7813d = new HashMap();
                }
                Map<String, String[]> map = aVar.f7813d;
                map.put(str, new String[]{str2, str3, "" + i});
                return true;
            }

            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.AbstractC3280b
            /* renamed from: a */
            public boolean mo38216a(String str, long j, long j2) {
                return true;
            }

            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.AbstractC3280b
            /* renamed from: a */
            public boolean mo38214a(long j, long j2, String str) {
                C3321an.m8355c("new process %s", str);
                C3279a aVar = aVar;
                aVar.f7810a = j;
                aVar.f7811b = str;
                aVar.f7812c = j2;
                return z;
            }

            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.AbstractC3280b
            /* renamed from: a */
            public boolean mo38213a(long j) {
                C3321an.m8355c("process end %d", Long.valueOf(j));
                return false;
            }
        });
        if (aVar.f7810a > 0 && aVar.f7812c > 0 && aVar.f7811b != null) {
            return aVar;
        }
        C3321an.m8357e("first dump error %s", aVar.f7810a + " " + aVar.f7812c + " " + aVar.f7811b);
        return null;
    }

    public static C3279a readTargetDumpInfo(final String str, String str2, final boolean z) {
        if (!(str == null || str2 == null)) {
            final C3279a aVar = new C3279a();
            readTraceFile(str2, new AbstractC3280b() {
                /* class com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.C32771 */

                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.AbstractC3280b
                /* renamed from: a */
                public boolean mo38215a(String str, int i, String str2, String str3, boolean z) {
                    C3321an.m8355c("new thread %s", str);
                    C3279a aVar = aVar;
                    if (aVar.f7810a > 0 && aVar.f7812c > 0 && aVar.f7811b != null) {
                        if (aVar.f7813d == null) {
                            aVar.f7813d = new HashMap();
                        }
                        Map<String, String[]> map = aVar.f7813d;
                        map.put(str, new String[]{str2, str3, "" + i});
                    }
                    return true;
                }

                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.AbstractC3280b
                /* renamed from: a */
                public boolean mo38216a(String str, long j, long j2) {
                    return true;
                }

                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.AbstractC3280b
                /* renamed from: a */
                public boolean mo38214a(long j, long j2, String str) {
                    C3321an.m8355c("new process %s", str);
                    if (!str.equals(str)) {
                        return true;
                    }
                    C3279a aVar = aVar;
                    aVar.f7810a = j;
                    aVar.f7811b = str;
                    aVar.f7812c = j2;
                    return z;
                }

                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.AbstractC3280b
                /* renamed from: a */
                public boolean mo38213a(long j) {
                    C3321an.m8355c("process end %d", Long.valueOf(j));
                    C3279a aVar = aVar;
                    return aVar.f7810a <= 0 || aVar.f7812c <= 0 || aVar.f7811b == null;
                }
            });
            if (aVar.f7810a <= 0 || aVar.f7812c <= 0 || aVar.f7811b == null) {
                return null;
            }
            return aVar;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x018c, code lost:
        r1.printStackTrace();
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a1 A[Catch:{ all -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ce A[SYNTHETIC, Splitter:B:73:0x01ce] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01de A[SYNTHETIC, Splitter:B:79:0x01de] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void readTraceFile(java.lang.String r18, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.AbstractC3280b r19) {
        /*
        // Method dump skipped, instructions count: 495
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.readTraceFile(java.lang.String, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$b):void");
    }

    /* renamed from: a */
    public static String m8088a(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 3; i++) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return null;
            }
            stringBuffer.append(readLine + "\n");
        }
        return stringBuffer.toString();
    }
}
