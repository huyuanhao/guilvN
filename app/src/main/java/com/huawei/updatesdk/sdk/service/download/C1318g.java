package com.huawei.updatesdk.sdk.service.download;

import com.facebook.react.animated.InterpolationAnimatedNode;
import com.huawei.updatesdk.sdk.p062a.p065b.C1276b;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.p062a.p069d.AbstractC1293e;
import com.huawei.updatesdk.sdk.p062a.p069d.p073c.C1291b;
import com.huawei.updatesdk.sdk.service.download.bean.DownloadTask;
import com.huawei.updatesdk.sdk.service.p074a.C1294a;
import com.p118pd.sdk.C8122oOOOO0oo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* renamed from: com.huawei.updatesdk.sdk.service.download.g */
public class C1318g {

    /* renamed from: a */
    public static volatile C1318g f1576a;

    /* renamed from: com.huawei.updatesdk.sdk.service.download.g$a */
    public static class C1320a {

        /* renamed from: a */
        public boolean f1578a = false;

        /* renamed from: b */
        public Exception f1579b = null;

        /* renamed from: a */
        public void mo16056a(Exception exc) {
            this.f1579b = exc;
        }

        /* renamed from: a */
        public void mo16057a(boolean z) {
            this.f1578a = z;
        }

        /* renamed from: a */
        public boolean mo16058a() {
            return this.f1578a;
        }

        /* renamed from: b */
        public Exception mo16059b() {
            return this.f1579b;
        }
    }

    /* renamed from: a */
    public static long m1858a(String str) {
        String str2;
        long j = -1;
        if (AbstractC1293e.m1646a(str) || !str.startsWith("bytes")) {
            return -1;
        }
        int indexOf = str.indexOf(47);
        if (-1 != indexOf) {
            try {
                j = Long.parseLong(str.substring(indexOf + 1));
                C1278a.m1580a("HiAppDownload", "get new filelength by Content-Range:" + j);
                return j;
            } catch (NumberFormatException unused) {
                str2 = "getEntityLegth NumberFormatException";
            }
        } else {
            str2 = "getEntityLegth failed Content-Range";
            C1278a.m1584d("HiAppDownload", str2);
            return j;
        }
    }

    /* renamed from: a */
    public static C1320a m1859a(DownloadTask downloadTask, final HttpURLConnection httpURLConnection, boolean z) {
        Exception e;
        if (httpURLConnection == null) {
            return null;
        }
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C1320a aVar = new C1320a();
        Future<?> submit = newSingleThreadExecutor.submit(new Callable<C1320a>() {
            /* class com.huawei.updatesdk.sdk.service.download.C1318g.CallableC13191 */

            /* renamed from: a */
            public C1320a call() {
                C1320a aVar = new C1320a();
                try {
                    httpURLConnection.connect();
                    aVar.mo16057a(true);
                } catch (IOException e) {
                    C1278a.m1584d("HiAppDownload", e.toString());
                    aVar.mo16056a(e);
                }
                return aVar;
            }
        });
        if (downloadTask != null && z) {
            downloadTask.mo15968b(submit);
        }
        try {
            return (C1320a) submit.get(8000, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e2) {
            C1278a.m1584d("HiAppDownload", e2.toString());
            e = new SocketTimeoutException("connect timeout");
            aVar.mo16056a(e);
            return aVar;
        } catch (Exception e3) {
            e = e3;
            C1278a.m1584d("HiAppDownload", e.toString());
            aVar.mo16056a(e);
            return aVar;
        }
    }

    /* renamed from: a */
    public static synchronized C1318g m1860a() {
        C1318g gVar;
        synchronized (C1318g.class) {
            if (f1576a == null) {
                f1576a = new C1318g();
            }
            gVar = f1576a;
        }
        return gVar;
    }

    /* renamed from: b */
    private Proxy m1861b() {
        if (C1291b.m1638b(C1294a.m1650a().mo15900b())) {
            return C1291b.m1633a();
        }
        return null;
    }

    /* renamed from: a */
    public HttpURLConnection mo16053a(String str, boolean z) throws IOException, CertificateException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, IllegalAccessException {
        URL url = new URL(str);
        Proxy b = m1861b();
        HttpURLConnection httpURLConnection = (HttpURLConnection) (b == null ? url.openConnection() : url.openConnection(b));
        httpURLConnection.setConnectTimeout(C8122oOOOO0oo.o0OO00O);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestProperty("Accept-Encoding", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
        httpURLConnection.setInstanceFollowRedirects(z);
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setSSLSocketFactory(C1276b.m1576a(C1294a.m1650a().mo15900b()));
            httpsURLConnection.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        }
        return httpURLConnection;
    }
}
