package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@KeepForSdk
public class NamedThreadFactory implements ThreadFactory {
    public final String name;
    public final int priority;
    public final ThreadFactory zzhq;

    @KeepForSdk
    public NamedThreadFactory(String str) {
        this(str, 0);
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.zzhq.newThread(new zza(runnable, 0));
        newThread.setName(this.name);
        return newThread;
    }

    public NamedThreadFactory(String str, int i) {
        this.zzhq = Executors.defaultThreadFactory();
        this.name = (String) Preconditions.checkNotNull(str, "Name must not be null");
        this.priority = 0;
    }
}
