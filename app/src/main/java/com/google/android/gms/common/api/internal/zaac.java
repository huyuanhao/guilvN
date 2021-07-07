package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public final class zaac implements PendingResult.StatusListener {
    public final /* synthetic */ BasePendingResult zafl;
    public final /* synthetic */ zaab zafm;

    public zaac(zaab zaab, BasePendingResult basePendingResult) {
        this.zafm = zaab;
        this.zafl = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        this.zafm.zafj.remove(this.zafl);
    }
}
