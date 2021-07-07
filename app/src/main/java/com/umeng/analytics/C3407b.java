package com.umeng.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.filter.C3411a;
import com.umeng.analytics.filter.C3412b;
import com.umeng.analytics.pro.AbstractC3459p;
import com.umeng.analytics.pro.AbstractC3470x;
import com.umeng.analytics.pro.C3416b;
import com.umeng.analytics.pro.C3437g;
import com.umeng.analytics.pro.C3441h;
import com.umeng.analytics.pro.C3442i;
import com.umeng.analytics.pro.C3443j;
import com.umeng.analytics.pro.C3445k;
import com.umeng.analytics.pro.C3451l;
import com.umeng.analytics.pro.C3456o;
import com.umeng.analytics.pro.C3460q;
import com.umeng.analytics.pro.C3463r;
import com.umeng.analytics.pro.C3466u;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.b */
public class C3407b implements AbstractC3459p {

    /* renamed from: A */
    public static final String f8375A = "umsp_2";

    /* renamed from: B */
    public static final String f8376B = "umsp_3";

    /* renamed from: C */
    public static final String f8377C = "umsp_4";

    /* renamed from: D */
    public static final String f8378D = "umsp_5";

    /* renamed from: h */
    public static final String f8379h = "sp_uapp";

    /* renamed from: i */
    public static final String f8380i = "prepp_uapp";

    /* renamed from: o */
    public static final int f8381o = 128;

    /* renamed from: p */
    public static final int f8382p = 256;

    /* renamed from: q */
    public static String f8383q = "";

    /* renamed from: r */
    public static String f8384r = "";

    /* renamed from: s */
    public static final String f8385s = "ekv_bl";

    /* renamed from: t */
    public static final String f8386t = "ekv_bl_ver";

    /* renamed from: v */
    public static final String f8387v = "ekv_wl";

    /* renamed from: w */
    public static final String f8388w = "ekv_wl_ver";

    /* renamed from: y */
    public static boolean f8389y = m8673n();

    /* renamed from: z */
    public static final String f8390z = "umsp_1";

    /* renamed from: a */
    public Context f8391a;

    /* renamed from: b */
    public AbstractC3470x f8392b;

    /* renamed from: c */
    public C3451l f8393c;

    /* renamed from: d */
    public C3463r f8394d;

    /* renamed from: e */
    public C3442i f8395e;

    /* renamed from: f */
    public C3460q f8396f;

    /* renamed from: g */
    public C3443j f8397g;

    /* renamed from: j */
    public boolean f8398j;

    /* renamed from: k */
    public volatile JSONObject f8399k;

    /* renamed from: l */
    public volatile JSONObject f8400l;

    /* renamed from: m */
    public volatile JSONObject f8401m;

    /* renamed from: n */
    public boolean f8402n;

    /* renamed from: u */
    public C3411a f8403u;

    /* renamed from: x */
    public C3412b f8404x;

    /* renamed from: com.umeng.analytics.b$a */
    public static class C3409a {

        /* renamed from: a */
        public static final C3407b f8405a = new C3407b();
    }

    /* renamed from: a */
    public static C3407b m8667a() {
        return C3409a.f8405a;
    }

    /* renamed from: i */
    private void m8672i(Context context) {
        if (context == null) {
            try {
                MLog.m9793e("unexpected null context in getNativeSuperProperties");
            } catch (Throwable unused) {
            }
        } else {
            if (this.f8391a == null) {
                this.f8391a = context.getApplicationContext();
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (this.f8399k == null) {
                this.f8399k = new JSONObject();
            }
            if (this.f8400l == null) {
                this.f8400l = new JSONObject();
            }
            String string = sharedPreferences.getString(f8380i, null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.f8401m = new JSONObject(string);
                } catch (JSONException unused2) {
                }
            }
            if (this.f8401m == null) {
                this.f8401m = new JSONObject();
            }
        }
    }

