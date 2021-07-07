package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BarEntry;
import java.util.List;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.pd.sdk.oOoO0ooo  reason: case insensitive filesystem */
public class C8322oOoO0ooo extends C8306oOo0O00 {
    public RectF OooO0OO = new RectF();

    public C8322oOoO0ooo(AbstractC8248oOOooO oooooo, C8185oOOo0O0 oooo0o0, C8353oOoOOoOO oooooooo) {
        super(oooooo, oooo0o0, oooooooo);
        this.OooO0Oo.setTextAlign(Paint.Align.LEFT);
    }

    @Override // com.p118pd.sdk.C8306oOo0O00, com.p118pd.sdk.AbstractC8321oOoO0ooO, com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o() {
        C8208oOOoO0Oo barData = ((C8306oOo0O00) this).f21405OooO00o.getBarData();
        ((C8306oOo0O00) this).f21406OooO00o = new C8188oOOo0OO[barData.m19903OooO00o()];
        for (int i = 0; i < ((C8306oOo0O00) this).f21406OooO00o.length; i++) {
            AbstractC8262oOOooo00 oooooo00 = (AbstractC8262oOOooo00) barData.OooO00o(i);
            ((C8306oOo0O00) this).f21406OooO00o[i] = new C8188oOOo0OO(oooooo00.OooO0Oo() * 4 * (oooooo00.m19941OooOOo() ? oooooo00.OooOOo() : 1), barData.m19903OooO00o(), oooooo00.m19941OooOOo());
        }
    }

    @Override // com.p118pd.sdk.C8306oOo0O00, com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO0OO(Canvas canvas) {
        List list;
        C8349oOoOOo00 oooooo00;
        int i;
        float[] fArr;
        float[] fArr2;
        int i2;
        float f;
        float f2;
        float f3;
        BarEntry barEntry;
        boolean z;
        List list2;
        int i3;
        float f4;
        C8189oOOo0OO0 oooo0oo0;
        AbstractC8239oOOoo00O ooooo00o;
        C8349oOoOOo00 oooooo002;
        float f5;
        if (OooO00o(((C8306oOo0O00) this).f21405OooO00o)) {
            List OooO00o = ((C8306oOo0O00) this).f21405OooO00o.getBarData().m19905OooO00o();
            float OooO00o2 = AbstractC8352oOoOOoO0.OooO00o(5.0f);
            boolean OooO0O0 = ((C8306oOo0O00) this).f21405OooO00o.OooO0O0();
            int i4 = 0;
            while (i4 < ((C8306oOo0O00) this).f21405OooO00o.getBarData().m19903OooO00o()) {
                AbstractC8262oOOooo00 oooooo003 = (AbstractC8262oOOooo00) OooO00o.get(i4);
                if (!OooO00o((AbstractC8265oOOoooO0) oooooo003)) {
                    list = OooO00o;
                } else {
                    boolean OooO00o3 = ((C8306oOo0O00) this).f21405OooO00o.m19938OooO00o(oooooo003.m19949OooO00o());
                    OooO00o((AbstractC8265oOOoooO0) oooooo003);
                    float f6 = 2.0f;
                    float OooO00o4 = ((float) AbstractC8352oOoOOoO0.OooO00o(this.OooO0Oo, AgooConstants.ACK_REMOVE_PACKAGE)) / 2.0f;
                    AbstractC8239oOOoo00O OooO00o5 = oooooo003.m19952OooO00o();
                    C8189oOOo0OO0 oooo0oo02 = ((C8306oOo0O00) this).f21406OooO00o[i4];
                    float OooO0O02 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
                    C8349oOoOOo00 OooO00o6 = C8349oOoOOo00.OooO00o(oooooo003.m19953OooO00o());
                    OooO00o6.f21456OooO00o = AbstractC8352oOoOOoO0.OooO00o(OooO00o6.f21456OooO00o);
                    OooO00o6.OooO0O0 = AbstractC8352oOoOOoO0.OooO00o(OooO00o6.OooO0O0);
                    if (!oooooo003.m19941OooOOo()) {
                        int i5 = 0;
                        while (((float) i5) < ((float) ((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o.length) * ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO00o()) {
                            float[] fArr3 = ((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o;
                            int i6 = i5 + 1;
                            float f7 = (fArr3[i6] + fArr3[i5 + 3]) / f6;
                            if (!((AbstractC8328oOoOO0O) this).OooO00o.m20042OooO0Oo(fArr3[i6])) {
                                break;
                            }
                            if (((AbstractC8328oOoOO0O) this).OooO00o.m20046OooO0o0(((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o[i5]) && ((AbstractC8328oOoOO0O) this).OooO00o.m20032OooO00o(((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o[i6])) {
                                BarEntry barEntry2 = (BarEntry) oooooo003.m19951OooO00o(i5 / 4);
                                float OooO00o7 = barEntry2.OooO00o();
                                String OooO00o8 = OooO00o5.OooO00o(OooO00o7, barEntry2, i4, ((AbstractC8328oOoOO0O) this).OooO00o);
                                float OooO0O03 = (float) AbstractC8352oOoOOoO0.OooO0O0(this.OooO0Oo, OooO00o8);
                                float f8 = OooO0O0 ? OooO00o2 : -(OooO0O03 + OooO00o2);
                                float f9 = OooO0O0 ? -(OooO0O03 + OooO00o2) : OooO00o2;
                                if (OooO00o3) {
                                    f8 = (-f8) - OooO0O03;
                                    f9 = (-f9) - OooO0O03;
                                }
                                float f10 = f8;
                                if (oooooo003.OooO0OO()) {
                                    f5 = OooO00o7;
                                    i3 = i5;
                                    list2 = OooO00o;
                                    oooooo002 = OooO00o6;
                                    f4 = OooO00o4;
                                    oooo0oo0 = oooo0oo02;
                                    z = OooO00o3;
                                    ooooo00o = OooO00o5;
                                    OooO00o(canvas, OooO00o8, (OooO00o7 >= 0.0f ? f10 : f9) + ((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o[i5 + 2], f7 + OooO00o4, oooooo003.OooO0Oo(i5 / 2));
                                } else {
                                    f5 = OooO00o7;
                                    i3 = i5;
                                    list2 = OooO00o;
                                    z = OooO00o3;
                                    oooooo002 = OooO00o6;
                                    ooooo00o = OooO00o5;
                                    f4 = OooO00o4;
                                    oooo0oo0 = oooo0oo02;
                                }
                                if (barEntry2.m19898OooO00o() != null && oooooo003.OooOo00()) {
                                    Drawable OooO00o9 = barEntry2.m19898OooO00o();
                                    float f11 = ((AbstractC8184oOOo0O) oooo0oo0).f21242OooO00o[i3 + 2];
                                    if (f5 < 0.0f) {
                                        f10 = f9;
                                    }
                                    AbstractC8352oOoOOoO0.OooO00o(canvas, OooO00o9, (int) (f11 + f10 + oooooo002.f21456OooO00o), (int) (f7 + oooooo002.OooO0O0), OooO00o9.getIntrinsicWidth(), OooO00o9.getIntrinsicHeight());
                                }
                            } else {
                                i3 = i5;
                                list2 = OooO00o;
                                z = OooO00o3;
                                f4 = OooO00o4;
                                oooooo002 = OooO00o6;
                                oooo0oo0 = oooo0oo02;
                                ooooo00o = OooO00o5;
                            }
                            i5 = i3 + 4;
                            OooO00o6 = oooooo002;
                            OooO00o5 = ooooo00o;
                            oooo0oo02 = oooo0oo0;
                            OooO00o4 = f4;
                            OooO00o = list2;
                            OooO00o3 = z;
                            f6 = 2.0f;
                        }
                        list = OooO00o;
                        oooooo00 = OooO00o6;
                    } else {
                        list = OooO00o;
                        oooooo00 = OooO00o6;
                        C8351oOoOOo0o OooO00o10 = ((C8306oOo0O00) this).f21405OooO00o.OooO00o(oooooo003.m19949OooO00o());
                        int i7 = 0;
                        int i8 = 0;
                        while (((float) i7) < ((float) oooooo003.OooO0Oo()) * ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO00o()) {
                            BarEntry barEntry3 = (BarEntry) oooooo003.m19951OooO00o(i7);
                            int OooO0Oo = oooooo003.OooO0Oo(i7);
                            float[] OooO00o11 = barEntry3.m15084OooO00o();
                            if (OooO00o11 != null) {
                                i = i7;
                                fArr = OooO00o11;
                                int length = fArr.length * 2;
                                float[] fArr4 = new float[length];
                                float f12 = -barEntry3.OooO0OO();
                                int i9 = 0;
                                int i10 = 0;
                                float f13 = 0.0f;
                                while (i9 < length) {
                                    float f14 = fArr[i10];
                                    if (f14 == 0.0f && (f13 == 0.0f || f12 == 0.0f)) {
                                        f12 = f14;
                                        f3 = f12;
                                    } else if (f14 >= 0.0f) {
                                        f13 += f14;
                                        f3 = f12;
                                        f12 = f13;
                                    } else {
                                        f3 = f12 - f14;
                                    }
                                    fArr4[i9] = f12 * OooO0O02;
                                    i9 += 2;
                                    i10++;
                                    f12 = f3;
                                }
                                OooO00o10.OooO0O0(fArr4);
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= length) {
                                        break;
                                    }
                                    float f15 = fArr[i11 / 2];
                                    String OooO00o12 = OooO00o5.OooO00o(f15, barEntry3, i4, ((AbstractC8328oOoOO0O) this).OooO00o);
                                    float OooO0O04 = (float) AbstractC8352oOoOOoO0.OooO0O0(this.OooO0Oo, OooO00o12);
                                    float f16 = OooO0O0 ? OooO00o2 : -(OooO0O04 + OooO00o2);
                                    float f17 = OooO0O0 ? -(OooO0O04 + OooO00o2) : OooO00o2;
                                    if (OooO00o3) {
                                        f16 = (-f16) - OooO0O04;
                                        f17 = (-f17) - OooO0O04;
                                    }
                                    boolean z2 = (f15 == 0.0f && f12 == 0.0f && f13 > 0.0f) || f15 < 0.0f;
                                    float f18 = fArr4[i11];
                                    if (z2) {
                                        f16 = f17;
                                    }
                                    float f19 = f18 + f16;
                                    float[] fArr5 = ((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o;
                                    float f20 = (fArr5[i8 + 1] + fArr5[i8 + 3]) / 2.0f;
                                    if (!((AbstractC8328oOoOO0O) this).OooO00o.m20042OooO0Oo(f20)) {
                                        break;
                                    }
                                    if (((AbstractC8328oOoOO0O) this).OooO00o.m20046OooO0o0(f19) && ((AbstractC8328oOoOO0O) this).OooO00o.m20032OooO00o(f20)) {
                                        if (oooooo003.OooO0OO()) {
                                            f = f20;
                                            i2 = i11;
                                            fArr2 = fArr4;
                                            f2 = f19;
                                            OooO00o(canvas, OooO00o12, f19, f20 + OooO00o4, OooO0Oo);
                                        } else {
                                            f = f20;
                                            i2 = i11;
                                            fArr2 = fArr4;
                                            f2 = f19;
                                        }
                                        if (barEntry3.m19898OooO00o() != null && oooooo003.OooOo00()) {
                                            Drawable OooO00o13 = barEntry3.m19898OooO00o();
                                            AbstractC8352oOoOOoO0.OooO00o(canvas, OooO00o13, (int) (f2 + oooooo00.f21456OooO00o), (int) (f + oooooo00.OooO0O0), OooO00o13.getIntrinsicWidth(), OooO00o13.getIntrinsicHeight());
                                        }
                                    } else {
                                        i2 = i11;
                                        fArr2 = fArr4;
                                    }
                                    i11 = i2 + 2;
                                    length = length;
                                    fArr4 = fArr2;
                                }
                            } else {
                                int i12 = i8 + 1;
                                if (!((AbstractC8328oOoOO0O) this).OooO00o.m20042OooO0Oo(((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o[i12])) {
                                    break;
                                } else if (((AbstractC8328oOoOO0O) this).OooO00o.m20046OooO0o0(((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o[i8]) && ((AbstractC8328oOoOO0O) this).OooO00o.m20032OooO00o(((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o[i12])) {
                                    String OooO00o14 = OooO00o5.OooO00o(barEntry3.OooO00o(), barEntry3, i4, ((AbstractC8328oOoOO0O) this).OooO00o);
                                    float OooO0O05 = (float) AbstractC8352oOoOOoO0.OooO0O0(this.OooO0Oo, OooO00o14);
                                    float f21 = OooO0O0 ? OooO00o2 : -(OooO0O05 + OooO00o2);
                                    float f22 = OooO0O0 ? -(OooO0O05 + OooO00o2) : OooO00o2;
                                    if (OooO00o3) {
                                        f21 = (-f21) - OooO0O05;
                                        f22 = (-f22) - OooO0O05;
                                    }
                                    float f23 = f21;
                                    if (oooooo003.OooO0OO()) {
                                        i = i7;
                                        fArr = OooO00o11;
                                        barEntry = barEntry3;
                                        OooO00o(canvas, OooO00o14, ((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o[i8 + 2] + (barEntry3.OooO00o() >= 0.0f ? f23 : f22), ((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o[i12] + OooO00o4, OooO0Oo);
                                    } else {
                                        barEntry = barEntry3;
                                        i = i7;
                                        fArr = OooO00o11;
                                    }
                                    if (barEntry.m19898OooO00o() != null && oooooo003.OooOo00()) {
                                        Drawable OooO00o15 = barEntry.m19898OooO00o();
                                        float f24 = ((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o[i8 + 2];
                                        if (barEntry.OooO00o() < 0.0f) {
                                            f23 = f22;
                                        }
                                        AbstractC8352oOoOOoO0.OooO00o(canvas, OooO00o15, (int) (f24 + f23 + oooooo00.f21456OooO00o), (int) (((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o[i12] + oooooo00.OooO0O0), OooO00o15.getIntrinsicWidth(), OooO00o15.getIntrinsicHeight());
                                    }
                                }
                            }
                            if (fArr == null) {
                                i8 += 4;
                            } else {
                                i8 += fArr.length * 4;
                            }
                            i7 = i + 1;
                        }
                    }
                    C8349oOoOOo00.m20016OooO00o(oooooo00);
                }
                i4++;
                OooO00o = list;
            }
        }
    }

    @Override // com.p118pd.sdk.C8306oOo0O00
    public void OooO00o(Canvas canvas, AbstractC8262oOOooo00 oooooo00, int i) {
        C8351oOoOOo0o OooO00o = ((C8306oOo0O00) this).f21405OooO00o.OooO00o(oooooo00.m19949OooO00o());
        this.OooO0o.setColor(oooooo00.OooO0oo());
        this.OooO0o.setStrokeWidth(AbstractC8352oOoOOoO0.OooO00o(oooooo00.OooOOO0()));
        boolean z = true;
        boolean z2 = oooooo00.OooOOO0() > 0.0f;
        float OooO00o2 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO00o();
        float OooO0O0 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
        if (((C8306oOo0O00) this).f21405OooO00o.OooO00o()) {
            this.OooO0o0.setColor(oooooo00.OooOOOo());
            float OooO0o0 = ((C8306oOo0O00) this).f21405OooO00o.getBarData().OooO0o0() / 2.0f;
            int min = Math.min((int) Math.ceil((double) (((float) oooooo00.OooO0Oo()) * OooO00o2)), oooooo00.OooO0Oo());
            for (int i2 = 0; i2 < min; i2++) {
                float OooO0O02 = ((BarEntry) oooooo00.m19951OooO00o(i2)).OooO0O0();
                RectF rectF = this.OooO0OO;
                rectF.top = OooO0O02 - OooO0o0;
                rectF.bottom = OooO0O02 + OooO0o0;
                OooO00o.OooO00o(rectF);
                if (((AbstractC8328oOoOO0O) this).OooO00o.m20042OooO0Oo(this.OooO0OO.bottom)) {
                    if (!((AbstractC8328oOoOO0O) this).OooO00o.m20032OooO00o(this.OooO0OO.top)) {
                        break;
                    }
                    this.OooO0OO.left = ((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO();
                    this.OooO0OO.right = ((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo();
                    canvas.drawRect(this.OooO0OO, this.OooO0o0);
                }
            }
        }
        C8189oOOo0OO0 oooo0oo0 = ((C8306oOo0O00) this).f21406OooO00o[i];
        oooo0oo0.OooO00o(OooO00o2, OooO0O0);
        oooo0oo0.OooO0OO(i);
        oooo0oo0.OooO00o(((C8306oOo0O00) this).f21405OooO00o.m19938OooO00o(oooooo00.m19949OooO00o()));
        oooo0oo0.OooO00o(((C8306oOo0O00) this).f21405OooO00o.getBarData().OooO0o0());
        oooo0oo0.OooO00o(oooooo00);
        OooO00o.OooO0O0(((AbstractC8184oOOo0O) oooo0oo0).f21242OooO00o);
        if (oooooo00.m19955OooO00o().size() != 1) {
            z = false;
        }
        if (z) {
            ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(oooooo00.m19965OooOOOO());
        }
        for (int i3 = 0; i3 < oooo0oo0.OooO00o(); i3 += 4) {
            int i4 = i3 + 3;
            if (((AbstractC8328oOoOO0O) this).OooO00o.m20042OooO0Oo(((AbstractC8184oOOo0O) oooo0oo0).f21242OooO00o[i4])) {
                int i5 = i3 + 1;
                if (((AbstractC8328oOoOO0O) this).OooO00o.m20032OooO00o(((AbstractC8184oOOo0O) oooo0oo0).f21242OooO00o[i5])) {
                    if (!z) {
                        ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(oooooo00.OooO00o(i3 / 4));
                    }
                    float[] fArr = ((AbstractC8184oOOo0O) oooo0oo0).f21242OooO00o;
                    int i6 = i3 + 2;
                    canvas.drawRect(fArr[i3], fArr[i5], fArr[i6], fArr[i4], ((AbstractC8321oOoO0ooO) this).OooO00o);
                    if (z2) {
                        float[] fArr2 = ((AbstractC8184oOOo0O) oooo0oo0).f21242OooO00o;
                        canvas.drawRect(fArr2[i3], fArr2[i5], fArr2[i6], fArr2[i4], this.OooO0o);
                    }
                }
            } else {
                return;
            }
        }
    }

    public void OooO00o(Canvas canvas, String str, float f, float f2, int i) {
        this.OooO0Oo.setColor(i);
        canvas.drawText(str, f, f2, this.OooO0Oo);
    }

    @Override // com.p118pd.sdk.C8306oOo0O00
    public void OooO00o(float f, float f2, float f3, float f4, C8351oOoOOo0o oooooo0o) {
        ((C8306oOo0O00) this).OooO00o.set(f2, f - f4, f3, f + f4);
        oooooo0o.OooO0O0(((C8306oOo0O00) this).OooO00o, ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0());
    }

    @Override // com.p118pd.sdk.C8306oOo0O00
    public void OooO00o(C8246oOOoo0oO ooooo0oo, RectF rectF) {
        ooooo0oo.OooO00o(rectF.centerY(), rectF.right);
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public boolean OooO00o(AbstractC8257oOOooOo0 ooooooo0) {
        return ((float) ooooooo0.getData().m19916OooO0O0()) < ((float) ooooooo0.getMaxVisibleCount()) * ((AbstractC8328oOoOO0O) this).OooO00o.OooOOO();
    }
}
