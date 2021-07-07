package com.p118pd.sdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p118pd.sdk.AbstractC7334o0O0o0o0;

/* renamed from: com.pd.sdk.o0O0o00O  reason: case insensitive filesystem */
public interface AbstractC7328o0O0o00O extends IInterface {

    /* renamed from: com.pd.sdk.o0O0o00O$OooO00o */
    public static abstract class OooO00o extends Binder implements AbstractC7328o0O0o00O {
        public static final int OooO00o = 1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public static final String f20048OooO00o = "anetwork.channel.aidl.IRemoteNetworkGetter";

        /* renamed from: com.pd.sdk.o0O0o00O$OooO00o$OooO00o  reason: collision with other inner class name */
        public static class C4962OooO00o implements AbstractC7328o0O0o00O {
            public IBinder OooO00o;

            public C4962OooO00o(IBinder iBinder) {
                this.OooO00o = iBinder;
            }

            @Override // com.p118pd.sdk.AbstractC7328o0O0o00O
            public AbstractC7334o0O0o0o0 OooO00o(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20048OooO00o);
                    obtain.writeInt(i);
                    this.OooO00o.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC7334o0O0o0o0.OooO00o.OooO00o(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.OooO00o;
            }
        }

        public OooO00o() {
            attachInterface(this, f20048OooO00o);
        }

        public static AbstractC7328o0O0o00O OooO00o(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f20048OooO00o);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7328o0O0o00O)) {
                return new C4962OooO00o(iBinder);
            }
            return (AbstractC7328o0O0o00O) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(f20048OooO00o);
                AbstractC7334o0O0o0o0 OooO00o2 = OooO00o(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(OooO00o2 != null ? OooO00o2.asBinder() : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(f20048OooO00o);
                return true;
            }
        }
    }

    AbstractC7334o0O0o0o0 OooO00o(int i) throws RemoteException;
}
