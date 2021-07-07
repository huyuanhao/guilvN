package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.statistics.common.C3660a;
import com.umeng.commonsdk.utils.C3745b;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.c */
public class C3674c extends AbstractC3672a {

    /* renamed from: a */
    public static final String f9627a = "idfa";

    /* renamed from: b */
    public Context f9628b;

    public C3674c(Context context) {
        super(f9627a);
        this.f9628b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3672a
    /* renamed from: f */
    public String mo39245f() {
        String a = FieldManager.allow(C3745b.f9866w) ? C3660a.m9847a(this.f9628b) : null;
        return a == null ? "" : a;
    }
}
