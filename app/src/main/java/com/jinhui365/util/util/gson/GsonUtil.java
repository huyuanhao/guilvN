package com.jinhui365.util.util.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class GsonUtil {
    public static Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Integer.class, new JsonIntAdapter()).registerTypeHierarchyAdapter(Integer.TYPE, new JsonIntAdapter()).registerTypeHierarchyAdapter(Long.class, new JsonLongAdapter()).registerTypeHierarchyAdapter(Long.TYPE, new JsonLongAdapter()).registerTypeHierarchyAdapter(Double.class, new JsonDoubleAdapter()).registerTypeHierarchyAdapter(Double.TYPE, new JsonDoubleAdapter()).registerTypeHierarchyAdapter(Float.class, new JsonFloatAdapter()).registerTypeHierarchyAdapter(Float.TYPE, new JsonFloatAdapter()).create();

    public static class JsonDoubleAdapter implements JsonDeserializer<Double>, JsonSerializer<Double> {
        @Override // com.google.gson.JsonDeserializer
        public Double deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            try {
                return Double.valueOf(jsonElement.getAsDouble());
            } catch (Exception unused) {
                return Double.valueOf((double) AbstractC8352oOoOOoO0.OooO0O0);
            }
        }

        public JsonElement serialize(Double d, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(String.valueOf(d));
        }
    }

    public static class JsonFloatAdapter implements JsonDeserializer<Float>, JsonSerializer<Float> {
        @Override // com.google.gson.JsonDeserializer
        public Float deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            try {
                return Float.valueOf(jsonElement.getAsFloat());
            } catch (Exception unused) {
                return Float.valueOf(0.0f);
            }
        }

        public JsonElement serialize(Float f, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(String.valueOf(f));
        }
    }

    public static class JsonIntAdapter implements JsonDeserializer<Integer>, JsonSerializer<Integer> {
        @Override // com.google.gson.JsonDeserializer
        public Integer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            try {
                return Integer.valueOf(jsonElement.getAsInt());
            } catch (Exception unused) {
                return 0;
            }
        }

        public JsonElement serialize(Integer num, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(String.valueOf(num));
        }
    }

    public static class JsonLongAdapter implements JsonDeserializer<Long>, JsonSerializer<Long> {
        @Override // com.google.gson.JsonDeserializer
        public Long deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            try {
                return Long.valueOf(jsonElement.getAsLong());
            } catch (Exception unused) {
                return 0L;
            }
        }

        public JsonElement serialize(Long l, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(String.valueOf(l));
        }
    }

    static {
        if (0 == 0) {
        }
    }

    public static <T> Result<List<T>> fromJsonArray(String str, Class<T> cls) {
        try {
            return (Result) gson.fromJson(str, new ParameterizedTypeImpl(Result.class, new Type[]{new ParameterizedTypeImpl(List.class, new Class[]{cls})}));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> Result<T> fromJsonObject(String str, Class<T> cls) {
        try {
            return (Result) gson.fromJson(str, new ParameterizedTypeImpl(Result.class, new Class[]{cls}));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getStringFromJson(Object obj, String str) {
        try {
            return ((JSONObject) obj).get(str).toString();
        } catch (JSONException unused) {
            GsonUtil.class.getClass().getName();
            return "";
        }
    }

    public static <T> T jsonToBean(String str, Class<T> cls) {
        try {
            return (T) gson.fromJson(str, new ParameterizedTypeImpl(cls, new Class[]{Map.class, Object.class}));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T jsonToBeanList(String str, Class<?> cls) {
        try {
            return (T) gson.fromJson(str, new ParameterizedTypeImpl(List.class, new Class[]{cls}));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <K, V> Map<K, V> jsonToMap(String str, Class<K> cls, Class<V> cls2) {
        try {
            return (Map) gson.fromJson(str, new ParameterizedTypeImpl(Map.class, new Class[]{cls, cls2}));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String toJson(Object obj) {
        Gson gson2 = gson;
        if (gson2 != null) {
            return gson2.toJson(obj);
        }
        return null;
    }
}
