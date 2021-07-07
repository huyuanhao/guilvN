package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.utils.C3745b;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.m */
public class C3685m extends AbstractC3672a {

    /* renamed from: a */
    public static final String f9661a = "umtt4";

    /* renamed from: b */
    public Context f9662b;

    public C3685m(Context context) {
        super(f9661a);
        this.f9662b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3672a
    /* renamed from: f */
    public String mo39245f() {
        Class<?> cls;
        try {
            if (!FieldManager.allow(C3745b.f9814D) || (cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent")) == null) {
                return null;
            }
            return (String) cls.getMethod("getUmtt4", Context.class).invoke(cls, this.f9662b);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
