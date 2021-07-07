package com.vivo.push.util;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.vivo.push.util.x */
public final class C4154x implements AbstractC4133c {

    /* renamed from: a */
    public static String f11134a = "SpCache";

    /* renamed from: b */
    public static String f11135b = "com.vivo.push.cache";

    /* renamed from: c */
    public SharedPreferences f11136c;

    @Override // com.vivo.push.util.AbstractC4133c
    /* renamed from: a */
    public final boolean mo41188a(Context context) {
        if (this.f11136c != null) {
            return true;
        }
        this.f11136c = context.getSharedPreferences(f11135b, 0);
        return true;
    }

    @Override // com.vivo.push.util.AbstractC4133c
    /* renamed from: b */
    public final void mo41189b(String str, String str2) {
        SharedPreferences.Editor edit = this.f11136c.edit();
        if (edit != null) {
            edit.putString(str, str2);
            C4131a.m11150a(edit);
            String str3 = f11134a;
            C4146p.m11216d(str3, "putString by " + str);
            return;
        }
        String str4 = f11134a;
        C4146p.m11211b(str4, "putString error by " + str);
    }

    @Override // com.vivo.push.util.AbstractC4133c
    /* renamed from: a */
    public final String mo41187a(String str, String str2) {
        String string = this.f11136c.getString(str, str2);
        String str3 = f11134a;
        C4146p.m11216d(str3, "getString " + str + " is " + string);
        return string;
    }

    /* renamed from: a */
    public final void mo41206a() {
        SharedPreferences.Editor edit = this.f11136c.edit();
        if (edit != null) {
            edit.clear();
            C4131a.m11150a(edit);
        }
        C4146p.m11216d(f11134a, "system cache is cleared");
    }
}
