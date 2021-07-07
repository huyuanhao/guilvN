package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;

@SuppressLint({"ParcelCreator"})
public class BubbleEntry extends Entry {
    public float OooO0o = 0.0f;

    public BubbleEntry(float f, float f2, float f3) {
        super(f, f2);
        this.OooO0o = f3;
    }

    public float OooO0OO() {
        return this.OooO0o;
    }

    @Override // com.github.mikephil.charting.data.Entry, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o
    public BubbleEntry OooO00o() {
        return new BubbleEntry(OooO0O0(), OooO00o(), this.OooO0o, m19899OooO00o());
    }

    public void OooO0OO(float f) {
        this.OooO0o = f;
    }

    public BubbleEntry(float f, float f2, float f3, Object obj) {
        super(f, f2, obj);
        this.OooO0o = f3;
    }

    public BubbleEntry(float f, float f2, float f3, Drawable drawable) {
        super(f, f2, drawable);
        this.OooO0o = f3;
    }

    public BubbleEntry(float f, float f2, float f3, Drawable drawable, Object obj) {
        super(f, f2, drawable, obj);
        this.OooO0o = f3;
    }
}
