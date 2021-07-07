package com.facebook.react.animation;

import android.util.SparseArray;
import com.facebook.react.bridge.UiThreadUtil;

public class AnimationRegistry {
    public final SparseArray<Animation> mRegistry = new SparseArray<>();

    public Animation getAnimation(int i) {
        UiThreadUtil.assertOnUiThread();
        return this.mRegistry.get(i);
    }

    public void registerAnimation(Animation animation) {
        UiThreadUtil.assertOnUiThread();
        this.mRegistry.put(animation.getAnimationID(), animation);
    }

    public Animation removeAnimation(int i) {
        UiThreadUtil.assertOnUiThread();
        Animation animation = this.mRegistry.get(i);
        if (animation != null) {
            this.mRegistry.delete(i);
        }
        return animation;
    }
}
