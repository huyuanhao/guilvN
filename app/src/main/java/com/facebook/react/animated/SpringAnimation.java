package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;

public class SpringAnimation extends AnimationDriver {
    public static final double MAX_DELTA_TIME_SEC = 0.064d;
    public static final double SOLVER_TIMESTEP_SEC = 0.001d;
    public int mCurrentLoop;
    public final PhysicsState mCurrentState;
    public double mDisplacementFromRestThreshold;
    public double mEndValue;
    public double mInitialVelocity;
    public int mIterations;
    public long mLastTime;
    public double mOriginalValue;
    public boolean mOvershootClampingEnabled;
    public double mRestSpeedThreshold;
    public double mSpringDamping;
    public double mSpringMass;
    public boolean mSpringStarted;
    public double mSpringStiffness;
    public double mStartValue;
    public double mTimeAccumulator;

    public static class PhysicsState {
        public double position;
        public double velocity;

        public PhysicsState() {
        }
    }

    public SpringAnimation(ReadableMap readableMap) {
        PhysicsState physicsState = new PhysicsState();
        this.mCurrentState = physicsState;
        physicsState.velocity = readableMap.getDouble("initialVelocity");
        resetConfig(readableMap);
    }

    private void advance(double d) {
        double d2;
        double d3;
        if (!isAtRest()) {
            double d4 = 0.064d;
            if (d <= 0.064d) {
                d4 = d;
            }
            this.mTimeAccumulator += d4;
            double d5 = this.mSpringDamping;
            double d6 = this.mSpringMass;
            double d7 = this.mSpringStiffness;
            double d8 = -this.mInitialVelocity;
            double sqrt = d5 / (Math.sqrt(d7 * d6) * 2.0d);
            double sqrt2 = Math.sqrt(d7 / d6);
            double sqrt3 = Math.sqrt(1.0d - (sqrt * sqrt)) * sqrt2;
            double d9 = this.mEndValue - this.mStartValue;
            double d10 = this.mTimeAccumulator;
            if (sqrt < 1.0d) {
                double exp = Math.exp((-sqrt) * sqrt2 * d10);
                double d11 = sqrt * sqrt2;
                double d12 = d8 + (d11 * d9);
                double d13 = d10 * sqrt3;
                d2 = this.mEndValue - ((((d12 / sqrt3) * Math.sin(d13)) + (Math.cos(d13) * d9)) * exp);
                d3 = ((d11 * exp) * (((Math.sin(d13) * d12) / sqrt3) + (Math.cos(d13) * d9))) - (((Math.cos(d13) * d12) - ((sqrt3 * d9) * Math.sin(d13))) * exp);
            } else {
                double exp2 = Math.exp((-sqrt2) * d10);
                double d14 = this.mEndValue - (((((sqrt2 * d9) + d8) * d10) + d9) * exp2);
                d3 = exp2 * ((d8 * ((d10 * sqrt2) - 1.0d)) + (d10 * d9 * sqrt2 * sqrt2));
                d2 = d14;
            }
            PhysicsState physicsState = this.mCurrentState;
            physicsState.position = d2;
            physicsState.velocity = d3;
            if (isAtRest() || (this.mOvershootClampingEnabled && isOvershooting())) {
                if (this.mSpringStiffness > AbstractC8352oOoOOoO0.OooO0O0) {
                    double d15 = this.mEndValue;
                    this.mStartValue = d15;
                    this.mCurrentState.position = d15;
                } else {
                    double d16 = this.mCurrentState.position;
                    this.mEndValue = d16;
                    this.mStartValue = d16;
                }
                this.mCurrentState.velocity = AbstractC8352oOoOOoO0.OooO0O0;
            }
        }
    }

    private double getDisplacementDistanceForState(PhysicsState physicsState) {
        return Math.abs(this.mEndValue - physicsState.position);
    }

    private boolean isAtRest() {
        return Math.abs(this.mCurrentState.velocity) <= this.mRestSpeedThreshold && (getDisplacementDistanceForState(this.mCurrentState) <= this.mDisplacementFromRestThreshold || this.mSpringStiffness == AbstractC8352oOoOOoO0.OooO0O0);
    }

    private boolean isOvershooting() {
        if (this.mSpringStiffness > AbstractC8352oOoOOoO0.OooO0O0) {
            double d = this.mStartValue;
            double d2 = this.mEndValue;
            if (d >= d2 || this.mCurrentState.position <= d2) {
                double d3 = this.mStartValue;
                double d4 = this.mEndValue;
                if (d3 <= d4 || this.mCurrentState.position >= d4) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void resetConfig(ReadableMap readableMap) {
        this.mSpringStiffness = readableMap.getDouble("stiffness");
        this.mSpringDamping = readableMap.getDouble("damping");
        this.mSpringMass = readableMap.getDouble("mass");
        this.mInitialVelocity = this.mCurrentState.velocity;
        this.mEndValue = readableMap.getDouble("toValue");
        this.mRestSpeedThreshold = readableMap.getDouble("restSpeedThreshold");
        this.mDisplacementFromRestThreshold = readableMap.getDouble("restDisplacementThreshold");
        this.mOvershootClampingEnabled = readableMap.getBoolean("overshootClamping");
        boolean z = true;
        int i = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.mIterations = i;
        if (i != 0) {
            z = false;
        }
        this.mHasFinished = z;
        this.mCurrentLoop = 0;
        this.mTimeAccumulator = AbstractC8352oOoOOoO0.OooO0O0;
        this.mSpringStarted = false;
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void runAnimationStep(long j) {
        long j2 = j / 1000000;
        if (!this.mSpringStarted) {
            if (this.mCurrentLoop == 0) {
                this.mOriginalValue = this.mAnimatedValue.mValue;
                this.mCurrentLoop = 1;
            }
            PhysicsState physicsState = this.mCurrentState;
            double d = this.mAnimatedValue.mValue;
            physicsState.position = d;
            this.mStartValue = d;
            this.mLastTime = j2;
            this.mTimeAccumulator = AbstractC8352oOoOOoO0.OooO0O0;
            this.mSpringStarted = true;
        }
        double d2 = (double) (j2 - this.mLastTime);
        Double.isNaN(d2);
        advance(d2 / 1000.0d);
        this.mLastTime = j2;
        this.mAnimatedValue.mValue = this.mCurrentState.position;
        if (isAtRest()) {
            int i = this.mIterations;
            if (i == -1 || this.mCurrentLoop < i) {
                this.mSpringStarted = false;
                this.mAnimatedValue.mValue = this.mOriginalValue;
                this.mCurrentLoop++;
                return;
            }
            this.mHasFinished = true;
        }
    }
}
