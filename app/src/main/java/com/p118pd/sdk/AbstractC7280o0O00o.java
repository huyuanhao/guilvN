package com.p118pd.sdk;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.pd.sdk.o0O00o  reason: case insensitive filesystem */
public abstract class AbstractC7280o0O00o extends RecyclerView.AbstractC5069OooOOOo {
    public static final float OooO00o = 100.0f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Scroller f19947OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final RecyclerView.AbstractC5070OooOOo f19948OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public RecyclerView f19949OooO00o;

    private void OooO0O0() {
        this.f19949OooO00o.OooO0O0(this.f19948OooO00o);
        this.f19949OooO00o.setOnFlingListener(null);
    }

    private void OooO0OO() throws IllegalStateException {
        if (this.f19949OooO00o.getOnFlingListener() == null) {
            this.f19949OooO00o.OooO00o(this.f19948OooO00o);
            this.f19949OooO00o.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract int m18775OooO00o(RecyclerView.OooOOO0 oooOOO0, int i, int i2);

    @Nullable
    public abstract View OooO00o(RecyclerView.OooOOO0 oooOOO0);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5069OooOOOo
    public boolean OooO00o(int i, int i2) {
        RecyclerView.OooOOO0 layoutManager = this.f19949OooO00o.getLayoutManager();
        if (layoutManager == null || this.f19949OooO00o.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f19949OooO00o.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && OooO00o(layoutManager, i, i2)) {
            return true;
        }
        return false;
    }

    @Nullable
    public abstract int[] OooO00o(@NonNull RecyclerView.OooOOO0 oooOOO0, @NonNull View view);

    /* renamed from: com.pd.sdk.o0O00o$OooO00o */
    public class OooO00o extends RecyclerView.AbstractC5070OooOOo {

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f19950OooO00o = false;

        public OooO00o() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5070OooOOo
        public void OooO00o(RecyclerView recyclerView, int i) {
            super.OooO00o(recyclerView, i);
            if (i == 0 && this.f19950OooO00o) {
                this.f19950OooO00o = false;
                AbstractC7280o0O00o.this.OooO00o();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5070OooOOo
        public void OooO00o(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f19950OooO00o = true;
            }
        }
    }

    /* renamed from: com.pd.sdk.o0O00o$OooO0O0 */
    public class OooO0O0 extends C7273o0O00O0o {
        public OooO0O0(Context context) {
            super(context);
        }

        @Override // com.p118pd.sdk.C7273o0O00O0o, androidx.recyclerview.widget.RecyclerView.OooOo
        public void OooO00o(View view, RecyclerView.C5077OooOoO0 oooOoO0, RecyclerView.OooOo.OooO00o oooO00o) {
            AbstractC7280o0O00o o0o00o = AbstractC7280o0O00o.this;
            RecyclerView recyclerView = o0o00o.f19949OooO00o;
            if (recyclerView != null) {
                int[] OooO00o2 = o0o00o.OooO00o(recyclerView.getLayoutManager(), view);
                int i = OooO00o2[0];
                int i2 = OooO00o2[1];
                int OooO00o3 = OooO00o(Math.max(Math.abs(i), Math.abs(i2)));
                if (OooO00o3 > 0) {
                    oooO00o.OooO00o(i, i2, OooO00o3, ((C7273o0O00O0o) this).f19924OooO00o);
                }
            }
        }

        @Override // com.p118pd.sdk.C7273o0O00O0o
        public float OooO00o(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public void OooO00o(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f19949OooO00o;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                OooO0O0();
            }
            this.f19949OooO00o = recyclerView;
            if (recyclerView != null) {
                OooO0OO();
                this.f19947OooO00o = new Scroller(this.f19949OooO00o.getContext(), new DecelerateInterpolator());
                OooO00o();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5069OooOOOo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m18778OooO00o(int i, int i2) {
        this.f19947OooO00o.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f19947OooO00o.getFinalX(), this.f19947OooO00o.getFinalY()};
    }

    private boolean OooO00o(@NonNull RecyclerView.OooOOO0 oooOOO0, int i, int i2) {
        RecyclerView.OooOo OooO00o2;
        int OooO00o3;
        if (!(oooOOO0 instanceof RecyclerView.OooOo.OooO0O0) || (OooO00o2 = m18776OooO00o(oooOOO0)) == null || (OooO00o3 = m18775OooO00o(oooOOO0, i, i2)) == -1) {
            return false;
        }
        OooO00o2.OooO0O0(OooO00o3);
        oooOOO0.OooO0O0(OooO00o2);
        return true;
    }

    public void OooO00o() {
        RecyclerView.OooOOO0 layoutManager;
        View OooO00o2;
        RecyclerView recyclerView = this.f19949OooO00o;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (OooO00o2 = OooO00o(layoutManager)) != null) {
            int[] OooO00o3 = OooO00o(layoutManager, OooO00o2);
            if (OooO00o3[0] != 0 || OooO00o3[1] != 0) {
                this.f19949OooO00o.OooO0oo(OooO00o3[0], OooO00o3[1]);
            }
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public RecyclerView.OooOo m18776OooO00o(RecyclerView.OooOOO0 oooOOO0) {
        return m18777OooO00o(oooOOO0);
    }

    @Nullable
    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7273o0O00O0o m18777OooO00o(RecyclerView.OooOOO0 oooOOO0) {
        if (!(oooOOO0 instanceof RecyclerView.OooOo.OooO0O0)) {
            return null;
        }
        return new OooO0O0(this.f19949OooO00o.getContext());
    }
}
