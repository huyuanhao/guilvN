package com.umeng.commonsdk.proguard;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.api.HuaweiApiAvailability;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.umeng.commonsdk.proguard.d */
public class C3601d implements AbstractC3605e {

    /* renamed from: a */
    public static final String f9292a = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";

    /* renamed from: b */
    public static final int f9293b = 1;

    /* renamed from: c */
    public static final int f9294c = 2;

    /* renamed from: com.umeng.commonsdk.proguard.d$a */
    public static final class ServiceConnectionC3603a implements ServiceConnection {

        /* renamed from: a */
        public boolean f9295a;

        /* renamed from: b */
        public final LinkedBlockingQueue<IBinder> f9296b;

        /* renamed from: a */
        public IBinder mo38984a() throws InterruptedException {
            if (!this.f9295a) {
                this.f9295a = true;
                return this.f9296b.take();
            }
            throw new IllegalStateException();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f9296b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }

        public ServiceConnectionC3603a() {
            this.f9295a = false;
            this.f9296b = new LinkedBlockingQueue<>(1);
        }
    }

    /* renamed from: com.umeng.commonsdk.proguard.d$b */
    public static final class C3604b implements IInterface {

        /* renamed from: a */
        public IBinder f9297a;

        public C3604b(IBinder iBinder) {
            this.f9297a = iBinder;
        }

        /* renamed from: a */
        public String mo38987a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(C3601d.f9292a);
                this.f9297a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.f9297a;
        }

        /* renamed from: b */
        public boolean mo38989b() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(C3601d.f9292a);
                boolean z = false;
                this.f9297a.transact(2, obtain, obtain2, 0);
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

    @Override // com.umeng.commonsdk.proguard.AbstractC3605e
    /* renamed from: a */
    public String mo38983a(Context context) {
        ServiceConnectionC3603a aVar = new ServiceConnectionC3603a();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage(HuaweiApiAvailability.SERVICES_PACKAGE);
        if (context.bindService(intent, aVar, 1)) {
            try {
                return new C3604b(aVar.mo38984a()).mo38987a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(aVar);
            }
        }
        return null;
    }
}
