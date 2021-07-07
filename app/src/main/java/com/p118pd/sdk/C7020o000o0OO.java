package com.p118pd.sdk;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.C0045R;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o000o0OO  reason: case insensitive filesystem */
public final class C7020o000o0OO {
    public static final int OooO00o = 0;
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 2;

    public static Shader OooO00o(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return OooO00o(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static Shader OooO00o(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray OooO00o2 = C7022o000o0o.OooO00o(resources, theme, attributeSet, C0045R.styleable.OooO0Oo);
            float OooO00o3 = C7022o000o0o.OooO00o(OooO00o2, xmlPullParser, "startX", C0045R.styleable.GradientColor_android_startX, 0.0f);
            float OooO00o4 = C7022o000o0o.OooO00o(OooO00o2, xmlPullParser, "startY", C0045R.styleable.GradientColor_android_startY, 0.0f);
            float OooO00o5 = C7022o000o0o.OooO00o(OooO00o2, xmlPullParser, "endX", C0045R.styleable.GradientColor_android_endX, 0.0f);
            float OooO00o6 = C7022o000o0o.OooO00o(OooO00o2, xmlPullParser, "endY", C0045R.styleable.GradientColor_android_endY, 0.0f);
            float OooO00o7 = C7022o000o0o.OooO00o(OooO00o2, xmlPullParser, "centerX", C0045R.styleable.GradientColor_android_centerX, 0.0f);
            float OooO00o8 = C7022o000o0o.OooO00o(OooO00o2, xmlPullParser, "centerY", C0045R.styleable.GradientColor_android_centerY, 0.0f);
            int OooO0O02 = C7022o000o0o.OooO0O0(OooO00o2, xmlPullParser, "type", C0045R.styleable.GradientColor_android_type, 0);
            int OooO00o9 = C7022o000o0o.OooO00o(OooO00o2, xmlPullParser, "startColor", C0045R.styleable.GradientColor_android_startColor, 0);
            boolean OooO00o10 = C7022o000o0o.OooO00o(xmlPullParser, "centerColor");
            int OooO00o11 = C7022o000o0o.OooO00o(OooO00o2, xmlPullParser, "centerColor", C0045R.styleable.GradientColor_android_centerColor, 0);
            int OooO00o12 = C7022o000o0o.OooO00o(OooO00o2, xmlPullParser, "endColor", C0045R.styleable.GradientColor_android_endColor, 0);
            int OooO0O03 = C7022o000o0o.OooO0O0(OooO00o2, xmlPullParser, "tileMode", C0045R.styleable.GradientColor_android_tileMode, 0);
            float OooO00o13 = C7022o000o0o.OooO00o(OooO00o2, xmlPullParser, "gradientRadius", C0045R.styleable.GradientColor_android_gradientRadius, 0.0f);
            OooO00o2.recycle();
            OooO00o OooO00o14 = OooO00o(m18281OooO00o(resources, xmlPullParser, attributeSet, theme), OooO00o9, OooO00o12, OooO00o10, OooO00o11);
            if (OooO0O02 != 1) {
                if (OooO0O02 != 2) {
                    return new LinearGradient(OooO00o3, OooO00o4, OooO00o5, OooO00o6, OooO00o14.f19289OooO00o, OooO00o14.OooO00o, OooO00o(OooO0O03));
                }
                return new SweepGradient(OooO00o7, OooO00o8, OooO00o14.f19289OooO00o, OooO00o14.OooO00o);
            } else if (OooO00o13 > 0.0f) {
                return new RadialGradient(OooO00o7, OooO00o8, OooO00o13, OooO00o14.f19289OooO00o, OooO00o14.OooO00o, OooO00o(OooO0O03));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* renamed from: com.pd.sdk.o000o0OO$OooO00o */
    public static final class OooO00o {
        public final float[] OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final int[] f19289OooO00o;

        public OooO00o(@NonNull List<Integer> list, @NonNull List<Float> list2) {
            int size = list.size();
            this.f19289OooO00o = new int[size];
            this.OooO00o = new float[size];
            for (int i = 0; i < size; i++) {
                this.f19289OooO00o[i] = list.get(i).intValue();
                this.OooO00o[i] = list2.get(i).floatValue();
            }
        }

        public OooO00o(@ColorInt int i, @ColorInt int i2) {
            this.f19289OooO00o = new int[]{i, i2};
            this.OooO00o = new float[]{0.0f, 1.0f};
        }

        public OooO00o(@ColorInt int i, @ColorInt int i2, @ColorInt int i3) {
            this.f19289OooO00o = new int[]{i, i2, i3};
            this.OooO00o = new float[]{0.0f, 0.5f, 1.0f};
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0089, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' " + "attribute!");
     */
    /* renamed from: OooO00o  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p118pd.sdk.C7020o000o0OO.OooO00o m18281OooO00o(@androidx.annotation.NonNull android.content.res.Resources r8, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r9, @androidx.annotation.NonNull android.util.AttributeSet r10, @androidx.annotation.Nullable android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7020o000o0OO.m18281OooO00o(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):com.pd.sdk.o000o0OO$OooO00o");
    }

    public static OooO00o OooO00o(@Nullable OooO00o oooO00o, @ColorInt int i, @ColorInt int i2, boolean z, @ColorInt int i3) {
        if (oooO00o != null) {
            return oooO00o;
        }
        if (z) {
            return new OooO00o(i, i3, i2);
        }
        return new OooO00o(i, i2);
    }

    public static Shader.TileMode OooO00o(int i) {
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }
}
