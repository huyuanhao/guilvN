package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.mounting.MountingManager;

public class DeleteMountItem implements MountItem {
    public int mReactTag;

    public DeleteMountItem(int i) {
        this.mReactTag = i;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        mountingManager.deleteView(this.mReactTag);
    }

    public String toString() {
        return "DeleteMountItem [" + this.mReactTag + "]";
    }
}
