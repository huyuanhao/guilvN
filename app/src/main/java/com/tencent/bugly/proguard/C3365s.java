package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.text.TextUtils;
import com.tencent.bugly.beta.download.AbstractC3220b;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.beta.global.C3226e;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.tencent.bugly.proguard.s */
public class C3365s implements AbstractC3220b {

    /* renamed from: a */
    public static C3365s f8247a = new C3365s();

    /* renamed from: b */
    public ConcurrentHashMap<String, DownloadTask> f8248b = new ConcurrentHashMap<>(3);

    /* renamed from: c */
    public ScheduledExecutorService f8249c = null;

    public C3365s() {
        try {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(3, new ThreadFactory() {
                /* class com.tencent.bugly.proguard.C3365s.ThreadFactoryC33661 */

                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable);
                    thread.setName("BETA_SDK_DOWNLOAD");
                    return thread;
                }
            });
            this.f8249c = newScheduledThreadPool;
            if (newScheduledThreadPool.isShutdown()) {
                throw new IllegalArgumentException("ScheduledExecutorService is not available!");
            }
        } catch (Exception e) {
            C3321an.m8350a(e);
        }
    }

    @Override // com.tencent.bugly.beta.download.AbstractC3220b
    /* renamed from: a */
    public DownloadTask mo37901a(String str, String str2, String str3, String str4) {
        RunnableC3367t tVar = null;
        if (TextUtils.isEmpty(str)) {
            C3321an.m8357e("downloadUrl is null!", new Object[0]);
            return null;
        } else if (TextUtils.isEmpty(str2)) {
            C3321an.m8357e("saveDir is null!", new Object[0]);
            return null;
        } else if (this.f8248b.get(str) != null) {
            return this.f8248b.get(str);
        } else {
            ContentValues a = C3360p.f8238a.mo38496a(str);
            if (!(a == null || a.get("_dUrl") == null || a.getAsString("_sFile") == null || a.getAsLong("_sLen") == null || a.getAsLong("_tLen") == null || a.getAsString("_MD5") == null)) {
                tVar = new RunnableC3367t((String) a.get("_dUrl"), a.getAsString("_sFile"), a.getAsLong("_sLen").longValue(), a.getAsLong("_tLen").longValue(), a.getAsString("_MD5"));
                if (a.getAsLong("_DLTIME") != null) {
                    tVar.f8251k = a.getAsLong("_DLTIME").longValue();
                }
            }
            if (tVar == null) {
                tVar = new RunnableC3367t(str, str2, str3, str4);
            }
            tVar.setDownloadType(C3226e.f7357E.f7388ae);
            return tVar;
        }
    }

    /* renamed from: a */
    public synchronized boolean mo38509a(Runnable runnable) {
        if (this.f8249c != null) {
            if (!this.f8249c.isShutdown()) {
                if (runnable == null) {
                    C3321an.m8356d("async task = null", new Object[0]);
                    return false;
                }
                C3321an.m8356d("task start %s", runnable.getClass().getName());
                this.f8249c.execute(runnable);
                return true;
            }
        }
        C3321an.m8356d("async handler was closed , should not post task!", new Object[0]);
        return false;
    }
}
