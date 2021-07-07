package com.p118pd.sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oOoo0o0o  reason: case insensitive filesystem */
public final class C8418oOoo0o0o implements Application.ActivityLifecycleCallbacks {
    public static final C8418oOoo0o0o OooO00o = new C8418oOoo0o0o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f21560OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Application f21561OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<Activity> f21562OooO00o = new ArrayList();
    public List<AbstractC8428oOooO00> OooO0O0 = new ArrayList();
    public List<AbstractC8429oOooO000> OooO0OO = new ArrayList();
    public List<AbstractC8389oOoo> OooO0Oo = new ArrayList();

    private void OooO0Oo() {
        synchronized (f21560OooO00o) {
            this.f21562OooO00o.clear();
        }
    }

    public void OooO00o(Application application, Activity activity) {
        C8425oOoo0ooo.OooO00o("init");
        Application application2 = this.f21561OooO00o;
        if (application2 != null) {
            application2.unregisterActivityLifecycleCallbacks(this);
        }
        this.f21561OooO00o = application;
        OooO0O0(activity);
        application.registerActivityLifecycleCallbacks(this);
    }

    public void OooO0O0(AbstractC8428oOooO00 ooooo00) {
        C8425oOoo0ooo.OooO00o("unRegisterOnResume:" + C8432oOooO0O0.OooO00o(ooooo00));
        this.OooO0O0.remove(ooooo00);
    }

    public void OooO0OO() {
        C8425oOoo0ooo.OooO00o("release");
        Application application = this.f21561OooO00o;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this);
        }
        OooO0Oo();
        m20085OooO0O0();
        m20084OooO00o();
        this.f21561OooO00o = null;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C8425oOoo0ooo.OooO00o("onCreated:" + C8432oOooO0O0.OooO00o(activity));
        OooO0O0(activity);
    }

    public void onActivityDestroyed(Activity activity) {
        C8425oOoo0ooo.OooO00o("onDestroyed:" + C8432oOooO0O0.OooO00o(activity));
        OooO00o(activity);
        for (AbstractC8389oOoo oooo : new ArrayList(this.OooO0Oo)) {
            oooo.OooO00o(activity, OooO0O0());
        }
    }

    public void onActivityPaused(Activity activity) {
        C8425oOoo0ooo.OooO00o("onPaused:" + C8432oOooO0O0.OooO00o(activity));
        for (AbstractC8429oOooO000 ooooo000 : new ArrayList(this.OooO0OO)) {
            ooooo000.OooO00o(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        C8425oOoo0ooo.OooO00o("onResumed:" + C8432oOooO0O0.OooO00o(activity));
        OooO0O0(activity);
        for (AbstractC8428oOooO00 ooooo00 : new ArrayList(this.OooO0O0)) {
            ooooo00.OooO0O0(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        C8425oOoo0ooo.OooO00o("onStarted:" + C8432oOooO0O0.OooO00o(activity));
        OooO0O0(activity);
    }

    public void onActivityStopped(Activity activity) {
        C8425oOoo0ooo.OooO00o("onStopped:" + C8432oOooO0O0.OooO00o(activity));
    }

    public void OooO0O0(AbstractC8429oOooO000 ooooo000) {
        C8425oOoo0ooo.OooO00o("unRegisterOnPause:" + C8432oOooO0O0.OooO00o(ooooo000));
        this.OooO0OO.remove(ooooo000);
    }

    public void OooO0O0(AbstractC8389oOoo oooo) {
        C8425oOoo0ooo.OooO00o("unRegisterOnDestroyed:" + C8432oOooO0O0.OooO00o(oooo));
        this.OooO0Oo.remove(oooo);
    }

    public void OooO00o(AbstractC8428oOooO00 ooooo00) {
        C8425oOoo0ooo.OooO00o("registerOnResume:" + C8432oOooO0O0.OooO00o(ooooo00));
        this.OooO0O0.add(ooooo00);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m20085OooO0O0() {
        C8425oOoo0ooo.OooO00o("clearOnResumeCallback");
        this.OooO0O0.clear();
    }

    private void OooO0O0(Activity activity) {
        synchronized (f21560OooO00o) {
            int indexOf = this.f21562OooO00o.indexOf(activity);
            if (indexOf == -1) {
                this.f21562OooO00o.add(activity);
            } else if (indexOf < this.f21562OooO00o.size() - 1) {
                this.f21562OooO00o.remove(activity);
                this.f21562OooO00o.add(activity);
            }
        }
    }

    public void OooO00o(AbstractC8429oOooO000 ooooo000) {
        C8425oOoo0ooo.OooO00o("registerOnPause:" + C8432oOooO0O0.OooO00o(ooooo000));
        this.OooO0OO.add(ooooo000);
    }

    public void OooO00o(AbstractC8389oOoo oooo) {
        C8425oOoo0ooo.OooO00o("registerOnDestroyed:" + C8432oOooO0O0.OooO00o(oooo));
        this.OooO0Oo.add(oooo);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20084OooO00o() {
        C8425oOoo0ooo.OooO00o("clearOnPauseCallback");
        this.OooO0OO.clear();
    }

    public Activity OooO00o() {
        return OooO0O0();
    }

    private void OooO00o(Activity activity) {
        synchronized (f21560OooO00o) {
            this.f21562OooO00o.remove(activity);
        }
    }

    private Activity OooO0O0() {
        synchronized (f21560OooO00o) {
            if (this.f21562OooO00o.size() <= 0) {
                return null;
            }
            return this.f21562OooO00o.get(this.f21562OooO00o.size() - 1);
        }
    }
}
