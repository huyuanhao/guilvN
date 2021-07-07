package com.qiyukf.nimlib.p183g.p188b.p190b;

import android.os.Handler;
import android.text.TextUtils;
import com.megvii.apo.PhoneFingerManager;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p120b.p121a.p130c.C1757a;
import com.qiyukf.basesdk.p138c.C1805a;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.p176b.C2183b;
import com.qiyukf.nimlib.p176b.C2187d;
import com.qiyukf.nimlib.p176b.C2190f;
import com.qiyukf.nimlib.p183g.C2306e;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.qiyukf.nimlib.g.b.b.a */
public final class C2275a {

    /* renamed from: f */
    public static C2275a f4528f = new C2275a();

    /* renamed from: a */
    public boolean f4529a = true;

    /* renamed from: b */
    public C2277a[] f4530b = new C2277a[1];

    /* renamed from: c */
    public String f4531c;

    /* renamed from: d */
    public long f4532d;

    /* renamed from: e */
    public Handler f4533e = C1805a.m3403a().mo34073c();

    /* renamed from: com.qiyukf.nimlib.g.b.b.a$a */
    public static final class C2277a implements Serializable {

        /* renamed from: a */
        public String f4535a;

        /* renamed from: b */
        public String[] f4536b;

        /* renamed from: c */
        public String[] f4537c;

        /* renamed from: d */
        public int f4538d = 1;

        /* renamed from: e */
        public int f4539e;

        /* renamed from: f */
        public int f4540f;

        /* renamed from: g */
        public boolean f4541g;

        public C2277a(String str, String[] strArr) {
            this.f4535a = str;
            this.f4536b = strArr;
        }

        /* renamed from: a */
        public final synchronized void mo34916a(String[] strArr) {
            this.f4537c = strArr;
            this.f4539e = 0;
            this.f4540f = 0;
        }

        /* renamed from: a */
        public final synchronized boolean mo34917a() {
            boolean z = this.f4537c != null && this.f4537c.length > 0;
            if (this.f4541g) {
                return z;
            }
            if (z) {
                int i = this.f4539e + 1;
                this.f4539e = i;
                if (i >= this.f4538d) {
                    this.f4539e = 0;
                    if (this.f4540f >= this.f4537c.length - 1) {
                        this.f4537c = null;
                        return false;
                    }
                    this.f4540f = (this.f4540f + 1) % this.f4537c.length;
                }
                return true;
            }
            this.f4537c = null;
            return false;
        }

        /* renamed from: b */
        public final synchronized String mo34918b() {
            if (this.f4537c != null && this.f4537c.length > 0) {
                this.f4541g = false;
                return this.f4537c[this.f4540f];
            } else if (this.f4536b == null || this.f4536b.length <= 0) {
                return null;
            } else {
                this.f4541g = true;
                return this.f4536b[this.f4540f % this.f4536b.length];
            }
        }

        /* renamed from: b */
        public final synchronized void mo34919b(String[] strArr) {
            if (strArr != null) {
                if (strArr.length != 0) {
                    this.f4536b = strArr;
                }
            }
        }
    }

    public C2275a() {
        this.f4530b[0] = new C2277a("link", m4812e());
    }

    /* renamed from: a */
    public static C2275a m4806a() {
        return f4528f;
    }

    /* renamed from: a */
    public static /* synthetic */ String m4807a(C2275a aVar) {
        String a = TextUtils.isEmpty(aVar.f4531c) ? C2190f.m4522a() : aVar.f4531c;
        C2180b.m4471a();
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("?tp=1");
        sb.append("&sv=16");
        sb.append("&pv=1");
        String b = C2180b.m4477b();
        if (!TextUtils.isEmpty(b)) {
            sb.append("&id=");
            sb.append(b);
        }
        sb.append("&k=");
        sb.append(C2180b.m4482g());
        sb.append("&devflag=");
        sb.append(C2187d.m4515b() ? "qytest" : "qyonline");
        return sb.toString().trim();
    }

