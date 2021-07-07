package com.p118pd.sdk;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.AbstractC0032Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.umeng.message.proguard.C3848l;
import java.util.Arrays;

/* renamed from: com.pd.sdk.o00o0O00  reason: case insensitive filesystem */
public class C7157o00o0O00 {
    public static final int OooO = 1;
    public static final Interpolator OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f19538OooO00o = "ViewDragHelper";
    public static final int OooO0oO = -1;
    public static final int OooO0oo = 0;
    public static final int OooOO0 = 2;
    public static final int OooOO0O = 1;
    public static final int OooOO0o = 2;
    public static final int OooOOO = 8;
    public static final int OooOOO0 = 4;
    public static final int OooOOOO = 15;
    public static final int OooOOOo = 1;
    public static final int OooOOo = 3;
    public static final int OooOOo0 = 2;
    public static final int OooOOoo = 20;
    public static final int OooOo0 = 600;
    public static final int OooOo00 = 256;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float f19539OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f19540OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public VelocityTracker f19541OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f19542OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ViewGroup f19543OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OverScroller f19544OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0OO f19545OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Runnable f19546OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f19547OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float[] f19548OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f19549OooO00o;
    public float OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f19550OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public float[] f19551OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int[] f19552OooO0O0;
    public int OooO0OO = -1;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public float[] f19553OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int[] f19554OooO0OO;
    public int OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public float[] f19555OooO0Oo;
    public int OooO0o;
    public int OooO0o0;

