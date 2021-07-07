package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.push.service.C4592aa;
import java.util.HashMap;

/* renamed from: com.xiaomi.push.es */
public final class C4404es {

    /* renamed from: a */
    public static volatile C4404es f11793a;

    /* renamed from: a */
    public int f11794a;

    /* renamed from: a */
    public Context f11795a;

    /* renamed from: a */
    public AbstractC4408ew f11796a;

    /* renamed from: a */
    public String f11797a;

    /* renamed from: a */
    public HashMap<EnumC4406eu, AbstractC4407ev> f11798a;

    /* renamed from: b */
    public String f11799b;

    public C4404es(Context context) {
        HashMap<EnumC4406eu, AbstractC4407ev> hashMap = new HashMap<>();
        this.f11798a = hashMap;
        this.f11795a = context;
        hashMap.put(EnumC4406eu.SERVICE_ACTION, new C4410ey());
        this.f11798a.put(EnumC4406eu.SERVICE_COMPONENT, new C4411ez());
        this.f11798a.put(EnumC4406eu.ACTIVITY, new C4402eq());
        this.f11798a.put(EnumC4406eu.PROVIDER, new C4409ex());
    }

    /* renamed from: a */
    public static C4404es m12465a(Context context) {
        if (f11793a == null) {
            synchronized (C4404es.class) {
                if (f11793a == null) {
                    f11793a = new C4404es(context);
                }
            }
        }
        return f11793a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12467a(EnumC4406eu euVar, Context context, C4403er erVar) {
        this.f11798a.get(euVar).mo41788a(context, erVar);
    }

    /* renamed from: a */
    public static boolean m12468a(Context context) {
        return C4592aa.m13885a(context, context.getPackageName());
    }

    /* renamed from: a */
    public int mo41798a() {
        return this.f11794a;
    }

    /* renamed from: a */
    public AbstractC4408ew m12470a() {
        return this.f11796a;
    }

    /* renamed from: a */
    public String m12471a() {
        return this.f11797a;
    }

    /* renamed from: a */
    public void mo41799a(int i) {
        this.f11794a = i;
    }

    /* renamed from: a */
    public void mo41800a(Context context, String str, int i, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            C4400eo.m12445a(context, "" + str, 1008, "A receive a incorrect message");
            return;
        }
        mo41799a(i);
        C4251ai.m11641a(this.f11795a).mo41474a(new RunnableC4405et(this, str, context, str2, str3));
    }

    /* renamed from: a */
    public void mo41801a(EnumC4406eu euVar, Context context, Intent intent, String str) {
        if (euVar != null) {
            this.f11798a.get(euVar).mo41787a(context, intent, str);
        } else {
            C4400eo.m12445a(context, "null", 1008, "A receive a incorrect message with empty type");
        }
    }

    /* renamed from: a */
    public void mo41802a(AbstractC4408ew ewVar) {
        this.f11796a = ewVar;
    }

    /* renamed from: a */
    public void mo41803a(String str) {
        this.f11797a = str;
    }

    /* renamed from: a */
    public void mo41804a(String str, String str2, int i, AbstractC4408ew ewVar) {
        mo41803a(str);
        mo41806b(str2);
        mo41799a(i);
        mo41802a(ewVar);
    }

    /* renamed from: b */
    public String mo41805b() {
        return this.f11799b;
    }

    /* renamed from: b */
    public void mo41806b(String str) {
        this.f11799b = str;
    }
}
