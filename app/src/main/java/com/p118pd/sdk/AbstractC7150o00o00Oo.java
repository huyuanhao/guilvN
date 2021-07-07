package com.p118pd.sdk;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.C7152o00o00o0;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.o00o00Oo  reason: case insensitive filesystem */
public abstract class AbstractC7150o00o00Oo extends BaseAdapter implements Filterable, C7152o00o00o0.OooO00o {
    @Deprecated
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 2;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Context OooO00o;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: OooO00o  reason: collision with other field name */
    public Cursor f19518OooO00o;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: OooO00o  reason: collision with other field name */
    public DataSetObserver f19519OooO00o;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: OooO00o  reason: collision with other field name */
    public FilterQueryProvider f19520OooO00o;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f19521OooO00o;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7152o00o00o0 f19522OooO00o;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean OooO0O0;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean OooO0OO;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int o00oO0O;

    /* renamed from: com.pd.sdk.o00o00Oo$OooO00o */
    public class OooO00o extends ContentObserver {
        public OooO00o() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            AbstractC7150o00o00Oo.this.m18524OooO00o();
        }
    }

    /* renamed from: com.pd.sdk.o00o00Oo$OooO0O0 */
    public class OooO0O0 extends DataSetObserver {
        public OooO0O0() {
        }

        public void onChanged() {
            AbstractC7150o00o00Oo o00o00oo = AbstractC7150o00o00Oo.this;
            o00o00oo.OooO0O0 = true;
            o00o00oo.notifyDataSetChanged();
        }

        public void onInvalidated() {
            AbstractC7150o00o00Oo o00o00oo = AbstractC7150o00o00Oo.this;
            o00o00oo.OooO0O0 = false;
            o00o00oo.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public AbstractC7150o00o00Oo(Context context, Cursor cursor) {
        OooO00o(context, cursor, 1);
    }

    @Deprecated
    public void OooO00o(Context context, Cursor cursor, boolean z) {
        OooO00o(context, cursor, z ? 1 : 2);
    }

    public abstract void OooO00o(View view, Context context, Cursor cursor);

    public abstract View OooO0O0(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.OooO0O0 || (cursor = this.f19518OooO00o) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.OooO0O0) {
            return null;
        }
        this.f19518OooO00o.moveToPosition(i);
        if (view == null) {
            view = OooO00o(this.OooO00o, this.f19518OooO00o, viewGroup);
        }
        OooO00o(view, this.OooO00o, this.f19518OooO00o);
        return view;
    }

    public Filter getFilter() {
        if (this.f19522OooO00o == null) {
            this.f19522OooO00o = new C7152o00o00o0(this);
        }
        return this.f19522OooO00o;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.OooO0O0 || (cursor = this.f19518OooO00o) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f19518OooO00o;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.OooO0O0 || (cursor = this.f19518OooO00o) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f19518OooO00o.getLong(this.o00oO0O);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.OooO0O0) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f19518OooO00o.moveToPosition(i)) {
            if (view == null) {
                view = OooO0O0(this.OooO00o, this.f19518OooO00o, viewGroup);
            }
            OooO00o(view, this.OooO00o, this.f19518OooO00o);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    public boolean hasStableIds() {
        return true;
    }

    public void OooO00o(Context context, Cursor cursor, int i) {
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.OooO0OO = true;
        } else {
            this.OooO0OO = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f19518OooO00o = cursor;
        this.OooO0O0 = z;
        this.OooO00o = context;
        this.o00oO0O = z ? cursor.getColumnIndexOrThrow(C3848l.f10389g) : -1;
        if ((i & 2) == 2) {
            this.f19521OooO00o = new OooO00o();
            this.f19519OooO00o = new OooO0O0();
        } else {
            this.f19521OooO00o = null;
            this.f19519OooO00o = null;
        }
        if (z) {
            OooO00o oooO00o = this.f19521OooO00o;
            if (oooO00o != null) {
                cursor.registerContentObserver(oooO00o);
            }
            DataSetObserver dataSetObserver = this.f19519OooO00o;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public AbstractC7150o00o00Oo(Context context, Cursor cursor, boolean z) {
        OooO00o(context, cursor, z ? 1 : 2);
    }

    public AbstractC7150o00o00Oo(Context context, Cursor cursor, int i) {
        OooO00o(context, cursor, i);
    }

    @Override // com.p118pd.sdk.C7152o00o00o0.OooO00o
    public Cursor OooO00o() {
        return this.f19518OooO00o;
    }

    public View OooO00o(Context context, Cursor cursor, ViewGroup viewGroup) {
        return OooO0O0(context, cursor, viewGroup);
    }

    @Override // com.p118pd.sdk.C7152o00o00o0.OooO00o, com.p118pd.sdk.C7152o00o00o0.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18525OooO00o(Cursor cursor) {
        Cursor OooO00o2 = OooO00o(cursor);
        if (OooO00o2 != null) {
            OooO00o2.close();
        }
    }

    @Override // com.p118pd.sdk.C7152o00o00o0.OooO00o, com.p118pd.sdk.C7152o00o00o0.OooO00o
    public Cursor OooO00o(Cursor cursor) {
        Cursor cursor2 = this.f19518OooO00o;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            OooO00o oooO00o = this.f19521OooO00o;
            if (oooO00o != null) {
                cursor2.unregisterContentObserver(oooO00o);
            }
            DataSetObserver dataSetObserver = this.f19519OooO00o;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f19518OooO00o = cursor;
        if (cursor != null) {
            OooO00o oooO00o2 = this.f19521OooO00o;
            if (oooO00o2 != null) {
                cursor.registerContentObserver(oooO00o2);
            }
            DataSetObserver dataSetObserver2 = this.f19519OooO00o;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.o00oO0O = cursor.getColumnIndexOrThrow(C3848l.f10389g);
            this.OooO0O0 = true;
            notifyDataSetChanged();
        } else {
            this.o00oO0O = -1;
            this.OooO0O0 = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    @Override // com.p118pd.sdk.C7152o00o00o0.OooO00o, com.p118pd.sdk.C7152o00o00o0.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence m18523OooO00o(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    @Override // com.p118pd.sdk.C7152o00o00o0.OooO00o
    public Cursor OooO00o(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f19520OooO00o;
        if (filterQueryProvider != null) {
            return filterQueryProvider.runQuery(charSequence);
        }
        return this.f19518OooO00o;
    }

    @Override // com.p118pd.sdk.C7152o00o00o0.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public FilterQueryProvider m18522OooO00o() {
        return this.f19520OooO00o;
    }

    public void OooO00o(FilterQueryProvider filterQueryProvider) {
        this.f19520OooO00o = filterQueryProvider;
    }

    @Override // com.p118pd.sdk.C7152o00o00o0.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18524OooO00o() {
        Cursor cursor;
        if (this.OooO0OO && (cursor = this.f19518OooO00o) != null && !cursor.isClosed()) {
            this.OooO0O0 = this.f19518OooO00o.requery();
        }
    }
}
