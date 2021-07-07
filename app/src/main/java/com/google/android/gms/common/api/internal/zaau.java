package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;

public abstract class zaau implements Runnable {
    public final /* synthetic */ zaak zagi;

    public zaau(zaak zaak) {
        this.zagi = zaak;
    }

    @WorkerThread
    public void run() {
        this.zagi.zaen.lock();
        try {
            if (!Thread.interrupted()) {
                zaan();
                this.zagi.zaen.unlock();
            }
        } catch (RuntimeException e) {
            this.zagi.zafs.zab(e);
        } finally {
            this.zagi.zaen.unlock();
        }
    }

    @WorkerThread
    public abstract void zaan();

    public /* synthetic */ zaau(zaak zaak, zaal zaal) {
        this(zaak);
    }
}
