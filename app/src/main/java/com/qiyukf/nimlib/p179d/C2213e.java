package com.qiyukf.nimlib.p179d;

import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.p118pd.sdk.C8932ooOOO0o;
import com.qiyukf.nimlib.p179d.C2218i;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.qiyukf.nimlib.d.e */
public final class C2213e implements InvocationHandler {

    /* renamed from: com.qiyukf.nimlib.d.e$a */
    public static class C2214a {

        /* renamed from: a */
        public static final Map<Class, Object> f4412a;

        static {
            HashMap hashMap = new HashMap(7);
            f4412a = hashMap;
            hashMap.put(Integer.TYPE, 0);
            f4412a.put(Long.TYPE, 0L);
            f4412a.put(Boolean.TYPE, false);
            f4412a.put(Byte.TYPE, (byte) 0);
            f4412a.put(Float.TYPE, Float.valueOf(0.0f));
            f4412a.put(Double.TYPE, Double.valueOf((double) AbstractC8352oOoOOoO0.OooO0O0));
            f4412a.put(Character.TYPE, (char) 0);
        }

        /* renamed from: a */
        public static /* synthetic */ Object m4607a(Class cls, Object obj) {
            return (obj != null || !f4412a.containsKey(cls)) ? obj : f4412a.get(cls);
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean z = true;
        boolean z2 = !method.getReturnType().equals(Void.TYPE) && !method.getReturnType().equals(Void.class);
        if (!z2 || method.getReturnType().isAssignableFrom(C2225k.class)) {
            z = false;
        }
        C2218i iVar = new C2218i();
        C2218i a = iVar.mo34828a(objArr);
        String simpleName = method.getDeclaringClass().getSimpleName();
        C2218i.C2220b bVar = a.f4416a;
        bVar.f4422a = simpleName + C8932ooOOO0o.OooO0OO + method.getName();
        a.mo34831b(z2).mo34827a(z);
        Object a2 = C2206a.m4588a(iVar);
        return z ? C2214a.m4607a(method.getReturnType(), a2) : a2;
    }
}
