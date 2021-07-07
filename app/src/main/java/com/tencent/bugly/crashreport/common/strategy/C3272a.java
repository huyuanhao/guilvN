package com.tencent.bugly.crashreport.common.strategy;

import android.content.Context;
import com.tencent.bugly.AbstractC3215a;
import com.tencent.bugly.crashreport.biz.C3265b;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.proguard.AbstractC3306ad;
import com.tencent.bugly.proguard.C3307ae;
import com.tencent.bugly.proguard.C3310ag;
import com.tencent.bugly.proguard.C3319am;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3325ap;
import com.tencent.bugly.proguard.C3342bf;
import com.tencent.bugly.proguard.C3343bg;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.crashreport.common.strategy.a */
public class C3272a {

    /* renamed from: a */
    public static int f7733a = 1000;

    /* renamed from: b */
    public static long f7734b = 259200000;

    /* renamed from: c */
    public static C3272a f7735c;

    /* renamed from: i */
    public static String f7736i;

    /* renamed from: d */
    public final List<AbstractC3215a> f7737d;

    /* renamed from: e */
    public final C3319am f7738e;

    /* renamed from: f */
    public final StrategyBean f7739f;

    /* renamed from: g */
    public StrategyBean f7740g = null;

    /* renamed from: h */
    public Context f7741h;

    public C3272a(Context context, List<AbstractC3215a> list) {
        this.f7741h = context;
        this.f7739f = new StrategyBean();
        this.f7737d = list;
        this.f7738e = C3319am.m8340a();
    }

    /* renamed from: c */
    public StrategyBean mo38194c() {
        StrategyBean strategyBean = this.f7740g;
        if (strategyBean != null) {
            return strategyBean;
        }
        return this.f7739f;
    }

    /* renamed from: d */
    public StrategyBean mo38195d() {
        byte[] bArr;
        List<C3310ag> a = C3307ae.m8249a().mo38344a(2);
        if (a == null || a.size() <= 0 || (bArr = a.get(0).f7991g) == null) {
            return null;
        }
        return (StrategyBean) C3325ap.m8385a(bArr, StrategyBean.CREATOR);
    }

    /* renamed from: b */
    public synchronized boolean mo38193b() {
        return this.f7740g != null;
    }

