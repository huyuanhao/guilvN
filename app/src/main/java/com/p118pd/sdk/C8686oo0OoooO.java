package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.pd.sdk.oo0OoooO  reason: case insensitive filesystem */
public class C8686oo0OoooO {
    public static C8686oo0OoooO OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21838OooO00o = "rn_key";

    /* renamed from: OooO00o  reason: collision with other field name */
    public SharedPreferences f21839OooO00o;

    public static C8686oo0OoooO OooO00o() {
        if (OooO00o == null) {
            synchronized (C8686oo0OoooO.class) {
                if (OooO00o == null) {
                    OooO00o = new C8686oo0OoooO();
                }
            }
        }
        return OooO00o;
    }

    public void OooO00o(Context context) {
        this.f21839OooO00o = context.getSharedPreferences(f21838OooO00o, 0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20299OooO00o(String str, Boolean bool) {
        return this.f21839OooO00o.getBoolean(str, bool.booleanValue());
    }

    public void OooO00o(String str, Boolean bool) {
        SharedPreferences.Editor edit = this.f21839OooO00o.edit();
        edit.putBoolean(str, bool.booleanValue());
        edit.commit();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20298OooO00o(String str, String str2) {
        SharedPreferences.Editor edit = this.f21839OooO00o.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public String OooO00o(String str, String str2) {
        return this.f21839OooO00o.getString(str, str2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20297OooO00o(String str, Long l) {
        SharedPreferences.Editor edit = this.f21839OooO00o.edit();
        edit.putLong(str, l.longValue());
        edit.commit();
    }

    public Long OooO00o(String str, Long l) {
        return Long.valueOf(this.f21839OooO00o.getLong(str, l.longValue()));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20296OooO00o(String str, int i) {
        SharedPreferences.Editor edit = this.f21839OooO00o.edit();
        edit.putInt(str, i);
        edit.commit();
    }

    public int OooO00o(String str, int i) {
        return this.f21839OooO00o.getInt(str, i);
    }
}
