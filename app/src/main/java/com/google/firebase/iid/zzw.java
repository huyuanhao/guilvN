package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzw implements zzv {
    public final IBinder zzbo;

    public zzw(IBinder iBinder) {
        this.zzbo = iBinder;
    }

    public final IBinder asBinder() {
        return this.zzbo;
    }

    @Override // com.google.firebase.iid.zzv
    public final void send(Message message) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            this.zzbo.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
