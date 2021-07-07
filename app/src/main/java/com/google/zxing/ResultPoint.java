package com.google.zxing;

import com.google.zxing.common.detector.MathUtils;
import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1299b;
import com.umeng.message.proguard.C3848l;

public class ResultPoint {

    /* renamed from: x */
    public final float f1012x;

    /* renamed from: y */
    public final float f1013y;

    public ResultPoint(float f, float f2) {
        this.f1012x = f;
        this.f1013y = f2;
    }

    public static float crossProductZ(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        float f = resultPoint2.f1012x;
        float f2 = resultPoint2.f1013y;
        return ((resultPoint3.f1012x - f) * (resultPoint.f1013y - f2)) - ((resultPoint3.f1013y - f2) * (resultPoint.f1012x - f));
    }

    public static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.f1012x, resultPoint.f1013y, resultPoint2.f1012x, resultPoint2.f1013y);
    }

    public static void orderBestPatterns(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        float distance = distance(resultPointArr[0], resultPointArr[1]);
        float distance2 = distance(resultPointArr[1], resultPointArr[2]);
        float distance3 = distance(resultPointArr[0], resultPointArr[2]);
        if (distance2 >= distance && distance2 >= distance3) {
            resultPoint3 = resultPointArr[0];
            resultPoint2 = resultPointArr[1];
            resultPoint = resultPointArr[2];
        } else if (distance3 < distance2 || distance3 < distance) {
            resultPoint3 = resultPointArr[2];
            resultPoint2 = resultPointArr[0];
            resultPoint = resultPointArr[1];
        } else {
            resultPoint3 = resultPointArr[1];
            resultPoint2 = resultPointArr[0];
            resultPoint = resultPointArr[2];
        }
        if (crossProductZ(resultPoint2, resultPoint3, resultPoint) < 0.0f) {
            resultPoint = resultPoint2;
            resultPoint2 = resultPoint;
        }
        resultPointArr[0] = resultPoint2;
        resultPointArr[1] = resultPoint3;
        resultPointArr[2] = resultPoint;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ResultPoint) {
            ResultPoint resultPoint = (ResultPoint) obj;
            if (this.f1012x == resultPoint.f1012x && this.f1013y == resultPoint.f1013y) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final float getX() {
        return this.f1012x;
    }

    public final float getY() {
        return this.f1013y;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f1012x) * 31) + Float.floatToIntBits(this.f1013y);
    }

    public final String toString() {
        return C3848l.f10401s + this.f1012x + AbstractC1299b.COMMA + this.f1013y + ')';
    }
}
