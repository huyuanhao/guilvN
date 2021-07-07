package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1299b;
import com.umeng.commonsdk.proguard.C3555ac;
import com.umeng.commonsdk.proguard.C3633w;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.proto.C3708a;
import com.umeng.commonsdk.statistics.proto.C3722c;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.e */
public class C3676e {

    /* renamed from: a */
    public static final long f9631a = 86400000;

    /* renamed from: b */
    public static C3676e f9632b;

    /* renamed from: j */
    public static Object f9633j = new Object();

    /* renamed from: c */
    public final String f9634c = "umeng_it.cache";

    /* renamed from: d */
    public File f9635d;

    /* renamed from: e */
    public C3722c f9636e = null;

    /* renamed from: f */
    public long f9637f;

    /* renamed from: g */
    public long f9638g;

    /* renamed from: h */
    public Set<AbstractC3672a> f9639h = new HashSet();

    /* renamed from: i */
    public C3677a f9640i = null;

    /* renamed from: com.umeng.commonsdk.statistics.idtracking.e$a */
    public static class C3677a {

        /* renamed from: a */
        public Context f9641a;

        /* renamed from: b */
        public Set<String> f9642b = new HashSet();

        public C3677a(Context context) {
            this.f9641a = context;
        }

        /* renamed from: a */
        public synchronized boolean mo39254a(String str) {
            return !this.f9642b.contains(str);
        }

        /* renamed from: b */
        public synchronized void mo39256b(String str) {
            this.f9642b.add(str);
        }

        /* renamed from: c */
        public void mo39257c(String str) {
            this.f9642b.remove(str);
        }

        /* renamed from: a */
        public synchronized void mo39253a() {
            if (!this.f9642b.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (String str : this.f9642b) {
                    sb.append(str);
                    sb.append(AbstractC1299b.COMMA);
                }
                sb.deleteCharAt(sb.length() - 1);
                PreferenceWrapper.getDefault(this.f9641a).edit().putString("invld_id", sb.toString()).commit();
            }
        }

