package com.huawei.updatesdk.sdk.service.download;

import android.os.Handler;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.p062a.p069d.AbstractC1293e;
import com.huawei.updatesdk.sdk.service.download.bean.DownloadTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.huawei.updatesdk.sdk.service.download.d */
public class C1315d {

    /* renamed from: e */
    public static volatile C1315d f1538e;

    /* renamed from: f */
    public static final Object f1539f = new Object();

    /* renamed from: a */
    public List<DownloadTask> f1540a = new ArrayList();

    /* renamed from: b */
    public AbstractC1306b f1541b;

    /* renamed from: c */
    public ExecutorService f1542c;

    /* renamed from: d */
    public ExecutorService f1543d;

    /* renamed from: g */
    public Handler f1544g;

    /* renamed from: h */
    public boolean f1545h = false;

    public C1315d() {
        C1278a.m1580a("HiAppDownload", "create executor with thread pool number:1");
        this.f1542c = Executors.newFixedThreadPool(1);
        this.f1543d = Executors.newFixedThreadPool(2);
        this.f1545h = false;
    }

    /* renamed from: a */
    public static C1315d m1780a() {
        C1315d dVar;
        synchronized (f1539f) {
            if (f1538e == null) {
                f1538e = new C1315d();
            }
            dVar = f1538e;
        }
        return dVar;
    }

    /* renamed from: e */
    private void m1781e(DownloadTask downloadTask) {
        downloadTask.mo15975d(0);
        Handler handler = this.f1544g;
        handler.sendMessage(handler.obtainMessage(downloadTask.mo15992n(), downloadTask));
        RunnableC1316e eVar = new RunnableC1316e(downloadTask, this.f1544g);
        AbstractC1306b bVar = this.f1541b;
        if (bVar != null) {
            eVar.mo16043a(bVar);
        }
        downloadTask.mo15960a(this.f1542c.submit(eVar));
        C1278a.m1583c("HiAppDownload", "DownloadManager submit new task:" + downloadTask.mo16002w());
        downloadTask.mo15972c(System.currentTimeMillis());
    }

