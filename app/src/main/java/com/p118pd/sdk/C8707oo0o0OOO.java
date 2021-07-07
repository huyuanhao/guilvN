package com.p118pd.sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.pd.sdk.oo0o0OOO  reason: case insensitive filesystem */
public class C8707oo0o0OOO implements Application.ActivityLifecycleCallbacks {
    public static C8707oo0o0OOO OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static List<Activity> f21868OooO00o = Collections.synchronizedList(new LinkedList());
    public static int o00oO0O = 0;
    public static final String o0ooOOo = "AppLifeCycleCallbacks";

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8711oo0o0OoO f21869OooO00o;

    public static C8707oo0o0OOO OooO00o(Application application) {
        if (OooO00o == null) {
            synchronized (C8707oo0o0OOO.class) {
                C8707oo0o0OOO oo0o0ooo = new C8707oo0o0OOO();
                OooO00o = oo0o0ooo;
                application.registerActivityLifecycleCallbacks(oo0o0ooo);
            }
        }
        return OooO00o;
    }

    private void OooO0O0(Activity activity) {
        f21868OooO00o.remove(activity);
        activity.finish();
        String str = "popActivity mActivities size" + f21868OooO00o.size();
    }

    private void OooO0OO(Activity activity) {
        String str;
        if (!f21868OooO00o.isEmpty()) {
            List<Activity> list = f21868OooO00o;
            str = list.get(list.size() - 1).getComponentName().getClassName();
        } else {
            str = "";
        }
        if (!str.equals(activity.getComponentName().getClassName())) {
            f21868OooO00o.add(activity);
            String str2 = "pushActivity mActivities size" + f21868OooO00o.size();
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        OooO0OO(activity);
    }

    public void onActivityDestroyed(Activity activity) {
        if (f21868OooO00o.contains(activity)) {
            OooO0O0(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        int i = o00oO0O;
        o00oO0O = i + 1;
        if (i == 0) {
            this.f21869OooO00o.OooO00o();
        }
        String str = "activityCount start : " + o00oO0O;
    }

    public void onActivityStopped(Activity activity) {
        int i = o00oO0O - 1;
        o00oO0O = i;
        if (i == 0) {
            this.f21869OooO00o.OooO0O0();
        }
        String str = "activityCount stop : " + o00oO0O;
    }

    public static Activity OooO0O0() {
        List<Activity> list = f21868OooO00o;
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<Activity> list2 = f21868OooO00o;
        return list2.get(list2.size() - 1);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static void m20331OooO0O0() {
        List<Activity> list = f21868OooO00o;
        if (list != null && !list.isEmpty()) {
            List<Activity> list2 = f21868OooO00o;
            OooO00o(list2.get(list2.size() - 1));
        }
    }

    public void OooO00o(AbstractC8711oo0o0OoO oo0o0ooo) {
        this.f21869OooO00o = oo0o0ooo;
    }

    public static void OooO00o(Activity activity) {
        List<Activity> list = f21868OooO00o;
        if (list != null && !list.isEmpty() && activity != null) {
            f21868OooO00o.remove(activity);
            activity.finish();
        }
    }

    public static void OooO0O0(Class<?> cls) {
        List<Activity> list = f21868OooO00o;
        if (!(list == null || list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (Activity activity : f21868OooO00o) {
                if (activity.getClass().equals(cls)) {
                    arrayList.add(activity);
                    activity.finish();
                    return;
                }
                arrayList.add(activity);
                activity.finish();
            }
            f21868OooO00o.removeAll(arrayList);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20330OooO00o(Class<?> cls) {
        List<Activity> list = f21868OooO00o;
        if (!(list == null || list.isEmpty())) {
            for (Activity activity : f21868OooO00o) {
                if (activity.getClass().equals(cls)) {
                    OooO00o(activity);
                }
            }
        }
    }

    public static Activity OooO00o(Class<?> cls) {
        List<Activity> list = f21868OooO00o;
        if (list != null) {
            for (Activity activity : list) {
                if (activity.getClass().equals(cls)) {
                    return activity;
                }
            }
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Activity m20332OooO00o() {
        synchronized (f21868OooO00o) {
            int size = f21868OooO00o.size() - 1;
            if (size < 0) {
                return null;
            }
            return f21868OooO00o.get(size);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20333OooO00o() {
        return m20332OooO00o().getClass().getName();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20329OooO00o() {
        List<Activity> list = f21868OooO00o;
        if (list != null) {
            for (Activity activity : list) {
                activity.finish();
            }
            f21868OooO00o.clear();
        }
    }

    public static int OooO00o() {
        return o00oO0O;
    }
}
