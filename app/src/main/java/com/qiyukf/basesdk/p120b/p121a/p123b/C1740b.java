package com.qiyukf.basesdk.p120b.p121a.p123b;

import android.content.Context;
import android.content.SharedPreferences;
import com.qiyukf.basesdk.C1708a;
import com.qiyukf.basesdk.p120b.p121a.p123b.p126c.C1747d;

/* renamed from: com.qiyukf.basesdk.b.a.b.b */
public final class C1740b {
    /* renamed from: a */
    public static String m3145a() {
        return m3149b().getString("tokens", null);
    }

    /* renamed from: a */
    public static void m3146a(String str) {
        SharedPreferences.Editor edit = m3149b().edit();
        edit.putString("tokens", str);
        edit.commit();
    }

    /* renamed from: a */
    public static void m3147a(String str, C1747d dVar) {
        SharedPreferences.Editor edit = m3149b().edit();
        edit.putString("bo/" + str, C1747d.m3168a(dVar));
        edit.commit();
    }

    /* renamed from: a */
    public static void m3148a(String str, String str2) {
        SharedPreferences.Editor edit = m3149b().edit();
        edit.putString("fc/" + str, str2);
        edit.commit();
    }

    /* renamed from: b */
    public static SharedPreferences m3149b() {
        Context a = C1708a.m3001a();
        return a.getSharedPreferences("NimSDK_NOS_" + C1708a.m3003b(), 0);
    }

    /* renamed from: b */
    public static String m3150b(String str) {
        SharedPreferences b = m3149b();
        return b.getString("fc/" + str, null);
    }

    /* renamed from: c */
    public static void m3151c(String str) {
        SharedPreferences.Editor edit = m3149b().edit();
        edit.remove("fc/" + str);
        edit.commit();
    }

    /* renamed from: d */
    public static C1747d m3152d(String str) {
        SharedPreferences b = m3149b();
        String string = b.getString("bo/" + str, null);
        if (string == null) {
            return null;
        }
        return C1747d.m3172e(string);
    }

    /* renamed from: e */
    public static void m3153e(String str) {
        SharedPreferences.Editor edit = m3149b().edit();
        edit.remove("bo/" + str);
        edit.commit();
    }
}
