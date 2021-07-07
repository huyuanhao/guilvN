package com.huawei.hms.core.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.huawei.hms.core.aidl.d */
public interface AbstractC1146d extends IInterface {

    /* renamed from: com.huawei.hms.core.aidl.d$a */
    public static abstract class AbstractBinderC1147a extends Binder implements AbstractC1146d {

        /* renamed from: com.huawei.hms.core.aidl.d$a$a */
        public static class C1148a implements AbstractC1146d {

            /* renamed from: a */
            public IBinder f1183a;

            public C1148a(IBinder iBinder) {
                this.f1183a = iBinder;
            }

            public IBinder asBinder() {
                return this.f1183a;
            }

            @Override // com.huawei.hms.core.aidl.AbstractC1146d
            public void call(C1144b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.core.aidl.IAIDLCallback");
                    if (bVar != null) {
                        obtain.writeInt(1);
                        bVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1183a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC1147a() {
            attachInterface(this, "com.huawei.hms.core.aidl.IAIDLCallback");
        }

        public static AbstractC1146d asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.core.aidl.IAIDLCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC1146d)) {
                return new C1148a(iBinder);
            }
            return (AbstractC1146d) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.huawei.hms.core.aidl.IAIDLCallback");
                call(parcel.readInt() != 0 ? C1144b.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.huawei.hms.core.aidl.IAIDLCallback");
                return true;
            }
        }
    }

    void call(C1144b bVar) throws RemoteException;
}