    /* renamed from: n */
    public static boolean m8673n() {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.UMConfigure");
            if (cls == null || cls.getMethod("getInitStatus", new Class[0]) == null) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: o */
    public static boolean m8674o() {
        Method method;
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.UMConfigure");
            if (cls == null || (method = cls.getMethod("getInitStatus", new Class[0])) == null) {
                return false;
            }
            return ((Boolean) method.invoke(cls, new Object[0])).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public JSONObject mo38651b() {
        return this.f8399k;
    }

    /* renamed from: c */
    public JSONObject mo38656c() {
        return this.f8401m;
    }

    /* renamed from: d */
    public JSONObject mo38659d() {
        return this.f8400l;
    }

    /* renamed from: e */
    public void mo38664e() {
        this.f8400l = null;
    }

    /* renamed from: f */
    public String mo38665f() {
        if (UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
            return f8383q;
        }
        MLog.m9793e("getOnResumedActivityName can not be called in child process");
        return null;
    }

    /* renamed from: g */
    public String mo38668g() {
        if (UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
            return f8384r;
        }
        MLog.m9793e("getOnPausedActivityName can not be called in child process");
        return null;
    }

    /* renamed from: h */
    public void mo38671h() {
        try {
            if (this.f8391a != null) {
                if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
                    MLog.m9793e("onStartSessionInternal can not be called in child process");
                    return;
                }
                if (UMConfigure.isDebugLog() && f8389y && !m8674o()) {
                    UMLog.mutlInfo(C3441h.f8602H, 3, "", null, null);
                }
                long currentTimeMillis = System.currentTimeMillis();
                UMWorkDispatch.sendEvent(this.f8391a, 4352, CoreProtocol.getInstance(this.f8391a), Long.valueOf(currentTimeMillis));
                UMWorkDispatch.sendEvent(this.f8391a, 4103, CoreProtocol.getInstance(this.f8391a), Long.valueOf(currentTimeMillis));
            }
            if (this.f8392b != null) {
                this.f8392b.mo38801a();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: j */
    public void mo38673j() {
        try {
            if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
                MLog.m9793e("onProfileSignOff can not be called in child process");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ts", currentTimeMillis);
            UMWorkDispatch.sendEvent(this.f8391a, 4102, CoreProtocol.getInstance(this.f8391a), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m9795e(" Excepthon  in  onProfileSignOff", th);
            }
        }
    }

    /* renamed from: k */
    public synchronized void mo38674k() {
        try {
            if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
                MLog.m9793e("unregisterSuperPropertyByCoreProtocol can not be called in child process");
                return;
            }
            if (this.f8399k == null || this.f8391a == null) {
                this.f8399k = new JSONObject();
            } else {
                SharedPreferences.Editor edit = PreferenceWrapper.getDefault(this.f8391a).edit();
                edit.putString(f8379h, this.f8399k.toString());
                edit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0020 */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized org.json.JSONObject mo38675l() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.umeng.commonsdk.service.UMGlobalContext r0 = com.umeng.commonsdk.service.UMGlobalContext.getInstance()     // Catch:{ all -> 0x0020 }
            android.content.Context r1 = r2.f8391a     // Catch:{ all -> 0x0020 }
            boolean r0 = r0.isMainProcess(r1)     // Catch:{ all -> 0x0020 }
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "getSuperPropertiesJSONObject can not be called in child process"
            com.umeng.commonsdk.statistics.common.MLog.m9793e(r0)     // Catch:{ all -> 0x0020 }
            r0 = 0
            monitor-exit(r2)
            return r0
        L_0x0015:
            org.json.JSONObject r0 = r2.f8399k
            if (r0 != 0) goto L_0x0020
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r2.f8399k = r0
        L_0x0020:
            org.json.JSONObject r0 = r2.f8399k     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return r0
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.C3407b.mo38675l():org.json.JSONObject");
    }

    /* renamed from: m */
    public synchronized void mo38676m() {
        try {
            if (this.f8391a != null) {
                if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
                    MLog.m9793e("clearSuperPropertiesByCoreProtocol can not be called in child process");
                    return;
                }
                SharedPreferences.Editor edit = PreferenceWrapper.getDefault(this.f8391a).edit();
                edit.remove(f8379h);
                edit.commit();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return;
    }

    public C3407b() {
        this.f8391a = null;
        this.f8393c = new C3451l();
        this.f8394d = new C3463r();
        this.f8395e = new C3442i();
        this.f8396f = C3460q.m8882a();
        this.f8397g = null;
        this.f8398j = false;
        this.f8399k = null;
        this.f8400l = null;
        this.f8401m = null;
        this.f8402n = false;
        this.f8403u = null;
        this.f8404x = null;
        this.f8393c.mo38759a(this);
    }

    /* renamed from: a */
    public void mo38632a(Context context) {
        if (context != null) {
            try {
                if (this.f8391a == null) {
                    this.f8391a = context.getApplicationContext();
                }
                if (this.f8403u == null) {
                    C3411a aVar = new C3411a("ekv_bl", "ekv_bl_ver");
                    this.f8403u = aVar;
                    aVar.register(this.f8391a);
                }
                if (this.f8404x == null) {
                    C3412b bVar = new C3412b("ekv_wl", "ekv_wl_ver");
                    this.f8404x = bVar;
                    bVar.register(this.f8391a);
                }
                if (UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
                    if (!this.f8398j) {
                        this.f8398j = true;
                        m8672i(this.f8391a);
                    }
                    if (Build.VERSION.SDK_INT > 13) {
                        synchronized (this) {
                            if (!this.f8402n) {
                                C3443j jVar = new C3443j(context);
                                this.f8397g = jVar;
                                if (jVar.mo38723a()) {
                                    this.f8402n = true;
                                }
                            }
                        }
                    } else {
                        this.f8402n = true;
                    }
                    if (UMConfigure.isDebugLog()) {
                        UMLog.mutlInfo(C3441h.f8596B, 3, "", null, null);
                    }
                    UMWorkDispatch.registerConnStateObserver(CoreProtocol.getInstance(this.f8391a));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo38655b(String str) {
        if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
            MLog.m9793e("onPageEnd can not be called in child process");
            return;
        }
        try {
            if (AnalyticsConfig.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_AUTO) {
                this.f8394d.mo38782b(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public void mo38657c(Context context) {
        if (context == null) {
            UMLog.m9005aq(C3441h.f8685p, 0, "\\|");
        } else if (AnalyticsConfig.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.AUTO) {
            if (this.f8391a == null) {
                this.f8391a = context.getApplicationContext();
            }
            if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
                MLog.m9793e("onPause can not be called in child process");
                return;
            }
            if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
                UMLog.m9005aq(C3441h.f8686q, 2, "\\|");
            }
            try {
                if (!this.f8398j || !this.f8402n) {
                    mo38632a(context);
                }
                if (AnalyticsConfig.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_MANUAL) {
                    this.f8395e.mo38782b(context.getClass().getName());
                }
                mo38672i();
            } catch (Throwable th) {
                if (MLog.DEBUG) {
                    MLog.m9795e("Exception occurred in Mobclick.onRause(). ", th);
                }
            }
            if (UMConfigure.isDebugLog() && (context instanceof Activity)) {
                f8384r = context.getClass().getName();
            }
        }
    }

    /* renamed from: d */
    public void mo38660d(Context context) {
        if (context != null) {
            try {
                if (this.f8391a == null) {
                    this.f8391a = context.getApplicationContext();
                }
                if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
                    MLog.m9793e("onKillProcess can not be called in child process");
                    return;
                }
                if (this.f8397g != null) {
                    this.f8397g.mo38725c();
                }
                if (this.f8395e != null) {
                    this.f8395e.mo38781b();
                }
                if (this.f8394d != null) {
                    this.f8394d.mo38781b();
                }
                if (this.f8391a != null) {
                    if (this.f8396f != null) {
                        this.f8396f.mo38779c(this.f8391a, Long.valueOf(System.currentTimeMillis()));
                    }
                    C3445k.m8798a(this.f8391a).mo38746d();
                    C3463r.m8900a(this.f8391a);
                    C3443j.m8790a(this.f8391a);
                    PreferenceWrapper.getDefault(this.f8391a).edit().commit();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: e */
    public synchronized Object mo38662e(Context context, String str) {
        if (context == null) {
            try {
                UMLog.m9005aq(C3441h.f8653ai, 0, "\\|");
                return null;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            if (this.f8391a == null) {
                this.f8391a = context.getApplicationContext();
            }
            if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
                MLog.m9793e("getSuperProperty can not be called in child process");
                return null;
            } else if (TextUtils.isEmpty(str)) {
                UMLog.m9005aq(C3441h.f8651ag, 0, "\\|");
                return null;
            } else if (str.equals(f8390z) || str.equals(f8375A) || str.equals(f8376B) || str.equals(f8377C) || str.equals(f8378D)) {
                if (this.f8399k == null) {
                    this.f8399k = new JSONObject();
                } else if (this.f8399k.has(str)) {
                    return this.f8399k.opt(str);
                }
                return null;
            } else {
                MLog.m9793e("please check key or value, must be correct!");
                return null;
            }
        }
    }

    /* renamed from: f */
    public synchronized void mo38666f(Context context) {
        if (context == null) {
            UMLog.m9005aq(C3441h.f8652ah, 0, "\\|");
            return;
        }
        if (this.f8391a == null) {
            this.f8391a = context.getApplicationContext();
        }
        if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
            MLog.m9793e("clearSuperProperties can not be called in child process");
            return;
        }
        if (!this.f8398j || !this.f8402n) {
            mo38632a(this.f8391a);
        }
        this.f8399k = new JSONObject();
        UMWorkDispatch.sendEvent(this.f8391a, 8196, CoreProtocol.getInstance(this.f8391a), null);
    }

    /* renamed from: g */
    public synchronized void mo38669g(Context context) {
        if (context == null) {
            UMLog.m9005aq(C3441h.f8660ap, 0, "\\|");
            return;
        }
        if (this.f8391a == null) {
            this.f8391a = context.getApplicationContext();
        }
        if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
            MLog.m9793e("clearPreProperties can not be called in child process");
            return;
        }
        if (!this.f8398j || !this.f8402n) {
            mo38632a(this.f8391a);
        }
        if (this.f8401m.length() > 0) {
            UMWorkDispatch.sendEvent(this.f8391a, 8201, CoreProtocol.getInstance(this.f8391a), null);
        }
        this.f8401m = new JSONObject();
    }

    /* renamed from: b */
    public void mo38652b(Context context) {
        if (context == null) {
            MLog.m9793e("unexpected null context in onResume");
        } else if (AnalyticsConfig.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.AUTO) {
            if (this.f8391a == null) {
                this.f8391a = context.getApplicationContext();
            }
            if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
                MLog.m9793e("onResume can not be called in child process");
                return;
            }
            if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
                UMLog.m9005aq(C3441h.f8684o, 2, "\\|");
            }
            try {
                if (!this.f8398j || !this.f8402n) {
                    mo38632a(context);
                }
                if (AnalyticsConfig.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_MANUAL) {
                    this.f8395e.mo38780a(context.getClass().getName());
                }
                mo38671h();
                if (UMConfigure.isDebugLog() && (context instanceof Activity)) {
                    f8383q = context.getClass().getName();
                }
            } catch (Throwable th) {
                MLog.m9795e("Exception occurred in Mobclick.onResume(). ", th);
            }
        }
    }

    /* renamed from: i */
    public void mo38672i() {
        try {
            if (this.f8391a != null) {
                if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
                    MLog.m9793e("onEndSessionInternal can not be called in child process");
                    return;
                }
                UMWorkDispatch.sendEvent(this.f8391a, 4104, CoreProtocol.getInstance(this.f8391a), Long.valueOf(System.currentTimeMillis()));
                UMWorkDispatch.sendEvent(this.f8391a, 4100, CoreProtocol.getInstance(this.f8391a), null);
                UMWorkDispatch.sendEvent(this.f8391a, 4099, CoreProtocol.getInstance(this.f8391a), null);
                UMWorkDispatch.sendEvent(this.f8391a, 4105, CoreProtocol.getInstance(this.f8391a), null);
            }
        } catch (Throwable unused) {
        }
        AbstractC3470x xVar = this.f8392b;
        if (xVar != null) {
            xVar.mo38802b();
        }
    }

    /* renamed from: h */
    public synchronized JSONObject mo38670h(Context context) {
        if (context == null) {
            UMLog.m9005aq(C3441h.f8661aq, 0, "\\|");
            return null;
        }
        if (this.f8391a == null) {
            this.f8391a = context.getApplicationContext();
        }
        if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
            MLog.m9793e("getPreProperties can not be called in child process");
            return null;
        }
        if (!this.f8398j || !this.f8402n) {
            mo38632a(this.f8391a);
        }
        if (this.f8401m == null) {
            this.f8401m = new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (this.f8401m.length() > 0) {
            try {
                jSONObject = new JSONObject(this.f8401m.toString());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: f */
    public synchronized void mo38667f(Context context, String str) {
        if (context == null) {
            UMLog.m9005aq(C3441h.f8658an, 0, "\\|");
            return;
        }
        if (this.f8391a == null) {
            this.f8391a = context.getApplicationContext();
        }
        if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
            MLog.m9793e("unregisterPreProperty can not be called in child process");
            return;
        }
        if (!this.f8398j || !this.f8402n) {
            mo38632a(this.f8391a);
        }
        if (this.f8401m == null) {
            this.f8401m = new JSONObject();
        }
        if (str == null || str.length() <= 0) {
            MLog.m9793e("please check propertics, property is null!");
            return;
        }
        if (this.f8401m.has(str)) {
            this.f8401m.remove(str);
            UMWorkDispatch.sendEvent(this.f8391a, 8200, CoreProtocol.getInstance(this.f8391a), this.f8401m.toString());
        } else if (UMConfigure.isDebugLog()) {
            UMLog.m9005aq(C3441h.f8659ao, 0, "\\|");
        }
    }

    /* renamed from: d */
    public synchronized void mo38661d(Context context, String str) {
        if (context == null) {
            try {
                UMLog.m9005aq(C3441h.f8652ah, 0, "\\|");
                return;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            if (this.f8391a == null) {
                this.f8391a = context.getApplicationContext();
            }
            if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
                MLog.m9793e("unregisterSuperProperty can not be called in child process");
                return;
            }
            if (!this.f8398j || !this.f8402n) {
                mo38632a(this.f8391a);
            }
            if (TextUtils.isEmpty(str)) {
                UMLog.m9005aq(C3441h.f8651ag, 0, "\\|");
                return;
            } else if (str.equals(f8390z) || str.equals(f8375A) || str.equals(f8376B) || str.equals(f8377C) || str.equals(f8378D)) {
                if (this.f8399k == null) {
                    this.f8399k = new JSONObject();
                }
                if (this.f8399k.has(str)) {
                    this.f8399k.remove(str);
                    UMWorkDispatch.sendEvent(this.f8391a, 8197, CoreProtocol.getInstance(this.f8391a), str);
                }
                return;
            } else {
                MLog.m9793e("please check key or value, must be correct!");
                return;
            }
        }
    }

    /* renamed from: c */
    private boolean m8671c(String str) {
        if (this.f8403u.enabled() && this.f8403u.matchHit(str)) {
            return true;
        }
        if (!this.f8404x.enabled()) {
            return false;
        }
        if (!this.f8404x.matchHit(str)) {
            return true;
        }
        UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> white list match! id = " + str);
        return false;
    }

    /* renamed from: b */
    public void mo38653b(Context context, String str) {
        if (context == null) {
            try {
                UMLog.m9005aq(C3441h.f8608N, 0, "\\|");
            } catch (Throwable th) {
                if (MLog.DEBUG) {
                    MLog.m9797e(th);
                }
            }
        } else {
            if (this.f8391a == null) {
                this.f8391a = context.getApplicationContext();
            }
            if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
                MLog.m9793e("onDeepLinkReceived can not be called in child process");
                return;
            }
            if (!this.f8398j || !this.f8402n) {
                mo38632a(this.f8391a);
            }
            if (!TextUtils.isEmpty(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put(C3416b.f8445aB, str);
                m8669b(this.f8391a, C3416b.f8444aA, hashMap, -1);
                return;
            }
            UMLog.m9005aq(C3441h.f8609O, 0, "\\|");
        }
    }

    /* renamed from: a */
    public void mo38646a(String str) {
        if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
            MLog.m9793e("onPageStart can not be called in child process");
            return;
        }
        try {
            if (AnalyticsConfig.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_AUTO) {
                this.f8394d.mo38780a(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public synchronized String mo38663e(Context context) {
        if (context == null) {
            try {
                UMLog.m9005aq(C3441h.f8653ai, 0, "\\|");
                return null;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            if (this.f8391a == null) {
                this.f8391a = context.getApplicationContext();
            }
            if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
                MLog.m9793e("getSuperProperties can not be called in child process");
                return null;
            } else if (this.f8399k != null) {
                return this.f8399k.toString();
            } else {
                this.f8399k = new JSONObject();
                return null;
            }
        }
    }

    /* renamed from: c */
    public void mo38658c(Context context, String str) {
        if (context == null) {
            UMLog.m9005aq(C3441h.f8695z, 0, "\\|");
            return;
        }
        if (this.f8391a == null) {
            this.f8391a = context.getApplicationContext();
        }
        if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
            MLog.m9793e("setSecret can not be called in child process");
            return;
        }
        if (!this.f8398j || !this.f8402n) {
            mo38632a(this.f8391a);
        }
        AnalyticsConfig.m8664a(this.f8391a, str);
    }

    /* renamed from: a */
    public void mo38644a(AbstractC3470x xVar) {
        if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
            MLog.m9793e("setSysListener can not be called in child process");
        } else {
            this.f8392b = xVar;
        }
    }

    /* renamed from: a */
    public void mo38633a(Context context, int i) {
        if (context == null) {
            MLog.m9793e("unexpected null context in setVerticalType");
            return;
        }
        if (this.f8391a == null) {
            this.f8391a = context.getApplicationContext();
        }
        if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
            MLog.m9793e("setVerticalType can not be called in child process");
            return;
        }
        if (!this.f8398j || !this.f8402n) {
            mo38632a(this.f8391a);
        }
        AnalyticsConfig.m8663a(this.f8391a, i);
    }

    /* renamed from: b */
    private void m8669b(Context context, String str, Map<String, Object> map, long j) {
        if (context == null) {
            try {
                MLog.m9793e("context is null in onEventNoCheck, please check!");
            } catch (Throwable th) {
                if (MLog.DEBUG) {
                    MLog.m9797e(th);
                }
            }
        } else {
            if (this.f8391a == null) {
                this.f8391a = context.getApplicationContext();
            }
            if (!this.f8398j || !this.f8402n) {
                mo38632a(this.f8391a);
            }
            if (m8671c(str)) {
                UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> filter ekv [" + str + "].");
                return;
            }
            String str2 = "";
            if (this.f8399k == null) {
                this.f8399k = new JSONObject();
            } else {
                str2 = this.f8399k.toString();
            }
            C3456o.m8865a(this.f8391a).mo38765a(str, map, j, str2);
        }
    }

    /* renamed from: a */
    public void mo38638a(Context context, String str, HashMap<String, Object> hashMap) {
        if (context != null) {
            try {
                if (this.f8391a == null) {
                    this.f8391a = context.getApplicationContext();
                }
                if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
                    MLog.m9793e("onGKVEvent can not be called in child process");
                    return;
                }
                if (!this.f8398j || !this.f8402n) {
                    mo38632a(this.f8391a);
                }
                String str2 = "";
                if (this.f8399k == null) {
                    this.f8399k = new JSONObject();
                } else {
                    str2 = this.f8399k.toString();
                }
                C3456o.m8865a(this.f8391a).mo38766a(str, hashMap, str2);
            } catch (Throwable th) {
                if (MLog.DEBUG) {
                    MLog.m9797e(th);
                }
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo38654b(Object obj) {
        try {
            if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
                MLog.m9793e("updateNativePrePropertiesByCoreProtocol can not be called in child process");
                return;
            }
            SharedPreferences.Editor edit = PreferenceWrapper.getDefault(this.f8391a).edit();
            if (obj != null) {
                String str = (String) obj;
                if (edit != null && !TextUtils.isEmpty(str)) {
                    edit.putString(f8380i, str).commit();
                }
            } else if (edit != null) {
                edit.remove(f8380i).commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo38635a(Context context, String str) {
        if (context == null) {
            UMLog.m9005aq(C3441h.f8692w, 0, "\\|");
            return;
        }
        if (this.f8391a == null) {
            this.f8391a = context.getApplicationContext();
        }
        if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
            MLog.m9793e("reportError can not be called in child process");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                if (!this.f8398j || !this.f8402n) {
                    mo38632a(this.f8391a);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put(C3416b.f8432P, 2);
                jSONObject.put(C3416b.f8433Q, str);
                jSONObject.put("__ii", this.f8396f.mo38777c());
                UMWorkDispatch.sendEvent(this.f8391a, 4106, CoreProtocol.getInstance(this.f8391a), jSONObject);
            } catch (Throwable th) {
                if (MLog.DEBUG) {
                    MLog.m9797e(th);
                }
            }
        } else if (UMConfigure.isDebugLog()) {
            UMLog.m9005aq(C3441h.f8693x, 0, "\\|");
        }
    }

    /* renamed from: b */
    private boolean m8670b(String str, Object obj) {
        int i;
        try {
            if (TextUtils.isEmpty(str)) {
                MLog.m9793e("key is " + str + ", please check key, illegal");
                return false;
            }
            try {
                i = str.getBytes("UTF-8").length;
            } catch (UnsupportedEncodingException unused) {
                i = 0;
            }
            if (i > 128) {
                MLog.m9793e("key length is " + i + ", please check key, illegal");
                return false;
            } else if (obj instanceof String) {
                if (((String) obj).getBytes("UTF-8").length <= 256) {
                    return true;
                }
                MLog.m9793e("value length is " + ((String) obj).getBytes("UTF-8").length + ", please check value, illegal");
                return false;
            } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float)) {
                return true;
            } else {
                MLog.m9793e("value is " + obj + ", please check value, type illegal");
                return false;
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    public void mo38640a(Context context, Throwable th) {
        if (context == null || th == null) {
            UMLog.m9005aq(C3441h.f8694y, 0, "\\|");
            return;
        }
        if (this.f8391a == null) {
            this.f8391a = context.getApplicationContext();
        }
        if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
            MLog.m9793e("reportError can not be called in child process");
            return;
        }
        try {
            if (!this.f8398j || !this.f8402n) {
                mo38632a(this.f8391a);
            }
            mo38635a(this.f8391a, DataHelper.convertExceptionToString(th));
        } catch (Exception e) {
            if (MLog.DEBUG) {
                MLog.m9797e(e);
            }
        }
    }

    /* renamed from: a */
    public void mo38637a(Context context, String str, String str2, long j, int i) {
        if (context != null) {
            try {
                if (this.f8391a == null) {
                    this.f8391a = context.getApplicationContext();
                }
                if (!this.f8398j || !this.f8402n) {
                    mo38632a(this.f8391a);
                }
                if (m8671c(str)) {
                    UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> filter ekv [" + str + "].");
                    return;
                }
                String str3 = "";
                if (this.f8399k == null) {
                    this.f8399k = new JSONObject();
                } else {
                    str3 = this.f8399k.toString();
                }
                C3456o.m8865a(this.f8391a).mo38764a(str, str2, j, i, str3);
            } catch (Throwable th) {
                if (MLog.DEBUG) {
                    MLog.m9797e(th);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo38639a(Context context, String str, Map<String, Object> map, long j) {
        try {
            if (TextUtils.isEmpty(str)) {
                UMLog.m9005aq(C3441h.f8672c, 0, "\\|");
            } else if (Arrays.asList(C3416b.f8446aC).contains(str)) {
                UMLog.m9005aq(C3441h.f8671b, 0, "\\|");
            } else if (map.isEmpty()) {
                UMLog.m9005aq(C3441h.f8673d, 0, "\\|");
            } else {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (Arrays.asList(C3416b.f8446aC).contains(entry.getKey())) {
                        UMLog.m9005aq(C3441h.f8674e, 0, "\\|");
                        return;
                    }
                }
                m8669b(context, str, map, j);
            }
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m9797e(th);
            }
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC3459p
    /* renamed from: a */
    public void mo38648a(Throwable th) {
        try {
            if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
                MLog.m9793e("onAppCrash can not be called in child process");
                return;
            }
            if (this.f8394d != null) {
                this.f8394d.mo38781b();
            }
            if (this.f8395e != null) {
                this.f8395e.mo38781b();
            }
            if (this.f8397g != null) {
                this.f8397g.mo38725c();
            }
            if (this.f8391a != null) {
                if (this.f8396f != null) {
                    this.f8396f.mo38779c(this.f8391a, Long.valueOf(System.currentTimeMillis()));
                }
                if (th != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ts", System.currentTimeMillis());
                    jSONObject.put(C3416b.f8432P, 1);
                    jSONObject.put(C3416b.f8433Q, DataHelper.convertExceptionToString(th));
                    C3437g.m8754a(this.f8391a).mo38706a(this.f8396f.mo38777c(), jSONObject.toString(), 1);
                }
                C3445k.m8798a(this.f8391a).mo38746d();
                C3463r.m8900a(this.f8391a);
                C3443j.m8790a(this.f8391a);
                PreferenceWrapper.getDefault(this.f8391a).edit().commit();
            }
        } catch (Exception e) {
            if (MLog.DEBUG) {
                MLog.m9795e("Exception in onAppCrash", e);
            }
        }
    }

    /* renamed from: a */
    public void mo38647a(String str, String str2) {
        try {
            if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
                MLog.m9793e("onProfileSignIn can not be called in child process");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3416b.f8428L, str);
            jSONObject.put("uid", str2);
            jSONObject.put("ts", currentTimeMillis);
            UMWorkDispatch.sendEvent(this.f8391a, 4101, CoreProtocol.getInstance(this.f8391a), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m9795e(" Excepthon  in  onProfileSignIn", th);
            }
        }
    }

    /* renamed from: a */
    public void mo38650a(boolean z) {
        if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
            MLog.m9793e("setCatchUncaughtExceptions can not be called in child process");
        } else if (!AnalyticsConfig.CHANGE_CATCH_EXCEPTION_NOTALLOW) {
            AnalyticsConfig.CATCH_EXCEPTION = z;
        }
    }

    /* renamed from: a */
    public void mo38649a(GL10 gl10) {
        String[] gpu = UMUtils.getGPU(gl10);
        if (gpu.length == 2) {
            AnalyticsConfig.GPU_VENDER = gpu[0];
            AnalyticsConfig.GPU_RENDERER = gpu[1];
        }
    }

    /* renamed from: a */
    public void mo38643a(MobclickAgent.PageMode pageMode) {
        if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
            MLog.m9793e("setPageCollectionMode can not be called in child process");
        } else {
            AnalyticsConfig.AUTO_ACTIVITY_PAGE_COLLECTION = pageMode;
        }
    }

    /* renamed from: a */
    public void mo38630a(double d, double d2) {
        if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
            MLog.m9793e("setLocation can not be called in child process");
            return;
        }
        if (AnalyticsConfig.f8355a == null) {
            AnalyticsConfig.f8355a = new double[2];
        }
        double[] dArr = AnalyticsConfig.f8355a;
        dArr[0] = d;
        dArr[1] = d2;
    }

    /* renamed from: a */
    public void mo38634a(Context context, MobclickAgent.EScenarioType eScenarioType) {
        if (context == null) {
            MLog.m9793e("unexpected null context in setScenarioType");
            return;
        }
        if (this.f8391a == null) {
            this.f8391a = context.getApplicationContext();
        }
        if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
            MLog.m9793e("setScenarioType can not be called in child process");
            return;
        }
        if (eScenarioType != null) {
            mo38633a(this.f8391a, eScenarioType.toValue());
        }
        if (!this.f8398j || !this.f8402n) {
            mo38632a(this.f8391a);
        }
    }

    /* renamed from: a */
    public void mo38631a(long j) {
        if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
            MLog.m9793e("setSessionContinueMillis can not be called in child process");
            return;
        }
        AnalyticsConfig.kContinueSessionMillis = j;
        C3466u.m8916a().mo38790a(AnalyticsConfig.kContinueSessionMillis);
    }

    /* renamed from: a */
    public synchronized void mo38636a(Context context, String str, Object obj) {
        int i = 0;
        if (context == null) {
            try {
                UMLog.m9005aq(C3441h.f8650af, 0, "\\|");
                return;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            if (this.f8391a == null) {
                this.f8391a = context.getApplicationContext();
            }
            if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
                MLog.m9793e("registerSuperProperty can not be called in child process");
                return;
            }
            if (!this.f8398j || !this.f8402n) {
                mo38632a(this.f8391a);
            }
            if (TextUtils.isEmpty(str) || obj == null) {
                UMLog.m9005aq(C3441h.f8651ag, 0, "\\|");
                return;
            } else if (!str.equals(f8390z) && !str.equals(f8375A) && !str.equals(f8376B) && !str.equals(f8377C) && !str.equals(f8378D)) {
                MLog.m9793e("property name is " + str + ", please check key, must be correct!");
                return;
            } else if (!(obj instanceof String) || HelperUtils.checkStrLen(obj.toString(), 256)) {
                try {
                    if (this.f8399k == null) {
                        this.f8399k = new JSONObject();
                    }
                    new JSONObject();
                    if (obj.getClass().isArray()) {
                        if (obj instanceof String[]) {
                            String[] strArr = (String[]) obj;
                            if (strArr.length > 10) {
                                MLog.m9793e("please check value, size is " + strArr.length + ", overstep 10!");
                                return;
                            }
                            JSONArray jSONArray = new JSONArray();
                            while (i < strArr.length) {
                                if (strArr[i] == null || !HelperUtils.checkStrLen(strArr[i], 256)) {
                                    MLog.m9793e("please check value, length is " + strArr[i].length() + ", overlength 256!");
                                    return;
                                }
                                jSONArray.put(strArr[i]);
                                i++;
                            }
                            this.f8399k.put(str, jSONArray);
                        } else if (obj instanceof long[]) {
                            long[] jArr = (long[]) obj;
                            if (jArr.length > 10) {
                                MLog.m9793e("please check value, size is " + jArr.length + ", overstep 10!");
                                return;
                            }
                            JSONArray jSONArray2 = new JSONArray();
                            while (i < jArr.length) {
                                jSONArray2.put(jArr[i]);
                                i++;
                            }
                            this.f8399k.put(str, jSONArray2);
                        } else if (obj instanceof int[]) {
                            int[] iArr = (int[]) obj;
                            if (iArr.length > 10) {
                                MLog.m9793e("please check value, size is " + iArr.length + ", overstep 10!");
                                return;
                            }
                            JSONArray jSONArray3 = new JSONArray();
                            while (i < iArr.length) {
                                jSONArray3.put(iArr[i]);
                                i++;
                            }
                            this.f8399k.put(str, jSONArray3);
                        } else if (obj instanceof float[]) {
                            float[] fArr = (float[]) obj;
                            if (fArr.length > 10) {
                                MLog.m9793e("please check value, size is " + fArr.length + ", overstep 10!");
                                return;
                            }
                            JSONArray jSONArray4 = new JSONArray();
                            while (i < fArr.length) {
                                jSONArray4.put((double) fArr[i]);
                                i++;
                            }
                            this.f8399k.put(str, jSONArray4);
                        } else if (obj instanceof double[]) {
                            double[] dArr = (double[]) obj;
                            if (dArr.length > 10) {
                                MLog.m9793e("please check value, size is " + dArr.length + ", overstep 10!");
                                return;
                            }
                            JSONArray jSONArray5 = new JSONArray();
                            while (i < dArr.length) {
                                jSONArray5.put(dArr[i]);
                                i++;
                            }
                            this.f8399k.put(str, jSONArray5);
                        } else if (obj instanceof short[]) {
                            short[] sArr = (short[]) obj;
                            if (sArr.length > 10) {
                                MLog.m9793e("please check value, size is " + sArr.length + ", overstep 10!");
                                return;
                            }
                            JSONArray jSONArray6 = new JSONArray();
                            while (i < sArr.length) {
                                jSONArray6.put((int) sArr[i]);
                                i++;
                            }
                            this.f8399k.put(str, jSONArray6);
                        } else {
                            MLog.m9793e("please check value, illegal type!");
                            return;
                        }
                    } else if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                        this.f8399k.put(str, obj);
                    } else {
                        MLog.m9793e("please check value, illegal type!");
                        return;
                    }
                } catch (Throwable unused) {
                }
                UMWorkDispatch.sendEvent(this.f8391a, C3445k.C3447a.f8743p, CoreProtocol.getInstance(this.f8391a), this.f8399k.toString());
                return;
            } else {
                MLog.m9793e("property value is " + obj + ", please check value, lawless!");
                return;
            }
        }
    }

    /* renamed from: a */
    private void m8668a(String str, Object obj) {
        try {
            if (this.f8399k == null) {
                this.f8399k = new JSONObject();
            }
            new JSONObject();
            int i = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof String[]) {
                    String[] strArr = (String[]) obj;
                    if (strArr.length <= 10) {
                        JSONArray jSONArray = new JSONArray();
                        while (i < strArr.length) {
                            if (strArr[i] != null && !HelperUtils.checkStrLen(strArr[i], 256)) {
                                jSONArray.put(strArr[i]);
                            }
                            i++;
                        }
                        this.f8399k.put(str, jSONArray);
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    JSONArray jSONArray2 = new JSONArray();
                    while (i < jArr.length) {
                        jSONArray2.put(jArr[i]);
                        i++;
                    }
                    this.f8399k.put(str, jSONArray2);
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    JSONArray jSONArray3 = new JSONArray();
                    while (i < iArr.length) {
                        jSONArray3.put(iArr[i]);
                        i++;
                    }
                    this.f8399k.put(str, jSONArray3);
                } else if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    JSONArray jSONArray4 = new JSONArray();
                    while (i < fArr.length) {
                        jSONArray4.put((double) fArr[i]);
                        i++;
                    }
                    this.f8399k.put(str, jSONArray4);
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    JSONArray jSONArray5 = new JSONArray();
                    while (i < dArr.length) {
                        jSONArray5.put(dArr[i]);
                        i++;
                    }
                    this.f8399k.put(str, jSONArray5);
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    JSONArray jSONArray6 = new JSONArray();
                    while (i < sArr.length) {
                        jSONArray6.put((int) sArr[i]);
                        i++;
                    }
                    this.f8399k.put(str, jSONArray6);
                }
            } else if (obj instanceof List) {
                List list = (List) obj;
                JSONArray jSONArray7 = new JSONArray();
                while (i < list.size()) {
                    Object obj2 = list.get(i);
                    if ((obj2 instanceof String) || (obj2 instanceof Long) || (obj2 instanceof Integer) || (obj2 instanceof Float) || (obj2 instanceof Double) || (obj2 instanceof Short)) {
                        jSONArray7.put(list.get(i));
                    }
                    i++;
                }
                this.f8399k.put(str, jSONArray7);
            } else if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                this.f8399k.put(str, obj);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public synchronized void mo38645a(Object obj) {
        try {
            if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
                MLog.m9793e("registerSuperPropertyByCoreProtocol can not be called in child process");
                return;
            }
            if (!(obj == null || this.f8391a == null)) {
                String str = (String) obj;
                SharedPreferences.Editor edit = PreferenceWrapper.getDefault(this.f8391a).edit();
                if (edit != null && !TextUtils.isEmpty(str)) {
                    edit.putString(f8379h, this.f8399k.toString()).commit();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public synchronized void mo38641a(Context context, List<String> list) {
        if (context == null) {
            try {
                UMLog.m9005aq(C3441h.f8654aj, 0, "\\|");
                return;
            } catch (Throwable th) {
                MLog.m9797e(th);
            }
        } else {
            if (this.f8391a == null) {
                this.f8391a = context.getApplicationContext();
            }
            if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
                MLog.m9793e("setFirstLaunchEvent can not be called in child process");
                return;
            }
            if (!this.f8398j || !this.f8402n) {
                mo38632a(this.f8391a);
            }
            C3456o.m8865a(this.f8391a).mo38767a(list);
            return;
        }
    }

    /* renamed from: a */
    public synchronized void mo38642a(Context context, JSONObject jSONObject) {
        if (context == null) {
            UMLog.m9005aq(C3441h.f8656al, 0, "\\|");
            return;
        }
        if (this.f8391a == null) {
            this.f8391a = context.getApplicationContext();
        }
        if (!UMGlobalContext.getInstance().isMainProcess(this.f8391a)) {
            MLog.m9793e("registerPreProperties can not be called in child process");
            return;
        }
        if (!this.f8398j || !this.f8402n) {
            mo38632a(this.f8391a);
        }
        if (this.f8401m == null) {
            this.f8401m = new JSONObject();
        }
        if (jSONObject == null || jSONObject.length() <= 0) {
            UMLog.m9005aq(C3441h.f8657am, 0, "\\|");
            return;
        }
        JSONObject jSONObject2 = null;
        try {
            jSONObject2 = new JSONObject(this.f8401m.toString());
        } catch (Exception unused) {
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        Iterator<String> keys = jSONObject.keys();
        if (keys != null) {
            while (keys.hasNext()) {
                try {
                    String obj = keys.next().toString();
                    Object obj2 = jSONObject.get(obj);
                    if (m8670b(obj, obj2)) {
                        jSONObject2.put(obj, obj2);
                        if (jSONObject2.length() > 10) {
                            MLog.m9793e("please check propertics, size overlength!");
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Exception unused2) {
                }
            }
        }
        this.f8401m = jSONObject2;
        if (this.f8401m.length() > 0) {
            UMWorkDispatch.sendEvent(this.f8391a, 8199, CoreProtocol.getInstance(this.f8391a), this.f8401m.toString());
        }
    }
}
