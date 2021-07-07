package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.p118pd.sdk.C8404oOoo0O00;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class AbstractLayoutAnimation {
    public static final Map<InterpolatorType, BaseInterpolator> INTERPOLATOR = MapBuilder.m949of(InterpolatorType.LINEAR, new LinearInterpolator(), InterpolatorType.EASE_IN, new AccelerateInterpolator(), InterpolatorType.EASE_OUT, new DecelerateInterpolator(), InterpolatorType.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator());
    public static final boolean SLOWDOWN_ANIMATION_MODE = false;
    @Nullable
    public AnimatedPropertyType mAnimatedProperty;
    public int mDelayMs;
    public int mDurationMs;
    @Nullable
    public Interpolator mInterpolator;

    public static Interpolator getInterpolator(InterpolatorType interpolatorType, ReadableMap readableMap) {
        BaseInterpolator baseInterpolator;
        if (interpolatorType.equals(InterpolatorType.SPRING)) {
            baseInterpolator = new SimpleSpringInterpolator(SimpleSpringInterpolator.getSpringDamping(readableMap));
        } else {
            baseInterpolator = INTERPOLATOR.get(interpolatorType);
        }
        if (baseInterpolator != null) {
            return baseInterpolator;
        }
        throw new IllegalArgumentException("Missing interpolator for type : " + interpolatorType);
    }

    @Nullable
    public final Animation createAnimation(View view, int i, int i2, int i3, int i4) {
        if (!isValid()) {
            return null;
        }
        Animation createAnimationImpl = createAnimationImpl(view, i, i2, i3, i4);
        if (createAnimationImpl != null) {
            createAnimationImpl.setDuration((long) (this.mDurationMs * 1));
            createAnimationImpl.setStartOffset((long) (this.mDelayMs * 1));
            createAnimationImpl.setInterpolator(this.mInterpolator);
        }
        return createAnimationImpl;
    }

    @Nullable
    public abstract Animation createAnimationImpl(View view, int i, int i2, int i3, int i4);

    public void initializeFromConfig(ReadableMap readableMap, int i) {
        this.mAnimatedProperty = readableMap.hasKey(C8404oOoo0O00.OooOO0) ? AnimatedPropertyType.fromString(readableMap.getString(C8404oOoo0O00.OooOO0)) : null;
        if (readableMap.hasKey("duration")) {
            i = readableMap.getInt("duration");
        }
        this.mDurationMs = i;
        this.mDelayMs = readableMap.hasKey("delay") ? readableMap.getInt("delay") : 0;
        if (readableMap.hasKey("type")) {
            this.mInterpolator = getInterpolator(InterpolatorType.fromString(readableMap.getString("type")), readableMap);
            if (!isValid()) {
                throw new IllegalViewOperationException("Invalid layout animation : " + readableMap);
            }
            return;
        }
        throw new IllegalArgumentException("Missing interpolation type.");
    }

    public abstract boolean isValid();

    public void reset() {
        this.mAnimatedProperty = null;
        this.mDurationMs = 0;
        this.mDelayMs = 0;
        this.mInterpolator = null;
    }
}
