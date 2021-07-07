package com.facebook.react.bridge;

import com.facebook.infer.annotation.Assertions;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.config.ReactFeatureFlags;
import com.p118pd.sdk.C9058ooOoOoOO;
import java.util.HashMap;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@DoNotStrip
public class ReadableNativeMap extends NativeMap implements ReadableMap {
    public static int mJniCallCounter;
    @Nullable
    public String[] mKeys;
    @Nullable
    public HashMap<String, Object> mLocalMap;
    @Nullable
    public HashMap<String, ReadableType> mLocalTypeMap;

    /* renamed from: com.facebook.react.bridge.ReadableNativeMap$1 */
    public static /* synthetic */ class C06631 {
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
                com.facebook.react.bridge.ReadableNativeMap.C06631.$SwitchMap$com$facebook$react$bridge$ReadableType = r0
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Null     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.facebook.react.bridge.ReadableNativeMap.C06631.$SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.facebook.react.bridge.ReadableNativeMap.C06631.$SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.facebook.react.bridge.ReadableNativeMap.C06631.$SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.facebook.react.bridge.ReadableNativeMap.C06631.$SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.facebook.react.bridge.ReadableNativeMap.C06631.$SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.ReadableNativeMap.C06631.<clinit>():void");
        }
    }

    @DoNotStrip
    public static class ReadableNativeMapKeySetIterator implements ReadableMapKeySetIterator {
        @DoNotStrip
        public final HybridData mHybridData;
        @DoNotStrip
        public final ReadableNativeMap mMap;

        public ReadableNativeMapKeySetIterator(ReadableNativeMap readableNativeMap) {
            this.mMap = readableNativeMap;
            this.mHybridData = initHybrid(readableNativeMap);
        }

        public static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

        @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
        public native boolean hasNextKey();

        @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
        public native String nextKey();
    }

    static {
        ReactBridge.staticInit();
    }

    public ReadableNativeMap(HybridData hybridData) {
        super(hybridData);
    }

    private void checkInstance(String str, Object obj, Class cls) {
        if (obj != null && !cls.isInstance(obj)) {
            throw new ClassCastException("Value for " + str + " cannot be cast from " + obj.getClass().getSimpleName() + " to " + cls.getSimpleName());
        }
    }

    private native ReadableNativeArray getArrayNative(String str);

    private native boolean getBooleanNative(String str);

    private native double getDoubleNative(String str);

    private native int getIntNative(String str);

    public static int getJNIPassCounter() {
        return mJniCallCounter;
    }

    private HashMap<String, Object> getLocalMap() {
        HashMap<String, Object> hashMap = this.mLocalMap;
        if (hashMap != null) {
            return hashMap;
        }
        synchronized (this) {
            if (this.mKeys == null) {
                this.mKeys = (String[]) Assertions.assertNotNull(importKeys());
                mJniCallCounter++;
            }
            if (this.mLocalMap == null) {
                Object[] objArr = (Object[]) Assertions.assertNotNull(importValues());
                mJniCallCounter++;
                int length = this.mKeys.length;
                this.mLocalMap = new HashMap<>(length);
                for (int i = 0; i < length; i++) {
                    this.mLocalMap.put(this.mKeys[i], objArr[i]);
                }
            }
        }
        return this.mLocalMap;
    }

    @Nonnull
    private HashMap<String, ReadableType> getLocalTypeMap() {
        HashMap<String, ReadableType> hashMap = this.mLocalTypeMap;
        if (hashMap != null) {
            return hashMap;
        }
        synchronized (this) {
            if (this.mKeys == null) {
                this.mKeys = (String[]) Assertions.assertNotNull(importKeys());
                mJniCallCounter++;
            }
            if (this.mLocalTypeMap == null) {
                Object[] objArr = (Object[]) Assertions.assertNotNull(importTypes());
                mJniCallCounter++;
                int length = this.mKeys.length;
                this.mLocalTypeMap = new HashMap<>(length);
                for (int i = 0; i < length; i++) {
                    this.mLocalTypeMap.put(this.mKeys[i], (ReadableType) objArr[i]);
                }
            }
        }
        return this.mLocalTypeMap;
    }

    private native ReadableNativeMap getMapNative(String str);

    @Nullable
    private Object getNullableValue(String str) {
        if (hasKey(str)) {
            return getLocalMap().get(str);
        }
        throw new NoSuchKeyException(str);
    }

    private native String getStringNative(String str);

    private native ReadableType getTypeNative(String str);

    @Nonnull
    private Object getValue(@Nonnull String str) {
        if (hasKey(str) && !isNull(str)) {
            return Assertions.assertNotNull(getLocalMap().get(str));
        }
        throw new NoSuchKeyException(str);
    }

    private native boolean hasKeyNative(String str);

    private native String[] importKeys();

    private native Object[] importTypes();

    private native Object[] importValues();

    private native boolean isNullNative(@Nonnull String str);

    public static void setUseNativeAccessor(boolean z) {
        ReactFeatureFlags.useMapNativeAccessor = z;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nullable
    public ReadableArray getArray(@Nonnull String str) {
        if (!ReactFeatureFlags.useMapNativeAccessor) {
            return (ReadableArray) getNullableValue(str, ReadableArray.class);
        }
        mJniCallCounter++;
        return getArrayNative(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean getBoolean(@Nonnull String str) {
        if (!ReactFeatureFlags.useMapNativeAccessor) {
            return ((Boolean) getValue(str, Boolean.class)).booleanValue();
        }
        mJniCallCounter++;
        return getBooleanNative(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public double getDouble(@Nonnull String str) {
        if (!ReactFeatureFlags.useMapNativeAccessor) {
            return ((Double) getValue(str, Double.class)).doubleValue();
        }
        mJniCallCounter++;
        return getDoubleNative(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nonnull
    public Dynamic getDynamic(@Nonnull String str) {
        return DynamicFromMap.create(this, str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public int getInt(@Nonnull String str) {
        if (!ReactFeatureFlags.useMapNativeAccessor) {
            return ((Double) getValue(str, Double.class)).intValue();
        }
        mJniCallCounter++;
        return getIntNative(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nullable
    public String getString(@Nonnull String str) {
        if (!ReactFeatureFlags.useMapNativeAccessor) {
            return (String) getNullableValue(str, String.class);
        }
        mJniCallCounter++;
        return getStringNative(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nonnull
    public ReadableType getType(@Nonnull String str) {
        if (ReactFeatureFlags.useMapNativeAccessor) {
            mJniCallCounter++;
            return getTypeNative(str);
        } else if (getLocalTypeMap().containsKey(str)) {
            return (ReadableType) Assertions.assertNotNull(getLocalTypeMap().get(str));
        } else {
            throw new NoSuchKeyException(str);
        }
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean hasKey(@Nonnull String str) {
        if (!ReactFeatureFlags.useMapNativeAccessor) {
            return getLocalMap().containsKey(str);
        }
        mJniCallCounter++;
        return hasKeyNative(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean isNull(@Nonnull String str) {
        if (ReactFeatureFlags.useMapNativeAccessor) {
            mJniCallCounter++;
            return isNullNative(str);
        } else if (!getLocalMap().containsKey(str)) {
            throw new NoSuchKeyException(str);
        } else if (getLocalMap().get(str) == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nonnull
    public ReadableMapKeySetIterator keySetIterator() {
        return new ReadableNativeMapKeySetIterator(this);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nonnull
    public HashMap<String, Object> toHashMap() {
        if (ReactFeatureFlags.useMapNativeAccessor) {
            ReadableMapKeySetIterator keySetIterator = keySetIterator();
            HashMap<String, Object> hashMap = new HashMap<>();
            while (keySetIterator.hasNextKey()) {
                mJniCallCounter++;
                String nextKey = keySetIterator.nextKey();
                mJniCallCounter++;
                switch (C06631.$SwitchMap$com$facebook$react$bridge$ReadableType[getType(nextKey).ordinal()]) {
                    case 1:
                        hashMap.put(nextKey, null);
                        break;
                    case 2:
                        hashMap.put(nextKey, Boolean.valueOf(getBoolean(nextKey)));
                        break;
                    case 3:
                        hashMap.put(nextKey, Double.valueOf(getDouble(nextKey)));
                        break;
                    case 4:
                        hashMap.put(nextKey, getString(nextKey));
                        break;
                    case 5:
                        hashMap.put(nextKey, ((ReadableNativeMap) Assertions.assertNotNull(getMap(nextKey))).toHashMap());
                        break;
                    case 6:
                        hashMap.put(nextKey, ((ReadableArray) Assertions.assertNotNull(getArray(nextKey))).toArrayList());
                        break;
                    default:
                        throw new IllegalArgumentException("Could not convert object with key: " + nextKey + C9058ooOoOoOO.OooOO0);
                }
            }
            return hashMap;
        }
        HashMap<String, Object> hashMap2 = new HashMap<>(getLocalMap());
        for (String str : hashMap2.keySet()) {
            switch (C06631.$SwitchMap$com$facebook$react$bridge$ReadableType[getType(str).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    break;
                case 5:
                    hashMap2.put(str, ((ReadableNativeMap) Assertions.assertNotNull(getMap(str))).toHashMap());
                    break;
                case 6:
                    hashMap2.put(str, ((ReadableArray) Assertions.assertNotNull(getArray(str))).toArrayList());
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object with key: " + str + C9058ooOoOoOO.OooOO0);
            }
        }
        return hashMap2;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nullable
    public ReadableNativeMap getMap(@Nonnull String str) {
        if (!ReactFeatureFlags.useMapNativeAccessor) {
            return (ReadableNativeMap) getNullableValue(str, ReadableNativeMap.class);
        }
        mJniCallCounter++;
        return getMapNative(str);
    }

    @Nullable
    private <T> T getNullableValue(String str, Class<T> cls) {
        T t = (T) getNullableValue(str);
        checkInstance(str, t, cls);
        return t;
    }

    private <T> T getValue(String str, Class<T> cls) {
        T t = (T) getValue(str);
        checkInstance(str, t, cls);
        return t;
    }
}
