package com.qiyukf.nimlib.p183g;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.p118pd.sdk.C1IlLiL1;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.service.NimService;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import com.umeng.socialize.net.dplus.CommonNetImpl;

/* renamed from: com.qiyukf.nimlib.g.a */
public class C2247a {

    /* renamed from: a */
    public long f4483a;

    /* renamed from: b */
    public long f4484b;

    /* renamed from: c */
    public boolean f4485c;

    /* renamed from: a */
    public static void m4702a(Context context, long j) {
        PendingIntent service;
        C1709a.m3018d("service", "start keep alive alarm");
        Context applicationContext = context.getApplicationContext();
        AlarmManager alarmManager = (AlarmManager) applicationContext.getSystemService("alarm");
        if (alarmManager != null && (service = PendingIntent.getService(applicationContext, 0, NimService.m5141a(applicationContext), 134217728)) != null) {
            try {
                if (Build.VERSION.SDK_INT >= 19) {
                    alarmManager.setExact(2, SystemClock.elapsedRealtime() + j, service);
                } else {
                    alarmManager.set(2, SystemClock.elapsedRealtime() + j, service);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo34874a() {
    }

    /* renamed from: a */
    public final void mo34875a(boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z) {
            this.f4484b = elapsedRealtime;
            return;
        }
        this.f4483a = elapsedRealtime;
        this.f4485c = false;
    }

    /* renamed from: b */
    public void mo34876b() {
    }

    /* renamed from: c */
    public final void mo34877c() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!this.f4485c) {
            long j = this.f4483a;
            if (elapsedRealtime - j < C1IlLiL1.f22763OooO0OO) {
                long j2 = this.f4484b;
                if (elapsedRealtime - j2 < 250000) {
                    m4702a(C2180b.m4471a(), Math.max(Math.min(250000 - (elapsedRealtime - j2), C1IlLiL1.f22763OooO0OO - (elapsedRealtime - j)), (long) TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE));
                    return;
                }
            }
            this.f4485c = true;
            mo34874a();
            m4702a(C2180b.m4471a(), TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
            return;
        }
        C1709a.m3011a("core", "reader idle timeout.");
        mo34876b();
    }

    /* renamed from: d */
    public final void mo34878d() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f4484b = elapsedRealtime;
        this.f4483a = elapsedRealtime;
        this.f4485c = false;
        m4702a(C2180b.m4471a(), C1IlLiL1.f22763OooO0OO);
    }

    /* renamed from: e */
    public final void mo34879e() {
        PendingIntent service;
        Context a = C2180b.m4471a();
        C1709a.m3018d("service", "stop alarm");
        Context applicationContext = a.getApplicationContext();
        AlarmManager alarmManager = (AlarmManager) applicationContext.getSystemService("alarm");
        if (!(alarmManager == null || (service = PendingIntent.getService(applicationContext, 0, NimService.m5141a(applicationContext), CommonNetImpl.FLAG_AUTH)) == null)) {
            alarmManager.cancel(service);
        }
        this.f4483a = 0;
        this.f4484b = 0;
        this.f4485c = false;
    }
}
