package com.p118pd.sdk;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.pd.sdk.oOoOo0oO  reason: case insensitive filesystem */
public final class C8369oOoOo0oO {

    /* renamed from: com.pd.sdk.oOoOo0oO$OooO00o */
    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

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
                com.p118pd.sdk.C8369oOoOo0oO.OooO00o.OooO00o = r0
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Null     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.p118pd.sdk.C8369oOoOo0oO.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.p118pd.sdk.C8369oOoOo0oO.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.p118pd.sdk.C8369oOoOo0oO.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.p118pd.sdk.C8369oOoOo0oO.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.p118pd.sdk.C8369oOoOo0oO.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8369oOoOo0oO.OooO00o.<clinit>():void");
        }
    }

    public static Object OooO00o(@Nullable ReadableMap readableMap, String str) {
        if (readableMap == null) {
            return null;
        }
        switch (OooO00o.OooO00o[readableMap.getType(str).ordinal()]) {
            case 1:
                return str;
            case 2:
                return Boolean.valueOf(readableMap.getBoolean(str));
            case 3:
                double d = readableMap.getDouble(str);
                int i = (int) d;
                if (d == ((double) i)) {
                    return Integer.valueOf(i);
                }
                return Double.valueOf(d);
            case 4:
                return readableMap.getString(str);
            case 5:
                return OooO00o(readableMap.getMap(str));
            case 6:
                return OooO00o(readableMap.getArray(str));
            default:
                throw new IllegalArgumentException("Could not convert object with key: " + str + C9058ooOoOoOO.OooOO0);
        }
    }

    public static Map<String, Object> OooO00o(@Nullable ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        if (!keySetIterator.hasNextKey()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, OooO00o(readableMap, nextKey));
        }
        return hashMap;
    }

    public static List<Object> OooO00o(@Nullable ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        List<Object> arrayList = new ArrayList<>(readableArray.size());
        for (int i = 0; i < readableArray.size(); i++) {
            switch (OooO00o.OooO00o[readableArray.getType(i).ordinal()]) {
                case 1:
                    arrayList.add(String.valueOf(i));
                    break;
                case 2:
                    arrayList.add(Boolean.valueOf(readableArray.getBoolean(i)));
                    break;
                case 3:
                    double d = readableArray.getDouble(i);
                    int i2 = (int) d;
                    if (d == ((double) i2)) {
                        arrayList.add(Integer.valueOf(i2));
                        break;
                    } else {
                        arrayList.add(Double.valueOf(d));
                        break;
                    }
                case 4:
                    arrayList.add(readableArray.getString(i));
                    break;
                case 5:
                    arrayList.add(OooO00o(readableArray.getMap(i)));
                    break;
                case 6:
                    arrayList = OooO00o(readableArray.getArray(i));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object with index: " + i + C9058ooOoOoOO.OooOO0);
            }
        }
        return arrayList;
    }
}
