package com.huawei.updatesdk.sdk.service.download;

import android.content.Context;
import android.os.Process;
import android.support.p000v4.media.session.PlaybackStateCompat;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.p062a.p069d.p073c.C1291b;
import com.huawei.updatesdk.sdk.service.download.bean.C1312a;
import com.huawei.updatesdk.sdk.service.download.bean.DownloadTask;
import com.huawei.updatesdk.sdk.service.p074a.C1294a;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.util.concurrent.Future;
import javax.net.ssl.SSLProtocolException;

/* renamed from: com.huawei.updatesdk.sdk.service.download.f */
public class RunnableC1317f implements Runnable {

    /* renamed from: a */
    public String f1563a = "";

    /* renamed from: b */
    public String f1564b = "";

    /* renamed from: c */
    public DownloadTask f1565c;

    /* renamed from: d */
    public C1312a f1566d;

    /* renamed from: e */
    public AbstractC1324j f1567e = null;

    /* renamed from: f */
    public volatile boolean f1568f = false;

    /* renamed from: g */
    public volatile boolean f1569g = true;

    /* renamed from: h */
    public volatile boolean f1570h = true;

    /* renamed from: i */
    public boolean f1571i = false;

    /* renamed from: j */
    public int f1572j = 0;

    /* renamed from: k */
    public long f1573k = 0;

    /* renamed from: l */
    public long f1574l = 0;

    /* renamed from: m */
    public Future<?> f1575m = null;

    public RunnableC1317f(DownloadTask downloadTask, C1312a aVar, AbstractC1324j jVar) {
        this.f1565c = downloadTask;
        this.f1566d = aVar;
        this.f1567e = jVar;
        this.f1569g = true;
    }

    /* renamed from: a */
    private long m1841a(long j, long j2, boolean z) {
        return !z ? j2 : Math.min(j + PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, j2);
    }

    /* renamed from: a */
    private void m1842a(int i, long j, long j2) throws C1314c {
        if (i == -1) {
            String str = " thread download failed,response null, lastUrl=" + this.f1564b;
            C1278a.m1584d("HiAppDownload", str);
            throw new C1314c(108, str);
        } else if (i == 416) {
            String str2 = "server file is wrong : 416 response [package= " + this.f1565c.mo16002w() + ", storeSize=" + this.f1565c.mo15996r() + ", rangeStart=" + j + ", rangeEnd=" + j2 + ", lastUrl=" + this.f1564b + "]";
            C1278a.m1584d("HiAppDownload", str2);
            throw new C1314c(106, str2);
        } else if (i != 200 && i != 206) {
            String str3 = "thread download failed:bad http response [responseCode=" + i + ", lastUrl=" + this.f1564b + "]";
            C1278a.m1584d("HiAppDownload", str3);
            throw new C1314c(109, str3);
        }
    }

    /* renamed from: a */
    private void m1843a(int i, HttpURLConnection httpURLConnection) throws C1314c {
        long j;
        if (httpURLConnection != null) {
            boolean z = true;
            if (206 == i) {
                j = C1318g.m1858a(httpURLConnection.getHeaderField("Content-Range"));
            } else if (200 == i) {
                z = false;
                j = (long) httpURLConnection.getContentLength();
            } else {
                j = -1;
            }
            if (j > 0 && j != this.f1565c.mo15996r()) {
                String str = "server file length is wrong [package= " + this.f1565c.mo16002w() + ", getLengthByRange=" + z + ", streamLength=" + j + ", storeSize=" + this.f1565c.mo15996r() + ", lastUrl=" + this.f1564b + "]";
                C1278a.m1584d("HiAppDownload", str);
                throw new C1314c(106, str);
            }
        }
    }

    /* renamed from: a */
    private void m1844a(long j) throws C1314c {
        if (j > 0) {
            try {
                m1851g();
                m1848d();
                C1278a.m1583c("HiAppDownload", "downloadOneRange will try again after timeout:" + j);
                Thread.sleep(j);
            } catch (InterruptedException unused) {
                C1278a.m1584d("HiAppDownload", "sleep interrupted!");
            }
        }
    }

    /* renamed from: a */
    private void m1845a(C1314c cVar) {
        if (this.f1569g) {
            synchronized (this.f1567e) {
                this.f1567e.mo16044a(cVar);
            }
        }
    }

    /* renamed from: a */
    private void m1846a(BufferedInputStream bufferedInputStream, RandomAccessFile randomAccessFile) throws IOException, C1314c {
        String str;
        IOException e;
        byte[] bArr = new byte[8192];
        byte[] bArr2 = new byte[1048576];
        long currentTimeMillis = System.currentTimeMillis() - 500;
        int i = 0;
        while (true) {
            m1848d();
            int read = bufferedInputStream.read(bArr);
            m1848d();
            this.f1572j = 0;
            if (read == -1) {
                break;
            }
            m1848d();
            if (read + i > 1048576 || System.currentTimeMillis() > currentTimeMillis + 1000) {
                try {
                    randomAccessFile.write(bArr2, 0, i);
                    currentTimeMillis = System.currentTimeMillis();
                    m1848d();
                    try {
                        this.f1566d.mo16017a(((long) i) + this.f1566d.mo16020d());
                        m1850f();
                        i = 0;
                    } catch (IOException e2) {
                        e = e2;
                        str = "write file failed";
                        C1278a.m1581a("HiAppDownload", str, e);
                        throw new C1314c(121, e.getMessage());
                    }
                } catch (IOException e3) {
                    e = e3;
                    str = "write file failed";
                    C1278a.m1581a("HiAppDownload", str, e);
                    throw new C1314c(121, e.getMessage());
                }
            }
            System.arraycopy(bArr, 0, bArr2, i, read);
            i += read;
        }
        if (i > 0) {
            try {
                randomAccessFile.write(bArr2, 0, i);
                m1848d();
                this.f1566d.mo16017a(this.f1566d.mo16020d() + ((long) i));
                m1850f();
            } catch (IOException e4) {
                C1278a.m1581a("HiAppDownload", "write file failed", e4);
                throw new C1314c(121, e4.getMessage());
            }
        }
    }

