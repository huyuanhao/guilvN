package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.pd.sdk.oOoOOO0  reason: case insensitive filesystem */
public class C8336oOoOOO0 implements AbstractC8339oOoOOO0o {
    @Override // com.p118pd.sdk.AbstractC8339oOoOOO0o
    public void OooO00o(Canvas canvas, AbstractC8270oOOooooO oooooooo, C8353oOoOOoOO oooooooo2, float f, float f2, Paint paint) {
        float OooOOo = oooooooo.OooOOo();
        float f3 = OooOOo / 2.0f;
        float OooO00o = AbstractC8352oOoOOoO0.OooO00o(oooooooo.OooO0O0());
        float f4 = (OooOOo - (OooO00o * 2.0f)) / 2.0f;
        float f5 = f4 / 2.0f;
        int OooOOo0 = oooooooo.OooOOo0();
        if (((double) OooOOo) > AbstractC8352oOoOOoO0.OooO0O0) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(f4);
            canvas.drawCircle(f, f2, f5 + OooO00o, paint);
            if (OooOOo0 != 1122867) {
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(OooOOo0);
                canvas.drawCircle(f, f2, OooO00o, paint);
                return;
            }
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(f, f2, f3, paint);
    }
}
