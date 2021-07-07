package com.p118pd.sdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.pd.sdk.o0O0o0OO  reason: case insensitive filesystem */
public interface AbstractC7331o0O0o0OO extends IInterface {
    int OooO00o(byte[] bArr, int i, int i2) throws RemoteException;

    long OooO00o(int i) throws RemoteException;

    int OooO0O0() throws RemoteException;

    int available() throws RemoteException;

    void close() throws RemoteException;

    int length() throws RemoteException;

    int read(byte[] bArr) throws RemoteException;

    /* renamed from: com.pd.sdk.o0O0o0OO$OooO00o */
    public static abstract class OooO00o extends Binder implements AbstractC7331o0O0o0OO {
        public static final int OooO00o = 1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public static final String f20050OooO00o = "anetwork.channel.aidl.ParcelableInputStream";
        public static final int OooO0O0 = 2;
        public static final int OooO0OO = 3;
        public static final int OooO0Oo = 4;
        public static final int OooO0o = 6;
        public static final int OooO0o0 = 5;
        public static final int OooO0oO = 7;

        public OooO00o() {
            attachInterface(this, f20050OooO00o);
        }

        public static AbstractC7331o0O0o0OO OooO00o(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f20050OooO00o);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7331o0O0o0OO)) {
                return new C4964OooO00o(iBinder);
            }
            return (AbstractC7331o0O0o0OO) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                byte[] bArr = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(f20050OooO00o);
                        int available = available();
                        parcel2.writeNoException();
                        parcel2.writeInt(available);
                        return true;
                    case 2:
                        parcel.enforceInterface(f20050OooO00o);
                        close();
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(f20050OooO00o);
                        int OooO0O02 = OooO0O0();
                        parcel2.writeNoException();
                        parcel2.writeInt(OooO0O02);
                        return true;
                    case 4:
                        parcel.enforceInterface(f20050OooO00o);
                        int readInt = parcel.readInt();
                        if (readInt >= 0) {
                            bArr = new byte[readInt];
                        }
                        int OooO00o2 = OooO00o(bArr, parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(OooO00o2);
                        parcel2.writeByteArray(bArr);
                        return true;
                    case 5:
                        parcel.enforceInterface(f20050OooO00o);
                        int readInt2 = parcel.readInt();
                        if (readInt2 >= 0) {
                            bArr = new byte[readInt2];
                        }
                        int read = read(bArr);
                        parcel2.writeNoException();
                        parcel2.writeInt(read);
                        parcel2.writeByteArray(bArr);
                        return true;
                    case 6:
                        parcel.enforceInterface(f20050OooO00o);
                        long OooO00o3 = OooO00o(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeLong(OooO00o3);
                        return true;
                    case 7:
                        parcel.enforceInterface(f20050OooO00o);
                        int length = length();
                        parcel2.writeNoException();
                        parcel2.writeInt(length);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString(f20050OooO00o);
                return true;
            }
        }

        /* renamed from: com.pd.sdk.o0O0o0OO$OooO00o$OooO00o  reason: collision with other inner class name */
        public static class C4964OooO00o implements AbstractC7331o0O0o0OO {
            public IBinder OooO00o;

            public C4964OooO00o(IBinder iBinder) {
                this.OooO00o = iBinder;
            }

            @Override // com.p118pd.sdk.AbstractC7331o0O0o0OO
            public int OooO00o(byte[] bArr, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20050OooO00o);
                    if (bArr == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr.length);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.OooO00o.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p118pd.sdk.AbstractC7331o0O0o0OO
            public int OooO0O0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20050OooO00o);
                    this.OooO00o.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.OooO00o;
            }

            @Override // com.p118pd.sdk.AbstractC7331o0O0o0OO
            public int available() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20050OooO00o);
                    this.OooO00o.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p118pd.sdk.AbstractC7331o0O0o0OO
            public void close() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20050OooO00o);
                    this.OooO00o.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p118pd.sdk.AbstractC7331o0O0o0OO
            public int length() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20050OooO00o);
                    this.OooO00o.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p118pd.sdk.AbstractC7331o0O0o0OO
            public int read(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20050OooO00o);
                    if (bArr == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr.length);
                    }
                    this.OooO00o.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p118pd.sdk.AbstractC7331o0O0o0OO
            public long OooO00o(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20050OooO00o);
                    obtain.writeInt(i);
                    this.OooO00o.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
