package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

/* renamed from: com.pd.sdk.o0O0Oo0o  reason: case insensitive filesystem */
public class C7315o0O0Oo0o extends C7312o0O0Oo {
    public static final int o00000O = 3;
    public static final int o00000OO = 6;
    public static final int o00000Oo = 16;
    public static final int o00000o0 = 32;
    public static final int o00000oO = 1;
    public static final int o00000oo = 32;
    public static final int o0000Ooo = 64;
    public static final String o0ooOOo = "PagerTabStrip";
    public final Paint OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Rect f20043OooO00o;
    public boolean OooO0Oo;
    public float OooO0o;

    /* renamed from: OooO0o  reason: collision with other field name */
    public boolean f20044OooO0o;
    public boolean OooO0o0;
    public float OooO0oO;
    public int o00000;
    public int o000000;
    public int o000000O;
    public int o000000o;
    public int o00000O0;
    public int o000OOo;
    public int o0O0O00;
    public int o0OO00O;
    public int oo0o0Oo;

    /* renamed from: com.pd.sdk.o0O0Oo0o$OooO00o */
    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        public void onClick(View view) {
            ViewPager viewPager = ((C7312o0O0Oo) C7315o0O0Oo0o.this).f20037OooO00o;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    /* renamed from: com.pd.sdk.o0O0Oo0o$OooO0O0 */
    public class OooO0O0 implements View.OnClickListener {
        public OooO0O0() {
        }

        public void onClick(View view) {
            ViewPager viewPager = ((C7312o0O0Oo) C7315o0O0Oo0o.this).f20037OooO00o;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public C7315o0O0Oo0o(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.p118pd.sdk.C7312o0O0Oo
    public void OooO00o(int i, float f, boolean z) {
        Rect rect = this.f20043OooO00o;
        int height = getHeight();
        int left = ((C7312o0O0Oo) this).f20040OooO0O0.getLeft() - this.o000000O;
        int right = ((C7312o0O0Oo) this).f20040OooO0O0.getRight() + this.o000000O;
        int i2 = height - this.oo0o0Oo;
        rect.set(left, i2, right, height);
        super.OooO00o(i, f, z);
        this.o000000o = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(((C7312o0O0Oo) this).f20040OooO0O0.getLeft() - this.o000000O, i2, ((C7312o0O0Oo) this).f20040OooO0O0.getRight() + this.o000000O, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.OooO0Oo;
    }

    @Override // com.p118pd.sdk.C7312o0O0Oo
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.o000000);
    }

    @ColorInt
    public int getTabIndicatorColor() {
        return this.o0OO00O;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = ((C7312o0O0Oo) this).f20040OooO0O0.getLeft() - this.o000000O;
        int right = ((C7312o0O0Oo) this).f20040OooO0O0.getRight() + this.o000000O;
        this.OooO00o.setColor((this.o000000o << 24) | (this.o0OO00O & 16777215));
        float f = (float) height;
        canvas.drawRect((float) left, (float) (height - this.oo0o0Oo), (float) right, f, this.OooO00o);
        if (this.OooO0Oo) {
            this.OooO00o.setColor(-16777216 | (this.o0OO00O & 16777215));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.o00000), (float) (getWidth() - getPaddingRight()), f, this.OooO00o);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f20044OooO0o) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.OooO0o = x;
            this.OooO0oO = y;
            this.f20044OooO0o = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x - this.OooO0o) > ((float) this.o00000O0) || Math.abs(y - this.OooO0oO) > ((float) this.o00000O0))) {
                this.f20044OooO0o = true;
            }
        } else if (x < ((float) (((C7312o0O0Oo) this).f20040OooO0O0.getLeft() - this.o000000O))) {
            ViewPager viewPager = ((C7312o0O0Oo) this).f20037OooO00o;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x > ((float) (((C7312o0O0Oo) this).f20040OooO0O0.getRight() + this.o000000O))) {
            ViewPager viewPager2 = ((C7312o0O0Oo) this).f20037OooO00o;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    public void setBackgroundColor(@ColorInt int i) {
        super.setBackgroundColor(i);
        if (!this.OooO0o0) {
            this.OooO0Oo = (i & -16777216) == 0;
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.OooO0o0) {
            this.OooO0Oo = drawable == null;
        }
    }

    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        if (!this.OooO0o0) {
            this.OooO0Oo = i == 0;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.OooO0Oo = z;
        this.OooO0o0 = true;
        invalidate();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.o0O0O00;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(@ColorInt int i) {
        this.o0OO00O = i;
        this.OooO00o.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(@ColorRes int i) {
        setTabIndicatorColor(C7009o000OoOo.OooO00o(getContext(), i));
    }

    @Override // com.p118pd.sdk.C7312o0O0Oo
    public void setTextSpacing(int i) {
        int i2 = this.o000OOo;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public C7315o0O0Oo0o(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooO00o = new Paint();
        this.f20043OooO00o = new Rect();
        this.o000000o = 255;
        this.OooO0Oo = false;
        this.OooO0o0 = false;
        int i = this.o0OOO0o;
        this.o0OO00O = i;
        this.OooO00o.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.oo0o0Oo = (int) ((3.0f * f) + 0.5f);
        this.o0O0O00 = (int) ((6.0f * f) + 0.5f);
        this.o000OOo = (int) (64.0f * f);
        this.o000000O = (int) ((16.0f * f) + 0.5f);
        this.o00000 = (int) ((1.0f * f) + 0.5f);
        this.o000000 = (int) ((f * 32.0f) + 0.5f);
        this.o00000O0 = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        ((C7312o0O0Oo) this).f20036OooO00o.setFocusable(true);
        ((C7312o0O0Oo) this).f20036OooO00o.setOnClickListener(new OooO00o());
        ((C7312o0O0Oo) this).OooO0OO.setFocusable(true);
        ((C7312o0O0Oo) this).OooO0OO.setOnClickListener(new OooO0O0());
        if (getBackground() == null) {
            this.OooO0Oo = true;
        }
    }
}
