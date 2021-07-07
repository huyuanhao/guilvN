package com.qiyukf.unicorn.fileselect.p226ui.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;

/* renamed from: com.qiyukf.unicorn.fileselect.ui.widget.EmptyListView */
public class EmptyListView extends ListView {

    /* renamed from: a */
    public DataSetObserver f5467a = new DataSetObserver() {
        /* class com.qiyukf.unicorn.fileselect.p226ui.widget.EmptyListView.C26481 */

        public final void onChanged() {
            super.onChanged();
            EmptyListView.this.m6061a();
        }
    };

    /* renamed from: b */
    public View f5468b;

    public EmptyListView(Context context) {
        super(context);
    }

    public EmptyListView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EmptyListView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m6061a() {
        if (this.f5468b != null || getAdapter() != null) {
            this.f5468b.setVisibility(getAdapter().getCount() > 0 ? 8 : 0);
        }
    }

    /* renamed from: a */
    public final void mo36286a(View view) {
        this.f5468b = view;
        m6061a();
    }

    @Override // android.widget.AbsListView, android.widget.ListView
    public void setAdapter(ListAdapter listAdapter) {
        ListAdapter adapter = getAdapter();
        if (adapter != null) {
            adapter.unregisterDataSetObserver(this.f5467a);
        }
        super.setAdapter(listAdapter);
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f5467a);
        }
    }
}
