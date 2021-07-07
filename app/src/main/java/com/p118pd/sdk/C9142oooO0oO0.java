package com.p118pd.sdk;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.oooO0oO0  reason: case insensitive filesystem */
public class C9142oooO0oO0 {
    public static final SparseArray<String> OooO00o = new SparseArray<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f22614OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Map<String, SparseIntArray> f22615OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f22616OooO00o = false;
    public static final Object OooO0O0 = new Object();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final /* synthetic */ boolean f22617OooO0O0 = (!C9142oooO0oO0.class.desiredAssertionStatus());

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20880OooO00o(int i) {
        OooO00o(i, 1);
    }

    public static boolean OooO0O0(String str) {
        m20885OooO0O0();
        synchronized (OooO00o) {
            File file = new File(str);
            StringBuffer OooO00o2 = OooO00o(file);
            if (C9111oooO0000.OooO00o(OooO00o2)) {
                return false;
            }
            int indexOf = OooO00o2.indexOf("[");
            if (indexOf < 0) {
                C9090ooOooo0O.OooO00o("crashsdk", "Can not found process name start!", null);
                return false;
            }
            int i = indexOf + 1;
            int indexOf2 = OooO00o2.indexOf("]", i);
            if (indexOf2 < 0) {
                C9090ooOooo0O.OooO00o("crashsdk", "Can not found process name end!", null);
                return false;
            }
            String substring = OooO00o2.substring(i, indexOf2);
            boolean z = false;
            for (int i2 = 0; i2 < OooO00o.size(); i2++) {
                try {
                    int keyAt = OooO00o.keyAt(i2);
                    String str2 = OooO00o.get(keyAt);
                    int OooO00o3 = OooO00o(OooO00o2, str2);
                    if (OooO00o3 > 0) {
                        C9110oooO000.OooO00o(substring, keyAt, OooO00o3);
                        synchronized (f22615OooO00o) {
                            SparseIntArray sparseIntArray = f22615OooO00o.get(substring);
                            if (sparseIntArray == null) {
                                sparseIntArray = new SparseIntArray();
                                f22615OooO00o.put(substring, sparseIntArray);
                            }
                            sparseIntArray.put(keyAt, sparseIntArray.get(keyAt, 0) + OooO00o3);
                        }
                        OooO00o(OooO00o2, str2, 0);
                        z = true;
                    }
                } finally {
                    if (z) {
                        OooO00o(file, OooO00o2);
                    }
                }
            }
            return true;
        }
    }

    public static boolean OooO0OO(String str) {
        SparseIntArray sparseIntArray = f22615OooO00o.get(str);
        if (sparseIntArray == null) {
            return false;
        }
        for (int i = 0; i < sparseIntArray.size(); i++) {
            int keyAt = sparseIntArray.keyAt(i);
            C9113oooO000o.OooO00o(str, keyAt, sparseIntArray.get(keyAt));
        }
        return true;
    }

