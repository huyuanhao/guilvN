package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: com.pd.sdk.oOoOOOO0  reason: case insensitive filesystem */
public class C8341oOoOOOO0 implements AbstractC8339oOoOOO0o {
    public Path OooO00o = new Path();

    @Override // com.p118pd.sdk.AbstractC8339oOoOOO0o
    public void OooO00o(Canvas canvas, AbstractC8270oOOooooO oooooooo, C8353oOoOOoOO oooooooo2, float f, float f2, Paint paint) {
        float OooOOo = oooooooo.OooOOo();
        float f3 = OooOOo / 2.0f;
        float OooO00o2 = (OooOOo - (AbstractC8352oOoOOoO0.OooO00o(oooooooo.OooO0O0()) * 2.0f)) / 2.0f;
        int OooOOo0 = oooooooo.OooOOo0();
        paint.setStyle(Paint.Style.FILL);
        Path path = this.OooO00o;
        path.reset();
        float f4 = f2 - f3;
        path.moveTo(f, f4);
        float f5 = f + f3;
        float f6 = f2 + f3;
        path.lineTo(f5, f6);
        float f7 = f - f3;
        path.lineTo(f7, f6);
        double d = (double) OooOOo;
        if (d > AbstractC8352oOoOOoO0.OooO0O0) {
            path.lineTo(f, f4);
            float f8 = f7 + OooO00o2;
            float f9 = f6 - OooO00o2;
            path.moveTo(f8, f9);
            path.lineTo(f5 - OooO00o2, f9);
            path.lineTo(f, f4 + OooO00o2);
            path.lineTo(f8, f9);
        }
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
        if (d > AbstractC8352oOoOOoO0.OooO0O0 && OooOOo0 != 1122867) {
            paint.setColor(OooOOo0);
            path.moveTo(f, f4 + OooO00o2);
            float f10 = f6 - OooO00o2;
            path.lineTo(f5 - OooO00o2, f10);
            path.lineTo(f7 + OooO00o2, f10);
            path.close();
            canvas.drawPath(path, paint);
            path.reset();
        }
    }
}
