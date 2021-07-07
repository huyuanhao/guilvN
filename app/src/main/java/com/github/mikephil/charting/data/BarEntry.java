package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import com.p118pd.sdk.C8252oOOooO0o;

@SuppressLint({"ParcelCreator"})
public class BarEntry extends Entry {
    public float[] OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8252oOOooO0o[] f14950OooO00o;
    public float OooO0o;
    public float OooO0oO;

    public BarEntry(float f, float f2) {
        super(f, f2);
    }

    public float OooO0O0(int i) {
        float[] fArr = this.OooO00o;
        float f = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        int length = fArr.length - 1;
        while (length > i && length >= 0) {
            f += this.OooO00o[length];
            length--;
        }
        return f;
    }

    public float OooO0OO() {
        return this.OooO0o;
    }

    public float OooO0Oo() {
        return this.OooO0oO;
    }

    public BarEntry(float f, float f2, Object obj) {
        super(f, f2, obj);
    }

    @Override // com.github.mikephil.charting.data.Entry, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o
    public BarEntry OooO00o() {
        BarEntry barEntry = new BarEntry(OooO0O0(), OooO00o(), m19899OooO00o());
        barEntry.m15082OooO00o(this.OooO00o);
        return barEntry;
    }

    public BarEntry(float f, float f2, Drawable drawable) {
        super(f, f2, drawable);
    }

    public BarEntry(float f, float f2, Drawable drawable, Object obj) {
        super(f, f2, drawable, obj);
    }

    @Override // com.github.mikephil.charting.data.Entry
    private void OooO0O0() {
        float[] fArr = this.OooO00o;
        if (fArr == null) {
            this.OooO0o = 0.0f;
            this.OooO0oO = 0.0f;
            return;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        for (float f3 : fArr) {
            if (f3 <= 0.0f) {
                f += Math.abs(f3);
            } else {
                f2 += f3;
            }
        }
        this.OooO0o = f;
        this.OooO0oO = f2;
    }

    @Override // com.github.mikephil.charting.data.Entry, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public float[] m15084OooO00o() {
        return this.OooO00o;
    }

    public BarEntry(float f, float[] fArr) {
        super(f, OooO00o(fArr));
        this.OooO00o = fArr;
        OooO0O0();
        m15081OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15082OooO00o(float[] fArr) {
        OooO00o(OooO00o(fArr));
        this.OooO00o = fArr;
        OooO0O0();
        m15081OooO00o();
    }

    public BarEntry(float f, float[] fArr, Object obj) {
        super(f, OooO00o(fArr), obj);
        this.OooO00o = fArr;
        OooO0O0();
        m15081OooO00o();
    }

    @Override // com.github.mikephil.charting.data.Entry, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o
    public float OooO00o() {
        return super.OooO00o();
    }

    @Override // com.github.mikephil.charting.data.Entry, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8252oOOooO0o[] m15085OooO00o() {
        return this.f14950OooO00o;
    }

    @Override // com.github.mikephil.charting.data.Entry, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15083OooO00o() {
        return this.OooO00o != null;
    }

    @Deprecated
    public float OooO00o(int i) {
        return OooO0O0(i);
    }

    public BarEntry(float f, float[] fArr, Drawable drawable) {
        super(f, OooO00o(fArr), drawable);
        this.OooO00o = fArr;
        OooO0O0();
        m15081OooO00o();
    }

    public static float OooO00o(float[] fArr) {
        float f = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        for (float f2 : fArr) {
            f += f2;
        }
        return f;
    }

    @Override // com.github.mikephil.charting.data.Entry, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15081OooO00o() {
        float[] OooO00o2 = m15084OooO00o();
        if (OooO00o2 != null && OooO00o2.length != 0) {
            this.f14950OooO00o = new C8252oOOooO0o[OooO00o2.length];
            float f = -OooO0OO();
            int i = 0;
            float f2 = 0.0f;
            while (true) {
                C8252oOOooO0o[] oooooo0oArr = this.f14950OooO00o;
                if (i < oooooo0oArr.length) {
                    float f3 = OooO00o2[i];
                    if (f3 < 0.0f) {
                        float f4 = f - f3;
                        oooooo0oArr[i] = new C8252oOOooO0o(f, f4);
                        f = f4;
                    } else {
                        float f5 = f3 + f2;
                        oooooo0oArr[i] = new C8252oOOooO0o(f2, f5);
                        f2 = f5;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public BarEntry(float f, float[] fArr, Drawable drawable, Object obj) {
        super(f, OooO00o(fArr), drawable, obj);
        this.OooO00o = fArr;
        OooO0O0();
        m15081OooO00o();
    }
}
