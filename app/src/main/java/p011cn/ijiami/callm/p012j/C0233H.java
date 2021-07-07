package p011cn.ijiami.callm.p012j;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import com.learnium.RNDeviceInfo.Util;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.android.agoo.common.AgooConstants;

/* renamed from: cn.ijiami.callm.j.H */
/* compiled from: Hl */
public class C0233H {

    /* renamed from: a */
    private static String f510a = null;

    /* renamed from: b */
    private static String f511b = "%s已进入后台运行";

    /* renamed from: c */
    private static String f512c = "%s has been running in the background";

    /* renamed from: d */
    private static Application f513d = null;

    /* renamed from: e */
    private static Application.ActivityLifecycleCallbacks f514e = null;

    /* renamed from: f */
    private static int f515f = 0;

    /* renamed from: g */
    private static boolean f516g = false;

    /* renamed from: h */
    public static List<String> f517h = null;

    /* renamed from: i */
    private static String f518i = "";

    /* renamed from: j */
    private static int f519j = 0;

    /* renamed from: k */
    private static boolean f520k = false;

    /* renamed from: l */
    static Handler f521l = new Handler(Looper.getMainLooper());

    /* renamed from: m */
    private static String f522m = null;
    private static boolean multiProcess = false;

    /* renamed from: n */
    private static BroadcastReceiver f523n = null;

    /* renamed from: o */
    public static Runnable f524o = new Runnable() {
        /* class p011cn.ijiami.callm.p012j.C0233H.RunnableC02341 */

        public void run() {
            try {
                C0233H.showTip(C0233H.f513d);
            } catch (UnsupportedOperationException unused) {
            }
        }
    };

    /* renamed from: p */
    public static int f525p = 200;

    /* renamed from: q */
    private static String f526q = null;

