package com.facebook.react.animation;

import android.view.View;
import com.facebook.infer.annotation.Assertions;
import javax.annotation.Nullable;

public abstract class Animation {
    @Nullable
    public View mAnimatedView;
    public final int mAnimationID;
    @Nullable
    public AnimationListener mAnimationListener;
    public volatile boolean mCancelled = false;
    public volatile boolean mIsFinished = false;
    public final AnimationPropertyUpdater mPropertyUpdater;

    public Animation(int i, AnimationPropertyUpdater animationPropertyUpdater) {
        this.mAnimationID = i;
        this.mPropertyUpdater = animationPropertyUpdater;
    }

    public final void cancel() {
        if (!this.mIsFinished && !this.mCancelled) {
            this.mCancelled = true;
            AnimationListener animationListener = this.mAnimationListener;
            if (animationListener != null) {
                animationListener.onCancel();
            }
        }
    }

    public final void finish() {
        Assertions.assertCondition(!this.mIsFinished, "Animation must not already be finished!");
        this.mIsFinished = true;
        if (!this.mCancelled) {
            View view = this.mAnimatedView;
            if (view != null) {
                this.mPropertyUpdater.onFinish(view);
            }
            AnimationListener animationListener = this.mAnimationListener;
            if (animationListener != null) {
                animationListener.onFinished();
            }
        }
    }

    public int getAnimationID() {
        return this.mAnimationID;
    }

    public final boolean onUpdate(float f) {
        Assertions.assertCondition(!this.mIsFinished, "Animation must not already be finished!");
        if (!this.mCancelled) {
            this.mPropertyUpdater.onUpdate((View) Assertions.assertNotNull(this.mAnimatedView), f);
        }
        return !this.mCancelled;
    }

    public abstract void run();

    public void setAnimationListener(AnimationListener animationListener) {
        this.mAnimationListener = animationListener;
    }

    public final void start(View view) {
        this.mAnimatedView = view;
        this.mPropertyUpdater.prepare(view);
        run();
    }
}
