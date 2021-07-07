package com.p118pd.sdk;

import android.annotation.TargetApi;
import java.util.Arrays;

/* renamed from: com.pd.sdk.oOOoOoO  reason: case insensitive filesystem */
public class C8228oOOoOoO {

    /* renamed from: com.pd.sdk.oOOoOoO$OooO00o */
    public class OooO00o {
        public float OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public float[] f21345OooO00o;
        public float OooO0O0;
        public float OooO0OO;
        public float OooO0Oo;
        public float OooO0o0;

        public OooO00o(float f, float f2, float f3, float f4) {
            float f5 = f - f3;
            this.OooO0OO = f5;
            float f6 = f2 - f4;
            this.OooO0Oo = f6;
            this.OooO00o = f * f4;
            this.OooO0O0 = f3 * f2;
            this.OooO0o0 = (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
            this.f21345OooO00o = new float[]{f, f2, f3, f4};
        }

        public float OooO00o(float f, float f2) {
            return Math.abs((((this.OooO0Oo * f) - (this.OooO0OO * f2)) + this.OooO00o) - this.OooO0O0) / this.OooO0o0;
        }

        public float[] OooO00o() {
            return this.f21345OooO00o;
        }
    }

    @TargetApi(9)
    public float[] OooO00o(float[] fArr, float f) {
        OooO00o oooO00o = new OooO00o(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1]);
        float f2 = 0.0f;
        int i = 0;
        for (int i2 = 2; i2 < fArr.length - 2; i2 += 2) {
            float OooO00o2 = oooO00o.OooO00o(fArr[i2], fArr[i2 + 1]);
            if (OooO00o2 > f2) {
                i = i2;
                f2 = OooO00o2;
            }
        }
        if (f2 <= f) {
            return oooO00o.OooO00o();
        }
        float[] OooO00o3 = OooO00o(Arrays.copyOfRange(fArr, 0, i + 2), f);
        float[] OooO00o4 = OooO00o(Arrays.copyOfRange(fArr, i, fArr.length), f);
        return OooO00o(OooO00o3, Arrays.copyOfRange(OooO00o4, 2, OooO00o4.length));
    }

    public float[] OooO00o(float[]... fArr) {
        int i = 0;
        for (float[] fArr2 : fArr) {
            i += fArr2.length;
        }
        float[] fArr3 = new float[i];
        int i2 = 0;
        for (float[] fArr4 : fArr) {
            for (float f : fArr4) {
                fArr3[i2] = f;
                i2++;
            }
        }
        return fArr3;
    }
}
