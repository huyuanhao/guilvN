package com.alibaba.sdk.android.httpdns.probe;

import androidx.annotation.NonNull;
import com.alibaba.sdk.android.httpdns.C0266c;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alibaba.sdk.android.httpdns.probe.a */
public class RunnableC0315a implements Runnable {

    /* renamed from: a */
    public AbstractC0321f f691a = null;

    /* renamed from: a */
    public String[] f692a;

    /* renamed from: b */
    public ConcurrentHashMap<String, Long> f693b = new ConcurrentHashMap<>();

    /* renamed from: h */
    public String f694h;

    /* renamed from: i */
    public long f695i;
    public int port;

    public RunnableC0315a(long j, @NonNull String str, @NonNull String[] strArr, int i, AbstractC0321f fVar) {
        this.f695i = j;
        this.f694h = str;
        this.f692a = strArr;
        this.port = i;
        this.f691a = fVar;
    }

    /* renamed from: a */
    private C0317c m564a(String[] strArr) {
        String[] strArr2 = this.f692a;
        if (strArr2 == null || strArr2.length == 0 || strArr == null || strArr.length == 0) {
            return null;
        }
        String str = strArr2[0];
        String str2 = strArr[0];
        return new C0317c(this.f694h, strArr, str, str2, this.f693b.containsKey(str) ? this.f693b.get(str).longValue() : 2147483647L, this.f693b.containsKey(str2) ? this.f693b.get(str2).longValue() : 2147483647L);
    }

    /* renamed from: a */
    private String[] m565a(ConcurrentHashMap<String, Long> concurrentHashMap) {
        if (concurrentHashMap == null) {
            return null;
        }
        int size = concurrentHashMap.size();
        String[] strArr = new String[size];
        int i = 0;
        for (String str : concurrentHashMap.keySet()) {
            strArr[i] = new String(str);
            i++;
        }
        for (int i2 = 0; i2 < size - 1; i2++) {
            int i3 = 0;
            while (i3 < (size - i2) - 1) {
                int i4 = i3 + 1;
                if (concurrentHashMap.get(strArr[i3]).longValue() > concurrentHashMap.get(strArr[i4]).longValue()) {
                    String str2 = strArr[i3];
                    strArr[i3] = strArr[i4];
                    strArr[i4] = str2;
                }
                i3 = i4;
            }
        }
        return strArr;
    }

    public void run() {
        String[] a;
        String[] strArr = this.f692a;
        if (strArr != null && strArr.length != 0) {
            CountDownLatch countDownLatch = new CountDownLatch(this.f692a.length);
            for (int i = 0; i < this.f692a.length; i++) {
                C0266c.m467a().execute(new RunnableC0322g(this.f692a[i], this.port, countDownLatch, this.f693b));
            }
            try {
                countDownLatch.await(TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE, TimeUnit.MILLISECONDS);
                if (!(this.f691a == null || (a = m565a(this.f693b)) == null || a.length == 0)) {
                    this.f691a.mo4055a(this.f695i, m564a(a));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
