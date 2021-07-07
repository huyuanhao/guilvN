package com.facebook.react.bridge;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class JavaOnlyMap implements ReadableMap, WritableMap {
    public final Map mBackingMap;

    /* renamed from: com.facebook.react.bridge.JavaOnlyMap$2 */
    public static /* synthetic */ class C06582 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.react.bridge.JavaOnlyMap.C06582.$SwitchMap$com$facebook$react$bridge$ReadableType = r0
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Null     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.facebook.react.bridge.JavaOnlyMap.C06582.$SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.facebook.react.bridge.JavaOnlyMap.C06582.$SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.facebook.react.bridge.JavaOnlyMap.C06582.$SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.facebook.react.bridge.JavaOnlyMap.C06582.$SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.facebook.react.bridge.JavaOnlyMap.C06582.$SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.JavaOnlyMap.C06582.<clinit>():void");
        }
    }

    public JavaOnlyMap(Object... objArr) {
        if (objArr.length % 2 == 0) {
            this.mBackingMap = new HashMap();
            for (int i = 0; i < objArr.length; i += 2) {
                this.mBackingMap.put(objArr[i], objArr[i + 1]);
            }
            return;
        }
        throw new IllegalArgumentException("You must provide the same number of keys and values");
    }

    public static JavaOnlyMap deepClone(ReadableMap readableMap) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (C06582.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    javaOnlyMap.putNull(nextKey);
                    break;
                case 2:
                    javaOnlyMap.putBoolean(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 3:
                    javaOnlyMap.putDouble(nextKey, readableMap.getDouble(nextKey));
                    break;
                case 4:
                    javaOnlyMap.putString(nextKey, readableMap.getString(nextKey));
                    break;
                case 5:
                    javaOnlyMap.putMap(nextKey, deepClone(readableMap.getMap(nextKey)));
                    break;
                case 6:
                    javaOnlyMap.putArray(nextKey, JavaOnlyArray.deepClone(readableMap.getArray(nextKey)));
                    break;
            }
        }
        return javaOnlyMap;
    }

    /* renamed from: of */
    public static JavaOnlyMap m944of(Object... objArr) {
        return new JavaOnlyMap(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JavaOnlyMap.class != obj.getClass()) {
            return false;
        }
        Map map = this.mBackingMap;
        Map map2 = ((JavaOnlyMap) obj).mBackingMap;
        return map == null ? map2 == null : map.equals(map2);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean getBoolean(@Nonnull String str) {
        return ((Boolean) this.mBackingMap.get(str)).booleanValue();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public double getDouble(@Nonnull String str) {
        return ((Number) this.mBackingMap.get(str)).doubleValue();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nonnull
    public Dynamic getDynamic(@Nonnull String str) {
        return DynamicFromMap.create(this, str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public int getInt(@Nonnull String str) {
        return ((Number) this.mBackingMap.get(str)).intValue();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableMap getMap(@Nonnull String str) {
        return (ReadableMap) this.mBackingMap.get(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public String getString(@Nonnull String str) {
        return (String) this.mBackingMap.get(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nonnull
    public ReadableType getType(@Nonnull String str) {
        Object obj = this.mBackingMap.get(str);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Number) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof Dynamic) {
            return ((Dynamic) obj).getType();
        }
        throw new IllegalArgumentException("Invalid value " + obj.toString() + " for key " + str + "contained in JavaOnlyMap");
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean hasKey(@Nonnull String str) {
        return this.mBackingMap.containsKey(str);
    }

    public int hashCode() {
        Map map = this.mBackingMap;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean isNull(@Nonnull String str) {
        return this.mBackingMap.get(str) == null;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nonnull
    public ReadableMapKeySetIterator keySetIterator() {
        return new ReadableMapKeySetIterator() {
            /* class com.facebook.react.bridge.JavaOnlyMap.C06571 */
            public Iterator<String> mIterator = JavaOnlyMap.this.mBackingMap.keySet().iterator();

            @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
            public boolean hasNextKey() {
                return this.mIterator.hasNext();
            }

            @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
            public String nextKey() {
                return this.mIterator.next();
            }
        };
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void merge(@Nonnull ReadableMap readableMap) {
        this.mBackingMap.putAll(((JavaOnlyMap) readableMap).mBackingMap);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putArray(@Nonnull String str, @Nullable WritableArray writableArray) {
        this.mBackingMap.put(str, writableArray);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putBoolean(@Nonnull String str, boolean z) {
        this.mBackingMap.put(str, Boolean.valueOf(z));
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putDouble(@Nonnull String str, double d) {
        this.mBackingMap.put(str, Double.valueOf(d));
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putInt(@Nonnull String str, int i) {
        this.mBackingMap.put(str, Integer.valueOf(i));
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putMap(@Nonnull String str, @Nullable WritableMap writableMap) {
        this.mBackingMap.put(str, writableMap);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putNull(@Nonnull String str) {
        this.mBackingMap.put(str, null);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putString(@Nonnull String str, @Nullable String str2) {
        this.mBackingMap.put(str, str2);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nonnull
    public HashMap<String, Object> toHashMap() {
        return new HashMap<>(this.mBackingMap);
    }

    public String toString() {
        return this.mBackingMap.toString();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public JavaOnlyArray getArray(@Nonnull String str) {
        return (JavaOnlyArray) this.mBackingMap.get(str);
    }

    public JavaOnlyMap() {
        this.mBackingMap = new HashMap();
    }
}