        /* renamed from: b */
        public synchronized void mo39255b() {
            String[] split;
            String string = PreferenceWrapper.getDefault(this.f9641a).getString("invld_id", null);
            if (!TextUtils.isEmpty(string) && (split = string.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) != null) {
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f9642b.add(str);
                    }
                }
            }
        }
    }

    public C3676e(Context context) {
        this.f9635d = new File(context.getFilesDir(), "umeng_it.cache");
        this.f9638g = 86400000;
        C3677a aVar = new C3677a(context);
        this.f9640i = aVar;
        aVar.mo39255b();
    }

    /* renamed from: a */
    public static synchronized C3676e m9914a(Context context) {
        C3676e eVar;
        synchronized (C3676e.class) {
            if (f9632b == null) {
                C3676e eVar2 = new C3676e(context);
                f9632b = eVar2;
                eVar2.m9916a(new C3678f(context));
                f9632b.m9916a(new C3673b(context));
                f9632b.m9916a(new C3691s(context));
                f9632b.m9916a(new C3675d(context));
                f9632b.m9916a(new C3674c(context));
                f9632b.m9916a(new C3679g(context));
                f9632b.m9916a(new C3683k());
                f9632b.m9916a(new C3692t(context));
                f9632b.m9916a(new C3681i(context));
                C3690r rVar = new C3690r(context);
                if (!TextUtils.isEmpty(rVar.mo39245f())) {
                    f9632b.m9916a(rVar);
                }
                C3682j jVar = new C3682j(context);
                if (jVar.mo39258g()) {
                    f9632b.m9916a(jVar);
                    f9632b.m9916a(new C3680h(context));
                    jVar.mo39260i();
                }
                if (SdkVersion.SDK_TYPE != 1) {
                    f9632b.m9916a(new C3689q(context));
                    f9632b.m9916a(new C3686n(context));
                    f9632b.m9916a(new C3688p(context));
                    f9632b.m9916a(new C3687o(context));
                    f9632b.m9916a(new C3685m(context));
                    f9632b.m9916a(new C3684l(context));
                }
                f9632b.mo39251e();
            }
            eVar = f9632b;
        }
        return eVar;
    }

    /* renamed from: g */
    private synchronized void m9917g() {
        C3722c cVar = new C3722c();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (AbstractC3672a aVar : this.f9639h) {
            if (aVar.mo39242c()) {
                if (aVar.mo39243d() != null) {
                    hashMap.put(aVar.mo39241b(), aVar.mo39243d());
                }
                if (aVar.mo39244e() != null && !aVar.mo39244e().isEmpty()) {
                    arrayList.addAll(aVar.mo39244e());
                }
            }
        }
        cVar.mo39383a(arrayList);
        cVar.mo39384a(hashMap);
        synchronized (this) {
            this.f9636e = cVar;
        }
    }

    /* renamed from: h */
    private C3722c m9918h() {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e;
        synchronized (f9633j) {
            if (!this.f9635d.exists()) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(this.f9635d);
                try {
                    byte[] readStreamToByteArray = HelperUtils.readStreamToByteArray(fileInputStream);
                    C3722c cVar = new C3722c();
                    new C3633w().mo39073a(cVar, readStreamToByteArray);
                    HelperUtils.safeClose(fileInputStream);
                    return cVar;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        e.printStackTrace();
                        HelperUtils.safeClose(fileInputStream);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        HelperUtils.safeClose(fileInputStream);
                        throw th;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                fileInputStream = null;
                e.printStackTrace();
                HelperUtils.safeClose(fileInputStream);
                return null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                HelperUtils.safeClose(fileInputStream);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public synchronized C3722c mo39248b() {
        return this.f9636e;
    }

    /* renamed from: c */
    public String mo39249c() {
        return null;
    }

    /* renamed from: d */
    public synchronized void mo39250d() {
        boolean z = false;
        for (AbstractC3672a aVar : this.f9639h) {
            if (aVar.mo39242c()) {
                if (aVar.mo39244e() != null && !aVar.mo39244e().isEmpty()) {
                    aVar.mo39239a((List<C3708a>) null);
                    z = true;
                }
            }
        }
        if (z) {
            this.f9636e.mo39389b(false);
            mo39252f();
        }
    }

    /* renamed from: e */
    public synchronized void mo39251e() {
        C3722c h = m9918h();
        if (h != null) {
            ArrayList<AbstractC3672a> arrayList = new ArrayList(this.f9639h.size());
            synchronized (this) {
                this.f9636e = h;
                for (AbstractC3672a aVar : this.f9639h) {
                    aVar.mo39238a(this.f9636e);
                    if (!aVar.mo39242c()) {
                        arrayList.add(aVar);
                    }
                }
                for (AbstractC3672a aVar2 : arrayList) {
                    this.f9639h.remove(aVar2);
                }
                m9917g();
            }
        }
    }

    /* renamed from: f */
    public synchronized void mo39252f() {
        if (this.f9636e != null) {
            m9915a(this.f9636e);
        }
    }

    /* renamed from: a */
    private boolean m9916a(AbstractC3672a aVar) {
        if (this.f9640i.mo39254a(aVar.mo39241b())) {
            return this.f9639h.add(aVar);
        }
        if (!AnalyticsConstants.UM_DEBUG) {
            return false;
        }
        MLog.m9811w("invalid domain: " + aVar.mo39241b());
        return false;
    }

    /* renamed from: a */
    public void mo39247a(long j) {
        this.f9638g = j;
    }

    /* renamed from: a */
    public synchronized void mo39246a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f9637f >= this.f9638g) {
            boolean z = false;
            for (AbstractC3672a aVar : this.f9639h) {
                if (aVar.mo39242c()) {
                    if (aVar.mo39240a()) {
                        z = true;
                        if (!aVar.mo39242c()) {
                            this.f9640i.mo39256b(aVar.mo39241b());
                        }
                    }
                }
            }
            if (z) {
                m9917g();
                this.f9640i.mo39253a();
                mo39252f();
            }
            this.f9637f = currentTimeMillis;
        }
    }

    /* renamed from: a */
    private void m9915a(C3722c cVar) {
        byte[] a;
        synchronized (f9633j) {
            if (cVar != null) {
                try {
                    synchronized (this) {
                        a = new C3555ac().mo38869a(cVar);
                    }
                    if (a != null) {
                        HelperUtils.writeFile(this.f9635d, a);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
