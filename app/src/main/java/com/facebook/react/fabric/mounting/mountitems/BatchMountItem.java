package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.systrace.Systrace;

@DoNotStrip
public class BatchMountItem implements MountItem {
    public final MountItem[] mMountItems;
    public final int mSize;

    public BatchMountItem(MountItem[] mountItemArr, int i) {
        if (mountItemArr == null) {
            throw null;
        } else if (i < 0 || i > mountItemArr.length) {
            throw new IllegalArgumentException("Invalid size received by parameter size: " + i + " items.size = " + mountItemArr.length);
        } else {
            this.mMountItems = mountItemArr;
            this.mSize = i;
        }
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        Systrace.beginSection(0, "FabricUIManager::mountViews (" + this.mSize + " items)");
        for (int i = 0; i < this.mSize; i++) {
            this.mMountItems[i].execute(mountingManager);
        }
        Systrace.endSection(0);
    }
}
