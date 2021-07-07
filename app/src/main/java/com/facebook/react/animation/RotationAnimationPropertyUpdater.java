package com.facebook.react.animation;

import android.view.View;

public class RotationAnimationPropertyUpdater extends AbstractSingleFloatProperyUpdater {
    public RotationAnimationPropertyUpdater(float f) {
        super(f);
    }

    @Override // com.facebook.react.animation.AbstractSingleFloatProperyUpdater
    public float getProperty(View view) {
        return view.getRotation();
    }

    @Override // com.facebook.react.animation.AbstractSingleFloatProperyUpdater
    public void setProperty(View view, float f) {
        view.setRotation((float) Math.toDegrees((double) f));
    }
}
