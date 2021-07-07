package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.GmsClientEventManager;

public final class zaax implements GmsClientEventManager.GmsClientEventState {
    public final /* synthetic */ zaaw zahg;

    public zaax(zaaw zaaw) {
        this.zahg = zaaw;
    }

    @Override // com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState
    public final Bundle getConnectionHint() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState
    public final boolean isConnected() {
        return this.zahg.isConnected();
    }
}
