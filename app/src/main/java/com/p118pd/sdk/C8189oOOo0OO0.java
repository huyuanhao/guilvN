package com.p118pd.sdk;

import com.github.mikephil.charting.data.BarEntry;

/* renamed from: com.pd.sdk.oOOo0OO0  reason: case insensitive filesystem */
public class C8189oOOo0OO0 extends AbstractC8184oOOo0O<AbstractC8262oOOooo00> {
    public boolean OooO00o = false;
    public boolean OooO0O0 = false;
    public float OooO0OO = 1.0f;
    public int OooO0Oo = 0;
    public int OooO0o0 = 1;

    public C8189oOOo0OO0(int i, int i2, boolean z) {
        super(i);
        this.OooO0o0 = i2;
        this.OooO00o = z;
    }

    public void OooO0OO(int i) {
        this.OooO0Oo = i;
    }

    public void OooO00o(float f) {
        this.OooO0OO = f;
    }

    public void OooO00o(boolean z) {
        this.OooO0O0 = z;
    }

    public void OooO00o(float f, float f2, float f3, float f4) {
        float[] fArr = ((AbstractC8184oOOo0O) this).f21242OooO00o;
        int i = ((AbstractC8184oOOo0O) this).f21241OooO00o;
        int i2 = i + 1;
        ((AbstractC8184oOOo0O) this).f21241OooO00o = i2;
        fArr[i] = f;
        int i3 = i2 + 1;
        ((AbstractC8184oOOo0O) this).f21241OooO00o = i3;
        fArr[i2] = f2;
        int i4 = i3 + 1;
        ((AbstractC8184oOOo0O) this).f21241OooO00o = i4;
        fArr[i3] = f3;
        ((AbstractC8184oOOo0O) this).f21241OooO00o = i4 + 1;
        fArr[i4] = f4;
    }

    public void OooO00o(AbstractC8262oOOooo00 oooooo00) {
        float f;
        float f2;
        float f3;
        float f4;
        float OooO0Oo2 = ((float) oooooo00.OooO0Oo()) * ((AbstractC8184oOOo0O) this).OooO00o;
        float f5 = this.OooO0OO / 2.0f;
        for (int i = 0; ((float) i) < OooO0Oo2; i++) {
            BarEntry barEntry = (BarEntry) oooooo00.m19951OooO00o(i);
            if (barEntry != null) {
                float OooO0O02 = barEntry.OooO0O0();
                float OooO00o2 = barEntry.OooO00o();
                float[] OooO00o3 = barEntry.m15084OooO00o();
                if (!this.OooO00o || OooO00o3 == null) {
                    float f6 = OooO0O02 - f5;
                    float f7 = OooO0O02 + f5;
                    if (this.OooO0O0) {
                        f = OooO00o2 >= 0.0f ? OooO00o2 : 0.0f;
                        if (OooO00o2 > 0.0f) {
                            OooO00o2 = 0.0f;
                        }
                    } else {
                        float f8 = OooO00o2 >= 0.0f ? OooO00o2 : 0.0f;
                        if (OooO00o2 > 0.0f) {
                            OooO00o2 = 0.0f;
                        }
                        OooO00o2 = f8;
                        f = OooO00o2;
                    }
                    if (OooO00o2 > 0.0f) {
                        OooO00o2 *= ((AbstractC8184oOOo0O) this).OooO0O0;
                    } else {
                        f *= ((AbstractC8184oOOo0O) this).OooO0O0;
                    }
                    OooO00o(f6, OooO00o2, f7, f);
                } else {
                    float f9 = -barEntry.OooO0OO();
                    int i2 = 0;
                    float f10 = 0.0f;
                    while (i2 < OooO00o3.length) {
                        float f11 = OooO00o3[i2];
                        if (f11 == 0.0f && (f10 == 0.0f || f9 == 0.0f)) {
                            f2 = f11;
                            f3 = f9;
                            f9 = f2;
                        } else if (f11 >= 0.0f) {
                            f2 = f11 + f10;
                            f3 = f9;
                            f9 = f10;
                            f10 = f2;
                        } else {
                            f2 = Math.abs(f11) + f9;
                            f3 = Math.abs(f11) + f9;
                        }
                        float f12 = OooO0O02 - f5;
                        float f13 = OooO0O02 + f5;
                        if (this.OooO0O0) {
                            f4 = f9 >= f2 ? f9 : f2;
                            if (f9 > f2) {
                                f9 = f2;
                            }
                        } else {
                            float f14 = f9 >= f2 ? f9 : f2;
                            if (f9 > f2) {
                                f9 = f2;
                            }
                            f9 = f14;
                            f4 = f9;
                        }
                        float f15 = ((AbstractC8184oOOo0O) this).OooO0O0;
                        OooO00o(f12, f9 * f15, f13, f4 * f15);
                        i2++;
                        f9 = f3;
                    }
                }
            }
        }
        m19826OooO00o();
    }
}
