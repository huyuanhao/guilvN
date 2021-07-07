package com.vivo.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.p118pd.sdk.C7265o0O000oo;
import com.vivo.push.p281b.C4031a;
import com.vivo.push.p281b.C4033ab;
import com.vivo.push.p281b.C4034ac;
import com.vivo.push.p281b.C4035ad;
import com.vivo.push.p281b.C4036b;
import com.vivo.push.p281b.C4037c;
import com.vivo.push.p281b.C4038d;
import com.vivo.push.p281b.C4040f;
import com.vivo.push.p281b.C4041g;
import com.vivo.push.p281b.C4042h;
import com.vivo.push.p281b.C4043i;
import com.vivo.push.p281b.C4050p;
import com.vivo.push.p281b.C4059y;
import com.vivo.push.p281b.C4060z;
import com.vivo.push.p282c.AbstractC4064ab;
import com.vivo.push.sdk.PushMessageCallback;
import com.vivo.push.util.C4131a;
import com.vivo.push.util.C4146p;
import com.vivo.push.util.C4149s;
import com.vivo.push.util.C4153w;
import com.vivo.push.util.C4156z;
import com.vivo.push.util.VivoPushException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vivo.push.p */
public final class C4121p {

    /* renamed from: a */
    public static final Object f11037a = new Object();

    /* renamed from: b */
    public static volatile C4121p f11038b;

    /* renamed from: c */
    public long f11039c = -1;

    /* renamed from: d */
    public long f11040d = -1;

    /* renamed from: e */
    public long f11041e = -1;

    /* renamed from: f */
    public long f11042f = -1;

    /* renamed from: g */
    public long f11043g = -1;

    /* renamed from: h */
    public long f11044h = -1;

    /* renamed from: i */
    public Context f11045i;

    /* renamed from: j */
    public boolean f11046j = true;

    /* renamed from: k */
    public C4131a f11047k;

    /* renamed from: l */
    public String f11048l;

    /* renamed from: m */
    public String f11049m;

    /* renamed from: n */
    public SparseArray<C4122a> f11050n = new SparseArray<>();

    /* renamed from: o */
    public int f11051o = 0;

    /* renamed from: p */
    public Boolean f11052p;

    /* renamed from: q */
    public Long f11053q;

    /* renamed from: r */
    public boolean f11054r;

    /* renamed from: s */
    public IPushClientFactory f11055s = new C4120o();

    /* renamed from: t */
    public int f11056t;

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m11091t() {
        this.f11049m = null;
        this.f11047k.mo41186c("APP_ALIAS");
    }

    /* renamed from: u */
    private long m11092u() {
        Context context = this.f11045i;
        if (context == null) {
            return -1;
        }
        if (this.f11053q == null) {
            this.f11053q = Long.valueOf(C4156z.m11264b(context));
        }
        return this.f11053q.longValue();
    }

    /* renamed from: v */
    private boolean m11093v() {
        if (this.f11052p == null) {
            this.f11052p = Boolean.valueOf(m11092u() >= 1230 && C4156z.m11273e(this.f11045i));
        }
        return this.f11052p.booleanValue();
    }

    /* renamed from: d */
    public final boolean mo41119d() {
        if (this.f11045i == null) {
            C4146p.m11216d("PushClientManager", "support:context is null");
            return false;
        }
        Boolean valueOf = Boolean.valueOf(m11093v());
        this.f11052p = valueOf;
        return valueOf.booleanValue();
    }

    /* renamed from: e */
    public final boolean mo41120e() {
        return this.f11054r;
    }

    /* renamed from: f */
    public final String mo41121f() {
        String a = this.f11047k.mo41178a("APP_TOKEN");
        if (TextUtils.isEmpty(a)) {
            return a;
        }
        Context context = this.f11045i;
        if (!C4156z.m11263a(context, context.getPackageName(), a)) {
            return a;
        }
        this.f11047k.mo41179a();
        return null;
    }

    /* renamed from: g */
    public final boolean mo41122g() {
        return this.f11046j;
    }

