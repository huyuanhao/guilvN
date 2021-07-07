package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4278ba;
import com.xiaomi.push.C4418fe;
import s.h.e.l.l.C;

public class XMJobService extends Service {

    /* renamed from: a */
    public static Service f13070a;

    /* renamed from: a */
    public IBinder f13071a = null;

    @TargetApi(21)
    /* renamed from: com.xiaomi.push.service.XMJobService$a  reason: invalid class name */
    public static class jobJobServiceC4572a extends JobService {

        /* renamed from: a */
        public Binder f13072a;

        /* renamed from: a */
        public Handler f13073a;

        /* renamed from: com.xiaomi.push.service.XMJobService$a$a */
        public static class HandlerC4573a extends Handler {

            /* renamed from: a */
            public JobService f13074a;

            public HandlerC4573a(JobService jobService) {
                super(jobService.getMainLooper());
                this.f13074a = jobService;
            }

            public void handleMessage(Message message) {
                if (message.what == 1) {
                    JobParameters jobParameters = (JobParameters) message.obj;
                    AbstractC4163b.m11301a("Job finished " + jobParameters.getJobId());
                    this.f13074a.jobFinished(jobParameters, false);
                    if (jobParameters.getJobId() == 1) {
                        C4418fe.m12534a(false);
                    }
                }
            }
        }

        public jobJobServiceC4572a(Service service) {
            this.f13072a = null;
            this.f13072a = (Binder) C4278ba.m11772a(this, "onBind", new Intent());
            C4278ba.m11772a(this, "attachBaseContext", service);
        }

        public boolean onStartJob(JobParameters jobParameters) {
            AbstractC4163b.m11301a("Job started " + jobParameters.getJobId());
            Intent intent = new Intent(this, XMPushService.class);
            intent.setAction("com.xiaomi.push.timer");
            intent.setPackage(getPackageName());
            startService(intent);
            if (this.f13073a == null) {
                this.f13073a = new HandlerC4573a(this);
            }
            Handler handler = this.f13073a;
            handler.sendMessage(Message.obtain(handler, 1, jobParameters));
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            AbstractC4163b.m11301a("Job stop " + jobParameters.getJobId());
            return false;
        }
    }

    static {
        C.i(16777285);
    }

    /* renamed from: a */
    public static Service m13746a() {
        return f13070a;
    }

    public native IBinder onBind(Intent intent);

    public native void onCreate();

    public native void onDestroy();
}
