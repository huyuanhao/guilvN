package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.pd.sdk.oOoOOO  reason: case insensitive filesystem */
public class C8335oOoOOO implements AbstractC8339oOoOOO0o {
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
            float f6 = f - OooO00o;
            float f7 = f2 - OooO00o;
            float f8 = f + OooO00o;
            float f9 = f2 + OooO00o;
            canvas.drawRect(f6 - f5, f7 - f5, f8 + f5, f9 + f5, paint);
            if (OooOOo0 != 1122867) {
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(OooOOo0);
                canvas.drawRect(f6, f7, f8, f9, paint);
                return;
            }
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f - f3, f2 - f3, f + f3, f2 + f3, paint);
    }
}
