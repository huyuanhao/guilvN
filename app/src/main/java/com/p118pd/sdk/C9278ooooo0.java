package com.p118pd.sdk;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Debug;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StatFs;
import android.os.StrictMode;
import anet.channel.util.HttpConstant;
import com.megvii.apo.PhoneFingerManager;
import com.p118pd.sdk.C7265o0O000oo;
import com.p273uc.crashsdk.JNIBridge;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import com.umeng.analytics.pro.C3416b;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.pd.sdk.ooooo0  reason: case insensitive filesystem */
public class C9278ooooo0 implements Thread.UncaughtExceptionHandler {
    public static int OooO = 0;

    /* renamed from: OooO  reason: collision with other field name */
    public static String f22652OooO = null;

    /* renamed from: OooO  reason: collision with other field name */
    public static boolean f22653OooO = false;
    public static int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static long f22654OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static ParcelFileDescriptor f22655OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static RunnableC9106ooo0oooo f22656OooO00o = new RunnableC9106ooo0oooo(C8713oo0o0o.OooO0o);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static OooO0OO f22657OooO00o = new OooO0OO((byte) 0);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f22658OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Runnable f22659OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static String f22660OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Thread.UncaughtExceptionHandler f22661OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Throwable f22662OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final ArrayList<String> f22663OooO00o = new ArrayList<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Map<String, Integer> f22664OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final AtomicBoolean f22665OooO00o = new AtomicBoolean(false);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f22666OooO00o = false;
    public static int OooO0O0 = -1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static long f22667OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final RunnableC9106ooo0oooo f22668OooO0O0 = new RunnableC9106ooo0oooo(412);

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Object f22669OooO0O0 = new Object();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static Runnable f22670OooO0O0 = new RunnableC9106ooo0oooo(407);

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static String f22671OooO0O0 = "";

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static boolean f22672OooO0O0 = true;
    public static int OooO0OO = -1;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static long f22673OooO0OO = -1;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final Object f22674OooO0OO = new Object();

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static String f22675OooO0OO = null;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static boolean f22676OooO0OO = false;
    public static int OooO0Oo = -1;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final Object f22677OooO0Oo = new Object();

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static String f22678OooO0Oo = null;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static boolean f22679OooO0Oo = false;
    public static int OooO0o = -1;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final Object f22680OooO0o = new Object();

    /* renamed from: OooO0o  reason: collision with other field name */
    public static String f22681OooO0o = null;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static boolean f22682OooO0o = false;
    public static int OooO0o0 = -1;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final Object f22683OooO0o0 = new Object();

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static String f22684OooO0o0 = null;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static boolean f22685OooO0o0 = false;
    public static int OooO0oO = -1;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public static final Object f22686OooO0oO = new Object();

    /* renamed from: OooO0oO  reason: collision with other field name */
    public static String f22687OooO0oO = null;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public static boolean f22688OooO0oO = false;
    public static int OooO0oo = -1;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public static final Object f22689OooO0oo = new Object();

    /* renamed from: OooO0oo  reason: collision with other field name */
    public static String f22690OooO0oo = null;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public static boolean f22691OooO0oo = false;
    public static int OooOO0 = 0;

    /* renamed from: OooOO0  reason: collision with other field name */
    public static String f22692OooOO0 = null;

    /* renamed from: OooOO0  reason: collision with other field name */
    public static boolean f22693OooOO0 = false;
    public static int OooOO0O = 101;

    /* renamed from: OooOO0O  reason: collision with other field name */
    public static String f22694OooOO0O = C8932ooOOO0o.f22176OooO00o;

    /* renamed from: OooOO0O  reason: collision with other field name */
    public static boolean f22695OooOO0O = false;
    public static boolean OooOO0o = false;
    public static final /* synthetic */ boolean OooOOO0 = (!C9278ooooo0.class.desiredAssertionStatus());

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<FileInputStream> f22696OooO00o = new ArrayList();

    /* renamed from: com.pd.sdk.ooooo0$OooO0O0 */
    public static class OooO0O0 implements Comparator<File> {
        public OooO0O0() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            File file3 = file;
            File file4 = file2;
            if (file3.lastModified() > file4.lastModified()) {
                return 1;
            }
            return file3.lastModified() < file4.lastModified() ? -1 : 0;
        }

