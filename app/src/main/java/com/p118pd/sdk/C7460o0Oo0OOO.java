package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.alipay.C4840a;
import org.json.alipay.C4841b;

/* renamed from: com.pd.sdk.o0Oo0OOO  reason: case insensitive filesystem */
public final class C7460o0Oo0OOO {
    public static List<AbstractC7463o0Oo0Oo0> OooO00o;

    static {
        ArrayList arrayList = new ArrayList();
        OooO00o = arrayList;
        arrayList.add(new C7464o0Oo0OoO());
        OooO00o.add(new C7723o0ooOOOO());
        OooO00o.add(new C7657o0oOooO0());
        OooO00o.add(new C7654o0oOoo00());
        OooO00o.add(new C7458o0Oo0OO());
        OooO00o.add(new C7459o0Oo0OO0());
        OooO00o.add(new C7640o0oOo0o0());
    }

    public static Object OooO00o(Object obj) {
        Object OooO00o2;
        if (obj == null) {
            return null;
        }
        for (AbstractC7463o0Oo0Oo0 o0oo0oo0 : OooO00o) {
            if (o0oo0oo0.OooO00o(obj.getClass()) && (OooO00o2 = o0oo0oo0.OooO00o(obj)) != null) {
                return OooO00o2;
            }
        }
        throw new IllegalArgumentException("Unsupported Class : " + obj.getClass());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m19090OooO00o(Object obj) {
        if (obj == null) {
            return null;
        }
        Object OooO00o2 = OooO00o(obj);
        if (C7471o0Oo0oOo.OooO00o(OooO00o2.getClass())) {
            return C4841b.m14311c(OooO00o2.toString());
        }
        if (Collection.class.isAssignableFrom(OooO00o2.getClass())) {
            return new C4840a((Collection) ((List) OooO00o2)).toString();
        }
        if (Map.class.isAssignableFrom(OooO00o2.getClass())) {
            return new C4841b((Map) OooO00o2).toString();
        }
        throw new IllegalArgumentException("Unsupported Class : " + OooO00o2.getClass());
    }
}
