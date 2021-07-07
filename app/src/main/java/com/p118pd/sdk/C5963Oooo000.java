package com.p118pd.sdk;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.p118pd.sdk.AbstractC5961Oooo;
import com.p118pd.sdk.AbstractC5976OoooO00;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.Oooo000  reason: case insensitive filesystem */
public class C5963Oooo000 implements AbstractC5961Oooo, AdapterView.OnItemClickListener {
    public static final String o0ooOOo = "ListMenuPresenter";
    public static final String o0ooOoO = "android:menu:list";
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LayoutInflater f17190OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ExpandedMenuView f17191OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5961Oooo.OooO00o f17192OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f17193OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5965Oooo00o f17194OooO00o;
    public int o00oO0O;
    public int o0ooOO0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public int f17195o0ooOOo;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public int f17196o0ooOoO;

    public C5963Oooo000(Context context, int i) {
        this(i, 0);
        this.OooO00o = context;
        this.f17190OooO00o = LayoutInflater.from(context);
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(Context context, C5965Oooo00o oooo00o) {
        if (this.o0ooOO0 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.o0ooOO0);
            this.OooO00o = contextThemeWrapper;
            this.f17190OooO00o = LayoutInflater.from(contextThemeWrapper);
        } else if (this.OooO00o != null) {
            this.OooO00o = context;
            if (this.f17190OooO00o == null) {
                this.f17190OooO00o = LayoutInflater.from(context);
            }
        }
        this.f17194OooO00o = oooo00o;
        OooO00o oooO00o = this.f17193OooO00o;
        if (oooO00o != null) {
            oooO00o.notifyDataSetChanged();
        }
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16767OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public boolean OooO00o(C5965Oooo00o oooo00o, C5967Oooo0OO oooo0OO) {
        return false;
    }

    public void OooO0O0(int i) {
        this.o00oO0O = i;
        if (this.f17191OooO00o != null) {
            OooO00o(false);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public boolean OooO0O0(C5965Oooo00o oooo00o, C5967Oooo0OO oooo0OO) {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public int getId() {
        return this.f17196o0ooOoO;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f17194OooO00o.OooO00o(this.f17193OooO00o.getItem(i), this, 0);
    }

    /* renamed from: com.pd.sdk.Oooo000$OooO00o */
    public class OooO00o extends BaseAdapter {
        public int o00oO0O = -1;

        public OooO00o() {
            OooO00o();
        }

        /* renamed from: OooO00o */
        public C5967Oooo0OO getItem(int i) {
            ArrayList<C5967Oooo0OO> OooO0O0 = C5963Oooo000.this.f17194OooO00o.OooO0O0();
            int i2 = i + C5963Oooo000.this.o00oO0O;
            int i3 = this.o00oO0O;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return OooO0O0.get(i2);
        }

        public int getCount() {
            int size = C5963Oooo000.this.f17194OooO00o.OooO0O0().size() - C5963Oooo000.this.o00oO0O;
            return this.o00oO0O < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C5963Oooo000 oooo000 = C5963Oooo000.this;
                view = oooo000.f17190OooO00o.inflate(oooo000.f17195o0ooOOo, viewGroup, false);
            }
            ((AbstractC5976OoooO00.OooO00o) view).OooO00o(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            OooO00o();
            super.notifyDataSetChanged();
        }

        public void OooO00o() {
            C5967Oooo0OO OooO00o2 = C5963Oooo000.this.f17194OooO00o.m16775OooO00o();
            if (OooO00o2 != null) {
                ArrayList<C5967Oooo0OO> OooO0O0 = C5963Oooo000.this.f17194OooO00o.OooO0O0();
                int size = OooO0O0.size();
                for (int i = 0; i < size; i++) {
                    if (OooO0O0.get(i) == OooO00o2) {
                        this.o00oO0O = i;
                        return;
                    }
                }
            }
            this.o00oO0O = -1;
        }
    }

    public C5963Oooo000(int i, int i2) {
        this.f17195o0ooOOo = i;
        this.o0ooOO0 = i2;
    }

    public void OooO0O0(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f17191OooO00o;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(o0ooOoO, sparseArray);
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public AbstractC5976OoooO00 OooO00o(ViewGroup viewGroup) {
        if (this.f17191OooO00o == null) {
            this.f17191OooO00o = (ExpandedMenuView) this.f17190OooO00o.inflate(C0033R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.f17193OooO00o == null) {
                this.f17193OooO00o = new OooO00o();
            }
            this.f17191OooO00o.setAdapter((ListAdapter) this.f17193OooO00o);
            this.f17191OooO00o.setOnItemClickListener(this);
        }
        return this.f17191OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ListAdapter m16766OooO00o() {
        if (this.f17193OooO00o == null) {
            this.f17193OooO00o = new OooO00o();
        }
        return this.f17193OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(boolean z) {
        OooO00o oooO00o = this.f17193OooO00o;
        if (oooO00o != null) {
            oooO00o.notifyDataSetChanged();
        }
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(AbstractC5961Oooo.OooO00o oooO00o) {
        this.f17192OooO00o = oooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public boolean OooO00o(SubMenuC7026o000oOoO o000oooo) {
        if (!o000oooo.hasVisibleItems()) {
            return false;
        }
        new DialogInterface$OnKeyListenerC5962Oooo0(o000oooo).OooO00o((IBinder) null);
        AbstractC5961Oooo.OooO00o oooO00o = this.f17192OooO00o;
        if (oooO00o == null) {
            return true;
        }
        oooO00o.OooO00o(o000oooo);
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(C5965Oooo00o oooo00o, boolean z) {
        AbstractC5961Oooo.OooO00o oooO00o = this.f17192OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO00o(oooo00o, z);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
    public int OooO00o() {
        return this.o00oO0O;
    }

    public void OooO00o(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(o0ooOoO);
        if (sparseParcelableArray != null) {
            this.f17191OooO00o.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void OooO00o(int i) {
        this.f17196o0ooOoO = i;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo, com.p118pd.sdk.AbstractC5961Oooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Parcelable m16765OooO00o() {
        if (this.f17191OooO00o == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        OooO0O0(bundle);
        return bundle;
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo
    public void OooO00o(Parcelable parcelable) {
        OooO00o((Bundle) parcelable);
    }
}
