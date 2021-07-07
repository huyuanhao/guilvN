package com.p118pd.sdk;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* renamed from: com.pd.sdk.oOoOo0o0  reason: case insensitive filesystem */
public class C8368oOoOo0o0 {
    public static boolean OooO00o(ReadableMap readableMap, ReadableType readableType, String str) {
        return readableMap.hasKey(str) && readableType.equals(readableMap.getType(str));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m20049OooO00o(ReadableArray readableArray) {
        int[] iArr = new int[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            if (ReadableType.Number.equals(readableArray.getType(i))) {
                iArr[i] = readableArray.getInt(i);
            } else {
                throw new IllegalArgumentException("Expecting array of numbers");
            }
        }
        return iArr;
    }

    public static float[] OooO00o(ReadableArray readableArray) {
        float[] fArr = new float[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            if (ReadableType.Number.equals(readableArray.getType(i))) {
                fArr[i] = (float) readableArray.getDouble(i);
            } else {
                throw new IllegalArgumentException("Expecting array of numbers");
            }
        }
        return fArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String[] m20050OooO00o(ReadableArray readableArray) {
        String[] strArr = new String[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            if (ReadableType.String.equals(readableArray.getType(i))) {
                strArr[i] = readableArray.getString(i);
            } else {
                throw new IllegalArgumentException("Expecting array of strings");
            }
        }
        return strArr;
    }
}
