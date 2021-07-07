package com.taobao.accs.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.taobao.accs.common.Constants;
import com.taobao.accs.p259a.C3084a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3178j;

@TargetApi(21)
public class AccsJobService extends JobService {
    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        ALog.m7597d("AccsJobService", "onStartJob", new Object[0]);
        try {
            String packageName = getPackageName();
            Intent intent = new Intent();
            intent.setPackage(packageName);
            intent.setAction(Constants.ACTION_COMMAND);
            intent.putExtra("command", 201);
            intent.setClassName(packageName, C3178j.channelService);
            C3084a.m7226a(getApplicationContext(), intent);
        } catch (Throwable th) {
            ALog.m7598e("AccsJobService", "onStartJob", th, new Object[0]);
        }
        return false;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        try {
            Intent intent = new Intent();
            intent.setPackage(getPackageName());
            intent.setAction(Constants.ACTION_COMMAND);
            intent.putExtra("command", 201);
            intent.setClassName(getPackageName(), C3178j.channelService);
            C3084a.m7226a(getApplicationContext(), intent);
        } catch (Throwable th) {
            ALog.m7598e("AccsJobService", "onStopJob", th, new Object[0]);
        }
        return false;
    }
}
