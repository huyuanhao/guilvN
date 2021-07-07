package com.huawei.updatesdk.sdk.service.download;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.support.p000v4.media.session.PlaybackStateCompat;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.p062a.p069d.AbstractC1288c;
import com.huawei.updatesdk.sdk.p062a.p069d.AbstractC1293e;
import com.huawei.updatesdk.sdk.p062a.p069d.p073c.C1291b;
import com.huawei.updatesdk.sdk.service.download.AbstractC1306b;
import com.huawei.updatesdk.sdk.service.download.C1318g;
import com.huawei.updatesdk.sdk.service.download.bean.C1312a;
import com.huawei.updatesdk.sdk.service.download.bean.DownloadTask;
import com.huawei.updatesdk.sdk.service.p074a.C1294a;
import com.huawei.updatesdk.service.deamon.download.C1338b;
import com.p118pd.sdk.C7265o0O000oo;
import com.p118pd.sdk.LL1i;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Future;

/* renamed from: com.huawei.updatesdk.sdk.service.download.e */
public class RunnableC1316e implements AbstractC1324j, Runnable {

    /* renamed from: a */
    public AbstractC1306b f1546a = new C1338b();

    /* renamed from: b */
    public Handler f1547b;

    /* renamed from: c */
    public volatile boolean f1548c = true;

    /* renamed from: d */
    public boolean f1549d = false;

    /* renamed from: e */
    public int f1550e = 0;

    /* renamed from: f */
    public int f1551f = 0;

    /* renamed from: g */
    public long f1552g = 0;

    /* renamed from: h */
    public long f1553h = 0;

    /* renamed from: i */
    public C1314c f1554i = null;

    /* renamed from: j */
    public DownloadTask f1555j;

    /* renamed from: k */
    public Object f1556k = new byte[0];

    /* renamed from: l */
    public List<RunnableC1317f> f1557l = new ArrayList();

    /* renamed from: m */
    public boolean f1558m = false;

    /* renamed from: n */
    public boolean f1559n = false;

    /* renamed from: o */
    public boolean f1560o = false;

    /* renamed from: p */
    public boolean f1561p = false;

    /* renamed from: q */
    public int f1562q = 0;

    public RunnableC1316e(DownloadTask downloadTask, Handler handler) {
        this.f1555j = downloadTask;
        downloadTask.mo15959a((String) null);
        this.f1547b = handler;
    }

    /* renamed from: a */
    private void m1800a(int i) {
        if (this.f1547b != null) {
            C1278a.m1583c("HiAppDownload", "sendMessage2: interrupted = " + this.f1555j.f1505g + ", interrupted reason = " + this.f1555j.f1506h + ", state = " + i + ", progress = " + this.f1555j.mo15994p());
            Handler handler = this.f1547b;
            handler.sendMessage(handler.obtainMessage(i, this.f1555j));
        }
    }

    /* renamed from: a */
    private void m1801a(File file) {
        if (!file.setReadable(true, false)) {
            C1278a.m1584d("HiAppDownload", "can not set readable to apk");
        }
    }

