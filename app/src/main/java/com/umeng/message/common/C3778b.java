package com.umeng.message.common;

import android.content.Context;
import android.os.Build;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.message.MsgConstant;
import com.umeng.message.PushAgent;
import com.umeng.message.proguard.C3814c;
import com.umeng.message.proguard.C3847k;
import org.json.JSONObject;

/* renamed from: com.umeng.message.common.b */
public class C3778b {

    /* renamed from: a */
    public static final String f10051a = "umid";

    /* renamed from: ak */
    public static final String f10052ak = "Android";

    /* renamed from: b */
    public static final String f10053b = "Android";

    /* renamed from: c */
    public static final String f10054c = "com.umeng.message.common.b";

    /* renamed from: A */
    public int f10055A;

    /* renamed from: B */
    public String f10056B;

    /* renamed from: C */
    public String f10057C;

    /* renamed from: D */
    public String f10058D;

    /* renamed from: E */
    public String f10059E;

    /* renamed from: F */
    public String f10060F;

    /* renamed from: G */
    public String f10061G;

    /* renamed from: H */
    public String f10062H;

    /* renamed from: I */
    public final String f10063I = "appkey";

    /* renamed from: J */
    public final String f10064J = "channel";

    /* renamed from: K */
    public final String f10065K = "device_id";

    /* renamed from: L */
    public final String f10066L = "idmd5";

    /* renamed from: M */
    public final String f10067M = C3617o.f9397z;

    /* renamed from: N */
    public final String f10068N = "din";

    /* renamed from: O */
    public final String f10069O = "push_switch";

    /* renamed from: P */
    public final String f10070P = C3617o.f9333T;

    /* renamed from: Q */
    public final String f10071Q = "android_id";

    /* renamed from: R */
    public final String f10072R = "serial_number";

    /* renamed from: S */
    public final String f10073S = "device_model";

    /* renamed from: T */
    public final String f10074T = "os";

    /* renamed from: U */
    public final String f10075U = "os_version";

    /* renamed from: V */
    public final String f10076V = C3617o.f9396y;

    /* renamed from: W */
    public final String f10077W = C3617o.f9393v;

    /* renamed from: X */
    public final String f10078X = "gpu_vender";

    /* renamed from: Y */
    public final String f10079Y = "gpu_renderer";

    /* renamed from: Z */
    public final String f10080Z = "app_version";

    /* renamed from: aa */
    public final String f10081aa = "version_code";

    /* renamed from: ab */
    public final String f10082ab = "package_name";

    /* renamed from: ac */
    public final String f10083ac = C3617o.f9391t;

    /* renamed from: ad */
    public final String f10084ad = "sdk_version";

    /* renamed from: ae */
    public final String f10085ae = C3617o.f9325L;

    /* renamed from: af */
    public final String f10086af = "country";

    /* renamed from: ag */
    public final String f10087ag = "language";

    /* renamed from: ah */
    public final String f10088ah = C3617o.f9329P;

    /* renamed from: ai */
    public final String f10089ai = C3617o.f9330Q;

    /* renamed from: aj */
    public final String f10090aj = "carrier";

    /* renamed from: al */
    public final String f10091al = "wrapper_type";

    /* renamed from: am */
    public final String f10092am = "wrapper_version";

    /* renamed from: d */
    public String f10093d;

    /* renamed from: e */
    public String f10094e;

    /* renamed from: f */
    public String f10095f;

    /* renamed from: g */
    public String f10096g;

    /* renamed from: h */
    public String f10097h;

    /* renamed from: i */
    public String f10098i;

    /* renamed from: j */
    public String f10099j;

    /* renamed from: k */
    public String f10100k;

    /* renamed from: l */
    public long f10101l;

    /* renamed from: m */
    public String f10102m;

    /* renamed from: n */
    public String f10103n;

    /* renamed from: o */
    public String f10104o;

    /* renamed from: p */
    public String f10105p;

    /* renamed from: q */
    public String f10106q;

    /* renamed from: r */
    public String f10107r;

    /* renamed from: s */
    public String f10108s;

    /* renamed from: t */
    public String f10109t;

    /* renamed from: u */
    public String f10110u;

    /* renamed from: v */
    public String f10111v;

    /* renamed from: w */
    public String f10112w;

    /* renamed from: x */
    public String f10113x;

    /* renamed from: y */
    public String f10114y;

    /* renamed from: z */
    public String f10115z;

    public C3778b() {
    }

