package com.p118pd.sdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import anetwork.channel.aidl.NetworkResponse;
import anetwork.channel.aidl.ParcelableRequest;
import com.p118pd.sdk.AbstractC7326o0O0o00;
import com.p118pd.sdk.AbstractC7330o0O0o0O;
import com.p118pd.sdk.AbstractC7332o0O0o0Oo;

/* renamed from: com.pd.sdk.o0O0o0o0  reason: case insensitive filesystem */
public interface AbstractC7334o0O0o0o0 extends IInterface {
    NetworkResponse OooO00o(ParcelableRequest parcelableRequest) throws RemoteException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    AbstractC7326o0O0o00 m18851OooO00o(ParcelableRequest parcelableRequest) throws RemoteException;

    AbstractC7330o0O0o0O OooO00o(ParcelableRequest parcelableRequest, AbstractC7332o0O0o0Oo o0o0o0oo) throws RemoteException;

    /* renamed from: com.pd.sdk.o0O0o0o0$OooO00o */
    public static abstract class OooO00o extends Binder implements AbstractC7334o0O0o0o0 {
        public static final int OooO00o = 1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public static final String f20052OooO00o = "anetwork.channel.aidl.RemoteNetwork";
        public static final int OooO0O0 = 2;
        public static final int OooO0OO = 3;

        public OooO00o() {
            attachInterface(this, f20052OooO00o);
        }

        public static AbstractC7334o0O0o0o0 OooO00o(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f20052OooO00o);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7334o0O0o0o0)) {
                return new C4966OooO00o(iBinder);
            }
            return (AbstractC7334o0O0o0o0) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            ParcelableRequest parcelableRequest = null;
            IBinder iBinder = null;
            IBinder iBinder2 = null;
            if (i == 1) {
                parcel.enforceInterface(f20052OooO00o);
                if (parcel.readInt() != 0) {
                    parcelableRequest = ParcelableRequest.CREATOR.createFromParcel(parcel);
                }
                NetworkResponse OooO00o2 = OooO00o(parcelableRequest);
                parcel2.writeNoException();
                if (OooO00o2 != null) {
                    parcel2.writeInt(1);
                    OooO00o2.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(f20052OooO00o);
                AbstractC7330o0O0o0O OooO00o3 = OooO00o(parcel.readInt() != 0 ? ParcelableRequest.CREATOR.createFromParcel(parcel) : null, AbstractC7332o0O0o0Oo.OooO00o.OooO00o(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (OooO00o3 != null) {
                    iBinder2 = OooO00o3.asBinder();
                }
                parcel2.writeStrongBinder(iBinder2);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(f20052OooO00o);
                AbstractC7326o0O0o00 OooO00o4 = m18851OooO00o(parcel.readInt() != 0 ? ParcelableRequest.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (OooO00o4 != null) {
                    iBinder = OooO00o4.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(f20052OooO00o);
                return true;
            }
        }

        /* renamed from: com.pd.sdk.o0O0o0o0$OooO00o$OooO00o  reason: collision with other inner class name */
        public static class C4966OooO00o implements AbstractC7334o0O0o0o0 {
            public IBinder OooO00o;

            public C4966OooO00o(IBinder iBinder) {
                this.OooO00o = iBinder;
            }

            @Override // com.p118pd.sdk.AbstractC7334o0O0o0o0, com.p118pd.sdk.AbstractC7334o0O0o0o0
            public NetworkResponse OooO00o(ParcelableRequest parcelableRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20052OooO00o);
                    if (parcelableRequest != null) {
                        obtain.writeInt(1);
                        parcelableRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.OooO00o.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? NetworkResponse.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.OooO00o;
            }

            @Override // com.p118pd.sdk.AbstractC7334o0O0o0o0
            public AbstractC7330o0O0o0O OooO00o(ParcelableRequest parcelableRequest, AbstractC7332o0O0o0Oo o0o0o0oo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20052OooO00o);
                    if (parcelableRequest != null) {
                        obtain.writeInt(1);
                        parcelableRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(o0o0o0oo != null ? o0o0o0oo.asBinder() : null);
                    this.OooO00o.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC7330o0O0o0O.OooO00o.OooO00o(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p118pd.sdk.AbstractC7334o0O0o0o0, com.p118pd.sdk.AbstractC7334o0O0o0o0
            /* renamed from: OooO00o  reason: collision with other method in class */
            public AbstractC7326o0O0o00 m18852OooO00o(ParcelableRequest parcelableRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20052OooO00o);
                    if (parcelableRequest != null) {
                        obtain.writeInt(1);
                        parcelableRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.OooO00o.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC7326o0O0o00.OooO00o.OooO00o(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
