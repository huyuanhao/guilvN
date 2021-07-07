package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import com.xiaomi.mipush.sdk.Constants;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o0O0OOO0  reason: case insensitive filesystem */
public class animation.InterpolatorC7302o0O0OOO0 implements Interpolator {
    public static final double OooO00o = 1.0E-5d;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final float f19981OooO00o = 0.002f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int f19982OooO00o = 3000;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float[] f19983OooO00o;
    public float[] OooO0O0;

    public animation.InterpolatorC7302o0O0OOO0(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private void OooO00o(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C7022o000o0o.OooO00o(xmlPullParser, "pathData")) {
            String OooO00o2 = C7022o000o0o.m18284OooO00o(typedArray, xmlPullParser, "pathData", 4);
            Path OooO00o3 = C7032o000oo0o.OooO00o(OooO00o2);
            if (OooO00o3 != null) {
                OooO00o(OooO00o3);
                return;
            }
            throw new InflateException("The path is null, which is created from " + OooO00o2);
        } else if (!C7022o000o0o.OooO00o(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C7022o000o0o.OooO00o(xmlPullParser, "controlY1")) {
            float OooO00o4 = C7022o000o0o.OooO00o(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float OooO00o5 = C7022o000o0o.OooO00o(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean OooO00o6 = C7022o000o0o.OooO00o(xmlPullParser, "controlX2");
            if (OooO00o6 != C7022o000o0o.OooO00o(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!OooO00o6) {
                OooO00o(OooO00o4, OooO00o5);
            } else {
                OooO00o(OooO00o4, OooO00o5, C7022o000o0o.OooO00o(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C7022o000o0o.OooO00o(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f19983OooO00o.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f19983OooO00o[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f19983OooO00o;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.OooO0O0[i];
        }
        float[] fArr2 = this.OooO0O0;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }

    public animation.InterpolatorC7302o0O0OOO0(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray OooO00o2 = C7022o000o0o.OooO00o(resources, theme, attributeSet, C7296o0O0O0oO.f19978OooOO0o);
        OooO00o(OooO00o2, xmlPullParser);
        OooO00o2.recycle();
    }

    private void OooO00o(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        OooO00o(path);
    }

    private void OooO00o(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        OooO00o(path);
    }

    private void OooO00o(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f19983OooO00o = new float[min];
            this.OooO0O0 = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, null);
                this.f19983OooO00o[i2] = fArr[0];
                this.OooO0O0[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f19983OooO00o[0])) <= 1.0E-5d && ((double) Math.abs(this.OooO0O0[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f19983OooO00o[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.OooO0O0[i3] - 1.0f)) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.f19983OooO00o;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.f19983OooO00o[0]);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(this.OooO0O0[0]);
            sb.append(" end:");
            int i6 = min - 1;
            sb.append(this.f19983OooO00o[i6]);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(this.OooO0O0[i6]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }
}
