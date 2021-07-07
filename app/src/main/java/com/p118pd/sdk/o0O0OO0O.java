package com.p118pd.sdk;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.AnimatorRes;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.C7032o000oo0o;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o0O0OO0O */
public class o0O0OO0O {
    public static final int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f19979OooO00o = "AnimatorInflater";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final boolean f19980OooO00o = false;
    public static final int OooO0O0 = 100;
    public static final int OooO0OO = 0;
    public static final int OooO0Oo = 1;
    public static final int OooO0o = 3;
    public static final int OooO0o0 = 2;
    public static final int OooO0oO = 4;

    /* renamed from: com.pd.sdk.o0O0OO0O$OooO00o */
    public static class OooO00o implements TypeEvaluator<C7032o000oo0o.OooO0O0[]> {
        public C7032o000oo0o.OooO0O0[] OooO00o;

        public OooO00o() {
        }

        /* renamed from: OooO00o */
        public C7032o000oo0o.OooO0O0[] evaluate(float f, C7032o000oo0o.OooO0O0[] oooO0O0Arr, C7032o000oo0o.OooO0O0[] oooO0O0Arr2) {
            if (C7032o000oo0o.m18294OooO00o(oooO0O0Arr, oooO0O0Arr2)) {
                C7032o000oo0o.OooO0O0[] oooO0O0Arr3 = this.OooO00o;
                if (oooO0O0Arr3 == null || !C7032o000oo0o.m18294OooO00o(oooO0O0Arr3, oooO0O0Arr)) {
                    this.OooO00o = C7032o000oo0o.OooO00o(oooO0O0Arr);
                }
                for (int i = 0; i < oooO0O0Arr.length; i++) {
                    this.OooO00o[i].OooO00o(oooO0O0Arr[i], oooO0O0Arr2[i], f);
                }
                return this.OooO00o;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }

        public OooO00o(C7032o000oo0o.OooO0O0[] oooO0O0Arr) {
            this.OooO00o = oooO0O0Arr;
        }
    }

    public static Animator OooO00o(Context context, @AnimatorRes int i) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        return OooO00o(context, context.getResources(), context.getTheme(), i);
    }

    public static boolean OooO00o(int i) {
        return i >= 28 && i <= 31;
    }

    public static Animator OooO00o(Context context, Resources resources, Resources.Theme theme, @AnimatorRes int i) throws Resources.NotFoundException {
        return OooO00o(context, resources, theme, i, 1.0f);
    }

