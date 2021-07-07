package com.umeng.analytics.pro;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.C3407b;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.C3417c;
import com.umeng.analytics.pro.C3437g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.j */
public class C3443j {

    /* renamed from: a */
    public static String f8696a;

    /* renamed from: e */
    public static JSONArray f8697e = new JSONArray();

    /* renamed from: f */
    public static Object f8698f = new Object();

    /* renamed from: b */
    public boolean f8699b = false;

    /* renamed from: c */
    public Application.ActivityLifecycleCallbacks f8700c = new Application.ActivityLifecycleCallbacks() {
        /* class com.umeng.analytics.pro.C3443j.C34441 */

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
            if (AnalyticsConfig.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
                C3443j.this.m8792b((C3443j) activity);
                C3407b.m8667a().mo38672i();
                C3443j.this.f8699b = false;
            }
        }

        public void onActivityResumed(Activity activity) {
            if (AnalyticsConfig.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO && activity != null) {
                C3443j jVar = C3443j.this;
                if (jVar.f8699b) {
                    jVar.f8699b = false;
                    if (!TextUtils.isEmpty(C3443j.f8696a)) {
                        String str = C3443j.f8696a;
                        if (!str.equals(activity.getPackageName() + C9058ooOoOoOO.OooOO0 + activity.getLocalClassName())) {
                            C3443j.this.m8789a((C3443j) activity);
                            C3407b.m8667a().mo38671h();
                            return;
                        }
                        return;
                    }
                    C3443j.f8696a = activity.getPackageName() + C9058ooOoOoOO.OooOO0 + activity.getLocalClassName();
                    return;
                }
                jVar.m8789a((C3443j) activity);
                C3407b.m8667a().mo38671h();
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
            if (AnalyticsConfig.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.AUTO) {
            }
        }
    };

    /* renamed from: d */
    public final Map<String, Long> f8701d = new HashMap();

    /* renamed from: g */
    public Application f8702g = null;

    /* renamed from: h */
    public boolean f8703h = false;

    public C3443j(Context context) {
        synchronized (this) {
            if (this.f8702g == null && context != null) {
                if (context instanceof Activity) {
                    this.f8702g = ((Activity) context).getApplication();
                } else if (context instanceof Application) {
                    this.f8702g = (Application) context;
                }
                if (this.f8702g != null) {
                    m8793b(context);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo38725c() {
        m8792b((Activity) null);
        mo38724b();
    }

    /* renamed from: b */
    private void m8793b(Context context) {
        if (!this.f8703h) {
            this.f8703h = true;
            Application application = this.f8702g;
            if (application != null && Build.VERSION.SDK_INT >= 14) {
                application.registerActivityLifecycleCallbacks(this.f8700c);
            }
        }
    }

    /* renamed from: a */
    public boolean mo38723a() {
        return this.f8703h;
    }

    /* renamed from: a */
    public static void m8790a(Context context) {
        String jSONArray;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f8698f) {
                    jSONArray = f8697e.toString();
                    f8697e = new JSONArray();
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put(C3417c.C3427d.C3428a.f8545c, new JSONArray(jSONArray));
                    C3437g.m8754a(context).mo38707a(C3460q.m8882a().mo38777c(), jSONObject, C3437g.EnumC3439a.AUTOPAGE);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo38724b() {
        this.f8703h = false;
        Application application = this.f8702g;
        if (application != null) {
            if (Build.VERSION.SDK_INT >= 14) {
                application.unregisterActivityLifecycleCallbacks(this.f8700c);
            }
            this.f8702g = null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x007f */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8792b(android.app.Activity r10) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3443j.m8792b(android.app.Activity):void");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m8789a(Activity activity) {
        f8696a = activity.getPackageName() + C9058ooOoOoOO.OooOO0 + activity.getLocalClassName();
        synchronized (this.f8701d) {
            this.f8701d.put(f8696a, Long.valueOf(System.currentTimeMillis()));
        }
    }
}
