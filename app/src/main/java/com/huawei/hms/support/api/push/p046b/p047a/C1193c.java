package com.huawei.hms.support.api.push.p046b.p047a;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.huawei.hms.support.api.push.b.a.c */
public class C1193c {

    /* renamed from: a */
    public static final Object f1300a = new Object();

    /* renamed from: b */
    public static ThreadPoolExecutor f1301b = new ThreadPoolExecutor(1, 50, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: a */
    public static ThreadPoolExecutor m1287a() {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (f1300a) {
            threadPoolExecutor = f1301b;
        }
        return threadPoolExecutor;
    }
}
