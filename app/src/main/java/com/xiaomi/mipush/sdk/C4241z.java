package com.xiaomi.mipush.sdk;

import android.text.TextUtils;

/* renamed from: com.xiaomi.mipush.sdk.z */
public class C4241z {

    /* renamed from: a */
    public int f11335a = 0;

    /* renamed from: a */
    public String f11336a = "";

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C4241z)) {
            return false;
        }
        C4241z zVar = (C4241z) obj;
        return !TextUtils.isEmpty(zVar.f11336a) && zVar.f11336a.equals(this.f11336a);
    }
}
