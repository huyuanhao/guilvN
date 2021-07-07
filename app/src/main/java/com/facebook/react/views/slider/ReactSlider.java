package com.facebook.react.views.slider;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.p118pd.sdk.C8510oo000o;
import javax.annotation.Nullable;

public class ReactSlider extends C8510oo000o {
    public static int DEFAULT_TOTAL_STEPS = 128;
    public double mMaxValue = AbstractC8352oOoOOoO0.OooO0O0;
    public double mMinValue = AbstractC8352oOoOOoO0.OooO0O0;
    public double mStep = AbstractC8352oOoOOoO0.OooO0O0;
    public double mStepCalculated = AbstractC8352oOoOOoO0.OooO0O0;
    public double mValue = AbstractC8352oOoOOoO0.OooO0O0;

    public ReactSlider(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        disableStateListAnimatorIfNeeded();
    }

    private void disableStateListAnimatorIfNeeded() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && i < 26) {
            super.setStateListAnimator(null);
        }
    }

    private double getStepValue() {
        double d = this.mStep;
        return d > AbstractC8352oOoOOoO0.OooO0O0 ? d : this.mStepCalculated;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.mMaxValue - this.mMinValue) / getStepValue());
    }

    private void updateAll() {
        if (this.mStep == AbstractC8352oOoOOoO0.OooO0O0) {
            double d = this.mMaxValue - this.mMinValue;
            double d2 = (double) DEFAULT_TOTAL_STEPS;
            Double.isNaN(d2);
            this.mStepCalculated = d / d2;
        }
        setMax(getTotalSteps());
        updateValue();
    }

    private void updateValue() {
        double d = this.mValue;
        double d2 = this.mMinValue;
        double totalSteps = (double) getTotalSteps();
        Double.isNaN(totalSteps);
        setProgress((int) Math.round(((d - d2) / (this.mMaxValue - d2)) * totalSteps));
    }

    public void setMaxValue(double d) {
        this.mMaxValue = d;
        updateAll();
    }

    public void setMinValue(double d) {
        this.mMinValue = d;
        updateAll();
    }

    public void setStep(double d) {
        this.mStep = d;
        updateAll();
    }

    public void setValue(double d) {
        this.mValue = d;
        updateValue();
    }

    public double toRealProgress(int i) {
        if (i == getMax()) {
            return this.mMaxValue;
        }
        double d = (double) i;
        double stepValue = getStepValue();
        Double.isNaN(d);
        return (d * stepValue) + this.mMinValue;
    }
}
