package com.p118pd.sdk;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* renamed from: com.pd.sdk.oOoOOoOO  reason: case insensitive filesystem */
public class C8353oOoOOoOO {
    public float OooO = 0.0f;
    public float OooO00o = 0.0f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Matrix f21475OooO00o = new Matrix();

    /* renamed from: OooO00o  reason: collision with other field name */
    public RectF f21476OooO00o = new RectF();

    /* renamed from: OooO00o  reason: collision with other field name */
    public float[] f21477OooO00o = new float[9];
    public float OooO0O0 = 0.0f;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Matrix f21478OooO0O0 = new Matrix();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final float[] f21479OooO0O0 = new float[9];
    public float OooO0OO = 1.0f;
    public float OooO0Oo = Float.MAX_VALUE;
    public float OooO0o = Float.MAX_VALUE;
    public float OooO0o0 = 1.0f;
    public float OooO0oO = 1.0f;
    public float OooO0oo = 1.0f;
    public float OooOO0 = 0.0f;
    public float OooOO0O = 0.0f;
    public float OooOO0o = 0.0f;

    public float OooO() {
        return this.OooO0o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20029OooO00o(float f, float f2) {
        float OooOOoo = OooOOoo();
        float OooOo0 = OooOo0();
        float OooOo00 = OooOo00();
        float OooOOo = OooOOo();
        this.OooO0O0 = f2;
        this.OooO00o = f;
        m20030OooO00o(OooOOoo, OooOo0, OooOo00, OooOOo);
    }

    public float OooO0O0() {
        return this.f21476OooO00o.height();
    }

    public float OooO0OO() {
        return this.f21476OooO00o.left;
    }

    public float OooO0Oo() {
        return this.f21476OooO00o.right;
    }

    public float OooO0o() {
        return this.f21476OooO00o.width();
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public boolean m20045OooO0o0() {
        return this.OooO0O0 > 0.0f && this.OooO00o > 0.0f;
    }

    public float OooO0oO() {
        return this.OooO0O0;
    }

    public float OooO0oo() {
        return this.OooO00o;
    }

    public float OooOO0() {
        return this.OooO0Oo;
    }

    public float OooOO0O() {
        return this.OooO0o0;
    }

    public float OooOO0o() {
        return this.OooO0OO;
    }

    public float OooOOO() {
        return this.OooO0oo;
    }

    public float OooOOO0() {
        return this.OooO0oO;
    }

    public float OooOOOO() {
        return Math.min(this.f21476OooO00o.width(), this.f21476OooO00o.height());
    }

    public float OooOOOo() {
        return this.OooO;
    }

    public float OooOOo() {
        return this.OooO0O0 - this.f21476OooO00o.bottom;
    }

    public float OooOOo0() {
        return this.OooOO0;
    }

    public float OooOOoo() {
        return this.f21476OooO00o.left;
    }

    public float OooOo0() {
        return this.f21476OooO00o.top;
    }

    public float OooOo00() {
        return this.OooO00o - this.f21476OooO00o.right;
    }

    /* renamed from: OooO  reason: collision with other method in class */
    public boolean m20025OooO() {
        float f = this.OooO0oo;
        float f2 = this.OooO0OO;
        return f <= f2 && f2 <= 1.0f;
    }

    public void OooO0O0(Matrix matrix) {
        matrix.reset();
        matrix.set(this.f21475OooO00o);
        matrix.postScale(1.0f, 1.0f, 0.0f, 0.0f);
    }

    public Matrix OooO0OO(float f, float f2) {
        Matrix matrix = new Matrix();
        OooO0OO(f, f2, matrix);
        return matrix;
    }

    public Matrix OooO0Oo(float f, float f2) {
        Matrix matrix = new Matrix();
        OooO0Oo(f, f2, matrix);
        return matrix;
    }

    public void OooO0o(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        this.OooO0OO = f;
        OooO00o(this.f21475OooO00o, this.f21476OooO00o);
    }

    public float OooO0o0() {
        return this.f21476OooO00o.top;
    }

    /* renamed from: OooO0oO  reason: collision with other method in class */
    public boolean m20047OooO0oO() {
        return m20048OooO0oo() && m20025OooO();
    }

    /* renamed from: OooO0oo  reason: collision with other method in class */
    public boolean m20048OooO0oo() {
        float f = this.OooO0oO;
        float f2 = this.OooO0o0;
        return f <= f2 && f2 <= 1.0f;
    }

    public void OooO0o0(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        this.OooO0o0 = f;
        OooO00o(this.f21475OooO00o, this.f21476OooO00o);
    }

    public void OooO0OO(float f, float f2, Matrix matrix) {
        matrix.reset();
        matrix.set(this.f21475OooO00o);
        matrix.postScale(1.4f, 1.4f, f, f2);
    }

    public void OooO0Oo(float f, float f2, Matrix matrix) {
        matrix.reset();
        matrix.set(this.f21475OooO00o);
        matrix.postScale(0.7f, 0.7f, f, f2);
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public boolean m20044OooO0o(float f) {
        return m20042OooO0Oo(f) && m20032OooO00o(f);
    }

    public Matrix OooO0O0(float f, float f2) {
        Matrix matrix = new Matrix();
        OooO0O0(f, f2, matrix);
        return matrix;
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public boolean m20043OooO0o() {
        return this.OooOO0O <= 0.0f && this.OooOO0o <= 0.0f;
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public boolean m20046OooO0o0(float f) {
        return m20037OooO0O0(f) && m20040OooO0OO(f);
    }

    public void OooO0O0(float f, float f2, Matrix matrix) {
        matrix.reset();
        matrix.set(this.f21475OooO00o);
        matrix.postScale(f, f2);
    }

    public void OooO0OO(float f) {
        if (f == 0.0f) {
            f = Float.MAX_VALUE;
        }
        this.OooO0o = f;
        OooO00o(this.f21475OooO00o, this.f21476OooO00o);
    }

    public void OooO0Oo(float f) {
        if (f == 0.0f) {
            f = Float.MAX_VALUE;
        }
        this.OooO0Oo = f;
        OooO00o(this.f21475OooO00o, this.f21476OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20030OooO00o(float f, float f2, float f3, float f4) {
        this.f21476OooO00o.set(f, f2, this.OooO00o - f3, this.OooO0O0 - f4);
    }

    public float OooO00o() {
        return this.f21476OooO00o.bottom;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m20038OooO0OO(float f, float f2) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (f2 == 0.0f) {
            f2 = Float.MAX_VALUE;
        }
        this.OooO0OO = f;
        this.OooO0Oo = f2;
        OooO00o(this.f21475OooO00o, this.f21476OooO00o);
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m20042OooO0Oo(float f) {
        return this.f21476OooO00o.top <= f;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public RectF m20027OooO00o() {
        return this.f21476OooO00o;
    }

    public Matrix OooO0O0(float f, float f2, float f3, float f4) {
        Matrix matrix = new Matrix();
        OooO00o(f, f2, f3, f4, matrix);
        return matrix;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m20041OooO0Oo() {
        return this.OooO0oo > this.OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8349oOoOOo00 m20028OooO00o() {
        return C8349oOoOOo00.OooO00o(this.f21476OooO00o.centerX(), this.f21476OooO00o.centerY());
    }

    public void OooO00o(float f, float f2, float f3, float f4, Matrix matrix) {
        matrix.reset();
        matrix.set(this.f21475OooO00o);
        matrix.postScale(f, f2, f3, f4);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m20035OooO0O0(float f, float f2) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (f2 == 0.0f) {
            f2 = Float.MAX_VALUE;
        }
        this.OooO0o0 = f;
        this.OooO0o = f2;
        OooO00o(this.f21475OooO00o, this.f21476OooO00o);
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m20040OooO0OO(float f) {
        return this.f21476OooO00o.right >= (((float) ((int) (f * 100.0f))) / 100.0f) - 1.0f;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m20039OooO0OO() {
        return this.OooO0oO > this.OooO0o0;
    }

    public Matrix OooO00o(float f, float f2) {
        Matrix matrix = new Matrix();
        OooO00o(f, f2, matrix);
        return matrix;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Matrix m20034OooO0O0() {
        return this.f21475OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m20037OooO0O0(float f) {
        return this.f21476OooO00o.left <= f + 1.0f;
    }

    public void OooO00o(float f, float f2, Matrix matrix) {
        matrix.reset();
        matrix.set(this.f21475OooO00o);
        matrix.setScale(f, f2);
    }

    public void OooO0O0(float f) {
        this.OooOO0o = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m20036OooO0O0() {
        return this.OooO0oo < this.OooO0Oo;
    }

    public Matrix OooO00o(float f, float f2, float f3, float f4) {
        Matrix matrix = new Matrix();
        matrix.set(this.f21475OooO00o);
        matrix.setScale(f, f2, f3, f4);
        return matrix;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Matrix m20026OooO00o() {
        Matrix matrix = new Matrix();
        OooO00o(matrix);
        return matrix;
    }

    public void OooO00o(Matrix matrix) {
        this.OooO0o0 = 1.0f;
        this.OooO0OO = 1.0f;
        matrix.set(this.f21475OooO00o);
        float[] fArr = this.f21477OooO00o;
        for (int i = 0; i < 9; i++) {
            fArr[i] = 0.0f;
        }
        matrix.getValues(fArr);
        fArr[2] = 0.0f;
        fArr[5] = 0.0f;
        fArr[0] = 1.0f;
        fArr[4] = 1.0f;
        matrix.setValues(fArr);
    }

    public Matrix OooO00o(float[] fArr) {
        Matrix matrix = new Matrix();
        OooO00o(fArr, matrix);
        return matrix;
    }

    public void OooO00o(float[] fArr, Matrix matrix) {
        matrix.reset();
        matrix.set(this.f21475OooO00o);
        matrix.postTranslate(-(fArr[0] - OooOOoo()), -(fArr[1] - OooOo0()));
    }

    public void OooO00o(float[] fArr, View view) {
        Matrix matrix = this.f21478OooO0O0;
        matrix.reset();
        matrix.set(this.f21475OooO00o);
        matrix.postTranslate(-(fArr[0] - OooOOoo()), -(fArr[1] - OooOo0()));
        OooO00o(matrix, view, true);
    }

    public Matrix OooO00o(Matrix matrix, View view, boolean z) {
        this.f21475OooO00o.set(matrix);
        OooO00o(this.f21475OooO00o, this.f21476OooO00o);
        if (z) {
            view.invalidate();
        }
        matrix.set(this.f21475OooO00o);
        return matrix;
    }

    public void OooO00o(Matrix matrix, RectF rectF) {
        float f;
        matrix.getValues(this.f21479OooO0O0);
        float[] fArr = this.f21479OooO0O0;
        float f2 = fArr[2];
        float f3 = fArr[0];
        float f4 = fArr[5];
        float f5 = fArr[4];
        this.OooO0oO = Math.min(Math.max(this.OooO0o0, f3), this.OooO0o);
        this.OooO0oo = Math.min(Math.max(this.OooO0OO, f5), this.OooO0Oo);
        float f6 = 0.0f;
        if (rectF != null) {
            f6 = rectF.width();
            f = rectF.height();
        } else {
            f = 0.0f;
        }
        this.OooO = Math.min(Math.max(f2, ((-f6) * (this.OooO0oO - 1.0f)) - this.OooOO0O), this.OooOO0O);
        float max = Math.max(Math.min(f4, (f * (this.OooO0oo - 1.0f)) + this.OooOO0o), -this.OooOO0o);
        this.OooOO0 = max;
        float[] fArr2 = this.f21479OooO0O0;
        fArr2[2] = this.OooO;
        fArr2[0] = this.OooO0oO;
        fArr2[5] = max;
        fArr2[4] = this.OooO0oo;
        matrix.setValues(fArr2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20033OooO00o(float f, float f2) {
        return m20046OooO0o0(f) && m20044OooO0o(f2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20032OooO00o(float f) {
        return this.f21476OooO00o.bottom >= ((float) ((int) (f * 100.0f))) / 100.0f;
    }

    public void OooO00o(float f) {
        this.OooOO0O = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20031OooO00o() {
        return this.OooO0oO < this.OooO0o;
    }
}
