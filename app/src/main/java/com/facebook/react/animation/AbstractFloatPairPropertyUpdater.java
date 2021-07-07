package com.facebook.react.animation;

import android.view.View;

public abstract class AbstractFloatPairPropertyUpdater implements AnimationPropertyUpdater {
    public boolean mFromSource;
    public final float[] mFromValues;
    public final float[] mToValues;
    public final float[] mUpdateValues;

    public AbstractFloatPairPropertyUpdater(float f, float f2) {
        this.mFromValues = new float[2];
        float[] fArr = new float[2];
        this.mToValues = fArr;
        this.mUpdateValues = new float[2];
        fArr[0] = f;
        fArr[1] = f2;
        this.mFromSource = true;
    }

    public abstract void getProperty(View view, float[] fArr);

    @Override // com.facebook.react.animation.AnimationPropertyUpdater
    public void onFinish(View view) {
        setProperty(view, this.mToValues);
    }

    @Override // com.facebook.react.animation.AnimationPropertyUpdater
    public void onUpdate(View view, float f) {
        float[] fArr = this.mUpdateValues;
        float[] fArr2 = this.mFromValues;
        float f2 = fArr2[0];
        float[] fArr3 = this.mToValues;
        fArr[0] = f2 + ((fArr3[0] - fArr2[0]) * f);
        fArr[1] = fArr2[1] + ((fArr3[1] - fArr2[1]) * f);
        setProperty(view, fArr);
    }

    @Override // com.facebook.react.animation.AnimationPropertyUpdater
    public void prepare(View view) {
        if (this.mFromSource) {
            getProperty(view, this.mFromValues);
        }
    }

    public abstract void setProperty(View view, float[] fArr);

    public AbstractFloatPairPropertyUpdater(float f, float f2, float f3, float f4) {
        this(f3, f4);
        float[] fArr = this.mFromValues;
        fArr[0] = f;
        fArr[1] = f2;
        this.mFromSource = false;
    }
}
