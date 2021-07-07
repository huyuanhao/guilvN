package com.google.android.gms.internal.firebase_ml;

import java.util.concurrent.Executor;

public enum zzlv implements Executor {
    INSTANCE;

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
