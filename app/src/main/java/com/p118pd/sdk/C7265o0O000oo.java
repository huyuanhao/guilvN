package com.p118pd.sdk;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.C0082R;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.o0O000oo  reason: case insensitive filesystem */
public class C7265o0O000oo extends RecyclerView.AbstractC5067OooOO0o implements RecyclerView.OooOOOO {
    public static final int OooO = 8;
    public static final String OooO00o = "ItemTouchHelper";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final boolean f19884OooO00o = false;
    public static final int OooO0o = 1;
    public static final int OooO0oO = 2;
    public static final int OooO0oo = 4;
    public static final int OooOO0 = 16;
    public static final int OooOO0O = 32;
    public static final int OooOO0o = 0;
    public static final int OooOOO = 2;
    public static final int OooOOO0 = 1;
    public static final int OooOOOO = 2;
    public static final int OooOOOo = 4;
    public static final int OooOOo = -1;
    public static final int OooOOo0 = 8;
    public static final int OooOOoo = 8;
    public static final int OooOo0 = 65280;
    public static final int OooOo00 = 255;
    public static final int OooOo0O = 16711680;
    public static final int OooOo0o = 1000;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float f19885OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f19886OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f19887OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Rect f19888OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public VelocityTracker f19889OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f19890OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RecyclerView.OooOO0 f19891OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final RecyclerView.AbstractC5071OooOOo0 f19892OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public RecyclerView.AbstractC5079OooOoo0 f19893OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RecyclerView f19894OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7093o00OOO00 f19895OooO00o;
    @NonNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0o f19896OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7268OooO0oO f19897OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Runnable f19898OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<View> f19899OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final float[] f19900OooO00o = new float[2];
    public float OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f19901OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public List<C7269OooO0oo> f19902OooO0O0 = new ArrayList();
    public float OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int f19903OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public List<RecyclerView.AbstractC5079OooOoo0> f19904OooO0OO;
    public float OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public int f19905OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public List<Integer> f19906OooO0Oo;

    /* renamed from: OooO0o  reason: collision with other field name */
    public float f19907OooO0o;
    public float OooO0o0;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public int f19908OooO0o0 = -1;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public float f19909OooO0oO;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public float f19910OooO0oo;

    /* renamed from: com.pd.sdk.o0O000oo$OooO */
    public static abstract class OooO extends OooO0o {
        public int OooO0o;
        public int OooO0oO;

        public OooO(int i, int i2) {
            this.OooO0o = i2;
            this.OooO0oO = i;
        }

        public void OooO00o(int i) {
            this.OooO0oO = i;
        }

        public void OooO0O0(int i) {
            this.OooO0o = i;
        }

        public int OooO0OO(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
            return this.OooO0oO;
        }

        public int OooO0Oo(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
            return this.OooO0o;
        }

        @Override // com.p118pd.sdk.C7265o0O000oo.OooO0o, com.p118pd.sdk.C7265o0O000oo.OooO0o
        public int OooO0O0(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
            return OooO0o.OooO0Oo(OooO0OO(recyclerView, oooOoo0), OooO0Oo(recyclerView, oooOoo0));
        }
    }

    /* renamed from: com.pd.sdk.o0O000oo$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            C7265o0O000oo o0o000oo = C7265o0O000oo.this;
            if (o0o000oo.f19893OooO00o != null && o0o000oo.m18752OooO0O0()) {
                C7265o0O000oo o0o000oo2 = C7265o0O000oo.this;
                RecyclerView.AbstractC5079OooOoo0 oooOoo0 = o0o000oo2.f19893OooO00o;
                if (oooOoo0 != null) {
                    o0o000oo2.m18749OooO00o(oooOoo0);
                }
                C7265o0O000oo o0o000oo3 = C7265o0O000oo.this;
                o0o000oo3.f19894OooO00o.removeCallbacks(o0o000oo3.f19898OooO00o);
                ViewCompat.OooO00o(C7265o0O000oo.this.f19894OooO00o, this);
            }
        }
    }

    /* renamed from: com.pd.sdk.o0O000oo$OooO0OO */
    public class OooO0OO extends C7269OooO0oo {
        public final /* synthetic */ RecyclerView.AbstractC5079OooOoo0 OooO0O0;
        public final /* synthetic */ int o0ooOOo;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0OO(RecyclerView.AbstractC5079OooOoo0 oooOoo0, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.AbstractC5079OooOoo0 oooOoo02) {
            super(oooOoo0, i, i2, f, f2, f3, f4);
            this.o0ooOOo = i3;
            this.OooO0O0 = oooOoo02;
        }

