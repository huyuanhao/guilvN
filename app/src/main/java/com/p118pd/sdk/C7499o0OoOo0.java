package com.p118pd.sdk;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o0OoOo0  reason: case insensitive filesystem */
public class C7499o0OoOo0 {
    public final ImageView OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6952o0000O00 f20336OooO00o;
    public C6952o0000O00 OooO0O0;
    public C6952o0000O00 OooO0OO;

    public C7499o0OoOo0(ImageView imageView) {
        this.OooO00o = imageView;
    }

    public void OooO00o(AttributeSet attributeSet, int i) {
        int OooO0oO;
        C6970o0000oO OooO00o2 = C6970o0000oO.OooO00o(this.OooO00o.getContext(), attributeSet, C0033R.styleable.OooOO0O, i, 0);
        try {
            Drawable drawable = this.OooO00o.getDrawable();
            if (!(drawable != null || (OooO0oO = OooO00o2.OooO0oO(C0033R.styleable.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = C5945OooOOO0.m16716OooO00o(this.OooO00o.getContext(), OooO0oO)) == null)) {
                this.OooO00o.setImageDrawable(drawable);
            }
            if (drawable != null) {
                o0OO00O.m18877OooO00o(drawable);
            }
            if (OooO00o2.m18168OooO00o(C0033R.styleable.AppCompatImageView_tint)) {
                C7281o0O00o0.OooO00o(this.OooO00o, OooO00o2.m18160OooO00o(C0033R.styleable.AppCompatImageView_tint));
            }
            if (OooO00o2.m18168OooO00o(C0033R.styleable.AppCompatImageView_tintMode)) {
                C7281o0O00o0.OooO00o(this.OooO00o, o0OO00O.OooO00o(OooO00o2.OooO0Oo(C0033R.styleable.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            OooO00o2.m18167OooO00o();
        }
    }

    public void OooO0O0(ColorStateList colorStateList) {
        if (this.OooO0O0 == null) {
            this.OooO0O0 = new C6952o0000O00();
        }
        C6952o0000O00 o0000o00 = this.OooO0O0;
        o0000o00.OooO00o = colorStateList;
        o0000o00.OooO0O0 = true;
        m19123OooO00o();
    }

    private boolean OooO0O0() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f20336OooO00o != null) {
            return true;
        }
        return false;
    }

    public void OooO00o(int i) {
        if (i != 0) {
            Drawable OooO00o2 = C5945OooOOO0.m16716OooO00o(this.OooO00o.getContext(), i);
            if (OooO00o2 != null) {
                o0OO00O.m18877OooO00o(OooO00o2);
            }
            this.OooO00o.setImageDrawable(OooO00o2);
        } else {
            this.OooO00o.setImageDrawable(null);
        }
        m19123OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19124OooO00o() {
        return Build.VERSION.SDK_INT < 21 || !(this.OooO00o.getBackground() instanceof RippleDrawable);
    }

    public ColorStateList OooO00o() {
        C6952o0000O00 o0000o00 = this.OooO0O0;
        if (o0000o00 != null) {
            return o0000o00.OooO00o;
        }
        return null;
    }

    public void OooO00o(PorterDuff.Mode mode) {
        if (this.OooO0O0 == null) {
            this.OooO0O0 = new C6952o0000O00();
        }
        C6952o0000O00 o0000o00 = this.OooO0O0;
        o0000o00.f19148OooO00o = mode;
        o0000o00.f19149OooO00o = true;
        m19123OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public PorterDuff.Mode m19122OooO00o() {
        C6952o0000O00 o0000o00 = this.OooO0O0;
        if (o0000o00 != null) {
            return o0000o00.f19148OooO00o;
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19123OooO00o() {
        Drawable drawable = this.OooO00o.getDrawable();
        if (drawable != null) {
            o0OO00O.m18877OooO00o(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!OooO0O0() || !OooO00o(drawable)) {
            C6952o0000O00 o0000o00 = this.OooO0O0;
            if (o0000o00 != null) {
                C5994Oooooo0.OooO00o(drawable, o0000o00, this.OooO00o.getDrawableState());
                return;
            }
            C6952o0000O00 o0000o002 = this.f20336OooO00o;
            if (o0000o002 != null) {
                C5994Oooooo0.OooO00o(drawable, o0000o002, this.OooO00o.getDrawableState());
            }
        }
    }

    public void OooO00o(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f20336OooO00o == null) {
                this.f20336OooO00o = new C6952o0000O00();
            }
            C6952o0000O00 o0000o00 = this.f20336OooO00o;
            o0000o00.OooO00o = colorStateList;
            o0000o00.OooO0O0 = true;
        } else {
            this.f20336OooO00o = null;
        }
        m19123OooO00o();
    }

    private boolean OooO00o(@NonNull Drawable drawable) {
        if (this.OooO0OO == null) {
            this.OooO0OO = new C6952o0000O00();
        }
        C6952o0000O00 o0000o00 = this.OooO0OO;
        o0000o00.OooO00o();
        ColorStateList OooO00o2 = C7281o0O00o0.OooO00o(this.OooO00o);
        if (OooO00o2 != null) {
            o0000o00.OooO0O0 = true;
            o0000o00.OooO00o = OooO00o2;
        }
        PorterDuff.Mode OooO00o3 = C7281o0O00o0.m18779OooO00o(this.OooO00o);
        if (OooO00o3 != null) {
            o0000o00.f19149OooO00o = true;
            o0000o00.f19148OooO00o = OooO00o3;
        }
        if (!o0000o00.OooO0O0 && !o0000o00.f19149OooO00o) {
            return false;
        }
        C5994Oooooo0.OooO00o(drawable, o0000o00, this.OooO00o.getDrawableState());
        return true;
    }
}
