package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.pd.sdk.oOoOOO0O  reason: case insensitive filesystem */
public class C8338oOoOOO0O implements AbstractC8339oOoOOO0o {
    @Override // com.p118pd.sdk.AbstractC8339oOoOOO0o
    public void OooO00o(Canvas canvas, AbstractC8270oOOooooO oooooooo, C8353oOoOOoOO oooooooo2, float f, float f2, Paint paint) {
        float OooOOo = oooooooo.OooOOo() / 2.0f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AbstractC8352oOoOOoO0.OooO00o(1.0f));
        canvas.drawLine(f - OooOOo, f2, f + OooOOo, f2, paint);
        canvas.drawLine(f, f2 - OooOOo, f, f2 + OooOOo, paint);
    }
}