        @Override // com.p118pd.sdk.C7265o0O000oo.C7269OooO0oo
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.OooO0OO) {
                if (this.o0ooOOo <= 0) {
                    C7265o0O000oo o0o000oo = C7265o0O000oo.this;
                    o0o000oo.f19896OooO00o.m18755OooO00o(o0o000oo.f19894OooO00o, this.OooO0O0);
                } else {
                    C7265o0O000oo.this.f19899OooO00o.add(this.OooO0O0.f14626OooO00o);
                    super.OooO0O0 = true;
                    int i = this.o0ooOOo;
                    if (i > 0) {
                        C7265o0O000oo.this.OooO00o(this, i);
                    }
                }
                C7265o0O000oo o0o000oo2 = C7265o0O000oo.this;
                View view = o0o000oo2.f19890OooO00o;
                View view2 = this.OooO0O0.f14626OooO00o;
                if (view == view2) {
                    o0o000oo2.OooO0OO(view2);
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.o0O000oo$OooO0Oo  reason: case insensitive filesystem */
    public class RunnableC7266OooO0Oo implements Runnable {
        public final /* synthetic */ C7269OooO0oo OooO00o;
        public final /* synthetic */ int o00oO0O;

        public RunnableC7266OooO0Oo(C7269OooO0oo oooO0oo, int i) {
            this.OooO00o = oooO0oo;
            this.o00oO0O = i;
        }

        public void run() {
            RecyclerView recyclerView = C7265o0O000oo.this.f19894OooO00o;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                C7269OooO0oo oooO0oo = this.OooO00o;
                if (!oooO0oo.OooO0OO && oooO0oo.f19915OooO00o.OooO00o() != -1) {
                    RecyclerView.ItemAnimator itemAnimator = C7265o0O000oo.this.f19894OooO00o.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.OooO00o((RecyclerView.ItemAnimator.OooO00o) null)) && !C7265o0O000oo.this.m18751OooO00o()) {
                        C7265o0O000oo.this.f19896OooO00o.OooO0O0(this.OooO00o.f19915OooO00o, this.o00oO0O);
                    } else {
                        C7265o0O000oo.this.f19894OooO00o.post(this);
                    }
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.o0O000oo$OooO0o */
    public static abstract class OooO0o {
        public static final long OooO00o = 2000;

        /* renamed from: OooO00o  reason: collision with other field name */
        public static final Interpolator f19912OooO00o = new OooO00o();
        public static final int OooO0O0 = 200;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public static final Interpolator f19913OooO0O0 = new OooO0O0();
        public static final int OooO0OO = 250;
        public static final int OooO0Oo = 3158064;
        public static final int OooO0o0 = 789516;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f19914OooO00o = -1;

        /* renamed from: com.pd.sdk.o0O000oo$OooO0o$OooO00o */
        public static class OooO00o implements Interpolator {
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* renamed from: com.pd.sdk.o0O000oo$OooO0o$OooO0O0 */
        public static class OooO0O0 implements Interpolator {
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        @NonNull
        public static AbstractC7252o0O00 OooO00o() {
            return C7271o0O00O0.OooO00o;
        }

        public static int OooO0O0(int i, int i2) {
            int i3;
            int i4 = i & OooO0o0;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (i4 ^ -1);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= -789517 & i6;
                i3 = (i6 & OooO0o0) << 2;
            }
            return i5 | i3;
        }

        public static int OooO0OO(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int OooO0Oo(int i, int i2) {
            int OooO0OO2 = OooO0OO(0, i2 | i);
            return OooO0OO(2, i) | OooO0OO(1, i2) | OooO0OO2;
        }

        public float OooO00o(float f) {
            return f;
        }

        public float OooO00o(@NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
            return 0.5f;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public int m18754OooO00o() {
            return 0;
        }

        public int OooO00o(int i, int i2) {
            int i3;
            int i4 = i & OooO0Oo;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (i4 ^ -1);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= -3158065 & i6;
                i3 = (i6 & OooO0Oo) >> 2;
            }
            return i5 | i3;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m18756OooO00o() {
            return true;
        }

        public boolean OooO00o(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0, @NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo02) {
            return true;
        }

        public float OooO0O0(float f) {
            return f;
        }

        public float OooO0O0(@NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
            return 0.5f;
        }

        public abstract int OooO0O0(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0);

        public abstract void OooO0O0(@NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0, int i);

        public boolean OooO0O0() {
            return true;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public boolean m18758OooO0O0(RecyclerView recyclerView, RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
            return (OooO00o(recyclerView, oooOoo0) & 65280) != 0;
        }

        public abstract boolean OooO0O0(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0, @NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo02);

        public final int OooO00o(RecyclerView recyclerView, RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
            return OooO00o(OooO0O0(recyclerView, oooOoo0), ViewCompat.m14593OooO0o((View) recyclerView));
        }

        public void OooO0O0(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC5079OooOoo0 oooOoo0, List<C7269OooO0oo> list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C7269OooO0oo oooO0oo = list.get(i2);
                int save = canvas.save();
                OooO0O0(canvas, recyclerView, oooO0oo.f19915OooO00o, oooO0oo.OooO0oo, oooO0oo.OooO, oooO0oo.o00oO0O, false);
                canvas.restoreToCount(save);
            }
            if (oooOoo0 != null) {
                int save2 = canvas.save();
                OooO0O0(canvas, recyclerView, oooOoo0, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C7269OooO0oo oooO0oo2 = list.get(i3);
                if (oooO0oo2.f19916OooO0Oo && !oooO0oo2.OooO0O0) {
                    list.remove(i3);
                } else if (!oooO0oo2.f19916OooO0Oo) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m18757OooO00o(RecyclerView recyclerView, RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
            return (OooO00o(recyclerView, oooOoo0) & C7265o0O000oo.OooOo0O) != 0;
        }

        public RecyclerView.AbstractC5079OooOoo0 OooO00o(@NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0, @NonNull List<RecyclerView.AbstractC5079OooOoo0> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = i + oooOoo0.f14626OooO00o.getWidth();
            int height = i2 + oooOoo0.f14626OooO00o.getHeight();
            int left2 = i - oooOoo0.f14626OooO00o.getLeft();
            int top2 = i2 - oooOoo0.f14626OooO00o.getTop();
            int size = list.size();
            RecyclerView.AbstractC5079OooOoo0 oooOoo02 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.AbstractC5079OooOoo0 oooOoo03 = list.get(i4);
                if (left2 > 0 && (right = oooOoo03.f14626OooO00o.getRight() - width) < 0 && oooOoo03.f14626OooO00o.getRight() > oooOoo0.f14626OooO00o.getRight() && (abs4 = Math.abs(right)) > i3) {
                    oooOoo02 = oooOoo03;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = oooOoo03.f14626OooO00o.getLeft() - i) > 0 && oooOoo03.f14626OooO00o.getLeft() < oooOoo0.f14626OooO00o.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    oooOoo02 = oooOoo03;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = oooOoo03.f14626OooO00o.getTop() - i2) > 0 && oooOoo03.f14626OooO00o.getTop() < oooOoo0.f14626OooO00o.getTop() && (abs2 = Math.abs(top)) > i3) {
                    oooOoo02 = oooOoo03;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = oooOoo03.f14626OooO00o.getBottom() - height) < 0 && oooOoo03.f14626OooO00o.getBottom() > oooOoo0.f14626OooO00o.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    oooOoo02 = oooOoo03;
                    i3 = abs;
                }
            }
            return oooOoo02;
        }

        public void OooO0O0(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, RecyclerView.AbstractC5079OooOoo0 oooOoo0, float f, float f2, int i, boolean z) {
            C7271o0O00O0.OooO00o.OooO0O0(canvas, recyclerView, oooOoo0.f14626OooO00o, f, f2, i, z);
        }

        public void OooO00o(@Nullable RecyclerView.AbstractC5079OooOoo0 oooOoo0, int i) {
            if (oooOoo0 != null) {
                C7271o0O00O0.OooO00o.OooO0O0(oooOoo0.f14626OooO00o);
            }
        }

        private int OooO00o(RecyclerView recyclerView) {
            if (this.f19914OooO00o == -1) {
                this.f19914OooO00o = recyclerView.getResources().getDimensionPixelSize(C0082R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.f19914OooO00o;
        }

        public void OooO00o(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0, int i, @NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo02, int i2, int i3, int i4) {
            RecyclerView.OooOOO0 layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof OooOO0) {
                ((OooOO0) layoutManager).OooO00o(oooOoo0.f14626OooO00o, oooOoo02.f14626OooO00o, i3, i4);
                return;
            }
            if (layoutManager.m14780OooO00o()) {
                if (layoutManager.OooO0OO(oooOoo02.f14626OooO00o) <= recyclerView.getPaddingLeft()) {
                    recyclerView.OooO0oo(i2);
                }
                if (layoutManager.OooO0o(oooOoo02.f14626OooO00o) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.OooO0oo(i2);
                }
            }
            if (layoutManager.m14787OooO0O0()) {
                if (layoutManager.OooO0oO(oooOoo02.f14626OooO00o) <= recyclerView.getPaddingTop()) {
                    recyclerView.OooO0oo(i2);
                }
                if (layoutManager.OooO0O0(oooOoo02.f14626OooO00o) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.OooO0oo(i2);
                }
            }
        }

        public void OooO00o(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC5079OooOoo0 oooOoo0, List<C7269OooO0oo> list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C7269OooO0oo oooO0oo = list.get(i2);
                oooO0oo.OooO0OO();
                int save = canvas.save();
                OooO00o(canvas, recyclerView, oooO0oo.f19915OooO00o, oooO0oo.OooO0oo, oooO0oo.OooO, oooO0oo.o00oO0O, false);
                canvas.restoreToCount(save);
            }
            if (oooOoo0 != null) {
                int save2 = canvas.save();
                OooO00o(canvas, recyclerView, oooOoo0, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m18755OooO00o(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
            C7271o0O00O0.OooO00o.OooO00o(oooOoo0.f14626OooO00o);
        }

        public void OooO00o(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0, float f, float f2, int i, boolean z) {
            C7271o0O00O0.OooO00o.OooO00o(canvas, recyclerView, oooOoo0.f14626OooO00o, f, f2, i, z);
        }

        public long OooO00o(@NonNull RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i == 8 ? 200 : 250;
            }
            if (i == 8) {
                return itemAnimator.OooO0OO();
            }
            return itemAnimator.OooO0Oo();
        }

        public int OooO00o(@NonNull RecyclerView recyclerView, int i, int i2, int i3, long j) {
            float f = 1.0f;
            int signum = (int) (((float) (((int) Math.signum((float) i2)) * OooO00o(recyclerView))) * f19913OooO0O0.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))));
            if (j <= OooO00o) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (((float) signum) * f19912OooO00o.getInterpolation(f));
            if (interpolation == 0) {
                return i2 > 0 ? 1 : -1;
            }
            return interpolation;
        }
    }

    /* renamed from: com.pd.sdk.o0O000oo$OooO0o0  reason: case insensitive filesystem */
    public class C7267OooO0o0 implements RecyclerView.OooOO0 {
        public C7267OooO0o0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOO0
        public int OooO00o(int i, int i2) {
            C7265o0O000oo o0o000oo = C7265o0O000oo.this;
            View view = o0o000oo.f19890OooO00o;
            if (view == null) {
                return i2;
            }
            int i3 = o0o000oo.f19908OooO0o0;
            if (i3 == -1) {
                i3 = o0o000oo.f19894OooO00o.indexOfChild(view);
                C7265o0O000oo.this.f19908OooO0o0 = i3;
            }
            if (i2 == i - 1) {
                return i3;
            }
            return i2 < i3 ? i2 : i2 + 1;
        }
    }

    /* renamed from: com.pd.sdk.o0O000oo$OooO0oO  reason: case insensitive filesystem */
    public class C7268OooO0oO extends GestureDetector.SimpleOnGestureListener {
        public boolean OooO0O0 = true;

        public C7268OooO0oO() {
        }

        public void OooO00o() {
            this.OooO0O0 = false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            View OooO00o2;
            RecyclerView.AbstractC5079OooOoo0 OooO0O02;
            int i;
            if (this.OooO0O0 && (OooO00o2 = C7265o0O000oo.this.m18747OooO00o(motionEvent)) != null && (OooO0O02 = C7265o0O000oo.this.f19894OooO00o.m14731OooO0O0(OooO00o2)) != null) {
                C7265o0O000oo o0o000oo = C7265o0O000oo.this;
                if (o0o000oo.f19896OooO00o.m18757OooO00o(o0o000oo.f19894OooO00o, OooO0O02) && motionEvent.getPointerId(0) == (i = C7265o0O000oo.this.f19886OooO00o)) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    C7265o0O000oo o0o000oo2 = C7265o0O000oo.this;
                    o0o000oo2.f19885OooO00o = x;
                    o0o000oo2.OooO0O0 = y;
                    o0o000oo2.f19907OooO0o = 0.0f;
                    o0o000oo2.OooO0o0 = 0.0f;
                    if (o0o000oo2.f19896OooO00o.OooO0O0()) {
                        C7265o0O000oo.this.m18750OooO00o(OooO0O02, 2);
                    }
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.o0O000oo$OooO0oo  reason: case insensitive filesystem */
    public static class C7269OooO0oo implements Animator.AnimatorListener {
        public float OooO;
        public final ValueAnimator OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final RecyclerView.AbstractC5079OooOoo0 f19915OooO00o;
        public boolean OooO0O0;
        public boolean OooO0OO = false;
        public final float OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public boolean f19916OooO0Oo = false;
        public final float OooO0o;
        public final float OooO0o0;
        public final float OooO0oO;
        public float OooO0oo;
        public float OooOO0;
        public final int o00oO0O;
        public final int o0ooOO0;

        /* renamed from: com.pd.sdk.o0O000oo$OooO0oo$OooO00o */
        public class OooO00o implements ValueAnimator.AnimatorUpdateListener {
            public OooO00o() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7269OooO0oo.this.OooO00o(valueAnimator.getAnimatedFraction());
            }
        }

        public C7269OooO0oo(RecyclerView.AbstractC5079OooOoo0 oooOoo0, int i, int i2, float f, float f2, float f3, float f4) {
            this.o00oO0O = i2;
            this.o0ooOO0 = i;
            this.f19915OooO00o = oooOoo0;
            this.OooO0Oo = f;
            this.OooO0o0 = f2;
            this.OooO0o = f3;
            this.OooO0oO = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.OooO00o = ofFloat;
            ofFloat.addUpdateListener(new OooO00o());
            this.OooO00o.setTarget(oooOoo0.f14626OooO00o);
            this.OooO00o.addListener(this);
            OooO00o(0.0f);
        }

        public void OooO00o(long j) {
            this.OooO00o.setDuration(j);
        }

        public void OooO0O0() {
            this.f19915OooO00o.OooO00o(false);
            this.OooO00o.start();
        }

        public void OooO0OO() {
            float f = this.OooO0Oo;
            float f2 = this.OooO0o;
            if (f == f2) {
                this.OooO0oo = this.f19915OooO00o.f14626OooO00o.getTranslationX();
            } else {
                this.OooO0oo = f + (this.OooOO0 * (f2 - f));
            }
            float f3 = this.OooO0o0;
            float f4 = this.OooO0oO;
            if (f3 == f4) {
                this.OooO = this.f19915OooO00o.f14626OooO00o.getTranslationY();
            } else {
                this.OooO = f3 + (this.OooOO0 * (f4 - f3));
            }
        }

        public void onAnimationCancel(Animator animator) {
            OooO00o(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f19916OooO0Oo) {
                this.f19915OooO00o.OooO00o(true);
            }
            this.f19916OooO0Oo = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void OooO00o() {
            this.OooO00o.cancel();
        }

        public void OooO00o(float f) {
            this.OooOO0 = f;
        }
    }

    /* renamed from: com.pd.sdk.o0O000oo$OooOO0 */
    public interface OooOO0 {
        void OooO00o(@NonNull View view, @NonNull View view2, int i, int i2);
    }

    public C7265o0O000oo(@NonNull OooO0o oooO0o) {
        this.f19896OooO00o = oooO0o;
    }

    public static boolean OooO00o(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    private void OooO0OO() {
        this.f19894OooO00o.OooO0O0((RecyclerView.AbstractC5067OooOO0o) this);
        this.f19894OooO00o.OooO0O0(this.f19892OooO00o);
        this.f19894OooO00o.OooO0O0((RecyclerView.OooOOOO) this);
        for (int size = this.f19902OooO0O0.size() - 1; size >= 0; size--) {
            this.f19896OooO00o.m18755OooO00o(this.f19894OooO00o, this.f19902OooO0O0.get(0).f19915OooO00o);
        }
        this.f19902OooO0O0.clear();
        this.f19890OooO00o = null;
        this.f19908OooO0o0 = -1;
        OooO0Oo();
        OooO0oO();
    }

    private void OooO0Oo() {
        VelocityTracker velocityTracker = this.f19889OooO00o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f19889OooO00o = null;
        }
    }

    private void OooO0o() {
        this.f19897OooO00o = new C7268OooO0oO();
        this.f19895OooO00o = new C7093o00OOO00(this.f19894OooO00o.getContext(), this.f19897OooO00o);
    }

    private void OooO0o0() {
        this.f19905OooO0Oo = ViewConfiguration.get(this.f19894OooO00o.getContext()).getScaledTouchSlop();
        this.f19894OooO00o.OooO00o((RecyclerView.AbstractC5067OooOO0o) this);
        this.f19894OooO00o.OooO00o(this.f19892OooO00o);
        this.f19894OooO00o.OooO00o((RecyclerView.OooOOOO) this);
        OooO0o();
    }

    private void OooO0oO() {
        C7268OooO0oO oooO0oO = this.f19897OooO00o;
        if (oooO0oO != null) {
            oooO0oO.OooO00o();
            this.f19897OooO00o = null;
        }
        if (this.f19895OooO00o != null) {
            this.f19895OooO00o = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void OooO00o(@NonNull View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5067OooOO0o
    public void OooO0O0(Canvas canvas, RecyclerView recyclerView, RecyclerView.C5077OooOoO0 oooOoO0) {
        float f;
        float f2;
        if (this.f19893OooO00o != null) {
            OooO00o(this.f19900OooO00o);
            float[] fArr = this.f19900OooO00o;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f19896OooO00o.OooO0O0(canvas, recyclerView, this.f19893OooO00o, this.f19902OooO0O0, this.f19901OooO0O0, f2, f);
    }

    public void OooO00o(@Nullable RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f19894OooO00o;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                OooO0OO();
            }
            this.f19894OooO00o = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.OooO0OO = resources.getDimension(C0082R.dimen.item_touch_helper_swipe_escape_velocity);
                this.OooO0Oo = resources.getDimension(C0082R.dimen.item_touch_helper_swipe_escape_max_velocity);
                OooO0o0();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c5, code lost:
        if (r1 > 0) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0104 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* renamed from: OooO0O0  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m18752OooO0O0() {
        /*
        // Method dump skipped, instructions count: 281
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7265o0O000oo.m18752OooO0O0():boolean");
    }

    private void OooO00o(float[] fArr) {
        if ((this.f19903OooO0OO & 12) != 0) {
            fArr[0] = (this.f19909OooO0oO + this.OooO0o0) - ((float) this.f19893OooO00o.f14626OooO00o.getLeft());
        } else {
            fArr[0] = this.f19893OooO00o.f14626OooO00o.getTranslationX();
        }
        if ((this.f19903OooO0OO & 3) != 0) {
            fArr[1] = (this.f19910OooO0oo + this.f19907OooO0o) - ((float) this.f19893OooO00o.f14626OooO00o.getTop());
        } else {
            fArr[1] = this.f19893OooO00o.f14626OooO00o.getTranslationY();
        }
    }

    public void OooO0OO(@NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        if (this.f19896OooO00o.m18758OooO0O0(this.f19894OooO00o, oooOoo0) && oooOoo0.f14626OooO00o.getParent() == this.f19894OooO00o) {
            OooO00o();
            this.f19907OooO0o = 0.0f;
            this.OooO0o0 = 0.0f;
            m18750OooO00o(oooOoo0, 1);
        }
    }

    public void OooO0OO(View view) {
        if (view == this.f19890OooO00o) {
            this.f19890OooO00o = null;
            if (this.f19891OooO00o != null) {
                this.f19894OooO00o.setChildDrawingOrderCallback(null);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5067OooOO0o
    public void OooO00o(Canvas canvas, RecyclerView recyclerView, RecyclerView.C5077OooOoO0 oooOoO0) {
        float f;
        float f2;
        this.f19908OooO0o0 = -1;
        if (this.f19893OooO00o != null) {
            OooO00o(this.f19900OooO00o);
            float[] fArr = this.f19900OooO00o;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f19896OooO00o.OooO00o(canvas, recyclerView, this.f19893OooO00o, this.f19902OooO0O0, this.f19901OooO0O0, f2, f);
    }

    /* renamed from: com.pd.sdk.o0O000oo$OooO0O0 */
    public class OooO0O0 implements RecyclerView.AbstractC5071OooOOo0 {
        public OooO0O0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5071OooOOo0, androidx.recyclerview.widget.RecyclerView.AbstractC5071OooOOo0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m18753OooO00o(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            int findPointerIndex;
            C7269OooO0oo OooO00o2;
            C7265o0O000oo.this.f19895OooO00o.OooO00o(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                C7265o0O000oo.this.f19886OooO00o = motionEvent.getPointerId(0);
                C7265o0O000oo.this.f19885OooO00o = motionEvent.getX();
                C7265o0O000oo.this.OooO0O0 = motionEvent.getY();
                C7265o0O000oo.this.OooO00o();
                C7265o0O000oo o0o000oo = C7265o0O000oo.this;
                if (o0o000oo.f19893OooO00o == null && (OooO00o2 = o0o000oo.m18748OooO00o(motionEvent)) != null) {
                    C7265o0O000oo o0o000oo2 = C7265o0O000oo.this;
                    o0o000oo2.f19885OooO00o -= OooO00o2.OooO0oo;
                    o0o000oo2.OooO0O0 -= OooO00o2.OooO;
                    o0o000oo2.OooO00o(OooO00o2.f19915OooO00o, true);
                    if (C7265o0O000oo.this.f19899OooO00o.remove(OooO00o2.f19915OooO00o.f14626OooO00o)) {
                        C7265o0O000oo o0o000oo3 = C7265o0O000oo.this;
                        o0o000oo3.f19896OooO00o.m18755OooO00o(o0o000oo3.f19894OooO00o, OooO00o2.f19915OooO00o);
                    }
                    C7265o0O000oo.this.m18750OooO00o(OooO00o2.f19915OooO00o, OooO00o2.o00oO0O);
                    C7265o0O000oo o0o000oo4 = C7265o0O000oo.this;
                    o0o000oo4.OooO00o(motionEvent, o0o000oo4.f19903OooO0OO, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                C7265o0O000oo o0o000oo5 = C7265o0O000oo.this;
                o0o000oo5.f19886OooO00o = -1;
                o0o000oo5.m18750OooO00o((RecyclerView.AbstractC5079OooOoo0) null, 0);
            } else {
                int i = C7265o0O000oo.this.f19886OooO00o;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    C7265o0O000oo.this.OooO00o(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = C7265o0O000oo.this.f19889OooO00o;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C7265o0O000oo.this.f19893OooO00o != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5071OooOOo0, androidx.recyclerview.widget.RecyclerView.AbstractC5071OooOOo0
        public void OooO00o(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            C7265o0O000oo.this.f19895OooO00o.OooO00o(motionEvent);
            VelocityTracker velocityTracker = C7265o0O000oo.this.f19889OooO00o;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C7265o0O000oo.this.f19886OooO00o != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(C7265o0O000oo.this.f19886OooO00o);
                if (findPointerIndex >= 0) {
                    C7265o0O000oo.this.OooO00o(actionMasked, motionEvent, findPointerIndex);
                }
                C7265o0O000oo o0o000oo = C7265o0O000oo.this;
                RecyclerView.AbstractC5079OooOoo0 oooOoo0 = o0o000oo.f19893OooO00o;
                if (oooOoo0 != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = o0o000oo.f19889OooO00o;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == C7265o0O000oo.this.f19886OooO00o) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    C7265o0O000oo.this.f19886OooO00o = motionEvent.getPointerId(i);
                                    C7265o0O000oo o0o000oo2 = C7265o0O000oo.this;
                                    o0o000oo2.OooO00o(motionEvent, o0o000oo2.f19903OooO0OO, actionIndex);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else if (findPointerIndex >= 0) {
                            o0o000oo.OooO00o(motionEvent, o0o000oo.f19903OooO0OO, findPointerIndex);
                            C7265o0O000oo.this.m18749OooO00o(oooOoo0);
                            C7265o0O000oo o0o000oo3 = C7265o0O000oo.this;
                            o0o000oo3.f19894OooO00o.removeCallbacks(o0o000oo3.f19898OooO00o);
                            C7265o0O000oo.this.f19898OooO00o.run();
                            C7265o0O000oo.this.f19894OooO00o.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    C7265o0O000oo.this.m18750OooO00o((RecyclerView.AbstractC5079OooOoo0) null, 0);
                    C7265o0O000oo.this.f19886OooO00o = -1;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5071OooOOo0
        public void OooO00o(boolean z) {
            if (z) {
                C7265o0O000oo.this.m18750OooO00o((RecyclerView.AbstractC5079OooOoo0) null, 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0137  */
    /* renamed from: OooO00o  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m18750OooO00o(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.AbstractC5079OooOoo0 r24, int r25) {
        /*
        // Method dump skipped, instructions count: 335
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7265o0O000oo.m18750OooO00o(androidx.recyclerview.widget.RecyclerView$OooOoo0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void OooO0O0(@NonNull View view) {
        OooO0OO(view);
        RecyclerView.AbstractC5079OooOoo0 OooO0O02 = this.f19894OooO00o.m14731OooO0O0(view);
        if (OooO0O02 != null) {
            RecyclerView.AbstractC5079OooOoo0 oooOoo0 = this.f19893OooO00o;
            if (oooOoo0 == null || OooO0O02 != oooOoo0) {
                OooO00o(OooO0O02, false);
                if (this.f19899OooO00o.remove(OooO0O02.f14626OooO00o)) {
                    this.f19896OooO00o.m18755OooO00o(this.f19894OooO00o, OooO0O02);
                    return;
                }
                return;
            }
            m18750OooO00o((RecyclerView.AbstractC5079OooOoo0) null, 0);
        }
    }

    public void OooO0O0(@NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        if (this.f19896OooO00o.m18757OooO00o(this.f19894OooO00o, oooOoo0) && oooOoo0.f14626OooO00o.getParent() == this.f19894OooO00o) {
            OooO00o();
            this.f19907OooO0o = 0.0f;
            this.OooO0o0 = 0.0f;
            m18750OooO00o(oooOoo0, 2);
        }
    }

    private int OooO0O0(RecyclerView.AbstractC5079OooOoo0 oooOoo0, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = 2;
        int i3 = this.f19907OooO0o > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f19889OooO00o;
        if (velocityTracker != null && this.f19886OooO00o > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f19896OooO00o.OooO0O0(this.OooO0Oo));
            float xVelocity = this.f19889OooO00o.getXVelocity(this.f19886OooO00o);
            float yVelocity = this.f19889OooO00o.getYVelocity(this.f19886OooO00o);
            if (yVelocity <= 0.0f) {
                i2 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i2 & i) != 0 && i2 == i3 && abs >= this.f19896OooO00o.OooO00o(this.OooO0OO) && abs > Math.abs(xVelocity)) {
                return i2;
            }
        }
        float height = ((float) this.f19894OooO00o.getHeight()) * this.f19896OooO00o.OooO0O0(oooOoo0);
        if ((i & i3) == 0 || Math.abs(this.f19907OooO0o) <= height) {
            return 0;
        }
        return i3;
    }

    public void OooO00o(C7269OooO0oo oooO0oo, int i) {
        this.f19894OooO00o.post(new RunnableC7266OooO0Oo(oooO0oo, i));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18751OooO00o() {
        int size = this.f19902OooO0O0.size();
        for (int i = 0; i < size; i++) {
            if (!this.f19902OooO0O0.get(i).f19916OooO0Oo) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private List<RecyclerView.AbstractC5079OooOoo0> m18746OooO00o(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        RecyclerView.AbstractC5079OooOoo0 oooOoo02 = oooOoo0;
        List<RecyclerView.AbstractC5079OooOoo0> list = this.f19904OooO0OO;
        if (list == null) {
            this.f19904OooO0OO = new ArrayList();
            this.f19906OooO0Oo = new ArrayList();
        } else {
            list.clear();
            this.f19906OooO0Oo.clear();
        }
        int OooO00o2 = this.f19896OooO00o.m18754OooO00o();
        int round = Math.round(this.f19909OooO0oO + this.OooO0o0) - OooO00o2;
        int round2 = Math.round(this.f19910OooO0oo + this.f19907OooO0o) - OooO00o2;
        int i = OooO00o2 * 2;
        int width = oooOoo02.f14626OooO00o.getWidth() + round + i;
        int height = oooOoo02.f14626OooO00o.getHeight() + round2 + i;
        int i2 = (round + width) / 2;
        int i3 = (round2 + height) / 2;
        RecyclerView.OooOOO0 layoutManager = this.f19894OooO00o.getLayoutManager();
        int OooO0O02 = layoutManager.OooO0O0();
        int i4 = 0;
        while (i4 < OooO0O02) {
            View OooO0O03 = layoutManager.OooO0O0(i4);
            if (OooO0O03 != oooOoo02.f14626OooO00o && OooO0O03.getBottom() >= round2 && OooO0O03.getTop() <= height && OooO0O03.getRight() >= round && OooO0O03.getLeft() <= width) {
                RecyclerView.AbstractC5079OooOoo0 OooO0O04 = this.f19894OooO00o.m14731OooO0O0(OooO0O03);
                if (this.f19896OooO00o.OooO00o(this.f19894OooO00o, this.f19893OooO00o, OooO0O04)) {
                    int abs = Math.abs(i2 - ((OooO0O03.getLeft() + OooO0O03.getRight()) / 2));
                    int abs2 = Math.abs(i3 - ((OooO0O03.getTop() + OooO0O03.getBottom()) / 2));
                    int i5 = (abs * abs) + (abs2 * abs2);
                    int size = this.f19904OooO0OO.size();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < size && i5 > this.f19906OooO0Oo.get(i6).intValue()) {
                        i7++;
                        i6++;
                    }
                    this.f19904OooO0OO.add(i7, OooO0O04);
                    this.f19906OooO0Oo.add(i7, Integer.valueOf(i5));
                }
            }
            i4++;
            oooOoo02 = oooOoo0;
        }
        return this.f19904OooO0OO;
    }

    private void OooO0O0() {
        if (Build.VERSION.SDK_INT < 21) {
            if (this.f19891OooO00o == null) {
                this.f19891OooO00o = new C7267OooO0o0();
            }
            this.f19894OooO00o.setChildDrawingOrderCallback(this.f19891OooO00o);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18749OooO00o(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        if (!this.f19894OooO00o.isLayoutRequested() && this.f19901OooO0O0 == 2) {
            float OooO00o2 = this.f19896OooO00o.OooO00o(oooOoo0);
            int i = (int) (this.f19909OooO0oO + this.OooO0o0);
            int i2 = (int) (this.f19910OooO0oo + this.f19907OooO0o);
            if (((float) Math.abs(i2 - oooOoo0.f14626OooO00o.getTop())) >= ((float) oooOoo0.f14626OooO00o.getHeight()) * OooO00o2 || ((float) Math.abs(i - oooOoo0.f14626OooO00o.getLeft())) >= ((float) oooOoo0.f14626OooO00o.getWidth()) * OooO00o2) {
                List<RecyclerView.AbstractC5079OooOoo0> OooO00o3 = m18746OooO00o(oooOoo0);
                if (OooO00o3.size() != 0) {
                    RecyclerView.AbstractC5079OooOoo0 OooO00o4 = this.f19896OooO00o.OooO00o(oooOoo0, OooO00o3, i, i2);
                    if (OooO00o4 == null) {
                        this.f19904OooO0OO.clear();
                        this.f19906OooO0Oo.clear();
                        return;
                    }
                    int OooO00o5 = OooO00o4.OooO00o();
                    int OooO00o6 = oooOoo0.OooO00o();
                    if (this.f19896OooO00o.OooO0O0(this.f19894OooO00o, oooOoo0, OooO00o4)) {
                        this.f19896OooO00o.OooO00o(this.f19894OooO00o, oooOoo0, OooO00o6, OooO00o4, OooO00o5, i, i2);
                    }
                }
            }
        }
    }

    public void OooO00o(RecyclerView.AbstractC5079OooOoo0 oooOoo0, boolean z) {
        for (int size = this.f19902OooO0O0.size() - 1; size >= 0; size--) {
            C7269OooO0oo oooO0oo = this.f19902OooO0O0.get(size);
            if (oooO0oo.f19915OooO00o == oooOoo0) {
                oooO0oo.OooO0OO |= z;
                if (!oooO0oo.f19916OooO0Oo) {
                    oooO0oo.OooO00o();
                }
                this.f19902OooO0O0.remove(size);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5067OooOO0o
    public void OooO00o(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C5077OooOoO0 oooOoO0) {
        rect.setEmpty();
    }

    public void OooO00o() {
        VelocityTracker velocityTracker = this.f19889OooO00o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f19889OooO00o = VelocityTracker.obtain();
    }

    private RecyclerView.AbstractC5079OooOoo0 OooO00o(MotionEvent motionEvent) {
        View OooO00o2;
        RecyclerView.OooOOO0 layoutManager = this.f19894OooO00o.getLayoutManager();
        int i = this.f19886OooO00o;
        if (i == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f19885OooO00o);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.OooO0O0);
        int i2 = this.f19905OooO0Oo;
        if (abs < ((float) i2) && abs2 < ((float) i2)) {
            return null;
        }
        if (abs > abs2 && layoutManager.m14780OooO00o()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.m14787OooO0O0()) && (OooO00o2 = m18747OooO00o(motionEvent)) != null) {
            return this.f19894OooO00o.m14731OooO0O0(OooO00o2);
        }
        return null;
    }

    public void OooO00o(int i, MotionEvent motionEvent, int i2) {
        RecyclerView.AbstractC5079OooOoo0 OooO00o2;
        int OooO00o3;
        if (this.f19893OooO00o == null && i == 2 && this.f19901OooO0O0 != 2 && this.f19896OooO00o.m18756OooO00o() && this.f19894OooO00o.getScrollState() != 1 && (OooO00o2 = OooO00o(motionEvent)) != null && (OooO00o3 = (this.f19896OooO00o.OooO00o(this.f19894OooO00o, OooO00o2) & 65280) >> 8) != 0) {
            float x = motionEvent.getX(i2);
            float y = motionEvent.getY(i2);
            float f = x - this.f19885OooO00o;
            float f2 = y - this.OooO0O0;
            float abs = Math.abs(f);
            float abs2 = Math.abs(f2);
            int i3 = this.f19905OooO0Oo;
            if (abs >= ((float) i3) || abs2 >= ((float) i3)) {
                if (abs > abs2) {
                    if (f < 0.0f && (OooO00o3 & 4) == 0) {
                        return;
                    }
                    if (f > 0.0f && (OooO00o3 & 8) == 0) {
                        return;
                    }
                } else if (f2 < 0.0f && (OooO00o3 & 1) == 0) {
                    return;
                } else {
                    if (f2 > 0.0f && (OooO00o3 & 2) == 0) {
                        return;
                    }
                }
                this.f19907OooO0o = 0.0f;
                this.OooO0o0 = 0.0f;
                this.f19886OooO00o = motionEvent.getPointerId(0);
                m18750OooO00o(OooO00o2, 1);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public View m18747OooO00o(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.AbstractC5079OooOoo0 oooOoo0 = this.f19893OooO00o;
        if (oooOoo0 != null) {
            View view = oooOoo0.f14626OooO00o;
            if (OooO00o(view, x, y, this.f19909OooO0oO + this.OooO0o0, this.f19910OooO0oo + this.f19907OooO0o)) {
                return view;
            }
        }
        for (int size = this.f19902OooO0O0.size() - 1; size >= 0; size--) {
            C7269OooO0oo oooO0oo = this.f19902OooO0O0.get(size);
            View view2 = oooO0oo.f19915OooO00o.f14626OooO00o;
            if (OooO00o(view2, x, y, oooO0oo.OooO0oo, oooO0oo.OooO)) {
                return view2;
            }
        }
        return this.f19894OooO00o.OooO00o(x, y);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7269OooO0oo m18748OooO00o(MotionEvent motionEvent) {
        if (this.f19902OooO0O0.isEmpty()) {
            return null;
        }
        View OooO00o2 = m18747OooO00o(motionEvent);
        for (int size = this.f19902OooO0O0.size() - 1; size >= 0; size--) {
            C7269OooO0oo oooO0oo = this.f19902OooO0O0.get(size);
            if (oooO0oo.f19915OooO00o.f14626OooO00o == OooO00o2) {
                return oooO0oo;
            }
        }
        return null;
    }

    public void OooO00o(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f19885OooO00o;
        this.OooO0o0 = f;
        this.f19907OooO0o = y - this.OooO0O0;
        if ((i & 4) == 0) {
            this.OooO0o0 = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.OooO0o0 = Math.min(0.0f, this.OooO0o0);
        }
        if ((i & 1) == 0) {
            this.f19907OooO0o = Math.max(0.0f, this.f19907OooO0o);
        }
        if ((i & 2) == 0) {
            this.f19907OooO0o = Math.min(0.0f, this.f19907OooO0o);
        }
    }

    private int OooO00o(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        if (this.f19901OooO0O0 == 2) {
            return 0;
        }
        int OooO0O02 = this.f19896OooO00o.OooO0O0(this.f19894OooO00o, oooOoo0);
        int OooO00o2 = (this.f19896OooO00o.OooO00o(OooO0O02, ViewCompat.m14593OooO0o((View) this.f19894OooO00o)) & 65280) >> 8;
        if (OooO00o2 == 0) {
            return 0;
        }
        int i = (OooO0O02 & 65280) >> 8;
        if (Math.abs(this.OooO0o0) > Math.abs(this.f19907OooO0o)) {
            int OooO00o3 = OooO00o(oooOoo0, OooO00o2);
            if (OooO00o3 > 0) {
                return (i & OooO00o3) == 0 ? OooO0o.OooO0O0(OooO00o3, ViewCompat.m14593OooO0o((View) this.f19894OooO00o)) : OooO00o3;
            }
            int OooO0O03 = OooO0O0(oooOoo0, OooO00o2);
            if (OooO0O03 > 0) {
                return OooO0O03;
            }
        } else {
            int OooO0O04 = OooO0O0(oooOoo0, OooO00o2);
            if (OooO0O04 > 0) {
                return OooO0O04;
            }
            int OooO00o4 = OooO00o(oooOoo0, OooO00o2);
            if (OooO00o4 > 0) {
                return (i & OooO00o4) == 0 ? OooO0o.OooO0O0(OooO00o4, ViewCompat.m14593OooO0o((View) this.f19894OooO00o)) : OooO00o4;
            }
        }
        return 0;
    }

    private int OooO00o(RecyclerView.AbstractC5079OooOoo0 oooOoo0, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = 8;
        int i3 = this.OooO0o0 > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f19889OooO00o;
        if (velocityTracker != null && this.f19886OooO00o > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f19896OooO00o.OooO0O0(this.OooO0Oo));
            float xVelocity = this.f19889OooO00o.getXVelocity(this.f19886OooO00o);
            float yVelocity = this.f19889OooO00o.getYVelocity(this.f19886OooO00o);
            if (xVelocity <= 0.0f) {
                i2 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i2 & i) != 0 && i3 == i2 && abs >= this.f19896OooO00o.OooO00o(this.OooO0OO) && abs > Math.abs(yVelocity)) {
                return i2;
            }
        }
        float width = ((float) this.f19894OooO00o.getWidth()) * this.f19896OooO00o.OooO0O0(oooOoo0);
        if ((i & i3) == 0 || Math.abs(this.OooO0o0) <= width) {
            return 0;
        }
        return i3;
    }
}
