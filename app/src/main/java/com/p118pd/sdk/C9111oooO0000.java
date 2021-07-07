package com.p118pd.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.facebook.react.views.text.FontMetricsUtil;
import com.p273uc.crashsdk.JNIBridge;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.umeng.commonsdk.proguard.C3617o;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.oooO0000  reason: case insensitive filesystem */
public class C9111oooO0000 {
    public static Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f22484OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static String f22485OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f22486OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final char[] f22487OooO00o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static String OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final /* synthetic */ boolean f22488OooO0O0 = (!C9111oooO0000.class.desiredAssertionStatus());
    public static String OooO0OO = null;
    public static String OooO0Oo = null;
    public static String OooO0o0 = null;

    public static void OooO00o(File file, File file2) {
        Throwable th;
        FileOutputStream fileOutputStream;
        byte[] bArr = new byte[524288];
        File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        if (file2.isDirectory()) {
            file2 = new File(file2, file.getName());
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                while (true) {
                    try {
                        int read = fileInputStream2.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            OooO00o(fileInputStream2);
                            OooO00o(fileOutputStream);
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        OooO00o(fileInputStream);
                        OooO00o(fileOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                OooO00o(fileInputStream);
                OooO00o(fileOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            OooO00o(fileInputStream);
            OooO00o(fileOutputStream);
            throw th;
        }
    }

    public static String OooO0O0(File file) {
        return OooO00o(file, 64, true);
    }

    public static String OooO0OO() {
        String str = OooO0OO;
        return str != null ? str : "";
    }

    public static String OooO0Oo() {
        m20795OooO0OO();
        if (m20791OooO00o(OooO0Oo)) {
            return "";
        }
        return OooO0Oo;
    }

    public static String OooO0o0() {
        m20795OooO0OO();
        if (m20791OooO00o(OooO0o0)) {
            return "";
        }
        return OooO0o0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20790OooO00o(File file) {
        String[] list;
        if (file.isDirectory() && (list = file.list()) != null) {
            for (String str : list) {
                if (!m20790OooO00o(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static boolean OooO0O0(String str) {
        return !m20791OooO00o(str);
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static boolean m20796OooO0OO() {
        int indexOf;
        String OooO0o02 = OooO0o0();
        if (!m20791OooO00o(OooO0o02) && (indexOf = OooO0o02.indexOf(" root ")) > 0) {
            String substring = OooO0o02.substring(0, indexOf);
            if (substring.contains(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT) || substring.contains(C3617o.f9366at)) {
                return true;
            }
        }
        return false;
    }

    public static void OooO0O0(Throwable th) {
        OooO00o(th, true);
    }

    public static String OooO0O0() {
        return OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m20794OooO0O0() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20788OooO00o(File file) {
        OooO00o(file, "");
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static void m20793OooO0O0() {
        if (C9112oooO000O.f22506OooO0Oo && f22486OooO00o) {
            JNIBridge.OooO0O0(TinkerReport.KEY_APPLIED_DEXOPT_FORMAT, OooO0Oo);
            JNIBridge.OooO0O0(124, OooO0o0);
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static void m20795OooO0OO() {
        String trim;
        int indexOf;
        int indexOf2;
        if (!f22486OooO00o) {
            synchronized (f22484OooO00o) {
                if (!f22486OooO00o) {
                    String OooO00o2 = OooO00o(new String[]{"sh", "-c", "type su"});
                    if (!m20791OooO00o(OooO00o2) && (indexOf = (trim = OooO00o2.trim()).indexOf(32)) > 0 && trim.contains("/su") && (indexOf2 = trim.indexOf(47, indexOf + 1)) > 0) {
                        String substring = trim.substring(indexOf2);
                        OooO0Oo = substring;
                        String OooO00o3 = OooO00o(new String[]{"ls", "-l", substring});
                        if (!m20791OooO00o(OooO00o3)) {
                            OooO0o0 = OooO00o3.trim();
                        }
                    }
                    f22486OooO00o = true;
                    m20793OooO0O0();
                }
            }
        }
    }

    public static String OooO00o(File file) {
        Throwable th;
        String str = "";
        if (!file.exists()) {
            return str;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[256];
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    sb.append(new String(bArr, 0, read));
                }
                str = sb.toString();
                OooO00o(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                try {
                    OooO00o(th, false);
                    return str;
                } finally {
                    OooO00o(fileInputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            OooO00o(th, false);
            return str;
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0022 A[SYNTHETIC, Splitter:B:14:0x0022] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO00o(java.io.File r4, int r5, boolean r6) {
        /*
            r0 = 0
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x001e }
            r2.<init>(r4)     // Catch:{ all -> 0x001e }
            byte[] r4 = new byte[r5]     // Catch:{ all -> 0x001c }
            int r5 = r2.read(r4)     // Catch:{ all -> 0x001c }
            if (r5 <= 0) goto L_0x0018
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x001c }
            r3.<init>(r4, r0, r5)     // Catch:{ all -> 0x001c }
            OooO00o(r2)
            return r3
        L_0x0018:
            OooO00o(r2)
            goto L_0x002b
        L_0x001c:
            r4 = move-exception
            goto L_0x0020
        L_0x001e:
            r4 = move-exception
            r2 = r1
        L_0x0020:
            if (r6 == 0) goto L_0x0018
            OooO00o(r4, r0)     // Catch:{ all -> 0x0026 }
            goto L_0x0018
        L_0x0026:
            r4 = move-exception
            OooO00o(r2)
            throw r4
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9111oooO0000.OooO00o(java.io.File, int, boolean):java.lang.String");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m20792OooO00o(File file) {
        Throwable th;
        FileInputStream fileInputStream;
        if (!file.exists()) {
            return null;
        }
        try {
            byte[] bArr = new byte[((int) file.length())];
            fileInputStream = new FileInputStream(file);
            try {
                fileInputStream.read(bArr);
                OooO00o(fileInputStream);
                return bArr;
            } catch (Throwable th2) {
                th = th2;
                try {
                    OooO00o(th, false);
                    return null;
                } finally {
                    OooO00o(fileInputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            OooO00o(th, false);
            return null;
        }
    }

    public static ArrayList<String> OooO00o(File file, int i) {
        Throwable th;
        BufferedReader bufferedReader;
        ArrayList<String> arrayList = new ArrayList<>();
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader(file);
            try {
                bufferedReader = new BufferedReader(fileReader2, 512);
                int i2 = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        arrayList.add(readLine);
                        i2++;
                        if (i > 0 && i2 >= i) {
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileReader = fileReader2;
                        try {
                            OooO00o(th, false);
                            OooO00o(fileReader);
                            OooO00o(bufferedReader);
                            return arrayList;
                        } catch (Throwable th3) {
                            OooO00o(fileReader);
                            OooO00o(bufferedReader);
                            throw th3;
                        }
                    }
                }
                OooO00o(fileReader2);
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
                fileReader = fileReader2;
                OooO00o(th, false);
                OooO00o(fileReader);
                OooO00o(bufferedReader);
                return arrayList;
            }
        } catch (Throwable th5) {
            th = th5;
            bufferedReader = null;
            OooO00o(th, false);
            OooO00o(fileReader);
            OooO00o(bufferedReader);
            return arrayList;
        }
        OooO00o(bufferedReader);
        return arrayList;
    }

    public static boolean OooO00o(File file, byte[] bArr) {
        Throwable th;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                OooO00o(fileOutputStream2);
                return true;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                try {
                    OooO00o(th, false);
                    return false;
                } finally {
                    OooO00o(fileOutputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            OooO00o(th, false);
            return false;
        }
    }

    public static boolean OooO00o(File file, String str) {
        Throwable th;
        FileWriter fileWriter = null;
        try {
            FileWriter fileWriter2 = new FileWriter(file);
            try {
                fileWriter2.write(str, 0, str.length());
                OooO00o(fileWriter2);
                return true;
            } catch (Throwable th2) {
                th = th2;
                fileWriter = fileWriter2;
                try {
                    OooO00o(th, false);
                    return false;
                } finally {
                    OooO00o(fileWriter);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            OooO00o(th, false);
            return false;
        }
    }

    public static void OooO00o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                OooO00o(th, true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        if (r2.toLowerCase().startsWith("http") != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO00o(java.lang.String r2, java.lang.String r3, boolean r4) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r0 = r0.exists()
            r1 = 0
            if (r0 == 0) goto L_0x002a
            java.lang.String r2 = com.p118pd.sdk.C9093ooOoooO0.OooO00o(r2)
            boolean r0 = m20791OooO00o(r2)
            if (r0 == 0) goto L_0x0017
            goto L_0x002a
        L_0x0017:
            if (r4 == 0) goto L_0x0029
            java.lang.String r2 = r2.trim()
            java.lang.String r4 = r2.toLowerCase()
            java.lang.String r0 = "http"
            boolean r4 = r4.startsWith(r0)
            if (r4 == 0) goto L_0x002a
        L_0x0029:
            r1 = r2
        L_0x002a:
            if (r1 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r3 = r1
        L_0x002e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9111oooO0000.OooO00o(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20791OooO00o(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean OooO00o(StringBuffer stringBuffer) {
        return stringBuffer == null || stringBuffer.length() == 0;
    }

    public static long OooO00o(String str) {
        if (m20791OooO00o(str)) {
            return 0;
        }
        try {
            long parseLong = Long.parseLong(str.trim());
            if (parseLong < 0) {
                return 0;
            }
            return parseLong;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static void OooO00o(Throwable th) {
        OooO00o(th, false);
    }

    public static void OooO00o(Throwable th, boolean z) {
        if (!z) {
            try {
                if (!C9120oooO00oO.m20855OooO0OO()) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        th.printStackTrace();
    }

    public static void OooO00o(Context context) {
        if (OooO00o != null) {
            C9090ooOooo0O.OooO0O0("mContext is existed");
        }
        OooO00o = context;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        f22485OooO00o = applicationInfo.dataDir;
        OooO0O0 = applicationInfo.sourceDir;
        try {
            Field declaredField = ApplicationInfo.class.getDeclaredField("primaryCpuAbi");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(applicationInfo);
            if (obj != null && (obj instanceof String)) {
                OooO0OO = (String) obj;
            }
        } catch (Throwable th) {
            OooO00o(th, false);
        }
    }

    public static Context OooO00o() {
        return OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20785OooO00o() {
        return f22485OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20789OooO00o() {
        if (m20796OooO0OO()) {
            return true;
        }
        return m20794OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20787OooO00o() {
        C9146oooO0oo0.OooO00o(0, new RunnableC9106ooo0oooo(800), 15000);
    }

    public static void OooO00o(int i) {
        if (i == 800) {
            m20795OooO0OO();
        } else if (!f22488OooO0O0) {
            throw new AssertionError();
        }
    }

    public static String OooO00o(String[] strArr) {
        BufferedReader bufferedReader;
        Throwable th;
        Reader reader;
        try {
            reader = new InputStreamReader(Runtime.getRuntime().exec(strArr).getInputStream());
            try {
                bufferedReader = new BufferedReader(reader, 512);
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                try {
                    OooO00o(th, false);
                    return null;
                } finally {
                    OooO00o(bufferedReader);
                    OooO00o(reader);
                }
            }
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        String trim = sb.toString().trim();
                        OooO00o(bufferedReader);
                        OooO00o(reader);
                        return trim;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                OooO00o(th, false);
                return null;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            reader = bufferedReader;
            OooO00o(th, false);
            return null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20786OooO00o(String str) {
        try {
            byte[] bytes = str.getBytes("utf-8");
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bytes);
            byte[] digest = instance.digest();
            int length = digest.length;
            StringBuilder sb = new StringBuilder(length * 2);
            int i = length + 0;
            for (int i2 = 0; i2 < i; i2++) {
                byte b = digest[i2];
                char c = f22487OooO00o[(b & 240) >> 4];
                char c2 = f22487OooO00o[b & 15];
                sb.append(c);
                sb.append(c2);
            }
            return sb.toString();
        } catch (Exception e) {
            C9090ooOooo0O.OooO00o("crashsdk", "getMD5: ", e);
            return null;
        }
    }
}
