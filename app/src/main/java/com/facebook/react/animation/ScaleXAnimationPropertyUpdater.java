package com.facebook.react.animation;

import android.view.View;

public class ScaleXAnimationPropertyUpdater extends AbstractSingleFloatProperyUpdater {
    public ScaleXAnimationPropertyUpdater(float f) {
        super(f);
    }

    @Override // com.facebook.react.animation.AbstractSingleFloatProperyUpdater
    public float getProperty(View view) {
        return view.getScaleX();
    }

    @Override // com.facebook.react.animation.AbstractSingleFloatProperyUpdater
    public void setProperty(View view, float f) {
        view.setScaleX(f);
    }

    public ScaleXAnimationPropertyUpdater(float f, float f2) {
        super(f, f2);
    }
}
