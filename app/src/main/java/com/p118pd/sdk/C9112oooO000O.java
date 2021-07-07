package com.p118pd.sdk;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.p273uc.crashsdk.JNIBridge;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.pd.sdk.oooO000O  reason: case insensitive filesystem */
public class C9112oooO000O {
    public static String OooO = null;

    /* renamed from: OooO  reason: collision with other field name */
    public static boolean f22489OooO = false;
    public static int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static long f22490OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static PendingIntent f22491OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static RandomAccessFile f22492OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f22493OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Runnable f22494OooO00o = new RunnableC9106ooo0oooo(101);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static String f22495OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final WeakHashMap<Activity, Integer> f22496OooO00o = new WeakHashMap<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f22497OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static volatile Object[] f22498OooO00o = null;
    public static long OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Object f22499OooO0O0 = new Object();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static String f22500OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static boolean f22501OooO0O0 = false;
    public static long OooO0OO = 0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final Object f22502OooO0OO = new Object();

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static String f22503OooO0OO = null;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static boolean f22504OooO0OO = false;
    public static final Object OooO0Oo = new Object();

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static String f22505OooO0Oo = null;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static boolean f22506OooO0Oo = false;
    public static String OooO0o = null;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static boolean f22507OooO0o = true;
    public static final Object OooO0o0 = new Object();

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static String f22508OooO0o0 = null;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static boolean f22509OooO0o0 = false;
    public static String OooO0oO = null;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public static boolean f22510OooO0oO = false;
    public static String OooO0oo = null;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public static boolean f22511OooO0oo = false;
    public static String OooOO0 = null;

    /* renamed from: OooOO0  reason: collision with other field name */
    public static volatile boolean f22512OooOO0 = false;
    public static String OooOO0O = null;

    /* renamed from: OooOO0O  reason: collision with other field name */
    public static boolean f22513OooOO0O = false;
    public static String OooOO0o = null;

    /* renamed from: OooOO0o  reason: collision with other field name */
    public static boolean f22514OooOO0o = false;
    public static String OooOOO = null;

    /* renamed from: OooOOO  reason: collision with other field name */
    public static boolean f22515OooOOO = false;
    public static String OooOOO0 = null;

    /* renamed from: OooOOO0  reason: collision with other field name */
    public static boolean f22516OooOOO0 = false;
    public static String OooOOOO = null;

    /* renamed from: OooOOOO  reason: collision with other field name */
    public static boolean f22517OooOOOO = false;
    public static String OooOOOo = null;

    /* renamed from: OooOOOo  reason: collision with other field name */
    public static boolean f22518OooOOOo = false;
    public static boolean OooOOo = false;
    public static boolean OooOOo0 = false;
    public static boolean OooOOoo = true;
    public static boolean OooOo = false;
    public static boolean OooOo0 = false;
    public static boolean OooOo00 = false;
    public static boolean OooOo0O = false;
    public static boolean OooOo0o = false;
    public static boolean OooOoO = false;
    public static boolean OooOoO0 = false;
    public static boolean OooOoOO = false;
    public static boolean OooOoo = false;
    public static boolean OooOoo0 = false;
    public static boolean OooOooO = false;
    public static boolean OooOooo = false;
    public static final /* synthetic */ boolean Oooo000 = (!C9112oooO000O.class.desiredAssertionStatus());

    public static String OooO() {
        if (OooOOO0 == null) {
            OooOOO0 = OooO0OO("hdr");
        }
        return OooOOO0;
    }

    public static String OooO0OO(String str) {
        return C9120oooO00oO.m20856OooO0Oo() + OooO0o0() + C9058ooOoOoOO.OooOO0 + str;
    }

    public static String OooO0Oo() {
        if (f22505OooO0Oo == null) {
            f22505OooO0Oo = OooO0OO("cta");
        }
        return f22505OooO0Oo;
    }

