package com.p118pd.sdk;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: com.pd.sdk.o00o00o0  reason: case insensitive filesystem */
public class C7152o00o00o0 extends Filter {
    public OooO00o OooO00o;

    /* renamed from: com.pd.sdk.o00o00o0$OooO00o */
    public interface OooO00o {
        Cursor OooO00o();

        Cursor OooO00o(CharSequence charSequence);

        CharSequence OooO00o(Cursor cursor);

        /* renamed from: OooO00o  reason: collision with other method in class */
        void m18526OooO00o(Cursor cursor);
    }

    public C7152o00o00o0(OooO00o oooO00o) {
        this.OooO00o = oooO00o;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.OooO00o.OooO00o((Cursor) obj);
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor OooO00o2 = this.OooO00o.OooO00o(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (OooO00o2 != null) {
            filterResults.count = OooO00o2.getCount();
            filterResults.values = OooO00o2;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor OooO00o2 = this.OooO00o.OooO00o();
        Object obj = filterResults.values;
        if (obj != null && obj != OooO00o2) {
            this.OooO00o.m18526OooO00o((Cursor) obj);
        }
    }
}
