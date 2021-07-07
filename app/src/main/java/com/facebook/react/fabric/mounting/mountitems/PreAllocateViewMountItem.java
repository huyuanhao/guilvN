package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class PreAllocateViewMountItem implements MountItem {
    public final String mComponent;
    public final ThemedReactContext mContext;
    public final int mRootTag;

    public PreAllocateViewMountItem(ThemedReactContext themedReactContext, int i, String str) {
        this.mContext = themedReactContext;
        this.mComponent = str;
        this.mRootTag = i;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        mountingManager.preallocateView(this.mContext, this.mComponent);
    }

    public String toString() {
        return "[" + this.mRootTag + "] - Preallocate " + this.mComponent;
    }
}
