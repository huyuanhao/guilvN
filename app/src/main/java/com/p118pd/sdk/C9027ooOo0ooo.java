package com.p118pd.sdk;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.ooOo0ooo  reason: case insensitive filesystem */
public class C9027ooOo0ooo {
    public final byte OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List f22345OooO00o = new ArrayList();
    public final byte OooO0O0;
    public final byte OooO0OO;

    /* renamed from: com.pd.sdk.ooOo0ooo$OooO00o */
    public static class OooO00o {
        public final Object OooO00o;

        public OooO00o(Object obj) {
            this.OooO00o = obj;
        }

        public boolean equals(Object obj) {
            return (obj instanceof OooO00o) && ((OooO00o) obj).OooO00o == this.OooO00o;
        }

        public int hashCode() {
            return this.OooO00o.hashCode();
        }
    }

    public C9027ooOo0ooo(byte b, byte b2, byte b3) {
        this.OooO00o = b;
        this.OooO0O0 = b2;
        this.OooO0OO = b3;
    }

    public static int OooO00o(byte b) {
        return 1;
    }

    public static int OooO00o(char c) {
        return 2;
    }

    public static int OooO00o(double d) {
        return 8;
    }

    public static int OooO00o(float f) {
        return 4;
    }

    public static int OooO00o(long j) {
        return 8;
    }

    public static int OooO00o(short s) {
        return 2;
    }

    public static int OooO00o(boolean z) {
        return 1;
    }

    public static C9027ooOo0ooo OooO00o() {
        return null;
    }

    public static int OooO0O0(byte b) {
        return 1;
    }

    public static int OooO0O0(char c) {
        return 2;
    }

    public static int OooO0O0(double d) {
        return 8;
    }

    public static int OooO0O0(float f) {
        return 4;
    }

    public static int OooO0O0(int i) {
        return 4;
    }

    public static int OooO0O0(long j) {
        return 8;
    }

    public static int OooO0O0(short s) {
        return 2;
    }

    public static int OooO0O0(boolean z) {
        return 1;
    }

    public static C9027ooOo0ooo OooO0O0() {
        return new C9027ooOo0ooo((byte) 4, (byte) 8, (byte) 8);
    }

    public static int OooO0OO(int i) {
        return 4;
    }

    public static C9027ooOo0ooo OooO0OO() {
        return new C9027ooOo0ooo((byte) 4, (byte) 8, (byte) 4);
    }

    public static C9027ooOo0ooo OooO0Oo() {
        return new C9027ooOo0ooo((byte) 8, (byte) 16, (byte) 8);
    }

    public int OooO00o(Object obj) {
        this.f22345OooO00o.clear();
        return OooO0Oo(obj);
    }

    public static int OooO0OO(Object obj) {
        Class<?> cls = obj.getClass();
        if (cls == boolean[].class) {
            return ((boolean[]) obj).length;
        }
        if (cls == byte[].class) {
            return ((byte[]) obj).length;
        }
        if (cls == char[].class) {
            return ((char[]) obj).length;
        }
        if (cls == short[].class) {
            return ((short[]) obj).length;
        }
        if (cls == int[].class) {
            return ((int[]) obj).length;
        }
        if (cls == float[].class) {
            return ((float[]) obj).length;
        }
        return cls == long[].class ? ((long[]) obj).length : ((double[]) obj).length;
    }

    private int OooO0Oo(Object obj) {
        int i;
        if (obj == null) {
            return 0;
        }
        OooO00o oooO00o = new OooO00o(obj);
        if (this.f22345OooO00o.contains(oooO00o)) {
            return 0;
        }
        this.f22345OooO00o.add(oooO00o);
        byte b = 0;
        int i2 = 0;
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            if (cls.isArray()) {
                int i3 = b + this.OooO0OO;
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive()) {
                    return OooO00o(this.OooO0O0, i3 + (OooO0OO(obj) * OooO00o((Class) componentType)), 0);
                }
                Object[] objArr = (Object[]) obj;
                int length = i3 + (this.OooO00o * objArr.length);
                for (Object obj2 : objArr) {
                    i2 += OooO0Oo(obj2);
                }
                return OooO00o(this.OooO0O0, length, i2);
            }
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (!Modifier.isStatic(field.getModifiers()) && cls == field.getDeclaringClass()) {
                    Class<?> type = field.getType();
                    if (type.isPrimitive()) {
                        b += OooO00o((Class) type);
                    } else {
                        b += this.OooO00o;
                        try {
                            field.setAccessible(true);
                            i = OooO0Oo(field.get(obj));
                        } catch (Exception unused) {
                            i = OooO00o(obj, field);
                        }
                        i2 += i;
                    }
                }
            }
        }
        return OooO00o(this.OooO0O0, b, i2);
    }

    public int OooO0O0(Object obj) {
        int OooO0O02;
        int i = 0;
        if (obj == null) {
            return 0;
        }
        byte b = this.OooO0O0;
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            int i2 = b + this.OooO0OO;
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive()) {
                return i2 + (OooO0OO(obj) * OooO00o((Class) componentType));
            }
            Object[] objArr = (Object[]) obj;
            int length = i2 + (objArr.length * 4);
            int length2 = objArr.length;
            while (i < length2) {
                length += OooO0O0(objArr[i]);
                i++;
            }
            return length;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        int length3 = declaredFields.length;
        while (i < length3) {
            Field field = declaredFields[i];
            if (!Modifier.isStatic(field.getModifiers())) {
                Class<?> type = field.getType();
                if (type.isPrimitive()) {
                    OooO0O02 = OooO00o((Class) type);
                } else {
                    b += 4;
                    try {
                        field.setAccessible(true);
                        OooO0O02 = OooO0O0(field.get(obj));
                    } catch (Exception unused) {
                        OooO0O02 = OooO0O0(obj, field);
                    }
                }
                b += OooO0O02;
            }
            i++;
        }
        return b;
    }

    public static int OooO00o(Object obj, Field field) {
        throw new UnsupportedOperationException("field type Constructor not accessible: " + obj.getClass() + " field:" + field);
    }

    public static int OooO00o(int i) {
        return ((i + 7) / 8) * 8;
    }

    public static int OooO00o(int i, int i2, int i3) {
        return OooO00o(i) + OooO00o(i2) + i3;
    }

    public static int OooO00o(Class cls) {
        if (cls == Boolean.TYPE || cls == Byte.TYPE) {
            return 1;
        }
        if (cls == Character.TYPE || cls == Short.TYPE) {
            return 2;
        }
        return (cls == Integer.TYPE || cls == Float.TYPE) ? 4 : 8;
    }

    public static int OooO0O0(Object obj, Field field) {
        throw new UnsupportedOperationException("field type Constructor not accessible: " + obj.getClass() + " field:" + field);
    }
}
