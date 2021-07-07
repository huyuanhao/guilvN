package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.xiaomi.push.eh */
public class C4381eh extends AbstractC4379ef {

    /* renamed from: a */
    public boolean f11650a;

    /* renamed from: b */
    public boolean f11651b;

    /* renamed from: c */
    public boolean f11652c;

    /* renamed from: d */
    public boolean f11653d;

    /* renamed from: e */
    public boolean f11654e;

    public C4381eh(Context context, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(context, i);
        this.f11650a = z;
        this.f11651b = z2;
        this.f11652c = z3;
        this.f11653d = z4;
        this.f11654e = z5;
    }

    @Override // com.xiaomi.push.AbstractC4379ef
    /* renamed from: b */
    private String m12178b() {
        if (!this.f11650a) {
            return "off";
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) ((AbstractC4379ef) this).f11645a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.heightPixels + Constants.ACCEPT_TIME_SEPARATOR_SP + displayMetrics.widthPixels;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: c */
    private String m12179c() {
        if (!this.f11651b) {
            return "off";
        }
        try {
            return Build.VERSION.RELEASE;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: d */
    private String m12180d() {
        if (!this.f11652c) {
            return "off";
        }
        try {
            return String.valueOf(Build.VERSION.SDK_INT);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: e */
    private String m12181e() {
        if (!this.f11653d) {
            return "off";
        }
        try {
            return Settings.Secure.getString(((AbstractC4379ef) this).f11645a.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: f */
    private String m12182f() {
        if (!this.f11654e) {
            return "off";
        }
        try {
            return ((TelephonyManager) ((AbstractC4379ef) this).f11645a.getSystemService("phone")).getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public int mo41384a() {
        return 3;
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public EnumC4496hq m12184a() {
        return EnumC4496hq.DeviceInfoV2;
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public String m12185a() {
        return m12178b() + "|" + m12179c() + "|" + m12180d() + "|" + m12181e() + "|" + m12182f();
    }
}
