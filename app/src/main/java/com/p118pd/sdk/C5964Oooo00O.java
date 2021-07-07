package com.p118pd.sdk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ListMenuItemView;
import com.p118pd.sdk.AbstractC5976OoooO00;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.Oooo00O  reason: case insensitive filesystem */
public class C5964Oooo00O extends BaseAdapter {
    public final LayoutInflater OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5965Oooo00o f17197OooO00o;
    public boolean OooO0O0;
    public final boolean OooO0OO;
    public int o00oO0O = -1;
    public final int o0ooOO0;

    public C5964Oooo00O(C5965Oooo00o oooo00o, LayoutInflater layoutInflater, boolean z, int i) {
        this.OooO0OO = z;
        this.OooO00o = layoutInflater;
        this.f17197OooO00o = oooo00o;
        this.o0ooOO0 = i;
        m16768OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16769OooO00o() {
        return this.OooO0O0;
    }

    public int getCount() {
        ArrayList<C5967Oooo0OO> OooO0O02 = this.OooO0OO ? this.f17197OooO00o.OooO0O0() : this.f17197OooO00o.OooO0OO();
        if (this.o00oO0O < 0) {
            return OooO0O02.size();
        }
        return OooO0O02.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.OooO00o.inflate(this.o0ooOO0, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f17197OooO00o.m16785OooO0O0() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        AbstractC5976OoooO00.OooO00o oooO00o = (AbstractC5976OoooO00.OooO00o) view;
        if (this.OooO0O0) {
            listMenuItemView.setForceShowIcon(true);
        }
        oooO00o.OooO00o(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        m16768OooO00o();
        super.notifyDataSetChanged();
    }

    public void OooO00o(boolean z) {
        this.OooO0O0 = z;
    }

    public C5965Oooo00o OooO00o() {
        return this.f17197OooO00o;
    }

    /* renamed from: OooO00o */
    public C5967Oooo0OO getItem(int i) {
        ArrayList<C5967Oooo0OO> OooO0O02 = this.OooO0OO ? this.f17197OooO00o.OooO0O0() : this.f17197OooO00o.OooO0OO();
        int i2 = this.o00oO0O;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return OooO0O02.get(i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16768OooO00o() {
        C5967Oooo0OO OooO00o2 = this.f17197OooO00o.m16775OooO00o();
        if (OooO00o2 != null) {
            ArrayList<C5967Oooo0OO> OooO0O02 = this.f17197OooO00o.OooO0O0();
            int size = OooO0O02.size();
            for (int i = 0; i < size; i++) {
                if (OooO0O02.get(i) == OooO00o2) {
                    this.o00oO0O = i;
                    return;
                }
            }
        }
        this.o00oO0O = -1;
    }
}
