package com.p118pd.sdk;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

@Deprecated
/* renamed from: com.pd.sdk.o00o000o  reason: case insensitive filesystem */
public final class C7148o00o000o {
    public OverScroller OooO00o;

    public C7148o00o000o(Context context, Interpolator interpolator) {
        OverScroller overScroller;
        if (interpolator == null) {
            overScroller = new OverScroller(context);
        }
        this.OooO00o = overScroller;
    }

    @Deprecated
    public static C7148o00o000o OooO00o(Context context) {
        return OooO00o(context, null);
    }

    @Deprecated
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18520OooO0O0() {
        return this.OooO00o.isFinished();
    }

    @Deprecated
    public int OooO0OO() {
        return this.OooO00o.getFinalX();
    }

    @Deprecated
    public int OooO0Oo() {
        return this.OooO00o.getFinalY();
    }

    @Deprecated
    public static C7148o00o000o OooO00o(Context context, Interpolator interpolator) {
        return new C7148o00o000o(context, interpolator);
    }

    @Deprecated
    public int OooO0O0() {
        return this.OooO00o.getCurrY();
    }

    @Deprecated
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m18521OooO0OO() {
        return this.OooO00o.isOverScrolled();
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m18517OooO00o() {
        return this.OooO00o.getCurrX();
    }

    @Deprecated
    public void OooO0O0(int i, int i2, int i3) {
        this.OooO00o.notifyVerticalEdgeReached(i, i2, i3);
    }

    @Deprecated
    public float OooO00o() {
        return this.OooO00o.getCurrVelocity();
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18519OooO00o() {
        return this.OooO00o.computeScrollOffset();
    }

    @Deprecated
    public void OooO00o(int i, int i2, int i3, int i4) {
        this.OooO00o.startScroll(i, i2, i3, i4);
    }

    @Deprecated
    public void OooO00o(int i, int i2, int i3, int i4, int i5) {
        this.OooO00o.startScroll(i, i2, i3, i4, i5);
    }

    @Deprecated
    public void OooO00o(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.OooO00o.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    @Deprecated
    public void OooO00o(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.OooO00o.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    @Deprecated
    public boolean OooO00o(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.OooO00o.springBack(i, i2, i3, i4, i5, i6);
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18518OooO00o() {
        this.OooO00o.abortAnimation();
    }

    @Deprecated
    public void OooO00o(int i, int i2, int i3) {
        this.OooO00o.notifyHorizontalEdgeReached(i, i2, i3);
    }
}
