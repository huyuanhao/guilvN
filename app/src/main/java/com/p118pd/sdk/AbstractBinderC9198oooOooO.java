package com.p118pd.sdk;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.pd.sdk.oooOooO  reason: case insensitive filesystem */
public abstract class AbstractBinderC9198oooOooO extends Binder implements AbstractC8752oo0oo00 {
    public static final int OooO00o = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f22633OooO00o = "com.mcs.aidl.IMcsSdkService";

    public AbstractBinderC9198oooOooO() {
        attachInterface(this, f22633OooO00o);
    }

    public static AbstractC8752oo0oo00 OooO00o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(f22633OooO00o);
        return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8752oo0oo00)) ? new C9102ooo0oOO(iBinder) : (AbstractC8752oo0oo00) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.enforceInterface(f22633OooO00o);
            OooO00o(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString(f22633OooO00o);
            return true;
        }
    }
}
