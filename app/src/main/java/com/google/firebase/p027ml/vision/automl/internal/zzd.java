package com.google.firebase.p027ml.vision.automl.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.firebase_ml.zza;
import com.google.android.gms.internal.firebase_ml.zzc;

/* renamed from: com.google.firebase.ml.vision.automl.internal.zzd */
public final class zzd extends zza implements zzb {
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.firebase.ml.vision.automl.internal.IOnDeviceAutoMLImageLabelerCreator");
    }

    @Override // com.google.firebase.p027ml.vision.automl.internal.zzb
    public final IOnDeviceAutoMLImageLabeler newOnDeviceAutoMLImageLabeler(IObjectWrapper iObjectWrapper, OnDeviceAutoMLImageLabelerOptionsParcel onDeviceAutoMLImageLabelerOptionsParcel) throws RemoteException {
        IOnDeviceAutoMLImageLabeler iOnDeviceAutoMLImageLabeler;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzc.zza(obtainAndWriteInterfaceToken, onDeviceAutoMLImageLabelerOptionsParcel);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            iOnDeviceAutoMLImageLabeler = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.firebase.ml.vision.automl.internal.IOnDeviceAutoMLImageLabeler");
            if (queryLocalInterface instanceof IOnDeviceAutoMLImageLabeler) {
                iOnDeviceAutoMLImageLabeler = (IOnDeviceAutoMLImageLabeler) queryLocalInterface;
            } else {
                iOnDeviceAutoMLImageLabeler = new zza(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return iOnDeviceAutoMLImageLabeler;
    }
}
