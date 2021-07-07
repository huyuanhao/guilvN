package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import androidx.core.widget.TextViewCompat;
import com.p118pd.sdk.C7023o000o0o0;
import java.lang.ref.WeakReference;

/* renamed from: com.pd.sdk.o0ooOO0  reason: case insensitive filesystem */
public class C7718o0ooOO0 {
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 2;
    public static final int OooO0Oo = 3;
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Typeface f20683OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TextView f20684OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6952o0000O00 f20685OooO00o;
    @NonNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7727o0ooOoO f20686OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20687OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C6952o0000O00 f20688OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public C6952o0000O00 f20689OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public C6952o0000O00 f20690OooO0Oo;
    public C6952o0000O00 OooO0o;
    public C6952o0000O00 OooO0o0;

    /* renamed from: com.pd.sdk.o0ooOO0$OooO00o */
    public class OooO00o extends C7023o000o0o0.OooO00o {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ WeakReference f20691OooO00o;

        public OooO00o(WeakReference weakReference) {
            this.f20691OooO00o = weakReference;
        }

        @Override // com.p118pd.sdk.C7023o000o0o0.OooO00o
        public void OooO00o(int i) {
        }

        @Override // com.p118pd.sdk.C7023o000o0o0.OooO00o
        public void OooO00o(@NonNull Typeface typeface) {
            C7718o0ooOO0.this.OooO00o(this.f20691OooO00o, typeface);
        }
    }

    public C7718o0ooOO0(TextView textView) {
        this.f20684OooO00o = textView;
        this.f20686OooO00o = new C7727o0ooOoO(this.f20684OooO00o);
    }

