package com.qiyukf.basesdk.p138c.p140b.p141a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;

/* renamed from: com.qiyukf.basesdk.c.b.a.c */
public final class C1822c implements LeadingMarginSpan {

    /* renamed from: a */
    public final String f3371a;

    /* renamed from: b */
    public final int f3372b;

    public C1822c(TextPaint textPaint, int i) {
        String concat = Integer.toString(i).concat(". ");
        this.f3371a = concat;
        this.f3372b = (int) textPaint.measureText(concat);
    }

    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            canvas.drawText(this.f3371a, (float) i, (float) i4, paint);
        }
    }

    public final int getLeadingMargin(boolean z) {
        return this.f3372b;
    }
}
