package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.xiaomi.push.j */
public final class C4533j {

    /* renamed from: com.xiaomi.push.j$a */
    public static final class C4534a {

        /* renamed from: a */
        public final String f12992a;

        /* renamed from: a */
        public final boolean f12993a;

        public C4534a(String str, boolean z) {
            this.f12992a = str;
            this.f12993a = z;
        }

        /* renamed from: a */
        public String mo42559a() {
            return this.f12992a;
        }
    }

    /* renamed from: com.xiaomi.push.j$b */
    public static final class ServiceConnectionC4535b implements ServiceConnection {

        /* renamed from: a */
        public final LinkedBlockingQueue<IBinder> f12994a;

        /* renamed from: a */
        public boolean f12995a;

        public ServiceConnectionC4535b() {
            this.f12995a = false;
            this.f12994a = new LinkedBlockingQueue<>(1);
        }

        /* renamed from: a */
        public IBinder mo42560a() {
            if (!this.f12995a) {
                this.f12995a = true;
                return this.f12994a.poll(30000, TimeUnit.MILLISECONDS);
            }
            throw new IllegalStateException();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f12994a.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.xiaomi.push.j$c */
    public static final class C4536c implements IInterface {

        /* renamed from: a */
        public IBinder f12996a;

        public C4536c(IBinder iBinder) {
            this.f12996a = iBinder;
        }

        /* renamed from: a */
        public String mo42563a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f12996a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.f12996a;
        }
    }

    /* renamed from: a */
    public static C4534a m13593a(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                ServiceConnectionC4535b bVar = new ServiceConnectionC4535b();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (context.bindService(intent, bVar, 1)) {
                    try {
                        IBinder a = bVar.mo42560a();
                        if (a != null) {
                            C4534a aVar = new C4534a(new C4536c(a).mo42563a(), false);
                            context.unbindService(bVar);
                            return aVar;
                        }
                        context.unbindService(bVar);
                    } catch (Exception e) {
                        throw e;
                    } catch (Throwable th) {
                        context.unbindService(bVar);
                        throw th;
                    }
                }
                throw new IOException("Google Play connection failed");
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }
}
