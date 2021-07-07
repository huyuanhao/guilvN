package com.google.firebase.p027ml.vision.object.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.firebase_ml.zzb;
import com.google.android.gms.internal.firebase_ml.zzc;

/* renamed from: com.google.firebase.ml.vision.object.internal.IObjectDetector */
public interface IObjectDetector extends IInterface {

    /* renamed from: com.google.firebase.ml.vision.object.internal.IObjectDetector$zza */
    public static abstract class zza extends zzb implements IObjectDetector {
        public zza() {
            super("com.google.firebase.ml.vision.object.internal.IObjectDetector");
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzb
        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                zzh[] zza = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zze) zzc.zza(parcel, zze.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedArray(zza, 1);
            } else if (i == 2) {
                start();
                parcel2.writeNoException();
            } else if (i != 3) {
                return false;
            } else {
                stop();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void start() throws RemoteException;

    void stop() throws RemoteException;

    zzh[] zza(IObjectWrapper iObjectWrapper, zze zze) throws RemoteException;
}
