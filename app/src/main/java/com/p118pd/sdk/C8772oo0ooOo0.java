package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.p118pd.sdk.C8771oo0ooOo;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@TargetApi(14)
/* renamed from: com.pd.sdk.oo0ooOo0  reason: case insensitive filesystem */
public class C8772oo0ooOo0 implements Application.ActivityLifecycleCallbacks {
    public static final long OooO00o = 500;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static C8772oo0ooOo0 f21947OooO00o = null;
    public static final String o0ooOOo = "AppForegroundWatcher";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f21948OooO00o = new Handler();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Runnable f21949OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<C8771oo0ooOo.OooO00o> f21950OooO00o = new CopyOnWriteArrayList();
    public boolean OooO0O0 = false;
    public boolean OooO0OO = true;

    /* renamed from: com.pd.sdk.oo0ooOo0$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            if (C8772oo0ooOo0.this.OooO0O0 && C8772oo0ooOo0.this.OooO0OO) {
                C8772oo0ooOo0.this.OooO0O0 = false;
                AbstractC8796ooO0000o.OooO00o(C8772oo0ooOo0.o0ooOOo, "app in background");
                for (C8771oo0ooOo.OooO00o oooO00o : C8772oo0ooOo0.this.f21950OooO00o) {
                    try {
                        oooO00o.OooO0O0();
                    } catch (Exception e) {
                        AbstractC8796ooO0000o.OooO0O0(C8772oo0ooOo0.o0ooOOo, "AppForegroundObserver threw exception!", e);
                    }
                }
            }
        }
    }

    public static boolean OooO0OO() {
        return f21947OooO00o == null;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        this.OooO0OO = true;
        Runnable runnable = this.f21949OooO00o;
        if (runnable != null) {
            this.f21948OooO00o.removeCallbacks(runnable);
        } else {
            this.f21949OooO00o = new OooO00o();
        }
        this.f21948OooO00o.postDelayed(this.f21949OooO00o, 500);
    }

    public void onActivityResumed(Activity activity) {
        this.OooO0OO = false;
        boolean z = !this.OooO0O0;
        this.OooO0O0 = true;
        Runnable runnable = this.f21949OooO00o;
        if (runnable != null) {
            this.f21948OooO00o.removeCallbacks(runnable);
        }
        if (z) {
            AbstractC8796ooO0000o.OooO00o(o0ooOOo, "app on foreground");
            for (C8771oo0ooOo.OooO00o oooO00o : this.f21950OooO00o) {
                try {
                    oooO00o.OooO00o();
                } catch (Exception e) {
                    AbstractC8796ooO0000o.OooO0O0(o0ooOOo, "AppForegroundObserver threw exception!", e);
                }
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public static void OooO0O0(C8771oo0ooOo.OooO00o oooO00o) {
        if (!OooO0OO() && oooO00o != null) {
            f21947OooO00o.f21950OooO00o.remove(oooO00o);
            AbstractC8796ooO0000o.OooO00o(o0ooOOo, "remove AppForegroundObserver");
        }
    }

    @TargetApi(14)
    public static void OooO00o(Context context) {
        if (Build.VERSION.SDK_INT < 14 || !(context instanceof Application) || f21947OooO00o != null) {
            AbstractC8796ooO0000o.OooO0O0(o0ooOOo, "app can not register activity lifecycle callbacks, sdk version=" + Build.VERSION.SDK_INT);
            return;
        }
        C8772oo0ooOo0 oo0oooo0 = new C8772oo0ooOo0();
        f21947OooO00o = oo0oooo0;
        ((Application) context).registerActivityLifecycleCallbacks(oo0oooo0);
        AbstractC8796ooO0000o.OooO00o(o0ooOOo, "app register activity lifecycle callbacks success");
    }

    public static boolean OooO0O0() {
        if (OooO0OO()) {
            return false;
        }
        return f21947OooO00o.OooO0O0;
    }

    public static void OooO00o(C8771oo0ooOo.OooO00o oooO00o) {
        if (!OooO0OO() && oooO00o != null && !f21947OooO00o.f21950OooO00o.contains(oooO00o)) {
            f21947OooO00o.f21950OooO00o.add(oooO00o);
            AbstractC8796ooO0000o.OooO00o(o0ooOOo, "add AppForegroundObserver");
        }
    }

    public static boolean OooO00o() {
        if (OooO0OO()) {
            return false;
        }
        return !f21947OooO00o.OooO0O0;
    }
}
