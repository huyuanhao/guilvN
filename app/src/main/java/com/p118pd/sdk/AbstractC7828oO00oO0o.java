package com.p118pd.sdk;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p118pd.sdk.AbstractC7837oO00ooOo;
import s.h.e.l.l.C;

/* renamed from: com.pd.sdk.oO00oO0o  reason: case insensitive filesystem */
public abstract class AbstractC7828oO00oO0o<Z> extends oO0OO00O<ImageView, Z> implements AbstractC7837oO00ooOo.OooO00o {
    @Nullable
    public Animatable OooO00o;

    static {
        C.i(26);
    }

    public AbstractC7828oO00oO0o(ImageView imageView) {
        super(imageView);
    }

    private void OooO0OO(@Nullable Z z) {
        if (z instanceof Animatable) {
            Z z2 = z;
            this.OooO00o = z2;
            z2.start();
            return;
        }
        this.OooO00o = null;
    }

    private void OooO0Oo(@Nullable Z z) {
        OooO0O0(z);
        OooO0OO(z);
    }

    /* Return type fixed from 'android.graphics.drawable.Drawable' to match base method */
    @Override // com.p118pd.sdk.oO0OO00O, com.p118pd.sdk.oO0OO00O, com.p118pd.sdk.oO0OO00O, com.p118pd.sdk.AbstractC7837oO00ooOo.OooO00o, com.p118pd.sdk.AbstractC7837oO00ooOo.OooO00o
    @Nullable
    public ImageView OooO00o() {
        return ((ImageView) ((oO0OO00O) this).f20916OooO00o).getDrawable();
    }

    @Override // com.p118pd.sdk.AbstractC7837oO00ooOo.OooO00o
    public native void OooO00o(Drawable drawable);

    public abstract void OooO0O0(@Nullable Z z);

    @Override // com.p118pd.sdk.oO0OO00O, com.p118pd.sdk.AbstractC7833oO00oOo0, com.p118pd.sdk.AbstractC7826oO00oO00
    public void onLoadCleared(@Nullable Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.OooO00o;
        if (animatable != null) {
            animatable.stop();
        }
        OooO0Oo(null);
        OooO00o(drawable);
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0, com.p118pd.sdk.AbstractC7826oO00oO00
    public void onLoadFailed(@Nullable Drawable drawable) {
        super.onLoadFailed(drawable);
        OooO0Oo(null);
        OooO00o(drawable);
    }

    @Override // com.p118pd.sdk.oO0OO00O, com.p118pd.sdk.AbstractC7833oO00oOo0, com.p118pd.sdk.AbstractC7826oO00oO00
    public void onLoadStarted(@Nullable Drawable drawable) {
        super.onLoadStarted(drawable);
        OooO0Oo(null);
        OooO00o(drawable);
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public void onResourceReady(@NonNull Z z, @Nullable AbstractC7837oO00ooOo<? super Z> oo00oooo) {
        if (oo00oooo == null || !oo00oooo.OooO00o(z, this)) {
            OooO0Oo(z);
        } else {
            OooO0OO(z);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7826oO00oO00, com.p118pd.sdk.AbstractC7811oO00OooO
    public native void onStart();

    @Override // com.p118pd.sdk.AbstractC7826oO00oO00, com.p118pd.sdk.AbstractC7811oO00OooO
    public native void onStop();

    @Deprecated
    public AbstractC7828oO00oO0o(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
