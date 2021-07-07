package com.huawei.updatesdk.sdk.service.p076c.p077a;

import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.p062a.p069d.AbstractC1292d;
import com.p118pd.sdk.C7522o0Ooo0o;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.updatesdk.sdk.service.c.a.b */
public abstract class AbstractC1299b {
    public static final char COMMA = ',';
    public static final String END_FLAG = "_";
    public static final String TAG = "b";

    /* renamed from: com.huawei.updatesdk.sdk.service.c.a.b$a */
    public static class C1300a implements PrivilegedAction {

        /* renamed from: a */
        public Field f1463a;

        public C1300a(Field field) {
            this.f1463a = field;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            this.f1463a.setAccessible(true);
            return null;
        }
    }

    private String arrayToJson(Object obj) throws IllegalAccessException, IllegalArgumentException {
        int length = Array.getLength(obj);
        if (length <= 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < length; i++) {
            String valueToJson = valueToJson(Array.get(obj, i));
            if (valueToJson != null) {
                sb.append(valueToJson);
                sb.append(COMMA);
            }
        }
        formatJsonStr(sb);
        sb.append("]");
        return sb.toString();
    }

    private void formatJsonStr(StringBuilder sb) {
        int length = sb.length();
        if (length > 0) {
            int i = length - 1;
            if (sb.charAt(i) == ',') {
                sb.delete(i, length);
            }
        }
    }

    private Object jsonBeanFromJson(Class cls, Object obj) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, JSONException {
        AbstractC1299b bVar = (AbstractC1299b) cls.newInstance();
        bVar.fromJson((JSONObject) obj);
        return bVar;
    }

    private String mapToJson(Map map) throws IllegalAccessException, IllegalArgumentException {
        if (map.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Iterator it = map.entrySet().iterator();
        while (true) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String valueToJson = valueToJson(entry.getValue());
            if (valueToJson != null) {
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                sb.append(valueToJson);
            }
            if (!it.hasNext()) {
                sb.append(C7522o0Ooo0o.OooO0Oo);
                return sb.toString();
            } else if (valueToJson != null) {
                sb.append(COMMA);
            }
        }
    }

    private void processValueError(Field field, Object obj) {
        Object valueOf;
        if (obj != null && (obj instanceof String)) {
            try {
                Class<?> type = field.getType();
                if (type.isPrimitive()) {
                    String name = type.getName();
                    if ("int".equals(name)) {
                        valueOf = Integer.valueOf(Integer.parseInt((String) obj));
                    } else if ("float".equals(name)) {
                        valueOf = Float.valueOf(Float.parseFloat((String) obj));
                    } else if ("long".equals(name)) {
                        valueOf = Long.valueOf(Long.parseLong((String) obj));
                    } else if ("boolean".equals(name)) {
                        valueOf = Boolean.valueOf(Boolean.parseBoolean((String) obj));
                    } else if ("double".equals(name)) {
                        valueOf = Double.valueOf(Double.parseDouble((String) obj));
                    } else if ("short".equals(name)) {
                        valueOf = Short.valueOf(Short.parseShort((String) obj));
                    } else if ("byte".equals(name)) {
                        valueOf = Byte.valueOf(Byte.parseByte((String) obj));
                    } else if ("char".equals(name)) {
                        valueOf = Character.valueOf(((String) obj).charAt(0));
                    } else {
                        return;
                    }
                    field.set(this, valueOf);
                }
            } catch (IllegalAccessException e) {
                String str = TAG;
                C1278a.m1584d(str, "processValueError Throwable:" + e.getMessage());
            }
        }
    }

    private Object valueFromJson(Class cls, Class cls2, Object obj) throws IllegalAccessException, IllegalArgumentException, InstantiationException, ClassNotFoundException, JSONException {
        if (cls.isPrimitive() || cls.equals(String.class)) {
            return (!"float".equals(cls.getName()) || !(obj instanceof Double)) ? obj : Float.valueOf(((Double) obj).floatValue());
        }
        if (List.class.isAssignableFrom(cls)) {
            return listFromJson(cls2, obj);
        }
        if (AbstractC1299b.class.isAssignableFrom(cls)) {
            if (!cls.equals(AbstractC1299b.class)) {
                return jsonBeanFromJson(cls, obj);
            }
            throw new IllegalArgumentException("error type, type:" + cls);
        } else if (Map.class.isAssignableFrom(cls)) {
            return mapFromJson(cls2, obj);
        } else {
            throw new IllegalArgumentException("unsupport type, Type:" + cls);
        }
    }

