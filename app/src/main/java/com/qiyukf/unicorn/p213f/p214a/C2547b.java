package com.qiyukf.unicorn.p213f.p214a;

import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.f.a.b */
public final class C2547b {
    /* renamed from: a */
    public static Object m5677a(JSONArray jSONArray, int i, Class<?> cls) {
        if (AbstractC2498a.class.isAssignableFrom(cls)) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                return null;
            }
            try {
                AbstractC2498a aVar = (AbstractC2498a) cls.newInstance();
                m5680a(aVar, optJSONObject);
                return aVar;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else if (cls == String.class) {
            return jSONArray.optString(i);
        } else {
            if (cls == Integer.class) {
                return Integer.valueOf(jSONArray.optInt(i));
            }
            if (cls == Long.class) {
                return Long.valueOf(jSONArray.optLong(i));
            }
            if (cls == Float.class) {
                return Float.valueOf((float) jSONArray.optDouble(i));
            }
            if (cls == Double.class) {
                return Double.valueOf(jSONArray.optDouble(i));
            }
            if (cls == Boolean.class) {
                return Boolean.valueOf(jSONArray.optBoolean(i));
            }
            if (cls == JSONObject.class) {
                return jSONArray.optJSONObject(i);
            }
            if (cls == JSONArray.class) {
                return jSONArray.optJSONArray(i);
            }
            if (cls == Object.class) {
                return jSONArray.opt(i);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static Type m5678a(Type type) {
        Type[] actualTypeArguments;
        if (!(type instanceof ParameterizedType) || (actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments()) == null || actualTypeArguments.length <= 0) {
            return null;
        }
        return actualTypeArguments[0];
    }

    /* renamed from: a */
    public static List<Object> m5679a(JSONArray jSONArray, Type type) {
        ArrayList arrayList = new ArrayList();
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            int i = 0;
            if (type instanceof Class) {
                while (i < jSONArray.length()) {
                    arrayList.add(m5677a(jSONArray, i, (Class) type));
                    i++;
                }
            } else if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if ((parameterizedType.getRawType() instanceof Class) && List.class.isAssignableFrom((Class) parameterizedType.getRawType())) {
                    while (i < jSONArray.length()) {
                        arrayList.add(m5679a(jSONArray == null ? null : jSONArray.optJSONArray(i), m5678a(parameterizedType)));
                        i++;
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m5680a(Object obj, JSONObject jSONObject) {
        Object a;
        if (jSONObject != null) {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            for (Field field : declaredFields) {
                AbstractC2548a aVar = (AbstractC2548a) field.getAnnotation(AbstractC2548a.class);
                if (aVar != null) {
                    try {
                        Class<?> type = field.getType();
                        String a2 = aVar.mo35940a();
                        field.setAccessible(true);
                        if (type == String.class) {
                            a = C1810b.m3432e(jSONObject, a2);
                        } else {
                            if (type != Integer.TYPE) {
                                if (type != Integer.class) {
                                    if (type != Long.TYPE) {
                                        if (type != Long.class) {
                                            if (type != Float.TYPE) {
                                                if (type != Float.class) {
                                                    if (type != Double.TYPE) {
                                                        if (type != Double.class) {
                                                            if (type != Boolean.TYPE) {
                                                                if (type != Boolean.class) {
                                                                    if (type == JSONObject.class) {
                                                                        a = C1810b.m3433f(jSONObject, a2);
                                                                    } else if (type == JSONArray.class) {
                                                                        a = C1810b.m3434g(jSONObject, a2);
                                                                    } else if (type == Object.class) {
                                                                        a = jSONObject == null ? null : jSONObject.opt(a2);
                                                                    } else if (AbstractC2498a.class.isAssignableFrom(type)) {
                                                                        JSONObject f = C1810b.m3433f(jSONObject, a2);
                                                                        if (f != null) {
                                                                            AbstractC2498a aVar2 = (AbstractC2498a) type.newInstance();
                                                                            m5680a(aVar2, f);
                                                                            field.set(obj, aVar2);
                                                                        }
                                                                    } else if (List.class.isAssignableFrom(type)) {
                                                                        a = m5679a(C1810b.m3434g(jSONObject, a2), m5678a(field.getGenericType()));
                                                                    }
                                                                }
                                                            }
                                                            field.setBoolean(obj, Boolean.valueOf(C1810b.m3432e(jSONObject, a2)).booleanValue());
                                                        }
                                                    }
                                                    field.setDouble(obj, C1810b.m3431d(jSONObject, a2));
                                                }
                                            }
                                            field.setFloat(obj, (float) C1810b.m3431d(jSONObject, a2));
                                        }
                                    }
                                    field.setLong(obj, C1810b.m3430c(jSONObject, a2));
                                }
                            }
                            field.setInt(obj, C1810b.m3427b(jSONObject, a2));
                        }
                        field.set(obj, a);
                    } catch (Exception e) {
                        C1709a.m3011a("attachparser", "is exception" + e);
                    }
                }
            }
        }
    }
}
