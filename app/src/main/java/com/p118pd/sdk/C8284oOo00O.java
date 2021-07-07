package com.p118pd.sdk;

import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.components.YAxis;
import com.p118pd.sdk.C8348oOoOOo0;

/* renamed from: com.pd.sdk.oOo00O  reason: case insensitive filesystem */
public class C8284oOo00O extends AbstractRunnableC8285oOo00O0 {
    public static C8348oOoOOo0<C8284oOo00O> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Matrix f21370OooO00o = new Matrix();

    /* renamed from: OooO00o  reason: collision with other field name */
    public YAxis.AxisDependency f21371OooO00o;
    public float OooO0o;
    public float OooO0oO;

    static {
        C8348oOoOOo0<C8284oOo00O> OooO00o2 = C8348oOoOOo0.OooO00o(1, new C8284oOo00O(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null));
        OooO00o = OooO00o2;
        OooO00o2.OooO00o(0.5f);
    }

    public C8284oOo00O(C8353oOoOOoOO oooooooo, float f, float f2, float f3, float f4, C8351oOoOOo0o oooooo0o, YAxis.AxisDependency axisDependency, View view) {
        super(oooooooo, f3, f4, oooooo0o, view);
        this.OooO0o = f;
        this.OooO0oO = f2;
        this.f21371OooO00o = axisDependency;
    }

    public static C8284oOo00O OooO00o(C8353oOoOOoOO oooooooo, float f, float f2, float f3, float f4, C8351oOoOOo0o oooooo0o, YAxis.AxisDependency axisDependency, View view) {
        C8284oOo00O OooO00o2 = OooO00o.m20014OooO00o();
        OooO00o2.OooO0Oo = f3;
        OooO00o2.OooO0o0 = f4;
        OooO00o2.OooO0o = f;
        OooO00o2.OooO0oO = f2;
        ((AbstractRunnableC8285oOo00O0) OooO00o2).f21373OooO00o = oooooooo;
        ((AbstractRunnableC8285oOo00O0) OooO00o2).f21372OooO00o = oooooo0o;
        OooO00o2.f21371OooO00o = axisDependency;
        ((AbstractRunnableC8285oOo00O0) OooO00o2).OooO00o = view;
        return OooO00o2;
    }

    public void run() {
        Matrix matrix = this.f21370OooO00o;
        ((AbstractRunnableC8285oOo00O0) this).f21373OooO00o.OooO0O0(this.OooO0o, this.OooO0oO, matrix);
        ((AbstractRunnableC8285oOo00O0) this).f21373OooO00o.OooO00o(matrix, ((AbstractRunnableC8285oOo00O0) this).OooO00o, false);
        float OooOOO = ((AbstractC8201oOOo0oO0) ((AbstractC8191oOOo0OOo) ((AbstractRunnableC8285oOo00O0) this).OooO00o).m19828OooO00o(this.f21371OooO00o)).OooOO0O / ((AbstractRunnableC8285oOo00O0) this).f21373OooO00o.OooOOO();
        float OooOOO0 = ((AbstractC8201oOOo0oO0) ((AbstractC8191oOOo0OOo) ((AbstractRunnableC8285oOo00O0) this).OooO00o).getXAxis()).OooOO0O / ((AbstractRunnableC8285oOo00O0) this).f21373OooO00o.OooOOO0();
        float[] fArr = ((AbstractRunnableC8285oOo00O0) this).f21374OooO00o;
        fArr[0] = this.OooO0Oo - (OooOOO0 / 2.0f);
        fArr[1] = this.OooO0o0 + (OooOOO / 2.0f);
        ((AbstractRunnableC8285oOo00O0) this).f21372OooO00o.OooO0O0(fArr);
        ((AbstractRunnableC8285oOo00O0) this).f21373OooO00o.OooO00o(((AbstractRunnableC8285oOo00O0) this).f21374OooO00o, matrix);
        ((AbstractRunnableC8285oOo00O0) this).f21373OooO00o.OooO00o(matrix, ((AbstractRunnableC8285oOo00O0) this).OooO00o, false);
        ((AbstractC8191oOOo0OOo) ((AbstractRunnableC8285oOo00O0) this).OooO00o).OooO0O0();
        ((AbstractRunnableC8285oOo00O0) this).OooO00o.postInvalidate();
        OooO00o(this);
    }

    public static void OooO00o(C8284oOo00O ooo00o) {
        OooO00o.OooO00o(ooo00o);
    }

    @Override // com.p118pd.sdk.AbstractRunnableC8285oOo00O0, com.p118pd.sdk.C8348oOoOOo0.OooO00o
    public C8348oOoOOo0.OooO00o OooO00o() {
        return new C8284oOo00O(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null);
    }
}