    private String valueToJson(Object obj) throws IllegalAccessException, IllegalArgumentException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return JSONObject.quote(obj.toString());
        }
        if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Boolean) || (obj instanceof Float) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Short)) {
            return String.valueOf(obj);
        }
        if (obj instanceof AbstractC1299b) {
            return ((AbstractC1299b) obj).toJson();
        }
        if (obj instanceof List) {
            return listToJson((List) obj);
        }
        if (obj instanceof Map) {
            return mapToJson((Map) obj);
        }
        if (obj.getClass().isArray()) {
            return arrayToJson(obj);
        }
        return null;
    }

    public void fromJson(JSONObject jSONObject) throws IllegalArgumentException, IllegalAccessException, InstantiationException, ClassNotFoundException, JSONException {
        Field field;
        Field[] a = AbstractC1292d.m1645a(getClass());
        Object obj = null;
        for (int i = 0; i < a.length; i++) {
            AccessController.doPrivileged(new C1300a(a[i]));
            String name = a[i].getName();
            if (name.endsWith("_")) {
                String substring = name.substring(0, name.length() - 1);
                if (jSONObject.has(substring)) {
                    Object obj2 = jSONObject.get(substring);
                    if (!JSONObject.NULL.equals(obj2)) {
                        try {
                            obj = valueFromJson(a[i].getType(), AbstractC1292d.m1643a(a[i]), obj2);
                            a[i].set(this, obj);
                        } catch (IllegalAccessException e) {
                            String str = TAG;
                            C1278a.m1581a(str, getClass().getName() + ".fromJson error, fieldName:" + substring, e);
                            field = a[i];
                        } catch (IllegalArgumentException e2) {
                            String str2 = TAG;
                            C1278a.m1581a(str2, getClass().getName() + ".fromJson error, fieldName:" + substring, e2);
                            field = a[i];
                        } catch (InstantiationException e3) {
                            String str3 = TAG;
                            C1278a.m1581a(str3, getClass().getName() + ".fromJson error, fieldName:" + substring, e3);
                            field = a[i];
                        } catch (ClassNotFoundException e4) {
                            String str4 = TAG;
                            C1278a.m1581a(str4, getClass().getName() + ".fromJson error, fieldName:" + substring, e4);
                            field = a[i];
                        } catch (JSONException e5) {
                            String str5 = TAG;
                            C1278a.m1581a(str5, getClass().getName() + ".fromJson error, fieldName:" + substring, e5);
                            field = a[i];
                        }
                    }
                }
            }
        }
        return;
        processValueError(field, obj);
    }

    public Object listFromJson(Class cls, Object obj) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, JSONException {
        if (cls == null) {
            throw new IllegalArgumentException("generic type is null");
        } else if (obj instanceof JSONArray) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = (JSONArray) obj;
            for (int i = 0; i < jSONArray.length(); i++) {
                Object valueFromJson = valueFromJson(cls, null, jSONArray.get(i));
                if (valueFromJson != null) {
                    if (cls.equals(valueFromJson.getClass())) {
                        arrayList.add(valueFromJson);
                    } else {
                        String str = TAG;
                        C1278a.m1584d(str, "listFromJson error, memberClass:" + cls + ", valueClass:" + valueFromJson.getClass());
                    }
                }
            }
            return arrayList;
        } else {
            throw new IllegalArgumentException("jsonobject is not JSONArray, jsonValue:" + obj);
        }
    }

    public String listToJson(List list) throws IllegalAccessException, IllegalArgumentException {
        if (list.size() <= 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < list.size(); i++) {
            String valueToJson = valueToJson(list.get(i));
            if (valueToJson != null) {
                sb.append(valueToJson);
                sb.append(COMMA);
            }
        }
        formatJsonStr(sb);
        sb.append("]");
        return sb.toString();
    }

    public Object mapFromJson(Class cls, Object obj) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, JSONException {
        if (cls == null) {
            throw new IllegalArgumentException("generic type is null");
        } else if (obj instanceof JSONObject) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object valueFromJson = valueFromJson(cls, null, jSONObject.get(next));
                if (valueFromJson != null) {
                    if (cls.equals(valueFromJson.getClass())) {
                        linkedHashMap.put(next, valueFromJson);
                    } else {
                        String str = TAG;
                        C1278a.m1584d(str, "mapFromJson error, memberClass:" + cls + ", valueClass:" + valueFromJson.getClass());
                    }
                }
            }
            return linkedHashMap;
        } else {
            throw new IllegalArgumentException("jsonobject is not JSONObject, jsonValue:" + obj);
        }
    }

    public String toJson() throws IllegalAccessException, IllegalArgumentException {
        Field[] a = AbstractC1292d.m1645a(getClass());
        if (a.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < a.length; i++) {
            AccessController.doPrivileged(new C1300a(a[i]));
            String name = a[i].getName();
            if (name != null && name.endsWith("_")) {
                String substring = name.substring(0, name.length() - 1);
                String valueToJson = valueToJson(a[i].get(this));
                if (valueToJson != null) {
                    sb.append("\"");
                    sb.append(substring);
                    sb.append("\":");
                    sb.append(valueToJson);
                    sb.append(COMMA);
                }
            }
        }
        formatJsonStr(sb);
        sb.append(C7522o0Ooo0o.OooO0Oo);
        return sb.toString();
    }
}