    /* renamed from: d */
    private void m10305d(JSONObject jSONObject) throws Exception {
        this.f10093d = jSONObject.getString("appkey");
        this.f10095f = jSONObject.getString("device_id");
        this.f10096g = jSONObject.getString("idmd5");
        if (jSONObject.has(C3617o.f9397z)) {
            this.f10097h = jSONObject.getString(C3617o.f9397z);
        }
        if (jSONObject.has("channel")) {
            this.f10094e = jSONObject.getString("channel");
        }
        if (jSONObject.has(C3617o.f9333T)) {
            this.f10101l = jSONObject.getLong(C3617o.f9333T);
        }
    }

    /* renamed from: e */
    private void m10307e(JSONObject jSONObject) throws Exception {
        String str = null;
        this.f10104o = jSONObject.has("device_model") ? jSONObject.getString("device_model") : null;
        this.f10105p = jSONObject.has("os") ? jSONObject.getString("os") : null;
        this.f10106q = jSONObject.has("os_version") ? jSONObject.getString("os_version") : null;
        this.f10107r = jSONObject.has(C3617o.f9396y) ? jSONObject.getString(C3617o.f9396y) : null;
        this.f10108s = jSONObject.has(C3617o.f9393v) ? jSONObject.getString(C3617o.f9393v) : null;
        this.f10109t = jSONObject.has("gpu_vender") ? jSONObject.getString("gpu_vender") : null;
        this.f10110u = jSONObject.has("gpu_renderer") ? jSONObject.getString("gpu_renderer") : null;
        this.f10102m = jSONObject.has("android_id") ? jSONObject.getString("android_id") : null;
        if (jSONObject.has("serial_number")) {
            str = jSONObject.getString("serial_number");
        }
        this.f10103n = str;
    }

    /* renamed from: f */
    private void m10308f(JSONObject jSONObject) throws Exception {
        String str = null;
        this.f10111v = jSONObject.has("app_version") ? jSONObject.getString("app_version") : null;
        this.f10112w = jSONObject.has("version_code") ? jSONObject.getString("version_code") : null;
        if (jSONObject.has("package_name")) {
            str = jSONObject.getString("package_name");
        }
        this.f10113x = str;
    }

    /* renamed from: g */
    private void m10309g(JSONObject jSONObject) throws Exception {
        this.f10114y = jSONObject.getString(C3617o.f9391t);
        this.f10115z = jSONObject.getString("sdk_version");
    }

    /* renamed from: h */
    private void m10310h(JSONObject jSONObject) throws Exception {
        this.f10055A = jSONObject.has(C3617o.f9325L) ? jSONObject.getInt(C3617o.f9325L) : 8;
        String str = null;
        this.f10056B = jSONObject.has("country") ? jSONObject.getString("country") : null;
        if (jSONObject.has("language")) {
            str = jSONObject.getString("language");
        }
        this.f10057C = str;
    }

    /* renamed from: i */
    private void m10311i(JSONObject jSONObject) throws Exception {
        String str = null;
        this.f10058D = jSONObject.has(C3617o.f9329P) ? jSONObject.getString(C3617o.f9329P) : null;
        this.f10059E = jSONObject.has(C3617o.f9330Q) ? jSONObject.getString(C3617o.f9330Q) : null;
        if (jSONObject.has("carrier")) {
            str = jSONObject.getString("carrier");
        }
        this.f10060F = str;
    }

    /* renamed from: j */
    private void m10312j(JSONObject jSONObject) throws Exception {
        String str = null;
        this.f10061G = jSONObject.has("wrapper_type") ? jSONObject.getString("wrapper_type") : null;
        if (jSONObject.has("wrapper_version")) {
            str = jSONObject.getString("wrapper_version");
        }
        this.f10062H = str;
    }

    /* renamed from: k */
    private void m10313k(JSONObject jSONObject) throws Exception {
        jSONObject.put("appkey", this.f10093d);
        String str = this.f10093d;
        if (str == null || 24 != str.length()) {
            this.f10095f = C3814c.m10491a(this.f10095f, "utf-8");
            this.f10099j = C3814c.m10491a(this.f10099j, "utf-8");
        } else {
            this.f10095f = C3814c.m10491a(this.f10095f, "utf-8", this.f10093d.substring(0, 16));
            this.f10099j = C3814c.m10491a(this.f10099j, "utf-8", this.f10093d.substring(0, 16));
        }
        jSONObject.put("device_id", this.f10095f);
        jSONObject.put("idmd5", this.f10096g);
        String str2 = this.f10094e;
        if (str2 != null) {
            jSONObject.put("channel", str2);
        }
        String str3 = this.f10097h;
        if (str3 != null) {
            jSONObject.put(C3617o.f9397z, str3);
        }
        long j = this.f10101l;
        if (j > 0) {
            jSONObject.put(C3617o.f9333T, j);
        }
        String str4 = this.f10102m;
        if (str4 != null) {
            jSONObject.put("android_id", str4);
        }
        String str5 = this.f10103n;
        if (str5 != null) {
            jSONObject.put("serial_number", str5);
        }
        jSONObject.put("umid", this.f10098i);
        jSONObject.put("din", this.f10099j);
        jSONObject.put("push_switch", this.f10100k);
    }

