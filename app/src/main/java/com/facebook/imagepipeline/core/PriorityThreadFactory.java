package com.facebook.imagepipeline.core;

import android.os.Process;
import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class PriorityThreadFactory implements ThreadFactory {
    public final boolean mAddThreadNumber;
    public final String mPrefix;
    public final AtomicInteger mThreadNumber;
    public final int mThreadPriority;

    public PriorityThreadFactory(int i) {
        this(i, "PriorityThreadFactory", true);
    }

    public Thread newThread(final Runnable runnable) {
        String str;
        RunnableC05251 r0 = new Runnable() {
            /* class com.facebook.imagepipeline.core.PriorityThreadFactory.RunnableC05251 */

            public void run() {
                try {
                    Process.setThreadPriority(PriorityThreadFactory.this.mThreadPriority);
                } catch (Throwable unused) {
                }
                runnable.run();
            }
        };
        if (this.mAddThreadNumber) {
            str = this.mPrefix + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.mThreadNumber.getAndIncrement();
        } else {
            str = this.mPrefix;
        }
        return new Thread(r0, str);
    }

    public PriorityThreadFactory(int i, String str, boolean z) {
        this.mThreadNumber = new AtomicInteger(1);
        this.mThreadPriority = i;
        this.mPrefix = str;
        this.mAddThreadNumber = z;
    }
}
