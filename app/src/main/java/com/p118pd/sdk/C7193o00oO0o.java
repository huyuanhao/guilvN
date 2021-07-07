package com.p118pd.sdk;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import androidx.annotation.Nullable;
import androidx.appcompat.C0033R;
import androidx.core.view.ViewCompat;

/* renamed from: com.pd.sdk.o00oO0o  reason: case insensitive filesystem */
public class C7193o00oO0o extends C7131o00Ooo {
    public ColorStateList OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PorterDuff.Mode f19681OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable f19682OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SeekBar f19683OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f19684OooO00o = false;
    public boolean OooO0O0 = false;

    public C7193o00oO0o(SeekBar seekBar) {
        super(seekBar);
        this.f19683OooO00o = seekBar;
    }

    private void OooO0OO() {
        if (this.f19682OooO00o == null) {
            return;
        }
        if (this.f19684OooO00o || this.OooO0O0) {
            Drawable OooO0O02 = C7043o00O0000.m18317OooO0O0(this.f19682OooO00o.mutate());
            this.f19682OooO00o = OooO0O02;
            if (this.f19684OooO00o) {
                C7043o00O0000.OooO00o(OooO0O02, this.OooO00o);
            }
            if (this.OooO0O0) {
                C7043o00O0000.OooO00o(this.f19682OooO00o, this.f19681OooO00o);
            }
            if (this.f19682OooO00o.isStateful()) {
                this.f19682OooO00o.setState(this.f19683OooO00o.getDrawableState());
            }
        }
    }

    @Override // com.p118pd.sdk.C7131o00Ooo
    public void OooO00o(AttributeSet attributeSet, int i) {
        super.OooO00o(attributeSet, i);
        C6970o0000oO OooO00o2 = C6970o0000oO.OooO00o(this.f19683OooO00o.getContext(), attributeSet, C0033R.styleable.OooOO0o, i, 0);
        Drawable OooO0O02 = OooO00o2.m18170OooO0O0(C0033R.styleable.AppCompatSeekBar_android_thumb);
        if (OooO0O02 != null) {
            this.f19683OooO00o.setThumb(OooO0O02);
        }
        OooO00o(OooO00o2.m18162OooO00o(C0033R.styleable.AppCompatSeekBar_tickMark));
        if (OooO00o2.m18168OooO00o(C0033R.styleable.AppCompatSeekBar_tickMarkTintMode)) {
            this.f19681OooO00o = o0OO00O.OooO00o(OooO00o2.OooO0Oo(C0033R.styleable.AppCompatSeekBar_tickMarkTintMode, -1), this.f19681OooO00o);
            this.OooO0O0 = true;
        }
        if (OooO00o2.m18168OooO00o(C0033R.styleable.AppCompatSeekBar_tickMarkTint)) {
            this.OooO00o = OooO00o2.m18160OooO00o(C0033R.styleable.AppCompatSeekBar_tickMarkTint);
            this.f19684OooO00o = true;
        }
        OooO00o2.m18167OooO00o();
        OooO0OO();
    }

    public void OooO0O0() {
        Drawable drawable = this.f19682OooO00o;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void OooO00o(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f19682OooO00o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f19682OooO00o = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f19683OooO00o);
            C7043o00O0000.m18316OooO00o(drawable, ViewCompat.m14593OooO0o((View) this.f19683OooO00o));
            if (drawable.isStateful()) {
                drawable.setState(this.f19683OooO00o.getDrawableState());
            }
            OooO0OO();
        }
        this.f19683OooO00o.invalidate();
    }

    @Override // com.p118pd.sdk.C7131o00Ooo
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Drawable m18683OooO00o() {
        return this.f19682OooO00o;
    }

    public void OooO00o(@Nullable ColorStateList colorStateList) {
        this.OooO00o = colorStateList;
        this.f19684OooO00o = true;
        OooO0OO();
    }

    @Override // com.p118pd.sdk.C7131o00Ooo
    @Nullable
    public ColorStateList OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(@Nullable PorterDuff.Mode mode) {
        this.f19681OooO00o = mode;
        this.OooO0O0 = true;
        OooO0OO();
    }

    @Override // com.p118pd.sdk.C7131o00Ooo
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public PorterDuff.Mode m18682OooO00o() {
        return this.f19681OooO00o;
    }

    @Override // com.p118pd.sdk.C7131o00Ooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18684OooO00o() {
        Drawable drawable = this.f19682OooO00o;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f19683OooO00o.getDrawableState())) {
            this.f19683OooO00o.invalidateDrawable(drawable);
        }
    }

    public void OooO00o(Canvas canvas) {
        if (this.f19682OooO00o != null) {
            int max = this.f19683OooO00o.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f19682OooO00o.getIntrinsicWidth();
                int intrinsicHeight = this.f19682OooO00o.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f19682OooO00o.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f19683OooO00o.getWidth() - this.f19683OooO00o.getPaddingLeft()) - this.f19683OooO00o.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f19683OooO00o.getPaddingLeft(), (float) (this.f19683OooO00o.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f19682OooO00o.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
