package com.facebook.react.animation;

import android.view.View;

public class PositionAnimationPairPropertyUpdater extends AbstractFloatPairPropertyUpdater {
    public PositionAnimationPairPropertyUpdater(float f, float f2) {
        super(f, f2);
    }

    @Override // com.facebook.react.animation.AbstractFloatPairPropertyUpdater
    public void getProperty(View view, float[] fArr) {
        fArr[0] = view.getX() + (((float) view.getWidth()) * 0.5f);
        fArr[1] = view.getY() + (((float) view.getHeight()) * 0.5f);
    }

    @Override // com.facebook.react.animation.AbstractFloatPairPropertyUpdater
    public void setProperty(View view, float[] fArr) {
        view.setX(fArr[0] - (((float) view.getWidth()) * 0.5f));
        view.setY(fArr[1] - (((float) view.getHeight()) * 0.5f));
    }

    public PositionAnimationPairPropertyUpdater(float f, float f2, float f3, float f4) {
        super(f, f2, f3, f4);
    }
}
