package com.p118pd.sdk;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.rxhui.gson.ParameterizedTypeImpl;
import com.rxhui.gson.Result;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.ooOoOO0  reason: case insensitive filesystem */
public class C9041ooOoOO0 {
    public static Gson OooO00o = new GsonBuilder().registerTypeHierarchyAdapter(Integer.class, new OooO0OO()).registerTypeHierarchyAdapter(Integer.TYPE, new OooO0OO()).registerTypeHierarchyAdapter(Long.class, new C9042OooO0Oo()).registerTypeHierarchyAdapter(Long.TYPE, new C9042OooO0Oo()).registerTypeHierarchyAdapter(Double.class, new OooO00o()).registerTypeHierarchyAdapter(Double.TYPE, new OooO00o()).registerTypeHierarchyAdapter(Float.class, new OooO0O0()).registerTypeHierarchyAdapter(Float.TYPE, new OooO0O0()).create();

    static {
        if (0 == 0) {
        }
    }

    public static String OooO00o(Object obj) {
        Gson gson = OooO00o;
        if (gson != null) {
            return gson.toJson(obj);
        }
        return null;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static <T> T m20701OooO0O0(String str, Class<?> cls) {
        try {
            return (T) OooO00o.fromJson(str, new ParameterizedTypeImpl(List.class, new Class[]{cls}));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: com.pd.sdk.ooOoOO0$OooO00o */
    public static class OooO00o implements JsonDeserializer<Double>, JsonSerializer<Double> {
        /* renamed from: OooO00o */
        public Double deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            try {
                return Double.valueOf(jsonElement.getAsDouble());
            } catch (Exception unused) {
                return Double.valueOf((double) AbstractC8352oOoOOoO0.OooO0O0);
            }
        }

        /* renamed from: OooO00o */
        public JsonElement serialize(Double d, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(String.valueOf(d));
        }
    }

    /* renamed from: com.pd.sdk.ooOoOO0$OooO0O0 */
    public static class OooO0O0 implements JsonDeserializer<Float>, JsonSerializer<Float> {
        /* renamed from: OooO00o */
        public Float deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            try {
                return Float.valueOf(jsonElement.getAsFloat());
            } catch (Exception unused) {
                return Float.valueOf(0.0f);
            }
        }

        /* renamed from: OooO00o */
        public JsonElement serialize(Float f, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(String.valueOf(f));
        }
    }

    /* renamed from: com.pd.sdk.ooOoOO0$OooO0OO */
    public static class OooO0OO implements JsonDeserializer<Integer>, JsonSerializer<Integer> {
        /* renamed from: OooO00o */
        public Integer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            try {
                return Integer.valueOf(jsonElement.getAsInt());
            } catch (Exception unused) {
                return 0;
            }
        }

        /* renamed from: OooO00o */
        public JsonElement serialize(Integer num, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(String.valueOf(num));
        }
    }

    /* renamed from: com.pd.sdk.ooOoOO0$OooO0Oo  reason: case insensitive filesystem */
    public static class C9042OooO0Oo implements JsonDeserializer<Long>, JsonSerializer<Long> {
        /* renamed from: OooO00o */
        public Long deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            try {
                return Long.valueOf(jsonElement.getAsLong());
            } catch (Exception unused) {
                return 0L;
            }
        }

        /* renamed from: OooO00o */
        public JsonElement serialize(Long l, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(String.valueOf(l));
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static <T> T m20700OooO00o(String str, Class<T> cls) {
        try {
            return (T) OooO00o.fromJson(str, (Class) cls);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> Result<T> OooO0O0(String str, Class<T> cls) {
        try {
            return (Result) OooO00o.fromJson(str, new ParameterizedTypeImpl(Result.class, new Class[]{cls}));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> Result<List<T>> OooO00o(String str, Class<T> cls) {
        try {
            return (Result) OooO00o.fromJson(str, new ParameterizedTypeImpl(Result.class, new Type[]{new ParameterizedTypeImpl(List.class, new Class[]{cls})}));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <K, V> Map<K, V> OooO00o(String str, Class<K> cls, Class<V> cls2) {
        try {
            return (Map) OooO00o.fromJson(str, new ParameterizedTypeImpl(Map.class, new Class[]{cls, cls2}));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String OooO00o(Object obj, String str) {
        try {
            return ((JSONObject) obj).get(str).toString();
        } catch (JSONException unused) {
            C9041ooOoOO0.class.getClass().getName();
            return "";
        }
    }
}
