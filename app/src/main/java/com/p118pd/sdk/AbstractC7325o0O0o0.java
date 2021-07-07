package com.p118pd.sdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.pd.sdk.o0O0o0  reason: case insensitive filesystem */
public interface AbstractC7325o0O0o0 extends IInterface {

    /* renamed from: com.pd.sdk.o0O0o0$OooO00o */
    public static abstract class OooO00o extends Binder implements AbstractC7325o0O0o0 {
        public static final int OooO00o = 1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public static final String f20046OooO00o = "anetwork.channel.aidl.ParcelableBodyHandler";
        public static final int OooO0O0 = 2;

        /* renamed from: com.pd.sdk.o0O0o0$OooO00o$OooO00o  reason: collision with other inner class name */
        public static class C4960OooO00o implements AbstractC7325o0O0o0 {
            public IBinder OooO00o;

            public C4960OooO00o(IBinder iBinder) {
                this.OooO00o = iBinder;
            }

            @Override // com.p118pd.sdk.AbstractC7325o0O0o0
            public boolean OooO00o() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20046OooO00o);
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

            public IBinder asBinder() {
                return this.OooO00o;
            }

            @Override // com.p118pd.sdk.AbstractC7325o0O0o0
            public int read(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20046OooO00o);
                    obtain.writeByteArray(bArr);
                    this.OooO00o.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readByteArray(bArr);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public OooO00o() {
            attachInterface(this, f20046OooO00o);
        }

        public static AbstractC7325o0O0o0 OooO00o(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f20046OooO00o);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7325o0O0o0)) {
                return new C4960OooO00o(iBinder);
            }
            return (AbstractC7325o0O0o0) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(f20046OooO00o);
                byte[] createByteArray = parcel.createByteArray();
                int read = read(createByteArray);
                parcel2.writeNoException();
                parcel2.writeInt(read);
                parcel2.writeByteArray(createByteArray);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(f20046OooO00o);
                boolean OooO00o2 = OooO00o();
                parcel2.writeNoException();
                parcel2.writeInt(OooO00o2 ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(f20046OooO00o);
                return true;
            }
        }
    }

    boolean OooO00o() throws RemoteException;

    int read(byte[] bArr) throws RemoteException;
}
