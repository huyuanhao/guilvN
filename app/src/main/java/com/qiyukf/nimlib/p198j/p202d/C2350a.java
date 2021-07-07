package com.qiyukf.nimlib.p198j.p202d;

import android.text.TextUtils;
import com.qiyukf.basesdk.p119a.C1709a;
import java.lang.reflect.Method;

/* renamed from: com.qiyukf.nimlib.j.d.a */
public final class C2350a {
    /* renamed from: a */
    public static Object m5134a(Object obj, String str) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            try {
                Method method = obj.getClass().getMethod(str, null);
                method.setAccessible(true);
                return method.invoke(obj, null);
            } catch (NoSuchMethodException unused) {
                C1709a.m3011a("reflect", "method " + str + " not found in " + obj.getClass().getName());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }
}