    /* renamed from: com.pd.sdk.o00o0O00$OooO00o */
    public static class OooO00o implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: com.pd.sdk.o00o0O00$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        public void run() {
            C7157o00o0O00.this.OooO00o(0);
        }
    }

    /* renamed from: com.pd.sdk.o00o0O00$OooO0OO */
    public static abstract class OooO0OO {
        public int OooO00o(int i) {
            return i;
        }

        public int OooO00o(@NonNull View view) {
            return 0;
        }

        public int OooO00o(@NonNull View view, int i, int i2) {
            return 0;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m18559OooO00o(int i) {
        }

        public void OooO00o(int i, int i2) {
        }

        public void OooO00o(@NonNull View view, float f, float f2) {
        }

        public void OooO00o(@NonNull View view, int i) {
        }

        public void OooO00o(@NonNull View view, int i, int i2, @AbstractC0032Px int i3, @AbstractC0032Px int i4) {
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m18560OooO00o(int i) {
            return false;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public abstract boolean m18561OooO00o(@NonNull View view, int i);

        public int OooO0O0(@NonNull View view) {
            return 0;
        }

        public int OooO0O0(@NonNull View view, int i, int i2) {
            return 0;
        }

        public void OooO0O0(int i, int i2) {
        }
    }

    public C7157o00o0O00(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull OooO0OO oooO0OO) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (oooO0OO != null) {
            this.f19543OooO00o = viewGroup;
            this.f19545OooO00o = oooO0OO;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.OooO0o0 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f19550OooO0O0 = viewConfiguration.getScaledTouchSlop();
            this.f19539OooO00o = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.OooO0O0 = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f19544OooO00o = new OverScroller(context, OooO00o);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public static C7157o00o0O00 OooO00o(@NonNull ViewGroup viewGroup, @NonNull OooO0OO oooO0OO) {
        return new C7157o00o0O00(viewGroup.getContext(), viewGroup, oooO0OO);
    }

    public void OooO0O0(int i) {
        this.OooO0o = i;
    }

    @AbstractC0032Px
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public int m18556OooO0OO() {
        return this.f19550OooO0O0;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public int m18558OooO0Oo() {
        return this.f19540OooO00o;
    }

    public static C7157o00o0O00 OooO00o(@NonNull ViewGroup viewGroup, float f, @NonNull OooO0OO oooO0OO) {
        C7157o00o0O00 OooO00o2 = OooO00o(viewGroup, oooO0OO);
        OooO00o2.f19550OooO0O0 = (int) (((float) OooO00o2.f19550OooO0O0) * (1.0f / f));
        return OooO00o2;
    }

    private void OooO0OO() {
        float[] fArr = this.f19548OooO00o;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f19551OooO0O0, 0.0f);
            Arrays.fill(this.f19553OooO0OO, 0.0f);
            Arrays.fill(this.f19555OooO0Oo, 0.0f);
            Arrays.fill(this.f19549OooO00o, 0);
            Arrays.fill(this.f19552OooO0O0, 0);
            Arrays.fill(this.f19554OooO0OO, 0);
            this.OooO0Oo = 0;
        }
    }

    @AbstractC0032Px
    public int OooO0O0() {
        return this.OooO0o0;
    }

    public boolean OooO0Oo(int i, int i2) {
        if (this.f19547OooO00o) {
            return OooO00o(i, i2, (int) this.f19541OooO00o.getXVelocity(this.OooO0OO), (int) this.f19541OooO00o.getYVelocity(this.OooO0OO));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m18554OooO0O0() {
        this.OooO0OO = -1;
        OooO0OO();
        VelocityTracker velocityTracker = this.f19541OooO00o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f19541OooO00o = null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18548OooO00o(float f) {
        this.OooO0O0 = f;
    }

    public float OooO00o() {
        return this.OooO0O0;
    }

    public void OooO00o(@NonNull View view, int i) {
        if (view.getParent() == this.f19543OooO00o) {
            this.f19542OooO00o = view;
            this.OooO0OO = i;
            this.f19545OooO00o.OooO00o(view, i);
            OooO00o(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f19543OooO00o + C3848l.f10402t);
    }

    private void OooO0Oo(int i) {
        float[] fArr = this.f19548OooO00o;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            float[] fArr6 = this.f19548OooO00o;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f19551OooO0O0;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f19553OooO0OO;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f19555OooO0Oo;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f19549OooO00o;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f19552OooO0O0;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f19554OooO0OO;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f19548OooO00o = fArr2;
            this.f19551OooO0O0 = fArr3;
            this.f19553OooO0OO = fArr4;
            this.f19555OooO0Oo = fArr5;
            this.f19549OooO00o = iArr;
            this.f19552OooO0O0 = iArr2;
            this.f19554OooO0OO = iArr3;
        }
    }

    public boolean OooO0O0(@NonNull View view, int i, int i2) {
        this.f19542OooO00o = view;
        this.OooO0OO = -1;
        boolean OooO00o2 = OooO00o(i, i2, 0, 0);
        if (!OooO00o2 && this.f19540OooO00o == 0 && this.f19542OooO00o != null) {
            this.f19542OooO00o = null;
        }
        return OooO00o2;
    }

    private void OooO0OO(int i) {
        if (this.f19548OooO00o != null && m18557OooO0OO(i)) {
            this.f19548OooO00o[i] = 0.0f;
            this.f19551OooO0O0[i] = 0.0f;
            this.f19553OooO0OO[i] = 0.0f;
            this.f19555OooO0Oo[i] = 0.0f;
            this.f19549OooO00o[i] = 0;
            this.f19552OooO0O0[i] = 0;
            this.f19554OooO0OO[i] = 0;
            this.OooO0Oo = ((1 << i) ^ -1) & this.OooO0Oo;
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public View m18545OooO00o() {
        return this.f19542OooO00o;
    }

    private int OooO0O0(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f19543OooO00o.getWidth();
        float f = (float) (width / 2);
        float OooO00o2 = f + (OooO00o(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(OooO00o2 / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m18544OooO00o() {
        return this.OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18547OooO00o() {
        m18554OooO0O0();
        if (this.f19540OooO00o == 2) {
            int currX = this.f19544OooO00o.getCurrX();
            int currY = this.f19544OooO00o.getCurrY();
            this.f19544OooO00o.abortAnimation();
            int currX2 = this.f19544OooO00o.getCurrX();
            int currY2 = this.f19544OooO00o.getCurrY();
            this.f19545OooO00o.OooO00o(this.f19542OooO00o, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        OooO00o(0);
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m18557OooO0OO(int i) {
        return ((1 << i) & this.OooO0Oo) != 0;
    }

    private void OooO0O0(float f, float f2, int i) {
        OooO0Oo(i);
        float[] fArr = this.f19548OooO00o;
        this.f19553OooO0OO[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f19551OooO0O0;
        this.f19555OooO0Oo[i] = f2;
        fArr2[i] = f2;
        this.f19549OooO00o[i] = OooO00o((int) f, (int) f2);
        this.OooO0Oo |= 1 << i;
    }

    public boolean OooO0OO(int i, int i2) {
        return m18557OooO0OO(i2) && (i & this.f19549OooO00o[i2]) != 0;
    }

    private boolean OooO00o(int i, int i2, int i3, int i4) {
        int left = this.f19542OooO00o.getLeft();
        int top = this.f19542OooO00o.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f19544OooO00o.abortAnimation();
            OooO00o(0);
            return false;
        }
        this.f19544OooO00o.startScroll(left, top, i5, i6, OooO00o(this.f19542OooO00o, i5, i6, i3, i4));
        OooO00o(2);
        return true;
    }

    private void OooO0O0(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m18543OooO0Oo(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f19553OooO0OO[pointerId] = x;
                this.f19555OooO0Oo[pointerId] = y;
            }
        }
    }

    private int OooO00o(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int OooO00o2 = OooO00o(i3, (int) this.OooO0O0, (int) this.f19539OooO00o);
        int OooO00o3 = OooO00o(i4, (int) this.OooO0O0, (int) this.f19539OooO00o);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(OooO00o2);
        int abs4 = Math.abs(OooO00o3);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (OooO00o2 != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f5 = f2 / f;
        if (OooO00o3 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f6 = f4 / f3;
        return (int) ((((float) OooO0O0(i, OooO00o2, this.f19545OooO00o.OooO00o(view))) * f5) + (((float) OooO0O0(i2, OooO00o3, this.f19545OooO00o.OooO0O0(view))) * f6));
    }

    private void OooO0Oo() {
        this.f19541OooO00o.computeCurrentVelocity(1000, this.f19539OooO00o);
        OooO00o(OooO00o(this.f19541OooO00o.getXVelocity(this.OooO0OO), this.OooO0O0, this.f19539OooO00o), OooO00o(this.f19541OooO00o.getYVelocity(this.OooO0OO), this.OooO0O0, this.f19539OooO00o));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18555OooO0O0(int i) {
        int length = this.f19549OooO00o.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (OooO0OO(i, i2)) {
                return true;
            }
        }
        return false;
    }

    private void OooO0O0(int i, int i2, int i3, int i4) {
        int left = this.f19542OooO00o.getLeft();
        int top = this.f19542OooO00o.getTop();
        if (i3 != 0) {
            i = this.f19545OooO00o.OooO00o(this.f19542OooO00o, i, i3);
            ViewCompat.OooO0OO(this.f19542OooO00o, i - left);
        }
        if (i4 != 0) {
            i2 = this.f19545OooO00o.OooO0O0(this.f19542OooO00o, i2, i4);
            ViewCompat.OooO0Oo(this.f19542OooO00o, i2 - top);
        }
        if (i3 != 0 || i4 != 0) {
            this.f19545OooO00o.OooO00o(this.f19542OooO00o, i, i2, i - left, i2 - top);
        }
    }

    private int OooO00o(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs > i3) {
            return i > 0 ? i3 : -i3;
        }
        return i;
    }

    private float OooO00o(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs > f3) {
            return f > 0.0f ? f3 : -f3;
        }
        return f;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    private boolean m18543OooO0Oo(int i) {
        if (m18557OooO0OO(i)) {
            return true;
        }
        String str = "Ignoring pointerId=" + i + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.";
        return false;
    }

    private float OooO00o(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18549OooO00o(int i, int i2, int i3, int i4) {
        if (this.f19547OooO00o) {
            this.f19544OooO00o.fling(this.f19542OooO00o.getLeft(), this.f19542OooO00o.getTop(), (int) this.f19541OooO00o.getXVelocity(this.OooO0OO), (int) this.f19541OooO00o.getYVelocity(this.OooO0OO), i, i3, i2, i4);
            OooO00o(2);
            return;
        }
        throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
    }

    public boolean OooO0O0(int i, int i2) {
        return OooO00o(this.f19542OooO00o, i, i2);
    }

    public boolean OooO00o(boolean z) {
        if (this.f19540OooO00o == 2) {
            boolean computeScrollOffset = this.f19544OooO00o.computeScrollOffset();
            int currX = this.f19544OooO00o.getCurrX();
            int currY = this.f19544OooO00o.getCurrY();
            int left = currX - this.f19542OooO00o.getLeft();
            int top = currY - this.f19542OooO00o.getTop();
            if (left != 0) {
                ViewCompat.OooO0OO(this.f19542OooO00o, left);
            }
            if (top != 0) {
                ViewCompat.OooO0Oo(this.f19542OooO00o, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f19545OooO00o.OooO00o(this.f19542OooO00o, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f19544OooO00o.getFinalX() && currY == this.f19544OooO00o.getFinalY()) {
                this.f19544OooO00o.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f19543OooO00o.post(this.f19546OooO00o);
                } else {
                    OooO00o(0);
                }
            }
        }
        if (this.f19540OooO00o == 2) {
            return true;
        }
        return false;
    }

    private void OooO00o(float f, float f2) {
        this.f19547OooO00o = true;
        this.f19545OooO00o.OooO00o(this.f19542OooO00o, f, f2);
        this.f19547OooO00o = false;
        if (this.f19540OooO00o == 1) {
            OooO00o(0);
        }
    }

    public void OooO00o(int i) {
        this.f19543OooO00o.removeCallbacks(this.f19546OooO00o);
        if (this.f19540OooO00o != i) {
            this.f19540OooO00o = i;
            this.f19545OooO00o.m18559OooO00o(i);
            if (this.f19540OooO00o == 0) {
                this.f19542OooO00o = null;
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18553OooO00o(View view, int i) {
        if (view == this.f19542OooO00o && this.OooO0OO == i) {
            return true;
        }
        if (view == null || !this.f19545OooO00o.m18561OooO00o(view, i)) {
            return false;
        }
        this.OooO0OO = i;
        OooO00o(view, i);
        return true;
    }

    public boolean OooO00o(@NonNull View view, boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && OooO00o(childAt, true, i, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z || (!view.canScrollHorizontally(-i) && !view.canScrollVertically(-i2))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: OooO00o  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m18552OooO00o(@androidx.annotation.NonNull android.view.MotionEvent r17) {
        /*
        // Method dump skipped, instructions count: 315
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7157o00o0O00.m18552OooO00o(android.view.MotionEvent):boolean");
    }

    public void OooO00o(@NonNull MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m18554OooO0O0();
        }
        if (this.f19541OooO00o == null) {
            this.f19541OooO00o = VelocityTracker.obtain();
        }
        this.f19541OooO00o.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View OooO00o2 = m18546OooO00o((int) x, (int) y);
            OooO0O0(x, y, pointerId);
            m18553OooO00o(OooO00o2, pointerId);
            int i3 = this.f19549OooO00o[pointerId];
            int i4 = this.OooO0o;
            if ((i3 & i4) != 0) {
                this.f19545OooO00o.OooO0O0(i3 & i4, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f19540OooO00o == 1) {
                OooO0Oo();
            }
            m18554OooO0O0();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f19540OooO00o == 1) {
                    OooO00o(0.0f, 0.0f);
                }
                m18554OooO0O0();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                OooO0O0(x2, y2, pointerId2);
                if (this.f19540OooO00o == 0) {
                    m18553OooO00o(m18546OooO00o((int) x2, (int) y2), pointerId2);
                    int i5 = this.f19549OooO00o[pointerId2];
                    int i6 = this.OooO0o;
                    if ((i5 & i6) != 0) {
                        this.f19545OooO00o.OooO0O0(i5 & i6, pointerId2);
                    }
                } else if (OooO0O0((int) x2, (int) y2)) {
                    m18553OooO00o(this.f19542OooO00o, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f19540OooO00o == 1 && pointerId3 == this.OooO0OO) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.OooO0OO) {
                            View OooO00o3 = m18546OooO00o((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f19542OooO00o;
                            if (OooO00o3 == view && m18553OooO00o(view, pointerId4)) {
                                i = this.OooO0OO;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        OooO0Oo();
                    }
                }
                OooO0OO(pointerId3);
            }
        } else if (this.f19540OooO00o != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (m18543OooO0Oo(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f19548OooO00o[pointerId5];
                    float f2 = y3 - this.f19551OooO0O0[pointerId5];
                    OooO00o(f, f2, pointerId5);
                    if (this.f19540OooO00o != 1) {
                        View OooO00o4 = m18546OooO00o((int) x3, (int) y3);
                        if (OooO00o(OooO00o4, f, f2) && m18553OooO00o(OooO00o4, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            OooO0O0(motionEvent);
        } else if (m18543OooO0Oo(this.OooO0OO)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.OooO0OO);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f19553OooO0OO;
            int i7 = this.OooO0OO;
            int i8 = (int) (x4 - fArr[i7]);
            int i9 = (int) (y4 - this.f19555OooO0Oo[i7]);
            OooO0O0(this.f19542OooO00o.getLeft() + i8, this.f19542OooO00o.getTop() + i9, i8, i9);
            OooO0O0(motionEvent);
        }
    }

    private void OooO00o(float f, float f2, int i) {
        int i2 = 1;
        if (!OooO00o(f, f2, i, 1)) {
            i2 = 0;
        }
        if (OooO00o(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (OooO00o(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (OooO00o(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f19552OooO0O0;
            iArr[i] = iArr[i] | i2;
            this.f19545OooO00o.OooO00o(i2, i);
        }
    }

    private boolean OooO00o(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f19549OooO00o[i] & i2) != i2 || (this.OooO0o & i2) == 0 || (this.f19554OooO0OO[i] & i2) == i2 || (this.f19552OooO0O0[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f19550OooO0O0;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f19545OooO00o.m18560OooO00o(i2)) {
            int[] iArr = this.f19554OooO0OO;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.f19552OooO0O0[i] & i2) != 0 || abs <= ((float) this.f19550OooO0O0)) {
            return false;
        } else {
            return true;
        }
    }

    private boolean OooO00o(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f19545OooO00o.OooO00o(view) > 0;
        boolean z2 = this.f19545OooO00o.OooO0O0(view) > 0;
        if (z && z2) {
            int i = this.f19550OooO0O0;
            if ((f * f) + (f2 * f2) > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f19550OooO0O0)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f19550OooO0O0)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18550OooO00o(int i) {
        int length = this.f19548OooO00o.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m18551OooO00o(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18551OooO00o(int i, int i2) {
        if (!m18557OooO0OO(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f19553OooO0OO[i2] - this.f19548OooO00o[i2];
        float f2 = this.f19555OooO0Oo[i2] - this.f19551OooO0O0[i2];
        if (z && z2) {
            int i3 = this.f19550OooO0O0;
            if ((f * f) + (f2 * f2) > ((float) (i3 * i3))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f19550OooO0O0)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f19550OooO0O0)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean OooO00o(@Nullable View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public View m18546OooO00o(int i, int i2) {
        for (int childCount = this.f19543OooO00o.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f19543OooO00o.getChildAt(this.f19545OooO00o.OooO00o(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    private int OooO00o(int i, int i2) {
        int i3 = i < this.f19543OooO00o.getLeft() + this.OooO0o0 ? 1 : 0;
        if (i2 < this.f19543OooO00o.getTop() + this.OooO0o0) {
            i3 |= 4;
        }
        if (i > this.f19543OooO00o.getRight() - this.OooO0o0) {
            i3 |= 2;
        }
        return i2 > this.f19543OooO00o.getBottom() - this.OooO0o0 ? i3 | 8 : i3;
    }
}
