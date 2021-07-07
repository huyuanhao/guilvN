package com.huawei.updatesdk.service.deamon.download;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.service.p074a.C1294a;
import com.huawei.updatesdk.service.deamon.download.DownloadService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.huawei.updatesdk.service.deamon.download.d */
public final class C1340d {

    /* renamed from: a */
    public static final C1340d f1595a = new C1340d();

    /* renamed from: b */
    public final AtomicInteger f1596b = new AtomicInteger();

    /* renamed from: c */
    public ServiceConnectionC1342a f1597c = null;

    /* renamed from: d */
    public DownloadService f1598d = null;

    /* renamed from: e */
    public final List<Message> f1599e = new ArrayList();

    /* renamed from: com.huawei.updatesdk.service.deamon.download.d$a */
    public final class ServiceConnectionC1342a implements ServiceConnection {
        public ServiceConnectionC1342a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                C1340d.this.f1598d = ((DownloadService.BinderC1336a) iBinder).mo16145a();
                synchronized (C1340d.this.f1599e) {
                    for (Message message : C1340d.this.f1599e) {
                        message.sendToTarget();
                    }
                    C1340d.this.f1599e.clear();
                }
                C1278a.m1580a("ServiceProxy", "Bind to DownloadService sucessfuly");
            } catch (ClassCastException unused) {
                C1278a.m1580a("ServiceProxy", "onServiceConnected ClassCastException");
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C1340d.this.f1598d = null;
            C1278a.m1580a("ServiceProxy", "unBind DownloadService sucessfuly");
        }
    }

    /* renamed from: a */
    public static void m1933a() {
        C1278a.m1580a("ServiceProxy", "start DownloadService");
        Context b = C1294a.m1650a().mo15900b();
        b.startService(new Intent(b, DownloadService.class));
    }

    /* renamed from: b */
    public static C1340d m1934b() {
        return f1595a;
    }

    /* renamed from: g */
    private boolean m1935g() {
        if (this.f1597c != null) {
            return true;
        }
        C1278a.m1580a("ServiceProxy", "bind to DownloadService");
        Context b = C1294a.m1650a().mo15900b();
        Intent intent = new Intent(b, DownloadService.class);
        ServiceConnectionC1342a aVar = new ServiceConnectionC1342a();
        this.f1597c = aVar;
        return b.bindService(intent, aVar, 1);
    }

    /* renamed from: c */
    public DownloadService mo16150c() {
        if (!DownloadService.m1914a()) {
            m1933a();
        }
        if (f1595a.f1598d != null && this.f1596b.get() > 0) {
            return f1595a.f1598d;
        }
        f1595a.m1935g();
        return null;
    }

    /* renamed from: d */
    public void mo16151d() {
        if (this.f1597c != null) {
            C1278a.m1580a("ServiceProxy", "unBind DownloadService");
            try {
                C1294a.m1650a().mo15900b().unbindService(this.f1597c);
            } catch (IllegalArgumentException unused) {
                C1278a.m1580a("ServiceProxy", "unbindServer IllegalArgumentException");
            }
            this.f1597c = null;
            this.f1596b.set(0);
        }
    }

    /* renamed from: e */
    public DownloadService mo16152e() {
        return f1595a.f1598d;
    }

    /* renamed from: f */
    public DownloadService mo16153f() {
        DownloadService c = mo16150c();
        this.f1596b.incrementAndGet();
        return c;
    }
}