    /* renamed from: r */
    static Runnable f527r = new Runnable() {
        /* class p011cn.ijiami.callm.p012j.C0233H.RunnableC02394 */

        public void run() {
            new Thread(new Runnable(this) {
                /* class p011cn.ijiami.callm.p012j.C0233H.RunnableC02394.RunnableC02401 */

                public void run() {
                    try {
                        Instrumentation instrumentation = new Instrumentation();
                        new KeyEvent(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, 0, 0, 0, 16539, 0);
                        instrumentation.sendTrackballEventSync(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, 50.0f, 50.0f, 0));
                    } catch (Exception unused) {
                        C0233H.m362j();
                        C0233H.f521l.postDelayed(C0233H.f524o, 200);
                    }
                }
            }).start();
        }
    };

    /* renamed from: uW */
    private static boolean f528uW = true;

    /* renamed from: cn.ijiami.callm.j.H$MyFindApplicationRunnable */
    /* compiled from: Hl */
    private static class MyFindApplicationRunnable implements Runnable {

        /* renamed from: a */
        private int f531a;

        public MyFindApplicationRunnable(int i) {
            this.f531a = i;
        }

        public void run() {
            try {
                Method declaredMethod = Application.class.getClassLoader().loadClass("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]);
                declaredMethod.setAccessible(true);
                Application application = (Application) declaredMethod.invoke(null, new Object[0]);
                if (application == null) {
                    return;
                }
                if (this.f531a == 0) {
                    C0233H.m363k(application);
                } else if (application.getClass().getName().hashCode() != this.f531a) {
                    C0233H.m363k(application);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: cn.ijiami.callm.j.H$WindowFocusView */
    /* compiled from: Hl */
    static class WindowFocusView extends View {
        public WindowFocusView(Context context) {
            super(context);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (C0233H.f515f == 0) {
                C0233H.onWindowFocusChanged(z);
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f517h = arrayList;
        arrayList.add("A_global_hijack_flag_all_B");
    }

    public static String getApplicationName(Context context) {
        if (f510a == null) {
            try {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                f510a = ((Object) applicationInfo.loadLabel(context.getPackageManager())) + "";
            } catch (Exception unused) {
            }
        }
        return f510a;
    }

    /* renamed from: i */
    private static String m361i() {
        File file = new File(f513d.getApplicationInfo().sourceDir);
        return "flag_" + C0233H.class.hashCode() + "_" + f513d.getApplicationInfo().uid + "_" + Math.abs(Build.MODEL.hashCode() | 666666) + "_" + Build.VERSION.SDK_INT + "_" + file.length() + "_" + file.lastModified();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static void m362j() {
        f521l.removeCallbacks(f524o);
        if (f523n != null) {
            Intent intent = new Intent(f513d.getPackageName() + "_HIJACK");
            intent.putExtra(UMModuleRegister.PROCESS, f522m + "");
            intent.setData(Uri.parse("jm_scheme://hijack/" + f518i));
            f513d.sendBroadcast(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static void m363k(Application application) {
        Application application2;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f514e;
        if (!(activityLifecycleCallbacks == null || (application2 = f513d) == null)) {
            application2.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        f513d = application;
        int p = m368p();
        f519j = p;
        if (p < 0) {
            f520k = m367o();
        }
        if (f528uW) {
            f515f = 0;
        } else {
            if (multiProcess) {
                f515f = 3;
            } else {
                f515f = 1;
            }
            f522m = m364l(application, Process.myPid());
        }
        getApplicationName(application);
        if (f515f == 3) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addDataScheme("jm_scheme");
            f518i = m361i();
            intentFilter.addDataPath("jm_scheme://hijack/" + f518i, 0);
            intentFilter.addAction(application.getPackageName() + "_HIJACK");
            C02352 r1 = new BroadcastReceiver() {
                /* class p011cn.ijiami.callm.p012j.C0233H.C02352 */

                public void onReceive(Context context, Intent intent) {
                    String stringExtra = intent.getStringExtra(UMModuleRegister.PROCESS);
                    if (stringExtra != null && !stringExtra.equals(C0233H.f522m)) {
                        C0233H.f521l.postDelayed(new Runnable(this) {
                            /* class p011cn.ijiami.callm.p012j.C0233H.C02352.RunnableC02361 */

                            public void run() {
                                C0233H.f521l.removeCallbacks(C0233H.f524o);
                            }
                        }, (long) (C0233H.f525p / 2));
                    }
                }
            };
            f523n = r1;
            f525p = 800;
            application.registerReceiver(r1, intentFilter);
            f515f = 1;
        }
        C02373 r5 = new Application.ActivityLifecycleCallbacks() {
            /* class p011cn.ijiami.callm.p012j.C0233H.C02373 */

            /* renamed from: a */
            private boolean f529a = false;

            public void onActivityCreated(final Activity activity, Bundle bundle) {
                if (C0233H.f515f != 0) {
                    C0233H.m362j();
                    String unused = C0233H.f526q = activity.getClass().getName();
                } else if ((C0233H.f517h.size() == 1 && C0233H.f517h.contains("A_global_hijack_flag_all_B")) || C0233H.f517h.contains(activity.getClass().getName())) {
                    C0233H.f521l.post(new Runnable(this) {
                        /* class p011cn.ijiami.callm.p012j.C0233H.C02373.RunnableC02381 */

                        public void run() {
                            WindowFocusView windowFocusView = new WindowFocusView(activity);
                            windowFocusView.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                            windowFocusView.setVisibility(8);
                            ((ViewGroup) activity.getWindow().getDecorView()).addView(windowFocusView);
                        }
                    });
                }
            }

            public void onActivityDestroyed(Activity activity) {
                if (C0233H.f515f != 0) {
                    C0233H.m362j();
                }
            }

            public void onActivityPaused(Activity activity) {
                boolean z;
                if (C0233H.f515f != 0) {
                    String unused = C0233H.f526q = activity.getClass().getName();
                    C0233H.m362j();
                    PowerManager powerManager = (PowerManager) C0233H.f513d.getSystemService("power");
                    if (Build.VERSION.SDK_INT >= 20) {
                        z = powerManager.isInteractive();
                    } else {
                        z = powerManager.isScreenOn();
                    }
                    if (z) {
                        if (C0233H.f517h.size() == 1 && C0233H.f517h.contains("A_global_hijack_flag_all_B")) {
                            this.f529a = true;
                            C0233H.m369q();
                        } else if (C0233H.f517h.contains(activity.getClass().getName())) {
                            this.f529a = true;
                            C0233H.m369q();
                        }
                    }
                } else if ((C0233H.f517h.size() == 1 && C0233H.f517h.contains("A_global_hijack_flag_all_B")) || C0233H.f517h.contains(activity.getClass().getName())) {
                    C0233H.onWindowFocusChanged(false);
                }
            }

            public void onActivityResumed(Activity activity) {
                if (C0233H.f515f != 0) {
                    String unused = C0233H.f526q = activity.getClass().getName();
                    C0233H.m362j();
                }
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public void onActivityStarted(Activity activity) {
                if (C0233H.f515f != 0) {
                    String unused = C0233H.f526q = activity.getClass().getName();
                    C0233H.m362j();
                }
            }

            public void onActivityStopped(Activity activity) {
                boolean z;
                if (C0233H.f515f != 0) {
                    if ((C0233H.f515f != 1 || !this.f529a) && activity.getClass().getName().equals(C0233H.f526q)) {
                        PowerManager powerManager = (PowerManager) C0233H.f513d.getSystemService("power");
                        if (Build.VERSION.SDK_INT >= 20) {
                            z = powerManager.isInteractive();
                        } else {
                            z = powerManager.isScreenOn();
                        }
                        if (z) {
                            C0233H.m362j();
                            if (C0233H.f517h.size() == 1 && C0233H.f517h.contains("A_global_hijack_flag_all_B")) {
                                C0233H.m369q();
                            } else if (C0233H.f517h.contains(activity.getClass().getName())) {
                                C0233H.m369q();
                            }
                        }
                    }
                }
            }
        };
        f514e = r5;
        f513d.registerActivityLifecycleCallbacks(r5);
    }

    /* renamed from: l */
    private static String m364l(Context context, int i) {
        return m366n(i);
    }

    /* renamed from: m */
    private static String m365m(Context context, String str) {
        String str2;
        int identifier = context.getResources().getIdentifier("hijick_tip_string", "string", context.getPackageName());
        if (identifier == 0) {
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT >= 24) {
                str2 = configuration.getLocales().get(0).getLanguage();
            } else {
                str2 = configuration.locale.getLanguage();
            }
            if (str2 == null || str2.equals("zh")) {
                return String.format(f511b, str);
            }
            return String.format(f512c, str);
        }
        return context.getString(identifier, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041 A[SYNTHETIC, Splitter:B:18:0x0041] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m366n(int r5) {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x003a }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r3.<init>()     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "/proc/"
            r3.append(r4)     // Catch:{ all -> 0x003a }
            r3.append(r5)     // Catch:{ all -> 0x003a }
            java.lang.String r5 = "/cmdline"
            r3.append(r5)     // Catch:{ all -> 0x003a }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x003a }
            r2.<init>(r5)     // Catch:{ all -> 0x003a }
            r1.<init>(r2)     // Catch:{ all -> 0x003a }
            java.lang.String r5 = r1.readLine()     // Catch:{ all -> 0x0038 }
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0038 }
            if (r2 != 0) goto L_0x002f
            java.lang.String r5 = r5.trim()     // Catch:{ all -> 0x0038 }
        L_0x002f:
            r1.close()     // Catch:{ IOException -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0037:
            return r5
        L_0x0038:
            r5 = move-exception
            goto L_0x003c
        L_0x003a:
            r5 = move-exception
            r1 = r0
        L_0x003c:
            r5.printStackTrace()     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0049
            r1.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x0049
        L_0x0045:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0049:
            return r0
        L_0x004a:
            r5 = move-exception
            if (r1 == 0) goto L_0x0055
            r1.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0055
        L_0x0051:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0055:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p011cn.ijiami.callm.p012j.C0233H.m366n(int):java.lang.String");
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: o */
    private static boolean m367o() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            try {
                Method declaredMethod = cls.getDeclaredMethod("get", String.class);
                declaredMethod.setAccessible(true);
                String str = (String) declaredMethod.invoke(cls, "ro.build.version.emui");
                if (TextUtils.isEmpty(str) || !str.equals("5")) {
                    return false;
                }
                return true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                return false;
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return false;
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
                return false;
            }
        } catch (ClassNotFoundException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public static void onWindowFocusChanged(boolean z) {
        if (!z) {
            f521l.removeCallbacks(f524o);
            f521l.removeCallbacks(f527r);
            f521l.postDelayed(f527r, 800);
        }
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: p */
    private static int m368p() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
            String property = properties.getProperty("ro.miui.ui.version.name", null);
            if (((properties.getProperty("ro.miui.ui.version.code", null) == null && property == null && properties.getProperty("ro.miui.internal.storage", null) == null) ? false : true) && property.startsWith(ExifInterface.o000oo0o)) {
                try {
                    return Integer.parseInt(property.substring(1, property.length()));
                } catch (Exception unused) {
                }
            }
            return -1;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static void m369q() {
        f521l.postDelayed(f524o, (long) f525p);
    }

    public static void registerHijack(Context context) {
        Application application;
        if (Build.VERSION.SDK_INT >= 14 && !f516g) {
            if (context instanceof Activity) {
                application = ((Activity) context).getApplication();
            } else if (context instanceof Application) {
                application = (Application) context;
            } else {
                f521l.post(new MyFindApplicationRunnable(0));
                return;
            }
            m363k(application);
            f521l.post(new MyFindApplicationRunnable(application.getClass().getName().hashCode()));
        }
    }

    public static void showTip(Context context) {
        String applicationName = getApplicationName(context);
        int i = f519j;
        if ((i <= 0 || i > 10) && !f520k) {
            if (context != null && !TextUtils.isEmpty(getApplicationName(context))) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 25) {
                    String str = Build.BRAND;
                    String str2 = Build.MODEL;
                    if (!Util.ROM_OPPO.equals(str)) {
                        Toast.makeText(context, m365m(context, applicationName), 0).show();
                    } else if ("PACM00".equals(str2) || str2.contains("R11s")) {
                        BToast.m334a().mo3832b(context, m365m(context, applicationName), 2000.0d);
                    } else {
                        Toast.makeText(context, m365m(context, applicationName), 0).show();
                    }
                } else if (i2 == 24) {
                    if (Build.BRAND.equals("Meizu")) {
                        Toast.makeText(context, m365m(context, applicationName), 0).show();
                    } else {
                        BToast.m334a().mo3832b(context, m365m(context, applicationName), 2000.0d);
                    }
                } else if (i2 == 23) {
                    String str3 = Build.BRAND;
                    String str4 = Build.MODEL;
                    if (!str3.equals(AgooConstants.MESSAGE_SYSTEM_SOURCE_VIVO) || !str4.contains("vivo Y67A")) {
                        BToast.m334a().mo3832b(context, m365m(context, applicationName), 2000.0d);
                    } else {
                        Toast.makeText(context, m365m(context, applicationName), 0).show();
                    }
                } else if (i2 < 21) {
                    Toast.makeText(context, m365m(context, applicationName), 0).show();
                } else {
                    int i3 = f519j;
                    if (i3 >= 9 || i3 == -1) {
                        String str5 = Build.BRAND;
                        String str6 = Build.MODEL;
                        if (!"KONKA".equals(str5) || !str6.contains("KONKA")) {
                            Toast.makeText(context, m365m(context, applicationName), 1).show();
                        } else {
                            DToast.m342a().mo3836c(context, m365m(context, applicationName), 2000, 20.0f);
                        }
                    } else {
                        BToast.m334a().mo3832b(context, m365m(context, applicationName), 2000.0d);
                    }
                }
            }
        } else if (context != null && applicationName != null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 19) {
                try {
                    if (f519j >= 9) {
                        Toast.makeText(context, m365m(context, applicationName), 1).show();
                    } else {
                        DToast.m342a().mo3835b(context, m365m(context, applicationName), 2000);
                    }
                } catch (Exception unused) {
                    Toast.makeText(context, m365m(context, applicationName), 1).show();
                }
            } else if (i4 < 17) {
                Toast.makeText(context, m365m(context, applicationName), 1).show();
            } else {
                Hl.m332b().mo3831c(context, m365m(context, applicationName));
            }
        }
    }

    public static void uniregisterHijack(Context context) {
        if (context instanceof Application) {
            f513d = (Application) context;
        } else if (context instanceof Activity) {
            f513d = ((Activity) context).getApplication();
        } else {
            f513d = (Application) context.getApplicationContext();
        }
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f514e;
        if (activityLifecycleCallbacks != null) {
            f513d.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            f514e = null;
        }
    }
}
