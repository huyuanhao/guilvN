package com.p118pd.sdk;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.pd.sdk.o0O00o0O  reason: case insensitive filesystem */
public class C7283o0O00o0O {
    public static int OooO00o(RecyclerView.C5077OooOoO0 oooOoO0, AbstractC7278o0O00OoO o0o00ooo, View view, View view2, RecyclerView.OooOOO0 oooOOO0, boolean z, boolean z2) {
        int i;
        if (oooOOO0.OooO0O0() == 0 || oooOoO0.OooO00o() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(oooOOO0.OooOO0(view), oooOOO0.OooOO0(view2));
        int max = Math.max(oooOOO0.OooOO0(view), oooOOO0.OooOO0(view2));
        if (z2) {
            i = Math.max(0, (oooOoO0.OooO00o() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(o0o00ooo.OooO00o(view2) - o0o00ooo.OooO0Oo(view))) / ((float) (Math.abs(oooOOO0.OooOO0(view) - oooOOO0.OooOO0(view2)) + 1)))) + ((float) (o0o00ooo.OooO0o() - o0o00ooo.OooO0Oo(view))));
    }

    public static int OooO0O0(RecyclerView.C5077OooOoO0 oooOoO0, AbstractC7278o0O00OoO o0o00ooo, View view, View view2, RecyclerView.OooOOO0 oooOOO0, boolean z) {
        if (oooOOO0.OooO0O0() == 0 || oooOoO0.OooO00o() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return oooOoO0.OooO00o();
        }
        return (int) ((((float) (o0o00ooo.OooO00o(view2) - o0o00ooo.OooO0Oo(view))) / ((float) (Math.abs(oooOOO0.OooOO0(view) - oooOOO0.OooOO0(view2)) + 1))) * ((float) oooOoO0.OooO00o()));
    }

    public static int OooO00o(RecyclerView.C5077OooOoO0 oooOoO0, AbstractC7278o0O00OoO o0o00ooo, View view, View view2, RecyclerView.OooOOO0 oooOOO0, boolean z) {
        if (oooOOO0.OooO0O0() == 0 || oooOoO0.OooO00o() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oooOOO0.OooOO0(view) - oooOOO0.OooOO0(view2)) + 1;
        }
        return Math.min(o0o00ooo.OooO0oO(), o0o00ooo.OooO00o(view2) - o0o00ooo.OooO0Oo(view));
    }
}
