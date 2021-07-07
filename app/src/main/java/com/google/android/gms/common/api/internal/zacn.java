package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;

public final class zacn implements Runnable {
    public final /* synthetic */ Result zaku;
    public final /* synthetic */ zacm zakv;

    public zacn(zacm zacm, Result result) {
        this.zakv = zacm;
        this.zaku = result;
    }

    @WorkerThread
    public final void run() {
        try {
            BasePendingResult.zadm.set(true);
            this.zakv.zaks.sendMessage(this.zakv.zaks.obtainMessage(0, this.zakv.zakn.onSuccess(this.zaku)));
            BasePendingResult.zadm.set(false);
            zacm zacm = this.zakv;
            zacm.zab(this.zaku);
            GoogleApiClient googleApiClient = (GoogleApiClient) this.zakv.zadp.get();
            if (googleApiClient != null) {
                googleApiClient.zab(this.zakv);
            }
        } catch (RuntimeException e) {
            this.zakv.zaks.sendMessage(this.zakv.zaks.obtainMessage(1, e));
            BasePendingResult.zadm.set(false);
            zacm zacm2 = this.zakv;
            zacm.zab(this.zaku);
            GoogleApiClient googleApiClient2 = (GoogleApiClient) this.zakv.zadp.get();
            if (googleApiClient2 != null) {
                googleApiClient2.zab(this.zakv);
            }
        } catch (Throwable th) {
            BasePendingResult.zadm.set(false);
            zacm zacm3 = this.zakv;
            zacm.zab(this.zaku);
            GoogleApiClient googleApiClient3 = (GoogleApiClient) this.zakv.zadp.get();
            if (googleApiClient3 != null) {
                googleApiClient3.zab(this.zakv);
            }
            throw th;
        }
    }
}
