package com.google.android.gms.vision.label.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.vision.zza;
import com.google.android.gms.internal.vision.zzc;

public final class zzd extends zza implements zzb {
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
    }

    @Override // com.google.android.gms.vision.label.internal.client.zzb
    public final INativeImageLabeler newImageLabeler(IObjectWrapper iObjectWrapper, ImageLabelerOptions imageLabelerOptions) throws RemoteException {
        INativeImageLabeler iNativeImageLabeler;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzc.zza(obtainAndWriteInterfaceToken, imageLabelerOptions);
        Parcel zza = zza(1, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            iNativeImageLabeler = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            if (queryLocalInterface instanceof INativeImageLabeler) {
                iNativeImageLabeler = (INativeImageLabeler) queryLocalInterface;
            } else {
                iNativeImageLabeler = new zza(readStrongBinder);
            }
        }
        zza.recycle();
        return iNativeImageLabeler;
    }
}
