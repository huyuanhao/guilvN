package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.os.Parcel;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.umeng.commonsdk.proguard.C3601d;

/* renamed from: com.xiaomi.push.ap */
public class C4262ap implements AbstractC4266ar {

    /* renamed from: a */
    public static boolean f11375a;

    /* renamed from: a */
    public volatile int f11376a = 0;

    /* renamed from: a */
    public Context f11377a;

    /* renamed from: a */
    public ServiceConnection f11378a;

    /* renamed from: a */
    public final Object f11379a = new Object();

    /* renamed from: a */
    public volatile String f11380a = null;

    /* renamed from: b */
    public volatile String f11381b = null;

    /* renamed from: b */
    public volatile boolean f11382b = false;

    /* renamed from: com.xiaomi.push.ap$a */
    public class ServiceConnectionC4263a implements ServiceConnection {
        public ServiceConnectionC4263a() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
            /*
            // Method dump skipped, instructions count: 119
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4262ap.ServiceConnectionC4263a.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.xiaomi.push.ap$b */
    public static class C4264b {
        /* renamed from: a */
        public static String m11686a(IBinder iBinder) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(C3601d.f9292a);
                iBinder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: a */
        public static boolean m11687a(IBinder iBinder) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(C3601d.f9292a);
                boolean z = false;
                iBinder.transact(2, obtain, obtain2, 0);
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

    public C4262ap(Context context) {
        this.f11377a = context;
        mo41492a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m11673a(android.content.Context r5) {
        /*
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0024 }
            r2 = 24
            r3 = 0
            java.lang.String r4 = "aaid"
            if (r1 < r2) goto L_0x0019
            android.content.Context r1 = r5.createDeviceProtectedStorageContext()
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r4, r3)
            java.lang.String r1 = r1.getString(r4, r0)
            if (r1 == 0) goto L_0x001a
            return r1
        L_0x0019:
            r1 = r0
        L_0x001a:
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r4, r3)     // Catch:{ Exception -> 0x0023 }
            java.lang.String r5 = r5.getString(r4, r0)     // Catch:{ Exception -> 0x0023 }
            goto L_0x0025
        L_0x0023:
            r0 = r1
        L_0x0024:
            r5 = r0
        L_0x0025:
            if (r5 != 0) goto L_0x0029
            java.lang.String r5 = ""
        L_0x0029:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4262ap.m11673a(android.content.Context):java.lang.String");
    }

    @Override // com.xiaomi.push.AbstractC4266ar, com.xiaomi.push.AbstractC4266ar
    /* renamed from: a */
    private void mo41492a() {
        boolean z;
        this.f11378a = new ServiceConnectionC4263a();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage(HuaweiApiAvailability.SERVICES_PACKAGE);
        int i = 1;
        try {
            z = this.f11377a.bindService(intent, this.f11378a, 1);
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            i = 2;
        }
        this.f11376a = i;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11677a(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r3.f11376a
            r1 = 1
            if (r0 != r1) goto L_0x0039
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 == r1) goto L_0x0039
            java.lang.Object r0 = r3.f11379a
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0035 }
            r1.<init>()     // Catch:{ Exception -> 0x0035 }
            java.lang.String r2 = "huawei's "
            r1.append(r2)     // Catch:{ Exception -> 0x0035 }
            r1.append(r4)     // Catch:{ Exception -> 0x0035 }
            java.lang.String r4 = " wait..."
            r1.append(r4)     // Catch:{ Exception -> 0x0035 }
            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0035 }
            com.xiaomi.channel.commonutils.logger.AbstractC4163b.m11301a(r4)     // Catch:{ Exception -> 0x0035 }
            java.lang.Object r4 = r3.f11379a     // Catch:{ Exception -> 0x0035 }
            r1 = 3000(0xbb8, double:1.482E-320)
            r4.wait(r1)     // Catch:{ Exception -> 0x0035 }
            goto L_0x0035
        L_0x0033:
            r4 = move-exception
            goto L_0x0037
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            goto L_0x0039
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r4
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4262ap.m11677a(java.lang.String):void");
    }

    /* renamed from: a */
    public static boolean m11678a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(HuaweiApiAvailability.SERVICES_PACKAGE, 128);
            boolean z = (packageInfo.applicationInfo.flags & 1) != 0;
            f11375a = packageInfo.versionCode >= 20602000;
            return z;
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    @Override // com.xiaomi.push.AbstractC4266ar
    /* renamed from: b */
    private void mo41493b() {
        ServiceConnection serviceConnection = this.f11378a;
        if (serviceConnection != null) {
            try {
                this.f11377a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.xiaomi.push.AbstractC4266ar, com.xiaomi.push.AbstractC4266ar
    /* renamed from: a */
    public String m11681a() {
        return null;
    }

    @Override // com.xiaomi.push.AbstractC4266ar, com.xiaomi.push.AbstractC4266ar
    /* renamed from: a */
    public boolean m11682a() {
        return f11375a;
    }

    @Override // com.xiaomi.push.AbstractC4266ar
    /* renamed from: b */
    public String m11683b() {
        m11677a("getOAID");
        return this.f11380a;
    }

    @Override // com.xiaomi.push.AbstractC4266ar
    /* renamed from: c */
    public String mo41494c() {
        return null;
    }

    @Override // com.xiaomi.push.AbstractC4266ar
    /* renamed from: d */
    public String mo41495d() {
        if (this.f11381b == null) {
            synchronized (this) {
                if (this.f11381b == null) {
                    this.f11381b = m11673a(this.f11377a);
                }
            }
        }
        return this.f11381b;
    }
}
