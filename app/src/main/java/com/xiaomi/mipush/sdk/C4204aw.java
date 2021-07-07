package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.AbstractC4532iz;
import com.xiaomi.push.C4274az;
import com.xiaomi.push.C4284be;
import com.xiaomi.push.C4351dh;
import com.xiaomi.push.C4417fd;
import com.xiaomi.push.C4498hs;
import com.xiaomi.push.C4508ib;
import com.xiaomi.push.C4517ik;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.C4521io;
import com.xiaomi.push.C4527iu;
import com.xiaomi.push.C4531iy;
import com.xiaomi.push.C4563l;
import com.xiaomi.push.EnumC4494ho;
import com.xiaomi.push.EnumC4495hp;
import com.xiaomi.push.EnumC4499ht;
import com.xiaomi.push.EnumC4504hy;
import com.xiaomi.push.service.AbstractC4621aq;
import com.xiaomi.push.service.C4605ah;
import com.xiaomi.push.service.C4609ak;
import com.xiaomi.push.service.C4626at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.android.agoo.xiaomi.MiPushRegistar;

/* renamed from: com.xiaomi.mipush.sdk.aw */
public class C4204aw {

    /* renamed from: a */
    public static C4204aw f11247a;

    /* renamed from: a */
    public static final ArrayList<C4205a> f11248a = new ArrayList<>();

    /* renamed from: b */
    public static boolean f11249b;

    /* renamed from: a */
    public Context f11250a;

    /* renamed from: a */
    public Intent f11251a = null;

    /* renamed from: a */
    public Handler f11252a = null;

    /* renamed from: a */
    public Messenger f11253a;

    /* renamed from: a */
    public Integer f11254a = null;

    /* renamed from: a */
    public String f11255a;

    /* renamed from: a */
    public List<Message> f11256a = new ArrayList();

    /* renamed from: a */
    public boolean f11257a = false;

    /* renamed from: c */
    public boolean f11258c = false;

    /* renamed from: com.xiaomi.mipush.sdk.aw$a */
    public static class C4205a<T extends AbstractC4532iz<T, ?>> {

        /* renamed from: a */
        public EnumC4494ho f11259a;

        /* renamed from: a */
        public T f11260a;

        /* renamed from: a */
        public boolean f11261a;
    }

    public C4204aw(Context context) {
        this.f11250a = context.getApplicationContext();
        this.f11255a = null;
        this.f11257a = m11457c();
        f11249b = m11460d();
        this.f11252a = new HandlerC4206ax(this, Looper.getMainLooper());
        Intent b = mo41412b();
        if (b != null) {
            m11453b(b);
        }
    }

    /* renamed from: a */
    private synchronized int mo41395a() {
        return this.f11250a.getSharedPreferences("mipush_extra", 0).getInt(Constants.EXTRA_KEY_BOOT_SERVICE_MODE, -1);
    }

    /* renamed from: a */
    private Intent m11440a() {
        return (!m11482a() || MiPushRegistar.PACKAGE_XIAOMI.equals(this.f11250a.getPackageName())) ? mo41416e() : mo41415d();
    }

    /* renamed from: a */
    private Message mo41398a(Intent intent) {
        Message obtain = Message.obtain();
        obtain.what = 17;
        obtain.obj = intent;
        return obtain;
    }

    /* renamed from: a */
    public static synchronized C4204aw m11444a(Context context) {
        C4204aw awVar;
        synchronized (C4204aw.class) {
            if (f11247a == null) {
                f11247a = new C4204aw(context);
            }
            awVar = f11247a;
        }
        return awVar;
    }

