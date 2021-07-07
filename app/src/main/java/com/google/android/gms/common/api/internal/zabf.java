package com.google.android.gms.common.api.internal;

public abstract class zabf {
    public final zabd zaht;

    public zabf(zabd zabd) {
        this.zaht = zabd;
    }

    public abstract void zaan();

    public final void zac(zabe zabe) {
        zabe.zaen.lock();
        try {
            if (zabe.zahp == this.zaht) {
                zaan();
                zabe.zaen.unlock();
            }
        } finally {
            zabe.zaen.unlock();
        }
    }
}
