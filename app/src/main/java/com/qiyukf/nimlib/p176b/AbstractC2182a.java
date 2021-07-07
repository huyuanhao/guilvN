package com.qiyukf.nimlib.p176b;

import android.text.TextUtils;
import com.qiyukf.basesdk.p119a.C1709a;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.qiyukf.nimlib.b.a */
public abstract class AbstractC2182a {

    /* renamed from: a */
    public boolean f4361a = false;

    /* renamed from: b */
    public boolean f4362b = true;

    /* renamed from: c */
    public boolean f4363c = true;

    /* renamed from: d */
    public boolean f4364d = true;

    /* renamed from: a */
    public static String m4492a(boolean z) {
        return z ? "1" : "0";
    }

    /* renamed from: a */
    public static boolean mo34772a(String str) {
        return !"0".equals(str);
    }

    /* renamed from: a */
    public final void mo34765a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            String d = mo34769d();
            C1709a.m3011a(d, "read sdk config from " + str2 + ", but get null");
            return;
        }
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (split.length == 4) {
            this.f4361a = mo34772a(split[0]);
            this.f4362b = mo34772a(split[1]);
            this.f4363c = mo34772a(split[2]);
            this.f4364d = mo34772a(split[3]);
            String d2 = mo34769d();
            C1709a.m3011a(d2, "read sdk config from " + str2 + ", " + toString());
        }
    }

    /* renamed from: a */
    public boolean mo34766a() {
        return this.f4362b;
    }

    /* renamed from: b */
    public abstract String mo34767b();

    /* renamed from: c */
    public String mo34768c() {
        return m4492a(this.f4361a) + Constants.ACCEPT_TIME_SEPARATOR_SP + m4492a(this.f4362b) + Constants.ACCEPT_TIME_SEPARATOR_SP + m4492a(this.f4363c) + Constants.ACCEPT_TIME_SEPARATOR_SP + m4492a(this.f4364d);
    }

    /* renamed from: d */
    public final String mo34769d() {
        return "sdk_config_" + mo34767b();
    }

    public String toString() {
        return "sdk config=[" + mo34768c() + "]";
    }
}
