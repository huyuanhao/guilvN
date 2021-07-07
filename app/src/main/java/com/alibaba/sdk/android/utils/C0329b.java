package com.alibaba.sdk.android.utils;

import java.lang.Thread;

/* renamed from: com.alibaba.sdk.android.utils.b */
public class C0329b implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread thread, Throwable th) {
        String str = "Catch an uncaught exception, " + thread.getName() + ", error message: " + th.getMessage();
        th.printStackTrace();
    }
}
