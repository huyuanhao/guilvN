package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class CreateMountItem implements MountItem {
    public final String mComponentName;
    public final boolean mIsVirtual;
    public final int mReactTag;
    public final ThemedReactContext mThemedReactContext;

    public CreateMountItem(ThemedReactContext themedReactContext, String str, int i, boolean z) {
        this.mReactTag = i;
        this.mThemedReactContext = themedReactContext;
        this.mComponentName = str;
        this.mIsVirtual = z;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        mountingManager.createView(this.mThemedReactContext, this.mComponentName, this.mReactTag, this.mIsVirtual);
    }

    public String getComponentName() {
        return this.mComponentName;
    }

    public ThemedReactContext getThemedReactContext() {
        return this.mThemedReactContext;
    }

    public String toString() {
        return "CreateMountItem [" + this.mReactTag + "] " + this.mComponentName;
    }
}
