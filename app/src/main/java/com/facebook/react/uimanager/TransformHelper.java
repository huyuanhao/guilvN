package com.facebook.react.uimanager;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;

public class TransformHelper {
    public static ThreadLocal<double[]> sHelperMatrix = new ThreadLocal<double[]>() {
        /* class com.facebook.react.uimanager.TransformHelper.C08411 */

        @Override // java.lang.ThreadLocal
        public double[] initialValue() {
            return new double[16];
        }
    };

    public static double convertToRadians(ReadableMap readableMap, String str) {
        double d;
        boolean z = true;
        if (readableMap.getType(str) == ReadableType.String) {
            String string = readableMap.getString(str);
            if (string.endsWith("rad")) {
                string = string.substring(0, string.length() - 3);
            } else if (string.endsWith("deg")) {
                string = string.substring(0, string.length() - 3);
                z = false;
            }
            d = (double) Float.parseFloat(string);
        } else {
            d = readableMap.getDouble(str);
        }
        return z ? d : MatrixMathHelper.degreesToRadians(d);
    }

    public static void processTransform(ReadableArray readableArray, double[] dArr) {
        double[] dArr2 = sHelperMatrix.get();
        MatrixMathHelper.resetIdentityMatrix(dArr);
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = readableArray.getMap(i);
            String nextKey = map.keySetIterator().nextKey();
            MatrixMathHelper.resetIdentityMatrix(dArr2);
            if ("matrix".equals(nextKey)) {
                ReadableArray array = map.getArray(nextKey);
                for (int i2 = 0; i2 < 16; i2++) {
                    dArr2[i2] = array.getDouble(i2);
                }
            } else if ("perspective".equals(nextKey)) {
                MatrixMathHelper.applyPerspective(dArr2, map.getDouble(nextKey));
            } else if ("rotateX".equals(nextKey)) {
                MatrixMathHelper.applyRotateX(dArr2, convertToRadians(map, nextKey));
            } else if ("rotateY".equals(nextKey)) {
                MatrixMathHelper.applyRotateY(dArr2, convertToRadians(map, nextKey));
            } else if ("rotate".equals(nextKey) || "rotateZ".equals(nextKey)) {
                MatrixMathHelper.applyRotateZ(dArr2, convertToRadians(map, nextKey));
            } else if ("scale".equals(nextKey)) {
                double d = map.getDouble(nextKey);
                MatrixMathHelper.applyScaleX(dArr2, d);
                MatrixMathHelper.applyScaleY(dArr2, d);
            } else if (BaseViewManager.PROP_SCALE_X.equals(nextKey)) {
                MatrixMathHelper.applyScaleX(dArr2, map.getDouble(nextKey));
            } else if (BaseViewManager.PROP_SCALE_Y.equals(nextKey)) {
                MatrixMathHelper.applyScaleY(dArr2, map.getDouble(nextKey));
            } else {
                boolean equals = "translate".equals(nextKey);
                double d2 = AbstractC8352oOoOOoO0.OooO0O0;
                if (equals) {
                    ReadableArray array2 = map.getArray(nextKey);
                    double d3 = array2.getDouble(0);
                    double d4 = array2.getDouble(1);
                    if (array2.size() > 2) {
                        d2 = array2.getDouble(2);
                    }
                    MatrixMathHelper.applyTranslate3D(dArr2, d3, d4, d2);
                } else if (BaseViewManager.PROP_TRANSLATE_X.equals(nextKey)) {
                    MatrixMathHelper.applyTranslate2D(dArr2, map.getDouble(nextKey), AbstractC8352oOoOOoO0.OooO0O0);
                } else if (BaseViewManager.PROP_TRANSLATE_Y.equals(nextKey)) {
                    MatrixMathHelper.applyTranslate2D(dArr2, AbstractC8352oOoOOoO0.OooO0O0, map.getDouble(nextKey));
                } else if ("skewX".equals(nextKey)) {
                    MatrixMathHelper.applySkewX(dArr2, convertToRadians(map, nextKey));
                } else if ("skewY".equals(nextKey)) {
                    MatrixMathHelper.applySkewY(dArr2, convertToRadians(map, nextKey));
                } else {
                    throw new JSApplicationIllegalArgumentException("Unsupported transform type: " + nextKey);
                }
            }
            MatrixMathHelper.multiplyInto(dArr, dArr, dArr2);
        }
    }
}
