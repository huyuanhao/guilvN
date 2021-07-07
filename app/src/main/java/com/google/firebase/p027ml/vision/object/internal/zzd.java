package com.google.firebase.p027ml.vision.object.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.firebase_ml.zza;
import com.google.android.gms.internal.firebase_ml.zzc;

/* renamed from: com.google.firebase.ml.vision.object.internal.zzd */
public final class zzd extends zza implements zzb {
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.firebase.ml.vision.object.internal.IObjectDetectorCreator");
    }

    @Override // com.google.firebase.p027ml.vision.object.internal.zzb
    public final IObjectDetector newObjectDetector(ObjectDetectorOptionsParcel objectDetectorOptionsParcel) throws RemoteException {
        IObjectDetector iObjectDetector;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, objectDetectorOptionsParcel);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            iObjectDetector = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.firebase.ml.vision.object.internal.IObjectDetector");
            if (queryLocalInterface instanceof IObjectDetector) {
                iObjectDetector = (IObjectDetector) queryLocalInterface;
            } else {
                iObjectDetector = new zza(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return iObjectDetector;
    }
}
