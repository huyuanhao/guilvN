package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;

public class DiffClampAnimatedNode extends ValueAnimatedNode {
    public final int mInputNodeTag;
    public double mLastValue = AbstractC8352oOoOOoO0.OooO0O0;
    public final double mMax;
    public final double mMin;
    public final NativeAnimatedNodesManager mNativeAnimatedNodesManager;

    public DiffClampAnimatedNode(ReadableMap readableMap, NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        this.mNativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.mInputNodeTag = readableMap.getInt("input");
        this.mMin = readableMap.getDouble("min");
        this.mMax = readableMap.getDouble("max");
        this.mValue = AbstractC8352oOoOOoO0.OooO0O0;
    }

    private double getInputNodeValue() {
        AnimatedNode nodeById = this.mNativeAnimatedNodesManager.getNodeById(this.mInputNodeTag);
        if (nodeById != null && (nodeById instanceof ValueAnimatedNode)) {
            return ((ValueAnimatedNode) nodeById).getValue();
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public void update() {
        double inputNodeValue = getInputNodeValue();
        double d = inputNodeValue - this.mLastValue;
        this.mLastValue = inputNodeValue;
        this.mValue = Math.min(Math.max(this.mValue + d, this.mMin), this.mMax);
    }
}
