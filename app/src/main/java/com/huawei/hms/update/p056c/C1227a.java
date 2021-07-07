package com.huawei.hms.update.p056c;

import android.content.Context;
import android.os.AsyncTask;
import com.huawei.hms.support.log.C1202a;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.huawei.hms.update.c.a */
public final class C1227a {

    /* renamed from: a */
    public static boolean f1363a;

    /* renamed from: b */
    public CountDownLatch f1364b;

    /* renamed from: com.huawei.hms.update.c.a$a */
    public class AsyncTaskC1228a extends AsyncTask<Context, Integer, Boolean> {
        public AsyncTaskC1228a() {
        }

        /* renamed from: a */
        public Boolean doInBackground(Context... contextArr) {
            boolean z = false;
            try {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL("https://play.google.com/store").openConnection();
                if (httpsURLConnection != null) {
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setConnectTimeout(30000);
                    httpsURLConnection.setReadTimeout(30000);
                    httpsURLConnection.setUseCaches(false);
                    int responseCode = httpsURLConnection.getResponseCode();
                    C1202a.m1318b("PingTask", "GET google result:" + responseCode);
                    z = true;
                }
            } catch (RuntimeException unused) {
                C1202a.m1320d("PingTask", "GET google result:RuntimeException");
            } catch (IOException unused2) {
                C1202a.m1320d("PingTask", "GET google result:safe exception");
            } catch (Exception unused3) {
                C1202a.m1320d("PingTask", "GET google result:Exception");
            }
            boolean unused4 = C1227a.f1363a = z;
            C1227a.this.f1364b.countDown();
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public boolean mo15755a(long j, TimeUnit timeUnit) {
        if (f1363a) {
            C1202a.m1318b("PingTask", "ping google return cache");
            return true;
        }
        C1202a.m1318b("PingTask", "start ping goole");
        this.f1364b = new CountDownLatch(1);
        new AsyncTaskC1228a().execute(new Context[0]);
        try {
            if (!this.f1364b.await(j, timeUnit)) {
                C1202a.m1318b("PingTask", "await time out");
                return false;
            }
            C1202a.m1318b("PingTask", "await:isReachable:" + f1363a);
            return f1363a;
        } catch (InterruptedException unused) {
            C1202a.m1320d("PingTask", "await:InterruptedException:");
            return false;
        }
    }
}
