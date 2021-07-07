package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.utils.C3745b;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.o */
public class C3687o extends AbstractC3672a {

    /* renamed from: a */
    public static final String f9665a = "umtt3";

    /* renamed from: b */
    public Context f9666b;

    public C3687o(Context context) {
        super(f9665a);
        this.f9666b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3672a
    /* renamed from: f */
    public String mo39245f() {
        Class<?> cls;
        try {
            if (!FieldManager.allow(C3745b.f9814D) || (cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent")) == null) {
                return null;
            }
            return (String) cls.getMethod("getUmtt3", Context.class).invoke(cls, this.f9666b);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
