package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.Oooo0oO  reason: case insensitive filesystem */
public abstract class AbstractC5972Oooo0oO implements AbstractC5974OoooO, AbstractC5961Oooo, AdapterView.OnItemClickListener {
    public Rect OooO00o;

    public abstract void OooO00o(int i);

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(@NonNull Context context, @Nullable C5965Oooo00o oooo00o) {
    }

    public void OooO00o(Rect rect) {
        this.OooO00o = rect;
    }

    public abstract void OooO00o(View view);

    public abstract void OooO00o(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract void m16800OooO00o(C5965Oooo00o oooo00o);

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public boolean OooO00o(C5965Oooo00o oooo00o, C5967Oooo0OO oooo0OO) {
        return false;
    }

    public abstract void OooO0O0(int i);

    public abstract void OooO0O0(boolean z);

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public boolean OooO0O0(C5965Oooo00o oooo00o, C5967Oooo0OO oooo0OO) {
        return false;
    }

    public abstract void OooO0OO(int i);

    public abstract void OooO0OO(boolean z);

    public boolean OooO0OO() {
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public int getId() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        OooO00o(listAdapter).f17197OooO00o.OooO00o((MenuItem) listAdapter.getItem(i), this, OooO0OO() ? 0 : 4);
    }

    @Override // com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5974OoooO, com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
    public Rect OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public AbstractC5976OoooO00 OooO00o(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    public static int OooO00o(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static C5964Oooo00O OooO00o(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C5964Oooo00O) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C5964Oooo00O) listAdapter;
    }

    public static boolean OooO00o(C5965Oooo00o oooo00o) {
        int size = oooo00o.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = oooo00o.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }
}
