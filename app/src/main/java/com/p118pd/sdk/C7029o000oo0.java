package com.p118pd.sdk;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.umeng.message.proguard.C3848l;
import java.util.Objects;

/* renamed from: com.pd.sdk.o000oo0  reason: case insensitive filesystem */
public final class C7029o000oo0 {
    public static final double OooO00o = 95.047d;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int f19293OooO00o = 10;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final ThreadLocal<double[]> f19294OooO00o = new ThreadLocal<>();
    public static final double OooO0O0 = 100.0d;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int f19295OooO0O0 = 1;
    public static final double OooO0OO = 108.883d;
    public static final double OooO0Oo = 0.008856d;
    public static final double OooO0o0 = 903.3d;

    public static int OooO00o(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    @NonNull
    @RequiresApi(26)
    public static Color OooO00o(@NonNull Color color, @NonNull Color color2) {
        if (Objects.equals(color.getModel(), color2.getModel())) {
            if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                color = color.convert(color2.getColorSpace());
            }
            float[] components = color.getComponents();
            float[] components2 = color2.getComponents();
            float alpha = color.alpha();
            float alpha2 = color2.alpha() * (1.0f - alpha);
            int componentCount = color2.getComponentCount() - 1;
            components2[componentCount] = alpha + alpha2;
            if (components2[componentCount] > 0.0f) {
                alpha /= components2[componentCount];
                alpha2 /= components2[componentCount];
            }
            for (int i = 0; i < componentCount; i++) {
                components2[i] = (components[i] * alpha) + (components2[i] * alpha2);
            }
            return Color.valueOf(components2, color2.getColorSpace());
        }
        throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + C3848l.f10402t);
    }

    public static float OooO0O0(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static int OooO0O0(@ColorInt int i, @ColorInt int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int OooO00o2 = m18292OooO00o(alpha2, alpha);
        return Color.argb(OooO00o2, OooO00o(Color.red(i), alpha2, Color.red(i2), alpha, OooO00o2), OooO00o(Color.green(i), alpha2, Color.green(i2), alpha, OooO00o2), OooO00o(Color.blue(i), alpha2, Color.blue(i2), alpha, OooO00o2));
    }

    @ColorInt
    public static int OooO0OO(@ColorInt int i, @IntRange(from = 0, mo605to = 255) int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    public static int OooO0O0(@ColorInt int i, @ColorInt int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = (double) f;
            if (OooO00o(OooO0OO(i, 255), i2) < d) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                if (OooO00o(OooO0OO(i, i6), i2) < d) {
                    i4 = i6;
                } else {
                    i3 = i6;
                }
            }
            return i3;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int m18292OooO00o(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    public static int OooO00o(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    @FloatRange(from = AbstractC8352oOoOOoO0.OooO0O0, mo599to = 1.0d)
    public static double OooO00o(@ColorInt int i) {
        double[] OooO00o2 = OooO00o();
        OooO0O0(i, OooO00o2);
        return OooO00o2[1] / 100.0d;
    }

    public static void OooO0O0(@ColorInt int i, @NonNull double[] dArr) {
        OooO0O0(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    public static double OooO00o(@ColorInt int i, @ColorInt int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = OooO0O0(i, i2);
            }
            double OooO00o2 = OooO00o(i) + 0.05d;
            double OooO00o3 = OooO00o(i2) + 0.05d;
            return Math.max(OooO00o2, OooO00o3) / Math.min(OooO00o2, OooO00o3);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    public static void OooO0O0(@IntRange(from = 0, mo605to = 255) int i, @IntRange(from = 0, mo605to = 255) int i2, @IntRange(from = 0, mo605to = 255) int i3, @NonNull double[] dArr) {
        double d;
        double d2;
        double d3;
        if (dArr.length == 3) {
            double d4 = (double) i;
            Double.isNaN(d4);
            double d5 = d4 / 255.0d;
            if (d5 < 0.04045d) {
                d = d5 / 12.92d;
            } else {
                d = Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            }
            double d6 = (double) i2;
            Double.isNaN(d6);
            double d7 = d6 / 255.0d;
            if (d7 < 0.04045d) {
                d2 = d7 / 12.92d;
            } else {
                d2 = Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
            }
            double d8 = (double) i3;
            Double.isNaN(d8);
            double d9 = d8 / 255.0d;
            if (d9 < 0.04045d) {
                d3 = d9 / 12.92d;
            } else {
                d3 = Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.4124d * d) + (0.3576d * d2) + (0.1805d * d3)) * 100.0d;
            dArr[1] = ((0.2126d * d) + (0.7152d * d2) + (0.0722d * d3)) * 100.0d;
            dArr[2] = ((d * 0.0193d) + (d2 * 0.1192d) + (d3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static void OooO00o(@IntRange(from = 0, mo605to = 255) int i, @IntRange(from = 0, mo605to = 255) int i2, @IntRange(from = 0, mo605to = 255) int i3, @NonNull float[] fArr) {
        float f;
        float f2;
        float f3 = ((float) i) / 255.0f;
        float f4 = ((float) i2) / 255.0f;
        float f5 = ((float) i3) / 255.0f;
        float max = Math.max(f3, Math.max(f4, f5));
        float min = Math.min(f3, Math.min(f4, f5));
        float f6 = max - min;
        float f7 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            f2 = 0.0f;
        } else {
            f = max == f3 ? ((f4 - f5) / f6) % 6.0f : max == f4 ? ((f5 - f3) / f6) + 2.0f : 4.0f + ((f3 - f4) / f6);
            f2 = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = (f * 60.0f) % 360.0f;
        if (f8 < 0.0f) {
            f8 += 360.0f;
        }
        fArr[0] = OooO0O0(f8, 0.0f, 360.0f);
        fArr[1] = OooO0O0(f2, 0.0f, 1.0f);
        fArr[2] = OooO0O0(f7, 0.0f, 1.0f);
    }

    public static void OooO0O0(@FloatRange(from = 0.0d, mo599to = 95.047d) double d, @FloatRange(from = 0.0d, mo599to = 100.0d) double d2, @FloatRange(from = 0.0d, mo599to = 108.883d) double d3, @NonNull double[] dArr) {
        if (dArr.length == 3) {
            double OooO00o2 = OooO00o(d / 95.047d);
            double OooO00o3 = OooO00o(d2 / 100.0d);
            double OooO00o4 = OooO00o(d3 / 108.883d);
            dArr[0] = Math.max((double) AbstractC8352oOoOOoO0.OooO0O0, (116.0d * OooO00o3) - 16.0d);
            dArr[1] = (OooO00o2 - OooO00o3) * 500.0d;
            dArr[2] = (OooO00o3 - OooO00o4) * 200.0d;
            return;
        }
        throw new IllegalArgumentException("outLab must have a length of 3.");
    }

    public static void OooO00o(@ColorInt int i, @NonNull float[] fArr) {
        OooO00o(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    @ColorInt
    public static int OooO00o(@NonNull float[] fArr) {
        int i;
        int i2;
        int i3;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float abs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                i3 = Math.round((abs + f4) * 255.0f);
                i2 = Math.round((abs2 + f4) * 255.0f);
                i = Math.round(f4 * 255.0f);
                break;
            case 1:
                i3 = Math.round((abs2 + f4) * 255.0f);
                i2 = Math.round((abs + f4) * 255.0f);
                i = Math.round(f4 * 255.0f);
                break;
            case 2:
                i3 = Math.round(f4 * 255.0f);
                i2 = Math.round((abs + f4) * 255.0f);
                i = Math.round((abs2 + f4) * 255.0f);
                break;
            case 3:
                i3 = Math.round(f4 * 255.0f);
                i2 = Math.round((abs2 + f4) * 255.0f);
                i = Math.round((abs + f4) * 255.0f);
                break;
            case 4:
                i3 = Math.round((abs2 + f4) * 255.0f);
                i2 = Math.round(f4 * 255.0f);
                i = Math.round((abs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                i3 = Math.round((abs + f4) * 255.0f);
                i2 = Math.round(f4 * 255.0f);
                i = Math.round((abs2 + f4) * 255.0f);
                break;
            default:
                i = 0;
                i3 = 0;
                i2 = 0;
                break;
        }
        return Color.rgb(OooO00o(i3, 0, 255), OooO00o(i2, 0, 255), OooO00o(i, 0, 255));
    }

    @ColorInt
    public static int OooO0O0(@FloatRange(from = 0.0d, mo599to = 95.047d) double d, @FloatRange(from = 0.0d, mo599to = 100.0d) double d2, @FloatRange(from = 0.0d, mo599to = 108.883d) double d3) {
        double d4 = (((3.2406d * d) + (-1.5372d * d2)) + (-0.4986d * d3)) / 100.0d;
        double d5 = (((-0.9689d * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + (-0.204d * d2)) + (1.057d * d3)) / 100.0d;
        return Color.rgb(OooO00o((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d), 0, 255), OooO00o((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, 255), OooO00o((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, 255));
    }

    public static void OooO00o(@ColorInt int i, @NonNull double[] dArr) {
        OooO00o(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    public static void OooO00o(@IntRange(from = 0, mo605to = 255) int i, @IntRange(from = 0, mo605to = 255) int i2, @IntRange(from = 0, mo605to = 255) int i3, @NonNull double[] dArr) {
        OooO0O0(i, i2, i3, dArr);
        OooO0O0(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void OooO00o(@FloatRange(from = 0.0d, mo599to = 100.0d) double d, @FloatRange(from = -128.0d, mo599to = 127.0d) double d2, @FloatRange(from = -128.0d, mo599to = 127.0d) double d3, @NonNull double[] dArr) {
        double d4 = (d + 16.0d) / 116.0d;
        double d5 = (d2 / 500.0d) + d4;
        double d6 = d4 - (d3 / 200.0d);
        double pow = Math.pow(d5, 3.0d);
        if (pow <= 0.008856d) {
            pow = ((d5 * 116.0d) - 16.0d) / 903.3d;
        }
        double pow2 = d > 7.9996247999999985d ? Math.pow(d4, 3.0d) : d / 903.3d;
        double pow3 = Math.pow(d6, 3.0d);
        if (pow3 <= 0.008856d) {
            pow3 = ((d6 * 116.0d) - 16.0d) / 903.3d;
        }
        dArr[0] = pow * 95.047d;
        dArr[1] = pow2 * 100.0d;
        dArr[2] = pow3 * 108.883d;
    }

    @ColorInt
    public static int OooO00o(@FloatRange(from = 0.0d, mo599to = 100.0d) double d, @FloatRange(from = -128.0d, mo599to = 127.0d) double d2, @FloatRange(from = -128.0d, mo599to = 127.0d) double d3) {
        double[] OooO00o2 = OooO00o();
        OooO00o(d, d2, d3, OooO00o2);
        return OooO0O0(OooO00o2[0], OooO00o2[1], OooO00o2[2]);
    }

    public static double OooO00o(@NonNull double[] dArr, @NonNull double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[0] - dArr2[0], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    public static double OooO00o(double d) {
        return d > 0.008856d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.3d) + 16.0d) / 116.0d;
    }

    @ColorInt
    public static int OooO00o(@ColorInt int i, @ColorInt int i2, @FloatRange(from = 0.0d, mo599to = 1.0d) float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    public static void OooO00o(@NonNull float[] fArr, @NonNull float[] fArr2, @FloatRange(from = 0.0d, mo599to = 1.0d) float f, @NonNull float[] fArr3) {
        if (fArr3.length == 3) {
            float f2 = 1.0f - f;
            fArr3[0] = OooO00o(fArr[0], fArr2[0], f);
            fArr3[1] = (fArr[1] * f2) + (fArr2[1] * f);
            fArr3[2] = (fArr[2] * f2) + (fArr2[2] * f);
            return;
        }
        throw new IllegalArgumentException("result must have a length of 3.");
    }

    public static void OooO00o(@NonNull double[] dArr, @NonNull double[] dArr2, @FloatRange(from = 0.0d, mo599to = 1.0d) double d, @NonNull double[] dArr3) {
        if (dArr3.length == 3) {
            double d2 = 1.0d - d;
            dArr3[0] = (dArr[0] * d2) + (dArr2[0] * d);
            dArr3[1] = (dArr[1] * d2) + (dArr2[1] * d);
            dArr3[2] = (dArr[2] * d2) + (dArr2[2] * d);
            return;
        }
        throw new IllegalArgumentException("outResult must have a length of 3.");
    }

    @VisibleForTesting
    public static float OooO00o(float f, float f2, float f3) {
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > f) {
                f += 360.0f;
            } else {
                f2 += 360.0f;
            }
        }
        return (f + ((f2 - f) * f3)) % 360.0f;
    }

    public static double[] OooO00o() {
        double[] dArr = f19294OooO00o.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        f19294OooO00o.set(dArr2);
        return dArr2;
    }
}
