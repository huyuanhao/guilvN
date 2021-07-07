package com.taobao.accs.net;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.taobao.accs.internal.AccsJobService;

/* renamed from: com.taobao.accs.net.r */
public class C3154r extends AbstractC3141f {
    public static final int DEAMON_JOB_ID = 2051;
    public static final int HB_JOB_ID = 2050;

    public C3154r(Context context) {
        super(context);
    }

    @Override // com.taobao.accs.net.AbstractC3141f
    /* renamed from: a */
    public void mo37644a(int i) {
        long j = (long) (i * 1000);
        ((JobScheduler) this.f7032a.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(2050, new ComponentName(this.f7032a.getPackageName(), AccsJobService.class.getName())).setMinimumLatency(j).setOverrideDeadline(j).setRequiredNetworkType(1).build());
    }
}
