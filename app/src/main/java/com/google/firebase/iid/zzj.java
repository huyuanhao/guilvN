package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class zzj implements ThreadFactory {
    public static final ThreadFactory zzae = new zzj();

    public final Thread newThread(Runnable runnable) {
        return zzi.zza(runnable);
    }
}
