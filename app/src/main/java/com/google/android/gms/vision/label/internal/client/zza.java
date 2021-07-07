package com.google.android.gms.vision.label.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.vision.zzc;

public final class zza extends com.google.android.gms.internal.vision.zza implements INativeImageLabeler {
    public zza(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
    }

    @Override // com.google.android.gms.vision.label.internal.client.INativeImageLabeler
    public final zze[] zza(IObjectWrapper iObjectWrapper, LabelOptions labelOptions) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzc.zza(obtainAndWriteInterfaceToken, labelOptions);
        Parcel zza = zza(1, obtainAndWriteInterfaceToken);
        zze[] zzeArr = (zze[]) zza.createTypedArray(zze.CREATOR);
        zza.recycle();
        return zzeArr;
    }

    @Override // com.google.android.gms.vision.label.internal.client.INativeImageLabeler
    public final void zzs() throws RemoteException {
        zzb(2, obtainAndWriteInterfaceToken());
    }
}
