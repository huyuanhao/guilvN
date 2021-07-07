package com.huawei.updatesdk.service.deamon.download;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.p062a.p069d.p071b.C1282a;
import com.huawei.updatesdk.sdk.service.download.C1315d;
import com.huawei.updatesdk.sdk.service.download.bean.DownloadTask;
import java.util.concurrent.atomic.AtomicInteger;
import s.h.e.l.l.C;

public class DownloadService extends Service {

    /* renamed from: b */
    public static boolean f1587b;

    /* renamed from: a */
    public C1315d f1588a;

    /* renamed from: c */
    public final AtomicInteger f1589c = new AtomicInteger();

    /* renamed from: d */
    public final IBinder f1590d = new BinderC1336a();

    /* renamed from: com.huawei.updatesdk.service.deamon.download.DownloadService$a */
    public class BinderC1336a extends Binder {
        public BinderC1336a() {
        }

        /* renamed from: a */
        public DownloadService mo16145a() {
            return DownloadService.this;
        }
    }

    static {
        C.i(16777253);
    }

    /* renamed from: a */
    public static void m1913a(boolean z) {
        f1587b = z;
    }

    /* renamed from: a */
    public static boolean m1914a() {
        return f1587b;
    }

    /* renamed from: b */
    private boolean m1915b() {
        return C1282a.m1601e();
    }

    /* renamed from: a */
    public void mo16135a(String str) {
        this.f1588a.mo16031b(str);
    }

    /* renamed from: a */
    public boolean mo16136a(DownloadTask downloadTask) {
        if (!m1915b() || downloadTask == null) {
            return false;
        }
        this.f1588a.mo16027a(downloadTask);
        return true;
    }

    /* renamed from: b */
    public DownloadTask mo16137b(String str) {
        return this.f1588a.mo16024a(str);
    }

    /* renamed from: b */
    public boolean mo16138b(DownloadTask downloadTask) {
        if (!m1915b()) {
            return false;
        }
        this.f1588a.mo16037d(downloadTask);
        return true;
    }

    public native IBinder onBind(Intent intent);

    public native void onCreate();

    public void onDestroy() {
        super.onDestroy();
        m1913a(false);
        try {
            this.f1588a.mo16036d();
            stopForeground(true);
        } catch (Exception e) {
            C1278a.m1581a("DownloadService", "unRegister NetworkConnectivityListener:", e);
        }
        C1278a.m1580a("DownloadService", "DownloadService onDestroy");
    }

    public native void onRebind(Intent intent);

    public native boolean onUnbind(Intent intent);
}
