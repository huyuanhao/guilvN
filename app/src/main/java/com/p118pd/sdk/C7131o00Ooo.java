package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: com.pd.sdk.o00Ooo  reason: case insensitive filesystem */
public class C7131o00Ooo {
    public static final int[] OooO00o = {16843067, 16843068};

    /* renamed from: OooO00o  reason: collision with other field name */
    public Bitmap f19476OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ProgressBar f19477OooO00o;

    public C7131o00Ooo(ProgressBar progressBar) {
        this.f19477OooO00o = progressBar;
    }

    public void OooO00o(AttributeSet attributeSet, int i) {
        C6970o0000oO OooO00o2 = C6970o0000oO.OooO00o(this.f19477OooO00o.getContext(), attributeSet, OooO00o, i, 0);
        Drawable OooO0O0 = OooO00o2.m18170OooO0O0(0);
        if (OooO0O0 != null) {
            this.f19477OooO00o.setIndeterminateDrawable(OooO00o(OooO0O0));
        }
        Drawable OooO0O02 = OooO00o2.m18170OooO0O0(1);
        if (OooO0O02 != null) {
            this.f19477OooO00o.setProgressDrawable(OooO00o(OooO0O02, false));
        }
        OooO00o2.m18167OooO00o();
    }

    private Drawable OooO00o(Drawable drawable, boolean z) {
        if (drawable instanceof AbstractC7041o00O00) {
            AbstractC7041o00O00 o00o00 = (AbstractC7041o00O00) drawable;
            Drawable OooO00o2 = o00o00.OooO00o();
            if (OooO00o2 != null) {
                o00o00.OooO00o(OooO00o(OooO00o2, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = OooO00o(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f19476OooO00o == null) {
                this.f19476OooO00o = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(OooO00o());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    private Drawable OooO00o(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable OooO00o2 = OooO00o(animationDrawable.getFrame(i), true);
            OooO00o2.setLevel(10000);
            animationDrawable2.addFrame(OooO00o2, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    private Shape OooO00o() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Bitmap m18479OooO00o() {
        return this.f19476OooO00o;
    }
}
