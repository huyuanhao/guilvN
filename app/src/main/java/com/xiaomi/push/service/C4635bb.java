package com.xiaomi.push.service;

import android.content.SharedPreferences;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4256al;
import com.xiaomi.push.C4307c;
import com.xiaomi.push.C4385el;
import com.xiaomi.push.C4387em;
import com.xiaomi.push.C4471gx;
import com.xiaomi.push.C4506i;
import com.xiaomi.push.C4688t;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.service.bb */
public class C4635bb {

    /* renamed from: a */
    public static C4635bb f13280a = new C4635bb();

    /* renamed from: a */
    public static String f13281a;

    /* renamed from: a */
    public C4256al.AbstractC4258b f13282a;

    /* renamed from: a */
    public C4385el.C4386a f13283a;

    /* renamed from: a */
    public List<AbstractC4636a> f13284a = new ArrayList();

    /* renamed from: com.xiaomi.push.service.bb$a */
    public static abstract class AbstractC4636a {
        /* renamed from: a */
        public void mo42687a(C4385el.C4386a aVar) {
        }

        /* renamed from: a */
        public void mo41997a(C4387em.C4389b bVar) {
        }
    }

    /* renamed from: a */
    public static C4635bb mo42697a() {
        return f13280a;
    }

    /* renamed from: a */
    public static synchronized String m14028a() {
        String str;
        synchronized (C4635bb.class) {
            if (f13281a == null) {
                SharedPreferences sharedPreferences = C4688t.m14218a().getSharedPreferences("XMPushServiceConfig", 0);
                String string = sharedPreferences.getString("DeviceUUID", null);
                f13281a = string;
                if (string == null) {
                    String a = C4506i.m13034a(C4688t.m14218a(), false);
                    f13281a = a;
                    if (a != null) {
                        sharedPreferences.edit().putString("DeviceUUID", f13281a).commit();
                    }
                }
            }
            str = f13281a;
        }
        return str;
    }

    /* renamed from: b */
    private void m14031b() {
        if (this.f13283a == null) {
            m14033d();
        }
    }

    /* renamed from: c */
    private void m14032c() {
        if (this.f13282a == null) {
            C4637bc bcVar = new C4637bc(this);
            this.f13282a = bcVar;
            C4471gx.m12835a(bcVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14033d() {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.xiaomi.push.C4688t.m14218a()     // Catch:{ Exception -> 0x0027, all -> 0x0023 }
            java.lang.String r2 = "XMCloudCfg"
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ Exception -> 0x0027, all -> 0x0023 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0027, all -> 0x0023 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0027, all -> 0x0023 }
            com.xiaomi.push.b r0 = com.xiaomi.push.C4277b.m11742a(r2)     // Catch:{ Exception -> 0x0021 }
            com.xiaomi.push.el$a r0 = com.xiaomi.push.C4385el.C4386a.m12199b(r0)     // Catch:{ Exception -> 0x0021 }
            r4.f13283a = r0     // Catch:{ Exception -> 0x0021 }
            r2.close()     // Catch:{ Exception -> 0x0021 }
        L_0x001d:
            com.xiaomi.push.C4693y.m14236a(r2)
            goto L_0x0043
        L_0x0021:
            r0 = move-exception
            goto L_0x002a
        L_0x0023:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L_0x0050
        L_0x0027:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x002a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004f }
            r1.<init>()     // Catch:{ all -> 0x004f }
            java.lang.String r3 = "load config failure: "
            r1.append(r3)     // Catch:{ all -> 0x004f }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x004f }
            r1.append(r0)     // Catch:{ all -> 0x004f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x004f }
            com.xiaomi.channel.commonutils.logger.AbstractC4163b.m11301a(r0)     // Catch:{ all -> 0x004f }
            goto L_0x001d
        L_0x0043:
            com.xiaomi.push.el$a r0 = r4.f13283a
            if (r0 != 0) goto L_0x004e
            com.xiaomi.push.el$a r0 = new com.xiaomi.push.el$a
            r0.<init>()
            r4.f13283a = r0
        L_0x004e:
            return
        L_0x004f:
            r0 = move-exception
        L_0x0050:
            com.xiaomi.push.C4693y.m14236a(r2)
            goto L_0x0055
        L_0x0054:
            throw r0
        L_0x0055:
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4635bb.m14033d():void");
    }

    /* renamed from: e */
    private void m14034e() {
        try {
            if (this.f13283a != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(C4688t.m14218a().openFileOutput("XMCloudCfg", 0));
                C4307c a = C4307c.m11880a(bufferedOutputStream);
                this.f13283a.mo41683a(a);
                a.m11892a();
                bufferedOutputStream.close();
            }
        } catch (Exception e) {
            AbstractC4163b.m11301a("save config failure: " + e.getMessage());
        }
    }

    /* renamed from: a */
    public int m14035a() {
        m14031b();
        C4385el.C4386a aVar = this.f13283a;
        if (aVar != null) {
            return aVar.mo41695c();
        }
        return 0;
    }

    /* renamed from: a */
    public C4385el.C4386a m14036a() {
        m14031b();
        return this.f13283a;
    }

    /* renamed from: a */
    public synchronized void m14037a() {
        this.f13284a.clear();
    }

    /* renamed from: a */
    public void mo42698a(C4387em.C4389b bVar) {
        AbstractC4636a[] aVarArr;
        if (bVar.m12274d() && bVar.mo41724d() > m14035a()) {
            m14032c();
        }
        synchronized (this) {
            aVarArr = (AbstractC4636a[]) this.f13284a.toArray(new AbstractC4636a[this.f13284a.size()]);
        }
        for (AbstractC4636a aVar : aVarArr) {
            aVar.mo41997a(bVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo42699a(AbstractC4636a aVar) {
        this.f13284a.add(aVar);
    }
}
