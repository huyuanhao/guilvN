package com.tencent.bugly.crashreport.common.info;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Process;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.tencent.bugly.C3216b;
import com.tencent.bugly.crashreport.AbstractC3257a;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3325ap;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.tencent.bugly.crashreport.common.info.a */
public class C3269a {

    /* renamed from: an */
    public static C3269a f7619an;

    /* renamed from: A */
    public boolean f7620A = false;

    /* renamed from: B */
    public String f7621B = null;

    /* renamed from: C */
    public String f7622C = null;

    /* renamed from: D */
    public String f7623D = null;

    /* renamed from: E */
    public boolean f7624E = false;

    /* renamed from: F */
    public boolean f7625F = false;

    /* renamed from: G */
    public Boolean f7626G = null;

    /* renamed from: H */
    public Boolean f7627H = null;

    /* renamed from: I */
    public HashMap<String, String> f7628I = new HashMap<>();

    /* renamed from: J */
    public boolean f7629J = true;

    /* renamed from: K */
    public List<String> f7630K = new ArrayList();

    /* renamed from: L */
    public boolean f7631L = false;

    /* renamed from: M */
    public AbstractC3257a f7632M = null;

    /* renamed from: N */
    public SharedPreferences f7633N;

    /* renamed from: O */
    public final Context f7634O;

    /* renamed from: P */
    public String f7635P;

    /* renamed from: Q */
    public String f7636Q;

    /* renamed from: R */
    public String f7637R = "unknown";

    /* renamed from: S */
    public String f7638S = "unknown";

    /* renamed from: T */
    public String f7639T = "";

    /* renamed from: U */
    public String f7640U = null;

    /* renamed from: V */
    public String f7641V = null;

    /* renamed from: W */
    public String f7642W = null;

    /* renamed from: X */
    public String f7643X = null;

    /* renamed from: Y */
    public long f7644Y = -1;

    /* renamed from: Z */
    public long f7645Z = -1;

    /* renamed from: a */
    public final long f7646a = System.currentTimeMillis();

    /* renamed from: aA */
    public final Object f7647aA = new Object();

    /* renamed from: aB */
    public final Object f7648aB = new Object();

    /* renamed from: aC */
    public final Object f7649aC = new Object();

    /* renamed from: aD */
    public final Object f7650aD = new Object();

    /* renamed from: aE */
    public final Object f7651aE = new Object();

    /* renamed from: aF */
    public final Object f7652aF = new Object();

    /* renamed from: aa */
    public long f7653aa = -1;

    /* renamed from: ab */
    public String f7654ab = null;

    /* renamed from: ac */
    public String f7655ac = null;

    /* renamed from: ad */
    public Map<String, PlugInBean> f7656ad = null;

    /* renamed from: ae */
    public boolean f7657ae = true;

    /* renamed from: af */
    public String f7658af = null;

    /* renamed from: ag */
    public String f7659ag = null;

    /* renamed from: ah */
    public Boolean f7660ah = null;

    /* renamed from: ai */
    public String f7661ai = null;

    /* renamed from: aj */
    public String f7662aj = null;

    /* renamed from: ak */
    public String f7663ak = null;

    /* renamed from: al */
    public Map<String, PlugInBean> f7664al = null;

    /* renamed from: am */
    public Map<String, PlugInBean> f7665am = null;

    /* renamed from: ao */
    public int f7666ao = -1;

    /* renamed from: ap */
    public int f7667ap = -1;

    /* renamed from: aq */
    public Map<String, String> f7668aq = new HashMap();

    /* renamed from: ar */
    public Map<String, String> f7669ar = new HashMap();

    /* renamed from: as */
    public Map<String, String> f7670as = new HashMap();

    /* renamed from: at */
    public boolean f7671at;

    /* renamed from: au */
    public String f7672au = null;

    /* renamed from: av */
    public String f7673av = null;

    /* renamed from: aw */
    public String f7674aw = null;

    /* renamed from: ax */
    public String f7675ax = null;

    /* renamed from: ay */
    public String f7676ay = null;

    /* renamed from: az */
    public final Object f7677az = new Object();

    /* renamed from: b */
    public final String f7678b;

    /* renamed from: c */
    public final byte f7679c;

    /* renamed from: d */
    public String f7680d;

    /* renamed from: e */
    public final String f7681e;