    public static String OooO0o() {
        if (f22500OooO0O0 == null) {
            f22500OooO0O0 = OooO0OO("ctj");
        }
        return f22500OooO0O0;
    }

    public static String OooO0oO() {
        if (f22508OooO0o0 == null) {
            f22508OooO0o0 = OooO0OO("st");
        }
        return f22508OooO0o0;
    }

    public static String OooO0oo() {
        if (OooOO0o == null) {
            OooOO0o = OooO0OO("bati");
        }
        return OooOO0o;
    }

    public static String OooOO0() {
        if (OooO0oO == null) {
            OooO0oO = C9120oooO00oO.m20856OooO0Oo() + CommonNetImpl.f10820UP;
        }
        return OooO0oO;
    }

    public static String OooOO0O() {
        if (OooO0oo == null) {
            OooO0oo = C9120oooO00oO.m20856OooO0Oo() + "authu";
        }
        return OooO0oo;
    }

    public static String OooOO0o() {
        if (OooO == null) {
            OooO = C9120oooO00oO.m20856OooO0Oo() + "statu";
        }
        return OooO;
    }

    public static String OooOOO() {
        if (OooOO0O == null) {
            OooOO0O = C9120oooO00oO.m20856OooO0Oo() + "ver";
        }
        return OooOO0O;
    }

    public static String OooOOO0() {
        if (OooOO0 == null) {
            OooOO0 = C9120oooO00oO.m20856OooO0Oo() + "poli";
        }
        return OooOO0;
    }

    public static String OooOOOO() {
        return C9120oooO00oO.m20856OooO0Oo() + "bvu";
    }

    public static String OooOOOo() {
        return C9120oooO00oO.m20856OooO0Oo() + "fds";
    }

    public static boolean OooOOo() {
        return m20805OooO00o(C9120oooO00oO.m20861OooO0o0());
    }

    public static String OooOOo0() {
        return C9111oooO0000.OooO00o(new File(m20807OooO0O0()), 8, false);
    }

    public static boolean OooOOoo() {
        return OooOo0o || !m20822OooOO0();
    }

    public static boolean OooOo0() {
        return OooOo && !f22511OooO0oo;
    }

    public static boolean OooOo00() {
        return OooOo || !m20822OooOO0();
    }