    /* renamed from: a */
    private void m1802a(boolean z) throws C1314c {
        C1278a.m1583c("HiAppDownload", "begin doDispatch, useHttps: " + z + "  package:" + this.f1555j.mo16002w());
        ArrayList arrayList = new ArrayList();
        m1803a(z, arrayList);
        Iterator<String> it = arrayList.iterator();
        HttpURLConnection httpURLConnection = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            C1278a.m1583c("HiAppDownload", "do dispatch with one url:" + next);
            try {
                this.f1555j.mo15959a((String) null);
                C1278a.m1583c("HiAppDownload", "doDispatch try one url : " + this.f1555j.mo16002w());
                httpURLConnection = m1808c(next);
                mo16046c();
                if (httpURLConnection == null) {
                    C1278a.m1584d("HiAppDownload", "null == connection");
                } else {
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode == -1) {
                            C1278a.m1584d("HiAppDownload", " dispatch onece failed: responsecode is -1");
                            if (httpURLConnection == null) {
                            }
                        } else {
                            C1278a.m1583c("HiAppDownload", "dispatch response code:" + responseCode);
                            if (responseCode != 302 || !m1804a(httpURLConnection)) {
                                if (responseCode == 200) {
                                    this.f1555j.mo15959a(next);
                                    C1278a.m1583c("HiAppDownload", "doDispatch succeed, no redirect, package: " + this.f1555j.mo16002w() + ", url=" + next);
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                        return;
                                    }
                                    return;
                                } else if (httpURLConnection == null) {
                                }
                            } else if (z || !m1807b(this.f1555j.mo15989k())) {
                                C1278a.m1583c("HiAppDownload", "doDispatch succeed, package: " + this.f1555j.mo16002w());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                    return;
                                }
                                return;
                            } else {
                                this.f1555j.mo15959a((String) null);
                                this.f1560o = true;
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                            }
                        }
                    } catch (IOException e) {
                        C1278a.m1584d("HiAppDownload", "connection.getResponseCode exception: " + e.getMessage());
                        if (httpURLConnection == null) {
                        }
                    }
                }
            } finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        }
        this.f1555j.mo15968b((Future<?>) null);
        C1278a.m1584d("HiAppDownload", "doDispatch failed, package: " + this.f1555j.mo16002w());
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("dispatch failed [url = ");
        stringBuffer.append(this.f1555j.mo15990l());
        stringBuffer.append("]");
        throw new C1314c(119, stringBuffer.toString());
    }

    /* renamed from: a */
    private void m1803a(boolean z, List<String> list) {
        String a;
        if (!z) {
            List<String> d = C1305a.m1699a().mo15945d();
            list.add(this.f1555j.mo15990l());
            for (String str : d) {
                String a2 = C1305a.m1700a(this.f1555j.mo15990l(), str);
                if (!m1807b(str) && !list.contains(a2)) {
                    list.add(a2);
                }
            }
            return;
        }
        if (m1807b(this.f1555j.mo15990l())) {
            a = this.f1555j.mo15990l();
        } else {
            String c = C1305a.m1699a().mo15944c();
            if (c != null) {
                a = C1305a.m1700a(this.f1555j.mo15990l(), c);
            } else {
                return;
            }
        }
        list.add(a);
    }

    /* renamed from: a */
    private boolean m1804a(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("location");
        if (AbstractC1293e.m1646a(headerField)) {
            C1278a.m1584d("HiAppDownload", "location header is blank");
            return false;
        }
        try {
            this.f1555j.mo15971c(0);
            URL url = new URL(headerField);
            if (headerField.indexOf("dispatcher=1") != -1 && AbstractC1293e.m1649d(url.getHost())) {
                this.f1555j.mo15971c(1);
            }
            this.f1555j.mo15959a(headerField);
            DownloadTask downloadTask = this.f1555j;
            downloadTask.mo15964b(m1807b(downloadTask.mo15989k()) ? 2 : 1);
            C1278a.m1583c("HiAppDownload", " url redirected , dispatcher = " + this.f1555j.mo15988j() + ", protocol = " + this.f1555j.mo15987i() + ", url=" + headerField);
            return true;
        } catch (MalformedURLException e) {
            C1278a.m1581a("HiAppDownload", "doRedirect MalformedURLException happened", e);
            return false;
        }
    }

    /* renamed from: b */
    private void m1805b(C1314c cVar) {
        m1832x();
        if (cVar.mo16022b() == 104 || cVar.mo16022b() == 105) {
            m1830v();
        } else {
            this.f1555j.mo15975d(5);
            if (cVar.mo16022b() == 121) {
                this.f1555j.mo15975d(6);
                this.f1546a.mo15947a(this.f1555j, this.f1546a.mo15946a(this.f1555j));
            }
        }
        if (this.f1555j.mo15992n() == 6) {
            m1833y();
        }
        m1829u();
    }

    /* renamed from: b */
    private void m1806b(boolean z) throws C1314c {
        C1278a.m1583c("HiAppDownload", "doDownloadOnece begin:" + this.f1555j.mo16002w());
        this.f1554i = null;
        try {
            m1815g();
            m1811d();
            m1819k();
            m1802a(z);
            m1821m();
            m1827s();
            m1831w();
            m1834z();
            mo16046c();
            m1833y();
            if (m1822n()) {
                m1809c(true);
                m1813e();
                m1816h();
                this.f1549d = true;
                this.f1555j.mo15978e().mo16015b(System.currentTimeMillis());
                if (!this.f1555j.mo15978e().mo16014a() && !this.f1561p) {
                    this.f1555j.mo15978e().mo16013a(true);
                }
                C1278a.m1583c("HiAppDownload", "doDownloadOnece succeed!");
            } else if (this.f1554i != null) {
                if (this.f1554i.mo16022b() == 106 || this.f1554i.mo16022b() == 122) {
                    this.f1560o = true;
                    if (this.f1554i.mo16022b() == 122) {
                        m1826r();
                        this.f1558m = true;
                    }
                }
                throw this.f1554i;
            }
        } catch (C1314c e) {
            C1278a.m1584d("HiAppDownload", "doDownloadOnece exception, errorcode:" + e.mo16022b() + ", errormessag:" + e.mo16021a());
            this.f1555j.mo15974d().f1523a = e.mo16022b();
            this.f1555j.mo15974d().f1524b = e.mo16021a();
            if (m1810c(e)) {
                throw e;
            }
        } catch (Throwable th) {
            C1278a.m1584d("HiAppDownload", "doDownloadOnece exception,  errormessag:" + th.getMessage());
            this.f1555j.mo15974d().f1523a = 111;
            this.f1555j.mo15974d().f1524b = th.getMessage();
        }
    }

    /* renamed from: b */
    public static boolean m1807b(String str) {
        if (str == null) {
            return false;
        }
        return str.toLowerCase(Locale.getDefault()).startsWith("https");
    }

    /* renamed from: c */
    private HttpURLConnection m1808c(String str) throws C1314c {
        long j = 0;
        int i = 0;
        while (true) {
            mo16046c();
            if (j > 0) {
                m1819k();
                mo16046c();
                try {
                    C1278a.m1583c("HiAppDownload", "doDispatchByOneUrl will try again after timeout:" + j);
                    Thread.sleep(j);
                } catch (InterruptedException unused) {
                    C1278a.m1584d("HiAppDownload", "sleep interrupted!");
                }
            }
            mo16046c();
            try {
                HttpURLConnection a = C1318g.m1860a().mo16053a(str, false);
                C1318g.C1320a a2 = C1318g.m1859a(this.f1555j, a, true);
                if (!a2.mo16058a()) {
                    Exception b = a2.mo16059b();
                    if (b != null) {
                        if (!(b instanceof SocketTimeoutException)) {
                            break;
                        }
                        i++;
                        long j2 = C7265o0O000oo.OooO0o.OooO00o * ((long) i);
                        if (i >= 3) {
                            break;
                        }
                        j = j2;
                    } else {
                        break;
                    }
                } else {
                    return a;
                }
            } catch (IOException e) {
                C1278a.m1581a("HiAppDownload", "openConnection", e);
                return null;
            } catch (Exception e2) {
                C1278a.m1581a("HiAppDownload", "openConnection", e2);
                return null;
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m1809c(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        long r = this.f1555j.mo15996r();
        long j = 0;
        for (C1312a aVar : this.f1555j.mo15963b()) {
            j += aVar.mo16020d();
        }
        double d = (double) j;
        double d2 = (double) r;
        Double.isNaN(d);
        Double.isNaN(d2);
        int i = (int) ((d / d2) * 100.0d);
        int i2 = i - this.f1550e < 5 ? 800 : 1500;
        int i3 = this.f1551f;
        if (i - i3 <= 0) {
            return;
        }
        if (currentTimeMillis - this.f1552g >= ((long) i2) || i - i3 >= 10 || z) {
            double d3 = (double) (currentTimeMillis - this.f1552g);
            Double.isNaN(d3);
            DownloadTask downloadTask = this.f1555j;
            double d4 = (double) (j - this.f1553h);
            Double.isNaN(d4);
            downloadTask.mo15985g((int) (d4 / (d3 / 1000.0d)));
            this.f1555j.mo15982f(i);
            this.f1555j.mo15965b(j);
            this.f1555j.mo15975d(2);
            m1829u();
            this.f1552g = currentTimeMillis;
            this.f1553h = j;
            this.f1551f = i;
        }
    }

    /* renamed from: c */
    private boolean m1810c(C1314c cVar) {
        int b = cVar.mo16022b();
        return b == 100 || b == 102 || b == 104 || b == 105 || b == 121 || b == 117;
    }

    /* renamed from: d */
    private boolean m1811d() throws C1314c {
        C1278a.m1583c("HiAppDownload", "begin checkLocalBeforeDownload");
        AbstractC1306b.C1307a a = this.f1546a.mo15946a(this.f1555j);
        if (!a.mo15952a()) {
            C1278a.m1584d("HiAppDownload", "space not enough");
            throw new C1314c(121, "space not enough");
        } else if (m1812d(a.mo15954c())) {
            return true;
        } else {
            C1278a.m1584d("HiAppDownload", "prepare file failed");
            throw new C1314c(102, "prepare file failed");
        }
    }

    /* renamed from: d */
    private boolean m1812d(String str) {
        String str2;
        File file = new File(str, "tmp");
        if ((!file.exists() || !file.isDirectory()) && !file.mkdirs()) {
            return false;
        }
        if (AbstractC1293e.m1646a(this.f1555j.mo15998t())) {
            str2 = UUID.randomUUID().toString() + ".apk";
        } else if (new File(this.f1555j.mo15998t()).exists()) {
            return true;
        } else {
            str2 = this.f1555j.mo16000u();
        }
        File file2 = new File(file, str2);
        if (!file2.exists() || file2.delete()) {
            try {
                if (file2.createNewFile()) {
                    this.f1555j.mo15980e(file2.getAbsolutePath());
                    this.f1555j.mo15965b(0L);
                    return true;
                }
                C1278a.m1584d("HiAppDownload", "creat new file failed!");
                return false;
            } catch (IOException e) {
                C1278a.m1581a("HiAppDownload", "create " + this.f1555j.mo15998t() + ", failed!", e);
            }
        } else {
            C1278a.m1584d("HiAppDownload", "file delete failed!");
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0121 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0122  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1813e() throws com.huawei.updatesdk.sdk.service.download.C1314c {
        /*
        // Method dump skipped, instructions count: 327
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.sdk.service.download.RunnableC1316e.m1813e():void");
    }

    /* renamed from: f */
    private boolean m1814f() {
        String m = this.f1555j.mo15991m();
        if (AbstractC1293e.m1646a(m)) {
            C1278a.m1582b("HiAppDownload", "checkDownloadedFile warning: file sha256 is null");
            return true;
        } else if (!m.equalsIgnoreCase(AbstractC1288c.m1619a(this.f1555j.mo15998t(), LL1i.OooO0Oo))) {
            C1278a.m1584d("HiAppDownload", "file sha256 check failed");
            return false;
        } else {
            C1278a.m1583c("HiAppDownload", "file sha256 check succeed");
            return true;
        }
    }

    /* renamed from: g */
    private void m1815g() throws C1314c {
        if (!AbstractC1293e.m1646a(this.f1555j.mo15990l())) {
            try {
                new URL(this.f1555j.mo15990l());
                if (this.f1555j.mo15996r() <= 0) {
                    String str = "[fileSize=" + this.f1555j.mo15996r() + ", backupFileSize=" + this.f1555j.mo15986h() + ", alreadyDownloadSize=" + this.f1555j.mo15997s() + ", roundCount=" + this.f1562q + "]";
                    C1278a.m1584d("HiAppDownload", "before download, check task failed:" + "fileSize is wrong " + str);
                    throw new C1314c(100, "fileSize is wrong " + str);
                }
            } catch (MalformedURLException unused) {
                String str2 = "url is wrong : " + this.f1555j.mo15990l();
                C1278a.m1584d("HiAppDownload", "before download, check task failed:" + str2);
                throw new C1314c(100, str2);
            }
        } else {
            C1278a.m1584d("HiAppDownload", "before download, check task failed:" + "dispatchUrl is null");
            throw new C1314c(100, "dispatchUrl is null");
        }
    }

    /* renamed from: h */
    private void m1816h() throws C1314c {
        String str;
        boolean z;
        int i;
        C1278a.m1583c("HiAppDownload", "begin processDownloadedTempFile");
        File file = new File(this.f1555j.mo15998t());
        String str2 = mo16041a(this.f1555j.mo15998t()) + this.f1555j.mo16000u();
        if (file.exists()) {
            File file2 = new File(str2);
            if (!file.renameTo(file2)) {
                str2 = file.getAbsolutePath();
                m1801a(file);
            } else {
                m1801a(file2);
            }
            this.f1555j.mo15980e(str2);
            i = 111;
            str = "processDownloadedTempFile failed";
            z = true;
        } else {
            C1278a.m1584d("HiAppDownload", "Downloaded file not exist:" + this.f1555j.mo16002w());
            i = 120;
            z = false;
            str = "Downloaded file not exist when process file ";
        }
        C1278a.m1583c("HiAppDownload", "end processDownloadedTempFile");
        if (!z) {
            m1826r();
            this.f1558m = true;
            throw new C1314c(i, str);
        }
    }

    /* renamed from: i */
    private void m1817i() {
        if (this.f1558m && this.f1555j.mo16005y()) {
            C1278a.m1583c("HiAppDownload", "notifyReDownloadInHttpsStarted, package :" + this.f1555j.mo16002w());
            m1800a(10);
            this.f1558m = false;
        }
    }

    /* renamed from: j */
    private boolean m1818j() throws C1314c {
        m1800a(9);
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        while (System.currentTimeMillis() < valueOf.longValue() + WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException unused) {
                C1278a.m1584d("HiAppDownload", "isRestartInHttpsConfirmed interrupted");
            }
            mo16046c();
        }
        return false;
    }

    /* renamed from: k */
    private void m1819k() {
        Context b = C1294a.m1650a().mo15900b();
        if (b != null && !C1291b.m1636a(b)) {
            C1278a.m1583c("HiAppDownload", "download interrupted as no active network");
            this.f1555j.mo15962a(true, 2);
        }
    }

    /* renamed from: l */
    private void m1820l() throws C1314c {
        C1278a.m1583c("HiAppDownload", "begin downloadrunnable download ,package:" + this.f1555j.mo16002w());
        boolean z = false;
        this.f1549d = false;
        this.f1555j.mo15975d(1);
        m1829u();
        DownloadTask downloadTask = this.f1555j;
        downloadTask.mo15967b(downloadTask.mo15995q());
        boolean b = m1807b(this.f1555j.mo15990l());
        if (!b && !this.f1555j.mo16005y() && C1315d.m1780a().mo16032b()) {
            b = true;
        }
        this.f1562q = 1;
        m1806b(b);
        if (this.f1560o) {
            C1278a.m1582b("HiAppDownload", "possibly hijacked !");
            C1315d.m1780a().mo16030a(true);
            this.f1560o = false;
        }
        m1819k();
        if (!this.f1549d) {
            mo16046c();
            if (m1824p()) {
                if (this.f1558m && this.f1555j.mo15994p() > 0) {
                    z = true;
                }
                this.f1558m = z;
                if (!z || this.f1555j.mo16005y() || m1818j()) {
                    String a = C1305a.m1700a(this.f1555j.mo15995q(), C1305a.m1699a().mo15944c());
                    this.f1555j.mo15970c();
                    this.f1555j.mo15967b(a);
                    this.f1555j.mo15976d(a);
                    m1817i();
                    this.f1562q = 2;
                    m1806b(true);
                }
            }
        }
    }

    /* renamed from: m */
    private void m1821m() throws C1314c {
        C1278a.m1583c("HiAppDownload", "begin initDownloadThreadInfo");
        mo16046c();
        this.f1555j.mo15963b().clear();
        ArrayList arrayList = new ArrayList();
        long r = this.f1555j.mo15996r();
        int i = r < PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE ? 1 : 2;
        int i2 = 0;
        while (i2 < i) {
            long j = r / ((long) i);
            long j2 = j * ((long) i2);
            arrayList.add(new C1312a(this.f1555j.mo15993o(), C1312a.m1772a(), j2, i2 == i + -1 ? r - 1 : (j + j2) - 1));
            i2++;
        }
        this.f1555j.mo15963b().addAll(arrayList);
    }

    /* renamed from: n */
    private boolean m1822n() {
        for (RunnableC1317f fVar : this.f1557l) {
            if (!fVar.mo16049a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    private boolean m1823o() {
        for (RunnableC1317f fVar : this.f1557l) {
            if (!fVar.mo16050b()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    private boolean m1824p() {
        if (this.f1555j.mo15989k() != null) {
            return (this.f1555j.mo15989k() == null || m1807b(this.f1555j.mo15989k()) || C1305a.m1699a().mo15944c() == null) ? false : true;
        }
        return true;
    }

    /* renamed from: q */
    private void m1825q() {
        synchronized (this.f1556k) {
            this.f1556k.notifyAll();
        }
    }

    /* renamed from: r */
    private void m1826r() {
        this.f1555j.mo16004x();
        this.f1555j.mo15965b(0L);
        this.f1555j.mo15982f(0);
    }

    /* renamed from: s */
    private void m1827s() {
        long j = 0;
        for (C1312a aVar : this.f1555j.mo15963b()) {
            j += aVar.mo16020d();
        }
        double d = (double) j;
        double r = (double) this.f1555j.mo15996r();
        Double.isNaN(d);
        Double.isNaN(r);
        int i = (int) ((d / r) * 100.0d);
        this.f1555j.mo15982f(i);
        this.f1551f = i;
        this.f1550e = i;
        this.f1552g = System.currentTimeMillis() - 1000;
        this.f1553h = j;
        this.f1555j.mo15974d().f1523a = 0;
        this.f1555j.mo15974d().f1524b = "";
    }

    /* renamed from: t */
    private void m1828t() {
        if (this.f1555j.mo15992n() == 5 || this.f1555j.mo15992n() == 3) {
            this.f1555j.mo16004x();
        }
    }

    /* renamed from: u */
    private void m1829u() {
        if (this.f1547b != null) {
            C1278a.m1583c("HiAppDownload", "sendMessage: interrupted = " + this.f1555j.f1505g + ", interrupted reason = " + this.f1555j.f1506h + ", status = " + this.f1555j.mo15992n() + ", progress = " + this.f1555j.mo15994p());
            Handler handler = this.f1547b;
            handler.sendMessage(handler.obtainMessage(this.f1555j.mo15992n(), this.f1555j));
        }
    }

    /* renamed from: v */
    private void m1830v() {
        DownloadTask downloadTask;
        int i = 3;
        if (this.f1555j.mo15984g() == 3) {
            downloadTask = this.f1555j;
        } else if (this.f1555j.mo15984g() == 1 || this.f1555j.mo15984g() == 2) {
            downloadTask = this.f1555j;
            i = 6;
        } else {
            return;
        }
        downloadTask.mo15975d(i);
    }

    /* renamed from: w */
    private void m1831w() throws C1314c {
        String str;
        mo16046c();
        this.f1557l.clear();
        ConnectivityManager c = C1294a.m1650a().mo15901c();
        if (c != null) {
            this.f1555j.mo15958a(c.getActiveNetworkInfo());
        }
        this.f1561p = true;
        for (C1312a aVar : this.f1555j.mo15963b()) {
            if (aVar.mo16018b() + aVar.mo16020d() > aVar.mo16019c()) {
                str = "one thread already download finished before, ingnore";
            } else {
                RunnableC1317f fVar = new RunnableC1317f(this.f1555j, aVar, this);
                this.f1557l.add(fVar);
                fVar.mo16048a(C1315d.m1780a().mo16034c().submit(fVar));
                str = "summit thread task, start=" + aVar.mo16018b() + " end=" + aVar.mo16019c() + " finished=" + aVar.mo16020d();
            }
            C1278a.m1583c("HiAppDownload", str);
            this.f1561p = this.f1561p && aVar.mo16020d() == 0;
        }
        this.f1555j.mo15978e().mo16012a(System.currentTimeMillis());
    }

    /* renamed from: x */
    private void m1832x() {
        for (RunnableC1317f fVar : this.f1557l) {
            fVar.mo16051c();
            if (this.f1555j.mo16001v() != null) {
                this.f1555j.mo16001v().cancel(true);
            }
        }
    }

    /* renamed from: y */
    private void m1833y() {
        int i = 0;
        for (C1312a aVar : this.f1555j.mo15963b()) {
            i = (int) (((long) i) + aVar.mo16020d());
        }
        this.f1555j.mo15965b((long) i);
    }

    /* renamed from: z */
    private void m1834z() {
        synchronized (this.f1556k) {
            while (!m1823o() && !this.f1555j.f1505g && this.f1548c) {
                try {
                    this.f1556k.wait(400);
                } catch (InterruptedException unused) {
                    C1278a.m1584d("HiAppDownload", "task lock interrupted");
                }
            }
        }
        C1278a.m1583c("HiAppDownload", "waitAllDownloadThreadsDone finished");
    }

    /* renamed from: a */
    public String mo16041a(String str) {
        StringBuilder sb;
        String str2;
        if (str == null) {
            return null;
        }
        File parentFile = new File(str).getParentFile();
        if (parentFile == null) {
            return str;
        }
        if (parentFile.getName().equalsIgnoreCase("tmp")) {
            sb = new StringBuilder();
            str2 = parentFile.getParent();
        } else {
            sb = new StringBuilder();
            str2 = parentFile.getAbsolutePath();
        }
        sb.append(str2);
        sb.append(File.separator);
        return sb.toString();
    }

    @Override // com.huawei.updatesdk.sdk.service.download.AbstractC1324j
    /* renamed from: a */
    public void mo16042a() {
        if (!this.f1559n) {
            m1825q();
        }
    }

    /* renamed from: a */
    public void mo16043a(AbstractC1306b bVar) {
        this.f1546a = bVar;
    }

    @Override // com.huawei.updatesdk.sdk.service.download.AbstractC1324j
    /* renamed from: a */
    public void mo16044a(C1314c cVar) {
        if (!this.f1559n) {
            C1278a.m1584d("HiAppDownload", "one thread downloadFailed : errorcode " + cVar.mo16022b() + "  errormessage: " + cVar.mo16021a());
            if (this.f1554i == null) {
                this.f1554i = cVar;
            }
            m1832x();
            m1825q();
        }
    }

    @Override // com.huawei.updatesdk.sdk.service.download.AbstractC1324j
    /* renamed from: b */
    public void mo16045b() {
        if (!this.f1559n) {
            m1809c(false);
        }
    }

    /* renamed from: c */
    public void mo16046c() throws C1314c {
        if (this.f1555j.f1505g && this.f1548c) {
            this.f1548c = false;
        }
        if (!this.f1548c) {
            C1278a.m1584d("HiAppDownload", "throwIfInterrupt reason : " + this.f1555j.mo15984g());
            int i = this.f1555j.mo15984g() == 3 ? 104 : 105;
            throw new C1314c(i, "download interrputed : " + this.f1555j.mo15984g());
        }
    }

    public void run() {
        try {
            if (this.f1555j != null) {
                m1820l();
                if (!this.f1549d) {
                    mo16046c();
                    C1278a.m1584d("HiAppDownload", "quit downloadrunnalbe, result : failed, err:" + this.f1555j.mo15974d().f1524b + ",  package:" + this.f1555j.mo16002w());
                    this.f1555j.mo15975d(5);
                    int i = this.f1555j.mo15974d().f1523a;
                    if (i == 113 || i == 112 || i == 119) {
                        this.f1555j.mo15962a(true, 2);
                        if (i == 119) {
                            this.f1555j.mo15962a(true, 1);
                        }
                        this.f1555j.mo15975d(6);
                        if (this.f1555j.mo15992n() == 6) {
                            m1833y();
                        }
                    }
                    m1829u();
                } else {
                    this.f1546a.mo15948a(this.f1555j, this.f1555j.mo15998t());
                    this.f1555j.mo15975d(4);
                    m1829u();
                    C1278a.m1583c("HiAppDownload", "quit downloadrunnalbe, result : succeed ,  package:" + this.f1555j.mo16002w());
                }
                m1828t();
                this.f1559n = true;
            }
        } catch (C1314c e) {
            m1805b(e);
            C1278a.m1584d("HiAppDownload", "quit downloadrunnalbe, result : failed, errorcode:" + e.mo16022b() + ", error message: " + e.mo16021a() + ",  package:" + this.f1555j.mo16002w());
        }
    }
}
