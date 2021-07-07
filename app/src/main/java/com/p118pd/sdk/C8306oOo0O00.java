package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BarEntry;
import java.util.List;

/* renamed from: com.pd.sdk.oOo0O00  reason: case insensitive filesystem */
public class C8306oOo0O00 extends AbstractC8308oOo0O00O {
    public RectF OooO00o = new RectF();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8248oOOooO f21405OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8189oOOo0OO0[] f21406OooO00o;
    public RectF OooO0O0 = new RectF();
    public Paint OooO0o;
    public Paint OooO0o0;

    public C8306oOo0O00(AbstractC8248oOOooO oooooo, C8185oOOo0O0 oooo0o0, C8353oOoOOoOO oooooooo) {
        super(oooo0o0, oooooooo);
        this.f21405OooO00o = oooooo;
        Paint paint = new Paint(1);
        super.OooO0O0 = paint;
        paint.setStyle(Paint.Style.FILL);
        super.OooO0O0.setColor(Color.rgb(0, 0, 0));
        super.OooO0O0.setAlpha(120);
        Paint paint2 = new Paint(1);
        this.OooO0o0 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint(1);
        this.OooO0o = paint3;
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO, com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o() {
        C8208oOOoO0Oo barData = this.f21405OooO00o.getBarData();
        this.f21406OooO00o = new C8189oOOo0OO0[barData.m19903OooO00o()];
        for (int i = 0; i < this.f21406OooO00o.length; i++) {
            AbstractC8262oOOooo00 oooooo00 = (AbstractC8262oOOooo00) barData.OooO00o(i);
            this.f21406OooO00o[i] = new C8189oOOo0OO0(oooooo00.OooO0Oo() * 4 * (oooooo00.m19941OooOOo() ? oooooo00.OooOOo() : 1), barData.m19903OooO00o(), oooooo00.m19941OooOOo());
        }
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO0O0(Canvas canvas) {
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO0OO(Canvas canvas) {
        float f;
        boolean z;
        List list;
        C8349oOoOOo00 oooooo00;
        int i;
        float f2;
        boolean z2;
        C8351oOoOOo0o oooooo0o;
        float[] fArr;
        float f3;
        int i2;
        float[] fArr2;
        int i3;
        float f4;
        float f5;
        float f6;
        int i4;
        List list2;
        C8349oOoOOo00 oooooo002;
        C8189oOOo0OO0 oooo0oo0;
        float f7;
        if (OooO00o(this.f21405OooO00o)) {
            List OooO00o2 = this.f21405OooO00o.getBarData().m19905OooO00o();
            float OooO00o3 = AbstractC8352oOoOOoO0.OooO00o(4.5f);
            boolean OooO0O02 = this.f21405OooO00o.OooO0O0();
            int i5 = 0;
            while (i5 < this.f21405OooO00o.getBarData().m19903OooO00o()) {
                AbstractC8262oOOooo00 oooooo003 = (AbstractC8262oOOooo00) OooO00o2.get(i5);
                if (!OooO00o((AbstractC8265oOOoooO0) oooooo003)) {
                    list = OooO00o2;
                    f = OooO00o3;
                    z = OooO0O02;
                } else {
                    OooO00o((AbstractC8265oOOoooO0) oooooo003);
                    boolean OooO00o4 = this.f21405OooO00o.m19938OooO00o(oooooo003.m19949OooO00o());
                    float OooO00o5 = (float) AbstractC8352oOoOOoO0.OooO00o(this.OooO0Oo, "8");
                    float f8 = OooO0O02 ? -OooO00o3 : OooO00o5 + OooO00o3;
                    float f9 = OooO0O02 ? OooO00o5 + OooO00o3 : -OooO00o3;
                    if (OooO00o4) {
                        f8 = (-f8) - OooO00o5;
                        f9 = (-f9) - OooO00o5;
                    }
                    C8189oOOo0OO0 oooo0oo02 = this.f21406OooO00o[i5];
                    float OooO0O03 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
                    C8349oOoOOo00 OooO00o6 = C8349oOoOOo00.OooO00o(oooooo003.m19953OooO00o());
                    OooO00o6.f21456OooO00o = AbstractC8352oOoOOoO0.OooO00o(OooO00o6.f21456OooO00o);
                    OooO00o6.OooO0O0 = AbstractC8352oOoOOoO0.OooO00o(OooO00o6.OooO0O0);
                    if (!oooooo003.m19941OooOOo()) {
                        int i6 = 0;
                        while (((float) i6) < ((float) ((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o.length) * ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO00o()) {
                            float[] fArr3 = ((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o;
                            float f10 = (fArr3[i6] + fArr3[i6 + 2]) / 2.0f;
                            if (!((AbstractC8328oOoOO0O) this).OooO00o.m20040OooO0OO(f10)) {
                                break;
                            }
                            int i7 = i6 + 1;
                            if (!((AbstractC8328oOoOO0O) this).OooO00o.m20044OooO0o(((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o[i7]) || !((AbstractC8328oOoOO0O) this).OooO00o.m20037OooO0O0(f10)) {
                                i4 = i6;
                                oooooo002 = OooO00o6;
                                list2 = OooO00o2;
                                oooo0oo0 = oooo0oo02;
                            } else {
                                int i8 = i6 / 4;
                                BarEntry barEntry = (BarEntry) oooooo003.m19951OooO00o(i8);
                                float OooO00o7 = barEntry.OooO00o();
                                if (oooooo003.OooO0OO()) {
                                    f7 = f10;
                                    i4 = i6;
                                    oooooo002 = OooO00o6;
                                    list2 = OooO00o2;
                                    oooo0oo0 = oooo0oo02;
                                    OooO00o(canvas, oooooo003.m19952OooO00o(), OooO00o7, barEntry, i5, f7, OooO00o7 >= 0.0f ? ((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o[i7] + f8 : ((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o[i6 + 3] + f9, oooooo003.OooO0Oo(i8));
                                } else {
                                    f7 = f10;
                                    i4 = i6;
                                    oooooo002 = OooO00o6;
                                    list2 = OooO00o2;
                                    oooo0oo0 = oooo0oo02;
                                }
                                if (barEntry.m19898OooO00o() != null && oooooo003.OooOo00()) {
                                    Drawable OooO00o8 = barEntry.m19898OooO00o();
                                    AbstractC8352oOoOOoO0.OooO00o(canvas, OooO00o8, (int) (f7 + oooooo002.f21456OooO00o), (int) ((OooO00o7 >= 0.0f ? ((AbstractC8184oOOo0O) oooo0oo0).f21242OooO00o[i7] + f8 : ((AbstractC8184oOOo0O) oooo0oo0).f21242OooO00o[i4 + 3] + f9) + oooooo002.OooO0O0), OooO00o8.getIntrinsicWidth(), OooO00o8.getIntrinsicHeight());
                                }
                            }
                            i6 = i4 + 4;
                            oooo0oo02 = oooo0oo0;
                            OooO00o6 = oooooo002;
                            OooO00o2 = list2;
                        }
                        oooooo00 = OooO00o6;
                        list = OooO00o2;
                    } else {
                        oooooo00 = OooO00o6;
                        list = OooO00o2;
                        C8351oOoOOo0o OooO00o9 = this.f21405OooO00o.OooO00o(oooooo003.m19949OooO00o());
                        int i9 = 0;
                        int i10 = 0;
                        while (((float) i9) < ((float) oooooo003.OooO0Oo()) * ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO00o()) {
                            BarEntry barEntry2 = (BarEntry) oooooo003.m19951OooO00o(i9);
                            float[] OooO00o10 = barEntry2.m15084OooO00o();
                            float[] fArr4 = ((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o;
                            float f11 = (fArr4[i10] + fArr4[i10 + 2]) / 2.0f;
                            int OooO0Oo = oooooo003.OooO0Oo(i9);
                            if (OooO00o10 != null) {
                                i = i9;
                                f2 = OooO00o3;
                                z2 = OooO0O02;
                                fArr = OooO00o10;
                                oooooo0o = OooO00o9;
                                float f12 = f11;
                                int length = fArr.length * 2;
                                float[] fArr5 = new float[length];
                                float f13 = -barEntry2.OooO0OO();
                                int i11 = 0;
                                int i12 = 0;
                                float f14 = 0.0f;
                                while (i11 < length) {
                                    float f15 = fArr[i12];
                                    if (f15 == 0.0f && (f14 == 0.0f || f13 == 0.0f)) {
                                        f13 = f15;
                                        f5 = f13;
                                    } else if (f15 >= 0.0f) {
                                        f14 += f15;
                                        f5 = f13;
                                        f13 = f14;
                                    } else {
                                        f5 = f13 - f15;
                                    }
                                    fArr5[i11 + 1] = f13 * OooO0O03;
                                    i11 += 2;
                                    i12++;
                                    f13 = f5;
                                }
                                oooooo0o.OooO0O0(fArr5);
                                int i13 = 0;
                                while (i13 < length) {
                                    int i14 = i13 / 2;
                                    float f16 = fArr[i14];
                                    float f17 = fArr5[i13 + 1] + (((f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1)) == 0 && (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1)) == 0 && (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1)) > 0) || (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1)) < 0 ? f9 : f8);
                                    if (!((AbstractC8328oOoOO0O) this).OooO00o.m20040OooO0OO(f12)) {
                                        break;
                                    }
                                    if (!((AbstractC8328oOoOO0O) this).OooO00o.m20044OooO0o(f17) || !((AbstractC8328oOoOO0O) this).OooO00o.m20037OooO0O0(f12)) {
                                        i3 = i13;
                                        fArr2 = fArr5;
                                        i2 = length;
                                        f3 = f12;
                                    } else {
                                        if (oooooo003.OooO0OO()) {
                                            f4 = f17;
                                            i3 = i13;
                                            fArr2 = fArr5;
                                            i2 = length;
                                            f3 = f12;
                                            OooO00o(canvas, oooooo003.m19952OooO00o(), fArr[i14], barEntry2, i5, f12, f4, OooO0Oo);
                                        } else {
                                            f4 = f17;
                                            i3 = i13;
                                            fArr2 = fArr5;
                                            i2 = length;
                                            f3 = f12;
                                        }
                                        if (barEntry2.m19898OooO00o() != null && oooooo003.OooOo00()) {
                                            Drawable OooO00o11 = barEntry2.m19898OooO00o();
                                            AbstractC8352oOoOOoO0.OooO00o(canvas, OooO00o11, (int) (f3 + oooooo00.f21456OooO00o), (int) (f4 + oooooo00.OooO0O0), OooO00o11.getIntrinsicWidth(), OooO00o11.getIntrinsicHeight());
                                        }
                                    }
                                    i13 = i3 + 2;
                                    fArr5 = fArr2;
                                    length = i2;
                                    f12 = f3;
                                }
                            } else if (!((AbstractC8328oOoOO0O) this).OooO00o.m20040OooO0OO(f11)) {
                                break;
                            } else {
                                int i15 = i10 + 1;
                                if (!((AbstractC8328oOoOO0O) this).OooO00o.m20044OooO0o(((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o[i15]) || !((AbstractC8328oOoOO0O) this).OooO00o.m20037OooO0O0(f11)) {
                                    OooO00o9 = OooO00o9;
                                    OooO0O02 = OooO0O02;
                                    OooO00o3 = OooO00o3;
                                    i9 = i9;
                                } else {
                                    if (oooooo003.OooO0OO()) {
                                        f6 = f11;
                                        f2 = OooO00o3;
                                        fArr = OooO00o10;
                                        i = i9;
                                        z2 = OooO0O02;
                                        oooooo0o = OooO00o9;
                                        OooO00o(canvas, oooooo003.m19952OooO00o(), barEntry2.OooO00o(), barEntry2, i5, f6, ((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o[i15] + (barEntry2.OooO00o() >= 0.0f ? f8 : f9), OooO0Oo);
                                    } else {
                                        f6 = f11;
                                        i = i9;
                                        f2 = OooO00o3;
                                        z2 = OooO0O02;
                                        fArr = OooO00o10;
                                        oooooo0o = OooO00o9;
                                    }
                                    if (barEntry2.m19898OooO00o() != null && oooooo003.OooOo00()) {
                                        Drawable OooO00o12 = barEntry2.m19898OooO00o();
                                        AbstractC8352oOoOOoO0.OooO00o(canvas, OooO00o12, (int) (f6 + oooooo00.f21456OooO00o), (int) (((AbstractC8184oOOo0O) oooo0oo02).f21242OooO00o[i15] + (barEntry2.OooO00o() >= 0.0f ? f8 : f9) + oooooo00.OooO0O0), OooO00o12.getIntrinsicWidth(), OooO00o12.getIntrinsicHeight());
                                    }
                                }
                            }
                            if (fArr == null) {
                                i10 += 4;
                            } else {
                                i10 += fArr.length * 4;
                            }
                            i9 = i + 1;
                            OooO00o9 = oooooo0o;
                            OooO0O02 = z2;
                            OooO00o3 = f2;
                        }
                    }
                    f = OooO00o3;
                    z = OooO0O02;
                    C8349oOoOOo00.m20016OooO00o(oooooo00);
                }
                i5++;
                OooO00o2 = list;
                OooO0O02 = z;
                OooO00o3 = f;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o(Canvas canvas) {
        C8208oOOoO0Oo barData = this.f21405OooO00o.getBarData();
        for (int i = 0; i < barData.m19903OooO00o(); i++) {
            AbstractC8262oOOooo00 oooooo00 = (AbstractC8262oOOooo00) barData.OooO00o(i);
            if (oooooo00.isVisible()) {
                OooO00o(canvas, oooooo00, i);
            }
        }
    }

    public void OooO00o(Canvas canvas, AbstractC8262oOOooo00 oooooo00, int i) {
        C8351oOoOOo0o OooO00o2 = this.f21405OooO00o.OooO00o(oooooo00.m19949OooO00o());
        this.OooO0o.setColor(oooooo00.OooO0oo());
        this.OooO0o.setStrokeWidth(AbstractC8352oOoOOoO0.OooO00o(oooooo00.OooOOO0()));
        boolean z = true;
        boolean z2 = oooooo00.OooOOO0() > 0.0f;
        float OooO00o3 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO00o();
        float OooO0O02 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
        if (this.f21405OooO00o.OooO00o()) {
            this.OooO0o0.setColor(oooooo00.OooOOOo());
            float OooO0o02 = this.f21405OooO00o.getBarData().OooO0o0() / 2.0f;
            int min = Math.min((int) Math.ceil((double) (((float) oooooo00.OooO0Oo()) * OooO00o3)), oooooo00.OooO0Oo());
            for (int i2 = 0; i2 < min; i2++) {
                float OooO0O03 = ((BarEntry) oooooo00.m19951OooO00o(i2)).OooO0O0();
                RectF rectF = this.OooO0O0;
                rectF.left = OooO0O03 - OooO0o02;
                rectF.right = OooO0O03 + OooO0o02;
                OooO00o2.OooO00o(rectF);
                if (((AbstractC8328oOoOO0O) this).OooO00o.m20037OooO0O0(this.OooO0O0.right)) {
                    if (!((AbstractC8328oOoOO0O) this).OooO00o.m20040OooO0OO(this.OooO0O0.left)) {
                        break;
                    }
                    this.OooO0O0.top = ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0();
                    this.OooO0O0.bottom = ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o();
                    canvas.drawRect(this.OooO0O0, this.OooO0o0);
                }
            }
        }
        C8189oOOo0OO0 oooo0oo0 = this.f21406OooO00o[i];
        oooo0oo0.OooO00o(OooO00o3, OooO0O02);
        oooo0oo0.OooO0OO(i);
        oooo0oo0.OooO00o(this.f21405OooO00o.m19938OooO00o(oooooo00.m19949OooO00o()));
        oooo0oo0.OooO00o(this.f21405OooO00o.getBarData().OooO0o0());
        oooo0oo0.OooO00o(oooooo00);
        OooO00o2.OooO0O0(((AbstractC8184oOOo0O) oooo0oo0).f21242OooO00o);
        if (oooooo00.m19955OooO00o().size() != 1) {
            z = false;
        }
        if (z) {
            ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(oooooo00.m19965OooOOOO());
        }
        for (int i3 = 0; i3 < oooo0oo0.OooO00o(); i3 += 4) {
            int i4 = i3 + 2;
            if (((AbstractC8328oOoOO0O) this).OooO00o.m20037OooO0O0(((AbstractC8184oOOo0O) oooo0oo0).f21242OooO00o[i4])) {
                if (((AbstractC8328oOoOO0O) this).OooO00o.m20040OooO0OO(((AbstractC8184oOOo0O) oooo0oo0).f21242OooO00o[i3])) {
                    if (!z) {
                        ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(oooooo00.OooO00o(i3 / 4));
                    }
                    float[] fArr = ((AbstractC8184oOOo0O) oooo0oo0).f21242OooO00o;
                    int i5 = i3 + 1;
                    int i6 = i3 + 3;
                    canvas.drawRect(fArr[i3], fArr[i5], fArr[i4], fArr[i6], ((AbstractC8321oOoO0ooO) this).OooO00o);
                    if (z2) {
                        float[] fArr2 = ((AbstractC8184oOOo0O) oooo0oo0).f21242OooO00o;
                        canvas.drawRect(fArr2[i3], fArr2[i5], fArr2[i4], fArr2[i6], this.OooO0o);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void OooO00o(float f, float f2, float f3, float f4, C8351oOoOOo0o oooooo0o) {
        this.OooO00o.set(f - f4, f2, f + f4, f3);
        oooooo0o.OooO00o(this.OooO00o, ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0());
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o(Canvas canvas, C8246oOOoo0oO[] ooooo0ooArr) {
        float f;
        float f2;
        C8208oOOoO0Oo barData = this.f21405OooO00o.getBarData();
        for (C8246oOOoo0oO ooooo0oo : ooooo0ooArr) {
            AbstractC8262oOOooo00 oooooo00 = (AbstractC8262oOOooo00) barData.OooO00o(ooooo0oo.m19936OooO0O0());
            if (oooooo00 != null && oooooo00.OooO0O0()) {
                BarEntry barEntry = (BarEntry) oooooo00.OooO00o(ooooo0oo.OooO0OO(), ooooo0oo.OooO0o0());
                if (OooO00o(barEntry, oooooo00)) {
                    C8351oOoOOo0o OooO00o2 = this.f21405OooO00o.OooO00o(oooooo00.m19949OooO00o());
                    super.OooO0O0.setColor(oooooo00.OooO00o());
                    super.OooO0O0.setAlpha(oooooo00.OooOOoo());
                    if (!(ooooo0oo.m19937OooO0OO() >= 0 && barEntry.m15083OooO00o())) {
                        f2 = barEntry.OooO00o();
                        f = 0.0f;
                    } else if (this.f21405OooO00o.OooO0OO()) {
                        float OooO0Oo = barEntry.OooO0Oo();
                        f = -barEntry.OooO0OO();
                        f2 = OooO0Oo;
                    } else {
                        C8252oOOooO0o oooooo0o = barEntry.m15085OooO00o()[ooooo0oo.m19937OooO0OO()];
                        f2 = oooooo0o.OooO00o;
                        f = oooooo0o.OooO0O0;
                    }
                    OooO00o(barEntry.OooO0O0(), f2, f, barData.OooO0o0() / 2.0f, OooO00o2);
                    OooO00o(ooooo0oo, this.OooO00o);
                    canvas.drawRect(this.OooO00o, super.OooO0O0);
                }
            }
        }
    }

    public void OooO00o(C8246oOOoo0oO ooooo0oo, RectF rectF) {
        ooooo0oo.OooO00o(rectF.centerX(), rectF.top);
    }
}
