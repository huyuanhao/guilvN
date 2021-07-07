package com.p118pd.sdk;

import android.content.pm.PackageInfo;
import android.util.Log;
import android.util.SparseArray;
import com.p273uc.crashsdk.JNIBridge;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.File;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.pd.sdk.oooO00o0  reason: case insensitive filesystem */
public class C9119oooO00o0 {
    public static int OooO = 0;
    public static int OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static long f22563OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final SparseArray<Object[]> f22564OooO00o = new SparseArray<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Runnable f22565OooO00o = new RunnableC9106ooo0oooo(201);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static String f22566OooO00o = "";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<String, Object[]> f22567OooO00o = new HashMap<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final List<String> f22568OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Map<String, String> f22569OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f22570OooO00o = false;
    public static int OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static String f22571OooO0O0 = "";

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final HashMap<String, Object[]> f22572OooO0O0 = new HashMap<>();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final List<String> f22573OooO0O0 = new ArrayList();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static boolean f22574OooO0O0 = false;
    public static int OooO0OO = 0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static String f22575OooO0OO = "";

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final HashMap<String, Object[]> f22576OooO0OO = new HashMap<>();

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final List<String> f22577OooO0OO = new ArrayList();

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static boolean f22578OooO0OO = false;
    public static int OooO0Oo = 0;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static String f22579OooO0Oo = null;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final List<Integer> f22580OooO0Oo = new ArrayList();

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static boolean f22581OooO0Oo = false;
    public static int OooO0o = 0;
    public static int OooO0o0 = 0;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final List<String> f22582OooO0o0 = new ArrayList();

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final /* synthetic */ boolean f22583OooO0o0 = (!C9119oooO00o0.class.desiredAssertionStatus());
    public static int OooO0oO = 0;
    public static int OooO0oo = 0;
    public static int OooOO0 = 0;
    public static int OooOO0O = 0;
    public static int OooOO0o = 0;
    public static int OooOOO = 0;
    public static int OooOOO0 = 0;

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20837OooO00o() {
        try {
            PackageInfo packageInfo = C9111oooO0000.OooO00o().getPackageManager().getPackageInfo(f22566OooO00o, 0);
            f22579OooO0Oo = packageInfo.versionName;
            f22563OooO00o = packageInfo.lastUpdateTime;
            OooO00o = packageInfo.versionCode;
            return true;
        } catch (Throwable th) {
            C9111oooO0000.OooO0O0(th);
            return false;
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static void m20839OooO0O0() {
        if (f22583OooO0o0 || C9112oooO000O.f22506OooO0Oo) {
            synchronized (f22569OooO00o) {
                for (String str : f22568OooO00o) {
                    JNIBridge.nativeAddHeaderInfo(str, f22569OooO00o.get(str));
                }
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static void m20840OooO0OO() {
        if (f22583OooO0o0 || C9112oooO000O.f22506OooO0Oo) {
            synchronized (f22567OooO00o) {
                for (String str : f22573OooO0O0) {
                    Object[] objArr = f22567OooO00o.get(str);
                    int intValue = ((Integer) objArr[0]).intValue();
                    if ((1048833 & intValue) != 0) {
                        JNIBridge.nativeAddDumpFile(str, (String) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue(), intValue, ((Boolean) objArr[4]).booleanValue());
                    }
                }
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static void m20841OooO0Oo() {
        if (f22583OooO0o0 || C9112oooO000O.f22506OooO0Oo) {
            synchronized (f22572OooO0O0) {
                for (String str : f22577OooO0OO) {
                    Object[] objArr = f22572OooO0O0.get(str);
                    int intValue = ((Integer) objArr[0]).intValue();
                    if ((1048833 & intValue) != 0) {
                        JNIBridge.nativeAddCallbackInfo(str, intValue, ((Long) objArr[2]).longValue(), ((Integer) objArr[3]).intValue());
                    }
                }
            }
            return;
        }
        throw new AssertionError();
    }

    public static void OooO0o() {
        OooO0oO();
        if (!f22578OooO0OO) {
            f22578OooO0OO = true;
            C9146oooO0oo0.OooO00o(0, new RunnableC9106ooo0oooo(202));
        } else if (C9112oooO000O.f22506OooO0Oo) {
            JNIBridge.OooO0O0(128, f22575OooO0OO);
        }
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public static void m20842OooO0o0() {
        if (f22583OooO0o0 || C9112oooO000O.f22506OooO0Oo) {
            synchronized (f22576OooO0OO) {
                for (String str : f22582OooO0o0) {
                    Object[] objArr = f22576OooO0OO.get(str);
                    int intValue = ((Integer) objArr[0]).intValue();
                    int intValue2 = ((Integer) objArr[1]).intValue();
                    List list = (List) objArr[2];
                    if ((1048577 & intValue2) != 0 && JNIBridge.nativeCreateCachedInfo(str, intValue, intValue2) != 0) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!JNIBridge.nativeAddCachedInfo(str, (String) it.next())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
            return;
        }
        throw new AssertionError();
    }

    public static void OooO0oO() {
        if (f22581OooO0Oo || !C9278ooooo0.m21201OooO0oO()) {
            return;
        }
        if (C9112oooO000O.f22506OooO0Oo || !C9112oooO000O.f22507OooO0o) {
            String format = String.format(Locale.US, "%s/%s/%s", C9120oooO00oO.m20846OooO00o(), C9120oooO00oO.m20850OooO0O0(), C9120oooO00oO.m20853OooO0OO());
            C9090ooOooo0O.OooO0O0("crashsdk", "UUID: " + C9278ooooo0.OooOO0o());
            C9090ooOooo0O.OooO0O0("crashsdk", "Version: " + format);
            C9090ooOooo0O.OooO0O0("crashsdk", "Process Name: " + C9278ooooo0.OooO());
            f22581OooO0Oo = true;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20832OooO00o() {
        String str = f22579OooO0Oo;
        if (str != null) {
            return str;
        }
        return m20837OooO00o() ? f22579OooO0Oo : "";
    }

    public static String OooO0O0() {
        StringBuilder sb = new StringBuilder();
        synchronized (f22567OooO00o) {
            boolean z = true;
            for (String str : f22573OooO0O0) {
                if (C9264ooooOOOo.OooO0O0(((Integer) f22567OooO00o.get(str)[0]).intValue())) {
                    if (!z) {
                        sb.append("`");
                    }
                    sb.append(str);
                    z = false;
                }
            }
        }
        return sb.toString();
    }

    public static String OooO0Oo() {
        StringBuilder sb = new StringBuilder();
        synchronized (f22576OooO0OO) {
            boolean z = true;
            for (String str : f22582OooO0o0) {
                if (C9264ooooOOOo.OooO0O0(((Integer) f22576OooO0OO.get(str)[1]).intValue())) {
                    if (!z) {
                        sb.append("`");
                    }
                    sb.append(str);
                    z = false;
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m20831OooO00o() {
        return f22563OooO00o;
    }

    public static int OooO00o() {
        if (OooO00o == -1) {
            m20837OooO00o();
        }
        return OooO00o;
    }

    public static String OooO0OO() {
        String sb;
        synchronized (f22572OooO0O0) {
            StringBuilder sb2 = new StringBuilder();
            synchronized (f22577OooO0OO) {
                boolean z = true;
                for (String str : f22577OooO0OO) {
                    if (C9264ooooOOOo.OooO0O0(((Integer) f22572OooO0O0.get(str)[0]).intValue())) {
                        if (!z) {
                            sb2.append("`");
                        }
                        sb2.append(str);
                        z = false;
                    }
                }
            }
            sb = sb2.toString();
        }
        return sb;
    }

    public static String OooO0o0() {
        if (!f22574OooO0O0) {
            String OooO00o2 = C9093ooOoooO0.OooO00o(C9112oooO000O.OooOOO());
            f22575OooO0OO = OooO00o2;
            f22574OooO0O0 = true;
            if (OooO00o2 == null) {
                f22575OooO0OO = "";
            }
        }
        return f22575OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20836OooO00o(String str, String str2) {
        synchronized (f22569OooO00o) {
            if (!f22569OooO00o.containsKey(str)) {
                f22568OooO00o.add(str);
            }
            f22569OooO00o.put(str, str2);
            if (C9112oooO000O.f22506OooO0Oo) {
                JNIBridge.nativeAddHeaderInfo(str, str2);
            }
            C9278ooooo0.OooOo0O();
        }
    }

    public static void OooO0O0(OutputStream outputStream, String str, String str2, ArrayList<String> arrayList) {
        synchronized (f22576OooO0OO) {
            for (String str3 : f22582OooO0o0) {
                Object[] objArr = f22576OooO0OO.get(str3);
                int intValue = ((Integer) objArr[0]).intValue();
                int intValue2 = ((Integer) objArr[1]).intValue();
                List<String> list = (List) objArr[2];
                if (arrayList == null) {
                    if (!C9264ooooOOOo.OooO0O0(intValue2)) {
                    }
                } else if (!OooO00o(arrayList, str3)) {
                }
                try {
                    outputStream.write(String.format(Locale.US, "%s (%d/%d)\n", str3, Integer.valueOf(list.size()), Integer.valueOf(intValue)).getBytes(str));
                } catch (Throwable th) {
                    C9278ooooo0.OooO00o(th, outputStream);
                }
                try {
                    for (String str4 : list) {
                        outputStream.write(str4.getBytes(str));
                        outputStream.write("\n".getBytes(str));
                    }
                } catch (Throwable th2) {
                    C9278ooooo0.OooO00o(th2, outputStream);
                }
                try {
                    outputStream.write("\n".getBytes(str));
                    outputStream.write(str2.getBytes(str));
                } catch (Throwable th3) {
                    C9278ooooo0.OooO00o(th3, outputStream);
                }
            }
            if (arrayList != null && C9278ooooo0.m21180OooO00o()) {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (!OooO00o(f22582OooO0o0, next)) {
                        C9278ooooo0.OooO00o(outputStream, "CUSTOMCACHEDINFO", next);
                    }
                }
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20835OooO00o() {
        StringBuilder sb = new StringBuilder();
        synchronized (f22569OooO00o) {
            for (String str : f22568OooO00o) {
                String str2 = f22569OooO00o.get(str);
                sb.append(str);
                sb.append(": ");
                if (str2 != null) {
                    sb.append(str2);
                }
                sb.append("\n");
            }
        }
        sb.append(String.format(Locale.US, "(saved at %s)\n", C9278ooooo0.OooOO0O()));
        C9093ooOoooO0.OooO00o(C9112oooO000O.OooO(), sb.toString());
    }

    public static void OooO00o(OutputStream outputStream, String str) {
        synchronized (f22569OooO00o) {
            for (String str2 : f22568OooO00o) {
                try {
                    StringBuilder sb = new StringBuilder(11);
                    sb.append(str2);
                    sb.append(": ");
                    String str3 = f22569OooO00o.get(str2);
                    if (str3 != null) {
                        sb.append(str3);
                    }
                    sb.append("\n");
                    outputStream.write(sb.toString().getBytes(str));
                } catch (Throwable th) {
                    C9278ooooo0.OooO00o(th, outputStream);
                }
            }
        }
    }

    public static String OooO0O0(String str) {
        StringBuilder sb = new StringBuilder();
        synchronized (f22576OooO0OO) {
            Object[] objArr = f22576OooO0OO.get(str);
            int intValue = ((Integer) objArr[0]).intValue();
            List<String> list = (List) objArr[2];
            sb.append(String.format(Locale.US, "%s (%d/%d)\n", str, Integer.valueOf(list.size()), Integer.valueOf(intValue)));
            for (String str2 : list) {
                sb.append(str2);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m20838OooO00o() {
        return new byte[]{24, 99, 121, 60};
    }

    public static int OooO00o(String str, String str2, boolean z, boolean z2, int i, boolean z3) {
        int i2;
        int i3;
        boolean z4;
        if (str == null || str2 == null) {
            return 0;
        }
        if (str.length() > 256) {
            C9090ooOooo0O.OooO00o("crashsdk", "addDumpFile: description is too long!", null);
            return 0;
        }
        synchronized (f22567OooO00o) {
            if (f22567OooO00o.containsKey(str)) {
                i3 = ((Integer) f22567OooO00o.get(str)[0]).intValue();
                i2 = C9264ooooOOOo.OooO00o(i3, i);
            } else {
                i2 = i;
                i3 = 0;
            }
            if (C9264ooooOOOo.OooO0O0(i2) && !C9264ooooOOOo.OooO0O0(i3)) {
                if (OooO0O0 >= 10) {
                    i2 = C9264ooooOOOo.OooO0O0(i2, 16);
                } else {
                    OooO0O0++;
                }
            }
            if (C9264ooooOOOo.OooO0OO(i2) && !C9264ooooOOOo.OooO0OO(i3)) {
                if (OooO0OO >= 10) {
                    i2 = C9264ooooOOOo.OooO0O0(i2, 1);
                } else {
                    OooO0OO++;
                }
            }
            if (C9264ooooOOOo.OooO0Oo(i2) && !C9264ooooOOOo.OooO0Oo(i3)) {
                if (OooO0Oo >= 10) {
                    i2 = C9264ooooOOOo.OooO0O0(i2, 256);
                } else {
                    OooO0Oo++;
                }
            }
            if (C9264ooooOOOo.OooO00o(i2) && !C9264ooooOOOo.OooO00o(i3)) {
                if (OooO0o0 >= 10) {
                    i2 = C9264ooooOOOo.OooO0O0(i2, 1048576);
                } else {
                    OooO0o0++;
                }
            }
            if ((1048849 & i2) == 0) {
                z4 = false;
            } else {
                if (i3 == 0) {
                    f22573OooO0O0.add(str);
                }
                z4 = true;
            }
            if (!z4) {
                return i2;
            }
            if (C9112oooO000O.f22506OooO0Oo && (1048833 & i) != 0) {
                int nativeAddDumpFile = JNIBridge.nativeAddDumpFile(str, str2, z, z2, i, z3);
                if (!C9264ooooOOOo.OooO0OO(nativeAddDumpFile)) {
                    i2 = C9264ooooOOOo.OooO0O0(i2, 1);
                }
                if (!C9264ooooOOOo.OooO0Oo(nativeAddDumpFile)) {
                    i2 = C9264ooooOOOo.OooO0O0(i2, 256);
                }
                if (!C9264ooooOOOo.OooO00o(nativeAddDumpFile)) {
                    i2 = C9264ooooOOOo.OooO0O0(i2, 1048576);
                }
            }
            f22567OooO00o.put(str, new Object[]{Integer.valueOf(i2), str2, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)});
            return i2;
        }
    }

    public static void OooO00o(OutputStream outputStream, String str, ArrayList<String> arrayList) {
        Throwable th;
        int i;
        boolean z = arrayList == null;
        boolean OooO00o2 = C9278ooooo0.m21180OooO00o();
        synchronized (f22567OooO00o) {
            int i2 = 0;
            for (String str2 : f22573OooO0O0) {
                try {
                    Object[] objArr = f22567OooO00o.get(str2);
                    if (arrayList == null) {
                        if (!C9264ooooOOOo.OooO0O0(((Integer) objArr[0]).intValue())) {
                        }
                    } else if (!OooO00o(arrayList, str2)) {
                    }
                    if (((Boolean) objArr[3]).booleanValue()) {
                        try {
                            outputStream.write((str2 + "\n").getBytes(str));
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    int i3 = i2 > 153600 ? 153600 : i2;
                    try {
                        int min = Math.min((int) UMModuleRegister.PUSH_EVENT_VALUE_HIGH, 153600 - i3);
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        String str3 = (String) objArr[1];
                        boolean booleanValue2 = ((Boolean) objArr[4]).booleanValue();
                        if (!OooO00o2 || str3.startsWith("/proc/")) {
                            if (booleanValue) {
                                i = C9278ooooo0.OooO00o(outputStream, str3, min);
                            } else {
                                i = C9278ooooo0.OooO0O0(outputStream, str3, min);
                            }
                            i3 += i;
                        } else {
                            C9278ooooo0.OooO00o(outputStream, "FILE", str3, min, booleanValue, booleanValue2);
                        }
                        i2 = i3;
                        if (booleanValue2 && z && !OooO00o2) {
                            File file = new File(str3);
                            if (file.exists()) {
                                file.delete();
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i2 = i3;
                        C9278ooooo0.OooO00o(th, outputStream);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    C9278ooooo0.OooO00o(th, outputStream);
                }
            }
            if (arrayList != null && OooO00o2) {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (!OooO00o(f22573OooO0O0, next)) {
                        C9278ooooo0.OooO00o(outputStream, "CUSTOMDUMPFILE", next);
                    }
                }
            }
        }
    }

    public static String OooO00o(String str) {
        synchronized (f22567OooO00o) {
            Object[] objArr = f22567OooO00o.get(str);
            if (objArr == null) {
                return null;
            }
            int i = 1;
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
            Locale locale = Locale.US;
            Object[] objArr2 = new Object[4];
            objArr2[0] = (String) objArr[1];
            objArr2[1] = "`";
            objArr2[2] = Integer.valueOf(booleanValue ? 1 : 0);
            if (!booleanValue2) {
                i = 0;
            }
            objArr2[3] = Integer.valueOf(i);
            return String.format(locale, "%s%s%d%d", objArr2);
        }
    }

    public static boolean OooO00o(List<String> list, String str) {
        if (C9111oooO0000.m20791OooO00o(str)) {
            return false;
        }
        for (String str2 : list) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0101 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int OooO00o(java.lang.String r16, int r17, java.util.concurrent.Callable<java.lang.String> r18, long r19, int r21) {
        /*
        // Method dump skipped, instructions count: 373
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9119oooO00o0.OooO00o(java.lang.String, int, java.util.concurrent.Callable, long, int):int");
    }

    public static void OooO00o(OutputStream outputStream, String str, String str2, ArrayList<String> arrayList) {
        String str3;
        synchronized (f22572OooO0O0) {
            for (String str4 : f22577OooO0OO) {
                try {
                    Object[] objArr = f22572OooO0O0.get(str4);
                    int intValue = ((Integer) objArr[0]).intValue();
                    if (arrayList == null) {
                        if (!C9264ooooOOOo.OooO0O0(intValue)) {
                        }
                    } else if (!OooO00o(arrayList, str4)) {
                    }
                    outputStream.write((str4 + "\n").getBytes(str));
                    long longValue = ((Long) objArr[2]).longValue();
                    if (longValue != 0) {
                        str3 = JNIBridge.nativeGetCallbackInfo(str4, longValue, ((Integer) objArr[3]).intValue(), false);
                    } else {
                        str3 = m20833OooO00o(str4, false).toString();
                    }
                    if (str3 == null || str3.length() <= 0) {
                        outputStream.write("(data is null)\n".getBytes(str));
                    } else {
                        outputStream.write(str3.getBytes(str));
                    }
                } catch (Throwable th) {
                    C9278ooooo0.OooO00o(th, outputStream);
                }
                try {
                    outputStream.write("\n".getBytes(str));
                    outputStream.write(str2.getBytes(str));
                } catch (Throwable th2) {
                    C9278ooooo0.OooO00o(th2, outputStream);
                }
            }
            if (arrayList != null && C9278ooooo0.m21180OooO00o()) {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (!OooO00o(f22577OooO0OO, next)) {
                        C9278ooooo0.OooO00o(outputStream, "CUSTOMCALLBACKINFO", next);
                    }
                }
            }
        }
    }

    public static String OooO00o(String str, boolean z) {
        String str2;
        synchronized (f22572OooO0O0) {
            Object[] objArr = f22572OooO0O0.get(str);
            long longValue = ((Long) objArr[2]).longValue();
            if (longValue != 0) {
                str2 = JNIBridge.nativeGetCallbackInfo(str, longValue, ((Integer) objArr[3]).intValue(), z);
            } else {
                str2 = m20833OooO00o(str, z).toString();
            }
        }
        return str2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static StringBuilder m20833OooO00o(String str, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr = f22572OooO0O0.get(str);
            if (objArr == null) {
                try {
                    str2 = "Unknown callback: " + str;
                } catch (Throwable th) {
                    sb.append("[DEBUG] Callback occurred new exception:\n");
                    sb.append(Log.getStackTraceString(th));
                }
            } else {
                Callable callable = (Callable) objArr[1];
                if (callable != null) {
                    str2 = (String) callable.call();
                } else {
                    str2 = C9113oooO000o.OooO00o(str, z);
                }
            }
            if (str2 != null) {
                sb.append(str2);
            }
        } catch (Throwable th2) {
            C9111oooO0000.OooO00o(th2);
        }
        try {
            if (sb.length() == 0) {
                sb.append("(data is null)\n");
            }
        } catch (Throwable th3) {
            C9111oooO0000.OooO00o(th3);
        }
        return sb;
    }

    public static boolean OooO00o(String str, Thread thread) {
        if (thread == null) {
            return false;
        }
        synchronized (f22564OooO00o) {
            int id = (int) thread.getId();
            if (f22564OooO00o.get(id) == null) {
                f22580OooO0Oo.add(Integer.valueOf(id));
            }
            WeakReference weakReference = new WeakReference(thread);
            f22564OooO00o.put(id, new Object[]{weakReference, str});
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084 A[Catch:{ all -> 0x00c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0087 A[Catch:{ all -> 0x00c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cc A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00da A[Catch:{ all -> 0x0102 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void OooO00o(java.io.OutputStream r13, java.lang.String r14, java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 293
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9119oooO00o0.OooO00o(java.io.OutputStream, java.lang.String, java.lang.String):void");
    }

    public static int OooO00o(String str, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        if (str == null || i <= 0) {
            return 0;
        }
        if (i > 1500) {
            C9090ooOooo0O.OooO00o("crashsdk", "createCachedInfo: capacity is too large!", null);
            return 0;
        }
        synchronized (f22576OooO0OO) {
            if (f22576OooO0OO.containsKey(str)) {
                i4 = ((Integer) f22576OooO0OO.get(str)[1]).intValue();
                i3 = C9264ooooOOOo.OooO00o(i4, i2);
            } else {
                i3 = i2;
                i4 = 0;
            }
            if (C9264ooooOOOo.OooO0O0(i3) && !C9264ooooOOOo.OooO0O0(i4)) {
                if (OooOO0o >= 8) {
                    i3 = C9264ooooOOOo.OooO0O0(i3, 16);
                } else {
                    OooOO0o++;
                }
            }
            if (C9264ooooOOOo.OooO0OO(i3) && !C9264ooooOOOo.OooO0OO(i4)) {
                if (OooOOO0 >= 8) {
                    i3 = C9264ooooOOOo.OooO0O0(i3, 1);
                } else {
                    OooOOO0++;
                }
            }
            if (C9264ooooOOOo.OooO00o(i3) && !C9264ooooOOOo.OooO00o(i4)) {
                if (OooOOO >= 8) {
                    i3 = C9264ooooOOOo.OooO0O0(i3, 1048576);
                } else {
                    OooOOO++;
                }
            }
            if ((1048849 & i3) == 0) {
                z = false;
            } else {
                if (i4 == 0) {
                    f22582OooO0o0.add(str);
                }
                z = true;
            }
            if (!z) {
                return i3;
            }
            if (C9112oooO000O.f22506OooO0Oo && (i2 & 1048577) != 0) {
                int nativeCreateCachedInfo = JNIBridge.nativeCreateCachedInfo(str, i, i3);
                if (!C9264ooooOOOo.OooO0OO(nativeCreateCachedInfo)) {
                    i3 = C9264ooooOOOo.OooO0O0(i3, 1);
                }
                if (!C9264ooooOOOo.OooO00o(nativeCreateCachedInfo)) {
                    i3 = C9264ooooOOOo.OooO0O0(i3, 1048576);
                }
            }
            f22576OooO0OO.put(str, new Object[]{Integer.valueOf(i), Integer.valueOf(i3), new ArrayList()});
            return i3;
        }
    }

    public static int OooO00o(String str, String str2) {
        int i;
        int i2 = 0;
        if (str == null || str2 == null) {
            return 0;
        }
        if (str2.length() > 2048) {
            str2 = str2.substring(0, 2048);
        }
        synchronized (f22576OooO0OO) {
            Object[] objArr = f22576OooO0OO.get(str);
            if (objArr != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int intValue2 = ((Integer) objArr[1]).intValue();
                List list = (List) objArr[2];
                if (list.size() >= intValue) {
                    list.remove(0);
                }
                list.add(str2);
                if (C9264ooooOOOo.OooO0O0(intValue2)) {
                    i2 = C9264ooooOOOo.OooO00o(0, 16);
                }
                if (!C9112oooO000O.f22506OooO0Oo) {
                    if (C9264ooooOOOo.OooO0OO(intValue2)) {
                        i2 = C9264ooooOOOo.OooO00o(i2, 1);
                    }
                    if (C9264ooooOOOo.OooO00o(intValue2)) {
                        i2 = C9264ooooOOOo.OooO00o(i2, 1048576);
                    }
                }
                i = i2;
                i2 = intValue2;
            } else {
                i = 0;
            }
            if (C9112oooO000O.f22506OooO0Oo && JNIBridge.nativeAddCachedInfo(str, str2)) {
                if (C9264ooooOOOo.OooO0OO(i2)) {
                    i = C9264ooooOOOo.OooO00o(i, 1);
                }
                if (C9264ooooOOOo.OooO00o(i2)) {
                    i = C9264ooooOOOo.OooO00o(i, 1048576);
                }
            }
        }
        return i;
    }

    public static int OooO00o(int i, String str) {
        if (C9111oooO0000.m20791OooO00o(str)) {
            str = Thread.currentThread().getName();
        }
        boolean z = false;
        z = false;
        if (C9264ooooOOOo.OooO0OO(i) || C9264ooooOOOo.OooO00o(i)) {
            if (C9112oooO000O.f22506OooO0Oo) {
                synchronized (f22564OooO00o) {
                    JNIBridge.nativeCmd(4, (long) i, str, null);
                }
                z = C9264ooooOOOo.OooO0OO(i);
                if (C9264ooooOOOo.OooO00o(i)) {
                    z = (z ? 1 : 0) | true;
                }
            } else {
                C9090ooOooo0O.OooO00o("crashsdk", "crashsdk so has not loaded!", null);
            }
        }
        if (!C9264ooooOOOo.OooO0O0(i)) {
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            return i2;
        }
        OooO00o(str, Thread.currentThread());
        int i7 = z ? 1 : 0;
        char c = z ? 1 : 0;
        char c2 = z ? 1 : 0;
        char c3 = z ? 1 : 0;
        return i7 | 16;
    }

    public static boolean OooO00o(boolean z) {
        int i;
        if (!C9112oooO000O.f22504OooO0OO) {
            C9090ooOooo0O.OooO00o("crashsdk", "Unexp log not enabled, skip update unexp info!");
            return false;
        } else if (C9278ooooo0.m21180OooO00o() || C9112oooO000O.m20811OooO0OO()) {
            return false;
        } else {
            if (z) {
                C9146oooO0oo0.OooO00o(f22565OooO00o);
                i = 0;
            } else if (!C9112oooO000O.OooOo0()) {
                C9090ooOooo0O.OooO00o("crashsdk", "Stop update unexp info in background!");
                return false;
            } else if (C9120oooO00oO.OooO0Oo() <= 0) {
                return false;
            } else {
                if (C9146oooO0oo0.m20891OooO00o(f22565OooO00o)) {
                    return true;
                }
                i = C9120oooO00oO.OooO0Oo() * 1000;
            }
            C9146oooO0oo0.OooO00o(0, f22565OooO00o, (long) i);
            return true;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static ArrayList<String> m20834OooO00o(String str) {
        if (C9111oooO0000.m20791OooO00o(str)) {
            return null;
        }
        String[] split = str.split(C7522o0Ooo0o.OooO0O0, 20);
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : split) {
            if (!C9111oooO0000.m20791OooO00o(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static void OooO00o(int i) {
        if (i == 201) {
            C9090ooOooo0O.OooO00o("crashsdk", "Begin update info ...");
            long currentTimeMillis = System.currentTimeMillis();
            if (C9112oooO000O.f22506OooO0Oo && f22570OooO00o) {
                JNIBridge.nativeCmd(11, (long) C9120oooO00oO.OooO0Oo(), String.valueOf(C9120oooO00oO.OooO0o0()), null);
            }
            C9090ooOooo0O.OooO00o("crashsdk", "Update info took " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            OooO00o(false);
        } else if (i == 202) {
            OooO0oO();
            String format = String.format(Locale.US, "%s/%s/%s", C9120oooO00oO.m20846OooO00o(), C9120oooO00oO.m20850OooO0O0(), C9120oooO00oO.m20853OooO0OO());
            f22575OooO0OO = OooO0o0();
            if (C9112oooO000O.f22506OooO0Oo) {
                JNIBridge.OooO0O0(128, f22575OooO0OO);
            }
            boolean z = !format.equals(f22575OooO0OO);
            if (z) {
                C9093ooOoooO0.OooO00o(C9112oooO000O.OooOOO(), format);
            }
            if (z && C9120oooO00oO.m20875OooOOOo()) {
                C9090ooOooo0O.OooO00o("crashsdk", String.format(Locale.US, "Is new version ('%s' -> '%s'), deleting old stats data!", f22575OooO0OO, format));
                C9112oooO000O.m20797OooO();
            }
        } else if (!f22583OooO0o0) {
            throw new AssertionError();
        }
    }
}
