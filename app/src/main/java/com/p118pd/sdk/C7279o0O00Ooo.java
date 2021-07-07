package com.p118pd.sdk;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.pd.sdk.o0O00Ooo  reason: case insensitive filesystem */
public class C7279o0O00Ooo extends AbstractC7280o0O00o {
    public static final int OooO00o = 100;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7278o0O00OoO f19946OooO00o;
    @Nullable
    public AbstractC7278o0O00OoO OooO0O0;

    @Nullable
    private View OooO0O0(RecyclerView.OooOOO0 oooOOO0, AbstractC7278o0O00OoO o0o00ooo) {
        int OooO0O02 = oooOOO0.OooO0O0();
        View view = null;
        if (OooO0O02 == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < OooO0O02; i2++) {
            View OooO0O03 = oooOOO0.OooO0O0(i2);
            int OooO0Oo = o0o00ooo.OooO0Oo(OooO0O03);
            if (OooO0Oo < i) {
                view = OooO0O03;
                i = OooO0Oo;
            }
        }
        return view;
    }

    @Override // com.p118pd.sdk.AbstractC7280o0O00o
    @Nullable
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

    @NonNull
    private AbstractC7278o0O00OoO OooO0O0(@NonNull RecyclerView.OooOOO0 oooOOO0) {
        AbstractC7278o0O00OoO o0o00ooo = this.f19946OooO00o;
        if (o0o00ooo == null || o0o00ooo.f19945OooO00o != oooOOO0) {
            this.f19946OooO00o = AbstractC7278o0O00OoO.OooO0O0(oooOOO0);
        }
        return this.f19946OooO00o;
    }

    /* renamed from: com.pd.sdk.o0O00Ooo$OooO00o */
    public class OooO00o extends C7273o0O00O0o {
        public OooO00o(Context context) {
            super(context);
        }

        @Override // com.p118pd.sdk.C7273o0O00O0o, androidx.recyclerview.widget.RecyclerView.OooOo
        public void OooO00o(View view, RecyclerView.C5077OooOoO0 oooOoO0, RecyclerView.OooOo.OooO00o oooO00o) {
            C7279o0O00Ooo o0o00ooo = C7279o0O00Ooo.this;
            int[] OooO00o2 = o0o00ooo.OooO00o(((AbstractC7280o0O00o) o0o00ooo).f19949OooO00o.getLayoutManager(), view);
            int i = OooO00o2[0];
            int i2 = OooO00o2[1];
            int OooO00o3 = OooO00o(Math.max(Math.abs(i), Math.abs(i2)));
            if (OooO00o3 > 0) {
                oooO00o.OooO00o(i, i2, OooO00o3, ((C7273o0O00O0o) this).f19924OooO00o);
            }
        }

        @Override // com.p118pd.sdk.C7273o0O00O0o, androidx.recyclerview.widget.RecyclerView.OooOo
        public int OooO0O0(int i) {
            return Math.min(100, super.OooO0O0(i));
        }

        @Override // com.p118pd.sdk.C7273o0O00O0o
        public float OooO00o(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7280o0O00o, com.p118pd.sdk.AbstractC7280o0O00o, com.p118pd.sdk.AbstractC7280o0O00o
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public View m18773OooO00o(RecyclerView.OooOOO0 oooOOO0) {
        if (oooOOO0.m14787OooO0O0()) {
            return OooO00o(oooOOO0, OooO0O0(oooOOO0));
        }
        if (oooOOO0.m14780OooO00o()) {
            return OooO00o(oooOOO0, OooO00o(oooOOO0));
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC7280o0O00o
    public int OooO00o(RecyclerView.OooOOO0 oooOOO0, int i, int i2) {
        int OooOO0;
        PointF OooO00o2;
        int OooO0o0 = oooOOO0.OooO0o0();
        if (OooO0o0 == 0) {
            return -1;
        }
        View view = null;
        if (oooOOO0.m14787OooO0O0()) {
            view = OooO0O0(oooOOO0, OooO0O0(oooOOO0));
        } else if (oooOOO0.m14780OooO00o()) {
            view = OooO0O0(oooOOO0, OooO00o(oooOOO0));
        }
        if (view == null || (OooOO0 = oooOOO0.OooOO0(view)) == -1) {
            return -1;
        }
        boolean z = false;
        boolean z2 = !oooOOO0.m14780OooO00o() ? i2 > 0 : i > 0;
        if ((oooOOO0 instanceof RecyclerView.OooOo.OooO0O0) && (OooO00o2 = ((RecyclerView.OooOo.OooO0O0) oooOOO0).OooO00o(OooO0o0 - 1)) != null && (OooO00o2.x < 0.0f || OooO00o2.y < 0.0f)) {
            z = true;
        }
        return z ? z2 ? OooOO0 - 1 : OooOO0 : z2 ? OooOO0 + 1 : OooOO0;
    }

    @Override // com.p118pd.sdk.AbstractC7280o0O00o, com.p118pd.sdk.AbstractC7280o0O00o, com.p118pd.sdk.AbstractC7280o0O00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7273o0O00O0o m18774OooO00o(RecyclerView.OooOOO0 oooOOO0) {
        if (!(oooOOO0 instanceof RecyclerView.OooOo.OooO0O0)) {
            return null;
        }
        return new OooO00o(((AbstractC7280o0O00o) this).f19949OooO00o.getContext());
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

    @Nullable
    private View OooO00o(RecyclerView.OooOOO0 oooOOO0, AbstractC7278o0O00OoO o0o00ooo) {
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

    @Override // com.p118pd.sdk.AbstractC7280o0O00o, com.p118pd.sdk.AbstractC7280o0O00o, com.p118pd.sdk.AbstractC7280o0O00o
    @NonNull
    private AbstractC7278o0O00OoO OooO00o(@NonNull RecyclerView.OooOOO0 oooOOO0) {
        AbstractC7278o0O00OoO o0o00ooo = this.OooO0O0;
        if (o0o00ooo == null || o0o00ooo.f19945OooO00o != oooOOO0) {
            this.OooO0O0 = AbstractC7278o0O00OoO.OooO00o(oooOOO0);
        }
        return this.OooO0O0;
    }
}