    /* renamed from: a */
    private boolean m1847a(IOException iOException) {
        return (iOException instanceof SocketTimeoutException) || (iOException instanceof SSLProtocolException);
    }

    /* renamed from: d */
    private void m1848d() throws C1314c {
        if (this.f1569g) {
            DownloadTask downloadTask = this.f1565c;
            if (!downloadTask.f1505g) {
                return;
            }
            if (downloadTask.mo15984g() == 3) {
                throw new C1314c(104, "thread download canceled!");
            }
            throw new C1314c(105, "thread download paused!");
        }
        throw new C1314c(103, "thread download quit because  stopped");
    }

    /* renamed from: e */
    private boolean m1849e() {
        return (this.f1566d.mo16019c() - this.f1566d.mo16018b()) + 1 > this.f1566d.mo16020d();
    }

    /* renamed from: f */
    private void m1850f() {
        synchronized (this.f1567e) {
            this.f1567e.mo16045b();
        }
    }

    /* renamed from: g */
    private void m1851g() {
        Context b = C1294a.m1650a().mo15900b();
        if (b != null && !C1291b.m1636a(b)) {
            C1278a.m1583c("HiAppDownload", "thread download interrupted as no active network");
            this.f1565c.mo15962a(true, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0160, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0161, code lost:
        r13 = r1;
        r14 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0164, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0165, code lost:
        r13 = r1;
        r14 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0168, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0169, code lost:
        r14 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x016b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016c, code lost:
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x016f, code lost:
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0171, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a.m1581a("HiAppDownload", "get file failed", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0182, code lost:
        throw new com.huawei.updatesdk.sdk.service.download.C1314c(110, r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0194, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0195, code lost:
        r8 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0199, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x019a, code lost:
        r8 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x019e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019f, code lost:
        r8 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0200 A[Catch:{ all -> 0x023b }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x022f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0160 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:34:0x0146] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0164 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:34:0x0146] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x016b A[ExcHandler: all (th java.lang.Throwable), PHI: r14 
      PHI: (r14v10 java.io.RandomAccessFile) = (r14v1 java.io.RandomAccessFile), (r14v8 java.io.RandomAccessFile), (r14v1 java.io.RandomAccessFile) binds: [B:32:0x0134, B:55:0x0174, B:33:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:32:0x0134] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x016e A[ExcHandler: Exception (e java.lang.Exception), PHI: r14 
      PHI: (r14v9 java.io.RandomAccessFile) = (r14v1 java.io.RandomAccessFile), (r14v8 java.io.RandomAccessFile), (r14v1 java.io.RandomAccessFile) binds: [B:32:0x0134, B:55:0x0174, B:33:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:32:0x0134] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0199 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019e A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:10:0x0073] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1852h() throws com.huawei.updatesdk.sdk.service.download.C1314c {
        /*
        // Method dump skipped, instructions count: 590
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.sdk.service.download.RunnableC1317f.m1852h():void");
    }

    /* renamed from: i */
    private void m1853i() {
        if (this.f1569g) {
            synchronized (this.f1567e) {
                this.f1567e.mo16042a();
            }
        }
    }

    /* renamed from: a */
    public void mo16048a(Future<?> future) {
        this.f1575m = future;
    }

    /* renamed from: a */
    public boolean mo16049a() {
        return this.f1571i;
    }

    /* renamed from: b */
    public boolean mo16050b() {
        return this.f1568f;
    }

    /* renamed from: c */
    public void mo16051c() {
        this.f1569g = false;
    }

    public void run() {
        Process.setThreadPriority(10);
        C1278a.m1583c("HiAppDownload", "one download thread begin: " + this.f1565c.mo16002w() + " thread:" + Thread.currentThread().getId() + " startpos= " + this.f1566d.mo16018b());
        this.f1570h = false;
        this.f1573k = System.currentTimeMillis();
        do {
            try {
                m1852h();
                if (!this.f1569g) {
                    break;
                }
            } catch (C1314c e) {
                this.f1568f = true;
                m1845a(e);
                C1278a.m1584d("HiAppDownload", "one download thread end: " + this.f1565c.mo16002w() + " error:" + e.getMessage());
                this.f1574l = System.currentTimeMillis();
                return;
            }
        } while (m1849e());
        this.f1568f = true;
        this.f1571i = true;
        m1853i();
        this.f1574l = System.currentTimeMillis();
        C1278a.m1583c("HiAppDownload", "one download thread end: " + this.f1565c.mo16002w() + " thread:" + Thread.currentThread().getId());
    }
}
