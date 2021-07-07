package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;
import com.google.android.gms.internal.auth.zzah;
import com.google.android.gms.internal.auth.zzz;

public final class zzi extends AccountTransferClient.zzc {
    public final /* synthetic */ zzah zzat;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzi(AccountTransferClient accountTransferClient, zzah zzah) {
        super(null);
        this.zzat = zzah;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzb
    public final void zza(zzz zzz) throws RemoteException {
        zzz.zza(this.zzax, this.zzat);
    }
}
