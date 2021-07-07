package com.tencent.bugly.beta.p267ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.tencent.bugly.beta.global.C3222a;
import com.tencent.bugly.beta.global.C3226e;
import com.tencent.bugly.beta.global.View$OnTouchListenerC3224c;
import com.tencent.bugly.proguard.C3321an;

/* renamed from: com.tencent.bugly.beta.ui.d */
public class ViewTreeObserver$OnPreDrawListenerC3240d implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final int f7450a;

    /* renamed from: b */
    public final Object[] f7451b;

    /* renamed from: c */
    public long f7452c;

    /* renamed from: d */
    public StringBuilder f7453d;

    public ViewTreeObserver$OnPreDrawListenerC3240d(int i, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("loading");
        this.f7453d = sb;
        this.f7450a = i;
        this.f7451b = objArr;
    }

    public boolean onPreDraw() {
        int i;
        int i2;
        try {
            int i3 = this.f7450a;
            if (i3 == 1) {
                C3244h hVar = (C3244h) this.f7451b[0];
                TextView textView = (TextView) this.f7451b[1];
                Bitmap bitmap = (Bitmap) this.f7451b[2];
                int intValue = ((Integer) this.f7451b[3]).intValue();
                int measuredWidth = textView.getMeasuredWidth();
                double d = (double) measuredWidth;
                Double.isNaN(d);
                int i4 = (int) (d * 0.42857142857142855d);
                textView.setHeight(i4);
                if (hVar.f7471u == null) {
                    if (intValue == 2) {
                        hVar.f7471u = C3222a.m7755a(bitmap, measuredWidth, i4, (float) C3222a.m7752a(C3226e.f7357E.f7406s, 6.0f));
                    } else {
                        hVar.f7471u = C3222a.m7755a(bitmap, measuredWidth, i4, (float) C3222a.m7752a(C3226e.f7357E.f7406s, 0.0f));
                    }
                    if (hVar.f7471u != null) {
                        textView.setText("");
                        textView.setBackgroundDrawable(hVar.f7471u);
                        textView.getViewTreeObserver().removeOnPreDrawListener(this);
                        return true;
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f7452c <= 300) {
                    return true;
                }
                this.f7452c = currentTimeMillis;
                if (this.f7453d.length() > 9) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("loading");
                    this.f7453d = sb;
                } else {
                    this.f7453d.append(C9058ooOoOoOO.OooOO0);
                }
                textView.setText(this.f7453d.toString());
                return true;
            } else if (i3 != 2) {
                if (i3 != 3) {
                    return false;
                }
                ViewGroup viewGroup = (ViewGroup) this.f7451b[0];
                if (viewGroup.getMeasuredHeight() > C3222a.m7752a((Context) this.f7451b[1], 158.0f)) {
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    layoutParams.height = C3222a.m7752a((Context) this.f7451b[1], 200.0f);
                    viewGroup.setLayoutParams(layoutParams);
                }
                return true;
            } else if (((Integer) this.f7451b[2]).intValue() <= 0) {
                return true;
            } else {
                int intValue2 = ((Integer) this.f7451b[0]).intValue();
                TextView textView2 = (TextView) this.f7451b[1];
                int measuredWidth2 = textView2.getMeasuredWidth();
                int measuredHeight = textView2.getMeasuredHeight();
                int i5 = (int) (((float) (C3226e.f7357E.f7360B.widthPixels * C3226e.f7357E.f7360B.heightPixels)) * 0.4f);
                if (measuredWidth2 == 0 || measuredHeight == 0 || measuredWidth2 * measuredHeight > i5) {
                    return true;
                }
                this.f7451b[2] = 0;
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.FILL);
                paint.setAntiAlias(true);
                if (intValue2 == 2) {
                    i2 = 8;
                    i = 7;
                } else {
                    i2 = 0;
                    i = 0;
                }
                paint.setColor(-3355444);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth2, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                float f = (float) measuredWidth2;
                float f2 = (float) measuredHeight;
                RectF rectF = new RectF(0.0f, 0.0f, f, f2);
                float f3 = (float) i2;
                canvas.drawRoundRect(rectF, f3, f3, paint);
                paint.setColor(-1);
                float f4 = (float) i;
                canvas.drawRoundRect(new RectF(2.0f, 2.0f, f - 2.0f, f2 - 2.0f), f4, f4, paint);
                paint.setColor(-3355444);
                Bitmap createBitmap2 = Bitmap.createBitmap(measuredWidth2, measuredHeight, Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap2).drawRoundRect(rectF, f3, f3, paint);
                BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(createBitmap2);
                textView2.setBackgroundDrawable(bitmapDrawable);
                textView2.setOnTouchListener(new View$OnTouchListenerC3224c(1, bitmapDrawable2, bitmapDrawable));
                return true;
            }
        } catch (Exception e) {
            if (!C3321an.m8353b(e)) {
                e.printStackTrace();
            }
            return false;
        }
    }
}
