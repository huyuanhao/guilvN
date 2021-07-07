package com.p118pd.sdk;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.pd.sdk.ooo0oOO  reason: case insensitive filesystem */
public class C9102ooo0oOO implements AbstractC8752oo0oo00 {
    public IBinder OooO00o;

    public C9102ooo0oOO(IBinder iBinder) {
        this.OooO00o = iBinder;
    }

    @Override // com.p118pd.sdk.AbstractC8752oo0oo00
    public void OooO00o(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(AbstractBinderC9198oooOooO.f22633OooO00o);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.OooO00o.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public String OooO0O0() {
        return AbstractBinderC9198oooOooO.f22633OooO00o;
    }

    public IBinder asBinder() {
        return this.OooO00o;
    }
}
