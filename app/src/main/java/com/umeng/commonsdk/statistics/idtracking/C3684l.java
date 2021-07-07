package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.utils.C3745b;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.l */
public class C3684l extends AbstractC3672a {

    /* renamed from: a */
    public static final String f9659a = "umtt5";

    /* renamed from: b */
    public Context f9660b;

    public C3684l(Context context) {
        super(f9659a);
        this.f9660b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3672a
    /* renamed from: f */
    public String mo39245f() {
        Class<?> cls;
        try {
            if (!FieldManager.allow(C3745b.f9814D) || (cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent")) == null) {
                return null;
            }
            return (String) cls.getMethod("getUmtt5", Context.class).invoke(cls, this.f9660b);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
