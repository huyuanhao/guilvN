package com.facebook.react.animation;

import android.view.View;

public class ScaleYAnimationPropertyUpdater extends AbstractSingleFloatProperyUpdater {
    public ScaleYAnimationPropertyUpdater(float f) {
        super(f);
    }

    @Override // com.facebook.react.animation.AbstractSingleFloatProperyUpdater
    public float getProperty(View view) {
        return view.getScaleY();
    }

    @Override // com.facebook.react.animation.AbstractSingleFloatProperyUpdater
    public void setProperty(View view, float f) {
        view.setScaleY(f);
    }

    public ScaleYAnimationPropertyUpdater(float f, float f2) {
        super(f, f2);
    }
}
