package com.umeng.commonsdk.internal.utils;

import java.io.InputStream;

/* renamed from: com.umeng.commonsdk.internal.utils.d */
public class C3538d {

    /* renamed from: com.umeng.commonsdk.internal.utils.d$a */
    public static class C3539a {

        /* renamed from: a */
        public String f9087a;

        /* renamed from: b */
        public String f9088b;

        /* renamed from: c */
        public int f9089c;

        /* renamed from: d */
        public String f9090d;

        /* renamed from: e */
        public String f9091e;

        /* renamed from: f */
        public String f9092f;

        /* renamed from: g */
        public String f9093g;

        /* renamed from: h */
        public String f9094h;

        /* renamed from: i */
        public String f9095i;

        /* renamed from: j */
        public String f9096j;

        /* renamed from: k */
        public String f9097k;

        /* renamed from: l */
        public String f9098l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0122, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0123, code lost:
        r3 = null;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0133, code lost:
        r2 = null;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0118, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x0111 */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0122 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0002] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0128 A[SYNTHETIC, Splitter:B:109:0x0128] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x012f A[SYNTHETIC, Splitter:B:113:0x012f] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0137 A[SYNTHETIC, Splitter:B:120:0x0137] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x013e A[SYNTHETIC, Splitter:B:124:0x013e] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0118 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x0013] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.umeng.commonsdk.internal.utils.C3538d.C3539a m9154a() {
        /*
        // Method dump skipped, instructions count: 325
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.C3538d.m9154a():com.umeng.commonsdk.internal.utils.d$a");
    }

    /* renamed from: b */
    public static String m9155b() {
        String str = "";
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            while (inputStream.read(bArr) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
        } catch (Exception unused) {
        }
        return str.trim();
    }

    /* renamed from: c */
    public static String m9156c() {
        String str = "";
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            while (inputStream.read(bArr) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
        } catch (Exception unused) {
        }
        return str.trim();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022 A[SYNTHETIC, Splitter:B:13:0x0022] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028 A[SYNTHETIC, Splitter:B:19:0x0028] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m9157d() {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ Exception -> 0x0026, all -> 0x001d }
            java.lang.String r2 = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0026, all -> 0x001d }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0026, all -> 0x001d }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0026, all -> 0x001d }
            java.lang.String r0 = r2.readLine()     // Catch:{ Exception -> 0x001b, all -> 0x0019 }
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x001b, all -> 0x0019 }
            r2.close()     // Catch:{ all -> 0x002d }
            goto L_0x002d
        L_0x0019:
            r0 = move-exception
            goto L_0x0020
        L_0x001b:
            r0 = r2
            goto L_0x0026
        L_0x001d:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x0020:
            if (r2 == 0) goto L_0x0025
            r2.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            throw r0
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            r0.close()     // Catch:{ all -> 0x002b }
        L_0x002b:
            java.lang.String r0 = ""
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.C3538d.m9157d():java.lang.String");
    }
}
