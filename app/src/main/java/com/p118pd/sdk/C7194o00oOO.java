package com.p118pd.sdk;

import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.o00oOO  reason: case insensitive filesystem */
public class C7194o00oOO {
    public static final int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static C7194o00oOO f19685OooO00o = new C7194o00oOO();
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 2;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map<Class, OooO00o> f19686OooO00o = new HashMap();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final Map<Class, Boolean> f19687OooO0O0 = new HashMap();

    /* renamed from: com.pd.sdk.o00oOO$OooO0O0 */
    public static class OooO0O0 {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Method f19688OooO00o;

        public OooO0O0(int i, Method method) {
            this.OooO00o = i;
            this.f19688OooO00o = method;
            method.setAccessible(true);
        }

        public void OooO00o(AbstractC7202o00oOo00 o00ooo00, Lifecycle.Event event, Object obj) {
            try {
                int i = this.OooO00o;
                if (i == 0) {
                    this.f19688OooO00o.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f19688OooO00o.invoke(obj, o00ooo00);
                } else if (i == 2) {
                    this.f19688OooO00o.invoke(obj, o00ooo00, event);
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO0O0.class != obj.getClass()) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            if (this.OooO00o != oooO0O0.OooO00o || !this.f19688OooO00o.getName().equals(oooO0O0.f19688OooO00o.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.OooO00o * 31) + this.f19688OooO00o.getName().hashCode();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18686OooO00o(Class cls) {
        if (this.f19687OooO0O0.containsKey(cls)) {
            return this.f19687OooO0O0.get(cls).booleanValue();
        }
        Method[] OooO00o2 = OooO00o(cls);
        for (Method method : OooO00o2) {
            if (((OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class)) != null) {
                OooO00o(cls, OooO00o2);
                return true;
            }
        }
        this.f19687OooO0O0.put(cls, false);
        return false;
    }

    /* renamed from: com.pd.sdk.o00oOO$OooO00o */
    public static class OooO00o {
        public final Map<Lifecycle.Event, List<OooO0O0>> OooO00o = new HashMap();
        public final Map<OooO0O0, Lifecycle.Event> OooO0O0;

        public OooO00o(Map<OooO0O0, Lifecycle.Event> map) {
            this.OooO0O0 = map;
            for (Map.Entry<OooO0O0, Lifecycle.Event> entry : map.entrySet()) {
                Lifecycle.Event value = entry.getValue();
                List<OooO0O0> list = this.OooO00o.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.OooO00o.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        public void OooO00o(AbstractC7202o00oOo00 o00ooo00, Lifecycle.Event event, Object obj) {
            OooO00o(this.OooO00o.get(event), o00ooo00, event, obj);
            OooO00o(this.OooO00o.get(Lifecycle.Event.ON_ANY), o00ooo00, event, obj);
        }

        public static void OooO00o(List<OooO0O0> list, AbstractC7202o00oOo00 o00ooo00, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).OooO00o(o00ooo00, event, obj);
                }
            }
        }
    }

    private Method[] OooO00o(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public OooO00o m18685OooO00o(Class cls) {
        OooO00o oooO00o = this.f19686OooO00o.get(cls);
        if (oooO00o != null) {
            return oooO00o;
        }
        return OooO00o(cls, null);
    }

    private void OooO00o(Map<OooO0O0, Lifecycle.Event> map, OooO0O0 oooO0O0, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = map.get(oooO0O0);
        if (event2 != null && event != event2) {
            Method method = oooO0O0.f19688OooO00o;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous" + " value " + event2 + ", new value " + event);
        } else if (event2 == null) {
            map.put(oooO0O0, event);
        }
    }

    private OooO00o OooO00o(Class cls, @Nullable Method[] methodArr) {
        int i;
        OooO00o OooO00o2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (OooO00o2 = m18685OooO00o(superclass)) == null)) {
            hashMap.putAll(OooO00o2.OooO0O0);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<OooO0O0, Lifecycle.Event> entry : m18685OooO00o((Class) cls2).OooO0O0.entrySet()) {
                OooO00o(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = OooO00o(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(AbstractC7202o00oOo00.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                Lifecycle.Event value = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(Lifecycle.Event.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == Lifecycle.Event.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    OooO00o(hashMap, new OooO0O0(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        OooO00o oooO00o = new OooO00o(hashMap);
        this.f19686OooO00o.put(cls, oooO00o);
        this.f19687OooO0O0.put(cls, Boolean.valueOf(z));
        return oooO00o;
    }
}
