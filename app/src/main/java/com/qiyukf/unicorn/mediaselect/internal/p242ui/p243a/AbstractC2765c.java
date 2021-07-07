package com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2743d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.a.c */
public abstract class AbstractC2765c extends BaseAdapter {

    /* renamed from: a */
    public List<C2743d> f5735a = new ArrayList();

    /* renamed from: b */
    public Cursor f5736b;

    public AbstractC2765c() {
        mo36560b(null);
    }

    /* renamed from: a */
    public abstract int mo36555a(Cursor cursor);

    /* renamed from: a */
    public abstract View mo36556a(int i, View view, ViewGroup viewGroup, C2743d dVar);

    /* renamed from: b */
    public void mo36560b(Cursor cursor) {
        if (cursor != this.f5736b) {
            if (cursor != null) {
                this.f5736b = cursor;
                ArrayList arrayList = new ArrayList();
                while (this.f5736b.moveToNext()) {
                    C2743d a = C2743d.m6338a(this.f5736b);
                    if (!(a.f5672d > 52428800 || a.f5673e > 30000)) {
                        arrayList.add(C2743d.m6338a(this.f5736b));
                    }
                }
                this.f5735a.clear();
                this.f5735a.addAll(arrayList);
                notifyDataSetChanged();
                return;
            }
            this.f5736b = null;
            this.f5735a.clear();
        }
    }

    public int getCount() {
        return this.f5735a.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        if (this.f5736b.moveToPosition(i)) {
            return mo36555a(this.f5736b);
        }
        throw new IllegalStateException("Could not move cursor to position " + i + " when trying to get item view type.");
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Cursor cursor = this.f5736b;
        if (!(cursor != null && !cursor.isClosed())) {
            throw new IllegalStateException("Cannot bind view holder when cursor is in invalid state.");
        } else if (!this.f5736b.moveToPosition(i)) {
            throw new IllegalStateException("Could not move cursor to position " + i + " when trying to bind view holder");
        } else if (this.f5735a.get(i) != null) {
            return mo36556a(i, view, viewGroup, this.f5735a.get(i));
        } else {
            throw new IllegalStateException("Could not move cursor to position " + i + " when trying to bind view holder");
        }
    }
}
