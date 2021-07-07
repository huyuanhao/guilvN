package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import javax.annotation.concurrent.GuardedBy;

public final class zaap extends zabf {
    public final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks zagn;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zaap(zaan zaan, zabd zabd, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabd);
        this.zagn = connectionProgressReportCallbacks;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("mLock")
    public final void zaan() {
        this.zagn.onReportServiceBinding(new ConnectionResult(16, null));
    }
}
