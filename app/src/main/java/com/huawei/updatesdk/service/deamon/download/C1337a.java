package com.huawei.updatesdk.service.deamon.download;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.updatesdk.sdk.service.download.bean.DownloadTask;
import com.huawei.updatesdk.sdk.service.p075b.C1296b;
import com.huawei.updatesdk.support.p081a.C1365a;
import com.huawei.updatesdk.support.p084d.C1375c;

/* renamed from: com.huawei.updatesdk.service.deamon.download.a */
public final class C1337a {
    /* renamed from: a */
    public static final String m1921a() {
        return C1365a.m2024a() + ".service.downloadservice.Receiver";
    }

    /* renamed from: a */
    public static void m1922a(Context context, DownloadTask downloadTask, int i) {
        if (context != null) {
            Intent intent = new Intent();
            String a = m1921a();
            if (downloadTask != null) {
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                downloadTask.mo15966b(bundle2);
                bundle.putBundle("downloadtask.all", bundle2);
                bundle.putInt("downloadtask.status", i);
                intent.putExtras(bundle);
                if (i == 2) {
                    a = m1923b();
                }
            }
            C1296b a2 = C1296b.m1655a(intent);
            if (m1921a().equals(a)) {
                C1375c.m2059a().mo16205a(a2);
            } else {
                C1375c.m2059a().mo16206b(a2);
            }
        }
    }

    /* renamed from: b */
    public static final String m1923b() {
        return C1365a.m2024a() + ".service.downloadservice.progress.Receiver";
    }
}
