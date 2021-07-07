package com.google.android.gms.internal.phenotype;

import android.database.ContentObserver;
import android.os.Handler;

public final class zzg extends ContentObserver {
    public zzg(Handler handler) {
        super(null);
    }

    public final void onChange(boolean z) {
        zzf.zzi().set(true);
    }
}
