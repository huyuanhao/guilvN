package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.xiaomi.push.bo */
public class C4294bo {

    /* renamed from: a */
    public static volatile C4294bo f11435a;

    /* renamed from: a */
    public Context f11436a;

    public C4294bo(Context context) {
        this.f11436a = context;
    }

    /* renamed from: a */
    public static C4294bo m11827a(Context context) {
        if (f11435a == null) {
            synchronized (C4294bo.class) {
                if (f11435a == null) {
                    f11435a = new C4294bo(context);
                }
            }
        }
        return f11435a;
    }

    /* renamed from: a */
    public synchronized long mo41525a(String str, String str2, long j) {
        try {
        } catch (Throwable unused) {
            return j;
        }
        return this.f11436a.getSharedPreferences(str, 4).getLong(str2, j);
    }

    /* renamed from: a */
    public synchronized String mo41526a(String str, String str2, String str3) {
        try {
        } catch (Throwable unused) {
            return str3;
        }
        return this.f11436a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    /* renamed from: a */
    public synchronized void m11830a(String str, String str2, long j) {
        SharedPreferences.Editor edit = this.f11436a.getSharedPreferences(str, 4).edit();
        edit.putLong(str2, j);
        edit.commit();
    }

    /* renamed from: a */
    public synchronized void m11831a(String str, String str2, String str3) {
        SharedPreferences.Editor edit = this.f11436a.getSharedPreferences(str, 4).edit();
        edit.putString(str2, str3);
        edit.commit();
    }
}
