package com.facebook.react.animation;

import android.view.View;

public class NoopAnimationPropertyUpdater implements AnimationPropertyUpdater {
    @Override // com.facebook.react.animation.AnimationPropertyUpdater
    public void onFinish(View view) {
    }

    @Override // com.facebook.react.animation.AnimationPropertyUpdater
    public void onUpdate(View view, float f) {
    }

    @Override // com.facebook.react.animation.AnimationPropertyUpdater
    public void prepare(View view) {
    }
}
