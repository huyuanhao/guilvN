package com.p118pd.sdk;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

/* renamed from: com.pd.sdk.oOoOOo0o  reason: case insensitive filesystem */
public class C8351oOoOOo0o {
    public Matrix OooO00o = new Matrix();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8353oOoOOoOO f21458OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float[] f21459OooO00o = new float[1];
    public Matrix OooO0O0 = new Matrix();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public float[] f21460OooO0O0 = new float[1];
    public Matrix OooO0OO = new Matrix();

    /* renamed from: OooO0OO  reason: collision with other field name */
    public float[] f21461OooO0OO = new float[1];
    public Matrix OooO0Oo = new Matrix();

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public float[] f21462OooO0Oo = new float[1];
    public Matrix OooO0o0 = new Matrix();

    /* renamed from: OooO0o0  reason: collision with other field name */
    public float[] f21463OooO0o0 = new float[2];

    public C8351oOoOOo0o(C8353oOoOOoOO oooooooo) {
        this.f21458OooO00o = oooooooo;
    }

    public void OooO00o(float f, float f2, float f3, float f4) {
        float OooO0o = this.f21458OooO00o.OooO0o() / f2;
        float OooO0O02 = this.f21458OooO00o.OooO0O0() / f3;
        if (Float.isInfinite(OooO0o)) {
            OooO0o = 0.0f;
        }
        if (Float.isInfinite(OooO0O02)) {
            OooO0O02 = 0.0f;
        }
        this.OooO00o.reset();
        this.OooO00o.postTranslate(-f, -f4);
        this.OooO00o.postScale(OooO0o, -OooO0O02);
    }

    public void OooO0O0(float[] fArr) {
        this.OooO00o.mapPoints(fArr);
        this.f21458OooO00o.m20034OooO0O0().mapPoints(fArr);
        this.OooO0O0.mapPoints(fArr);
    }

    public void OooO0OO(RectF rectF, float f) {
        rectF.left *= f;
        rectF.right *= f;
        this.OooO00o.mapRect(rectF);
        this.f21458OooO00o.m20034OooO0O0().mapRect(rectF);
        this.OooO0O0.mapRect(rectF);
    }

    public Matrix OooO0Oo() {
        this.OooO0Oo.set(this.OooO00o);
        this.OooO0Oo.postConcat(this.f21458OooO00o.f21475OooO00o);
        this.OooO0Oo.postConcat(this.OooO0O0);
        return this.OooO0Oo;
    }

    public void OooO0O0(RectF rectF, float f) {
        rectF.left *= f;
        rectF.right *= f;
        this.OooO00o.mapRect(rectF);
        this.f21458OooO00o.m20034OooO0O0().mapRect(rectF);
        this.OooO0O0.mapRect(rectF);
    }

    public Matrix OooO0OO() {
        return this.OooO00o;
    }

    public void OooO00o(boolean z) {
        this.OooO0O0.reset();
        if (!z) {
            this.OooO0O0.postTranslate(this.f21458OooO00o.OooOOoo(), this.f21458OooO00o.OooO0oO() - this.f21458OooO00o.OooOOo());
            return;
        }
        this.OooO0O0.setTranslate(this.f21458OooO00o.OooOOoo(), -this.f21458OooO00o.OooOo0());
        this.OooO0O0.postScale(1.0f, -1.0f);
    }

    public void OooO0O0(RectF rectF) {
        this.OooO00o.mapRect(rectF);
        this.f21458OooO00o.m20034OooO0O0().mapRect(rectF);
        this.OooO0O0.mapRect(rectF);
    }

    public void OooO0O0(List<RectF> list) {
        Matrix OooO0Oo2 = OooO0Oo();
        for (int i = 0; i < list.size(); i++) {
            OooO0Oo2.mapRect(list.get(i));
        }
    }