    /* renamed from: h */
    public final Context mo41123h() {
        return this.f11045i;
    }

    /* renamed from: i */
    public final void mo41124i() {
        mo41096a(new C4040f());
    }

    /* renamed from: j */
    public final void mo41125j() {
        mo41096a(new C4034ac());
    }

    /* renamed from: k */
    public final void mo41126k() {
        this.f11047k.mo41179a();
    }

    /* renamed from: l */
    public final String mo41127l() {
        return this.f11049m;
    }

    /* renamed from: m */
    public final void mo41128m() {
        mo41096a(new C4038d(true));
    }

    /* renamed from: n */
    public final void mo41129n() {
        mo41096a(new C4038d(false));
    }

    /* renamed from: o */
    public final void mo41130o() {
        mo41096a(new C4059y());
    }

    /* renamed from: p */
    public final boolean mo41131p() {
        return this.f11045i.getPackageManager().getComponentEnabledSetting(new ComponentName(this.f11045i, "com.vivo.push.sdk.service.PushService")) != 2;
    }

    /* renamed from: q */
    public final void mo41132q() {
        mo41096a(new C4043i());
    }

    /* renamed from: r */
    public final int mo41133r() {
        return this.f11056t;
    }

    /* renamed from: s */
    public final Map<String, String> mo41134s() {
        return C4156z.m11274f(this.f11045i);
    }

    /* renamed from: c */
    public final List<String> mo41116c() {
        String a = this.f11047k.mo41178a("APP_TAGS");
        ArrayList arrayList = new ArrayList();
        try {
            if (TextUtils.isEmpty(a)) {
                return arrayList;
            }
            Iterator<String> keys = new JSONObject(a).keys();
            while (keys.hasNext()) {
                arrayList.add(keys.next());
            }
            return arrayList;
        } catch (JSONException unused) {
            this.f11047k.mo41186c("APP_TAGS");
            arrayList.clear();
            C4146p.m11216d("PushClientManager", "getTags error");
        }
    }

    /* renamed from: a */
    public static C4121p m11080a() {
        if (f11038b == null) {
            synchronized (f11037a) {
                if (f11038b == null) {
                    f11038b = new C4121p();
                }
            }
        }
        return f11038b;
    }

    /* renamed from: b */
    public final void mo41106b() throws VivoPushException {
        Context context = this.f11045i;
        if (context != null) {
            C4156z.m11268c(context);
        }
    }

    /* renamed from: com.vivo.push.p$a */
    public static class C4122a {

        /* renamed from: a */
        public IPushActionListener f11057a;

        /* renamed from: b */
        public C4037c f11058b;

        /* renamed from: c */
        public IPushActionListener f11059c;

        /* renamed from: d */
        public Runnable f11060d;

        /* renamed from: e */
        public Object[] f11061e;

        public C4122a(C4037c cVar, IPushActionListener iPushActionListener) {
            this.f11058b = cVar;
            this.f11057a = iPushActionListener;
        }

        /* renamed from: a */
        public final void mo41136a(int i, Object... objArr) {
            this.f11061e = objArr;
            IPushActionListener iPushActionListener = this.f11059c;
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(i);
            }
            IPushActionListener iPushActionListener2 = this.f11057a;
            if (iPushActionListener2 != null) {
                iPushActionListener2.onStateChanged(i);
            }
        }

        /* renamed from: b */
        public final Object[] mo41139b() {
            return this.f11061e;
        }

        /* renamed from: a */
        public final void mo41138a(Runnable runnable) {
            this.f11060d = runnable;
        }

        /* renamed from: a */
        public final void mo41135a() {
            Runnable runnable = this.f11060d;
            if (runnable == null) {
                C4146p.m11204a("PushClientManager", "task is null");
            } else {
                runnable.run();
            }
        }

