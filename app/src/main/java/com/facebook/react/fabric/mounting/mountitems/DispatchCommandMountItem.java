package com.facebook.react.fabric.mounting.mountitems;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.mounting.MountingManager;

public class DispatchCommandMountItem implements MountItem {
    @Nullable
    public final ReadableArray mCommandArgs;
    public final int mCommandId;
    public final int mReactTag;

    public DispatchCommandMountItem(int i, int i2, @Nullable ReadableArray readableArray) {
        this.mReactTag = i;
        this.mCommandId = i2;
        this.mCommandArgs = readableArray;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        UiThreadUtil.assertOnUiThread();
        mountingManager.receiveCommand(this.mReactTag, this.mCommandId, this.mCommandArgs);
    }

    public String toString() {
        return "DispatchCommandMountItem [" + this.mReactTag + "] " + this.mCommandId;
    }
}
