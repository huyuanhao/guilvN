package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.C3407b;
import com.umeng.analytics.pro.C3417c;
import com.umeng.analytics.pro.C3437g;
import com.umeng.analytics.pro.C3466u;
import com.umeng.analytics.process.UMProcessDBDatasSender;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.q */
public class C3460q implements C3466u.AbstractC3467a {

    /* renamed from: a */
    public static final String f8777a = "session_start_time";

    /* renamed from: b */
    public static final String f8778b = "session_end_time";

    /* renamed from: c */
    public static final String f8779c = "session_id";

    /* renamed from: d */
    public static final String f8780d = "pre_session_id";

    /* renamed from: e */
    public static final String f8781e = "a_start_time";

    /* renamed from: f */
    public static final String f8782f = "a_end_time";

    /* renamed from: g */
    public static String f8783g;

    /* renamed from: h */
    public static Context f8784h;

    /* renamed from: i */
    public static boolean f8785i;

    /* renamed from: com.umeng.analytics.pro.q$a */
    public static class C3462a {

        /* renamed from: a */
        public static final C3460q f8786a = new C3460q();
    }

    /* renamed from: a */
    public static C3460q m8882a() {
        return C3462a.f8786a;
    }

    /* renamed from: b */
    public void mo38775b(Context context, Object obj) {
        long j;
        try {
            if (f8784h == null) {
                f8784h = UMGlobalContext.getAppContext(context);
            }
            if (obj == null) {
                j = System.currentTimeMillis();
            } else {
                j = ((Long) obj).longValue();
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8784h);
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(C3416b.f8471aw, "");
                String appVersionName = UMUtils.getAppVersionName(f8784h);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                if (edit != null) {
                    if (!TextUtils.isEmpty(string) && !string.equals(appVersionName)) {
                        UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> requestNewInstantSessionIf: version upgrade");
                        edit.putLong(f8777a, j);
                        edit.commit();
                        C3445k.m8798a(f8784h).mo38737a((Object) null, true);
                        String c = C3466u.m8916a().mo38795c(f8784h);
                        UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> force generate new session: session id = " + c);
                        f8785i = true;
                        mo38769a(f8784h, j, true);
                    } else if (C3466u.m8916a().mo38797e(f8784h)) {
                        UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> More then 30 sec from last session.");
                        f8785i = true;
                        edit.putLong(f8777a, j);
                        edit.commit();
                        mo38769a(f8784h, j, false);
                    } else {
                        UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> less then 30 sec from last session, do nothing.");
                        f8785i = false;
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public void mo38779c(Context context, Object obj) {
        try {
            if (f8784h == null && context != null) {
                f8784h = context.getApplicationContext();
            }
            long longValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences != null) {
                if (sharedPreferences.getLong(f8781e, 0) == 0) {
                    MLog.m9793e("onPause called before onResume");
                    return;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> onEndSessionInternal: write activity end time = " + longValue);
                edit.putLong(f8782f, longValue);
                edit.putLong(f8778b, longValue);
                edit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    public C3460q() {
        C3466u.m8916a().mo38791a(this);
    }

    /* renamed from: a */
    public void mo38770a(Context context, long j) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8784h);
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
            edit.putLong(f8777a, j);
            edit.commit();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0121  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38771a(android.content.Context r19, java.lang.Object r20) {
        /*
        // Method dump skipped, instructions count: 367
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3460q.mo38771a(android.content.Context, java.lang.Object):void");
    }

    /* renamed from: c */
    private void m8886c(Context context) {
        C3445k.m8798a(context).mo38742b(context);
        C3445k.m8798a(context).mo38746d();
    }

    /* renamed from: c */
    public void mo38778c(Context context, long j) {
        if (PreferenceWrapper.getDefault(context) != null) {
            try {
                C3445k.m8798a(f8784h).mo38745c((Object) null);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    public String mo38777c() {
        return mo38768a(f8784h);
    }

    /* renamed from: b */
    private String m8885b(Context context) {
        if (f8784h == null && context != null) {
            f8784h = context.getApplicationContext();
        }
        String d = C3466u.m8916a().mo38796d(f8784h);
        try {
            m8886c(context);
            C3445k.m8798a(f8784h).mo38747d((Object) null);
        } catch (Throwable unused) {
        }
        return d;
    }

    /* renamed from: b */
    public boolean mo38776b(Context context, long j) {
        String a;
        boolean z = false;
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences == null || (a = C3466u.m8916a().mo38788a(f8784h)) == null) {
                return false;
            }
            long j2 = sharedPreferences.getLong(f8781e, 0);
            long j3 = sharedPreferences.getLong(f8782f, 0);
            if (j2 > 0 && j3 == 0) {
                z = true;
                mo38779c(f8784h, Long.valueOf(j));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3417c.C3427d.C3428a.f8549g, j);
                JSONObject b = C3407b.m8667a().mo38651b();
                if (b != null && b.length() > 0) {
                    jSONObject.put("__sp", b);
                }
                JSONObject c = C3407b.m8667a().mo38656c();
                if (c != null && c.length() > 0) {
                    jSONObject.put("__pp", c);
                }
                C3437g.m8754a(context).mo38707a(a, jSONObject, C3437g.EnumC3439a.END);
                C3445k.m8798a(f8784h).mo38748e();
            }
            return z;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public String mo38774b() {
        return f8783g;
    }

    /* renamed from: a */
    public String mo38769a(Context context, long j, boolean z) {
        String b = C3466u.m8916a().mo38793b(context);
        UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> onInstantSessionInternal: current session id = " + b);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__e", j);
            JSONObject b2 = C3407b.m8667a().mo38651b();
            if (b2 != null && b2.length() > 0) {
                jSONObject.put("__sp", b2);
            }
            JSONObject c = C3407b.m8667a().mo38656c();
            if (c != null && c.length() > 0) {
                jSONObject.put("__pp", c);
            }
            C3437g.m8754a(context).mo38707a(b, jSONObject, C3437g.EnumC3439a.INSTANTSESSIONBEGIN);
            C3445k.m8798a(context).mo38737a(jSONObject, z);
        } catch (Throwable unused) {
        }
        return b;
    }

    /* renamed from: a */
    public String mo38768a(Context context) {
        try {
            if (f8783g == null) {
                return PreferenceWrapper.getDefault(context).getString(f8779c, null);
            }
        } catch (Throwable unused) {
        }
        return f8783g;
    }

    @Override // com.umeng.analytics.pro.C3466u.AbstractC3467a
    /* renamed from: a */
    public void mo38773a(String str, String str2, long j, long j2) {
        m8883a(f8784h, str2, j, j2);
        UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "saveSessionToDB: complete");
        if (AnalyticsConstants.SUB_PROCESS_EVENT) {
            Context context = f8784h;
            UMWorkDispatch.sendEvent(context, 36945, UMProcessDBDatasSender.getInstance(context), Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // com.umeng.analytics.pro.C3466u.AbstractC3467a
    /* renamed from: a */
    public void mo38772a(String str, long j, long j2) {
        if (!TextUtils.isEmpty(str)) {
            m8884a(str, j);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0062 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8883a(android.content.Context r3, java.lang.String r4, long r5, long r7) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3460q.m8883a(android.content.Context, java.lang.String, long, long):void");
    }

    /* renamed from: a */
    private void m8884a(String str, long j) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8784h);
        if (sharedPreferences != null) {
            long j2 = sharedPreferences.getLong(f8778b, 0);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("__ii", str);
                jSONObject.put("__e", j);
                jSONObject.put(C3417c.C3427d.C3428a.f8549g, j2);
                double[] location = AnalyticsConfig.getLocation();
                if (location != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("lat", location[0]);
                    jSONObject2.put("lng", location[1]);
                    jSONObject2.put("ts", System.currentTimeMillis());
                    jSONObject.put(C3417c.C3427d.C3428a.f8547e, jSONObject2);
                }
                Class<?> cls = Class.forName("android.net.TrafficStats");
                Method method = cls.getMethod("getUidRxBytes", Integer.TYPE);
                Method method2 = cls.getMethod("getUidTxBytes", Integer.TYPE);
                int i = f8784h.getApplicationInfo().uid;
                if (i != -1) {
                    long longValue = ((Long) method.invoke(null, Integer.valueOf(i))).longValue();
                    long longValue2 = ((Long) method2.invoke(null, Integer.valueOf(i))).longValue();
                    if (longValue > 0) {
                        if (longValue2 > 0) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(C3416b.f8423G, longValue);
                            jSONObject3.put(C3416b.f8422F, longValue2);
                            jSONObject.put(C3417c.C3427d.C3428a.f8546d, jSONObject3);
                        }
                    }
                    C3437g.m8754a(f8784h).mo38707a(str, jSONObject, C3437g.EnumC3439a.NEWSESSION);
                    C3463r.m8900a(f8784h);
                    C3443j.m8790a(f8784h);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
