package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zza implements IInterface {
    public final IBinder zza;
    public final String zzb;

    public zza(IBinder iBinder, String str) {
        this.zza = iBinder;
        this.zzb = str;
    }

    public IBinder asBinder() {
        return this.zza;
    }

    public final Parcel obtainAndWriteInterfaceToken() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }

    public final void transactOneway(int i, Parcel parcel) throws RemoteException {
        try {
            this.zza.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
