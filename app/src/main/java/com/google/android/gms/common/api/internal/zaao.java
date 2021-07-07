package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import javax.annotation.concurrent.GuardedBy;

public final class zaao extends zabf {
    public final /* synthetic */ ConnectionResult zagl;
    public final /* synthetic */ zaan zagm;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zaao(zaan zaan, zabd zabd, ConnectionResult connectionResult) {
        super(zabd);
        this.zagm = zaan;
        this.zagl = connectionResult;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("mLock")
    public final void zaan() {
        this.zagm.zagi.zae((zaak) this.zagl);
    }
}
