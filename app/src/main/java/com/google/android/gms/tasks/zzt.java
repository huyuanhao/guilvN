package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

public final class zzt implements Executor {
    public final void execute(@NonNull Runnable runnable) {
        runnable.run();
    }
}
