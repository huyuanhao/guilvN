package com.p118pd.sdk;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.pd.sdk.oooO0O0O  reason: case insensitive filesystem */
public class C9127oooO0O0O extends RecyclerView.AbstractC5067OooOO0o {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22602OooO00o;
    public int OooO0O0;

    public C9127oooO0O0O(int i, int i2, boolean z) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.f22602OooO00o = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5067OooOO0o
    public void OooO00o(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C5077OooOoO0 oooOoO0) {
        int OooO00o2 = recyclerView.m14714OooO00o(view);
        int i = this.OooO00o;
        int i2 = OooO00o2 % i;
        if (this.f22602OooO00o) {
            int i3 = this.OooO0O0;
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * i3) / i;
            if (OooO00o2 < i) {
                rect.top = i3;
            }
            rect.bottom = this.OooO0O0;
            return;
        }
        int i4 = this.OooO0O0;
        rect.left = (i2 * i4) / i;
        rect.right = i4 - (((i2 + 1) * i4) / i);
        if (OooO00o2 < i) {
            rect.top = i4;
        }
        rect.bottom = this.OooO0O0;
    }
}
