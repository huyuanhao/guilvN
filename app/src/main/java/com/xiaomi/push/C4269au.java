package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.idtracking.C3681i;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import java.util.Map;

/* renamed from: com.xiaomi.push.au */
public class C4269au implements AbstractC4266ar {

    /* renamed from: a */
    public static volatile C4269au f11391a;

    /* renamed from: a */
    public AbstractC4266ar f11392a;

    public C4269au(Context context) {
        this.f11392a = C4268at.m11701a(context);
        AbstractC4163b.m11301a("create id manager is: " + this.f11392a);
    }

    /* renamed from: a */
    public static C4269au m11702a(Context context) {
        if (f11391a == null) {
            synchronized (C4269au.class) {
                if (f11391a == null) {
                    f11391a = new C4269au(context.getApplicationContext());
                }
            }
        }
        return f11391a;
    }

    /* renamed from: a */
    private String m11703a(String str) {
        return str == null ? "" : str;
    }

    @Override // com.xiaomi.push.AbstractC4266ar, com.xiaomi.push.AbstractC4266ar
    /* renamed from: a */
    public String mo41492a() {
        return m11703a(this.f11392a.mo41492a());
    }

    /* renamed from: a */
    public void mo41498a(Map<String, String> map) {
        if (map != null) {
            String a = mo41492a();
            if (!TextUtils.isEmpty(a)) {
                map.put("udid", a);
            }
            String b = mo41493b();
            if (!TextUtils.isEmpty(b)) {
                map.put(C3681i.f9652d, b);
            }
            String c = mo41494c();
            if (!TextUtils.isEmpty(c)) {
                map.put("vaid", c);
            }
            String d = mo41495d();
            if (!TextUtils.isEmpty(d)) {
                map.put("aaid", d);
            }
        }
    }

    @Override // com.xiaomi.push.AbstractC4266ar, com.xiaomi.push.AbstractC4266ar
    /* renamed from: a */
    public boolean m11706a() {
        return this.f11392a.m11689a();
    }

    @Override // com.xiaomi.push.AbstractC4266ar
    /* renamed from: b */
    public String mo41493b() {
        return m11703a(this.f11392a.mo41493b());
    }

    @Override // com.xiaomi.push.AbstractC4266ar
    /* renamed from: c */
    public String mo41494c() {
        return m11703a(this.f11392a.mo41494c());
    }

    @Override // com.xiaomi.push.AbstractC4266ar
    /* renamed from: d */
    public String mo41495d() {
        return m11703a(this.f11392a.mo41495d());
    }
}
