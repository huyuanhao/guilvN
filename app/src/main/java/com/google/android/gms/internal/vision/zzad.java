package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzad extends zza implements zzac {
    public zzad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
    }

    @Override // com.google.android.gms.internal.vision.zzac
    public final zzaa zza(IObjectWrapper iObjectWrapper, zzal zzal) throws RemoteException {
        zzaa zzaa;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzc.zza(obtainAndWriteInterfaceToken, zzal);
        Parcel zza = zza(1, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzaa = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
            if (queryLocalInterface instanceof zzaa) {
                zzaa = (zzaa) queryLocalInterface;
            } else {
                zzaa = new zzab(readStrongBinder);
            }
        }
        zza.recycle();
        return zzaa;
    }
}
