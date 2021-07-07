package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
public class NumberedThreadFactory implements ThreadFactory {
    public final int priority;
    public final ThreadFactory zzhq;
    public final String zzhr;
    public final AtomicInteger zzhs;

    @KeepForSdk
    public NumberedThreadFactory(String str) {
        this(str, 0);
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.zzhq.newThread(new zza(runnable, 0));
        String str = this.zzhr;
        int andIncrement = this.zzhs.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }

    public NumberedThreadFactory(String str, int i) {
        this.zzhs = new AtomicInteger();
        this.zzhq = Executors.defaultThreadFactory();
        this.zzhr = (String) Preconditions.checkNotNull(str, "Name must not be null");
        this.priority = 0;
    }
}
