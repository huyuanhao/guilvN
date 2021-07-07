package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.app.FrameMetricsAggregator;
import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1299b;
import java.util.List;

/* renamed from: com.pd.sdk.oOoOOoO0  reason: case insensitive filesystem */
public abstract class AbstractC8352oOoOOoO0 {
    public static final double OooO00o = 0.017453292519943295d;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final float f21464OooO00o = 0.017453292f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static int f21465OooO00o = 50;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Paint.FontMetrics f21466OooO00o = new Paint.FontMetrics();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Rect f21467OooO00o = new Rect();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static DisplayMetrics f21468OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static AbstractC8239oOOoo00O f21469OooO00o = m20021OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f21470OooO00o = {1, 10, 100, 1000, 10000, 100000, FrameMetricsAggregator.OooO00o.OooO0O0, 10000000, 100000000, 1000000000};
    public static final double OooO0O0 = Double.longBitsToDouble(1);

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final float f21471OooO0O0 = Float.intBitsToFloat(1);

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static int f21472OooO0O0 = 8000;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static Paint.FontMetrics f21473OooO0O0 = new Paint.FontMetrics();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static Rect f21474OooO0O0 = new Rect();
    public static Rect OooO0OO = new Rect();
    public static Rect OooO0Oo = new Rect();

