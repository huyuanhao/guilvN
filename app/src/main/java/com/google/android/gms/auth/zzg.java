package com.google.android.gms.auth;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzf;
import java.io.IOException;
import java.util.List;

public final class zzg implements zzj<List<AccountChangeEvent>> {
    public final /* synthetic */ String zzr;
    public final /* synthetic */ int zzs;

    public zzg(String str, int i) {
        this.zzr = str;
        this.zzs = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.auth.zzj
    public final /* synthetic */ List<AccountChangeEvent> zzb(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        return ((AccountChangeEventsResponse) zzd.zza(zzf.zza(iBinder).zza(new AccountChangeEventsRequest().setAccountName(this.zzr).setEventIndex(this.zzs)))).getEvents();
    }
}
