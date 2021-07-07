package com.vivo.push.util;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;

/* renamed from: com.vivo.push.util.v */
public final class C4152v implements AbstractC4133c {

    /* renamed from: a */
    public ContentResolver f11132a;

    @Override // com.vivo.push.util.AbstractC4133c
    /* renamed from: a */
    public final boolean mo41188a(Context context) {
        if (!C4141k.m11174b()) {
            return false;
        }
        this.f11132a = context.getContentResolver();
        return true;
    }

    @Override // com.vivo.push.util.AbstractC4133c
    /* renamed from: b */
    public final void mo41189b(String str, String str2) {
        try {
            Settings.System.putString(this.f11132a, str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            C4146p.m11211b("SettingsCache", "putString error by " + str);
        }
    }

    @Override // com.vivo.push.util.AbstractC4133c
    /* renamed from: a */
    public final String mo41187a(String str, String str2) {
        try {
            return Settings.System.getString(this.f11132a, str);
        } catch (Exception e) {
            e.printStackTrace();
            C4146p.m11211b("SettingsCache", "getString error by " + str);
            return str2;
        }
    }
}