    /* renamed from: l */
    private void m10314l(JSONObject jSONObject) throws Exception {
        jSONObject.put("appkey", this.f10093d);
        String str = this.f10093d;
        if (str == null || 24 != str.length()) {
            this.f10099j = C3814c.m10491a(this.f10099j, "utf-8");
        } else {
            this.f10099j = C3814c.m10491a(this.f10099j, "utf-8", this.f10093d.substring(0, 16));
        }
        String str2 = this.f10094e;
        if (str2 != null) {
            jSONObject.put("channel", str2);
        }
        jSONObject.put("umid", this.f10098i);
        jSONObject.put("din", this.f10099j);
        jSONObject.put("push_switch", this.f10100k);
    }

    /* renamed from: m */
    private void m10315m(JSONObject jSONObject) throws Exception {
        String str = this.f10104o;
        if (str != null) {
            jSONObject.put("device_model", str);
        }
        String str2 = this.f10105p;
        if (str2 != null) {
            jSONObject.put("os", str2);
        }
        String str3 = this.f10106q;
        if (str3 != null) {
            jSONObject.put("os_version", str3);
        }
        String str4 = this.f10107r;
        if (str4 != null) {
            jSONObject.put(C3617o.f9396y, str4);
        }
        String str5 = this.f10108s;
        if (str5 != null) {
            jSONObject.put(C3617o.f9393v, str5);
        }
        String str6 = this.f10109t;
        if (str6 != null) {
            jSONObject.put("gpu_vender", str6);
        }
        String str7 = this.f10110u;
        if (str7 != null) {
            jSONObject.put("gpu_vender", str7);
        }
    }

    /* renamed from: n */
    private void m10316n(JSONObject jSONObject) throws Exception {
        String str = this.f10104o;
        if (str != null) {
            jSONObject.put("device_model", str);
        }
        String str2 = this.f10105p;
        if (str2 != null) {
            jSONObject.put("os", str2);
        }
        String str3 = this.f10106q;
        if (str3 != null) {
            jSONObject.put("os_version", str3);
        }
    }

    /* renamed from: o */
    private void m10317o(JSONObject jSONObject) throws Exception {
        String str = this.f10111v;
        if (str != null) {
            jSONObject.put("app_version", str);
        }
        String str2 = this.f10112w;
        if (str2 != null) {
            jSONObject.put("version_code", str2);
        }
        String str3 = this.f10113x;
        if (str3 != null) {
            jSONObject.put("package_name", str3);
        }
    }

    /* renamed from: p */
    private void m10318p(JSONObject jSONObject) throws Exception {
        String str = this.f10111v;
        if (str != null) {
            jSONObject.put("app_version", str);
        }
        String str2 = this.f10112w;
        if (str2 != null) {
            jSONObject.put("version_code", str2);
        }
    }

    /* renamed from: q */
    private void m10319q(JSONObject jSONObject) throws Exception {
        jSONObject.put(C3617o.f9391t, this.f10114y);
        jSONObject.put("sdk_version", this.f10115z);
    }

    /* renamed from: r */
    private void m10320r(JSONObject jSONObject) throws Exception {
        jSONObject.put(C3617o.f9325L, this.f10055A);
        String str = this.f10056B;
        if (str != null) {
            jSONObject.put("country", str);
        }
        String str2 = this.f10057C;
        if (str2 != null) {
            jSONObject.put("language", str2);
        }
    }

    /* renamed from: s */
    private void m10321s(JSONObject jSONObject) throws Exception {
        String str = this.f10058D;
        if (str != null) {
            jSONObject.put(C3617o.f9329P, str);
        }
        String str2 = this.f10059E;
        if (str2 != null) {
            jSONObject.put(C3617o.f9330Q, str2);
        }
        String str3 = this.f10060F;
        if (str3 != null) {
            jSONObject.put("carrier", str3);
        }
    }

    /* renamed from: t */
    private void m10322t(JSONObject jSONObject) throws Exception {
        String str = this.f10061G;
        if (str != null) {
            jSONObject.put("wrapper_type", str);
        }
        String str2 = this.f10062H;
        if (str2 != null) {
            jSONObject.put("wrapper_version", str2);
        }
    }

