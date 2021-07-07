package com.huawei.updatesdk.sdk.service.p075b;

import android.content.Intent;
import android.os.Bundle;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;

/* renamed from: com.huawei.updatesdk.sdk.service.b.b */
public final class C1296b {

    /* renamed from: a */
    public Intent f1461a;

    public C1296b(Intent intent) {
        this.f1461a = intent;
    }

    /* renamed from: a */
    public static C1296b m1655a(Intent intent) {
        return new C1296b(intent);
    }

    /* renamed from: a */
    public int mo15904a(String str, int i) {
        if (mo15911d()) {
            try {
                return this.f1461a.getIntExtra(str, i);
            } catch (Exception unused) {
            }
        }
        return i;
    }

    /* renamed from: a */
    public Bundle mo15905a() {
        if (mo15911d()) {
            return this.f1461a.getExtras();
        }
        return null;
    }

    /* renamed from: a */
    public Bundle mo15906a(String str) {
        if (!mo15911d()) {
            return null;
        }
        try {
            return this.f1461a.getBundleExtra(str);
        } catch (Exception unused) {
            C1278a.m1584d("SecureIntent", "getBundleExtra exception!");
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo15907a(String str, boolean z) {
        if (mo15911d()) {
            try {
                return this.f1461a.getBooleanExtra(str, z);
            } catch (Exception unused) {
            }
        }
        return z;
    }

    /* renamed from: b */
    public String mo15908b() {
        String action;
        return (!mo15911d() || (action = this.f1461a.getAction()) == null) ? "" : action;
    }

    /* renamed from: b */
    public String mo15909b(String str) {
        if (!mo15911d()) {
            return "";
        }
        try {
            return this.f1461a.getStringExtra(str);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    public Intent mo15910c() {
        return this.f1461a;
    }

    /* renamed from: d */
    public boolean mo15911d() {
        return this.f1461a != null;
    }
}
