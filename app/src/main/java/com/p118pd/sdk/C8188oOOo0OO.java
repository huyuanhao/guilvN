package com.p118pd.sdk;

import com.github.mikephil.charting.data.BarEntry;

/* renamed from: com.pd.sdk.oOOo0OO  reason: case insensitive filesystem */
public class C8188oOOo0OO extends C8189oOOo0OO0 {
    public C8188oOOo0OO(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    @Override // com.p118pd.sdk.C8189oOOo0OO0
    public void OooO00o(AbstractC8262oOOooo00 oooooo00) {
        float f;
        float f2;
        float f3;
        float f4;
        float OooO0Oo = ((float) oooooo00.OooO0Oo()) * ((AbstractC8184oOOo0O) this).OooO00o;
        float f5 = ((C8189oOOo0OO0) this).OooO0OO / 2.0f;
        for (int i = 0; ((float) i) < OooO0Oo; i++) {
            BarEntry barEntry = (BarEntry) oooooo00.m19951OooO00o(i);
            if (barEntry != null) {
                float OooO0O0 = barEntry.OooO0O0();
                float OooO00o = barEntry.OooO00o();
                float[] OooO00o2 = barEntry.m15084OooO00o();
                if (!((C8189oOOo0OO0) this).OooO00o || OooO00o2 == null) {
                    float f6 = OooO0O0 - f5;
                    float f7 = OooO0O0 + f5;
                    if (((C8189oOOo0OO0) this).OooO0O0) {
                        f = OooO00o >= 0.0f ? OooO00o : 0.0f;
                        if (OooO00o > 0.0f) {
                            OooO00o = 0.0f;
                        }
                    } else {
                        float f8 = OooO00o >= 0.0f ? OooO00o : 0.0f;
                        if (OooO00o > 0.0f) {
                            OooO00o = 0.0f;
                        }
                        OooO00o = f8;
                        f = OooO00o;
                    }
                    if (OooO00o > 0.0f) {
                        OooO00o *= ((AbstractC8184oOOo0O) this).OooO0O0;
                    } else {
                        f *= ((AbstractC8184oOOo0O) this).OooO0O0;
                    }
                    OooO00o(f, f7, OooO00o, f6);
                } else {
                    float f9 = -barEntry.OooO0OO();
                    int i2 = 0;
                    float f10 = 0.0f;
                    while (i2 < OooO00o2.length) {
                        float f11 = OooO00o2[i2];
                        if (f11 >= 0.0f) {
                            f2 = f11 + f10;
                            f3 = f9;
                            f9 = f10;
                            f10 = f2;
                        } else {
                            f2 = Math.abs(f11) + f9;
                            f3 = Math.abs(f11) + f9;
                        }
                        float f12 = OooO0O0 - f5;
                        float f13 = OooO0O0 + f5;
                        if (((C8189oOOo0OO0) this).OooO0O0) {
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
                        OooO00o(f4 * f15, f13, f9 * f15, f12);
                        i2++;
                        f9 = f3;
                    }
                }
            }
        }
        m19826OooO00o();
    }
}
