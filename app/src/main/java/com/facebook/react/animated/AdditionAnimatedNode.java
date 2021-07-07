package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;

public class AdditionAnimatedNode extends ValueAnimatedNode {
    public final int[] mInputNodes;
    public final NativeAnimatedNodesManager mNativeAnimatedNodesManager;

    public AdditionAnimatedNode(ReadableMap readableMap, NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        this.mNativeAnimatedNodesManager = nativeAnimatedNodesManager;
        ReadableArray array = readableMap.getArray("input");
        this.mInputNodes = new int[array.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.mInputNodes;
            if (i < iArr.length) {
                iArr[i] = array.getInt(i);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public void update() {
        this.mValue = AbstractC8352oOoOOoO0.OooO0O0;
        int i = 0;
        while (true) {
            int[] iArr = this.mInputNodes;
            if (i < iArr.length) {
                AnimatedNode nodeById = this.mNativeAnimatedNodesManager.getNodeById(iArr[i]);
                if (nodeById != null && (nodeById instanceof ValueAnimatedNode)) {
                    this.mValue += ((ValueAnimatedNode) nodeById).getValue();
                    i++;
                }
            } else {
                return;
            }
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.Add node");
    }
}
