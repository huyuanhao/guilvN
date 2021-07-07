package com.google.firebase.p027ml.vision.automl.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.firebase_ml.zzc;

/* renamed from: com.google.firebase.ml.vision.automl.internal.zza */
public final class zza extends com.google.android.gms.internal.firebase_ml.zza implements IOnDeviceAutoMLImageLabeler {
    public zza(IBinder iBinder) {
        super(iBinder, "com.google.firebase.ml.vision.automl.internal.IOnDeviceAutoMLImageLabeler");
    }

    @Override // com.google.firebase.p027ml.vision.automl.internal.IOnDeviceAutoMLImageLabeler
    public final void close() throws RemoteException {
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.firebase.p027ml.vision.automl.internal.IOnDeviceAutoMLImageLabeler
    public final zze[] zza(IObjectWrapper iObjectWrapper, zzg zzg) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzc.zza(obtainAndWriteInterfaceToken, zzg);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zze[] zzeArr = (zze[]) transactAndReadException.createTypedArray(zze.CREATOR);
        transactAndReadException.recycle();
        return zzeArr;
    }

    @Override // com.google.firebase.p027ml.vision.automl.internal.IOnDeviceAutoMLImageLabeler
    public final void zzlp() throws RemoteException {
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
    }
}
