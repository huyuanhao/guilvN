package com.tencent.bugly.beta.p267ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.p118pd.sdk.C5982OoooOoO;
import com.tencent.bugly.beta.global.C3226e;
import com.tencent.bugly.beta.global.RunnableC3225d;
import com.tencent.bugly.beta.upgrade.C3247c;
import com.tencent.bugly.beta.utils.C3254e;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3325ap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.bugly.beta.ui.g */
public class C3243g {

    /* renamed from: a */
    public static final Map<Integer, AbstractC3238b> f7457a = new ConcurrentHashMap();

    /* renamed from: b */
    public static final Map<Integer, RunnableC3225d> f7458b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final Map<Integer, RunnableC3225d> f7459c = new ConcurrentHashMap();

    /* renamed from: d */
    public static RunnableC3225d f7460d;

    /* renamed from: a */
    public static synchronized void m7793a(AbstractC3238b bVar, boolean z) {
        synchronized (C3243g.class) {
            if (Build.VERSION.SDK_INT >= 14) {
                m7794a(bVar, z, false, WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS);
            } else {
                try {
                    ActivityManager activityManager = (ActivityManager) C3226e.f7357E.f7406s.getSystemService(C5982OoooOoO.OooO0o0);
                    if (activityManager != null) {
                        activityManager.getRunningTasks(1);
                        m7794a(bVar, z, false, WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS);
                    }
                } catch (SecurityException unused) {
                    if (z) {
                        m7794a(bVar, z, true, 0);
                        return;
                    }
                    C3321an.m8357e("无法获取GET_TASK权限，将在通知栏提醒升级，如需弹窗提醒，请在AndroidManifest.xml中添加GET_TASKS权限：\n<uses-permission android:name=\"android.permission.GET_TASKS\" />\n", new Object[0]);
                    if (!(C3247c.f7488a.f7489b == null || C3247c.f7488a.f7489b.f7476a == null)) {
                        C3239c.f7439a.mo38020a(C3247c.f7488a.f7489b.f7476a, bVar);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static synchronized boolean m7795b() {
        synchronized (C3243g.class) {
            String a = m7792a();
            if (a == null || a.equals("background") || a.equals("unknown")) {
                return false;
            }
            Class<?> cls = null;
            try {
                cls = Class.forName(a);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if (!C3226e.f7357E.f7400m.isEmpty()) {
                for (Class<? extends Activity> cls2 : C3226e.f7357E.f7400m) {
                    if (TextUtils.equals(cls2.getName(), a) || (cls != null && cls2.isAssignableFrom(cls))) {
                        return true;
                    }
                }
                return false;
            } else if (C3226e.f7357E.f7401n.isEmpty()) {
                return true;
            } else {
                for (Class<? extends Activity> cls3 : C3226e.f7357E.f7401n) {
                    if (TextUtils.equals(cls3.getName(), a) || (cls != null && cls3.isAssignableFrom(cls))) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m7794a(AbstractC3238b bVar, boolean z, boolean z2, long j) {
        synchronized (C3243g.class) {
            if (bVar != null) {
                if (!bVar.mo38017b()) {
                    int hashCode = bVar.hashCode();
                    if (bVar instanceof C3244h) {
                        C3254e.m7895b(f7460d);
                        if (((C3244h) bVar).f7466p.f8297g == 2) {
                            RunnableC3225d dVar = new RunnableC3225d(15, bVar, Boolean.valueOf(z), Boolean.valueOf(z2), Long.valueOf(j));
                            f7460d = dVar;
                            C3254e.m7894a(dVar, 3000);
                        }
                        if (z || m7795b()) {
                            C3254e.m7895b(f7458b.remove(Integer.valueOf(hashCode)));
                        } else {
                            RunnableC3225d dVar2 = f7458b.get(Integer.valueOf(hashCode));
                            if (dVar2 == null) {
                                dVar2 = new RunnableC3225d(11, bVar, Boolean.valueOf(z), Boolean.valueOf(z2), Long.valueOf(j));
                                f7458b.put(Integer.valueOf(hashCode), dVar2);
                            }
                            C3254e.m7895b(dVar2);
                            C3254e.m7894a(dVar2, j);
                            return;
                        }
                    }
                    if (z2 || C3325ap.m8421b(C3226e.f7357E.f7406s)) {
                        C3254e.m7895b(f7459c.remove(Integer.valueOf(hashCode)));
                        RunnableC3225d dVar3 = new RunnableC3225d(17, f7457a, Integer.valueOf(hashCode), bVar);
                        FragmentActivity activity = bVar.getActivity();
                        if (activity != null) {
                            if (activity instanceof BetaActivity) {
                                ((BetaActivity) activity).onDestroyRunnable = dVar3;
                            } else {
                                C3254e.m7894a(dVar3, 400);
                            }
                            activity.finish();
                        } else {
                            dVar3.run();
                        }
                        return;
                    }
                    RunnableC3225d dVar4 = f7459c.get(Integer.valueOf(hashCode));
                    if (dVar4 == null) {
                        dVar4 = new RunnableC3225d(11, bVar, Boolean.valueOf(z), Boolean.valueOf(z2), Long.valueOf(j));
                        f7459c.put(Integer.valueOf(hashCode), dVar4);
                    }
                    C3254e.m7895b(dVar4);
                    C3254e.m7894a(dVar4, j);
                }
            }
        }
    }

    /* renamed from: a */
    public static String m7792a() {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        try {
            if (Build.VERSION.SDK_INT >= 14) {
                return C3269a.m7966b().f7698v;
            }
            ActivityManager activityManager = (ActivityManager) C3226e.f7357E.f7406s.getSystemService(C5982OoooOoO.OooO0o0);
            if (activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || runningTasks.isEmpty()) {
                return null;
            }
            return runningTasks.get(0).topActivity.getClassName();
        } catch (SecurityException unused) {
            C3321an.m8357e("无法获取Activity信息，请在AndroidManifest.xml中添加GET_TASKS权限：\n<uses-permission android:name=\"android.permission.GET_TASKS\" />\n", new Object[0]);
            return null;
        } catch (Exception e) {
            if (C3321an.m8353b(e)) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }
}
