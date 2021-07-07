package com.facebook.react.bridge;

import com.facebook.infer.annotation.Assertions;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.config.ReactFeatureFlags;
import com.p118pd.sdk.C9058ooOoOoOO;
import java.util.ArrayList;
import java.util.Arrays;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@DoNotStrip
public class ReadableNativeArray extends NativeArray implements ReadableArray {
    public static int jniPassCounter = 0;
    @Nullable
    public Object[] mLocalArray;
    @Nullable
    public ReadableType[] mLocalTypeArray;

    /* renamed from: com.facebook.react.bridge.ReadableNativeArray$1 */
    public static /* synthetic */ class C06621 {
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
                com.facebook.react.bridge.ReadableNativeArray.C06621.$SwitchMap$com$facebook$react$bridge$ReadableType = r0
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Null     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.facebook.react.bridge.ReadableNativeArray.C06621.$SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.facebook.react.bridge.ReadableNativeArray.C06621.$SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.facebook.react.bridge.ReadableNativeArray.C06621.$SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.facebook.react.bridge.ReadableNativeArray.C06621.$SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.facebook.react.bridge.ReadableNativeArray.C06621.$SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.ReadableNativeArray.C06621.<clinit>():void");
        }
    }

    static {
        ReactBridge.staticInit();
    }

    public ReadableNativeArray(HybridData hybridData) {
        super(hybridData);
    }

    private native ReadableNativeArray getArrayNative(int i);

    private native boolean getBooleanNative(int i);

    private native double getDoubleNative(int i);

    private native int getIntNative(int i);

    public static int getJNIPassCounter() {
        return jniPassCounter;
    }

    private Object[] getLocalArray() {
        Object[] objArr = this.mLocalArray;
        if (objArr != null) {
            return objArr;
        }
        synchronized (this) {
            if (this.mLocalArray == null) {
                jniPassCounter++;
                this.mLocalArray = (Object[]) Assertions.assertNotNull(importArray());
            }
        }
        return this.mLocalArray;
    }

    private ReadableType[] getLocalTypeArray() {
        ReadableType[] readableTypeArr = this.mLocalTypeArray;
        if (readableTypeArr != null) {
            return readableTypeArr;
        }
        synchronized (this) {
            if (this.mLocalTypeArray == null) {
                jniPassCounter++;
                Object[] objArr = (Object[]) Assertions.assertNotNull(importTypeArray());
                this.mLocalTypeArray = (ReadableType[]) Arrays.copyOf(objArr, objArr.length, ReadableType[].class);
            }
        }
        return this.mLocalTypeArray;
    }

    private native ReadableNativeMap getMapNative(int i);

    private native String getStringNative(int i);

    private native ReadableType getTypeNative(int i);

    private native Object[] importArray();

    private native Object[] importTypeArray();

    private native boolean isNullNative(int i);

    public static void setUseNativeAccessor(boolean z) {
        ReactFeatureFlags.useArrayNativeAccessor = z;
    }

    private native int sizeNative();

    @Override // com.facebook.react.bridge.ReadableArray
    public boolean getBoolean(int i) {
        if (!ReactFeatureFlags.useArrayNativeAccessor) {
            return ((Boolean) getLocalArray()[i]).booleanValue();
        }
        jniPassCounter++;
        return getBooleanNative(i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public double getDouble(int i) {
        if (!ReactFeatureFlags.useArrayNativeAccessor) {
            return ((Double) getLocalArray()[i]).doubleValue();
        }
        jniPassCounter++;
        return getDoubleNative(i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    @Nonnull
    public Dynamic getDynamic(int i) {
        return DynamicFromArray.create(this, i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public int getInt(int i) {
        if (!ReactFeatureFlags.useArrayNativeAccessor) {
            return ((Double) getLocalArray()[i]).intValue();
        }
        jniPassCounter++;
        return getIntNative(i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    @Nullable
    public String getString(int i) {
        if (!ReactFeatureFlags.useArrayNativeAccessor) {
            return (String) getLocalArray()[i];
        }
        jniPassCounter++;
        return getStringNative(i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    @Nonnull
    public ReadableType getType(int i) {
        if (!ReactFeatureFlags.useArrayNativeAccessor) {
            return getLocalTypeArray()[i];
        }
        jniPassCounter++;
        return getTypeNative(i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public boolean isNull(int i) {
        if (ReactFeatureFlags.useArrayNativeAccessor) {
            jniPassCounter++;
            return isNullNative(i);
        } else if (getLocalArray()[i] == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public int size() {
        if (!ReactFeatureFlags.useArrayNativeAccessor) {
            return getLocalArray().length;
        }
        jniPassCounter++;
        return sizeNative();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    @Nonnull
    public ArrayList<Object> toArrayList() {
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            switch (C06621.$SwitchMap$com$facebook$react$bridge$ReadableType[getType(i).ordinal()]) {
                case 1:
                    arrayList.add(null);
                    break;
                case 2:
                    arrayList.add(Boolean.valueOf(getBoolean(i)));
                    break;
                case 3:
                    arrayList.add(Double.valueOf(getDouble(i)));
                    break;
                case 4:
                    arrayList.add(getString(i));
                    break;
                case 5:
                    arrayList.add(getMap(i).toHashMap());
                    break;
                case 6:
                    arrayList.add(getArray(i).toArrayList());
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object at index: " + i + C9058ooOoOoOO.OooOO0);
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    @Nullable
    public ReadableNativeArray getArray(int i) {
        if (!ReactFeatureFlags.useArrayNativeAccessor) {
            return (ReadableNativeArray) getLocalArray()[i];
        }
        jniPassCounter++;
        return getArrayNative(i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    @Nullable
    public ReadableNativeMap getMap(int i) {
        if (!ReactFeatureFlags.useArrayNativeAccessor) {
            return (ReadableNativeMap) getLocalArray()[i];
        }
        jniPassCounter++;
        return getMapNative(i);
    }
}
