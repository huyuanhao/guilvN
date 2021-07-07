package com.vivo.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.p118pd.sdk.C7265o0O000oo;
import com.vivo.push.util.C4146p;
import com.vivo.push.util.C4149s;
import com.vivo.push.util.C4156z;
import com.vivo.vms.IPCInvoke;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.vivo.push.b */
public final class ServiceConnectionC4030b implements ServiceConnection {

    /* renamed from: a */
    public static final Object f10897a = new Object();

    /* renamed from: b */
    public static Map<String, ServiceConnectionC4030b> f10898b = new HashMap();

    /* renamed from: c */
    public boolean f10899c;

    /* renamed from: d */
    public String f10900d = null;

    /* renamed from: e */
    public Context f10901e;

    /* renamed from: f */
    public AtomicInteger f10902f;

    /* renamed from: g */
    public volatile IPCInvoke f10903g;

    /* renamed from: h */
    public Object f10904h = new Object();

    /* renamed from: i */
    public String f10905i;

    /* renamed from: j */
    public Handler f10906j = null;

    public ServiceConnectionC4030b(Context context, String str) {
        this.f10901e = context;
        this.f10905i = str;
        boolean z = true;
        this.f10902f = new AtomicInteger(1);
        this.f10906j = new Handler(Looper.getMainLooper(), new C4061c(this));
        String b = C4149s.m11226b(context);
        this.f10900d = b;
        if (TextUtils.isEmpty(b) || TextUtils.isEmpty(this.f10905i)) {
            Context context2 = this.f10901e;
            C4146p.m11215c(context2, "init error : push pkgname is " + this.f10900d + " ; action is " + this.f10905i);
            this.f10899c = false;
            return;
        }
        this.f10899c = C4156z.m11256a(context, this.f10900d) < 1260 ? false : z;
        m10891b();
    }

    /* renamed from: d */
    private void m10895d() {
        this.f10906j.removeMessages(1);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m10896e() {
        try {
            this.f10901e.unbindService(this);
        } catch (Exception e) {
            C4146p.m11204a("AidlManager", "On unBindServiceException:" + e.getMessage());
        }
    }

    public final void onBindingDied(ComponentName componentName) {
        C4146p.m11211b("AidlManager", "onBindingDied : " + componentName);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m10895d();
        this.f10903g = IPCInvoke.Stub.asInterface(iBinder);
        if (this.f10903g == null) {
            C4146p.m11216d("AidlManager", "onServiceConnected error : aidl must not be null.");
            m10896e();
            this.f10902f.set(1);
            return;
        }
        if (this.f10902f.get() == 2) {
            m10890a(4);
        } else if (this.f10902f.get() != 4) {
            m10896e();
        }
        synchronized (this.f10904h) {
            this.f10904h.notifyAll();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f10903g = null;
        m10890a(1);
    }

    /* renamed from: a */
    public static ServiceConnectionC4030b m10888a(Context context, String str) {
        ServiceConnectionC4030b bVar = f10898b.get(str);
        if (bVar == null) {
            synchronized (f10897a) {
                bVar = f10898b.get(str);
                if (bVar == null) {
                    bVar = new ServiceConnectionC4030b(context, str);
                    f10898b.put(str, bVar);
                }
            }
        }
        return bVar;
    }

    /* renamed from: b */
    private void m10891b() {
        int i = this.f10902f.get();
        C4146p.m11216d("AidlManager", "Enter connect, Connection Status: " + i);
        if (i != 4 && i != 2 && i != 3 && i != 5 && this.f10899c) {
            m10890a(2);
            if (!m10894c()) {
                m10890a(1);
                C4146p.m11204a("AidlManager", "bind core service fail");
                return;
            }
            this.f10906j.removeMessages(1);
            this.f10906j.sendEmptyMessageDelayed(1, 3000);
        }
    }

    /* renamed from: c */
    private boolean m10894c() {
        Intent intent = new Intent(this.f10905i);
        intent.setPackage(this.f10900d);
        try {
            return this.f10901e.bindService(intent, this, 1);
        } catch (Exception e) {
            C4146p.m11205a("AidlManager", "bind core error", e);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo40893a() {
        String b = C4149s.m11226b(this.f10901e);
        this.f10900d = b;
        boolean z = false;
        if (TextUtils.isEmpty(b)) {
            C4146p.m11215c(this.f10901e, "push pkgname is null");
            return false;
        }
        if (C4156z.m11256a(this.f10901e, this.f10900d) >= 1260) {
            z = true;
        }
        this.f10899c = z;
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10890a(int i) {
        this.f10902f.set(i);
    }

    /* renamed from: a */
    public final boolean mo40894a(Bundle bundle) {
        m10891b();
        if (this.f10902f.get() == 2) {
            synchronized (this.f10904h) {
                try {
                    this.f10904h.wait(C7265o0O000oo.OooO0o.OooO00o);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            int i = this.f10902f.get();
            if (i == 4) {
                this.f10906j.removeMessages(2);
                this.f10906j.sendEmptyMessageDelayed(2, 30000);
                this.f10903g.asyncCall(bundle, null);
                return true;
            }
            C4146p.m11216d("AidlManager", "invoke error : connect status = " + i);
            return false;
        } catch (Exception e2) {
            C4146p.m11205a("AidlManager", "invoke error ", e2);
            int i2 = this.f10902f.get();
            C4146p.m11216d("AidlManager", "Enter disconnect, Connection Status: " + i2);
            if (i2 == 2) {
                m10895d();
                m10890a(1);
                return false;
            } else if (i2 == 3) {
                m10890a(1);
                return false;
            } else if (i2 != 4) {
                return false;
            } else {
                m10890a(1);
                m10896e();
                return false;
            }
        }
    }
}
