package com.p118pd.sdk;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.oo00Oo0o  reason: case insensitive filesystem */
public class C8549oo00Oo0o {
    public static C8549oo00Oo0o OooO00o = new C8549oo00Oo0o();
    public static C8549oo00Oo0o OooO0O0 = new C8549oo00Oo0o();
    public static C8549oo00Oo0o OooO0OO = new C8549oo00Oo0o();
    public static C8549oo00Oo0o OooO0Oo = new C8549oo00Oo0o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public ThreadPoolExecutor f21668OooO00o = new ThreadPoolExecutor(0, 1, 60000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(5000));

    /* renamed from: com.pd.sdk.oo00Oo0o$OooO00o */
    public static class OooO00o implements Runnable {
        public Runnable OooO00o;

        public OooO00o(Runnable runnable) {
            this.OooO00o = runnable;
        }

        public void run() {
            Runnable runnable = this.OooO00o;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Exception unused) {
                    AbstractC8536oo00OO0O.OooO0OO("TaskThread", "InnerTask : Exception has happened,From internal operations!");
                }
            }
        }
    }

    public static C8549oo00Oo0o OooO00o() {
        return OooO00o;
    }

    public static C8549oo00Oo0o OooO0O0() {
        return OooO0O0;
    }

    public static C8549oo00Oo0o OooO0OO() {
        return OooO0OO;
    }

    public static C8549oo00Oo0o OooO0Oo() {
        return OooO0Oo;
    }

    public void OooO00o(AbstractRunnableC8546oo00Oo0 oo00oo0) {
        try {
            this.f21668OooO00o.execute(new OooO00o(oo00oo0));
        } catch (RejectedExecutionException unused) {
            AbstractC8536oo00OO0O.OooO0OO("TaskThread", "addToQueue() Exception has happened!Form rejected execution");
        }
    }
}
