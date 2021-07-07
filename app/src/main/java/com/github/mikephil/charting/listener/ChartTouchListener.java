package com.github.mikephil.charting.listener;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.p118pd.sdk.AbstractC8194oOOo0OoO;
import com.p118pd.sdk.AbstractC8311oOo0o00;
import com.p118pd.sdk.C8246oOOoo0oO;

public abstract class ChartTouchListener<T extends AbstractC8194oOOo0OoO<?>> extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    public static final int o0OO00O = 5;
    public static final int o0OOO0o = 3;
    public static final int o0Oo0oo = 4;
    public static final int o0ooOO0 = 0;
    public static final int o0ooOOo = 1;
    public static final int o0ooOoO = 2;
    public static final int oo0o0Oo = 6;
    public GestureDetector OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ChartGesture f14954OooO00o = ChartGesture.NONE;

    /* renamed from: OooO00o  reason: collision with other field name */
    public T f14955OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8246oOOoo0oO f14956OooO00o;
    public int o00oO0O = 0;

    public enum ChartGesture {
        NONE,
        DRAG,
        X_ZOOM,
        Y_ZOOM,
        PINCH_ZOOM,
        ROTATE,
        SINGLE_TAP,
        DOUBLE_TAP,
        LONG_PRESS,
        FLING
    }

    public ChartTouchListener(T t) {
        this.f14955OooO00o = t;
        this.OooO00o = new GestureDetector(t.getContext(), this);
    }

    public void OooO00o(MotionEvent motionEvent) {
        AbstractC8311oOo0o00 onChartGestureListener = this.f14955OooO00o.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.OooO0O0(motionEvent, this.f14954OooO00o);
        }
    }

    public void OooO0O0(MotionEvent motionEvent) {
        AbstractC8311oOo0o00 onChartGestureListener = this.f14955OooO00o.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.OooO00o(motionEvent, this.f14954OooO00o);
        }
    }

    public void OooO00o(C8246oOOoo0oO ooooo0oo) {
        this.f14956OooO00o = ooooo0oo;
    }

    public int OooO00o() {
        return this.o00oO0O;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ChartGesture m15104OooO00o() {
        return this.f14954OooO00o;
    }

    public void OooO00o(C8246oOOoo0oO ooooo0oo, MotionEvent motionEvent) {
        if (ooooo0oo == null || ooooo0oo.OooO00o(this.f14956OooO00o)) {
            this.f14955OooO00o.OooO00o(null, true);
            this.f14956OooO00o = null;
            return;
        }
        this.f14955OooO00o.OooO00o(ooooo0oo, true);
        this.f14956OooO00o = ooooo0oo;
    }

    public static float OooO00o(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }
}
