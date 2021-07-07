package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;

public class FrameBasedAnimationDriver extends AnimationDriver {
    public static final double FRAME_TIME_MILLIS = 16.666666666666668d;
    public int mCurrentLoop;
    public double[] mFrames;
    public double mFromValue;
    public int mIterations;
    public long mStartFrameTimeNanos;
    public double mToValue;

    public FrameBasedAnimationDriver(ReadableMap readableMap) {
        resetConfig(readableMap);
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void resetConfig(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("frames");
        int size = array.size();
        double[] dArr = this.mFrames;
        if (dArr == null || dArr.length != size) {
            this.mFrames = new double[size];
        }
        boolean z = false;
        for (int i = 0; i < size; i++) {
            this.mFrames[i] = array.getDouble(i);
        }
        this.mToValue = readableMap.hasKey("toValue") ? readableMap.getDouble("toValue") : AbstractC8352oOoOOoO0.OooO0O0;
        int i2 = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.mIterations = i2;
        this.mCurrentLoop = 1;
        if (i2 == 0) {
            z = true;
        }
        this.mHasFinished = z;
        this.mStartFrameTimeNanos = -1;
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void runAnimationStep(long j) {
        double d;
        if (this.mStartFrameTimeNanos < 0) {
            this.mStartFrameTimeNanos = j;
            if (this.mCurrentLoop == 1) {
                this.mFromValue = this.mAnimatedValue.mValue;
            }
        }
        double d2 = (double) ((j - this.mStartFrameTimeNanos) / 1000000);
        Double.isNaN(d2);
        int round = (int) Math.round(d2 / 16.666666666666668d);
        if (round < 0) {
            throw new IllegalStateException("Calculated frame index should never be lower than 0");
        } else if (!this.mHasFinished) {
            double[] dArr = this.mFrames;
            if (round >= dArr.length - 1) {
                d = this.mToValue;
                int i = this.mIterations;
                if (i == -1 || this.mCurrentLoop < i) {
                    this.mStartFrameTimeNanos = -1;
                    this.mCurrentLoop++;
                } else {
                    this.mHasFinished = true;
                }
            } else {
                double d3 = this.mFromValue;
                d = d3 + (dArr[round] * (this.mToValue - d3));
            }
            this.mAnimatedValue.mValue = d;
        }
    }
}
