package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.sdk.android.httpdns.net64.C0308a;
import com.alibaba.sdk.android.httpdns.p014b.C0260b;
import com.alibaba.sdk.android.httpdns.p016d.C0276b;
import com.alibaba.sdk.android.httpdns.p016d.C0291c;
import com.xiaomi.mipush.sdk.Constants;
import java.net.SocketTimeoutException;

/* renamed from: com.alibaba.sdk.android.httpdns.t */
public class C0325t {

    /* renamed from: a */
    public static SharedPreferences f714a;

    /* renamed from: a */
    public static EnumC0326a f715a = EnumC0326a.ENABLE;

    /* renamed from: e */
    public static long f716e;

    /* renamed from: f */
    public static volatile int f717f;

    /* renamed from: f */
    public static boolean f718f;

    /* renamed from: g */
    public static volatile int f719g;

    /* renamed from: h */
    public static boolean f720h;

    /* renamed from: com.alibaba.sdk.android.httpdns.t$a */
    public enum EnumC0326a {
        ENABLE,
        PRE_DISABLE,
        DISABLE
    }

    /* renamed from: a */
    public static synchronized String m588a(EnumC0312o oVar) {
        synchronized (C0325t.class) {
            try {
                if (oVar != EnumC0312o.QUERY_HOST) {
                    if (oVar != EnumC0312o.SNIFF_HOST) {
                        return (oVar == EnumC0312o.QUERY_SCHEDULE_CENTER || oVar == EnumC0312o.SNIFF_SCHEDULE_CENTER) ? null : null;
                    }
                }
                if (f715a == EnumC0326a.ENABLE || f715a == EnumC0326a.PRE_DISABLE) {
                    return C0296f.f645b[f717f];
                } else if (oVar == EnumC0312o.QUERY_HOST) {
                    return null;
                } else {
                    return C0296f.f645b[f717f];
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m589a(Context context) {
        synchronized (C0325t.class) {
            if (!f718f) {
                synchronized (C0325t.class) {
                    if (!f718f) {
                        if (context != null) {
                            f714a = context.getSharedPreferences("httpdns_config_cache", 0);
                        }
                        f720h = f714a.getBoolean("status", false);
                        f717f = f714a.getInt("activiate_ip_index", 0);
                        f719g = f717f;
                        f716e = f714a.getLong("disable_modified_time", 0);
                        if (System.currentTimeMillis() - f716e >= 86400000) {
                            m596d(false);
                        }
                        f715a = f720h ? EnumC0326a.DISABLE : EnumC0326a.ENABLE;
                        f718f = true;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m590a(String str, String str2, long j) {
        synchronized (C0325t.class) {
            try {
                m595b(str, str2, j);
                reportHttpDnsSuccess(str, 1);
                if (!(f715a == EnumC0326a.ENABLE || str2 == null || !str2.equals(C0296f.f645b[f717f]))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(f715a == EnumC0326a.DISABLE ? "Disable " : "Pre_disable ");
                    sb.append("mode finished. Enter enable mode.");
                    C0299i.m536f(sb.toString());
                    f715a = EnumC0326a.ENABLE;
                    m596d(false);
                    C0324s.m582a().mo4060e();
                    f719g = f717f;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return;
    }

    /* renamed from: a */
    public static synchronized void m591a(String str, String str2, Throwable th) {
        synchronized (C0325t.class) {
            try {
                m592a(str2, th);
                if (m593a(th) && str2 != null && str2.equals(C0296f.f645b[f717f])) {
                    m598f();
                    if (f719g == f717f) {
                        C0324s.m582a().mo4059c(false);
                        C0313p.m554a().mo4039c();
                    }
                    if (f715a == EnumC0326a.ENABLE) {
                        f715a = EnumC0326a.PRE_DISABLE;
                        C0299i.m536f("enter pre_disable mode");
                    } else if (f715a == EnumC0326a.PRE_DISABLE) {
                        f715a = EnumC0326a.DISABLE;
                        C0299i.m536f("enter disable mode");
                        m596d(true);
                        m601h(str);
                        C0324s.m582a().mo4061g(str);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return;
    }

    /* renamed from: a */
    public static void m592a(String str, Throwable th) {
        try {
            C0276b a = C0276b.m496a();
            if (a != null) {
                int a2 = C0291c.m515a(th);
                a.mo3986a(str, String.valueOf(a2), C0291c.m516a(th), C0291c.m517b(), C0308a.mo4034a().mo4035h() ? 1 : 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static boolean m593a(Throwable th) {
        if (th instanceof SocketTimeoutException) {
            return true;
        }
        if (th instanceof C0298h) {
            C0298h hVar = (C0298h) th;
            return hVar.getErrorCode() == 403 && hVar.getMessage().equals("ServiceLevelDeny");
        }
    }

    /* renamed from: b */
    public static void m594b(int i) {
        if (f714a != null && i >= 0 && i < C0296f.f645b.length) {
            f717f = i;
            SharedPreferences.Editor edit = f714a.edit();
            edit.putInt("activiate_ip_index", i);
            edit.putLong("activiated_ip_index_modified_time", System.currentTimeMillis());
            edit.commit();
        }
    }

    /* renamed from: b */
    public static void m595b(String str, String str2, long j) {
        try {
            C0276b a = C0276b.m496a();
            if (a != null) {
                a.mo3990b(str2, j, C0291c.m517b());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public static synchronized void m596d(boolean z) {
        synchronized (C0325t.class) {
            if (f720h != z) {
                f720h = z;
                if (f714a != null) {
                    SharedPreferences.Editor edit = f714a.edit();
                    edit.putBoolean("status", f720h);
                    edit.putLong("disable_modified_time", System.currentTimeMillis());
                    edit.commit();
                }
            }
        }
    }

    /* renamed from: e */
    public static synchronized boolean m597e() {
        boolean z;
        synchronized (C0325t.class) {
            z = f720h;
        }
        return z;
    }

    /* renamed from: f */
    public static void m598f() {
        f717f = f717f == C0296f.f645b.length + -1 ? 0 : f717f + 1;
        m594b(f717f);
    }

    /* renamed from: g */
    public static void m599g() {
        m594b(0);
        f719g = f717f;
        C0324s.m582a().mo4059c(true);
    }

    /* renamed from: h */
    public static void m600h() {
        C0324s.m582a().mo4059c(true);
    }

    /* renamed from: h */
    public static void m601h(String str) {
        try {
            C0276b a = C0276b.m496a();
            if (a != null) {
                String f = C0313p.m554a().mo4041f();
                int i = f717f;
                if (i == 0) {
                    i = C0296f.f645b.length;
                }
                int i2 = i - 1;
                int length = i2 == 0 ? C0296f.f645b.length - 1 : i2 - 1;
                if (i2 >= 0 && i2 < C0296f.f645b.length && length >= 0 && length < C0296f.f645b.length) {
                    String str2 = C0296f.f645b[i2];
                    a.mo3991b(str, f, C0296f.f645b[length] + Constants.ACCEPT_TIME_SEPARATOR_SP + str2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void reportHttpDnsSuccess(String str, int i) {
        try {
            C0276b a = C0276b.m496a();
            if (a != null) {
                a.mo3982a(str, i, C0291c.m517b(), C0260b.m441a() ? 1 : 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
