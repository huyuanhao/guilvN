package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.Path;

/* renamed from: com.pd.sdk.oOoOO00O  reason: case insensitive filesystem */
public abstract class AbstractC8326oOoOO00O extends AbstractC8308oOo0O00O {
    public Path OooO00o = new Path();

    public AbstractC8326oOoOO00O(C8185oOOo0O0 oooo0o0, C8353oOoOOoOO oooooooo) {
        super(oooo0o0, oooooooo);
    }

    public void OooO00o(Canvas canvas, float f, float f2, AbstractC8267oOOoooOo oooooooo) {
        this.OooO0O0.setColor(oooooooo.OooO00o());
        this.OooO0O0.setStrokeWidth(oooooooo.OooOO0O());
        this.OooO0O0.setPathEffect(oooooooo.OooO0OO());
        if (oooooooo.m19967OooOO0O()) {
            this.OooO00o.reset();
            this.OooO00o.moveTo(f, ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0());
            this.OooO00o.lineTo(f, ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o());
            canvas.drawPath(this.OooO00o, this.OooO0O0);
        }
        if (oooooooo.OooOOOo()) {
            this.OooO00o.reset();
            this.OooO00o.moveTo(((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO(), f2);
            this.OooO00o.lineTo(((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo(), f2);
            canvas.drawPath(this.OooO00o, this.OooO0O0);
        }
    }
}
