package com.huawei.updatesdk.support.p082b;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.huawei.updatesdk.support.b.c */
public class C1369c {

    /* renamed from: a */
    public static final ThreadPoolExecutor f1662a = new ThreadPoolExecutor(2, 2, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: b */
    public static final ThreadPoolExecutor f1663b = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
}
