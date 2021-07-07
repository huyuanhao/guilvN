package com.google.firebase.p027ml.vision.automl.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.firebase_ml.zzb;

/* renamed from: com.google.firebase.ml.vision.automl.internal.zzc */
public abstract class zzc extends zzb implements zzb {
    public zzc() {
        super("com.google.firebase.ml.vision.automl.internal.IOnDeviceAutoMLImageLabelerCreator");
    }

    public static zzb asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.ml.vision.automl.internal.IOnDeviceAutoMLImageLabelerCreator");
        if (queryLocalInterface instanceof zzb) {
            return (zzb) queryLocalInterface;
        }
        return new zzd(iBinder);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzb
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        IOnDeviceAutoMLImageLabeler newOnDeviceAutoMLImageLabeler = newOnDeviceAutoMLImageLabeler(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (OnDeviceAutoMLImageLabelerOptionsParcel) com.google.android.gms.internal.firebase_ml.zzc.zza(parcel, OnDeviceAutoMLImageLabelerOptionsParcel.CREATOR));
        parcel2.writeNoException();
        com.google.android.gms.internal.firebase_ml.zzc.zza(parcel2, newOnDeviceAutoMLImageLabeler);
        return true;
    }
}
