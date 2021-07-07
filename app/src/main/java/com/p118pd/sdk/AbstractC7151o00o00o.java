package com.p118pd.sdk;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.pd.sdk.o00o00o  reason: case insensitive filesystem */
public abstract class AbstractC7151o00o00o extends AbstractC7150o00o00Oo {
    public LayoutInflater OooO00o;
    public int o0OOO0o;
    public int o0ooOoO;

    @Deprecated
    public AbstractC7151o00o00o(Context context, int i, Cursor cursor) {
        super(context, cursor);
        this.o0OOO0o = i;
        this.o0ooOoO = i;
        this.OooO00o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // com.p118pd.sdk.AbstractC7150o00o00Oo
    public View OooO00o(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.OooO00o.inflate(this.o0OOO0o, viewGroup, false);
    }

    @Override // com.p118pd.sdk.AbstractC7150o00o00Oo
    public View OooO0O0(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.OooO00o.inflate(this.o0ooOoO, viewGroup, false);
    }

    public void OooO00o(int i) {
        this.o0OOO0o = i;
    }

    public void OooO0O0(int i) {
        this.o0ooOoO = i;
    }

    @Deprecated
    public AbstractC7151o00o00o(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.o0OOO0o = i;
        this.o0ooOoO = i;
        this.OooO00o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public AbstractC7151o00o00o(Context context, int i, Cursor cursor, int i2) {
        super(context, cursor, i2);
        this.o0OOO0o = i;
        this.o0ooOoO = i;
        this.OooO00o = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
