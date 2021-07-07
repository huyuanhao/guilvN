package com.ijm.dataencryption;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.android.spdy.SoInstallMgrSdk;

public class DETool {

    /* renamed from: a */
    private static int f1731a = 0;
    private static int app_exist_FileObserver = 1;

    /* renamed from: b */
    private static List<RPhone> f1732b;

    /* renamed from: c */
    private static boolean f1733c;

    /* access modifiers changed from: private */
    public static class RPhone {

        /* renamed from: a */
        String f1734a;

        /* renamed from: b */
        int f1735b;

        public RPhone(String str, int i) {
            this.f1734a = str;
            this.f1735b = i;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0028 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0039 A[SYNTHETIC, Splitter:B:28:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0040 A[SYNTHETIC, Splitter:B:32:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0047 A[SYNTHETIC, Splitter:B:39:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x004e A[SYNTHETIC, Splitter:B:43:0x004e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m2147a(android.content.Context r4, java.lang.String r5) {
        /*
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r1 = 0
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ Exception -> 0x0044, all -> 0x0035 }
            java.io.InputStream r4 = r4.open(r5)     // Catch:{ Exception -> 0x0044, all -> 0x0035 }
            java.util.zip.CheckedInputStream r5 = new java.util.zip.CheckedInputStream     // Catch:{ Exception -> 0x0032, all -> 0x002e }
            r5.<init>(r4, r0)     // Catch:{ Exception -> 0x0032, all -> 0x002e }
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x0033, all -> 0x002c }
        L_0x0017:
            int r2 = r5.read(r1)     // Catch:{ Exception -> 0x0033, all -> 0x002c }
            r3 = -1
            if (r2 == r3) goto L_0x001f
            goto L_0x0017
        L_0x001f:
            long r0 = r0.getValue()     // Catch:{ Exception -> 0x0033, all -> 0x002c }
            if (r4 == 0) goto L_0x0028
            r4.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            r5.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0053
        L_0x002c:
            r0 = move-exception
            goto L_0x0030
        L_0x002e:
            r0 = move-exception
            r5 = r1
        L_0x0030:
            r1 = r4
            goto L_0x0037
        L_0x0032:
            r5 = r1
        L_0x0033:
            r1 = r4
            goto L_0x0045
        L_0x0035:
            r0 = move-exception
            r5 = r1
        L_0x0037:
            if (r1 == 0) goto L_0x003e
            r1.close()     // Catch:{ IOException -> 0x003d }
            goto L_0x003e
        L_0x003d:
        L_0x003e:
            if (r5 == 0) goto L_0x0043
            r5.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            throw r0
        L_0x0044:
            r5 = r1
        L_0x0045:
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x004c
        L_0x004b:
        L_0x004c:
            if (r5 == 0) goto L_0x0051
            r5.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            r0 = 0
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ijm.dataencryption.DETool.m2147a(android.content.Context, java.lang.String):long");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:0|(11:1|2|3|4|5|6|7|8|(2:9|(1:11)(1:45))|12|(2:14|15))|16|17|48) */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002d */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x003e A[SYNTHETIC, Splitter:B:29:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0045 A[SYNTHETIC, Splitter:B:33:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x004c A[SYNTHETIC, Splitter:B:40:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m2148b(android.content.Context r2, java.io.File r3, java.lang.String r4) {
        /*
            r0 = 0
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ IOException -> 0x0049, all -> 0x003a }
            java.io.InputStream r2 = r2.open(r4)     // Catch:{ IOException -> 0x0049, all -> 0x003a }
            r4 = 1
            r3.setReadable(r4)     // Catch:{ IOException -> 0x0037, all -> 0x0033 }
            r3.setWritable(r4)     // Catch:{ IOException -> 0x0037, all -> 0x0033 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0037, all -> 0x0033 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0037, all -> 0x0033 }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch:{ IOException -> 0x0038, all -> 0x0031 }
        L_0x0019:
            int r0 = r2.read(r3)     // Catch:{ IOException -> 0x0038, all -> 0x0031 }
            r1 = -1
            if (r0 == r1) goto L_0x0025
            r1 = 0
            r4.write(r3, r1, r0)     // Catch:{ IOException -> 0x0038, all -> 0x0031 }
            goto L_0x0019
        L_0x0025:
            r4.flush()     // Catch:{ IOException -> 0x0038, all -> 0x0031 }
            if (r2 == 0) goto L_0x002d
            r2.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            r4.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0054
        L_0x0031:
            r3 = move-exception
            goto L_0x0035
        L_0x0033:
            r3 = move-exception
            r4 = r0
        L_0x0035:
            r0 = r2
            goto L_0x003c
        L_0x0037:
            r4 = r0
        L_0x0038:
            r0 = r2
            goto L_0x004a
        L_0x003a:
            r3 = move-exception
            r4 = r0
        L_0x003c:
            if (r0 == 0) goto L_0x0043
            r0.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0043
        L_0x0042:
        L_0x0043:
            if (r4 == 0) goto L_0x0048
            r4.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            throw r3
        L_0x0049:
            r4 = r0
        L_0x004a:
            if (r0 == 0) goto L_0x0051
            r0.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x0051
        L_0x0050:
        L_0x0051:
            if (r4 == 0) goto L_0x0054
            goto L_0x002d
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ijm.dataencryption.DETool.m2148b(android.content.Context, java.io.File, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0050, code lost:
        if (r7 == null) goto L_0x0053;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002c */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x003d A[SYNTHETIC, Splitter:B:30:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0044 A[SYNTHETIC, Splitter:B:34:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x004b A[SYNTHETIC, Splitter:B:41:0x004b] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m2149c(java.io.File r7) {
        /*
            boolean r0 = r7.exists()
            r1 = 0
            if (r0 != 0) goto L_0x0009
            return r1
        L_0x0009:
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0048, all -> 0x0039 }
            r4.<init>(r7)     // Catch:{ Exception -> 0x0048, all -> 0x0039 }
            java.util.zip.CheckedInputStream r7 = new java.util.zip.CheckedInputStream     // Catch:{ Exception -> 0x0036, all -> 0x0032 }
            r7.<init>(r4, r0)     // Catch:{ Exception -> 0x0036, all -> 0x0032 }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x0037, all -> 0x0030 }
        L_0x001d:
            int r5 = r7.read(r3)     // Catch:{ Exception -> 0x0037, all -> 0x0030 }
            r6 = -1
            if (r5 == r6) goto L_0x0025
            goto L_0x001d
        L_0x0025:
            long r1 = r0.getValue()     // Catch:{ Exception -> 0x0037, all -> 0x0030 }
            r4.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            r7.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0053
        L_0x0030:
            r0 = move-exception
            goto L_0x0034
        L_0x0032:
            r0 = move-exception
            r7 = r3
        L_0x0034:
            r3 = r4
            goto L_0x003b
        L_0x0036:
            r7 = r3
        L_0x0037:
            r3 = r4
            goto L_0x0049
        L_0x0039:
            r0 = move-exception
            r7 = r3
        L_0x003b:
            if (r3 == 0) goto L_0x0042
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0042
        L_0x0041:
        L_0x0042:
            if (r7 == 0) goto L_0x0047
            r7.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            throw r0
        L_0x0048:
            r7 = r3
        L_0x0049:
            if (r3 == 0) goto L_0x0050
            r3.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x0050
        L_0x004f:
        L_0x0050:
            if (r7 == 0) goto L_0x0053
            goto L_0x002c
        L_0x0053:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ijm.dataencryption.DETool.m2149c(java.io.File):long");
    }

    /* renamed from: d */
    private static String m2150d() {
        return m2151e("ro.product.cpu.abi");
    }

    private static native boolean dowork(String str, int i, String str2, String str3, String str4);

    /* renamed from: e */
    private static String m2151e(String str) {
        return (String) m2153g("android.os.Build", "getString", new Class[]{String.class}, new Object[]{str});
    }

    /* renamed from: f */
    private static List<RPhone> m2152f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RPhone("Redmi 4X", 25));
        arrayList.add(new RPhone("OPPO R9m", 22));
        arrayList.add(new RPhone("MI MAX", 24));
        arrayList.add(new RPhone("OPPO A73", 25));
        arrayList.add(new RPhone("OPPO A57", 23));
        arrayList.add(new RPhone("OPPO A77", 25));
        arrayList.add(new RPhone("OPPO A79", 25));
        return arrayList;
    }

    /* renamed from: g */
    private static Object m2153g(String str, String str2, Class<?>[] clsArr, Object[] objArr) {
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, objArr);
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static String getVersion() {
        return "2.1.2.20083101";
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047 A[SYNTHETIC, Splitter:B:23:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0019 A[Catch:{ Exception -> 0x0040, all -> 0x003e }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m2154h() {
        /*
            r0 = 0
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x004b, all -> 0x0042 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x004b, all -> 0x0042 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x004b, all -> 0x0042 }
            java.lang.String r5 = "/proc/self/maps"
            r4.<init>(r5)     // Catch:{ Exception -> 0x004b, all -> 0x0042 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x004b, all -> 0x0042 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x004b, all -> 0x0042 }
        L_0x0013:
            java.lang.String r0 = r2.readLine()     // Catch:{ Exception -> 0x0040, all -> 0x003e }
            if (r0 == 0) goto L_0x003a
            java.lang.String r3 = "/system/lib64/libart.so"
            boolean r3 = r0.contains(r3)     // Catch:{ Exception -> 0x0040, all -> 0x003e }
            if (r3 != 0) goto L_0x0039
            java.lang.String r3 = "/system/lib64/libartpalette-system"
            boolean r3 = r0.contains(r3)     // Catch:{ Exception -> 0x0040, all -> 0x003e }
            if (r3 != 0) goto L_0x0039
            java.lang.String r3 = "/system/lib64/libaoc.so"
            boolean r3 = r0.contains(r3)     // Catch:{ Exception -> 0x0040, all -> 0x003e }
            if (r3 != 0) goto L_0x0039
            java.lang.String r3 = "/system/bin/linker64"
            boolean r0 = r0.contains(r3)     // Catch:{ Exception -> 0x0040, all -> 0x003e }
            if (r0 == 0) goto L_0x0013
        L_0x0039:
            r1 = 1
        L_0x003a:
            r2.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x0050
        L_0x003e:
            r0 = move-exception
            goto L_0x0045
        L_0x0040:
            r0 = r2
            goto L_0x004b
        L_0x0042:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x0045:
            if (r2 == 0) goto L_0x004a
            r2.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            throw r0
        L_0x004b:
            if (r0 == 0) goto L_0x0050
            r0.close()
        L_0x0050:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ijm.dataencryption.DETool.m2154h():boolean");
    }

    /* renamed from: i */
    private static boolean m2155i() {
        if (!f1733c) {
            return false;
        }
        f1732b = m2152f();
        String e = m2151e("ro.product.model");
        int i = Build.VERSION.SDK_INT;
        for (RPhone rPhone : f1732b) {
            if (rPhone.f1735b == i && e.equalsIgnoreCase(rPhone.f1734a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC, Splitter:B:18:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052 A[SYNTHETIC, Splitter:B:24:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m2156j(java.lang.String r4) {
        /*
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004f, all -> 0x0045 }
            r1.<init>()     // Catch:{ Exception -> 0x004f, all -> 0x0045 }
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x004f, all -> 0x0045 }
            java.lang.String r2 = r2.getPath()     // Catch:{ Exception -> 0x004f, all -> 0x0045 }
            r1.append(r2)     // Catch:{ Exception -> 0x004f, all -> 0x0045 }
            java.lang.String r2 = java.io.File.separator     // Catch:{ Exception -> 0x004f, all -> 0x0045 }
            r1.append(r2)     // Catch:{ Exception -> 0x004f, all -> 0x0045 }
            r1.append(r4)     // Catch:{ Exception -> 0x004f, all -> 0x0045 }
            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x004f, all -> 0x0045 }
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x004f, all -> 0x0045 }
            r1.<init>()     // Catch:{ Exception -> 0x004f, all -> 0x0045 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Exception -> 0x004f, all -> 0x0045 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x004f, all -> 0x0045 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x004f, all -> 0x0045 }
            r4.<init>(r2)     // Catch:{ Exception -> 0x004f, all -> 0x0045 }
        L_0x002c:
            java.lang.String r0 = r4.readLine()     // Catch:{ Exception -> 0x0043, all -> 0x0041 }
            if (r0 == 0) goto L_0x0036
            r1.append(r0)     // Catch:{ Exception -> 0x0043, all -> 0x0041 }
            goto L_0x002c
        L_0x0036:
            r2.close()     // Catch:{ Exception -> 0x0043, all -> 0x0041 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0043, all -> 0x0041 }
            r4.close()     // Catch:{ IOException -> 0x0040 }
        L_0x0040:
            return r0
        L_0x0041:
            r0 = move-exception
            goto L_0x0049
        L_0x0043:
            r0 = r4
            goto L_0x0050
        L_0x0045:
            r4 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
        L_0x0049:
            if (r4 == 0) goto L_0x004e
            r4.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r0
        L_0x004f:
        L_0x0050:
            if (r0 == 0) goto L_0x0055
            r0.close()     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            java.lang.String r4 = ""
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ijm.dataencryption.DETool.m2156j(java.lang.String):java.lang.String");
    }

    public static void loadDEso(Context context) {
        String j;
        String str = "libijmDataEncryption.so";
        if (context != null && f1731a <= 0) {
            try {
                boolean h = m2154h();
                if (!h || app_exist_FileObserver != 1 || !m2155i()) {
                    String str2 = context.getFilesDir() + File.separator + str;
                    File file = new File(str2);
                    String d = m2150d();
                    if (d != null && d.contains(SoInstallMgrSdk.X86)) {
                        str = h ? "libijmDataEncryption_x86_64.so" : "libijmDataEncryption_x86.so";
                    } else if (h) {
                        str = "libijmDataEncryption_arm64.so";
                    }
                    f1731a++;
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    if (file.exists()) {
                        if (m2149c(file) != m2147a(context, str) && ((j = m2156j("ms_de.txt")) == null || !j.equals("ms_de"))) {
                            file.delete();
                        }
                        System.load(str2);
                        dowork("qmFJh65QoklKoT9Vs7hFrSU=;" + context.getPackageName(), 1, "BAE4A621AB041AE06479D719EFEA754021027AD96D8F866B1703B39FAC358A20", "0x4096", "0x16384");
                    }
                    m2148b(context, file, str);
                    System.load(str2);
                    dowork("qmFJh65QoklKoT9Vs7hFrSU=;" + context.getPackageName(), 1, "BAE4A621AB041AE06479D719EFEA754021027AD96D8F866B1703B39FAC358A20", "0x4096", "0x16384");
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
