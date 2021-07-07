package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.pd.sdk.oOo0O000  reason: case insensitive filesystem */
public abstract class AbstractC8307oOo0O000 extends AbstractC8328oOoOO0O {
    public Paint OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8201oOOo0oO0 f21407OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8351oOoOOo0o f21408OooO00o;
    public Paint OooO0O0;
    public Paint OooO0OO;
    public Paint OooO0Oo;

    public AbstractC8307oOo0O000(C8353oOoOOoOO oooooooo, C8351oOoOOo0o oooooo0o, AbstractC8201oOOo0oO0 oooo0oo0) {
        super(oooooooo);
        this.f21408OooO00o = oooooo0o;
        this.f21407OooO00o = oooo0oo0;
        if (((AbstractC8328oOoOO0O) this).OooO00o != null) {
            this.OooO0O0 = new Paint(1);
            Paint paint = new Paint();
            this.OooO00o = paint;
            paint.setColor(-7829368);
            this.OooO00o.setStrokeWidth(1.0f);
            this.OooO00o.setStyle(Paint.Style.STROKE);
            this.OooO00o.setAlpha(90);
            Paint paint2 = new Paint();
            this.OooO0OO = paint2;
            paint2.setColor(-16777216);
            this.OooO0OO.setStrokeWidth(1.0f);
            this.OooO0OO.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint(1);
            this.OooO0Oo = paint3;
            paint3.setStyle(Paint.Style.STROKE);
        }
    }

    public Paint OooO00o() {
        return this.OooO0O0;
    }

    public abstract void OooO00o(Canvas canvas);

    public Paint OooO0O0() {
        return this.OooO0OO;
    }

    public abstract void OooO0O0(Canvas canvas);

    public Paint OooO0OO() {
        return this.OooO00o;
    }

    public abstract void OooO0OO(Canvas canvas);

    public abstract void OooO0Oo(Canvas canvas);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8351oOoOOo0o m20003OooO00o() {
        return this.f21408OooO00o;
    }

