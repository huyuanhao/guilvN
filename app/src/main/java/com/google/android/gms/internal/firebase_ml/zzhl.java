package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzhl {
    public static final Map<Field, zzhl> zzyk = new WeakHashMap();
    public final String name;
    public final boolean zzzp;
    public final Field zzzq;

    public zzhl(Field field, String str) {
        String str2;
        this.zzzq = field;
        if (str == null) {
            str2 = null;
        } else {
            str2 = str.intern();
        }
        this.name = str2;
        this.zzzp = zzhf.zza(this.zzzq.getType());
    }

    public static zzhl zza(Enum<?> r5) {
        try {
            zzhl zza = zza(r5.getClass().getField(r5.name()));
            Object[] objArr = {r5};
            if (zza != null) {
                return zza;
            }
            throw new IllegalArgumentException(zzla.zzb("enum constant missing @Value or @NullValue annotation: %s", objArr));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public final Type getGenericType() {
        return this.zzzq.getGenericType();
    }

    public final String getName() {
        return this.name;
    }

    public final boolean isPrimitive() {
        return this.zzzp;
    }

    public final void zzb(Object obj, Object obj2) {
        zza(this.zzzq, obj, obj2);
    }

    public final Object zzh(Object obj) {
        return zza(this.zzzq, obj);
    }

    public final Field zzhf() {
        return this.zzzq;
    }

    public final boolean zzhg() {
        return Modifier.isFinal(this.zzzq.getModifiers());
    }

    public final <T extends Enum<T>> T zzhh() {
        return (T) Enum.valueOf(this.zzzq.getDeclaringClass(), this.zzzq.getName());
    }

    public static zzhl zza(Field field) {
        String str = null;
        if (field == null) {
            return null;
        }
        synchronized (zzyk) {
            zzhl zzhl = zzyk.get(field);
            boolean isEnumConstant = field.isEnumConstant();
            if (zzhl == null && (isEnumConstant || !Modifier.isStatic(field.getModifiers()))) {
                if (isEnumConstant) {
                    zzid zzid = (zzid) field.getAnnotation(zzid.class);
                    if (zzid != null) {
                        str = zzid.value();
                    } else if (((zzht) field.getAnnotation(zzht.class)) == null) {
                        return null;
                    }
                } else {
                    zzho zzho = (zzho) field.getAnnotation(zzho.class);
                    if (zzho == null) {
                        return null;
                    }
                    str = zzho.value();
                    field.setAccessible(true);
                }
                if ("##default".equals(str)) {
                    str = field.getName();
                }
                zzhl = new zzhl(field, str);
                zzyk.put(field, zzhl);
            }
            return zzhl;
        }
    }

    public static Object zza(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void zza(Field field, Object obj, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            Object zza = zza(field, obj);
            if (obj2 == null) {
                if (zza == null) {
                    return;
                }
            } else if (obj2.equals(zza)) {
                return;
            }
            String valueOf = String.valueOf(zza);
            String valueOf2 = String.valueOf(obj2);
            String name2 = field.getName();
            String name3 = obj.getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48 + String.valueOf(valueOf2).length() + String.valueOf(name2).length() + String.valueOf(name3).length());
            sb.append("expected final value <");
            sb.append(valueOf);
            sb.append("> but was <");
            sb.append(valueOf2);
            sb.append("> on ");
            sb.append(name2);
            sb.append(" field in ");
            sb.append(name3);
            throw new IllegalArgumentException(sb.toString());
        }
        try {
            field.set(obj, obj2);
        } catch (SecurityException e) {
            throw new IllegalArgumentException(e);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
