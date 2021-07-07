package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4244ab;
import com.xiaomi.push.C4563l;
import java.util.ArrayList;
import java.util.List;
import org.android.agoo.xiaomi.MiPushRegistar;

/* renamed from: com.xiaomi.push.service.ay */
public class C4631ay {

    /* renamed from: a */
    public static C4631ay f13267a;

    /* renamed from: a */
    public static String f13268a;

    /* renamed from: a */
    public Context f13269a;

    /* renamed from: a */
    public Messenger f13270a;

    /* renamed from: a */
    public List<Message> f13271a = new ArrayList();

    /* renamed from: a */
    public boolean f13272a = false;

    /* renamed from: b */
    public Messenger f13273b;

    /* renamed from: b */
    public boolean f13274b = false;

    public C4631ay(Context context) {
        this.f13269a = context.getApplicationContext();
        this.f13270a = new Messenger(new HandlerC4632az(this, Looper.getMainLooper()));
        if (m14020a()) {
            AbstractC4163b.m11305c("use miui push service");
            this.f13272a = true;
        }
    }

    /* renamed from: a */
    private Message mo42692a(Intent intent) {
        Message obtain = Message.obtain();
        obtain.what = 17;
        obtain.obj = intent;
        return obtain;
    }

    /* renamed from: a */
    public static C4631ay m14017a(Context context) {
        if (f13267a == null) {
            f13267a = new C4631ay(context);
        }
        return f13267a;
    }

    /* renamed from: a */
    private synchronized void m14019a(Intent intent) {
        if (this.f13274b) {
            Message a = mo42692a(intent);
            if (this.f13271a.size() >= 50) {
                this.f13271a.remove(0);
            }
            this.f13271a.add(a);
            return;
        }
        if (this.f13273b == null) {
            this.f13269a.bindService(intent, new ServiceConnectionC4634ba(this), 1);
            this.f13274b = true;
            this.f13271a.clear();
            this.f13271a.add(mo42692a(intent));
        } else {
            try {
                this.f13273b.send(mo42692a(intent));
            } catch (RemoteException unused) {
                this.f13273b = null;
                this.f13274b = false;
            }
        }
    }

    /* renamed from: a */
    private boolean m14020a() {
        if (C4244ab.f11346e) {
            return false;
        }
        try {
            PackageInfo packageInfo = this.f13269a.getPackageManager().getPackageInfo(MiPushRegistar.PACKAGE_XIAOMI, 4);
            return packageInfo != null && packageInfo.versionCode >= 104;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean m14022a(Intent intent) {
        try {
            if (C4563l.m13726a() || Build.VERSION.SDK_INT < 26) {
                this.f13269a.startService(intent);
                return true;
            }
            m14019a(intent);
            return true;
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
            return false;
        }
    }
}