    public float[] OooO00o(AbstractC8270oOOooooO oooooooo, float f, float f2, int i, int i2) {
        int i3 = ((int) ((((float) (i2 - i)) * f) + 1.0f)) * 2;
        if (this.f21459OooO00o.length != i3) {
            this.f21459OooO00o = new float[i3];
        }
        float[] fArr = this.f21459OooO00o;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            Entry OooO00o2 = oooooooo.m19951OooO00o((i4 / 2) + i);
            if (OooO00o2 != null) {
                fArr[i4] = OooO00o2.OooO0O0();
                fArr[i4 + 1] = OooO00o2.OooO00o() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        OooO0Oo().mapPoints(fArr);
        return fArr;
    }

    public C8346oOoOOOoo OooO0O0(float f, float f2) {
        C8346oOoOOOoo OooO00o2 = C8346oOoOOOoo.OooO00o(AbstractC8352oOoOOoO0.OooO0O0, AbstractC8352oOoOOoO0.OooO0O0);
        OooO00o(f, f2, OooO00o2);
        return OooO00o2;
    }

    public Matrix OooO0O0() {
        OooO0Oo().invert(this.OooO0o0);
        return this.OooO0o0;
    }

    public float[] OooO00o(AbstractC8263oOOooo0o oooooo0o, float f, int i, int i2) {
        int i3 = ((i2 - i) + 1) * 2;
        if (this.f21460OooO0O0.length != i3) {
            this.f21460OooO0O0 = new float[i3];
        }
        float[] fArr = this.f21460OooO0O0;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            Entry OooO00o2 = oooooo0o.m19951OooO00o((i4 / 2) + i);
            if (OooO00o2 != null) {
                fArr[i4] = OooO00o2.OooO0O0();
                fArr[i4 + 1] = OooO00o2.OooO00o() * f;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        OooO0Oo().mapPoints(fArr);
        return fArr;
    }

    public float[] OooO00o(AbstractC8264oOOoooO ooooooo, float f, float f2, int i, int i2) {
        int i3 = (((int) (((float) (i2 - i)) * f)) + 1) * 2;
        if (this.f21461OooO0OO.length != i3) {
            this.f21461OooO0OO = new float[i3];
        }
        float[] fArr = this.f21461OooO0OO;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            Entry OooO00o2 = ooooooo.m19951OooO00o((i4 / 2) + i);
            if (OooO00o2 != null) {
                fArr[i4] = OooO00o2.OooO0O0();
                fArr[i4 + 1] = OooO00o2.OooO00o() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        OooO0Oo().mapPoints(fArr);
        return fArr;
    }

    public float[] OooO00o(AbstractC8260oOOooo oooooo, float f, float f2, int i, int i2) {
        int i3 = ((int) ((((float) (i2 - i)) * f) + 1.0f)) * 2;
        if (this.f21462OooO0Oo.length != i3) {
            this.f21462OooO0Oo = new float[i3];
        }
        float[] fArr = this.f21462OooO0Oo;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            CandleEntry candleEntry = (CandleEntry) oooooo.m19951OooO00o((i4 / 2) + i);
            if (candleEntry != null) {
                fArr[i4] = candleEntry.OooO0O0();
                fArr[i4 + 1] = candleEntry.OooO0o0() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        OooO0Oo().mapPoints(fArr);
        return fArr;
    }

    public void OooO00o(Path path) {
        path.transform(this.OooO00o);
        path.transform(this.f21458OooO00o.m20034OooO0O0());
        path.transform(this.OooO0O0);
    }

    public void OooO00o(List<Path> list) {
        for (int i = 0; i < list.size(); i++) {
            OooO00o(list.get(i));
        }
    }

    public void OooO00o(RectF rectF) {
        this.OooO00o.mapRect(rectF);
        this.f21458OooO00o.m20034OooO0O0().mapRect(rectF);
        this.OooO0O0.mapRect(rectF);
    }

    public void OooO00o(RectF rectF, float f) {
        rectF.top *= f;
        rectF.bottom *= f;
        this.OooO00o.mapRect(rectF);
        this.f21458OooO00o.m20034OooO0O0().mapRect(rectF);
        this.OooO0O0.mapRect(rectF);
    }

    public void OooO00o(float[] fArr) {
        Matrix matrix = this.OooO0OO;
        matrix.reset();
        this.OooO0O0.invert(matrix);
        matrix.mapPoints(fArr);
        this.f21458OooO00o.m20034OooO0O0().invert(matrix);
        matrix.mapPoints(fArr);
        this.OooO00o.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public void OooO00o(float f, float f2, C8346oOoOOOoo oooooooo) {
        float[] fArr = this.f21463OooO0o0;
        fArr[0] = f;
        fArr[1] = f2;
        OooO00o(fArr);
        float[] fArr2 = this.f21463OooO0o0;
        oooooooo.f21451OooO00o = (double) fArr2[0];
        oooooooo.OooO0O0 = (double) fArr2[1];
    }

    public C8346oOoOOOoo OooO00o(float f, float f2) {
        float[] fArr = this.f21463OooO0o0;
        fArr[0] = f;
        fArr[1] = f2;
        OooO0O0(fArr);
        float[] fArr2 = this.f21463OooO0o0;
        return C8346oOoOOOoo.OooO00o((double) fArr2[0], (double) fArr2[1]);
    }

    public Matrix OooO00o() {
        return this.OooO0O0;
    }
}
