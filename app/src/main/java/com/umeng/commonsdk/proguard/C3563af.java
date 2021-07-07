package com.umeng.commonsdk.proguard;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.proguard.af */
public class C3563af implements Serializable {

    /* renamed from: d */
    public static Map<Class<? extends AbstractC3628t>, Map<? extends AbstractC3553aa, C3563af>> f9168d = new HashMap();

    /* renamed from: a */
    public final String f9169a;

    /* renamed from: b */
    public final byte f9170b;

    /* renamed from: c */
    public final C3564ag f9171c;

    public C3563af(String str, byte b, C3564ag agVar) {
        this.f9169a = str;
        this.f9170b = b;
        this.f9171c = agVar;
    }

    /* renamed from: a */
    public static void m9266a(Class<? extends AbstractC3628t> cls, Map<? extends AbstractC3553aa, C3563af> map) {
        f9168d.put(cls, map);
    }

    /* renamed from: a */
    public static Map<? extends AbstractC3553aa, C3563af> m9265a(Class<? extends AbstractC3628t> cls) {
        if (!f9168d.containsKey(cls)) {
            try {
                cls.newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException("InstantiationException for TBase class: " + cls.getName() + ", message: " + e.getMessage());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("IllegalAccessException for TBase class: " + cls.getName() + ", message: " + e2.getMessage());
            }
        }
        return f9168d.get(cls);
    }
}