    public static Animator OooO00o(Context context, Resources resources, Resources.Theme theme, @AnimatorRes int i, float f) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = resources.getAnimation(i);
            Animator OooO00o2 = OooO00o(context, resources, theme, xmlResourceParser, f);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            return OooO00o2;
        } catch (XmlPullParserException e) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (IOException e2) {
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException2.initCause(e2);
            throw notFoundException2;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    public static PropertyValuesHolder OooO00o(TypedArray typedArray, int i, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6;
        PropertyValuesHolder propertyValuesHolder;
        float f;
        float f2;
        float f3;
        PropertyValuesHolder propertyValuesHolder2;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i7 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i8 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((!z || !OooO00o(i7)) && (!z2 || !OooO00o(i8))) ? 0 : 3;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder3 = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C7032o000oo0o.OooO0O0[] OooO00o2 = C7032o000oo0o.m18296OooO00o(string);
            C7032o000oo0o.OooO0O0[] OooO00o3 = C7032o000oo0o.m18296OooO00o(string2);
            if (OooO00o2 == null && OooO00o3 == null) {
                return null;
            }
            if (OooO00o2 != null) {
                OooO00o oooO00o = new OooO00o();
                if (OooO00o3 == null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, oooO00o, OooO00o2);
                } else if (C7032o000oo0o.m18294OooO00o(OooO00o2, OooO00o3)) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, oooO00o, OooO00o2, OooO00o3);
                } else {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                return propertyValuesHolder2;
            } else if (OooO00o3 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, new OooO00o(), OooO00o3);
            }
        } else {
            C7298o0O0OO OooO00o4 = i == 3 ? C7298o0O0OO.OooO00o() : null;
            if (z3) {
                if (z) {
                    if (i7 == 5) {
                        f2 = typedArray.getDimension(i2, 0.0f);
                    } else {
                        f2 = typedArray.getFloat(i2, 0.0f);
                    }
                    if (z2) {
                        if (i8 == 5) {
                            f3 = typedArray.getDimension(i3, 0.0f);
                        } else {
                            f3 = typedArray.getFloat(i3, 0.0f);
                        }
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f2, f3);
                    } else {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f2);
                    }
                } else {
                    if (i8 == 5) {
                        f = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f = typedArray.getFloat(i3, 0.0f);
                    }
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f);
                }
                propertyValuesHolder3 = propertyValuesHolder;
            } else if (z) {
                if (i7 == 5) {
                    i5 = (int) typedArray.getDimension(i2, 0.0f);
                } else if (OooO00o(i7)) {
                    i5 = typedArray.getColor(i2, 0);
                } else {
                    i5 = typedArray.getInt(i2, 0);
                }
                if (z2) {
                    if (i8 == 5) {
                        i6 = (int) typedArray.getDimension(i3, 0.0f);
                    } else if (OooO00o(i8)) {
                        i6 = typedArray.getColor(i3, 0);
                    } else {
                        i6 = typedArray.getInt(i3, 0);
                    }
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, i5, i6);
                } else {
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, i5);
                }
            } else if (z2) {
                if (i8 == 5) {
                    i4 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (OooO00o(i8)) {
                    i4 = typedArray.getColor(i3, 0);
                } else {
                    i4 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, i4);
            }
            if (propertyValuesHolder3 == null || OooO00o4 == null) {
                return propertyValuesHolder3;
            }
            propertyValuesHolder3.setEvaluator(OooO00o4);
            return propertyValuesHolder3;
        }
    }

    public static void OooO00o(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long OooO0O02 = (long) C7022o000o0o.OooO0O0(typedArray, xmlPullParser, "duration", 1, 300);
        long OooO0O03 = (long) C7022o000o0o.OooO0O0(typedArray, xmlPullParser, "startOffset", 2, 0);
        int OooO0O04 = C7022o000o0o.OooO0O0(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C7022o000o0o.OooO00o(xmlPullParser, "valueFrom") && C7022o000o0o.OooO00o(xmlPullParser, "valueTo")) {
            if (OooO0O04 == 4) {
                OooO0O04 = OooO00o(typedArray, 5, 6);
            }
            PropertyValuesHolder OooO00o2 = OooO00o(typedArray, OooO0O04, 5, 6, "");
            if (OooO00o2 != null) {
                valueAnimator.setValues(OooO00o2);
            }
        }
        valueAnimator.setDuration(OooO0O02);
        valueAnimator.setStartDelay(OooO0O03);
        valueAnimator.setRepeatCount(C7022o000o0o.OooO0O0(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C7022o000o0o.OooO0O0(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            OooO00o(valueAnimator, typedArray2, OooO0O04, f, xmlPullParser);
        }
    }

    public static void OooO00o(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String OooO00o2 = C7022o000o0o.m18284OooO00o(typedArray, xmlPullParser, "pathData", 1);
        if (OooO00o2 != null) {
            String OooO00o3 = C7022o000o0o.m18284OooO00o(typedArray, xmlPullParser, "propertyXName", 2);
            String OooO00o4 = C7022o000o0o.m18284OooO00o(typedArray, xmlPullParser, "propertyYName", 3);
            if (i != 2) {
            }
            if (OooO00o3 == null && OooO00o4 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            OooO00o(C7032o000oo0o.OooO00o(OooO00o2), objectAnimator, f * 0.5f, OooO00o3, OooO00o4);
            return;
        }
        objectAnimator.setPropertyName(C7022o000o0o.m18284OooO00o(typedArray, xmlPullParser, "propertyName", 0));
    }

    public static void OooO00o(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / ((float) (min - 1));
        int i = 0;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, propertyValuesHolder);
        }
    }

    public static Animator OooO00o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) throws XmlPullParserException, IOException {
        return OooO00o(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: android.animation.AnimatorSet */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator OooO00o(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.o0O0OO0O.OooO00o(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.PropertyValuesHolder[] OooO00o(android.content.Context r17, android.content.res.Resources r18, android.content.res.Resources.Theme r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.o0O0OO0O.OooO00o(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }

    public static int OooO00o(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray OooO00o2 = C7022o000o0o.OooO00o(resources, theme, attributeSet, C7296o0O0O0oO.f19976OooOO0);
        int i = 0;
        TypedValue OooO00o3 = C7022o000o0o.OooO00o(OooO00o2, xmlPullParser, "value", 0);
        if ((OooO00o3 != null) && OooO00o(OooO00o3.type)) {
            i = 3;
        }
        OooO00o2.recycle();
        return i;
    }

    public static int OooO00o(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = true;
        boolean z2 = peekValue != null;
        int i3 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        if (peekValue2 == null) {
            z = false;
        }
        int i4 = z ? peekValue2.type : 0;
        if ((!z2 || !OooO00o(i3)) && (!z || !OooO00o(i4))) {
            return 0;
        }
        return 3;
    }

    public static void OooO00o(Object[] objArr, String str) {
        if (!(objArr == null || objArr.length == 0)) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Keyframe keyframe = (Keyframe) objArr[i];
                StringBuilder sb = new StringBuilder();
                sb.append("Keyframe ");
                sb.append(i);
                sb.append(": fraction ");
                Object obj = "null";
                sb.append(keyframe.getFraction() < 0.0f ? obj : Float.valueOf(keyframe.getFraction()));
                sb.append(", ");
                sb.append(", value : ");
                if (keyframe.hasValue()) {
                    obj = keyframe.getValue();
                }
                sb.append(obj);
                sb.toString();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.PropertyValuesHolder OooO00o(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, int r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.o0O0OO0O.OooO00o(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, java.lang.String, int):android.animation.PropertyValuesHolder");
    }

    public static Keyframe OooO00o(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    public static void OooO00o(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    public static Keyframe OooO00o(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Keyframe keyframe;
        TypedArray OooO00o2 = C7022o000o0o.OooO00o(resources, theme, attributeSet, C7296o0O0O0oO.f19976OooOO0);
        float OooO00o3 = C7022o000o0o.OooO00o(OooO00o2, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue OooO00o4 = C7022o000o0o.OooO00o(OooO00o2, xmlPullParser, "value", 0);
        boolean z = OooO00o4 != null;
        if (i == 4) {
            i = (!z || !OooO00o(OooO00o4.type)) ? 0 : 3;
        }
        if (z) {
            if (i == 0) {
                keyframe = Keyframe.ofFloat(OooO00o3, C7022o000o0o.OooO00o(OooO00o2, xmlPullParser, "value", 0, 0.0f));
            } else if (i == 1 || i == 3) {
                keyframe = Keyframe.ofInt(OooO00o3, C7022o000o0o.OooO0O0(OooO00o2, xmlPullParser, "value", 0, 0));
            } else {
                keyframe = null;
            }
        } else if (i == 0) {
            keyframe = Keyframe.ofFloat(OooO00o3);
        } else {
            keyframe = Keyframe.ofInt(OooO00o3);
        }
        int OooO0OO2 = C7022o000o0o.OooO0OO(OooO00o2, xmlPullParser, "interpolator", 1, 0);
        if (OooO0OO2 > 0) {
            keyframe.setInterpolator(C7299o0O0OO0.OooO00o(context, OooO0OO2));
        }
        OooO00o2.recycle();
        return keyframe;
    }

    public static ObjectAnimator OooO00o(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        OooO00o(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    public static ValueAnimator OooO00o(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray OooO00o2 = C7022o000o0o.OooO00o(resources, theme, attributeSet, C7296o0O0O0oO.f19974OooO0oO);
        TypedArray OooO00o3 = C7022o000o0o.OooO00o(resources, theme, attributeSet, C7296o0O0O0oO.f19977OooOO0O);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        OooO00o(valueAnimator, OooO00o2, OooO00o3, f, xmlPullParser);
        int OooO0OO2 = C7022o000o0o.OooO0OO(OooO00o2, xmlPullParser, "interpolator", 0, 0);
        if (OooO0OO2 > 0) {
            valueAnimator.setInterpolator(C7299o0O0OO0.OooO00o(context, OooO0OO2));
        }
        OooO00o2.recycle();
        if (OooO00o3 != null) {
            OooO00o3.recycle();
        }
        return valueAnimator;
    }
}
