package com.umeng.commonsdk.statistics.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.umeng.commonsdk.statistics.common.a */
public class C3660a {

    /* renamed from: com.umeng.commonsdk.statistics.common.a$a */
    public static final class C3662a {

        /* renamed from: a */
        public final String f9586a;

        /* renamed from: b */
        public final boolean f9587b;

        public C3662a(String str, boolean z) {
            this.f9586a = str;
            this.f9587b = z;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: b */
        private String m9850b() {
            return this.f9586a;
        }

        /* renamed from: a */
        public boolean mo39187a() {
            return this.f9587b;
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.common.a$b */
    public static final class ServiceConnectionC3663b implements ServiceConnection {

        /* renamed from: a */
        public boolean f9588a;

        /* renamed from: b */
        public final LinkedBlockingQueue<IBinder> f9589b;

        public ServiceConnectionC3663b() {
            this.f9588a = false;
            this.f9589b = new LinkedBlockingQueue<>(1);
        }

        /* renamed from: a */
        public IBinder mo39188a() throws InterruptedException {
            if (!this.f9588a) {
                this.f9588a = true;
                return this.f9589b.take();
            }
            throw new IllegalStateException();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f9589b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: a */
    public static String m9847a(Context context) {
        try {
            C3662a b = m9848b(context);
            if (b == null) {
                return null;
            }
            return b.m9850b();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static C3662a m9848b(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return null;
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            ServiceConnectionC3663b bVar = new ServiceConnectionC3663b();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            if (context.bindService(intent, bVar, 1)) {
                try {
                    C3664c cVar = new C3664c(bVar.mo39188a());
                    C3662a aVar = new C3662a(cVar.mo39191a(), cVar.mo39192a(true));
                    context.unbindService(bVar);
                    return aVar;
                } catch (Exception e) {
                    throw e;
                } catch (Throwable th) {
                    context.unbindService(bVar);
                    throw th;
                }
            } else {
                throw new IOException("Google Play connection failed");
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.common.a$c */
    public static final class C3664c implements IInterface {

        /* renamed from: a */
        public IBinder f9590a;

        public C3664c(IBinder iBinder) {
            this.f9590a = iBinder;
        }

        /* renamed from: a */
        public String mo39191a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f9590a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.f9590a;
        }

        /* renamed from: a */
        public boolean mo39192a(boolean z) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z2 = true;
                obtain.writeInt(z ? 1 : 0);
                this.f9590a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z2 = false;
                }
                return z2;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
