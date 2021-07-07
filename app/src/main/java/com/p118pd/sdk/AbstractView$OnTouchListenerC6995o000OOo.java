package com.p118pd.sdk;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o000OOo  reason: case insensitive filesystem */
public abstract class AbstractView$OnTouchListenerC6995o000OOo implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final View OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Runnable f19215OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int[] f19216OooO00o = new int[2];
    public Runnable OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f19217OooO0O0;
    public final float OooO0Oo;
    public final int o00oO0O;
    public final int o0ooOO0;
    public int o0ooOOo;

    /* renamed from: com.pd.sdk.o000OOo$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            ViewParent parent = AbstractView$OnTouchListenerC6995o000OOo.this.OooO00o.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: com.pd.sdk.o000OOo$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        public void run() {
            AbstractView$OnTouchListenerC6995o000OOo.this.m18211OooO00o();
        }
    }

    public AbstractView$OnTouchListenerC6995o000OOo(View view) {
        this.OooO00o = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.OooO0Oo = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.o00oO0O = tapTimeout;
        this.o0ooOO0 = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public abstract AbstractC5974OoooO OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18212OooO00o() {
        AbstractC5974OoooO OooO00o2 = OooO00o();
        if (OooO00o2 == null || OooO00o2.OooO0O0()) {
            return true;
        }
        OooO00o2.m16808OooO00o();
        return true;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18213OooO0O0() {
        AbstractC5974OoooO OooO00o2 = OooO00o();
        if (OooO00o2 == null || !OooO00o2.OooO0O0()) {
            return true;
        }
        OooO00o2.dismiss();
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f19217OooO0O0;
        if (z2) {
            z = OooO00o(motionEvent) || !m18213OooO0O0();
        } else {
            z = OooO0O0(motionEvent) && m18212OooO00o();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.OooO00o.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f19217OooO0O0 = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f19217OooO0O0 = false;
        this.o0ooOOo = -1;
        Runnable runnable = this.f19215OooO00o;
        if (runnable != null) {
            this.OooO00o.removeCallbacks(runnable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean OooO0O0(android.view.MotionEvent r6) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.AbstractView$OnTouchListenerC6995o000OOo.OooO0O0(android.view.MotionEvent):boolean");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18211OooO00o() {
        OooO0O0();
        View view = this.OooO00o;
        if (view.isEnabled() && !view.isLongClickable() && m18212OooO00o()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f19217OooO0O0 = true;
        }
    }

    private boolean OooO00o(MotionEvent motionEvent) {
        C8709oo0o0Oo oo0o0oo;
        View view = this.OooO00o;
        AbstractC5974OoooO OooO00o2 = OooO00o();
        if (OooO00o2 == null || !OooO00o2.OooO0O0() || (oo0o0oo = (C8709oo0o0Oo) OooO00o2.OooO00o()) == null || !oo0o0oo.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        OooO00o(view, obtainNoHistory);
        OooO0O0(oo0o0oo, obtainNoHistory);
        boolean OooO00o3 = oo0o0oo.OooO00o(obtainNoHistory, this.o0ooOOo);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        boolean z = (actionMasked == 1 || actionMasked == 3) ? false : true;
        if (!OooO00o3 || !z) {
            return false;
        }
        return true;
    }

    private void OooO0O0() {
        Runnable runnable = this.OooO0O0;
        if (runnable != null) {
            this.OooO00o.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f19215OooO00o;
        if (runnable2 != null) {
            this.OooO00o.removeCallbacks(runnable2);
        }
    }

    public static boolean OooO00o(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    private boolean OooO0O0(View view, MotionEvent motionEvent) {
        int[] iArr = this.f19216OooO00o;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    private boolean OooO00o(View view, MotionEvent motionEvent) {
        int[] iArr = this.f19216OooO00o;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }
}
