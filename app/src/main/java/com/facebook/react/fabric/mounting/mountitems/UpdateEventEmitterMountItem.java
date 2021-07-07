package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.jsi.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.MountingManager;

public class UpdateEventEmitterMountItem implements MountItem {
    public final EventEmitterWrapper mEventHandler;
    public final int mReactTag;

    public UpdateEventEmitterMountItem(int i, EventEmitterWrapper eventEmitterWrapper) {
        this.mReactTag = i;
        this.mEventHandler = eventEmitterWrapper;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        mountingManager.updateEventEmitter(this.mReactTag, this.mEventHandler);
    }

    public String toString() {
        return "UpdateEventEmitterMountItem [" + this.mReactTag + "]";
    }
}
