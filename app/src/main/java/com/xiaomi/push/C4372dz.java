package com.xiaomi.push;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.p118pd.sdk.C7088o00OO0o0;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.service.C4605ah;

/* renamed from: com.xiaomi.push.dz */
public class C4372dz {

    /* renamed from: a */
    public static volatile C4372dz f11638a;

    /* renamed from: a */
    public Context f11639a;

    public C4372dz(Context context) {
        this.f11639a = context;
    }

    /* renamed from: a */
    private int m12134a(int i) {
        return Math.max(60, i);
    }

    /* renamed from: a */
    public static C4372dz m12135a(Context context) {
        if (f11638a == null) {
            synchronized (C4372dz.class) {
                if (f11638a == null) {
                    f11638a = new C4372dz(context);
                }
            }
        }
        return f11638a;
    }

    /* renamed from: a */
    private boolean mo41678a() {
        if (Build.VERSION.SDK_INT >= 14) {
            try {
                ((Application) (this.f11639a instanceof Application ? this.f11639a : this.f11639a.getApplicationContext())).registerActivityLifecycleCallbacks(new C4363dq(this.f11639a, String.valueOf(System.currentTimeMillis() / 1000)));
                return true;
            } catch (Exception e) {
                AbstractC4163b.m11303a(e);
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m12138b() {
        C4251ai a = C4251ai.m11641a(this.f11639a);
        C4605ah a2 = C4605ah.m13919a(this.f11639a);
        SharedPreferences sharedPreferences = this.f11639a.getSharedPreferences("mipush_extra", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j = sharedPreferences.getLong("first_try_ts", currentTimeMillis);
        if (j == currentTimeMillis) {
            sharedPreferences.edit().putLong("first_try_ts", currentTimeMillis).commit();
        }
        if (Math.abs(currentTimeMillis - j) >= 172800000) {
            boolean a3 = a2.mo42661a(EnumC4499ht.ScreenSizeCollectionSwitch.mo42043a(), true);
            boolean a4 = a2.mo42661a(EnumC4499ht.AndroidVnCollectionSwitch.mo42043a(), true);
            boolean a5 = a2.mo42661a(EnumC4499ht.AndroidVcCollectionSwitch.mo42043a(), true);
            boolean a6 = a2.mo42661a(EnumC4499ht.AndroidIdCollectionSwitch.mo42043a(), true);
            boolean a7 = a2.mo42661a(EnumC4499ht.OperatorSwitch.mo42043a(), true);
            if (a3 || a4 || a5 || a6 || a7) {
                int a8 = m12134a(a2.mo42656a(EnumC4499ht.DeviceInfoCollectionFrequency.mo42043a(), 1209600));
                a.mo41478a(new C4381eh(this.f11639a, a8, a3, a4, a5, a6, a7), a8, 30);
            }
            boolean a9 = a2.mo42661a(EnumC4499ht.MacCollectionSwitch.mo42043a(), false);
            boolean a10 = a2.mo42661a(EnumC4499ht.IMSICollectionSwitch.mo42043a(), false);
            boolean a11 = a2.mo42661a(EnumC4499ht.IccidCollectionSwitch.mo42043a(), false);
            boolean a12 = a2.mo42661a(EnumC4499ht.DeviceIdSwitch.mo42043a(), false);
            if (a9 || a10 || a11 || a12) {
                int a13 = m12134a(a2.mo42656a(EnumC4499ht.DeviceBaseInfoCollectionFrequency.mo42043a(), 1209600));
                a.mo41478a(new C4380eg(this.f11639a, a13, a9, a10, a11, a12), a13, 30);
            }
            if (Build.VERSION.SDK_INT < 21 && a2.mo42661a(EnumC4499ht.AppActiveListCollectionSwitch.mo42043a(), false)) {
                int a14 = m12134a(a2.mo42656a(EnumC4499ht.AppActiveListCollectionFrequency.mo42043a(), 900));
                a.mo41478a(new C4375eb(this.f11639a, a14), a14, 30);
            }
            if (a2.mo42661a(EnumC4499ht.StorageCollectionSwitch.mo42043a(), true)) {
                int a15 = m12134a(a2.mo42656a(EnumC4499ht.StorageCollectionFrequency.mo42043a(), C7088o00OO0o0.OooO0Oo));
                a.mo41478a(new C4382ei(this.f11639a, a15), a15, 30);
            }
            if (a2.mo42661a(EnumC4499ht.TopAppCollectionSwitch.mo42043a(), false)) {
                int a16 = m12134a(a2.mo42656a(EnumC4499ht.TopAppCollectionFrequency.mo42043a(), 300));
                a.mo41478a(new C4383ej(this.f11639a, a16), a16, 30);
            }
            boolean a17 = a2.mo42661a(EnumC4499ht.AppIsInstalledCollectionSwitch.mo42043a(), false);
            String a18 = a2.mo42657a(EnumC4499ht.AppIsInstalledList.mo42043a(), (String) null);
            if (a17 && !TextUtils.isEmpty(a18)) {
                int a19 = m12134a(a2.mo42656a(EnumC4499ht.AppIsInstalledCollectionFrequency.mo42043a(), C7088o00OO0o0.OooO0Oo));
                a.mo41478a(new C4376ec(this.f11639a, a19, a18), a19, 30);
            }
            if (a2.mo42661a(EnumC4499ht.BroadcastActionCollectionSwitch.mo42043a(), true)) {
                int a20 = m12134a(a2.mo42656a(EnumC4499ht.BroadcastActionCollectionFrequency.mo42043a(), 900));
                a.mo41478a(new C4378ee(this.f11639a, a20), a20, 30);
            }
            if (a2.mo42661a(EnumC4499ht.ActivityTSSwitch.mo42043a(), false)) {
                mo41678a();
            }
            if (a2.mo42661a(EnumC4499ht.UploadSwitch.mo42043a(), true)) {
                a.mo41478a(new C4384ek(this.f11639a), m12134a(a2.mo42656a(EnumC4499ht.UploadFrequency.mo42043a(), C7088o00OO0o0.OooO0Oo)), 60);
            }
            if (a2.mo42661a(EnumC4499ht.BatteryCollectionSwitch.mo42043a(), false)) {
                int a21 = m12134a(a2.mo42656a(EnumC4499ht.BatteryCollectionFrequency.mo42043a(), 3600));
                a.mo41478a(new C4377ed(this.f11639a, a21), a21, 30);
            }
        }
    }

    /* renamed from: a */
    public void m12139a() {
        C4251ai.m11641a(this.f11639a).mo41475a(new RunnableC4374ea(this), 30);
    }
}
