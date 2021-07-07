package com.huawei.updatesdk.sdk.p062a.p069d;

import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.huawei.updatesdk.sdk.a.d.d */
public abstract class AbstractC1292d {

    /* renamed from: a */
    public static final String f1455a = "d";

    /* renamed from: a */
    public static Class m1643a(Field field) {
        int i;
        if (Map.class.isAssignableFrom(field.getType())) {
            i = 1;
        } else if (!List.class.isAssignableFrom(field.getType())) {
            return null;
        } else {
            i = 0;
        }
        return m1644a(field, i);
    }

    /* renamed from: a */
    public static Class m1644a(Field field, int i) {
        Type[] actualTypeArguments;
        Type genericType = field.getGenericType();
        if ((genericType instanceof ParameterizedType) && (actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments()) != null && actualTypeArguments.length > i) {
            try {
                if (actualTypeArguments[i] instanceof Class) {
                    return (Class) actualTypeArguments[i];
                }
                String obj = actualTypeArguments[i].toString();
                int indexOf = obj.indexOf("class ");
                if (indexOf < 0) {
                    indexOf = 0;
                }
                int indexOf2 = obj.indexOf("<");
                if (indexOf2 < 0) {
                    indexOf2 = obj.length();
                }
                return Class.forName(obj.substring(indexOf, indexOf2));
            } catch (ClassNotFoundException e) {
                String str = f1455a;
                C1278a.m1584d(str, "getType exception!" + e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Field[] m1645a(Class cls) {
        Field[] a = cls.getSuperclass() != null ? m1645a(cls.getSuperclass()) : null;
        Field[] declaredFields = cls.getDeclaredFields();
        if (a != null && a.length > 0) {
            Field[] fieldArr = new Field[(declaredFields.length + a.length)];
            System.arraycopy(a, 0, fieldArr, 0, a.length);
            System.arraycopy(declaredFields, 0, fieldArr, a.length, declaredFields.length);
            declaredFields = fieldArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if (field.getName().indexOf("$") < 0) {
                arrayList.add(field);
            }
        }
        if (arrayList.size() == declaredFields.length) {
            return declaredFields;
        }
        Field[] fieldArr2 = new Field[arrayList.size()];
        arrayList.toArray(fieldArr2);
        return fieldArr2;
    }
}
