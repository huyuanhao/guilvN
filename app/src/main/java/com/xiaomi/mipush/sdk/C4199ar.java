package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.C4223k;
import com.xiaomi.push.C4278ba;

/* renamed from: com.xiaomi.mipush.sdk.ar */
public class C4199ar {
    /* renamed from: a */
    public static AbstractPushManager m11417a(Context context, EnumC4216d dVar) {
        return m11418b(context, dVar);
    }

    /* renamed from: b */
    public static AbstractPushManager m11418b(Context context, EnumC4216d dVar) {
        C4223k.C4224a a = C4223k.m11572a(dVar);
        if (a == null || TextUtils.isEmpty(a.f11311a) || TextUtils.isEmpty(a.f11312b)) {
            return null;
        }
        return (AbstractPushManager) C4278ba.m11774a(a.f11311a, a.f11312b, context);
    }
}
