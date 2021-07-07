package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.utils.C3745b;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.p */
public class C3688p extends AbstractC3672a {

    /* renamed from: a */
    public static final String f9667a = "umtt2";

    /* renamed from: b */
    public Context f9668b;

    public C3688p(Context context) {
        super(f9667a);
        this.f9668b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3672a
    /* renamed from: f */
    public String mo39245f() {
        Class<?> cls;
        try {
            if (!FieldManager.allow(C3745b.f9814D) || (cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent")) == null) {
                return null;
            }
            return (String) cls.getMethod("getUmtt2", Context.class).invoke(cls, this.f9668b);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
