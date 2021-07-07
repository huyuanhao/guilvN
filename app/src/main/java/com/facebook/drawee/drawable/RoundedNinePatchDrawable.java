package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;

public class RoundedNinePatchDrawable extends RoundedDrawable {
    public RoundedNinePatchDrawable(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // com.facebook.drawee.drawable.RoundedDrawable
    public void draw(Canvas canvas) {
        if (!shouldRound()) {
            super.draw(canvas);
            return;
        }
        updateTransform();
        updatePath();
        canvas.clipPath(this.mPath);
        super.draw(canvas);
    }
}
