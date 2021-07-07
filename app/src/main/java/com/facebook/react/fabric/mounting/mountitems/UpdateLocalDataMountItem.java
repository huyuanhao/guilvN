package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.fabric.mounting.MountingManager;

public class UpdateLocalDataMountItem implements MountItem {
    public final ReadableMap mNewLocalData;
    public final int mReactTag;

    public UpdateLocalDataMountItem(int i, ReadableNativeMap readableNativeMap) {
        this.mReactTag = i;
        this.mNewLocalData = readableNativeMap;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        mountingManager.updateLocalData(this.mReactTag, this.mNewLocalData);
    }

    public ReadableMap getNewLocalData() {
        return this.mNewLocalData;
    }

    public String toString() {
        return "UpdateLocalDataMountItem [" + this.mReactTag + "] - localData: " + this.mNewLocalData;
    }
}
