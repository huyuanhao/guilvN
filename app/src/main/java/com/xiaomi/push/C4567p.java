package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.p */
public class C4567p {

    /* renamed from: a */
    public static volatile C4567p f13056a;

    /* renamed from: a */
    public Context f13057a;

    /* renamed from: a */
    public Handler f13058a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public Map<String, Map<String, String>> f13059a = new HashMap();

    public C4567p(Context context) {
        this.f13057a = context;
    }

    /* renamed from: a */
    public static C4567p m13738a(Context context) {
        if (f13056a == null) {
            synchronized (C4567p.class) {
                if (f13056a == null) {
                    f13056a = new C4567p(context);
                }
            }
        }
        return f13056a;
    }

    /* renamed from: a */
    private synchronized String m13739a(String str, String str2) {
        if (this.f13059a == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            Map<String, String> map = this.f13059a.get(str);
            if (map == null) {
                return "";
            }
            return map.get(str2);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    private synchronized void m13740b(String str, String str2, String str3) {
        if (this.f13059a == null) {
            this.f13059a = new HashMap();
        }
        Map<String, String> map = this.f13059a.get(str);
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(str2, str3);
        this.f13059a.put(str, map);
    }

    /* renamed from: a */
    public synchronized String mo42603a(String str, String str2, String str3) {
        String a = m13739a(str, str2);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        return this.f13057a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    /* renamed from: a */
    public synchronized void m13742a(String str, String str2, String str3) {
        m13740b(str, str2, str3);
        this.f13058a.post(new RunnableC4569q(this, str, str2, str3));
    }
}
