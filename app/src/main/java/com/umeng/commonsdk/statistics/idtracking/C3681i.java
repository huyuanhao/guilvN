package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.i */
public class C3681i extends AbstractC3672a {

    /* renamed from: a */
    public static final String f9649a = "umeng_sp_oaid";

    /* renamed from: b */
    public static final String f9650b = "key_umeng_sp_oaid";

    /* renamed from: c */
    public static final String f9651c = "key_umeng_sp_oaid_required_time";

    /* renamed from: d */
    public static final String f9652d = "oaid";

    /* renamed from: e */
    public Context f9653e;

    public C3681i(Context context) {
        super(f9652d);
        this.f9653e = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3672a
    /* renamed from: f */
    public String mo39245f() {
        try {
            SharedPreferences sharedPreferences = this.f9653e.getSharedPreferences(f9649a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString(f9650b, "");
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
