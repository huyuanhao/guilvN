package com.p118pd.sdk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

@VisibleForTesting
/* renamed from: com.pd.sdk.o0O000o  reason: case insensitive filesystem */
public class C7262o0O000o extends RecyclerView.AbstractC5067OooOO0o implements RecyclerView.AbstractC5071OooOOo0 {
    public static final int[] OooO0OO = {16842919};
    public static final int[] OooO0Oo = new int[0];
    public static final int OooOOOo = 0;
    public static final int OooOOo = 2;
    public static final int OooOOo0 = 1;
    public static final int OooOOoo = 0;
    public static final int OooOo = 2;
    public static final int OooOo0 = 2;
    public static final int OooOo00 = 1;
    public static final int OooOo0O = 0;
    public static final int OooOo0o = 1;
    public static final int OooOoO = 500;
    public static final int OooOoO0 = 3;
    public static final int OooOoOO = 1500;
    public static final int OooOoo = 500;
    public static final int OooOoo0 = 1200;
    public static final int OooOooO = 255;
    @VisibleForTesting
    public int OooO;
    @VisibleForTesting
    public float OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f19864OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ValueAnimator f19865OooO00o = ValueAnimator.ofFloat(0.0f, 1.0f);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Drawable f19866OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final StateListDrawable f19867OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final RecyclerView.AbstractC5070OooOOo f19868OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public RecyclerView f19869OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Runnable f19870OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f19871OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int[] f19872OooO00o = new int[2];
    @VisibleForTesting
    public float OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final int f19873OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final Drawable f19874OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final StateListDrawable f19875OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f19876OooO0O0 = false;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final int[] f19877OooO0O0 = new int[2];

    /* renamed from: OooO0OO  reason: collision with other field name */
    public final int f19878OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public final int f19879OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    @VisibleForTesting
    public int OooO0oO;
    @VisibleForTesting
    public int OooO0oo;
    @VisibleForTesting
    public int OooOO0;
    public int OooOO0O = 0;
    public int OooOO0o = 0;
    public int OooOOO = 0;
    public int OooOOO0 = 0;
    public int OooOOOO = 0;

    /* renamed from: com.pd.sdk.o0O000o$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            C7262o0O000o.this.OooO00o(500);
        }
    }

    /* renamed from: com.pd.sdk.o0O000o$OooO0O0 */
    public class OooO0O0 extends RecyclerView.AbstractC5070OooOOo {
        public OooO0O0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5070OooOOo
        public void OooO00o(RecyclerView recyclerView, int i, int i2) {
            C7262o0O000o.this.OooO00o(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: com.pd.sdk.o0O000o$OooO0OO */
    public class OooO0OO extends AnimatorListenerAdapter {
        public boolean OooO0O0 = false;

        public OooO0OO() {
        }

        public void onAnimationCancel(Animator animator) {
            this.OooO0O0 = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.OooO0O0) {
                this.OooO0O0 = false;
            } else if (((Float) C7262o0O000o.this.f19865OooO00o.getAnimatedValue()).floatValue() == 0.0f) {
                C7262o0O000o o0o000o = C7262o0O000o.this;
                o0o000o.OooOOOO = 0;
                o0o000o.OooO0O0(0);
            } else {
                C7262o0O000o o0o000o2 = C7262o0O000o.this;
                o0o000o2.OooOOOO = 2;
                o0o000o2.m18741OooO0O0();
            }
        }
    }

    /* renamed from: com.pd.sdk.o0O000o$OooO0Oo  reason: case insensitive filesystem */
    public class C7263OooO0Oo implements ValueAnimator.AnimatorUpdateListener {
        public C7263OooO0Oo() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C7262o0O000o.this.f19867OooO00o.setAlpha(floatValue);
            C7262o0O000o.this.f19866OooO00o.setAlpha(floatValue);
            C7262o0O000o.this.m18741OooO0O0();
        }
    }

