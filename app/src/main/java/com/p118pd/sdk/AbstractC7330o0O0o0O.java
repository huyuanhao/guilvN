package com.p118pd.sdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import anetwork.channel.aidl.NetworkResponse;

/* renamed from: com.pd.sdk.o0O0o0O  reason: case insensitive filesystem */
public interface AbstractC7330o0O0o0O extends IInterface {

    /* renamed from: com.pd.sdk.o0O0o0O$OooO00o */
    public static abstract class OooO00o extends Binder implements AbstractC7330o0O0o0O {
        public static final int OooO00o = 1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public static final String f20049OooO00o = "anetwork.channel.aidl.ParcelableFuture";
        public static final int OooO0O0 = 2;
        public static final int OooO0OO = 3;
        public static final int OooO0Oo = 4;

        /* renamed from: com.pd.sdk.o0O0o0O$OooO00o$OooO00o  reason: collision with other inner class name */
        public static class C4963OooO00o implements AbstractC7330o0O0o0O {
            public IBinder OooO00o;

            public C4963OooO00o(IBinder iBinder) {
                this.OooO00o = iBinder;
            }

            @Override // com.p118pd.sdk.AbstractC7330o0O0o0O
            public NetworkResponse OooO00o(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20049OooO00o);
                    obtain.writeLong(j);
                    this.OooO00o.transact(4, obtain, obtain2, 0);
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

            @Override // com.p118pd.sdk.AbstractC7330o0O0o0O
            public boolean cancel(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20049OooO00o);
                    boolean z2 = true;
                    obtain.writeInt(z ? 1 : 0);
                    this.OooO00o.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p118pd.sdk.AbstractC7330o0O0o0O
            public boolean isCancelled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20049OooO00o);
                    boolean z = false;
                    this.OooO00o.transact(2, obtain, obtain2, 0);
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

            @Override // com.p118pd.sdk.AbstractC7330o0O0o0O
            public boolean isDone() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20049OooO00o);
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
        }

        public OooO00o() {
            attachInterface(this, f20049OooO00o);
        }

        public static AbstractC7330o0O0o0O OooO00o(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f20049OooO00o);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7330o0O0o0O)) {
                return new C4963OooO00o(iBinder);
            }
            return (AbstractC7330o0O0o0O) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z = false;
            if (i == 1) {
                parcel.enforceInterface(f20049OooO00o);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolean cancel = cancel(z);
                parcel2.writeNoException();
                parcel2.writeInt(cancel ? 1 : 0);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(f20049OooO00o);
                boolean isCancelled = isCancelled();
                parcel2.writeNoException();
                parcel2.writeInt(isCancelled ? 1 : 0);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(f20049OooO00o);
                boolean isDone = isDone();
                parcel2.writeNoException();
                parcel2.writeInt(isDone ? 1 : 0);
                return true;
            } else if (i == 4) {
                parcel.enforceInterface(f20049OooO00o);
                NetworkResponse OooO00o2 = OooO00o(parcel.readLong());
                parcel2.writeNoException();
                if (OooO00o2 != null) {
                    parcel2.writeInt(1);
                    OooO00o2.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(f20049OooO00o);
                return true;
            }
        }
    }

    NetworkResponse OooO00o(long j) throws RemoteException;

    boolean cancel(boolean z) throws RemoteException;

    boolean isCancelled() throws RemoteException;

    boolean isDone() throws RemoteException;
}
