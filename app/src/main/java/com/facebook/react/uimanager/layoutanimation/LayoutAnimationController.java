package com.facebook.react.uimanager.layoutanimation;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public class LayoutAnimationController {
    public static final boolean ENABLED = true;
    public final AbstractLayoutAnimation mLayoutCreateAnimation = new LayoutCreateAnimation();
    public final AbstractLayoutAnimation mLayoutDeleteAnimation = new LayoutDeleteAnimation();
    public final SparseArray<LayoutHandlingAnimation> mLayoutHandlers = new SparseArray<>(0);
    public final AbstractLayoutAnimation mLayoutUpdateAnimation = new LayoutUpdateAnimation();
    public boolean mShouldAnimateLayout;

    private void disableUserInteractions(View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                disableUserInteractions(viewGroup.getChildAt(i));
            }
        }
    }

    public void applyLayoutUpdate(View view, int i, int i2, int i3, int i4) {
        UiThreadUtil.assertOnUiThread();
        final int id = view.getId();
        LayoutHandlingAnimation layoutHandlingAnimation = this.mLayoutHandlers.get(id);
        if (layoutHandlingAnimation != null) {
            layoutHandlingAnimation.onLayoutUpdate(i, i2, i3, i4);
            return;
        }
        Animation createAnimation = ((view.getWidth() == 0 || view.getHeight() == 0) ? this.mLayoutCreateAnimation : this.mLayoutUpdateAnimation).createAnimation(view, i, i2, i3, i4);
        if (createAnimation instanceof LayoutHandlingAnimation) {
            createAnimation.setAnimationListener(new Animation.AnimationListener() {
                /* class com.facebook.react.uimanager.layoutanimation.LayoutAnimationController.animationAnimation$AnimationListenerC08601 */

                public void onAnimationEnd(Animation animation) {
                    LayoutAnimationController.this.mLayoutHandlers.remove(id);
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                    LayoutAnimationController.this.mLayoutHandlers.put(id, (LayoutHandlingAnimation) animation);
                }
            });
        } else {
            view.layout(i, i2, i3 + i, i4 + i2);
        }
        if (createAnimation != null) {
            view.startAnimation(createAnimation);
        }
    }

    public void deleteView(View view, final LayoutAnimationListener layoutAnimationListener) {
        UiThreadUtil.assertOnUiThread();
        Animation createAnimation = this.mLayoutDeleteAnimation.createAnimation(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (createAnimation != null) {
            disableUserInteractions(view);
            createAnimation.setAnimationListener(new Animation.AnimationListener() {
                /* class com.facebook.react.uimanager.layoutanimation.LayoutAnimationController.animationAnimation$AnimationListenerC08612 */

                public void onAnimationEnd(Animation animation) {
                    layoutAnimationListener.onAnimationEnd();
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }
            });
            view.startAnimation(createAnimation);
            return;
        }
        layoutAnimationListener.onAnimationEnd();
    }

    public void initializeFromConfig(@Nullable ReadableMap readableMap) {
        if (readableMap == null) {
            reset();
            return;
        }
        int i = 0;
        this.mShouldAnimateLayout = false;
        if (readableMap.hasKey("duration")) {
            i = readableMap.getInt("duration");
        }
        if (readableMap.hasKey(LayoutAnimationType.toString(LayoutAnimationType.CREATE))) {
            this.mLayoutCreateAnimation.initializeFromConfig(readableMap.getMap(LayoutAnimationType.toString(LayoutAnimationType.CREATE)), i);
            this.mShouldAnimateLayout = true;
        }
        if (readableMap.hasKey(LayoutAnimationType.toString(LayoutAnimationType.UPDATE))) {
            this.mLayoutUpdateAnimation.initializeFromConfig(readableMap.getMap(LayoutAnimationType.toString(LayoutAnimationType.UPDATE)), i);
            this.mShouldAnimateLayout = true;
        }
        if (readableMap.hasKey(LayoutAnimationType.toString(LayoutAnimationType.DELETE))) {
            this.mLayoutDeleteAnimation.initializeFromConfig(readableMap.getMap(LayoutAnimationType.toString(LayoutAnimationType.DELETE)), i);
            this.mShouldAnimateLayout = true;
        }
    }

    public void reset() {
        this.mLayoutCreateAnimation.reset();
        this.mLayoutUpdateAnimation.reset();
        this.mLayoutDeleteAnimation.reset();
        this.mShouldAnimateLayout = false;
    }

    public boolean shouldAnimateLayout(View view) {
        return (this.mShouldAnimateLayout && view.getParent() != null) || this.mLayoutHandlers.get(view.getId()) != null;
    }
}
