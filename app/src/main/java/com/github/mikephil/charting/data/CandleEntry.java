package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;

@SuppressLint({"ParcelCreator"})
public class CandleEntry extends Entry {
    public float OooO = 0.0f;
    public float OooO0o = 0.0f;
    public float OooO0oO = 0.0f;
    public float OooO0oo = 0.0f;

    public CandleEntry(float f, float f2, float f3, float f4, float f5) {
        super(f, (f2 + f3) / 2.0f);
        this.OooO0o = f2;
        this.OooO0oO = f3;
        this.OooO = f4;
        this.OooO0oo = f5;
    }

    public float OooO0OO() {
        return Math.abs(this.OooO - this.OooO0oo);
    }

    public void OooO0Oo(float f) {
        this.OooO0o = f;
    }

    public float OooO0o() {
        return this.OooO0oO;
    }

    public float OooO0o0() {
        return this.OooO0o;
    }

    public float OooO0oO() {
        return this.OooO;
    }

    public float OooO0oo() {
        return Math.abs(this.OooO0o - this.OooO0oO);
    }

    @Override // com.github.mikephil.charting.data.Entry, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o
    public float OooO00o() {
        return super.OooO00o();
    }

    public void OooO0OO(float f) {
        this.OooO0oo = f;
    }

    public float OooO0Oo() {
        return this.OooO0oo;
    }

    public void OooO0o(float f) {
        this.OooO = f;
    }

    public void OooO0o0(float f) {
        this.OooO0oO = f;
    }

    @Override // com.github.mikephil.charting.data.Entry, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o
    public CandleEntry OooO00o() {
        return new CandleEntry(OooO0O0(), this.OooO0o, this.OooO0oO, this.OooO, this.OooO0oo, m19899OooO00o());
    }

    public CandleEntry(float f, float f2, float f3, float f4, float f5, Object obj) {
        super(f, (f2 + f3) / 2.0f, obj);
        this.OooO0o = f2;
        this.OooO0oO = f3;
        this.OooO = f4;
        this.OooO0oo = f5;
    }

    public CandleEntry(float f, float f2, float f3, float f4, float f5, Drawable drawable) {
        super(f, (f2 + f3) / 2.0f, drawable);
        this.OooO0o = f2;
        this.OooO0oO = f3;
        this.OooO = f4;
        this.OooO0oo = f5;
    }

    public CandleEntry(float f, float f2, float f3, float f4, float f5, Drawable drawable, Object obj) {
        super(f, (f2 + f3) / 2.0f, drawable, obj);
        this.OooO0o = f2;
        this.OooO0oO = f3;
        this.OooO = f4;
        this.OooO0oo = f5;
    }
}
