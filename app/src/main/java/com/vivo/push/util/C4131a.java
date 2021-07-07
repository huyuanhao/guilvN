package com.vivo.push.util;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: com.vivo.push.util.a */
public class C4131a {

    /* renamed from: a */
    public Context f11086a;

    /* renamed from: b */
    public String f11087b;

    /* renamed from: c */
    public volatile SharedPreferences f11088c;

    /* renamed from: d */
    public HashMap<String, String> f11089d = new HashMap<>();

    /* renamed from: e */
    public HashMap<String, Long> f11090e = new HashMap<>();

    /* renamed from: f */
    public HashMap<String, Integer> f11091f = new HashMap<>();

    /* renamed from: g */
    public HashMap<String, Boolean> f11092g = new HashMap<>();

    /* renamed from: a */
    public final void mo41180a(Context context, String str) {
        if (!(context instanceof Application)) {
            throw new RuntimeException("you can't invoke this in other sContext but Application, in case memory leak");
        } else if (!TextUtils.isEmpty(str)) {
            this.f11087b = str;
            this.f11088c = context.getSharedPreferences(str, 0);
            this.f11086a = context;
        } else {
            throw new RuntimeException("sharedFileName can't be null");
        }
    }

    /* renamed from: b */
    public final int mo41184b(String str) {
        Integer num = this.f11091f.get(str);
        if (num != null) {
            return num.intValue();
        }
        m11151b();
        if (this.f11088c != null) {
            num = Integer.valueOf(this.f11088c.getInt(str, 0));
            if (!num.equals(0)) {
                this.f11091f.put(str, num);
            }
        }
        return num.intValue();
    }

    /* renamed from: c */
    public final void mo41186c(String str) {
        this.f11090e.remove(str);
        this.f11091f.remove(str);
        this.f11092g.remove(str);
        this.f11089d.remove(str);
        m11151b();
        if (this.f11088c != null) {
            SharedPreferences.Editor edit = this.f11088c.edit();
            if (this.f11088c.contains(str)) {
                edit.remove(str);
                m11150a(edit);
            }
        }
    }

    /* renamed from: a */
    public final void mo41183a(String str, String str2) {
        this.f11089d.put(str, str2);
        m11151b();
        if (this.f11088c != null) {
            SharedPreferences.Editor edit = this.f11088c.edit();
            edit.putString(str, str2);
            m11150a(edit);
        }
    }

    /* renamed from: b */
    public final long mo41185b(String str, long j) {
        Long l = this.f11090e.get(str);
        if (l != null) {
            return l.longValue();
        }
        m11151b();
        if (this.f11088c != null) {
            l = Long.valueOf(this.f11088c.getLong(str, j));
            if (!l.equals(Long.valueOf(j))) {
                this.f11090e.put(str, l);
            }
        }
        return l.longValue();
    }

    /* renamed from: a */
    public final void mo41181a(String str, int i) {
        this.f11091f.put(str, Integer.valueOf(i));
        m11151b();
        if (this.f11088c != null) {
            SharedPreferences.Editor edit = this.f11088c.edit();
            edit.putInt(str, i);
            m11150a(edit);
        }
    }

    /* renamed from: b */
    private void m11151b() {
        if (this.f11088c == null) {
            Context context = this.f11086a;
            if (context != null) {
                this.f11088c = context.getSharedPreferences(this.f11087b, 0);
                return;
            }
            throw new RuntimeException("SharedPreferences is not init", new Throwable());
        }
    }

    /* renamed from: a */
    public final void mo41182a(String str, long j) {
        this.f11090e.put(str, Long.valueOf(j));
        m11151b();
        if (this.f11088c != null) {
            SharedPreferences.Editor edit = this.f11088c.edit();
            edit.putLong(str, j);
            m11150a(edit);
        }
    }

    /* renamed from: a */
    public final String mo41178a(String str) {
        String str2 = this.f11089d.get(str);
        if (str2 != null) {
            return str2;
        }
        m11151b();
        if (this.f11088c != null) {
            str2 = this.f11088c.getString(str, null);
            if (!TextUtils.isEmpty(str2) && !str2.equals(null)) {
                this.f11089d.put(str, str2);
            }
        }
        return str2;
    }

    /* renamed from: a */
    public static void m11150a(SharedPreferences.Editor editor) {
        if (editor != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                editor.apply();
            } else {
                editor.commit();
            }
        }
    }

    /* renamed from: a */
    public final void mo41179a() {
        this.f11090e.clear();
        this.f11091f.clear();
        this.f11092g.clear();
        this.f11089d.clear();
        m11151b();
        if (this.f11088c != null) {
            SharedPreferences.Editor edit = this.f11088c.edit();
            edit.clear();
            m11150a(edit);
        }
    }
}
