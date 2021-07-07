package com.p118pd.sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.ooO00o00  reason: case insensitive filesystem */
public final class C8810ooO00o00 implements Application.ActivityLifecycleCallbacks {
    public static final C8810ooO00o00 OooO00o = new C8810ooO00o00();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f22017OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Application f22018OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<Activity> f22019OooO00o = new ArrayList();
    public List<AbstractC8812ooO00o0o> OooO0O0 = new ArrayList();
    public List<AbstractC8811ooO00o0O> OooO0OO = new ArrayList();
    public List<AbstractC8809ooO00o0> OooO0Oo = new ArrayList();
    public final String o0ooOOo = "ActivityMgr";

    private void OooO0Oo() {
        synchronized (f22017OooO00o) {
            this.f22019OooO00o.clear();
        }
    }

    public void OooO00o(Application application, Activity activity) {
        AbstractC8796ooO0000o.OooO00o("ActivityMgr", "init");
        Application application2 = this.f22018OooO00o;
        if (application2 != null) {
            application2.unregisterActivityLifecycleCallbacks(this);
        }
        this.f22018OooO00o = application;
        OooO0O0(activity);
        application.registerActivityLifecycleCallbacks(this);
    }

    public void OooO0O0(AbstractC8812ooO00o0o ooo00o0o) {
        AbstractC8796ooO0000o.OooO00o("ActivityMgr", "unRegisterOnResume:" + OooO00o((Object) ooo00o0o));
        this.OooO0O0.remove(ooo00o0o);
    }

    public void OooO0OO() {
        AbstractC8796ooO0000o.OooO00o("ActivityMgr", "release");
        Application application = this.f22018OooO00o;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this);
        }
        OooO0Oo();
        m20448OooO0O0();
        m20447OooO00o();
        this.f22018OooO00o = null;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC8796ooO0000o.OooO00o("ActivityMgr", "onCreated:" + OooO00o((Object) activity));
        OooO0O0(activity);
    }

    public void onActivityDestroyed(Activity activity) {
        AbstractC8796ooO0000o.OooO00o("ActivityMgr", "onDestroyed:" + OooO00o((Object) activity));
        OooO00o(activity);
        for (AbstractC8809ooO00o0 ooo00o0 : new ArrayList(this.OooO0Oo)) {
            ooo00o0.OooO00o(activity, OooO0O0());
        }
    }

    public void onActivityPaused(Activity activity) {
        AbstractC8796ooO0000o.OooO00o("ActivityMgr", "onPaused:" + OooO00o((Object) activity));
        for (AbstractC8811ooO00o0O ooo00o0o : new ArrayList(this.OooO0OO)) {
            ooo00o0o.OooO00o(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        AbstractC8796ooO0000o.OooO00o("ActivityMgr", "onResumed:" + OooO00o((Object) activity));
        OooO0O0(activity);
        for (AbstractC8812ooO00o0o ooo00o0o : new ArrayList(this.OooO0O0)) {
            ooo00o0o.OooO0O0(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        AbstractC8796ooO0000o.OooO00o("ActivityMgr", "onStarted:" + OooO00o((Object) activity));
        OooO0O0(activity);
    }

    public void onActivityStopped(Activity activity) {
        AbstractC8796ooO0000o.OooO00o("ActivityMgr", "onStopped:" + OooO00o((Object) activity));
    }

    public void OooO0O0(AbstractC8811ooO00o0O ooo00o0o) {
        AbstractC8796ooO0000o.OooO00o("ActivityMgr", "unRegisterOnPause:" + OooO00o((Object) ooo00o0o));
        this.OooO0OO.remove(ooo00o0o);
    }

    public void OooO0O0(AbstractC8809ooO00o0 ooo00o0) {
        AbstractC8796ooO0000o.OooO00o("ActivityMgr", "unRegisterOnDestroyed:" + OooO00o((Object) ooo00o0));
        this.OooO0Oo.remove(ooo00o0);
    }

    public void OooO00o(AbstractC8812ooO00o0o ooo00o0o) {
        AbstractC8796ooO0000o.OooO00o("ActivityMgr", "registerOnResume:" + OooO00o((Object) ooo00o0o));
        this.OooO0O0.add(ooo00o0o);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m20448OooO0O0() {
        AbstractC8796ooO0000o.OooO00o("ActivityMgr", "clearOnResumeCallback");
        this.OooO0O0.clear();
    }

    private void OooO0O0(Activity activity) {
        synchronized (f22017OooO00o) {
            int indexOf = this.f22019OooO00o.indexOf(activity);
            if (indexOf == -1) {
                this.f22019OooO00o.add(activity);
            } else if (indexOf < this.f22019OooO00o.size() - 1) {
                this.f22019OooO00o.remove(activity);
                this.f22019OooO00o.add(activity);
            }
        }
    }

    public void OooO00o(AbstractC8811ooO00o0O ooo00o0o) {
        AbstractC8796ooO0000o.OooO00o("ActivityMgr", "registerOnPause:" + OooO00o((Object) ooo00o0o));
        this.OooO0OO.add(ooo00o0o);
    }

    public void OooO00o(AbstractC8809ooO00o0 ooo00o0) {
        AbstractC8796ooO0000o.OooO00o("ActivityMgr", "registerOnDestroyed:" + OooO00o((Object) ooo00o0));
        this.OooO0Oo.add(ooo00o0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20447OooO00o() {
        AbstractC8796ooO0000o.OooO00o("ActivityMgr", "clearOnPauseCallback");
        this.OooO0OO.clear();
    }

    public Activity OooO00o() {
        return OooO0O0();
    }

    private void OooO00o(Activity activity) {
        synchronized (f22017OooO00o) {
            this.f22019OooO00o.remove(activity);
        }
    }

    private Activity OooO0O0() {
        synchronized (f22017OooO00o) {
            if (this.f22019OooO00o.size() <= 0) {
                return null;
            }
            return this.f22019OooO00o.get(this.f22019OooO00o.size() - 1);
        }
    }

    public static String OooO00o(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.getClass().getName() + '@' + Integer.toHexString(obj.hashCode());
    }
}