    /* renamed from: a */
    public void mo39722a(JSONObject jSONObject) throws Exception {
        if (jSONObject != null) {
            m10305d(jSONObject);
            m10307e(jSONObject);
            m10308f(jSONObject);
            m10309g(jSONObject);
            m10310h(jSONObject);
            m10311i(jSONObject);
            m10312j(jSONObject);
        }
    }

    /* renamed from: b */
    public void mo39725b(JSONObject jSONObject) throws Exception {
        m10313k(jSONObject);
        m10315m(jSONObject);
        m10317o(jSONObject);
        m10319q(jSONObject);
        m10320r(jSONObject);
        m10321s(jSONObject);
        m10322t(jSONObject);
    }

    /* renamed from: c */
    public void mo39728c(JSONObject jSONObject) throws Exception {
        m10314l(jSONObject);
        m10316n(jSONObject);
        m10318p(jSONObject);
        m10319q(jSONObject);
        m10321s(jSONObject);
    }

    /* renamed from: c */
    private void m10303c(Context context) {
        this.f10114y = "Android";
        this.f10115z = MsgConstant.SDK_VERSION;
    }

    /* renamed from: b */
    private void m10302b(Context context) {
        this.f10111v = UmengMessageDeviceConfig.getAppVersionName(context);
        this.f10112w = UmengMessageDeviceConfig.getAppVersionCode(context);
        this.f10113x = UmengMessageDeviceConfig.getPackageName(context);
    }

    /* renamed from: a */
    public boolean mo39723a() {
        if (this.f10093d == null) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10054c, 0, "missing appkey");
            return false;
        } else if (this.f10095f != null && this.f10096g != null) {
            return true;
        } else {
            UMLog uMLog2 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10054c, 0, "missing device id");
            return false;
        }
    }

    /* renamed from: c */
    public void mo39727c(Context context, String... strArr) {
        mo39721a(context, strArr);
        m10301a(context);
        m10302b(context);
        m10303c(context);
        m10306e(context);
    }

    /* renamed from: d */
    private void m10304d(Context context) {
        this.f10055A = UmengMessageDeviceConfig.getTimeZone(context);
        String[] localeInfo = UmengMessageDeviceConfig.getLocaleInfo(context);
        this.f10056B = localeInfo[0];
        this.f10057C = localeInfo[1];
    }

    /* renamed from: e */
    private void m10306e(Context context) {
        String[] networkAccessMode = UmengMessageDeviceConfig.getNetworkAccessMode(context);
        this.f10058D = networkAccessMode[0];
        this.f10059E = networkAccessMode[1];
        this.f10060F = UmengMessageDeviceConfig.getOperator(context);
    }

    /* renamed from: b */
    public void mo39724b(Context context, String... strArr) {
        mo39721a(context, strArr);
        m10301a(context);
        m10302b(context);
        m10303c(context);
        m10304d(context);
        m10306e(context);
    }

    /* renamed from: a */
    public void mo39721a(Context context, String... strArr) {
        if (strArr != null && strArr.length == 2) {
            this.f10093d = strArr[0];
            this.f10094e = strArr[1];
        }
        if (this.f10093d == null) {
            this.f10093d = PushAgent.getInstance(context).getMessageAppkey();
        }
        if (this.f10094e == null) {
            this.f10094e = PushAgent.getInstance(context).getMessageChannel();
        }
        this.f10095f = UmengMessageDeviceConfig.getDeviceId(context);
        this.f10096g = UmengMessageDeviceConfig.getDeviceIdMD5(context);
        this.f10097h = UmengMessageDeviceConfig.getDummyId(context);
        this.f10099j = UmengMessageDeviceConfig.getDIN(context);
        this.f10098i = UmengMessageDeviceConfig.getUmid(context);
        String isNotificationEnabled = UmengMessageDeviceConfig.isNotificationEnabled(context);
        this.f10100k = isNotificationEnabled;
        if ("false".equals(isNotificationEnabled)) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.m9005aq(C3847k.f10378c, 0, "\\|");
        }
    }

    /* renamed from: b */
    public boolean mo39726b() {
        return (this.f10093d == null || this.f10095f == null) ? false : true;
    }

    /* renamed from: a */
    private void m10301a(Context context) {
        this.f10104o = Build.MODEL;
        this.f10105p = "Android";
        this.f10106q = Build.VERSION.RELEASE;
        this.f10107r = UmengMessageDeviceConfig.getResolution(context);
        this.f10108s = UmengMessageDeviceConfig.getCPU();
        this.f10102m = UmengMessageDeviceConfig.getAndroidId(context);
        this.f10103n = UmengMessageDeviceConfig.getSerial_number();
    }

    public C3778b(String str, String str2) {
        this.f10093d = str;
        this.f10094e = str2;
    }
}