    public static void OooO00o(Context context) {
        if (context == null) {
            f21465OooO00o = ViewConfiguration.getMinimumFlingVelocity();
            f21472OooO0O0 = ViewConfiguration.getMaximumFlingVelocity();
            return;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        f21465OooO00o = viewConfiguration.getScaledMinimumFlingVelocity();
        f21472OooO0O0 = viewConfiguration.getScaledMaximumFlingVelocity();
        f21468OooO00o = context.getResources().getDisplayMetrics();
    }

    public static float OooO0O0(float f) {
        DisplayMetrics displayMetrics = f21468OooO00o;
        if (displayMetrics == null) {
            return f;
        }
        return f / displayMetrics.density;
    }

    public static float OooO0OO(float f) {
        while (f < 0.0f) {
            f += 360.0f;
        }
        return f % 360.0f;
    }

    public static int OooO0OO() {
        return Build.VERSION.SDK_INT;
    }

    public static int OooO0O0(Paint paint, String str) {
        return (int) paint.measureText(str);
    }

    public static float OooO0O0(Paint paint) {
        return OooO0O0(paint, f21466OooO00o);
    }

    public static float OooO0O0(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static AbstractC8239oOOoo00O m20024OooO0O0() {
        return f21469OooO00o;
    }

    @Deprecated
    public static void OooO00o(Resources resources) {
        f21468OooO00o = resources.getDisplayMetrics();
        f21465OooO00o = ViewConfiguration.getMinimumFlingVelocity();
        f21472OooO0O0 = ViewConfiguration.getMaximumFlingVelocity();
    }

    public static int OooO0O0() {
        return f21465OooO00o;
    }

    public static C8344oOoOOOo OooO0O0(C8344oOoOOOo ooooooo, float f) {
        return OooO0O0(ooooooo.f21450OooO00o, ooooooo.OooO0O0, f);
    }

    public static C8344oOoOOOo OooO0O0(float f, float f2, float f3) {
        double d = (double) f3;
        return C8344oOoOOOo.OooO00o(Math.abs(((float) Math.cos(d)) * f) + Math.abs(((float) Math.sin(d)) * f2), Math.abs(f * ((float) Math.sin(d))) + Math.abs(f2 * ((float) Math.cos(d))));
    }

    public static float OooO00o(float f) {
        DisplayMetrics displayMetrics = f21468OooO00o;
        if (displayMetrics == null) {
            return f;
        }
        return f * displayMetrics.density;
    }

    public static int OooO00o(Paint paint, String str) {
        Rect rect = f21467OooO00o;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static float OooO00o(Paint paint) {
        return OooO00o(paint, f21466OooO00o);
    }

    public static float OooO00o(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return fontMetrics.descent - fontMetrics.ascent;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C8344oOoOOOo m20022OooO00o(Paint paint, String str) {
        C8344oOoOOOo OooO00o2 = C8344oOoOOOo.OooO00o(0.0f, 0.0f);
        OooO00o(paint, str, OooO00o2);
        return OooO00o2;
    }

    public static void OooO00o(Paint paint, String str, C8344oOoOOOo ooooooo) {
        Rect rect = f21474OooO0O0;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        ooooooo.f21450OooO00o = (float) rect.width();
        ooooooo.OooO0O0 = (float) rect.height();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static AbstractC8239oOOoo00O m20021OooO00o() {
        return new C8234oOOoOooO(1);
    }

    public static String OooO00o(float f, int i, boolean z) {
        return OooO00o(f, i, z, '.');
    }

    public static String OooO00o(float f, int i, boolean z, char c) {
        boolean z2;
        float f2 = f;
        char[] cArr = new char[35];
        if (f2 == 0.0f) {
            return "0";
        }
        int i2 = 0;
        boolean z3 = f2 < 1.0f && f2 > -1.0f;
        if (f2 < 0.0f) {
            f2 = -f2;
            z2 = true;
        } else {
            z2 = false;
        }
        int[] iArr = f21470OooO00o;
        int length = i > iArr.length ? iArr.length - 1 : i;
        long round = (long) Math.round(f2 * ((float) f21470OooO00o[length]));
        int i3 = 34;
        long j = round;
        boolean z4 = false;
        while (true) {
            if (j == 0 && i2 >= length + 1) {
                break;
            }
            int i4 = (int) (j % 10);
            j /= 10;
            int i5 = i3 - 1;
            cArr[i3] = (char) (i4 + 48);
            i2++;
            if (i2 == length) {
                i3 = i5 - 1;
                cArr[i5] = AbstractC1299b.COMMA;
                i2++;
                z4 = true;
            } else {
                if (z && j != 0 && i2 > length) {
                    if (z4) {
                        if ((i2 - length) % 4 == 0) {
                            i3 = i5 - 1;
                            cArr[i5] = c;
                        }
                    } else if ((i2 - length) % 4 == 3) {
                        i3 = i5 - 1;
                        cArr[i5] = c;
                    }
                    i2++;
                }
                i3 = i5;
            }
        }
        if (z3) {
            cArr[i3] = '0';
            i2++;
            i3--;
        }
        if (z2) {
            cArr[i3] = '-';
            i2++;
        }
        int i6 = 35 - i2;
        return String.valueOf(cArr, i6, 35 - i6);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static float m20019OooO00o(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d) || d == OooO0O0) {
            return 0.0f;
        }
        float pow = (float) Math.pow(10.0d, (double) (1 - ((int) ((float) Math.ceil((double) ((float) Math.log10(d < OooO0O0 ? -d : d)))))));
        double d2 = (double) pow;
        Double.isNaN(d2);
        return ((float) Math.round(d * d2)) / pow;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int m20020OooO00o(float f) {
        float OooO00o2 = m20019OooO00o((double) f);
        if (Float.isInfinite(OooO00o2)) {
            return 0;
        }
        return ((int) Math.ceil(-Math.log10((double) OooO00o2))) + 2;
    }

    public static int[] OooO00o(List<Integer> list) {
        int[] iArr = new int[list.size()];
        OooO00o(list, iArr);
        return iArr;
    }

    public static void OooO00o(List<Integer> list, int[] iArr) {
        int length = iArr.length < list.size() ? iArr.length : list.size();
        for (int i = 0; i < length; i++) {
            iArr[i] = list.get(i).intValue();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String[] m20023OooO00o(List<String> list) {
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = list.get(i);
        }
        return strArr;
    }

    public static void OooO00o(List<String> list, String[] strArr) {
        int length = strArr.length < list.size() ? strArr.length : list.size();
        for (int i = 0; i < length; i++) {
            strArr[i] = list.get(i);
        }
    }

    public static double OooO00o(double d) {
        if (d == Double.POSITIVE_INFINITY) {
            return d;
        }
        double d2 = d + OooO0O0;
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d2) + (d2 >= OooO0O0 ? 1 : -1));
    }

    public static C8349oOoOOo00 OooO00o(C8349oOoOOo00 oooooo00, float f, float f2) {
        C8349oOoOOo00 OooO00o2 = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
        OooO00o(oooooo00, f, f2, OooO00o2);
        return OooO00o2;
    }

    public static void OooO00o(C8349oOoOOo00 oooooo00, float f, float f2, C8349oOoOOo00 oooooo002) {
        double d = (double) oooooo00.f21456OooO00o;
        double d2 = (double) f;
        double d3 = (double) f2;
        double cos = Math.cos(Math.toRadians(d3));
        Double.isNaN(d2);
        Double.isNaN(d);
        oooooo002.f21456OooO00o = (float) (d + (cos * d2));
        double d4 = (double) oooooo00.OooO0O0;
        double sin = Math.sin(Math.toRadians(d3));
        Double.isNaN(d2);
        Double.isNaN(d4);
        oooooo002.OooO0O0 = (float) (d4 + (d2 * sin));
    }

    public static void OooO00o(MotionEvent motionEvent, VelocityTracker velocityTracker) {
        velocityTracker.computeCurrentVelocity(1000, (float) f21472OooO0O0);
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float xVelocity = velocityTracker.getXVelocity(pointerId);
        float yVelocity = velocityTracker.getYVelocity(pointerId);
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            if (i != actionIndex) {
                int pointerId2 = motionEvent.getPointerId(i);
                if ((velocityTracker.getXVelocity(pointerId2) * xVelocity) + (velocityTracker.getYVelocity(pointerId2) * yVelocity) < 0.0f) {
                    velocityTracker.clear();
                    return;
                }
            }
        }
    }

    @SuppressLint({"NewApi"})
    public static void OooO00o(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidateDelayed(10);
        }
    }

    public static int OooO00o() {
        return f21472OooO0O0;
    }

    public static void OooO00o(Canvas canvas, Drawable drawable, int i, int i2, int i3, int i4) {
        C8349oOoOOo00 OooO00o2 = C8349oOoOOo00.OooO00o();
        OooO00o2.f21456OooO00o = (float) (i - (i3 / 2));
        OooO00o2.OooO0O0 = (float) (i2 - (i4 / 2));
        drawable.copyBounds(OooO0OO);
        Rect rect = OooO0OO;
        int i5 = rect.left;
        int i6 = rect.top;
        drawable.setBounds(i5, i6, i5 + i3, i3 + i6);
        int save = canvas.save();
        canvas.translate(OooO00o2.f21456OooO00o, OooO00o2.OooO0O0);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    public static void OooO00o(Canvas canvas, String str, float f, float f2, Paint paint, C8349oOoOOo00 oooooo00, float f3) {
        float fontMetrics = paint.getFontMetrics(f21473OooO0O0);
        paint.getTextBounds(str, 0, str.length(), OooO0Oo);
        float f4 = 0.0f - ((float) OooO0Oo.left);
        float f5 = (-f21473OooO0O0.ascent) + 0.0f;
        Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (f3 != 0.0f) {
            float width = f4 - (((float) OooO0Oo.width()) * 0.5f);
            float f6 = f5 - (fontMetrics * 0.5f);
            if (!(oooooo00.f21456OooO00o == 0.5f && oooooo00.OooO0O0 == 0.5f)) {
                C8344oOoOOOo OooO00o2 = OooO00o((float) OooO0Oo.width(), fontMetrics, f3);
                f -= OooO00o2.f21450OooO00o * (oooooo00.f21456OooO00o - 0.5f);
                f2 -= OooO00o2.OooO0O0 * (oooooo00.OooO0O0 - 0.5f);
                C8344oOoOOOo.OooO00o(OooO00o2);
            }
            canvas.save();
            canvas.translate(f, f2);
            canvas.rotate(f3);
            canvas.drawText(str, width, f6, paint);
            canvas.restore();
        } else {
            if (!(oooooo00.f21456OooO00o == 0.0f && oooooo00.OooO0O0 == 0.0f)) {
                f4 -= ((float) OooO0Oo.width()) * oooooo00.f21456OooO00o;
                f5 -= fontMetrics * oooooo00.OooO0O0;
            }
            canvas.drawText(str, f4 + f, f5 + f2, paint);
        }
        paint.setTextAlign(textAlign);
    }

    public static void OooO00o(Canvas canvas, StaticLayout staticLayout, float f, float f2, TextPaint textPaint, C8349oOoOOo00 oooooo00, float f3) {
        float fontMetrics = textPaint.getFontMetrics(f21473OooO0O0);
        float width = (float) staticLayout.getWidth();
        float lineCount = ((float) staticLayout.getLineCount()) * fontMetrics;
        float f4 = 0.0f - ((float) OooO0Oo.left);
        float f5 = lineCount + 0.0f;
        Paint.Align textAlign = textPaint.getTextAlign();
        textPaint.setTextAlign(Paint.Align.LEFT);
        if (f3 != 0.0f) {
            float f6 = f4 - (width * 0.5f);
            float f7 = f5 - (lineCount * 0.5f);
            if (!(oooooo00.f21456OooO00o == 0.5f && oooooo00.OooO0O0 == 0.5f)) {
                C8344oOoOOOo OooO00o2 = OooO00o(width, lineCount, f3);
                f -= OooO00o2.f21450OooO00o * (oooooo00.f21456OooO00o - 0.5f);
                f2 -= OooO00o2.OooO0O0 * (oooooo00.OooO0O0 - 0.5f);
                C8344oOoOOOo.OooO00o(OooO00o2);
            }
            canvas.save();
            canvas.translate(f, f2);
            canvas.rotate(f3);
            canvas.translate(f6, f7);
            staticLayout.draw(canvas);
            canvas.restore();
        } else {
            if (!(oooooo00.f21456OooO00o == 0.0f && oooooo00.OooO0O0 == 0.0f)) {
                f4 -= width * oooooo00.f21456OooO00o;
                f5 -= lineCount * oooooo00.OooO0O0;
            }
            canvas.save();
            canvas.translate(f4 + f, f5 + f2);
            staticLayout.draw(canvas);
            canvas.restore();
        }
        textPaint.setTextAlign(textAlign);
    }

    public static void OooO00o(Canvas canvas, String str, float f, float f2, TextPaint textPaint, C8344oOoOOOo ooooooo, C8349oOoOOo00 oooooo00, float f3) {
        OooO00o(canvas, new StaticLayout(str, 0, str.length(), textPaint, (int) Math.max(Math.ceil((double) ooooooo.f21450OooO00o), 1.0d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false), f, f2, textPaint, oooooo00, f3);
    }

    public static C8344oOoOOOo OooO00o(C8344oOoOOOo ooooooo, float f) {
        return OooO0O0(ooooooo.f21450OooO00o, ooooooo.OooO0O0, f * 0.017453292f);
    }

    public static C8344oOoOOOo OooO00o(float f, float f2, float f3) {
        return OooO0O0(f, f2, f3 * 0.017453292f);
    }
}
