package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BubbleEntry;
import com.p118pd.sdk.AbstractC8308oOo0O00O;
import java.util.List;

/* renamed from: com.pd.sdk.oOo0oO0o  reason: case insensitive filesystem */
public class C8315oOo0oO0o extends AbstractC8308oOo0O00O {
    public AbstractC8254oOOooOOO OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float[] f21411OooO00o = new float[4];
    public float[] OooO0O0 = new float[2];
    public float[] OooO0OO = new float[3];

    public C8315oOo0oO0o(AbstractC8254oOOooOOO oooooooo, C8185oOOo0O0 oooo0o0, C8353oOoOOoOO oooooooo2) {
        super(oooo0o0, oooooooo2);
        this.OooO00o = oooooooo;
        ((AbstractC8321oOoO0ooO) this).OooO00o.setStyle(Paint.Style.FILL);
        super.OooO0O0.setStyle(Paint.Style.STROKE);
        super.OooO0O0.setStrokeWidth(AbstractC8352oOoOOoO0.OooO00o(1.5f));
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO, com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o() {
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o(Canvas canvas) {
        for (AbstractC8263oOOooo0o oooooo0o : this.OooO00o.getBubbleData().m19905OooO00o()) {
            if (oooooo0o.isVisible()) {
                OooO00o(canvas, oooooo0o);
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
        C8213oOOoOO00 bubbleData = this.OooO00o.getBubbleData();
        if (bubbleData != null && OooO00o(this.OooO00o)) {
            List OooO00o2 = bubbleData.m19905OooO00o();
            float OooO00o3 = (float) AbstractC8352oOoOOoO0.OooO00o(this.OooO0Oo, "1");
            for (int i2 = 0; i2 < OooO00o2.size(); i2++) {
                AbstractC8263oOOooo0o oooooo0o = (AbstractC8263oOOooo0o) OooO00o2.get(i2);
                if (OooO00o((AbstractC8265oOOoooO0) oooooo0o)) {
                    OooO00o((AbstractC8265oOOoooO0) oooooo0o);
                    float max = Math.max(0.0f, Math.min(1.0f, ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO00o()));
                    float OooO0O02 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
                    ((AbstractC8308oOo0O00O) this).OooO00o.OooO00o(this.OooO00o, oooooo0o);
                    C8351oOoOOo0o OooO00o4 = this.OooO00o.OooO00o(oooooo0o.m19949OooO00o());
                    AbstractC8308oOo0O00O.OooO00o oooO00o = ((AbstractC8308oOo0O00O) this).OooO00o;
                    float[] OooO00o5 = OooO00o4.OooO00o(oooooo0o, OooO0O02, oooO00o.OooO00o, oooO00o.OooO0O0);
                    float f3 = max == 1.0f ? OooO0O02 : max;
                    C8349oOoOOo00 OooO00o6 = C8349oOoOOo00.OooO00o(oooooo0o.m19953OooO00o());
                    OooO00o6.f21456OooO00o = AbstractC8352oOoOOoO0.OooO00o(OooO00o6.f21456OooO00o);
                    OooO00o6.OooO0O0 = AbstractC8352oOoOOoO0.OooO00o(OooO00o6.OooO0O0);
                    int i3 = 0;
                    while (i3 < OooO00o5.length) {
                        int i4 = i3 / 2;
                        int OooO0Oo = oooooo0o.OooO0Oo(((AbstractC8308oOo0O00O) this).OooO00o.OooO00o + i4);
                        int argb = Color.argb(Math.round(255.0f * f3), Color.red(OooO0Oo), Color.green(OooO0Oo), Color.blue(OooO0Oo));
                        float f4 = OooO00o5[i3];
                        float f5 = OooO00o5[i3 + 1];
                        if (!((AbstractC8328oOoOO0O) this).OooO00o.m20040OooO0OO(f4)) {
                            break;
                        }
                        if (!((AbstractC8328oOoOO0O) this).OooO00o.m20037OooO0O0(f4) || !((AbstractC8328oOoOO0O) this).OooO00o.m20044OooO0o(f5)) {
                            i = i3;
                            oooooo00 = OooO00o6;
                        } else {
                            BubbleEntry bubbleEntry = (BubbleEntry) oooooo0o.m19951OooO00o(i4 + ((AbstractC8308oOo0O00O) this).OooO00o.OooO00o);
                            if (oooooo0o.OooO0OO()) {
                                f2 = f5;
                                f = f4;
                                i = i3;
                                oooooo00 = OooO00o6;
                                OooO00o(canvas, oooooo0o.m19952OooO00o(), bubbleEntry.OooO0OO(), bubbleEntry, i2, f4, f5 + (0.5f * OooO00o3), argb);
                            } else {
                                f2 = f5;
                                f = f4;
                                i = i3;
                                oooooo00 = OooO00o6;
                            }
                            if (bubbleEntry.m19898OooO00o() != null && oooooo0o.OooOo00()) {
                                Drawable OooO00o7 = bubbleEntry.m19898OooO00o();
                                AbstractC8352oOoOOoO0.OooO00o(canvas, OooO00o7, (int) (f + oooooo00.f21456OooO00o), (int) (f2 + oooooo00.OooO0O0), OooO00o7.getIntrinsicWidth(), OooO00o7.getIntrinsicHeight());
                            }
                        }
                        i3 = i + 2;
                        OooO00o6 = oooooo00;
                    }
                    C8349oOoOOo00.m20016OooO00o(OooO00o6);
                }
            }
        }
    }

    public float OooO00o(float f, float f2, float f3, boolean z) {
        if (z) {
            f = f2 == 0.0f ? 1.0f : (float) Math.sqrt((double) (f / f2));
        }
        return f3 * f;
    }

    public void OooO00o(Canvas canvas, AbstractC8263oOOooo0o oooooo0o) {
        C8351oOoOOo0o OooO00o2 = this.OooO00o.OooO00o(oooooo0o.m19949OooO00o());
        float OooO0O02 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
        ((AbstractC8308oOo0O00O) this).OooO00o.OooO00o(this.OooO00o, oooooo0o);
        float[] fArr = this.f21411OooO00o;
        fArr[0] = 0.0f;
        fArr[2] = 1.0f;
        OooO00o2.OooO0O0(fArr);
        boolean OooO0oo = oooooo0o.OooO0oo();
        float[] fArr2 = this.f21411OooO00o;
        float min = Math.min(Math.abs(((AbstractC8328oOoOO0O) this).OooO00o.OooO00o() - ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0()), Math.abs(fArr2[2] - fArr2[0]));
        int i = ((AbstractC8308oOo0O00O) this).OooO00o.OooO00o;
        while (true) {
            AbstractC8308oOo0O00O.OooO00o oooO00o = ((AbstractC8308oOo0O00O) this).OooO00o;
            if (i <= oooO00o.OooO0OO + oooO00o.OooO00o) {
                BubbleEntry bubbleEntry = (BubbleEntry) oooooo0o.m19951OooO00o(i);
                this.OooO0O0[0] = bubbleEntry.OooO0O0();
                this.OooO0O0[1] = bubbleEntry.OooO00o() * OooO0O02;
                OooO00o2.OooO0O0(this.OooO0O0);
                float OooO00o3 = OooO00o(bubbleEntry.OooO0OO(), oooooo0o.OooOo0O(), min, OooO0oo) / 2.0f;
                if (((AbstractC8328oOoOO0O) this).OooO00o.m20042OooO0Oo(this.OooO0O0[1] + OooO00o3) && ((AbstractC8328oOoOO0O) this).OooO00o.m20032OooO00o(this.OooO0O0[1] - OooO00o3) && ((AbstractC8328oOoOO0O) this).OooO00o.m20037OooO0O0(this.OooO0O0[0] + OooO00o3)) {
                    if (((AbstractC8328oOoOO0O) this).OooO00o.m20040OooO0OO(this.OooO0O0[0] - OooO00o3)) {
                        ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(oooooo0o.OooO00o((int) bubbleEntry.OooO0O0()));
                        float[] fArr3 = this.OooO0O0;
                        canvas.drawCircle(fArr3[0], fArr3[1], OooO00o3, ((AbstractC8321oOoO0ooO) this).OooO00o);
                    } else {
                        return;
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o(Canvas canvas, C8246oOOoo0oO[] ooooo0ooArr) {
        C8213oOOoOO00 bubbleData = this.OooO00o.getBubbleData();
        float OooO0O02 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
        for (C8246oOOoo0oO ooooo0oo : ooooo0ooArr) {
            AbstractC8263oOOooo0o oooooo0o = (AbstractC8263oOOooo0o) bubbleData.OooO00o(ooooo0oo.m19936OooO0O0());
            if (oooooo0o != null && oooooo0o.OooO0O0()) {
                BubbleEntry bubbleEntry = (BubbleEntry) oooooo0o.OooO00o(ooooo0oo.OooO0OO(), ooooo0oo.OooO0o0());
                if (bubbleEntry.OooO00o() == ooooo0oo.OooO0o0() && OooO00o(bubbleEntry, oooooo0o)) {
                    C8351oOoOOo0o OooO00o2 = this.OooO00o.OooO00o(oooooo0o.m19949OooO00o());
                    float[] fArr = this.f21411OooO00o;
                    fArr[0] = 0.0f;
                    fArr[2] = 1.0f;
                    OooO00o2.OooO0O0(fArr);
                    boolean OooO0oo = oooooo0o.OooO0oo();
                    float[] fArr2 = this.f21411OooO00o;
                    float min = Math.min(Math.abs(((AbstractC8328oOoOO0O) this).OooO00o.OooO00o() - ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0()), Math.abs(fArr2[2] - fArr2[0]));
                    this.OooO0O0[0] = bubbleEntry.OooO0O0();
                    this.OooO0O0[1] = bubbleEntry.OooO00o() * OooO0O02;
                    OooO00o2.OooO0O0(this.OooO0O0);
                    float[] fArr3 = this.OooO0O0;
                    ooooo0oo.OooO00o(fArr3[0], fArr3[1]);
                    float OooO00o3 = OooO00o(bubbleEntry.OooO0OO(), oooooo0o.OooOo0O(), min, OooO0oo) / 2.0f;
                    if (((AbstractC8328oOoOO0O) this).OooO00o.m20042OooO0Oo(this.OooO0O0[1] + OooO00o3) && ((AbstractC8328oOoOO0O) this).OooO00o.m20032OooO00o(this.OooO0O0[1] - OooO00o3) && ((AbstractC8328oOoOO0O) this).OooO00o.m20037OooO0O0(this.OooO0O0[0] + OooO00o3)) {
                        if (((AbstractC8328oOoOO0O) this).OooO00o.m20040OooO0OO(this.OooO0O0[0] - OooO00o3)) {
                            int OooO00o4 = oooooo0o.OooO00o((int) bubbleEntry.OooO0O0());
                            Color.RGBToHSV(Color.red(OooO00o4), Color.green(OooO00o4), Color.blue(OooO00o4), this.OooO0OO);
                            float[] fArr4 = this.OooO0OO;
                            fArr4[2] = fArr4[2] * 0.5f;
                            super.OooO0O0.setColor(Color.HSVToColor(Color.alpha(OooO00o4), this.OooO0OO));
                            super.OooO0O0.setStrokeWidth(oooooo0o.OooOoo0());
                            float[] fArr5 = this.OooO0O0;
                            canvas.drawCircle(fArr5[0], fArr5[1], OooO00o3, super.OooO0O0);
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }
}
