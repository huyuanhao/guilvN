package com.p118pd.sdk;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import androidx.appcompat.C0033R;

/* renamed from: com.pd.sdk.OooooOo  reason: case insensitive filesystem */
public class C5992OooooOo {
    public ColorStateList OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PorterDuff.Mode f17295OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CompoundButton f17296OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17297OooO00o = false;
    public boolean OooO0O0 = false;
    public boolean OooO0OO;

    /* renamed from: com.pd.sdk.OooooOo$OooO00o */
    public interface OooO00o {
        void OooO00o(Drawable drawable);
    }

    public C5992OooooOo(CompoundButton compoundButton) {
        this.f17296OooO00o = compoundButton;
    }

    public void OooO00o(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f17296OooO00o.getContext().obtainStyledAttributes(attributeSet, C0033R.styleable.OooOOo, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C0033R.styleable.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(C0033R.styleable.CompoundButton_android_button, 0)) != 0) {
                this.f17296OooO00o.setButtonDrawable(C5945OooOOO0.m16716OooO00o(this.f17296OooO00o.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(C0033R.styleable.CompoundButton_buttonTint)) {
                C7136o00OooO.OooO00o(this.f17296OooO00o, obtainStyledAttributes.getColorStateList(C0033R.styleable.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(C0033R.styleable.CompoundButton_buttonTintMode)) {
                C7136o00OooO.OooO00o(this.f17296OooO00o, o0OO00O.OooO00o(obtainStyledAttributes.getInt(C0033R.styleable.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void OooO0O0() {
        if (this.OooO0OO) {
            this.OooO0OO = false;
            return;
        }
        this.OooO0OO = true;
        m16829OooO00o();
    }

    public void OooO00o(ColorStateList colorStateList) {
        this.OooO00o = colorStateList;
        this.f17297OooO00o = true;
        m16829OooO00o();
    }

    public ColorStateList OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(@Nullable PorterDuff.Mode mode) {
        this.f17295OooO00o = mode;
        this.OooO0O0 = true;
        m16829OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public PorterDuff.Mode m16828OooO00o() {
        return this.f17295OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16829OooO00o() {
        Drawable OooO00o2 = C7136o00OooO.m18507OooO00o(this.f17296OooO00o);
        if (OooO00o2 == null) {
            return;
        }
        if (this.f17297OooO00o || this.OooO0O0) {
            Drawable mutate = C7043o00O0000.m18317OooO0O0(OooO00o2).mutate();
            if (this.f17297OooO00o) {
                C7043o00O0000.OooO00o(mutate, this.OooO00o);
            }
            if (this.OooO0O0) {
                C7043o00O0000.OooO00o(mutate, this.f17295OooO00o);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f17296OooO00o.getDrawableState());
            }
            this.f17296OooO00o.setButtonDrawable(mutate);
        }
    }

    public int OooO00o(int i) {
        Drawable OooO00o2;
        return (Build.VERSION.SDK_INT >= 17 || (OooO00o2 = C7136o00OooO.m18507OooO00o(this.f17296OooO00o)) == null) ? i : i + OooO00o2.getIntrinsicWidth();
    }
}
