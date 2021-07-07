package com.tencent.bugly.beta.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.bugly.beta.global.C3222a;
import com.tencent.bugly.beta.global.C3226e;
import com.tencent.bugly.beta.p267ui.C3239c;
import com.tencent.bugly.beta.p267ui.C3242f;
import com.tencent.bugly.beta.p267ui.C3243g;
import com.tencent.bugly.beta.p267ui.C3244h;
import com.tencent.bugly.beta.upgrade.C3247c;
import com.tencent.bugly.proguard.C3319am;
import com.tencent.bugly.proguard.C3321an;
import java.util.concurrent.ConcurrentHashMap;

public class BetaReceiver extends BroadcastReceiver {
    public static String CONNECTIVITY_CHANGE = "android.net.conn.CONNECTIVITY_CHANGE";
    public static ConcurrentHashMap<String, C3221c> netListeners = new ConcurrentHashMap<>(3);
    public static int netStatus = 0;

    public static synchronized void addTask(DownloadTask downloadTask) {
        synchronized (BetaReceiver.class) {
            netStatus = C3222a.m7751a(C3226e.f7357E.f7406s);
            C3242f fVar = new C3242f();
            fVar.f7455n = downloadTask;
            netListeners.put(downloadTask.getDownloadUrl(), new C3221c(2, downloadTask, false, fVar));
        }
    }

    public synchronized void onReceive(final Context context, final Intent intent) {
        C3319am.m8340a().mo38398a(new Runnable() {
            /* class com.tencent.bugly.beta.download.BetaReceiver.RunnableC32181 */

            public void run() {
                try {
                    if (intent.getAction().equals(BetaReceiver.CONNECTIVITY_CHANGE)) {
                        int i = BetaReceiver.netStatus;
                        BetaReceiver.netStatus = C3222a.m7751a(context);
                        for (C3221c cVar : BetaReceiver.netListeners.values()) {
                            cVar.mo37902a(i, BetaReceiver.netStatus);
                        }
                    } else if (intent.getAction().equals(C3239c.f7439a.f7441c)) {
                        int intExtra = intent.getIntExtra("request", -1);
                        if (intExtra == 1) {
                            DownloadTask downloadTask = C3239c.f7439a.f7440b;
                            if (downloadTask != null) {
                                int status = downloadTask.getStatus();
                                if (status != 0) {
                                    if (status == 1) {
                                        C3222a.m7761a(C3226e.f7357E.f7406s, downloadTask.getSaveFile(), downloadTask.getMD5());
                                    } else if (status == 2) {
                                        BetaReceiver.netListeners.remove(downloadTask.getDownloadUrl());
                                        downloadTask.stop();
                                    } else if (!(status == 3 || status == 4 || status == 5)) {
                                    }
                                    if (C3247c.f7488a.f7492e == null && C3244h.f7461v != null) {
                                        C3244h.f7461v.mo38022a(downloadTask);
                                        return;
                                    }
                                }
                                BetaReceiver.addTask(downloadTask);
                                downloadTask.download();
                                if (C3247c.f7488a.f7492e == null) {
                                }
                            }
                        } else if (intExtra == 2) {
                            C3243g.m7794a(C3239c.f7439a.f7443e, true, true, 0);
                        }
                    }
                } catch (Exception e) {
                    if (!C3321an.m8353b(e)) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
