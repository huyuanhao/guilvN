package com.umeng.commonsdk.proguard;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.umeng.commonsdk.proguard.m */
public class C3614m {

    /* renamed from: a */
    public final LinkedBlockingQueue<IBinder> f9307a = new LinkedBlockingQueue<>(1);

    /* renamed from: b */
    public AbstractC3612k f9308b;

    /* renamed from: c */
    public String f9309c = null;

    /* renamed from: d */
    public String f9310d = null;

    /* renamed from: e */
    public ServiceConnection f9311e = new ServiceConnectionC3615a(this);

    /* renamed from: com.umeng.commonsdk.proguard.m$a */
    public class ServiceConnectionC3615a implements ServiceConnection {

        /* renamed from: a */
        public C3614m f9312a = null;

        public ServiceConnectionC3615a(C3614m mVar) {
            this.f9312a = mVar;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f9312a.f9307a.put(iBinder);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.f9312a.f9308b = null;
            this.f9312a.f9307a.clear();
        }
    }

    /* renamed from: b */
    private String m9500b(Context context, String str) {
        String packageName = context.getPackageName();
        this.f9309c = packageName;
        String a = C3616n.m9503a(context, packageName, "SHA1");
        this.f9310d = a;
        return this.f9308b.mo38990a(this.f9309c, a, str);
    }

    /* renamed from: a */
    public String mo38992a(Context context, String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot run on MainThread");
        } else if (this.f9308b == null) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
            intent.setAction("android.intent.action.OPEN_ID");
            if (!context.bindService(intent, this.f9311e, 1)) {
                return "";
            }
            try {
                this.f9308b = BinderC3610j.m9492a(this.f9307a.take());
                return m9500b(context, str);
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        } else {
            try {
                return m9500b(context, str);
            } catch (Exception e2) {
                e2.printStackTrace();
                return "";
            }
        }
    }

    /* renamed from: a */
    public boolean mo38993a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (Build.VERSION.SDK_INT >= 28) {
                if (packageInfo == null || packageInfo.getLongVersionCode() < 1) {
                    return false;
                }
                return true;
            } else if (packageInfo == null || packageInfo.versionCode < 1) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
