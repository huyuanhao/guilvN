package com.p118pd.sdk;

import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import com.p273uc.crashsdk.JNIBridge;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.lang.reflect.Field;

/* renamed from: com.pd.sdk.oooO00oO  reason: case insensitive filesystem */
public class C9120oooO00oO {
    public static C9115oooO00O0 OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static C9263ooooOOOO f22584OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f22585OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static String f22586OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final /* synthetic */ boolean f22587OooO00o = (!C9120oooO00oO.class.desiredAssertionStatus());
    public static final Object OooO0O0 = new Object();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static String f22588OooO0O0 = null;
    public static String OooO0OO = null;
    public static String OooO0Oo = null;

    /* renamed from: OooO  reason: collision with other method in class */
    public static String m20843OooO() {
        return OooO00o.f22533OooO0O0;
    }

    public static void OooO00o(C9115oooO00O0 oooo00o0, C9263ooooOOOO oooooooo) {
        C9115oooO00O0 oooo00o02 = new C9115oooO00O0(oooo00o0);
        OooO00o = oooo00o02;
        OooO0O0(oooo00o02);
        f22584OooO00o = new C9263ooooOOOO(oooooooo);
        if (!C9112oooO000O.m20811OooO0OO()) {
            try {
                m20851OooO0O0();
            } catch (Throwable th) {
                C9111oooO0000.OooO00o(th);
            }
        }
    }

