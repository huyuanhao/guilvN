package com.facebook.react.bridge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class JavaOnlyArray implements ReadableArray, WritableArray {
    public final List mBackingList;

    /* renamed from: com.facebook.react.bridge.JavaOnlyArray$1 */
    public static /* synthetic */ class C06561 {
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
                com.facebook.react.bridge.JavaOnlyArray.C06561.$SwitchMap$com$facebook$react$bridge$ReadableType = r0
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Null     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.facebook.react.bridge.JavaOnlyArray.C06561.$SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.facebook.react.bridge.JavaOnlyArray.C06561.$SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.facebook.react.bridge.JavaOnlyArray.C06561.$SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.facebook.react.bridge.JavaOnlyArray.C06561.$SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.facebook.react.bridge.JavaOnlyArray.C06561.$SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.JavaOnlyArray.C06561.<clinit>():void");
        }
    }

    public JavaOnlyArray(Object... objArr) {
        this.mBackingList = Arrays.asList(objArr);
    }

    public static JavaOnlyArray deepClone(ReadableArray readableArray) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            switch (C06561.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i).ordinal()]) {
                case 1:
                    javaOnlyArray.pushNull();
                    break;
                case 2:
                    javaOnlyArray.pushBoolean(readableArray.getBoolean(i));
                    break;
                case 3:
                    javaOnlyArray.pushDouble(readableArray.getDouble(i));
                    break;
                case 4:
                    javaOnlyArray.pushString(readableArray.getString(i));
                    break;
                case 5:
                    javaOnlyArray.pushMap(JavaOnlyMap.deepClone(readableArray.getMap(i)));
                    break;
                case 6:
                    javaOnlyArray.pushArray(deepClone(readableArray.getArray(i)));
                    break;
            }
        }
        return javaOnlyArray;
    }

    public static JavaOnlyArray from(List list) {
        return new JavaOnlyArray(list);
    }

    /* renamed from: of */
    public static JavaOnlyArray m943of(Object... objArr) {
        return new JavaOnlyArray(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JavaOnlyArray.class != obj.getClass()) {
            return false;
        }
        List list = this.mBackingList;
        List list2 = ((JavaOnlyArray) obj).mBackingList;
        return list == null ? list2 == null : list.equals(list2);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public boolean getBoolean(int i) {
        return ((Boolean) this.mBackingList.get(i)).booleanValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public double getDouble(int i) {
        return ((Number) this.mBackingList.get(i)).doubleValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    @Nonnull
    public Dynamic getDynamic(int i) {
        return DynamicFromArray.create(this, i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public int getInt(int i) {
        return ((Number) this.mBackingList.get(i)).intValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    @Nullable
    public String getString(int i) {
        return (String) this.mBackingList.get(i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    @Nonnull
    public ReadableType getType(int i) {
        Object obj = this.mBackingList.get(i);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer)) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        return null;
    }

    public int hashCode() {
        List list = this.mBackingList;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public boolean isNull(int i) {
        return this.mBackingList.get(i) == null;
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushArray(@Nullable WritableArray writableArray) {
        this.mBackingList.add(writableArray);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushBoolean(boolean z) {
        this.mBackingList.add(Boolean.valueOf(z));
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushDouble(double d) {
        this.mBackingList.add(Double.valueOf(d));
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushInt(int i) {
        this.mBackingList.add(Integer.valueOf(i));
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushMap(@Nullable WritableMap writableMap) {
        this.mBackingList.add(writableMap);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushNull() {
        this.mBackingList.add(null);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushString(@Nullable String str) {
        this.mBackingList.add(str);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public int size() {
        return this.mBackingList.size();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    @Nonnull
    public ArrayList<Object> toArrayList() {
        return new ArrayList<>(this.mBackingList);
    }

    public String toString() {
        return this.mBackingList.toString();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public JavaOnlyArray getArray(int i) {
        return (JavaOnlyArray) this.mBackingList.get(i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public JavaOnlyMap getMap(int i) {
        return (JavaOnlyMap) this.mBackingList.get(i);
    }

    public JavaOnlyArray(List list) {
        this.mBackingList = new ArrayList(list);
    }

    public JavaOnlyArray() {
        this.mBackingList = new ArrayList();
    }
}
