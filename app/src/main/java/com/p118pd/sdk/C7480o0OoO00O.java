package com.p118pd.sdk;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.pd.sdk.o0OoO00O  reason: case insensitive filesystem */
public class C7480o0OoO00O {
    public static final int OooO = Integer.MIN_VALUE;
    public static final String OooO00o = "LayoutState";
    public static final int OooO0oO = -1;
    public static final int OooO0oo = 1;
    public static final int OooOO0 = -1;
    public static final int OooOO0O = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f20302OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20303OooO00o = true;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f20304OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f20305OooO0OO;
    public int OooO0Oo;
    public int OooO0o = 0;
    public int OooO0o0 = 0;

    public boolean OooO00o(RecyclerView.C5077OooOoO0 oooOoO0) {
        int i = this.OooO0O0;
        return i >= 0 && i < oooOoO0.OooO00o();
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f20302OooO00o + ", mCurrentPosition=" + this.OooO0O0 + ", mItemDirection=" + this.OooO0OO + ", mLayoutDirection=" + this.OooO0Oo + ", mStartLine=" + this.OooO0o0 + ", mEndLine=" + this.OooO0o + '}';
    }

    public View OooO00o(RecyclerView.OooOo00 oooOo00) {
        View OooO0O02 = oooOo00.OooO0O0(this.OooO0O0);
        this.OooO0O0 += this.OooO0OO;
        return OooO0O02;
    }
}
