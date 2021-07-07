package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.C3745b;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.r */
public class C3690r extends AbstractC3672a {

    /* renamed from: a */
    public static final String f9671a = "uopdta";

    /* renamed from: b */
    public static final String f9672b = "uop";

    /* renamed from: c */
    public Context f9673c;

    public C3690r(Context context) {
        super(f9672b);
        this.f9673c = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3672a
    /* renamed from: f */
    public String mo39245f() {
        SharedPreferences sharedPreferences;
        if (!FieldManager.allow(C3745b.f9811A) || (sharedPreferences = PreferenceWrapper.getDefault(this.f9673c)) == null) {
            return "";
        }
        return sharedPreferences.getString(f9671a, "");
    }
}
