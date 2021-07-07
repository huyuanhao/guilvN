package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;

/* renamed from: com.pd.sdk.o0O0O0o0  reason: case insensitive filesystem */
public class C7295o0O0O0o0 extends ImageView {
    public static final float OooO0Oo = 0.0f;
    public static final float OooO0o = 3.5f;
    public static final float OooO0o0 = 1.75f;
    public static final int o0ooOO0 = 503316480;
    public static final int o0ooOOo = 1023410176;
    public static final int o0ooOoO = 4;
    public Animation.AnimationListener OooO00o;
    public int o00oO0O;

    /* renamed from: com.pd.sdk.o0O0O0o0$OooO00o */
    public class OooO00o extends OvalShape {
        public Paint OooO00o = new Paint();

        /* renamed from: OooO00o  reason: collision with other field name */
        public RadialGradient f19965OooO00o;

        public OooO00o(int i) {
            C7295o0O0O0o0.this.o00oO0O = i;
            OooO00o((int) rect().width());
        }

        private void OooO00o(int i) {
            float f = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f, f, (float) C7295o0O0O0o0.this.o00oO0O, new int[]{C7295o0O0O0o0.o0ooOOo, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f19965OooO00o = radialGradient;
            this.OooO00o.setShader(radialGradient);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = C7295o0O0O0o0.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (C7295o0O0O0o0.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.OooO00o);
            canvas.drawCircle(f, height, (float) (width - C7295o0O0O0o0.this.o00oO0O), paint);
        }

        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            OooO00o((int) f);
        }
    }

    public C7295o0O0O0o0(Context context, int i) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.o00oO0O = (int) (3.5f * f);
        if (OooO00o()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            ViewCompat.OooO0O0(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OooO00o(this.o00oO0O));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.o00oO0O, (float) i3, (float) i2, o0ooOO0);
            int i4 = this.o00oO0O;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        ViewCompat.OooO00o(this, shapeDrawable);
    }

    private boolean OooO00o() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.OooO00o;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.OooO00o;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!OooO00o()) {
            setMeasuredDimension(getMeasuredWidth() + (this.o00oO0O * 2), getMeasuredHeight() + (this.o00oO0O * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    public void OooO00o(Animation.AnimationListener animationListener) {
        this.OooO00o = animationListener;
    }

    public void OooO00o(int i) {
        setBackgroundColor(C7009o000OoOo.OooO00o(getContext(), i));
    }
}
