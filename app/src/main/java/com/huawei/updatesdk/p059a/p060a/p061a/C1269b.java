package com.huawei.updatesdk.p059a.p060a.p061a;

import android.text.TextUtils;
import com.huawei.updatesdk.p059a.p060a.C1270b;
import com.huawei.updatesdk.service.p078a.C1325a;

/* renamed from: com.huawei.updatesdk.a.a.a.b */
public class C1269b extends C1270b {
    public static final int SUCCESS = 0;
    public String sign_;

    public C1269b() {
        mo15928b(1);
    }

    /* renamed from: a */
    public String mo15864a() {
        return this.sign_;
    }

    /* renamed from: b */
    public void mo15865b() {
        if (!TextUtils.isEmpty(mo15864a())) {
            C1325a a = C1325a.m1873a();
            String d = a.mo16068d();
            if (d == null || !d.equals(mo15864a())) {
                a.mo16065b(mo15864a());
            }
        }
    }
}
