package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.utils.C3745b;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.q */
public class C3689q extends AbstractC3672a {

    /* renamed from: a */
    public static final String f9669a = "umtt0";

    /* renamed from: b */
    public Context f9670b;

    public C3689q(Context context) {
        super(f9669a);
        this.f9670b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3672a
    /* renamed from: f */
    public String mo39245f() {
        Class<?> cls;
        try {
            if (!FieldManager.allow(C3745b.f9814D) || (cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent")) == null) {
                return null;
            }
            return (String) cls.getMethod("getUmtt0", Context.class).invoke(cls, this.f9670b);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
