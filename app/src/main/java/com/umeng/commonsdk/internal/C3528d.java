package com.umeng.commonsdk.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.ScanResult;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import com.baidu.idl.face.platform.common.ConstantHelper;
import com.p118pd.sdk.C5982OoooOoO;
import com.p118pd.sdk.C8932ooOOO0o;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3416b;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.framework.C3516a;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.internal.utils.C3529a;
import com.umeng.commonsdk.internal.utils.C3538d;
import com.umeng.commonsdk.internal.utils.C3542f;
import com.umeng.commonsdk.internal.utils.C3546j;
import com.umeng.commonsdk.internal.utils.C3549k;
import com.umeng.commonsdk.internal.utils.C3550l;
import com.umeng.commonsdk.proguard.C3555ac;
import com.umeng.commonsdk.proguard.C3588b;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.commonsdk.stateless.C3640a;
import com.umeng.commonsdk.stateless.C3653f;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.C3676e;
import com.umeng.commonsdk.utils.C3745b;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.d */
public class C3528d {
    /* renamed from: a */
    public static void m9078a(Context context) {
        try {
            ULog.m9832i("walle", "[internal] workEvent send envelope");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3617o.f9341aA, C3523a.f9027d);
            JSONObject buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject, m9090g(context));
            if (buildEnvelopeWithExtHeader != null && !buildEnvelopeWithExtHeader.has("exception")) {
                ULog.m9832i("walle", "[internal] workEvent send envelope back, result is ok");
                C3529a.m9121f(context);
                C3546j.m9198d(context);
                C3588b.m9441c(context);
            }
        } catch (Exception e) {
            UMCrashManager.reportCrash(context, e);
        }
    }

    /* renamed from: b */
    public static void m9082b(Context context) {
        ULog.m9832i("walle", "[internal] begin by stateful--->>>");
        if (context != null) {
            m9099p(context);
        }
    }

    /* renamed from: c */
    public static void m9085c(Context context) {
        ULog.m9832i("walle", "[internal] begin by stateful--->>>");
        if (context != null && C3516a.m9030b()) {
            m9099p(context);
        }
    }

    /* renamed from: d */
    public static void m9087d(Context context) {
        if (context != null) {
            m9100q(context);
        }
    }

    /* renamed from: e */
    public static void m9088e(Context context) {
        if (context != null && C3516a.m9030b()) {
            m9100q(context);
        }
    }

    /* renamed from: f */
    public static JSONObject m9089f(Context context) {
        JSONArray s;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            try {
                if (FieldManager.allow(C3745b.f9841ad) && (s = m9102s(applicationContext)) != null && s.length() > 0) {
                    jSONObject2.put("run_server", s);
                }
            } catch (Exception e) {
                try {
                    UMCrashManager.reportCrash(applicationContext, e);
                } catch (Exception unused) {
                }
            }
            try {
                if (FieldManager.allow(C3745b.f9842ae)) {
                    String k = C3529a.m9130k(applicationContext);
                    if (!TextUtils.isEmpty(k)) {
                        jSONObject2.put(Constants.KEY_IMSI, k);
                    }
                }
            } catch (Exception e2) {
                UMCrashManager.reportCrash(applicationContext, e2);
            }
            try {
                if (FieldManager.allow(C3745b.f9843af)) {
                    String l = C3529a.m9131l(applicationContext);
                    if (!TextUtils.isEmpty(l)) {
                        jSONObject2.put("meid", l);
                    }
                }
            } catch (Exception e3) {
                UMCrashManager.reportCrash(applicationContext, e3);
            }
            try {
                jSONObject.put(UMModuleRegister.INNER, jSONObject2);
            } catch (JSONException e4) {
                UMCrashManager.reportCrash(applicationContext, e4);
            }
        }
        return jSONObject;
    }

    /* renamed from: g */
    public static JSONObject m9090g(Context context) {
        JSONObject c;
        JSONObject d;
        JSONArray r;
        JSONObject o;
        JSONArray n;
        JSONArray m;
        JSONObject k;
        JSONObject j;
        JSONObject b;
        JSONObject a;
        JSONArray u;
        JSONArray t;
        JSONArray s;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            try {
                if (FieldManager.allow(C3745b.f9815E) && (s = m9102s(applicationContext)) != null && s.length() > 0) {
                    jSONObject2.put("rs", s);
                }
            } catch (Exception e) {
                UMCrashManager.reportCrash(applicationContext, e);
            }
            try {
                if (FieldManager.allow(C3745b.f9836Z) && (t = m9103t(applicationContext)) != null && t.length() > 0) {
                    jSONObject2.put("bstn", t);
                }
            } catch (Exception e2) {
                UMCrashManager.reportCrash(applicationContext, e2);
            }
            try {
                if (FieldManager.allow(C3745b.f9816F) && (u = m9104u(applicationContext)) != null && u.length() > 0) {
                    jSONObject2.put("by", u);
                }
            } catch (Exception e3) {
                UMCrashManager.reportCrash(applicationContext, e3);
            }
            try {
                m9079a(applicationContext, jSONObject2);
            } catch (Exception e4) {
                UMCrashManager.reportCrash(applicationContext, e4);
            }
            try {
                m9083b(applicationContext, jSONObject2);
            } catch (Exception e5) {
                UMCrashManager.reportCrash(applicationContext, e5);
            }
            try {
                if (FieldManager.allow(C3745b.f9825O) && (a = m9077a()) != null && a.length() > 0) {
                    jSONObject2.put("sd", a);
                }
            } catch (Exception e6) {
                UMCrashManager.reportCrash(applicationContext, e6);
            }
            try {
                if (FieldManager.allow(C3745b.f9826P) && (b = m9081b()) != null && b.length() > 0) {
                    jSONObject2.put("build", b);
                }
            } catch (Exception e7) {
                UMCrashManager.reportCrash(applicationContext, e7);
            }
            try {
                if (FieldManager.allow(C3745b.f9827Q)) {
                    JSONObject jSONObject3 = new JSONObject();
                    JSONArray i = m9092i(applicationContext);
                    if (i != null && i.length() > 0) {
                        try {
                            jSONObject3.put("a_sr", i);
                        } catch (JSONException unused) {
                        }
                    }
                    JSONArray c2 = C3546j.m9196c(applicationContext);
                    if (c2 != null && c2.length() > 0) {
                        try {
                            jSONObject3.put("stat", c2);
                        } catch (JSONException unused2) {
                        }
                    }
                    jSONObject2.put("sr", jSONObject3);
                }
            } catch (Exception e8) {
                UMCrashManager.reportCrash(applicationContext, e8);
            }
            try {
                if (FieldManager.allow(C3745b.f9828R) && (j = m9093j(applicationContext)) != null && j.length() > 0) {
                    jSONObject2.put("scr", j);
                }
            } catch (Exception e9) {
                UMCrashManager.reportCrash(applicationContext, e9);
            }
            try {
                if (FieldManager.allow(C3745b.f9829S) && (k = m9094k(applicationContext)) != null && k.length() > 0) {
                    jSONObject2.put("sinfo", k);
                }
            } catch (Exception e10) {
                UMCrashManager.reportCrash(applicationContext, e10);
            }
            try {
                if (FieldManager.allow(C3745b.f9830T)) {
                    JSONObject jSONObject4 = new JSONObject();
                    JSONArray e11 = C3529a.m9119e(applicationContext);
                    if (e11 != null && e11.length() > 0) {
                        try {
                            jSONObject4.put("wl", e11);
                        } catch (JSONException unused3) {
                        }
                    }
                    JSONArray l = m9095l(applicationContext);
                    if (l != null && l.length() > 0) {
                        try {
                            jSONObject4.put("a_wls", l);
                        } catch (JSONException unused4) {
                        }
                    }
                    jSONObject2.put("winfo", jSONObject4);
                }
            } catch (Exception e12) {
                UMCrashManager.reportCrash(applicationContext, e12);
            }
            try {
                if (FieldManager.allow(C3745b.f9831U) && (m = m9096m(applicationContext)) != null && m.length() > 0) {
                    jSONObject2.put("input", m);
                }
            } catch (Exception e13) {
                UMCrashManager.reportCrash(applicationContext, e13);
            }
            try {
                if (FieldManager.allow(C3745b.f9839ab) && (n = m9097n(applicationContext)) != null && n.length() > 0) {
                    jSONObject2.put("appls", n);
                }
            } catch (Exception e14) {
                UMCrashManager.reportCrash(applicationContext, e14);
            }
            try {
                if (FieldManager.allow(C3745b.f9833W) && (o = m9098o(applicationContext)) != null && o.length() > 0) {
                    jSONObject2.put("mem", o);
                }
            } catch (Exception e15) {
                UMCrashManager.reportCrash(applicationContext, e15);
            }
            try {
                if (FieldManager.allow(C3745b.f9840ac) && (r = m9101r(applicationContext)) != null && r.length() > 0) {
                    jSONObject2.put("lbs", r);
                }
            } catch (Exception e16) {
                UMCrashManager.reportCrash(applicationContext, e16);
            }
            try {
                if (FieldManager.allow(C3745b.f9834X) && (d = m9086d()) != null && d.length() > 0) {
                    jSONObject2.put(C3617o.f9393v, d);
                }
            } catch (Exception unused5) {
            }
            try {
                if (FieldManager.allow(C3745b.f9835Y) && (c = m9084c()) != null && c.length() > 0) {
                    jSONObject2.put("rom", c);
                }
            } catch (Exception unused6) {
            }
            try {
                jSONObject.put(C3617o.f9361ao, jSONObject2);
            } catch (JSONException e17) {
                UMCrashManager.reportCrash(applicationContext, e17);
            }
        }
        return jSONObject;
    }

    /* renamed from: h */
    public static String m9091h(Context context) {
        try {
            C3676e a = C3676e.m9914a(context);
            if (a == null) {
                return null;
            }
            a.mo39246a();
            String encodeToString = Base64.encodeToString(new C3555ac().mo38869a(a.mo39248b()), 0);
            if (!TextUtils.isEmpty(encodeToString)) {
                return encodeToString;
            }
            return null;
        } catch (Exception e) {
            UMCrashManager.reportCrash(context, e);
            return null;
        }
    }

    /* renamed from: i */
    public static JSONArray m9092i(Context context) {
        if (context != null) {
            return C3549k.m9215f(context.getApplicationContext());
        }
        return null;
    }

    /* renamed from: j */
    public static JSONObject m9093j(Context context) {
        DisplayMetrics displayMetrics;
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            try {
                jSONObject.put("a_st_h", C3529a.m9124h(context));
                jSONObject.put("a_nav_h", C3529a.m9126i(context));
                if (!(context.getResources() == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null)) {
                    jSONObject.put("a_den", (double) displayMetrics.density);
                    jSONObject.put("a_dpi", displayMetrics.densityDpi);
                }
            } catch (Exception e) {
                UMCrashManager.reportCrash(context, e);
            }
        }
        return jSONObject;
    }

    /* renamed from: k */
    public static JSONObject m9094k(Context context) {
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            String packageName = applicationContext.getPackageName();
            try {
                jSONObject.put("a_fit", C3529a.m9106a(applicationContext, packageName));
                jSONObject.put("a_alut", C3529a.m9108b(applicationContext, packageName));
                jSONObject.put("a_c", C3529a.m9113c(applicationContext, packageName));
                jSONObject.put("a_uid", C3529a.m9114d(applicationContext, packageName));
                if (C3529a.m9107a()) {
                    jSONObject.put("a_root", 1);
                } else {
                    jSONObject.put("a_root", 0);
                }
                jSONObject.put("tf", C3529a.m9109b());
                jSONObject.put("s_fs", (double) C3529a.m9105a(applicationContext));
                jSONObject.put("a_meid", C3529a.m9131l(applicationContext));
                jSONObject.put("a_imsi", C3529a.m9130k(applicationContext));
                jSONObject.put("st", C3529a.m9120f());
                String a = C3549k.m9208a(applicationContext);
                if (!TextUtils.isEmpty(a)) {
                    try {
                        jSONObject.put("a_iccid", a);
                    } catch (Exception unused) {
                    }
                }
                String b = C3549k.m9210b(applicationContext);
                if (!TextUtils.isEmpty(b)) {
                    try {
                        jSONObject.put("a_simei", b);
                    } catch (Exception unused2) {
                    }
                }
                jSONObject.put("hn", C3529a.m9123g());
                jSONObject.put("ts", System.currentTimeMillis());
            } catch (Exception e) {
                UMCrashManager.reportCrash(applicationContext, e);
            }
        }
        return jSONObject;
    }

    /* renamed from: l */
    public static JSONArray m9095l(Context context) {
        Context applicationContext;
        List<ScanResult> b;
        JSONArray jSONArray = new JSONArray();
        if (!(context == null || (b = C3529a.m9110b((applicationContext = context.getApplicationContext()))) == null || b.size() <= 0)) {
            for (ScanResult scanResult : b) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("a_bssid", scanResult.BSSID);
                    jSONObject.put("a_ssid", scanResult.SSID);
                    jSONObject.put("a_cap", scanResult.capabilities);
                    jSONObject.put(C3542f.f9106e, scanResult.frequency);
                    jSONObject.put("ts", System.currentTimeMillis());
                    if (Build.VERSION.SDK_INT >= 23) {
                        jSONObject.put("a_c0", scanResult.centerFreq0);
                        jSONObject.put("a_c1", scanResult.centerFreq1);
                        jSONObject.put("a_cw", scanResult.channelWidth);
                        if (scanResult.is80211mcResponder()) {
                            jSONObject.put("a_is80211", 1);
                        } else {
                            jSONObject.put("a_is80211", 0);
                        }
                        if (scanResult.isPasspointNetwork()) {
                            jSONObject.put("a_isppn", 1);
                        } else {
                            jSONObject.put("a_isppn", 0);
                        }
                        jSONObject.put("a_ofn", scanResult.operatorFriendlyName);
                        jSONObject.put("a_vn", scanResult.venueName);
                    }
                    jSONObject.put(C3542f.f9103b, scanResult.describeContents());
                    jSONArray.put(jSONObject);
                } catch (Exception e) {
                    UMCrashManager.reportCrash(applicationContext, e);
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: m */
    public static JSONArray m9096m(Context context) {
        Context applicationContext;
        List<InputMethodInfo> m;
        JSONArray jSONArray = new JSONArray();
        if (!(context == null || (m = C3529a.m9132m((applicationContext = context.getApplicationContext()))) == null)) {
            for (InputMethodInfo inputMethodInfo : m) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("a_id", inputMethodInfo.getId());
                    jSONObject.put("a_pn", inputMethodInfo.getPackageName());
                    jSONObject.put("ts", System.currentTimeMillis());
                    jSONArray.put(jSONObject);
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(applicationContext, th);
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: n */
    public static JSONArray m9097n(Context context) {
        Context applicationContext;
        List<C3529a.C3530a> n;
        JSONArray jSONArray = new JSONArray();
        if (!(context == null || (n = C3529a.m9133n((applicationContext = context.getApplicationContext()))) == null || n.isEmpty())) {
            for (C3529a.C3530a aVar : n) {
                if (aVar != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("a_pn", aVar.f9060a);
                        jSONObject.put("a_la", aVar.f9061b);
                        jSONObject.put("ts", System.currentTimeMillis());
                        jSONArray.put(jSONObject);
                    } catch (Exception e) {
                        UMCrashManager.reportCrash(applicationContext, e);
                    }
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: o */
    public static JSONObject m9098o(Context context) {
        Context applicationContext;
        ActivityManager.MemoryInfo o;
        JSONObject jSONObject = new JSONObject();
        if (!(context == null || (o = C3529a.m9134o((applicationContext = context.getApplicationContext()))) == null)) {
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    jSONObject.put("t", o.totalMem);
                }
                jSONObject.put("f", o.availMem);
                jSONObject.put("ts", System.currentTimeMillis());
            } catch (Exception e) {
                UMCrashManager.reportCrash(applicationContext, e);
            }
        }
        return jSONObject;
    }

    /* renamed from: p */
    public static void m9099p(Context context) {
        try {
            if (UMEnvelopeBuild.isReadyBuild(context, UMLogDataProtocol.UMBusinessType.U_INTERNAL)) {
                UMWorkDispatch.sendEvent(context, 32769, C3524b.m9071a(context).mo38849a(), null);
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    /* renamed from: q */
    public static void m9100q(Context context) {
        try {
            ULog.m9832i("walle", "[internal] begin by not stateful--->>>");
            Context applicationContext = context.getApplicationContext();
            C3653f.m9764a(applicationContext, applicationContext.getFilesDir() + C8932ooOOO0o.OooO0OO + C3640a.f9476e + C8932ooOOO0o.OooO0OO + Base64.encodeToString(C3523a.f9024a.getBytes(), 0), 10);
            UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
            JSONObject buildSLBaseHeader = uMSLEnvelopeBuild.buildSLBaseHeader(applicationContext);
            if (buildSLBaseHeader != null && buildSLBaseHeader.has("header")) {
                try {
                    JSONObject jSONObject = (JSONObject) buildSLBaseHeader.opt("header");
                    if (jSONObject != null) {
                        jSONObject.put(C3617o.f9341aA, C3523a.f9027d);
                    }
                } catch (Exception unused) {
                }
            }
            ULog.m9832i("walle", "[internal] header is " + buildSLBaseHeader.toString());
            JSONObject f = m9089f(applicationContext);
            ULog.m9832i("walle", "[internal] body is " + f.toString());
            ULog.m9832i("walle", uMSLEnvelopeBuild.buildSLEnvelope(applicationContext, buildSLBaseHeader, f, C3523a.f9024a).toString());
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    /* renamed from: r */
    public static JSONArray m9101r(Context context) {
        if (context != null) {
            return C3588b.m9440b(context.getApplicationContext());
        }
        return null;
    }

    /* renamed from: s */
    public static JSONArray m9102s(Context context) {
        Throwable th;
        List<ActivityManager.RunningServiceInfo> runningServices;
        JSONArray jSONArray = null;
        if (context == null) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService(C5982OoooOoO.OooO0o0);
            if (activityManager == null || (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) == null || runningServices.isEmpty()) {
                return null;
            }
            for (int i = 0; i < runningServices.size(); i++) {
                if (!(runningServices.get(i) == null || runningServices.get(i).service == null || runningServices.get(i).service.getClassName() == null || runningServices.get(i).service.getPackageName() == null)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sn", runningServices.get(i).service.getClassName().toString());
                        jSONObject.put(C3416b.f8452ad, runningServices.get(i).service.getPackageName().toString());
                        if (jSONArray == null) {
                            jSONArray = new JSONArray();
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
            }
            if (jSONArray == null) {
                return jSONArray;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("ts", System.currentTimeMillis());
                jSONObject2.put("ls", jSONArray);
            } catch (JSONException unused2) {
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("sers", jSONObject2);
            } catch (JSONException unused3) {
            }
            JSONArray jSONArray2 = new JSONArray();
            try {
                jSONArray2.put(jSONObject3);
                return jSONArray2;
            } catch (Throwable th2) {
                th = th2;
                jSONArray = jSONArray2;
                UMCrashManager.reportCrash(context, th);
                return jSONArray;
            }
        } catch (Throwable th3) {
            th = th3;
            UMCrashManager.reportCrash(context, th);
            return jSONArray;
        }
    }

    /* renamed from: t */
    public static JSONArray m9103t(Context context) {
        JSONArray jSONArray = new JSONArray();
        JSONObject c = C3549k.m9212c(context);
        if (c != null) {
            try {
                String d = C3549k.m9213d(context);
                if (!TextUtils.isEmpty(d)) {
                    c.put("sig", d);
                }
                jSONArray.put(c);
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: u */
    public static JSONArray m9104u(Context context) {
        JSONArray jSONArray = new JSONArray();
        String e = C3549k.m9214e(context);
        if (!TextUtils.isEmpty(e)) {
            try {
                jSONArray.put(new JSONObject(e));
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: d */
    public static JSONObject m9086d() {
        try {
            C3538d.C3539a a = C3538d.m9154a();
            if (a == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pro", a.f9087a);
                jSONObject.put("pla", a.f9088b);
                jSONObject.put("cpus", a.f9089c);
                jSONObject.put("fea", a.f9090d);
                jSONObject.put("imp", a.f9091e);
                jSONObject.put("arc", a.f9092f);
                jSONObject.put("var", a.f9093g);
                jSONObject.put("par", a.f9094h);
                jSONObject.put("rev", a.f9095i);
                jSONObject.put("har", a.f9096j);
                jSONObject.put("rev", a.f9097k);
                jSONObject.put("ser", a.f9098l);
                jSONObject.put("cur_cpu", C3538d.m9157d());
                jSONObject.put("max_cpu", C3538d.m9155b());
                jSONObject.put("min_cpu", C3538d.m9156c());
                jSONObject.put("ts", System.currentTimeMillis());
            } catch (Exception unused) {
            }
            return jSONObject;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public static void m9083b(Context context, JSONObject jSONObject) {
        if (context != null) {
            String a = C3550l.m9218a(context);
            if (!TextUtils.isEmpty(a)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(a);
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    if (jSONObject2.has(C3550l.f9149d) && FieldManager.allow(C3745b.f9822L)) {
                        jSONObject.put(C3550l.f9149d, jSONObject2.opt(C3550l.f9149d));
                    }
                    if (jSONObject2.has(C3550l.f9148c) && FieldManager.allow(C3745b.f9823M)) {
                        jSONObject.put(C3550l.f9148c, jSONObject2.opt(C3550l.f9148c));
                    }
                    if (jSONObject2.has(C3550l.f9147b) && FieldManager.allow(C3745b.f9824N)) {
                        jSONObject.put(C3550l.f9147b, jSONObject2.opt(C3550l.f9147b));
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: c */
    public static JSONObject m9084c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tot_s", C3529a.m9125h());
            jSONObject.put("ava_s", C3529a.m9127i());
            jSONObject.put("ts", System.currentTimeMillis());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m9079a(Context context, JSONObject jSONObject) {
        PackageManager packageManager;
        if (context != null && (packageManager = context.getApplicationContext().getPackageManager()) != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (FieldManager.allow(C3745b.f9817G)) {
                m9080a(jSONObject, "gp", packageManager.hasSystemFeature("android.hardware.location.gps"));
            }
            if (FieldManager.allow(C3745b.f9818H)) {
                m9080a(jSONObject, "to", packageManager.hasSystemFeature("android.hardware.touchscreen"));
            }
            if (FieldManager.allow(C3745b.f9819I)) {
                m9080a(jSONObject, "mo", packageManager.hasSystemFeature("android.hardware.telephony"));
            }
            if (FieldManager.allow(C3745b.f9820J)) {
                m9080a(jSONObject, ConstantHelper.LOG_CATE, packageManager.hasSystemFeature("android.hardware.camera"));
            }
            if (FieldManager.allow(C3745b.f9821K)) {
                m9080a(jSONObject, "fl", packageManager.hasSystemFeature("android.hardware.camera.flash"));
            }
        }
    }

    /* renamed from: b */
    public static JSONObject m9081b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("a_pr", Build.PRODUCT);
            jSONObject.put("a_bl", Build.BOOTLOADER);
            if (Build.VERSION.SDK_INT >= 14) {
                jSONObject.put("a_rv", Build.getRadioVersion());
            }
            jSONObject.put("a_fp", Build.FINGERPRINT);
            jSONObject.put("a_hw", Build.HARDWARE);
            jSONObject.put("a_host", Build.HOST);
            if (Build.VERSION.SDK_INT >= 21) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < Build.SUPPORTED_32_BIT_ABIS.length; i++) {
                    jSONArray.put(Build.SUPPORTED_32_BIT_ABIS[i]);
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("a_s32", jSONArray);
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < Build.SUPPORTED_64_BIT_ABIS.length; i2++) {
                    jSONArray2.put(Build.SUPPORTED_64_BIT_ABIS[i2]);
                }
                if (jSONArray2.length() > 0) {
                    jSONObject.put("a_s64", jSONArray2);
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                JSONArray jSONArray3 = new JSONArray();
                for (int i3 = 0; i3 < Build.SUPPORTED_ABIS.length; i3++) {
                    jSONArray3.put(Build.SUPPORTED_ABIS[i3]);
                }
                if (jSONArray3.length() > 0) {
                    jSONObject.put("a_sa", jSONArray3);
                }
            }
            jSONObject.put("a_ta", Build.TAGS);
            jSONObject.put("a_uk", "unknown");
            jSONObject.put("a_user", Build.USER);
            jSONObject.put("a_cpu1", Build.CPU_ABI);
            jSONObject.put("a_cpu2", Build.CPU_ABI2);
            jSONObject.put("a_ra", Build.RADIO);
            if (Build.VERSION.SDK_INT >= 23) {
                jSONObject.put("a_bos", Build.VERSION.BASE_OS);
                jSONObject.put("a_pre", Build.VERSION.PREVIEW_SDK_INT);
                jSONObject.put("a_sp", Build.VERSION.SECURITY_PATCH);
            }
            jSONObject.put("a_cn", Build.VERSION.CODENAME);
            jSONObject.put("a_intl", Build.VERSION.INCREMENTAL);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m9080a(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    jSONObject.put(str, 1);
                } catch (Exception unused) {
                }
            } else {
                jSONObject.put(str, 0);
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m9077a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("f", C3529a.m9111c());
            jSONObject.put("t", C3529a.m9115d());
            jSONObject.put("ts", System.currentTimeMillis());
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
