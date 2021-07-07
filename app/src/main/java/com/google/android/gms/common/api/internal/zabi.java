package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

public final class zabi implements BackgroundDetector.BackgroundStateChangeListener {
    public final /* synthetic */ GoogleApiManager zail;

    public zabi(GoogleApiManager googleApiManager) {
        this.zail = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        this.zail.handler.sendMessage(this.zail.handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
