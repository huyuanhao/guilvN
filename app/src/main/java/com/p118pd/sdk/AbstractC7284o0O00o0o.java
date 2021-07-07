package com.p118pd.sdk;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.pd.sdk.o0O00o0o  reason: case insensitive filesystem */
public abstract class AbstractC7284o0O00o0o extends RecyclerView.ItemAnimator {
    public static final String OooO00o = "SimpleItemAnimator";
    public static final boolean OooO0O0 = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f19952OooO00o = true;

    public final void OooO(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        OooOOOO(oooOoo0);
    }

    public void OooO00o(boolean z) {
        this.f19952OooO00o = z;
    }

    public abstract boolean OooO00o(RecyclerView.AbstractC5079OooOoo0 oooOoo0, int i, int i2, int i3, int i4);

    public abstract boolean OooO00o(RecyclerView.AbstractC5079OooOoo0 oooOoo0, RecyclerView.AbstractC5079OooOoo0 oooOoo02, int i, int i2, int i3, int i4);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean OooO0O0() {
        return this.f19952OooO00o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public abstract boolean OooO0O0(RecyclerView.AbstractC5079OooOoo0 oooOoo0);

    public void OooO0OO(RecyclerView.AbstractC5079OooOoo0 oooOoo0, boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public abstract boolean OooO0OO(RecyclerView.AbstractC5079OooOoo0 oooOoo0);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean OooO0OO(@NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO2) {
        if (oooO0OO.OooO00o != oooO0OO2.OooO00o || oooO0OO.OooO0O0 != oooO0OO2.OooO0O0) {
            return OooO00o(oooOoo0, oooO0OO.OooO00o, oooO0OO.OooO0O0, oooO0OO2.OooO00o, oooO0OO2.OooO0O0);
        }
        OooO0oo(oooOoo0);
        return false;
    }

    public void OooO0Oo(RecyclerView.AbstractC5079OooOoo0 oooOoo0, boolean z) {
    }

    public final void OooO0o(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        OooOO0o(oooOoo0);
        m14749OooO00o(oooOoo0);
    }

    public final void OooO0oO(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        OooOOO0(oooOoo0);
    }

    public final void OooO0oo(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        OooOOO(oooOoo0);
        m14749OooO00o(oooOoo0);
    }

    public final void OooOO0(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        OooOOOo(oooOoo0);
        m14749OooO00o(oooOoo0);
    }

    public final void OooOO0O(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        OooOOo0(oooOoo0);
    }

    public void OooOO0o(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
    }

    public void OooOOO(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
    }

    public void OooOOO0(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
    }

    public void OooOOOO(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
    }

    public void OooOOOo(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
    }

    public void OooOOo0(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean OooO00o(@NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        return !this.f19952OooO00o || oooOoo0.m14851OooO0Oo();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean OooO0O0(@NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO, @Nullable RecyclerView.ItemAnimator.OooO0OO oooO0OO2) {
        int i = oooO0OO.OooO00o;
        int i2 = oooO0OO.OooO0O0;
        View view = oooOoo0.f14626OooO00o;
        int left = oooO0OO2 == null ? view.getLeft() : oooO0OO2.OooO00o;
        int top = oooO0OO2 == null ? view.getTop() : oooO0OO2.OooO0O0;
        if (oooOoo0.m14852OooO0o() || (i == left && i2 == top)) {
            return OooO0OO(oooOoo0);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return OooO00o(oooOoo0, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean OooO00o(@NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0, @Nullable RecyclerView.ItemAnimator.OooO0OO oooO0OO, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO2) {
        if (oooO0OO == null || (oooO0OO.OooO00o == oooO0OO2.OooO00o && oooO0OO.OooO0O0 == oooO0OO2.OooO0O0)) {
            return OooO0O0(oooOoo0);
        }
        return OooO00o(oooOoo0, oooO0OO.OooO00o, oooO0OO.OooO0O0, oooO0OO2.OooO00o, oooO0OO2.OooO0O0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean OooO00o(@NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0, @NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo02, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO, @NonNull RecyclerView.ItemAnimator.OooO0OO oooO0OO2) {
        int i;
        int i2;
        int i3 = oooO0OO.OooO00o;
        int i4 = oooO0OO.OooO0O0;
        if (oooOoo02.OooOO0o()) {
            int i5 = oooO0OO.OooO00o;
            i = oooO0OO.OooO0O0;
            i2 = i5;
        } else {
            i2 = oooO0OO2.OooO00o;
            i = oooO0OO2.OooO0O0;
        }
        return OooO00o(oooOoo0, oooOoo02, i3, i4, i2, i);
    }

    public final void OooO0O0(RecyclerView.AbstractC5079OooOoo0 oooOoo0, boolean z) {
        OooO0Oo(oooOoo0, z);
    }

    public final void OooO00o(RecyclerView.AbstractC5079OooOoo0 oooOoo0, boolean z) {
        OooO0OO(oooOoo0, z);
        m14749OooO00o(oooOoo0);
    }
}
