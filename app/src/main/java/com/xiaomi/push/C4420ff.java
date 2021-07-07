package com.xiaomi.push;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4418fe;

/* renamed from: com.xiaomi.push.ff */
public class C4420ff implements C4418fe.AbstractC4419a {

    /* renamed from: a */
    public volatile long f11822a = 0;

    /* renamed from: a */
    public PendingIntent f11823a = null;

    /* renamed from: a */
    public Context f11824a = null;

    public C4420ff(Context context) {
        this.f11824a = context;
    }

    /* renamed from: a */
    private void m12539a(AlarmManager alarmManager, long j, PendingIntent pendingIntent) {
        try {
            AlarmManager.class.getMethod("setExact", Integer.TYPE, Long.TYPE, PendingIntent.class).invoke(alarmManager, 0, Long.valueOf(j), pendingIntent);
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
        }
    }

    @Override // com.xiaomi.push.C4418fe.AbstractC4419a, com.xiaomi.push.C4418fe.AbstractC4419a
    /* renamed from: a */
    public long mo41818a() {
        return (long) C4444ga.m12712b();
    }

    @Override // com.xiaomi.push.C4418fe.AbstractC4419a, com.xiaomi.push.C4418fe.AbstractC4419a
    /* renamed from: a */
    public void m12541a() {
        if (this.f11823a != null) {
            try {
                ((AlarmManager) this.f11824a.getSystemService("alarm")).cancel(this.f11823a);
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f11823a = null;
                AbstractC4163b.m11305c("unregister timer");
                this.f11822a = 0;
                throw th;
            }
            this.f11823a = null;
            AbstractC4163b.m11305c("unregister timer");
            this.f11822a = 0;
        }
        this.f11822a = 0;
    }

    /* renamed from: a */
    public void mo41820a(Intent intent, long j) {
        AlarmManager alarmManager = (AlarmManager) this.f11824a.getSystemService("alarm");
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f11824a, 0, intent, 0);
        this.f11823a = broadcast;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            C4278ba.m11772a(alarmManager, "setExactAndAllowWhileIdle", 0, Long.valueOf(j), this.f11823a);
        } else if (i >= 19) {
            m12539a(alarmManager, j, broadcast);
        } else {
            alarmManager.set(0, j, broadcast);
        }
        AbstractC4163b.m11305c("register timer " + j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r7.f11822a < java.lang.System.currentTimeMillis()) goto L_0x0033;
     */
    @Override // com.xiaomi.push.C4418fe.AbstractC4419a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo41819a(boolean r8) {
        /*
            r7 = this;
            long r0 = r7.mo41818a()
            r2 = 0
            if (r8 != 0) goto L_0x000f
            long r4 = r7.f11822a
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x000f
            return
        L_0x000f:
            if (r8 == 0) goto L_0x0014
            r7.m12541a()
        L_0x0014:
            if (r8 != 0) goto L_0x002d
            long r4 = r7.f11822a
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x001d
            goto L_0x002d
        L_0x001d:
            long r2 = r7.f11822a
            long r2 = r2 + r0
            r7.f11822a = r2
            long r2 = r7.f11822a
            long r4 = java.lang.System.currentTimeMillis()
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x003a
            goto L_0x0033
        L_0x002d:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 % r0
            long r0 = r0 - r2
        L_0x0033:
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 + r0
            r7.f11822a = r2
        L_0x003a:
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r0 = com.xiaomi.push.service.AbstractC4621aq.f13236o
            r8.<init>(r0)
            android.content.Context r0 = r7.f11824a
            java.lang.String r0 = r0.getPackageName()
            r8.setPackage(r0)
            long r0 = r7.f11822a
            r7.mo41820a(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4420ff.mo41819a(boolean):void");
    }

    @Override // com.xiaomi.push.C4418fe.AbstractC4419a, com.xiaomi.push.C4418fe.AbstractC4419a
    /* renamed from: a */
    public boolean m12544a() {
        return this.f11822a != 0;
    }
}
