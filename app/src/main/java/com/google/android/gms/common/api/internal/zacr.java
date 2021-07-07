package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import com.google.android.gms.common.api.zac;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

public final class zacr implements IBinder.DeathRecipient, zacs {
    public final WeakReference<BasePendingResult<?>> zalb;
    public final WeakReference<zac> zalc;
    public final WeakReference<IBinder> zald;

    public zacr(BasePendingResult<?> basePendingResult, zac zac, IBinder iBinder) {
        this.zalc = new WeakReference<>(zac);
        this.zalb = new WeakReference<>(basePendingResult);
        this.zald = new WeakReference<>(iBinder);
    }

    private final void zaby() {
        BasePendingResult<?> basePendingResult = this.zalb.get();
        zac zac = this.zalc.get();
        if (!(zac == null || basePendingResult == null)) {
            zac.remove(basePendingResult.zam().intValue());
        }
        IBinder iBinder = this.zald.get();
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
        }
    }

    public final void binderDied() {
        zaby();
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    public final void zac(BasePendingResult<?> basePendingResult) {
        zaby();
    }

    public /* synthetic */ zacr(BasePendingResult basePendingResult, zac zac, IBinder iBinder, zacq zacq) {
        this(basePendingResult, null, iBinder);
    }
}
