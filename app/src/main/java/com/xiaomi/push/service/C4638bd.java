package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.react.bridge.BaseJavaModule;
import com.megvii.apo.PhoneFingerManager;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4248af;
import com.xiaomi.push.C4251ai;
import com.xiaomi.push.C4274az;
import com.xiaomi.push.C4570r;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.xiaomi.push.service.bd */
public final class C4638bd implements AbstractC4601af {

    /* renamed from: a */
    public static volatile C4638bd f13287a;

    /* renamed from: a */
    public long f13288a;

    /* renamed from: a */
    public Context f13289a;

    /* renamed from: a */
    public SharedPreferences f13290a;

    /* renamed from: a */
    public ConcurrentHashMap<String, AbstractRunnableC4639a> f13291a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public volatile boolean f13292a = false;

    /* renamed from: com.xiaomi.push.service.bd$a */
    public static abstract class AbstractRunnableC4639a implements Runnable {

        /* renamed from: a */
        public long f13293a;

        /* renamed from: a */
        public String f13294a;

        public AbstractRunnableC4639a(String str, long j) {
            this.f13294a = str;
            this.f13293a = j;
        }

        /* renamed from: a */
        public abstract void mo42703a(C4638bd bdVar);

        public void run() {
            if (C4638bd.f13287a != null) {
                Context context = C4638bd.f13287a.f13289a;
                if (C4274az.m11736c(context)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    SharedPreferences sharedPreferences = C4638bd.f13287a.f13290a;
                    if (currentTimeMillis - sharedPreferences.getLong(":ts-" + this.f13294a, 0) > this.f13293a || C4248af.m11634a(context)) {
                        SharedPreferences.Editor edit = C4638bd.f13287a.f13290a.edit();
                        C4570r.m13744a(edit.putLong(":ts-" + this.f13294a, System.currentTimeMillis()));
                        mo42703a(C4638bd.f13287a);
                    }
                }
            }
        }
    }

    public C4638bd(Context context) {
        this.f13289a = context.getApplicationContext();
        this.f13290a = context.getSharedPreferences(BaseJavaModule.METHOD_TYPE_SYNC, 0);
    }

    /* renamed from: a */
    public static C4638bd m14046a(Context context) {
        if (f13287a == null) {
            synchronized (C4638bd.class) {
                if (f13287a == null) {
                    f13287a = new C4638bd(context);
                }
            }
        }
        return f13287a;
    }

    /* renamed from: a */
    public String mo42700a(String str, String str2) {
        SharedPreferences sharedPreferences = this.f13290a;
        return sharedPreferences.getString(str + Constants.COLON_SEPARATOR + str2, "");
    }

    @Override // com.xiaomi.push.service.AbstractC4601af
    /* renamed from: a */
    public void m14050a() {
        if (!this.f13292a) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f13288a >= PhoneFingerManager.PER_HOUR_MILLISECOND) {
                this.f13288a = currentTimeMillis;
                this.f13292a = true;
                C4251ai.m11641a(this.f13289a).mo41475a(new RunnableC4640be(this), (int) (Math.random() * 10.0d));
            }
        }
    }

    /* renamed from: a */
    public void mo42701a(AbstractRunnableC4639a aVar) {
        if (this.f13291a.putIfAbsent(aVar.f13294a, aVar) == null) {
            C4251ai.m11641a(this.f13289a).mo41475a(aVar, ((int) (Math.random() * 30.0d)) + 10);
        }
    }

    /* renamed from: a */
    public void mo42702a(String str, String str2, String str3) {
        SharedPreferences.Editor edit = f13287a.f13290a.edit();
        C4570r.m13744a(edit.putString(str + Constants.COLON_SEPARATOR + str2, str3));
    }
}
