package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.vision.barcode.Barcode;

public final class zzi extends zza implements zzh {
    public zzi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    @Override // com.google.android.gms.internal.vision.zzh
    public final Barcode[] zza(IObjectWrapper iObjectWrapper, zzn zzn) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzc.zza(obtainAndWriteInterfaceToken, zzn);
        Parcel zza = zza(1, obtainAndWriteInterfaceToken);
        Barcode[] barcodeArr = (Barcode[]) zza.createTypedArray(Barcode.CREATOR);
        zza.recycle();
        return barcodeArr;
    }

    @Override // com.google.android.gms.internal.vision.zzh
    public final Barcode[] zzb(IObjectWrapper iObjectWrapper, zzn zzn) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzc.zza(obtainAndWriteInterfaceToken, zzn);
        Parcel zza = zza(2, obtainAndWriteInterfaceToken);
        Barcode[] barcodeArr = (Barcode[]) zza.createTypedArray(Barcode.CREATOR);
        zza.recycle();
        return barcodeArr;
    }

    @Override // com.google.android.gms.internal.vision.zzh
    public final void zzn() throws RemoteException {
        zzb(3, obtainAndWriteInterfaceToken());
    }
}
