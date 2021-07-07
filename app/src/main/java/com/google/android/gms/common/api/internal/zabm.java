package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.BaseGmsClient;

public final class zabm implements BaseGmsClient.SignOutCallbacks {
    public final /* synthetic */ GoogleApiManager.zaa zaix;

    public zabm(GoogleApiManager.zaa zaa) {
        this.zaix = zaa;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    public final void onSignOutComplete() {
        GoogleApiManager.this.handler.post(new zabn(this));
    }
}
