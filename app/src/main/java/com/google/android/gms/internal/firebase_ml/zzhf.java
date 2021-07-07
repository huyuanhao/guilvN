package com.google.android.gms.internal.firebase_ml;

import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public final class zzhf {
    public static final Boolean zzyq = new Boolean(true);
    public static final String zzyr = new String();
    public static final Character zzys = new Character(0);
    public static final Byte zzyt = new Byte((byte) 0);
    public static final Short zzyu = new Short((short) 0);
    public static final Integer zzyv = new Integer(0);
    public static final Float zzyw = new Float(0.0f);
    public static final Long zzyx = new Long(0);
    public static final Double zzyy = new Double((double) AbstractC8352oOoOOoO0.OooO0O0);
    public static final BigInteger zzyz = new BigInteger("0");
    public static final BigDecimal zzza = new BigDecimal("0");
    public static final zzhk zzzb = new zzhk(0);
    public static final ConcurrentHashMap<Class<?>, Object> zzzc;

    static {
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = new ConcurrentHashMap<>();
        zzzc = concurrentHashMap;
        concurrentHashMap.put(Boolean.class, zzyq);
        zzzc.put(String.class, zzyr);
        zzzc.put(Character.class, zzys);
        zzzc.put(Byte.class, zzyt);
        zzzc.put(Short.class, zzyu);
        zzzc.put(Integer.class, zzyv);
        zzzc.put(Float.class, zzyw);
        zzzc.put(Long.class, zzyx);
        zzzc.put(Double.class, zzyy);
        zzzc.put(BigInteger.class, zzyz);
        zzzc.put(BigDecimal.class, zzza);
        zzzc.put(zzhk.class, zzzb);
    }

    public static <T> T clone(T t) {
        T t2;
        if (t == null || zza(t.getClass())) {
            return t;
        }
        if (t instanceof zzhm) {
            return (T) ((zzhm) t.clone());
        }
        Class<?> cls = t.getClass();
        if (cls.isArray()) {
            t2 = (T) Array.newInstance(cls.getComponentType(), Array.getLength(t));
        } else if (t instanceof zzgx) {
            t2 = (T) ((zzgx) t.clone());
        } else if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
            Object[] array = t.toArray();
            zza(array, array);
            return (T) Arrays.asList(array);
        } else {
            t2 = (T) zzia.zzf((Class) cls);
        }
        zza((Object) t, (Object) t2);
        return t2;
    }

    public static boolean isNull(Object obj) {
        return obj != null && obj == zzzc.get(obj.getClass());
    }

    public static void zza(Object obj, Object obj2) {
        Object zzh;
        Class<?> cls = obj.getClass();
        boolean z = true;
        int i = 0;
        zzks.checkArgument(cls == obj2.getClass());
        if (cls.isArray()) {
            if (Array.getLength(obj) != Array.getLength(obj2)) {
                z = false;
            }
            zzks.checkArgument(z);
            for (Object obj3 : zzia.zzi(obj)) {
                Array.set(obj2, i, clone(obj3));
                i++;
            }
        } else if (Collection.class.isAssignableFrom(cls)) {
            Collection<Object> collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            for (Object obj4 : collection) {
                collection2.add(clone(obj4));
            }
        } else {
            boolean isAssignableFrom = zzhm.class.isAssignableFrom(cls);
            if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
                zzhd zzc = isAssignableFrom ? ((zzhm) obj).zztx : zzhd.zzc(cls);
                for (String str : zzc.zzyp) {
                    zzhl zzao = zzc.zzao(str);
                    if (!zzao.zzhg() && ((!isAssignableFrom || !zzao.isPrimitive()) && (zzh = zzao.zzh(obj)) != null)) {
                        zzao.zzb(obj2, clone(zzh));
                    }
                }
            } else if (zzgx.class.isAssignableFrom(cls)) {
                zzgx zzgx = (zzgx) obj2;
                zzgx zzgx2 = (zzgx) obj;
                int size = zzgx2.size();
                while (i < size) {
                    zzgx.set(i, clone(zzgx2.zzaf(i)));
                    i++;
                }
            } else {
                Map map = (Map) obj2;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    map.put((String) entry.getKey(), clone(entry.getValue()));
                }
            }
        }
    }

    public static Collection<Object> zzb(Type type) {
        if (type instanceof WildcardType) {
            type = zzia.zza((WildcardType) type);
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
        }
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || (type instanceof GenericArrayType) || (cls != null && (cls.isArray() || cls.isAssignableFrom(ArrayList.class)))) {
            return new ArrayList();
        }
        if (cls == null) {
            String valueOf = String.valueOf(type);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("unable to create new instance of type: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        } else if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        } else {
            if (cls.isAssignableFrom(TreeSet.class)) {
                return new TreeSet();
            }
            return (Collection) zzia.zzf(cls);
        }
    }

    public static <T> T zzd(Class<?> cls) {
        T t = (T) zzzc.get(cls);
        if (t == null) {
            synchronized (zzzc) {
                t = zzzc.get(cls);
                if (t == null) {
                    int i = 0;
                    if (cls.isArray()) {
                        Class<?> cls2 = cls;
                        do {
                            cls2 = cls2.getComponentType();
                            i++;
                        } while (cls2.isArray());
                        t = (T) Array.newInstance(cls2, new int[i]);
                    } else if (cls.isEnum()) {
                        zzhl zzao = zzhd.zzc(cls).zzao(null);
                        Object[] objArr = {cls};
                        if (zzao != null) {
                            t = (T) zzao.zzhh();
                        } else {
                            throw new NullPointerException(zzla.zzb("enum missing constant with @NullValue annotation: %s", objArr));
                        }
                    } else {
                        t = (T) zzia.zzf((Class) cls);
                    }
                    zzzc.put(cls, t);
                }
            }
        }
        return t;
    }

    public static Map<String, Object> zze(Class<?> cls) {
        if (cls == null || cls.isAssignableFrom(zzgx.class)) {
            return new zzgx();
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new TreeMap();
        }
        return (Map) zzia.zzf((Class) cls);
    }

    public static Map<String, Object> zzf(Object obj) {
        if (obj == null || isNull(obj)) {
            return Collections.emptyMap();
        }
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return new zzhg(obj, false);
    }

    public static boolean zzg(Object obj) {
        return obj == null || zza(obj.getClass());
    }

    public static boolean zza(Type type) {
        if (type instanceof WildcardType) {
            type = zzia.zza((WildcardType) type);
        }
        if (!(type instanceof Class)) {
            return false;
        }
        Class cls = (Class) type;
        if (cls.isPrimitive() || cls == Character.class || cls == String.class || cls == Integer.class || cls == Long.class || cls == Short.class || cls == Byte.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == zzhk.class || cls == Boolean.class) {
            return true;
        }
        return false;
    }

    public static Object zza(Type type, String str) {
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || cls != null) {
            if (cls == Void.class) {
                return null;
            }
            if (str == null || cls == null || cls.isAssignableFrom(String.class)) {
                return str;
            }
            if (cls == Character.class || cls == Character.TYPE) {
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                String valueOf = String.valueOf(cls);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                sb.append("expected type Character/char but got ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } else if (cls == Boolean.class || cls == Boolean.TYPE) {
                return Boolean.valueOf(str);
            } else {
                if (cls == Byte.class || cls == Byte.TYPE) {
                    return Byte.valueOf(str);
                }
                if (cls == Short.class || cls == Short.TYPE) {
                    return Short.valueOf(str);
                }
                if (cls == Integer.class || cls == Integer.TYPE) {
                    return Integer.valueOf(str);
                }
                if (cls == Long.class || cls == Long.TYPE) {
                    return Long.valueOf(str);
                }
                if (cls == Float.class || cls == Float.TYPE) {
                    return Float.valueOf(str);
                }
                if (cls == Double.class || cls == Double.TYPE) {
                    return Double.valueOf(str);
                }
                if (cls == zzhk.class) {
                    return zzhk.zzap(str);
                }
                if (cls == BigInteger.class) {
                    return new BigInteger(str);
                }
                if (cls == BigDecimal.class) {
                    return new BigDecimal(str);
                }
                if (cls.isEnum()) {
                    if (zzhd.zzc(cls).zzyp.contains(str)) {
                        return zzhd.zzc(cls).zzao(str).zzhh();
                    }
                    throw new IllegalArgumentException(String.format("given enum name %s not part of enumeration", str));
                }
            }
        }
        String valueOf2 = String.valueOf(type);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 35);
        sb2.append("expected primitive class, but got: ");
        sb2.append(valueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static Type zza(List<Type> list, Type type) {
        if (type instanceof WildcardType) {
            type = zzia.zza((WildcardType) type);
        }
        while (type instanceof TypeVariable) {
            Type zza = zzia.zza(list, (TypeVariable) type);
            if (zza != null) {
                type = zza;
            }
            if (type instanceof TypeVariable) {
                type = ((TypeVariable) type).getBounds()[0];
            }
        }
        return type;
    }
}