    public static void OooO00o(boolean z) {
        OooOOoo = z;
        if (f22506OooO0Oo) {
            JNIBridge.OooO00o(30, z);
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static String m20807OooO0O0() {
        if (f22495OooO00o == null) {
            f22495OooO00o = OooO0OO("ss");
        }
        return f22495OooO00o;
    }

    public static String OooO0OO() {
        if (f22503OooO0OO == null) {
            f22503OooO0OO = OooO0OO("ctn");
        }
        return f22503OooO0OO;
    }

    public static String OooO0o0() {
        String str = OooOOO;
        if (str != null) {
            return str;
        }
        String OooO2 = C9278ooooo0.OooO();
        if (C9111oooO0000.m20791OooO00o(OooO2)) {
            OooOOO = "LLUN";
        } else {
            int i = 0;
            if (OooO2.length() > 48) {
                OooO2 = OooO2.substring(0, 48);
                i = OooO2.length() - 48;
            }
            StringBuilder sb = new StringBuilder();
            byte[] bytes = OooO2.getBytes();
            for (int length = bytes.length - 1; length >= 0; length--) {
                byte b = bytes[length];
                if (b == 46) {
                    sb.append('0');
                } else if (b == 58) {
                    sb.append('1');
                } else if (b >= 97 && b <= 122) {
                    sb.append((char) ((b + C8027oOO00oo.OooO00o) - 97));
                } else if (b >= 65 && b <= 90) {
                    sb.append((char) b);
                } else if (b < 48 || b > 57) {
                    sb.append('2');
                } else {
                    sb.append((char) b);
                }
            }
            if (i > 0) {
                sb.append(String.valueOf(i));
            }
            OooOOO = sb.toString();
        }
        return OooOOO;
    }

    /* renamed from: OooOOOO  reason: collision with other method in class */
    public static boolean m20828OooOOOO() {
        m20816OooO0o0();
        return f22514OooOO0o;
    }

    /* renamed from: OooOOOo  reason: collision with other method in class */
    public static boolean m20829OooOOOo() {
        return f22511OooO0oo;
    }

    /* renamed from: OooOOo0  reason: collision with other method in class */
    public static boolean m20830OooOOo0() {
        return m20805OooO00o(C9120oooO00oO.m20856OooO0Oo());
    }

    /* renamed from: OooO  reason: collision with other method in class */
    public static boolean m20798OooO() {
        m20816OooO0o0();
        return f22518OooOOOo;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static void m20812OooO0Oo() {
        if (!C9278ooooo0.m21180OooO00o() && !m20811OooO0OO() && f22491OooO00o == null && C9120oooO00oO.OooOO0() >= 0) {
            try {
                Context OooO00o2 = C9111oooO0000.OooO00o();
                Intent launchIntentForPackage = OooO00o2.getPackageManager().getLaunchIntentForPackage(OooO00o2.getPackageName());
                launchIntentForPackage.addFlags(335544320);
                f22491OooO00o = PendingIntent.getActivity(OooO00o2, 0, launchIntentForPackage, 0);
            } catch (Throwable th) {
                C9111oooO0000.OooO00o(th);
            }
        }
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public static boolean m20815OooO0o() {
        m20816OooO0o0();
        return f22516OooOOO0;
    }

    /* renamed from: OooO0oO  reason: collision with other method in class */
    public static boolean m20818OooO0oO() {
        m20816OooO0o0();
        return f22515OooOOO;
    }

    /* renamed from: OooO0oo  reason: collision with other method in class */
    public static boolean m20820OooO0oo() {
        m20816OooO0o0();
        return f22517OooOOOO;
    }

    /* renamed from: OooOO0  reason: collision with other method in class */
    public static void m20821OooOO0() {
        if (!f22511OooO0oo) {
            f22511OooO0oo = true;
            if (!m20811OooO0OO() && !C9278ooooo0.m21166OooO()) {
                m20805OooO00o(C9120oooO00oO.m20856OooO0Oo());
                m20814OooO0o();
                m20817OooO0oO();
            }
        }
    }

    /* renamed from: OooOO0O  reason: collision with other method in class */
    public static void m20823OooOO0O() {
        C9146oooO0oo0.OooO00o(2, new RunnableC9106ooo0oooo(100));
    }

    /* renamed from: OooOO0o  reason: collision with other method in class */
    public static boolean m20825OooOO0o() {
        return f22489OooO;
    }

    /* renamed from: OooOOO  reason: collision with other method in class */
    public static boolean m20826OooOOO() {
        m20816OooO0o0();
        return f22513OooOO0O;
    }

    /* renamed from: OooOOO0  reason: collision with other method in class */
    public static boolean m20827OooOOO0() {
        if (!OooOOo0) {
            if (f22506OooO0Oo) {
                OooOOo = JNIBridge.OooO00o(15) == 1;
            } else {
                OooOOo = new File(OooO0Oo()).exists();
            }
            OooOOo0 = true;
        }
        return OooOOo;
    }

    public static String OooO00o(String str) {
        return "debug.crs." + str;
    }

    public static void OooO0O0(boolean z) {
        if (!C9278ooooo0.m21166OooO()) {
            if (z && f22511OooO0oo) {
                C9120oooO00oO.m20855OooO0OO();
                f22511OooO0oo = false;
                m20814OooO0o();
            }
            boolean z2 = C9278ooooo0.m21180OooO00o() || m20811OooO0OO();
            long currentTimeMillis = System.currentTimeMillis();
            if (OooOo0o && !OooOo && z) {
                long j = OooO0OO;
                if (j != 0 && !z2 && currentTimeMillis - j > 1800000) {
                    C9146oooO0oo0.OooO00o(1, new RunnableC9106ooo0oooo(104), 1000);
                }
            }
            OooO0OO = currentTimeMillis;
            OooOo = z;
            if (z) {
                OooOo0o = true;
            }
            if (f22506OooO0Oo) {
                JNIBridge.nativeSetForeground(z);
            }
            if (!f22511OooO0oo && !z2) {
                m20816OooO0o0();
                m20817OooO0oO();
                if (z) {
                    C9119oooO00o0.OooO00o(false);
                    if (!OooOoO0) {
                        C9278ooooo0.m21188OooO0O0();
                        OooOoO0 = true;
                    }
                }
                if (!OooOo00) {
                    m20819OooO0oo();
                }
                C9278ooooo0.OooO0OO(z);
            }
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static void m20810OooO0OO() {
        if (f22506OooO0Oo) {
            JNIBridge.nativeSet(27, (long) OooO00o, AgooConstants.ACK_PACK_NULL, null);
            JNIBridge.OooO00o(30, OooOOoo);
        }
    }

    /* renamed from: OooOO0O  reason: collision with other method in class */
    public static boolean m20824OooOO0O() {
        try {
            Method declaredMethod = Process.class.getDeclaredMethod("isIsolated", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke != null && (invoke instanceof Boolean)) {
                    return ((Boolean) invoke).booleanValue();
                }
            }
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
        }
        int myUid = Process.myUid() % 100000;
        return myUid >= 99000 && myUid <= 99999;
    }

    /* renamed from: OooO  reason: collision with other method in class */
    public static void m20797OooO() {
        boolean z;
        m20805OooO00o(C9120oooO00oO.m20856OooO0Oo());
        f22489OooO = true;
        f22513OooOO0O = false;
        f22514OooOO0o = false;
        f22516OooOOO0 = false;
        f22515OooOOO = false;
        f22517OooOOOO = false;
        f22518OooOOOo = false;
        String[] strArr = {".st", ".wa", ".callback", ".ctn", ".ctj", ".cta", ".signal"};
        String[] strArr2 = {CommonNetImpl.f10820UP, "authu", "statu", "poli"};
        File[] listFiles = new File(C9120oooO00oO.m20856OooO0Oo()).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                String name = file.getName();
                int i = 0;
                while (true) {
                    if (i >= 7) {
                        z = false;
                        break;
                    } else if (name.endsWith(strArr[i])) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 4) {
                            break;
                        } else if (name.equals(strArr2[i2])) {
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (z) {
                    C9090ooOooo0O.OooO00o("crashsdk", "delete file: " + file.getPath());
                    C9111oooO0000.m20790OooO00o(file);
                }
            }
        }
        m20817OooO0oO();
    }

    public static void OooO00o(Object[] objArr) {
        f22498OooO00o = objArr;
        synchronized (f22502OooO0OO) {
            String str = (String) objArr[0];
            long longValue = ((Long) objArr[1]).longValue();
            if (longValue < f22490OooO00o) {
                C9090ooOooo0O.OooO0OO("crashsdk", String.format(Locale.US, "Update state generation %d, last is: %d", Long.valueOf(longValue), Long.valueOf(f22490OooO00o)));
                return;
            }
            f22490OooO00o = longValue;
            String OooO0O02 = m20807OooO0O0();
            if (f22506OooO0Oo) {
                if (f22492OooO00o != null) {
                    C9111oooO0000.OooO00o(f22492OooO00o);
                    f22492OooO00o = null;
                }
                boolean nativeChangeState = JNIBridge.nativeChangeState(OooO0O02, str, OooOo00);
                OooOo00 = false;
                if (!nativeChangeState) {
                    C9090ooOooo0O.OooO0O0("write state failed: " + str);
                }
            } else {
                if (f22492OooO00o == null || OooOo00) {
                    if (f22492OooO00o != null) {
                        C9111oooO0000.OooO00o(f22492OooO00o);
                        f22492OooO00o = null;
                    }
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(OooO0O02, "rw");
                        f22492OooO00o = randomAccessFile;
                        randomAccessFile.seek(0);
                        OooOo00 = false;
                    } catch (Exception e) {
                        C9111oooO0000.OooO00o(e);
                    }
                }
                try {
                    f22492OooO00o.write(str.getBytes());
                    f22492OooO00o.seek(0);
                } catch (Exception e2) {
                    C9111oooO0000.OooO00o(e2);
                }
            }
            OooOOOO = str;
            f22498OooO00o = null;
        }
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public static void m20814OooO0o() {
        if (f22506OooO0Oo) {
            JNIBridge.OooO00o(26, f22511OooO0oo);
        }
    }

    /* renamed from: OooO0oO  reason: collision with other method in class */
    public static void m20817OooO0oO() {
        if (!OooOo0O) {
            OooOo0O = true;
            try {
                new File(OooO0o()).delete();
            } catch (Throwable th) {
                C9111oooO0000.OooO00o(th);
            }
            try {
                new File(OooO0OO()).delete();
            } catch (Throwable th2) {
                C9111oooO0000.OooO00o(th2);
            }
            try {
                if (f22506OooO0Oo) {
                    JNIBridge.OooO00o(16);
                } else {
                    new File(OooO0Oo()).delete();
                }
            } catch (Throwable th3) {
                C9111oooO0000.OooO00o(th3);
            }
        }
        Object[] OooO00o2 = m20806OooO00o();
        if (OooO00o2[0].equals(OooOOOO) || f22498OooO00o != null) {
            OooOo0 = true;
            m20819OooO0oo();
            return;
        }
        OooO00o(OooO00o2);
    }

    /* renamed from: OooO0oo  reason: collision with other method in class */
    public static void m20819OooO0oo() {
        if (!C9146oooO0oo0.m20891OooO00o(f22494OooO00o)) {
            C9146oooO0oo0.OooO00o(1, f22494OooO00o);
            return;
        }
        Object[] objArr = f22498OooO00o;
        if (objArr == null || !m20806OooO00o()[0].equals(objArr[0])) {
            C9146oooO0oo0.OooO00o(f22494OooO00o);
            C9146oooO0oo0.OooO00o(1, f22494OooO00o);
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static boolean m20811OooO0OO() {
        if (!OooOooo) {
            synchronized (OooO0o0) {
                if (!OooOooo) {
                    OooOooO = m20824OooOO0O();
                    OooOooo = true;
                }
            }
        }
        return OooOooO;
    }

    /* renamed from: OooOO0  reason: collision with other method in class */
    public static boolean m20822OooOO0() {
        String OooO00o2 = C9111oooO0000.OooO00o(new File("/proc/self/cgroup"), 512, false);
        if (C9111oooO0000.m20791OooO00o(OooO00o2)) {
            return false;
        }
        if (OooO00o2.contains("/bg_non_interactive") || OooO00o2.contains("/background")) {
            return true;
        }
        return false;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static boolean m20813OooO0Oo() {
        if (f22491OooO00o == null) {
            C9090ooOooo0O.OooO0O0("Restart intent is null!");
            return false;
        }
        try {
            C9090ooOooo0O.OooO00o("crashsdk", "restarting ...");
            ((AlarmManager) C9111oooO0000.OooO00o().getSystemService("alarm")).set(1, System.currentTimeMillis() + 200, f22491OooO00o);
            return true;
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071 A[Catch:{ all -> 0x0075 }] */
    /* renamed from: OooO0o0  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m20816OooO0o0() {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9112oooO000O.m20816OooO0o0():void");
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static void m20808OooO0O0() {
        OooOoo = true;
        if (f22506OooO0Oo) {
            JNIBridge.OooO00o(34, true);
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m20809OooO0O0() {
        return OooOoo;
    }

    public static int OooO0O0() {
        boolean OooO0oO2 = m20818OooO0oO();
        boolean OooO0oo2 = m20820OooO0oo();
        boolean OooO2 = m20798OooO();
        if (m20828OooOOOO()) {
            if (OooO0oO2) {
                return 12;
            }
            if (OooO0oo2) {
                return 14;
            }
            return OooO2 ? 16 : 98;
        } else if (!m20826OooOOO()) {
            return 1;
        } else {
            if (OooO0oO2) {
                return 11;
            }
            if (OooO0oo2) {
                return 13;
            }
            return OooO2 ? 15 : 97;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Object[] m20806OooO00o() {
        synchronized (OooO0Oo) {
            long j = OooO0O0 + 1;
            OooO0O0 = j;
            if (f22511OooO0oo) {
                return new Object[]{"e", Long.valueOf(j)};
            } else if (OooOo0()) {
                return new Object[]{"f", Long.valueOf(OooO0O0)};
            } else {
                return new Object[]{"b", Long.valueOf(OooO0O0)};
            }
        }
    }

    public static void OooO0O0(int i) {
        OooO00o = i;
        m20810OooO0OO();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20805OooO00o(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.isDirectory()) {
            return true;
        }
        C9090ooOooo0O.OooO00o("crashsdk", "Crash log directory was placed by a file!", null);
        if (!file.delete()) {
            return false;
        }
        file.mkdirs();
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20804OooO00o(Context context) {
        try {
            ((Application) context).registerActivityLifecycleCallbacks(new C9148oooO0ooo());
            if (!C9120oooO00oO.m20849OooO00o()) {
                return true;
            }
            m20823OooOO0O();
            return true;
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
            return false;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20801OooO00o() {
        String str;
        if (f22506OooO0Oo && (str = OooOOOo) != null) {
            JNIBridge.OooO0O0(129, str);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20800OooO00o() {
        String str = OooOOOo;
        return str == null ? "" : str;
    }

    public static void OooO00o(int i) {
        Object OooO00o2;
        Activity activity;
        int i2;
        boolean z = false;
        boolean z2 = true;
        switch (i) {
            case 100:
                Object OooO00o3 = m20799OooO00o();
                if (OooO00o3 != null && (OooO00o2 = OooO00o(OooO00o3, (Class<?>) null, "mActivities")) != null) {
                    try {
                        boolean z3 = false;
                        for (Map.Entry entry : ((Map) OooO00o2).entrySet()) {
                            Object value = entry.getValue();
                            if (!(value == null || (activity = (Activity) OooO00o(value, (Class<?>) null, C5982OoooOoO.OooO0o0)) == null)) {
                                boolean booleanValue = ((Boolean) OooO00o(value, (Class<?>) null, "paused")).booleanValue();
                                boolean booleanValue2 = ((Boolean) OooO00o(value, (Class<?>) null, "stopped")).booleanValue();
                                synchronized (f22496OooO00o) {
                                    if (booleanValue || booleanValue2) {
                                        i2 = 2;
                                    } else {
                                        i2 = 1;
                                        z3 = true;
                                    }
                                    f22496OooO00o.put(activity, Integer.valueOf(i2));
                                }
                            }
                            z = true;
                        }
                        if (z) {
                            OooO0O0(z3);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        C9111oooO0000.OooO00o(th);
                        return;
                    }
                } else {
                    return;
                }
            case 101:
                try {
                    if (new File(m20807OooO0O0()).exists()) {
                        z2 = false;
                    }
                    OooOo00 = z2;
                    if (z2 || OooOo0) {
                        OooO00o(m20806OooO00o());
                        OooOo0 = false;
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    C9111oooO0000.OooO00o(th2);
                    return;
                }
            case 102:
                C9146oooO0oo0.OooO00o(1, new RunnableC9106ooo0oooo(103));
                return;
            case 103:
                try {
                    C9111oooO0000.m20790OooO00o(new File(OooO0Oo()));
                    return;
                } catch (Throwable th3) {
                    C9111oooO0000.OooO00o(th3);
                    return;
                }
            case 104:
                C9110oooO000.OooO0Oo();
                C9142oooO0oO0.m20880OooO00o(102);
                if (m20802OooO00o()) {
                    C9278ooooo0.m21192OooO0OO();
                    return;
                }
                return;
            default:
                if (!Oooo000) {
                    throw new AssertionError();
                }
                return;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Object m20799OooO00o() {
        Method declaredMethod;
        Object OooO00o2;
        Object OooO00o3 = OooO00o((Application) C9111oooO0000.OooO00o(), Application.class, "mLoadedApk");
        if (OooO00o3 != null && (OooO00o2 = OooO00o(OooO00o3, (Class<?>) null, "mActivityThread")) != null) {
            return OooO00o2;
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            if (!(cls == null || (declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0])) == null)) {
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(null, new Object[0]);
            }
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
        }
        return null;
    }

    public static Object OooO00o(Object obj, Class<?> cls, String str) {
        if (obj == null) {
            return null;
        }
        if (cls == null) {
            cls = obj.getClass();
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
            return null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20802OooO00o() {
        if (!OooOoOO) {
            if (!C9111oooO0000.m20791OooO00o(C9119oooO00o0.f22566OooO00o) && C9119oooO00o0.f22566OooO00o.equals(C9278ooooo0.OooO())) {
                OooOoo0 = true;
                if (f22506OooO0Oo) {
                    JNIBridge.OooO00o(2, true);
                }
            }
            OooOoOO = true;
        }
        return OooOoo0;
    }

    public static int OooO00o() {
        boolean OooO0o2 = m20815OooO0o();
        return m20828OooOOOO() ? OooO0o2 ? 3 : 6 : m20826OooOOO() ? OooO0o2 ? 2 : 5 : OooO0o2 ? 4 : 1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20803OooO00o(int i) {
        return (i & OooO00o) != 0;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:37:0x0067 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.nio.channels.FileLock */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006e, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006f, code lost:
        r1 = r5;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0077, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0078, code lost:
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0093, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0094, code lost:
        com.p118pd.sdk.C9111oooO0000.OooO00o(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006e A[ExcHandler: all (r6v6 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:38:0x0069] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean OooO00o(java.lang.Object r4, java.lang.String r5, com.p118pd.sdk.RunnableC9106ooo0oooo r6) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9112oooO000O.OooO00o(java.lang.Object, java.lang.String, com.pd.sdk.ooo0oooo):boolean");
    }

    public static void OooO00o(Context context) {
        C9090ooOooo0O.OooO00o("Restart APP");
        if (context != null) {
            if (OooO0o == null) {
                OooO0o = OooO0OO("rt");
            }
            File file = new File(OooO0o);
            long j = -1;
            try {
                j = Long.parseLong(C9111oooO0000.OooO0O0(file));
            } catch (Throwable th) {
                C9111oooO0000.OooO00o(th);
            }
            boolean z = false;
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (C9120oooO00oO.OooOO0() >= 0 && (j <= 0 || currentTimeMillis - j > ((long) C9120oooO00oO.OooOO0()))) {
                m20805OooO00o(C9120oooO00oO.m20856OooO0Oo());
                C9111oooO0000.OooO00o(file, String.valueOf(currentTimeMillis));
                z = true;
            }
            C9090ooOooo0O.OooO00o("lastTime: " + j + ", currentTime: " + currentTimeMillis + ", needRestart: " + z);
            if (z) {
                try {
                    C9113oooO000o.OooO00o(true);
                } catch (Throwable th2) {
                    C9111oooO0000.OooO00o(th2);
                }
                m20813OooO0Oo();
            }
        }
    }
}
