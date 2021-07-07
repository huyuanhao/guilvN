package com.p118pd.sdk;

import com.github.mikephil.charting.components.YAxis;

/* renamed from: com.pd.sdk.oOOoo0oO  reason: case insensitive filesystem */
public class C8246oOOoo0oO {
    public float OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f21356OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public YAxis.AxisDependency f21357OooO00o;
    public float OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f21358OooO0O0;
    public float OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int f21359OooO0OO;
    public float OooO0Oo;
    public float OooO0o;
    public float OooO0o0;

    public C8246oOOoo0oO(float f, float f2, int i) {
        this.OooO00o = Float.NaN;
        this.OooO0O0 = Float.NaN;
        this.f21356OooO00o = -1;
        this.f21359OooO0OO = -1;
        this.OooO00o = f;
        this.OooO0O0 = f2;
        this.f21358OooO0O0 = i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m19933OooO00o() {
        return this.f21356OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m19936OooO0O0() {
        return this.f21358OooO0O0;
    }

    public float OooO0OO() {
        return this.OooO00o;
    }

    public float OooO0Oo() {
        return this.OooO0OO;
    }

    public float OooO0o() {
        return this.OooO0Oo;
    }

    public float OooO0o0() {
        return this.OooO0O0;
    }

    public String toString() {
        return "Highlight, x: " + this.OooO00o + ", y: " + this.OooO0O0 + ", dataSetIndex: " + this.f21358OooO0O0 + ", stackIndex (only stacked barentry): " + this.f21359OooO0OO;
    }

    public void OooO00o(int i) {
        this.f21356OooO00o = i;
    }

    public float OooO0O0() {
        return this.OooO0o;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public int m19937OooO0OO() {
        return this.f21359OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19935OooO00o() {
        return this.f21359OooO0OO >= 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public YAxis.AxisDependency m19934OooO00o() {
        return this.f21357OooO00o;
    }

    public void OooO00o(float f, float f2) {
        this.OooO0o0 = f;
        this.OooO0o = f2;
    }

    public float OooO00o() {
        return this.OooO0o0;
    }

    public boolean OooO00o(C8246oOOoo0oO ooooo0oo) {
        return ooooo0oo != null && this.f21358OooO0O0 == ooooo0oo.f21358OooO0O0 && this.OooO00o == ooooo0oo.OooO00o && this.f21359OooO0OO == ooooo0oo.f21359OooO0OO && this.f21356OooO00o == ooooo0oo.f21356OooO00o;
    }

    public C8246oOOoo0oO(float f, int i, int i2) {
        this(f, Float.NaN, i);
        this.f21359OooO0OO = i2;
    }

    public C8246oOOoo0oO(float f, float f2, float f3, float f4, int i, YAxis.AxisDependency axisDependency) {
        this.OooO00o = Float.NaN;
        this.OooO0O0 = Float.NaN;
        this.f21356OooO00o = -1;
        this.f21359OooO0OO = -1;
        this.OooO00o = f;
        this.OooO0O0 = f2;
        this.OooO0OO = f3;
        this.OooO0Oo = f4;
        this.f21358OooO0O0 = i;
        this.f21357OooO00o = axisDependency;
    }

    public C8246oOOoo0oO(float f, float f2, float f3, float f4, int i, int i2, YAxis.AxisDependency axisDependency) {
        this(f, f2, f3, f4, i, axisDependency);
        this.f21359OooO0OO = i2;
    }
}
