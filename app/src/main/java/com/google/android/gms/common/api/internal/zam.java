package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

public final class zam {
    public final int zadg;
    public final ConnectionResult zadh;

    public zam(ConnectionResult connectionResult, int i) {
        Preconditions.checkNotNull(connectionResult);
        this.zadh = connectionResult;
        this.zadg = i;
    }

    public final ConnectionResult getConnectionResult() {
        return this.zadh;
    }

    public final int zar() {
        return this.zadg;
    }
}