    public void OooO00o(float f, float f2, boolean z) {
        float f3;
        double d;
        C8353oOoOOoOO oooooooo = ((AbstractC8328oOoOO0O) this).OooO00o;
        if (oooooooo != null && oooooooo.OooO0o() > 10.0f && !((AbstractC8328oOoOO0O) this).OooO00o.m20025OooO()) {
            C8346oOoOOOoo OooO0O02 = this.f21408OooO00o.OooO0O0(((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0());
            C8346oOoOOOoo OooO0O03 = this.f21408OooO00o.OooO0O0(((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO(), ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o());
            if (!z) {
                f3 = (float) OooO0O03.OooO0O0;
                d = OooO0O02.OooO0O0;
            } else {
                f3 = (float) OooO0O02.OooO0O0;
                d = OooO0O03.OooO0O0;
            }
            C8346oOoOOOoo.OooO00o(OooO0O02);
            C8346oOoOOOoo.OooO00o(OooO0O03);
            f = f3;
            f2 = (float) d;
        }
        OooO00o(f, f2);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:64:0x00e5 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v7, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    public void OooO00o(float f, float f2) {
        double d;
        double d2;
        float f3 = f;
        int OooO0Oo2 = this.f21407OooO00o.m19866OooO0Oo();
        double abs = (double) Math.abs(f2 - f3);
        if (OooO0Oo2 == 0 || abs <= AbstractC8352oOoOOoO0.OooO0O0 || Double.isInfinite(abs)) {
            AbstractC8201oOOo0oO0 oooo0oo0 = this.f21407OooO00o;
            oooo0oo0.f21299OooO00o = new float[0];
            oooo0oo0.f21302OooO0O0 = new float[0];
            oooo0oo0.f21304OooO0Oo = 0;
            return;
        }
        double d3 = (double) OooO0Oo2;
        Double.isNaN(abs);
        Double.isNaN(d3);
        double OooO00o2 = (double) AbstractC8352oOoOOoO0.m20019OooO00o(abs / d3);
        if (this.f21407OooO00o.OooOO0O() && OooO00o2 < ((double) this.f21407OooO00o.OooO0oO())) {
            OooO00o2 = (double) this.f21407OooO00o.OooO0oO();
        }
        double OooO00o3 = (double) AbstractC8352oOoOOoO0.m20019OooO00o(Math.pow(10.0d, (double) ((int) Math.log10(OooO00o2))));
        Double.isNaN(OooO00o3);
        if (((int) (OooO00o2 / OooO00o3)) > 5) {
            Double.isNaN(OooO00o3);
            OooO00o2 = Math.floor(OooO00o3 * 10.0d);
        }
        int OooO0o0 = this.f21407OooO00o.m19871OooO0o0();
        if (this.f21407OooO00o.m19874OooOO0()) {
            OooO00o2 = (double) (((float) abs) / ((float) (OooO0Oo2 - 1)));
            AbstractC8201oOOo0oO0 oooo0oo02 = this.f21407OooO00o;
            oooo0oo02.f21304OooO0Oo = OooO0Oo2;
            if (oooo0oo02.f21299OooO00o.length < OooO0Oo2) {
                oooo0oo02.f21299OooO00o = new float[OooO0Oo2];
            }
            for (int i = 0; i < OooO0Oo2; i++) {
                this.f21407OooO00o.f21299OooO00o[i] = f3;
                double d4 = (double) f3;
                Double.isNaN(d4);
                Double.isNaN(OooO00o2);
                f3 = (float) (d4 + OooO00o2);
            }
        } else {
            if (OooO00o2 == AbstractC8352oOoOOoO0.OooO0O0) {
                d = AbstractC8352oOoOOoO0.OooO0O0;
            } else {
                double d5 = (double) f3;
                Double.isNaN(d5);
                d = Math.ceil(d5 / OooO00o2) * OooO00o2;
            }
            if (this.f21407OooO00o.m19871OooO0o0()) {
                d -= OooO00o2;
            }
            if (OooO00o2 == AbstractC8352oOoOOoO0.OooO0O0) {
                d2 = 0.0d;
            } else {
                double d6 = (double) f2;
                Double.isNaN(d6);
                d2 = AbstractC8352oOoOOoO0.OooO00o(Math.floor(d6 / OooO00o2) * OooO00o2);
            }
            if (OooO00o2 != AbstractC8352oOoOOoO0.OooO0O0) {
                double d7 = d;
                OooO0o0 = OooO0o0;
                while (d7 <= d2) {
                    d7 += OooO00o2;
                    OooO0o0++;
                }
            }
            AbstractC8201oOOo0oO0 oooo0oo03 = this.f21407OooO00o;
            oooo0oo03.f21304OooO0Oo = OooO0o0;
            if (oooo0oo03.f21299OooO00o.length < OooO0o0) {
                oooo0oo03.f21299OooO00o = new float[OooO0o0];
            }
            for (int i2 = 0; i2 < OooO0o0; i2++) {
                if (d == AbstractC8352oOoOOoO0.OooO0O0) {
                    d = 0.0d;
                }
                this.f21407OooO00o.f21299OooO00o[i2] = (float) d;
                d += OooO00o2;
            }
            OooO0Oo2 = OooO0o0;
        }
        if (OooO00o2 < 1.0d) {
            this.f21407OooO00o.f21308OooO0o0 = (int) Math.ceil(-Math.log10(OooO00o2));
        } else {
            this.f21407OooO00o.f21308OooO0o0 = 0;
        }
        if (this.f21407OooO00o.m19871OooO0o0()) {
            AbstractC8201oOOo0oO0 oooo0oo04 = this.f21407OooO00o;
            if (oooo0oo04.f21302OooO0O0.length < OooO0Oo2) {
                oooo0oo04.f21302OooO0O0 = new float[OooO0Oo2];
            }
            float f4 = ((float) OooO00o2) / 2.0f;
            for (int i3 = 0; i3 < OooO0Oo2; i3++) {
                AbstractC8201oOOo0oO0 oooo0oo05 = this.f21407OooO00o;
                oooo0oo05.f21302OooO0O0[i3] = oooo0oo05.f21299OooO00o[i3] + f4;
            }
        }
    }
}
