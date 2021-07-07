package com.p118pd.sdk;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.alipay.C4841b;

/* renamed from: com.pd.sdk.o0oOoo00  reason: case insensitive filesystem */
public final class C7654o0oOoo00 implements AbstractC7461o0Oo0OOo, AbstractC7463o0Oo0Oo0 {
    public static Map<Object, Object> OooO00o(Type type) {
        while (type != Properties.class) {
            if (type == Hashtable.class) {
                return new Hashtable();
            }
            if (type == IdentityHashMap.class) {
                return new IdentityHashMap();
            }
            if (type == SortedMap.class || type == TreeMap.class) {
                return new TreeMap();
            }
            if (type == ConcurrentMap.class || type == ConcurrentHashMap.class) {
                return new ConcurrentHashMap();
            }
            if (type == Map.class || type == HashMap.class) {
                return new HashMap();
            }
            if (type == LinkedHashMap.class) {
                return new LinkedHashMap();
            }
            if (type instanceof ParameterizedType) {
                type = ((ParameterizedType) type).getRawType();
            } else {
                Class cls = (Class) type;
                if (!cls.isInterface()) {
                    try {
                        return (Map) cls.newInstance();
                    } catch (Exception e) {
                        throw new IllegalArgumentException("unsupport type " + type, e);
                    }
                } else {
                    throw new IllegalArgumentException("unsupport type " + type);
                }
            }
        }
        return new Properties();
    }

    @Override // com.p118pd.sdk.AbstractC7463o0Oo0Oo0
    public final Object OooO00o(Object obj) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (entry.getKey() instanceof String) {
                treeMap.put((String) entry.getKey(), C7460o0Oo0OOO.OooO00o(entry.getValue()));
            } else {
                throw new IllegalArgumentException("Map key must be String!");
            }
        }
        return treeMap;
    }

    @Override // com.p118pd.sdk.AbstractC7461o0Oo0OOo
    public final Object OooO00o(Object obj, Type type) {
        if (!obj.getClass().equals(C4841b.class)) {
            return null;
        }
        C4841b bVar = (C4841b) obj;
        Map<Object, Object> OooO00o = OooO00o(type);
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            Type type3 = parameterizedType.getActualTypeArguments()[1];
            if (String.class == type2) {
                Iterator a = bVar.mo45546a();
                while (a.hasNext()) {
                    String str = (String) a.next();
                    OooO00o.put(str, C7471o0Oo0oOo.OooO00o((Class) type3) ? bVar.mo45545a(str) : C7633o0oOo000.OooO00o(bVar.mo45545a(str), type3));
                }
                return OooO00o;
            }
            throw new IllegalArgumentException("Deserialize Map Key must be String.class");
        }
        throw new IllegalArgumentException("Deserialize Map must be Generics!");
    }

    @Override // com.p118pd.sdk.AbstractC7463o0Oo0Oo0, com.p118pd.sdk.AbstractC7461o0Oo0OOo
    public final boolean OooO00o(Class<?> cls) {
        return Map.class.isAssignableFrom(cls);
    }
}