        /* renamed from: a */
        public final void mo41137a(IPushActionListener iPushActionListener) {
            this.f11059c = iPushActionListener;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m11090d(String str) {
        C4158w.m11279a(new RunnableC4130u(this, str));
    }

    /* renamed from: b */
    public final void mo41114b(List<String> list) {
        JSONObject jSONObject;
        try {
            if (list.size() > 0) {
                String a = this.f11047k.mo41178a("APP_TAGS");
                if (TextUtils.isEmpty(a)) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(a);
                }
                for (String str : list) {
                    jSONObject.remove(str);
                }
                String jSONObject2 = jSONObject.toString();
                if (TextUtils.isEmpty(jSONObject2)) {
                    this.f11047k.mo41186c("APP_TAGS");
                } else {
                    this.f11047k.mo41183a("APP_TAGS", jSONObject2);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
            this.f11047k.mo41186c("APP_TAGS");
        }
    }

    /* renamed from: a */
    public final synchronized void mo41093a(Context context) {
        if (this.f11045i == null) {
            this.f11045i = context.getApplicationContext();
            this.f11054r = C4149s.m11227b(context, context.getPackageName());
            C4153w.m11245b().mo41205a(this.f11045i);
            mo41096a(new C4042h());
            C4131a aVar = new C4131a();
            this.f11047k = aVar;
            aVar.mo41180a(context, "com.vivo.push_preferences.appconfig_v1");
            this.f11048l = mo41121f();
            this.f11049m = this.f11047k.mo41178a("APP_ALIAS");
        }
    }

    /* renamed from: c */
    public final void mo41118c(List<String> list) {
        if (list.contains(this.f11049m)) {
            m11091t();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.vivo.push.C4121p.C4122a m11088c(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x0019
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x0019, all -> 0x0016 }
            android.util.SparseArray<com.vivo.push.p$a> r0 = r2.f11050n     // Catch:{ Exception -> 0x0019, all -> 0x0016 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x0019, all -> 0x0016 }
            com.vivo.push.p$a r0 = (com.vivo.push.C4121p.C4122a) r0     // Catch:{ Exception -> 0x0019, all -> 0x0016 }
            android.util.SparseArray<com.vivo.push.p$a> r1 = r2.f11050n     // Catch:{ Exception -> 0x0019, all -> 0x0016 }
            r1.delete(r3)     // Catch:{ Exception -> 0x0019, all -> 0x0016 }
            monitor-exit(r2)
            return r0
        L_0x0016:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x0019:
            r3 = 0
            monitor-exit(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.C4121p.m11088c(java.lang.String):com.vivo.push.p$a");
    }

    /* renamed from: b */
    public final void mo41108b(IPushActionListener iPushActionListener) {
        if (this.f11045i == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
            }
        } else if ("".equals(this.f11048l)) {
            iPushActionListener.onStateChanged(0);
        } else if (m11084a(this.f11040d)) {
            this.f11040d = SystemClock.elapsedRealtime();
            String packageName = this.f11045i.getPackageName();
            C4122a aVar = null;
            if (this.f11045i != null) {
                C4036b bVar = new C4036b(false, packageName);
                bVar.mo40903d();
                bVar.mo40904e();
                bVar.mo40908g();
                bVar.mo40905a(100);
                if (!this.f11054r) {
                    mo41096a(bVar);
                    if (iPushActionListener != null) {
                        iPushActionListener.onStateChanged(0);
                    }
                } else if (m11093v()) {
                    aVar = new C4122a(bVar, iPushActionListener);
                    String a = m11082a(aVar);
                    bVar.mo40906b(a);
                    aVar.mo41138a(new RunnableC4129t(this, bVar, a));
                } else if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                }
            } else if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
            }
            if (aVar != null) {
                aVar.mo41137a(new C4125s(this));
                aVar.mo41135a();
            }
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(1002);
        }
    }

    /* renamed from: c */
    public final void mo41117c(int i) {
        this.f11056t = i;
    }

    /* renamed from: a */
    public final void mo41104a(List<String> list) {
        JSONObject jSONObject;
        try {
            if (list.size() > 0) {
                String a = this.f11047k.mo41178a("APP_TAGS");
                if (TextUtils.isEmpty(a)) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(a);
                }
                for (String str : list) {
                    jSONObject.put(str, System.currentTimeMillis());
                }
                String jSONObject2 = jSONObject.toString();
                if (TextUtils.isEmpty(jSONObject2)) {
                    this.f11047k.mo41186c("APP_TAGS");
                } else {
                    this.f11047k.mo41183a("APP_TAGS", jSONObject2);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
            this.f11047k.mo41186c("APP_TAGS");
        }
    }

    /* renamed from: a */
    public final void mo41097a(String str) {
        this.f11048l = str;
        this.f11047k.mo41183a("APP_TOKEN", str);
    }

    /* renamed from: a */
    public final void mo41105a(boolean z) {
        this.f11046j = z;
    }

    /* renamed from: a */
    public final void mo41095a(IPushActionListener iPushActionListener) {
        if (this.f11045i != null) {
            String f = mo41121f();
            this.f11048l = f;
            if (!TextUtils.isEmpty(f)) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(0);
                }
            } else if (m11084a(this.f11039c)) {
                this.f11039c = SystemClock.elapsedRealtime();
                String packageName = this.f11045i.getPackageName();
                C4122a aVar = null;
                if (this.f11045i != null) {
                    C4036b bVar = new C4036b(true, packageName);
                    bVar.mo40908g();
                    bVar.mo40903d();
                    bVar.mo40904e();
                    bVar.mo40905a(100);
                    if (!this.f11054r) {
                        mo41096a(bVar);
                        if (iPushActionListener != null) {
                            iPushActionListener.onStateChanged(0);
                        }
                    } else if (m11093v()) {
                        aVar = new C4122a(bVar, iPushActionListener);
                        String a = m11082a(aVar);
                        bVar.mo40906b(a);
                        aVar.mo41138a(new RunnableC4124r(this, bVar, a));
                    } else if (iPushActionListener != null) {
                        iPushActionListener.onStateChanged(101);
                    }
                } else if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(102);
                }
                if (aVar != null) {
                    aVar.mo41137a(new C4123q(this, aVar));
                    aVar.mo41135a();
                }
            } else if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
            }
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(102);
        }
    }

    /* renamed from: b */
    public final void mo41111b(String str, String str2) {
        if (this.f11045i != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            C4031a aVar = new C4031a(false, str, this.f11045i.getPackageName(), arrayList);
            aVar.mo40905a(100);
            mo41096a(aVar);
        }
    }

    /* renamed from: b */
    public final void mo41110b(String str, IPushActionListener iPushActionListener) {
        if (this.f11045i == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
            }
        } else if (!TextUtils.isEmpty(this.f11049m)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            C4031a aVar = new C4031a(false, null, this.f11045i.getPackageName(), arrayList);
            aVar.mo40905a(100);
            if (!this.f11054r) {
                mo41096a(aVar);
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(0);
                }
            } else if (!m11093v()) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                }
            } else if (m11084a(this.f11042f)) {
                this.f11042f = SystemClock.elapsedRealtime();
                String a = m11082a(new C4122a(aVar, iPushActionListener));
                aVar.mo40906b(a);
                if (TextUtils.isEmpty(this.f11048l)) {
                    mo41098a(a, 30001);
                } else if (TextUtils.isEmpty(str)) {
                    mo41098a(a, 30002);
                } else if (((long) str.length()) > 70) {
                    mo41098a(a, 30003);
                } else {
                    mo41096a(aVar);
                    m11090d(a);
                }
            } else if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
            }
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(0);
        }
    }

    /* renamed from: a */
    public final void mo41099a(String str, int i, Object... objArr) {
        C4122a c = m11088c(str);
        if (c != null) {
            c.mo41136a(i, objArr);
        } else {
            C4146p.m11216d("PushClientManager", "notifyApp token is null");
        }
    }

    /* renamed from: a */
    public final void mo41101a(String str, String str2) {
        if (this.f11045i != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            C4031a aVar = new C4031a(true, str, this.f11045i.getPackageName(), arrayList);
            aVar.mo40905a(100);
            mo41096a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo41100a(String str, IPushActionListener iPushActionListener) {
        if (this.f11045i == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
            }
        } else if (TextUtils.isEmpty(this.f11049m) || !this.f11049m.equals(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            C4031a aVar = new C4031a(true, null, this.f11045i.getPackageName(), arrayList);
            aVar.mo40905a(100);
            if (!this.f11054r) {
                mo41096a(aVar);
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(0);
                }
            } else if (!m11093v()) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                }
            } else if (m11084a(this.f11041e)) {
                this.f11041e = SystemClock.elapsedRealtime();
                String a = m11082a(new C4122a(aVar, iPushActionListener));
                aVar.mo40906b(a);
                if (TextUtils.isEmpty(this.f11048l)) {
                    mo41098a(a, 30001);
                } else if (TextUtils.isEmpty(str)) {
                    mo41098a(a, 30002);
                } else if (((long) str.length()) > 70) {
                    mo41098a(a, 30003);
                } else {
                    mo41096a(aVar);
                    m11090d(a);
                }
            } else if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
            }
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(0);
        }
    }

    /* renamed from: b */
    public final void mo41109b(String str) {
        this.f11049m = str;
        this.f11047k.mo41183a("APP_ALIAS", str);
    }

    /* renamed from: b */
    public final void mo41112b(String str, ArrayList<String> arrayList) {
        Context context = this.f11045i;
        if (context != null) {
            C4035ad adVar = new C4035ad(false, str, context.getPackageName(), arrayList);
            adVar.mo40905a(500);
            mo41096a(adVar);
        }
    }

    /* renamed from: b */
    public final void mo41113b(ArrayList<String> arrayList, IPushActionListener iPushActionListener) {
        Context context = this.f11045i;
        if (context != null) {
            C4035ad adVar = new C4035ad(false, null, context.getPackageName(), arrayList);
            adVar.mo40905a(500);
            if (!this.f11054r) {
                mo41096a(adVar);
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(0);
                }
            } else if (!m11093v()) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                }
            } else if (m11084a(this.f11044h)) {
                this.f11044h = SystemClock.elapsedRealtime();
                String a = m11082a(new C4122a(adVar, iPushActionListener));
                adVar.mo40906b(a);
                if (TextUtils.isEmpty(this.f11048l)) {
                    mo41098a(a, 20001);
                } else if (arrayList.size() < 0) {
                    mo41098a(a, 20002);
                } else if (arrayList.size() > 500) {
                    mo41098a(a, 20004);
                } else {
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((long) it.next().length()) > 70) {
                            mo41098a(a, 20003);
                            return;
                        }
                    }
                    mo41096a(adVar);
                    m11090d(a);
                }
            } else if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
            }
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(102);
        }
    }

    /* renamed from: a */
    public static boolean m11084a(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return j == -1 || elapsedRealtime <= j || elapsedRealtime >= j + C7265o0O000oo.OooO0o.OooO00o;
    }

    /* renamed from: a */
    public final void mo41098a(String str, int i) {
        C4122a c = m11088c(str);
        if (c != null) {
            c.mo41136a(i, new Object[0]);
        } else {
            C4146p.m11216d("PushClientManager", "notifyStatusChanged token is null");
        }
    }

    /* renamed from: a */
    private synchronized String m11082a(C4122a aVar) {
        int i;
        this.f11050n.put(this.f11051o, aVar);
        i = this.f11051o;
        this.f11051o = i + 1;
        return Integer.toString(i);
    }

    /* renamed from: a */
    public final void mo41092a(int i) {
        if (!C4041g.m10929a(i)) {
            C4146p.m11216d("PushClientManager", "切换环境失败，非法的环境：" + i);
            Context context = this.f11045i;
            C4146p.m11208a(context, "切换环境失败，非法的环境：" + i);
            return;
        }
        mo41096a(new C4033ab());
        C4041g gVar = new C4041g();
        gVar.mo40911b(i);
        mo41096a(gVar);
    }

    /* renamed from: b */
    public final void mo41115b(boolean z) {
        C4146p.m11209a(z);
        C4060z zVar = new C4060z();
        zVar.mo40939a(z ? 1 : 0);
        mo41096a(zVar);
    }

    /* renamed from: b */
    public final void mo41107b(int i) {
        if (i < 4 || m11092u() >= 1260) {
            C4146p.m11209a((i & 1) != 0);
            C4060z zVar = new C4060z();
            zVar.mo40939a(i);
            mo41096a(zVar);
            return;
        }
        C4146p.m11211b("PushClientManager", "current push version " + this.f11053q + " is not support this mode");
    }

    /* renamed from: a */
    public final void mo41103a(ArrayList<String> arrayList, IPushActionListener iPushActionListener) {
        Context context = this.f11045i;
        if (context != null) {
            C4035ad adVar = new C4035ad(true, null, context.getPackageName(), arrayList);
            adVar.mo40905a(500);
            if (!this.f11054r) {
                mo41096a(adVar);
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(0);
                }
            } else if (!m11093v()) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                }
            } else if (m11084a(this.f11043g)) {
                this.f11043g = SystemClock.elapsedRealtime();
                String a = m11082a(new C4122a(adVar, iPushActionListener));
                adVar.mo40906b(a);
                if (TextUtils.isEmpty(this.f11048l)) {
                    mo41098a(a, 20001);
                } else if (arrayList.size() < 0) {
                    mo41098a(a, 20002);
                } else {
                    if (arrayList.size() + mo41116c().size() > 500) {
                        mo41098a(a, 20004);
                        return;
                    }
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((long) it.next().length()) > 70) {
                            mo41098a(a, 20003);
                            return;
                        }
                    }
                    mo41096a(adVar);
                    m11090d(a);
                }
            } else if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
            }
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(102);
        }
    }

    /* renamed from: a */
    public final void mo41102a(String str, ArrayList<String> arrayList) {
        Context context = this.f11045i;
        if (context != null) {
            C4035ad adVar = new C4035ad(true, str, context.getPackageName(), arrayList);
            adVar.mo40905a(500);
            mo41096a(adVar);
        }
    }

    /* renamed from: a */
    public final void mo41094a(Intent intent, PushMessageCallback pushMessageCallback) {
        AbstractC4160y createReceiverCommand = this.f11055s.createReceiverCommand(intent);
        Context context = m11080a().f11045i;
        if (createReceiverCommand == null) {
            C4146p.m11204a("PushClientManager", "sendCommand, null command!");
            if (context != null) {
                C4146p.m11215c(context, "[执行指令失败]指令空！");
                return;
            }
            return;
        }
        AbstractC4064ab createReceiveTask = this.f11055s.createReceiveTask(createReceiverCommand);
        if (createReceiveTask == null) {
            C4146p.m11204a("PushClientManager", "sendCommand, null command task! pushCommand = " + createReceiverCommand);
            if (context != null) {
                C4146p.m11215c(context, "[执行指令失败]指令" + createReceiverCommand + "任务空！");
                return;
            }
            return;
        }
        if (context != null && !(createReceiverCommand instanceof C4050p)) {
            C4146p.m11208a(context, "[接收指令]" + createReceiverCommand);
        }
        createReceiveTask.mo40944a(pushMessageCallback);
        C4158w.m11278a((AbstractRunnableC4157v) createReceiveTask);
    }

    /* renamed from: a */
    public final void mo41096a(AbstractC4160y yVar) {
        Context context = m11080a().f11045i;
        if (yVar == null) {
            C4146p.m11204a("PushClientManager", "sendCommand, null command!");
            if (context != null) {
                C4146p.m11215c(context, "[执行指令失败]指令空！");
                return;
            }
            return;
        }
        AbstractRunnableC4157v createTask = this.f11055s.createTask(yVar);
        if (createTask == null) {
            C4146p.m11204a("PushClientManager", "sendCommand, null command task! pushCommand = " + yVar);
            if (context != null) {
                C4146p.m11215c(context, "[执行指令失败]指令" + yVar + "任务空！");
                return;
            }
            return;
        }
        C4146p.m11216d("PushClientManager", "client--sendCommand, command = " + yVar);
        C4158w.m11278a(createTask);
    }
}