    /* renamed from: a */
    public static /* synthetic */ void m4808a(C2275a aVar, String str) {
        String str2 = null;
        try {
            C1709a.m3011a("core", "get server addresses from lbs: " + str);
            str2 = C1757a.m3231a(str, "GET", "LBS");
            C1709a.m3011a("core", "lbs response: " + str2);
        } catch (Exception e) {
            e.printStackTrace();
            C1709a.m3018d("lbs", "LBS Http Error");
        }
        aVar.m4809a(str2);
    }

    /* renamed from: a */
    private final void m4809a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str).getJSONObject("common");
                C2277a[] aVarArr = this.f4530b;
                for (C2277a aVar : aVarArr) {
                    aVar.mo34916a(m4810a(jSONObject, aVar.f4535a));
                }
                this.f4531c = jSONObject.getString("lbs");
                String string = jSONObject.getString("link.default");
                if (C2187d.m4515b()) {
                    C2306e.m4927b(string);
                } else if (C2187d.m4517d()) {
                    C2306e.m4929c(string);
                } else {
                    C2306e.m4924a(string);
                }
                this.f4530b[0].mo34919b(m4812e());
                C2183b.m4501e().mo34771a(C1810b.m3433f(jSONObject, "c.aos"));
                this.f4529a = false;
            } catch (Exception e) {
                e.printStackTrace();
                C1709a.m3018d("lbs", "LBS Json Error " + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static String[] m4810a(JSONObject jSONObject, String str) {
        JSONArray g = C1810b.m3434g(jSONObject, str);
        if (g == null) {
            return null;
        }
        String[] strArr = new String[g.length()];
        for (int i = 0; i < g.length(); i++) {
            strArr[i] = C1810b.m3419a(g, i);
        }
        return strArr;
    }

    /* renamed from: e */
    public static String[] m4812e() {
        String c = C2187d.m4515b() ? C2306e.m4928c() : C2187d.m4517d() ? C2306e.m4930d() : C2306e.m4926b();
        if (!TextUtils.isEmpty(c)) {
            try {
                JSONArray b = C1810b.m3428b(c);
                String[] strArr = new String[b.length()];
                for (int i = 0; i < b.length(); i++) {
                    strArr[i] = C1810b.m3419a(b, i);
                }
                return strArr;
            } catch (Exception unused) {
            }
        }
        return new String[]{C2190f.m4523b()};
    }

    /* renamed from: f */
    private synchronized String m4813f() {
        boolean isEmpty = TextUtils.isEmpty(this.f4530b[0].mo34918b());
        if (isEmpty || this.f4529a || System.currentTimeMillis() - this.f4532d >= PhoneFingerManager.PER_HOUR_MILLISECOND) {
            RunnableC22761 r2 = new Runnable() {
                /* class com.qiyukf.nimlib.p183g.p188b.p190b.C2275a.RunnableC22761 */

                public final void run() {
                    C2275a aVar = C2275a.this;
                    C2275a.m4808a(aVar, C2275a.m4807a(aVar));
                    if (!C2275a.this.f4529a) {
                        C2275a.this.f4532d = System.currentTimeMillis();
                    }
                }
            };
            if (isEmpty) {
                r2.run();
            } else {
                this.f4533e.post(r2);
            }
        }
        return this.f4530b[0].mo34918b();
    }

    /* renamed from: g */
    private synchronized void m4814g() {
        if (!this.f4530b[0].mo34917a()) {
            mo34914d();
        }
    }

    /* renamed from: b */
    public final C2278b mo34912b() {
        String f = m4813f();
        C1709a.m3011a("core", "connect link " + f);
        return new C2278b(f);
    }

    /* renamed from: c */
    public final void mo34913c() {
        m4814g();
    }

    /* renamed from: d */
    public final synchronized void mo34914d() {
        this.f4529a = true;
    }
}
