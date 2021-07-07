package com.vivo.push.p282c;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.p118pd.sdk.C5982OoooOoO;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.vivo.push.util.C4146p;
import java.util.List;
import java.util.Map;

/* renamed from: com.vivo.push.c.y */
public final class RunnableC4097y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f10996a;

    /* renamed from: b */
    public final /* synthetic */ Map f10997b;

    /* renamed from: c */
    public final /* synthetic */ C4092t f10998c;

    public RunnableC4097y(C4092t tVar, Context context, Map map) {
        this.f10998c = tVar;
        this.f10996a = context;
        this.f10997b = map;
    }

    public final void run() {
        String packageName = this.f10996a.getPackageName();
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) this.f10996a.getSystemService(C5982OoooOoO.OooO0o0)).getRunningTasks(100);
            if (runningTasks != null) {
                for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
                    ComponentName componentName = runningTaskInfo.topActivity;
                    if (componentName.getPackageName().equals(packageName)) {
                        C4146p.m11216d("OnNotificationClickTask", "topClassName=" + componentName.getClassName());
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        intent.setFlags(270532608);
                        Intent unused = C4092t.m11045b(intent, this.f10997b);
                        this.f10996a.startActivity(intent);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            C4146p.m11205a("OnNotificationClickTask", "start recentIntent is error", e);
        }
        Intent launchIntentForPackage = this.f10996a.getPackageManager().getLaunchIntentForPackage(this.f10996a.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(CommonNetImpl.FLAG_AUTH);
            Intent unused2 = C4092t.m11045b(launchIntentForPackage, this.f10997b);
            this.f10996a.startActivity(launchIntentForPackage);
            return;
        }
        C4146p.m11204a("OnNotificationClickTask", "LaunchIntent is null");
    }
}
