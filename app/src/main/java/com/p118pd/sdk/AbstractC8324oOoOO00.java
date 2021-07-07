package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* renamed from: com.pd.sdk.oOoOO00  reason: case insensitive filesystem */
public abstract class AbstractC8324oOoOO00 extends AbstractC8326oOoOO00O {
    public AbstractC8324oOoOO00(C8185oOOo0O0 oooo0o0, C8353oOoOOoOO oooooooo) {
        super(oooo0o0, oooooooo);
    }

    public void OooO00o(Canvas canvas, Path path, Drawable drawable) {
        if (OooO00o()) {
            int save = canvas.save();
            canvas.clipPath(path);
            drawable.setBounds((int) ((AbstractC8328oOoOO0O) this).OooO00o.OooO0OO(), (int) ((AbstractC8328oOoOO0O) this).OooO00o.OooO0o0(), (int) ((AbstractC8328oOoOO0O) this).OooO00o.OooO0Oo(), (int) ((AbstractC8328oOoOO0O) this).OooO00o.OooO00o());
            drawable.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        throw new RuntimeException("Fill-drawables not (yet) supported below API level 18, this code was run on API level " + AbstractC8352oOoOOoO0.OooO0OO() + C9058ooOoOoOO.OooOO0);
    }

    public void OooO00o(Canvas canvas, Path path, int i, int i2) {
        int i3 = (i & 16777215) | (i2 << 24);
        if (OooO00o()) {
            int save = canvas.save();
            canvas.clipPath(path);
            canvas.drawColor(i3);
            canvas.restoreToCount(save);
            return;
        }
        Paint.Style style = ((AbstractC8321oOoO0ooO) this).OooO00o.getStyle();
        int color = ((AbstractC8321oOoO0ooO) this).OooO00o.getColor();
        ((AbstractC8321oOoO0ooO) this).OooO00o.setStyle(Paint.Style.FILL);
        ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(i3);
        canvas.drawPath(path, ((AbstractC8321oOoO0ooO) this).OooO00o);
        ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(color);
        ((AbstractC8321oOoO0ooO) this).OooO00o.setStyle(style);
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO, com.p118pd.sdk.AbstractC8321oOoO0ooO
    private boolean OooO00o() {
        return AbstractC8352oOoOOoO0.OooO0OO() >= 18;
    }
}
