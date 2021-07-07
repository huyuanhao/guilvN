package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

public final class zan implements Runnable {
    public final zam zadi;
    public final /* synthetic */ zal zadj;

    public zan(zal zal, zam zam) {
        this.zadj = zal;
        this.zadi = zam;
    }

    @MainThread
    public final void run() {
        if (this.zadj.mStarted) {
            ConnectionResult connectionResult = this.zadi.getConnectionResult();
            if (connectionResult.hasResolution()) {
                zal zal = this.zadj;
                zal.mLifecycleFragment.startActivityForResult(GoogleApiActivity.zaa(zal.getActivity(), connectionResult.getResolution(), this.zadi.zar(), false), 1);
            } else if (this.zadj.zacc.isUserResolvableError(connectionResult.getErrorCode())) {
                zal zal2 = this.zadj;
                zal2.zacc.zaa(zal2.getActivity(), this.zadj.mLifecycleFragment, connectionResult.getErrorCode(), 2, this.zadj);
            } else if (connectionResult.getErrorCode() == 18) {
                Dialog zaa = GoogleApiAvailability.zaa(this.zadj.getActivity(), this.zadj);
                zal zal3 = this.zadj;
                zal3.zacc.zaa(zal3.getActivity().getApplicationContext(), new zao(this, zaa));
            } else {
                this.zadj.zaa(connectionResult, this.zadi.zar());
            }
        }
    }
}
