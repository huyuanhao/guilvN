package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.C3407b;
import com.umeng.analytics.C3410c;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.process.UMProcessDBHelper;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.C3517b;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ReportPolicy;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.utils.JSONArraySortUtil;
import com.umeng.commonsdk.utils.UMUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.k */
public class C3445k {

    /* renamed from: a */
    public static Context f8705a = null;

    /* renamed from: l */
    public static final String f8706l = "first_activate_time";

    /* renamed from: m */
    public static final String f8707m = "ana_is_f";

    /* renamed from: n */
    public static final String f8708n = "thtstart";

    /* renamed from: o */
    public static final String f8709o = "dstk_last_time";

    /* renamed from: p */
    public static final String f8710p = "dstk_cnt";

    /* renamed from: q */
    public static final String f8711q = "gkvc";

    /* renamed from: r */
    public static final String f8712r = "ekvc";

    /* renamed from: t */
    public static final String f8713t = "-1";

    /* renamed from: b */
    public C3449c f8714b;

    /* renamed from: c */
    public SharedPreferences f8715c;

    /* renamed from: d */
    public String f8716d;

    /* renamed from: e */
    public String f8717e;

    /* renamed from: f */
    public int f8718f;

    /* renamed from: g */
    public JSONArray f8719g;

    /* renamed from: h */
    public final int f8720h;

    /* renamed from: i */
    public int f8721i;

    /* renamed from: j */
    public int f8722j;

    /* renamed from: k */
    public long f8723k;

    /* renamed from: s */
    public final long f8724s;

    /* renamed from: u */
    public boolean f8725u;

    /* renamed from: v */
    public boolean f8726v;

    /* renamed from: w */
    public Object f8727w;

    /* renamed from: com.umeng.analytics.pro.k$a */
    public static class C3447a {

        /* renamed from: a */
        public static final int f8728a = 4097;

        /* renamed from: b */
        public static final int f8729b = 4098;

        /* renamed from: c */
        public static final int f8730c = 4099;

        /* renamed from: d */
        public static final int f8731d = 4100;

        /* renamed from: e */
        public static final int f8732e = 4101;

        /* renamed from: f */
        public static final int f8733f = 4102;

        /* renamed from: g */
        public static final int f8734g = 4103;

        /* renamed from: h */
        public static final int f8735h = 4104;

        /* renamed from: i */
        public static final int f8736i = 4105;

        /* renamed from: j */
        public static final int f8737j = 4106;

        /* renamed from: k */
        public static final int f8738k = 4352;

        /* renamed from: l */
        public static final int f8739l = 4353;

        /* renamed from: m */
        public static final int f8740m = 4354;

        /* renamed from: n */
        public static final int f8741n = 8193;

        /* renamed from: o */
        public static final int f8742o = 8194;

        /* renamed from: p */
        public static final int f8743p = 8195;

        /* renamed from: q */
        public static final int f8744q = 8196;

        /* renamed from: r */
        public static final int f8745r = 8197;

        /* renamed from: s */
        public static final int f8746s = 8199;

        /* renamed from: t */
        public static final int f8747t = 8200;

        /* renamed from: u */
        public static final int f8748u = 8201;
    }

    /* renamed from: com.umeng.analytics.pro.k$b */
    public static class C3448b {

        /* renamed from: a */
        public static final C3445k f8749a = new C3445k();
    }

    /* renamed from: a */
    public static C3445k m8798a(Context context) {
        if (f8705a == null && context != null) {
            f8705a = context.getApplicationContext();
        }
        return C3448b.f8749a;
    }

