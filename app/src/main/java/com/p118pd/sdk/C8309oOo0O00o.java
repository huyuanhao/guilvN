package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.CandleEntry;
import com.p118pd.sdk.AbstractC8308oOo0O00O;
import java.util.List;

/* renamed from: com.pd.sdk.oOo0O00o  reason: case insensitive filesystem */
public class C8309oOo0O00o extends AbstractC8326oOoOO00O {
    public AbstractC8255oOOooOOo OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float[] f21410OooO00o = new float[8];
    public float[] OooO0O0 = new float[4];
    public float[] OooO0OO = new float[4];
    public float[] OooO0Oo = new float[4];
    public float[] OooO0o0 = new float[4];

    public C8309oOo0O00o(AbstractC8255oOOooOOo oooooooo, C8185oOOo0O0 oooo0o0, C8353oOoOOoOO oooooooo2) {
        super(oooo0o0, oooooooo2);
        this.OooO00o = oooooooo;
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO, com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o() {
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o(Canvas canvas) {
        for (AbstractC8260oOOooo oooooo : this.OooO00o.getCandleData().m19905OooO00o()) {
            if (oooooo.isVisible()) {
                OooO00o(canvas, oooooo);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO0O0(Canvas canvas) {
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO0OO(Canvas canvas) {
        int i;
        C8349oOoOOo00 oooooo00;
        float f;
        float f2;
        if (OooO00o(this.OooO00o)) {
            List OooO00o2 = this.OooO00o.getCandleData().m19905OooO00o();
            for (int i2 = 0; i2 < OooO00o2.size(); i2++) {
                AbstractC8260oOOooo oooooo = (AbstractC8260oOOooo) OooO00o2.get(i2);
                if (OooO00o((AbstractC8265oOOoooO0) oooooo)) {
                    OooO00o((AbstractC8265oOOoooO0) oooooo);
                    C8351oOoOOo0o OooO00o3 = this.OooO00o.OooO00o(oooooo.m19949OooO00o());
                    ((AbstractC8308oOo0O00O) this).OooO00o.OooO00o(this.OooO00o, oooooo);
                    float OooO00o4 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO00o();
                    float OooO0O02 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
                    AbstractC8308oOo0O00O.OooO00o oooO00o = ((AbstractC8308oOo0O00O) this).OooO00o;
                    float[] OooO00o5 = OooO00o3.OooO00o(oooooo, OooO00o4, OooO0O02, oooO00o.OooO00o, oooO00o.OooO0O0);
                    float OooO00o6 = AbstractC8352oOoOOoO0.OooO00o(5.0f);
                    C8349oOoOOo00 OooO00o7 = C8349oOoOOo00.OooO00o(oooooo.m19953OooO00o());
                    OooO00o7.f21456OooO00o = AbstractC8352oOoOOoO0.OooO00o(OooO00o7.f21456OooO00o);
                    OooO00o7.OooO0O0 = AbstractC8352oOoOOoO0.OooO00o(OooO00o7.OooO0O0);
                    int i3 = 0;
                    while (i3 < OooO00o5.length) {
                        float f3 = OooO00o5[i3];
                        float f4 = OooO00o5[i3 + 1];
                        if (!((AbstractC8328oOoOO0O) this).OooO00o.m20040OooO0OO(f3)) {
                            break;
                        }
                        if (!((AbstractC8328oOoOO0O) this).OooO00o.m20037OooO0O0(f3) || !((AbstractC8328oOoOO0O) this).OooO00o.m20044OooO0o(f4)) {
                            i = i3;
                            oooooo00 = OooO00o7;
                        } else {
                            int i4 = i3 / 2;
                            CandleEntry candleEntry = (CandleEntry) oooooo.m19951OooO00o(((AbstractC8308oOo0O00O) this).OooO00o.OooO00o + i4);
                            if (oooooo.OooO0OO()) {
                                f2 = f4;
                                f = f3;
                                i = i3;
                                oooooo00 = OooO00o7;
                                OooO00o(canvas, oooooo.m19952OooO00o(), candleEntry.OooO0o0(), candleEntry, i2, f3, f4 - OooO00o6, oooooo.OooO0Oo(i4));
                            } else {
                                f2 = f4;
                                f = f3;
                                i = i3;
                                oooooo00 = OooO00o7;
                            }
                            if (candleEntry.m19898OooO00o() != null && oooooo.OooOo00()) {
                                Drawable OooO00o8 = candleEntry.m19898OooO00o();
                                AbstractC8352oOoOOoO0.OooO00o(canvas, OooO00o8, (int) (f + oooooo00.f21456OooO00o), (int) (f2 + oooooo00.OooO0O0), OooO00o8.getIntrinsicWidth(), OooO00o8.getIntrinsicHeight());
                            }
                        }
                        i3 = i + 2;
                        OooO00o7 = oooooo00;
                    }
                    C8349oOoOOo00.m20016OooO00o(OooO00o7);
                }
            }
        }
    }

    public void OooO00o(Canvas canvas, AbstractC8260oOOooo oooooo) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C8351oOoOOo0o OooO00o2 = this.OooO00o.OooO00o(oooooo.m19949OooO00o());
        float OooO0O02 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
        float OooOO0o = oooooo.OooOO0o();
        boolean OooOOO0 = oooooo.m19940OooOOO0();
        ((AbstractC8308oOo0O00O) this).OooO00o.OooO00o(this.OooO00o, oooooo);
        ((AbstractC8321oOoO0ooO) this).OooO00o.setStrokeWidth(oooooo.OooO0oo());
        int i6 = ((AbstractC8308oOo0O00O) this).OooO00o.OooO00o;
        while (true) {
            AbstractC8308oOo0O00O.OooO00o oooO00o = ((AbstractC8308oOo0O00O) this).OooO00o;
            if (i6 <= oooO00o.OooO0OO + oooO00o.OooO00o) {
                CandleEntry candleEntry = (CandleEntry) oooooo.m19951OooO00o(i6);
                if (candleEntry != null) {
                    float OooO0O03 = candleEntry.OooO0O0();
                    float OooO0oO = candleEntry.OooO0oO();
                    float OooO0Oo2 = candleEntry.OooO0Oo();
                    float OooO0o02 = candleEntry.OooO0o0();
                    float OooO0o = candleEntry.OooO0o();
                    if (OooOOO0) {
                        float[] fArr = this.f21410OooO00o;
                        fArr[0] = OooO0O03;
                        fArr[2] = OooO0O03;
                        fArr[4] = OooO0O03;
                        fArr[6] = OooO0O03;
                        if (OooO0oO > OooO0Oo2) {
                            fArr[1] = OooO0o02 * OooO0O02;
                            fArr[3] = OooO0oO * OooO0O02;
                            fArr[5] = OooO0o * OooO0O02;
                            fArr[7] = OooO0Oo2 * OooO0O02;
                        } else if (OooO0oO < OooO0Oo2) {
                            fArr[1] = OooO0o02 * OooO0O02;
                            fArr[3] = OooO0Oo2 * OooO0O02;
                            fArr[5] = OooO0o * OooO0O02;
                            fArr[7] = OooO0oO * OooO0O02;
                        } else {
                            fArr[1] = OooO0o02 * OooO0O02;
                            fArr[3] = OooO0oO * OooO0O02;
                            fArr[5] = OooO0o * OooO0O02;
                            fArr[7] = fArr[3];
                        }
                        OooO00o2.OooO0O0(this.f21410OooO00o);
                        if (!oooooo.OooOo0()) {
                            Paint paint = ((AbstractC8321oOoO0ooO) this).OooO00o;
                            if (oooooo.OooOOO0() == 1122867) {
                                i2 = oooooo.OooO00o(i6);
                            } else {
                                i2 = oooooo.OooOOO0();
                            }
                            paint.setColor(i2);
                        } else if (OooO0oO > OooO0Oo2) {
                            Paint paint2 = ((AbstractC8321oOoO0ooO) this).OooO00o;
                            if (oooooo.OooOOO() == 1122867) {
                                i5 = oooooo.OooO00o(i6);
                            } else {
                                i5 = oooooo.OooOOO();
                            }
                            paint2.setColor(i5);
                        } else if (OooO0oO < OooO0Oo2) {
                            Paint paint3 = ((AbstractC8321oOoO0ooO) this).OooO00o;
                            if (oooooo.m19939OooOO0o() == 1122867) {
                                i4 = oooooo.OooO00o(i6);
                            } else {
                                i4 = oooooo.m19939OooOO0o();
                            }
                            paint3.setColor(i4);
                        } else {
                            Paint paint4 = ((AbstractC8321oOoO0ooO) this).OooO00o;
                            if (oooooo.OooO0OO() == 1122867) {
                                i3 = oooooo.OooO00o(i6);
                            } else {
                                i3 = oooooo.OooO0OO();
                            }
                            paint4.setColor(i3);
                        }
                        ((AbstractC8321oOoO0ooO) this).OooO00o.setStyle(Paint.Style.STROKE);
                        canvas.drawLines(this.f21410OooO00o, ((AbstractC8321oOoO0ooO) this).OooO00o);
                        float[] fArr2 = this.OooO0O0;
                        fArr2[0] = (OooO0O03 - 0.5f) + OooOO0o;
                        fArr2[1] = OooO0Oo2 * OooO0O02;
                        fArr2[2] = (OooO0O03 + 0.5f) - OooOO0o;
                        fArr2[3] = OooO0oO * OooO0O02;
                        OooO00o2.OooO0O0(fArr2);
                        if (OooO0oO > OooO0Oo2) {
                            if (oooooo.OooOOO() == 1122867) {
                                ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(oooooo.OooO00o(i6));
                            } else {
                                ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(oooooo.OooOOO());
                            }
                            ((AbstractC8321oOoO0ooO) this).OooO00o.setStyle(oooooo.OooO00o());
                            float[] fArr3 = this.OooO0O0;
                            canvas.drawRect(fArr3[0], fArr3[3], fArr3[2], fArr3[1], ((AbstractC8321oOoO0ooO) this).OooO00o);
                        } else if (OooO0oO < OooO0Oo2) {
                            if (oooooo.m19939OooOO0o() == 1122867) {
                                ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(oooooo.OooO00o(i6));
                            } else {
                                ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(oooooo.m19939OooOO0o());
                            }
                            ((AbstractC8321oOoO0ooO) this).OooO00o.setStyle(oooooo.OooO0O0());
                            float[] fArr4 = this.OooO0O0;
                            canvas.drawRect(fArr4[0], fArr4[1], fArr4[2], fArr4[3], ((AbstractC8321oOoO0ooO) this).OooO00o);
                        } else {
                            if (oooooo.OooO0OO() == 1122867) {
                                ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(oooooo.OooO00o(i6));
                            } else {
                                ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(oooooo.OooO0OO());
                            }
                            float[] fArr5 = this.OooO0O0;
                            canvas.drawLine(fArr5[0], fArr5[1], fArr5[2], fArr5[3], ((AbstractC8321oOoO0ooO) this).OooO00o);
                        }
                    } else {
                        float[] fArr6 = this.OooO0OO;
                        fArr6[0] = OooO0O03;
                        fArr6[1] = OooO0o02 * OooO0O02;
                        fArr6[2] = OooO0O03;
                        fArr6[3] = OooO0o * OooO0O02;
                        float[] fArr7 = this.OooO0Oo;
                        fArr7[0] = (OooO0O03 - 0.5f) + OooOO0o;
                        float f = OooO0oO * OooO0O02;
                        fArr7[1] = f;
                        fArr7[2] = OooO0O03;
                        fArr7[3] = f;
                        float[] fArr8 = this.OooO0o0;
                        fArr8[0] = (0.5f + OooO0O03) - OooOO0o;
                        float f2 = OooO0Oo2 * OooO0O02;
                        fArr8[1] = f2;
                        fArr8[2] = OooO0O03;
                        fArr8[3] = f2;
                        OooO00o2.OooO0O0(fArr6);
                        OooO00o2.OooO0O0(this.OooO0Oo);
                        OooO00o2.OooO0O0(this.OooO0o0);
                        if (OooO0oO > OooO0Oo2) {
                            if (oooooo.OooOOO() == 1122867) {
                                i = oooooo.OooO00o(i6);
                            } else {
                                i = oooooo.OooOOO();
                            }
                        } else if (OooO0oO < OooO0Oo2) {
                            if (oooooo.m19939OooOO0o() == 1122867) {
                                i = oooooo.OooO00o(i6);
                            } else {
                                i = oooooo.m19939OooOO0o();
                            }
                        } else if (oooooo.OooO0OO() == 1122867) {
                            i = oooooo.OooO00o(i6);
                        } else {
                            i = oooooo.OooO0OO();
                        }
                        ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(i);
                        float[] fArr9 = this.OooO0OO;
                        canvas.drawLine(fArr9[0], fArr9[1], fArr9[2], fArr9[3], ((AbstractC8321oOoO0ooO) this).OooO00o);
                        float[] fArr10 = this.OooO0Oo;
                        canvas.drawLine(fArr10[0], fArr10[1], fArr10[2], fArr10[3], ((AbstractC8321oOoO0ooO) this).OooO00o);
                        float[] fArr11 = this.OooO0o0;
                        canvas.drawLine(fArr11[0], fArr11[1], fArr11[2], fArr11[3], ((AbstractC8321oOoO0ooO) this).OooO00o);
                    }
                }
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o(Canvas canvas, C8246oOOoo0oO[] ooooo0ooArr) {
        C8216oOOoOOO candleData = this.OooO00o.getCandleData();
        for (C8246oOOoo0oO ooooo0oo : ooooo0ooArr) {
            AbstractC8267oOOoooOo oooooooo = (AbstractC8260oOOooo) candleData.OooO00o(ooooo0oo.m19936OooO0O0());
            if (oooooooo != null && oooooooo.OooO0O0()) {
                CandleEntry candleEntry = (CandleEntry) oooooooo.OooO00o(ooooo0oo.OooO0OO(), ooooo0oo.OooO0o0());
                if (OooO00o(candleEntry, oooooooo)) {
                    C8346oOoOOOoo OooO00o2 = this.OooO00o.OooO00o(oooooooo.m19949OooO00o()).OooO00o(candleEntry.OooO0O0(), ((candleEntry.OooO0o() * ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0()) + (candleEntry.OooO0o0() * ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0())) / 2.0f);
                    ooooo0oo.OooO00o((float) OooO00o2.f21451OooO00o, (float) OooO00o2.OooO0O0);
                    OooO00o(canvas, (float) OooO00o2.f21451OooO00o, (float) OooO00o2.OooO0O0, oooooooo);
                }
            }
        }
    }
}
