package com.facebook.react.animation;

import android.view.View;

public class OpacityAnimationPropertyUpdater extends AbstractSingleFloatProperyUpdater {
    public OpacityAnimationPropertyUpdater(float f) {
        super(f);
    }

    @Override // com.facebook.react.animation.AbstractSingleFloatProperyUpdater
    public float getProperty(View view) {
        return view.getAlpha();
    }

    @Override // com.facebook.react.animation.AbstractSingleFloatProperyUpdater
    public void setProperty(View view, float f) {
        view.setAlpha(f);
    }

    public OpacityAnimationPropertyUpdater(float f, float f2) {
        super(f, f2);
    }
}
