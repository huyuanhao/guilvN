package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.C4251ai;
import com.xiaomi.push.C4312cd;
import com.xiaomi.push.service.C4605ah;
import com.xiaomi.push.service.C4641bf;

/* renamed from: com.xiaomi.push.br */
public class C4298br {

    /* renamed from: a */
    public static volatile C4298br f11447a;

    /* renamed from: a */
    public Context f11448a;

    /* renamed from: a */
    public C4251ai.AbstractRunnableC4252a f11449a = new C4299bs(this);

    /* renamed from: a */
    public AbstractC4320cg f11450a;

    /* renamed from: a */
    public AbstractC4321ch f11451a;

    /* renamed from: a */
    public final String f11452a = "push_stat_sp";

    /* renamed from: b */
    public C4251ai.AbstractRunnableC4252a f11453b = new C4300bt(this);

    /* renamed from: b */
    public final String f11454b = "upload_time";

    /* renamed from: c */
    public C4251ai.AbstractRunnableC4252a f11455c = new C4301bu(this);

    /* renamed from: c */
    public final String f11456c = "delete_time";

    /* renamed from: d */
    public final String f11457d = "check_time";

    /* renamed from: e */
    public String f11458e;

    /* renamed from: f */
    public String f11459f;

    public C4298br(Context context) {
        this.f11448a = context;
    }

    /* renamed from: a */
    public static C4298br m11843a(Context context) {
        if (f11447a == null) {
            synchronized (C4298br.class) {
                if (f11447a == null) {
                    f11447a = new C4298br(context);
                }
            }
        }
        return f11447a;
    }

    /* renamed from: a */
    private boolean mo41533a() {
        return C4605ah.m13919a(this.f11448a).mo42661a(EnumC4499ht.StatDataSwitch.mo42043a(), true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11848b(String str) {
        SharedPreferences.Editor edit = this.f11448a.getSharedPreferences("push_stat_sp", 0).edit();
        edit.putLong(str, System.currentTimeMillis());
        C4570r.m13744a(edit);
    }

    /* renamed from: c */
    private String m11849c() {
        return this.f11448a.getDatabasePath(C4302bv.f11465a).getAbsolutePath();
    }

    /* renamed from: a */
    public String m11850a() {
        return this.f11458e;
    }

    /* renamed from: a */
    public void mo41534a(C4312cd.AbstractRunnableC4313a aVar) {
        C4312cd.m11921a(this.f11448a).mo41575a(aVar);
    }

    /* renamed from: a */
    public void mo41535a(C4498hs hsVar) {
        if (mo41533a() && C4641bf.m14058a(hsVar.mo42031e())) {
            mo41534a(C4309ca.m11917a(this.f11448a, m11849c(), hsVar));
        }
    }

    /* renamed from: a */
    public void mo41536a(String str) {
        if (mo41533a() && !TextUtils.isEmpty(str)) {
            mo41535a(C4322ci.m11952a(this.f11448a, str));
        }
    }

    /* renamed from: a */
    public void mo41537a(String str, String str2, Boolean bool) {
        if (this.f11450a == null) {
            return;
        }
        if (bool.booleanValue()) {
            this.f11450a.mo41587a(this.f11448a, str2, str);
        } else {
            this.f11450a.mo41588b(this.f11448a, str2, str);
        }
    }

    /* renamed from: b */
    public String mo41538b() {
        return this.f11459f;
    }
}
