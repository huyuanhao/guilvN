package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import javax.annotation.Nullable;

public class ValueAnimatedNode extends AnimatedNode {
    public double mOffset = AbstractC8352oOoOOoO0.OooO0O0;
    public double mValue = Double.NaN;
    @Nullable
    public AnimatedNodeValueListener mValueListener;

    public ValueAnimatedNode() {
    }

    public void extractOffset() {
        this.mOffset += this.mValue;
        this.mValue = AbstractC8352oOoOOoO0.OooO0O0;
    }

    public void flattenOffset() {
        this.mValue += this.mOffset;
        this.mOffset = AbstractC8352oOoOOoO0.OooO0O0;
    }

    public double getValue() {
        return this.mOffset + this.mValue;
    }

    public void onValueUpdate() {
        AnimatedNodeValueListener animatedNodeValueListener = this.mValueListener;
        if (animatedNodeValueListener != null) {
            animatedNodeValueListener.onValueUpdate(getValue());
        }
    }

    public void setValueListener(@Nullable AnimatedNodeValueListener animatedNodeValueListener) {
        this.mValueListener = animatedNodeValueListener;
    }

    public ValueAnimatedNode(ReadableMap readableMap) {
        this.mValue = readableMap.getDouble("value");
        this.mOffset = readableMap.getDouble("offset");
    }
}
