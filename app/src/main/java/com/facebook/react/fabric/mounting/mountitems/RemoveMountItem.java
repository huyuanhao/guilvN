package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.mounting.MountingManager;

public class RemoveMountItem implements MountItem {
    public int mIndex;
    public int mParentReactTag;
    public int mReactTag;

    public RemoveMountItem(int i, int i2, int i3) {
        this.mReactTag = i;
        this.mParentReactTag = i2;
        this.mIndex = i3;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        mountingManager.removeViewAt(this.mParentReactTag, this.mIndex);
    }

    public int getIndex() {
        return this.mIndex;
    }

    public int getParentReactTag() {
        return this.mParentReactTag;
    }

    public String toString() {
        return "RemoveMountItem [" + this.mReactTag + "] - parentTag: " + this.mParentReactTag + " - index: " + this.mIndex;
    }
}