    public static void OooO0O0(C9115oooO00O0 oooo00o0) {
        if (oooo00o0.f22547OooO0oo == null) {
            oooo00o0.f22547OooO0oo = "";
        }
        if (!oooo00o0.f22547OooO0oo.equals(".tmp")) {
            if (oooo00o0.f22540OooO0Oo) {
                oooo00o0.f22528OooO = false;
            }
            if (oooo00o0.f22544OooO0o0) {
                oooo00o0.f22549OooOO0 = false;
            }
            long OooO00o2 = C9278ooooo0.OooO00o();
            if (OooO00o2 >= 1) {
                oooo00o0.OooO00o = 200;
                oooo00o0.OooO0O0 = 100;
                oooo00o0.f22529OooO00o = 268435456;
                oooo00o0.OooOO0O = 2000;
                oooo00o0.OooOO0o = 2000;
                oooo00o0.OooOOO0 = 100;
                oooo00o0.OooOOO = 100;
                oooo00o0.OooOo0O = 2;
                if (OooO00o2 >= 2) {
                    oooo00o0.f22534OooO0O0 = true;
                    oooo00o0.f22537OooO0OO = true;
                    if (OooO00o2 >= 3) {
                        oooo00o0.f22531OooO00o = true;
                        oooo00o0.f22557OooOOo0 = true;
                        oooo00o0.f22556OooOOo = true;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("mZippedLogExtension can not be '.tmp'!");
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static void m20854OooO0OO() {
        JNIBridge.OooO0O0(103, C9111oooO0000.m20785OooO00o());
        JNIBridge.OooO0O0(104, OooO00o.f22543OooO0o0);
        JNIBridge.OooO0O0(105, OooO00o.f22541OooO0o);
        JNIBridge.OooO0O0(106, m20859OooO0o());
        JNIBridge.OooO0O0(107, C9278ooooo0.OooO());
        JNIBridge.OooO0O0(108, C9112oooO000O.OooO0o0());
        JNIBridge.OooO0O0(109, m20846OooO00o());
        JNIBridge.OooO0O0(110, m20850OooO0O0());
        JNIBridge.OooO0O0(111, m20853OooO0OO());
        JNIBridge.OooO0O0(112, "200403192109");
        JNIBridge.OooO0O0(116, Build.MODEL);
        JNIBridge.OooO0O0(117, Build.VERSION.RELEASE);
        JNIBridge.OooO0O0(118, C9278ooooo0.OooOO0o());
        JNIBridge.OooO00o(5, OooO00o.f22549OooOO0);
        JNIBridge.OooO00o(6, OooO00o.f22542OooO0o);
        JNIBridge.OooO00o(7, OooO00o.f22532OooO0O0);
        JNIBridge.OooO0O0(100, OooO00o.f22536OooO0OO);
        JNIBridge.OooO0O0(101, OooO00o.f22539OooO0Oo);
        JNIBridge.OooO0O0(102, OooO00o.f22530OooO00o);
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static void m20857OooO0Oo() {
        JNIBridge.OooO00o(11, m20858OooO0Oo());
        JNIBridge.OooO00o(12, OooO00o.f22531OooO00o);
        JNIBridge.OooO00o(13, (long) OooO00o.OooOOOO);
        JNIBridge.OooO00o(14, (long) OooO00o.OooO00o);
        JNIBridge.OooO00o(15, (long) OooO00o.OooO0Oo);
        JNIBridge.OooO00o(16, (long) OooO00o.OooO0o0);
        JNIBridge.OooO00o(31, (long) OooO00o.OooO0o);
        JNIBridge.OooO00o(18, m20855OooO0OO());
        JNIBridge.OooO00o(20, (long) Build.VERSION.SDK_INT);
        JNIBridge.OooO00o(21, OooO00o.f22544OooO0o0);
        JNIBridge.OooO00o(32, (long) OooO00o.OooOOO);
        JNIBridge.OooO00o(8, OooO00o.f22535OooO0OO);
        JNIBridge.OooO00o(9, OooO00o.f22538OooO0Oo);
        JNIBridge.nativeSet(3, OooO00o.f22548OooO0oo ? 1 : 0, OooO00o.f22547OooO0oo, null);
        JNIBridge.OooO00o(4, (long) OooO00o.OooO);
        JNIBridge.OooO0O0(119, Build.FINGERPRINT);
    }

    public static int OooO0o() {
        return OooO00o.OooOOo;
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public static void m20862OooO0o0() {
        JNIBridge.OooO00o(23, OooO00o.f22552OooOOO);
        if (C9112oooO000O.m20809OooO0O0()) {
            JNIBridge.OooO00o(34, true);
        }
        if (C9278ooooo0.m21203OooO0oo()) {
            JNIBridge.OooO00o(1, true);
        }
        JNIBridge.OooO00o(10, (long) OooO00o.OooOo00);
        JNIBridge.nativeCmd(3, (long) OooO00o.OooOOoo, null, null);
        JNIBridge.nativeSetForeground(C9112oooO000O.OooOo0());
        JNIBridge.OooO00o(2, C9112oooO000O.m20802OooO00o());
        C9119oooO00o0.m20839OooO0O0();
        C9119oooO00o0.m20840OooO0OO();
        C9119oooO00o0.m20841OooO0Oo();
        C9119oooO00o0.m20842OooO0o0();
        JNIBridge.OooO0O0(113, C9119oooO00o0.f22566OooO00o);
        JNIBridge.OooO00o(1);
        JNIBridge.OooO00o(22, (long) OooO00o.OooOo0);
        JNIBridge.OooO0O0(TinkerReport.KEY_APPLIED_DEXOPT_EXIST, C9119oooO00o0.m20832OooO00o());
        JNIBridge.OooO00o(33, (long) C9119oooO00o0.OooO00o());
        m20847OooO00o();
        C9112oooO000O.m20810OooO0OO();
        C9112oooO000O.m20801OooO00o();
        C9111oooO0000.m20793OooO0O0();
    }

    public static int OooO0oO() {
        return OooO00o.OooOo00;
    }

    /* renamed from: OooO0oo  reason: collision with other method in class */
    public static String m20866OooO0oo() {
        return OooO00o.f22530OooO00o;
    }

    public static int OooOO0() {
        return OooO00o.OooOOOO;
    }

    /* renamed from: OooOO0O  reason: collision with other method in class */
    public static boolean m20870OooOO0O() {
        return OooO00o.f22551OooOO0o;
    }

    public static int OooOO0o() {
        return OooO00o.OooO0O0;
    }

    public static int OooOOO() {
        return OooO00o.OooO0oO;
    }

    public static int OooOOO0() {
        return OooO00o.OooO0OO;
    }

    public static int OooOOOO() {
        return OooO00o.OooO0oo;
    }

    /* renamed from: OooOOOo  reason: collision with other method in class */
    public static boolean m20875OooOOOo() {
        return OooO00o.f22546OooO0oO;
    }

    public static boolean OooOOo() {
        return OooO00o.f22558OooOOoo;
    }

    /* renamed from: OooOOo0  reason: collision with other method in class */
    public static boolean m20876OooOOo0() {
        return OooO00o.f22548OooO0oo;
    }

    /* renamed from: OooO  reason: collision with other method in class */
    public static boolean m20844OooO() {
        return OooO00o.f22528OooO;
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public static boolean m20860OooO0o() {
        return OooO00o.f22552OooOOO;
    }

    /* renamed from: OooO0oO  reason: collision with other method in class */
    public static boolean m20865OooO0oO() {
        return OooO00o.f22559OooOo00;
    }

    /* renamed from: OooO0oo  reason: collision with other method in class */
    public static boolean m20867OooO0oo() {
        if (!C9111oooO0000.OooO0O0(OooO00o.f22533OooO0O0) && !C9111oooO0000.OooO0O0(OooO00o.f22536OooO0OO)) {
            return C9111oooO0000.OooO0O0(OooO00o.f22539OooO0Oo);
        }
        return true;
    }

    /* renamed from: OooOO0  reason: collision with other method in class */
    public static boolean m20869OooOO0() {
        return OooO00o.f22550OooOO0O;
    }

    public static int OooOO0O() {
        return OooO00o.OooO00o;
    }

    /* renamed from: OooOO0o  reason: collision with other method in class */
    public static boolean m20871OooOO0o() {
        return OooO00o.f22531OooO00o;
    }

    /* renamed from: OooOOO  reason: collision with other method in class */
    public static boolean m20872OooOOO() {
        return OooO00o.f22537OooO0OO;
    }

    /* renamed from: OooOOO0  reason: collision with other method in class */
    public static boolean m20873OooOOO0() {
        return OooO00o.f22534OooO0O0;
    }

    /* renamed from: OooOOOO  reason: collision with other method in class */
    public static boolean m20874OooOOOO() {
        return OooO00o.f22540OooO0Oo;
    }

    public static int OooOOOo() {
        return OooO00o.OooO;
    }

    public static int OooOOo0() {
        return OooO00o.OooOO0;
    }

    public static int OooO() {
        return OooO00o.OooOo0O;
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public static String m20859OooO0o() {
        String str;
        if (OooO0Oo == null) {
            if (!C9111oooO0000.m20791OooO00o(OooO00o.f22545OooO0oO)) {
                String trim = OooO00o.f22545OooO0oO.trim();
                if (!trim.endsWith(File.separator)) {
                    trim = trim + File.separator;
                }
                OooO0Oo = trim;
            } else {
                if (!C9112oooO000O.m20811OooO0OO()) {
                    try {
                        str = Environment.getExternalStorageDirectory().getPath();
                    } catch (Throwable th) {
                        C9111oooO0000.OooO00o(th);
                    }
                    OooO0Oo = str + File.separatorChar + OooO00o.f22541OooO0o + File.separatorChar;
                }
                str = "/sdcard";
                OooO0Oo = str + File.separatorChar + OooO00o.f22541OooO0o + File.separatorChar;
            }
        }
        return OooO0Oo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r1 != null) goto L_0x0034;
     */
    /* renamed from: OooO0oO  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m20864OooO0oO() {
        /*
            java.lang.String r0 = com.p118pd.sdk.C9120oooO00oO.f22586OooO00o
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch:{ all -> 0x003a }
            java.lang.String r2 = com.p118pd.sdk.C9111oooO0000.OooO0O0()     // Catch:{ all -> 0x003a }
            r1.<init>(r2)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "classes.dex"
            java.util.zip.ZipEntry r0 = r1.getEntry(r0)     // Catch:{ all -> 0x0038 }
            long r2 = r0.getCrc()     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = java.lang.Long.toHexString(r2)     // Catch:{ all -> 0x0038 }
            com.p118pd.sdk.C9120oooO00oO.f22586OooO00o = r0     // Catch:{ all -> 0x0038 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "version unique build id: "
            r0.<init>(r2)     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = com.p118pd.sdk.C9120oooO00oO.f22586OooO00o     // Catch:{ all -> 0x0038 }
            r0.append(r2)     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "crashsdk"
            com.p118pd.sdk.C9090ooOooo0O.OooO00o(r2, r0)     // Catch:{ all -> 0x0038 }
        L_0x0034:
            r1.close()     // Catch:{ all -> 0x0048 }
            goto L_0x0048
        L_0x0038:
            r0 = move-exception
            goto L_0x003e
        L_0x003a:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x003e:
            java.lang.String r2 = ""
            com.p118pd.sdk.C9120oooO00oO.f22586OooO00o = r2     // Catch:{ all -> 0x004b }
            com.p118pd.sdk.C9111oooO0000.OooO00o(r0)     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x0048
            goto L_0x0034
        L_0x0048:
            java.lang.String r0 = com.p118pd.sdk.C9120oooO00oO.f22586OooO00o
            return r0
        L_0x004b:
            r0 = move-exception
            if (r1 == 0) goto L_0x0051
            r1.close()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            goto L_0x0053
        L_0x0052:
            throw r0
        L_0x0053:
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9120oooO00oO.m20864OooO0oO():java.lang.String");
    }

    /* renamed from: OooOO0  reason: collision with other method in class */
    public static String m20868OooOO0() {
        return OooO00o.f22547OooO0oo;
    }

    public static int OooO0oo() {
        return OooO00o.OooOo0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20848OooO00o(C9115oooO00O0 oooo00o0) {
        if (!f22587OooO00o && oooo00o0.f22543OooO0o0 == null) {
            throw new AssertionError();
        } else if (!f22587OooO00o && oooo00o0.f22541OooO0o == null) {
            throw new AssertionError();
        } else if (oooo00o0.f22543OooO0o0.equals(oooo00o0.f22541OooO0o)) {
            throw new IllegalArgumentException("mTagFilesFolderName and mCrashLogsFolderName can not be set to the same!");
        }
    }

    public static void OooO00o(C9263ooooOOOO oooooooo) {
        synchronized (f22585OooO00o) {
            f22584OooO00o = new C9263ooooOOOO(oooooooo);
            C9278ooooo0.m21208OooOOO0();
            if (C9112oooO000O.f22506OooO0Oo) {
                JNIBridge.OooO0O0(109, m20846OooO00o());
                JNIBridge.OooO0O0(110, m20850OooO0O0());
                JNIBridge.OooO0O0(111, m20853OooO0OO());
                JNIBridge.OooO0O0(112, "200403192109");
                JNIBridge.OooO00o(2);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m20845OooO00o() {
        return OooO00o.f22529OooO00o;
    }

    public static int OooO00o() {
        return OooO00o.OooOO0O;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20849OooO00o() {
        return OooO00o.f22554OooOOOO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20846OooO00o() {
        if (C9111oooO0000.m20791OooO00o(f22584OooO00o.OooO00o)) {
            return C9119oooO00o0.m20832OooO00o();
        }
        return OooO00o(f22584OooO00o.OooO00o);
    }

    public static int OooO0Oo() {
        return OooO00o.OooOOOo;
    }

    public static String OooO00o(String str) {
        return (str == null || !str.contains("_")) ? str : str.replaceAll("_", Constants.ACCEPT_TIME_SEPARATOR_SERVER);
    }

    public static int OooO0OO() {
        return OooO00o.OooOOO0;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static boolean m20858OooO0Oo() {
        C9115oooO00O0 oooo00o0 = OooO00o;
        return oooo00o0 == null || oooo00o0.f22557OooOOo0;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static boolean m20855OooO0OO() {
        C9115oooO00O0 oooo00o0 = OooO00o;
        return oooo00o0 == null || oooo00o0.f22556OooOOo;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static String m20856OooO0Oo() {
        if (f22588OooO0O0 == null) {
            f22588OooO0O0 = C9111oooO0000.m20785OooO00o() + File.separatorChar + OooO00o.f22543OooO0o0 + File.separatorChar;
        }
        return f22588OooO0O0;
    }

    public static C9115oooO00O0 OooO00o(C9115oooO00O0 oooo00o0, Bundle bundle) {
        if (oooo00o0 == null) {
            C9115oooO00O0 oooo00o02 = OooO00o;
            if (oooo00o02 == null) {
                oooo00o0 = new C9115oooO00O0();
            } else {
                oooo00o0 = new C9115oooO00O0(oooo00o02);
            }
        }
        Field[] fields = oooo00o0.getClass().getFields();
        for (String str : bundle.keySet()) {
            for (Field field : fields) {
                if (field.getName().equals(str)) {
                    Object obj = bundle.get(str);
                    try {
                        field.set(oooo00o0, obj);
                    } catch (Exception e) {
                        C9111oooO0000.OooO00o(e);
                        StringBuilder sb = new StringBuilder("Field ");
                        sb.append(str);
                        sb.append(" must be a ");
                        sb.append(field.getType().getName());
                        sb.append(", but give a ");
                        sb.append(obj != null ? obj.getClass().getName() : "(null)");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return oooo00o0;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static String m20853OooO0OO() {
        if (C9111oooO0000.m20791OooO00o(f22584OooO00o.OooO0OO)) {
            return m20864OooO0oO();
        }
        return OooO00o(f22584OooO00o.OooO0OO);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static void m20851OooO0O0() {
        C9112oooO000O.OooOOo();
        C9112oooO000O.m20830OooOOo0();
        if (OooO00o.f22531OooO00o) {
            File file = new File(m20859OooO0o());
            if (!file.exists()) {
                file.mkdirs();
            }
        }
    }

    public static int OooO0o0() {
        return OooO00o.OooOOo0;
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public static boolean m20863OooO0o0() {
        return OooO00o.f22553OooOOO0;
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public static String m20861OooO0o0() {
        if (OooO0OO == null) {
            OooO0OO = C9111oooO0000.m20785OooO00o() + File.separatorChar + OooO00o.f22541OooO0o + File.separatorChar;
        }
        return OooO0OO;
    }

    public static int OooO0O0() {
        return OooO00o.OooOO0o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m20852OooO0O0() {
        return OooO00o.f22555OooOOOo;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static String m20850OooO0O0() {
        if (C9111oooO0000.m20791OooO00o(f22584OooO00o.OooO0O0)) {
            return "release";
        }
        return f22584OooO00o.OooO0O0;
    }

    public static C9263ooooOOOO OooO00o(Bundle bundle) {
        C9263ooooOOOO oooooooo;
        C9263ooooOOOO oooooooo2 = f22584OooO00o;
        if (oooooooo2 == null) {
            oooooooo = new C9263ooooOOOO();
        } else {
            oooooooo = new C9263ooooOOOO(oooooooo2);
        }
        String string = bundle.getString("mVersion");
        if (!C9111oooO0000.m20791OooO00o(string)) {
            oooooooo.OooO00o = string;
        }
        String string2 = bundle.getString("mSubVersion");
        if (!C9111oooO0000.m20791OooO00o(string2)) {
            oooooooo.OooO0O0 = string2;
        }
        String string3 = bundle.getString("mBuildId");
        if (!C9111oooO0000.m20791OooO00o(string3)) {
            oooooooo.OooO0OO = string3;
        }
        String string4 = bundle.getString("crver");
        if (!C9111oooO0000.m20791OooO00o(string4)) {
            C9119oooO00o0.f22571OooO0O0 = string4;
            m20847OooO00o();
        }
        return oooooooo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20847OooO00o() {
        if (C9112oooO000O.f22506OooO0Oo) {
            JNIBridge.nativeSet(24, 1, C9119oooO00o0.f22571OooO0O0, null);
        }
    }

    public static boolean OooO00o(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static int OooO00o(C9115oooO00O0 oooo00o0) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        synchronized (OooO0O0) {
            i = 0;
            if (oooo00o0 != null) {
                OooO0O0(oooo00o0);
                if (OooO00o == null) {
                    OooO00o = new C9115oooO00O0();
                }
                C9115oooO00O0 oooo00o02 = OooO00o;
                boolean z3 = true;
                if (!OooO00o(oooo00o0.f22530OooO00o, oooo00o02.f22530OooO00o)) {
                    String str = oooo00o0.f22530OooO00o;
                    oooo00o02.f22530OooO00o = str;
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO0O0(102, str);
                    }
                    i2 = 1;
                    z = true;
                } else {
                    i2 = 0;
                    z = false;
                }
                if (!OooO00o(oooo00o0.f22533OooO0O0, oooo00o02.f22533OooO0O0)) {
                    oooo00o02.f22533OooO0O0 = oooo00o0.f22533OooO0O0;
                    i2++;
                }
                if (!OooO00o(oooo00o0.f22536OooO0OO, oooo00o02.f22536OooO0OO)) {
                    String str2 = oooo00o0.f22536OooO0OO;
                    oooo00o02.f22536OooO0OO = str2;
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO0O0(100, str2);
                    }
                    i2++;
                    z = true;
                }
                if (!OooO00o(oooo00o0.f22539OooO0Oo, oooo00o02.f22539OooO0Oo)) {
                    String str3 = oooo00o0.f22539OooO0Oo;
                    oooo00o02.f22539OooO0Oo = str3;
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO0O0(101, str3);
                    }
                    i2++;
                    z = true;
                }
                if (z) {
                    C9278ooooo0.m21208OooOOO0();
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO00o(2);
                    }
                }
                if (oooo00o02.f22557OooOOo0 != oooo00o0.f22557OooOOo0) {
                    boolean z4 = oooo00o0.f22557OooOOo0;
                    oooo00o02.f22557OooOOo0 = z4;
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO00o(11, z4);
                    }
                    i2++;
                }
                if (oooo00o02.f22556OooOOo != oooo00o0.f22556OooOOo) {
                    boolean z5 = oooo00o0.f22556OooOOo;
                    oooo00o02.f22556OooOOo = z5;
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO00o(18, z5);
                    }
                    i2++;
                }
                if (oooo00o02.f22531OooO00o != oooo00o0.f22531OooO00o) {
                    boolean z6 = oooo00o0.f22531OooO00o;
                    oooo00o02.f22531OooO00o = z6;
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO00o(12, z6);
                    }
                    i2++;
                }
                if (oooo00o02.f22544OooO0o0 != oooo00o0.f22544OooO0o0) {
                    boolean z7 = oooo00o0.f22544OooO0o0;
                    oooo00o02.f22544OooO0o0 = z7;
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO00o(21, z7);
                    }
                    i2++;
                }
                if (oooo00o02.OooOOOO != oooo00o0.OooOOOO) {
                    int i3 = oooo00o0.OooOOOO;
                    oooo00o02.OooOOOO = i3;
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO00o(13, (long) i3);
                    }
                    if (oooo00o02.OooOOOO >= 0) {
                        C9112oooO000O.m20812OooO0Oo();
                    }
                    i2++;
                }
                if (oooo00o02.OooO00o != oooo00o0.OooO00o) {
                    int i4 = oooo00o0.OooO00o;
                    oooo00o02.OooO00o = i4;
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO00o(14, (long) i4);
                    }
                    i2++;
                }
                if (oooo00o02.OooO0Oo != oooo00o0.OooO0Oo) {
                    int i5 = oooo00o0.OooO0Oo;
                    oooo00o02.OooO0Oo = i5;
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO00o(15, (long) i5);
                    }
                    i2++;
                }
                if (oooo00o02.OooO0OO != oooo00o0.OooO0OO) {
                    oooo00o02.OooO0OO = oooo00o0.OooO0OO;
                    i2++;
                }
                if (oooo00o02.OooO0o0 != oooo00o0.OooO0o0) {
                    int i6 = oooo00o0.OooO0o0;
                    oooo00o02.OooO0o0 = i6;
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO00o(16, (long) i6);
                    }
                    i2++;
                }
                if (oooo00o02.OooO0o != oooo00o0.OooO0o) {
                    int i7 = oooo00o0.OooO0o;
                    oooo00o02.OooO0o = i7;
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO00o(31, (long) i7);
                    }
                    i2++;
                }
                if (oooo00o02.f22548OooO0oo != oooo00o0.f22548OooO0oo) {
                    oooo00o02.f22548OooO0oo = oooo00o0.f22548OooO0oo;
                    i2++;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!OooO00o(oooo00o0.f22547OooO0oo, oooo00o02.f22547OooO0oo)) {
                    oooo00o02.f22547OooO0oo = oooo00o0.f22547OooO0oo;
                    i2++;
                } else {
                    z3 = z2;
                }
                if (z3 && C9112oooO000O.f22506OooO0Oo) {
                    JNIBridge.nativeSet(3, oooo00o02.f22548OooO0oo ? 1 : 0, oooo00o02.f22547OooO0oo, null);
                }
                if (oooo00o02.OooO != oooo00o0.OooO) {
                    int i8 = oooo00o0.OooO;
                    oooo00o02.OooO = i8;
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO00o(4, (long) i8);
                    }
                    i2++;
                }
                if (oooo00o02.f22558OooOOoo != oooo00o0.f22558OooOOoo) {
                    oooo00o02.f22558OooOOoo = oooo00o0.f22558OooOOoo;
                    i2++;
                }
                if (oooo00o02.f22534OooO0O0 != oooo00o0.f22534OooO0O0) {
                    oooo00o02.f22534OooO0O0 = oooo00o0.f22534OooO0O0;
                    i2++;
                }
                if (oooo00o02.f22537OooO0OO != oooo00o0.f22537OooO0OO) {
                    oooo00o02.f22537OooO0OO = oooo00o0.f22537OooO0OO;
                    i2++;
                }
                if (oooo00o02.OooO0O0 != oooo00o0.OooO0O0) {
                    oooo00o02.OooO0O0 = oooo00o0.OooO0O0;
                    i2++;
                }
                if (oooo00o02.f22540OooO0Oo != oooo00o0.f22540OooO0Oo) {
                    oooo00o02.f22540OooO0Oo = oooo00o0.f22540OooO0Oo;
                    i2++;
                }
                if (oooo00o02.OooOO0 != oooo00o0.OooOO0) {
                    oooo00o02.OooOO0 = oooo00o0.OooOO0;
                    i2++;
                }
                if (oooo00o02.f22529OooO00o != oooo00o0.f22529OooO00o) {
                    oooo00o02.f22529OooO00o = oooo00o0.f22529OooO00o;
                    i2++;
                }
                if (oooo00o02.OooOO0O != oooo00o0.OooOO0O) {
                    oooo00o02.OooOO0O = oooo00o0.OooOO0O;
                    i2++;
                }
                if (oooo00o02.OooOO0o != oooo00o0.OooOO0o) {
                    oooo00o02.OooOO0o = oooo00o0.OooOO0o;
                    i2++;
                }
                if (oooo00o02.OooOOO0 != oooo00o0.OooOOO0) {
                    oooo00o02.OooOOO0 = oooo00o0.OooOOO0;
                    i2++;
                }
                if (oooo00o02.OooOOO != oooo00o0.OooOOO) {
                    oooo00o02.OooOOO = oooo00o0.OooOOO;
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO00o(32, (long) OooO00o.OooOOO);
                    }
                    i2++;
                }
                if (oooo00o02.f22528OooO != oooo00o0.f22528OooO) {
                    oooo00o02.f22528OooO = oooo00o0.f22528OooO;
                    i2++;
                }
                if (oooo00o02.f22549OooOO0 != oooo00o0.f22549OooOO0) {
                    oooo00o02.f22549OooOO0 = oooo00o0.f22549OooOO0;
                    i2++;
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO00o(5, OooO00o.f22549OooOO0);
                    }
                }
                if (oooo00o02.f22542OooO0o != oooo00o0.f22542OooO0o) {
                    oooo00o02.f22542OooO0o = oooo00o0.f22542OooO0o;
                    i2++;
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO00o(6, OooO00o.f22542OooO0o);
                    }
                }
                if (oooo00o02.f22550OooOO0O != oooo00o0.f22550OooOO0O) {
                    oooo00o02.f22550OooOO0O = oooo00o0.f22550OooOO0O;
                    i2++;
                }
                if (oooo00o02.f22551OooOO0o != oooo00o0.f22551OooOO0o) {
                    oooo00o02.f22551OooOO0o = oooo00o0.f22551OooOO0o;
                    i2++;
                }
                if (oooo00o02.f22546OooO0oO != oooo00o0.f22546OooO0oO) {
                    oooo00o02.f22546OooO0oO = oooo00o0.f22546OooO0oO;
                    i2++;
                }
                if (oooo00o02.OooOo00 != oooo00o0.OooOo00) {
                    int i9 = oooo00o0.OooOo00;
                    oooo00o02.OooOo00 = i9;
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO00o(10, (long) i9);
                    }
                    i2++;
                }
                if (oooo00o02.OooOo0 != oooo00o0.OooOo0) {
                    int i10 = oooo00o0.OooOo0;
                    oooo00o02.OooOo0 = i10;
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO00o(22, (long) i10);
                    }
                    i2++;
                }
                if (oooo00o02.OooOOOo != oooo00o0.OooOOOo) {
                    if (oooo00o02.OooOOOo <= 0 && oooo00o0.OooOOOo > 0) {
                        C9119oooO00o0.OooO00o(false);
                    }
                    oooo00o02.OooOOOo = oooo00o0.OooOOOo;
                    i2++;
                }
                if (oooo00o02.OooOOo0 != oooo00o0.OooOOo0) {
                    oooo00o02.OooOOo0 = oooo00o0.OooOOo0;
                    i2++;
                }
                if (oooo00o02.f22538OooO0Oo != oooo00o0.f22538OooO0Oo) {
                    long j = oooo00o0.f22538OooO0Oo;
                    oooo00o02.f22538OooO0Oo = j;
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO00o(9, j);
                    }
                    i2++;
                }
                if (oooo00o02.f22553OooOOO0 != oooo00o0.f22553OooOOO0) {
                    boolean z8 = oooo00o0.f22553OooOOO0;
                    oooo00o02.f22553OooOOO0 = z8;
                    if (z8) {
                        C9278ooooo0.m21188OooO0O0();
                    }
                    i2++;
                }
                if (oooo00o02.f22552OooOOO != oooo00o0.f22552OooOOO) {
                    boolean z9 = oooo00o0.f22552OooOOO;
                    oooo00o02.f22552OooOOO = z9;
                    if (C9112oooO000O.f22506OooO0Oo) {
                        JNIBridge.OooO00o(23, z9);
                    }
                    i2++;
                }
                if (oooo00o02.f22554OooOOOO != oooo00o0.f22554OooOOOO) {
                    boolean z10 = oooo00o0.f22554OooOOOO;
                    oooo00o02.f22554OooOOOO = z10;
                    if (z10) {
                        C9112oooO000O.m20823OooOO0O();
                    }
                    i2++;
                }
                if (oooo00o02.f22555OooOOOo != oooo00o0.f22555OooOOOo) {
                    oooo00o02.f22555OooOOOo = oooo00o0.f22555OooOOOo;
                    C9278ooooo0.OooO0OO(C9112oooO000O.OooOo0());
                    i2++;
                }
                if (oooo00o02.OooO0oo != oooo00o0.OooO0oo) {
                    oooo00o02.OooO0oo = oooo00o0.OooO0oo;
                    i2++;
                }
                i = i2;
            }
        }
        return i;
    }
}
