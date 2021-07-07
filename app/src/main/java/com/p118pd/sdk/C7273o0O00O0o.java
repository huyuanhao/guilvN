package com.p118pd.sdk;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.pd.sdk.o0O00O0o  reason: case insensitive filesystem */
public class C7273o0O00O0o extends RecyclerView.OooOo {
    public static final String OooO00o = "LinearSmoothScroller";
    public static final float OooO0O0 = 25.0f;
    public static final float OooO0OO = 1.2f;
    public static final int OooO0Oo = 10000;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final boolean f19921OooO0Oo = false;
    public static final int OooO0o = 1;
    public static final int OooO0o0 = -1;
    public static final int OooO0oO = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final float f19922OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PointF f19923OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final DecelerateInterpolator f19924OooO00o = new DecelerateInterpolator();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LinearInterpolator f19925OooO00o = new LinearInterpolator();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f19926OooO0O0 = 0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int f19927OooO0OO = 0;

    public C7273o0O00O0o(Context context) {
        this.f19922OooO00o = OooO00o(context.getResources().getDisplayMetrics());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    private int OooO00o(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo, androidx.recyclerview.widget.RecyclerView.OooOo, androidx.recyclerview.widget.RecyclerView.OooOo, androidx.recyclerview.widget.RecyclerView.OooOo
    public void OooO00o() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public void OooO00o(View view, RecyclerView.C5077OooOoO0 oooOoO0, RecyclerView.OooOo.OooO00o oooO00o) {
        int OooO00o2 = OooO00o(view, OooO0OO());
        int OooO0O02 = OooO0O0(view, OooO0Oo());
        int OooO00o3 = OooO00o((int) Math.sqrt((double) ((OooO00o2 * OooO00o2) + (OooO0O02 * OooO0O02))));
        if (OooO00o3 > 0) {
            oooO00o.OooO00o(-OooO00o2, -OooO0O02, OooO00o3, this.f19924OooO00o);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo, androidx.recyclerview.widget.RecyclerView.OooOo, androidx.recyclerview.widget.RecyclerView.OooOo
    public void OooO0O0() {
        this.f19927OooO0OO = 0;
        this.f19926OooO0O0 = 0;
        this.f19923OooO00o = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public int OooO0OO() {
        PointF pointF = this.f19923OooO00o;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public int OooO0Oo() {
        PointF pointF = this.f19923OooO00o;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public int OooO0O0(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * this.f19922OooO00o));
    }

    public int OooO0O0(View view, int i) {
        RecyclerView.OooOOO0 OooO00o2 = m14813OooO00o();
        if (OooO00o2 == null || !OooO00o2.m14787OooO0O0()) {
            return 0;
        }
        RecyclerView.OooOOO oooOOO = (RecyclerView.OooOOO) view.getLayoutParams();
        return OooO00o(OooO00o2.OooO0oO(view) - ((ViewGroup.MarginLayoutParams) oooOOO).topMargin, OooO00o2.OooO0O0(view) + ((ViewGroup.MarginLayoutParams) oooOOO).bottomMargin, OooO00o2.OooOOO(), OooO00o2.OooO0OO() - OooO00o2.OooO(), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public void OooO00o(int i, int i2, RecyclerView.C5077OooOoO0 oooOoO0, RecyclerView.OooOo.OooO00o oooO00o) {
        if (OooO00o() == 0) {
            OooO0OO();
            return;
        }
        this.f19926OooO0O0 = OooO00o(this.f19926OooO0O0, i);
        int OooO00o2 = OooO00o(this.f19927OooO0OO, i2);
        this.f19927OooO0OO = OooO00o2;
        if (this.f19926OooO0O0 == 0 && OooO00o2 == 0) {
            OooO00o(oooO00o);
        }
    }

    public float OooO00o(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo, androidx.recyclerview.widget.RecyclerView.OooOo, androidx.recyclerview.widget.RecyclerView.OooOo
    public int OooO00o(int i) {
        double OooO0O02 = (double) OooO0O0(i);
        Double.isNaN(OooO0O02);
        return (int) Math.ceil(OooO0O02 / 0.3356d);
    }

    public void OooO00o(RecyclerView.OooOo.OooO00o oooO00o) {
        PointF OooO00o2 = OooO00o(OooO0O0());
        if (OooO00o2 == null || (OooO00o2.x == 0.0f && OooO00o2.y == 0.0f)) {
            oooO00o.OooO00o(OooO0O0());
            OooO0OO();
            return;
        }
        OooO00o(OooO00o2);
        this.f19923OooO00o = OooO00o2;
        this.f19926OooO0O0 = (int) (OooO00o2.x * 10000.0f);
        this.f19927OooO0OO = (int) (OooO00o2.y * 10000.0f);
        oooO00o.OooO00o((int) (((float) this.f19926OooO0O0) * 1.2f), (int) (((float) this.f19927OooO0OO) * 1.2f), (int) (((float) OooO0O0(10000)) * 1.2f), this.f19925OooO00o);
    }

    public int OooO00o(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int OooO00o(View view, int i) {
        RecyclerView.OooOOO0 OooO00o2 = m14813OooO00o();
        if (OooO00o2 == null || !OooO00o2.m14780OooO00o()) {
            return 0;
        }
        RecyclerView.OooOOO oooOOO = (RecyclerView.OooOOO) view.getLayoutParams();
        return OooO00o(OooO00o2.OooO0OO(view) - ((ViewGroup.MarginLayoutParams) oooOOO).leftMargin, OooO00o2.OooO0o(view) + ((ViewGroup.MarginLayoutParams) oooOOO).rightMargin, OooO00o2.OooOO0O(), OooO00o2.OooOOOO() - OooO00o2.OooOO0o(), i);
    }
}
