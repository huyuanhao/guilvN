package com.facebook.react.animated;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

public abstract class AnimationDriver {
    public ValueAnimatedNode mAnimatedValue;
    public Callback mEndCallback;
    public boolean mHasFinished = false;
    public int mId;

    public void resetConfig(ReadableMap readableMap) {
        throw new JSApplicationCausedNativeException("Animation config for " + getClass().getSimpleName() + " cannot be reset");
    }

    public abstract void runAnimationStep(long j);
}
