package com.p118pd.sdk;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.alipay.C4840a;
import org.json.alipay.C4841b;

/* renamed from: com.pd.sdk.o0oOo000  reason: case insensitive filesystem */
public final class C7633o0oOo000 {
    public static List<AbstractC7461o0Oo0OOo> OooO00o;

    static {
        ArrayList arrayList = new ArrayList();
        OooO00o = arrayList;
        arrayList.add(new C7464o0Oo0OoO());
        OooO00o.add(new C7723o0ooOOOO());
        OooO00o.add(new C7657o0oOooO0());
        OooO00o.add(new C7654o0oOoo00());
        OooO00o.add(new C7462o0Oo0Oo());
        OooO00o.add(new C7458o0Oo0OO());
        OooO00o.add(new C7459o0Oo0OO0());
        OooO00o.add(new C7640o0oOo0o0());
    }

    public static final <T> T OooO00o(Object obj, Type type) {
        T t;
        for (AbstractC7461o0Oo0OOo o0oo0ooo : OooO00o) {
            if (o0oo0ooo.OooO00o(C7471o0Oo0oOo.OooO00o(type)) && (t = (T) o0oo0ooo.OooO00o(obj, type)) != null) {
                return t;
            }
        }
        return null;
    }

    public static final Object OooO00o(String str, Type type) {
        Object bVar;
        if (str == null || str.length() == 0) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("[") && trim.endsWith("]")) {
            bVar = new C4840a(trim);
        } else if (!trim.startsWith("{") || !trim.endsWith(C7522o0Ooo0o.OooO0Oo)) {
            return OooO00o((Object) trim, type);
        } else {
            bVar = new C4841b(trim);
        }
        return OooO00o(bVar, type);
    }
}
