package com.p118pd.sdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import anetwork.channel.statist.StatisticData;
import com.p118pd.sdk.AbstractC7331o0O0o0OO;
import java.util.Map;

/* renamed from: com.pd.sdk.o0O0o00  reason: case insensitive filesystem */
public interface AbstractC7326o0O0o00 extends IInterface {
    int OooO00o() throws RemoteException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    StatisticData m18838OooO00o() throws RemoteException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    AbstractC7331o0O0o0OO m18839OooO00o() throws RemoteException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    String m18840OooO00o() throws RemoteException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    Map m18841OooO00o() throws RemoteException;

    void cancel() throws RemoteException;

    /* renamed from: com.pd.sdk.o0O0o00$OooO00o */
    public static abstract class OooO00o extends Binder implements AbstractC7326o0O0o00 {
        public static final int OooO00o = 1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public static final String f20047OooO00o = "anetwork.channel.aidl.Connection";
        public static final int OooO0O0 = 2;
        public static final int OooO0OO = 3;
        public static final int OooO0Oo = 4;
        public static final int OooO0o = 6;
        public static final int OooO0o0 = 5;

        public OooO00o() {
            attachInterface(this, f20047OooO00o);
        }

        public static AbstractC7326o0O0o00 OooO00o(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f20047OooO00o);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC7326o0O0o00)) {
                return new C4961OooO00o(iBinder);
            }
            return (AbstractC7326o0O0o00) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(f20047OooO00o);
                        AbstractC7331o0O0o0OO OooO00o2 = m18839OooO00o();
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(OooO00o2 != null ? OooO00o2.asBinder() : null);
                        return true;
                    case 2:
                        parcel.enforceInterface(f20047OooO00o);
                        int OooO00o3 = OooO00o();
                        parcel2.writeNoException();
                        parcel2.writeInt(OooO00o3);
                        return true;
                    case 3:
                        parcel.enforceInterface(f20047OooO00o);
                        String OooO00o4 = m18840OooO00o();
                        parcel2.writeNoException();
                        parcel2.writeString(OooO00o4);
                        return true;
                    case 4:
                        parcel.enforceInterface(f20047OooO00o);
                        Map OooO00o5 = m18841OooO00o();
                        parcel2.writeNoException();
                        parcel2.writeMap(OooO00o5);
                        return true;
                    case 5:
                        parcel.enforceInterface(f20047OooO00o);
                        StatisticData OooO00o6 = m18838OooO00o();
                        parcel2.writeNoException();
                        if (OooO00o6 != null) {
                            parcel2.writeInt(1);
                            parcel2.writeSerializable(OooO00o6);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 6:
                        parcel.enforceInterface(f20047OooO00o);
                        cancel();
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString(f20047OooO00o);
                return true;
            }
        }

        /* renamed from: com.pd.sdk.o0O0o00$OooO00o$OooO00o  reason: collision with other inner class name */
        public static class C4961OooO00o implements AbstractC7326o0O0o00 {
            public IBinder OooO00o;

            public C4961OooO00o(IBinder iBinder) {
                this.OooO00o = iBinder;
            }

            @Override // com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00
            /* renamed from: OooO00o  reason: collision with other method in class */
            public AbstractC7331o0O0o0OO m18843OooO00o() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20047OooO00o);
                    this.OooO00o.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC7331o0O0o0OO.OooO00o.OooO00o(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.OooO00o;
            }

            @Override // com.p118pd.sdk.AbstractC7326o0O0o00
            public void cancel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20047OooO00o);
                    this.OooO00o.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00
            public int OooO00o() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20047OooO00o);
                    this.OooO00o.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00
            /* renamed from: OooO00o  reason: collision with other method in class */
            public String m18844OooO00o() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20047OooO00o);
                    this.OooO00o.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00
            /* renamed from: OooO00o  reason: collision with other method in class */
            public Map m18845OooO00o() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20047OooO00o);
                    this.OooO00o.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00, com.p118pd.sdk.AbstractC7326o0O0o00
            /* renamed from: OooO00o  reason: collision with other method in class */
            public StatisticData m18842OooO00o() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(OooO00o.f20047OooO00o);
                    this.OooO00o.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() == 1 ? (StatisticData) obtain2.readSerializable() : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
