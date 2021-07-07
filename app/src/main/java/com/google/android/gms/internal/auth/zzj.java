package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.auth.account.zzc;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

public final class zzj extends BaseImplementation.ApiMethodImpl<WorkAccountApi.AddAccountResult, zzr> {
    public final /* synthetic */ String zzq;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzj(zzh zzh, Api api, GoogleApiClient googleApiClient, String str) {
        super(api, googleApiClient);
        this.zzq = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zzo(status, null);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.Api$AnyClient] */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(zzr zzr) throws RemoteException {
        ((zzc) zzr.getService()).zza(new zzk(this), this.zzq);
    }
}