    @SuppressLint({"NewApi"})
    public void OooO00o(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        Context context = this.f20684OooO00o.getContext();
        C5994Oooooo0 OooO00o2 = C5994Oooooo0.OooO00o();
        C6970o0000oO OooO00o3 = C6970o0000oO.OooO00o(context, attributeSet, C0033R.styleable.OooOOO0, i, 0);
        int OooO0oO = OooO00o3.OooO0oO(C0033R.styleable.AppCompatTextHelper_android_textAppearance, -1);
        if (OooO00o3.m18168OooO00o(C0033R.styleable.AppCompatTextHelper_android_drawableLeft)) {
            this.f20685OooO00o = OooO00o(context, OooO00o2, OooO00o3.OooO0oO(C0033R.styleable.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (OooO00o3.m18168OooO00o(C0033R.styleable.AppCompatTextHelper_android_drawableTop)) {
            this.f20688OooO0O0 = OooO00o(context, OooO00o2, OooO00o3.OooO0oO(C0033R.styleable.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (OooO00o3.m18168OooO00o(C0033R.styleable.AppCompatTextHelper_android_drawableRight)) {
            this.f20689OooO0OO = OooO00o(context, OooO00o2, OooO00o3.OooO0oO(C0033R.styleable.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (OooO00o3.m18168OooO00o(C0033R.styleable.AppCompatTextHelper_android_drawableBottom)) {
            this.f20690OooO0Oo = OooO00o(context, OooO00o2, OooO00o3.OooO0oO(C0033R.styleable.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (OooO00o3.m18168OooO00o(C0033R.styleable.AppCompatTextHelper_android_drawableStart)) {
                this.OooO0o0 = OooO00o(context, OooO00o2, OooO00o3.OooO0oO(C0033R.styleable.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (OooO00o3.m18168OooO00o(C0033R.styleable.AppCompatTextHelper_android_drawableEnd)) {
                this.OooO0o = OooO00o(context, OooO00o2, OooO00o3.OooO0oO(C0033R.styleable.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        OooO00o3.m18167OooO00o();
        boolean z3 = this.f20684OooO00o.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z4 = true;
        ColorStateList colorStateList3 = null;
        if (OooO0oO != -1) {
            C6970o0000oO OooO00o4 = C6970o0000oO.OooO00o(context, OooO0oO, C0033R.styleable.Oooo0oO);
            if (z3 || !OooO00o4.m18168OooO00o(C0033R.styleable.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z2 = OooO00o4.OooO00o(C0033R.styleable.TextAppearance_textAllCaps, false);
                z = true;
            }
            OooO00o(context, OooO00o4);
            if (Build.VERSION.SDK_INT < 23) {
                ColorStateList OooO00o5 = OooO00o4.m18168OooO00o(C0033R.styleable.TextAppearance_android_textColor) ? OooO00o4.m18160OooO00o(C0033R.styleable.TextAppearance_android_textColor) : null;
                colorStateList = OooO00o4.m18168OooO00o(C0033R.styleable.TextAppearance_android_textColorHint) ? OooO00o4.m18160OooO00o(C0033R.styleable.TextAppearance_android_textColorHint) : null;
                if (OooO00o4.m18168OooO00o(C0033R.styleable.TextAppearance_android_textColorLink)) {
                    colorStateList3 = OooO00o4.m18160OooO00o(C0033R.styleable.TextAppearance_android_textColorLink);
                }
                colorStateList2 = colorStateList3;
                colorStateList3 = OooO00o5;
            } else {
                colorStateList2 = null;
                colorStateList = null;
            }
            OooO00o4.m18167OooO00o();
        } else {
            colorStateList2 = null;
            colorStateList = null;
            z2 = false;
            z = false;
        }
        C6970o0000oO OooO00o6 = C6970o0000oO.OooO00o(context, attributeSet, C0033R.styleable.Oooo0oO, i, 0);
        if (z3 || !OooO00o6.m18168OooO00o(C0033R.styleable.TextAppearance_textAllCaps)) {
            z4 = z;
        } else {
            z2 = OooO00o6.OooO00o(C0033R.styleable.TextAppearance_textAllCaps, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (OooO00o6.m18168OooO00o(C0033R.styleable.TextAppearance_android_textColor)) {
                colorStateList3 = OooO00o6.m18160OooO00o(C0033R.styleable.TextAppearance_android_textColor);
            }
            if (OooO00o6.m18168OooO00o(C0033R.styleable.TextAppearance_android_textColorHint)) {
                colorStateList = OooO00o6.m18160OooO00o(C0033R.styleable.TextAppearance_android_textColorHint);
            }
            if (OooO00o6.m18168OooO00o(C0033R.styleable.TextAppearance_android_textColorLink)) {
                colorStateList2 = OooO00o6.m18160OooO00o(C0033R.styleable.TextAppearance_android_textColorLink);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && OooO00o6.m18168OooO00o(C0033R.styleable.TextAppearance_android_textSize) && OooO00o6.OooO0OO(C0033R.styleable.TextAppearance_android_textSize, -1) == 0) {
            this.f20684OooO00o.setTextSize(0, 0.0f);
        }
        OooO00o(context, OooO00o6);
        OooO00o6.m18167OooO00o();
        if (colorStateList3 != null) {
            this.f20684OooO00o.setTextColor(colorStateList3);
        }
        if (colorStateList != null) {
            this.f20684OooO00o.setHintTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.f20684OooO00o.setLinkTextColor(colorStateList2);
        }
        if (!z3 && z4) {
            OooO00o(z2);
        }
        Typeface typeface = this.f20683OooO00o;
        if (typeface != null) {
            this.f20684OooO00o.setTypeface(typeface, this.OooO00o);
        }
        this.f20686OooO00o.OooO00o(attributeSet, i);
        if (AbstractC7137o00OooO0.OooO00o && this.f20686OooO00o.m19378OooO0Oo() != 0) {
            int[] OooO00o7 = this.f20686OooO00o.m19375OooO00o();
            if (OooO00o7.length > 0) {
                if (((float) this.f20684OooO00o.getAutoSizeStepGranularity()) != -1.0f) {
                    this.f20684OooO00o.setAutoSizeTextTypeUniformWithConfiguration(this.f20686OooO00o.m19376OooO0O0(), this.f20686OooO00o.OooO00o(), this.f20686OooO00o.m19377OooO0OO(), 0);
                } else {
                    this.f20684OooO00o.setAutoSizeTextTypeUniformWithPresetSizes(OooO00o7, 0);
                }
            }
        }
        C6970o0000oO OooO00o8 = C6970o0000oO.OooO00o(context, attributeSet, C0033R.styleable.OooOOO);
        int OooO0OO2 = OooO00o8.OooO0OO(C0033R.styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
        int OooO0OO3 = OooO00o8.OooO0OO(C0033R.styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int OooO0OO4 = OooO00o8.OooO0OO(C0033R.styleable.AppCompatTextView_lineHeight, -1);
        OooO00o8.m18167OooO00o();
        if (OooO0OO2 != -1) {
            TextViewCompat.OooO0O0(this.f20684OooO00o, OooO0OO2);
        }
        if (OooO0OO3 != -1) {
            TextViewCompat.OooO0OO(this.f20684OooO00o, OooO0OO3);
        }
        if (OooO0OO4 != -1) {
            TextViewCompat.OooO0Oo(this.f20684OooO00o, OooO0OO4);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m19364OooO0O0() {
        this.f20686OooO00o.m19373OooO00o();
    }

    public int OooO0OO() {
        return this.f20686OooO00o.m19377OooO0OO();
    }

    public int OooO0Oo() {
        return this.f20686OooO00o.m19378OooO0Oo();
    }

    private void OooO0O0(int i, float f) {
        this.f20686OooO00o.OooO00o(i, f);
    }

    public int OooO0O0() {
        return this.f20686OooO00o.m19376OooO0O0();
    }

    private void OooO00o(Context context, C6970o0000oO o0000oo) {
        String OooO0O02;
        this.OooO00o = o0000oo.OooO0Oo(C0033R.styleable.TextAppearance_android_textStyle, this.OooO00o);
        boolean z = false;
        if (o0000oo.m18168OooO00o(C0033R.styleable.TextAppearance_android_fontFamily) || o0000oo.m18168OooO00o(C0033R.styleable.TextAppearance_fontFamily)) {
            this.f20683OooO00o = null;
            int i = o0000oo.m18168OooO00o(C0033R.styleable.TextAppearance_fontFamily) ? C0033R.styleable.TextAppearance_fontFamily : C0033R.styleable.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                try {
                    Typeface OooO00o2 = o0000oo.OooO00o(i, this.OooO00o, new OooO00o(new WeakReference(this.f20684OooO00o)));
                    this.f20683OooO00o = OooO00o2;
                    if (OooO00o2 == null) {
                        z = true;
                    }
                    this.f20687OooO00o = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f20683OooO00o == null && (OooO0O02 = o0000oo.m18171OooO0O0(i)) != null) {
                this.f20683OooO00o = Typeface.create(OooO0O02, this.OooO00o);
            }
        } else if (o0000oo.m18168OooO00o(C0033R.styleable.TextAppearance_android_typeface)) {
            this.f20687OooO00o = false;
            int OooO0Oo2 = o0000oo.OooO0Oo(C0033R.styleable.TextAppearance_android_typeface, 1);
            if (OooO0Oo2 == 1) {
                this.f20683OooO00o = Typeface.SANS_SERIF;
            } else if (OooO0Oo2 == 2) {
                this.f20683OooO00o = Typeface.SERIF;
            } else if (OooO0Oo2 == 3) {
                this.f20683OooO00o = Typeface.MONOSPACE;
            }
        }
    }

    public void OooO00o(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f20687OooO00o) {
            this.f20683OooO00o = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.OooO00o);
            }
        }
    }

    public void OooO00o(Context context, int i) {
        ColorStateList OooO00o2;
        C6970o0000oO OooO00o3 = C6970o0000oO.OooO00o(context, i, C0033R.styleable.Oooo0oO);
        if (OooO00o3.m18168OooO00o(C0033R.styleable.TextAppearance_textAllCaps)) {
            OooO00o(OooO00o3.OooO00o(C0033R.styleable.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && OooO00o3.m18168OooO00o(C0033R.styleable.TextAppearance_android_textColor) && (OooO00o2 = OooO00o3.m18160OooO00o(C0033R.styleable.TextAppearance_android_textColor)) != null) {
            this.f20684OooO00o.setTextColor(OooO00o2);
        }
        if (OooO00o3.m18168OooO00o(C0033R.styleable.TextAppearance_android_textSize) && OooO00o3.OooO0OO(C0033R.styleable.TextAppearance_android_textSize, -1) == 0) {
            this.f20684OooO00o.setTextSize(0, 0.0f);
        }
        OooO00o(context, OooO00o3);
        OooO00o3.m18167OooO00o();
        Typeface typeface = this.f20683OooO00o;
        if (typeface != null) {
            this.f20684OooO00o.setTypeface(typeface, this.OooO00o);
        }
    }

    public void OooO00o(boolean z) {
        this.f20684OooO00o.setAllCaps(z);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19361OooO00o() {
        if (!(this.f20685OooO00o == null && this.f20688OooO0O0 == null && this.f20689OooO0OO == null && this.f20690OooO0Oo == null)) {
            Drawable[] compoundDrawables = this.f20684OooO00o.getCompoundDrawables();
            OooO00o(compoundDrawables[0], this.f20685OooO00o);
            OooO00o(compoundDrawables[1], this.f20688OooO0O0);
            OooO00o(compoundDrawables[2], this.f20689OooO0OO);
            OooO00o(compoundDrawables[3], this.f20690OooO0Oo);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.OooO0o0 != null || this.OooO0o != null) {
            Drawable[] compoundDrawablesRelative = this.f20684OooO00o.getCompoundDrawablesRelative();
            OooO00o(compoundDrawablesRelative[0], this.OooO0o0);
            OooO00o(compoundDrawablesRelative[2], this.OooO0o);
        }
    }

    private void OooO00o(Drawable drawable, C6952o0000O00 o0000o00) {
        if (drawable != null && o0000o00 != null) {
            C5994Oooooo0.OooO00o(drawable, o0000o00, this.f20684OooO00o.getDrawableState());
        }
    }

    public static C6952o0000O00 OooO00o(Context context, C5994Oooooo0 oooooo0, int i) {
        ColorStateList OooO00o2 = oooooo0.OooO00o(context, i);
        if (OooO00o2 == null) {
            return null;
        }
        C6952o0000O00 o0000o00 = new C6952o0000O00();
        o0000o00.OooO0O0 = true;
        o0000o00.OooO00o = OooO00o2;
        return o0000o00;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO00o(boolean z, int i, int i2, int i3, int i4) {
        if (!AbstractC7137o00OooO0.OooO00o) {
            m19364OooO0O0();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO00o(int i, float f) {
        if (!AbstractC7137o00OooO0.OooO00o && !m19362OooO00o()) {
            OooO0O0(i, f);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19362OooO00o() {
        return this.f20686OooO00o.m19374OooO00o();
    }

    public void OooO00o(int i) {
        this.f20686OooO00o.OooO00o(i);
    }

    public void OooO00o(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f20686OooO00o.OooO00o(i, i2, i3, i4);
    }

    public void OooO00o(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        this.f20686OooO00o.OooO00o(iArr, i);
    }

    public int OooO00o() {
        return this.f20686OooO00o.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m19363OooO00o() {
        return this.f20686OooO00o.m19375OooO00o();
    }
}
