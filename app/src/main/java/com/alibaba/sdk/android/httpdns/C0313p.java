package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.sdk.android.httpdns.p016d.C0276b;
import com.alibaba.sdk.android.httpdns.p016d.C0291c;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.xiaomi.mipush.sdk.Constants;
import java.net.SocketTimeoutException;

/* renamed from: com.alibaba.sdk.android.httpdns.p */
public class C0313p {

    /* renamed from: a */
    public static volatile C0313p f680a = null;

    /* renamed from: e */
    public static long f681e = 0;

    /* renamed from: f */
    public static String f682f = "https://";

    /* renamed from: f */
    public static boolean f683f;

    /* renamed from: g */
    public static String f684g;

    /* renamed from: a */
    public SharedPreferences f685a = null;

    /* renamed from: e */
    public int f686e = 0;

    /* renamed from: f */
    public long f687f = 0;

    /* renamed from: a */
    public static C0313p m554a() {
        if (f680a == null) {
            synchronized (C0313p.class) {
                if (f680a == null) {
                    f680a = new C0313p();
                }
            }
        }
        return f680a;
    }

    /* renamed from: a */
    private void m555a(String str, long j) {
        try {
            C0276b a = C0276b.m496a();
            if (a != null) {
                a.mo3983a(str, j, C0291c.m517b());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private void m556d() {
        int i = this.f686e;
        this.f686e = i < C0296f.f646c.length + -1 ? i + 1 : 0;
    }

    /* renamed from: d */
    private void m557d(Throwable th) {
        try {
            C0276b a = C0276b.m496a();
            if (a != null) {
                int a2 = C0291c.m515a(th);
                a.mo3985a(mo4041f(), String.valueOf(a2), th.getMessage(), C0291c.m517b());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public synchronized void mo4036a(Context context) {
        try {
            if (!f683f) {
                synchronized (C0313p.class) {
                    if (!f683f) {
                        if (context != null) {
                            this.f685a = context.getSharedPreferences("httpdns_config_cache", 0);
                        }
                        String string = this.f685a.getString("httpdns_server_ips", null);
                        f684g = string;
                        if (string != null) {
                            C0296f.m529a(string.split(C7522o0Ooo0o.OooO0O0));
                        }
                        long j = this.f685a.getLong("schedule_center_last_request_time", 0);
                        f681e = j;
                        if (j == 0 || System.currentTimeMillis() - f681e >= 86400000) {
                            C0324s.m582a().mo4059c(false);
                            mo4039c();
                        }
                        f683f = true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    /* renamed from: a */
    public synchronized void mo4037a(C0323q qVar, long j) {
        try {
            m555a(mo4041f(), j);
            this.f686e = 0;
            HttpDns.switchDnsService(qVar.isEnabled());
            if (mo4038a(qVar.mo4057c())) {
                C0299i.m534d("Scheduler center update success");
                this.f687f = System.currentTimeMillis();
                C0325t.m599g();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    /* renamed from: a */
    public synchronized boolean mo4038a(String[] strArr) {
        try {
            if (!C0296f.m529a(strArr)) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
                sb.append(C7522o0Ooo0o.OooO0O0);
            }
            sb.deleteCharAt(sb.length() - 1);
            if (this.f685a == null) {
                return false;
            }
            SharedPreferences.Editor edit = this.f685a.edit();
            edit.putString("httpdns_server_ips", sb.toString());
            edit.putLong("schedule_center_last_request_time", System.currentTimeMillis());
            edit.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public synchronized void mo4039c() {
        if (System.currentTimeMillis() - this.f687f >= Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL) {
            C0299i.m534d("update server ips from schedule center.");
            this.f686e = 0;
            C0266c.m467a().submit(new CallableC0306n(C0296f.f646c.length - 1));
        } else {
            C0299i.m534d("update server ips from schedule center too often, give up. ");
            C0325t.m600h();
        }
    }

    /* renamed from: c */
    public synchronized void mo4040c(Throwable th) {
        try {
            m557d(th);
            if (th instanceof SocketTimeoutException) {
                m556d();
                if (this.f686e == 0) {
                    this.f687f = System.currentTimeMillis();
                    C0299i.m536f("Scheduler center update failed");
                    C0325t.m600h();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    /* renamed from: f */
    public synchronized String mo4041f() {
        try {
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
        return f682f + C0296f.f646c[this.f686e] + "/sc/httpdns_config?account_id=" + C0296f.f642a + "&platform=android&sdk_version=" + "1.2.5";
    }
}