    public static void OooO00o(int i, int i2) {
        if (i2 == 0) {
            C9090ooOooo0O.OooO0O0("Add stat for type " + i + " with count 0!");
            return;
        }
        OooO00o(C9112oooO000O.OooO0oO(), new RunnableC9106ooo0oooo(751, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20882OooO00o(int i, int i2) {
        try {
            C9112oooO000O.m20830OooOOo0();
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
        }
        try {
            String OooO00o2 = OooO00o(i);
            if (OooO00o2 == null) {
                C9090ooOooo0O.OooO00o("crashsdk", "Stat type not exists: " + i, null);
                return false;
            }
            File file = new File(C9112oooO000O.OooO0oO());
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (Throwable th2) {
                C9111oooO0000.OooO00o(th2);
            }
            StringBuffer OooO00o3 = OooO00o(file);
            if (C9111oooO0000.OooO00o(OooO00o3)) {
                if (OooO00o3 == null) {
                    OooO00o3 = new StringBuffer();
                }
                OooO00o3.append("[");
                OooO00o3.append(C9278ooooo0.OooO());
                OooO00o3.append("]\n");
            }
            OooO00o(OooO00o3, OooO00o2, OooO00o(OooO00o3, OooO00o2) + i2);
            return OooO00o(file, OooO00o3);
        } catch (Throwable th3) {
            C9111oooO0000.OooO00o(th3);
            return false;
        }
    }

    public static StringBuffer OooO00o(File file) {
        Throwable th;
        Exception e;
        FileReader fileReader = null;
        if (!file.exists()) {
            return null;
        }
        char[] OooO00o2 = m20883OooO00o();
        if (OooO00o2 == null) {
            C9090ooOooo0O.OooO00o("crashsdk", "readCrashStatData alloc buffer failed!", null);
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            FileReader fileReader2 = new FileReader(file);
            try {
                int read = fileReader2.read(OooO00o2);
                if (read > 0) {
                    stringBuffer.append(OooO00o2, 0, read);
                }
                C9111oooO0000.OooO00o(fileReader2);
            } catch (Exception e2) {
                e = e2;
                fileReader = fileReader2;
                try {
                    C9111oooO0000.OooO00o(e);
                    C9111oooO0000.OooO00o(fileReader);
                    return stringBuffer;
                } catch (Throwable th2) {
                    th = th2;
                    C9111oooO0000.OooO00o(fileReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileReader = fileReader2;
                C9111oooO0000.OooO00o(fileReader);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            C9111oooO0000.OooO00o(e);
            C9111oooO0000.OooO00o(fileReader);
            return stringBuffer;
        }
        return stringBuffer;
    }

    public static int OooO0O0(boolean z) {
        int i;
        synchronized (f22615OooO00o) {
            if (z) {
                String OooO = C9278ooooo0.OooO();
                if (f22615OooO00o.containsKey(OooO)) {
                    f22615OooO00o.remove(OooO);
                    i = 1;
                } else {
                    i = 0;
                }
            } else {
                i = f22615OooO00o.size();
                f22615OooO00o.clear();
            }
        }
        return i;
    }

    public static int OooO00o(StringBuffer stringBuffer, String str) {
        int indexOf = stringBuffer.indexOf(str);
        if (indexOf < 0) {
            return 0;
        }
        int indexOf2 = stringBuffer.indexOf(C8932ooOOO0o.OooO0Oo, indexOf + str.length());
        if (indexOf2 < 0) {
            C9090ooOooo0O.OooO0O0(str + " line not contain '='!");
            return 0;
        }
        int i = indexOf2 + 1;
        int indexOf3 = stringBuffer.indexOf("\n", i);
        if (indexOf3 < 0) {
            indexOf3 = stringBuffer.length();
        }
        try {
            int parseInt = Integer.parseInt(stringBuffer.substring(i, indexOf3));
            if (parseInt < 0) {
                return 0;
            }
            return parseInt;
        } catch (NumberFormatException e) {
            C9111oooO0000.OooO00o(e);
            return 0;
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static void m20885OooO0O0() {
        synchronized (OooO00o) {
            if (OooO00o.size() == 0) {
                OooO00o.put(100, "start_pv");
                OooO00o.put(102, "start_hpv");
                OooO00o.put(1, "all_all");
                OooO00o.put(2, "all_fg");
                OooO00o.put(101, "all_bg");
                OooO00o.put(3, "java_fg");
                OooO00o.put(4, "java_bg");
                OooO00o.put(7, "native_fg");
                OooO00o.put(8, "native_bg");
                OooO00o.put(27, "native_anr_fg");
                OooO00o.put(28, "native_anr_bg");
                OooO00o.put(9, "native_ok");
                OooO00o.put(10, "unexp_anr");
                OooO00o.put(29, "unexp_lowmem");
                OooO00o.put(30, "unexp_killed");
                OooO00o.put(31, "unexp_exit");
                OooO00o.put(32, "unexp_restart");
                OooO00o.put(11, "unexp_fg");
                OooO00o.put(12, "unexp_bg");
                OooO00o.put(40, "anr_fg");
                OooO00o.put(41, "anr_bg");
                OooO00o.put(42, "anr_cr_fg");
                OooO00o.put(43, "anr_cr_bg");
                OooO00o.put(13, "log_up_succ");
                OooO00o.put(14, "log_up_fail");
                OooO00o.put(15, "log_empty");
                OooO00o.put(200, "log_tmp");
                OooO00o.put(16, "log_abd_all");
                OooO00o.put(22, "log_abd_builtin");
                OooO00o.put(23, "log_abd_custom");
                OooO00o.put(17, "log_large");
                OooO00o.put(18, "log_up_all");
                OooO00o.put(19, "log_up_bytes");
                OooO00o.put(20, "log_up_crash");
                OooO00o.put(21, "log_up_custom");
                OooO00o.put(24, "log_zipped");
                OooO00o.put(201, "log_enced");
                OooO00o.put(25, "log_renamed");
                OooO00o.put(26, "log_safe_skip");
            }
        }
    }

    public static void OooO00o(StringBuffer stringBuffer, String str, int i) {
        int indexOf = stringBuffer.indexOf(str);
        if (indexOf >= 0) {
            int indexOf2 = stringBuffer.indexOf("\n", indexOf);
            if (indexOf2 < 0) {
                indexOf2 = stringBuffer.length();
            }
            stringBuffer.replace(indexOf, indexOf2, str + C8932ooOOO0o.OooO0Oo + String.valueOf(i));
        } else if (i > 0) {
            stringBuffer.append(str);
            stringBuffer.append(C8932ooOOO0o.OooO0Oo);
            stringBuffer.append(i);
            stringBuffer.append("\n");
        }
    }

    public static boolean OooO00o(File file, StringBuffer stringBuffer) {
        Throwable th;
        Exception e;
        FileWriter fileWriter = null;
        try {
            FileWriter fileWriter2 = new FileWriter(file);
            try {
                String stringBuffer2 = stringBuffer.toString();
                fileWriter2.write(stringBuffer2, 0, stringBuffer2.length());
                C9111oooO0000.OooO00o(fileWriter2);
                return true;
            } catch (Exception e2) {
                e = e2;
                fileWriter = fileWriter2;
                try {
                    C9111oooO0000.OooO00o(e);
                    C9111oooO0000.OooO00o(fileWriter);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    C9111oooO0000.OooO00o(fileWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileWriter = fileWriter2;
                C9111oooO0000.OooO00o(fileWriter);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            C9111oooO0000.OooO00o(e);
            C9111oooO0000.OooO00o(fileWriter);
            return false;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x001e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x001e */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public static int OooO00o(boolean z) {
        int i;
        synchronized (f22615OooO00o) {
            if (z) {
                String OooO = C9278ooooo0.OooO();
                boolean OooO0OO = OooO0OO(OooO);
                f22615OooO00o.remove(OooO);
                i = OooO0OO;
            } else {
                int i2 = 0;
                for (String str : f22615OooO00o.keySet()) {
                    if (OooO0OO(str)) {
                        i2 = (i2 == 1 ? 1 : 0) + 1;
                    }
                }
                f22615OooO00o.clear();
                i = i2;
            }
        }
        return i == 1 ? 1 : 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static char[] m20883OooO00o() {
        char[] cArr = null;
        int i = 1024;
        while (cArr == null && i > 0) {
            try {
                cArr = new char[i];
            } catch (Throwable unused) {
                i /= 2;
                if (i < 512) {
                    break;
                }
            }
        }
        return cArr;
    }

    public static boolean OooO00o(String str, RunnableC9106ooo0oooo ooo0oooo) {
        return C9112oooO000O.OooO00o(f22614OooO00o, str, ooo0oooo);
    }

    public static boolean OooO00o(String str, boolean z) {
        if (C9110oooO000.OooO00o(z, "crash detail report")) {
            return false;
        }
        return OooO00o(str, new RunnableC9106ooo0oooo(752, new Object[]{str}));
    }

    public static String OooO00o(int i) {
        String str;
        m20885OooO0O0();
        synchronized (OooO00o) {
            str = OooO00o.get(i);
        }
        return str;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20881OooO00o(boolean z) {
        if (C9120oooO00oO.m20863OooO0o0() && !C9112oooO000O.m20811OooO0OO()) {
            C9278ooooo0.OooOOO();
            if (!C9110oooO000.m20776OooO00o()) {
                C9110oooO000.OooO00o(z);
            }
            if (C9112oooO000O.m20802OooO00o()) {
                m20886OooO0O0(z);
                OooO00o(C9112oooO000O.OooO0oO(), z);
                C9110oooO000.OooO0O0(z);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static File[] m20884OooO00o() {
        File[] listFiles = new File(C9120oooO00oO.m20856OooO0Oo()).listFiles();
        if (listFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            if (file.getPath().endsWith(".st")) {
                arrayList.add(file);
            }
        }
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }

    public static int OooO0O0() {
        File[] OooO00o2 = m20884OooO00o();
        if (OooO00o2 == null) {
            return 0;
        }
        int i = 0;
        for (File file : OooO00o2) {
            if (OooO00o(file.getAbsolutePath())) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* renamed from: OooO0O0  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m20886OooO0O0(boolean r3) {
        /*
            boolean r0 = com.p118pd.sdk.C9142oooO0oO0.f22616OooO00o
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.Object r0 = com.p118pd.sdk.C9142oooO0oO0.OooO0O0
            monitor-enter(r0)
            boolean r1 = com.p118pd.sdk.C9142oooO0oO0.f22616OooO00o     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return
        L_0x000e:
            java.lang.String r1 = "crash detail"
            boolean r3 = com.p118pd.sdk.C9110oooO000.OooO00o(r3, r1)     // Catch:{ all -> 0x0056 }
            if (r3 == 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return
        L_0x0018:
            r3 = 0
            boolean r1 = com.p118pd.sdk.C9112oooO000O.m20826OooOOO()     // Catch:{ all -> 0x0056 }
            r2 = 1
            if (r1 == 0) goto L_0x0031
            r3 = 2
            OooO00o(r3, r2)     // Catch:{ all -> 0x0056 }
            boolean r3 = com.p118pd.sdk.C9112oooO000O.m20827OooOOO0()     // Catch:{ all -> 0x0056 }
            if (r3 == 0) goto L_0x002f
            r3 = 42
            OooO00o(r3, r2)     // Catch:{ all -> 0x0056 }
        L_0x002f:
            r3 = 1
            goto L_0x0048
        L_0x0031:
            boolean r1 = com.p118pd.sdk.C9112oooO000O.m20828OooOOOO()     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x0048
            r3 = 101(0x65, float:1.42E-43)
            OooO00o(r3, r2)     // Catch:{ all -> 0x0056 }
            boolean r3 = com.p118pd.sdk.C9112oooO000O.m20827OooOOO0()     // Catch:{ all -> 0x0056 }
            if (r3 == 0) goto L_0x002f
            r3 = 43
            OooO00o(r3, r2)     // Catch:{ all -> 0x0056 }
            goto L_0x002f
        L_0x0048:
            if (r3 == 0) goto L_0x004d
            OooO00o(r2, r2)     // Catch:{ all -> 0x0056 }
        L_0x004d:
            r3 = 100
            OooO00o(r3, r2)     // Catch:{ all -> 0x0056 }
            com.p118pd.sdk.C9142oooO0oO0.f22616OooO00o = r2     // Catch:{ all -> 0x0056 }
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return
        L_0x0056:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x005a
        L_0x0059:
            throw r3
        L_0x005a:
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9142oooO0oO0.m20886OooO0O0(boolean):void");
    }

    public static int OooO00o() {
        File[] OooO00o2 = m20884OooO00o();
        if (OooO00o2 == null) {
            return 0;
        }
        int i = 0;
        for (File file : OooO00o2) {
            if (OooO00o(file.getAbsolutePath(), false)) {
                i++;
            }
        }
        return i;
    }

    public static boolean OooO00o(String str) {
        return OooO00o(str, new RunnableC9106ooo0oooo(753, new Object[]{str}));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20879OooO00o() {
        C9146oooO0oo0.OooO00o(1, new RunnableC9106ooo0oooo(700), 3000);
    }

    public static boolean OooO00o(int i, Object[] objArr) {
        switch (i) {
            case 751:
                if (f22617OooO0O0 || objArr != null) {
                    return m20882OooO00o(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue());
                }
                throw new AssertionError();
            case 752:
                if (f22617OooO0O0 || objArr != null) {
                    return OooO0O0((String) objArr[0]);
                }
                throw new AssertionError();
            case 753:
                if (f22617OooO0O0 || objArr != null) {
                    File file = new File((String) objArr[0]);
                    if (!file.exists()) {
                        return false;
                    }
                    file.delete();
                    return true;
                }
                throw new AssertionError();
            default:
                return false;
        }
    }

    public static void OooO0O0(int i) {
        if (i == 700) {
            m20886OooO0O0(false);
        }
    }
}
