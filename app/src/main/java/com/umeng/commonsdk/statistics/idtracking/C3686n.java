package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.utils.C3745b;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.n */
public class C3686n extends AbstractC3672a {

    /* renamed from: a */
    public static final String f9663a = "umtt1";

    /* renamed from: b */
    public Context f9664b;

    public C3686n(Context context) {
        super(f9663a);
        this.f9664b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3672a
    /* renamed from: f */
    public String mo39245f() {
        Class<?> cls;
        try {
            if (!FieldManager.allow(C3745b.f9814D) || (cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent")) == null) {
                return null;
            }
            return (String) cls.getMethod("getUmtt1", Context.class).invoke(cls, this.f9664b);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
