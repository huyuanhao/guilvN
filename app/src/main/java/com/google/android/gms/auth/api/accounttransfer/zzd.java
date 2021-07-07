package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;
import com.google.android.gms.internal.auth.zzaf;
import com.google.android.gms.internal.auth.zzz;

public final class zzd extends AccountTransferClient.zzc {
    public final /* synthetic */ zzaf zzao;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzd(AccountTransferClient accountTransferClient, zzaf zzaf) {
        super(null);
        this.zzao = zzaf;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzb
    public final void zza(zzz zzz) throws RemoteException {
        zzz.zza(this.zzax, this.zzao);
    }
}
