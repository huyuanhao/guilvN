package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o000o0o  reason: case insensitive filesystem */
public class C7022o000o0o {
    public static final String OooO00o = "http://schemas.android.com/apk/res/android";

    public static boolean OooO00o(@NonNull XmlPullParser xmlPullParser, @NonNull String str) {
        return xmlPullParser.getAttributeValue(OooO00o, str) != null;
    }

    public static int OooO0O0(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, int i2) {
        if (!OooO00o(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    @AnyRes
    public static int OooO0OO(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, @AnyRes int i2) {
        if (!OooO00o(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getResourceId(i, i2);
    }

    public static float OooO00o(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, float f) {
        if (!OooO00o(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    @AnyRes
    public static int OooO0O0(@NonNull TypedArray typedArray, @StyleableRes int i, @StyleableRes int i2, @AnyRes int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static boolean OooO00o(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, boolean z) {
        if (!OooO00o(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    @ColorInt
    public static int OooO00o(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, @ColorInt int i2) {
        if (!OooO00o(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    public static C7019o000o0O0 OooO00o(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme, @NonNull String str, @StyleableRes int i, @ColorInt int i2) {
        if (OooO00o(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C7019o000o0O0.OooO00o(typedValue.data);
            }
            C7019o000o0O0 OooO0O0 = C7019o000o0O0.OooO0O0(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (OooO0O0 != null) {
                return OooO0O0;
            }
        }
        return C7019o000o0O0.OooO00o(i2);
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m18284OooO00o(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i) {
        if (!OooO00o(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    @Nullable
    public static TypedValue OooO00o(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, int i) {
        if (!OooO00o(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }

    @NonNull
    public static TypedArray OooO00o(@NonNull Resources resources, @Nullable Resources.Theme theme, @NonNull AttributeSet attributeSet, @NonNull int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static boolean OooO00o(@NonNull TypedArray typedArray, @StyleableRes int i, @StyleableRes int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    @Nullable
    public static Drawable OooO00o(@NonNull TypedArray typedArray, @StyleableRes int i, @StyleableRes int i2) {
        Drawable drawable = typedArray.getDrawable(i);
        return drawable == null ? typedArray.getDrawable(i2) : drawable;
    }

    public static int OooO00o(@NonNull TypedArray typedArray, @StyleableRes int i, @StyleableRes int i2, int i3) {
        return typedArray.getInt(i, typedArray.getInt(i2, i3));
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m18283OooO00o(@NonNull TypedArray typedArray, @StyleableRes int i, @StyleableRes int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static CharSequence m18282OooO00o(@NonNull TypedArray typedArray, @StyleableRes int i, @StyleableRes int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static CharSequence[] m18285OooO00o(@NonNull TypedArray typedArray, @StyleableRes int i, @StyleableRes int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static int OooO00o(@NonNull Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }
}