    /* renamed from: e */
    private void m8808e(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (2050 == jSONObject.getInt("__t")) {
                if (m8801a(this.f8723k, this.f8721i)) {
                    this.f8721i++;
                } else {
                    return;
                }
            } else if (2049 == jSONObject.getInt("__t")) {
                if (m8801a(this.f8723k, this.f8722j)) {
                    this.f8722j++;
                } else {
                    return;
                }
            }
            if (this.f8719g.length() >= this.f8718f) {
                C3437g.m8754a(f8705a).mo38703a(this.f8719g);
                this.f8719g = new JSONArray();
            }
            if (this.f8723k == 0) {
                this.f8723k = System.currentTimeMillis();
            }
            this.f8719g.put(jSONObject);
        } catch (Throwable th) {
            MLog.m9797e(th);
        }
    }

    /* renamed from: h */
    private void m8813h() {
        JSONObject b = mo38739b(UMEnvelopeBuild.maxDataSpace(f8705a));
        if (b != null && b.length() >= 1) {
            JSONObject jSONObject = (JSONObject) b.opt("header");
            JSONObject jSONObject2 = (JSONObject) b.opt("content");
            if (f8705a != null && jSONObject != null && jSONObject2 != null) {
                UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> constructInstantMessage: request build envelope.");
                JSONObject buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(f8705a, jSONObject, jSONObject2);
                if (buildEnvelopeWithExtHeader != null) {
                    try {
                        if (buildEnvelopeWithExtHeader.has("exception")) {
                            UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "Build envelope error code: " + buildEnvelopeWithExtHeader.getInt("exception"));
                        }
                    } catch (Throwable unused) {
                    }
                    mo38743b((Object) buildEnvelopeWithExtHeader);
                }
            }
        }
    }

    /* renamed from: i */
    private void m8815i() {
        JSONObject buildEnvelopeWithExtHeader;
        JSONObject a = mo38733a(UMEnvelopeBuild.maxDataSpace(f8705a));
        if (a != null && a.length() >= 1) {
            JSONObject jSONObject = (JSONObject) a.opt("header");
            JSONObject jSONObject2 = (JSONObject) a.opt("content");
            Context context = f8705a;
            if (context != null && jSONObject != null && jSONObject2 != null && (buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject, jSONObject2)) != null) {
                try {
                    if (buildEnvelopeWithExtHeader.has("exception")) {
                        UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "Build envelope error code: " + buildEnvelopeWithExtHeader.getInt("exception"));
                    }
                } catch (Throwable unused) {
                }
                m8804c(buildEnvelopeWithExtHeader);
                mo38735a((Object) buildEnvelopeWithExtHeader);
            }
        }
    }

    /* renamed from: j */
    private JSONObject m8816j() {
        JSONObject k = m8817k();
        if (k != null) {
            try {
                k.put("st", "1");
            } catch (Throwable unused) {
            }
        }
        return k;
    }

    /* renamed from: k */
    private JSONObject m8817k() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!(AnalyticsConfig.mWrapperType == null || AnalyticsConfig.mWrapperVersion == null)) {
                jSONObject.put("wrapper_version", AnalyticsConfig.mWrapperVersion);
                jSONObject.put("wrapper_type", AnalyticsConfig.mWrapperType);
            }
            jSONObject.put(C3416b.f8482i, AnalyticsConfig.getVerticalType(f8705a));
            jSONObject.put("sdk_version", C3468v.f8798a);
            String MD5 = HelperUtils.MD5(AnalyticsConfig.getSecretKey(f8705a));
            if (!TextUtils.isEmpty(MD5)) {
                jSONObject.put("secret", MD5);
            }
            String imprintProperty = UMEnvelopeBuild.imprintProperty(f8705a, "pr_ve", null);
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8705a);
            String imprintProperty2 = UMEnvelopeBuild.imprintProperty(f8705a, "ekv_bl_ver", "");
            if (!TextUtils.isEmpty(imprintProperty2)) {
                if (AnalyticsConfig.CLEAR_EKV_BL) {
                    jSONObject.put(C3416b.f8461am, "");
                } else {
                    jSONObject.put(C3416b.f8461am, imprintProperty2);
                }
            }
            String imprintProperty3 = UMEnvelopeBuild.imprintProperty(f8705a, "ekv_wl_ver", "");
            if (!TextUtils.isEmpty(imprintProperty3)) {
                if (AnalyticsConfig.CLEAR_EKV_WL) {
                    jSONObject.put(C3416b.f8462an, "");
                } else {
                    jSONObject.put(C3416b.f8462an, imprintProperty3);
                }
            }
            jSONObject.put(C3416b.f8453ae, "1.0.0");
            if (m8824r()) {
                jSONObject.put(C3416b.f8455ag, "1");
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putLong(f8707m, 0).commit();
                }
            }
            jSONObject.put(C3416b.f8485l, m8818l());
            jSONObject.put(C3416b.f8486m, m8819m());
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("vers_name", "");
                if (!TextUtils.isEmpty(string)) {
                    String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (TextUtils.isEmpty(imprintProperty)) {
                        jSONObject.put(C3416b.f8485l, sharedPreferences.getString("vers_pre_version", "0"));
                        jSONObject.put(C3416b.f8486m, sharedPreferences.getString("vers_date", format));
                    }
                    sharedPreferences.edit().putString("pre_version", string).putString("cur_version", DeviceConfig.getAppVersionName(f8705a)).putString("pre_date", format).remove("vers_name").remove("vers_code").remove("vers_date").remove("vers_pre_version").commit();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: l */
    private String m8818l() {
        String str = null;
        try {
            str = UMEnvelopeBuild.imprintProperty(f8705a, "pr_ve", null);
            if (TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(this.f8716d)) {
                    return this.f8716d;
                }
                if (this.f8715c == null) {
                    this.f8715c = PreferenceWrapper.getDefault(f8705a);
                }
                String string = this.f8715c.getString("pre_version", "");
                String appVersionName = DeviceConfig.getAppVersionName(f8705a);
                if (TextUtils.isEmpty(string)) {
                    this.f8715c.edit().putString("pre_version", "0").putString("cur_version", appVersionName).commit();
                    str = "0";
                } else {
                    String string2 = this.f8715c.getString("cur_version", "");
                    if (!appVersionName.equals(string2)) {
                        this.f8715c.edit().putString("pre_version", string2).putString("cur_version", appVersionName).commit();
                        str = string2;
                    } else {
                        str = string;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.f8716d = str;
        return str;
    }

    /* renamed from: m */
    private String m8819m() {
        String str = null;
        try {
            str = UMEnvelopeBuild.imprintProperty(f8705a, "ud_da", null);
            if (TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(this.f8717e)) {
                    return this.f8717e;
                }
                if (this.f8715c == null) {
                    this.f8715c = PreferenceWrapper.getDefault(f8705a);
                }
                String string = this.f8715c.getString("pre_date", "");
                if (TextUtils.isEmpty(string)) {
                    string = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    this.f8715c.edit().putString("pre_date", string).commit();
                } else {
                    String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (!string.equals(format)) {
                        this.f8715c.edit().putString("pre_date", format).commit();
                        str = format;
                    }
                }
                str = string;
            }
        } catch (Throwable unused) {
        }
        this.f8717e = str;
        return str;
    }

    /* renamed from: n */
    private void m8820n() {
        try {
            this.f8721i = 0;
            this.f8722j = 0;
            this.f8723k = System.currentTimeMillis();
            PreferenceWrapper.getDefault(f8705a).edit().putLong(f8709o, System.currentTimeMillis()).putInt(f8710p, 0).commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: o */
    private boolean m8821o() {
        try {
            if (!TextUtils.isEmpty(C3460q.m8882a().mo38774b())) {
                mo38742b(f8705a);
            }
            if (this.f8719g.length() <= 0) {
                return false;
            }
            for (int i = 0; i < this.f8719g.length(); i++) {
                JSONObject optJSONObject = this.f8719g.optJSONObject(i);
                if (optJSONObject != null && optJSONObject.length() > 0) {
                    String optString = optJSONObject.optString("__i");
                    if (TextUtils.isEmpty(optString) || "-1".equals(optString)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: p */
    private void m8822p() {
        if (this.f8719g.length() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.f8719g.length(); i++) {
                try {
                    JSONObject jSONObject = this.f8719g.getJSONObject(i);
                    if (jSONObject == null || jSONObject.length() <= 0) {
                        jSONArray.put(jSONObject);
                    } else {
                        String optString = jSONObject.optString("__i");
                        String str = "-1";
                        if (TextUtils.isEmpty(optString) || str.equals(optString)) {
                            String b = C3460q.m8882a().mo38774b();
                            if (!TextUtils.isEmpty(b)) {
                                str = b;
                            }
                            jSONObject.put("__i", str);
                        }
                        jSONArray.put(jSONObject);
                    }
                } catch (Throwable unused) {
                }
            }
            this.f8719g = jSONArray;
        }
    }

    /* renamed from: q */
    private void m8823q() {
        SharedPreferences sharedPreferences;
        try {
            if (m8824r() && f8705a != null && (sharedPreferences = PreferenceWrapper.getDefault(f8705a)) != null && sharedPreferences.getLong("first_activate_time", 0) == 0) {
                sharedPreferences.edit().putLong("first_activate_time", System.currentTimeMillis()).commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: r */
    private boolean m8824r() {
        SharedPreferences sharedPreferences;
        try {
            return (f8705a == null || (sharedPreferences = PreferenceWrapper.getDefault(f8705a)) == null || sharedPreferences.getLong(f8707m, -1) == 0) ? false : true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public JSONObject mo38739b(long j) {
        if (TextUtils.isEmpty(C3466u.m8916a().mo38796d(UMGlobalContext.getAppContext(f8705a)))) {
            return null;
        }
        JSONObject b = C3437g.m8754a(UMGlobalContext.getAppContext(f8705a)).mo38708b(false);
        String[] a = C3410c.m8724a(f8705a);
        if (a != null && !TextUtils.isEmpty(a[0]) && !TextUtils.isEmpty(a[1])) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C3416b.f8428L, a[0]);
                jSONObject.put(C3416b.f8429M, a[1]);
                if (jSONObject.length() > 0) {
                    b.put(C3416b.f8427K, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        int a2 = C3453n.m8858a().mo38761a(f8705a);
        if (b.length() == 1 && b.optJSONObject(C3416b.f8427K) != null && a2 != 3) {
            return null;
        }
        C3453n.m8858a().mo38763b(b, f8705a);
        if (b.length() <= 0 && a2 != 3) {
            return null;
        }
        JSONObject j2 = m8816j();
        if (j2 != null) {
            m8800a(j2);
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (a2 == 3) {
            try {
                jSONObject3.put("analytics", new JSONObject());
            } catch (Throwable unused2) {
                return jSONObject2;
            }
        } else if (b != null && b.length() > 0) {
            jSONObject3.put("analytics", b);
        }
        if (j2 != null && j2.length() > 0) {
            jSONObject2.put("header", j2);
        }
        if (jSONObject3.length() > 0) {
            jSONObject2.put("content", jSONObject3);
        }
        return m8802b(jSONObject2, j);
    }

    /* renamed from: b */
    public void mo38741b() {
    }

    /* renamed from: c */
    public void mo38744c() {
        mo38742b(f8705a);
        mo38746d();
        mo38738a(true);
    }

    /* renamed from: d */
    public void mo38746d() {
        try {
            if (this.f8719g.length() > 0) {
                C3437g.m8754a(f8705a).mo38703a(this.f8719g);
                this.f8719g = new JSONArray();
            }
            PreferenceWrapper.getDefault(f8705a).edit().putLong("thtstart", this.f8723k).putInt("gkvc", this.f8721i).putInt("ekvc", this.f8722j).commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    public long mo38749f() {
        SharedPreferences sharedPreferences;
        try {
            if (f8705a == null || (sharedPreferences = PreferenceWrapper.getDefault(f8705a)) == null) {
                return 0;
            }
            long j = sharedPreferences.getLong("first_activate_time", 0);
            if (j == 0) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    sharedPreferences.edit().putLong("first_activate_time", currentTimeMillis).commit();
                    return currentTimeMillis;
                } catch (Throwable unused) {
                }
            }
            return j;
        } catch (Throwable unused2) {
            return 0;
        }
    }

    public C3445k() {
        this.f8714b = null;
        this.f8715c = null;
        this.f8716d = null;
        this.f8717e = null;
        this.f8718f = 10;
        this.f8719g = new JSONArray();
        this.f8720h = 5000;
        this.f8721i = 0;
        this.f8722j = 0;
        this.f8723k = 0;
        this.f8724s = Defcon.MILLIS_8_HOURS;
        this.f8725u = false;
        this.f8726v = false;
        this.f8727w = new Object();
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8705a);
            this.f8723k = sharedPreferences.getLong("thtstart", 0);
            this.f8721i = sharedPreferences.getInt("gkvc", 0);
            this.f8722j = sharedPreferences.getInt("ekvc", 0);
            this.f8714b = new C3449c();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    private void m8812g(Object obj) {
        try {
            mo38742b(f8705a);
            mo38746d();
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null) {
                return;
            }
            if (jSONObject.length() > 0) {
                String string = jSONObject.getString(C3416b.f8428L);
                String string2 = jSONObject.getString("uid");
                long j = jSONObject.getLong("ts");
                String[] a = C3410c.m8724a(f8705a);
                if (a == null || !string.equals(a[0]) || !string2.equals(a[1])) {
                    C3460q.m8882a().mo38770a(f8705a, j);
                    String c = C3466u.m8916a().mo38795c(f8705a);
                    boolean b = C3460q.m8882a().mo38776b(f8705a, j);
                    C3410c.m8723a(f8705a, string, string2);
                    UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> onProfileSignIn: force generate new session: session id = " + c);
                    C3460q.m8882a().mo38769a(f8705a, j, true);
                    if (b) {
                        C3460q.m8882a().mo38778c(f8705a, j);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: com.umeng.analytics.pro.k$c */
    public static class C3449c {

        /* renamed from: a */
        public ReportPolicy.ReportStrategy f8750a;

        /* renamed from: b */
        public int f8751b;

        /* renamed from: c */
        public int f8752c;

        /* renamed from: d */
        public int f8753d;

        /* renamed from: e */
        public int f8754e;

        /* renamed from: f */
        public ABTest f8755f;

        public C3449c() {
            this.f8750a = null;
            this.f8751b = -1;
            this.f8752c = -1;
            this.f8753d = -1;
            this.f8754e = -1;
            this.f8755f = null;
            this.f8755f = ABTest.getService(C3445k.f8705a);
        }

        /* renamed from: a */
        public void mo38751a() {
            try {
                int[] a = mo38752a(-1, -1);
                this.f8751b = a[0];
                this.f8752c = a[1];
            } catch (Throwable unused) {
            }
        }

        /* renamed from: b */
        public void mo38753b() {
            int i;
            Defcon service = Defcon.getService(C3445k.f8705a);
            if (service.isOpen()) {
                ReportPolicy.ReportStrategy reportStrategy = this.f8750a;
                this.f8750a = (reportStrategy instanceof ReportPolicy.DefconPolicy) && reportStrategy.isValid() ? this.f8750a : new ReportPolicy.DefconPolicy(StatTracer.getInstance(C3445k.f8705a), service);
            } else {
                boolean z = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C3445k.f8705a, "integrated_test", "-1")).intValue() == 1;
                if (UMConfigure.isDebugLog() && z && !MLog.DEBUG) {
                    UMLog.mutlInfo(C3441h.f8605K, 3, "\\|", null, null);
                }
                if (MLog.DEBUG && z) {
                    this.f8750a = new ReportPolicy.DebugPolicy(StatTracer.getInstance(C3445k.f8705a));
                } else if (!this.f8755f.isInTest() || !"RPT".equals(this.f8755f.getTestName())) {
                    int i2 = this.f8753d;
                    int i3 = this.f8754e;
                    int i4 = this.f8751b;
                    if (i4 != -1) {
                        i3 = this.f8752c;
                        i2 = i4;
                    }
                    this.f8750a = m8843b(i2, i3);
                } else {
                    if (this.f8755f.getTestPolicy() == 6) {
                        if (Integer.valueOf(UMEnvelopeBuild.imprintProperty(C3445k.f8705a, "test_report_interval", "-1")).intValue() != -1) {
                            i = mo38750a(90000);
                        } else {
                            i = this.f8752c;
                            if (i <= 0) {
                                i = this.f8754e;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    this.f8750a = m8843b(this.f8755f.getTestPolicy(), i);
                }
            }
            if (UMConfigure.isDebugLog()) {
                try {
                    if (this.f8750a instanceof ReportPolicy.ReportAtLaunch) {
                        UMLog.mutlInfo(C3441h.f8603I, 3, "", null, null);
                    } else if (this.f8750a instanceof ReportPolicy.ReportByInterval) {
                        UMLog.mutlInfo(C3441h.f8604J, 3, "", new String[]{"@"}, new String[]{String.valueOf(((ReportPolicy.ReportByInterval) this.f8750a).getReportInterval() / 1000)});
                    } else if (this.f8750a instanceof ReportPolicy.DebugPolicy) {
                        UMLog.mutlInfo(C3441h.f8606L, 3, "", null, null);
                    } else if (this.f8750a instanceof ReportPolicy.ReportQuasiRealtime) {
                        String[] strArr = {String.valueOf(((ReportPolicy.ReportQuasiRealtime) this.f8750a).getReportInterval() / 1000)};
                        UMLog uMLog = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(C3441h.f8607M, 3, "", new String[]{"@"}, strArr);
                    } else {
                        boolean z2 = this.f8750a instanceof ReportPolicy.DefconPolicy;
                    }
                } catch (Throwable unused) {
                }
            }
        }

        /* renamed from: c */
        public ReportPolicy.ReportStrategy mo38754c() {
            mo38753b();
            return this.f8750a;
        }

        /* renamed from: a */
        public int[] mo38752a(int i, int i2) {
            int intValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C3445k.f8705a, C3517b.f9003p, "-1")).intValue();
            int intValue2 = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C3445k.f8705a, C3517b.f9004q, "-1")).intValue();
            if (intValue == -1 || !ReportPolicy.isValid(intValue)) {
                return new int[]{i, i2};
            } else if (6 == intValue) {
                if (intValue2 == -1 || intValue2 < 90 || intValue2 > 86400) {
                    intValue2 = 90;
                }
                return new int[]{intValue, intValue2 * 1000};
            } else if (11 == intValue) {
                if (intValue2 == -1 || intValue2 < 15 || intValue2 > 3600) {
                    intValue2 = 15;
                }
                return new int[]{intValue, intValue2 * 1000};
            } else {
                return new int[]{i, i2};
            }
        }

        /* renamed from: a */
        public int mo38750a(int i) {
            int intValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C3445k.f8705a, "test_report_interval", "-1")).intValue();
            return (intValue == -1 || intValue < 90 || intValue > 86400) ? i : intValue * 1000;
        }

        /* renamed from: b */
        private ReportPolicy.ReportStrategy m8843b(int i, int i2) {
            if (i == 0) {
                ReportPolicy.ReportStrategy reportStrategy = this.f8750a;
                return reportStrategy instanceof ReportPolicy.ReportRealtime ? reportStrategy : new ReportPolicy.ReportRealtime();
            } else if (i == 1) {
                ReportPolicy.ReportStrategy reportStrategy2 = this.f8750a;
                if (reportStrategy2 instanceof ReportPolicy.ReportAtLaunch) {
                    return reportStrategy2;
                }
                return new ReportPolicy.ReportAtLaunch();
            } else if (i == 4) {
                ReportPolicy.ReportStrategy reportStrategy3 = this.f8750a;
                if (reportStrategy3 instanceof ReportPolicy.ReportDaily) {
                    return reportStrategy3;
                }
                return new ReportPolicy.ReportDaily(StatTracer.getInstance(C3445k.f8705a));
            } else if (i == 5) {
                ReportPolicy.ReportStrategy reportStrategy4 = this.f8750a;
                if (reportStrategy4 instanceof ReportPolicy.ReportWifiOnly) {
                    return reportStrategy4;
                }
                return new ReportPolicy.ReportWifiOnly(C3445k.f8705a);
            } else if (i == 6) {
                ReportPolicy.ReportStrategy reportStrategy5 = this.f8750a;
                if (!(reportStrategy5 instanceof ReportPolicy.ReportByInterval)) {
                    return new ReportPolicy.ReportByInterval(StatTracer.getInstance(C3445k.f8705a), (long) i2);
                }
                ((ReportPolicy.ReportByInterval) reportStrategy5).setReportInterval((long) i2);
                return reportStrategy5;
            } else if (i == 8) {
                ReportPolicy.ReportStrategy reportStrategy6 = this.f8750a;
                if (reportStrategy6 instanceof ReportPolicy.SmartPolicy) {
                    return reportStrategy6;
                }
                return new ReportPolicy.SmartPolicy(StatTracer.getInstance(C3445k.f8705a));
            } else if (i != 11) {
                ReportPolicy.ReportStrategy reportStrategy7 = this.f8750a;
                if (reportStrategy7 instanceof ReportPolicy.ReportAtLaunch) {
                    return reportStrategy7;
                }
                return new ReportPolicy.ReportAtLaunch();
            } else {
                ReportPolicy.ReportStrategy reportStrategy8 = this.f8750a;
                if (reportStrategy8 instanceof ReportPolicy.ReportQuasiRealtime) {
                    ((ReportPolicy.ReportQuasiRealtime) reportStrategy8).setReportInterval((long) i2);
                    return reportStrategy8;
                }
                ReportPolicy.ReportQuasiRealtime reportQuasiRealtime = new ReportPolicy.ReportQuasiRealtime();
                reportQuasiRealtime.setReportInterval((long) i2);
                return reportQuasiRealtime;
            }
        }
    }

    /* renamed from: c */
    private boolean m8805c(boolean z) {
        if (m8824r()) {
            return true;
        }
        if (this.f8714b == null) {
            this.f8714b = new C3449c();
        }
        this.f8714b.mo38751a();
        ReportPolicy.ReportStrategy c = this.f8714b.mo38754c();
        MLog.m9787d("Report policy : " + c.getClass().getSimpleName());
        boolean shouldSendMessage = c.shouldSendMessage(z);
        if (shouldSendMessage) {
            if (((c instanceof ReportPolicy.ReportByInterval) || (c instanceof ReportPolicy.DebugPolicy) || (c instanceof ReportPolicy.ReportQuasiRealtime)) && m8821o()) {
                mo38746d();
            }
            if ((c instanceof ReportPolicy.DefconPolicy) && m8821o()) {
                mo38746d();
            }
        }
        return shouldSendMessage;
    }

    /* renamed from: a */
    public void mo38734a() {
        if (f8705a != null) {
            synchronized (this.f8727w) {
                if (this.f8725u) {
                    UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> network is now available, rebuild instant session data packet.");
                    UMWorkDispatch.sendEvent(f8705a, 4353, CoreProtocol.getInstance(f8705a), null);
                }
            }
            synchronized (this.f8727w) {
                if (this.f8726v) {
                    UMWorkDispatch.sendEvent(f8705a, C3447a.f8740m, CoreProtocol.getInstance(f8705a), null);
                }
            }
        }
    }

    /* renamed from: com.umeng.analytics.pro.k$d */
    public static class C3450d {

        /* renamed from: a */
        public Map<String, Object> f8756a = null;

        /* renamed from: b */
        public String f8757b = null;

        /* renamed from: c */
        public String f8758c = null;

        /* renamed from: d */
        public long f8759d = 0;

        public C3450d() {
        }

        /* renamed from: a */
        public Map<String, Object> mo38755a() {
            return this.f8756a;
        }

        /* renamed from: b */
        public String mo38756b() {
            return this.f8758c;
        }

        /* renamed from: c */
        public String mo38757c() {
            return this.f8757b;
        }

        /* renamed from: d */
        public long mo38758d() {
            return this.f8759d;
        }

        public C3450d(String str, Map<String, Object> map, String str2, long j) {
            this.f8756a = map;
            this.f8757b = str;
            this.f8759d = j;
            this.f8758c = str2;
        }
    }

    /* renamed from: f */
    private void m8810f(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null) {
                return;
            }
            if (jSONObject.length() > 0) {
                long j = jSONObject.getLong("ts");
                mo38742b(f8705a);
                mo38746d();
                String[] a = C3410c.m8724a(f8705a);
                if (a != null && !TextUtils.isEmpty(a[0]) && !TextUtils.isEmpty(a[1])) {
                    C3460q.m8882a().mo38770a(f8705a, j);
                    String c = C3466u.m8916a().mo38795c(f8705a);
                    UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> onProfileSignIn: force generate new session: session id = " + c);
                    boolean b = C3460q.m8882a().mo38776b(f8705a, j);
                    C3410c.m8725b(f8705a);
                    C3460q.m8882a().mo38769a(f8705a, j, true);
                    if (b) {
                        C3460q.m8882a().mo38778c(f8705a, j);
                    }
                }
            }
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m9795e(" Excepthon  in  onProfileSignOff", th);
            }
        }
    }

    /* renamed from: d */
    private void m8806d(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        try {
            if (jSONObject.getJSONObject("header").has(C3416b.f8473ay)) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has("analytics")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("analytics");
                    if (jSONObject2.has(C3416b.f8487n) && (optJSONObject2 = jSONObject2.getJSONArray(C3416b.f8487n).optJSONObject(0)) != null) {
                        String optString = optJSONObject2.optString("id");
                        if (!TextUtils.isEmpty(optString)) {
                            UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> removeAllInstantData: really delete instant session data");
                            C3437g.m8754a(f8705a).mo38710b(optString);
                        }
                    }
                }
                C3437g.m8754a(f8705a).mo38709b();
                UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> removeAllInstantData: send INSTANT_SESSION_START_CONTINUE event because OVERSIZE.");
                UMWorkDispatch.sendEvent(f8705a, 4353, CoreProtocol.getInstance(f8705a), null);
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has("analytics") && (optJSONObject = jSONObject.optJSONObject("analytics")) != null && optJSONObject.length() > 0 && optJSONObject.has(C3416b.f8487n)) {
                C3437g.m8754a(f8705a).mo38705a(true, false);
            }
            C3437g.m8754a(f8705a).mo38709b();
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    private void m8814h(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0 && jSONObject.has("__ii")) {
                String optString = jSONObject.optString("__ii");
                jSONObject.remove("__ii");
                if (!TextUtils.isEmpty(optString)) {
                    C3437g.m8754a(f8705a).mo38706a(optString, obj.toString(), 2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private void m8809e(JSONObject jSONObject) {
        JSONObject optJSONObject;
        try {
            if (jSONObject.getJSONObject("header").has(C3416b.f8473ay)) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (!jSONObject.has("analytics")) {
                    return;
                }
                if (jSONObject.getJSONObject("analytics").has(C3416b.f8487n)) {
                    C3437g.m8754a(f8705a).mo38720i();
                    C3437g.m8754a(f8705a).mo38719h();
                    C3437g.m8754a(f8705a).mo38711b(true, false);
                    C3437g.m8754a(f8705a).mo38702a();
                    return;
                }
                UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> Error, Should not go to this branch.");
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has("analytics") && (optJSONObject = jSONObject.optJSONObject("analytics")) != null && optJSONObject.length() > 0) {
                if (optJSONObject.has(C3416b.f8487n)) {
                    C3437g.m8754a(f8705a).mo38711b(true, false);
                }
                if (optJSONObject.has(C3416b.f8434R) || optJSONObject.has(C3416b.f8435S)) {
                    C3437g.m8754a(f8705a).mo38719h();
                }
                if (optJSONObject.has("error")) {
                    C3437g.m8754a(f8705a).mo38720i();
                }
            }
            C3437g.m8754a(f8705a).mo38702a();
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private void m8804c(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2;
        if (jSONObject != null) {
            try {
                if (jSONObject.length() > 0) {
                    JSONObject jSONObject3 = new JSONObject();
                    if (jSONObject.has("analytics")) {
                        JSONObject jSONObject4 = jSONObject.getJSONObject("analytics");
                        if (jSONObject4.has(C3416b.f8434R)) {
                            str = "version_code";
                            jSONObject3.put(C3416b.f8434R, jSONObject4.getJSONArray(C3416b.f8434R));
                        } else {
                            str = "version_code";
                        }
                        if (jSONObject4.has(C3416b.f8435S)) {
                            jSONObject3.put(C3416b.f8435S, jSONObject4.getJSONArray(C3416b.f8435S));
                        }
                        if (jSONObject4.has("error")) {
                            jSONObject3.put("error", jSONObject4.getJSONArray("error"));
                        }
                        if (jSONObject4.has(C3416b.f8487n)) {
                            JSONArray jSONArray = jSONObject4.getJSONArray(C3416b.f8487n);
                            JSONArray jSONArray2 = new JSONArray();
                            for (int i = 0; i < jSONArray.length(); i++) {
                                JSONObject jSONObject5 = jSONArray.getJSONObject(i);
                                if (jSONObject5 != null && jSONObject5.length() > 0) {
                                    if (jSONObject5.has(C3416b.f8493t)) {
                                        jSONObject5.remove(C3416b.f8493t);
                                    }
                                    jSONArray2.put(jSONObject5);
                                }
                            }
                            jSONObject3.put(C3416b.f8487n, jSONArray2);
                        }
                        if (jSONObject4.has(C3416b.f8424H)) {
                            jSONObject3.put(C3416b.f8424H, jSONObject4.getJSONObject(C3416b.f8424H));
                        }
                        if (jSONObject4.has(C3416b.f8427K)) {
                            jSONObject3.put(C3416b.f8427K, jSONObject4.getJSONObject(C3416b.f8427K));
                        }
                    } else {
                        str = "version_code";
                    }
                    if (jSONObject.has("dplus")) {
                        jSONObject3.put("dplus", jSONObject.getJSONObject("dplus"));
                    }
                    if (jSONObject.has("header") && jSONObject.has("header") && (jSONObject2 = jSONObject.getJSONObject("header")) != null && jSONObject2.length() > 0) {
                        if (jSONObject2.has("sdk_version")) {
                            jSONObject3.put("sdk_version", jSONObject2.getString("sdk_version"));
                        }
                        if (jSONObject2.has("device_id")) {
                            jSONObject3.put("device_id", jSONObject2.getString("device_id"));
                        }
                        if (jSONObject2.has("device_model")) {
                            jSONObject3.put("device_model", jSONObject2.getString("device_model"));
                        }
                        if (jSONObject2.has(str)) {
                            jSONObject3.put("version", jSONObject2.getInt(str));
                        }
                        if (jSONObject2.has("appkey")) {
                            jSONObject3.put("appkey", jSONObject2.getString("appkey"));
                        }
                        if (jSONObject2.has("channel")) {
                            jSONObject3.put("channel", jSONObject2.getString("channel"));
                        }
                    }
                    if (jSONObject3.length() > 0) {
                        MLog.m9787d("constructMessage:" + jSONObject3.toString());
                        UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "constructMessage: " + jSONObject3.toString());
                    }
                }
            } catch (Throwable th) {
                MLog.m9797e(th);
            }
        }
    }

    /* renamed from: a */
    public void mo38736a(Object obj, int i) {
        switch (i) {
            case 4097:
                if (UMGlobalContext.getInstance().isMainProcess(f8705a)) {
                    if (obj != null) {
                        m8808e(obj);
                    }
                    if (!"-1".equals(((JSONObject) obj).optString("__i"))) {
                        mo38738a(false);
                        return;
                    }
                    return;
                }
                UMProcessDBHelper.getInstance(f8705a).insertEventsInSubProcess(UMFrUtils.getSubProcessName(f8705a), new JSONArray().put(obj));
                return;
            case 4098:
                if (obj != null) {
                    try {
                        m8808e(obj);
                    } catch (Throwable unused) {
                        return;
                    }
                }
                if (!"-1".equals(((JSONObject) obj).optString("__i"))) {
                    mo38738a(false);
                    return;
                }
                return;
            case 4099:
                C3463r.m8900a(f8705a);
                return;
            case 4100:
                C3443j.m8790a(f8705a);
                return;
            case 4101:
                UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_SIGNIN");
                mo38737a((Object) null, true);
                m8812g(obj);
                return;
            case 4102:
                UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_SIGNOFF");
                mo38737a((Object) null, true);
                m8810f(obj);
                return;
            case 4103:
                UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> START_SESSION");
                C3460q.m8882a().mo38771a(f8705a, obj);
                synchronized (this.f8727w) {
                    this.f8726v = true;
                }
                return;
            case 4104:
                C3460q.m8882a().mo38779c(f8705a, obj);
                return;
            case 4105:
                mo38746d();
                return;
            case 4106:
                m8814h(obj);
                return;
            default:
                switch (i) {
                    case 4352:
                        UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> INSTANT_SESSION_START");
                        C3460q.m8882a().mo38775b(f8705a, obj);
                        synchronized (this.f8727w) {
                            this.f8725u = true;
                        }
                        return;
                    case 4353:
                        mo38737a(obj, true);
                        return;
                    case C3447a.f8740m /*{ENCODED_INT: 4354}*/:
                        mo38744c();
                        return;
                    default:
                        switch (i) {
                            case C3447a.f8743p /*{ENCODED_INT: 8195}*/:
                                C3407b.m8667a().mo38645a(obj);
                                return;
                            case 8196:
                                C3407b.m8667a().mo38676m();
                                return;
                            case 8197:
                                C3407b.m8667a().mo38674k();
                                return;
                            default:
                                switch (i) {
                                    case 8199:
                                    case 8200:
                                        C3407b.m8667a().mo38654b(obj);
                                        return;
                                    case 8201:
                                        C3407b.m8667a().mo38654b((Object) null);
                                        return;
                                    default:
                                        return;
                                }
                        }
                }
        }
    }

    /* renamed from: b */
    private JSONObject m8802b(JSONObject jSONObject, long j) {
        try {
            if (C3452m.m8856a(jSONObject) <= j) {
                return jSONObject;
            }
            C3437g.m8754a(f8705a).mo38705a(true, false);
            C3437g.m8754a(f8705a).mo38709b();
            UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> Instant session packet overload !!! ");
            return null;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: b */
    private void m8803b(JSONObject jSONObject) {
        if (!C3437g.m8754a(f8705a).mo38716e()) {
            JSONObject g = C3437g.m8754a(f8705a).mo38718g();
            if (g != null) {
                String optString = g.optString("__av");
                String optString2 = g.optString("__vc");
                try {
                    if (TextUtils.isEmpty(optString)) {
                        jSONObject.put("app_version", UMUtils.getAppVersionName(f8705a));
                    } else {
                        jSONObject.put("app_version", optString);
                    }
                    if (TextUtils.isEmpty(optString2)) {
                        jSONObject.put("version_code", UMUtils.getAppVersionCode(f8705a));
                    } else {
                        jSONObject.put("version_code", optString2);
                    }
                } catch (Throwable unused) {
                }
            }
        } else {
            jSONObject.put("app_version", UMUtils.getAppVersionName(f8705a));
            jSONObject.put("version_code", UMUtils.getAppVersionCode(f8705a));
        }
    }

    /* renamed from: d */
    public void mo38747d(Object obj) {
        m8823q();
        m8818l();
        m8819m();
        mo38738a(true);
    }

    /* renamed from: d */
    private boolean m8807d(boolean z) {
        if (this.f8714b == null) {
            this.f8714b = new C3449c();
        }
        ReportPolicy.ReportStrategy c = this.f8714b.mo38754c();
        if (!(c instanceof ReportPolicy.DefconPolicy)) {
            return true;
        }
        if (z) {
            return ((ReportPolicy.DefconPolicy) c).shouldSendMessageByInstant();
        }
        return c.shouldSendMessage(false);
    }

    /* renamed from: e */
    public void mo38748e() {
        if (m8807d(false)) {
            m8815i();
        }
    }

    /* renamed from: b */
    public JSONObject mo38740b(boolean z) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject = null;
        try {
            jSONObject = C3437g.m8754a(f8705a).mo38701a(z);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            } else {
                try {
                    if (jSONObject.has(C3416b.f8487n)) {
                        JSONArray jSONArray3 = jSONObject.getJSONArray(C3416b.f8487n);
                        JSONArray jSONArray4 = new JSONArray();
                        int i = 0;
                        while (i < jSONArray3.length()) {
                            JSONObject jSONObject2 = (JSONObject) jSONArray3.get(i);
                            JSONArray optJSONArray = jSONObject2.optJSONArray("pages");
                            JSONArray optJSONArray2 = jSONObject2.optJSONArray(C3416b.f8493t);
                            if (optJSONArray == null && optJSONArray2 != null) {
                                jSONObject2.put("pages", optJSONArray2);
                                jSONObject2.remove(C3416b.f8493t);
                            }
                            if (!(optJSONArray == null || optJSONArray2 == null)) {
                                ArrayList<JSONObject> arrayList = new ArrayList();
                                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                    arrayList.add((JSONObject) optJSONArray.get(i2));
                                }
                                for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                                    arrayList.add((JSONObject) optJSONArray2.get(i3));
                                }
                                JSONArraySortUtil jSONArraySortUtil = new JSONArraySortUtil();
                                jSONArraySortUtil.setCompareKey(C3416b.f8496w);
                                Collections.sort(arrayList, jSONArraySortUtil);
                                JSONArray jSONArray5 = new JSONArray();
                                for (JSONObject jSONObject3 : arrayList) {
                                    jSONArray5.put(jSONObject3);
                                }
                                jSONObject2.put("pages", jSONArray5);
                                jSONObject2.remove(C3416b.f8493t);
                            }
                            if (jSONObject2.has("pages")) {
                                JSONArray optJSONArray3 = jSONObject2.optJSONArray("pages");
                                int i4 = 0;
                                while (i4 < optJSONArray3.length()) {
                                    JSONObject jSONObject4 = optJSONArray3.getJSONObject(i4);
                                    if (jSONObject4.has(C3416b.f8496w)) {
                                        jSONArray2 = jSONArray3;
                                        jSONObject4.put("ts", jSONObject4.getLong(C3416b.f8496w));
                                        jSONObject4.remove(C3416b.f8496w);
                                    } else {
                                        jSONArray2 = jSONArray3;
                                    }
                                    i4++;
                                    jSONArray3 = jSONArray2;
                                }
                                jSONArray = jSONArray3;
                                jSONObject2.put("pages", optJSONArray3);
                                jSONObject2.put(C3416b.f8498y, optJSONArray3.length());
                            } else {
                                jSONArray = jSONArray3;
                                jSONObject2.put(C3416b.f8498y, 0);
                            }
                            jSONArray4.put(jSONObject2);
                            i++;
                            jSONArray3 = jSONArray;
                        }
                        jSONObject.put(C3416b.f8487n, jSONArray4);
                    }
                } catch (Exception e) {
                    MLog.m9793e("merge pages error");
                    e.printStackTrace();
                }
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8705a);
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("userlevel", "");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put("userlevel", string);
                }
            }
            String[] a = C3410c.m8724a(f8705a);
            if (a != null && !TextUtils.isEmpty(a[0]) && !TextUtils.isEmpty(a[1])) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(C3416b.f8428L, a[0]);
                jSONObject5.put(C3416b.f8429M, a[1]);
                if (jSONObject5.length() > 0) {
                    jSONObject.put(C3416b.f8427K, jSONObject5);
                }
            }
            if (ABTest.getService(f8705a).isInTest()) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put(ABTest.getService(f8705a).getTestName(), ABTest.getService(f8705a).getGroupInfo());
                jSONObject.put(C3416b.f8426J, jSONObject6);
            }
            C3453n.m8858a().mo38762a(jSONObject, f8705a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo38738a(boolean z) {
        if (!m8805c(z)) {
            return;
        }
        if (this.f8714b.mo38754c() instanceof ReportPolicy.ReportQuasiRealtime) {
            if (z) {
                if (UMEnvelopeBuild.isOnline(f8705a)) {
                    UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> send session start in policy ReportQuasiRealtime.");
                    m8815i();
                }
            } else if (UMEnvelopeBuild.isReadyBuild(f8705a, UMLogDataProtocol.UMBusinessType.U_APP)) {
                UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> send normal data in policy ReportQuasiRealtime.");
                m8815i();
            }
        } else if (UMEnvelopeBuild.isReadyBuild(f8705a, UMLogDataProtocol.UMBusinessType.U_APP)) {
            m8815i();
        }
    }

    /* renamed from: c */
    public void mo38745c(Object obj) {
        mo38742b(f8705a);
        mo38746d();
        if (m8807d(false)) {
            m8815i();
        }
    }

    /* renamed from: a */
    public JSONObject mo38733a(long j) {
        if (TextUtils.isEmpty(C3466u.m8916a().mo38796d(f8705a))) {
            return null;
        }
        JSONObject b = mo38740b(false);
        int a = C3453n.m8858a().mo38761a(f8705a);
        if (b.length() <= 0) {
            if (a != 3) {
                return null;
            }
        } else if (b.length() == 1) {
            if (b.optJSONObject(C3416b.f8427K) != null && a != 3) {
                return null;
            }
            if (!TextUtils.isEmpty(b.optString("userlevel")) && a != 3) {
                return null;
            }
        } else if (b.length() == 2 && b.optJSONObject(C3416b.f8427K) != null && !TextUtils.isEmpty(b.optString("userlevel")) && a != 3) {
            return null;
        }
        JSONObject k = m8817k();
        if (k != null) {
            m8803b(k);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (a == 3) {
                jSONObject2.put("analytics", new JSONObject());
            } else if (b != null && b.length() > 0) {
                jSONObject2.put("analytics", b);
            }
            if (k != null && k.length() > 0) {
                jSONObject.put("header", k);
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("content", jSONObject2);
            }
            return m8799a(jSONObject, j);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: a */
    private void m8800a(JSONObject jSONObject) {
        JSONObject f;
        if (!C3437g.m8754a(UMGlobalContext.getAppContext(f8705a)).mo38713c() && (f = C3437g.m8754a(UMGlobalContext.getAppContext(f8705a)).mo38717f()) != null) {
            String optString = f.optString("__av");
            String optString2 = f.optString("__vc");
            try {
                if (TextUtils.isEmpty(optString)) {
                    jSONObject.put("app_version", UMUtils.getAppVersionName(f8705a));
                } else {
                    jSONObject.put("app_version", optString);
                }
                if (TextUtils.isEmpty(optString2)) {
                    jSONObject.put("version_code", UMUtils.getAppVersionCode(f8705a));
                } else {
                    jSONObject.put("version_code", optString2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo38743b(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() <= 0) {
                    return;
                }
                if (!jSONObject.has("exception")) {
                    m8806d(jSONObject);
                } else if (101 != jSONObject.getInt("exception")) {
                    m8806d(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private JSONObject m8799a(JSONObject jSONObject, long j) {
        try {
            if (C3452m.m8856a(jSONObject) <= j) {
                return jSONObject;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("header");
            jSONObject2.put(C3416b.f8473ay, C3452m.m8856a(jSONObject));
            jSONObject.put("header", jSONObject2);
            return C3452m.m8857a(f8705a, j, jSONObject);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: b */
    public void mo38742b(Context context) {
        try {
            C3437g.m8754a(context).mo38715d();
            m8822p();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private boolean m8801a(long j, int i) {
        if (j == 0) {
            return true;
        }
        if (System.currentTimeMillis() - j > Defcon.MILLIS_8_HOURS) {
            m8820n();
            return true;
        } else if (i < 5000) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public void mo38735a(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() <= 0) {
                    return;
                }
                if (!jSONObject.has("exception")) {
                    m8809e(jSONObject);
                } else if (101 != jSONObject.getInt("exception")) {
                    m8809e(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo38737a(Object obj, boolean z) {
        if (z) {
            if (m8807d(true)) {
                m8813h();
            }
        } else if (UMEnvelopeBuild.isOnline(f8705a) && m8807d(true)) {
            m8813h();
        }
    }
}