    /* renamed from: a */
    public static synchronized C3272a m8070a(Context context, List<AbstractC3215a> list) {
        C3272a aVar;
        synchronized (C3272a.class) {
            if (f7735c == null) {
                f7735c = new C3272a(context, list);
            }
            aVar = f7735c;
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo38190a(long j) {
        this.f7738e.mo38399a(new Thread() {
            /* class com.tencent.bugly.crashreport.common.strategy.C3272a.C32731 */

            public void run() {
                try {
                    Map<String, byte[]> a = C3307ae.m8249a().mo38345a(C3272a.f7733a, (AbstractC3306ad) null, true);
                    if (a != null) {
                        byte[] bArr = a.get("device");
                        byte[] bArr2 = a.get("gateway");
                        if (bArr != null) {
                            C3269a.m7965a(C3272a.this.f7741h).mo38160e(new String(bArr));
                        }
                        if (bArr2 != null) {
                            C3269a.m7965a(C3272a.this.f7741h).mo38158d(new String(bArr2));
                        }
                    }
                    C3272a.this.f7740g = C3272a.this.mo38195d();
                    if (C3272a.this.f7740g != null && !C3325ap.m8404a(C3272a.f7736i) && C3325ap.m8429c(C3272a.f7736i)) {
                        C3272a.this.f7740g.f7725r = C3272a.f7736i;
                        C3272a.this.f7740g.f7726s = C3272a.f7736i;
                    }
                } catch (Throwable th) {
                    if (!C3321an.m8350a(th)) {
                        th.printStackTrace();
                    }
                }
                C3272a aVar = C3272a.this;
                aVar.mo38191a(aVar.f7740g, false);
            }
        }, j);
    }

    /* renamed from: a */
    public static synchronized C3272a m8069a() {
        C3272a aVar;
        synchronized (C3272a.class) {
            aVar = f7735c;
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo38191a(StrategyBean strategyBean, boolean z) {
        C3321an.m8355c("[Strategy] Notify %s", C3265b.class.getName());
        C3265b.m7928a(strategyBean, z);
        for (AbstractC3215a aVar : this.f7737d) {
            try {
                C3321an.m8355c("[Strategy] Notify %s", aVar.getClass().getName());
                aVar.onServerStrategyChanged(strategyBean);
            } catch (Throwable th) {
                if (!C3321an.m8350a(th)) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m8071a(String str) {
        if (C3325ap.m8404a(str) || !C3325ap.m8429c(str)) {
            C3321an.m8356d("URL user set is invalid.", new Object[0]);
        } else {
            f7736i = str;
        }
    }

    /* renamed from: a */
    public void mo38192a(C3343bg bgVar) {
        if (bgVar != null) {
            StrategyBean strategyBean = this.f7740g;
            if (strategyBean == null || bgVar.f8170h != strategyBean.f7723p) {
                StrategyBean strategyBean2 = new StrategyBean();
                strategyBean2.f7714g = bgVar.f8163a;
                strategyBean2.f7716i = bgVar.f8165c;
                strategyBean2.f7715h = bgVar.f8164b;
                if (C3325ap.m8404a(f7736i) || !C3325ap.m8429c(f7736i)) {
                    if (C3325ap.m8429c(bgVar.f8166d)) {
                        C3321an.m8355c("[Strategy] Upload url changes to %s", bgVar.f8166d);
                        strategyBean2.f7725r = bgVar.f8166d;
                    }
                    if (C3325ap.m8429c(bgVar.f8167e)) {
                        C3321an.m8355c("[Strategy] Exception upload url changes to %s", bgVar.f8167e);
                        strategyBean2.f7726s = bgVar.f8167e;
                    }
                }
                C3342bf bfVar = bgVar.f8168f;
                if (bfVar != null && !C3325ap.m8404a(bfVar.f8158a)) {
                    strategyBean2.f7728u = bgVar.f8168f.f8158a;
                }
                long j = bgVar.f8170h;
                if (j != 0) {
                    strategyBean2.f7723p = j;
                }
                Map<String, String> map = bgVar.f8169g;
                if (map != null && map.size() > 0) {
                    Map<String, String> map2 = bgVar.f8169g;
                    strategyBean2.f7729v = map2;
                    String str = map2.get("B11");
                    if (str == null || !str.equals("1")) {
                        strategyBean2.f7717j = false;
                    } else {
                        strategyBean2.f7717j = true;
                    }
                    String str2 = bgVar.f8169g.get("B3");
                    if (str2 != null) {
                        strategyBean2.f7732y = Long.valueOf(str2).longValue();
                    }
                    int i = bgVar.f8174l;
                    strategyBean2.f7724q = (long) i;
                    strategyBean2.f7731x = (long) i;
                    String str3 = bgVar.f8169g.get("B27");
                    if (str3 != null && str3.length() > 0) {
                        try {
                            int parseInt = Integer.parseInt(str3);
                            if (parseInt > 0) {
                                strategyBean2.f7730w = parseInt;
                            }
                        } catch (Exception e) {
                            if (!C3321an.m8350a(e)) {
                                e.printStackTrace();
                            }
                        }
                    }
                    String str4 = bgVar.f8169g.get("B25");
                    if (str4 == null || !str4.equals("1")) {
                        strategyBean2.f7719l = false;
                    } else {
                        strategyBean2.f7719l = true;
                    }
                }
                C3321an.m8349a("[Strategy] enableCrashReport:%b, enableQuery:%b, enableUserInfo:%b, enableAnr:%b, enableBlock:%b, enableSession:%b, enableSessionTimer:%b, sessionOverTime:%d, enableCocos:%b, strategyLastUpdateTime:%d", Boolean.valueOf(strategyBean2.f7714g), Boolean.valueOf(strategyBean2.f7716i), Boolean.valueOf(strategyBean2.f7715h), Boolean.valueOf(strategyBean2.f7717j), Boolean.valueOf(strategyBean2.f7718k), Boolean.valueOf(strategyBean2.f7721n), Boolean.valueOf(strategyBean2.f7722o), Long.valueOf(strategyBean2.f7724q), Boolean.valueOf(strategyBean2.f7719l), Long.valueOf(strategyBean2.f7723p));
                this.f7740g = strategyBean2;
                C3307ae.m8249a().mo38352b(2);
                C3310ag agVar = new C3310ag();
                agVar.f7986b = 2;
                agVar.f7985a = strategyBean2.f7712e;
                agVar.f7989e = strategyBean2.f7713f;
                agVar.f7991g = C3325ap.m8407a(strategyBean2);
                C3307ae.m8249a().mo38349a(agVar);
                mo38191a(strategyBean2, true);
            }
        }
    }
}
