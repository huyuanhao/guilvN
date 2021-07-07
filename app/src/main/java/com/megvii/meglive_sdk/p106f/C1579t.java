package com.megvii.meglive_sdk.p106f;

import android.content.Context;
import android.content.pm.PackageManager;
import com.p118pd.sdk.C8932ooOOO0o;
import java.util.Locale;

/* renamed from: com.megvii.meglive_sdk.f.t */
public final class C1579t {

    /* renamed from: a */
    public Context f2619a;

    public C1579t(Context context) {
        this.f2619a = context;
    }

    /* renamed from: a */
    public final String mo17195a() {
        try {
            return this.f2619a.getPackageManager().getPackageInfo(this.f2619a.getPackageName(), 0).packageName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    public final String mo17196b() {
        try {
            return this.f2619a.getPackageManager().getPackageInfo(this.f2619a.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    public final String mo17197c() {
        return "MegVii-SDK/MegLiveStill 3.3.1A/" + mo17195a() + C8932ooOOO0o.OooO0OO + mo17196b() + C8932ooOOO0o.OooO0OO + Locale.getDefault().getLanguage();
    }

    /* renamed from: a */
    public static String m2672a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int length = str.length() - 1; length >= 0; length--) {
            sb.append(str.charAt(length));
        }
        return sb.toString();
    }
}
