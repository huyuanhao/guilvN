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
import java.lang.reflect.Type;

/* renamed from: com.pd.sdk.ooOo0  reason: case insensitive filesystem */
public class C8998ooOo0 {
    public static Gson OooO00o() {
        return new GsonBuilder().serializeNulls().registerTypeHierarchyAdapter(Integer.class, new OooO0OO()).registerTypeHierarchyAdapter(Integer.TYPE, new OooO0OO()).registerTypeHierarchyAdapter(Long.class, new C8999OooO0Oo()).registerTypeHierarchyAdapter(Long.TYPE, new C8999OooO0Oo()).registerTypeHierarchyAdapter(Double.class, new OooO00o()).registerTypeHierarchyAdapter(Double.TYPE, new OooO00o()).registerTypeHierarchyAdapter(Float.class, new OooO0O0()).registerTypeHierarchyAdapter(Float.TYPE, new OooO0O0()).create();
    }

    public static Gson OooO0O0() {
        return new Gson();
    }

    /* renamed from: com.pd.sdk.ooOo0$OooO00o */
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

    /* renamed from: com.pd.sdk.ooOo0$OooO0O0 */
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

    /* renamed from: com.pd.sdk.ooOo0$OooO0OO */
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

    /* renamed from: com.pd.sdk.ooOo0$OooO0Oo  reason: case insensitive filesystem */
    public static class C8999OooO0Oo implements JsonDeserializer<Long>, JsonSerializer<Long> {
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
}
