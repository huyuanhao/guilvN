package com.huawei.updatesdk.service.deamon.download;

import android.os.Handler;
import android.os.Message;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.service.download.bean.DownloadTask;
import com.huawei.updatesdk.support.p087pm.C1399g;
import java.lang.ref.WeakReference;

/* renamed from: com.huawei.updatesdk.service.deamon.download.c */
public final class HandlerC1339c extends Handler {

    /* renamed from: a */
    public WeakReference<DownloadService> f1594a;

    public HandlerC1339c(DownloadService downloadService) {
        this.f1594a = new WeakReference<>(downloadService);
    }

    /* renamed from: a */
    private void m1929a(DownloadTask downloadTask) {
        C1399g.m2134a(downloadTask.mo15998t(), downloadTask.mo16002w(), downloadTask);
    }

    /* renamed from: a */
    public void mo16148a(DownloadService downloadService, DownloadTask downloadTask) {
        downloadService.f1588a.mo16035c(downloadTask);
    }

    public void handleMessage(Message message) {
        String str;
        StringBuilder sb;
        String str2;
        DownloadService downloadService = this.f1594a.get();
        if (downloadService == null) {
            C1278a.m1584d("DownloadService", "handleMessage, but service object is null.");
            return;
        }
        super.handleMessage(message);
        Object obj = message.obj;
        if (obj != null && (obj instanceof DownloadTask)) {
            DownloadTask downloadTask = (DownloadTask) obj;
            int i = message.what;
            switch (i) {
                case 0:
                case 1:
                case 2:
                    C1337a.m1922a(downloadService, downloadTask, i);
                    return;
                case 3:
                    mo16148a(downloadService, downloadTask);
                    C1337a.m1922a(downloadService, downloadTask, message.what);
                    sb = new StringBuilder();
                    str2 = "task download canceled:";
                    sb.append(str2);
                    sb.append(downloadTask);
                    str = sb.toString();
                    break;
                case 4:
                    mo16148a(downloadService, downloadTask);
                    C1337a.m1922a(downloadService, downloadTask, message.what);
                    m1929a(downloadTask);
                    C1278a.m1580a("DownloadService", "task download completed:" + downloadTask);
                    return;
                case 5:
                    mo16148a(downloadService, downloadTask);
                    C1337a.m1922a(downloadService, downloadTask, message.what);
                    sb = new StringBuilder();
                    str2 = "task download failed:";
                    sb.append(str2);
                    sb.append(downloadTask);
                    str = sb.toString();
                    break;
                case 6:
                    if (downloadTask.mo15984g() == 6) {
                        downloadService.f1588a.mo16023a(1);
                    }
                    C1278a.m1580a("DownloadService", "Download downloadPaused task.getId():" + downloadTask.mo15993o());
                    C1337a.m1922a(downloadService, downloadTask, message.what);
                    return;
                default:
                    str = "Unkonw message " + message.what + " ,taskid:" + downloadTask.mo15993o();
                    break;
            }
            C1278a.m1584d("DownloadService", str);
        }
    }
}
