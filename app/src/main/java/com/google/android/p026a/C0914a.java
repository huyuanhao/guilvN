package com.google.android.p026a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.a.a */
public class C0914a implements IInterface {

    /* renamed from: a */
    public final IBinder f991a;

    /* renamed from: b */
    public final String f992b;

    public C0914a(IBinder iBinder, String str) {
        this.f991a = iBinder;
        this.f992b = str;
    }

    /* renamed from: a */
    public final Parcel mo9625a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f992b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f991a;
    }

    /* renamed from: a */
    public final Parcel mo9626a(Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f991a.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
