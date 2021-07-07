package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.util.Log;

@SuppressLint({"ParcelCreator"})
public class PieEntry extends Entry {
    public String o0ooOOo;

    public PieEntry(float f) {
        super(0.0f, f);
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public void OooO0O0(float f) {
        super.OooO0O0(f);
        Log.i("DEPRECATED", "Pie entries do not have x values");
    }

    public float OooO0OO() {
        return OooO00o();
    }

    public PieEntry(float f, Object obj) {
        super(0.0f, f, obj);
    }

    @Override // com.github.mikephil.charting.data.Entry, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15103OooO00o() {
        return this.o0ooOOo;
    }

    public PieEntry(float f, Drawable drawable) {
        super(0.0f, f, drawable);
    }

    public void OooO00o(String str) {
        this.o0ooOOo = str;
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public float OooO0O0() {
        Log.i("DEPRECATED", "Pie entries do not have x values");
        return super.OooO0O0();
    }

    public PieEntry(float f, Drawable drawable, Object obj) {
        super(0.0f, f, drawable, obj);
    }

    @Override // com.github.mikephil.charting.data.Entry, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o
    public PieEntry OooO00o() {
        return new PieEntry(OooO00o(), this.o0ooOOo, m19899OooO00o());
    }

    public PieEntry(float f, String str) {
        super(0.0f, f);
        this.o0ooOOo = str;
    }

    public PieEntry(float f, String str, Object obj) {
        super(0.0f, f, obj);
        this.o0ooOOo = str;
    }

    public PieEntry(float f, String str, Drawable drawable) {
        super(0.0f, f, drawable);
        this.o0ooOOo = str;
    }

    public PieEntry(float f, String str, Drawable drawable, Object obj) {
        super(0.0f, f, drawable, obj);
        this.o0ooOOo = str;
    }
}
