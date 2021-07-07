package com.p118pd.sdk;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.components.YAxis;
import com.p118pd.sdk.C8348oOoOOo0;

@SuppressLint({"NewApi"})
/* renamed from: com.pd.sdk.oOo000O  reason: case insensitive filesystem */
public class C8276oOo000O extends AbstractC8272oOo000 implements Animator.AnimatorListener {
    public static C8348oOoOOo0<C8276oOo000O> OooO00o = C8348oOoOOo0.OooO00o(8, new C8276oOo000O(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0));
    public float OooO;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Matrix f21366OooO00o = new Matrix();

    /* renamed from: OooO00o  reason: collision with other field name */
    public YAxis f21367OooO00o;
    public float OooOO0;
    public float OooOO0O;
    public float OooOO0o;
    public float OooOOO0;

    @SuppressLint({"NewApi"})
    public C8276oOo000O(C8353oOoOOoOO oooooooo, View view, C8351oOoOOo0o oooooo0o, YAxis yAxis, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long j) {
        super(oooooooo, f2, f3, oooooo0o, view, f4, f5, j);
        this.OooOO0O = f6;
        this.OooOO0o = f7;
        this.OooO = f8;
        this.OooOO0 = f9;
        ((AbstractC8272oOo000) this).OooO00o.addListener(this);
        this.f21367OooO00o = yAxis;
        this.OooOOO0 = f;
    }

    public static C8276oOo000O OooO00o(C8353oOoOOoOO oooooooo, View view, C8351oOoOOo0o oooooo0o, YAxis yAxis, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long j) {
        C8276oOo000O OooO00o2 = OooO00o.m20014OooO00o();
        ((AbstractRunnableC8285oOo00O0) OooO00o2).f21373OooO00o = oooooooo;
        OooO00o2.OooO0Oo = f2;
        OooO00o2.OooO0o0 = f3;
        ((AbstractRunnableC8285oOo00O0) OooO00o2).f21372OooO00o = oooooo0o;
        ((AbstractRunnableC8285oOo00O0) OooO00o2).OooO00o = view;
        OooO00o2.OooO0oO = f4;
        OooO00o2.OooO0oo = f5;
        OooO00o2.OooO0O0();
        ((AbstractC8272oOo000) OooO00o2).OooO00o.setDuration(j);
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractC8272oOo000, com.p118pd.sdk.AbstractRunnableC8285oOo00O0, com.p118pd.sdk.C8348oOoOOo0.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19976OooO00o() {
    }

    @Override // com.p118pd.sdk.AbstractC8272oOo000
    public void onAnimationCancel(Animator animator) {
    }

    @Override // com.p118pd.sdk.AbstractC8272oOo000
    public void onAnimationEnd(Animator animator) {
        ((AbstractC8191oOOo0OOo) ((AbstractRunnableC8285oOo00O0) this).OooO00o).OooO0O0();
        ((AbstractRunnableC8285oOo00O0) this).OooO00o.postInvalidate();
    }

    @Override // com.p118pd.sdk.AbstractC8272oOo000
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // com.p118pd.sdk.AbstractC8272oOo000
    public void onAnimationStart(Animator animator) {
    }

    @Override // com.p118pd.sdk.AbstractC8272oOo000
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f = this.OooO0oO;
        float f2 = this.OooO0o;
        float f3 = f + ((this.OooO0Oo - f) * f2);
        float f4 = this.OooO0oo;
        float f5 = f4 + ((this.OooO0o0 - f4) * f2);
        Matrix matrix = this.f21366OooO00o;
        ((AbstractRunnableC8285oOo00O0) this).f21373OooO00o.OooO00o(f3, f5, matrix);
        ((AbstractRunnableC8285oOo00O0) this).f21373OooO00o.OooO00o(matrix, ((AbstractRunnableC8285oOo00O0) this).OooO00o, false);
        float OooOOO = ((AbstractC8201oOOo0oO0) this.f21367OooO00o).OooOO0O / ((AbstractRunnableC8285oOo00O0) this).f21373OooO00o.OooOOO();
        float OooOOO02 = this.OooOOO0 / ((AbstractRunnableC8285oOo00O0) this).f21373OooO00o.OooOOO0();
        float[] fArr = ((AbstractRunnableC8285oOo00O0) this).f21374OooO00o;
        float f6 = this.OooO;
        float f7 = this.OooO0o;
        fArr[0] = f6 + (((this.OooOO0O - (OooOOO02 / 2.0f)) - f6) * f7);
        float f8 = this.OooOO0;
        fArr[1] = f8 + (((this.OooOO0o + (OooOOO / 2.0f)) - f8) * f7);
        ((AbstractRunnableC8285oOo00O0) this).f21372OooO00o.OooO0O0(fArr);
        ((AbstractRunnableC8285oOo00O0) this).f21373OooO00o.OooO00o(((AbstractRunnableC8285oOo00O0) this).f21374OooO00o, matrix);
        ((AbstractRunnableC8285oOo00O0) this).f21373OooO00o.OooO00o(matrix, ((AbstractRunnableC8285oOo00O0) this).OooO00o, true);
    }

    @Override // com.p118pd.sdk.AbstractC8272oOo000, com.p118pd.sdk.AbstractRunnableC8285oOo00O0, com.p118pd.sdk.C8348oOoOOo0.OooO00o
    public C8348oOoOOo0.OooO00o OooO00o() {
        return new C8276oOo000O(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0);
    }
}