    /* renamed from: a */
    public int mo16023a(int i) {
        C1278a.m1580a("HiAppDownload", "pauseAll all download task, reason:" + i + ",tasklist size:" + mo16039f());
        int i2 = 0;
        for (DownloadTask downloadTask : mo16040g()) {
            if (downloadTask.mo15992n() != 6) {
                mo16028a(downloadTask, i);
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public DownloadTask mo16024a(String str) {
        synchronized (this.f1540a) {
            for (DownloadTask downloadTask : this.f1540a) {
                if (downloadTask.mo16002w().equalsIgnoreCase(str)) {
                    return downloadTask;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public void mo16025a(Handler handler) {
        this.f1544g = handler;
    }

    /* renamed from: a */
    public void mo16026a(AbstractC1306b bVar) {
        this.f1541b = bVar;
    }

    /* renamed from: a */
    public void mo16027a(DownloadTask downloadTask) {
        if (downloadTask != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("downloadManager addTask : ");
            sb.append(AbstractC1293e.m1646a(downloadTask.mo16002w()) ? "null" : downloadTask.mo16002w());
            C1278a.m1583c("HiAppDownload", sb.toString());
            downloadTask.mo15961a(true);
            if (!mo16033b(downloadTask)) {
                if (downloadTask.mo15993o() == -1) {
                    downloadTask.mo15979e(DownloadTask.m1715a());
                }
                synchronized (this.f1540a) {
                    this.f1540a.add(downloadTask);
                }
            }
            downloadTask.mo15962a(false, 0);
            downloadTask.mo15969b(false);
            m1781e(downloadTask);
        }
    }

    /* renamed from: a */
    public void mo16028a(DownloadTask downloadTask, int i) {
        Handler handler;
        if (downloadTask != null) {
            C1278a.m1583c("HiAppDownload", "pauseTask, package:" + downloadTask.mo16002w() + ",status:" + downloadTask.mo15992n() + ", reason:" + i);
            if (downloadTask.mo15992n() != 6 || (handler = this.f1544g) == null) {
                if (downloadTask.mo15992n() == 0) {
                    if (downloadTask.mo16001v() != null) {
                        downloadTask.mo16001v().cancel(true);
                    }
                    downloadTask.mo15975d(6);
                    Handler handler2 = this.f1544g;
                    if (handler2 != null) {
                        handler2.sendMessage(handler2.obtainMessage(downloadTask.mo15992n(), downloadTask));
                    }
                    C1278a.m1583c("HiAppDownload", "task interrupted by pause, package:" + downloadTask.mo16002w());
                }
                synchronized (downloadTask) {
                    downloadTask.mo15962a(true, i);
                    if (downloadTask.mo16001v() != null) {
                        downloadTask.mo16001v().cancel(true);
                    }
                    downloadTask.notifyAll();
                    C1278a.m1583c("HiAppDownload", "task interrupted by pause, package:" + downloadTask.mo16002w());
                }
                return;
            }
            handler.sendMessage(handler.obtainMessage(downloadTask.mo15992n(), downloadTask));
        }
    }

    /* renamed from: a */
    public void mo16029a(String str, boolean z) {
        DownloadTask a = mo16024a(str);
        if (a != null) {
            C1278a.m1583c("HiAppDownload", "cancel task, package:" + a.mo16002w());
            a.mo15961a(z);
            if (a.mo15992n() == 0 || a.mo15992n() == 6) {
                if (a.mo16001v() != null) {
                    a.mo16001v().cancel(true);
                }
                a.mo15975d(3);
                a.mo16004x();
                Handler handler = this.f1544g;
                handler.sendMessage(handler.obtainMessage(a.mo15992n(), a));
                C1278a.m1583c("HiAppDownload", "task interrupted by cancel, package:" + a.mo16002w());
            }
            synchronized (a) {
                a.mo15962a(true, 3);
                if (a.mo16001v() != null) {
                    a.mo16001v().cancel(true);
                }
                a.notifyAll();
                C1278a.m1583c("HiAppDownload", "task interrupted by cancel, package:" + a.mo16002w());
            }
        }
    }

    /* renamed from: a */
    public void mo16030a(boolean z) {
        this.f1545h = z;
    }

    /* renamed from: b */
    public void mo16031b(String str) {
        mo16029a(str, true);
    }

    /* renamed from: b */
    public boolean mo16032b() {
        return this.f1545h;
    }

    /* renamed from: b */
    public boolean mo16033b(DownloadTask downloadTask) {
        synchronized (this.f1540a) {
            for (DownloadTask downloadTask2 : this.f1540a) {
                if (downloadTask2.mo15993o() == downloadTask.mo15993o()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public ExecutorService mo16034c() {
        return this.f1543d;
    }

    /* renamed from: c */
    public void mo16035c(DownloadTask downloadTask) {
        synchronized (this.f1540a) {
            this.f1540a.remove(downloadTask);
        }
    }

    /* renamed from: d */
    public void mo16036d() {
        mo16023a(0);
        synchronized (this.f1540a) {
            this.f1540a.clear();
        }
    }

    /* renamed from: d */
    public void mo16037d(DownloadTask downloadTask) {
        if (downloadTask != null) {
            if (downloadTask.mo15992n() != 6) {
                C1278a.m1584d("HiAppDownload", "task status isn't DOWNLOAD_PAUSED(6), ignore task:" + downloadTask.mo16002w());
                return;
            }
            C1278a.m1583c("HiAppDownload", "resumeTask, package:" + downloadTask.mo16002w());
            downloadTask.mo15962a(false, 0);
            mo16027a(downloadTask);
        }
    }

    /* renamed from: e */
    public boolean mo16038e() {
        boolean z;
        synchronized (this.f1540a) {
            Iterator<DownloadTask> it = this.f1540a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().mo15992n() != 6) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }

    /* renamed from: f */
    public int mo16039f() {
        int size;
        synchronized (this.f1540a) {
            size = this.f1540a.size();
        }
        return size;
    }

    /* renamed from: g */
    public List<DownloadTask> mo16040g() {
        ArrayList arrayList;
        synchronized (this.f1540a) {
            arrayList = new ArrayList(this.f1540a);
        }
        return arrayList;
    }
}
