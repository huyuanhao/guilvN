package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;

/* renamed from: com.umeng.analytics.pro.z */
public final class C3472z {

    /* renamed from: a */
    public static C3472z f8804a = null;

    /* renamed from: b */
    public static Context f8805b = null;

    /* renamed from: c */
    public static String f8806c = null;

    /* renamed from: d */
    public static final String f8807d = "mobclick_agent_user_";

    /* renamed from: com.umeng.analytics.pro.z$a */
    public static final class C3473a {

        /* renamed from: a */
        public static final C3472z f8808a = new C3472z();
    }

    /* renamed from: a */
    public static synchronized C3472z m8945a(Context context) {
        C3472z zVar;
        synchronized (C3472z.class) {
            if (f8805b == null && context != null) {
                f8805b = context.getApplicationContext();
            }
            if (f8805b != null) {
                f8806c = context.getPackageName();
            }
            zVar = C3473a.f8808a;
        }
        return zVar;
    }

    /* renamed from: e */
    private SharedPreferences m8946e() {
        Context context = f8805b;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("mobclick_agent_user_" + f8806c, 0);
    }

    /* renamed from: b */
    public void mo38807b() {
        SharedPreferences e = m8946e();
        if (e != null) {
            e.edit().remove("au_p").remove("au_u").commit();
        }
    }

    /* renamed from: c */
    public String mo38808c() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8805b);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("st", null);
        }
        return null;
    }

    /* renamed from: d */
    public int mo38809d() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8805b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }

    /* renamed from: a */
    public void mo38805a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            SharedPreferences.Editor edit = m8946e().edit();
            edit.putString("au_p", str);
            edit.putString("au_u", str2);
            edit.commit();
        }
    }

    /* renamed from: a */
    public String[] mo38806a() {
        SharedPreferences e = m8946e();
        if (e == null) {
            return null;
        }
        String string = e.getString("au_p", null);
        String string2 = e.getString("au_u", null);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return null;
        }
        return new String[]{string, string2};
    }

    /* renamed from: a */
    public void mo38804a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8805b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    /* renamed from: a */
    public void mo38803a(int i) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8805b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i).commit();
        }
    }
}