        public /* synthetic */ OooO0O0(byte b) {
            this();
        }
    }

    /* renamed from: com.pd.sdk.ooooo0$OooO0OO */
    public static class OooO0OO extends BroadcastReceiver {
        public OooO0OO() {
        }

        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
                int unused = C9278ooooo0.OooO0O0 = intent.getIntExtra(C8912ooOO0o0.OooO0O0, -1);
                int unused2 = C9278ooooo0.OooO0OO = intent.getIntExtra("scale", -1);
                int unused3 = C9278ooooo0.OooO0Oo = intent.getIntExtra("voltage", -1);
                int unused4 = C9278ooooo0.OooO0o0 = intent.getIntExtra("health", -1);
                int unused5 = C9278ooooo0.OooO0o = intent.getIntExtra("plugged", -1);
                int unused6 = C9278ooooo0.OooO0oO = intent.getIntExtra("status", -1);
                int unused7 = C9278ooooo0.OooO0oo = intent.getIntExtra("temperature", -1);
                String unused8 = C9278ooooo0.f22694OooOO0O = intent.getStringExtra("technology");
                if (C9278ooooo0.OooO00o() >= 2) {
                    C9278ooooo0.OooO0o();
                    int unused9 = C9278ooooo0.OooO = 0;
                }
            } else if ("android.intent.action.BATTERY_LOW".equals(action) || "android.intent.action.BATTERY_OKAY".equals(action)) {
                boolean unused10 = C9278ooooo0.f22679OooO0Oo = "android.intent.action.BATTERY_LOW".equals(action);
                C9278ooooo0.OooO0o();
            } else if ("android.intent.action.ANR".equals(action)) {
                try {
                    C9278ooooo0.m21189OooO0O0(context);
                } catch (Throwable th) {
                    C9111oooO0000.OooO00o(th);
                }
            }
        }

        public /* synthetic */ OooO0OO(byte b) {
            this();
        }
    }

    public C9278ooooo0() {
        try {
            m21200OooO0oO();
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
        }
    }

    public static String OooO() {
        String str = f22684OooO0o0;
        if (str != null) {
            return str;
        }
        String OooO00o2 = OooO00o(Process.myPid());
        f22684OooO0o0 = OooO00o2;
        return OooO00o2;
    }

    /* renamed from: OooO0oo  reason: collision with other method in class */
    public static void m21202OooO0oo() {
        String str;
        BufferedReader bufferedReader;
        FileReader fileReader;
        Throwable th;
        String str2 = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        try {
            str = Build.HARDWARE;
        } catch (Throwable th2) {
            C9111oooO0000.OooO00o(th2);
            str = str2;
        }
        try {
            fileReader = new FileReader(new File("/proc/cpuinfo"));
            try {
                bufferedReader = new BufferedReader(fileReader, 512);
                int i = 0;
                do {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (readLine.startsWith("Hardware")) {
                            str = readLine.substring(readLine.indexOf(Constants.COLON_SEPARATOR) + 1).trim();
                        } else if (readLine.startsWith("Processor")) {
                            str2 = readLine.substring(readLine.indexOf(Constants.COLON_SEPARATOR) + 1).trim();
                        }
                        i++;
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            C9111oooO0000.OooO00o(th);
                            C9111oooO0000.OooO00o(fileReader);
                            C9111oooO0000.OooO00o(bufferedReader);
                            f22675OooO0OO = str;
                            f22678OooO0Oo = str2;
                        } catch (Throwable th4) {
                            C9111oooO0000.OooO00o(fileReader);
                            C9111oooO0000.OooO00o(bufferedReader);
                            throw th4;
                        }
                    }
                } while (i < 2);
                C9111oooO0000.OooO00o(fileReader);
            } catch (Throwable th5) {
                bufferedReader = null;
                th = th5;
                C9111oooO0000.OooO00o(th);
                C9111oooO0000.OooO00o(fileReader);
                C9111oooO0000.OooO00o(bufferedReader);
                f22675OooO0OO = str;
                f22678OooO0Oo = str2;
            }
        } catch (Throwable th6) {
            bufferedReader = null;
            th = th6;
            fileReader = null;
            C9111oooO0000.OooO00o(th);
            C9111oooO0000.OooO00o(fileReader);
            C9111oooO0000.OooO00o(bufferedReader);
            f22675OooO0OO = str;
            f22678OooO0Oo = str2;
        }
        C9111oooO0000.OooO00o(bufferedReader);
        f22675OooO0OO = str;
        f22678OooO0Oo = str2;
    }

    public static String OooOO0() {
        if (C9111oooO0000.m20791OooO00o(f22690OooO0oo)) {
            synchronized (f22683OooO0o0) {
                f22690OooO0oo = C9111oooO0000.OooO00o(C9112oooO000O.OooOO0(), f22652OooO, true);
            }
        }
        return f22690OooO0oo;
    }

    public static String OooOO0O() {
        return OooO00o(new Date());
    }

    public static String OooOO0o() {
        return f22692OooOO0;
    }

    public static void OooOOO() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitNetwork().build());
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
        }
    }

    public static String OooOOO0() {
        return "https://errlog.umeng.com/upload";
    }

    /* renamed from: OooOOO0  reason: collision with other method in class */
    public static void m21208OooOOO0() {
        f22660OooO00o = null;
    }

    public static void OooOOOO() {
        if (!OooOO0o) {
            C9146oooO0oo0.OooO00o(1, new RunnableC9106ooo0oooo(411), 1000);
        }
    }

    public static void OooOOOo() {
        f22654OooO00o = System.currentTimeMillis();
    }

    public static void OooOOo() {
        f22682OooO0o = false;
        if (!C9112oooO000O.OooOo0()) {
            C9146oooO0oo0.OooO00o(3, new RunnableC9106ooo0oooo(HttpConstant.SC_REQUESTED_RANGE_NOT_SATISFIABLE), 11000);
        }
        if (!m21199OooO0o0()) {
            OooOO0 = 0;
            m21204OooOO0();
        }
    }

    public static void OooOOo0() {
        String str;
        Throwable th;
        if (C9111oooO0000.m20791OooO00o(f22692OooOO0)) {
            String str2 = null;
            try {
                File file = new File(C9120oooO00oO.m20856OooO0Oo() + "unique");
                if (file.exists()) {
                    str = C9111oooO0000.OooO00o(file, 48, false);
                    if (str != null) {
                        try {
                            if (str.length() == 36) {
                                str2 = str.replaceAll("[^0-9a-zA-Z-]", Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                            }
                        } catch (Exception e) {
                            C9111oooO0000.OooO00o(e);
                        } catch (Throwable th2) {
                            th = th2;
                            C9111oooO0000.OooO00o(th);
                            str2 = str;
                            f22692OooOO0 = str2;
                        }
                    }
                    str2 = str;
                }
                if (C9111oooO0000.m20791OooO00o(str2)) {
                    C9112oooO000O.m20808OooO0O0();
                    str2 = UUID.randomUUID().toString();
                    if (!C9111oooO0000.m20791OooO00o(str2)) {
                        C9111oooO0000.OooO00o(file, str2.getBytes());
                    }
                }
            } catch (Throwable th3) {
                str = null;
                th = th3;
                C9111oooO0000.OooO00o(th);
                str2 = str;
                f22692OooOO0 = str2;
            }
            f22692OooOO0 = str2;
        }
    }

    public static void OooOOoo() {
        f22661OooO00o = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new C9278ooooo0());
    }

    public static void OooOo0() {
        long OooOOO = (long) C9120oooO00oO.OooOOO();
        if (OooOOO >= 0) {
            boolean z = C9112oooO000O.OooO00o() == 5;
            C9146oooO0oo0.OooO00o(0, new RunnableC9106ooo0oooo(TinkerReport.KEY_LOADED_SUCC_COST_1000_LESS));
            if (z) {
                RunnableC9106ooo0oooo ooo0oooo = new RunnableC9106ooo0oooo(TinkerReport.KEY_LOADED_SUCC_COST_3000_LESS);
                f22659OooO00o = ooo0oooo;
                C9146oooO0oo0.OooO00o(0, ooo0oooo, OooOOO);
            }
        }
    }

    public static void OooOo00() {
        Thread.setDefaultUncaughtExceptionHandler(f22661OooO00o);
    }

    public static void OooOo0O() {
        if (C9112oooO000O.f22504OooO0OO && C9119oooO00o0.f22570OooO00o && !C9146oooO0oo0.m20891OooO00o(f22670OooO0O0)) {
            C9146oooO0oo0.OooO00o(0, f22670OooO0O0, 1000);
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        OooO00o(thread, th, false);
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static boolean m21195OooO0Oo() {
        if (C9120oooO00oO.m20858OooO0Oo()) {
            return true;
        }
        return m21201OooO0oO();
    }

    public static String OooO0o0() {
        String str = f22660OooO00o;
        if (str != null) {
            return str;
        }
        String OooO0Oo2 = OooO0Oo((String) null);
        f22660OooO00o = OooO0Oo2;
        return OooO0Oo2;
    }

    /* renamed from: OooO0oO  reason: collision with other method in class */
    private void m21200OooO0oO() {
        int OooO0o2 = C9120oooO00oO.OooO0o();
        for (int i = 0; i < OooO0o2; i++) {
            try {
                this.f22696OooO00o.add(new FileInputStream("/dev/null"));
            } catch (Exception e) {
                C9111oooO0000.OooO00o(e);
                return;
            }
        }
    }

    /* renamed from: OooOO0O  reason: collision with other method in class */
    public static void m21206OooOO0O() {
        if (C9112oooO000O.f22504OooO0OO && f22685OooO0o0 && C9119oooO00o0.f22570OooO00o) {
            f22685OooO0o0 = false;
            if (!C9146oooO0oo0.m20891OooO00o((Runnable) f22656OooO00o)) {
                C9146oooO0oo0.OooO00o(0, f22656OooO00o, C7265o0O000oo.OooO0o.OooO00o);
            }
        }
    }

    /* renamed from: OooOO0o  reason: collision with other method in class */
    public static void m21207OooOO0o() {
        String OooO0o2 = C9120oooO00oO.m20859OooO0o();
        File file = new File(OooO0o2);
        if (file.isDirectory()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 150) {
                    Arrays.sort(listFiles, new OooO0O0((byte) 0));
                    int length = listFiles.length - 150;
                    int i = length < 0 ? 0 : length;
                    long currentTimeMillis = System.currentTimeMillis();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (i2 < listFiles.length) {
                        File file2 = listFiles[i2];
                        boolean z = i2 < i;
                        if (!z && currentTimeMillis - file2.lastModified() >= 432000000) {
                            z = true;
                        }
                        if (!z) {
                            break;
                        }
                        try {
                            file2.delete();
                            i3++;
                            i4 = 0;
                        } catch (Throwable th) {
                            i4++;
                            C9111oooO0000.OooO00o(th);
                        }
                        if (i4 >= 3) {
                            break;
                        }
                        i2++;
                    }
                    C9090ooOooo0O.OooO00o("Removed " + i3 + " logs in " + OooO0o2);
                }
            } catch (Throwable th2) {
                C9111oooO0000.OooO00o(th2);
            }
        }
    }

    public static String OooO0OO(String str) {
        try {
            return str.replaceAll("[^0-9a-zA-Z-.]", Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ad A[Catch:{ all -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO0o() {
        /*
        // Method dump skipped, instructions count: 328
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9278ooooo0.OooO0o():java.lang.String");
    }

    /* renamed from: OooO  reason: collision with other method in class */
    public static void m21165OooO() {
        if (!f22682OooO0o && !C9112oooO000O.m20802OooO00o() && !C9112oooO000O.m20811OooO0OO()) {
            JNIBridge.OooO00o(18);
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static String m21191OooO0OO() {
        return (!C9112oooO000O.m20802OooO00o() || f22666OooO00o) ? C9264ooooOOOo.f22647OooO0O0 : "ucebujava";
    }

    public static String OooO0Oo(String str) {
        if (str == null) {
            str = String.valueOf(System.currentTimeMillis()) + new Random().nextInt(65536);
        }
        return String.format(Locale.US, "%s%s_%s_%s_%s_%s_", m21168OooO00o(), C9120oooO00oO.m20846OooO00o(), C9120oooO00oO.m20853OooO0OO(), OooO0OO(Build.MODEL), OooO0OO(Build.VERSION.RELEASE), str);
    }

    public static long OooO00o(String str) {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("getLong", String.class, Long.TYPE);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                return ((Long) declaredMethod.invoke(null, str, 0L)).longValue();
            }
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
        }
        return 0;
    }

    public static String OooO0O0() {
        return C9112oooO000O.OooOo0() ? "fg" : "bg";
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e A[Catch:{ all -> 0x0080 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void OooO0OO(java.io.OutputStream r7) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9278ooooo0.OooO0OO(java.io.OutputStream):void");
    }

    public static String OooO0o0(String str) {
        return String.format(Locale.US, "%s%s_%s_%s.log", OooO0o0(), OooOO0O(), OooO0O0(), str);
    }

    public static void OooO0O0(OutputStream outputStream, String str, String str2) {
        String str3;
        String str4;
        try {
            outputStream.write("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            OooO00o(th, outputStream);
        }
        try {
            outputStream.write(String.format(Locale.US, "Basic Information: 'pid: %d/tid: %d/time: %s'\n", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()), OooOO0O()).getBytes("UTF-8"));
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            objArr[0] = OooO0o();
            if (C9111oooO0000.m20791OooO00o(f22678OooO0Oo)) {
                m21202OooO0oo();
            }
            objArr[1] = f22678OooO0Oo;
            objArr[2] = OooO0oO();
            outputStream.write(String.format(locale, "Cpu Information: 'abi: %s/processor: %s/hardware: %s'\n", objArr).getBytes("UTF-8"));
        } catch (Throwable th2) {
            OooO00o(th2, outputStream);
        }
        try {
            outputStream.write(String.format(Locale.US, "Mobile Information: 'model: %s/version: %s/sdk: %d'\n", Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT)).getBytes("UTF-8"));
            outputStream.write(("Build fingerprint: '" + Build.FINGERPRINT + "'\n").getBytes("UTF-8"));
            Locale locale2 = Locale.US;
            Object[] objArr2 = new Object[4];
            objArr2[0] = OooO00o(new Date(f22654OooO00o));
            objArr2[1] = Long.valueOf(Runtime.getRuntime().maxMemory());
            objArr2[2] = C9111oooO0000.OooO0OO();
            objArr2[3] = C9112oooO000O.OooOo0() ? "fg" : "bg";
            outputStream.write(String.format(locale2, "Runtime Information: 'start: %s/maxheap: %s/primaryabi: %s/ground: %s'\n", objArr2).getBytes("UTF-8"));
        } catch (Throwable th3) {
            OooO00o(th3, outputStream);
        }
        try {
            outputStream.write(String.format(Locale.US, "Application Information: 'version: %s/subversion: %s/buildseq: %s/versioncode: %d'\n", C9120oooO00oO.m20846OooO00o(), C9120oooO00oO.m20850OooO0O0(), C9120oooO00oO.m20853OooO0OO(), Integer.valueOf(C9119oooO00o0.OooO00o())).getBytes("UTF-8"));
            String str5 = "0";
            String str6 = "";
            if (C9112oooO000O.f22506OooO0Oo) {
                String nativeGet = JNIBridge.nativeGet(1, 0, null);
                str4 = JNIBridge.nativeGet(2, 0, null);
                str5 = nativeGet;
            } else {
                str4 = str6;
            }
            outputStream.write(String.format(Locale.US, "CrashSDK Information: 'version: %s/nativeseq: %s/javaseq: %s/arch: %s/target: %s'\n", "3.2.0.4", str5, "200403192109", str4, "umeng").getBytes("UTF-8"));
            if (str != null) {
                str6 = str;
            }
            outputStream.write(("Report Name: " + str6.substring(str6.lastIndexOf(47) + 1) + "\n").getBytes("UTF-8"));
        } catch (Throwable th4) {
            OooO00o(th4, outputStream);
        }
        try {
            if (OooOO0o) {
                str3 = OooO0oo("UUID");
            } else {
                str3 = f22692OooOO0;
            }
            outputStream.write(String.format("UUID: %s\n", str3).getBytes("UTF-8"));
            outputStream.write(("Log Type: " + str2 + "\n").getBytes("UTF-8"));
        } catch (Throwable th5) {
            OooO00o(th5, outputStream);
        }
        try {
            String OooO00o2 = C9112oooO000O.m20800OooO00o();
            if (C9111oooO0000.m20791OooO00o(OooO00o2)) {
                OooO00o2 = "(none)";
            }
            outputStream.write(("Activity: " + OooO00o2 + "\n").getBytes("UTF-8"));
        } catch (Throwable th6) {
            OooO00o(th6, outputStream);
        }
        OooO00o(outputStream);
        try {
            C9119oooO00o0.OooO00o(outputStream, "UTF-8");
            if (OooOO0o) {
                f22672OooO0O0 = false;
                outputStream.write(OooO0oo("HEADER").getBytes("UTF-8"));
                f22672OooO0O0 = true;
            }
        } catch (Throwable th7) {
            OooO00o(th7, outputStream);
        }
        OooO00o(outputStream);
    }

    /* renamed from: OooO0oO  reason: collision with other method in class */
    public static boolean m21201OooO0oO() {
        if (f22667OooO0O0 == 0) {
            f22667OooO0O0 = 2;
            if (OooO00o(C9112oooO000O.OooO00o("logs")) == 1) {
                f22667OooO0O0 = 1;
            }
        }
        return f22667OooO0O0 == 1;
    }

    /* renamed from: com.pd.sdk.ooooo0$OooO00o */
    public static class OooO00o extends OutputStream {
        public final long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OutputStream f22697OooO00o;
        public boolean OooO0O0 = false;
        public int o00oO0O = 0;
        public int o0ooOO0 = 0;

        public OooO00o(long j, OutputStream outputStream) {
            this.OooO00o = j;
            this.f22697OooO00o = outputStream;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private int OooO00o(byte[] r7, int r8, int r9) {
            /*
                r6 = this;
                int r0 = r6.o0ooOO0
                int r0 = r0 + r9
                r6.o0ooOO0 = r0
                boolean r0 = r6.OooO0O0
                if (r0 == 0) goto L_0x000b
                r7 = 0
                return r7
            L_0x000b:
                int r0 = com.p118pd.sdk.C9120oooO00oO.OooOOOo()
                if (r0 <= 0) goto L_0x0019
                int r1 = r6.o00oO0O
                int r2 = r1 + r9
                if (r2 <= r0) goto L_0x0019
                int r0 = r0 - r1
                goto L_0x001a
            L_0x0019:
                r0 = r9
            L_0x001a:
                int r1 = r6.o00oO0O
                int r1 = r1 + r0
                r6.o00oO0O = r1
                long r1 = r6.OooO00o
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L_0x0030
                java.lang.String r1 = new java.lang.String
                r1.<init>(r7, r8, r0)
                r6.OooO0O0(r1)
                goto L_0x0035
            L_0x0030:
                java.io.OutputStream r1 = r6.f22697OooO00o
                r1.write(r7, r8, r0)
            L_0x0035:
                if (r0 >= r9) goto L_0x003a
                r7 = 1
                r6.OooO0O0 = r7
            L_0x003a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9278ooooo0.OooO00o.OooO00o(byte[], int, int):int");
        }

        private void OooO0O0(String str) {
            if (C9112oooO000O.f22506OooO0Oo) {
                JNIBridge.nativeClientWriteData(this.OooO00o, str);
            }
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            if (C9278ooooo0.f22672OooO0O0 && C9278ooooo0.m21195OooO0Oo()) {
                C9090ooOooo0O.OooO0Oo("DEBUG", String.format(Locale.US, "%c", Integer.valueOf(i)));
            }
            if (this.OooO00o != 0) {
                OooO0O0(String.format(Locale.US, "%c", Integer.valueOf(i)));
            } else {
                this.f22697OooO00o.write(i);
            }
            this.o00oO0O++;
            this.o0ooOO0++;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            if (C9278ooooo0.f22672OooO0O0 && C9278ooooo0.m21195OooO0Oo()) {
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                if (!(i2 == 1 && bArr2[0] == 10)) {
                    try {
                        C9090ooOooo0O.OooO0Oo("DEBUG", new String(bArr2));
                    } catch (Throwable unused) {
                    }
                }
            }
            OooO00o(bArr, i, i2);
        }

        public final void OooO00o() {
            try {
                if (this.o0ooOO0 - this.o00oO0O > 0) {
                    OooO00o("\n");
                    OooO00o("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
                }
                int OooOOOo = C9120oooO00oO.OooOOOo();
                OooO00o(String.format(Locale.US, "Full: %d bytes, write: %d bytes, limit: %d bytes, reject: %d bytes.\n", Integer.valueOf(this.o0ooOO0), Integer.valueOf(this.o00oO0O), Integer.valueOf(OooOOOo), Integer.valueOf(this.o0ooOO0 - this.o00oO0O)));
            } catch (Throwable th) {
                C9111oooO0000.OooO00o(th);
            }
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            if (C9278ooooo0.f22672OooO0O0 && C9278ooooo0.m21195OooO0Oo() && !(bArr.length == 1 && bArr[0] == 10)) {
                try {
                    C9090ooOooo0O.OooO0Oo("DEBUG", new String(bArr));
                } catch (Throwable unused) {
                }
            }
            OooO00o(bArr, 0, bArr.length);
        }

        public final void OooO00o(String str) {
            if (C9278ooooo0.f22672OooO0O0 && C9278ooooo0.m21195OooO0Oo()) {
                C9090ooOooo0O.OooO0Oo("DEBUG", str);
            }
            if (this.OooO00o != 0) {
                OooO0O0(str);
            } else {
                this.f22697OooO00o.write(str.getBytes("UTF-8"));
            }
        }
    }

    /* renamed from: OooO  reason: collision with other method in class */
    public static boolean m21166OooO() {
        return f22665OooO00o.get() || m21197OooO0o();
    }

    /* renamed from: OooOO0  reason: collision with other method in class */
    public static void m21204OooOO0() {
        C9146oooO0oo0.OooO00o(3, new RunnableC9106ooo0oooo(414), 1000);
    }

    /* renamed from: com.pd.sdk.ooooo0$OooO0Oo  reason: case insensitive filesystem */
    public static class C9279OooO0Oo {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public long f22698OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f22699OooO00o;
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public long f22700OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f22701OooO0O0;
        public boolean OooO0OO;

        public C9279OooO0Oo() {
            this.f22698OooO00o = 0;
            this.f22700OooO0O0 = 0;
            this.OooO00o = 0;
            this.OooO0O0 = 0;
            this.f22699OooO00o = false;
            this.f22701OooO0O0 = false;
            this.OooO0OO = false;
        }

        public /* synthetic */ C9279OooO0Oo(byte b) {
            this();
        }
    }

    /* renamed from: OooOO0  reason: collision with other method in class */
    public static boolean m21205OooOO0() {
        synchronized (f22686OooO0oO) {
            if (f22659OooO00o == null || f22653OooO) {
                return false;
            }
            C9146oooO0oo0.OooO00o(f22659OooO00o);
            f22659OooO00o = null;
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void OooO0o0(java.io.OutputStream r12) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9278ooooo0.OooO0o0(java.io.OutputStream):void");
    }

    public static long OooO00o() {
        if (f22673OooO0OO == -1) {
            f22673OooO0OO = OooO00o(C9112oooO000O.OooO00o("local"));
        }
        return f22673OooO0OO;
    }

    public static void OooO0Oo(OutputStream outputStream) {
        if (C9112oooO000O.f22506OooO0Oo) {
            String OooOOOo = C9112oooO000O.OooOOOo();
            f22672OooO0O0 = false;
            if (1 == JNIBridge.OooO00o(17, OooOOOo)) {
                File file = new File(OooOOOo);
                try {
                    byte[] OooO00o2 = C9111oooO0000.m20792OooO00o(file);
                    if (OooO00o2 != null) {
                        outputStream.write(OooO00o2);
                    }
                } catch (Throwable th) {
                    OooO00o(th, outputStream);
                }
                try {
                    file.delete();
                } catch (Throwable th2) {
                    OooO00o(th2, outputStream);
                }
                f22672OooO0O0 = true;
                OooO00o(outputStream);
            }
            f22672OooO0O0 = true;
            return;
        }
        File[] fileArr = null;
        int i = 900;
        try {
            i = C9120oooO00oO.OooO0oO();
            fileArr = new File("/proc/self/fd").listFiles();
            if (fileArr != null) {
                outputStream.write(String.format(Locale.US, "opened file count: %d, write limit: %d.\n", Integer.valueOf(fileArr.length), Integer.valueOf(i)).getBytes("UTF-8"));
            } else {
                outputStream.write("[DEBUG] listFiles failed!\n".getBytes("UTF-8"));
            }
        } catch (Throwable th3) {
            OooO00o(th3, outputStream);
        }
        if (fileArr != null) {
            try {
                if (fileArr.length >= i) {
                    outputStream.write("opened files:\n".getBytes("UTF-8"));
                    StringBuilder sb = new StringBuilder();
                    try {
                        for (File file2 : fileArr) {
                            sb.append(file2.getName());
                            sb.append(" -> ");
                            sb.append(file2.getCanonicalPath());
                            sb.append("\n");
                        }
                    } catch (Throwable th4) {
                        OooO00o(th4, outputStream);
                    }
                    outputStream.write(sb.toString().getBytes("UTF-8"));
                }
            } catch (Throwable th5) {
                OooO00o(th5, outputStream);
            }
        }
        OooO00o(outputStream);
    }

    public static String OooO0oO() {
        if (C9111oooO0000.m20791OooO00o(f22675OooO0OO)) {
            m21202OooO0oo();
        }
        return f22675OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m21168OooO00o() {
        return C9120oooO00oO.m20866OooO0oo() + "_";
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m21186OooO00o() {
        byte[] bArr = null;
        int i = 1024;
        while (bArr == null && i > 0) {
            try {
                bArr = new byte[i];
            } catch (Throwable unused) {
                i /= 2;
                if (i < 16) {
                    break;
                }
            }
        }
        return bArr;
    }

    public static void OooO0oO(OutputStream outputStream) {
        String str;
        try {
            outputStream.write("recent status:\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            OooO00o(th, outputStream);
        }
        try {
            if (OooOO0o) {
                str = OooO0oo("LASTVER");
            } else {
                str = C9119oooO00o0.OooO0o0();
            }
            outputStream.write(String.format(Locale.US, "last version: '%s'\n", str).getBytes("UTF-8"));
        } catch (Throwable th2) {
            OooO00o(th2, outputStream);
        }
        try {
            synchronized (f22663OooO00o) {
                if (f22681OooO0o != null) {
                    outputStream.write(String.format(Locale.US, "generating log: %s\n", f22681OooO0o).getBytes("UTF-8"));
                }
                if (OooO00o > 0 || f22663OooO00o.size() > 0) {
                    outputStream.write(String.format(Locale.US, "generated %d logs, recent are:\n", Integer.valueOf(OooO00o)).getBytes("UTF-8"));
                    Iterator<String> it = f22663OooO00o.iterator();
                    while (it.hasNext()) {
                        outputStream.write(String.format(Locale.US, "* %s\n", it.next()).getBytes("UTF-8"));
                    }
                }
            }
            outputStream.write(String.format(Locale.US, "dumping all threads: %s\n", Boolean.valueOf(f22676OooO0OO)).getBytes("UTF-8"));
            if (f22687OooO0oO != null) {
                outputStream.write(String.format(Locale.US, "dumping threads: %s\n", f22687OooO0oO).getBytes("UTF-8"));
            }
        } catch (Throwable th3) {
            OooO00o(th3, outputStream);
        }
        OooO00o(outputStream);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x016e, code lost:
        if (com.p118pd.sdk.C9112oooO000O.m20825OooOO0o() != false) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0174, code lost:
        if (com.p118pd.sdk.C9094ooOoooOO.m20764OooO00o() != false) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0176, code lost:
        com.p118pd.sdk.C9090ooOooo0O.OooO0OO("DEBUG", com.p118pd.sdk.C9094ooOoooOO.OooO00o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x017f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0186, code lost:
        if (m21183OooO00o(com.p118pd.sdk.C9264ooooOOOo.f22649OooO0Oo) != false) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0188, code lost:
        com.p118pd.sdk.C9090ooOooo0O.OooO0Oo("DEBUG", "unexp sample miss");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x018f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0190, code lost:
        r5 = com.p273uc.crashsdk.JNIBridge.nativeGenerateUnexpLog((long) com.p118pd.sdk.C9120oooO00oO.OooOOO(), com.p118pd.sdk.C9120oooO00oO.OooOOOO());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x019d, code lost:
        if (r5 == 0) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x019f, code lost:
        com.p118pd.sdk.C9142oooO0oO0.m20880OooO00o(11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01a6, code lost:
        if ((r5 & 4352) == 0) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01a8, code lost:
        com.p118pd.sdk.C9278ooooo0.OooOO0O = 105;
        r5 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01ae, code lost:
        com.p118pd.sdk.C9142oooO0oO0.m20880OooO00o(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01b4, code lost:
        if ((r5 & com.p118pd.sdk.C9264ooooOOOo.OooO) == 0) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01b6, code lost:
        com.p118pd.sdk.C9278ooooo0.OooOO0O = 104;
        r5 = 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01bf, code lost:
        if ((r5 & 16640) == 0) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01c1, code lost:
        com.p118pd.sdk.C9278ooooo0.OooOO0O = 106;
        r5 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01ca, code lost:
        if ((r5 & 1280) == 0) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01cc, code lost:
        com.p118pd.sdk.C9278ooooo0.OooOO0O = 103;
        com.p118pd.sdk.C9142oooO0oO0.m20880OooO00o(10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01d6, code lost:
        if ((r5 & 2304) == 0) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01d8, code lost:
        com.p118pd.sdk.C9278ooooo0.OooOO0O = 107;
        com.p118pd.sdk.C9142oooO0oO0.m20880OooO00o(29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01e0, code lost:
        com.p118pd.sdk.C9278ooooo0.OooOO0O = 102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01e4, code lost:
        m21179OooO00o(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01e7, code lost:
        r5 = com.p118pd.sdk.C9278ooooo0.f22686OooO0oO;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01e9, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        com.p118pd.sdk.C9278ooooo0.f22659OooO00o = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x01ec, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x01ed, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01f1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void OooO00o(int r5, java.lang.Object[] r6) {
        /*
        // Method dump skipped, instructions count: 580
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9278ooooo0.OooO00o(int, java.lang.Object[]):void");
    }

    public static String OooO0oo() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("JavaMax:    ");
            sb.append(Runtime.getRuntime().maxMemory() / 1024);
            sb.append(" kB\n");
            sb.append("JavaTotal:  ");
            sb.append(Runtime.getRuntime().totalMemory() / 1024);
            sb.append(" kB\n");
            sb.append("JavaFree:   ");
            sb.append(Runtime.getRuntime().freeMemory() / 1024);
            sb.append(" kB\n");
            sb.append("NativeHeap: ");
            sb.append(Debug.getNativeHeapSize() / 1024);
            sb.append(" kB\n");
            sb.append("NativeAllocated: ");
            sb.append(Debug.getNativeHeapAllocatedSize() / 1024);
            sb.append(" kB\n");
            sb.append("NativeFree: ");
            sb.append(Debug.getNativeHeapFreeSize() / 1024);
            sb.append(" kB\n");
            try {
                ActivityManager activityManager = (ActivityManager) C9111oooO0000.OooO00o().getSystemService(C5982OoooOoO.OooO0o0);
                if (activityManager != null) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    sb.append("availMem:   ");
                    sb.append(memoryInfo.availMem / 1024);
                    sb.append(" kB\n");
                    sb.append("threshold:  ");
                    sb.append(memoryInfo.threshold / 1024);
                    sb.append(" kB\n");
                    sb.append("lowMemory:  ");
                    sb.append(memoryInfo.lowMemory);
                    sb.append("\n");
                }
            } catch (Throwable th) {
                C9111oooO0000.OooO00o(th);
            }
            return sb.toString();
        } catch (Throwable th2) {
            C9111oooO0000.OooO00o(th2);
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ae  */
    /* renamed from: OooO0OO  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m21193OooO0OO(java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 243
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9278ooooo0.m21193OooO0OO(java.lang.String):boolean");
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public static boolean m21199OooO0o0() {
        return Build.VERSION.SDK_INT < 29;
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public static void m21198OooO0o0() {
        String OooO0o02 = C9120oooO00oO.m20861OooO0o0();
        File file = new File(OooO0o02);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                C9090ooOooo0O.OooO0O0("Ucebu can not list folder: " + OooO0o02);
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isFile() && file2.getName().contains("ucebu")) {
                    m21185OooO00o(false, false);
                    return;
                }
            }
        }
    }

    /* renamed from: OooO0oo  reason: collision with other method in class */
    public static boolean m21203OooO0oo() {
        return f22666OooO00o;
    }

    public static String OooO0oo(String str) {
        return String.format("$^%s^$", str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f A[SYNTHETIC, Splitter:B:33:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void OooO0o(java.io.OutputStream r11) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9278ooooo0.OooO0o(java.io.OutputStream):void");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21181OooO00o(int i, Object[] objArr) {
        if (i != 451) {
            if (i != 452) {
                if (OooOOO0) {
                    return false;
                }
                throw new AssertionError();
            } else if (OooOOO0 || objArr != null) {
                C9279OooO0Oo oooO0Oo = (C9279OooO0Oo) objArr[1];
                return C9111oooO0000.OooO00o(new File((String) objArr[0]), String.format(Locale.US, "%d %d %d %d", Long.valueOf(oooO0Oo.f22698OooO00o), Long.valueOf(oooO0Oo.f22700OooO0O0), Integer.valueOf(oooO0Oo.OooO00o), Integer.valueOf(oooO0Oo.OooO0O0)).getBytes());
            } else {
                throw new AssertionError();
            }
        } else if (OooOOO0 || objArr != null) {
            return OooO00o((String) objArr[0], (C9279OooO0Oo) objArr[1]);
        } else {
            throw new AssertionError();
        }
    }

    public static String OooO0Oo() {
        return C9120oooO00oO.m20856OooO0Oo() + "bytes";
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ae  */
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m21196OooO0Oo(java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9278ooooo0.m21196OooO0Oo(java.lang.String):boolean");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21179OooO00o(boolean z) {
        File[] listFiles;
        try {
            if (C9112oooO000O.OooOOo() && (listFiles = new File(C9120oooO00oO.m20861OooO0o0()).listFiles()) != null) {
                int OooOO0O2 = C9120oooO00oO.OooOO0O();
                int OooOO0o2 = C9120oooO00oO.OooOO0o();
                if (listFiles.length >= Math.min(OooOO0O2, OooOO0o2)) {
                    int i = 0;
                    int i2 = 0;
                    for (File file : listFiles) {
                        if (m21182OooO00o(file)) {
                            i++;
                        } else {
                            i2++;
                        }
                    }
                    int i3 = (!z || i < OooOO0O2) ? 0 : (i - OooOO0O2) + 1;
                    int i4 = (z || i2 < OooOO0o2) ? 0 : (i2 - OooOO0o2) + 1;
                    if (!(i3 == 0 && i4 == 0)) {
                        Arrays.sort(listFiles, new OooO0O0((byte) 0));
                        int i5 = i3;
                        int i6 = i4;
                        for (File file2 : listFiles) {
                            boolean OooO00o2 = m21182OooO00o(file2);
                            if (OooO00o2 && i5 > 0) {
                                C9090ooOooo0O.OooO00o("crashsdk", "Delete oldest crash log: " + file2.getPath());
                                file2.delete();
                                i5 += -1;
                            } else if (!OooO00o2 && i6 > 0) {
                                C9090ooOooo0O.OooO00o("crashsdk", "Delete oldest custom log: " + file2.getPath());
                                file2.delete();
                                i6 += -1;
                            }
                            if (i5 == 0 && i6 == 0) {
                                break;
                            }
                        }
                        C9142oooO0oO0.OooO00o(16, i3 + i4);
                        if (i3 > 0) {
                            C9142oooO0oO0.OooO00o(22, i3);
                        }
                        if (i4 > 0) {
                            C9142oooO0oO0.OooO00o(23, i4);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
        }
    }

    public static String OooO0oO(String str) {
        String OooO00o2 = C9093ooOoooO0.OooO00o(str, C9120oooO00oO.m20868OooOO0(), C9120oooO00oO.m20876OooOOo0());
        if (!str.equals(OooO00o2)) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
        return OooO00o2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if ((java.lang.System.currentTimeMillis() % 3) == 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r0 == 1) goto L_0x0011;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m21194OooO0Oo() {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9278ooooo0.m21194OooO0Oo():void");
    }

    public static void OooO0OO(boolean z) {
        boolean z2 = true;
        if (!f22688OooO0oO ? !z || !C9120oooO00oO.m20852OooO0O0() : z && C9120oooO00oO.m20852OooO0O0()) {
            z2 = false;
        }
        if (z2) {
            if (C9146oooO0oo0.m20891OooO00o((Runnable) f22668OooO0O0)) {
                C9146oooO0oo0.OooO00o((Runnable) f22668OooO0O0);
            }
            C9146oooO0oo0.OooO00o(0, f22668OooO0O0, 3000);
        }
    }

    public static void OooO0O0(OutputStream outputStream) {
        BufferedReader bufferedReader = null;
        try {
            outputStream.write("logcat:\n".getBytes("UTF-8"));
            if (C9120oooO00oO.OooOOO0() <= 0) {
                try {
                    outputStream.write("[DEBUG] custom java logcat lines count is 0!\n".getBytes("UTF-8"));
                } catch (Throwable th) {
                    OooO00o(th, outputStream);
                }
                OooO00o(outputStream);
                C9111oooO0000.OooO00o((Closeable) null);
                return;
            }
            int OooOOO02 = C9120oooO00oO.OooOOO0();
            bufferedReader = OooO00o(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"logcat", "-d", "-b", C3416b.f8463ao, "-b", "main", "-v", "threadtime", "-t", String.valueOf(OooOOO02)}).getInputStream()));
            if (bufferedReader == null) {
                try {
                    outputStream.write("[DEBUG] alloc buffer failed!\n".getBytes("UTF-8"));
                } catch (Throwable th2) {
                    OooO00o(th2, outputStream);
                }
                OooO00o(outputStream);
                C9111oooO0000.OooO00o(bufferedReader);
                return;
            }
            f22672OooO0O0 = false;
            int i = 0;
            int i2 = 0;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    i++;
                    if (i2 < OooOOO02 && !readLine.contains(" I auditd ") && !readLine.contains(" I liblog ")) {
                        outputStream.write(readLine.getBytes("UTF-8"));
                        outputStream.write("\n".getBytes("UTF-8"));
                        i2++;
                    }
                } else {
                    try {
                        break;
                    } catch (Throwable th3) {
                        OooO00o(th3, outputStream);
                    }
                }
            }
            outputStream.write(String.format(Locale.US, "[DEBUG] Read %d lines, wrote %d lines.\n", Integer.valueOf(i), Integer.valueOf(i2)).getBytes("UTF-8"));
            f22672OooO0O0 = true;
            C9111oooO0000.OooO00o(bufferedReader);
            OooO00o(outputStream);
        } catch (Throwable th4) {
            C9111oooO0000.OooO00o((Closeable) null);
            throw th4;
        }
    }

    public static int OooO0OO() {
        if (C9112oooO000O.OooO00o() == 5) {
            return OooOO0O;
        }
        return 100;
    }

    public static String OooO00o(String str, String str2) {
        boolean z;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(Build.VERSION.SDK_INT >= 26 ? new String[]{"ps", "-ef"} : new String[]{"ps"}).getInputStream()));
            boolean OooO0O02 = C9111oooO0000.OooO0O0(str);
            boolean OooO0O03 = C9111oooO0000.OooO0O0(str2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return byteArrayOutputStream.toString("UTF-8");
                }
                if ((!OooO0O02 || !readLine.contains(str)) && ((!OooO0O03 || !readLine.contains(str2)) && (readLine.indexOf(47) >= 0 || readLine.indexOf(46) <= 0))) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    byteArrayOutputStream.write(readLine.getBytes("UTF-8"));
                    byteArrayOutputStream.write("\n".getBytes("UTF-8"));
                }
            }
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
            return "exception exists.";
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static void m21192OooO0OO() {
        C9146oooO0oo0.OooO00o(1, new RunnableC9106ooo0oooo(409), 7000);
    }

    public static String OooO0o(String str) {
        if (!C9111oooO0000.OooO0O0(str)) {
            return "";
        }
        int indexOf = str.indexOf(0);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        return str.trim();
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public static boolean m21197OooO0o() {
        return C9112oooO000O.f22506OooO0Oo && JNIBridge.nativeIsCrashing();
    }

    public static BufferedReader OooO00o(InputStreamReader inputStreamReader) {
        BufferedReader bufferedReader = null;
        int i = 8192;
        while (bufferedReader == null && i > 0) {
            try {
                bufferedReader = new BufferedReader(inputStreamReader, i);
            } catch (Throwable unused) {
                i /= 2;
                if (i < 512) {
                    break;
                }
            }
        }
        return bufferedReader;
    }

    public static void OooO00o(OutputStream outputStream) {
        try {
            outputStream.write("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            OooO00o(th, outputStream);
        }
    }

    public static String OooO00o(File file) {
        String str;
        try {
            str = file.getCanonicalPath();
        } catch (Throwable unused) {
            str = null;
        }
        return C9111oooO0000.m20791OooO00o(str) ? file.getPath() : str;
    }

    public static void OooO00o(OutputStream outputStream, String str, Set<String> set) {
        if (!C9111oooO0000.m20791OooO00o(str) && !set.contains(str) && !str.equals("/storage/emulated")) {
            set.add(str);
            try {
                StatFs statFs = new StatFs(str);
                long OooO00o2 = OooO00o(statFs, "getBlockCountLong", "getBlockCount");
                long OooO00o3 = OooO00o(statFs, "getBlockSizeLong", "getBlockSize");
                if ((OooO00o2 / 1024) * OooO00o3 >= 10240) {
                    long OooO00o4 = OooO00o(statFs, "getAvailableBlocksLong", "getAvailableBlocks");
                    long OooO00o5 = OooO00o(statFs, "getFreeBlocksLong", "getFreeBlocks");
                    try {
                        outputStream.write(String.format(Locale.US, "%s:\n", str).getBytes("UTF-8"));
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[1];
                        double d = (double) OooO00o2;
                        Double.isNaN(d);
                        double d2 = (double) OooO00o3;
                        Double.isNaN(d2);
                        objArr[0] = Long.valueOf((long) (((d * 1.0d) * d2) / 1024.0d));
                        outputStream.write(String.format(locale, "  total:      %d kB\n", objArr).getBytes("UTF-8"));
                        Locale locale2 = Locale.US;
                        double d3 = (double) OooO00o4;
                        Double.isNaN(d3);
                        Double.isNaN(d2);
                        outputStream.write(String.format(locale2, "  available:  %d kB\n", Long.valueOf((long) (((d3 * 1.0d) * d2) / 1024.0d))).getBytes("UTF-8"));
                        Locale locale3 = Locale.US;
                        double d4 = (double) OooO00o5;
                        Double.isNaN(d4);
                        Double.isNaN(d2);
                        outputStream.write(String.format(locale3, "  free:       %d kB\n", Long.valueOf((long) (((d4 * 1.0d) * d2) / 1024.0d))).getBytes("UTF-8"));
                        outputStream.write(String.format(Locale.US, "  block size: %d B\n\n", Long.valueOf(OooO00o3)).getBytes("UTF-8"));
                    } catch (Throwable th) {
                        OooO00o(th, outputStream);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void OooO0O0(OooO00o oooO00o) {
        f22672OooO0O0 = false;
        try {
            oooO00o.write((OooO0oo("LOG_END") + "\n").getBytes("UTF-8"));
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
        }
        f22672OooO0O0 = true;
    }

    /* JADX INFO: finally extract failed */
    public static int OooO0O0(OutputStream outputStream, String str, int i) {
        int i2;
        Throwable th;
        DataInputStream dataInputStream;
        int i3;
        DataInputStream dataInputStream2 = null;
        int i4 = 0;
        try {
            File file = new File(str);
            if (file.exists()) {
                byte[] OooO00o2 = m21186OooO00o();
                if (OooO00o2 == null) {
                    outputStream.write("(alloc buffer failed!)\n".getBytes("UTF-8"));
                    C9111oooO0000.OooO00o((Closeable) null);
                    return 0;
                }
                dataInputStream = new DataInputStream(new FileInputStream(file));
                i3 = 0;
                i2 = 0;
                loop0:
                while (true) {
                    boolean z = false;
                    while (true) {
                        try {
                            int read = dataInputStream.read(OooO00o2);
                            if (read == -1) {
                                break loop0;
                            }
                            i3 += read;
                            int i5 = i - i2;
                            if (read <= i5 + 32) {
                                i5 = read;
                            }
                            if (i5 > 0 && !z) {
                                outputStream.write(OooO00o2, 0, i5);
                                i2 += i5;
                            }
                            if (!z) {
                                if (i5 < read || i2 >= i) {
                                    z = true;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i4 = i2;
                            dataInputStream2 = dataInputStream;
                            try {
                                OooO00o(th, outputStream);
                                C9111oooO0000.OooO00o(dataInputStream2);
                                i2 = i4;
                                OooO00o(outputStream);
                                return i2;
                            } catch (Throwable th3) {
                                C9111oooO0000.OooO00o(dataInputStream2);
                                throw th3;
                            }
                        }
                    }
                }
            } else {
                outputStream.write(("file: '" + str + "' not exists!\n").getBytes("UTF-8"));
                dataInputStream = null;
                i3 = 0;
                i2 = 0;
            }
            if (i2 > 0) {
                outputStream.write("\n".getBytes("UTF-8"));
            }
            if (i2 < i3) {
                outputStream.write(String.format(Locale.US, "(truncated %d bytes)\n", Integer.valueOf(i3 - i2)).getBytes("UTF-8"));
            }
            C9111oooO0000.OooO00o(dataInputStream);
        } catch (Throwable th4) {
            th = th4;
            OooO00o(th, outputStream);
            C9111oooO0000.OooO00o(dataInputStream2);
            i2 = i4;
            OooO00o(outputStream);
            return i2;
        }
        OooO00o(outputStream);
        return i2;
    }

    public static long OooO00o(StatFs statFs, String str, String str2) {
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                Method declaredMethod = StatFs.class.getDeclaredMethod(str, new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(statFs, new Object[0]);
                if (invoke != null && (invoke instanceof Long)) {
                    return ((Long) invoke).longValue();
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Method declaredMethod2 = StatFs.class.getDeclaredMethod(str2, new Class[0]);
            declaredMethod2.setAccessible(true);
            Object invoke2 = declaredMethod2.invoke(statFs, new Object[0]);
            if (invoke2 == null || !(invoke2 instanceof Integer)) {
                return 0;
            }
            return (long) ((Integer) invoke2).intValue();
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
            return 0;
        }
    }

    public static void OooO0O0(boolean z) {
        try {
            boolean z2 = C9120oooO00oO.m20873OooOOO0() && C9112oooO000O.m20802OooO00o() && !f22666OooO00o;
            if (!z2) {
                z2 = C9120oooO00oO.m20872OooOOO();
            }
            if (z2) {
                if (z) {
                    String OooOO02 = OooOO0();
                    if (!C9111oooO0000.m20791OooO00o(OooOO02)) {
                        OooOOO();
                        m21178OooO00o(OooOO02, false, false);
                        return;
                    }
                    return;
                }
                m21185OooO00o(true, false);
            }
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
        }
    }

    public static void OooO00o(OooO00o oooO00o) {
        try {
            oooO00o.OooO00o(String.format(Locale.US, "log end: %s\n", OooOO0O()));
        } catch (Throwable th) {
            OooO00o(th, oooO00o);
        }
    }

    public static int OooO00o(OutputStream outputStream, String str, int i) {
        Throwable th;
        int i2 = 0;
        if (str == null) {
            OooO00o(outputStream);
            return 0;
        }
        try {
            String OooO00o2 = C9093ooOoooO0.OooO00o(str);
            if (OooO00o2 == null) {
                OooO00o2 = "file: '" + str + "' not found or decode failed!";
            }
            int length = OooO00o2.length();
            if (length <= i + 32) {
                i = length;
            }
            if (i > 0) {
                try {
                    outputStream.write(OooO00o2.getBytes("UTF-8"), 0, i);
                    outputStream.write("\n".getBytes("UTF-8"));
                } catch (Throwable th2) {
                    th = th2;
                    i2 = i;
                    OooO00o(th, outputStream);
                    i = i2;
                    OooO00o(outputStream);
                    return i;
                }
            }
            if (i < OooO00o2.length()) {
                outputStream.write(String.format(Locale.US, "(truncated %d bytes)\n", Integer.valueOf(OooO00o2.length() - i)).getBytes("UTF-8"));
            }
        } catch (Throwable th3) {
            th = th3;
            OooO00o(th, outputStream);
            i = i2;
            OooO00o(outputStream);
            return i;
        }
        OooO00o(outputStream);
        return i;
    }

    public static void OooO0O0(String str) {
        if (C9120oooO00oO.m20871OooOO0o()) {
            try {
                m21207OooOO0o();
            } catch (Throwable th) {
                C9111oooO0000.OooO00o(th);
            }
            if (str != null && !"".equals(str)) {
                try {
                    File file = new File(C9120oooO00oO.m20859OooO0o());
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    C9090ooOooo0O.OooO00o("crashsdk", "copy log to: " + file);
                    C9111oooO0000.OooO00o(new File(str), file);
                } catch (Throwable th2) {
                    C9111oooO0000.OooO00o(th2);
                }
            }
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m21189OooO0O0(Context context) {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0);
        boolean z = false;
        if (activityManager == null || (processesInErrorState = activityManager.getProcessesInErrorState()) == null) {
            return false;
        }
        int myPid = Process.myPid();
        Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.ProcessErrorStateInfo next = it.next();
            if (next.pid == myPid) {
                f22682OooO0o = true;
                if (m21195OooO0Oo()) {
                    C9090ooOooo0O.OooO0Oo("crashsdk", "ANR occurred in process: " + next.processName);
                }
                if (C9112oooO000O.f22506OooO0Oo) {
                    JNIBridge.OooO0O0(130, next.longMsg);
                }
                z = true;
            }
        }
        if (!z && C9112oooO000O.f22506OooO0Oo) {
            m21165OooO();
        }
        return true;
    }

    public static String OooO00o(int i) {
        try {
            String OooO00o2 = C9111oooO0000.OooO00o(new File(String.format(Locale.US, "/proc/%d/cmdline", Integer.valueOf(i))), 128, false);
            if (C9111oooO0000.OooO0O0(OooO00o2)) {
                return OooO0o(OooO00o2);
            }
            return "unknown";
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
            return "unknown";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: com.pd.sdk.ooooo0$OooO00o */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x033f A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0350 A[Catch:{ all -> 0x0360 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0359 A[Catch:{ all -> 0x0360 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO00o(java.lang.Throwable r17, java.lang.String r18, long r19, boolean r21) {
        /*
        // Method dump skipped, instructions count: 884
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9278ooooo0.OooO00o(java.lang.Throwable, java.lang.String, long, boolean):java.lang.String");
    }

    public static void OooO0O0(Context context) {
        if (C9120oooO00oO.m20852OooO0O0()) {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                intentFilter.addAction("android.intent.action.BATTERY_LOW");
                intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                context.registerReceiver(f22657OooO00o, intentFilter, null, C9146oooO0oo0.OooO00o(1));
                f22688OooO0oO = true;
            } catch (Throwable th) {
                C9111oooO0000.OooO00o(th);
            }
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m21190OooO0O0(String str) {
        try {
            if (!C9111oooO0000.OooO0O0(str) || !str.startsWith("lib") || !str.endsWith(".so")) {
                return false;
            }
            System.loadLibrary(str.substring(3, str.length() - 3));
            return true;
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
            return false;
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static void m21188OooO0O0() {
        if (!f22693OooOO0 && !C9112oooO000O.m20811OooO0OO()) {
            C9146oooO0oo0.OooO00o(1, new RunnableC9106ooo0oooo(408), 1000);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m21169OooO00o(String str) {
        int lastIndexOf;
        int indexOf;
        int i;
        int indexOf2;
        File file;
        byte[] OooO00o2;
        if (!C9120oooO00oO.OooOOo() || (lastIndexOf = str.lastIndexOf(47)) <= 0 || (indexOf = str.indexOf(95, lastIndexOf)) <= lastIndexOf || (indexOf2 = str.indexOf(95, (i = indexOf + 1))) <= indexOf) {
            return str;
        }
        String OooO00o3 = C9111oooO0000.m20786OooO00o("CrashSDK" + str.substring(lastIndexOf + 1, indexOf) + str.substring(i, indexOf2));
        if (OooO00o3 == null || (OooO00o2 = C9111oooO0000.m20792OooO00o((file = new File(str)))) == null || OooO00o2.length <= 0) {
            return str;
        }
        byte[] bArr = null;
        try {
            bArr = C9092ooOoooO.OooO0O0(OooO00o2, OooO00o3.substring(0, 16).getBytes());
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
        }
        if (bArr == null) {
            return str;
        }
        String str2 = str + ".ec";
        File file2 = new File(str2 + ".tmp");
        if (!C9111oooO0000.OooO00o(file2, bArr)) {
            return str;
        }
        if (!file2.renameTo(new File(str2))) {
            file2.delete();
            return str;
        }
        file.delete();
        return str2;
    }

    public static void OooO00o(Throwable th, OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.write("[DEBUG] CrashHandler occurred new exception:\n".getBytes("UTF-8"));
                th.printStackTrace(new PrintStream(outputStream));
                outputStream.write("\n\n".getBytes("UTF-8"));
            } catch (Throwable th2) {
                C9111oooO0000.OooO00o(th2);
            }
        }
        C9111oooO0000.OooO00o(th);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03a6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01f3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0224  */
    /* renamed from: OooO00o  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m21178OooO00o(java.lang.String r31, boolean r32, boolean r33) {
        /*
        // Method dump skipped, instructions count: 1089
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9278ooooo0.m21178OooO00o(java.lang.String, boolean, boolean):void");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21185OooO00o(boolean z, boolean z2) {
        if (!f22666OooO00o) {
            if (C9112oooO000O.f22506OooO0Oo) {
                JNIBridge.OooO00o(1, true);
            }
            f22666OooO00o = true;
        }
        try {
            String OooOO02 = OooOO0();
            if (C9111oooO0000.m20791OooO00o(OooOO02)) {
                C9090ooOooo0O.OooO00o("crashsdk", "CrashHandler url is empty!");
                return false;
            }
            synchronized (f22658OooO00o) {
                if (C9146oooO0oo0.OooO00o(z ? 1 : 0, new RunnableC9106ooo0oooo(406, new Object[]{OooOO02, Boolean.valueOf(z2), Boolean.valueOf(z)})) && z) {
                    try {
                        f22658OooO00o.wait();
                    } catch (InterruptedException e) {
                        C9111oooO0000.OooO00o(e);
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0057, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0058, code lost:
        r1 = r5;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        com.p118pd.sdk.C9111oooO0000.OooO00o(r5);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0060, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0061, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x0018] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean OooO00o(java.lang.String r5, com.p118pd.sdk.RunnableC9106ooo0oooo r6) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9278ooooo0.OooO00o(java.lang.String, com.pd.sdk.ooo0oooo):boolean");
    }

    public static boolean OooO00o(String str, C9279OooO0Oo oooO0Oo) {
        String OooO00o2 = C9111oooO0000.OooO00o(new File(str), 64, false);
        if (OooO00o2 == null) {
            return false;
        }
        try {
            Matcher matcher = Pattern.compile("(\\d+)\\s+(\\d+)\\s+(\\d+)\\s+(\\d+)").matcher(OooO00o2);
            if (matcher.find()) {
                long parseLong = Long.parseLong(matcher.group(1));
                if (System.currentTimeMillis() - parseLong < 86400000) {
                    oooO0Oo.f22700OooO0O0 = Long.parseLong(matcher.group(2));
                    oooO0Oo.OooO00o = Integer.parseInt(matcher.group(3));
                    oooO0Oo.OooO0O0 = Integer.parseInt(matcher.group(4));
                    oooO0Oo.f22698OooO00o = parseLong;
                }
            }
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21182OooO00o(File file) {
        int indexOf;
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(95);
        if (lastIndexOf <= 0 || (indexOf = name.indexOf(46, lastIndexOf)) <= 0) {
            return false;
        }
        String substring = name.substring(lastIndexOf + 1, indexOf);
        if (C9264ooooOOOo.f22647OooO0O0.equals(substring) || "ucebujava".equals(substring) || C9264ooooOOOo.f22646OooO00o.equals(substring) || "ucebujni".equals(substring) || C9264ooooOOOo.f22649OooO0Oo.equals(substring) || C9264ooooOOOo.f22648OooO0OO.equals(substring)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r7.endsWith(r3) != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        if (r7.indexOf(".log", r7.lastIndexOf(95)) != r7.lastIndexOf(".log")) goto L_0x005a;
     */
    /* renamed from: OooO00o  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean[] m21187OooO00o(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9278ooooo0.m21187OooO00o(java.lang.String):boolean[]");
    }

    public static String OooO00o(String str, boolean z, boolean z2) {
        if (z) {
            try {
                str = OooO0oO(str);
            } catch (Throwable th) {
                C9111oooO0000.OooO00o(th);
            }
        }
        if (!z2) {
            return str;
        }
        try {
            return m21169OooO00o(str);
        } catch (Throwable th2) {
            C9111oooO0000.OooO00o(th2);
            return str;
        }
    }

    public static boolean OooO00o(StringBuffer stringBuffer, String str, long j, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, String str2) {
        long j2;
        boolean OooO00o2;
        long j3;
        if (f22665OooO00o.get()) {
            C9090ooOooo0O.OooO0O0("Processing java crash, skip generate custom log: " + str);
            return false;
        }
        boolean z = OooOO0o || C9112oooO000O.m20811OooO0OO();
        if (!z && !C9094ooOoooOO.m20764OooO00o()) {
            C9090ooOooo0O.OooO0OO("DEBUG", C9094ooOoooOO.OooO00o());
            return false;
        } else if (!m21183OooO00o(str)) {
            C9090ooOooo0O.OooO0Oo("DEBUG", "custom log sample miss: " + str);
            return false;
        } else if (m21197OooO0o()) {
            C9090ooOooo0O.OooO0O0("Processing native crash, skip generate custom log: " + str);
            return false;
        } else if (stringBuffer == null || str == null) {
            return false;
        } else {
            String str3 = C9120oooO00oO.m20861OooO0o0() + OooO0o0(str);
            boolean z2 = (j & 32) != 0;
            if (z) {
                if (C9112oooO000O.f22506OooO0Oo) {
                    int i = z2 ? 1 : 0;
                    int i2 = z2 ? 1 : 0;
                    int i3 = z2 ? 1 : 0;
                    j3 = JNIBridge.nativeClientCreateConnection(str3, "custom", str, i);
                } else {
                    j3 = 0;
                }
                if (j3 == 0) {
                    C9090ooOooo0O.OooO0Oo("DEBUG", "skip custom log: " + str);
                    return false;
                }
                j2 = j3;
            } else if (m21184OooO00o(OooO(), str, z2)) {
                return false;
            } else {
                C9120oooO00oO.m20851OooO0O0();
                m21179OooO00o(false);
                j2 = 0;
            }
            synchronized (f22674OooO0OO) {
                OooO00o2 = OooO00o(str3, j2, stringBuffer, str, j, arrayList, arrayList2, arrayList3, str2);
            }
            if (OooO00o2 && !z) {
                OooO00o(OooO(), str, z2);
            }
            if (j2 != 0) {
                JNIBridge.nativeClientCloseConnection(j2);
            }
            if (!OooO00o2) {
                return false;
            }
            if (!z) {
                OooO0O0(str3);
            }
            if (!z) {
                str3 = m21169OooO00o(OooO0oO(str3));
            }
            m21177OooO00o(str3, str);
            if (!z2 || z) {
                return true;
            }
            try {
                m21185OooO00o(true, false);
                return true;
            } catch (Throwable th) {
                C9111oooO0000.OooO00o(th);
                return true;
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21184OooO00o(String str, String str2, boolean z) {
        if (!m21193OooO0OO(str2)) {
            return false;
        }
        C9110oooO000.OooO00o(str, str2, true, z);
        C9090ooOooo0O.OooO0O0(String.format(Locale.US, "Custom log '%s' has reach max count!", str2));
        return true;
    }

    public static void OooO00o(String str, String str2, boolean z) {
        C9110oooO000.OooO00o(str, str2, false, z);
    }

    public static void OooO00o(OooO00o oooO00o, String str, long j) {
        String str2;
        String str3 = null;
        if (C9112oooO000O.f22506OooO0Oo) {
            try {
                oooO00o.flush();
            } catch (Throwable th) {
                C9111oooO0000.OooO00o(th);
            }
            str2 = JNIBridge.nativeDumpThreads(str, j);
            if (OooOO0o || str2 == null || str2.length() >= 512 || !str2.startsWith(C8932ooOOO0o.OooO0OO) || str2.indexOf(10) >= 0) {
                str3 = str2;
            } else {
                if (!new File(str2).exists()) {
                    str3 = "Can not found " + str2;
                }
                str3 = str2;
                str2 = str3;
            }
        } else {
            str2 = "Native not initialized, skip dump!";
        }
        if (str2 != null) {
            try {
                oooO00o.write(str2.getBytes("UTF-8"));
                oooO00o.write("\n".getBytes("UTF-8"));
            } catch (Throwable th2) {
                C9111oooO0000.OooO00o(th2);
            }
            OooO00o((OutputStream) oooO00o);
        } else if (str3 != null && !OooOO0o) {
            OooO0O0(oooO00o, str3, 1048576);
            File file = new File(str3);
            if (file.exists()) {
                file.delete();
            }
        }
        try {
            oooO00o.flush();
        } catch (Throwable th3) {
            C9111oooO0000.OooO00o(th3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean OooO00o(java.lang.String r17, long r18, java.lang.StringBuffer r20, java.lang.String r21, long r22, java.util.ArrayList<java.lang.String> r24, java.util.ArrayList<java.lang.String> r25, java.util.ArrayList<java.lang.String> r26, java.lang.String r27) {
        /*
        // Method dump skipped, instructions count: 398
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9278ooooo0.OooO00o(java.lang.String, long, java.lang.StringBuffer, java.lang.String, long, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.String):boolean");
    }

    public static void OooO00o(String str, boolean z) {
        if (z) {
            f22652OooO = str;
            return;
        }
        synchronized (f22683OooO0o0) {
            f22690OooO0oo = str;
            C9093ooOoooO0.OooO00o(C9112oooO000O.OooOO0(), str + "\n");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21176OooO00o(String str) {
        synchronized (f22680OooO0o) {
            String OooOOO02 = C9112oooO000O.OooOOO0();
            C9093ooOoooO0.OooO00o(OooOOO02, str + "\n");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21183OooO00o(String str) {
        if (OooOO0o) {
            return true;
        }
        try {
            return m21196OooO0Oo(str);
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
            return true;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Map<String, Integer> m21173OooO00o(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("\\|", 30)) {
            String[] split = str2.split(Constants.COLON_SEPARATOR, 3);
            if (split.length == 2) {
                String trim = split[0].trim();
                if (!C9111oooO0000.m20791OooO00o(trim)) {
                    int i = 1;
                    try {
                        i = Integer.parseInt(split[1].trim(), 10);
                    } catch (Throwable th) {
                        C9111oooO0000.OooO00o(th);
                    }
                    hashMap.put(trim, Integer.valueOf(i));
                }
            }
        }
        return hashMap;
    }

    public static String OooO00o(Date date) {
        return String.format(Locale.US, "%d%02d%02d%02d%02d%02d", Integer.valueOf(date.getYear() + 1900), Integer.valueOf(date.getMonth() + 1), Integer.valueOf(date.getDate()), Integer.valueOf(date.getHours()), Integer.valueOf(date.getMinutes()), Integer.valueOf(date.getSeconds()));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21177OooO00o(String str, String str2) {
        try {
            C9113oooO000o.OooO00o(str, OooO(), str2);
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
        }
    }

    public static void OooO00o(OutputStream outputStream, String str, String str2, int i, boolean z, boolean z2) {
        int i2 = 0;
        f22672OooO0O0 = false;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[2] = Integer.valueOf(i);
            objArr[3] = Integer.valueOf(z ? 1 : 0);
            if (z2) {
                i2 = 1;
            }
            objArr[4] = Integer.valueOf(i2);
            outputStream.write(String.format(locale, "$^%s`%s`%d`%d,%d^$", objArr).getBytes("UTF-8"));
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
        }
        f22672OooO0O0 = true;
        OooO00o(outputStream);
    }

    public static void OooO00o(OutputStream outputStream, String str, String str2) {
        f22672OooO0O0 = false;
        try {
            outputStream.write(String.format(Locale.US, "$^%s`%s^$", str, str2).getBytes("UTF-8"));
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
        }
        f22672OooO0O0 = true;
    }

    public static void OooO00o(Context context) {
        try {
            if (m21199OooO0o0()) {
                context.registerReceiver(new OooO0OO((byte) 0), new IntentFilter("android.intent.action.ANR"), null, C9146oooO0oo0.OooO00o(3));
            }
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static StringBuilder m21170OooO00o() {
        String str;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("level: ");
            sb.append(OooO0O0);
            sb.append("\n");
            sb.append("scale: ");
            sb.append(OooO0OO);
            sb.append("\n");
            String str2 = " (Unknown)";
            switch (OooO0o0) {
                case 1:
                    str = str2;
                    break;
                case 2:
                    str = " (Good)";
                    break;
                case 3:
                    str = " (Overheat)";
                    break;
                case 4:
                    str = " (Dead)";
                    break;
                case 5:
                    str = " (Over voltage)";
                    break;
                case 6:
                    str = " (Unspecified failure)";
                    break;
                case 7:
                    str = " (Cold)";
                    break;
                default:
                    str = " (?)";
                    break;
            }
            sb.append("health: ");
            sb.append(OooO0o0);
            sb.append(str);
            sb.append("\n");
            int i = OooO0o;
            String str3 = i != 0 ? i != 1 ? i != 2 ? i != 4 ? " (?)" : " (Wireless)" : " (USB port)" : " (AC charger)" : " (None)";
            sb.append("pluged: ");
            sb.append(OooO0o);
            sb.append(str3);
            sb.append("\n");
            int i2 = OooO0oO;
            if (i2 != 1) {
                str2 = i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? " (?)" : " (Full)" : " (Not charging)" : " (Discharging)" : " (Charging)";
            }
            sb.append("status: ");
            sb.append(OooO0oO);
            sb.append(str2);
            sb.append("\n");
            sb.append("voltage: ");
            sb.append(OooO0Oo);
            sb.append("\n");
            sb.append("temperature: ");
            sb.append(OooO0oo);
            sb.append("\n");
            sb.append("technology: ");
            sb.append(f22694OooOO0O);
            sb.append("\n");
            sb.append("battery low: ");
            sb.append(f22679OooO0Oo);
            sb.append("\n");
            return sb;
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01d3 A[SYNTHETIC, Splitter:B:132:0x01d3] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x023a A[Catch:{ all -> 0x0265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x02bb A[Catch:{ all -> 0x02e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0361 A[Catch:{ all -> 0x038c }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x03e6 A[Catch:{ all -> 0x0411 }] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x04b4 A[SYNTHETIC, Splitter:B:356:0x04b4] */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x04ec A[Catch:{ all -> 0x0517 }] */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x054a A[Catch:{ all -> 0x05e3, all -> 0x0607, all -> 0x0603, all -> 0x061d, all -> 0x0657 }] */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x056b A[SYNTHETIC, Splitter:B:411:0x056b] */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0588 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x05a3 A[Catch:{ all -> 0x05ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x05db  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0611 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008a A[Catch:{ all -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x0664  */
    /* JADX WARNING: Removed duplicated region for block: B:503:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:505:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:507:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:509:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:511:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:513:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:515:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:517:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x010d A[Catch:{ all -> 0x0138 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void OooO00o(java.lang.Thread r22, java.lang.Throwable r23, boolean r24) {
        /*
        // Method dump skipped, instructions count: 1646
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9278ooooo0.OooO00o(java.lang.Thread, java.lang.Throwable, boolean):void");
    }

    public static void OooO00o(Throwable th) {
        try {
            C9090ooOooo0O.OooO0Oo("DEBUG", OooO00o(th.getStackTrace(), (String) null).toString());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Throwable m21172OooO00o() {
        return f22662OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21175OooO00o(int i) {
        C9146oooO0oo0.OooO00o(0, new RunnableC9106ooo0oooo(410), (long) (i * 1000));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21174OooO00o() {
        if (C9120oooO00oO.m20871OooOO0o()) {
            C9146oooO0oo0.OooO00o(0, new RunnableC9106ooo0oooo(TinkerReport.KEY_LOADED_SUCC_COST_5000_LESS), TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
        }
    }

    public static void OooO00o(Calendar calendar) {
        if (C9120oooO00oO.m20865OooO0oO()) {
            long timeInMillis = calendar.getTimeInMillis();
            calendar.add(5, 1);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            long timeInMillis2 = calendar.getTimeInMillis();
            long j = timeInMillis2 - timeInMillis;
            long j2 = PhoneFingerManager.PER_HOUR_MILLISECOND;
            if (j <= PhoneFingerManager.PER_HOUR_MILLISECOND) {
                j2 = 1000 + j;
            }
            C9146oooO0oo0.OooO00o(0, new RunnableC9106ooo0oooo(415, new Object[]{Long.valueOf(timeInMillis2)}), j2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public static int OooO00o(boolean z, boolean z2) {
        int i;
        if (z2 && !f22693OooOO0) {
            C9142oooO0oO0.m20886OooO0O0(false);
        }
        if (z) {
            boolean OooO00o2 = C9142oooO0oO0.OooO00o(C9112oooO000O.OooO0oO(), false);
            C9110oooO000.OooO0oo();
            i = OooO00o2;
        } else {
            int OooO00o3 = C9142oooO0oO0.OooO00o();
            C9110oooO000.OooO0oo();
            i = OooO00o3;
        }
        if (z2) {
            return C9142oooO0oO0.OooO00o(z);
        }
        return i == 1 ? 1 : 0;
    }

    public static int OooO00o(boolean z) {
        int i;
        if (z) {
            i = C9142oooO0oO0.OooO00o(C9112oooO000O.OooO0oO()) ? 1 : 0;
        } else {
            i = C9142oooO0oO0.OooO0O0();
        }
        int OooO0O02 = C9142oooO0oO0.OooO0O0(z);
        return OooO0O02 > i ? OooO0O02 : i;
    }

    public static StringBuilder OooO00o(StackTraceElement[] stackTraceElementArr, String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            boolean z = str == null;
            int i2 = 0;
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                i2++;
                sb.append("  at ");
                sb.append(stackTraceElement.toString());
                sb.append("\n");
                if (!z && stackTraceElement.getMethodName().contains(str)) {
                    sb.delete(0, sb.length());
                    z = true;
                    i2 = 0;
                }
            }
            i = i2;
        }
        if (i == 0) {
            sb.append("  (no java stack)\n");
        }
        return sb;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static StringBuilder m21171OooO00o(String str) {
        return OooO00o(Thread.currentThread().getStackTrace(), str);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static ParcelFileDescriptor m21167OooO00o() {
        if (!C9112oooO000O.f22506OooO0Oo) {
            C9090ooOooo0O.OooO0Oo("crashsdk", "Crash so is not loaded!");
            return null;
        }
        ParcelFileDescriptor parcelFileDescriptor = f22655OooO00o;
        if (parcelFileDescriptor != null) {
            return parcelFileDescriptor;
        }
        int OooO00o2 = (int) JNIBridge.OooO00o(14);
        if (OooO00o2 == -1) {
            return null;
        }
        ParcelFileDescriptor adoptFd = ParcelFileDescriptor.adoptFd(OooO00o2);
        f22655OooO00o = adoptFd;
        f22695OooOO0O = true;
        return adoptFd;
    }

    public static boolean OooO00o(ParcelFileDescriptor parcelFileDescriptor) {
        if (f22695OooOO0O) {
            C9090ooOooo0O.OooO0Oo("crashsdk", "Can not call setHostFd and getHostFd in the same process!");
            return false;
        } else if (!C9112oooO000O.f22506OooO0Oo) {
            C9090ooOooo0O.OooO0Oo("crashsdk", "Crash so is not loaded!");
            return false;
        } else {
            if (f22655OooO00o != null) {
                C9090ooOooo0O.OooO0OO("crashsdk", "Has already set host fd!");
            }
            f22655OooO00o = parcelFileDescriptor;
            int fd = parcelFileDescriptor.getFd();
            int nativeCmd = (int) JNIBridge.nativeCmd(13, (long) fd, null, null);
            OooOO0o = nativeCmd != -1;
            if (fd == -1 || nativeCmd != -1) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21180OooO00o() {
        return OooOO0o;
    }
}
