package com.p118pd.sdk;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.C0033R;
import androidx.core.view.ViewCompat;

/* renamed from: com.pd.sdk.Ooooo00  reason: case insensitive filesystem */
public class C5988Ooooo00 {
    public int OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final View f17290OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C5994Oooooo0 f17291OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6952o0000O00 f17292OooO00o;
    public C6952o0000O00 OooO0O0;
    public C6952o0000O00 OooO0OO;

    public C5988Ooooo00(View view) {
        this.f17290OooO00o = view;
        this.f17291OooO00o = C5994Oooooo0.OooO00o();
    }

    public void OooO00o(AttributeSet attributeSet, int i) {
        C6970o0000oO OooO00o2 = C6970o0000oO.OooO00o(this.f17290OooO00o.getContext(), attributeSet, C0033R.styleable.OoooO00, i, 0);
        try {
            if (OooO00o2.m18168OooO00o(C0033R.styleable.ViewBackgroundHelper_android_background)) {
                this.OooO00o = OooO00o2.OooO0oO(C0033R.styleable.ViewBackgroundHelper_android_background, -1);
                ColorStateList OooO00o3 = this.f17291OooO00o.OooO00o(this.f17290OooO00o.getContext(), this.OooO00o);
                if (OooO00o3 != null) {
                    OooO00o(OooO00o3);
                }
            }
            if (OooO00o2.m18168OooO00o(C0033R.styleable.ViewBackgroundHelper_backgroundTint)) {
                ViewCompat.OooO00o(this.f17290OooO00o, OooO00o2.m18160OooO00o(C0033R.styleable.ViewBackgroundHelper_backgroundTint));
            }
            if (OooO00o2.m18168OooO00o(C0033R.styleable.ViewBackgroundHelper_backgroundTintMode)) {
                ViewCompat.OooO00o(this.f17290OooO00o, o0OO00O.OooO00o(OooO00o2.OooO0Oo(C0033R.styleable.ViewBackgroundHelper_backgroundTintMode, -1), null));
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
        m16826OooO00o();
    }

    public void OooO00o(int i) {
        this.OooO00o = i;
        C5994Oooooo0 oooooo0 = this.f17291OooO00o;
        OooO00o(oooooo0 != null ? oooooo0.OooO00o(this.f17290OooO00o.getContext(), i) : null);
        m16826OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16827OooO00o(Drawable drawable) {
        this.OooO00o = -1;
        OooO00o((ColorStateList) null);
        m16826OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ColorStateList m16824OooO00o() {
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
        m16826OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public PorterDuff.Mode m16825OooO00o() {
        C6952o0000O00 o0000o00 = this.OooO0O0;
        if (o0000o00 != null) {
            return o0000o00.f19148OooO00o;
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16826OooO00o() {
        Drawable background = this.f17290OooO00o.getBackground();
        if (background == null) {
            return;
        }
        if (!OooO00o() || !OooO00o(background)) {
            C6952o0000O00 o0000o00 = this.OooO0O0;
            if (o0000o00 != null) {
                C5994Oooooo0.OooO00o(background, o0000o00, this.f17290OooO00o.getDrawableState());
                return;
            }
            C6952o0000O00 o0000o002 = this.f17292OooO00o;
            if (o0000o002 != null) {
                C5994Oooooo0.OooO00o(background, o0000o002, this.f17290OooO00o.getDrawableState());
            }
        }
    }

    public void OooO00o(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f17292OooO00o == null) {
                this.f17292OooO00o = new C6952o0000O00();
            }
            C6952o0000O00 o0000o00 = this.f17292OooO00o;
            o0000o00.OooO00o = colorStateList;
            o0000o00.OooO0O0 = true;
        } else {
            this.f17292OooO00o = null;
        }
        m16826OooO00o();
    }

    private boolean OooO00o() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f17292OooO00o != null) {
            return true;
        }
        return false;
    }

    private boolean OooO00o(@NonNull Drawable drawable) {
        if (this.OooO0OO == null) {
            this.OooO0OO = new C6952o0000O00();
        }
        C6952o0000O00 o0000o00 = this.OooO0OO;
        o0000o00.OooO00o();
        ColorStateList OooO00o2 = ViewCompat.m14565OooO00o(this.f17290OooO00o);
        if (OooO00o2 != null) {
            o0000o00.OooO0O0 = true;
            o0000o00.OooO00o = OooO00o2;
        }
        PorterDuff.Mode OooO00o3 = ViewCompat.m14567OooO00o(this.f17290OooO00o);
        if (OooO00o3 != null) {
            o0000o00.f19149OooO00o = true;
            o0000o00.f19148OooO00o = OooO00o3;
        }
        if (!o0000o00.OooO0O0 && !o0000o00.f19149OooO00o) {
            return false;
        }
        C5994Oooooo0.OooO00o(drawable, o0000o00, this.f17290OooO00o.getDrawableState());
        return true;
    }
}
