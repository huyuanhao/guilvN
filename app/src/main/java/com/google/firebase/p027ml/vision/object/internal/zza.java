package com.google.firebase.p027ml.vision.object.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.firebase_ml.zzc;

/* renamed from: com.google.firebase.ml.vision.object.internal.zza */
public final class zza extends com.google.android.gms.internal.firebase_ml.zza implements IObjectDetector {
    public zza(IBinder iBinder) {
        super(iBinder, "com.google.firebase.ml.vision.object.internal.IObjectDetector");
    }

    @Override // com.google.firebase.p027ml.vision.object.internal.IObjectDetector
    public final void start() throws RemoteException {
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.firebase.p027ml.vision.object.internal.IObjectDetector
    public final void stop() throws RemoteException {
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.firebase.p027ml.vision.object.internal.IObjectDetector
    public final zzh[] zza(IObjectWrapper iObjectWrapper, zze zze) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzc.zza(obtainAndWriteInterfaceToken, zze);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zzh[] zzhArr = (zzh[]) transactAndReadException.createTypedArray(zzh.CREATOR);
        transactAndReadException.recycle();
        return zzhArr;
    }
}
