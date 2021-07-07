package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4285bf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.service.m */
public class C4673m {

    /* renamed from: a */
    public static C4673m f13361a;

    /* renamed from: a */
    public Context f13362a;

    /* renamed from: a */
    public List<String> f13363a = new ArrayList();

    /* renamed from: b */
    public final List<String> f13364b = new ArrayList();

    /* renamed from: c */
    public final List<String> f13365c = new ArrayList();

    public C4673m(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f13362a = applicationContext;
        if (applicationContext == null) {
            this.f13362a = context;
        }
        SharedPreferences sharedPreferences = this.f13362a.getSharedPreferences("mipush_app_info", 0);
        String[] split = sharedPreferences.getString("unregistered_pkg_names", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        for (String str : split) {
            if (TextUtils.isEmpty(str)) {
                this.f13363a.add(str);
            }
        }
        String[] split2 = sharedPreferences.getString("disable_push_pkg_names", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        for (String str2 : split2) {
            if (!TextUtils.isEmpty(str2)) {
                this.f13364b.add(str2);
            }
        }
        String[] split3 = sharedPreferences.getString("disable_push_pkg_names_cache", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        for (String str3 : split3) {
            if (!TextUtils.isEmpty(str3)) {
                this.f13365c.add(str3);
            }
        }
    }

    /* renamed from: a */
    public static C4673m m14150a(Context context) {
        if (f13361a == null) {
            f13361a = new C4673m(context);
        }
        return f13361a;
    }

    /* renamed from: a */
    public void mo42742a(String str) {
        synchronized (this.f13363a) {
            if (!this.f13363a.contains(str)) {
                this.f13363a.add(str);
                this.f13362a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", C4285bf.m11802a(this.f13363a, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: a */
    public boolean m14152a(String str) {
        boolean contains;
        synchronized (this.f13363a) {
            contains = this.f13363a.contains(str);
        }
        return contains;
    }

    /* renamed from: b */
    public void mo42743b(String str) {
        synchronized (this.f13364b) {
            if (!this.f13364b.contains(str)) {
                this.f13364b.add(str);
                this.f13362a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", C4285bf.m11802a(this.f13364b, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: b */
    public boolean m14154b(String str) {
        boolean contains;
        synchronized (this.f13364b) {
            contains = this.f13364b.contains(str);
        }
        return contains;
    }

    /* renamed from: c */
    public void mo42744c(String str) {
        synchronized (this.f13365c) {
            if (!this.f13365c.contains(str)) {
                this.f13365c.add(str);
                this.f13362a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", C4285bf.m11802a(this.f13365c, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: c */
    public boolean m14156c(String str) {
        boolean contains;
        synchronized (this.f13365c) {
            contains = this.f13365c.contains(str);
        }
        return contains;
    }

    /* renamed from: d */
    public void mo42745d(String str) {
        synchronized (this.f13363a) {
            if (this.f13363a.contains(str)) {
                this.f13363a.remove(str);
                this.f13362a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", C4285bf.m11802a(this.f13363a, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: e */
    public void mo42746e(String str) {
        synchronized (this.f13364b) {
            if (this.f13364b.contains(str)) {
                this.f13364b.remove(str);
                this.f13362a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", C4285bf.m11802a(this.f13364b, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: f */
    public void mo42747f(String str) {
        synchronized (this.f13365c) {
            if (this.f13365c.contains(str)) {
                this.f13365c.remove(str);
                this.f13362a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", C4285bf.m11802a(this.f13365c, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }
}
