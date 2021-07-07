package com.p118pd.sdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.aidl.DefaultProgressEvent;
import anetwork.channel.aidl.ParcelableHeader;
import com.p118pd.sdk.AbstractC7331o0O0o0OO;

/* renamed from: com.pd.sdk.o0O0o0Oo  reason: case insensitive filesystem */
public interface AbstractC7332o0O0o0Oo extends IInterface {
    byte OooO00o() throws RemoteException;

    void OooO00o(DefaultFinishEvent defaultFinishEvent) throws RemoteException;

    void OooO00o(DefaultProgressEvent defaultProgressEvent) throws RemoteException;

    void OooO00o(AbstractC7331o0O0o0OO o0o0o0oo) throws RemoteException;

    boolean OooO00o(int i, ParcelableHeader parcelableHeader) throws RemoteException;

    /* renamed from: com.pd.sdk.o0O0o0Oo$OooO00o */
    public static abstract class OooO00o extends Binder implements AbstractC7332o0O0o0Oo {
        public static final int OooO00o = 1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public static final String f20051OooO00o = "anetwork.channel.aidl.ParcelableNetworkListener";
        public static final int OooO0O0 = 2;
        public static final int OooO0OO = 3;
        public static final int OooO0Oo = 4;
        public static final int OooO0o0 = 5;

        public OooO00o() {
            attachInterface(this, f20051OooO00o);
        }

        public static AbstractC7332o0O0o0Oo OooO00o(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f20051OooO00o);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7332o0O0o0Oo)) {
                return new C4965OooO00o(iBinder);
            }
            return (AbstractC7332o0O0o0Oo) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            DefaultProgressEvent defaultProgressEvent = null;
            ParcelableHeader parcelableHeader = null;
            DefaultFinishEvent defaultFinishEvent = null;
            if (i == 1) {
                parcel.enforceInterface(f20051OooO00o);
                if (parcel.readInt() != 0) {
                    defaultProgressEvent = DefaultProgressEvent.CREATOR.createFromParcel(parcel);
                }
                OooO00o(defaultProgressEvent);
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(f20051OooO00o);
                if (parcel.readInt() != 0) {
                    defaultFinishEvent = DefaultFinishEvent.CREATOR.createFromParcel(parcel);
                }
                OooO00o(defaultFinishEvent);
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(f20051OooO00o);
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    parcelableHeader = ParcelableHeader.OooO00o.createFromParcel(parcel);
                }
                boolean OooO00o2 = OooO00o(readInt, parcelableHeader);
                parcel2.writeNoException();
                parcel2.writeInt(OooO00o2 ? 1 : 0);
                return true;
            } else if (i == 4) {
                parcel.enforceInterface(f20051OooO00o);
                OooO00o(AbstractC7331o0O0o0OO.OooO00o.OooO00o(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 5) {
                parcel.enforceInterface(f20051OooO00o);
                byte OooO00o3 = OooO00o();
                parcel2.writeNoException();
                parcel2.writeByte(OooO00o3);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(f20051OooO00o);
                return true;
            }
        }

        /* renamed from: com.pd.sdk.o0O0o0Oo$OooO00o$OooO00o  reason: collision with other inner class name */
        public static class C4965OooO00o implements AbstractC7332o0O0o0Oo {
            public IBinder OooO00o;

            public C4965OooO00o(IBinder iBinder) {
                this.OooO00o = iBinder;
            }

            @Override // com.p118pd.sdk.AbstractC7332o0O0o0Oo
            public void OooO00o(DefaultProgressEvent defaultProgressEvent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20051OooO00o);
                    if (defaultProgressEvent != null) {
                        obtain.writeInt(1);
                        defaultProgressEvent.writeToParcel(obtain, 0);
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

            public IBinder asBinder() {
                return this.OooO00o;
            }

            @Override // com.p118pd.sdk.AbstractC7332o0O0o0Oo
            public void OooO00o(DefaultFinishEvent defaultFinishEvent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20051OooO00o);
                    if (defaultFinishEvent != null) {
                        obtain.writeInt(1);
                        defaultFinishEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.OooO00o.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p118pd.sdk.AbstractC7332o0O0o0Oo
            public boolean OooO00o(int i, ParcelableHeader parcelableHeader) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20051OooO00o);
                    obtain.writeInt(i);
                    boolean z = true;
                    if (parcelableHeader != null) {
                        obtain.writeInt(1);
                        parcelableHeader.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.OooO00o.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p118pd.sdk.AbstractC7332o0O0o0Oo
            public void OooO00o(AbstractC7331o0O0o0OO o0o0o0oo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20051OooO00o);
                    obtain.writeStrongBinder(o0o0o0oo != null ? o0o0o0oo.asBinder() : null);
                    this.OooO00o.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p118pd.sdk.AbstractC7332o0O0o0Oo
            public byte OooO00o() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20051OooO00o);
                    this.OooO00o.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readByte();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
