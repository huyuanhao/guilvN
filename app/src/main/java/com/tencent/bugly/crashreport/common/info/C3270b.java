package com.tencent.bugly.crashreport.common.info;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.learnium.RNDeviceInfo.Util;
import com.p118pd.sdk.C8932ooOOO0o;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3325ap;
import com.umeng.message.proguard.C3848l;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.tencent.bugly.crashreport.common.info.b */
public class C3270b {

    /* renamed from: a */
    public static final String[] f7703a = {"/su", "/su/bin/su", "/sbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/data/local/su", "/system/xbin/su", "/system/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/system/bin/cufsdosck", "/system/xbin/cufsdosck", "/system/bin/cufsmgr", "/system/xbin/cufsmgr", "/system/bin/cufaevdd", "/system/xbin/cufaevdd", "/system/bin/conbb", "/system/xbin/conbb"};

    /* renamed from: b */
    public static final String[] f7704b = {"com.ami.duosupdater.ui", "com.ami.launchmetro", "com.ami.syncduosservices", "com.bluestacks.home", "com.bluestacks.windowsfilemanager", "com.bluestacks.settings", "com.bluestacks.bluestackslocationprovider", "com.bluestacks.appsettings", "com.bluestacks.bstfolder", "com.bluestacks.BstCommandProcessor", "com.bluestacks.s2p", "com.bluestacks.setup", "com.kaopu001.tiantianserver", "com.kpzs.helpercenter", "com.kaopu001.tiantianime", "com.android.development_settings", "com.android.development", "com.android.customlocale2", "com.genymotion.superuser", "com.genymotion.clipboardproxy", "com.uc.xxzs.keyboard", "com.uc.xxzs", "com.blue.huang17.agent", "com.blue.huang17.launcher", "com.blue.huang17.ime", "com.microvirt.guide", "com.microvirt.market", "com.microvirt.memuime", "cn.itools.vm.launcher", "cn.itools.vm.proxy", "cn.itools.vm.softkeyboard", "cn.itools.avdmarket", "com.syd.IME", "com.bignox.app.store.hd", "com.bignox.launcher", "com.bignox.app.phone", "com.bignox.app.noxservice", "com.android.noxpush", "com.haimawan.push", "me.haima.helpcenter", "com.windroy.launcher", "com.windroy.superuser", "com.windroy.launcher", "com.windroy.ime", "com.android.flysilkworm", "com.android.emu.inputservice", "com.tiantian.ime", "com.microvirt.launcher", "me.le8.androidassist", "com.vphone.helper", "com.vphone.launcher", "com.duoyi.giftcenter.giftcenter"};

    /* renamed from: c */
    public static final String[] f7705c = {"/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/qemud", "/dev/qemu_pipe", "/dev/socket/baseband_genyd", "/dev/socket/genyd"};

    /* renamed from: d */
    public static String f7706d;

    /* renamed from: e */
    public static String f7707e;

