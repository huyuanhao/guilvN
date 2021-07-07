package org.android.agoo.service;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface SendMessage extends IInterface {

    public static abstract class Stub extends Binder implements SendMessage {
        public static final String DESCRIPTOR = "org.android.agoo.service.SendMessage";
        public static final int TRANSACTION_doSend = 1;

        /* renamed from: org.android.agoo.service.SendMessage$Stub$a */
        public static class C4819a implements SendMessage {

            /* renamed from: a */
            public IBinder f13479a;

            public C4819a(IBinder iBinder) {
                this.f13479a = iBinder;
            }

            public IBinder asBinder() {
                return this.f13479a;
            }

            @Override // org.android.agoo.service.SendMessage
            public int doSend(Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13479a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static SendMessage asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface instanceof SendMessage) {
                return (SendMessage) queryLocalInterface;
            }
            return new C4819a(iBinder);
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                int doSend = doSend(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(doSend);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    int doSend(Intent intent) throws RemoteException;
}
