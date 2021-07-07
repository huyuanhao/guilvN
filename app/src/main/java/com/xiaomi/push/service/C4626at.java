package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.xiaomi.push.C4244ab;

/* renamed from: com.xiaomi.push.service.at */
public class C4626at {

    /* renamed from: a */
    public static C4626at f13250a;

    /* renamed from: a */
    public int f13251a = 0;

    /* renamed from: a */
    public Context f13252a;

    public C4626at(Context context) {
        this.f13252a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C4626at m13995a(Context context) {
        if (f13250a == null) {
            f13250a = new C4626at(context);
        }
        return f13250a;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public int mo42688a() {
        int i = this.f13251a;
        if (i != 0) {
            return i;
        }
        int i2 = Build.VERSION.SDK_INT >= 17 ? Settings.Global.getInt(this.f13252a.getContentResolver(), "device_provisioned", 0) : Settings.Secure.getInt(this.f13252a.getContentResolver(), "device_provisioned", 0);
        this.f13251a = i2;
        return i2;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public Uri m13997a() {
        return Build.VERSION.SDK_INT >= 17 ? Settings.Global.getUriFor("device_provisioned") : Settings.Secure.getUriFor("device_provisioned");
    }

    /* renamed from: a */
    public boolean m13998a() {
        return C4244ab.f11341a.contains("xmsf") || C4244ab.f11341a.contains("xiaomi") || C4244ab.f11341a.contains("miui");
    }
}