    /* renamed from: a */
    public static String m8028a() {
        try {
            return Build.MODEL;
        } catch (Throwable th) {
            if (C3321an.m8350a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    /* renamed from: a */
    public static String m8029a(Context context) {
        return "null";
    }

    /* renamed from: b */
    public static String m8031b() {
        try {
            return Build.VERSION.RELEASE;
        } catch (Throwable th) {
            if (C3321an.m8350a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    /* renamed from: b */
    public static String m8032b(Context context) {
        return "null";
    }

    /* renamed from: c */
    public static int m8033c() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Throwable th) {
            if (C3321an.m8350a(th)) {
                return -1;
            }
            th.printStackTrace();
            return -1;
        }
    }

    /* renamed from: d */
    public static String m8035d() {
        try {
            return Build.SERIAL;
        } catch (Throwable unused) {
            C3321an.m8349a("Failed to get hardware serial number.", new Object[0]);
            return "fail";
        }
    }

    /* renamed from: d */
    public static String m8036d(Context context) {
        return "null";
    }

    /* renamed from: e */
    public static String m8037e(Context context) {
        if (context == null) {
            return "fail";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return "fail";
            }
            String simSerialNumber = telephonyManager.getSimSerialNumber();
            if (simSerialNumber == null) {
                return "null";
            }
            return simSerialNumber;
        } catch (Throwable unused) {
            C3321an.m8349a("Failed to get SIM serial number.", new Object[0]);
            return "fail";
        }
    }

    /* renamed from: f */
    public static long m8039f() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return -1;
        }
    }

    /* renamed from: g */
    public static long m8041g() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0084 A[Catch:{ all -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089 A[SYNTHETIC, Splitter:B:46:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0099 A[SYNTHETIC, Splitter:B:53:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m8043h() {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.common.info.C3270b.m8043h():long");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.io.FileReader */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: java.io.FileReader */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0101 A[Catch:{ all -> 0x0127 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0106 A[SYNTHETIC, Splitter:B:76:0x0106] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0116 A[SYNTHETIC, Splitter:B:83:0x0116] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m8045i() {
        /*
        // Method dump skipped, instructions count: 329
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.common.info.C3270b.m8045i():long");
    }

    /* renamed from: j */
    public static long m8047j() {
        if (!m8038e()) {
            return 0;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            if (C3321an.m8350a(th)) {
                return -2;
            }
            th.printStackTrace();
            return -2;
        }
    }

    /* renamed from: k */
    public static long m8049k() {
        if (!m8038e()) {
            return 0;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            if (C3321an.m8350a(th)) {
                return -2;
            }
            th.printStackTrace();
            return -2;
        }
    }

    /* renamed from: l */
    public static String m8051l() {
        try {
            return Locale.getDefault().getCountry();
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return "fail";
        }
    }

    /* renamed from: m */
    public static String m8054m() {
        try {
            return Build.BRAND;
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
            return "fail";
        }
    }

    /* renamed from: n */
    public static boolean m8055n() {
        boolean z;
        String[] strArr = f7703a;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (new File(strArr[i]).exists()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        String str = Build.TAGS;
        if ((str != null && str.contains("test-keys")) || z) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0092 A[SYNTHETIC, Splitter:B:43:0x0092] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m8057o() {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.common.info.C3270b.m8057o():java.lang.String");
    }

    /* renamed from: p */
    public static String m8059p() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < f7705c.length; i++) {
            if (i == 0) {
                if (!new File(f7705c[i]).exists()) {
                    arrayList.add(Integer.valueOf(i));
                }
            } else if (new File(f7705c[i]).exists()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.toString();
    }

    /* renamed from: q */
    public static int m8061q() {
        try {
            Method method = Class.forName("android.app.ActivityManagerNative").getMethod("getDefault", new Class[0]);
            method.setAccessible(true);
            if (method.invoke(null, new Object[0]).getClass().getName().startsWith("$Proxy")) {
                return 256;
            }
            return 0;
        } catch (Exception unused) {
            return 256;
        }
    }

    /* renamed from: r */
    public static int m8063r() {
        try {
            throw new Exception("detect hook");
        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            int i = 0;
            int i2 = 0;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (stackTraceElement.getClassName().equals("de.robv.android.xposed.XposedBridge") && stackTraceElement.getMethodName().equals("main")) {
                    i |= 4;
                }
                if (stackTraceElement.getClassName().equals("de.robv.android.xposed.XposedBridge") && stackTraceElement.getMethodName().equals("handleHookedMethod")) {
                    i |= 8;
                }
                if (stackTraceElement.getClassName().equals("com.saurik.substrate.MS$2") && stackTraceElement.getMethodName().equals("invoked")) {
                    i |= 16;
                }
                if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit") && (i2 = i2 + 1) == 2) {
                    i |= 32;
                }
            }
            return i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00be A[SYNTHETIC, Splitter:B:49:0x00be] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m8064s() {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.common.info.C3270b.m8064s():int");
    }

    /* renamed from: a */
    public static String m8030a(Context context, boolean z) {
        String str = null;
        if (z) {
            try {
                String b = C3325ap.m8413b(context, "ro.product.cpu.abilist");
                if (C3325ap.m8404a(b) || b.equals("fail")) {
                    b = C3325ap.m8413b(context, "ro.product.cpu.abi");
                }
                if (!C3325ap.m8404a(b)) {
                    if (!b.equals("fail")) {
                        C3321an.m8351b(C3270b.class, "ABI list: " + b, new Object[0]);
                        str = b.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[0];
                    }
                }
            } catch (Throwable th) {
                if (!C3321an.m8350a(th)) {
                    th.printStackTrace();
                }
                return "fail";
            }
        }
        if (str == null) {
            str = System.getProperty("os.arch");
        }
        return "" + str;
    }

    /* renamed from: c */
    public static String m8034c(Context context) {
        if (context == null) {
            return "fail";
        }
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (string == null) {
                return "null";
            }
            return string.toLowerCase();
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                C3321an.m8349a("Failed to get Android ID.", new Object[0]);
            }
            return "fail";
        }
    }

    /* renamed from: e */
    public static boolean m8038e() {
        try {
            if (Environment.getExternalStorageState().equals("mounted")) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            if (C3321an.m8350a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: l */
    public static String m8052l(Context context) {
        StringBuilder sb = new StringBuilder();
        String b = C3325ap.m8413b(context, "gsm.sim.state");
        if (b != null) {
            sb.append("gsm.sim.state");
            sb.append("|");
            sb.append(b);
        }
        sb.append("\n");
        String b2 = C3325ap.m8413b(context, "gsm.sim.state2");
        if (b2 != null) {
            sb.append("gsm.sim.state2");
            sb.append("|");
            sb.append(b2);
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m8053m(android.content.Context r7) {
        /*
            r7 = 0
            r0 = 0
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0035 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x0035 }
            java.lang.String r4 = "/proc/uptime"
            r3.<init>(r4)     // Catch:{ all -> 0x0035 }
            r2.<init>(r3)     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x002b
            java.lang.String r3 = " "
            java.lang.String[] r1 = r1.split(r3)     // Catch:{ all -> 0x0034 }
            r1 = r1[r7]     // Catch:{ all -> 0x0034 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0034 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            float r3 = (float) r3     // Catch:{ all -> 0x0034 }
            float r7 = java.lang.Float.parseFloat(r1)     // Catch:{ all -> 0x0034 }
            float r3 = r3 - r7
            r0 = r3
        L_0x002b:
            r2.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0041
        L_0x002f:
            r7 = move-exception
            com.tencent.bugly.proguard.C3321an.m8350a(r7)
            goto L_0x0041
        L_0x0034:
            r1 = r2
        L_0x0035:
            java.lang.String r2 = "Failed to get boot time of device."
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0043 }
            com.tencent.bugly.proguard.C3321an.m8349a(r2, r7)     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0041
            r1.close()
        L_0x0041:
            long r0 = (long) r0
            return r0
        L_0x0043:
            r7 = move-exception
            if (r1 == 0) goto L_0x004e
            r1.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x004e
        L_0x004a:
            r0 = move-exception
            com.tencent.bugly.proguard.C3321an.m8350a(r0)
        L_0x004e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.common.info.C3270b.m8053m(android.content.Context):long");
    }

    /* renamed from: n */
    public static boolean m8056n(Context context) {
        return (m8058o(context) == null && m8059p() == null) ? false : true;
    }

    /* renamed from: q */
    public static int m8062q(Context context) {
        int i;
        PackageManager packageManager = context.getPackageManager();
        try {
            packageManager.getInstallerPackageName("de.robv.android.xposed.installer");
            i = 1;
        } catch (Exception unused) {
            i = 0;
        }
        try {
            packageManager.getInstallerPackageName("com.saurik.substrate");
            return i | 2;
        } catch (Exception unused2) {
            return i;
        }
    }

    /* renamed from: f */
    public static String m8040f(Context context) {
        TelephonyManager telephonyManager;
        String str;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getType() != 1) {
                if (activeNetworkInfo.getType() == 0 && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                    int networkType = telephonyManager.getNetworkType();
                    switch (networkType) {
                        case 1:
                            str = "GPRS";
                            break;
                        case 2:
                            str = "EDGE";
                            break;
                        case 3:
                            str = "UMTS";
                            break;
                        case 4:
                            str = "CDMA";
                            break;
                        case 5:
                            str = "EVDO_0";
                            break;
                        case 6:
                            str = "EVDO_A";
                            break;
                        case 7:
                            str = "1xRTT";
                            break;
                        case 8:
                            str = "HSDPA";
                            break;
                        case 9:
                            str = "HSUPA";
                            break;
                        case 10:
                            str = "HSPA";
                            break;
                        case 11:
                            str = "iDen";
                            break;
                        case 12:
                            str = "EVDO_B";
                            break;
                        case 13:
                            str = "LTE";
                            break;
                        case 14:
                            str = "eHRPD";
                            break;
                        case 15:
                            str = "HSPA+";
                            break;
                        default:
                            str = "MOBILE(" + networkType + C3848l.f10402t;
                            break;
                    }
                } else {
                    return "unknown";
                }
            } else {
                str = "WIFI";
            }
            return str;
        } catch (Exception e) {
            if (C3321an.m8350a(e)) {
                return "unknown";
            }
            e.printStackTrace();
            return "unknown";
        }
    }

    /* renamed from: g */
    public static String m8042g(Context context) {
        String b = C3325ap.m8413b(context, "ro.miui.ui.version.name");
        if (C3325ap.m8404a(b) || b.equals("fail")) {
            String b2 = C3325ap.m8413b(context, "ro.build.version.emui");
            if (C3325ap.m8404a(b2) || b2.equals("fail")) {
                String b3 = C3325ap.m8413b(context, "ro.lenovo.series");
                if (C3325ap.m8404a(b3) || b3.equals("fail")) {
                    String b4 = C3325ap.m8413b(context, "ro.build.nubia.rom.name");
                    if (C3325ap.m8404a(b4) || b4.equals("fail")) {
                        String b5 = C3325ap.m8413b(context, "ro.meizu.product.model");
                        if (C3325ap.m8404a(b5) || b5.equals("fail")) {
                            String b6 = C3325ap.m8413b(context, Util.KEY_VERSION_OPPO);
                            if (C3325ap.m8404a(b6) || b6.equals("fail")) {
                                String b7 = C3325ap.m8413b(context, "ro.vivo.os.build.display.id");
                                if (C3325ap.m8404a(b7) || b7.equals("fail")) {
                                    String b8 = C3325ap.m8413b(context, "ro.aa.romver");
                                    if (C3325ap.m8404a(b8) || b8.equals("fail")) {
                                        String b9 = C3325ap.m8413b(context, "ro.lewa.version");
                                        if (C3325ap.m8404a(b9) || b9.equals("fail")) {
                                            String b10 = C3325ap.m8413b(context, "ro.gn.gnromvernumber");
                                            if (C3325ap.m8404a(b10) || b10.equals("fail")) {
                                                String b11 = C3325ap.m8413b(context, "ro.build.tyd.kbstyle_version");
                                                if (C3325ap.m8404a(b11) || b11.equals("fail")) {
                                                    return C3325ap.m8413b(context, "ro.build.fingerprint") + C8932ooOOO0o.OooO0OO + C3325ap.m8413b(context, "ro.build.rom.id");
                                                }
                                                return "dido/" + b11;
                                            }
                                            return "amigo/" + b10 + C8932ooOOO0o.OooO0OO + C3325ap.m8413b(context, "ro.build.display.id");
                                        }
                                        return "tcl/" + b9 + C8932ooOOO0o.OooO0OO + C3325ap.m8413b(context, "ro.build.display.id");
                                    }
                                    return "htc/" + b8 + C8932ooOOO0o.OooO0OO + C3325ap.m8413b(context, "ro.build.description");
                                }
                                return "vivo/FUNTOUCH/" + b7;
                            }
                            return "Oppo/COLOROS/" + b6;
                        }
                        return "Meizu/FLYME/" + C3325ap.m8413b(context, "ro.build.display.id");
                    }
                    return "Zte/NUBIA/" + b4 + "_" + C3325ap.m8413b(context, "ro.build.nubia.rom.code");
                }
                String b12 = C3325ap.m8413b(context, "ro.build.version.incremental");
                return "Lenovo/VIBE/" + b12;
            }
            return "HuaWei/EMOTION/" + b2;
        }
        return "XiaoMi/MIUI/" + b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x008f A[SYNTHETIC, Splitter:B:34:0x008f] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m8048j(android.content.Context r6) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.common.info.C3270b.m8048j(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a7 A[Catch:{ IOException -> 0x00ab }] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m8050k(android.content.Context r8) {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.common.info.C3270b.m8050k(android.content.Context):java.lang.String");
    }

    /* renamed from: p */
    public static boolean m8060p(Context context) {
        return (((m8062q(context) | m8063r()) | m8064s()) | m8061q()) > 0;
    }

    /* renamed from: o */
    public static String m8058o(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String[] strArr = f7704b;
            if (i >= strArr.length) {
                break;
            }
            try {
                packageManager.getPackageInfo(strArr[i], 1);
                arrayList.add(Integer.valueOf(i));
            } catch (PackageManager.NameNotFoundException unused) {
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.toString();
    }

    /* renamed from: h */
    public static String m8044h(Context context) {
        return C3325ap.m8413b(context, "ro.board.platform");
    }

    /* renamed from: i */
    public static String m8046i(Context context) {
        StringBuilder sb = new StringBuilder();
        String b = C3325ap.m8413b(context, "ro.genymotion.version");
        if (b != null) {
            sb.append("ro.genymotion.version");
            sb.append("|");
            sb.append(b);
            sb.append("\n");
        }
        String b2 = C3325ap.m8413b(context, "androVM.vbox_dpi");
        if (b2 != null) {
            sb.append("androVM.vbox_dpi");
            sb.append("|");
            sb.append(b2);
            sb.append("\n");
        }
        String b3 = C3325ap.m8413b(context, "qemu.sf.fake_camera");
        if (b3 != null) {
            sb.append("qemu.sf.fake_camera");
            sb.append("|");
            sb.append(b3);
        }
        return sb.toString();
    }
}
