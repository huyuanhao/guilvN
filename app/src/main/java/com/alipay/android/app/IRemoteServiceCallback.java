package com.alipay.android.app;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IRemoteServiceCallback extends IInterface {

    public static abstract class Stub extends Binder implements IRemoteServiceCallback {
        public static final String DESCRIPTOR = "com.alipay.android.app.IRemoteServiceCallback";
        public static final int TRANSACTION_isHideLoadingScreen = 3;
        public static final int TRANSACTION_payEnd = 2;
        public static final int TRANSACTION_startActivity = 1;

        public static class OooO00o implements IRemoteServiceCallback {
            public IBinder OooO00o;

            public OooO00o(IBinder iBinder) {
                this.OooO00o = iBinder;
            }

            public String OooO0O0() {
                return Stub.DESCRIPTOR;
            }

            public IBinder asBinder() {
                return this.OooO00o;
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public boolean isHideLoadingScreen() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    this.OooO00o.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public void payEnd(boolean z, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeString(str);
                    this.OooO00o.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public void startActivity(String str, String str2, int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
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
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRemoteServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IRemoteServiceCallback)) {
                return new OooO00o(iBinder);
            }
            return (IRemoteServiceCallback) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                startActivity(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                payEnd(parcel.readInt() != 0, parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean isHideLoadingScreen = isHideLoadingScreen();
                parcel2.writeNoException();
                parcel2.writeInt(isHideLoadingScreen ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    boolean isHideLoadingScreen() throws RemoteException;

    void payEnd(boolean z, String str) throws RemoteException;

    void startActivity(String str, String str2, int i, Bundle bundle) throws RemoteException;
}
