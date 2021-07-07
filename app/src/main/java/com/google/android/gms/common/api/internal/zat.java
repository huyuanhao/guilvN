package com.google.android.gms.common.api.internal;

public final class zat implements Runnable {
    public final /* synthetic */ zas zaep;

    public zat(zas zas) {
        this.zaep = zas;
    }

    public final void run() {
        this.zaep.zaen.lock();
        try {
            this.zaep.zax();
        } finally {
            this.zaep.zaen.unlock();
        }
    }
}
