package com.facebook.react.animation;

public class ImmediateAnimation extends Animation {
    public ImmediateAnimation(int i, AnimationPropertyUpdater animationPropertyUpdater) {
        super(i, animationPropertyUpdater);
    }

    @Override // com.facebook.react.animation.Animation
    public void run() {
        onUpdate(1.0f);
        finish();
    }
}
