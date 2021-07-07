package com.p118pd.sdk;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.pd.sdk.o0O00O  reason: case insensitive filesystem */
public class C7270o0O00O extends AbstractC7280o0O00o {
    public static final float OooO0O0 = 1.0f;
    @Nullable
    public AbstractC7278o0O00OoO OooO00o;
    @Nullable

    /* renamed from: OooO0O0  reason: collision with other field name */
    public AbstractC7278o0O00OoO f19917OooO0O0;

    @NonNull
    private AbstractC7278o0O00OoO OooO0O0(@NonNull RecyclerView.OooOOO0 oooOOO0) {
        AbstractC7278o0O00OoO o0o00ooo = this.OooO00o;
        if (o0o00ooo == null || o0o00ooo.f19945OooO00o != oooOOO0) {
            this.OooO00o = AbstractC7278o0O00OoO.OooO0O0(oooOOO0);
        }
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7280o0O00o
    public int[] OooO00o(@NonNull RecyclerView.OooOOO0 oooOOO0, @NonNull View view) {
        int[] iArr = new int[2];
        if (oooOOO0.m14780OooO00o()) {
            iArr[0] = OooO00o(oooOOO0, view, OooO00o(oooOOO0));
        } else {
            iArr[0] = 0;
        }
        if (oooOOO0.m14787OooO0O0()) {
            iArr[1] = OooO00o(oooOOO0, view, OooO0O0(oooOOO0));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // com.p118pd.sdk.AbstractC7280o0O00o
    public int OooO00o(RecyclerView.OooOOO0 oooOOO0, int i, int i2) {
        int OooO0o0;
        View OooO00o2;
        int OooOO0;
        int i3;
        PointF OooO00o3;
        int i4;
        int i5;
        if (!(oooOOO0 instanceof RecyclerView.OooOo.OooO0O0) || (OooO0o0 = oooOOO0.OooO0o0()) == 0 || (OooO00o2 = m18760OooO00o(oooOOO0)) == null || (OooOO0 = oooOOO0.OooOO0(OooO00o2)) == -1 || (OooO00o3 = ((RecyclerView.OooOo.OooO0O0) oooOOO0).OooO00o(OooO0o0 - 1)) == null) {
            return -1;
        }
        int i6 = 0;
        if (oooOOO0.m14780OooO00o()) {
            i4 = OooO00o(oooOOO0, OooO00o(oooOOO0), i, 0);
            if (OooO00o3.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (oooOOO0.m14787OooO0O0()) {
            i5 = OooO00o(oooOOO0, OooO0O0(oooOOO0), 0, i2);
            if (OooO00o3.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (oooOOO0.m14787OooO0O0()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = OooOO0 + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= OooO0o0 ? i3 : i6;
    }

    @Override // com.p118pd.sdk.AbstractC7280o0O00o, com.p118pd.sdk.AbstractC7280o0O00o, com.p118pd.sdk.AbstractC7280o0O00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public View m18760OooO00o(RecyclerView.OooOOO0 oooOOO0) {
        if (oooOOO0.m14787OooO0O0()) {
            return m18759OooO00o(oooOOO0, OooO0O0(oooOOO0));
        }
        if (oooOOO0.m14780OooO00o()) {
            return m18759OooO00o(oooOOO0, OooO00o(oooOOO0));
        }
        return null;
    }

    private int OooO00o(@NonNull RecyclerView.OooOOO0 oooOOO0, @NonNull View view, AbstractC7278o0O00OoO o0o00ooo) {
        int i;
        int OooO0Oo = o0o00ooo.OooO0Oo(view) + (o0o00ooo.OooO0O0(view) / 2);
        if (oooOOO0.m14790OooO0OO()) {
            i = o0o00ooo.OooO0o() + (o0o00ooo.OooO0oO() / 2);
        } else {
            i = o0o00ooo.OooO00o() / 2;
        }
        return OooO0Oo - i;
    }

    private int OooO00o(RecyclerView.OooOOO0 oooOOO0, AbstractC7278o0O00OoO o0o00ooo, int i, int i2) {
        int[] OooO00o2 = m18778OooO00o(i, i2);
        float OooO00o3 = OooO00o(oooOOO0, o0o00ooo);
        if (OooO00o3 <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(OooO00o2[0]) > Math.abs(OooO00o2[1]) ? OooO00o2[0] : OooO00o2[1])) / OooO00o3);
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    private View m18759OooO00o(RecyclerView.OooOOO0 oooOOO0, AbstractC7278o0O00OoO o0o00ooo) {
        int i;
        int OooO0O02 = oooOOO0.OooO0O0();
        View view = null;
        if (OooO0O02 == 0) {
            return null;
        }
        if (oooOOO0.m14790OooO0OO()) {
            i = o0o00ooo.OooO0o() + (o0o00ooo.OooO0oO() / 2);
        } else {
            i = o0o00ooo.OooO00o() / 2;
        }
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < OooO0O02; i3++) {
            View OooO0O03 = oooOOO0.OooO0O0(i3);
            int abs = Math.abs((o0o00ooo.OooO0Oo(OooO0O03) + (o0o00ooo.OooO0O0(OooO0O03) / 2)) - i);
            if (abs < i2) {
                view = OooO0O03;
                i2 = abs;
            }
        }
        return view;
    }

    private float OooO00o(RecyclerView.OooOOO0 oooOOO0, AbstractC7278o0O00OoO o0o00ooo) {
        int max;
        int OooO0O02 = oooOOO0.OooO0O0();
        if (OooO0O02 == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < OooO0O02; i3++) {
            View OooO0O03 = oooOOO0.OooO0O0(i3);
            int OooOO0 = oooOOO0.OooOO0(OooO0O03);
            if (OooOO0 != -1) {
                if (OooOO0 < i) {
                    view = OooO0O03;
                    i = OooOO0;
                }
                if (OooOO0 > i2) {
                    view2 = OooO0O03;
                    i2 = OooOO0;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(o0o00ooo.OooO00o(view), o0o00ooo.OooO00o(view2)) - Math.min(o0o00ooo.OooO0Oo(view), o0o00ooo.OooO0Oo(view2))) == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i2 - i) + 1));
    }

    @Override // com.p118pd.sdk.AbstractC7280o0O00o, com.p118pd.sdk.AbstractC7280o0O00o, com.p118pd.sdk.AbstractC7280o0O00o
    @NonNull
    private AbstractC7278o0O00OoO OooO00o(@NonNull RecyclerView.OooOOO0 oooOOO0) {
        AbstractC7278o0O00OoO o0o00ooo = this.f19917OooO0O0;
        if (o0o00ooo == null || o0o00ooo.f19945OooO00o != oooOOO0) {
            this.f19917OooO0O0 = AbstractC7278o0O00OoO.OooO00o(oooOOO0);
        }
        return this.f19917OooO0O0;
    }
}
