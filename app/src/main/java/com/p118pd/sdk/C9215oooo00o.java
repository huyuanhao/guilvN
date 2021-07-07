package com.p118pd.sdk;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.C0045R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.oooo00o  reason: case insensitive filesystem */
public final class C9215oooo00o {
    public static final int OooO00o = -65536;

    @NonNull
    public static ColorStateList OooO00o(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
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

    public static ColorStateList OooO0O0(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int i = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArr2 = new int[20];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                int[] iArr3 = new int[i2];
                int[][] iArr4 = new int[i2][];
                System.arraycopy(iArr2, 0, iArr3, 0, i2);
                System.arraycopy(iArr, 0, iArr4, 0, i2);
            } else {
                if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                    TypedArray OooO00o2 = OooO00o(resources, theme, attributeSet, C0045R.styleable.OooO00o);
                    int color = OooO00o2.getColor(C0045R.styleable.ColorStateListItem_android_color, -65281);
                    float f = 1.0f;
                    if (OooO00o2.hasValue(C0045R.styleable.ColorStateListItem_android_alpha)) {
                        f = OooO00o2.getFloat(C0045R.styleable.ColorStateListItem_android_alpha, 1.0f);
                    } else if (OooO00o2.hasValue(C0045R.styleable.ColorStateListItem_alpha)) {
                        f = OooO00o2.getFloat(C0045R.styleable.ColorStateListItem_alpha, 1.0f);
                    }
                    OooO00o2.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr5 = new int[attributeCount];
                    int i3 = 0;
                    for (int i4 = 0; i4 < attributeCount; i4++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                        if (!(attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == C0045R.attr.alpha)) {
                            int i5 = i3 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr5[i3] = attributeNameResource;
                            i3 = i5;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr5, i3);
                    int OooO00o3 = OooO00o(color, f);
                    if (i2 != 0) {
                        int length = trimStateSet.length;
                    }
                    iArr2 = C7021o000o0Oo.OooO00o(iArr2, i2, OooO00o3);
                    iArr = (int[][]) C7021o000o0Oo.OooO00o(iArr, i2, trimStateSet);
                    i2++;
                }
                i = 1;
            }
        }
        int[] iArr32 = new int[i2];
        int[][] iArr42 = new int[i2][];
        System.arraycopy(iArr2, 0, iArr32, 0, i2);
        System.arraycopy(iArr, 0, iArr42, 0, i2);
        return new ColorStateList(iArr42, iArr32);
    }

    @NonNull
    public static ColorStateList OooO00o(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return OooO0O0(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    public static TypedArray OooO00o(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @ColorInt
    public static int OooO00o(@ColorInt int i, @FloatRange(from = 0.0d, mo599to = 1.0d) float f) {
        return (i & 16777215) | (Math.round(((float) Color.alpha(i)) * f) << 24);
    }
}
