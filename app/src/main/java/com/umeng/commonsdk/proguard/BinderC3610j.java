package com.umeng.commonsdk.proguard;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.umeng.commonsdk.proguard.j */
public class BinderC3610j extends Binder {

    /* renamed from: com.umeng.commonsdk.proguard.j$a */
    public static class C3611a implements AbstractC3612k {

        /* renamed from: a */
        public IBinder f9303a;

        public C3611a(IBinder iBinder) {
            this.f9303a = iBinder;
        }

        /* JADX INFO: finally extract failed */
        @Override // com.umeng.commonsdk.proguard.AbstractC3612k
        /* renamed from: a */
        public String mo38990a(String str, String str2, String str3) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                obtain.writeString(str);
                obtain.writeString(str2);
                obtain.writeString(str3);
                this.f9303a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                String readString = obtain2.readString();
                obtain2.recycle();
                obtain.recycle();
                return readString;
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }

        public IBinder asBinder() {
            return this.f9303a;
        }
    }

    /* renamed from: a */
    public static AbstractC3612k m9492a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
        return queryLocalInterface instanceof AbstractC3612k ? (AbstractC3612k) queryLocalInterface : new C3611a(iBinder);
    }
}