    /* renamed from: f */
    public String f7682f;

    /* renamed from: g */
    public String f7683g;

    /* renamed from: h */
    public boolean f7684h = true;

    /* renamed from: i */
    public final String f7685i = "com.tencent.bugly";

    /* renamed from: j */
    public final String f7686j = "2.6.5";

    /* renamed from: k */
    public final String f7687k = "";

    /* renamed from: l */
    public final String f7688l;

    /* renamed from: m */
    public final String f7689m;

    /* renamed from: n */
    public final String f7690n;

    /* renamed from: o */
    public long f7691o = 0;

    /* renamed from: p */
    public String f7692p = null;

    /* renamed from: q */
    public String f7693q = null;

    /* renamed from: r */
    public String f7694r = null;

    /* renamed from: s */
    public String f7695s = null;

    /* renamed from: t */
    public String f7696t = null;

    /* renamed from: u */
    public List<String> f7697u = null;

    /* renamed from: v */
    public String f7698v = "unknown";

    /* renamed from: w */
    public long f7699w = 0;

    /* renamed from: x */
    public long f7700x = 0;

    /* renamed from: y */
    public long f7701y = 0;

    /* renamed from: z */
    public long f7702z = 0;

    public C3269a(Context context) {
        this.f7634O = C3325ap.m8380a(context);
        this.f7679c = 1;
        m7967b(context);
        this.f7680d = AppInfo.m7950a(context);
        this.f7681e = AppInfo.m7951a(context, Process.myPid());
        this.f7688l = C3270b.m8054m();
        this.f7689m = C3270b.m8028a();
        this.f7693q = AppInfo.m7956c(context);
        this.f7690n = "Android " + C3270b.m8031b() + ",level " + C3270b.m8033c();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7689m);
        sb.append(C7522o0Ooo0o.OooO0O0);
        sb.append(this.f7690n);
        this.f7678b = sb.toString();
        m7968c(context);
        try {
            if (!context.getDatabasePath("bugly_db_").exists()) {
                this.f7625F = true;
                C3321an.m8355c("App is first time to be installed on the device.", new Object[0]);
            }
        } catch (Throwable th) {
            if (C3216b.f7324c) {
                th.printStackTrace();
            }
        }
        this.f7633N = C3325ap.m8381a("BUGLY_COMMON_VALUES", context);
        C3321an.m8355c("com info create end", new Object[0]);
    }

    /* renamed from: b */
    private void m7967b(Context context) {
        PackageInfo b = AppInfo.m7955b(context);
        if (b != null) {
            try {
                String str = b.versionName;
                this.f7692p = str;
                this.f7621B = str;
                this.f7622C = Integer.toString(b.versionCode);
            } catch (Throwable th) {
                if (!C3321an.m8350a(th)) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: c */
    private void m7968c(Context context) {
        Map<String, String> d = AppInfo.m7957d(context);
        if (d != null) {
            try {
                this.f7697u = AppInfo.m7953a(d);
                String str = d.get("BUGLY_APPID");
                if (str != null) {
                    this.f7659ag = str;
                    mo38156c("APP_ID", str);
                }
                String str2 = d.get("BUGLY_APP_VERSION");
                if (str2 != null) {
                    this.f7692p = str2;
                }
                String str3 = d.get("BUGLY_APP_CHANNEL");
                if (str3 != null) {
                    this.f7694r = str3;
                }
                String str4 = d.get("BUGLY_ENABLE_DEBUG");
                if (str4 != null) {
                    this.f7620A = str4.equalsIgnoreCase("true");
                }
                String str5 = d.get("com.tencent.rdm.uuid");
                if (str5 != null) {
                    this.f7623D = str5;
                }
            } catch (Throwable th) {
                if (!C3321an.m8350a(th)) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: A */
    public String mo38125A() {
        if (this.f7663ak == null) {
            String str = "" + C3270b.m8035d();
            this.f7663ak = str;
            C3321an.m8349a("Hardware serial number: %s", str);
        }
        return this.f7663ak;
    }

    /* renamed from: B */
    public Map<String, String> mo38126B() {
        synchronized (this.f7648aB) {
            if (this.f7668aq.size() <= 0) {
                return null;
            }
            return new HashMap(this.f7668aq);
        }
    }

    /* renamed from: C */
    public void mo38127C() {
        synchronized (this.f7648aB) {
            this.f7668aq.clear();
        }
    }

    /* renamed from: D */
    public int mo38128D() {
        int size;
        synchronized (this.f7648aB) {
            size = this.f7668aq.size();
        }
        return size;
    }

    /* renamed from: E */
    public Set<String> mo38129E() {
        Set<String> keySet;
        synchronized (this.f7648aB) {
            keySet = this.f7668aq.keySet();
        }
        return keySet;
    }

    /* renamed from: F */
    public Map<String, String> mo38130F() {
        synchronized (this.f7652aF) {
            if (this.f7669ar.size() <= 0) {
                return null;
            }
            return new HashMap(this.f7669ar);
        }
    }

    /* renamed from: G */
    public Map<String, String> mo38131G() {
        synchronized (this.f7649aC) {
            if (this.f7670as.size() <= 0) {
                return null;
            }
            return new HashMap(this.f7670as);
        }
    }

    /* renamed from: H */
    public int mo38132H() {
        int i;
        synchronized (this.f7650aD) {
            i = this.f7666ao;
        }
        return i;
    }

    /* renamed from: I */
    public int mo38133I() {
        return this.f7667ap;
    }

    /* renamed from: J */
    public synchronized Map<String, PlugInBean> mo38134J() {
        Map<String, PlugInBean> map;
        map = this.f7664al;
        if (this.f7665am != null) {
            map.putAll(this.f7665am);
        }
        return map;
    }

    /* renamed from: K */
    public int mo38135K() {
        return C3270b.m8033c();
    }

    /* renamed from: L */
    public String mo38136L() {
        if (this.f7672au == null) {
            this.f7672au = C3270b.m8057o();
        }
        return this.f7672au;
    }

    /* renamed from: M */
    public String mo38137M() {
        if (this.f7673av == null) {
            this.f7673av = C3270b.m8046i(this.f7634O);
        }
        return this.f7673av;
    }

    /* renamed from: N */
    public String mo38138N() {
        if (this.f7674aw == null) {
            this.f7674aw = C3270b.m8048j(this.f7634O);
        }
        return this.f7674aw;
    }

    /* renamed from: O */
    public String mo38139O() {
        return C3270b.m8050k(this.f7634O);
    }

    /* renamed from: P */
    public String mo38140P() {
        if (this.f7675ax == null) {
            this.f7675ax = C3270b.m8052l(this.f7634O);
        }
        return this.f7675ax;
    }

    /* renamed from: Q */
    public long mo38141Q() {
        return C3270b.m8053m(this.f7634O);
    }

    /* renamed from: R */
    public boolean mo38142R() {
        if (this.f7626G == null) {
            this.f7626G = Boolean.valueOf(C3270b.m8056n(this.f7634O));
            C3321an.m8349a("Is it a virtual machine? " + this.f7626G, new Object[0]);
        }
        return this.f7626G.booleanValue();
    }

    /* renamed from: S */
    public boolean mo38143S() {
        if (this.f7627H == null) {
            this.f7627H = Boolean.valueOf(C3270b.m8060p(this.f7634O));
            C3321an.m8349a("Does it has hook frame? " + this.f7627H, new Object[0]);
        }
        return this.f7627H.booleanValue();
    }

    /* renamed from: T */
    public String mo38144T() {
        if (this.f7683g == null) {
            this.f7683g = AppInfo.m7960g(this.f7634O);
            C3321an.m8349a("Beacon channel " + this.f7683g, new Object[0]);
        }
        return this.f7683g;
    }

    /* renamed from: a */
    public boolean mo38149a() {
        return this.f7671at;
    }

    /* renamed from: c */
    public String mo38154c() {
        return "2.6.5";
    }

    /* renamed from: d */
    public void mo38157d() {
        synchronized (this.f7677az) {
            this.f7635P = UUID.randomUUID().toString();
        }
    }

    /* renamed from: e */
    public String mo38159e() {
        String str;
        synchronized (this.f7677az) {
            if (this.f7635P == null) {
                mo38157d();
            }
            str = this.f7635P;
        }
        return str;
    }

    /* renamed from: f */
    public String mo38161f() {
        if (!C3325ap.m8404a(this.f7682f)) {
            return this.f7682f;
        }
        return this.f7659ag;
    }

    /* renamed from: g */
    public String mo38163g() {
        String str;
        synchronized (this.f7651aE) {
            str = this.f7637R;
        }
        return str;
    }

    /* renamed from: h */
    public String mo38165h() {
        String str = this.f7636Q;
        if (str != null) {
            return str;
        }
        String str2 = mo38168k() + "|" + mo38170m() + "|" + mo38171n();
        this.f7636Q = str2;
        return str2;
    }

    /* renamed from: i */
    public synchronized String mo38166i() {
        return this.f7638S;
    }

    /* renamed from: j */
    public synchronized String mo38167j() {
        return this.f7639T;
    }

    /* renamed from: k */
    public String mo38168k() {
        if (!this.f7657ae) {
            return "";
        }
        if (this.f7640U == null) {
            this.f7640U = C3270b.m8029a(this.f7634O);
        }
        return this.f7640U;
    }

    /* renamed from: l */
    public String mo38169l() {
        if (!this.f7657ae) {
            return "";
        }
        String str = this.f7641V;
        if (str == null || !str.contains(Constants.COLON_SEPARATOR)) {
            this.f7641V = C3270b.m8036d(this.f7634O);
        }
        return this.f7641V;
    }

    /* renamed from: m */
    public String mo38170m() {
        if (!this.f7657ae) {
            return "";
        }
        if (this.f7642W == null) {
            this.f7642W = C3270b.m8032b(this.f7634O);
        }
        return this.f7642W;
    }

    /* renamed from: n */
    public String mo38171n() {
        if (!this.f7657ae) {
            return "";
        }
        if (this.f7643X == null) {
            this.f7643X = C3270b.m8034c(this.f7634O);
        }
        return this.f7643X;
    }

    /* renamed from: o */
    public long mo38172o() {
        if (this.f7644Y <= 0) {
            this.f7644Y = C3270b.m8039f();
        }
        return this.f7644Y;
    }

    /* renamed from: p */
    public long mo38173p() {
        if (this.f7645Z <= 0) {
            this.f7645Z = C3270b.m8043h();
        }
        return this.f7645Z;
    }

    /* renamed from: q */
    public long mo38174q() {
        if (this.f7653aa <= 0) {
            this.f7653aa = C3270b.m8047j();
        }
        return this.f7653aa;
    }

    /* renamed from: r */
    public String mo38175r() {
        if (this.f7654ab == null) {
            this.f7654ab = C3270b.m8030a(this.f7634O, true);
        }
        return this.f7654ab;
    }

    /* renamed from: s */
    public String mo38176s() {
        if (this.f7655ac == null) {
            this.f7655ac = C3270b.m8044h(this.f7634O);
        }
        return this.f7655ac;
    }

    /* renamed from: t */
    public String mo38177t() {
        try {
            Map<String, ?> all = this.f7634O.getSharedPreferences("BuglySdkInfos", 0).getAll();
            if (!all.isEmpty()) {
                synchronized (this.f7647aA) {
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        try {
                            this.f7628I.put(entry.getKey(), entry.getValue().toString());
                        } catch (Throwable th) {
                            C3321an.m8350a(th);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            C3321an.m8350a(th2);
        }
        if (this.f7628I.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry2 : this.f7628I.entrySet()) {
            sb.append("[");
            sb.append(entry2.getKey());
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(entry2.getValue());
            sb.append("] ");
        }
        mo38156c("SDK_INFO", sb.toString());
        return sb.toString();
    }

    /* renamed from: u */
    public String mo38178u() {
        if (this.f7676ay == null) {
            this.f7676ay = AppInfo.m7958e(this.f7634O);
        }
        return this.f7676ay;
    }

    /* renamed from: v */
    public synchronized Map<String, PlugInBean> mo38179v() {
        if (this.f7656ad != null) {
            if (this.f7656ad.size() > 0) {
                HashMap hashMap = new HashMap(this.f7656ad.size());
                hashMap.putAll(this.f7656ad);
                return hashMap;
            }
        }
        return null;
    }

    /* renamed from: w */
    public String mo38180w() {
        if (this.f7658af == null) {
            this.f7658af = C3270b.m8051l();
        }
        return this.f7658af;
    }

    /* renamed from: x */
    public Boolean mo38181x() {
        if (this.f7660ah == null) {
            this.f7660ah = Boolean.valueOf(C3270b.m8055n());
        }
        return this.f7660ah;
    }

    /* renamed from: y */
    public String mo38182y() {
        if (this.f7661ai == null) {
            String str = "" + C3270b.m8042g(this.f7634O);
            this.f7661ai = str;
            C3321an.m8349a("ROM ID: %s", str);
        }
        return this.f7661ai;
    }

    /* renamed from: z */
    public String mo38183z() {
        if (this.f7662aj == null) {
            String str = "" + C3270b.m8037e(this.f7634O);
            this.f7662aj = str;
            C3321an.m8349a("SIM serial number: %s", str);
        }
        return this.f7662aj;
    }

    /* renamed from: a */
    public void mo38148a(boolean z) {
        this.f7671at = z;
        AbstractC3257a aVar = this.f7632M;
        if (aVar != null) {
            aVar.setNativeIsAppForeground(z);
        }
    }

    /* renamed from: d */
    public synchronized void mo38158d(String str) {
        this.f7638S = "" + str;
    }

    /* renamed from: f */
    public String mo38162f(String str) {
        String remove;
        if (C3325ap.m8404a(str)) {
            C3321an.m8356d("key should not be empty %s", "" + str);
            return null;
        }
        synchronized (this.f7648aB) {
            remove = this.f7668aq.remove(str);
        }
        return remove;
    }

    /* renamed from: g */
    public String mo38164g(String str) {
        String str2;
        if (C3325ap.m8404a(str)) {
            C3321an.m8356d("key should not be empty %s", "" + str);
            return null;
        }
        synchronized (this.f7648aB) {
            str2 = this.f7668aq.get(str);
        }
        return str2;
    }

    /* renamed from: a */
    public static synchronized C3269a m7965a(Context context) {
        C3269a aVar;
        synchronized (C3269a.class) {
            if (f7619an == null) {
                f7619an = new C3269a(context);
            }
            aVar = f7619an;
        }
        return aVar;
    }

    /* renamed from: e */
    public synchronized void mo38160e(String str) {
        this.f7639T = "" + str;
    }

    /* renamed from: b */
    public static synchronized C3269a m7966b() {
        C3269a aVar;
        synchronized (C3269a.class) {
            aVar = f7619an;
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo38146a(String str) {
        this.f7659ag = str;
        mo38156c("APP_ID", str);
    }

    /* renamed from: b */
    public void mo38151b(String str) {
        synchronized (this.f7651aE) {
            if (str == null) {
                str = "10000";
            }
            this.f7637R = "" + str;
        }
    }

    /* renamed from: a */
    public void mo38147a(String str, String str2) {
        if (str != null && str2 != null) {
            synchronized (this.f7647aA) {
                this.f7628I.put(str, str2);
            }
        }
    }

    /* renamed from: b */
    public void mo38153b(boolean z) {
        this.f7657ae = z;
    }

    /* renamed from: b */
    public void mo38152b(String str, String str2) {
        if (C3325ap.m8404a(str) || C3325ap.m8404a(str2)) {
            C3321an.m8356d("key&value should not be empty %s %s", "" + str, "" + str2);
            return;
        }
        synchronized (this.f7648aB) {
            this.f7668aq.put(str, str2);
        }
    }

    /* renamed from: a */
    public void mo38145a(int i) {
        synchronized (this.f7650aD) {
            int i2 = this.f7666ao;
            if (i2 != i) {
                this.f7666ao = i;
                C3321an.m8349a("user scene tag %d changed to tag %d", Integer.valueOf(i2), Integer.valueOf(this.f7666ao));
            }
        }
    }

    /* renamed from: c */
    public void mo38155c(String str) {
        this.f7636Q = str;
        synchronized (this.f7652aF) {
            this.f7669ar.put("E8", str);
        }
    }

    /* renamed from: b */
    public void mo38150b(int i) {
        int i2 = this.f7667ap;
        if (i2 != i) {
            this.f7667ap = i;
            C3321an.m8349a("server scene tag %d changed to tag %d", Integer.valueOf(i2), Integer.valueOf(this.f7667ap));
        }
    }

    /* renamed from: c */
    public void mo38156c(String str, String str2) {
        if (C3325ap.m8404a(str) || C3325ap.m8404a(str2)) {
            C3321an.m8356d("server key&value should not be empty %s %s", "" + str, "" + str2);
            return;
        }
        synchronized (this.f7649aC) {
            this.f7670as.put(str, str2);
        }
    }
}
