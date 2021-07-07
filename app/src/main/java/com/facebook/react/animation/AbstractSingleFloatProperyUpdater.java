package com.facebook.react.animation;

import android.view.View;

public abstract class AbstractSingleFloatProperyUpdater implements AnimationPropertyUpdater {
    public boolean mFromSource = true;
    public float mFromValue;
    public float mToValue;

    public AbstractSingleFloatProperyUpdater(float f) {
        this.mToValue = f;
    }

    public abstract float getProperty(View view);

    @Override // com.facebook.react.animation.AnimationPropertyUpdater
    public void onFinish(View view) {
        setProperty(view, this.mToValue);
    }

    @Override // com.facebook.react.animation.AnimationPropertyUpdater
    public final void onUpdate(View view, float f) {
        float f2 = this.mFromValue;
        setProperty(view, f2 + ((this.mToValue - f2) * f));
    }

    @Override // com.facebook.react.animation.AnimationPropertyUpdater
    public final void prepare(View view) {
        if (this.mFromSource) {
            this.mFromValue = getProperty(view);
        }
    }

    public abstract void setProperty(View view, float f);

    public AbstractSingleFloatProperyUpdater(float f, float f2) {
        this(f2);
        this.mFromValue = f;
    }
}