    /* renamed from: a */
    private String m11447a() {
        try {
            return this.f11250a.getPackageManager().getPackageInfo(MiPushRegistar.PACKAGE_XIAOMI, 4).versionCode >= 106 ? "com.xiaomi.push.service.XMPushService" : "com.xiaomi.xmsf.push.service.XMPushService";
        } catch (Exception unused) {
            return "com.xiaomi.xmsf.push.service.XMPushService";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11450a(String str, EnumC4212bb bbVar, boolean z, HashMap<String, String> hashMap) {
        C4520in inVar;
        String str2;
        if (C4209b.m11491a(this.f11250a).m11509b() && C4274az.m11735b(this.f11250a)) {
            C4520in inVar2 = new C4520in();
            inVar2.mo42310a(true);
            Intent a = m11440a();
            if (TextUtils.isEmpty(str)) {
                str = C4609ak.m13938a();
                inVar2.mo42307a(str);
                inVar = z ? new C4520in(str, true) : null;
                synchronized (C4194am.class) {
                    C4194am.m11405a(this.f11250a).m11409a(str);
                }
            } else {
                inVar2.mo42307a(str);
                inVar = z ? new C4520in(str, true) : null;
            }
            switch (C4211ba.f11282a[bbVar.ordinal()]) {
                case 1:
                    inVar2.mo42317c(EnumC4504hy.DisablePushMessage.f12451a);
                    inVar.mo42317c(EnumC4504hy.DisablePushMessage.f12451a);
                    if (hashMap != null) {
                        inVar2.mo42309a(hashMap);
                        inVar.mo42309a(hashMap);
                    }
                    str2 = "com.xiaomi.mipush.DISABLE_PUSH_MESSAGE";
                    a.setAction(str2);
                    break;
                case 2:
                    inVar2.mo42317c(EnumC4504hy.EnablePushMessage.f12451a);
                    inVar.mo42317c(EnumC4504hy.EnablePushMessage.f12451a);
                    if (hashMap != null) {
                        inVar2.mo42309a(hashMap);
                        inVar.mo42309a(hashMap);
                    }
                    str2 = "com.xiaomi.mipush.ENABLE_PUSH_MESSAGE";
                    a.setAction(str2);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    inVar2.mo42317c(EnumC4504hy.ThirdPartyRegUpdate.f12451a);
                    if (hashMap != null) {
                        inVar2.mo42309a(hashMap);
                        break;
                    }
                    break;
            }
            inVar2.mo42314b(C4209b.m11491a(this.f11250a).m11495a());
            inVar2.mo42321d(this.f11250a.getPackageName());
            mo41404a((AbstractC4532iz) inVar2, EnumC4494ho.Notification, false, (C4508ib) null);
            if (z) {
                inVar.mo42314b(C4209b.m11491a(this.f11250a).m11495a());
                inVar.mo42321d(this.f11250a.getPackageName());
                Context context = this.f11250a;
                byte[] a2 = C4531iy.m13590a(C4197ap.m11414a(context, inVar, EnumC4494ho.Notification, false, context.getPackageName(), C4209b.m11491a(this.f11250a).m11495a()));
                if (a2 != null) {
                    C4351dh.m12081a(this.f11250a.getPackageName(), this.f11250a, inVar, EnumC4494ho.Notification, a2.length);
                    a.putExtra("mipush_payload", a2);
                    a.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                    a.putExtra("mipush_app_id", C4209b.m11491a(this.f11250a).m11495a());
                    a.putExtra("mipush_app_token", C4209b.m11491a(this.f11250a).mo41428b());
                    m11456c(a);
                }
            }
            Message obtain = Message.obtain();
            obtain.what = 19;
            int ordinal = bbVar.ordinal();
            obtain.obj = str;
            obtain.arg1 = ordinal;
            this.f11252a.sendMessageDelayed(obtain, WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS);
        }
    }

    /* renamed from: b */
    private Intent mo41412b() {
        if (!MiPushRegistar.PACKAGE_XIAOMI.equals(this.f11250a.getPackageName())) {
            return mo41414c();
        }
        AbstractC4163b.m11305c("pushChannel xmsf create own channel");
        return mo41416e();
    }

    /* renamed from: b */
    private void m11453b(Intent intent) {
        try {
            if (C4563l.m13726a() || Build.VERSION.SDK_INT < 26) {
                this.f11250a.startService(intent);
            } else {
                m11459d(intent);
            }
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
        }
    }

    /* renamed from: c */
    private Intent mo41414c() {
        if (m11482a()) {
            AbstractC4163b.m11305c("pushChannel app start miui china channel");
            return mo41415d();
        }
        AbstractC4163b.m11305c("pushChannel app start  own channel");
        return mo41416e();
    }

    /* renamed from: c */
    private synchronized void m11455c(int i) {
        this.f11250a.getSharedPreferences("mipush_extra", 0).edit().putInt(Constants.EXTRA_KEY_BOOT_SERVICE_MODE, i).commit();
    }

    /* renamed from: c */
    private void m11456c(Intent intent) {
        int a = C4605ah.m13919a(this.f11250a).mo42656a(EnumC4499ht.ServiceBootMode.mo42043a(), EnumC4495hp.START.mo42006a());
        int a2 = mo41395a();
        boolean z = a == EnumC4495hp.BIND.mo42006a() && f11249b;
        int a3 = (z ? EnumC4495hp.BIND : EnumC4495hp.START).mo42006a();
        if (a3 != a2) {
            m11483a(a3);
        }
        if (z) {
            m11459d(intent);
        } else {
            m11453b(intent);
        }
    }

    /* renamed from: c */
    private boolean m11457c() {
        try {
            PackageInfo packageInfo = this.f11250a.getPackageManager().getPackageInfo(MiPushRegistar.PACKAGE_XIAOMI, 4);
            return packageInfo != null && packageInfo.versionCode >= 105;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    private Intent mo41415d() {
        Intent intent = new Intent();
        String packageName = this.f11250a.getPackageName();
        intent.setPackage(MiPushRegistar.PACKAGE_XIAOMI);
        intent.setClassName(MiPushRegistar.PACKAGE_XIAOMI, m11447a());
        intent.putExtra("mipush_app_package", packageName);
        m11463f();
        return intent;
    }

    /* renamed from: d */
    private synchronized void m11459d(Intent intent) {
        if (this.f11258c) {
            Message a = mo41398a(intent);
            if (this.f11256a.size() >= 50) {
                this.f11256a.remove(0);
            }
            this.f11256a.add(a);
            return;
        }
        if (this.f11253a == null) {
            this.f11250a.bindService(intent, new ServiceConnectionC4208az(this), 1);
            this.f11258c = true;
            this.f11256a.clear();
            this.f11256a.add(mo41398a(intent));
        } else {
            try {
                this.f11253a.send(mo41398a(intent));
            } catch (RemoteException unused) {
                this.f11253a = null;
                this.f11258c = false;
            }
        }
    }

    /* renamed from: d */
    private boolean m11460d() {
        if (m11482a()) {
            try {
                return this.f11250a.getPackageManager().getPackageInfo(MiPushRegistar.PACKAGE_XIAOMI, 4).versionCode >= 108;
            } catch (Exception unused) {
            }
        }
        return true;
    }

    /* renamed from: e */
    private Intent mo41416e() {
        Intent intent = new Intent();
        String packageName = this.f11250a.getPackageName();
        m11464g();
        intent.setComponent(new ComponentName(this.f11250a, "com.xiaomi.push.service.XMPushService"));
        intent.putExtra("mipush_app_package", packageName);
        return intent;
    }

    /* renamed from: e */
    private boolean m11462e() {
        String packageName = this.f11250a.getPackageName();
        return packageName.contains("miui") || packageName.contains("xiaomi") || (this.f11250a.getApplicationInfo().flags & 1) != 0;
    }

    /* renamed from: f */
    private void m11463f() {
        try {
            PackageManager packageManager = this.f11250a.getPackageManager();
            ComponentName componentName = new ComponentName(this.f11250a, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    private void m11464g() {
        try {
            PackageManager packageManager = this.f11250a.getPackageManager();
            ComponentName componentName = new ComponentName(this.f11250a, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) != 1) {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void m11465a() {
        m11453b(m11440a());
    }

    /* renamed from: a */
    public void mo41396a(int i) {
        Intent a = m11440a();
        a.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        a.putExtra(AbstractC4621aq.f13247z, this.f11250a.getPackageName());
        a.putExtra(AbstractC4621aq.f13212A, i);
        m11456c(a);
    }

    /* renamed from: a */
    public void mo41397a(int i, String str) {
        Intent a = m11440a();
        a.setAction("com.xiaomi.mipush.thirdparty");
        a.putExtra("com.xiaomi.mipush.thirdparty_LEVEL", i);
        a.putExtra("com.xiaomi.mipush.thirdparty_DESC", str);
        m11453b(a);
    }

    /* renamed from: a */
    public void m11468a(Intent intent) {
        intent.fillIn(m11440a(), 24);
        m11456c(intent);
    }

    /* renamed from: a */
    public final void mo41399a(C4498hs hsVar) {
        Intent a = m11440a();
        byte[] a2 = C4531iy.m13590a(hsVar);
        if (a2 == null) {
            AbstractC4163b.m11301a("send TinyData failed, because tinyDataBytes is null.");
            return;
        }
        a.setAction("com.xiaomi.mipush.SEND_TINYDATA");
        a.putExtra("mipush_payload", a2);
        m11453b(a);
    }

    /* renamed from: a */
    public final void mo41400a(C4521io ioVar, boolean z) {
        C4417fd.m12519a(this.f11250a.getApplicationContext()).mo41813a(this.f11250a.getPackageName(), "E100003", ioVar.mo42343a(), 6001, "construct a register message");
        this.f11251a = null;
        C4209b.m11491a(this.f11250a).f11268a = ioVar.mo42343a();
        Intent a = m11440a();
        byte[] a2 = C4531iy.m13590a(C4197ap.m11413a(this.f11250a, ioVar, EnumC4494ho.Registration));
        if (a2 == null) {
            AbstractC4163b.m11301a("register fail, because msgBytes is null.");
            return;
        }
        a.setAction("com.xiaomi.mipush.REGISTER_APP");
        a.putExtra("mipush_app_id", C4209b.m11491a(this.f11250a).m11495a());
        a.putExtra("mipush_payload", a2);
        a.putExtra("mipush_session", this.f11255a);
        a.putExtra("mipush_env_chanage", z);
        a.putExtra("mipush_env_type", C4209b.m11491a(this.f11250a).mo41421a());
        if (!C4274az.m11735b(this.f11250a) || !m11486b()) {
            this.f11251a = a;
        } else {
            m11456c(a);
        }
    }

    /* renamed from: a */
    public final void mo41401a(C4527iu iuVar) {
        byte[] a = C4531iy.m13590a(C4197ap.m11413a(this.f11250a, iuVar, EnumC4494ho.UnRegistration));
        if (a == null) {
            AbstractC4163b.m11301a("unregister fail, because msgBytes is null.");
            return;
        }
        Intent a2 = m11440a();
        a2.setAction("com.xiaomi.mipush.UNREGISTER_APP");
        a2.putExtra("mipush_app_id", C4209b.m11491a(this.f11250a).m11495a());
        a2.putExtra("mipush_payload", a);
        m11456c(a2);
    }

    /* renamed from: a */
    public final <T extends AbstractC4532iz<T, ?>> void mo41402a(T t, EnumC4494ho hoVar, C4508ib ibVar) {
        mo41404a(t, hoVar, !hoVar.equals(EnumC4494ho.Registration), ibVar);
    }

    /* renamed from: a */
    public <T extends AbstractC4532iz<T, ?>> void mo41403a(T t, EnumC4494ho hoVar, boolean z) {
        C4205a aVar = new C4205a();
        aVar.f11260a = t;
        aVar.f11259a = hoVar;
        aVar.f11261a = z;
        synchronized (f11248a) {
            f11248a.add(aVar);
            if (f11248a.size() > 10) {
                f11248a.remove(0);
            }
        }
    }

    /* renamed from: a */
    public final <T extends AbstractC4532iz<T, ?>> void mo41404a(T t, EnumC4494ho hoVar, boolean z, C4508ib ibVar) {
        mo41406a(t, hoVar, z, true, ibVar, true);
    }

    /* renamed from: a */
    public final <T extends AbstractC4532iz<T, ?>> void mo41405a(T t, EnumC4494ho hoVar, boolean z, C4508ib ibVar, boolean z2) {
        mo41406a(t, hoVar, z, true, ibVar, z2);
    }

    /* renamed from: a */
    public final <T extends AbstractC4532iz<T, ?>> void mo41406a(T t, EnumC4494ho hoVar, boolean z, boolean z2, C4508ib ibVar, boolean z3) {
        mo41407a(t, hoVar, z, z2, ibVar, z3, this.f11250a.getPackageName(), C4209b.m11491a(this.f11250a).m11495a());
    }

    /* renamed from: a */
    public final <T extends AbstractC4532iz<T, ?>> void mo41407a(T t, EnumC4494ho hoVar, boolean z, boolean z2, C4508ib ibVar, boolean z3, String str, String str2) {
        if (C4209b.m11491a(this.f11250a).m11511c()) {
            C4517ik a = C4197ap.m11414a(this.f11250a, t, hoVar, z, str, str2);
            if (ibVar != null) {
                a.mo42275a(ibVar);
            }
            byte[] a2 = C4531iy.m13590a(a);
            if (a2 == null) {
                AbstractC4163b.m11301a("send message fail, because msgBytes is null.");
                return;
            }
            C4351dh.m12081a(this.f11250a.getPackageName(), this.f11250a, t, hoVar, a2.length);
            Intent a3 = m11440a();
            a3.setAction("com.xiaomi.mipush.SEND_MESSAGE");
            a3.putExtra("mipush_payload", a2);
            a3.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", z3);
            m11456c(a3);
        } else if (z2) {
            mo41403a(t, hoVar, z);
        } else {
            AbstractC4163b.m11301a("drop the message before initialization.");
        }
    }

    /* renamed from: a */
    public final void mo41408a(String str, EnumC4212bb bbVar, EnumC4216d dVar) {
        C4194am.m11405a(this.f11250a).mo41388a(bbVar, "syncing");
        m11450a(str, bbVar, false, C4220h.m11556a(this.f11250a, dVar));
    }

    /* renamed from: a */
    public void mo41409a(String str, String str2) {
        Intent a = m11440a();
        a.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        a.putExtra(AbstractC4621aq.f13247z, this.f11250a.getPackageName());
        a.putExtra(AbstractC4621aq.f13216E, str);
        a.putExtra(AbstractC4621aq.f13217F, str2);
        m11456c(a);
    }

    /* renamed from: a */
    public final void mo41410a(boolean z) {
        mo41411a(z, (String) null);
    }

    /* renamed from: a */
    public final void mo41411a(boolean z, String str) {
        EnumC4212bb bbVar;
        if (z) {
            C4194am.m11405a(this.f11250a).mo41388a(EnumC4212bb.DISABLE_PUSH, "syncing");
            C4194am.m11405a(this.f11250a).mo41388a(EnumC4212bb.ENABLE_PUSH, "");
            bbVar = EnumC4212bb.DISABLE_PUSH;
        } else {
            C4194am.m11405a(this.f11250a).mo41388a(EnumC4212bb.ENABLE_PUSH, "syncing");
            C4194am.m11405a(this.f11250a).mo41388a(EnumC4212bb.DISABLE_PUSH, "");
            bbVar = EnumC4212bb.ENABLE_PUSH;
        }
        m11450a(str, bbVar, true, (HashMap<String, String>) null);
    }

    /* renamed from: a */
    public boolean m11482a() {
        return this.f11257a && 1 == C4209b.m11491a(this.f11250a).mo41421a();
    }

    /* renamed from: a */
    public boolean m11483a(int i) {
        if (!C4209b.m11491a(this.f11250a).m11509b()) {
            return false;
        }
        m11455c(i);
        C4520in inVar = new C4520in();
        inVar.mo42307a(C4609ak.m13938a());
        inVar.mo42314b(C4209b.m11491a(this.f11250a).m11495a());
        inVar.mo42321d(this.f11250a.getPackageName());
        inVar.mo42317c(EnumC4504hy.ClientABTest.f12451a);
        HashMap hashMap = new HashMap();
        inVar.f12723a = hashMap;
        hashMap.put("boot_mode", i + "");
        m11444a(this.f11250a).mo41404a((AbstractC4532iz) inVar, EnumC4494ho.Notification, false, (C4508ib) null);
        return true;
    }

    /* renamed from: b */
    public final void m11484b() {
        Intent a = m11440a();
        a.setAction("com.xiaomi.mipush.DISABLE_PUSH");
        m11456c(a);
    }

    /* renamed from: b */
    public void mo41413b(int i) {
        Intent a = m11440a();
        a.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        a.putExtra(AbstractC4621aq.f13247z, this.f11250a.getPackageName());
        a.putExtra(AbstractC4621aq.f13213B, i);
        String str = AbstractC4621aq.f13215D;
        a.putExtra(str, C4284be.m11798b(this.f11250a.getPackageName() + i));
        m11456c(a);
    }

    /* renamed from: b */
    public boolean m11486b() {
        if (!m11482a() || !m11462e()) {
            return true;
        }
        if (this.f11254a == null) {
            Integer valueOf = Integer.valueOf(C4626at.m13995a(this.f11250a).mo42688a());
            this.f11254a = valueOf;
            if (valueOf.intValue() == 0) {
                this.f11250a.getContentResolver().registerContentObserver(C4626at.m13995a(this.f11250a).m13997a(), false, new C4207ay(this, new Handler(Looper.getMainLooper())));
            }
        }
        return this.f11254a.intValue() != 0;
    }

    /* renamed from: c */
    public void m11487c() {
        Intent intent = this.f11251a;
        if (intent != null) {
            m11456c(intent);
            this.f11251a = null;
        }
    }

    /* renamed from: d */
    public void m11488d() {
        synchronized (f11248a) {
            Iterator<C4205a> it = f11248a.iterator();
            while (it.hasNext()) {
                C4205a next = it.next();
                mo41406a(next.f11260a, next.f11259a, next.f11261a, false, null, true);
            }
            f11248a.clear();
        }
    }

    /* renamed from: e */
    public void m11489e() {
        Intent a = m11440a();
        a.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        a.putExtra(AbstractC4621aq.f13247z, this.f11250a.getPackageName());
        a.putExtra(AbstractC4621aq.f13215D, C4284be.m11798b(this.f11250a.getPackageName()));
        m11456c(a);
    }
}
