package com.p118pd.sdk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import com.p118pd.sdk.C7023o000o0o0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o0000oO  reason: case insensitive filesystem */
public class C6970o0000oO {
    public final Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TypedArray f19173OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TypedValue f19174OooO00o;

    public C6970o0000oO(Context context, TypedArray typedArray) {
        this.OooO00o = context;
        this.f19173OooO00o = typedArray;
    }

    public static C6970o0000oO OooO00o(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C6970o0000oO(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Drawable m18170OooO0O0(int i) {
        int resourceId;
        if (!this.f19173OooO00o.hasValue(i) || (resourceId = this.f19173OooO00o.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C5994Oooooo0.OooO00o().OooO00o(this.OooO00o, resourceId, true);
    }

    public int OooO0OO() {
        return this.f19173OooO00o.length();
    }

    public int OooO0Oo(int i, int i2) {
        return this.f19173OooO00o.getInt(i, i2);
    }

    public int OooO0o(int i, int i2) {
        return this.f19173OooO00o.getLayoutDimension(i, i2);
    }

    public int OooO0o0(int i, int i2) {
        return this.f19173OooO00o.getInteger(i, i2);
    }

    public int OooO0oO(int i, int i2) {
        return this.f19173OooO00o.getResourceId(i, i2);
    }

    public static C6970o0000oO OooO00o(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C6970o0000oO(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public int OooO0OO(int i, int i2) {
        return this.f19173OooO00o.getDimensionPixelSize(i, i2);
    }

    public static C6970o0000oO OooO00o(Context context, int i, int[] iArr) {
        return new C6970o0000oO(context, context.obtainStyledAttributes(i, iArr));
    }

    public int OooO0O0() {
        return this.f19173OooO00o.getIndexCount();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Drawable m18162OooO00o(int i) {
        int resourceId;
        if (!this.f19173OooO00o.hasValue(i) || (resourceId = this.f19173OooO00o.getResourceId(i, 0)) == 0) {
            return this.f19173OooO00o.getDrawable(i);
        }
        return C5945OooOOO0.m16716OooO00o(this.OooO00o, resourceId);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m18171OooO0O0(int i) {
        return this.f19173OooO00o.getString(i);
    }

    public float OooO0O0(int i, float f) {
        return this.f19173OooO00o.getFloat(i, f);
    }

    public int OooO0O0(int i, int i2) {
        return this.f19173OooO00o.getDimensionPixelOffset(i, i2);
    }

    public int OooO0O0(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f19173OooO00o.getType(i);
        }
        if (this.f19174OooO00o == null) {
            this.f19174OooO00o = new TypedValue();
        }
        this.f19173OooO00o.getValue(i, this.f19174OooO00o);
        return this.f19174OooO00o.type;
    }

    @Nullable
    public Typeface OooO00o(@StyleableRes int i, int i2, @Nullable C7023o000o0o0.OooO00o oooO00o) {
        int resourceId = this.f19173OooO00o.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f19174OooO00o == null) {
            this.f19174OooO00o = new TypedValue();
        }
        return C7023o000o0o0.OooO00o(this.OooO00o, resourceId, this.f19174OooO00o, i2, oooO00o);
    }

    public int OooO00o(int i) {
        return this.f19173OooO00o.getIndex(i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Resources m18161OooO00o() {
        return this.f19173OooO00o.getResources();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence m18164OooO00o(int i) {
        return this.f19173OooO00o.getText(i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m18166OooO00o(int i) {
        return this.f19173OooO00o.getNonResourceString(i);
    }

    public boolean OooO00o(int i, boolean z) {
        return this.f19173OooO00o.getBoolean(i, z);
    }

    public int OooO00o(int i, int i2) {
        return this.f19173OooO00o.getColor(i, i2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ColorStateList m18160OooO00o(int i) {
        int resourceId;
        ColorStateList OooO0O0;
        if (!this.f19173OooO00o.hasValue(i) || (resourceId = this.f19173OooO00o.getResourceId(i, 0)) == 0 || (OooO0O0 = C5945OooOOO0.OooO0O0(this.OooO00o, resourceId)) == null) {
            return this.f19173OooO00o.getColorStateList(i);
        }
        return OooO0O0;
    }

    public float OooO00o(int i, float f) {
        return this.f19173OooO00o.getDimension(i, f);
    }

    public int OooO00o(int i, String str) {
        return this.f19173OooO00o.getLayoutDimension(i, str);
    }

    public float OooO00o(int i, int i2, int i3, float f) {
        return this.f19173OooO00o.getFraction(i, i2, i3, f);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence[] m18169OooO00o(int i) {
        return this.f19173OooO00o.getTextArray(i);
    }

    public boolean OooO00o(int i, TypedValue typedValue) {
        return this.f19173OooO00o.getValue(i, typedValue);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18168OooO00o(int i) {
        return this.f19173OooO00o.hasValue(i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public TypedValue m18163OooO00o(int i) {
        return this.f19173OooO00o.peekValue(i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m18165OooO00o() {
        return this.f19173OooO00o.getPositionDescription();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18167OooO00o() {
        this.f19173OooO00o.recycle();
    }

    @RequiresApi(21)
    public int OooO00o() {
        return this.f19173OooO00o.getChangingConfigurations();
    }
}
