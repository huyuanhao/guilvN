package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

public final class zaam implements BaseGmsClient.ConnectionProgressReportCallbacks {
    public final Api<?> mApi;
    public final boolean zaeb;
    public final WeakReference<zaak> zagj;

    public zaam(zaak zaak, Api<?> api, boolean z) {
        this.zagj = new WeakReference<>(zaak);
        this.mApi = api;
        this.zaeb = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
        zaak zaak = this.zagj.get();
        if (zaak != null) {
            Preconditions.checkState(Looper.myLooper() == zaak.zad(zaak).zaed.getLooper(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            zaak.zac(zaak).lock();
            try {
                if (zaak.zaa(zaak, 0)) {
                    if (!connectionResult.isSuccess()) {
                        zaak.zaa(zaak, connectionResult, this.mApi, this.zaeb);
                    }
                    if (zaak.zak(zaak)) {
                        zaak.zaj(zaak);
                    }
                    zaak.zac(zaak).unlock();
                }
            } finally {
                zaak.zac(zaak).unlock();
            }
        }
    }
}
