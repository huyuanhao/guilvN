package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

public final class zzz extends ContentObserver {
    public zzz(Handler handler) {
        super(null);
    }

    public final void onChange(boolean z) {
        zzy.zzct.set(true);
    }
}
