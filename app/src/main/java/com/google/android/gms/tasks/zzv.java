package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

public final class zzv implements Runnable {
    public final /* synthetic */ Callable val$callable;
    public final /* synthetic */ zzu zzad;

    public zzv(zzu zzu, Callable callable) {
        this.zzad = zzu;
        this.val$callable = callable;
    }

    public final void run() {
        try {
            this.zzad.setResult(this.val$callable.call());
        } catch (Exception e) {
            this.zzad.setException(e);
        }
    }
}
