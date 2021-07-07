package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.UIImplementation;
import java.util.HashMap;
import java.util.Map;

public class PropsAnimatedNode extends AnimatedNode {
    public int mConnectedViewTag = -1;
    public final ReactStylesDiffMap mDiffMap;
    public final NativeAnimatedNodesManager mNativeAnimatedNodesManager;
    public final JavaOnlyMap mPropMap;
    public final Map<String, Integer> mPropNodeMapping;
    public final UIImplementation mUIImplementation;

    public PropsAnimatedNode(ReadableMap readableMap, NativeAnimatedNodesManager nativeAnimatedNodesManager, UIImplementation uIImplementation) {
        ReadableMap map = readableMap.getMap("props");
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        this.mPropNodeMapping = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.mPropNodeMapping.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        this.mPropMap = javaOnlyMap;
        this.mDiffMap = new ReactStylesDiffMap(javaOnlyMap);
        this.mNativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.mUIImplementation = uIImplementation;
    }

    public void connectToView(int i) {
        if (this.mConnectedViewTag == -1) {
            this.mConnectedViewTag = i;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node " + this.mTag + " is already attached to a view");
    }

    public void disconnectFromView(int i) {
        if (this.mConnectedViewTag == i) {
            this.mConnectedViewTag = -1;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Attempting to disconnect view that has not been connected with the given animated node");
    }

    public void restoreDefaultValues() {
        ReadableMapKeySetIterator keySetIterator = this.mPropMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            this.mPropMap.putNull(keySetIterator.nextKey());
        }
        this.mUIImplementation.synchronouslyUpdateViewOnUIThread(this.mConnectedViewTag, this.mDiffMap);
    }

    public final void updateView() {
        if (this.mConnectedViewTag != -1) {
            for (Map.Entry<String, Integer> entry : this.mPropNodeMapping.entrySet()) {
                AnimatedNode nodeById = this.mNativeAnimatedNodesManager.getNodeById(entry.getValue().intValue());
                if (nodeById == null) {
                    throw new IllegalArgumentException("Mapped property node does not exists");
                } else if (nodeById instanceof StyleAnimatedNode) {
                    ((StyleAnimatedNode) nodeById).collectViewUpdates(this.mPropMap);
                } else if (nodeById instanceof ValueAnimatedNode) {
                    this.mPropMap.putDouble(entry.getKey(), ((ValueAnimatedNode) nodeById).getValue());
                } else {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + nodeById.getClass());
                }
            }
            this.mUIImplementation.synchronouslyUpdateViewOnUIThread(this.mConnectedViewTag, this.mDiffMap);
        }
    }
}
