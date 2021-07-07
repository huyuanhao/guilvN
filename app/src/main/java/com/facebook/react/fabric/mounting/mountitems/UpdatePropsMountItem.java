package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.mounting.MountingManager;

public class UpdatePropsMountItem implements MountItem {
    public final int mReactTag;
    public final ReadableMap mUpdatedProps;

    public UpdatePropsMountItem(int i, ReadableMap readableMap) {
        this.mReactTag = i;
        this.mUpdatedProps = readableMap;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        mountingManager.updateProps(this.mReactTag, this.mUpdatedProps);
    }

    public String toString() {
        return "UpdatePropsMountItem [" + this.mReactTag + "] - props: " + this.mUpdatedProps;
    }
}
