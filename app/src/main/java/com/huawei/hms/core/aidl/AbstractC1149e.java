package com.huawei.hms.core.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.core.aidl.AbstractC1146d;

/* renamed from: com.huawei.hms.core.aidl.e */
public interface AbstractC1149e extends IInterface {
    /* renamed from: a */
    void mo15446a(C1144b bVar) throws RemoteException;

    /* renamed from: a */
    void mo15447a(C1144b bVar, AbstractC1146d dVar) throws RemoteException;

    /* renamed from: com.huawei.hms.core.aidl.e$a */
    public static abstract class AbstractBinderC1150a extends Binder implements AbstractC1149e {
        /* renamed from: a */
        public static AbstractC1149e m1117a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.core.aidl.IAIDLInvoke");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC1149e)) {
                return new C1151a(iBinder);
            }
            return (AbstractC1149e) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            C1144b bVar = null;
            if (i == 1) {
                parcel.enforceInterface("com.huawei.hms.core.aidl.IAIDLInvoke");
                if (parcel.readInt() != 0) {
                    bVar = C1144b.CREATOR.createFromParcel(parcel);
                }
                mo15446a(bVar);
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.huawei.hms.core.aidl.IAIDLInvoke");
                if (parcel.readInt() != 0) {
                    bVar = C1144b.CREATOR.createFromParcel(parcel);
                }
                mo15447a(bVar, AbstractC1146d.AbstractBinderC1147a.asInterface(parcel.readStrongBinder()));
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.huawei.hms.core.aidl.IAIDLInvoke");
                return true;
            }
        }

        /* renamed from: com.huawei.hms.core.aidl.e$a$a */
        public static class C1151a implements AbstractC1149e {

            /* renamed from: a */
            public IBinder f1184a;

            public C1151a(IBinder iBinder) {
                this.f1184a = iBinder;
            }

            @Override // com.huawei.hms.core.aidl.AbstractC1149e
            /* renamed from: a */
            public void mo15446a(C1144b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.core.aidl.IAIDLInvoke");
                    if (bVar != null) {
                        obtain.writeInt(1);
                        bVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1184a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1184a;
            }

            @Override // com.huawei.hms.core.aidl.AbstractC1149e
            /* renamed from: a */
            public void mo15447a(C1144b bVar, AbstractC1146d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.core.aidl.IAIDLInvoke");
                    if (bVar != null) {
                        obtain.writeInt(1);
                        bVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f1184a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
