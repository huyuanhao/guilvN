package com.p118pd.sdk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: com.pd.sdk.o00000oO  reason: case insensitive filesystem */
public class C6948o00000oO {
    public static final int[] OooO = new int[1];
    public static final ThreadLocal<TypedValue> OooO00o = new ThreadLocal<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f19120OooO00o = {-16842910};
    public static final int[] OooO0O0 = {16842908};
    public static final int[] OooO0OO = {16843518};
    public static final int[] OooO0Oo = {16842919};
    public static final int[] OooO0o = {16842913};
    public static final int[] OooO0o0 = {16842912};
    public static final int[] OooO0oO = {-16842919, -16842908};
    public static final int[] OooO0oo = new int[0];

    public static ColorStateList OooO00o(int i, int i2) {
        return new ColorStateList(new int[][]{f19120OooO00o, OooO0oo}, new int[]{i2, i});
    }

    public static int OooO0O0(Context context, int i) {
        int[] iArr = OooO;
        iArr[0] = i;
        C6970o0000oO OooO00o2 = C6970o0000oO.OooO00o(context, (AttributeSet) null, iArr);
        try {
            return OooO00o2.OooO00o(0, 0);
        } finally {
            OooO00o2.m18167OooO00o();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static ColorStateList m18125OooO00o(Context context, int i) {
        int[] iArr = OooO;
        iArr[0] = i;
        C6970o0000oO OooO00o2 = C6970o0000oO.OooO00o(context, (AttributeSet) null, iArr);
        try {
            return OooO00o2.m18160OooO00o(0);
        } finally {
            OooO00o2.m18167OooO00o();
        }
    }

    public static int OooO00o(Context context, int i) {
        ColorStateList OooO00o2 = m18125OooO00o(context, i);
        if (OooO00o2 != null && OooO00o2.isStateful()) {
            return OooO00o2.getColorForState(f19120OooO00o, OooO00o2.getDefaultColor());
        }
        TypedValue OooO00o3 = OooO00o();
        context.getTheme().resolveAttribute(16842803, OooO00o3, true);
        return OooO00o(context, i, OooO00o3.getFloat());
    }

    public static TypedValue OooO00o() {
        TypedValue typedValue = OooO00o.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        OooO00o.set(typedValue2);
        return typedValue2;
    }

    public static int OooO00o(Context context, int i, float f) {
        int OooO0O02 = OooO0O0(context, i);
        return C7029o000oo0.OooO0OO(OooO0O02, Math.round(((float) Color.alpha(OooO0O02)) * f));
    }
}
