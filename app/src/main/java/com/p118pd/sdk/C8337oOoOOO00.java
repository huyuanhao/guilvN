package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.pd.sdk.oOoOOO00  reason: case insensitive filesystem */
public class C8337oOoOOO00 implements AbstractC8339oOoOOO0o {
    @Override // com.p118pd.sdk.AbstractC8339oOoOOO0o
    public void OooO00o(Canvas canvas, AbstractC8270oOOooooO oooooooo, C8353oOoOOoOO oooooooo2, float f, float f2, Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AbstractC8352oOoOOoO0.OooO00o(1.0f));
        float OooOOo = (oooooooo.OooOOo() / 2.0f) * 2.0f;
        float f3 = f2 - OooOOo;
        canvas.drawLine(f, f3, f + OooOOo, f2, paint);
        canvas.drawLine(f, f3, f - OooOOo, f2, paint);
    }
}
