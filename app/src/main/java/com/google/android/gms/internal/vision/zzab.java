package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzab extends zza implements zzaa {
    public zzab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
    }

    @Override // com.google.android.gms.internal.vision.zzaa
    public final zzae[] zza(IObjectWrapper iObjectWrapper, zzn zzn, zzag zzag) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzc.zza(obtainAndWriteInterfaceToken, zzn);
        zzc.zza(obtainAndWriteInterfaceToken, zzag);
        Parcel zza = zza(3, obtainAndWriteInterfaceToken);
        zzae[] zzaeArr = (zzae[]) zza.createTypedArray(zzae.CREATOR);
        zza.recycle();
        return zzaeArr;
    }

    @Override // com.google.android.gms.internal.vision.zzaa
    public final void zzs() throws RemoteException {
        zzb(2, obtainAndWriteInterfaceToken());
    }
}