    public C7262o0O000o(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f19867OooO00o = stateListDrawable;
        this.f19866OooO00o = drawable;
        this.f19875OooO0O0 = stateListDrawable2;
        this.f19874OooO0O0 = drawable2;
        this.f19878OooO0OO = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f19879OooO0Oo = Math.max(i, drawable.getIntrinsicWidth());
        this.OooO0o0 = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.OooO0o = Math.max(i, drawable2.getIntrinsicWidth());
        this.f19864OooO00o = i2;
        this.f19873OooO0O0 = i3;
        this.f19867OooO00o.setAlpha(255);
        this.f19866OooO00o.setAlpha(255);
        this.f19865OooO00o.addListener(new OooO0OO());
        this.f19865OooO00o.addUpdateListener(new C7263OooO0Oo());
        OooO00o(recyclerView);
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    private boolean m18735OooO0Oo() {
        return ViewCompat.m14593OooO0o(this.f19869OooO00o) == 1;
    }

    private void OooO0o() {
        this.f19869OooO00o.OooO00o((RecyclerView.AbstractC5067OooOO0o) this);
        this.f19869OooO00o.OooO00o((RecyclerView.AbstractC5071OooOOo0) this);
        this.f19869OooO00o.OooO00o(this.f19868OooO00o);
    }

    private void OooO0o0() {
        this.f19869OooO00o.OooO0O0((RecyclerView.AbstractC5067OooOO0o) this);
        this.f19869OooO00o.OooO0O0((RecyclerView.AbstractC5071OooOOo0) this);
        this.f19869OooO00o.OooO0O0(this.f19868OooO00o);
        OooO0Oo();
    }

    public void OooO00o(@Nullable RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f19869OooO00o;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                OooO0o0();
            }
            this.f19869OooO00o = recyclerView;
            if (recyclerView != null) {
                OooO0o();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5071OooOOo0
    public void OooO00o(boolean z) {
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m18741OooO0O0() {
        this.f19869OooO00o.invalidate();
    }

    @VisibleForTesting
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m18744OooO0OO() {
        return this.OooOOO0 == 1;
    }

    private void OooO0Oo() {
        this.f19869OooO00o.removeCallbacks(this.f19870OooO00o);
    }

    public void OooO0O0(int i) {
        if (i == 2 && this.OooOOO0 != 2) {
            this.f19867OooO00o.setState(OooO0OO);
            OooO0Oo();
        }
        if (i == 0) {
            m18741OooO0O0();
        } else {
            m18743OooO0OO();
        }
        if (this.OooOOO0 == 2 && i != 2) {
            this.f19867OooO00o.setState(OooO0Oo);
            OooO0OO(OooOoo0);
        } else if (i == 1) {
            OooO0OO(1500);
        }
        this.OooOOO0 = i;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m18743OooO0OO() {
        int i = this.OooOOOO;
        if (i != 0) {
            if (i == 3) {
                this.f19865OooO00o.cancel();
            } else {
                return;
            }
        }
        this.OooOOOO = 1;
        ValueAnimator valueAnimator = this.f19865OooO00o;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f19865OooO00o.setDuration(500L);
        this.f19865OooO00o.setStartDelay(0);
        this.f19865OooO00o.start();
    }

    @VisibleForTesting
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public Drawable m18745OooO0Oo() {
        return this.f19866OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18738OooO00o() {
        return this.OooOOO0 == 2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18737OooO00o() {
        OooO00o(0);
    }

    @VisibleForTesting
    public void OooO00o(int i) {
        int i2 = this.OooOOOO;
        if (i2 == 1) {
            this.f19865OooO00o.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.OooOOOO = 3;
        ValueAnimator valueAnimator = this.f19865OooO00o;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f19865OooO00o.setDuration((long) i);
        this.f19865OooO00o.start();
    }

    private void OooO0OO(int i) {
        OooO0Oo();
        this.f19869OooO00o.postDelayed(this.f19870OooO00o, (long) i);
    }

    @VisibleForTesting
    public Drawable OooO0OO() {
        return this.f19867OooO00o;
    }

    @VisibleForTesting
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18742OooO0O0() {
        return this.OooOOO0 == 0;
    }

    private void OooO00o(Canvas canvas) {
        int i = this.OooOO0o;
        int i2 = this.OooO0o0;
        int i3 = i - i2;
        int i4 = this.OooOO0;
        int i5 = this.OooO;
        int i6 = i4 - (i5 / 2);
        this.f19875OooO0O0.setBounds(0, 0, i5, i2);
        this.f19874OooO0O0.setBounds(0, 0, this.OooOO0O, this.OooO0o);
        canvas.translate(0.0f, (float) i3);
        this.f19874OooO0O0.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f19875OooO0O0.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5067OooOO0o
    public void OooO0O0(Canvas canvas, RecyclerView recyclerView, RecyclerView.C5077OooOoO0 oooOoO0) {
        if (this.OooOO0O != this.f19869OooO00o.getWidth() || this.OooOO0o != this.f19869OooO00o.getHeight()) {
            this.OooOO0O = this.f19869OooO00o.getWidth();
            this.OooOO0o = this.f19869OooO00o.getHeight();
            OooO0O0(0);
        } else if (this.OooOOOO != 0) {
            if (this.f19871OooO00o) {
                OooO0O0(canvas);
            }
            if (this.f19876OooO0O0) {
                OooO00o(canvas);
            }
        }
    }

    private void OooO0O0(Canvas canvas) {
        int i = this.OooOO0O;
        int i2 = this.f19878OooO0OO;
        int i3 = i - i2;
        int i4 = this.OooO0oo;
        int i5 = this.OooO0oO;
        int i6 = i4 - (i5 / 2);
        this.f19867OooO00o.setBounds(0, 0, i2, i5);
        this.f19866OooO00o.setBounds(0, 0, this.f19879OooO0Oo, this.OooOO0o);
        if (m18735OooO0Oo()) {
            this.f19866OooO00o.draw(canvas);
            canvas.translate((float) this.f19878OooO0OO, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f19867OooO00o.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f19878OooO0OO), (float) (-i6));
            return;
        }
        canvas.translate((float) i3, 0.0f);
        this.f19866OooO00o.draw(canvas);
        canvas.translate(0.0f, (float) i6);
        this.f19867OooO00o.draw(canvas);
        canvas.translate((float) (-i3), (float) (-i6));
    }

    public void OooO00o(int i, int i2) {
        int computeVerticalScrollRange = this.f19869OooO00o.computeVerticalScrollRange();
        int i3 = this.OooOO0o;
        this.f19871OooO00o = computeVerticalScrollRange - i3 > 0 && i3 >= this.f19864OooO00o;
        int computeHorizontalScrollRange = this.f19869OooO00o.computeHorizontalScrollRange();
        int i4 = this.OooOO0O;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f19864OooO00o;
        this.f19876OooO0O0 = z;
        if (this.f19871OooO00o || z) {
            if (this.f19871OooO00o) {
                float f = (float) i3;
                this.OooO0oo = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.OooO0oO = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f19876OooO0O0) {
                float f2 = (float) i4;
                this.OooOO0 = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.OooO = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.OooOOO0;
            if (i5 == 0 || i5 == 1) {
                OooO0O0(1);
            }
        } else if (this.OooOOO0 != 0) {
            OooO0O0(0);
        }
    }

    private void OooO0O0(float f) {
        int[] OooO0O02 = OooO0O0();
        float max = Math.max((float) OooO0O02[0], Math.min((float) OooO0O02[1], f));
        if (Math.abs(((float) this.OooO0oo) - max) >= 2.0f) {
            int OooO00o2 = OooO00o(this.OooO00o, max, OooO0O02, this.f19869OooO00o.computeVerticalScrollRange(), this.f19869OooO00o.computeVerticalScrollOffset(), this.OooOO0o);
            if (OooO00o2 != 0) {
                this.f19869OooO00o.scrollBy(0, OooO00o2);
            }
            this.OooO00o = max;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5071OooOOo0, androidx.recyclerview.widget.RecyclerView.AbstractC5071OooOOo0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18739OooO00o(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        int i = this.OooOOO0;
        if (i == 1) {
            boolean OooO0O02 = OooO0O0(motionEvent.getX(), motionEvent.getY());
            boolean OooO00o2 = OooO00o(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!OooO0O02 && !OooO00o2) {
                return false;
            }
            if (OooO00o2) {
                this.OooOOO = 1;
                this.OooO0O0 = (float) ((int) motionEvent.getX());
            } else if (OooO0O02) {
                this.OooOOO = 2;
                this.OooO00o = (float) ((int) motionEvent.getY());
            }
            OooO0O0(2);
        } else if (i == 2) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5071OooOOo0, androidx.recyclerview.widget.RecyclerView.AbstractC5071OooOOo0
    public void OooO00o(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (this.OooOOO0 != 0) {
            if (motionEvent.getAction() == 0) {
                boolean OooO0O02 = OooO0O0(motionEvent.getX(), motionEvent.getY());
                boolean OooO00o2 = OooO00o(motionEvent.getX(), motionEvent.getY());
                if (OooO0O02 || OooO00o2) {
                    if (OooO00o2) {
                        this.OooOOO = 1;
                        this.OooO0O0 = (float) ((int) motionEvent.getX());
                    } else if (OooO0O02) {
                        this.OooOOO = 2;
                        this.OooO00o = (float) ((int) motionEvent.getY());
                    }
                    OooO0O0(2);
                }
            } else if (motionEvent.getAction() == 1 && this.OooOOO0 == 2) {
                this.OooO00o = 0.0f;
                this.OooO0O0 = 0.0f;
                OooO0O0(1);
                this.OooOOO = 0;
            } else if (motionEvent.getAction() == 2 && this.OooOOO0 == 2) {
                m18743OooO0OO();
                if (this.OooOOO == 1) {
                    OooO00o(motionEvent.getX());
                }
                if (this.OooOOO == 2) {
                    OooO0O0(motionEvent.getY());
                }
            }
        }
    }

    @VisibleForTesting
    public boolean OooO0O0(float f, float f2) {
        if (!m18735OooO0Oo() ? f >= ((float) (this.OooOO0O - this.f19878OooO0OO)) : f <= ((float) (this.f19878OooO0OO / 2))) {
            int i = this.OooO0oo;
            int i2 = this.OooO0oO;
            return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
        }
    }

    @VisibleForTesting
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Drawable m18740OooO0O0() {
        return this.f19874OooO0O0;
    }

    private int[] OooO0O0() {
        int[] iArr = this.f19872OooO00o;
        int i = this.f19873OooO0O0;
        iArr[0] = i;
        iArr[1] = this.OooOO0o - i;
        return iArr;
    }

    private void OooO00o(float f) {
        int[] OooO00o2 = OooO00o();
        float max = Math.max((float) OooO00o2[0], Math.min((float) OooO00o2[1], f));
        if (Math.abs(((float) this.OooOO0) - max) >= 2.0f) {
            int OooO00o3 = OooO00o(this.OooO0O0, max, OooO00o2, this.f19869OooO00o.computeHorizontalScrollRange(), this.f19869OooO00o.computeHorizontalScrollOffset(), this.OooOO0O);
            if (OooO00o3 != 0) {
                this.f19869OooO00o.scrollBy(OooO00o3, 0);
            }
            this.OooO0O0 = max;
        }
    }

    private int OooO00o(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @VisibleForTesting
    public boolean OooO00o(float f, float f2) {
        if (f2 >= ((float) (this.OooOO0o - this.OooO0o0))) {
            int i = this.OooOO0;
            int i2 = this.OooO;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
        }
    }

    @VisibleForTesting
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Drawable m18736OooO00o() {
        return this.f19875OooO0O0;
    }

    private int[] OooO00o() {
        int[] iArr = this.f19877OooO0O0;
        int i = this.f19873OooO0O0;
        iArr[0] = i;
        iArr[1] = this.OooOO0O - i;
        return iArr;
    }
}
