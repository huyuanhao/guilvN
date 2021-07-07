package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

public final class zau implements zabt {
    public final /* synthetic */ zas zaep;

    public zau(zas zas) {
        this.zaep = zas;
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    public final void zab(@Nullable Bundle bundle) {
        this.zaep.zaen.lock();
        try {
            this.zaep.zaa((zas) bundle);
            this.zaep.zaek = ConnectionResult.RESULT_SUCCESS;
            this.zaep.zax();
        } finally {
            this.zaep.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    public final void zac(@NonNull ConnectionResult connectionResult) {
        this.zaep.zaen.lock();
        try {
            this.zaep.zaek = connectionResult;
            this.zaep.zax();
        } finally {
            this.zaep.zaen.unlock();
        }
    }

    public /* synthetic */ zau(zas zas, zat zat) {
        this(zas);
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    public final void zab(int i, boolean z) {
        this.zaep.zaen.lock();
        try {
            if (!(this.zaep.zaem) && this.zaep.zael != null) {
                if (this.zaep.zael.isSuccess()) {
                    this.zaep.zaem = true;
                    this.zaep.zaef.onConnectionSuspended(i);
                    this.zaep.zaen.unlock();
                    return;
                }
            }
            this.zaep.zaem = false;
            this.zaep.zaa((zas) i, (int) z);
        } finally {
            this.zaep.zaen.unlock();
        }
    }
}
