package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.pd.sdk.oOoOOOO  reason: case insensitive filesystem */
public class C8340oOoOOOO implements AbstractC8339oOoOOO0o {
    @Override // com.p118pd.sdk.AbstractC8339oOoOOO0o
    public void OooO00o(Canvas canvas, AbstractC8270oOOooooO oooooooo, C8353oOoOOoOO oooooooo2, float f, float f2, Paint paint) {
        float OooOOo = oooooooo.OooOOo() / 2.0f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AbstractC8352oOoOOoO0.OooO00o(1.0f));
        float f3 = f - OooOOo;
        float f4 = f2 - OooOOo;
        float f5 = f + OooOOo;
        float f6 = OooOOo + f2;
        canvas.drawLine(f3, f4, f5, f6, paint);
        canvas.drawLine(f5, f4, f3, f6, paint);
    }
}
