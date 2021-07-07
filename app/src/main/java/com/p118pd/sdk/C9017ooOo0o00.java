package com.p118pd.sdk;

import com.rxhui.rxbus.Subscribe;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.pd.sdk.ooOo0o00  reason: case insensitive filesystem */
public class C9017ooOo0o00 {
    public static C9018ooOo0o0O OooO00o(Object obj, IIlIIiI1 iIlIIiI1) {
        return OooO00o(obj, new HashSet(), iIlIIiI1);
    }

    public static C9018ooOo0o0O OooO00o(Object obj, Set<C9016ooOo0o> set, IIlIIiI1 iIlIIiI1) {
        Method[] declaredMethods = obj.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (!method.isBridge()) {
                String str = obj.getClass().getName() + Constants.COLON_SEPARATOR + method.getName();
                if (method.isAnnotationPresent(Subscribe.class)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        Class<?> cls = parameterTypes[0];
                        if ((method.getModifiers() & 1) != 0) {
                            Subscribe subscribe = (Subscribe) method.getAnnotation(Subscribe.class);
                            C9016ooOo0o oooo0o = new C9016ooOo0o(method, subscribe.thread(), cls, obj, subscribe.sticky());
                            LlIiLii OooO00o = oooo0o.m20674OooO00o();
                            if (!set.contains(oooo0o) && OooO00o != null) {
                                set.add(oooo0o);
                                iIlIIiI1.OooO00o(OooO00o);
                            }
                        } else {
                            throw new IllegalArgumentException("Method " + method + " has @Subscribe annotation on " + cls + " but is not 'public'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Method " + method + " has @Subscribe annotation but requires " + parameterTypes.length + " arguments.  Methods must require a single argument.");
                    }
                } else {
                    continue;
                }
            }
        }
        return new C9018ooOo0o0O(iIlIIiI1, obj, set);
    }
}
