package com.xiaomi.push;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4418fe;
import com.xiaomi.push.service.XMJobService;

@TargetApi(21)
/* renamed from: com.xiaomi.push.fg */
public class C4421fg implements C4418fe.AbstractC4419a {

    /* renamed from: a */
    public JobScheduler f11825a;

    /* renamed from: a */
    public Context f11826a;

    /* renamed from: a */
    public boolean f11827a = false;

    public C4421fg(Context context) {
        this.f11826a = context;
        this.f11825a = (JobScheduler) context.getSystemService("jobscheduler");
    }

    @Override // com.xiaomi.push.C4418fe.AbstractC4419a, com.xiaomi.push.C4418fe.AbstractC4419a
    /* renamed from: a */
    public void mo41818a() {
        this.f11827a = false;
        this.f11825a.cancel(1);
    }

    /* renamed from: a */
    public void mo41821a(long j) {
        JobInfo.Builder builder = new JobInfo.Builder(1, new ComponentName(this.f11826a.getPackageName(), XMJobService.class.getName()));
        builder.setMinimumLatency(j);
        builder.setOverrideDeadline(j);
        builder.setRequiredNetworkType(1);
        builder.setPersisted(false);
        JobInfo build = builder.build();
        AbstractC4163b.m11305c("schedule Job = " + build.getId() + " in " + j);
        this.f11825a.schedule(builder.build());
    }

    @Override // com.xiaomi.push.C4418fe.AbstractC4419a
    /* renamed from: a */
    public void mo41819a(boolean z) {
        if (z || this.f11827a) {
            long b = (long) C4444ga.m12712b();
            if (z) {
                mo41818a();
                b -= SystemClock.elapsedRealtime() % b;
            }
            this.f11827a = true;
            mo41821a(b);
        }
    }

    @Override // com.xiaomi.push.C4418fe.AbstractC4419a, com.xiaomi.push.C4418fe.AbstractC4419a
    /* renamed from: a */
    public boolean m12548a() {
        return this.f11827a;
    }
}
