package com.alibaba.sdk.android.httpdns.probe;

import androidx.annotation.NonNull;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.alibaba.sdk.android.httpdns.probe.g */
public class RunnableC0322g implements Runnable {

    /* renamed from: a */
    public CountDownLatch f707a = null;

    /* renamed from: b */
    public ConcurrentHashMap<String, Long> f708b;

    /* renamed from: k */
    public String f709k;
    public int port;

    public RunnableC0322g(@NonNull String str, int i, CountDownLatch countDownLatch, ConcurrentHashMap<String, Long> concurrentHashMap) {
        this.f709k = str;
        this.port = i;
        this.f707a = countDownLatch;
        this.f708b = concurrentHashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c A[SYNTHETIC, Splitter:B:18:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081 A[SYNTHETIC, Splitter:B:29:0x0081] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m579a(java.lang.String r8, int r9) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.probe.RunnableC0322g.m579a(java.lang.String, int):long");
    }

    /* renamed from: a */
    private boolean m580a(int i) {
        return i >= 1 && i <= 65535;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c A[Catch:{ Exception -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f709k     // Catch:{ Exception -> 0x0052 }
            if (r0 == 0) goto L_0x0043
            int r0 = r4.port     // Catch:{ Exception -> 0x0052 }
            boolean r0 = r4.m580a(r0)     // Catch:{ Exception -> 0x0052 }
            if (r0 != 0) goto L_0x000d
            goto L_0x0043
        L_0x000d:
            java.lang.String r0 = r4.f709k     // Catch:{ Exception -> 0x0052 }
            int r1 = r4.port     // Catch:{ Exception -> 0x0052 }
            long r0 = r4.m579a(r0, r1)     // Catch:{ Exception -> 0x0052 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0052 }
            r2.<init>()     // Catch:{ Exception -> 0x0052 }
            java.lang.String r3 = "connect cost for ip:"
            r2.append(r3)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r3 = r4.f709k     // Catch:{ Exception -> 0x0052 }
            r2.append(r3)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r3 = " is "
            r2.append(r3)     // Catch:{ Exception -> 0x0052 }
            r2.append(r0)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0052 }
            com.alibaba.sdk.android.httpdns.C0299i.m534d(r2)     // Catch:{ Exception -> 0x0052 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r2 = r4.f708b     // Catch:{ Exception -> 0x0052 }
            if (r2 == 0) goto L_0x0048
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r2 = r4.f708b     // Catch:{ Exception -> 0x0052 }
            java.lang.String r3 = r4.f709k     // Catch:{ Exception -> 0x0052 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0052 }
            r2.put(r3, r0)     // Catch:{ Exception -> 0x0052 }
            goto L_0x0048
        L_0x0043:
            java.lang.String r0 = "invalid params, give up"
            com.alibaba.sdk.android.httpdns.C0299i.m536f(r0)     // Catch:{ Exception -> 0x0052 }
        L_0x0048:
            java.util.concurrent.CountDownLatch r0 = r4.f707a     // Catch:{ Exception -> 0x0052 }
            if (r0 == 0) goto L_0x0056
            java.util.concurrent.CountDownLatch r0 = r4.f707a     // Catch:{ Exception -> 0x0052 }
            r0.countDown()     // Catch:{ Exception -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.probe.RunnableC0322g.run():void");
    }
}
